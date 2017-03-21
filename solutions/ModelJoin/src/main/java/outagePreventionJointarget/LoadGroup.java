/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLoadGroup()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepsupertype' order='16'"
 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepsupertype' order='22'"
 * @generated
 */
public interface LoadGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Load Area</em>' reference.
	 * @see #setSubLoadArea(SubLoadArea)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLoadGroup_SubLoadArea()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SubLoadArea where the Loadgroup belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubLoadArea where the Loadgroup belongs.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	SubLoadArea getSubLoadArea();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Load Area</em>' reference.
	 * @see #getSubLoadArea()
	 * @generated
	 */
	void setSubLoadArea(SubLoadArea value);

} // LoadGroup
