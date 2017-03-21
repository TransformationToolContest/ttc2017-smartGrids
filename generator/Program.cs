using CommandLine;
using NMF.Models;
using NMF.Models.Changes;
using NMF.Models.Repository;
using NMF.Models.Repository.Serialization;
using NMF.Serialization.Xmi;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TTC2017.SmartGrids.Generator
{
    public class Options
    {
        [Option("cim", HelpText = "The path to the cim model", Required = true)]
        public string CimPath { get; set; }

        [Option("cosem", HelpText = "The path to the cosem model", Required = true)]
        public string CosemPath { get; set; }

        [Option("substation", HelpText = "The path to the substation model", Required = true)]
        public string SubstationPath { get; set; }

        [Option("cimOut", HelpText = "The path to which the changed cim model should be saved to", Required = true)]
        public string CimOutPath { get; set; }

        [Option("cosemOut", HelpText = "The path to which the changed cosem model should be saved to", Required = true)]
        public string CosemOutPath { get; set; }

        [Option("substationOut", HelpText = "The path to which the changed substation model should be saved to", Required = true)]
        public string SubstationOutPath { get; set; }

        [Option('n', "changes", HelpText = "The number of changes to generate", Required = true)]
        public int Changes { get; set; }

        [Option('d', "deltas", HelpText = "The number of deltas to generate", Required = true)]
        public int Deltas { get; set; }
    }

    class Program
    {
        private CIM.CIMRoot cim;
        private COSEM.COSEMRoot cosem;
        private SubstationStandard.Substandard substation;
        private Random rnd = new Random();

        static void Main(string[] args)
        {
            var parser = new Parser();
            var options = new Options();
            if (parser.ParseArguments(args, options))
            {
                var program = new Program();
                program.GenerateChanges(options);
                Console.WriteLine("Successfully generated changes");
            }
            else
            {
                Console.WriteLine("You are using me wrongly.");
                Console.WriteLine(CommandLine.Text.HelpText.AutoBuild(options));
            }
        }

        internal void GenerateChanges(Options options)
        {
            Console.WriteLine("Initializing repository");
            var repository = new ModelRepository();
            Console.WriteLine("Loading CIM model");
            cim = repository.Resolve(options.CimPath).RootElements[0] as CIM.CIMRoot;
            Console.WriteLine("Loading COSEM model");
            cosem = repository.Resolve(options.CosemPath).RootElements[0] as COSEM.COSEMRoot;
            Console.WriteLine("Loading Substandard model");
            substation = repository.Resolve(options.SubstationPath).RootElements[0] as SubstationStandard.Substandard;

            Console.WriteLine("Performing changes");

            var actions = new Action[]
            {
                ToggleRandomConnection,
                IncreaseRandomElectricityValues,
                CreateNewMeterAsset,
                DeleteMeterAsset,

                IncreaseMMXUVoltage,
                CreateMMXU,
                ChangeMMXULocation,
                ChangePosition
            };

            var probabilities = new int[]
            {
                10,
                30,
                10,
                10,

                20,
                10,
                5,
                5
            };

            var sum = probabilities.Sum();

            CreateDirectory(options.CimOutPath);
            CreateDirectory(options.CosemOutPath);
            CreateDirectory(options.SubstationOutPath);

            Console.WriteLine("Saving modified CIM model");
            repository.Save(cim, options.CimOutPath + string.Format("-out{0:000}.xmi", 0));
            Console.WriteLine("Saving modified COSEM model");
            repository.Save(cosem, options.CosemOutPath + string.Format("-out{0:000}.xmi", 0));
            Console.WriteLine("Saving modified Substandard model");
            repository.Save(substation, options.SubstationOutPath + string.Format("-out{0:000}.xmi", 0));

            for (int d = 1; d <= options.Deltas; d++)
            {
                var cimRecorder = new ModelChangeRecorder();
                var cosemRecorder = new ModelChangeRecorder();
                var substationRecorder = new ModelChangeRecorder();

                cimRecorder.Start(cim);
                cosemRecorder.Start(cosem);
                substationRecorder.Start(substation);

                Console.WriteLine($"Generating change {d}");
                for (int i = 0; i < options.Changes; i++)
                {
                    var dice = rnd.Next(sum);
                    for (int j = 0; j < actions.Length; j++)
                    {
                        if (dice < probabilities[j])
                        {
                            actions[j]();
                            break;
                        }
                        else
                        {
                            dice -= probabilities[j];
                        }
                    }
                }

                cimRecorder.Stop();
                cosemRecorder.Stop();
                substationRecorder.Stop();

                Console.WriteLine("Saving modified CIM model");
                repository.Save(cim, options.CimOutPath + string.Format("-out{0:000}.xmi", d));
                Console.WriteLine("Saving modified COSEM model");
                repository.Save(cosem, options.CosemOutPath + string.Format("-out{0:000}.xmi", d));
                Console.WriteLine("Saving modified Substandard model");
                repository.Save(substation, options.SubstationOutPath + string.Format("-out{0:000}.xmi", d));
                
                Console.WriteLine("Saving CIM changes");
                repository.Save(cimRecorder.GetModelChanges(), options.CimOutPath + string.Format("-delta{0:000}.xmi", d));
                Console.WriteLine("Saving COSEM changes");
                repository.Save(cosemRecorder.GetModelChanges(), options.CosemOutPath + string.Format("-delta{0:000}.xmi", d));
                Console.WriteLine("Saving Substandard changes");
                repository.Save(substationRecorder.GetModelChanges(), options.SubstationOutPath + string.Format("-delta{0:000}.xmi", d));
            }
        }

        private static void CreateDirectory(string path)
        {
            var directory = Path.GetDirectoryName(Path.GetFullPath(path));
            if (!Directory.Exists(directory))
            {
                Directory.CreateDirectory(directory);
            }
        }

        private T TakeRandomOrDefault<T>(IEnumerable<T> collection)
        {
            var count = collection.Count();
            if (count == 0)
            {
                return default(T);
            }
            else
            {
                return collection.ElementAt(rnd.Next(count));
            }
        }

        private static T AddToAndReturn<T>(ICollection<T> collection, T item)
        {
            collection.Add(item);
            return item;
        }

        private void ToggleRandomConnection()
        {
            var device = cosem.PhysicalDevice[rnd.Next(cosem.PhysicalDevice.Count)];
            if (device.AutoConnect == null) return;
            device.AutoConnect.Connection = !device.AutoConnect.Connection.GetValueOrDefault(false);
        }

        private void IncreaseRandomElectricityValues()
        {
            var device = cosem.PhysicalDevice[rnd.Next(cosem.PhysicalDevice.Count)];
            if (device.ElectricityValues == null) return;
            device.ElectricityValues.ApparentPowermL1 = (device.ElectricityValues.ApparentPowermL1.GetValueOrDefault(0.0) * 1.01 + 0.1);
            device.ElectricityValues.ApparentPowermL2 = (device.ElectricityValues.ApparentPowermL2.GetValueOrDefault(0.0) * 1.01 + 0.1);
            device.ElectricityValues.ApparentPowermL3 = (device.ElectricityValues.ApparentPowermL3.GetValueOrDefault(0.0) * 1.01 + 0.1);
            device.ElectricityValues.VoltageL1 = (device.ElectricityValues.VoltageL1.GetValueOrDefault(0.0) * 1.01 + 0.1);
            device.ElectricityValues.VoltageL2 = (device.ElectricityValues.VoltageL2.GetValueOrDefault(0.0) * 1.01 + 0.1);
            device.ElectricityValues.VoltageL3 = (device.ElectricityValues.VoltageL3.GetValueOrDefault(0.0) * 1.01 + 0.1);
        }

        private void CreateNewMeterAsset()
        {
            var uuid = Guid.NewGuid().ToString();
            var device = new COSEM.PhysicalDevice
            {
                ID = uuid,
                AutoConnect = new COSEM.COSEMObjects.AutoConnectObject
                {
                    Connection = true
                },
                ElectricityValues = new COSEM.COSEMObjects.ElectricityValues
                {
                    ActivePowermall = 230,
                    ActivePowermL1 = 230,
                    ActivePowerpall = 45,
                    ActivePowerpL1 = 45,
                    Angles = 90,
                    ApparentPowermAll = 300,
                    ApparentPowermL1 = 300,
                    ApparentPowerpAll = 68,
                    ApparentPowerpL1 = 68,
                    CurrentAll = 382,
                    CurrentL1 = 382,
                    ReactivePowermall = 32,
                    ReactivePowermL1 = 32,
                    ReactivePowerpall = 10,
                    ReactivePowerpL1 = 10,
                    ReactivePowerQIall = 22,
                    ReactivePowerQIIIL1 = 22,
                    SupplyFrequencyAll = 50,
                    SupplyFrequencyL1 = 50,
                    SupplyFrequencyL2 = 50,
                    SupplyFrequencyL3 = 50,
                    VoltageAll = 40,
                    VoltageL1 = 40
                }
            };
            var meterAsset = new CIM.IEC61968.Metering.MeterAsset
            {
                UUID = uuid,
                MRID = uuid,
                Name = uuid,
                Location = TakeRandomOrDefault(cim.IDobject.OfType<CIM.IEC61968.Common.ILocation>()),
                ServiceDeliveryPoint = TakeRandomOrDefault(cim.IDobject.OfType<CIM.IEC61968.Metering.IServiceDeliveryPoint>())
            };
            cosem.PhysicalDevice.Add(device);
            cim.IDobject.Add(meterAsset);
        }

        private void DeleteMeterAsset()
        {
            var device = cosem.PhysicalDevice[rnd.Next(cosem.PhysicalDevice.Count)];
            var meterAsset = cim.Model.Resolve(device.ID);
            device.Delete();
            if (meterAsset != null)
            {
                meterAsset.Delete();
            }
        }

        private void IncreaseMMXUVoltage()
        {
            var mmxu = TakeRandomOrDefault(substation.LN.OfType<SubstationStandard.LNNodes.LNGroupM.MMXU>());
            if (mmxu == null)
            {
                CreateMMXU();
                return;
            }
            mmxu.PhV.PhsA.CVal.Mag.F = (float)(mmxu.PhV.PhsA.CVal.Mag.F.GetValueOrDefault() * 1.01 + 0.1);
            mmxu.PhV.PhsA.CVal.Ang.F = (float)(mmxu.PhV.PhsA.CVal.Ang.F.GetValueOrDefault() * 1.01 + 0.1);
            mmxu.PhV.Neut.CVal.Mag.F = (float)(mmxu.PhV.Neut.CVal.Mag.F.GetValueOrDefault() * 1.01 + 0.1);
        }

        private void ChangeMMXULocation()
        {
            var mmxu = TakeRandomOrDefault(substation.LN.OfType<SubstationStandard.LNNodes.LNGroupM.MMXU>());
            if (mmxu == null)
            {
                CreateMMXU();
                return;
            }
            var asset = cim.Model.Resolve(mmxu.NamePlt.IdNs) as CIM.IEC61968.Assets.Asset;
            if (asset != null)
            {
                asset.Location = TakeRandomOrDefault(cim.IDobject.OfType<CIM.IEC61968.Common.Location>());
            }
        }

        private void ChangePosition()
        {
            var location = TakeRandomOrDefault(cim.IDobject.OfType<CIM.IEC61968.Common.Location>());
            location.Position = TakeRandomOrDefault(cim.IDobject.OfType<CIM.IEC61968.Common.PositionPoint>());
        }

        private void CreateMMXU()
        {
            var asset = TakeRandomOrDefault(cim.IDobject.OfType<CIM.IEC61968.Metering.MeterAsset>());
            var mmxu = new SubstationStandard.LNNodes.LNGroupM.MMXU
            {
                NamePlt = AddToAndReturn(substation.NamePlt, new SubstationStandard.Dataclasses.LPL
                {
                    IdNs = asset.MRID
                }),
                PhV = AddToAndReturn(substation.WYE, new SubstationStandard.Dataclasses.WYE
                {
                    PhsA = AddToAndReturn(substation.CMV, new SubstationStandard.Dataclasses.CMV
                    {
                        CVal = AddToAndReturn(substation.Vector, new SubstationStandard.Dataclasses.Vector
                        {
                            Mag = AddToAndReturn(substation.AnalogueValue, new SubstationStandard.Dataclasses.AnalogueValue
                            {
                                F = 42
                            }),
                            Ang = AddToAndReturn(substation.AnalogueValue, new SubstationStandard.Dataclasses.AnalogueValue
                            {
                                F = 23
                            })
                        })
                    }),
                    Neut = AddToAndReturn(substation.CMV, new SubstationStandard.Dataclasses.CMV
                    {
                        CVal = AddToAndReturn(substation.Vector, new SubstationStandard.Dataclasses.Vector
                        {
                            Mag = AddToAndReturn(substation.AnalogueValue, new SubstationStandard.Dataclasses.AnalogueValue
                            {
                                F = 8.15f
                            })
                        })
                    })
                })
            };
            substation.LN.Add(mmxu);
        }
    }
}
