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
using TTC2017.SmartGrids.COSEM.InterfaceClasses;

namespace TTC2017.SmartGrids.COSEM.COSEMObjects
{
    
    
    /// <summary>
    /// The public interface for Coefficients
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Coefficients))]
    [XmlDefaultImplementationTypeAttribute(typeof(Coefficients))]
    public interface ICoefficients : IModelElement, IData
    {
        
        /// <summary>
        /// The Transformer_magnetic_losses property
        /// </summary>
        Nullable<double> Transformer_magnetic_losses
        {
            get;
            set;
        }
        
        /// <summary>
        /// The Transformer_iron_losses property
        /// </summary>
        Nullable<double> Transformer_iron_losses
        {
            get;
            set;
        }
        
        /// <summary>
        /// The Line_resistance_losses property
        /// </summary>
        Nullable<double> Line_resistance_losses
        {
            get;
            set;
        }
        
        /// <summary>
        /// The Line_reactance_losses property
        /// </summary>
        Nullable<double> Line_reactance_losses
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the Transformer_magnetic_losses property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Transformer_magnetic_lossesChanging;
        
        /// <summary>
        /// Gets fired when the Transformer_magnetic_losses property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Transformer_magnetic_lossesChanged;
        
        /// <summary>
        /// Gets fired before the Transformer_iron_losses property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Transformer_iron_lossesChanging;
        
        /// <summary>
        /// Gets fired when the Transformer_iron_losses property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Transformer_iron_lossesChanged;
        
        /// <summary>
        /// Gets fired before the Line_resistance_losses property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Line_resistance_lossesChanging;
        
        /// <summary>
        /// Gets fired when the Line_resistance_losses property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Line_resistance_lossesChanged;
        
        /// <summary>
        /// Gets fired before the Line_reactance_losses property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Line_reactance_lossesChanging;
        
        /// <summary>
        /// Gets fired when the Line_reactance_losses property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> Line_reactance_lossesChanged;
    }
}
