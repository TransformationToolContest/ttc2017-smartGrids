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
using TTC2017.SmartGrids.CIM.IEC61970.Contingency;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Generation.Production;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.EnergyScheduling;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.Financial;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;
using TTC2017.SmartGrids.CIM.IEC61970.LoadModel;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations
{
    
    
    /// <summary>
    /// The public interface for MarketStatementLineItem
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(MarketStatementLineItem))]
    [XmlDefaultImplementationTypeAttribute(typeof(MarketStatementLineItem))]
    public interface IMarketStatementLineItem : IModelElement, IIdentifiedObject
    {
        
        /// <summary>
        /// The currentAmount property
        /// </summary>
        float CurrentAmount
        {
            get;
            set;
        }
        
        /// <summary>
        /// The previousISOAmount property
        /// </summary>
        float PreviousISOAmount
        {
            get;
            set;
        }
        
        /// <summary>
        /// The quantityUOM property
        /// </summary>
        string QuantityUOM
        {
            get;
            set;
        }
        
        /// <summary>
        /// The netISOAmount property
        /// </summary>
        float NetISOAmount
        {
            get;
            set;
        }
        
        /// <summary>
        /// The currentISOAmount property
        /// </summary>
        float CurrentISOAmount
        {
            get;
            set;
        }
        
        /// <summary>
        /// The previousQuantity property
        /// </summary>
        float PreviousQuantity
        {
            get;
            set;
        }
        
        /// <summary>
        /// The previousAmount property
        /// </summary>
        float PreviousAmount
        {
            get;
            set;
        }
        
        /// <summary>
        /// The netISOQuantity property
        /// </summary>
        float NetISOQuantity
        {
            get;
            set;
        }
        
        /// <summary>
        /// The netPrice property
        /// </summary>
        float NetPrice
        {
            get;
            set;
        }
        
        /// <summary>
        /// The currentISOQuantity property
        /// </summary>
        float CurrentISOQuantity
        {
            get;
            set;
        }
        
        /// <summary>
        /// The currentPrice property
        /// </summary>
        float CurrentPrice
        {
            get;
            set;
        }
        
        /// <summary>
        /// The previsouPrice property
        /// </summary>
        float PrevisouPrice
        {
            get;
            set;
        }
        
        /// <summary>
        /// The previousISOQuantity property
        /// </summary>
        float PreviousISOQuantity
        {
            get;
            set;
        }
        
        /// <summary>
        /// The intervalDate property
        /// </summary>
        DateTime IntervalDate
        {
            get;
            set;
        }
        
        /// <summary>
        /// The netQuantity property
        /// </summary>
        float NetQuantity
        {
            get;
            set;
        }
        
        /// <summary>
        /// The netAmount property
        /// </summary>
        float NetAmount
        {
            get;
            set;
        }
        
        /// <summary>
        /// The currentQuantity property
        /// </summary>
        float CurrentQuantity
        {
            get;
            set;
        }
        
        /// <summary>
        /// The intervalNumber property
        /// </summary>
        string IntervalNumber
        {
            get;
            set;
        }
        
        /// <summary>
        /// The UserAttributes property
        /// </summary>
        IOrderedSetExpression<IUserAttribute> UserAttributes
        {
            get;
        }
        
        /// <summary>
        /// The ComponentMarketStatementLineItem property
        /// </summary>
        IOrderedSetExpression<IMarketStatementLineItem> ComponentMarketStatementLineItem
        {
            get;
        }
        
        /// <summary>
        /// The PassThroughBill property
        /// </summary>
        IPassThroughBill PassThroughBill
        {
            get;
            set;
        }
        
        /// <summary>
        /// The MarketStatement property
        /// </summary>
        IMarketStatement MarketStatement
        {
            get;
            set;
        }
        
        /// <summary>
        /// The ContainerMarketStatementLineItem property
        /// </summary>
        IMarketStatementLineItem ContainerMarketStatementLineItem
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the CurrentAmount property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentAmountChanging;
        
        /// <summary>
        /// Gets fired when the CurrentAmount property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentAmountChanged;
        
        /// <summary>
        /// Gets fired before the PreviousISOAmount property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousISOAmountChanging;
        
        /// <summary>
        /// Gets fired when the PreviousISOAmount property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousISOAmountChanged;
        
        /// <summary>
        /// Gets fired before the QuantityUOM property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> QuantityUOMChanging;
        
        /// <summary>
        /// Gets fired when the QuantityUOM property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> QuantityUOMChanged;
        
        /// <summary>
        /// Gets fired before the NetISOAmount property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetISOAmountChanging;
        
        /// <summary>
        /// Gets fired when the NetISOAmount property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetISOAmountChanged;
        
        /// <summary>
        /// Gets fired before the CurrentISOAmount property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentISOAmountChanging;
        
        /// <summary>
        /// Gets fired when the CurrentISOAmount property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentISOAmountChanged;
        
        /// <summary>
        /// Gets fired before the PreviousQuantity property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousQuantityChanging;
        
        /// <summary>
        /// Gets fired when the PreviousQuantity property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousQuantityChanged;
        
        /// <summary>
        /// Gets fired before the PreviousAmount property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousAmountChanging;
        
        /// <summary>
        /// Gets fired when the PreviousAmount property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousAmountChanged;
        
        /// <summary>
        /// Gets fired before the NetISOQuantity property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetISOQuantityChanging;
        
        /// <summary>
        /// Gets fired when the NetISOQuantity property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetISOQuantityChanged;
        
        /// <summary>
        /// Gets fired before the NetPrice property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetPriceChanging;
        
        /// <summary>
        /// Gets fired when the NetPrice property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetPriceChanged;
        
        /// <summary>
        /// Gets fired before the CurrentISOQuantity property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentISOQuantityChanging;
        
        /// <summary>
        /// Gets fired when the CurrentISOQuantity property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentISOQuantityChanged;
        
        /// <summary>
        /// Gets fired before the CurrentPrice property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentPriceChanging;
        
        /// <summary>
        /// Gets fired when the CurrentPrice property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentPriceChanged;
        
        /// <summary>
        /// Gets fired before the PrevisouPrice property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PrevisouPriceChanging;
        
        /// <summary>
        /// Gets fired when the PrevisouPrice property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PrevisouPriceChanged;
        
        /// <summary>
        /// Gets fired before the PreviousISOQuantity property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousISOQuantityChanging;
        
        /// <summary>
        /// Gets fired when the PreviousISOQuantity property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PreviousISOQuantityChanged;
        
        /// <summary>
        /// Gets fired before the IntervalDate property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> IntervalDateChanging;
        
        /// <summary>
        /// Gets fired when the IntervalDate property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> IntervalDateChanged;
        
        /// <summary>
        /// Gets fired before the NetQuantity property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetQuantityChanging;
        
        /// <summary>
        /// Gets fired when the NetQuantity property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetQuantityChanged;
        
        /// <summary>
        /// Gets fired before the NetAmount property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetAmountChanging;
        
        /// <summary>
        /// Gets fired when the NetAmount property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NetAmountChanged;
        
        /// <summary>
        /// Gets fired before the CurrentQuantity property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentQuantityChanging;
        
        /// <summary>
        /// Gets fired when the CurrentQuantity property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CurrentQuantityChanged;
        
        /// <summary>
        /// Gets fired before the IntervalNumber property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> IntervalNumberChanging;
        
        /// <summary>
        /// Gets fired when the IntervalNumber property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> IntervalNumberChanged;
        
        /// <summary>
        /// Gets fired before the PassThroughBill property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PassThroughBillChanging;
        
        /// <summary>
        /// Gets fired when the PassThroughBill property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PassThroughBillChanged;
        
        /// <summary>
        /// Gets fired before the MarketStatement property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MarketStatementChanging;
        
        /// <summary>
        /// Gets fired when the MarketStatement property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MarketStatementChanged;
        
        /// <summary>
        /// Gets fired before the ContainerMarketStatementLineItem property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> ContainerMarketStatementLineItemChanging;
        
        /// <summary>
        /// Gets fired when the ContainerMarketStatementLineItem property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> ContainerMarketStatementLineItemChanged;
    }
}
