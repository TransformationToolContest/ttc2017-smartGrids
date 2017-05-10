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
using TTC2017.SmartGrids.COSEM;
using TTC2017.SmartGrids.COSEM.Datatypes;

namespace TTC2017.SmartGrids.COSEM.InterfaceClasses
{
    
    
    /// <summary>
    /// The public interface for Base
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Base))]
    [XmlDefaultImplementationTypeAttribute(typeof(Base))]
    public interface IBase : IModelElement
    {
        
        /// <summary>
        /// The logical_name property
        /// </summary>
        string Logical_name
        {
            get;
            set;
        }
        
        /// <summary>
        /// The OBIScode property
        /// </summary>
        string OBIScode
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the Logical_name property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Logical_nameChanging;
        
        /// <summary>
        /// Gets fired when the Logical_name property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Logical_nameChanged;
        
        /// <summary>
        /// Gets fired before the OBIScode property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> OBIScodeChanging;
        
        /// <summary>
        /// Gets fired when the OBIScode property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> OBIScodeChanged;
    }
}
