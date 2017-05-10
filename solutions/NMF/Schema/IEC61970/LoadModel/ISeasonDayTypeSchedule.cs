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
using TTC2017.SmartGrids.CIM.IEC61970.ControlArea;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.LoadModel
{
    
    
    /// <summary>
    /// The public interface for SeasonDayTypeSchedule
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(SeasonDayTypeSchedule))]
    [XmlDefaultImplementationTypeAttribute(typeof(SeasonDayTypeSchedule))]
    public interface ISeasonDayTypeSchedule : IModelElement, IRegularIntervalSchedule
    {
        
        /// <summary>
        /// The DayType property
        /// </summary>
        IDayType DayType
        {
            get;
            set;
        }
        
        /// <summary>
        /// The Season property
        /// </summary>
        ISeason Season
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the DayType property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> DayTypeChanging;
        
        /// <summary>
        /// Gets fired when the DayType property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> DayTypeChanged;
        
        /// <summary>
        /// Gets fired before the Season property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> SeasonChanging;
        
        /// <summary>
        /// Gets fired when the Season property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> SeasonChanged;
    }
}
