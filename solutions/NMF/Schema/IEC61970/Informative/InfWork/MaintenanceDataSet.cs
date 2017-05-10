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
using TTC2017.SmartGrids.CIM.IEC61968.Assets;
using TTC2017.SmartGrids.CIM.IEC61968.Common;
using TTC2017.SmartGrids.CIM.IEC61968.Work;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCommon;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfGMLSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfLocations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfTypeAsset;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.InfWork
{
    
    
    /// <summary>
    /// The default implementation of the MaintenanceDataSet class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfWork")]
    [XmlNamespacePrefixAttribute("cimInfWork")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfWork/Maintenan" +
        "ceDataSet")]
    [DebuggerDisplayAttribute("MaintenanceDataSet {UUID}")]
    public partial class MaintenanceDataSet : ProcedureDataSet, IMaintenanceDataSet, IModelElement
    {
        
        /// <summary>
        /// The backing field for the MaintCode property
        /// </summary>
        private string _maintCode;
        
        private static Lazy<ITypedElement> _maintCodeAttribute = new Lazy<ITypedElement>(RetrieveMaintCodeAttribute);
        
        /// <summary>
        /// The backing field for the ConditionBefore property
        /// </summary>
        private string _conditionBefore;
        
        private static Lazy<ITypedElement> _conditionBeforeAttribute = new Lazy<ITypedElement>(RetrieveConditionBeforeAttribute);
        
        /// <summary>
        /// The backing field for the ConditionAfter property
        /// </summary>
        private string _conditionAfter;
        
        private static Lazy<ITypedElement> _conditionAfterAttribute = new Lazy<ITypedElement>(RetrieveConditionAfterAttribute);
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The maintCode property
        /// </summary>
        [XmlElementNameAttribute("maintCode")]
        [XmlAttributeAttribute(true)]
        public virtual string MaintCode
        {
            get
            {
                return this._maintCode;
            }
            set
            {
                if ((this._maintCode != value))
                {
                    string old = this._maintCode;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnMaintCodeChanging(e);
                    this.OnPropertyChanging("MaintCode", e, _maintCodeAttribute);
                    this._maintCode = value;
                    this.OnMaintCodeChanged(e);
                    this.OnPropertyChanged("MaintCode", e, _maintCodeAttribute);
                }
            }
        }
        
        /// <summary>
        /// The conditionBefore property
        /// </summary>
        [XmlElementNameAttribute("conditionBefore")]
        [XmlAttributeAttribute(true)]
        public virtual string ConditionBefore
        {
            get
            {
                return this._conditionBefore;
            }
            set
            {
                if ((this._conditionBefore != value))
                {
                    string old = this._conditionBefore;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnConditionBeforeChanging(e);
                    this.OnPropertyChanging("ConditionBefore", e, _conditionBeforeAttribute);
                    this._conditionBefore = value;
                    this.OnConditionBeforeChanged(e);
                    this.OnPropertyChanged("ConditionBefore", e, _conditionBeforeAttribute);
                }
            }
        }
        
        /// <summary>
        /// The conditionAfter property
        /// </summary>
        [XmlElementNameAttribute("conditionAfter")]
        [XmlAttributeAttribute(true)]
        public virtual string ConditionAfter
        {
            get
            {
                return this._conditionAfter;
            }
            set
            {
                if ((this._conditionAfter != value))
                {
                    string old = this._conditionAfter;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnConditionAfterChanging(e);
                    this.OnPropertyChanging("ConditionAfter", e, _conditionAfterAttribute);
                    this._conditionAfter = value;
                    this.OnConditionAfterChanged(e);
                    this.OnPropertyChanged("ConditionAfter", e, _conditionAfterAttribute);
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfWork/Maintenan" +
                            "ceDataSet")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the MaintCode property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaintCodeChanging;
        
        /// <summary>
        /// Gets fired when the MaintCode property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> MaintCodeChanged;
        
        /// <summary>
        /// Gets fired before the ConditionBefore property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConditionBeforeChanging;
        
        /// <summary>
        /// Gets fired when the ConditionBefore property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConditionBeforeChanged;
        
        /// <summary>
        /// Gets fired before the ConditionAfter property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConditionAfterChanging;
        
        /// <summary>
        /// Gets fired when the ConditionAfter property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConditionAfterChanged;
        
        private static ITypedElement RetrieveMaintCodeAttribute()
        {
            return ((ITypedElement)(((ModelElement)(MaintenanceDataSet.ClassInstance)).Resolve("maintCode")));
        }
        
        /// <summary>
        /// Raises the MaintCodeChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaintCodeChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaintCodeChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the MaintCodeChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnMaintCodeChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.MaintCodeChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveConditionBeforeAttribute()
        {
            return ((ITypedElement)(((ModelElement)(MaintenanceDataSet.ClassInstance)).Resolve("conditionBefore")));
        }
        
        /// <summary>
        /// Raises the ConditionBeforeChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConditionBeforeChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConditionBeforeChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ConditionBeforeChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConditionBeforeChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConditionBeforeChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveConditionAfterAttribute()
        {
            return ((ITypedElement)(((ModelElement)(MaintenanceDataSet.ClassInstance)).Resolve("conditionAfter")));
        }
        
        /// <summary>
        /// Raises the ConditionAfterChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConditionAfterChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConditionAfterChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ConditionAfterChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConditionAfterChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConditionAfterChanged;
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
            if ((attribute == "MAINTCODE"))
            {
                return this.MaintCode;
            }
            if ((attribute == "CONDITIONBEFORE"))
            {
                return this.ConditionBefore;
            }
            if ((attribute == "CONDITIONAFTER"))
            {
                return this.ConditionAfter;
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
            if ((feature == "MAINTCODE"))
            {
                this.MaintCode = ((string)(value));
                return;
            }
            if ((feature == "CONDITIONBEFORE"))
            {
                this.ConditionBefore = ((string)(value));
                return;
            }
            if ((feature == "CONDITIONAFTER"))
            {
                this.ConditionAfter = ((string)(value));
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfWork/Maintenan" +
                        "ceDataSet")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the maintCode property
        /// </summary>
        private sealed class MaintCodeProxy : ModelPropertyChange<IMaintenanceDataSet, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public MaintCodeProxy(IMaintenanceDataSet modelElement) : 
                    base(modelElement, "maintCode")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.MaintCode;
                }
                set
                {
                    this.ModelElement.MaintCode = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the conditionBefore property
        /// </summary>
        private sealed class ConditionBeforeProxy : ModelPropertyChange<IMaintenanceDataSet, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ConditionBeforeProxy(IMaintenanceDataSet modelElement) : 
                    base(modelElement, "conditionBefore")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.ConditionBefore;
                }
                set
                {
                    this.ModelElement.ConditionBefore = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the conditionAfter property
        /// </summary>
        private sealed class ConditionAfterProxy : ModelPropertyChange<IMaintenanceDataSet, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ConditionAfterProxy(IMaintenanceDataSet modelElement) : 
                    base(modelElement, "conditionAfter")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.ConditionAfter;
                }
                set
                {
                    this.ModelElement.ConditionAfter = value;
                }
            }
        }
    }
}
