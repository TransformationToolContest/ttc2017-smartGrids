/**
 */
package CIM.IEC61970.Informative.InfCore;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Authority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCore.ModelingAuthority#getModelingAuthoritySets <em>Modeling Authority Sets</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCore.InfCorePackage#getModelingAuthority()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Modeling Authority is an entity responsible for supplying and maintaining the data defining a specific set of objects in a network model.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Modeling Authority is an entity responsible for supplying and maintaining the data defining a specific set of objects in a network model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Modeling Authority is an entity responsible for supplying and maintaining the data defining a specific set of objects in a network model.' Profile\040documentation='A Modeling Authority is an entity responsible for supplying and maintaining the data defining a specific set of objects in a network model.'"
 * @generated
 */
public interface ModelingAuthority extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Modeling Authority Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority <em>Modeling Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Authority Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Authority Sets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfCore.InfCorePackage#getModelingAuthority_ModelingAuthoritySets()
	 * @see CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority
	 * @model opposite="ModelingAuthority"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Modeling Authority set supplies and maintains the data for the objects in a Modeling Authority Set.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Modeling Authority set supplies and maintains the data for the objects in a Modeling Authority Set.'"
	 * @generated
	 */
	EList<ModelingAuthoritySet> getModelingAuthoritySets();

} // ModelingAuthority
