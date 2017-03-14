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
using TTC2017.SmartGrids.CIM.IEC61970.ControlArea;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.LoadModel
{
    
    
    /// <summary>
    /// The default implementation of the Season class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#LoadModel")]
    [XmlNamespacePrefixAttribute("cimLoadModel")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/LoadModel/Season")]
    [DebuggerDisplayAttribute("Season {UUID}")]
    public class Season : Element, ISeason, IModelElement
    {
        
        /// <summary>
        /// The backing field for the StartDate property
        /// </summary>
        private DateTime _startDate;
        
        /// <summary>
        /// The backing field for the Name property
        /// </summary>
        private Nullable<SeasonName> _name;
        
        /// <summary>
        /// The backing field for the EndDate property
        /// </summary>
        private DateTime _endDate;
        
        /// <summary>
        /// The backing field for the ViolationLimits property
        /// </summary>
        private SeasonViolationLimitsCollection _violationLimits;
        
        /// <summary>
        /// The backing field for the SeasonDayTypeSchedules property
        /// </summary>
        private SeasonSeasonDayTypeSchedulesCollection _seasonDayTypeSchedules;
        
        /// <summary>
        /// The backing field for the CapacityBenefitMargin property
        /// </summary>
        private SeasonCapacityBenefitMarginCollection _capacityBenefitMargin;
        
        private static IClass _classInstance;
        
        public Season()
        {
            this._violationLimits = new SeasonViolationLimitsCollection(this);
            this._violationLimits.CollectionChanging += this.ViolationLimitsCollectionChanging;
            this._violationLimits.CollectionChanged += this.ViolationLimitsCollectionChanged;
            this._seasonDayTypeSchedules = new SeasonSeasonDayTypeSchedulesCollection(this);
            this._seasonDayTypeSchedules.CollectionChanging += this.SeasonDayTypeSchedulesCollectionChanging;
            this._seasonDayTypeSchedules.CollectionChanged += this.SeasonDayTypeSchedulesCollectionChanged;
            this._capacityBenefitMargin = new SeasonCapacityBenefitMarginCollection(this);
            this._capacityBenefitMargin.CollectionChanging += this.CapacityBenefitMarginCollectionChanging;
            this._capacityBenefitMargin.CollectionChanged += this.CapacityBenefitMarginCollectionChanged;
        }
        
        /// <summary>
        /// The startDate property
        /// </summary>
        [XmlElementNameAttribute("startDate")]
        [XmlAttributeAttribute(true)]
        public virtual DateTime StartDate
        {
            get
            {
                return this._startDate;
            }
            set
            {
                if ((this._startDate != value))
                {
                    DateTime old = this._startDate;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStartDateChanging(e);
                    this.OnPropertyChanging("StartDate", e);
                    this._startDate = value;
                    this.OnStartDateChanged(e);
                    this.OnPropertyChanged("StartDate", e);
                }
            }
        }
        
        /// <summary>
        /// The name property
        /// </summary>
        [XmlElementNameAttribute("name")]
        [XmlAttributeAttribute(true)]
        public virtual Nullable<SeasonName> Name
        {
            get
            {
                return this._name;
            }
            set
            {
                if ((this._name != value))
                {
                    Nullable<SeasonName> old = this._name;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnNameChanging(e);
                    this.OnPropertyChanging("Name", e);
                    this._name = value;
                    this.OnNameChanged(e);
                    this.OnPropertyChanged("Name", e);
                }
            }
        }
        
        /// <summary>
        /// The endDate property
        /// </summary>
        [XmlElementNameAttribute("endDate")]
        [XmlAttributeAttribute(true)]
        public virtual DateTime EndDate
        {
            get
            {
                return this._endDate;
            }
            set
            {
                if ((this._endDate != value))
                {
                    DateTime old = this._endDate;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnEndDateChanging(e);
                    this.OnPropertyChanging("EndDate", e);
                    this._endDate = value;
                    this.OnEndDateChanged(e);
                    this.OnPropertyChanged("EndDate", e);
                }
            }
        }
        
        /// <summary>
        /// The ViolationLimits property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("Season")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IViolationLimit> ViolationLimits
        {
            get
            {
                return this._violationLimits;
            }
        }
        
        /// <summary>
        /// The SeasonDayTypeSchedules property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("Season")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ISeasonDayTypeSchedule> SeasonDayTypeSchedules
        {
            get
            {
                return this._seasonDayTypeSchedules;
            }
        }
        
        /// <summary>
        /// The CapacityBenefitMargin property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("Season")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ICapacityBenefitMargin> CapacityBenefitMargin
        {
            get
            {
                return this._capacityBenefitMargin;
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new SeasonReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/LoadModel/Season")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the StartDate property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StartDateChanging;
        
        /// <summary>
        /// Gets fired when the StartDate property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StartDateChanged;
        
        /// <summary>
        /// Gets fired before the Name property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanging;
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> NameChanged;
        
        /// <summary>
        /// Gets fired before the EndDate property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> EndDateChanging;
        
        /// <summary>
        /// Gets fired when the EndDate property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> EndDateChanged;
        
        /// <summary>
        /// Raises the StartDateChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStartDateChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StartDateChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the StartDateChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStartDateChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StartDateChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the NameChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the NameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnNameChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.NameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the EndDateChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnEndDateChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.EndDateChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the EndDateChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnEndDateChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.EndDateChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the ViolationLimits property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ViolationLimitsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("ViolationLimits", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the ViolationLimits property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ViolationLimitsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("ViolationLimits", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the SeasonDayTypeSchedules property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SeasonDayTypeSchedulesCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("SeasonDayTypeSchedules", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the SeasonDayTypeSchedules property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SeasonDayTypeSchedulesCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("SeasonDayTypeSchedules", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the CapacityBenefitMargin property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void CapacityBenefitMarginCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("CapacityBenefitMargin", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the CapacityBenefitMargin property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void CapacityBenefitMarginCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("CapacityBenefitMargin", e);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "STARTDATE"))
            {
                return this.StartDate;
            }
            if ((attribute == "NAME"))
            {
                return this.Name;
            }
            if ((attribute == "ENDDATE"))
            {
                return this.EndDate;
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
            if ((feature == "VIOLATIONLIMITS"))
            {
                return this._violationLimits;
            }
            if ((feature == "SEASONDAYTYPESCHEDULES"))
            {
                return this._seasonDayTypeSchedules;
            }
            if ((feature == "CAPACITYBENEFITMARGIN"))
            {
                return this._capacityBenefitMargin;
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
            if ((feature == "STARTDATE"))
            {
                this.StartDate = ((DateTime)(value));
                return;
            }
            if ((feature == "NAME"))
            {
                this.Name = ((SeasonName)(value));
                return;
            }
            if ((feature == "ENDDATE"))
            {
                this.EndDate = ((DateTime)(value));
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/LoadModel/Season")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the Season class
        /// </summary>
        public class SeasonReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private Season _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public SeasonReferencedElementsCollection(Season parent)
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
                    count = (count + this._parent.ViolationLimits.Count);
                    count = (count + this._parent.SeasonDayTypeSchedules.Count);
                    count = (count + this._parent.CapacityBenefitMargin.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.ViolationLimits.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.SeasonDayTypeSchedules.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.CapacityBenefitMargin.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.ViolationLimits.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.SeasonDayTypeSchedules.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.CapacityBenefitMargin.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IViolationLimit violationLimitsCasted = item.As<IViolationLimit>();
                if ((violationLimitsCasted != null))
                {
                    this._parent.ViolationLimits.Add(violationLimitsCasted);
                }
                ISeasonDayTypeSchedule seasonDayTypeSchedulesCasted = item.As<ISeasonDayTypeSchedule>();
                if ((seasonDayTypeSchedulesCasted != null))
                {
                    this._parent.SeasonDayTypeSchedules.Add(seasonDayTypeSchedulesCasted);
                }
                ICapacityBenefitMargin capacityBenefitMarginCasted = item.As<ICapacityBenefitMargin>();
                if ((capacityBenefitMarginCasted != null))
                {
                    this._parent.CapacityBenefitMargin.Add(capacityBenefitMarginCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.ViolationLimits.Clear();
                this._parent.SeasonDayTypeSchedules.Clear();
                this._parent.CapacityBenefitMargin.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.ViolationLimits.Contains(item))
                {
                    return true;
                }
                if (this._parent.SeasonDayTypeSchedules.Contains(item))
                {
                    return true;
                }
                if (this._parent.CapacityBenefitMargin.Contains(item))
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
                IEnumerator<IModelElement> violationLimitsEnumerator = this._parent.ViolationLimits.GetEnumerator();
                try
                {
                    for (
                    ; violationLimitsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = violationLimitsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    violationLimitsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> seasonDayTypeSchedulesEnumerator = this._parent.SeasonDayTypeSchedules.GetEnumerator();
                try
                {
                    for (
                    ; seasonDayTypeSchedulesEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = seasonDayTypeSchedulesEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    seasonDayTypeSchedulesEnumerator.Dispose();
                }
                IEnumerator<IModelElement> capacityBenefitMarginEnumerator = this._parent.CapacityBenefitMargin.GetEnumerator();
                try
                {
                    for (
                    ; capacityBenefitMarginEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = capacityBenefitMarginEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    capacityBenefitMarginEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                IViolationLimit violationLimitItem = item.As<IViolationLimit>();
                if (((violationLimitItem != null) 
                            && this._parent.ViolationLimits.Remove(violationLimitItem)))
                {
                    return true;
                }
                ISeasonDayTypeSchedule seasonDayTypeScheduleItem = item.As<ISeasonDayTypeSchedule>();
                if (((seasonDayTypeScheduleItem != null) 
                            && this._parent.SeasonDayTypeSchedules.Remove(seasonDayTypeScheduleItem)))
                {
                    return true;
                }
                ICapacityBenefitMargin capacityBenefitMarginItem = item.As<ICapacityBenefitMargin>();
                if (((capacityBenefitMarginItem != null) 
                            && this._parent.CapacityBenefitMargin.Remove(capacityBenefitMarginItem)))
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.ViolationLimits).Concat(this._parent.SeasonDayTypeSchedules).Concat(this._parent.CapacityBenefitMargin).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the startDate property
        /// </summary>
        private sealed class StartDateProxy : ModelPropertyChange<ISeason, DateTime>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public StartDateProxy(ISeason modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override DateTime Value
            {
                get
                {
                    return this.ModelElement.StartDate;
                }
                set
                {
                    this.ModelElement.StartDate = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.StartDateChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.StartDateChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the name property
        /// </summary>
        private sealed class NameProxy : ModelPropertyChange<ISeason, Nullable<SeasonName>>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public NameProxy(ISeason modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override Nullable<SeasonName> Value
            {
                get
                {
                    return this.ModelElement.Name;
                }
                set
                {
                    this.ModelElement.Name = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.NameChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.NameChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the endDate property
        /// </summary>
        private sealed class EndDateProxy : ModelPropertyChange<ISeason, DateTime>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public EndDateProxy(ISeason modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override DateTime Value
            {
                get
                {
                    return this.ModelElement.EndDate;
                }
                set
                {
                    this.ModelElement.EndDate = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.EndDateChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.EndDateChanged -= handler;
            }
        }
    }
}
