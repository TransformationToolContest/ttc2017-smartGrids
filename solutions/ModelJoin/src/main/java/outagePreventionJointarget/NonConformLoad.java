/**
 */
package outagePreventionJointarget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.NonConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getNonConformLoad()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepsubtype' order='20'"
 * @generated
 */
public interface NonConformLoad extends EnergyConsumer {
	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(NonConformLoadGroup)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getNonConformLoad_LoadGroup()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Group of this ConformLoad.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Group of this ConformLoad.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	NonConformLoadGroup getLoadGroup();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.NonConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	void setLoadGroup(NonConformLoadGroup value);

} // NonConformLoad
