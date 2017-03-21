/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes <em>Gml Strokes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts <em>Gml Fonts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills <em>Gml Fills</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The solid color that will be used. The color value is RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign. The hexadecimal digits between A and F may be in either uppercase or lowercase. For example, full red is encoded as \"#ff0000\" (with no quotation marks). If the Stroke cssParameter element is absent, the default color is defined to be black (\"#000000\").'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The solid color that will be used. The color value is RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign. The hexadecimal digits between A and F may be in either uppercase or lowercase. For example, full red is encoded as \"#ff0000\" (with no quotation marks). If the Stroke cssParameter element is absent, the default color is defined to be black (\"#000000\").'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The solid color that will be used. The color value is RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign. The hexadecimal digits between A and F may be in either uppercase or lowercase. For example, full red is encoded as \"#ff0000\" (with no quotation marks). If the Stroke cssParameter element is absent, the default color is defined to be black (\"#000000\").' Profile\040documentation='The solid color that will be used. The color value is RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign. The hexadecimal digits between A and F may be in either uppercase or lowercase. For example, full red is encoded as \"#ff0000\" (with no quotation marks). If the Stroke cssParameter element is absent, the default color is defined to be black (\"#000000\").'"
 * @generated
 */
public interface GmlColour extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour_Green()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The color value for GREEN (RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign.)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The color value for GREEN (RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign.)'"
	 * @generated
	 */
	String getGreen();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(String value);

	/**
	 * Returns the value of the '<em><b>Gml Strokes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Strokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Strokes</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour_GmlStrokes()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour
	 * @model opposite="GmlColour"
	 * @generated
	 */
	EList<GmlStroke> getGmlStrokes();

	/**
	 * Returns the value of the '<em><b>Gml Fonts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fonts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fonts</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour_GmlFonts()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour
	 * @model opposite="GmlColour"
	 * @generated
	 */
	EList<GmlFont> getGmlFonts();

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour_Red()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The color value for RED (RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign.)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The color value for RED (RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign.)'"
	 * @generated
	 */
	String getRed();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(String value);

	/**
	 * Returns the value of the '<em><b>Gml Fills</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fills</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour_GmlFills()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour
	 * @model opposite="GmlColour"
	 * @generated
	 */
	EList<GmlFill> getGmlFills();

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour_Blue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The color value for BLUE (RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The color value for BLUE (RGB-encoded using two hexadecimal digits per primary-color component, in the order Red, Green, Blue, prefixed with a hash (#) sign.).'"
	 * @generated
	 */
	String getBlue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(String value);

} // GmlColour
