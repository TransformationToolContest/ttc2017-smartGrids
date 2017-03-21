/**
 */
package CIM.IEC61970.Protection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#isInverseTimeFlag <em>Inverse Time Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A device that checks current flow values in any direction or designated direction'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A device that checks current flow values in any direction or designated direction'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A device that checks current flow values in any direction or designated direction' Profile\040documentation='A device that checks current flow values in any direction or designated direction'"
 * @generated
 */
public interface CurrentRelay extends ProtectionEquipment {
	/**
	 * Returns the value of the '<em><b>Time Delay1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Delay1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Delay1</em>' attribute.
	 * @see #setTimeDelay1(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_TimeDelay1()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Inverse time delay #1 for current limit #1'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Inverse time delay #1 for current limit #1'"
	 * @generated
	 */
	float getTimeDelay1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Delay1</em>' attribute.
	 * @see #getTimeDelay1()
	 * @generated
	 */
	void setTimeDelay1(float value);

	/**
	 * Returns the value of the '<em><b>Time Delay2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Delay2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Delay2</em>' attribute.
	 * @see #setTimeDelay2(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_TimeDelay2()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Inverse time delay #2 for current limit #2'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Inverse time delay #2 for current limit #2'"
	 * @generated
	 */
	float getTimeDelay2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Delay2</em>' attribute.
	 * @see #getTimeDelay2()
	 * @generated
	 */
	void setTimeDelay2(float value);

	/**
	 * Returns the value of the '<em><b>Time Delay3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Delay3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Delay3</em>' attribute.
	 * @see #setTimeDelay3(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_TimeDelay3()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Inverse time delay #3 for current limit #3'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Inverse time delay #3 for current limit #3'"
	 * @generated
	 */
	float getTimeDelay3();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Delay3</em>' attribute.
	 * @see #getTimeDelay3()
	 * @generated
	 */
	void setTimeDelay3(float value);

	/**
	 * Returns the value of the '<em><b>Inverse Time Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Time Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Time Flag</em>' attribute.
	 * @see #setInverseTimeFlag(boolean)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_InverseTimeFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set true if the current relay has inverse time characteristic.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set true if the current relay has inverse time characteristic.'"
	 * @generated
	 */
	boolean isInverseTimeFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#isInverseTimeFlag <em>Inverse Time Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Time Flag</em>' attribute.
	 * @see #isInverseTimeFlag()
	 * @generated
	 */
	void setInverseTimeFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Current Limit3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Limit3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Limit3</em>' attribute.
	 * @see #setCurrentLimit3(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_CurrentLimit3()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current limit #3 for inverse time pickup'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current limit #3 for inverse time pickup'"
	 * @generated
	 */
	float getCurrentLimit3();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Limit3</em>' attribute.
	 * @see #getCurrentLimit3()
	 * @generated
	 */
	void setCurrentLimit3(float value);

	/**
	 * Returns the value of the '<em><b>Current Limit2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Limit2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Limit2</em>' attribute.
	 * @see #setCurrentLimit2(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_CurrentLimit2()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current limit #2 for inverse time pickup'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current limit #2 for inverse time pickup'"
	 * @generated
	 */
	float getCurrentLimit2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Limit2</em>' attribute.
	 * @see #getCurrentLimit2()
	 * @generated
	 */
	void setCurrentLimit2(float value);

	/**
	 * Returns the value of the '<em><b>Current Limit1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Limit1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Limit1</em>' attribute.
	 * @see #setCurrentLimit1(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getCurrentRelay_CurrentLimit1()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current limit #1 for inverse time pickup'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current limit #1 for inverse time pickup'"
	 * @generated
	 */
	float getCurrentLimit1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Limit1</em>' attribute.
	 * @see #getCurrentLimit1()
	 * @generated
	 */
	void setCurrentLimit1(float value);

} // CurrentRelay
