/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identifies a font of a certain family, style, and size.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Identifies a font of a certain family, style, and size.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identifies a font of a certain family, style, and size.' Profile\040documentation='Identifies a font of a certain family, style, and size.'"
 * @generated
 */
public interface GmlFont extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_Weight()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of weight or boldness to use for a font. Allowed values are \"normal\" and \"bold\".'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of weight or boldness to use for a font. Allowed values are \"normal\" and \"bold\".'"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_GmlTextSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont
	 * @model opposite="GmlFont"
	 * @generated
	 */
	EList<GmlTextSymbol> getGmlTextSymbols();

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_Family()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Family name of a font to use. Allowed values are system-dependent. Any number of font-family attributes may be given and they are assumed to be in preferred order.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Family name of a font to use. Allowed values are system-dependent. Any number of font-family attributes may be given and they are assumed to be in preferred order.'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_Style()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The style to use for a font. The allowed values are \"normal\", \"italic\", and \"oblique\".'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The style to use for a font. The allowed values are \"normal\", \"italic\", and \"oblique\".'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Absolute Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Size</em>' attribute.
	 * @see #setAbsoluteSize(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_AbsoluteSize()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if \"size\" is expressed in absolute values. Default is false.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if \"size\" is expressed in absolute values. Default is false.'"
	 * @generated
	 */
	boolean isAbsoluteSize();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Size</em>' attribute.
	 * @see #isAbsoluteSize()
	 * @generated
	 */
	void setAbsoluteSize(boolean value);

	/**
	 * Returns the value of the '<em><b>Gml Colour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Colour</em>' reference.
	 * @see #setGmlColour(GmlColour)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_GmlColour()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts
	 * @model opposite="GmlFonts"
	 * @generated
	 */
	GmlColour getGmlColour();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Colour</em>' reference.
	 * @see #getGmlColour()
	 * @generated
	 */
	void setGmlColour(GmlColour value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_Size()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The size to use for the font in pixels. The default is defined to be 10 pixels, though various systems may have restrictions on what sizes are available.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The size to use for the font in pixels. The default is defined to be 10 pixels, though various systems may have restrictions on what sizes are available.'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Svg Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Svg Parameters</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont_GmlSvgParameters()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts
	 * @model opposite="GmlFonts"
	 * @generated
	 */
	EList<GmlSvgParameter> getGmlSvgParameters();

} // GmlFont
