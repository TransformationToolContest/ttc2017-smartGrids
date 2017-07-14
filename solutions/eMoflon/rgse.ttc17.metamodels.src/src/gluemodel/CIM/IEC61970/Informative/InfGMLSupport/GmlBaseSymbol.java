/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Base Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols <em>Gml Symbols</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlBaseSymbol()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Allows referencing and extension of external symbols, which may be stored in a symbol repository. The graphical properties from a referenced external symbol override the ones read in from the base symbol.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Allows referencing and extension of external symbols, which may be stored in a symbol repository. The graphical properties from a referenced external symbol override the ones read in from the base symbol.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Allows referencing and extension of external symbols, which may be stored in a symbol repository. The graphical properties from a referenced external symbol override the ones read in from the base symbol.' Profile\040documentation='Allows referencing and extension of external symbols, which may be stored in a symbol repository. The graphical properties from a referenced external symbol override the ones read in from the base symbol.'"
 * @generated
 */
public interface GmlBaseSymbol extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol <em>Gml Base Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlBaseSymbol_GmlSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol
	 * @model opposite="GmlBaseSymbol"
	 * @generated
	 */
	EList<GmlSymbol> getGmlSymbols();

} // GmlBaseSymbol
