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
using TTC2017.SmartGrids.CIM.IEC61970.Meas;

namespace TTC2017.SmartGrids.CIM.IEC61970.SCADA
{
    
    
    /// <summary>
    /// The public interface for RemoteUnit
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(RemoteUnit))]
    [XmlDefaultImplementationTypeAttribute(typeof(RemoteUnit))]
    public interface IRemoteUnit : IModelElement, IPowerSystemResource
    {
        
        /// <summary>
        /// The remoteUnitType property
        /// </summary>
        Nullable<RemoteUnitType> RemoteUnitType
        {
            get;
            set;
        }
        
        /// <summary>
        /// The RemotePoints property
        /// </summary>
        IOrderedSetExpression<IRemotePoint> RemotePoints
        {
            get;
        }
        
        /// <summary>
        /// The CommunicationLinks property
        /// </summary>
        IOrderedSetExpression<ICommunicationLink> CommunicationLinks
        {
            get;
        }
        
        /// <summary>
        /// Gets fired before the RemoteUnitType property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> RemoteUnitTypeChanging;
        
        /// <summary>
        /// Gets fired when the RemoteUnitType property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> RemoteUnitTypeChanged;
    }
}
