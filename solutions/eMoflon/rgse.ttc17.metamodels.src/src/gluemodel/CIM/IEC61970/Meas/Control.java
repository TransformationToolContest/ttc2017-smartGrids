/**
 */
package gluemodel.CIM.IEC61970.Meas;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.Unit;

import gluemodel.CIM.IEC61970.SCADA.RemoteControl;

import gluemodel.CIM.IEC61970.Wires.RegulatingCondEq;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Control#getControlType <em>Control Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Control#getUnit <em>Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.' Profile\040documentation='Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.'"
 * @generated
 */
public interface Control extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation In Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation In Progress</em>' attribute.
	 * @see #setOperationInProgress(boolean)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl_OperationInProgress()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates that a client is currently sending control commands that has not completed'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates that a client is currently sending control commands that has not completed'"
	 * @generated
	 */
	boolean isOperationInProgress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation In Progress</em>' attribute.
	 * @see #isOperationInProgress()
	 * @generated
	 */
	void setOperationInProgress(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RegulatingCondEq#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Cond Eq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Cond Eq</em>' reference.
	 * @see #setRegulatingCondEq(RegulatingCondEq)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl_RegulatingCondEq()
	 * @see gluemodel.CIM.IEC61970.Wires.RegulatingCondEq#getControls
	 * @model opposite="Controls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Regulating device governed by this control output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Regulating device governed by this control output.'"
	 * @generated
	 */
	RegulatingCondEq getRegulatingCondEq();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Cond Eq</em>' reference.
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	void setRegulatingCondEq(RegulatingCondEq value);

	/**
	 * Returns the value of the '<em><b>Control Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.ControlType#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Type</em>' reference.
	 * @see #setControlType(ControlType)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl_ControlType()
	 * @see gluemodel.CIM.IEC61970.Meas.ControlType#getControls
	 * @model opposite="Controls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of Control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of Control'"
	 * @generated
	 */
	ControlType getControlType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Control#getControlType <em>Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Type</em>' reference.
	 * @see #getControlType()
	 * @generated
	 */
	void setControlType(ControlType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Unit#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl_Unit()
	 * @see gluemodel.CIM.IEC61970.Core.Unit#getControls
	 * @model opposite="Controls"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Unit for the Control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Unit for the Control.'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Control#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl_TimeStamp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The last time a control output was sent'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The last time a control output was sent'"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Remote Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Control</em>' reference.
	 * @see #setRemoteControl(RemoteControl)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getControl_RemoteControl()
	 * @see gluemodel.CIM.IEC61970.SCADA.RemoteControl#getControl
	 * @model opposite="Control"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The remote point controlling the physical actuator.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The remote point controlling the physical actuator.'"
	 * @generated
	 */
	RemoteControl getRemoteControl();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Control</em>' reference.
	 * @see #getRemoteControl()
	 * @generated
	 */
	void setRemoteControl(RemoteControl value);

} // Control
