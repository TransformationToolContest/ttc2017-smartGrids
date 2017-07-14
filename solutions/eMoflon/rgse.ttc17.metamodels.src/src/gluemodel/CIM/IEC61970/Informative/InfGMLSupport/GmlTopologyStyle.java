/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Topology Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTopologyStyle()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The style for one topology property. Similarly to the Geometry style, a feature can have multiple topology properties, thus multiple topology style descriptors can be specified within one feature style.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The style for one topology property. Similarly to the Geometry style, a feature can have multiple topology properties, thus multiple topology style descriptors can be specified within one feature style.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The style for one topology property. Similarly to the Geometry style, a feature can have multiple topology properties, thus multiple topology style descriptors can be specified within one feature style.' Profile\040documentation='The style for one topology property. Similarly to the Geometry style, a feature can have multiple topology properties, thus multiple topology style descriptors can be specified within one feature style.'"
 * @generated
 */
public interface GmlTopologyStyle extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Lable Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles <em>Gml Topology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Lable Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Lable Style</em>' reference.
	 * @see #setGmlLableStyle(GmlLabelStyle)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTopologyStyle_GmlLableStyle()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles
	 * @model opposite="GmlTopologyStyles"
	 * @generated
	 */
	GmlLabelStyle getGmlLableStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Lable Style</em>' reference.
	 * @see #getGmlLableStyle()
	 * @generated
	 */
	void setGmlLableStyle(GmlLabelStyle value);

	/**
	 * Returns the value of the '<em><b>Gml Feature Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles <em>Gml Tobology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Style</em>' reference.
	 * @see #setGmlFeatureStyle(GmlFeatureStyle)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTopologyStyle_GmlFeatureStyle()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles
	 * @model opposite="GmlTobologyStyles"
	 * @generated
	 */
	GmlFeatureStyle getGmlFeatureStyle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Feature Style</em>' reference.
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	void setGmlFeatureStyle(GmlFeatureStyle value);

} // GmlTopologyStyle
