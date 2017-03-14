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
using TTC2017.SmartGrids.CIM.IEC61968.Customers;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCommon;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCustomers;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfGMLSupport;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfWork;
using TTC2017.SmartGrids.CIM.IEC61970.Outage;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.InfOperations
{
    
    
    /// <summary>
    /// The default implementation of the SwitchingSchedule class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfOperations")]
    [XmlNamespacePrefixAttribute("cimInfOperations")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfOperations/Swi" +
        "tchingSchedule")]
    [DebuggerDisplayAttribute("SwitchingSchedule {UUID}")]
    public class SwitchingSchedule : Document, ISwitchingSchedule, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Reason property
        /// </summary>
        private string _reason;
        
        /// <summary>
        /// The backing field for the WorkTask property
        /// </summary>
        private IWorkTask _workTask;
        
        /// <summary>
        /// The backing field for the ScheduleSteps property
        /// </summary>
        private SwitchingScheduleScheduleStepsCollection _scheduleSteps;
        
        /// <summary>
        /// The backing field for the Interval property
        /// </summary>
        private IDateTimeInterval _interval;
        
        /// <summary>
        /// The backing field for the Crews property
        /// </summary>
        private SwitchingScheduleCrewsCollection _crews;
        
        private static IClass _classInstance;
        
        public SwitchingSchedule()
        {
            this._scheduleSteps = new SwitchingScheduleScheduleStepsCollection(this);
            this._scheduleSteps.CollectionChanging += this.ScheduleStepsCollectionChanging;
            this._scheduleSteps.CollectionChanged += this.ScheduleStepsCollectionChanged;
            this._crews = new SwitchingScheduleCrewsCollection(this);
            this._crews.CollectionChanging += this.CrewsCollectionChanging;
            this._crews.CollectionChanged += this.CrewsCollectionChanged;
        }
        
        /// <summary>
        /// The reason property
        /// </summary>
        [XmlElementNameAttribute("reason")]
        [XmlAttributeAttribute(true)]
        public virtual string Reason
        {
            get
            {
                return this._reason;
            }
            set
            {
                if ((this._reason != value))
                {
                    string old = this._reason;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnReasonChanging(e);
                    this.OnPropertyChanging("Reason", e);
                    this._reason = value;
                    this.OnReasonChanged(e);
                    this.OnPropertyChanged("Reason", e);
                }
            }
        }
        
        /// <summary>
        /// The WorkTask property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("SwitchingSchedules")]
        public virtual IWorkTask WorkTask
        {
            get
            {
                return this._workTask;
            }
            set
            {
                if ((this._workTask != value))
                {
                    IWorkTask old = this._workTask;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnWorkTaskChanging(e);
                    this.OnPropertyChanging("WorkTask", e);
                    this._workTask = value;
                    if ((old != null))
                    {
                        old.SwitchingSchedules.Remove(this);
                        old.Deleted -= this.OnResetWorkTask;
                    }
                    if ((value != null))
                    {
                        value.SwitchingSchedules.Add(this);
                        value.Deleted += this.OnResetWorkTask;
                    }
                    this.OnWorkTaskChanged(e);
                    this.OnPropertyChanged("WorkTask", e);
                }
            }
        }
        
        /// <summary>
        /// The ScheduleSteps property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("SwitchingSchedule")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ISwitchingStep> ScheduleSteps
        {
            get
            {
                return this._scheduleSteps;
            }
        }
        
        /// <summary>
        /// The interval property
        /// </summary>
        [XmlElementNameAttribute("interval")]
        [XmlAttributeAttribute(true)]
        public virtual IDateTimeInterval Interval
        {
            get
            {
                return this._interval;
            }
            set
            {
                if ((this._interval != value))
                {
                    IDateTimeInterval old = this._interval;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnIntervalChanging(e);
                    this.OnPropertyChanging("Interval", e);
                    this._interval = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetInterval;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetInterval;
                    }
                    this.OnIntervalChanged(e);
                    this.OnPropertyChanged("Interval", e);
                }
            }
        }
        
        /// <summary>
        /// The Crews property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("SwitchingSchedules")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ICrew> Crews
        {
            get
            {
                return this._crews;
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new SwitchingScheduleReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfOperations/Swi" +
                            "tchingSchedule")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the Reason property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ReasonChanging;
        
        /// <summary>
        /// Gets fired when the Reason property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ReasonChanged;
        
        /// <summary>
        /// Gets fired before the WorkTask property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> WorkTaskChanging;
        
        /// <summary>
        /// Gets fired when the WorkTask property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> WorkTaskChanged;
        
        /// <summary>
        /// Gets fired before the Interval property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> IntervalChanging;
        
        /// <summary>
        /// Gets fired when the Interval property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> IntervalChanged;
        
        /// <summary>
        /// Raises the ReasonChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnReasonChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ReasonChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ReasonChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnReasonChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ReasonChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the WorkTaskChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnWorkTaskChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.WorkTaskChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the WorkTaskChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnWorkTaskChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.WorkTaskChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the WorkTask property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetWorkTask(object sender, System.EventArgs eventArgs)
        {
            this.WorkTask = null;
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the ScheduleSteps property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ScheduleStepsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("ScheduleSteps", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the ScheduleSteps property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ScheduleStepsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("ScheduleSteps", e);
        }
        
        /// <summary>
        /// Raises the IntervalChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnIntervalChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.IntervalChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the IntervalChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnIntervalChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.IntervalChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the Interval property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetInterval(object sender, System.EventArgs eventArgs)
        {
            this.Interval = null;
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Crews property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void CrewsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("Crews", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Crews property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void CrewsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Crews", e);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "REASON"))
            {
                return this.Reason;
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
            if ((feature == "SCHEDULESTEPS"))
            {
                return this._scheduleSteps;
            }
            if ((feature == "CREWS"))
            {
                return this._crews;
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
            if ((feature == "WORKTASK"))
            {
                this.WorkTask = ((IWorkTask)(value));
                return;
            }
            if ((feature == "INTERVAL"))
            {
                this.Interval = ((IDateTimeInterval)(value));
                return;
            }
            if ((feature == "REASON"))
            {
                this.Reason = ((string)(value));
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
            if ((attribute == "WorkTask"))
            {
                return new WorkTaskProxy(this);
            }
            if ((attribute == "Interval"))
            {
                return new IntervalProxy(this);
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
            if ((reference == "WorkTask"))
            {
                return new WorkTaskProxy(this);
            }
            if ((reference == "Interval"))
            {
                return new IntervalProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfOperations/Swi" +
                        "tchingSchedule")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the SwitchingSchedule class
        /// </summary>
        public class SwitchingScheduleReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private SwitchingSchedule _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public SwitchingScheduleReferencedElementsCollection(SwitchingSchedule parent)
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
                    if ((this._parent.WorkTask != null))
                    {
                        count = (count + 1);
                    }
                    count = (count + this._parent.ScheduleSteps.Count);
                    if ((this._parent.Interval != null))
                    {
                        count = (count + 1);
                    }
                    count = (count + this._parent.Crews.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.WorkTaskChanged += this.PropagateValueChanges;
                this._parent.ScheduleSteps.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.IntervalChanged += this.PropagateValueChanges;
                this._parent.Crews.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.WorkTaskChanged -= this.PropagateValueChanges;
                this._parent.ScheduleSteps.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.IntervalChanged -= this.PropagateValueChanges;
                this._parent.Crews.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.WorkTask == null))
                {
                    IWorkTask workTaskCasted = item.As<IWorkTask>();
                    if ((workTaskCasted != null))
                    {
                        this._parent.WorkTask = workTaskCasted;
                        return;
                    }
                }
                ISwitchingStep scheduleStepsCasted = item.As<ISwitchingStep>();
                if ((scheduleStepsCasted != null))
                {
                    this._parent.ScheduleSteps.Add(scheduleStepsCasted);
                }
                if ((this._parent.Interval == null))
                {
                    IDateTimeInterval intervalCasted = item.As<IDateTimeInterval>();
                    if ((intervalCasted != null))
                    {
                        this._parent.Interval = intervalCasted;
                        return;
                    }
                }
                ICrew crewsCasted = item.As<ICrew>();
                if ((crewsCasted != null))
                {
                    this._parent.Crews.Add(crewsCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.WorkTask = null;
                this._parent.ScheduleSteps.Clear();
                this._parent.Interval = null;
                this._parent.Crews.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.WorkTask))
                {
                    return true;
                }
                if (this._parent.ScheduleSteps.Contains(item))
                {
                    return true;
                }
                if ((item == this._parent.Interval))
                {
                    return true;
                }
                if (this._parent.Crews.Contains(item))
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
                if ((this._parent.WorkTask != null))
                {
                    array[arrayIndex] = this._parent.WorkTask;
                    arrayIndex = (arrayIndex + 1);
                }
                IEnumerator<IModelElement> scheduleStepsEnumerator = this._parent.ScheduleSteps.GetEnumerator();
                try
                {
                    for (
                    ; scheduleStepsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = scheduleStepsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    scheduleStepsEnumerator.Dispose();
                }
                if ((this._parent.Interval != null))
                {
                    array[arrayIndex] = this._parent.Interval;
                    arrayIndex = (arrayIndex + 1);
                }
                IEnumerator<IModelElement> crewsEnumerator = this._parent.Crews.GetEnumerator();
                try
                {
                    for (
                    ; crewsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = crewsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    crewsEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.WorkTask == item))
                {
                    this._parent.WorkTask = null;
                    return true;
                }
                ISwitchingStep switchingStepItem = item.As<ISwitchingStep>();
                if (((switchingStepItem != null) 
                            && this._parent.ScheduleSteps.Remove(switchingStepItem)))
                {
                    return true;
                }
                if ((this._parent.Interval == item))
                {
                    this._parent.Interval = null;
                    return true;
                }
                ICrew crewItem = item.As<ICrew>();
                if (((crewItem != null) 
                            && this._parent.Crews.Remove(crewItem)))
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.WorkTask).Concat(this._parent.ScheduleSteps).Concat(this._parent.Interval).Concat(this._parent.Crews).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the reason property
        /// </summary>
        private sealed class ReasonProxy : ModelPropertyChange<ISwitchingSchedule, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ReasonProxy(ISwitchingSchedule modelElement) : 
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
                    return this.ModelElement.Reason;
                }
                set
                {
                    this.ModelElement.Reason = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ReasonChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ReasonChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the WorkTask property
        /// </summary>
        private sealed class WorkTaskProxy : ModelPropertyChange<ISwitchingSchedule, IWorkTask>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public WorkTaskProxy(ISwitchingSchedule modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IWorkTask Value
            {
                get
                {
                    return this.ModelElement.WorkTask;
                }
                set
                {
                    this.ModelElement.WorkTask = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.WorkTaskChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.WorkTaskChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the interval property
        /// </summary>
        private sealed class IntervalProxy : ModelPropertyChange<ISwitchingSchedule, IDateTimeInterval>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public IntervalProxy(ISwitchingSchedule modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IDateTimeInterval Value
            {
                get
                {
                    return this.ModelElement.Interval;
                }
                set
                {
                    this.ModelElement.Interval = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.IntervalChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.IntervalChanged -= handler;
            }
        }
    }
}
