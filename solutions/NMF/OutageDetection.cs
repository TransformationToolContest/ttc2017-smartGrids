using NMF.Expressions;
using NMF.Expressions.Linq;
using System;
using System.Linq;
using TTC2017.SmartGrids.OutageDetectionJointarget;

namespace TTC2017.SmartGrids
{
    public class OutageDetection
    {
        public static IEnumerableExpression<EnergyConsumer> GetEnergyConsumer(CIM.CIMRoot cimRoot, COSEM.COSEMRoot cosemRoot)
        {
            return from pd in cosemRoot.PhysicalDevice
                   join ma in cimRoot.IDobject.OfType<CIM.IEC61968.Metering.IMeterAsset>() on pd.ID equals ma.MRID
                   select new EnergyConsumer
                   {
                       Reachability = Convert.ToInt32(pd.AutoConnect.Connection.Value),
                       PowerA = pd.ElectricityValues.ApparentPowermAll,
                       Location = new Location()
                       {
                           Position = new PositionPoint()
                           {
                               XPosition = ma.Location.Position.XPosition,
                               YPosition = ma.Location.Position.YPosition,
                               ZPosition = ma.Location.Position.ZPosition
                           }
                       }
                   };
        }
    }
}
