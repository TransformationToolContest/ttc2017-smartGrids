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
using TTC2017.SmartGrids.CIM;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.EnergyScheduling;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.Financial;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.Reservation
{
    
    
    /// <summary>
    /// The public interface for TiePoint
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(TiePoint))]
    [XmlDefaultImplementationTypeAttribute(typeof(TiePoint))]
    public interface ITiePoint : IModelElement, IIdentifiedObject
    {
        
        /// <summary>
        /// The tiePointMWRating property
        /// </summary>
        float TiePointMWRating
        {
            get;
            set;
        }
        
        /// <summary>
        /// The By_Measurements property
        /// </summary>
        IOrderedSetExpression<IMeasurement> By_Measurements
        {
            get;
        }
        
        /// <summary>
        /// The Declared_ServicePoint property
        /// </summary>
        IServicePoint Declared_ServicePoint
        {
            get;
            set;
        }
        
        /// <summary>
        /// The For_Measurements property
        /// </summary>
        IOrderedSetExpression<IMeasurement> For_Measurements
        {
            get;
        }
        
        /// <summary>
        /// Gets fired before the TiePointMWRating property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> TiePointMWRatingChanging;
        
        /// <summary>
        /// Gets fired when the TiePointMWRating property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> TiePointMWRatingChanged;
        
        /// <summary>
        /// Gets fired before the Declared_ServicePoint property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Declared_ServicePointChanging;
        
        /// <summary>
        /// Gets fired when the Declared_ServicePoint property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Declared_ServicePointChanged;
    }
}
