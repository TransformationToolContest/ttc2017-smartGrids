using CommandLine;
using NMF.Models;
using NMF.Models.Changes;
using NMF.Models.Repository;
using NMF.Models.Repository.Serialization;
using NMF.Serialization.Xmi;
using NMF.Synchronizations;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TTC2017.SmartGrids.NMFSolution
{
    class Program
    {
        private const string OutageDetection = nameof(OutageDetection);
        private const string OutagePrevention = nameof(OutagePrevention);

        private CIM.CIMRoot cim;
        private COSEM.COSEMRoot cosem;
        private SubstationStandard.Substandard substation;
        private ModelRepository repository;

        private Func<int> elementCount;
        private string transformationName;
        private string changeSet;
        private string runIndex;

        static void Main(string[] args)
        {
            var program = new Program();
            program.transformationName = args[0];
            program.Run();
        }

        private void Run()
        { 
            changeSet = Environment.GetEnvironmentVariable("ChangeSet");
            var changePath = Environment.GetEnvironmentVariable("ChangePath");
            runIndex = Environment.GetEnvironmentVariable("RunIndex");
            var sequences = int.Parse(Environment.GetEnvironmentVariable("Sequences"));

            var stopwatch = new Stopwatch();
            stopwatch.Start();
            repository = new ModelRepository();
            stopwatch.Stop();

            Emit(stopwatch, "Loading");

            RunInitial(changePath + "\\CIM_DCIM-out000.xmi",
                       changePath + "\\COSEM-out000.xmi",
                       changePath + "\\Substandard-out000.xmi");

            for (int i = 1; i <= sequences; i++)
            {
                RunUpdates(changePath + $"\\CIM_DCIM-delta{i.ToString("000")}.xmi",
                           changePath + $"\\COSEM-delta{i.ToString("000")}.xmi",
                           changePath + $"\\Substandard-delta{i.ToString("000")}.xmi", i);
            }
        }

        private void RunInitial(string cimPath, string cosemPath, string subStandardPath)
        {
            var needSubstandard = transformationName == OutagePrevention;
            var stopwatch = new Stopwatch();

            stopwatch.Start();
            cim = repository.Resolve(cimPath).RootElements[0] as CIM.CIMRoot;
            cosem = repository.Resolve(cosemPath).RootElements[0] as COSEM.COSEMRoot;
            substation = needSubstandard ? repository.Resolve(subStandardPath).RootElements[0] as SubstationStandard.Substandard : null;
            stopwatch.Stop();

            Emit(stopwatch, "Loading");

            if (needSubstandard)
            {
                var triple = new Tuple<CIM.CIMRoot, COSEM.COSEMRoot, SubstationStandard.Substandard>(cim, cosem, substation);
                Model result = null;

                var outagePrevention = new OutagePrevention();
                outagePrevention.Initialize();

                stopwatch.Restart();
                outagePrevention.Synchronize(outagePrevention.SynchronizationRule<OutagePrevention.MainRule>(),
                    ref triple, ref result, SynchronizationDirection.LeftToRight, NMF.Transformations.ChangePropagationMode.OneWay);
                stopwatch.Stop();
                elementCount = () => result.RootElements.Count;
            }
            else
            {
                var tuple = new Tuple<CIM.CIMRoot, COSEM.COSEMRoot>(cim, cosem);
                Model result = null;

                var outageDetection = new OutageDetection();
                outageDetection.Initialize();

                stopwatch.Restart();
                outageDetection.Synchronize(outageDetection.SynchronizationRule<OutageDetection.MainRule>(),
                    ref tuple, ref result, SynchronizationDirection.LeftToRight, NMF.Transformations.ChangePropagationMode.OneWay);
                stopwatch.Stop();
                elementCount = () => result.RootElements.Count;
            }

            Emit(stopwatch, "Initial");
        }

        private void RunUpdates(string cimUpdatePath, string cosemUpdatePath, string substandardUpdatePath, int iteration)
        {
            var needSubstandard = transformationName == OutagePrevention;

            var cimUpdates = repository.Resolve(cimUpdatePath).RootElements[0] as ModelChangeSet;
            var cosemUpdates = repository.Resolve(cosemUpdatePath).RootElements[0] as ModelChangeSet;
            var substabdardUpdates = needSubstandard ? repository.Resolve(substandardUpdatePath).RootElements[0] as ModelChangeSet : null;

            var stopwatch = new Stopwatch();
            stopwatch.Start();

            cimUpdates.Apply();
            cosemUpdates.Apply();
            substabdardUpdates?.Apply();

            stopwatch.Stop();
            Emit(stopwatch, "Update", iteration);
        }

        private void Emit(Stopwatch stopwatch, string phase, int? iteration = null)
        {
            Console.WriteLine($"NMF;{transformationName};{changeSet};{runIndex};{iteration};{phase};Time;{stopwatch.Elapsed.Ticks * 100}");
            if (elementCount != null)
            {
                Console.WriteLine($"NMF;{transformationName};{changeSet};{runIndex};{iteration};{phase};Elements;{elementCount()}");
            }
            Console.WriteLine($"NMF;{transformationName};{changeSet};{runIndex};{iteration};{phase};Memory;{Environment.WorkingSet}");
        }
    }
}
