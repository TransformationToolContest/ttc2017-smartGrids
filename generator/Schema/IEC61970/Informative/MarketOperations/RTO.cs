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
using TTC2017.SmartGrids.CIM.IEC61968.Common;
using TTC2017.SmartGrids.CIM.IEC61970.Contingency;
using TTC2017.SmartGrids.CIM.IEC61970.Core;
using TTC2017.SmartGrids.CIM.IEC61970.Generation.Production;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.EnergyScheduling;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.Financial;
using TTC2017.SmartGrids.CIM.IEC61970.Informative.InfERPSupport;
using TTC2017.SmartGrids.CIM.IEC61970.LoadModel;
using TTC2017.SmartGrids.CIM.IEC61970.Meas;
using TTC2017.SmartGrids.CIM.IEC61970.Wires;

namespace TTC2017.SmartGrids.CIM.IEC61970.Informative.MarketOperations
{
    
    
    /// <summary>
    /// The default implementation of the RTO class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#MarketOperations")]
    [XmlNamespacePrefixAttribute("cimMarketOperations")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/MarketOperations/" +
        "RTO")]
    [DebuggerDisplayAttribute("RTO {UUID}")]
    public class RTO : ErpOrganisation, IRTO, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Markets property
        /// </summary>
        private RTOMarketsCollection _markets;
        
        /// <summary>
        /// The backing field for the SecurityConstraints property
        /// </summary>
        private RTOSecurityConstraintsCollection _securityConstraints;
        
        /// <summary>
        /// The backing field for the ResourceGroupReqs property
        /// </summary>
        private RTOResourceGroupReqsCollection _resourceGroupReqs;
        
        /// <summary>
        /// The backing field for the SecurityConstraintsLinear property
        /// </summary>
        private RTOSecurityConstraintsLinearCollection _securityConstraintsLinear;
        
        /// <summary>
        /// The backing field for the Pnodes property
        /// </summary>
        private RTOPnodesCollection _pnodes;
        
        private static IClass _classInstance;
        
        public RTO()
        {
            this._markets = new RTOMarketsCollection(this);
            this._markets.CollectionChanging += this.MarketsCollectionChanging;
            this._markets.CollectionChanged += this.MarketsCollectionChanged;
            this._securityConstraints = new RTOSecurityConstraintsCollection(this);
            this._securityConstraints.CollectionChanging += this.SecurityConstraintsCollectionChanging;
            this._securityConstraints.CollectionChanged += this.SecurityConstraintsCollectionChanged;
            this._resourceGroupReqs = new RTOResourceGroupReqsCollection(this);
            this._resourceGroupReqs.CollectionChanging += this.ResourceGroupReqsCollectionChanging;
            this._resourceGroupReqs.CollectionChanged += this.ResourceGroupReqsCollectionChanged;
            this._securityConstraintsLinear = new RTOSecurityConstraintsLinearCollection(this);
            this._securityConstraintsLinear.CollectionChanging += this.SecurityConstraintsLinearCollectionChanging;
            this._securityConstraintsLinear.CollectionChanged += this.SecurityConstraintsLinearCollectionChanged;
            this._pnodes = new RTOPnodesCollection(this);
            this._pnodes.CollectionChanging += this.PnodesCollectionChanging;
            this._pnodes.CollectionChanged += this.PnodesCollectionChanged;
        }
        
        /// <summary>
        /// The Markets property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("RTO")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IMarket> Markets
        {
            get
            {
                return this._markets;
            }
        }
        
        /// <summary>
        /// The SecurityConstraints property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("RTO")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ISecurityConstraints> SecurityConstraints
        {
            get
            {
                return this._securityConstraints;
            }
        }
        
        /// <summary>
        /// The ResourceGroupReqs property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("RTOs")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IResourceGroupReq> ResourceGroupReqs
        {
            get
            {
                return this._resourceGroupReqs;
            }
        }
        
        /// <summary>
        /// The SecurityConstraintsLinear property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("RTO")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<ISecurityConstraintSum> SecurityConstraintsLinear
        {
            get
            {
                return this._securityConstraintsLinear;
            }
        }
        
        /// <summary>
        /// The Pnodes property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("RTO")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IPnode> Pnodes
        {
            get
            {
                return this._pnodes;
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new RTOReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/MarketOperations/" +
                            "RTO")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Markets property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void MarketsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("Markets", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Markets property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void MarketsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Markets", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the SecurityConstraints property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SecurityConstraintsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("SecurityConstraints", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the SecurityConstraints property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SecurityConstraintsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("SecurityConstraints", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the ResourceGroupReqs property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ResourceGroupReqsCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("ResourceGroupReqs", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the ResourceGroupReqs property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ResourceGroupReqsCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("ResourceGroupReqs", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the SecurityConstraintsLinear property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SecurityConstraintsLinearCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("SecurityConstraintsLinear", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the SecurityConstraintsLinear property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void SecurityConstraintsLinearCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("SecurityConstraintsLinear", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the Pnodes property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void PnodesCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("Pnodes", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the Pnodes property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void PnodesCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("Pnodes", e);
        }
        
        /// <summary>
        /// Gets the Model element collection for the given feature
        /// </summary>
        /// <returns>A non-generic list of elements</returns>
        /// <param name="feature">The requested feature</param>
        protected override System.Collections.IList GetCollectionForFeature(string feature)
        {
            if ((feature == "MARKETS"))
            {
                return this._markets;
            }
            if ((feature == "SECURITYCONSTRAINTS"))
            {
                return this._securityConstraints;
            }
            if ((feature == "RESOURCEGROUPREQS"))
            {
                return this._resourceGroupReqs;
            }
            if ((feature == "SECURITYCONSTRAINTSLINEAR"))
            {
                return this._securityConstraintsLinear;
            }
            if ((feature == "PNODES"))
            {
                return this._pnodes;
            }
            return base.GetCollectionForFeature(feature);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/MarketOperations/" +
                        "RTO")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the RTO class
        /// </summary>
        public class RTOReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private RTO _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public RTOReferencedElementsCollection(RTO parent)
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
                    count = (count + this._parent.Markets.Count);
                    count = (count + this._parent.SecurityConstraints.Count);
                    count = (count + this._parent.ResourceGroupReqs.Count);
                    count = (count + this._parent.SecurityConstraintsLinear.Count);
                    count = (count + this._parent.Pnodes.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.Markets.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.SecurityConstraints.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.ResourceGroupReqs.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.SecurityConstraintsLinear.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
                this._parent.Pnodes.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.Markets.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.SecurityConstraints.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.ResourceGroupReqs.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.SecurityConstraintsLinear.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
                this._parent.Pnodes.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IMarket marketsCasted = item.As<IMarket>();
                if ((marketsCasted != null))
                {
                    this._parent.Markets.Add(marketsCasted);
                }
                ISecurityConstraints securityConstraintsCasted = item.As<ISecurityConstraints>();
                if ((securityConstraintsCasted != null))
                {
                    this._parent.SecurityConstraints.Add(securityConstraintsCasted);
                }
                IResourceGroupReq resourceGroupReqsCasted = item.As<IResourceGroupReq>();
                if ((resourceGroupReqsCasted != null))
                {
                    this._parent.ResourceGroupReqs.Add(resourceGroupReqsCasted);
                }
                ISecurityConstraintSum securityConstraintsLinearCasted = item.As<ISecurityConstraintSum>();
                if ((securityConstraintsLinearCasted != null))
                {
                    this._parent.SecurityConstraintsLinear.Add(securityConstraintsLinearCasted);
                }
                IPnode pnodesCasted = item.As<IPnode>();
                if ((pnodesCasted != null))
                {
                    this._parent.Pnodes.Add(pnodesCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Markets.Clear();
                this._parent.SecurityConstraints.Clear();
                this._parent.ResourceGroupReqs.Clear();
                this._parent.SecurityConstraintsLinear.Clear();
                this._parent.Pnodes.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.Markets.Contains(item))
                {
                    return true;
                }
                if (this._parent.SecurityConstraints.Contains(item))
                {
                    return true;
                }
                if (this._parent.ResourceGroupReqs.Contains(item))
                {
                    return true;
                }
                if (this._parent.SecurityConstraintsLinear.Contains(item))
                {
                    return true;
                }
                if (this._parent.Pnodes.Contains(item))
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
                IEnumerator<IModelElement> marketsEnumerator = this._parent.Markets.GetEnumerator();
                try
                {
                    for (
                    ; marketsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = marketsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    marketsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> securityConstraintsEnumerator = this._parent.SecurityConstraints.GetEnumerator();
                try
                {
                    for (
                    ; securityConstraintsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = securityConstraintsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    securityConstraintsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> resourceGroupReqsEnumerator = this._parent.ResourceGroupReqs.GetEnumerator();
                try
                {
                    for (
                    ; resourceGroupReqsEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = resourceGroupReqsEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    resourceGroupReqsEnumerator.Dispose();
                }
                IEnumerator<IModelElement> securityConstraintsLinearEnumerator = this._parent.SecurityConstraintsLinear.GetEnumerator();
                try
                {
                    for (
                    ; securityConstraintsLinearEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = securityConstraintsLinearEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    securityConstraintsLinearEnumerator.Dispose();
                }
                IEnumerator<IModelElement> pnodesEnumerator = this._parent.Pnodes.GetEnumerator();
                try
                {
                    for (
                    ; pnodesEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = pnodesEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    pnodesEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                IMarket marketItem = item.As<IMarket>();
                if (((marketItem != null) 
                            && this._parent.Markets.Remove(marketItem)))
                {
                    return true;
                }
                ISecurityConstraints securityConstraintsItem = item.As<ISecurityConstraints>();
                if (((securityConstraintsItem != null) 
                            && this._parent.SecurityConstraints.Remove(securityConstraintsItem)))
                {
                    return true;
                }
                IResourceGroupReq resourceGroupReqItem = item.As<IResourceGroupReq>();
                if (((resourceGroupReqItem != null) 
                            && this._parent.ResourceGroupReqs.Remove(resourceGroupReqItem)))
                {
                    return true;
                }
                ISecurityConstraintSum securityConstraintSumItem = item.As<ISecurityConstraintSum>();
                if (((securityConstraintSumItem != null) 
                            && this._parent.SecurityConstraintsLinear.Remove(securityConstraintSumItem)))
                {
                    return true;
                }
                IPnode pnodeItem = item.As<IPnode>();
                if (((pnodeItem != null) 
                            && this._parent.Pnodes.Remove(pnodeItem)))
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Markets).Concat(this._parent.SecurityConstraints).Concat(this._parent.ResourceGroupReqs).Concat(this._parent.SecurityConstraintsLinear).Concat(this._parent.Pnodes).GetEnumerator();
            }
        }
    }
}
