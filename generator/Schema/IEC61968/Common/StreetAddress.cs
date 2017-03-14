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
using TTC2017.SmartGrids.CIM.IEC61968.Assets;
using TTC2017.SmartGrids.CIM.IEC61968.PaymentMetering;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCommon;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfGMLSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfLocations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfWork;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;

namespace TTC2017.SmartGrids.CIM.IEC61968.Common
{
    
    
    /// <summary>
    /// The default implementation of the StreetAddress class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#Common")]
    [XmlNamespacePrefixAttribute("cimCommon")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61968/Common/StreetAddress")]
    [DebuggerDisplayAttribute("StreetAddress {UUID}")]
    public class StreetAddress : Element, IStreetAddress, IModelElement
    {
        
        /// <summary>
        /// The backing field for the StreetDetail property
        /// </summary>
        private IStreetDetail _streetDetail;
        
        /// <summary>
        /// The backing field for the Status property
        /// </summary>
        private IStatus _status;
        
        /// <summary>
        /// The backing field for the TownDetail property
        /// </summary>
        private ITownDetail _townDetail;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The streetDetail property
        /// </summary>
        [XmlElementNameAttribute("streetDetail")]
        [XmlAttributeAttribute(true)]
        public virtual IStreetDetail StreetDetail
        {
            get
            {
                return this._streetDetail;
            }
            set
            {
                if ((this._streetDetail != value))
                {
                    IStreetDetail old = this._streetDetail;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStreetDetailChanging(e);
                    this.OnPropertyChanging("StreetDetail", e);
                    this._streetDetail = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetStreetDetail;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetStreetDetail;
                    }
                    this.OnStreetDetailChanged(e);
                    this.OnPropertyChanged("StreetDetail", e);
                }
            }
        }
        
        /// <summary>
        /// The status property
        /// </summary>
        [XmlElementNameAttribute("status")]
        [XmlAttributeAttribute(true)]
        public virtual IStatus Status
        {
            get
            {
                return this._status;
            }
            set
            {
                if ((this._status != value))
                {
                    IStatus old = this._status;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStatusChanging(e);
                    this.OnPropertyChanging("Status", e);
                    this._status = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetStatus;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetStatus;
                    }
                    this.OnStatusChanged(e);
                    this.OnPropertyChanged("Status", e);
                }
            }
        }
        
        /// <summary>
        /// The townDetail property
        /// </summary>
        [XmlElementNameAttribute("townDetail")]
        [XmlAttributeAttribute(true)]
        public virtual ITownDetail TownDetail
        {
            get
            {
                return this._townDetail;
            }
            set
            {
                if ((this._townDetail != value))
                {
                    ITownDetail old = this._townDetail;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnTownDetailChanging(e);
                    this.OnPropertyChanging("TownDetail", e);
                    this._townDetail = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetTownDetail;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetTownDetail;
                    }
                    this.OnTownDetailChanged(e);
                    this.OnPropertyChanged("TownDetail", e);
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
                return base.ReferencedElements.Concat(new StreetAddressReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61968/Common/StreetAddress")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the StreetDetail property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StreetDetailChanging;
        
        /// <summary>
        /// Gets fired when the StreetDetail property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StreetDetailChanged;
        
        /// <summary>
        /// Gets fired before the Status property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StatusChanging;
        
        /// <summary>
        /// Gets fired when the Status property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StatusChanged;
        
        /// <summary>
        /// Gets fired before the TownDetail property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TownDetailChanging;
        
        /// <summary>
        /// Gets fired when the TownDetail property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TownDetailChanged;
        
        /// <summary>
        /// Raises the StreetDetailChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStreetDetailChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StreetDetailChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the StreetDetailChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStreetDetailChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StreetDetailChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the StreetDetail property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetStreetDetail(object sender, System.EventArgs eventArgs)
        {
            this.StreetDetail = null;
        }
        
        /// <summary>
        /// Raises the StatusChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatusChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StatusChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the StatusChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStatusChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StatusChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the Status property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetStatus(object sender, System.EventArgs eventArgs)
        {
            this.Status = null;
        }
        
        /// <summary>
        /// Raises the TownDetailChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTownDetailChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TownDetailChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the TownDetailChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTownDetailChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TownDetailChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the TownDetail property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetTownDetail(object sender, System.EventArgs eventArgs)
        {
            this.TownDetail = null;
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "STREETDETAIL"))
            {
                this.StreetDetail = ((IStreetDetail)(value));
                return;
            }
            if ((feature == "STATUS"))
            {
                this.Status = ((IStatus)(value));
                return;
            }
            if ((feature == "TOWNDETAIL"))
            {
                this.TownDetail = ((ITownDetail)(value));
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
            if ((attribute == "StreetDetail"))
            {
                return new StreetDetailProxy(this);
            }
            if ((attribute == "Status"))
            {
                return new StatusProxy(this);
            }
            if ((attribute == "TownDetail"))
            {
                return new TownDetailProxy(this);
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
            if ((reference == "StreetDetail"))
            {
                return new StreetDetailProxy(this);
            }
            if ((reference == "Status"))
            {
                return new StatusProxy(this);
            }
            if ((reference == "TownDetail"))
            {
                return new TownDetailProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61968/Common/StreetAddress")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the StreetAddress class
        /// </summary>
        public class StreetAddressReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private StreetAddress _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public StreetAddressReferencedElementsCollection(StreetAddress parent)
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
                    if ((this._parent.StreetDetail != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.Status != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.TownDetail != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.StreetDetailChanged += this.PropagateValueChanges;
                this._parent.StatusChanged += this.PropagateValueChanges;
                this._parent.TownDetailChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.StreetDetailChanged -= this.PropagateValueChanges;
                this._parent.StatusChanged -= this.PropagateValueChanges;
                this._parent.TownDetailChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.StreetDetail == null))
                {
                    IStreetDetail streetDetailCasted = item.As<IStreetDetail>();
                    if ((streetDetailCasted != null))
                    {
                        this._parent.StreetDetail = streetDetailCasted;
                        return;
                    }
                }
                if ((this._parent.Status == null))
                {
                    IStatus statusCasted = item.As<IStatus>();
                    if ((statusCasted != null))
                    {
                        this._parent.Status = statusCasted;
                        return;
                    }
                }
                if ((this._parent.TownDetail == null))
                {
                    ITownDetail townDetailCasted = item.As<ITownDetail>();
                    if ((townDetailCasted != null))
                    {
                        this._parent.TownDetail = townDetailCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.StreetDetail = null;
                this._parent.Status = null;
                this._parent.TownDetail = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.StreetDetail))
                {
                    return true;
                }
                if ((item == this._parent.Status))
                {
                    return true;
                }
                if ((item == this._parent.TownDetail))
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
                if ((this._parent.StreetDetail != null))
                {
                    array[arrayIndex] = this._parent.StreetDetail;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.Status != null))
                {
                    array[arrayIndex] = this._parent.Status;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.TownDetail != null))
                {
                    array[arrayIndex] = this._parent.TownDetail;
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
                if ((this._parent.StreetDetail == item))
                {
                    this._parent.StreetDetail = null;
                    return true;
                }
                if ((this._parent.Status == item))
                {
                    this._parent.Status = null;
                    return true;
                }
                if ((this._parent.TownDetail == item))
                {
                    this._parent.TownDetail = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.StreetDetail).Concat(this._parent.Status).Concat(this._parent.TownDetail).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the streetDetail property
        /// </summary>
        private sealed class StreetDetailProxy : ModelPropertyChange<IStreetAddress, IStreetDetail>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public StreetDetailProxy(IStreetAddress modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IStreetDetail Value
            {
                get
                {
                    return this.ModelElement.StreetDetail;
                }
                set
                {
                    this.ModelElement.StreetDetail = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.StreetDetailChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.StreetDetailChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the status property
        /// </summary>
        private sealed class StatusProxy : ModelPropertyChange<IStreetAddress, IStatus>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public StatusProxy(IStreetAddress modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IStatus Value
            {
                get
                {
                    return this.ModelElement.Status;
                }
                set
                {
                    this.ModelElement.Status = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.StatusChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.StatusChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the townDetail property
        /// </summary>
        private sealed class TownDetailProxy : ModelPropertyChange<IStreetAddress, ITownDetail>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public TownDetailProxy(IStreetAddress modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ITownDetail Value
            {
                get
                {
                    return this.ModelElement.TownDetail;
                }
                set
                {
                    this.ModelElement.TownDetail = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TownDetailChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TownDetailChanged -= handler;
            }
        }
    }
}
