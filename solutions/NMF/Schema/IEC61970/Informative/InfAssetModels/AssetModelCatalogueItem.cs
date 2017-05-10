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
using TTC2017.SmartGrids.CIM.IEC61968.Common;
using TTC2017.SmartGrids.CIM.IEC61968.Metering;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssetModels
{
    
    
    /// <summary>
    /// The default implementation of the AssetModelCatalogueItem class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfAssetModels")]
    [XmlNamespacePrefixAttribute("cimInfAssetModels")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssetModels/As" +
        "setModelCatalogueItem")]
    [DebuggerDisplayAttribute("AssetModelCatalogueItem {UUID}")]
    public partial class AssetModelCatalogueItem : Document, IAssetModelCatalogueItem, IModelElement
    {
        
        /// <summary>
        /// The backing field for the UnitCost property
        /// </summary>
        private float _unitCost;
        
        private static Lazy<ITypedElement> _unitCostAttribute = new Lazy<ITypedElement>(RetrieveUnitCostAttribute);
        
        private static Lazy<ITypedElement> _erpQuoteLineItemsReference = new Lazy<ITypedElement>(RetrieveErpQuoteLineItemsReference);
        
        /// <summary>
        /// The backing field for the ErpQuoteLineItems property
        /// </summary>
        private AssetModelCatalogueItemErpQuoteLineItemsCollection _erpQuoteLineItems;
        
        private static Lazy<ITypedElement> _assetModelCatalogueReference = new Lazy<ITypedElement>(RetrieveAssetModelCatalogueReference);
        
        /// <summary>
        /// The backing field for the AssetModelCatalogue property
        /// </summary>
        private IAssetModelCatalogue _assetModelCatalogue;
        
        private static Lazy<ITypedElement> _erpPOLineItemsReference = new Lazy<ITypedElement>(RetrieveErpPOLineItemsReference);
        
        /// <summary>
        /// The backing field for the ErpPOLineItems property
        /// </summary>
        private AssetModelCatalogueItemErpPOLineItemsCollection _erpPOLineItems;
        
        private static Lazy<ITypedElement> _assetModelReference = new Lazy<ITypedElement>(RetrieveAssetModelReference);
        
        /// <summary>
        /// The backing field for the AssetModel property
        /// </summary>
        private IAssetModel _assetModel;
        
        private static IClass _classInstance;
        
        public AssetModelCatalogueItem()
        {
            this._erpQuoteLineItems = new AssetModelCatalogueItemErpQuoteLineItemsCollection(this);
            this._erpQuoteLineItems.CollectionChanging += this.ErpQuoteLineItemsCollectionChanging;
            this._erpQuoteLineItems.CollectionChanged += this.ErpQuoteLineItemsCollectionChanged;
            this._erpPOLineItems = new AssetModelCatalogueItemErpPOLineItemsCollection(this);
            this._erpPOLineItems.CollectionChanging += this.ErpPOLineItemsCollectionChanging;
            this._erpPOLineItems.CollectionChanged += this.ErpPOLineItemsCollectionChanged;
        }
        
        /// <summary>
        /// The unitCost property
        /// </summary>
        [XmlElementNameAttribute("unitCost")]
        [XmlAttributeAttribute(true)]
        public virtual float UnitCost
        {
            get
            {
                return this._unitCost;
            }
            set
            {
                if ((this._unitCost != value))
                {
                    float old = this._unitCost;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnUnitCostChanging(e);
                    this.OnPropertyChanging("UnitCost", e, _unitCostAttribute);
                    this._unitCost = value;
                    this.OnUnitCostChanged(e);
                    this.OnPropertyChanged("UnitCost", e, _unitCostAttribute);
                }
            }
        }
        
        /// <summary>
        /// The ErpQuoteLineItems property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("AssetModelCatalogueItem")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IErpQuoteLineItem> ErpQuoteLineItems
        {
            get
            {
                return this._erpQuoteLineItems;
            }
        }
        
        /// <summary>
        /// The AssetModelCatalogue property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("AssetModelCatalogueItems")]
        public virtual IAssetModelCatalogue AssetModelCatalogue
        {
            get
            {
                return this._assetModelCatalogue;
            }
            set
            {
                if ((this._assetModelCatalogue != value))
                {
                    IAssetModelCatalogue old = this._assetModelCatalogue;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnAssetModelCatalogueChanging(e);
                    this.OnPropertyChanging("AssetModelCatalogue", e, _assetModelCatalogueReference);
                    this._assetModelCatalogue = value;
                    if ((old != null))
                    {
                        old.AssetModelCatalogueItems.Remove(this);
                        old.Deleted -= this.OnResetAssetModelCatalogue;
                    }
                    if ((value != null))
                    {
                        value.AssetModelCatalogueItems.Add(this);
                        value.Deleted += this.OnResetAssetModelCatalogue;
                    }
                    this.OnAssetModelCatalogueChanged(e);
                    this.OnPropertyChanged("AssetModelCatalogue", e, _assetModelCatalogueReference);
                }
            }
        }
        
        /// <summary>
        /// The ErpPOLineItems property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("AssetModelCatalogueItem")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IErpPOLineItem> ErpPOLineItems
        {
            get
            {
                return this._erpPOLineItems;
            }
        }
        
        /// <summary>
        /// The AssetModel property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("AssetModelCatalogueItems")]
        public virtual IAssetModel AssetModel
        {
            get
            {
                return this._assetModel;
            }
            set
            {
                if ((this._assetModel != value))
                {
                    IAssetModel old = this._assetModel;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnAssetModelChanging(e);
                    this.OnPropertyChanging("AssetModel", e, _assetModelReference);
                    this._assetModel = value;
                    if ((old != null))
                    {
                        old.AssetModelCatalogueItems.Remove(this);
                        old.Deleted -= this.OnResetAssetModel;
                    }
                    if ((value != null))
                    {
                        value.AssetModelCatalogueItems.Add(this);
                        value.Deleted += this.OnResetAssetModel;
                    }
                    this.OnAssetModelChanged(e);
                    this.OnPropertyChanged("AssetModel", e, _assetModelReference);
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
                return base.ReferencedElements.Concat(new AssetModelCatalogueItemReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssetModels/As" +
                            "setModelCatalogueItem")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the UnitCost property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> UnitCostChanging;
        
        /// <summary>
        /// Gets fired when the UnitCost property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> UnitCostChanged;
        
        /// <summary>
        /// Gets fired before the AssetModelCatalogue property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> AssetModelCatalogueChanging;
        
        /// <summary>
        /// Gets fired when the AssetModelCatalogue property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> AssetModelCatalogueChanged;
        
        /// <summary>
        /// Gets fired before the AssetModel property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> AssetModelChanging;
        
        /// <summary>
        /// Gets fired when the AssetModel property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> AssetModelChanged;
        
        private static ITypedElement RetrieveUnitCostAttribute()
        {
            return ((ITypedElement)(((ModelElement)(AssetModelCatalogueItem.ClassInstance)).Resolve("unitCost")));
        }
        
        /// <summary>
        /// Raises the UnitCostChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnUnitCostChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.UnitCostChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the UnitCostChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnUnitCostChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.UnitCostChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        private static ITypedElement RetrieveErpQuoteLineItemsReference()
        {
            return ((ITypedElement)(((ModelElement)(AssetModelCatalogueItem.ClassInstance)).Resolve("ErpQuoteLineItems")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the ErpQuoteLineItems property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ErpQuoteLineItemsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("ErpQuoteLineItems", e, _erpQuoteLineItemsReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the ErpQuoteLineItems property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ErpQuoteLineItemsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("ErpQuoteLineItems", e, _erpQuoteLineItemsReference);
        }
        
        private static ITypedElement RetrieveAssetModelCatalogueReference()
        {
            return ((ITypedElement)(((ModelElement)(AssetModelCatalogueItem.ClassInstance)).Resolve("AssetModelCatalogue")));
        }
        
        /// <summary>
        /// Raises the AssetModelCatalogueChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnAssetModelCatalogueChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.AssetModelCatalogueChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the AssetModelCatalogueChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnAssetModelCatalogueChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.AssetModelCatalogueChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the AssetModelCatalogue property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetAssetModelCatalogue(object sender, System.EventArgs eventArgs)
        {
            this.AssetModelCatalogue = null;
        }
        
        private static ITypedElement RetrieveErpPOLineItemsReference()
        {
            return ((ITypedElement)(((ModelElement)(AssetModelCatalogueItem.ClassInstance)).Resolve("ErpPOLineItems")));
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the ErpPOLineItems property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ErpPOLineItemsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("ErpPOLineItems", e, _erpPOLineItemsReference);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the ErpPOLineItems property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ErpPOLineItemsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("ErpPOLineItems", e, _erpPOLineItemsReference);
        }
        
        private static ITypedElement RetrieveAssetModelReference()
        {
            return ((ITypedElement)(((ModelElement)(AssetModelCatalogueItem.ClassInstance)).Resolve("AssetModel")));
        }
        
        /// <summary>
        /// Raises the AssetModelChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnAssetModelChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.AssetModelChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the AssetModelChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnAssetModelChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.AssetModelChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the AssetModel property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetAssetModel(object sender, System.EventArgs eventArgs)
        {
            this.AssetModel = null;
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "UNITCOST"))
            {
                return this.UnitCost;
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
            if ((feature == "ERPQUOTELINEITEMS"))
            {
                return this._erpQuoteLineItems;
            }
            if ((feature == "ERPPOLINEITEMS"))
            {
                return this._erpPOLineItems;
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
            if ((feature == "ASSETMODELCATALOGUE"))
            {
                this.AssetModelCatalogue = ((IAssetModelCatalogue)(value));
                return;
            }
            if ((feature == "ASSETMODEL"))
            {
                this.AssetModel = ((IAssetModel)(value));
                return;
            }
            if ((feature == "UNITCOST"))
            {
                this.UnitCost = ((float)(value));
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
            if ((attribute == "AssetModelCatalogue"))
            {
                return new AssetModelCatalogueProxy(this);
            }
            if ((attribute == "AssetModel"))
            {
                return new AssetModelProxy(this);
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
            if ((reference == "AssetModelCatalogue"))
            {
                return new AssetModelCatalogueProxy(this);
            }
            if ((reference == "AssetModel"))
            {
                return new AssetModelProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssetModels/As" +
                        "setModelCatalogueItem")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the AssetModelCatalogueItem class
        /// </summary>
        public class AssetModelCatalogueItemReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private AssetModelCatalogueItem _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public AssetModelCatalogueItemReferencedElementsCollection(AssetModelCatalogueItem parent)
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
                    count = (count + this._parent.ErpQuoteLineItems.Count);
                    if ((this._parent.AssetModelCatalogue != null))
                    {
                        count = (count + 1);
                    }
                    count = (count + this._parent.ErpPOLineItems.Count);
                    if ((this._parent.AssetModel != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.ErpQuoteLineItems.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.AssetModelCatalogueChanged += this.PropagateValueChanges;
                this._parent.ErpPOLineItems.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.AssetModelChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.ErpQuoteLineItems.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.AssetModelCatalogueChanged -= this.PropagateValueChanges;
                this._parent.ErpPOLineItems.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.AssetModelChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IErpQuoteLineItem erpQuoteLineItemsCasted = item.As<IErpQuoteLineItem>();
                if ((erpQuoteLineItemsCasted != null))
                {
                    this._parent.ErpQuoteLineItems.Add(erpQuoteLineItemsCasted);
                }
                if ((this._parent.AssetModelCatalogue == null))
                {
                    IAssetModelCatalogue assetModelCatalogueCasted = item.As<IAssetModelCatalogue>();
                    if ((assetModelCatalogueCasted != null))
                    {
                        this._parent.AssetModelCatalogue = assetModelCatalogueCasted;
                        return;
                    }
                }
                IErpPOLineItem erpPOLineItemsCasted = item.As<IErpPOLineItem>();
                if ((erpPOLineItemsCasted != null))
                {
                    this._parent.ErpPOLineItems.Add(erpPOLineItemsCasted);
                }
                if ((this._parent.AssetModel == null))
                {
                    IAssetModel assetModelCasted = item.As<IAssetModel>();
                    if ((assetModelCasted != null))
                    {
                        this._parent.AssetModel = assetModelCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.ErpQuoteLineItems.Clear();
                this._parent.AssetModelCatalogue = null;
                this._parent.ErpPOLineItems.Clear();
                this._parent.AssetModel = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.ErpQuoteLineItems.Contains(item))
                {
                    return true;
                }
                if ((item == this._parent.AssetModelCatalogue))
                {
                    return true;
                }
                if (this._parent.ErpPOLineItems.Contains(item))
                {
                    return true;
                }
                if ((item == this._parent.AssetModel))
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
                IEnumerator<IModelElement> erpQuoteLineItemsEnumerator = this._parent.ErpQuoteLineItems.GetEnumerator();
                try
                {
                    for (
                    ; erpQuoteLineItemsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = erpQuoteLineItemsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    erpQuoteLineItemsEnumerator.Dispose();
                }
                if ((this._parent.AssetModelCatalogue != null))
                {
                    array[arrayIndex] = this._parent.AssetModelCatalogue;
                    arrayIndex = (arrayIndex + 1);
                }
                IEnumerator<IModelElement> erpPOLineItemsEnumerator = this._parent.ErpPOLineItems.GetEnumerator();
                try
                {
                    for (
                    ; erpPOLineItemsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = erpPOLineItemsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    erpPOLineItemsEnumerator.Dispose();
                }
                if ((this._parent.AssetModel != null))
                {
                    array[arrayIndex] = this._parent.AssetModel;
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
                IErpQuoteLineItem erpQuoteLineItemItem = item.As<IErpQuoteLineItem>();
                if (((erpQuoteLineItemItem != null) 
                            && this._parent.ErpQuoteLineItems.Remove(erpQuoteLineItemItem)))
                {
                    return true;
                }
                if ((this._parent.AssetModelCatalogue == item))
                {
                    this._parent.AssetModelCatalogue = null;
                    return true;
                }
                IErpPOLineItem erpPOLineItemItem = item.As<IErpPOLineItem>();
                if (((erpPOLineItemItem != null) 
                            && this._parent.ErpPOLineItems.Remove(erpPOLineItemItem)))
                {
                    return true;
                }
                if ((this._parent.AssetModel == item))
                {
                    this._parent.AssetModel = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.ErpQuoteLineItems).Concat(this._parent.AssetModelCatalogue).Concat(this._parent.ErpPOLineItems).Concat(this._parent.AssetModel).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the unitCost property
        /// </summary>
        private sealed class UnitCostProxy : ModelPropertyChange<IAssetModelCatalogueItem, float>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public UnitCostProxy(IAssetModelCatalogueItem modelElement) : 
                    base(modelElement, "unitCost")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override float Value
            {
                get
                {
                    return this.ModelElement.UnitCost;
                }
                set
                {
                    this.ModelElement.UnitCost = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the AssetModelCatalogue property
        /// </summary>
        private sealed class AssetModelCatalogueProxy : ModelPropertyChange<IAssetModelCatalogueItem, IAssetModelCatalogue>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public AssetModelCatalogueProxy(IAssetModelCatalogueItem modelElement) : 
                    base(modelElement, "AssetModelCatalogue")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IAssetModelCatalogue Value
            {
                get
                {
                    return this.ModelElement.AssetModelCatalogue;
                }
                set
                {
                    this.ModelElement.AssetModelCatalogue = value;
                }
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the AssetModel property
        /// </summary>
        private sealed class AssetModelProxy : ModelPropertyChange<IAssetModelCatalogueItem, IAssetModel>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public AssetModelProxy(IAssetModelCatalogueItem modelElement) : 
                    base(modelElement, "AssetModel")
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IAssetModel Value
            {
                get
                {
                    return this.ModelElement.AssetModel;
                }
                set
                {
                    this.ModelElement.AssetModel = value;
                }
            }
        }
    }
}
