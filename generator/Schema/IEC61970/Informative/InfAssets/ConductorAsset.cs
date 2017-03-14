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
    /// The default implementation of the ConductorAsset class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfAssets")]
    [XmlNamespacePrefixAttribute("cimInfAssets")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssets/Conduct" +
        "orAsset")]
    [DebuggerDisplayAttribute("ConductorAsset {UUID}")]
    public class ConductorAsset : Asset, IConductorAsset, IModelElement
    {
        
        /// <summary>
        /// The backing field for the GroundingMethod property
        /// </summary>
        private string _groundingMethod;
        
        /// <summary>
        /// The backing field for the Insulated property
        /// </summary>
        private bool _insulated;
        
        /// <summary>
        /// The backing field for the IsHorizontal property
        /// </summary>
        private bool _isHorizontal;
        
        /// <summary>
        /// The backing field for the CircuitSection property
        /// </summary>
        private ICircuitSection _circuitSection;
        
        /// <summary>
        /// The backing field for the ConductorSegment property
        /// </summary>
        private IDistributionLineSegment _conductorSegment;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The groundingMethod property
        /// </summary>
        [XmlElementNameAttribute("groundingMethod")]
        [XmlAttributeAttribute(true)]
        public virtual string GroundingMethod
        {
            get
            {
                return this._groundingMethod;
            }
            set
            {
                if ((this._groundingMethod != value))
                {
                    string old = this._groundingMethod;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnGroundingMethodChanging(e);
                    this.OnPropertyChanging("GroundingMethod", e);
                    this._groundingMethod = value;
                    this.OnGroundingMethodChanged(e);
                    this.OnPropertyChanged("GroundingMethod", e);
                }
            }
        }
        
        /// <summary>
        /// The insulated property
        /// </summary>
        [XmlElementNameAttribute("insulated")]
        [XmlAttributeAttribute(true)]
        public virtual bool Insulated
        {
            get
            {
                return this._insulated;
            }
            set
            {
                if ((this._insulated != value))
                {
                    bool old = this._insulated;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnInsulatedChanging(e);
                    this.OnPropertyChanging("Insulated", e);
                    this._insulated = value;
                    this.OnInsulatedChanged(e);
                    this.OnPropertyChanged("Insulated", e);
                }
            }
        }
        
        /// <summary>
        /// The isHorizontal property
        /// </summary>
        [XmlElementNameAttribute("isHorizontal")]
        [XmlAttributeAttribute(true)]
        public virtual bool IsHorizontal
        {
            get
            {
                return this._isHorizontal;
            }
            set
            {
                if ((this._isHorizontal != value))
                {
                    bool old = this._isHorizontal;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnIsHorizontalChanging(e);
                    this.OnPropertyChanging("IsHorizontal", e);
                    this._isHorizontal = value;
                    this.OnIsHorizontalChanged(e);
                    this.OnPropertyChanged("IsHorizontal", e);
                }
            }
        }
        
        /// <summary>
        /// The CircuitSection property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("ConductorAssets")]
        public virtual ICircuitSection CircuitSection
        {
            get
            {
                return this._circuitSection;
            }
            set
            {
                if ((this._circuitSection != value))
                {
                    ICircuitSection old = this._circuitSection;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnCircuitSectionChanging(e);
                    this.OnPropertyChanging("CircuitSection", e);
                    this._circuitSection = value;
                    if ((old != null))
                    {
                        old.ConductorAssets.Remove(this);
                        old.Deleted -= this.OnResetCircuitSection;
                    }
                    if ((value != null))
                    {
                        value.ConductorAssets.Add(this);
                        value.Deleted += this.OnResetCircuitSection;
                    }
                    this.OnCircuitSectionChanged(e);
                    this.OnPropertyChanged("CircuitSection", e);
                }
            }
        }
        
        /// <summary>
        /// The ConductorSegment property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("ConductorAssets")]
        public virtual IDistributionLineSegment ConductorSegment
        {
            get
            {
                return this._conductorSegment;
            }
            set
            {
                if ((this._conductorSegment != value))
                {
                    IDistributionLineSegment old = this._conductorSegment;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnConductorSegmentChanging(e);
                    this.OnPropertyChanging("ConductorSegment", e);
                    this._conductorSegment = value;
                    if ((old != null))
                    {
                        old.ConductorAssets.Remove(this);
                        old.Deleted -= this.OnResetConductorSegment;
                    }
                    if ((value != null))
                    {
                        value.ConductorAssets.Add(this);
                        value.Deleted += this.OnResetConductorSegment;
                    }
                    this.OnConductorSegmentChanged(e);
                    this.OnPropertyChanged("ConductorSegment", e);
                }
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new ConductorAssetReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssets/Conduct" +
                            "orAsset")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the GroundingMethod property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> GroundingMethodChanging;
        
        /// <summary>
        /// Gets fired when the GroundingMethod property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> GroundingMethodChanged;
        
        /// <summary>
        /// Gets fired before the Insulated property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> InsulatedChanging;
        
        /// <summary>
        /// Gets fired when the Insulated property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> InsulatedChanged;
        
        /// <summary>
        /// Gets fired before the IsHorizontal property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> IsHorizontalChanging;
        
        /// <summary>
        /// Gets fired when the IsHorizontal property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> IsHorizontalChanged;
        
        /// <summary>
        /// Gets fired before the CircuitSection property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CircuitSectionChanging;
        
        /// <summary>
        /// Gets fired when the CircuitSection property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CircuitSectionChanged;
        
        /// <summary>
        /// Gets fired before the ConductorSegment property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConductorSegmentChanging;
        
        /// <summary>
        /// Gets fired when the ConductorSegment property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConductorSegmentChanged;
        
        /// <summary>
        /// Raises the GroundingMethodChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnGroundingMethodChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.GroundingMethodChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the GroundingMethodChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnGroundingMethodChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.GroundingMethodChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the InsulatedChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInsulatedChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.InsulatedChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the InsulatedChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInsulatedChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.InsulatedChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the IsHorizontalChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnIsHorizontalChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.IsHorizontalChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the IsHorizontalChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnIsHorizontalChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.IsHorizontalChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the CircuitSectionChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCircuitSectionChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CircuitSectionChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the CircuitSectionChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCircuitSectionChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CircuitSectionChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the CircuitSection property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetCircuitSection(object sender, System.EventArgs eventArgs)
        {
            this.CircuitSection = null;
        }
        
        /// <summary>
        /// Raises the ConductorSegmentChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConductorSegmentChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConductorSegmentChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ConductorSegmentChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConductorSegmentChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConductorSegmentChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the ConductorSegment property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetConductorSegment(object sender, System.EventArgs eventArgs)
        {
            this.ConductorSegment = null;
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "GROUNDINGMETHOD"))
            {
                return this.GroundingMethod;
            }
            if ((attribute == "INSULATED"))
            {
                return this.Insulated;
            }
            if ((attribute == "ISHORIZONTAL"))
            {
                return this.IsHorizontal;
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
            if ((feature == "CIRCUITSECTION"))
            {
                this.CircuitSection = ((ICircuitSection)(value));
                return;
            }
            if ((feature == "CONDUCTORSEGMENT"))
            {
                this.ConductorSegment = ((IDistributionLineSegment)(value));
                return;
            }
            if ((feature == "GROUNDINGMETHOD"))
            {
                this.GroundingMethod = ((string)(value));
                return;
            }
            if ((feature == "INSULATED"))
            {
                this.Insulated = ((bool)(value));
                return;
            }
            if ((feature == "ISHORIZONTAL"))
            {
                this.IsHorizontal = ((bool)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "CircuitSection"))
            {
                return new CircuitSectionProxy(this);
            }
            if ((attribute == "ConductorSegment"))
            {
                return new ConductorSegmentProxy(this);
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the property expression for the given reference
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="reference">The requested reference in upper case</param>
        protected override NMF.Expressions.INotifyExpression<NMF.Models.IModelElement> GetExpressionForReference(string reference)
        {
            if ((reference == "CircuitSection"))
            {
                return new CircuitSectionProxy(this);
            }
            if ((reference == "ConductorSegment"))
            {
                return new ConductorSegmentProxy(this);
            }
            return base.GetExpressionForReference(reference);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssets/Conduct" +
                        "orAsset")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the ConductorAsset class
        /// </summary>
        public class ConductorAssetReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private ConductorAsset _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public ConductorAssetReferencedElementsCollection(ConductorAsset parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.CircuitSection != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.ConductorSegment != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.CircuitSectionChanged += this.PropagateValueChanges;
                this._parent.ConductorSegmentChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.CircuitSectionChanged -= this.PropagateValueChanges;
                this._parent.ConductorSegmentChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.CircuitSection == null))
                {
                    ICircuitSection circuitSectionCasted = item.As<ICircuitSection>();
                    if ((circuitSectionCasted != null))
                    {
                        this._parent.CircuitSection = circuitSectionCasted;
                        return;
                    }
                }
                if ((this._parent.ConductorSegment == null))
                {
                    IDistributionLineSegment conductorSegmentCasted = item.As<IDistributionLineSegment>();
                    if ((conductorSegmentCasted != null))
                    {
                        this._parent.ConductorSegment = conductorSegmentCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.CircuitSection = null;
                this._parent.ConductorSegment = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.CircuitSection))
                {
                    return true;
                }
                if ((item == this._parent.ConductorSegment))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.CircuitSection != null))
                {
                    array[arrayIndex] = this._parent.CircuitSection;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.ConductorSegment != null))
                {
                    array[arrayIndex] = this._parent.ConductorSegment;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.CircuitSection == item))
                {
                    this._parent.CircuitSection = null;
                    return true;
                }
                if ((this._parent.ConductorSegment == item))
                {
                    this._parent.ConductorSegment = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.CircuitSection).Concat(this._parent.ConductorSegment).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the groundingMethod property
        /// </summary>
        private sealed class GroundingMethodProxy : ModelPropertyChange<IConductorAsset, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public GroundingMethodProxy(IConductorAsset modelElement) : 
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
                    return this.ModelElement.GroundingMethod;
                }
                set
                {
                    this.ModelElement.GroundingMethod = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.GroundingMethodChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.GroundingMethodChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the insulated property
        /// </summary>
        private sealed class InsulatedProxy : ModelPropertyChange<IConductorAsset, bool>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public InsulatedProxy(IConductorAsset modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override bool Value
            {
                get
                {
                    return this.ModelElement.Insulated;
                }
                set
                {
                    this.ModelElement.Insulated = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.InsulatedChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.InsulatedChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the isHorizontal property
        /// </summary>
        private sealed class IsHorizontalProxy : ModelPropertyChange<IConductorAsset, bool>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public IsHorizontalProxy(IConductorAsset modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override bool Value
            {
                get
                {
                    return this.ModelElement.IsHorizontal;
                }
                set
                {
                    this.ModelElement.IsHorizontal = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.IsHorizontalChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.IsHorizontalChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the CircuitSection property
        /// </summary>
        private sealed class CircuitSectionProxy : ModelPropertyChange<IConductorAsset, ICircuitSection>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public CircuitSectionProxy(IConductorAsset modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ICircuitSection Value
            {
                get
                {
                    return this.ModelElement.CircuitSection;
                }
                set
                {
                    this.ModelElement.CircuitSection = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.CircuitSectionChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.CircuitSectionChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the ConductorSegment property
        /// </summary>
        private sealed class ConductorSegmentProxy : ModelPropertyChange<IConductorAsset, IDistributionLineSegment>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ConductorSegmentProxy(IConductorAsset modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IDistributionLineSegment Value
            {
                get
                {
                    return this.ModelElement.ConductorSegment;
                }
                set
                {
                    this.ModelElement.ConductorSegment = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ConductorSegmentChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ConductorSegmentChanged -= handler;
            }
        }
    }
}
