/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61968.Assets.AssetFunction;

import CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.DeviceFunction#getComEquipmentAsset <em>Com Equipment Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.DeviceFunction#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.DeviceFunction#getEndDeviceAsset <em>End Device Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.DeviceFunction#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.DeviceFunction#getRegisters <em>Registers</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getDeviceFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Function performed by a device such as a meter, communication equipment, controllers, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Function performed by a device such as a meter, communication equipment, controllers, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Function performed by a device such as a meter, communication equipment, controllers, etc.' Profile\040documentation='Function performed by a device such as a meter, communication equipment, controllers, etc.'"
 * @generated
 */
public interface DeviceFunction extends AssetFunction {
	/**
	 * Returns the value of the '<em><b>Com Equipment Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo#getDeviceFunctions <em>Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Equipment Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Equipment Asset</em>' reference.
	 * @see #setComEquipmentAsset(ComEquipmentInfo)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getDeviceFunction_ComEquipmentAsset()
	 * @see CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo#getDeviceFunctions
	 * @model opposite="DeviceFunctions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Communication equipment asset performing this device function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Communication equipment asset performing this device function.'"
	 * @generated
	 */
	ComEquipmentInfo getComEquipmentAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.DeviceFunction#getComEquipmentAsset <em>Com Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Equipment Asset</em>' reference.
	 * @see #getComEquipmentAsset()
	 * @generated
	 */
	void setComEquipmentAsset(ComEquipmentInfo value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getDeviceFunction_Disabled()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the device function is disabled (deactivated). Default is false (i.e., function is enabled).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the device function is disabled (deactivated). Default is false (i.e., function is enabled).'"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.DeviceFunction#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>End Device Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getDeviceFunctions <em>Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Asset</em>' reference.
	 * @see #setEndDeviceAsset(EndDeviceAsset)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getDeviceFunction_EndDeviceAsset()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getDeviceFunctions
	 * @model opposite="DeviceFunctions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='End device asset that performs this function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='End device asset that performs this function.'"
	 * @generated
	 */
	EndDeviceAsset getEndDeviceAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.DeviceFunction#getEndDeviceAsset <em>End Device Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Asset</em>' reference.
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	void setEndDeviceAsset(EndDeviceAsset value);

	/**
	 * Returns the value of the '<em><b>End Device Events</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.EndDeviceEvent}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceEvent#getDeviceFunction <em>Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Events</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getDeviceFunction_EndDeviceEvents()
	 * @see CIM.IEC61968.Metering.EndDeviceEvent#getDeviceFunction
	 * @model opposite="DeviceFunction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All events reported by this device function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All events reported by this device function.'"
	 * @generated
	 */
	EList<EndDeviceEvent> getEndDeviceEvents();

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.Register}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.Register#getDeviceFunction <em>Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getDeviceFunction_Registers()
	 * @see CIM.IEC61968.Metering.Register#getDeviceFunction
	 * @model opposite="DeviceFunction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All registers for quantities metered by this device function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All registers for quantities metered by this device function.'"
	 * @generated
	 */
	EList<Register> getRegisters();

} // DeviceFunction
