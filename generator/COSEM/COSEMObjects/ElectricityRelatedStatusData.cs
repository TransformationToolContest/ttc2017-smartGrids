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
using TTC2017.SmartGrids.COSEM.InterfaceClasses;

namespace TTC2017.SmartGrids.COSEM.COSEMObjects
{
    
    
    /// <summary>
    /// The default implementation of the ElectricityRelatedStatusData class
    /// </summary>
    [XmlNamespaceAttribute("objects")]
    [XmlNamespacePrefixAttribute("objects")]
    [ModelRepresentationClassAttribute("http://www.transformation-tool-contest.eu/2017/smartGrids/cosem#//COSEMObjects/El" +
        "ectricityRelatedStatusData")]
    public class ElectricityRelatedStatusData : Data, IElectricityRelatedStatusData, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Status_information_missing_voltage property
        /// </summary>
        private string _status_information_missing_voltage;
        
        /// <summary>
        /// The backing field for the Status_information_missing_current property
        /// </summary>
        private string _status_information_missing_current;
        
        /// <summary>
        /// The backing field for the Status_information_current_without_voltage property
        /// </summary>
        private string _status_information_current_without_voltage;
        
        /// <summary>
        /// The backing field for the Status_information_auxiliary_power_supply property
        /// </summary>
        private string _status_information_auxiliary_power_supply;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The Status_information_missing_voltage property
        /// </summary>
        [XmlAttributeAttribute(true)]
        public virtual string Status_information_missing_voltage
        {
            get
            {
                return this._status_information_missing_voltage;
            }
            set
            {
                if ((this._status_information_missing_voltage != value))
                {
                    string old = this._status_information_missing_voltage;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStatus_information_missing_voltageChanging(e);
                    this.OnPropertyChanging("Status_information_missing_voltage", e);
                    this._status_information_missing_voltage = value;
                    this.OnStatus_information_missing_voltageChanged(e);
                    this.OnPropertyChanged("Status_information_missing_voltage", e);
                }
            }
        }
        
        /// <summary>
        /// The Status_information_missing_current property
        /// </summary>
        [XmlAttributeAttribute(true)]
        public virtual string Status_information_missing_current
        {
            get
            {
                return this._status_information_missing_current;
            }
            set
            {
                if ((this._status_information_missing_current != value))
                {
                    string old = this._status_information_missing_current;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStatus_information_missing_currentChanging(e);
                    this.OnPropertyChanging("Status_information_missing_current", e);
                    this._status_information_missing_current = value;
                    this.OnStatus_information_missing_currentChanged(e);
                    this.OnPropertyChanged("Status_information_missing_current", e);
                }
            }
        }
        
        /// <summary>
        /// The Status_information_current_without_voltage property
        /// </summary>
        [XmlAttributeAttribute(true)]
        public virtual string Status_information_current_without_voltage
        {
            get
            {
                return this._status_information_current_without_voltage;
            }
            set
            {
                if ((this._status_information_current_without_voltage != value))
                {
                    string old = this._status_information_current_without_voltage;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStatus_information_current_without_voltageChanging(e);
                    this.OnPropertyChanging("Status_information_current_without_voltage", e);
                    this._status_information_current_without_voltage = value;
                    this.OnStatus_information_current_without_voltageChanged(e);
                    this.OnPropertyChanged("Status_information_current_without_voltage", e);
                }
            }
        }
        
        /// <summary>
        /// The Status_information_auxiliary_power_supply property
        /// </summary>
        [XmlAttributeAttribute(true)]
        public virtual string Status_information_auxiliary_power_supply
        {
            get
            {
                return this._status_information_auxiliary_power_supply;
            }
            set
            {
                if ((this._status_information_auxiliary_power_supply != value))
                {
                    string old = this._status_information_auxiliary_power_supply;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStatus_information_auxiliary_power_supplyChanging(e);
                    this.OnPropertyChanging("Status_information_auxiliary_power_supply", e);
                    this._status_information_auxiliary_power_supply = value;
                    this.OnStatus_information_auxiliary_power_supplyChanged(e);
                    this.OnPropertyChanged("Status_information_auxiliary_power_supply", e);
                }
            }
        }
        
        /// <summary>
        /// Gets the Class model for this type
        /// </summary>
        public new static IClass ClassInstance
        {
            get
            {
                if ((_classInstance == null))
                {
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/2017/smartGrids/cosem#//COSEMObjects/El" +
                            "ectricityRelatedStatusData")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the Status_information_missing_voltage property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_missing_voltageChanging;
        
        /// <summary>
        /// Gets fired when the Status_information_missing_voltage property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_missing_voltageChanged;
        
        /// <summary>
        /// Gets fired before the Status_information_missing_current property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_missing_currentChanging;
        
        /// <summary>
        /// Gets fired when the Status_information_missing_current property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_missing_currentChanged;
        
        /// <summary>
        /// Gets fired before the Status_information_current_without_voltage property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_current_without_voltageChanging;
        
        /// <summary>
        /// Gets fired when the Status_information_current_without_voltage property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_current_without_voltageChanged;
        
        /// <summary>
        /// Gets fired before the Status_information_auxiliary_power_supply property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_auxiliary_power_supplyChanging;
        
        /// <summary>
        /// Gets fired when the Status_information_auxiliary_power_supply property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> Status_information_auxiliary_power_supplyChanged;
        
        /// <summary>
        /// Raises the Status_information_missing_voltageChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_missing_voltageChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_missing_voltageChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_missing_voltageChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_missing_voltageChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_missing_voltageChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_missing_currentChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_missing_currentChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_missing_currentChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_missing_currentChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_missing_currentChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_missing_currentChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_current_without_voltageChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_current_without_voltageChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_current_without_voltageChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_current_without_voltageChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_current_without_voltageChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_current_without_voltageChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_auxiliary_power_supplyChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_auxiliary_power_supplyChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_auxiliary_power_supplyChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the Status_information_auxiliary_power_supplyChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatus_information_auxiliary_power_supplyChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.Status_information_auxiliary_power_supplyChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "STATUS_INFORMATION_MISSING_VOLTAGE"))
            {
                return this.Status_information_missing_voltage;
            }
            if ((attribute == "STATUS_INFORMATION_MISSING_CURRENT"))
            {
                return this.Status_information_missing_current;
            }
            if ((attribute == "STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE"))
            {
                return this.Status_information_current_without_voltage;
            }
            if ((attribute == "STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY"))
            {
                return this.Status_information_auxiliary_power_supply;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "STATUS_INFORMATION_MISSING_VOLTAGE"))
            {
                this.Status_information_missing_voltage = ((string)(value));
                return;
            }
            if ((feature == "STATUS_INFORMATION_MISSING_CURRENT"))
            {
                this.Status_information_missing_current = ((string)(value));
                return;
            }
            if ((feature == "STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE"))
            {
                this.Status_information_current_without_voltage = ((string)(value));
                return;
            }
            if ((feature == "STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY"))
            {
                this.Status_information_auxiliary_power_supply = ((string)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/2017/smartGrids/cosem#//COSEMObjects/El" +
                        "ectricityRelatedStatusData")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the Status_information_missing_voltage property
        /// </summary>
        private sealed class Status_information_missing_voltageProxy : ModelPropertyChange<IElectricityRelatedStatusData, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public Status_information_missing_voltageProxy(IElectricityRelatedStatusData modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Status_information_missing_voltage;
                }
                set
                {
                    this.ModelElement.Status_information_missing_voltage = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_missing_voltageChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_missing_voltageChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the Status_information_missing_current property
        /// </summary>
        private sealed class Status_information_missing_currentProxy : ModelPropertyChange<IElectricityRelatedStatusData, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public Status_information_missing_currentProxy(IElectricityRelatedStatusData modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Status_information_missing_current;
                }
                set
                {
                    this.ModelElement.Status_information_missing_current = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_missing_currentChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_missing_currentChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the Status_information_current_without_voltage property
        /// </summary>
        private sealed class Status_information_current_without_voltageProxy : ModelPropertyChange<IElectricityRelatedStatusData, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public Status_information_current_without_voltageProxy(IElectricityRelatedStatusData modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Status_information_current_without_voltage;
                }
                set
                {
                    this.ModelElement.Status_information_current_without_voltage = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_current_without_voltageChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_current_without_voltageChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the Status_information_auxiliary_power_supply property
        /// </summary>
        private sealed class Status_information_auxiliary_power_supplyProxy : ModelPropertyChange<IElectricityRelatedStatusData, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public Status_information_auxiliary_power_supplyProxy(IElectricityRelatedStatusData modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Status_information_auxiliary_power_supply;
                }
                set
                {
                    this.ModelElement.Status_information_auxiliary_power_supply = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_auxiliary_power_supplyChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.Status_information_auxiliary_power_supplyChanged -= handler;
            }
        }
    }
}
