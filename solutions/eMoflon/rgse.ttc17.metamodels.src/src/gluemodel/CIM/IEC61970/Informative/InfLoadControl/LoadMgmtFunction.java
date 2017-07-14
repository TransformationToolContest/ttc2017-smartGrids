/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLoadControl;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;

import gluemodel.CIM.IEC61970.Wires.Switch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Mgmt Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches <em>Switches</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords <em>Load Mgmt Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collective function at an end device that manages the customer load.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collective function at an end device that manages the customer load.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collective function at an end device that manages the customer load.' Profile\040documentation='A collective function at an end device that manages the customer load.'"
 * @generated
 */
public interface LoadMgmtFunction extends DeviceFunction {
	/**
	 * Returns the value of the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Over Ride</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Over Ride</em>' attribute.
	 * @see #setManualOverRide(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_ManualOverRide()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the currently active schedule is being manually over-ridden to either shed load or to limit load.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the currently active schedule is being manually over-ridden to either shed load or to limit load.'"
	 * @generated
	 */
	boolean isManualOverRide();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Over Ride</em>' attribute.
	 * @see #isManualOverRide()
	 * @generated
	 */
	void setManualOverRide(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Op</em>' attribute.
	 * @see #setIsAutoOp(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_IsAutoOp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if LoadMgmtFunction operates under automatic control, otherwise it operates under manual control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if LoadMgmtFunction operates under automatic control, otherwise it operates under manual control.'"
	 * @generated
	 */
	boolean isIsAutoOp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Op</em>' attribute.
	 * @see #isIsAutoOp()
	 * @generated
	 */
	void setIsAutoOp(boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduling Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Basis</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @see #setSchedulingBasis(LoadMgmtKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_SchedulingBasis()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The basis of Load Management scheduling used here: Time Based, Tariff Based, Remote Control and Manual Control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The basis of Load Management scheduling used here: Time Based, Tariff Based, Remote Control and Manual Control.'"
	 * @generated
	 */
	LoadMgmtKind getSchedulingBasis();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Basis</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @see #getSchedulingBasis()
	 * @generated
	 */
	void setSchedulingBasis(LoadMgmtKind value);

	/**
	 * Returns the value of the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Over Ride</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Over Ride</em>' attribute.
	 * @see #setRemoteOverRide(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_RemoteOverRide()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the currently active schedule is being remotely over-ridden to either shed load or to limit load.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the currently active schedule is being remotely over-ridden to either shed load or to limit load.'"
	 * @generated
	 */
	boolean isRemoteOverRide();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Over Ride</em>' attribute.
	 * @see #isRemoteOverRide()
	 * @generated
	 */
	void setRemoteOverRide(boolean value);

	/**
	 * Returns the value of the '<em><b>Load Status</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Status</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @see #setLoadStatus(LoadStateKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_LoadStatus()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The present state of the load being either shed (noLoad), limited (limitedLoad) or fully connected (fullLoad). This refers only to the portion of the customer load that is under control of the LoadMgmtFunction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The present state of the load being either shed (noLoad), limited (limitedLoad) or fully connected (fullLoad). This refers only to the portion of the customer load that is under control of the LoadMgmtFunction.'"
	 * @generated
	 */
	LoadStateKind getLoadStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Status</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @see #getLoadStatus()
	 * @generated
	 */
	void setLoadStatus(LoadStateKind value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.Switch#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_Switches()
	 * @see gluemodel.CIM.IEC61970.Wires.Switch#getLoadMgmtFunctions
	 * @model opposite="LoadMgmtFunctions"
	 * @generated
	 */
	EList<Switch> getSwitches();

	/**
	 * Returns the value of the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt Records</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_LoadMgmtRecords()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction
	 * @model opposite="LoadMgmtFunction"
	 * @generated
	 */
	EList<LoadMgmtRecord> getLoadMgmtRecords();

	/**
	 * Returns the value of the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over Ride Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over Ride Time Out</em>' attribute.
	 * @see #setOverRideTimeOut(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction_OverRideTimeOut()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='After a command had been received to activate the mannualOverRide state or remoteOverRideState, the normal (halted) schedule will resume after this specified time duration had elapsed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='After a command had been received to activate the mannualOverRide state or remoteOverRideState, the normal (halted) schedule will resume after this specified time duration had elapsed.'"
	 * @generated
	 */
	float getOverRideTimeOut();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Ride Time Out</em>' attribute.
	 * @see #getOverRideTimeOut()
	 * @generated
	 */
	void setOverRideTimeOut(float value);

} // LoadMgmtFunction
