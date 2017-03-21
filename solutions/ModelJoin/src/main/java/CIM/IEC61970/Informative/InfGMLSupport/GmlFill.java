/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies how the area of the geometry will be filled.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies how the area of the geometry will be filled.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies how the area of the geometry will be filled.' Profile\040documentation='Specifies how the area of the geometry will be filled.'"
 * @generated
 */
public interface GmlFill extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Polygon Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Polygon Symbols</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill_GmlPolygonSymbols()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill
	 * @model opposite="GmlFill"
	 * @generated
	 */
	EList<GmlPolygonSymbol> getGmlPolygonSymbols();

	/**
	 * Returns the value of the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Svg Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Svg Parameters</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill_GmlSvgParameters()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills
	 * @model opposite="GmlFills"
	 * @generated
	 */
	EList<GmlSvgParameter> getGmlSvgParameters();

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(float)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill_Opacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the level of translucency to use when rendering the Fill. The value is encoded as a floating-point value\nbetween 0.0 and 1.0 with 0.0 representing completely transparent and 1.0 representing completely opaque, with a linear scale of translucency for intermediate values. The default value is 1.0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the level of translucency to use when rendering the Fill. The value is encoded as a floating-point value\nbetween 0.0 and 1.0 with 0.0 representing completely transparent and 1.0 representing completely opaque, with a linear scale of translucency for intermediate values. The default value is 1.0'"
	 * @generated
	 */
	float getOpacity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(float value);

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill_GmlTextSymbols()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill
	 * @model opposite="GmlFill"
	 * @generated
	 */
	EList<GmlTextSymbol> getGmlTextSymbols();

	/**
	 * Returns the value of the '<em><b>Gml Marks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls <em>Gml FIlls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Marks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Marks</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill_GmlMarks()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls
	 * @model opposite="GmlFIlls"
	 * @generated
	 */
	EList<GmlMark> getGmlMarks();

	/**
	 * Returns the value of the '<em><b>Gml Colour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Colour</em>' reference.
	 * @see #setGmlColour(GmlColour)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill_GmlColour()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills
	 * @model opposite="GmlFills"
	 * @generated
	 */
	GmlColour getGmlColour();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Colour</em>' reference.
	 * @see #getGmlColour()
	 * @generated
	 */
	void setGmlColour(GmlColour value);

} // GmlFill
