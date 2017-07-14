/**
 */
package gluemodel.CIM.IEC61968.LoadControl;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;

import gluemodel.CIM.IEC61970.Wires.Switch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Disconnect Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches <em>Switches</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A function that will disconnect or reconnect the customer\'s load under defined conditions.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A function that will disconnect or reconnect the customer\'s load under defined conditions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A function that will disconnect or reconnect the customer\'s load under defined conditions.' Profile\040documentation='A function that will disconnect or reconnect the customer\'s load under defined conditions.'"
 * @generated
 */
public interface ConnectDisconnectFunction extends DeviceFunction {
	/**
	 * Returns the value of the '<em><b>Is Delayed Discon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Delayed Discon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Delayed Discon</em>' attribute.
	 * @see #setIsDelayedDiscon(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_IsDelayedDiscon()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If set true, the switch may disconnect the service at the end of a specified time delay after the disconnect signal had been given. If set false, the switch may disconnect the service immediately after the disconnect signal had been given. This is typically the case for over current circuit-breakers which are classified as either instantaneous or slow acting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If set true, the switch may disconnect the service at the end of a specified time delay after the disconnect signal had been given. If set false, the switch may disconnect the service immediately after the disconnect signal had been given. This is typically the case for over current circuit-breakers which are classified as either instantaneous or slow acting.'"
	 * @generated
	 */
	boolean isIsDelayedDiscon();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Delayed Discon</em>' attribute.
	 * @see #isIsDelayedDiscon()
	 * @generated
	 */
	void setIsDelayedDiscon(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Local Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local Auto Recon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local Auto Recon Op</em>' attribute.
	 * @see #setIsLocalAutoReconOp(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_IsLocalAutoReconOp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If set true and if reconnection can be operated locally, then the operation happens automatically. Otherwise, it is manually.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If set true and if reconnection can be operated locally, then the operation happens automatically. Otherwise, it is manually.'"
	 * @generated
	 */
	boolean isIsLocalAutoReconOp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local Auto Recon Op</em>' attribute.
	 * @see #isIsLocalAutoReconOp()
	 * @generated
	 */
	void setIsLocalAutoReconOp(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Local Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local Auto Discon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local Auto Discon Op</em>' attribute.
	 * @see #setIsLocalAutoDisconOp(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_IsLocalAutoDisconOp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if disconnection can be operated locally) If set true, the operation happens automatically, otherwise it happens manually.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if disconnection can be operated locally) If set true, the operation happens automatically, otherwise it happens manually.'"
	 * @generated
	 */
	boolean isIsLocalAutoDisconOp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local Auto Discon Op</em>' attribute.
	 * @see #isIsLocalAutoDisconOp()
	 * @generated
	 */
	void setIsLocalAutoDisconOp(boolean value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_Switches()
	 * @see gluemodel.CIM.IEC61970.Wires.Switch#getConnectDisconnectFunctions
	 * @model opposite="ConnectDisconnectFunctions"
	 * @generated
	 */
	EList<Switch> getSwitches();

	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see #setIsConnected(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_IsConnected()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this function is in the connected state.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this function is in the connected state.'"
	 * @generated
	 */
	boolean isIsConnected();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' attribute.
	 * @see #isIsConnected()
	 * @generated
	 */
	void setIsConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Rcd Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcd Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcd Info</em>' reference.
	 * @see #setRcdInfo(RemoteConnectDisconnectInfo)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_RcdInfo()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information on remote connect disconnect switch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information on remote connect disconnect switch.'"
	 * @generated
	 */
	RemoteConnectDisconnectInfo getRcdInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcd Info</em>' reference.
	 * @see #getRcdInfo()
	 * @generated
	 */
	void setRcdInfo(RemoteConnectDisconnectInfo value);

	/**
	 * Returns the value of the '<em><b>Is Remote Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remote Auto Discon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remote Auto Discon Op</em>' attribute.
	 * @see #setIsRemoteAutoDisconOp(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_IsRemoteAutoDisconOp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If set true and if disconnection can be operated remotely, then the operation happens automatically. If set false and if disconnection can be operated remotely, then the operation happens manually.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If set true and if disconnection can be operated remotely, then the operation happens automatically. If set false and if disconnection can be operated remotely, then the operation happens manually.'"
	 * @generated
	 */
	boolean isIsRemoteAutoDisconOp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remote Auto Discon Op</em>' attribute.
	 * @see #isIsRemoteAutoDisconOp()
	 * @generated
	 */
	void setIsRemoteAutoDisconOp(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Count</em>' attribute.
	 * @see #setEventCount(int)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_EventCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Running cumulative count of (connect or disconnect) events, for the lifetime of this function or until the value is cleared.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Running cumulative count of (connect or disconnect) events, for the lifetime of this function or until the value is cleared.'"
	 * @generated
	 */
	int getEventCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Count</em>' attribute.
	 * @see #getEventCount()
	 * @generated
	 */
	void setEventCount(int value);

	/**
	 * Returns the value of the '<em><b>Is Remote Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remote Auto Recon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remote Auto Recon Op</em>' attribute.
	 * @see #setIsRemoteAutoReconOp(boolean)
	 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction_IsRemoteAutoReconOp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If set true and if reconnection can be operated remotely, then the operation happens automatically. If false and if reconnection can be operated remotely, then the operation happens manually.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If set true and if reconnection can be operated remotely, then the operation happens automatically. If false and if reconnection can be operated remotely, then the operation happens manually.'"
	 * @generated
	 */
	boolean isIsRemoteAutoReconOp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remote Auto Recon Op</em>' attribute.
	 * @see #isIsRemoteAutoReconOp()
	 * @generated
	 */
	void setIsRemoteAutoReconOp(boolean value);

} // ConnectDisconnectFunction
