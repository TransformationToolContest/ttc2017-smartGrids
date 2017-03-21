/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Svg Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes <em>Gml Stokes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills <em>Gml Fills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts <em>Gml Fonts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Refers to an SVG/CSS graphical-formatting parameter. The parameter is identified using the \"name\" attribute and the content of the element gives the SVG/CSS-coded value.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Refers to an SVG/CSS graphical-formatting parameter. The parameter is identified using the \"name\" attribute and the content of the element gives the SVG/CSS-coded value.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Refers to an SVG/CSS graphical-formatting parameter. The parameter is identified using the \"name\" attribute and the content of the element gives the SVG/CSS-coded value.' Profile\040documentation='Refers to an SVG/CSS graphical-formatting parameter. The parameter is identified using the \"name\" attribute and the content of the element gives the SVG/CSS-coded value.'"
 * @generated
 */
public interface GmlSvgParameter extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Stokes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Stokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Stokes</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter_GmlStokes()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters
	 * @model opposite="GmlSvgParameters"
	 * @generated
	 */
	EList<GmlStroke> getGmlStokes();

	/**
	 * Returns the value of the '<em><b>Gml Fills</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fills</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter_GmlFills()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters
	 * @model opposite="GmlSvgParameters"
	 * @generated
	 */
	EList<GmlFill> getGmlFills();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SVG/CSS-coded value of the associated SvgAttribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SVG/CSS-coded value of the associated SvgAttribute.'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Gml Fonts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fonts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fonts</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter_GmlFonts()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters
	 * @model opposite="GmlSvgParameters"
	 * @generated
	 */
	EList<GmlFont> getGmlFonts();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter_Attribute()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The attribute of the GmlSvgParameter. E.g., for \"Stroke\", the following SvgParameters may be used: \"stroke\" (color), \"stroke-opacity\", \"stroke-width\", \"stroke-linejoin\", \"stroke-linecap\", \"stroke-dasharray\", and \"stroke-dashoffset\". Others are not officially supported.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The attribute of the GmlSvgParameter. E.g., for \"Stroke\", the following SvgParameters may be used: \"stroke\" (color), \"stroke-opacity\", \"stroke-width\", \"stroke-linejoin\", \"stroke-linecap\", \"stroke-dasharray\", and \"stroke-dashoffset\". Others are not officially supported.'"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

} // GmlSvgParameter
