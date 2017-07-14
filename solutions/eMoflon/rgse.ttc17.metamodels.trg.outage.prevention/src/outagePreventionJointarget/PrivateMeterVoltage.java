/**
 */
package outagePreventionJointarget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Meter Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.PrivateMeterVoltage#getID <em>ID</em>}</li>
 *   <li>{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageA <em>Voltage A</em>}</li>
 *   <li>{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageB <em>Voltage B</em>}</li>
 *   <li>{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageC <em>Voltage C</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPrivateMeterVoltage()
 * @model
 * @generated
 */
public interface PrivateMeterVoltage extends Asset, EndDeviceAsset {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPrivateMeterVoltage_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PrivateMeterVoltage#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage A</em>' attribute.
	 * @see #setVoltageA(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPrivateMeterVoltage_VoltageA()
	 * @model
	 * @generated
	 */
	double getVoltageA();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageA <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage A</em>' attribute.
	 * @see #getVoltageA()
	 * @generated
	 */
	void setVoltageA(double value);

	/**
	 * Returns the value of the '<em><b>Voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage B</em>' attribute.
	 * @see #setVoltageB(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPrivateMeterVoltage_VoltageB()
	 * @model
	 * @generated
	 */
	double getVoltageB();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageB <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage B</em>' attribute.
	 * @see #getVoltageB()
	 * @generated
	 */
	void setVoltageB(double value);

	/**
	 * Returns the value of the '<em><b>Voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage C</em>' attribute.
	 * @see #setVoltageC(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPrivateMeterVoltage_VoltageC()
	 * @model
	 * @generated
	 */
	double getVoltageC();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageC <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage C</em>' attribute.
	 * @see #getVoltageC()
	 * @generated
	 */
	void setVoltageC(double value);

} // PrivateMeterVoltage
