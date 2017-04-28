using NMF.Synchronizations;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TTC2017.SmartGrids
{
    public class OutagePrevention : ReflectiveSynchronization
    {
        public class PowerSystemResource2PowerSystemResource : SynchronizationRule<CIM.IEC61970.Core.IPowerSystemResource, OutagePreventionJointarget.IPowerSystemResource>
        {
            public override void DeclareSynchronization()
            {

            }
        }

        public class ConductingEquipment2ConductingEquipment : SynchronizationRule<CIM.IEC61970.Core.IConductingEquipment, OutagePreventionJointarget.IConductingEquipment>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly(SyncRule<Termianl2Termianl>(),
                    conductingEquipment => conductingEquipment.Terminals,
                     equipment => equipment.Terminals
                    );
                MarkInstantiatingFor(SyncRule<PowerSystemResource2PowerSystemResource>());
            }

        }

        public class Termianl2Termianl : SynchronizationRule<CIM.IEC61970.Core.ITerminal, OutagePreventionJointarget.ITerminal>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly(SyncRule<TieFlow2TieFlow>(),
                   terminal => terminal.TieFlow,
                   t => t.TieFlow
                    );
            }

        }

        public class TieFlow2TieFlow : SynchronizationRule<CIM.IEC61970.ControlArea.ITieFlow, OutagePreventionJointarget.ITieFlow>
        {
            protected override OutagePreventionJointarget.ITieFlow CreateRightOutput(CIM.IEC61970.ControlArea.ITieFlow input, IEnumerable<OutagePreventionJointarget.ITieFlow> candidates, ISynchronizationContext context, out bool existing)
            {
                if (input.ControlArea == null)
                {
                    input.ControlArea = new CIM.IEC61970.ControlArea.ControlArea();
                }
                var tie = base.CreateRightOutput(input, candidates, context, out existing);
                tie.ControlArea = new OutagePreventionJointarget.ControlArea();
                return tie;
            }

            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(
                    tieflow => tieflow.ControlArea.MRID,
                    tieflowTarget => tieflowTarget.ControlArea.MRID);
            }
        }

        public class ThetaJoin1 : SynchronizationRule<Tuple<CIM.IEC61968.Metering.IMeterAsset, SubstationStandard.LNNodes.LNGroupM.IMMXU>, OutagePreventionJointarget.IPMUVoltageMeter>
        {
            protected override OutagePreventionJointarget.IPMUVoltageMeter CreateRightOutput(Tuple<CIM.IEC61968.Metering.IMeterAsset, SubstationStandard.LNNodes.LNGroupM.IMMXU> input, IEnumerable<OutagePreventionJointarget.IPMUVoltageMeter> candidates, ISynchronizationContext context, out bool existing)
            {
                var asset = input.Item1;
                if (asset.ServiceDeliveryPoint == null)
                {
                    asset.ServiceDeliveryPoint = new CIM.IEC61968.Metering.ServiceDeliveryPoint();
                }
                if (asset.Location == null)
                {
                    asset.Location = new CIM.IEC61968.Common.Location();
                }
                if (asset.Location.Position == null)
                {
                    asset.Location.Position = new CIM.IEC61968.Common.PositionPoint();
                }
                var pmu = base.CreateRightOutput(input, candidates, context, out existing);
                if (pmu.ServiceDeliveryPoint == null)
                {
                    pmu.ServiceDeliveryPoint = new OutagePreventionJointarget.ServiceDeliveryPoint();
                }
                if (pmu.Location == null)
                {
                    pmu.Location = new OutagePreventionJointarget.Location();
                }
                if (pmu.Location.Position == null)
                {
                    pmu.Location.Position = new OutagePreventionJointarget.PositionPoint();
                }

                return pmu;
            }

            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.PhsA.CVal.Mag.F,
                    pmu => pmu.VoltageAMag
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.PhsA.CVal.Ang.F,
                    pmu => pmu.VoltageAAng
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.PhsB.CVal.Mag.F,
                    pmu => pmu.VoltageBMag
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.PhsB.CVal.Ang.F,
                    pmu => pmu.VoltageBAng
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.PhsC.CVal.Mag.F,
                    pmu => pmu.VoltageCMag
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.PhsC.CVal.Ang.F,
                    pmu => pmu.VoltageCAng
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.Neut.CVal.Mag.F,
                    pmu => pmu.VoltageNeutMag
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.Neut.CVal.Ang.F,
                    pmu => pmu.VoltageNeutAng
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.Net.CVal.Mag.F,
                    pmu => pmu.VoltageNetMag
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.Net.CVal.Ang.F,
                    pmu => pmu.VoltageNetAng
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.Res.CVal.Mag.F,
                    pmu => pmu.VoltageResMag
                    );
                SynchronizeLeftToRightOnly(
                    mmxu => mmxu.Item2.PhV.Res.CVal.Ang.F,
                    pmu => pmu.VoltageResAng
                    );

                SynchronizeLeftToRightOnly(
                    asset => asset.Item1.Location.Position.XPosition,
                    pmu => pmu.Location.Position.XPosition
                    );
                SynchronizeLeftToRightOnly(
                    asset => asset.Item1.Location.Position.YPosition,
                    pmu => pmu.Location.Position.YPosition
                    );
                SynchronizeLeftToRightOnly(
                    asset => asset.Item1.Location.Position.ZPosition,
                    pmu => pmu.Location.Position.ZPosition
                    );
                SynchronizeManyLeftToRightOnly(SyncRule<PowerSystemResource2PowerSystemResource>(),
                   asset => asset.Item1.Location.PowerSystemResources,
                   pmu => pmu.Location.PowerSystemResources
                   );

            }
        }

        public class ThetaJoin2 : SynchronizationRule<Tuple<CIM.IEC61968.Metering.IEndDeviceAsset, COSEM.IPhysicalDevice>, OutagePreventionJointarget.IPrivateMeterVoltage>
        {

            protected override OutagePreventionJointarget.IPrivateMeterVoltage CreateRightOutput(Tuple<CIM.IEC61968.Metering.IEndDeviceAsset, COSEM.IPhysicalDevice> input, IEnumerable<OutagePreventionJointarget.IPrivateMeterVoltage> candidates, ISynchronizationContext context, out bool existing)
            {
                var asset = input.Item1;
                if (asset.ServiceDeliveryPoint == null)
                {
                    asset.ServiceDeliveryPoint = new CIM.IEC61968.Metering.ServiceDeliveryPoint();

                }
                if (asset.ServiceDeliveryPoint.EnergyConsumer == null)
                {
                    asset.ServiceDeliveryPoint.EnergyConsumer = new CIM.IEC61970.Wires.EnergyConsumer();
                }
                var device = base.CreateRightOutput(input, candidates, context, out existing);
                if (device.ServiceDeliveryPoint == null)
                {
                    device.ServiceDeliveryPoint = new OutagePreventionJointarget.ServiceDeliveryPoint();
                }
                if (device.ServiceDeliveryPoint.EnergyConsumer == null)
                {
                    device.ServiceDeliveryPoint.EnergyConsumer = new OutagePreventionJointarget.EnergyConsumer();
                }
                return device;
            }

            public override void DeclareSynchronization()
            {

                SynchronizeLeftToRightOnly(
                   asset => asset.Item1.MRID,
                   pmv => pmv.ID
                   );
                SynchronizeLeftToRightOnly(
                   asset => asset.Item1.ServiceDeliveryPoint.EnergyConsumer.MRID,
                   asset => asset.ServiceDeliveryPoint.EnergyConsumer.MRID
                   );
                SynchronizeLeftToRightOnly(
                   pd => pd.Item2.ID,
                   pmv => pmv.ID
                   );
                SynchronizeLeftToRightOnly(
                    pd => pd.Item2.ElectricityValues.VoltageL1,
                    pmv => pmv.VoltageA
                    );
                SynchronizeLeftToRightOnly(
                    pd => pd.Item2.ElectricityValues.VoltageL2,
                    pmv => pmv.VoltageB
                    );
                SynchronizeLeftToRightOnly(
                    pd => pd.Item2.ElectricityValues.VoltageL3,
                    pmv => pmv.VoltageC
                    );



            }
        }
    }
}
