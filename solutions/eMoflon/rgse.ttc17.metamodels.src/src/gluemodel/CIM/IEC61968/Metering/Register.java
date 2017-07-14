/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Register#getDeviceFunction <em>Device Function</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getRegister()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Display for quantity that is metered on an end device such as a meter.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Display for quantity that is metered on an end device such as a meter.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Display for quantity that is metered on an end device such as a meter.' Profile\040documentation='Display for quantity that is metered on an end device such as a meter.'"
 * @generated
 */
public interface Register extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Left Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Digit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Digit Count</em>' attribute.
	 * @see #setLeftDigitCount(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getRegister_LeftDigitCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of digits (dials on a mechanical meter) to the left of the decimal place; default is 5.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of digits (dials on a mechanical meter) to the left of the decimal place; default is 5.'"
	 * @generated
	 */
	int getLeftDigitCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Digit Count</em>' attribute.
	 * @see #getLeftDigitCount()
	 * @generated
	 */
	void setLeftDigitCount(int value);

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getRegister_ReadingType()
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getRegister
	 * @model opposite="Register"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reading type for values displayed by this register.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reading type for values displayed by this register.'"
	 * @generated
	 */
	ReadingType getReadingType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Type</em>' reference.
	 * @see #getReadingType()
	 * @generated
	 */
	void setReadingType(ReadingType value);

	/**
	 * Returns the value of the '<em><b>Device Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Function</em>' reference.
	 * @see #setDeviceFunction(DeviceFunction)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getRegister_DeviceFunction()
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getRegisters
	 * @model opposite="Registers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Device function metering quantities displayed by this register.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Device function metering quantities displayed by this register.'"
	 * @generated
	 */
	DeviceFunction getDeviceFunction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Register#getDeviceFunction <em>Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Function</em>' reference.
	 * @see #getDeviceFunction()
	 * @generated
	 */
	void setDeviceFunction(DeviceFunction value);

	/**
	 * Returns the value of the '<em><b>Right Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Digit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Digit Count</em>' attribute.
	 * @see #setRightDigitCount(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getRegister_RightDigitCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of digits (dials on a mechanical meter) to the right of the decimal place.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of digits (dials on a mechanical meter) to the right of the decimal place.'"
	 * @generated
	 */
	int getRightDigitCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Digit Count</em>' attribute.
	 * @see #getRightDigitCount()
	 * @generated
	 */
	void setRightDigitCount(int value);

} // Register
