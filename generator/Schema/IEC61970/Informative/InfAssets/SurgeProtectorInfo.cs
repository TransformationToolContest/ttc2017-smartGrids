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
    /// The default implementation of the SurgeProtectorInfo class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfAssets")]
    [XmlNamespacePrefixAttribute("cimInfAssets")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssets/SurgePr" +
        "otectorInfo")]
    [DebuggerDisplayAttribute("SurgeProtectorInfo {UUID}")]
    public class SurgeProtectorInfo : ElectricalInfo, ISurgeProtectorInfo, IModelElement
    {
        
        /// <summary>
        /// The backing field for the NominalDesignVoltage property
        /// </summary>
        private float _nominalDesignVoltage;
        
        /// <summary>
        /// The backing field for the MaxCurrentRating property
        /// </summary>
        private float _maxCurrentRating;
        
        /// <summary>
        /// The backing field for the MaxContinousOperatingVoltage property
        /// </summary>
        private float _maxContinousOperatingVoltage;
        
        /// <summary>
        /// The backing field for the MaxEnergyAbsorption property
        /// </summary>
        private float _maxEnergyAbsorption;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The nominalDesignVoltage property
        /// </summary>
        [XmlElementNameAttribute("nominalDesignVoltage")]
        [XmlAttributeAttribute(true)]
        public virtual float NominalDesignVoltage
        {
            get
            {
                return this._nominalDesignVoltage;
            }
            set
            {
                if ((this._nominalDesignVoltage != value))
                {
                    float old = this._nominalDesignVoltage;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnNominalDesignVoltageChanging(e);
                    this.OnPropertyChanging("NominalDesignVoltage", e);
                    this._nominalDesignVoltage = value;
                    this.OnNominalDesignVoltageChanged(e);
                    this.OnPropertyChanged("NominalDesignVoltage", e);
                }
            }
        }
        
        /// <summary>
        /// The maxCurrentRating property
        /// </summary>
        [XmlElementNameAttribute("maxCurrentRating")]
        [XmlAttributeAttribute(true)]
        public virtual float MaxCurrentRating
        {
            get
            {
                return this._maxCurrentRating;
            }
            set
            {
                if ((this._maxCurrentRating != value))
                {
                    float old = this._maxCurrentRating;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnMaxCurrentRatingChanging(e);
                    this.OnPropertyChanging("MaxCurrentRating", e);
                    this._maxCurrentRating = value;
                    this.OnMaxCurrentRatingChanged(e);
                    this.OnPropertyChanged("MaxCurrentRating", e);
                }
            }
        }
        
        /// <summary>
        /// The maxContinousOperatingVoltage property
        /// </summary>
        [XmlElementNameAttribute("maxContinousOperatingVoltage")]
        [XmlAttributeAttribute(true)]
        public virtual float MaxContinousOperatingVoltage
        {
            get
            {
                return this._maxContinousOperatingVoltage;
            }
            set
            {
                if ((this._maxContinousOperatingVoltage != value))
                {
                    float old = this._maxContinousOperatingVoltage;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnMaxContinousOperatingVoltageChanging(e);
                    this.OnPropertyChanging("MaxContinousOperatingVoltage", e);
                    this._maxContinousOperatingVoltage = value;
                    this.OnMaxContinousOperatingVoltageChanged(e);
                    this.OnPropertyChanged("MaxContinousOperatingVoltage", e);
                }
            }
        }
        
        /// <summary>
        /// The maxEnergyAbsorption property
        /// </summary>
        [XmlElementNameAttribute("maxEnergyAbsorption")]
        [XmlAttributeAttribute(true)]
        public virtual float MaxEnergyAbsorption
        {
            get
            {
                return this._maxEnergyAbsorption;
            }
            set
            {
                if ((this._maxEnergyAbsorption != value))
                {
                    float old = this._maxEnergyAbsorption;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnMaxEnergyAbsorptionChanging(e);
                    this.OnPropertyChanging("MaxEnergyAbsorption", e);
                    this._maxEnergyAbsorption = value;
                    this.OnMaxEnergyAbsorptionChanged(e);
                    this.OnPropertyChanged("MaxEnergyAbsorption", e);
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssets/SurgePr" +
                            "otectorInfo")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the NominalDesignVoltage property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NominalDesignVoltageChanging;
        
        /// <summary>
        /// Gets fired when the NominalDesignVoltage property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NominalDesignVoltageChanged;
        
        /// <summary>
        /// Gets fired before the MaxCurrentRating property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaxCurrentRatingChanging;
        
        /// <summary>
        /// Gets fired when the MaxCurrentRating property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaxCurrentRatingChanged;
        
        /// <summary>
        /// Gets fired before the MaxContinousOperatingVoltage property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaxContinousOperatingVoltageChanging;
        
        /// <summary>
        /// Gets fired when the MaxContinousOperatingVoltage property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaxContinousOperatingVoltageChanged;
        
        /// <summary>
        /// Gets fired before the MaxEnergyAbsorption property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaxEnergyAbsorptionChanging;
        
        /// <summary>
        /// Gets fired when the MaxEnergyAbsorption property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaxEnergyAbsorptionChanged;
        
        /// <summary>
        /// Raises the NominalDesignVoltageChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNominalDesignVoltageChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NominalDesignVoltageChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the NominalDesignVoltageChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNominalDesignVoltageChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NominalDesignVoltageChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaxCurrentRatingChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaxCurrentRatingChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaxCurrentRatingChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaxCurrentRatingChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaxCurrentRatingChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaxCurrentRatingChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaxContinousOperatingVoltageChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaxContinousOperatingVoltageChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaxContinousOperatingVoltageChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaxContinousOperatingVoltageChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaxContinousOperatingVoltageChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaxContinousOperatingVoltageChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaxEnergyAbsorptionChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaxEnergyAbsorptionChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaxEnergyAbsorptionChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaxEnergyAbsorptionChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaxEnergyAbsorptionChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaxEnergyAbsorptionChanged;
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
            if ((attribute == "NOMINALDESIGNVOLTAGE"))
            {
                return this.NominalDesignVoltage;
            }
            if ((attribute == "MAXCURRENTRATING"))
            {
                return this.MaxCurrentRating;
            }
            if ((attribute == "MAXCONTINOUSOPERATINGVOLTAGE"))
            {
                return this.MaxContinousOperatingVoltage;
            }
            if ((attribute == "MAXENERGYABSORPTION"))
            {
                return this.MaxEnergyAbsorption;
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
            if ((feature == "NOMINALDESIGNVOLTAGE"))
            {
                this.NominalDesignVoltage = ((float)(value));
                return;
            }
            if ((feature == "MAXCURRENTRATING"))
            {
                this.MaxCurrentRating = ((float)(value));
                return;
            }
            if ((feature == "MAXCONTINOUSOPERATINGVOLTAGE"))
            {
                this.MaxContinousOperatingVoltage = ((float)(value));
                return;
            }
            if ((feature == "MAXENERGYABSORPTION"))
            {
                this.MaxEnergyAbsorption = ((float)(value));
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssets/SurgePr" +
                        "otectorInfo")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the nominalDesignVoltage property
        /// </summary>
        private sealed class NominalDesignVoltageProxy : ModelPropertyChange<ISurgeProtectorInfo, float>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public NominalDesignVoltageProxy(ISurgeProtectorInfo modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override float Value
            {
                get
                {
                    return this.ModelElement.NominalDesignVoltage;
                }
                set
                {
                    this.ModelElement.NominalDesignVoltage = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.NominalDesignVoltageChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.NominalDesignVoltageChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the maxCurrentRating property
        /// </summary>
        private sealed class MaxCurrentRatingProxy : ModelPropertyChange<ISurgeProtectorInfo, float>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public MaxCurrentRatingProxy(ISurgeProtectorInfo modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override float Value
            {
                get
                {
                    return this.ModelElement.MaxCurrentRating;
                }
                set
                {
                    this.ModelElement.MaxCurrentRating = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.MaxCurrentRatingChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.MaxCurrentRatingChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the maxContinousOperatingVoltage property
        /// </summary>
        private sealed class MaxContinousOperatingVoltageProxy : ModelPropertyChange<ISurgeProtectorInfo, float>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public MaxContinousOperatingVoltageProxy(ISurgeProtectorInfo modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override float Value
            {
                get
                {
                    return this.ModelElement.MaxContinousOperatingVoltage;
                }
                set
                {
                    this.ModelElement.MaxContinousOperatingVoltage = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.MaxContinousOperatingVoltageChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.MaxContinousOperatingVoltageChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the maxEnergyAbsorption property
        /// </summary>
        private sealed class MaxEnergyAbsorptionProxy : ModelPropertyChange<ISurgeProtectorInfo, float>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public MaxEnergyAbsorptionProxy(ISurgeProtectorInfo modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override float Value
            {
                get
                {
                    return this.ModelElement.MaxEnergyAbsorption;
                }
                set
                {
                    this.ModelElement.MaxEnergyAbsorption = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.MaxEnergyAbsorptionChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.MaxEnergyAbsorptionChanged -= handler;
            }
        }
    }
}
