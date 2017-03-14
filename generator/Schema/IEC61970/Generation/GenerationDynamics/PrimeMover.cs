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
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Generation.Production;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.Generation.GenerationDynamics
{
    
    
    /// <summary>
    /// The default implementation of the PrimeMover class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#GenerationDynamics")]
    [XmlNamespacePrefixAttribute("cimGenerationDynamics")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Generation/GenerationDynamics" +
        "/PrimeMover")]
    [DebuggerDisplayAttribute("PrimeMover {UUID}")]
    public class PrimeMover : PowerSystemResource, IPrimeMover, IModelElement
    {
        
        /// <summary>
        /// The backing field for the PrimeMoverRating property
        /// </summary>
        private float _primeMoverRating;
        
        /// <summary>
        /// The backing field for the SynchronousMachines property
        /// </summary>
        private PrimeMoverSynchronousMachinesCollection _synchronousMachines;
        
        private static IClass _classInstance;
        
        public PrimeMover()
        {
            this._synchronousMachines = new PrimeMoverSynchronousMachinesCollection(this);
            this._synchronousMachines.CollectionChanging += this.SynchronousMachinesCollectionChanging;
            this._synchronousMachines.CollectionChanged += this.SynchronousMachinesCollectionChanged;
        }
        
        /// <summary>
        /// The primeMoverRating property
        /// </summary>
        [XmlElementNameAttribute("primeMoverRating")]
        [XmlAttributeAttribute(true)]
        public virtual float PrimeMoverRating
        {
            get
            {
                return this._primeMoverRating;
            }
            set
            {
                if ((this._primeMoverRating != value))
                {
                    float old = this._primeMoverRating;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnPrimeMoverRatingChanging(e);
                    this.OnPropertyChanging("PrimeMoverRating", e);
                    this._primeMoverRating = value;
                    this.OnPrimeMoverRatingChanged(e);
                    this.OnPropertyChanged("PrimeMoverRating", e);
                }
            }
        }
        
        /// <summary>
        /// The SynchronousMachines property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("PrimeMovers")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ISynchronousMachine> SynchronousMachines
        {
            get
            {
                return this._synchronousMachines;
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new PrimeMoverReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Generation/GenerationDynamics" +
                            "/PrimeMover")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the PrimeMoverRating property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> PrimeMoverRatingChanging;
        
        /// <summary>
        /// Gets fired when the PrimeMoverRating property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> PrimeMoverRatingChanged;
        
        /// <summary>
        /// Raises the PrimeMoverRatingChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPrimeMoverRatingChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.PrimeMoverRatingChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the PrimeMoverRatingChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPrimeMoverRatingChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.PrimeMoverRatingChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the SynchronousMachines property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SynchronousMachinesCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("SynchronousMachines", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the SynchronousMachines property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SynchronousMachinesCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("SynchronousMachines", e);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "PRIMEMOVERRATING"))
            {
                return this.PrimeMoverRating;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Gets the Model element collection for the given feature
        /// </summary>
        /// <returns>A non-generic list of elements</returns>
        /// <param name="feature">The requested feature</param>
        protected override System.Collections.IList GetCollectionForFeature(string feature)
        {
            if ((feature == "SYNCHRONOUSMACHINES"))
            {
                return this._synchronousMachines;
            }
            return base.GetCollectionForFeature(feature);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "PRIMEMOVERRATING"))
            {
                this.PrimeMoverRating = ((float)(value));
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Generation/GenerationDynamics" +
                        "/PrimeMover")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the PrimeMover class
        /// </summary>
        public class PrimeMoverReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private PrimeMover _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public PrimeMoverReferencedElementsCollection(PrimeMover parent)
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
                    count = (count + this._parent.SynchronousMachines.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.SynchronousMachines.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.SynchronousMachines.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                ISynchronousMachine synchronousMachinesCasted = item.As<ISynchronousMachine>();
                if ((synchronousMachinesCasted != null))
                {
                    this._parent.SynchronousMachines.Add(synchronousMachinesCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.SynchronousMachines.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.SynchronousMachines.Contains(item))
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
                IEnumerator<IModelElement> synchronousMachinesEnumerator = this._parent.SynchronousMachines.GetEnumerator();
                try
                {
                    for (
                    ; synchronousMachinesEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = synchronousMachinesEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    synchronousMachinesEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                ISynchronousMachine synchronousMachineItem = item.As<ISynchronousMachine>();
                if (((synchronousMachineItem != null) 
                            && this._parent.SynchronousMachines.Remove(synchronousMachineItem)))
                {
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.SynchronousMachines).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the primeMoverRating property
        /// </summary>
        private sealed class PrimeMoverRatingProxy : ModelPropertyChange<IPrimeMover, float>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public PrimeMoverRatingProxy(IPrimeMover modelElement) : 
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
                    return this.ModelElement.PrimeMoverRating;
                }
                set
                {
                    this.ModelElement.PrimeMoverRating = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.PrimeMoverRatingChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.PrimeMoverRatingChanged -= handler;
            }
        }
    }
}
