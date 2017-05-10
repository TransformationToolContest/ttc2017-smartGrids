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
using TTC2017.SmartGrids.SubstationStandard.Enumerations;

namespace TTC2017.SmartGrids.SubstationStandard.Dataclasses
{
    
    
    /// <summary>
    /// The default implementation of the SPC class
    /// </summary>
    [XmlNamespaceAttribute("http://www.transformation-tool-contest.eu/2017/smartGrids/dataclasses")]
    [XmlNamespacePrefixAttribute("data")]
    [ModelRepresentationClassAttribute("http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard#//Da" +
        "taclasses/SPC")]
    public partial class SPC : ModelElement, ISPC, IModelElement
    {
        
        /// <summary>
        /// The backing field for the CtlVal property
        /// </summary>
        private Nullable<bool> _ctlVal;
        
        private static Lazy<ITypedElement> _ctlValAttribute = new Lazy<ITypedElement>(RetrieveCtlValAttribute);
        
        /// <summary>
        /// The backing field for the StVal property
        /// </summary>
        private Nullable<bool> _stVal;
        
        private static Lazy<ITypedElement> _stValAttribute = new Lazy<ITypedElement>(RetrieveStValAttribute);
        
        /// <summary>
        /// The backing field for the SubVal property
        /// </summary>
        private Nullable<bool> _subVal;
        
        private static Lazy<ITypedElement> _subValAttribute = new Lazy<ITypedElement>(RetrieveSubValAttribute);
        
        private static Lazy<ITypedElement> _qReference = new Lazy<ITypedElement>(RetrieveQReference);
        
        /// <summary>
        /// The backing field for the Q property
        /// </summary>
        private IQuality _q;
        
        private static Lazy<ITypedElement> _tReference = new Lazy<ITypedElement>(RetrieveTReference);
        
        /// <summary>
        /// The backing field for the T property
        /// </summary>
        private ITimeStamp _t;
        
        private static Lazy<ITypedElement> _pulseConfigReference = new Lazy<ITypedElement>(RetrievePulseConfigReference);
        
        /// <summary>
        /// The backing field for the PulseConfig property
        /// </summary>
        private IPulseConfig _pulseConfig;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The ctlVal property
        /// </summary>
        [XmlElementNameAttribute("ctlVal")]
        [XmlAttributeAttribute(true)]
        public virtual Nullable<bool> CtlVal
        {
            get
            {
                return this._ctlVal;
            }
            set
            {
                if ((this._ctlVal != value))
                {
                    Nullable<bool> old = this._ctlVal;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnCtlValChanging(e);
                    this.OnPropertyChanging("CtlVal", e, _ctlValAttribute);
                    this._ctlVal = value;
                    this.OnCtlValChanged(e);
                    this.OnPropertyChanged("CtlVal", e, _ctlValAttribute);
                }
            }
        }
        
        /// <summary>
        /// The stVal property
        /// </summary>
        [XmlElementNameAttribute("stVal")]
        [XmlAttributeAttribute(true)]
        public virtual Nullable<bool> StVal
        {
            get
            {
                return this._stVal;
            }
            set
            {
                if ((this._stVal != value))
                {
                    Nullable<bool> old = this._stVal;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnStValChanging(e);
                    this.OnPropertyChanging("StVal", e, _stValAttribute);
                    this._stVal = value;
                    this.OnStValChanged(e);
                    this.OnPropertyChanged("StVal", e, _stValAttribute);
                }
            }
        }
        
        /// <summary>
        /// The subVal property
        /// </summary>
        [XmlElementNameAttribute("subVal")]
        [XmlAttributeAttribute(true)]
        public virtual Nullable<bool> SubVal
        {
            get
            {
                return this._subVal;
            }
            set
            {
                if ((this._subVal != value))
                {
                    Nullable<bool> old = this._subVal;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnSubValChanging(e);
                    this.OnPropertyChanging("SubVal", e, _subValAttribute);
                    this._subVal = value;
                    this.OnSubValChanged(e);
                    this.OnPropertyChanged("SubVal", e, _subValAttribute);
                }
            }
        }
        
        /// <summary>
        /// The q property
        /// </summary>
        [XmlElementNameAttribute("q")]
        [XmlAttributeAttribute(true)]
        public virtual IQuality Q
        {
            get
            {
                return this._q;
            }
            set
            {
                if ((this._q != value))
                {
                    IQuality old = this._q;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnQChanging(e);
                    this.OnPropertyChanging("Q", e, _qReference);
                    this._q = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetQ;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetQ;
                    }
                    this.OnQChanged(e);
                    this.OnPropertyChanged("Q", e, _qReference);
                }
            }
        }
        
        /// <summary>
        /// The t property
        /// </summary>
        [XmlElementNameAttribute("t")]
        [XmlAttributeAttribute(true)]
        public virtual ITimeStamp T
        {
            get
            {
                return this._t;
            }
            set
            {
                if ((this._t != value))
                {
                    ITimeStamp old = this._t;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnTChanging(e);
                    this.OnPropertyChanging("T", e, _tReference);
                    this._t = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetT;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetT;
                    }
                    this.OnTChanged(e);
                    this.OnPropertyChanged("T", e, _tReference);
                }
            }
        }
        
        /// <summary>
        /// The pulseConfig property
        /// </summary>
        [XmlElementNameAttribute("pulseConfig")]
        [XmlAttributeAttribute(true)]
        public virtual IPulseConfig PulseConfig
        {
            get
            {
                return this._pulseConfig;
            }
            set
            {
                if ((this._pulseConfig != value))
                {
                    IPulseConfig old = this._pulseConfig;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnPulseConfigChanging(e);
                    this.OnPropertyChanging("PulseConfig", e, _pulseConfigReference);
                    this._pulseConfig = value;
                    if ((old != null))
                    {
                        old.Deleted -= this.OnResetPulseConfig;
                    }
                    if ((value != null))
                    {
                        value.Deleted += this.OnResetPulseConfig;
                    }
                    this.OnPulseConfigChanged(e);
                    this.OnPropertyChanged("PulseConfig", e, _pulseConfigReference);
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
                return base.ReferencedElements.Concat(new SPCReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard#//Da" +
                            "taclasses/SPC")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the CtlVal property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CtlValChanging;
        
        /// <summary>
        /// Gets fired when the CtlVal property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> CtlValChanged;
        
        /// <summary>
        /// Gets fired before the StVal property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StValChanging;
        
        /// <summary>
        /// Gets fired when the StVal property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StValChanged;
        
        /// <summary>
        /// Gets fired before the SubVal property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> SubValChanging;
        
        /// <summary>
        /// Gets fired when the SubVal property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> SubValChanged;
        
        /// <summary>
        /// Gets fired before the Q property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> QChanging;
        
        /// <summary>
        /// Gets fired when the Q property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> QChanged;
        
        /// <summary>
        /// Gets fired before the T property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TChanging;
        
        /// <summary>
        /// Gets fired when the T property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TChanged;
        
        /// <summary>
        /// Gets fired before the PulseConfig property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> PulseConfigChanging;
        
        /// <summary>
        /// Gets fired when the PulseConfig property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> PulseConfigChanged;
        
        private static ITypedElement RetrieveCtlValAttribute()
        {
            return ((ITypedElement)(((ModelElement)(SPC.ClassInstance)).Resolve("ctlVal")));
        }
        
        /// <summary>
        /// Raises the CtlValChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCtlValChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CtlValChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the CtlValChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnCtlValChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.CtlValChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveStValAttribute()
        {
            return ((ITypedElement)(((ModelElement)(SPC.ClassInstance)).Resolve("stVal")));
        }
        
        /// <summary>
        /// Raises the StValChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStValChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StValChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the StValChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnStValChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.StValChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveSubValAttribute()
        {
            return ((ITypedElement)(((ModelElement)(SPC.ClassInstance)).Resolve("subVal")));
        }
        
        /// <summary>
        /// Raises the SubValChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnSubValChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.SubValChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the SubValChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnSubValChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.SubValChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveQReference()
        {
            return ((ITypedElement)(((ModelElement)(SPC.ClassInstance)).Resolve("q")));
        }
        
        /// <summary>
        /// Raises the QChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnQChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.QChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the QChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnQChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.QChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the Q property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetQ(object sender, System.EventArgs eventArgs)
        {
            this.Q = null;
        }
        
        private static ITypedElement RetrieveTReference()
        {
            return ((ITypedElement)(((ModelElement)(SPC.ClassInstance)).Resolve("t")));
        }
        
        /// <summary>
        /// Raises the TChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the TChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the T property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetT(object sender, System.EventArgs eventArgs)
        {
            this.T = null;
        }
        
        private static ITypedElement RetrievePulseConfigReference()
        {
            return ((ITypedElement)(((ModelElement)(SPC.ClassInstance)).Resolve("pulseConfig")));
        }
        
        /// <summary>
        /// Raises the PulseConfigChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPulseConfigChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.PulseConfigChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the PulseConfigChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPulseConfigChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.PulseConfigChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the PulseConfig property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetPulseConfig(object sender, System.EventArgs eventArgs)
        {
            this.PulseConfig = null;
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "CTLVAL"))
            {
                return this.CtlVal;
            }
            if ((attribute == "STVAL"))
            {
                return this.StVal;
            }
            if ((attribute == "SUBVAL"))
            {
                return this.SubVal;
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
            if ((feature == "Q"))
            {
                this.Q = ((IQuality)(value));
                return;
            }
            if ((feature == "T"))
            {
                this.T = ((ITimeStamp)(value));
                return;
            }
            if ((feature == "PULSECONFIG"))
            {
                this.PulseConfig = ((IPulseConfig)(value));
                return;
            }
            if ((feature == "CTLVAL"))
            {
                this.CtlVal = ((bool)(value));
                return;
            }
            if ((feature == "STVAL"))
            {
                this.StVal = ((bool)(value));
                return;
            }
            if ((feature == "SUBVAL"))
            {
                this.SubVal = ((bool)(value));
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
            if ((attribute == "Q"))
            {
                return new QProxy(this);
            }
            if ((attribute == "T"))
            {
                return new TProxy(this);
            }
            if ((attribute == "PulseConfig"))
            {
                return new PulseConfigProxy(this);
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
            if ((reference == "Q"))
            {
                return new QProxy(this);
            }
            if ((reference == "T"))
            {
                return new TProxy(this);
            }
            if ((reference == "PulseConfig"))
            {
                return new PulseConfigProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard#//Da" +
                        "taclasses/SPC")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the SPC class
        /// </summary>
        public class SPCReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private SPC _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public SPCReferencedElementsCollection(SPC parent)
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
                    if ((this._parent.Q != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.T != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.PulseConfig != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.QChanged += this.PropagateValueChanges;
                this._parent.TChanged += this.PropagateValueChanges;
                this._parent.PulseConfigChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.QChanged -= this.PropagateValueChanges;
                this._parent.TChanged -= this.PropagateValueChanges;
                this._parent.PulseConfigChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.Q == null))
                {
                    IQuality qCasted = item.As<IQuality>();
                    if ((qCasted != null))
                    {
                        this._parent.Q = qCasted;
                        return;
                    }
                }
                if ((this._parent.T == null))
                {
                    ITimeStamp tCasted = item.As<ITimeStamp>();
                    if ((tCasted != null))
                    {
                        this._parent.T = tCasted;
                        return;
                    }
                }
                if ((this._parent.PulseConfig == null))
                {
                    IPulseConfig pulseConfigCasted = item.As<IPulseConfig>();
                    if ((pulseConfigCasted != null))
                    {
                        this._parent.PulseConfig = pulseConfigCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Q = null;
                this._parent.T = null;
                this._parent.PulseConfig = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.Q))
                {
                    return true;
                }
                if ((item == this._parent.T))
                {
                    return true;
                }
                if ((item == this._parent.PulseConfig))
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
                if ((this._parent.Q != null))
                {
                    array[arrayIndex] = this._parent.Q;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.T != null))
                {
                    array[arrayIndex] = this._parent.T;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.PulseConfig != null))
                {
                    array[arrayIndex] = this._parent.PulseConfig;
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
                if ((this._parent.Q == item))
                {
                    this._parent.Q = null;
                    return true;
                }
                if ((this._parent.T == item))
                {
                    this._parent.T = null;
                    return true;
                }
                if ((this._parent.PulseConfig == item))
                {
                    this._parent.PulseConfig = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Q).Concat(this._parent.T).Concat(this._parent.PulseConfig).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the ctlVal property
        /// </summary>
        private sealed class CtlValProxy : ModelPropertyChange<ISPC, Nullable<bool>>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public CtlValProxy(ISPC modelElement) : 
                    base(modelElement, "ctlVal")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override Nullable<bool> Value
            {
                get
                {
                    return this.ModelElement.CtlVal;
                }
                set
                {
                    this.ModelElement.CtlVal = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the stVal property
        /// </summary>
        private sealed class StValProxy : ModelPropertyChange<ISPC, Nullable<bool>>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public StValProxy(ISPC modelElement) : 
                    base(modelElement, "stVal")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override Nullable<bool> Value
            {
                get
                {
                    return this.ModelElement.StVal;
                }
                set
                {
                    this.ModelElement.StVal = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the subVal property
        /// </summary>
        private sealed class SubValProxy : ModelPropertyChange<ISPC, Nullable<bool>>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public SubValProxy(ISPC modelElement) : 
                    base(modelElement, "subVal")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override Nullable<bool> Value
            {
                get
                {
                    return this.ModelElement.SubVal;
                }
                set
                {
                    this.ModelElement.SubVal = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the q property
        /// </summary>
        private sealed class QProxy : ModelPropertyChange<ISPC, IQuality>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public QProxy(ISPC modelElement) : 
                    base(modelElement, "q")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IQuality Value
            {
                get
                {
                    return this.ModelElement.Q;
                }
                set
                {
                    this.ModelElement.Q = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the t property
        /// </summary>
        private sealed class TProxy : ModelPropertyChange<ISPC, ITimeStamp>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public TProxy(ISPC modelElement) : 
                    base(modelElement, "t")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ITimeStamp Value
            {
                get
                {
                    return this.ModelElement.T;
                }
                set
                {
                    this.ModelElement.T = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the pulseConfig property
        /// </summary>
        private sealed class PulseConfigProxy : ModelPropertyChange<ISPC, IPulseConfig>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public PulseConfigProxy(ISPC modelElement) : 
                    base(modelElement, "pulseConfig")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IPulseConfig Value
            {
                get
                {
                    return this.ModelElement.PulseConfig;
                }
                set
                {
                    this.ModelElement.PulseConfig = value;
                }
            }
        }
    }
}
