/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles <em>Gml Topology Styles</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The style for the text that is to be displayed along with the graphical representation of a feature. The content of the label is not necessarily defined in the GML data set. More precisely, the content can be static text specified in the style itself and the text from the GML data set. Label style has two elements: gml:style that specifies the style and gml:label that is used to compose the label content.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The style for the text that is to be displayed along with the graphical representation of a feature. The content of the label is not necessarily defined in the GML data set. More precisely, the content can be static text specified in the style itself and the text from the GML data set. Label style has two elements: gml:style that specifies the style and gml:label that is used to compose the label content.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The style for the text that is to be displayed along with the graphical representation of a feature. The content of the label is not necessarily defined in the GML data set. More precisely, the content can be static text specified in the style itself and the text from the GML data set. Label style has two elements: gml:style that specifies the style and gml:label that is used to compose the label content.' Profile\040documentation='The style for the text that is to be displayed along with the graphical representation of a feature. The content of the label is not necessarily defined in the GML data set. More precisely, the content can be static text specified in the style itself and the text from the GML data set. Label style has two elements: gml:style that specifies the style and gml:label that is used to compose the label content.'"
 * @generated
 */
public interface GmlLabelStyle extends IdentifiedObject {
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
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle_Style()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to specify the style of the rendered text. The CSS2 styling expressions grammar should be used to express graphic properties.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to specify the style of the rendered text. The CSS2 styling expressions grammar should be used to express graphic properties.'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Gml Feature Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles <em>Gml Label Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Style</em>' reference.
	 * @see #setGmlFeatureStyle(GmlFeatureStyle)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle_GmlFeatureStyle()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles
	 * @model opposite="GmlLabelStyles"
	 * @generated
	 */
	GmlFeatureStyle getGmlFeatureStyle();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Feature Style</em>' reference.
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	void setGmlFeatureStyle(GmlFeatureStyle value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle_Transform()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Allows us to specify a transformation expression that will be applied to the symbol in the rendering phase. Its type is xsd:string and the value is specified in the SVG specification (transform attribute).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Allows us to specify a transformation expression that will be applied to the symbol in the rendering phase. Its type is xsd:string and the value is specified in the SVG specification (transform attribute).'"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle_LabelExpression()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Allows both text content and unbounded number of gml:LabelExpression elements. The value of gml:LabelExpression element is an XPath expression that selects the value of some property of the feature.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Allows both text content and unbounded number of gml:LabelExpression elements. The value of gml:LabelExpression element is an XPath expression that selects the value of some property of the feature.'"
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Geometry Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Geometry Styles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle_GmlGeometryStyles()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle
	 * @model opposite="GmlLabelStyle"
	 * @generated
	 */
	EList<GmlGeometryStyle> getGmlGeometryStyles();

	/**
	 * Returns the value of the '<em><b>Gml Topology Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Topology Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Topology Styles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle_GmlTopologyStyles()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle
	 * @model opposite="GmlLableStyle"
	 * @generated
	 */
	EList<GmlTopologyStyle> getGmlTopologyStyles();

} // GmlLabelStyle
