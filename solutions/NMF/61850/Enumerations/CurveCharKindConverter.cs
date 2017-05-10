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
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2017.SmartGrids.SubstationStandard.Enumerations
{
    
    
    public class CurveCharKindConverter : System.ComponentModel.TypeConverter
    {
        
        public override bool CanConvertFrom(System.ComponentModel.ITypeDescriptorContext context, System.Type sourceType)
        {
            return (sourceType == typeof(string));
        }
        
        public override bool CanConvertTo(System.ComponentModel.ITypeDescriptorContext context, System.Type destinationType)
        {
            return (destinationType == typeof(string));
        }
        
        public override object ConvertFrom(System.ComponentModel.ITypeDescriptorContext context, System.Globalization.CultureInfo culture, object value)
        {
            if ((value == null))
            {
                return default(CurveCharKind);
            }
            string valueString = value.ToString();
            if ((valueString == "ansiExtremelyInverse"))
            {
                return CurveCharKind.AnsiExtremelyInverse;
            }
            if ((valueString == "ansiVeryInverse"))
            {
                return CurveCharKind.AnsiVeryInverse;
            }
            if ((valueString == "ansiNormalInverse"))
            {
                return CurveCharKind.AnsiNormalInverse;
            }
            if ((valueString == "ansiModerateInverse"))
            {
                return CurveCharKind.AnsiModerateInverse;
            }
            if ((valueString == "ansiDefiniteTime"))
            {
                return CurveCharKind.AnsiDefiniteTime;
            }
            if ((valueString == "longTimeExtremelyInverse"))
            {
                return CurveCharKind.LongTimeExtremelyInverse;
            }
            if ((valueString == "longTimeVeryInverse"))
            {
                return CurveCharKind.LongTimeVeryInverse;
            }
            if ((valueString == "longTimeInverse"))
            {
                return CurveCharKind.LongTimeInverse;
            }
            if ((valueString == "iecNormalInverse"))
            {
                return CurveCharKind.IecNormalInverse;
            }
            if ((valueString == "iecVeryInverse"))
            {
                return CurveCharKind.IecVeryInverse;
            }
            if ((valueString == "iecInverse"))
            {
                return CurveCharKind.IecInverse;
            }
            if ((valueString == "iecExtremelyInverse"))
            {
                return CurveCharKind.IecExtremelyInverse;
            }
            if ((valueString == "iecShortTimeInverse"))
            {
                return CurveCharKind.IecShortTimeInverse;
            }
            if ((valueString == "iecLongTimeInverse"))
            {
                return CurveCharKind.IecLongTimeInverse;
            }
            if ((valueString == "iecDefiniteTime"))
            {
                return CurveCharKind.IecDefiniteTime;
            }
            if ((valueString == "reserved"))
            {
                return CurveCharKind.Reserved;
            }
            if ((valueString == "formula1"))
            {
                return CurveCharKind.Formula1;
            }
            if ((valueString == "formula2"))
            {
                return CurveCharKind.Formula2;
            }
            if ((valueString == "formula3"))
            {
                return CurveCharKind.Formula3;
            }
            if ((valueString == "formula4"))
            {
                return CurveCharKind.Formula4;
            }
            if ((valueString == "formula5"))
            {
                return CurveCharKind.Formula5;
            }
            if ((valueString == "formula6"))
            {
                return CurveCharKind.Formula6;
            }
            if ((valueString == "formula7"))
            {
                return CurveCharKind.Formula7;
            }
            if ((valueString == "formula8"))
            {
                return CurveCharKind.Formula8;
            }
            if ((valueString == "formula9"))
            {
                return CurveCharKind.Formula9;
            }
            if ((valueString == "formula10"))
            {
                return CurveCharKind.Formula10;
            }
            if ((valueString == "formula11"))
            {
                return CurveCharKind.Formula11;
            }
            if ((valueString == "formula12"))
            {
                return CurveCharKind.Formula12;
            }
            if ((valueString == "formula13"))
            {
                return CurveCharKind.Formula13;
            }
            if ((valueString == "formula14"))
            {
                return CurveCharKind.Formula14;
            }
            if ((valueString == "formula15"))
            {
                return CurveCharKind.Formula15;
            }
            if ((valueString == "formula16"))
            {
                return CurveCharKind.Formula16;
            }
            if ((valueString == "vendorPoints1"))
            {
                return CurveCharKind.VendorPoints1;
            }
            if ((valueString == "vendorPoints2"))
            {
                return CurveCharKind.VendorPoints2;
            }
            if ((valueString == "vendorPoints3"))
            {
                return CurveCharKind.VendorPoints3;
            }
            if ((valueString == "vendorPoints4"))
            {
                return CurveCharKind.VendorPoints4;
            }
            if ((valueString == "vendorPoints5"))
            {
                return CurveCharKind.VendorPoints5;
            }
            if ((valueString == "vendorPoints6"))
            {
                return CurveCharKind.VendorPoints6;
            }
            if ((valueString == "vendorPoints7"))
            {
                return CurveCharKind.VendorPoints7;
            }
            if ((valueString == "vendorPoints8"))
            {
                return CurveCharKind.VendorPoints8;
            }
            if ((valueString == "vendorPoints9"))
            {
                return CurveCharKind.VendorPoints9;
            }
            if ((valueString == "vendorPoints10"))
            {
                return CurveCharKind.VendorPoints10;
            }
            if ((valueString == "vendorPoints11"))
            {
                return CurveCharKind.VendorPoints11;
            }
            if ((valueString == "vendorPoints12"))
            {
                return CurveCharKind.VendorPoints12;
            }
            if ((valueString == "vendorPoints13"))
            {
                return CurveCharKind.VendorPoints13;
            }
            if ((valueString == "vendorPoints14"))
            {
                return CurveCharKind.VendorPoints14;
            }
            if ((valueString == "vendorPoints15"))
            {
                return CurveCharKind.VendorPoints15;
            }
            if ((valueString == "vendorPoints16"))
            {
                return CurveCharKind.VendorPoints16;
            }
            return default(CurveCharKind);
        }
        
        public override object ConvertTo(System.ComponentModel.ITypeDescriptorContext context, System.Globalization.CultureInfo culture, object value, System.Type destinationType)
        {
            if ((value == null))
            {
                return null;
            }
            CurveCharKind valueCasted = ((CurveCharKind)(value));
            if ((valueCasted == CurveCharKind.AnsiExtremelyInverse))
            {
                return "ansiExtremelyInverse";
            }
            if ((valueCasted == CurveCharKind.AnsiVeryInverse))
            {
                return "ansiVeryInverse";
            }
            if ((valueCasted == CurveCharKind.AnsiNormalInverse))
            {
                return "ansiNormalInverse";
            }
            if ((valueCasted == CurveCharKind.AnsiModerateInverse))
            {
                return "ansiModerateInverse";
            }
            if ((valueCasted == CurveCharKind.AnsiDefiniteTime))
            {
                return "ansiDefiniteTime";
            }
            if ((valueCasted == CurveCharKind.LongTimeExtremelyInverse))
            {
                return "longTimeExtremelyInverse";
            }
            if ((valueCasted == CurveCharKind.LongTimeVeryInverse))
            {
                return "longTimeVeryInverse";
            }
            if ((valueCasted == CurveCharKind.LongTimeInverse))
            {
                return "longTimeInverse";
            }
            if ((valueCasted == CurveCharKind.IecNormalInverse))
            {
                return "iecNormalInverse";
            }
            if ((valueCasted == CurveCharKind.IecVeryInverse))
            {
                return "iecVeryInverse";
            }
            if ((valueCasted == CurveCharKind.IecInverse))
            {
                return "iecInverse";
            }
            if ((valueCasted == CurveCharKind.IecExtremelyInverse))
            {
                return "iecExtremelyInverse";
            }
            if ((valueCasted == CurveCharKind.IecShortTimeInverse))
            {
                return "iecShortTimeInverse";
            }
            if ((valueCasted == CurveCharKind.IecLongTimeInverse))
            {
                return "iecLongTimeInverse";
            }
            if ((valueCasted == CurveCharKind.IecDefiniteTime))
            {
                return "iecDefiniteTime";
            }
            if ((valueCasted == CurveCharKind.Reserved))
            {
                return "reserved";
            }
            if ((valueCasted == CurveCharKind.Formula1))
            {
                return "formula1";
            }
            if ((valueCasted == CurveCharKind.Formula2))
            {
                return "formula2";
            }
            if ((valueCasted == CurveCharKind.Formula3))
            {
                return "formula3";
            }
            if ((valueCasted == CurveCharKind.Formula4))
            {
                return "formula4";
            }
            if ((valueCasted == CurveCharKind.Formula5))
            {
                return "formula5";
            }
            if ((valueCasted == CurveCharKind.Formula6))
            {
                return "formula6";
            }
            if ((valueCasted == CurveCharKind.Formula7))
            {
                return "formula7";
            }
            if ((valueCasted == CurveCharKind.Formula8))
            {
                return "formula8";
            }
            if ((valueCasted == CurveCharKind.Formula9))
            {
                return "formula9";
            }
            if ((valueCasted == CurveCharKind.Formula10))
            {
                return "formula10";
            }
            if ((valueCasted == CurveCharKind.Formula11))
            {
                return "formula11";
            }
            if ((valueCasted == CurveCharKind.Formula12))
            {
                return "formula12";
            }
            if ((valueCasted == CurveCharKind.Formula13))
            {
                return "formula13";
            }
            if ((valueCasted == CurveCharKind.Formula14))
            {
                return "formula14";
            }
            if ((valueCasted == CurveCharKind.Formula15))
            {
                return "formula15";
            }
            if ((valueCasted == CurveCharKind.Formula16))
            {
                return "formula16";
            }
            if ((valueCasted == CurveCharKind.VendorPoints1))
            {
                return "vendorPoints1";
            }
            if ((valueCasted == CurveCharKind.VendorPoints2))
            {
                return "vendorPoints2";
            }
            if ((valueCasted == CurveCharKind.VendorPoints3))
            {
                return "vendorPoints3";
            }
            if ((valueCasted == CurveCharKind.VendorPoints4))
            {
                return "vendorPoints4";
            }
            if ((valueCasted == CurveCharKind.VendorPoints5))
            {
                return "vendorPoints5";
            }
            if ((valueCasted == CurveCharKind.VendorPoints6))
            {
                return "vendorPoints6";
            }
            if ((valueCasted == CurveCharKind.VendorPoints7))
            {
                return "vendorPoints7";
            }
            if ((valueCasted == CurveCharKind.VendorPoints8))
            {
                return "vendorPoints8";
            }
            if ((valueCasted == CurveCharKind.VendorPoints9))
            {
                return "vendorPoints9";
            }
            if ((valueCasted == CurveCharKind.VendorPoints10))
            {
                return "vendorPoints10";
            }
            if ((valueCasted == CurveCharKind.VendorPoints11))
            {
                return "vendorPoints11";
            }
            if ((valueCasted == CurveCharKind.VendorPoints12))
            {
                return "vendorPoints12";
            }
            if ((valueCasted == CurveCharKind.VendorPoints13))
            {
                return "vendorPoints13";
            }
            if ((valueCasted == CurveCharKind.VendorPoints14))
            {
                return "vendorPoints14";
            }
            if ((valueCasted == CurveCharKind.VendorPoints15))
            {
                return "vendorPoints15";
            }
            if ((valueCasted == CurveCharKind.VendorPoints16))
            {
                return "vendorPoints16";
            }
            throw new ArgumentOutOfRangeException("value");
        }
    }
}
