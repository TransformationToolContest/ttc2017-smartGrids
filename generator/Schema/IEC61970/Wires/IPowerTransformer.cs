//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;
using TTC2017.SmartGrids.CIM.IEC61968.LoadControl;
using TTC2017.SmartGrids.CIM.IEC61968.Metering;
using TTC2017.SmartGrids.CIM.IEC61968.WiresExt;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Generation.GenerationDynamics;
using TTC2017.SmartGrids.CIM.IEC61970.Generation.Production;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.EnergyScheduling;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfLoadControl;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations;
using TTC2017.SmartGrids.CIM.IEC61970.LoadModel;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;
using TTC2017.SmartGrids.CIM.IEC61970.Outage;
using TTC2017.SmartGrids.CIM.IEC61970.Protection;
using TTC2017.SmartGrids.CIM.IEC61970.StateVariables;

namespace TTC2017.SmartGrids.CIM.IEC61970.Wires
{
    
    
    /// <summary>
    /// The public interface for PowerTransformer
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(PowerTransformer))]
    [XmlDefaultImplementationTypeAttribute(typeof(PowerTransformer))]
    public interface IPowerTransformer : IModelElement, IEquipment
    {
        
        /// <summary>
        /// The magBaseU property
        /// </summary>
        float MagBaseU
        {
            get;
            set;
        }
        
        /// <summary>
        /// The magSatFlux property
        /// </summary>
        float MagSatFlux
        {
            get;
            set;
        }
        
        /// <summary>
        /// The bmagSat property
        /// </summary>
        float BmagSat
        {
            get;
            set;
        }
        
        /// <summary>
        /// The Flowgates property
        /// </summary>
        IOrderedSetExpression<IFlowgate> Flowgates
        {
            get;
        }
        
        /// <summary>
        /// The HeatExchanger property
        /// </summary>
        IHeatExchanger HeatExchanger
        {
            get;
            set;
        }
        
        /// <summary>
        /// The TransformerWindings property
        /// </summary>
        IOrderedSetExpression<ITransformerWinding> TransformerWindings
        {
            get;
        }
        
        /// <summary>
        /// Gets fired before the MagBaseU property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MagBaseUChanging;
        
        /// <summary>
        /// Gets fired when the MagBaseU property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MagBaseUChanged;
        
        /// <summary>
        /// Gets fired before the MagSatFlux property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MagSatFluxChanging;
        
        /// <summary>
        /// Gets fired when the MagSatFlux property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MagSatFluxChanged;
        
        /// <summary>
        /// Gets fired before the BmagSat property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> BmagSatChanging;
        
        /// <summary>
        /// Gets fired when the BmagSat property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> BmagSatChanged;
        
        /// <summary>
        /// Gets fired before the HeatExchanger property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> HeatExchangerChanging;
        
        /// <summary>
        /// Gets fired when the HeatExchanger property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> HeatExchangerChanged;
    }
}
