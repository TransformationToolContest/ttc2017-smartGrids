/**
 */
package gluemodel.CIM.IEC61968.LoadControl;

import gluemodel.CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Connect Disconnect Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of remote connect disconnect function.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Details of remote connect disconnect function.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of remote connect disconnect function.' Profile\040documentation='Details of remote connect disconnect function.'"
 * @generated
 */
public interface RemoteConnectDisconnectInfo extends Element {
	/**
	 * Returns the value of the '<em><b>Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Limit</em>' attribute.
	 * @see #setPowerLimit(float)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_PowerLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Load limit above which the connect should either not take place or should cause an immediate disconnect.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Load limit above which the connect should either not take place or should cause an immediate disconnect.'"
	 * @generated
	 */
	float getPowerLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Limit</em>' attribute.
	 * @see #getPowerLimit()
	 * @generated
	 */
	void setPowerLimit(float value);

	/**
	 * Returns the value of the '<em><b>Customer Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Voltage Limit</em>' attribute.
	 * @see #setCustomerVoltageLimit(float)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_CustomerVoltageLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage limit on customer side of RCD switch above which the connect should not be made.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage limit on customer side of RCD switch above which the connect should not be made.'"
	 * @generated
	 */
	float getCustomerVoltageLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Voltage Limit</em>' attribute.
	 * @see #getCustomerVoltageLimit()
	 * @generated
	 */
	void setCustomerVoltageLimit(float value);

	/**
	 * Returns the value of the '<em><b>Energy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Limit</em>' attribute.
	 * @see #setEnergyLimit(float)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_EnergyLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limit of energy before disconnect.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit of energy before disconnect.'"
	 * @generated
	 */
	float getEnergyLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Limit</em>' attribute.
	 * @see #getEnergyLimit()
	 * @generated
	 */
	void setEnergyLimit(float value);

	/**
	 * Returns the value of the '<em><b>Is Energy Limiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Energy Limiting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Energy Limiting</em>' attribute.
	 * @see #setIsEnergyLimiting(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_IsEnergyLimiting()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the energy usage is limited and the customer will be disconnected if they go over the limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the energy usage is limited and the customer will be disconnected if they go over the limit.'"
	 * @generated
	 */
	boolean isIsEnergyLimiting();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Energy Limiting</em>' attribute.
	 * @see #isIsEnergyLimiting()
	 * @generated
	 */
	void setIsEnergyLimiting(boolean value);

	/**
	 * Returns the value of the '<em><b>Energy Usage Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Usage Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Usage Warning</em>' attribute.
	 * @see #setEnergyUsageWarning(float)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_EnergyUsageWarning()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Warning energy limit, used to trigger event code that energy usage is nearing limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Warning energy limit, used to trigger event code that energy usage is nearing limit.'"
	 * @generated
	 */
	float getEnergyUsageWarning();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Usage Warning</em>' attribute.
	 * @see #getEnergyUsageWarning()
	 * @generated
	 */
	void setEnergyUsageWarning(float value);

	/**
	 * Returns the value of the '<em><b>Needs Voltage Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Voltage Limit Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Voltage Limit Check</em>' attribute.
	 * @see #setNeedsVoltageLimitCheck(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if voltage limit must be checked to prevent connect if voltage is over the limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if voltage limit must be checked to prevent connect if voltage is over the limit.'"
	 * @generated
	 */
	boolean isNeedsVoltageLimitCheck();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Voltage Limit Check</em>' attribute.
	 * @see #isNeedsVoltageLimitCheck()
	 * @generated
	 */
	void setNeedsVoltageLimitCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Energy Usage Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Usage Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Usage Start Date Time</em>' attribute.
	 * @see #setEnergyUsageStartDateTime(Date)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Start date and time to accumulate energy for energy usage limiting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Start date and time to accumulate energy for energy usage limiting.'"
	 * @generated
	 */
	Date getEnergyUsageStartDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Usage Start Date Time</em>' attribute.
	 * @see #getEnergyUsageStartDateTime()
	 * @generated
	 */
	void setEnergyUsageStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Use Pushbutton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Pushbutton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Pushbutton</em>' attribute.
	 * @see #setUsePushbutton(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_UsePushbutton()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if pushbutton must be used for connect.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if pushbutton must be used for connect.'"
	 * @generated
	 */
	boolean isUsePushbutton();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Pushbutton</em>' attribute.
	 * @see #isUsePushbutton()
	 * @generated
	 */
	void setUsePushbutton(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Arm Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Arm Disconnect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Arm Disconnect</em>' attribute.
	 * @see #setIsArmDisconnect(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_IsArmDisconnect()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the RCD switch must be armed before a disconnect action can be initiated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the RCD switch must be armed before a disconnect action can be initiated.'"
	 * @generated
	 */
	boolean isIsArmDisconnect();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Arm Disconnect</em>' attribute.
	 * @see #isIsArmDisconnect()
	 * @generated
	 */
	void setIsArmDisconnect(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Arm Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Arm Connect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Arm Connect</em>' attribute.
	 * @see #setIsArmConnect(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_IsArmConnect()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the RCD switch must be armed before a connect action can be initiated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the RCD switch must be armed before a connect action can be initiated.'"
	 * @generated
	 */
	boolean isIsArmConnect();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Arm Connect</em>' attribute.
	 * @see #isIsArmConnect()
	 * @generated
	 */
	void setIsArmConnect(boolean value);

	/**
	 * Returns the value of the '<em><b>Needs Power Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Power Limit Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Power Limit Check</em>' attribute.
	 * @see #setNeedsPowerLimitCheck(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if load limit must be checked to issue an immediate disconnect (after a connect) if load is over the limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if load limit must be checked to issue an immediate disconnect (after a connect) if load is over the limit.'"
	 * @generated
	 */
	boolean isNeedsPowerLimitCheck();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Power Limit Check</em>' attribute.
	 * @see #isNeedsPowerLimitCheck()
	 * @generated
	 */
	void setNeedsPowerLimitCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Armed Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armed Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armed Timeout</em>' attribute.
	 * @see #setArmedTimeout(float)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo_ArmedTimeout()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Setting of the timeout elapsed time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Setting of the timeout elapsed time.'"
	 * @generated
	 */
	float getArmedTimeout();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armed Timeout</em>' attribute.
	 * @see #getArmedTimeout()
	 * @generated
	 */
	void setArmedTimeout(float value);

} // RemoteConnectDisconnectInfo
