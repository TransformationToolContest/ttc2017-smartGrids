/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.Financial.ControlAreaOperator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSubControlAreas <em>Sub Control Areas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFrequencyBiasFactor <em>Frequency Bias Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideA_TieLines <em>Side ATie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFreqSetPoint <em>Freq Set Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getControls <em>Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getInadvertentAccounts <em>Inadvertent Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideB_TieLines <em>Side BTie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getReceive_DynamicSchedules <em>Receive Dynamic Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaReserveSpec <em>Area Reserve Spec</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaControlMode <em>Area Control Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSend_DynamicSchedules <em>Send Dynamic Schedules</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A HostControlArea has a set of tie points and a set of generator controls (i.e., AGC). It also has a total load, including transmission and distribution losses.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A HostControlArea has a set of tie points and a set of generator controls (i.e., AGC). It also has a total load, including transmission and distribution losses.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A HostControlArea has a set of tie points and a set of generator controls (i.e., AGC). It also has a total load, including transmission and distribution losses.' Profile\040documentation='A HostControlArea has a set of tie points and a set of generator controls (i.e., AGC). It also has a total load, including transmission and distribution losses.'"
 * @generated
 */
public interface HostControlArea extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Sub Control Areas</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getHostControlArea <em>Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Control Areas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Control Areas</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_SubControlAreas()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getHostControlArea
	 * @model opposite="HostControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The interchange area  may operate as a control area'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The interchange area  may operate as a control area'"
	 * @generated
	 */
	EList<SubControlArea> getSubControlAreas();

	/**
	 * Returns the value of the '<em><b>Frequency Bias Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Bias Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Bias Factor</em>' attribute.
	 * @see #setFrequencyBiasFactor(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_FrequencyBiasFactor()
	 * @model dataType="gluemodel.CIM.FreqBiasFactor" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control area\'s frequency bias factor, in active power per frequency, for automatic generation control (AGC)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area\'s frequency bias factor, in active power per frequency, for automatic generation control (AGC)'"
	 * @generated
	 */
	Object getFrequencyBiasFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFrequencyBiasFactor <em>Frequency Bias Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Bias Factor</em>' attribute.
	 * @see #getFrequencyBiasFactor()
	 * @generated
	 */
	void setFrequencyBiasFactor(Object value);

	/**
	 * Returns the value of the '<em><b>Side ATie Lines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_HostControlArea <em>Side AHost Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side ATie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side ATie Lines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_SideA_TieLines()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_HostControlArea
	 * @model opposite="SideA_HostControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A HostControlArea can have zero or more tie lines.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A HostControlArea can have zero or more tie lines.'"
	 * @generated
	 */
	EList<TieLine> getSideA_TieLines();

	/**
	 * Returns the value of the '<em><b>Freq Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freq Set Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq Set Point</em>' attribute.
	 * @see #setFreqSetPoint(float)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_FreqSetPoint()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Frequency" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The present power system frequency set point for automatic generation control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The present power system frequency set point for automatic generation control'"
	 * @generated
	 */
	float getFreqSetPoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getFreqSetPoint <em>Freq Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq Set Point</em>' attribute.
	 * @see #getFreqSetPoint()
	 * @generated
	 */
	void setFreqSetPoint(float value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.ControlAreaOperator#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference.
	 * @see #setControls(ControlAreaOperator)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_Controls()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.ControlAreaOperator#getControlledBy
	 * @model opposite="ControlledBy"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ControlAreaCompany controls a ControlArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ControlAreaCompany controls a ControlArea.'"
	 * @generated
	 */
	ControlAreaOperator getControls();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getControls <em>Controls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls</em>' reference.
	 * @see #getControls()
	 * @generated
	 */
	void setControls(ControlAreaOperator value);

	/**
	 * Returns the value of the '<em><b>Inadvertent Accounts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount#getHostControlArea <em>Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inadvertent Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inadvertent Accounts</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_InadvertentAccounts()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount#getHostControlArea
	 * @model opposite="HostControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area can have one or more net inadvertent interchange accounts'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area can have one or more net inadvertent interchange accounts'"
	 * @generated
	 */
	EList<InadvertentAccount> getInadvertentAccounts();

	/**
	 * Returns the value of the '<em><b>Side BTie Lines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_HostControlArea <em>Side BHost Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side BTie Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side BTie Lines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_SideB_TieLines()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_HostControlArea
	 * @model opposite="SideB_HostControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A HostControlArea can have zero or more tie lines.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A HostControlArea can have zero or more tie lines.'"
	 * @generated
	 */
	EList<TieLine> getSideB_TieLines();

	/**
	 * Returns the value of the '<em><b>Receive Dynamic Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getReceive_HostControlArea <em>Receive Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Dynamic Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Dynamic Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_Receive_DynamicSchedules()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getReceive_HostControlArea
	 * @model opposite="Receive_HostControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area can receive dynamic schedules from other control areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area can receive dynamic schedules from other control areas'"
	 * @generated
	 */
	EList<DynamicSchedule> getReceive_DynamicSchedules();

	/**
	 * Returns the value of the '<em><b>Area Reserve Spec</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getHostControlAreas <em>Host Control Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Reserve Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Reserve Spec</em>' reference.
	 * @see #setAreaReserveSpec(AreaReserveSpec)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_AreaReserveSpec()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getHostControlAreas
	 * @model opposite="HostControlAreas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area has one or more area reserve specifications'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area has one or more area reserve specifications'"
	 * @generated
	 */
	AreaReserveSpec getAreaReserveSpec();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaReserveSpec <em>Area Reserve Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Reserve Spec</em>' reference.
	 * @see #getAreaReserveSpec()
	 * @generated
	 */
	void setAreaReserveSpec(AreaReserveSpec value);

	/**
	 * Returns the value of the '<em><b>Area Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode
	 * @see #setAreaControlMode(AreaControlMode)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_AreaControlMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The area\'s present control mode: (CF = constant frequency) or (CTL = constant tie-line) or (TLB = tie-line bias) or (OFF = off control)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The area\'s present control mode: (CF = constant frequency) or (CTL = constant tie-line) or (TLB = tie-line bias) or (OFF = off control)'"
	 * @generated
	 */
	AreaControlMode getAreaControlMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaControlMode <em>Area Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode
	 * @see #getAreaControlMode()
	 * @generated
	 */
	void setAreaControlMode(AreaControlMode value);

	/**
	 * Returns the value of the '<em><b>Send Dynamic Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getSend_HostControlArea <em>Send Host Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Dynamic Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Dynamic Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getHostControlArea_Send_DynamicSchedules()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getSend_HostControlArea
	 * @model opposite="Send_HostControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area can send dynamic schedules to other control areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area can send dynamic schedules to other control areas'"
	 * @generated
	 */
	EList<DynamicSchedule> getSend_DynamicSchedules();

} // HostControlArea
