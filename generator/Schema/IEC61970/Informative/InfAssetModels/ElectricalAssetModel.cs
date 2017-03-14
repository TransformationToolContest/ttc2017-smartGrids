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
    /// The default implementation of the ElectricalAssetModel class
    /// </summary>
    [XmlNamespaceAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#InfAssetModels")]
    [XmlNamespacePrefixAttribute("cimInfAssetModels")]
    [ModelRepresentationClassAttribute("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssetModels/El" +
        "ectricalAssetModel")]
    [DebuggerDisplayAttribute("ElectricalAssetModel {UUID}")]
    public class ElectricalAssetModel : AssetModel, IElectricalAssetModel, IModelElement
    {
        
        /// <summary>
        /// The backing field for the ElectricalInfos property
        /// </summary>
        private ElectricalAssetModelElectricalInfosCollection _electricalInfos;
        
        private static IClass _classInstance;
        
        public ElectricalAssetModel()
        {
            this._electricalInfos = new ElectricalAssetModelElectricalInfosCollection(this);
            this._electricalInfos.CollectionChanging += this.ElectricalInfosCollectionChanging;
            this._electricalInfos.CollectionChanged += this.ElectricalInfosCollectionChanged;
        }
        
        /// <summary>
        /// The ElectricalInfos property
        /// </summary>
        [DesignerSerializationVisibilityAttribute(DesignerSerializationVisibility.Content)]
        [XmlAttributeAttribute(true)]
        [XmlOppositeAttribute("ElectricalAssetModels")]
        [ConstantAttribute()]
        public virtual IOrderedSetExpression<IElectricalInfo> ElectricalInfos
        {
            get
            {
                return this._electricalInfos;
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new ElectricalAssetModelReferencedElementsCollection(this));
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
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssetModels/El" +
                            "ectricalAssetModel")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Forwards CollectionChanging notifications for the ElectricalInfos property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ElectricalInfosCollectionChanging(object sender, NMF.Collections.ObjectModel.NotifyCollectionChangingEventArgs e)
        {
            this.OnCollectionChanging("ElectricalInfos", e);
        }
        
        /// <summary>
        /// Forwards CollectionChanged notifications for the ElectricalInfos property to the parent model element
        /// </summary>
        /// <param name="sender">The collection that raised the change</param>
        /// <param name="e">The original event data</param>
        private void ElectricalInfosCollectionChanged(object sender, System.Collections.Specialized.NotifyCollectionChangedEventArgs e)
        {
            this.OnCollectionChanged("ElectricalInfos", e);
        }
        
        /// <summary>
        /// Gets the Model element collection for the given feature
        /// </summary>
        /// <returns>A non-generic list of elements</returns>
        /// <param name="feature">The requested feature</param>
        protected override System.Collections.IList GetCollectionForFeature(string feature)
        {
            if ((feature == "ELECTRICALINFOS"))
            {
                return this._electricalInfos;
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
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://iec.ch/TC57/2009/CIM-schema-cim14#//IEC61970/Informative/InfAssetModels/El" +
                        "ectricalAssetModel")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the ElectricalAssetModel class
        /// </summary>
        public class ElectricalAssetModelReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private ElectricalAssetModel _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public ElectricalAssetModelReferencedElementsCollection(ElectricalAssetModel parent)
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
                    count = (count + this._parent.ElectricalInfos.Count);
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.ElectricalInfos.AsNotifiable().CollectionChanged += this.PropagateCollectionChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.ElectricalInfos.AsNotifiable().CollectionChanged -= this.PropagateCollectionChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                IElectricalInfo electricalInfosCasted = item.As<IElectricalInfo>();
                if ((electricalInfosCasted != null))
                {
                    this._parent.ElectricalInfos.Add(electricalInfosCasted);
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.ElectricalInfos.Clear();
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if (this._parent.ElectricalInfos.Contains(item))
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
                IEnumerator<IModelElement> electricalInfosEnumerator = this._parent.ElectricalInfos.GetEnumerator();
                try
                {
                    for (
                    ; electricalInfosEnumerator.MoveNext(); 
                    )
                    {
                        array[arrayIndex] = electricalInfosEnumerator.Current;
                        arrayIndex = (arrayIndex + 1);
                    }
                }
                finally
                {
                    electricalInfosEnumerator.Dispose();
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                IElectricalInfo electricalInfoItem = item.As<IElectricalInfo>();
                if (((electricalInfoItem != null) 
                            && this._parent.ElectricalInfos.Remove(electricalInfoItem)))
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
                return Enumerable.Empty<IModelElement>().Concat(this._parent.ElectricalInfos).GetEnumerator();
            }
        }
    }
}
