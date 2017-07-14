/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles <em>Gml Feature Styles</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type classification of feature.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Type classification of feature.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type classification of feature.' Profile\040documentation='Type classification of feature.'"
 * @generated
 */
public interface GmlFeatureType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes <em>Gml Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Styles</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureType_GmlFeatureStyles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes
	 * @model opposite="GmlFeatureTypes"
	 * @generated
	 */
	EList<GmlFeatureStyle> getGmlFeatureStyles();

} // GmlFeatureType
