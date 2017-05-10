using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Synchronizations;
using System;
using System.Linq;
using TTC2017.SmartGrids.OutageDetectionJointarget;

namespace TTC2017.SmartGrids
{
    public class OutageDetection : ReflectiveSynchronization
    {
        public class MainRule : SynchronizationRule<Tuple<CIM.CIMRoot, COSEM.COSEMRoot>, Model>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeManyLeftToRightOnly(SyncRule<AssetToConsumer>(),
                    sg => from pd in sg.Item2.PhysicalDevice
                          join ma in sg.Item1.IDobject.OfType<CIM.IEC61968.Metering.IMeterAsset>() on pd.ID equals ma.MRID
                          select new Tuple<CIM.IEC61968.Metering.IMeterAsset, COSEM.IPhysicalDevice>(ma, pd),
                    target => target.RootElements.OfType<IModelElement, OutageDetectionJointarget.IEnergyConsumer>());
            }
        }

        public class AssetToConsumer : SynchronizationRule<Tuple<CIM.IEC61968.Metering.IMeterAsset, COSEM.IPhysicalDevice>, IEnergyConsumer>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(asset => Convert.ToInt32(asset.Item2.AutoConnect.Connection), e => e.Reachability);
                SynchronizeLeftToRightOnly(asset => asset.Item2.ElectricityValues.ApparentPowermL1, e => e.PowerA);
                SynchronizeLeftToRightOnly(asset => asset.Item1.ServiceDeliveryPoint.EnergyConsumer.MRID, e => e.ID);
                SynchronizeLeftToRightOnly(asset => asset.Item1.ServiceDeliveryPoint.EnergyConsumer is CIM.IEC61970.LoadModel.ConformLoad ?
                    ((CIM.IEC61970.LoadModel.ConformLoad)asset.Item1.ServiceDeliveryPoint.EnergyConsumer).LoadGroup.SubLoadArea.LoadArea.ControlArea.MRID :
                    ((CIM.IEC61970.LoadModel.NonConformLoad)asset.Item1.ServiceDeliveryPoint.EnergyConsumer).LoadGroup.SubLoadArea.LoadArea.ControlArea.MRID,
                    e => e.ControlAreaID);
                SynchronizeLeftToRightOnly(SyncRule<LocationToLocation>(), asset => asset.Item1.Location, e => e.Location);
            }
        }

        public class LocationToLocation : SynchronizationRule<CIM.IEC61968.Common.ILocation, ILocation>
        {
            public override void DeclareSynchronization()
            {
                SynchronizeLeftToRightOnly(SyncRule<PositionPointToPositionPoint>(), l => l.Position, l => l.Position);
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
    }
}
