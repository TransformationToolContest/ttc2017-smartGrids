/**
 */
package outagePreventionJointarget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.ConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getConformLoad()
 * @model
 * @generated
 */
public interface ConformLoad extends EnergyConsumer {
	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(ConformLoadGroup)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getConformLoad_LoadGroup()
	 * @model
	 * @generated
	 */
	ConformLoadGroup getLoadGroup();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.ConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	void setLoadGroup(ConformLoadGroup value);

} // ConformLoad
