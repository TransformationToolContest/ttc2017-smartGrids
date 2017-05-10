using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Synchronizations;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TTC2017.SmartGrids.OutagePreventionJointarget;

namespace TTC2017.SmartGrids
{
    public class OutagePrevention : ReflectiveSynchronization
    {
        public class MainRule : SynchronizationRule<Tuple<CIM.CIMRoot, COSEM.COSEMRoot, SubstationStandard.Substandard>, Model>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly(SyncRule<MMXUAssetToVoltageMeter>(),
                    dr => dr.Item1.IDobject.OfType<CIM.IEC61968.Metering.IMeterAsset>()
                             .Join(dr.Item3.LN.OfType<SubstationStandard.LNNodes.LNGroupM.IMMXU>(), asset => asset.MRID, mmxu => mmxu.NamePlt.IdNs,
                                   (asset, mmxu) => new Tuple<CIM.IEC61968.Metering.IMeterAsset, SubstationStandard.LNNodes.LNGroupM.IMMXU>(asset, mmxu)),
                    model => model.RootElements.OfType<IModelElement, IPMUVoltageMeter>());

                SynchronizeManyLeftToRightOnly(SyncRule<DeviceAssetToPrivateMeterVoltage>(),
                    dr => dr.Item1.IDobject.OfType<CIM.IEC61968.Metering.IEndDeviceAsset>()
                                .Join(dr.Item2.PhysicalDevice, asset => asset.MRID, pd => pd.ID,
                                (asset, pd) => new Tuple<CIM.IEC61968.Metering.IEndDeviceAsset, COSEM.IPhysicalDevice>(asset, pd)),
                                model => model.RootElements.OfType<IModelElement, IPrivateMeterVoltage>()
                    );
            }
        }

        public class MMXUAssetToVoltageMeter : SynchronizationRule<Tuple<CIM.IEC61968.Metering.IMeterAsset, SubstationStandard.LNNodes.LNGroupM.IMMXU>, IPMUVoltageMeter>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.PhsA.CVal.Mag.F, pmu => pmu.VoltageAMag);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.PhsA.CVal.Ang.F, pmu => pmu.VoltageAAng);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.PhsB.CVal.Mag.F, pmu => pmu.VoltageBMag);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.PhsB.CVal.Ang.F, pmu => pmu.VoltageBAng);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.PhsC.CVal.Mag.F, pmu => pmu.VoltageCMag);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.PhsC.CVal.Ang.F, pmu => pmu.VoltageCAng);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.Neut.CVal.Mag.F, pmu => pmu.VoltageNeutMag);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.Neut.CVal.Ang.F, pmu => pmu.VoltageNeutAng);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.Net.CVal.Mag.F, pmu => pmu.VoltageNetMag);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.Net.CVal.Ang.F, pmu => pmu.VoltageNetAng);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.Res.CVal.Mag.F, pmu => pmu.VoltageResMag);
                SynchronizeLeftToRightOnly(mmxu => mmxu.Item2.PhV.Res.CVal.Ang.F, pmu => pmu.VoltageResAng);
                SynchronizeLeftToRightOnly(SyncRule<LocationToLocation>(), mmxu => mmxu.Item1.Location, pmu => pmu.Location);
            }
        }

        public class DeviceAssetToPrivateMeterVoltage : SynchronizationRule<Tuple<CIM.IEC61968.Metering.IEndDeviceAsset, COSEM.IPhysicalDevice>, IPrivateMeterVoltage>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(pd => pd.Item2.ID, pmv => pmv.ID);
                SynchronizeLeftToRightOnly(pd => pd.Item2.ElectricityValues.VoltageL1, pmv => pmv.VoltageA);
                SynchronizeLeftToRightOnly(pd => pd.Item2.ElectricityValues.VoltageL2, pmv => pmv.VoltageB);
                SynchronizeLeftToRightOnly(pd => pd.Item2.ElectricityValues.VoltageL3, pmv => pmv.VoltageC);
                SynchronizeLeftToRightOnly(SyncRule<ServiceDeliveryPoint2ServiceDeliveryPoint>(),
                    pd => pd.Item1.ServiceDeliveryPoint, pmv => pmv.ServiceDeliveryPoint);
            }
        }

        public class LocationToLocation : SynchronizationRule<CIM.IEC61968.Common.ILocation, ILocation>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<PositionPointToPositionPoint>(), l => l.Position, l => l.Position);
                SynchronizeManyLeftToRightOnly(SyncRule<PowerSystemResource2PowerSystemResource>(),
                    l => l.PowerSystemResources, l => l.PowerSystemResources);
            }
        }

        public class PositionPointToPositionPoint : SynchronizationRule<CIM.IEC61968.Common.IPositionPoint, IPositionPoint>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(p => p.XPosition, p => p.XPosition);
                SynchronizeLeftToRightOnly(p => p.YPosition, p => p.YPosition);
                SynchronizeLeftToRightOnly(p => p.ZPosition, p => p.ZPosition);
            }
        }

        public class PowerSystemResource2PowerSystemResource : SynchronizationRule<CIM.IEC61970.Core.IPowerSystemResource, IPowerSystemResource>
        {
            public override void DeclareSynchronization()
            {

            }
        }

        public class ConductingEquipment2ConductingEquipment : SynchronizationRule<CIM.IEC61970.Core.IConductingEquipment, IConductingEquipment>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly(SyncRule<Terminal2Terminal>(),
                    conductingEquipment => conductingEquipment.Terminals, equipment => equipment.Terminals);
                MarkInstantiatingFor(SyncRule<PowerSystemResource2PowerSystemResource>());
            }

        }

        public class Terminal2Terminal : SynchronizationRule<CIM.IEC61970.Core.ITerminal, ITerminal>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly(SyncRule<TieFlow2TieFlow>(),
                   terminal => terminal.TieFlow, t => t.TieFlow);
            }

        }

        public class TieFlow2TieFlow : SynchronizationRule<CIM.IEC61970.ControlArea.ITieFlow, ITieFlow>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<ControlAreaToControlArea>(), tie => tie.ControlArea, tie => tie.ControlArea);
            }
        }

        public class ControlAreaToControlArea : SynchronizationRule<CIM.IEC61970.ControlArea.IControlArea, IControlArea>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(area => area.MRID, area => area.MRID);
            }
        }

        public class ServiceDeliveryPoint2ServiceDeliveryPoint : SynchronizationRule<CIM.IEC61968.Metering.IServiceDeliveryPoint, IServiceDeliveryPoint>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<EnergyConsumerToEnergyConsumer>(), sdp => sdp.EnergyConsumer, sdp => sdp.EnergyConsumer);
            }
        }

        public class EnergyConsumerToEnergyConsumer : SynchronizationRule<CIM.IEC61970.Wires.IEnergyConsumer, IEnergyConsumer>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(ec => ec.MRID, ec => ec.MRID);
            }
        }

        public class ConformLoadToConformLoad : SynchronizationRule<CIM.IEC61970.LoadModel.IConformLoad, IConformLoad>
        {
            public override void DeclareSynchronization()
            {
                MarkInstantiatingFor(SyncRule<EnergyConsumerToEnergyConsumer>());

                SynchronizeLeftToRightOnly(SyncRule<ConformLoadGroupToConformLoadGroup>(), load => load.LoadGroup, load => load.LoadGroup);
            }
        }

        public class ConformLoadGroupToConformLoadGroup : SynchronizationRule<CIM.IEC61970.LoadModel.IConformLoadGroup, IConformLoadGroup>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<SubLoadAreaToSubLoadArea>(), clg => clg.SubLoadArea, clg => clg.SubLoadArea);
            }
        }

        public class SubLoadAreaToSubLoadArea : SynchronizationRule<CIM.IEC61970.LoadModel.ISubLoadArea, ISubLoadArea>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<LoadAreaToLoadArea>(), sla => sla.LoadArea, sla => sla.LoadArea);
            }
        }

        public class LoadAreaToLoadArea : SynchronizationRule<CIM.IEC61970.LoadModel.ILoadArea, ILoadArea>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<ControlAreaToControlArea>(), la => la.ControlArea, la => la.ControlArea);
            }
        }

        public class NonConformLoadToNonConformLoad : SynchronizationRule<CIM.IEC61970.LoadModel.INonConformLoad, INonConformLoad>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<NonConformLoadGroupToNonConformLoadGroup>(), ncl => ncl.LoadGroup, ncl => ncl.LoadGroup);
            }
        }

        public class NonConformLoadGroupToNonConformLoadGroup : SynchronizationRule<CIM.IEC61970.LoadModel.INonConformLoadGroup, INonConformLoadGroup>
        {
            public override void DeclareSynchronization()
            {
                // Intentionally left blank because there is no synchronization defined
            }
        }
    }
}
