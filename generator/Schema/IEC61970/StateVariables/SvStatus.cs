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
using TTC2017.SmartGrids.CIM.IEC61970.Topology;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.StateVariables
{
    
    
    /// <summary>
    /// The default implementation of the SvStatus class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#StateVariables")]
    [XmlNamespacePrefixAttribute("cimStateVariables")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/StateVariables/SvStatus")]
    [DebuggerDisplayAttribute("SvStatus {UUID}")]
    public class SvStatus : StateVariable, ISvStatus, IModelElement
    {
        
        /// <summary>
        /// The backing field for the InService property
        /// </summary>
        private bool _inService;
        
        /// <summary>
        /// The backing field for the ConductingEquipment property
        /// </summary>
        private IConductingEquipment _conductingEquipment;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The inService property
        /// </summary>
        [XmlElementNameAttribute("inService")]
        [XmlAttributeAttribute(true)]
        public virtual bool InService
        {
            get
            {
                return this._inService;
            }
            set
            {
                if ((this._inService != value))
                {
                    bool old = this._inService;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnInServiceChanging(e);
                    this.OnPropertyChanging("InService", e);
                    this._inService = value;
                    this.OnInServiceChanged(e);
                    this.OnPropertyChanged("InService", e);
                }
            }
        }
        
        /// <summary>
        /// The ConductingEquipment property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("SvStatus")]
        public virtual IConductingEquipment ConductingEquipment
        {
            get
            {
                return this._conductingEquipment;
            }
            set
            {
                if ((this._conductingEquipment != value))
                {
                    IConductingEquipment old = this._conductingEquipment;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnConductingEquipmentChanging(e);
                    this.OnPropertyChanging("ConductingEquipment", e);
                    this._conductingEquipment = value;
                    if ((old != null))
                    {
                        old.SvStatus = null;
                        old.Deleted -= this.OnResetConductingEquipment;
                    }
                    if ((value != null))
                    {
                        value.SvStatus = this;
                        value.Deleted += this.OnResetConductingEquipment;
                    }
                    this.OnConductingEquipmentChanged(e);
                    this.OnPropertyChanged("ConductingEquipment", e);
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
                return base.ReferencedElements.Concat(new SvStatusReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/StateVariables/SvStatus")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the InService property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> InServiceChanging;
        
        /// <summary>
        /// Gets fired when the InService property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> InServiceChanged;
        
        /// <summary>
        /// Gets fired before the ConductingEquipment property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConductingEquipmentChanging;
        
        /// <summary>
        /// Gets fired when the ConductingEquipment property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ConductingEquipmentChanged;
        
        /// <summary>
        /// Raises the InServiceChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInServiceChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.InServiceChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the InServiceChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInServiceChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.InServiceChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ConductingEquipmentChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConductingEquipmentChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConductingEquipmentChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ConductingEquipmentChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnConductingEquipmentChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ConductingEquipmentChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the ConductingEquipment property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetConductingEquipment(object sender, System.EventArgs eventArgs)
        {
            this.ConductingEquipment = null;
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "INSERVICE"))
            {
                return this.InService;
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
            if ((feature == "CONDUCTINGEQUIPMENT"))
            {
                this.ConductingEquipment = ((IConductingEquipment)(value));
                return;
            }
            if ((feature == "INSERVICE"))
            {
                this.InService = ((bool)(value));
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
            if ((attribute == "ConductingEquipment"))
            {
                return new ConductingEquipmentProxy(this);
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
            if ((reference == "ConductingEquipment"))
            {
                return new ConductingEquipmentProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/StateVariables/SvStatus")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the SvStatus class
        /// </summary>
        public class SvStatusReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private SvStatus _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public SvStatusReferencedElementsCollection(SvStatus parent)
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
                    if ((this._parent.ConductingEquipment != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.ConductingEquipmentChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.ConductingEquipmentChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.ConductingEquipment == null))
                {
                    IConductingEquipment conductingEquipmentCasted = item.As<IConductingEquipment>();
                    if ((conductingEquipmentCasted != null))
                    {
                        this._parent.ConductingEquipment = conductingEquipmentCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.ConductingEquipment = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.ConductingEquipment))
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
                if ((this._parent.ConductingEquipment != null))
                {
                    array[arrayIndex] = this._parent.ConductingEquipment;
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
                if ((this._parent.ConductingEquipment == item))
                {
                    this._parent.ConductingEquipment = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.ConductingEquipment).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the inService property
        /// </summary>
        private sealed class InServiceProxy : ModelPropertyChange<ISvStatus, bool>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public InServiceProxy(ISvStatus modelElement) : 
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
                    return this.ModelElement.InService;
                }
                set
                {
                    this.ModelElement.InService = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.InServiceChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.InServiceChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the ConductingEquipment property
        /// </summary>
        private sealed class ConductingEquipmentProxy : ModelPropertyChange<ISvStatus, IConductingEquipment>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ConductingEquipmentProxy(ISvStatus modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IConductingEquipment Value
            {
                get
                {
                    return this.ModelElement.ConductingEquipment;
                }
                set
                {
                    this.ModelElement.ConductingEquipment = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ConductingEquipmentChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ConductingEquipmentChanged -= handler;
            }
        }
    }
}
