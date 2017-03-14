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
using TTC2017.SmartGrids.CIM.IEC61968.Common;
using TTC2017.SmartGrids.CIM.IEC61968.Customers;
using TTC2017.SmartGrids.CIM.IEC61968.Metering;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Domain;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCommon;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfPaymentMetering;

namespace TTC2017.SmartGrids.CIM.IEC61968.PaymentMetering
{
    
    
    /// <summary>
    /// The public interface for AccountingUnit
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(AccountingUnit))]
    [XmlDefaultImplementationTypeAttribute(typeof(AccountingUnit))]
    public interface IAccountingUnit : IModelElement, IElement
    {
        
        /// <summary>
        /// The monetaryUnit property
        /// </summary>
        Nullable<TTC2017.SmartGrids.CIM.IEC61970.Domain.Currency> MonetaryUnit
        {
            get;
            set;
        }
        
        /// <summary>
        /// The energyUnit property
        /// </summary>
        float EnergyUnit
        {
            get;
            set;
        }
        
        /// <summary>
        /// The value property
        /// </summary>
        float Value
        {
            get;
            set;
        }
        
        /// <summary>
        /// The multiplier property
        /// </summary>
        Nullable<UnitMultiplier> Multiplier
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the MonetaryUnit property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MonetaryUnitChanging;
        
        /// <summary>
        /// Gets fired when the MonetaryUnit property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MonetaryUnitChanged;
        
        /// <summary>
        /// Gets fired before the EnergyUnit property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> EnergyUnitChanging;
        
        /// <summary>
        /// Gets fired when the EnergyUnit property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> EnergyUnitChanged;
        
        /// <summary>
        /// Gets fired before the Value property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> ValueChanging;
        
        /// <summary>
        /// Gets fired when the Value property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> ValueChanged;
        
        /// <summary>
        /// Gets fired before the Multiplier property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MultiplierChanging;
        
        /// <summary>
        /// Gets fired when the Multiplier property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MultiplierChanged;
    }
}
