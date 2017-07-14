/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCore;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Authority Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getIdentifiedObjects <em>Identified Objects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority <em>Modeling Authority</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCore.InfCorePackage#getModelingAuthoritySet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Modeling Authority Set is a group of objects in a network model where the data is supplied and maintained by the same Modeling Authority.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Modeling Authority Set is a group of objects in a network model where the data is supplied and maintained by the same Modeling Authority.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Modeling Authority Set is a group of objects in a network model where the data is supplied and maintained by the same Modeling Authority.' Profile\040documentation='A Modeling Authority Set is a group of objects in a network model where the data is supplied and maintained by the same Modeling Authority.'"
 * @generated
 */
public interface ModelingAuthoritySet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Identified Objects</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.IdentifiedObject}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identified Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Objects</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCore.InfCorePackage#getModelingAuthoritySet_IdentifiedObjects()
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet
	 * @model opposite="ModelingAuthoritySet"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An IdentifiedObject belongs to a Modeling Authority Set for purposes of defining a group of data maintained by the same Modeling Authority.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An IdentifiedObject belongs to a Modeling Authority Set for purposes of defining a group of data maintained by the same Modeling Authority.'"
	 * @generated
	 */
	EList<IdentifiedObject> getIdentifiedObjects();

	/**
	 * Returns the value of the '<em><b>Modeling Authority</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthority#getModelingAuthoritySets <em>Modeling Authority Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Authority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Authority</em>' reference.
	 * @see #setModelingAuthority(ModelingAuthority)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCore.InfCorePackage#getModelingAuthoritySet_ModelingAuthority()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthority#getModelingAuthoritySets
	 * @model opposite="ModelingAuthoritySets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Modeling Authority set supplies and maintains the data for the objects in a Modeling Authority Set.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Modeling Authority set supplies and maintains the data for the objects in a Modeling Authority Set.'"
	 * @generated
	 */
	ModelingAuthority getModelingAuthority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority <em>Modeling Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Authority</em>' reference.
	 * @see #getModelingAuthority()
	 * @generated
	 */
	void setModelingAuthority(ModelingAuthority value);

} // ModelingAuthoritySet
