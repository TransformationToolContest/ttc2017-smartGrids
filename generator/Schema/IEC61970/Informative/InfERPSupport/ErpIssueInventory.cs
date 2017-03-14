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
using TTC2017.SmartGrids.CIM.IEC61968.Customers;
using TTC2017.SmartGrids.CIM.IEC61968.Work;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.Financial;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssetModels;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfAssets;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCommon;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfCustomers;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfLocations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfTypeAsset;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfWork;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport
{
    
    
    /// <summary>
    /// The default implementation of the ErpIssueInventory class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfERPSupport")]
    [XmlNamespacePrefixAttribute("cimInfERPSupport")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfERPSupport/Erp" +
        "IssueInventory")]
    [DebuggerDisplayAttribute("ErpIssueInventory {UUID}")]
    public class ErpIssueInventory : IdentifiedObject, IErpIssueInventory, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Status property
        /// </summary>
        private IStatus _status;
        
        /// <summary>
        /// The backing field for the TypeMaterial property
        /// </summary>
        private ITypeMaterial _typeMaterial;
        
        /// <summary>
        /// The backing field for the TypeAsset property
        /// </summary>
        private ITypeAsset _typeAsset;
        
        private static IClass _classInstance;
        
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
        /// The TypeMaterial property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("ErpIssueInventories")]
        public virtual ITypeMaterial TypeMaterial
        {
            get
            {
                return this._typeMaterial;
            }
            set
            {
                if ((this._typeMaterial != value))
                {
                    ITypeMaterial old = this._typeMaterial;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnTypeMaterialChanging(e);
                    this.OnPropertyChanging("TypeMaterial", e);
                    this._typeMaterial = value;
                    if ((old != null))
                    {
                        old.ErpIssueInventories.Remove(this);
                        old.Deleted -= this.OnResetTypeMaterial;
                    }
                    if ((value != null))
                    {
                        value.ErpIssueInventories.Add(this);
                        value.Deleted += this.OnResetTypeMaterial;
                    }
                    this.OnTypeMaterialChanged(e);
                    this.OnPropertyChanged("TypeMaterial", e);
                }
            }
        }
        
        /// <summary>
        /// The TypeAsset property
        /// </summary>
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("ErpInventoryIssues")]
        public virtual ITypeAsset TypeAsset
        {
            get
            {
                return this._typeAsset;
            }
            set
            {
                if ((this._typeAsset != value))
                {
                    ITypeAsset old = this._typeAsset;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnTypeAssetChanging(e);
                    this.OnPropertyChanging("TypeAsset", e);
                    this._typeAsset = value;
                    if ((old != null))
                    {
                        old.ErpInventoryIssues.Remove(this);
                        old.Deleted -= this.OnResetTypeAsset;
                    }
                    if ((value != null))
                    {
                        value.ErpInventoryIssues.Add(this);
                        value.Deleted += this.OnResetTypeAsset;
                    }
                    this.OnTypeAssetChanged(e);
                    this.OnPropertyChanged("TypeAsset", e);
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
                return base.ReferencedElements.Concat(new ErpIssueInventoryReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfERPSupport/Erp" +
                            "IssueInventory")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the Status property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StatusChanging;
        
        /// <summary>
        /// Gets fired when the Status property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> StatusChanged;
        
        /// <summary>
        /// Gets fired before the TypeMaterial property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TypeMaterialChanging;
        
        /// <summary>
        /// Gets fired when the TypeMaterial property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TypeMaterialChanged;
        
        /// <summary>
        /// Gets fired before the TypeAsset property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TypeAssetChanging;
        
        /// <summary>
        /// Gets fired when the TypeAsset property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> TypeAssetChanged;
        
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
        /// Raises the TypeMaterialChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTypeMaterialChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TypeMaterialChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the TypeMaterialChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTypeMaterialChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TypeMaterialChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the TypeMaterial property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetTypeMaterial(object sender, System.EventArgs eventArgs)
        {
            this.TypeMaterial = null;
        }
        
        /// <summary>
        /// Raises the TypeAssetChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTypeAssetChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TypeAssetChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the TypeAssetChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTypeAssetChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.TypeAssetChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the TypeAsset property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetTypeAsset(object sender, System.EventArgs eventArgs)
        {
            this.TypeAsset = null;
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "STATUS"))
            {
                this.Status = ((IStatus)(value));
                return;
            }
            if ((feature == "TYPEMATERIAL"))
            {
                this.TypeMaterial = ((ITypeMaterial)(value));
                return;
            }
            if ((feature == "TYPEASSET"))
            {
                this.TypeAsset = ((ITypeAsset)(value));
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
            if ((attribute == "Status"))
            {
                return new StatusProxy(this);
            }
            if ((attribute == "TypeMaterial"))
            {
                return new TypeMaterialProxy(this);
            }
            if ((attribute == "TypeAsset"))
            {
                return new TypeAssetProxy(this);
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
            if ((reference == "Status"))
            {
                return new StatusProxy(this);
            }
            if ((reference == "TypeMaterial"))
            {
                return new TypeMaterialProxy(this);
            }
            if ((reference == "TypeAsset"))
            {
                return new TypeAssetProxy(this);
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfERPSupport/Erp" +
                        "IssueInventory")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the ErpIssueInventory class
        /// </summary>
        public class ErpIssueInventoryReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private ErpIssueInventory _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public ErpIssueInventoryReferencedElementsCollection(ErpIssueInventory parent)
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
                    if ((this._parent.Status != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.TypeMaterial != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.TypeAsset != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.StatusChanged += this.PropagateValueChanges;
                this._parent.TypeMaterialChanged += this.PropagateValueChanges;
                this._parent.TypeAssetChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.StatusChanged -= this.PropagateValueChanges;
                this._parent.TypeMaterialChanged -= this.PropagateValueChanges;
                this._parent.TypeAssetChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.Status == null))
                {
                    IStatus statusCasted = item.As<IStatus>();
                    if ((statusCasted != null))
                    {
                        this._parent.Status = statusCasted;
                        return;
                    }
                }
                if ((this._parent.TypeMaterial == null))
                {
                    ITypeMaterial typeMaterialCasted = item.As<ITypeMaterial>();
                    if ((typeMaterialCasted != null))
                    {
                        this._parent.TypeMaterial = typeMaterialCasted;
                        return;
                    }
                }
                if ((this._parent.TypeAsset == null))
                {
                    ITypeAsset typeAssetCasted = item.As<ITypeAsset>();
                    if ((typeAssetCasted != null))
                    {
                        this._parent.TypeAsset = typeAssetCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Status = null;
                this._parent.TypeMaterial = null;
                this._parent.TypeAsset = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.Status))
                {
                    return true;
                }
                if ((item == this._parent.TypeMaterial))
                {
                    return true;
                }
                if ((item == this._parent.TypeAsset))
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
                if ((this._parent.Status != null))
                {
                    array[arrayIndex] = this._parent.Status;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.TypeMaterial != null))
                {
                    array[arrayIndex] = this._parent.TypeMaterial;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.TypeAsset != null))
                {
                    array[arrayIndex] = this._parent.TypeAsset;
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
                if ((this._parent.Status == item))
                {
                    this._parent.Status = null;
                    return true;
                }
                if ((this._parent.TypeMaterial == item))
                {
                    this._parent.TypeMaterial = null;
                    return true;
                }
                if ((this._parent.TypeAsset == item))
                {
                    this._parent.TypeAsset = null;
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Status).Concat(this._parent.TypeMaterial).Concat(this._parent.TypeAsset).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the status property
        /// </summary>
        private sealed class StatusProxy : ModelPropertyChange<IErpIssueInventory, IStatus>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public StatusProxy(IErpIssueInventory modelElement) : 
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
        /// Represents a proxy to represent an incremental access to the TypeMaterial property
        /// </summary>
        private sealed class TypeMaterialProxy : ModelPropertyChange<IErpIssueInventory, ITypeMaterial>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public TypeMaterialProxy(IErpIssueInventory modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ITypeMaterial Value
            {
                get
                {
                    return this.ModelElement.TypeMaterial;
                }
                set
                {
                    this.ModelElement.TypeMaterial = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TypeMaterialChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TypeMaterialChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the TypeAsset property
        /// </summary>
        private sealed class TypeAssetProxy : ModelPropertyChange<IErpIssueInventory, ITypeAsset>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public TypeAssetProxy(IErpIssueInventory modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override ITypeAsset Value
            {
                get
                {
                    return this.ModelElement.TypeAsset;
                }
                set
                {
                    this.ModelElement.TypeAsset = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TypeAssetChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TypeAssetChanged -= handler;
            }
        }
    }
}
