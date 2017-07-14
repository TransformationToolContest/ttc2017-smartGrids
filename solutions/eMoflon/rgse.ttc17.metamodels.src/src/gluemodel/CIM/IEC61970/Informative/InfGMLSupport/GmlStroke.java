/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Stroke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols <em>Gml Line Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The element encapsulating the graphical symbolization parameters for linear geometries.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The element encapsulating the graphical symbolization parameters for linear geometries.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The element encapsulating the graphical symbolization parameters for linear geometries.' Profile\040documentation='The element encapsulating the graphical symbolization parameters for linear geometries.'"
 * @generated
 */
public interface GmlStroke extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Cap</em>' attribute.
	 * @see #setLineCap(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_LineCap()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Enumerated values telling how line strings should be capped (at the two ends of the line string). The values are represented as content strings.\n\nThe allowed values for line cap are \"butt\", \"round\", and \"square\". The default values are system-dependent.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Enumerated values telling how line strings should be capped (at the two ends of the line string). The values are represented as content strings.\n\nThe allowed values for line cap are \"butt\", \"round\", and \"square\". The default values are system-dependent.'"
	 * @generated
	 */
	String getLineCap();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Cap</em>' attribute.
	 * @see #getLineCap()
	 * @generated
	 */
	void setLineCap(String value);

	/**
	 * Returns the value of the '<em><b>Gml Colour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Colour</em>' reference.
	 * @see #setGmlColour(GmlColour)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_GmlColour()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes
	 * @model opposite="GmlStrokes"
	 * @generated
	 */
	GmlColour getGmlColour();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Colour</em>' reference.
	 * @see #getGmlColour()
	 * @generated
	 */
	void setGmlColour(GmlColour value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_Opacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the level of translucency to use when rendering the stroke. The value is encoded as a floating-point value\nbetween 0.0 and 1.0 with 0.0 representing completely transparent and 1.0 representing completely opaque, with a linear scale of translucency for intermediate values. The default value is 1.0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the level of translucency to use when rendering the stroke. The value is encoded as a floating-point value\nbetween 0.0 and 1.0 with 0.0 representing completely transparent and 1.0 representing completely opaque, with a linear scale of translucency for intermediate values. The default value is 1.0'"
	 * @generated
	 */
	float getOpacity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(float value);

	/**
	 * Returns the value of the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes <em>Gml Stokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Svg Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Svg Parameters</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_GmlSvgParameters()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes
	 * @model opposite="GmlStokes"
	 * @generated
	 */
	EList<GmlSvgParameter> getGmlSvgParameters();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_Width()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The absolute width (thickness) of a stroke in pixels encoded as a float. The default is 1.0. Fractional numbers are allowed (with a system-dependent interpretation) but negative numbers are not.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The absolute width (thickness) of a stroke in pixels encoded as a float. The default is 1.0. Fractional numbers are allowed (with a system-dependent interpretation) but negative numbers are not.'"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Polygon Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Polygon Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_GmlPolygonSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke
	 * @model opposite="GmlStroke"
	 * @generated
	 */
	EList<GmlPolygonSymbol> getGmlPolygonSymbols();

	/**
	 * Returns the value of the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Line Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Line Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_GmlLineSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke
	 * @model opposite="GmlStroke"
	 * @generated
	 */
	EList<GmlLineSymbol> getGmlLineSymbols();

	/**
	 * Returns the value of the '<em><b>Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash Array</em>' attribute.
	 * @see #setDashArray(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_DashArray()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Encodes a dash pattern as a series of space separated floats. The first number gives the length in pixels of dash to draw, the second gives the amount of space to leave, and this pattern repeats. If an odd number of values is given, then the pattern is expanded by repeating it twice to give an even number of values. Decimal values have a system-dependent interpretation (usually depending on whether antialiasing is being used). The default is to draw an unbroken line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Encodes a dash pattern as a series of space separated floats. The first number gives the length in pixels of dash to draw, the second gives the amount of space to leave, and this pattern repeats. If an odd number of values is given, then the pattern is expanded by repeating it twice to give an even number of values. Decimal values have a system-dependent interpretation (usually depending on whether antialiasing is being used). The default is to draw an unbroken line.'"
	 * @generated
	 */
	String getDashArray();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash Array</em>' attribute.
	 * @see #getDashArray()
	 * @generated
	 */
	void setDashArray(String value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #setLineStyle(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_LineStyle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The name of a defined line style. Usually will be an enumerated value and will be system-specific.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The name of a defined line style. Usually will be an enumerated value and will be system-specific.'"
	 * @generated
	 */
	String getLineStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(String value);

	/**
	 * Returns the value of the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash Offset</em>' attribute.
	 * @see #setDashOffset(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_DashOffset()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the distance as a float into the \"stroke-dasharray\" pattern at which to start drawing.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the distance as a float into the \"stroke-dasharray\" pattern at which to start drawing.'"
	 * @generated
	 */
	String getDashOffset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash Offset</em>' attribute.
	 * @see #getDashOffset()
	 * @generated
	 */
	void setDashOffset(String value);

	/**
	 * Returns the value of the '<em><b>Gml Marks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Marks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Marks</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_GmlMarks()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes
	 * @model opposite="GmlStrokes"
	 * @generated
	 */
	EList<GmlMark> getGmlMarks();

	/**
	 * Returns the value of the '<em><b>Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linejoin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linejoin</em>' attribute.
	 * @see #setLinejoin(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke_Linejoin()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Enumerated values telling how line strings should be joined (between line segments). The values are represented as content strings.\n\nThe allowed values for line join are \"mitre\", \"round\", and \"bevel\". The default values are system-dependent.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Enumerated values telling how line strings should be joined (between line segments). The values are represented as content strings.\n\nThe allowed values for line join are \"mitre\", \"round\", and \"bevel\". The default values are system-dependent.'"
	 * @generated
	 */
	String getLinejoin();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linejoin</em>' attribute.
	 * @see #getLinejoin()
	 * @generated
	 */
	void setLinejoin(String value);

} // GmlStroke
