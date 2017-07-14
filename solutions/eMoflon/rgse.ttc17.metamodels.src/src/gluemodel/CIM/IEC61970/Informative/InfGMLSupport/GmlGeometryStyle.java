/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Geometry Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The style for one geometry of a feature. Any number of geometry style descriptors can be assigned to one feature style. This is usually required for features with multiple geometry properties.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The style for one geometry of a feature. Any number of geometry style descriptors can be assigned to one feature style. This is usually required for features with multiple geometry properties.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The style for one geometry of a feature. Any number of geometry style descriptors can be assigned to one feature style. This is usually required for features with multiple geometry properties.' Profile\040documentation='The style for one geometry of a feature. Any number of geometry style descriptors can be assigned to one feature style. This is usually required for features with multiple geometry properties.'"
 * @generated
 */
public interface GmlGeometryStyle extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Label Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Label Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Label Style</em>' reference.
	 * @see #setGmlLabelStyle(GmlLabelStyle)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle_GmlLabelStyle()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles
	 * @model opposite="GmlGeometryStyles"
	 * @generated
	 */
	GmlLabelStyle getGmlLabelStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Label Style</em>' reference.
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	void setGmlLabelStyle(GmlLabelStyle value);

	/**
	 * Returns the value of the '<em><b>Gml Feature Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Style</em>' reference.
	 * @see #setGmlFeatureStyle(GmlFeatureStyle)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle_GmlFeatureStyle()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles
	 * @model opposite="GmlGeometryStyles"
	 * @generated
	 */
	GmlFeatureStyle getGmlFeatureStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Feature Style</em>' reference.
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	void setGmlFeatureStyle(GmlFeatureStyle value);

	/**
	 * Returns the value of the '<em><b>Geometry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Type</em>' attribute.
	 * @see #setGeometryType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle_GeometryType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='It is necessary to specify the geometry type using this attribute as well since the application schema of the geometry property may allow different geometries as its value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='It is necessary to specify the geometry type using this attribute as well since the application schema of the geometry property may allow different geometries as its value.'"
	 * @generated
	 */
	String getGeometryType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Type</em>' attribute.
	 * @see #getGeometryType()
	 * @generated
	 */
	void setGeometryType(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle_Symbol()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Graphical symbol used to render a geometry or a topology. A symbol is a description of graphical attributes of a graphical object without a particular, implicit meaning. It can be a description of a line, circle, polygon or more complex drawing.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Graphical symbol used to render a geometry or a topology. A symbol is a description of graphical attributes of a graphical object without a particular, implicit meaning. It can be a description of a line, circle, polygon or more complex drawing.'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Geometry Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Property</em>' attribute.
	 * @see #setGeometryProperty(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle_GeometryProperty()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The name of the geometry property of a feature to which this GeometryStyle applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The name of the geometry property of a feature to which this GeometryStyle applies.'"
	 * @generated
	 */
	String getGeometryProperty();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Property</em>' attribute.
	 * @see #getGeometryProperty()
	 * @generated
	 */
	void setGeometryProperty(String value);

} // GmlGeometryStyle
