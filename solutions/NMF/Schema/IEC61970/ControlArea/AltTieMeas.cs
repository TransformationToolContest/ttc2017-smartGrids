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
using TTC2017.SmartGrids.CIM.IEC61970.Generation.Production;
using TTC2017.SmartGrids.CIM.IEC61970.LoadModel;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;

namespace TTC2017.SmartGrids.CIM.IEC61970.ControlArea
{
    
    
    /// <summary>
    /// The default implementation of the AltTieMeas class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#ControlArea")]
    [XmlNamespacePrefixAttribute("cimControlArea")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/ControlArea/AltTieMeas")]
    [DebuggerDisplayAttribute("AltTieMeas {UUID}")]
    public partial class AltTieMeas : Element, IAltTieMeas, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Priority property
        /// </summary>
        private int _priority;
        
        private static Lazy<ITypedElement> _priorityAttribute = new Lazy<ITypedElement>(RetrievePriorityAttribute);
        
        private static Lazy<ITypedElement> _analogValueReference = new Lazy<ITypedElement>(RetrieveAnalogValueReference);
        
        /// <summary>
        /// The backing field for the AnalogValue property
        /// </summary>
        private IAnalogValue _analogValue;
        
        private static Lazy<ITypedElement> _tieFlowReference = new Lazy<ITypedElement>(RetrieveTieFlowReference);
        
        /// <summary>
        /// The backing field for the TieFlow property
        /// </summary>
        private ITieFlow _tieFlow;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The priority property
        /// </summary>
        [XmlElementNameAttribute("priority")]
        [XmlAttributeAttribute(true)]
        public virtual int Priority
        {
            get
            {
                return this._priority;
            }
            set
            {
                if ((this._priority != value))
                {
                    int old = this._priority;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnPriorityChanging(e);
                    this.OnPropertyChanging("Priority", e, _priorityAttribute);
                    this._priority = value;
                    this.OnPriorityChanged(e);
                    this.OnPropertyChanged("Priority", e, _priorityAttribute);
                }
            }
        }
        
        /// <summary>
        /// The AnalogValue property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("AltTieMeas")]
        public virtual IAnalogValue AnalogValue
        {
            get
            {
                return this._analogValue;
            }
            set
            {
                if ((this._analogValue != value))
                {
                    IAnalogValue old = this._analogValue;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnAnalogValueChanging(e);
                    this.OnPropertyChanging("AnalogValue", e, _analogValueReference);
                    this._analogValue = value;
                    if ((old != null))
                    {
                        old.AltTieMeas.Remove(this);
                        old.Deleted -= this.OnResetAnalogValue;
                    }
                    if ((value != null))
                    {
                        value.AltTieMeas.Add(this);
                        value.Deleted += this.OnResetAnalogValue;
                    }
                    this.OnAnalogValueChanged(e);
                    this.OnPropertyChanged("AnalogValue", e, _analogValueReference);
                }
            }
        }
        
        /// <summary>
        /// The TieFlow property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("AltTieMeas")]
        public virtual ITieFlow TieFlow
        {
            get
            {
                return this._tieFlow;
            }
            set
            {
                if ((this._tieFlow != value))
                {
                    ITieFlow old = this._tieFlow;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnTieFlowChanging(e);
                    this.OnPropertyChanging("TieFlow", e, _tieFlowReference);
                    this._tieFlow = value;
                    if ((old != null))
                    {
                        old.AltTieMeas.Remove(this);
                        old.Deleted -= this.OnResetTieFlow;
                    }
                    if ((value != null))
                    {
                        value.AltTieMeas.Add(this);
                        value.Deleted += this.OnResetTieFlow;
                    }
                    this.OnTieFlowChanged(e);
                    this.OnPropertyChanged("TieFlow", e, _tieFlowReference);
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
                return base.ReferencedElements.Concat(new AltTieMeasReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/ControlArea/AltTieMeas")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the Priority property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> PriorityChanging;
        
        /// <summary>
        /// Gets fired when the Priority property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> PriorityChanged;
        
        /// <summary>
        /// Gets fired before the AnalogValue property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> AnalogValueChanging;
        
        /// <summary>
        /// Gets fired when the AnalogValue property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> AnalogValueChanged;
        
        /// <summary>
        /// Gets fired before the TieFlow property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TieFlowChanging;
        
        /// <summary>
        /// Gets fired when the TieFlow property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TieFlowChanged;
        
        private static ITypedElement RetrievePriorityAttribute()
        {
            return ((ITypedElement)(((ModelElement)(AltTieMeas.ClassInstance)).Resolve("priority")));
        }
        
        /// <summary>
        /// Raises the PriorityChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPriorityChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.PriorityChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the PriorityChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPriorityChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.PriorityChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveAnalogValueReference()
        {
            return ((ITypedElement)(((ModelElement)(AltTieMeas.ClassInstance)).Resolve("AnalogValue")));
        }
        
        /// <summary>
        /// Raises the AnalogValueChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnAnalogValueChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.AnalogValueChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the AnalogValueChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnAnalogValueChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.AnalogValueChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the AnalogValue property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetAnalogValue(object sender, System.EventArgs eventArgs)
        {
            this.AnalogValue = null;
        }
        
        private static ITypedElement RetrieveTieFlowReference()
        {
            return ((ITypedElement)(((ModelElement)(AltTieMeas.ClassInstance)).Resolve("TieFlow")));
        }
        
        /// <summary>
        /// Raises the TieFlowChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTieFlowChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TieFlowChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the TieFlowChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTieFlowChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TieFlowChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the TieFlow property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetTieFlow(object sender, System.EventArgs eventArgs)
        {
            this.TieFlow = null;
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "PRIORITY"))
            {
                return this.Priority;
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
            if ((feature == "ANALOGVALUE"))
            {
                this.AnalogValue = ((IAnalogValue)(value));
                return;
            }
            if ((feature == "TIEFLOW"))
            {
                this.TieFlow = ((ITieFlow)(value));
                return;
            }
            if ((feature == "PRIORITY"))
            {
                this.Priority = ((int)(value));
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
            if ((attribute == "AnalogValue"))
            {
                return new AnalogValueProxy(this);
            }
            if ((attribute == "TieFlow"))
            {
                return new TieFlowProxy(this);
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
            if ((reference == "AnalogValue"))
            {
                return new AnalogValueProxy(this);
            }
            if ((reference == "TieFlow"))
            {
                return new TieFlowProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/ControlArea/AltTieMeas")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the AltTieMeas class
        /// </summary>
        public class AltTieMeasReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private AltTieMeas _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public AltTieMeasReferencedElementsCollection(AltTieMeas parent)
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
                    if ((this._parent.AnalogValue != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.TieFlow != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.AnalogValueChanged += this.PropagateValueChanges;
                this._parent.TieFlowChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.AnalogValueChanged -= this.PropagateValueChanges;
                this._parent.TieFlowChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.AnalogValue == null))
                {
                    IAnalogValue analogValueCasted = item.As<IAnalogValue>();
                    if ((analogValueCasted != null))
                    {
                        this._parent.AnalogValue = analogValueCasted;
                        return;
                    }
                }
                if ((this._parent.TieFlow == null))
                {
                    ITieFlow tieFlowCasted = item.As<ITieFlow>();
                    if ((tieFlowCasted != null))
                    {
                        this._parent.TieFlow = tieFlowCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.AnalogValue = null;
                this._parent.TieFlow = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.AnalogValue))
                {
                    return true;
                }
                if ((item == this._parent.TieFlow))
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
                if ((this._parent.AnalogValue != null))
                {
                    array[arrayIndex] = this._parent.AnalogValue;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.TieFlow != null))
                {
                    array[arrayIndex] = this._parent.TieFlow;
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
                if ((this._parent.AnalogValue == item))
                {
                    this._parent.AnalogValue = null;
                    return true;
                }
                if ((this._parent.TieFlow == item))
                {
                    this._parent.TieFlow = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.AnalogValue).Concat(this._parent.TieFlow).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the priority property
        /// </summary>
        private sealed class PriorityProxy : ModelPropertyChange<IAltTieMeas, int>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public PriorityProxy(IAltTieMeas modelElement) : 
                    base(modelElement, "priority")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override int Value
            {
                get
                {
                    return this.ModelElement.Priority;
                }
                set
                {
                    this.ModelElement.Priority = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the AnalogValue property
        /// </summary>
        private sealed class AnalogValueProxy : ModelPropertyChange<IAltTieMeas, IAnalogValue>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public AnalogValueProxy(IAltTieMeas modelElement) : 
                    base(modelElement, "AnalogValue")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IAnalogValue Value
            {
                get
                {
                    return this.ModelElement.AnalogValue;
                }
                set
                {
                    this.ModelElement.AnalogValue = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the TieFlow property
        /// </summary>
        private sealed class TieFlowProxy : ModelPropertyChange<IAltTieMeas, ITieFlow>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public TieFlowProxy(IAltTieMeas modelElement) : 
                    base(modelElement, "TieFlow")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ITieFlow Value
            {
                get
                {
                    return this.ModelElement.TieFlow;
                }
                set
                {
                    this.ModelElement.TieFlow = value;
                }
            }
        }
    }
}
