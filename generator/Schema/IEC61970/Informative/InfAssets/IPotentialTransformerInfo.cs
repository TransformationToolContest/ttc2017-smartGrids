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
using TTC2017.SmartGrids.CIM.IEC61968.AssetModels;
using TTC2017.SmartGrids.CIM.IEC61968.Assets;
using TTC2017.SmartGrids.CIM.IEC61968.Common;
using TTC2017.SmartGrids.CIM.IEC61968.Metering;
using TTC2017.SmartGrids.CIM.IEC61968.WiresExt;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssetModels;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCommon;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfTypeAsset;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfWork;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets
{
    
    
    /// <summary>
    /// The public interface for PotentialTransformerInfo
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(PotentialTransformerInfo))]
    [XmlDefaultImplementationTypeAttribute(typeof(PotentialTransformerInfo))]
    public interface IPotentialTransformerInfo : IModelElement, IElectricalInfo
    {
        
        /// <summary>
        /// The accuracyClass property
        /// </summary>
        string AccuracyClass
        {
            get;
            set;
        }
        
        /// <summary>
        /// The ptClass property
        /// </summary>
        string PtClass
        {
            get;
            set;
        }
        
        /// <summary>
        /// The secondaryRatio property
        /// </summary>
        IRatio SecondaryRatio
        {
            get;
            set;
        }
        
        /// <summary>
        /// The nominalRatio property
        /// </summary>
        IRatio NominalRatio
        {
            get;
            set;
        }
        
        /// <summary>
        /// The primaryRatio property
        /// </summary>
        IRatio PrimaryRatio
        {
            get;
            set;
        }
        
        /// <summary>
        /// The tertiaryRatio property
        /// </summary>
        IRatio TertiaryRatio
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the AccuracyClass property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> AccuracyClassChanging;
        
        /// <summary>
        /// Gets fired when the AccuracyClass property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> AccuracyClassChanged;
        
        /// <summary>
        /// Gets fired before the PtClass property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PtClassChanging;
        
        /// <summary>
        /// Gets fired when the PtClass property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PtClassChanged;
        
        /// <summary>
        /// Gets fired before the SecondaryRatio property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> SecondaryRatioChanging;
        
        /// <summary>
        /// Gets fired when the SecondaryRatio property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> SecondaryRatioChanged;
        
        /// <summary>
        /// Gets fired before the NominalRatio property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NominalRatioChanging;
        
        /// <summary>
        /// Gets fired when the NominalRatio property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NominalRatioChanged;
        
        /// <summary>
        /// Gets fired before the PrimaryRatio property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PrimaryRatioChanging;
        
        /// <summary>
        /// Gets fired when the PrimaryRatio property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PrimaryRatioChanged;
        
        /// <summary>
        /// Gets fired before the TertiaryRatio property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> TertiaryRatioChanging;
        
        /// <summary>
        /// Gets fired when the TertiaryRatio property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> TertiaryRatioChanged;
    }
}
