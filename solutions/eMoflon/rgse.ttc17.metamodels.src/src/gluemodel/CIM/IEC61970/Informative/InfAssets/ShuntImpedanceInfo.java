/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Impedance Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of a shunt impedance.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of a shunt impedance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of a shunt impedance.' Profile\040documentation='Properties of a shunt impedance.'"
 * @generated
 */
public interface ShuntImpedanceInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Low Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Voltage Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Voltage Override</em>' attribute.
	 * @see #setLowVoltageOverride(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_LowVoltageOverride()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For locally controlled shunt impedances which have a voltage override feature, the low voltage override value. If the voltage is below this value, the shunt impedance will be turned on regardless of the other local controller settings.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For locally controlled shunt impedances which have a voltage override feature, the low voltage override value. If the voltage is below this value, the shunt impedance will be turned on regardless of the other local controller settings.'"
	 * @generated
	 */
	float getLowVoltageOverride();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Voltage Override</em>' attribute.
	 * @see #getLowVoltageOverride()
	 * @generated
	 */
	void setLowVoltageOverride(float value);

	/**
	 * Returns the value of the '<em><b>Cell Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Size</em>' attribute.
	 * @see #setCellSize(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_CellSize()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The size of the individual units that make up the bank.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The size of the individual units that make up the bank.'"
	 * @generated
	 */
	float getCellSize();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Size</em>' attribute.
	 * @see #getCellSize()
	 * @generated
	 */
	void setCellSize(float value);

	/**
	 * Returns the value of the '<em><b>High Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Voltage Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Voltage Override</em>' attribute.
	 * @see #setHighVoltageOverride(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_HighVoltageOverride()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For locally controlled shunt impedances which have a voltage override feature, the high voltage override value. If the voltage is above this value, the shunt impedance will be turned off regardless of the other local controller settings.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For locally controlled shunt impedances which have a voltage override feature, the high voltage override value. If the voltage is above this value, the shunt impedance will be turned off regardless of the other local controller settings.'"
	 * @generated
	 */
	float getHighVoltageOverride();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Voltage Override</em>' attribute.
	 * @see #getHighVoltageOverride()
	 * @generated
	 */
	void setHighVoltageOverride(float value);

	/**
	 * Returns the value of the '<em><b>Reg Branch Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Branch Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Branch Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @see #setRegBranchKind(RegulationBranchKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_RegBranchKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(For VAR, amp, or power factor locally controlled shunt impedances) Kind of regulation branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(For VAR, amp, or power factor locally controlled shunt impedances) Kind of regulation branch.'"
	 * @generated
	 */
	RegulationBranchKind getRegBranchKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Branch Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @see #getRegBranchKind()
	 * @generated
	 */
	void setRegBranchKind(RegulationBranchKind value);

	/**
	 * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Open</em>' attribute.
	 * @see #setNormalOpen(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_NormalOpen()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if open is normal status for a fixed capacitor bank, otherwise normal status is closed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if open is normal status for a fixed capacitor bank, otherwise normal status is closed.'"
	 * @generated
	 */
	boolean isNormalOpen();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Open</em>' attribute.
	 * @see #isNormalOpen()
	 * @generated
	 */
	void setNormalOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Shunt Compensator Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Compensator Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Compensator Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_ShuntCompensatorInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo
	 * @model opposite="ShuntImpedanceInfo"
	 * @generated
	 */
	EList<ShuntCompensatorInfo> getShuntCompensatorInfos();

	/**
	 * Returns the value of the '<em><b>Reg Branch End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Branch End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Branch End</em>' attribute.
	 * @see #setRegBranchEnd(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_RegBranchEnd()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For VAR, amp, or power factor locally controlled shunt impedances, the end of the branch that is regulated. The field has the following values: from side, to side, and tertiary (only if the branch is a transformer).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For VAR, amp, or power factor locally controlled shunt impedances, the end of the branch that is regulated. The field has the following values: from side, to side, and tertiary (only if the branch is a transformer).'"
	 * @generated
	 */
	int getRegBranchEnd();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Branch End</em>' attribute.
	 * @see #getRegBranchEnd()
	 * @generated
	 */
	void setRegBranchEnd(int value);

	/**
	 * Returns the value of the '<em><b>VReg Line Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VReg Line Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VReg Line Line</em>' attribute.
	 * @see #setVRegLineLine(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_VRegLineLine()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if regulated voltages are measured line to line, otherwise they are measured line to ground.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if regulated voltages are measured line to line, otherwise they are measured line to ground.'"
	 * @generated
	 */
	boolean isVRegLineLine();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VReg Line Line</em>' attribute.
	 * @see #isVRegLineLine()
	 * @generated
	 */
	void setVRegLineLine(boolean value);

	/**
	 * Returns the value of the '<em><b>Switch Operation Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Operation Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Operation Cycle</em>' attribute.
	 * @see #setSwitchOperationCycle(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_SwitchOperationCycle()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Hours" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time interval between consecutive switching operations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time interval between consecutive switching operations.'"
	 * @generated
	 */
	float getSwitchOperationCycle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Operation Cycle</em>' attribute.
	 * @see #getSwitchOperationCycle()
	 * @generated
	 */
	void setSwitchOperationCycle(float value);

	/**
	 * Returns the value of the '<em><b>Local Off Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Off Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Off Level</em>' attribute.
	 * @see #setLocalOffLevel(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_LocalOffLevel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Upper control setting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Upper control setting.'"
	 * @generated
	 */
	String getLocalOffLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Off Level</em>' attribute.
	 * @see #getLocalOffLevel()
	 * @generated
	 */
	void setLocalOffLevel(String value);

	/**
	 * Returns the value of the '<em><b>Sensing Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensing Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensing Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #setSensingPhaseCode(PhaseCode)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_SensingPhaseCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phases that are measured for controlling the device.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phases that are measured for controlling the device.'"
	 * @generated
	 */
	PhaseCode getSensingPhaseCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #getSensingPhaseCode()
	 * @generated
	 */
	void setSensingPhaseCode(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>Local Control Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Control Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Control Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @see #setLocalControlKind(ShuntImpedanceLocalControlKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_LocalControlKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of local controller.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of local controller.'"
	 * @generated
	 */
	ShuntImpedanceLocalControlKind getLocalControlKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Control Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @see #getLocalControlKind()
	 * @generated
	 */
	void setLocalControlKind(ShuntImpedanceLocalControlKind value);

	/**
	 * Returns the value of the '<em><b>Branch Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Direct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Direct</em>' attribute.
	 * @see #setBranchDirect(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_BranchDirect()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For VAR, amp, or power factor locally controlled shunt impedances, the flow direction: in, out.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For VAR, amp, or power factor locally controlled shunt impedances, the flow direction: in, out.'"
	 * @generated
	 */
	int getBranchDirect();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Direct</em>' attribute.
	 * @see #getBranchDirect()
	 * @generated
	 */
	void setBranchDirect(int value);

	/**
	 * Returns the value of the '<em><b>Max Switch Operation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Switch Operation Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Switch Operation Count</em>' attribute.
	 * @see #setMaxSwitchOperationCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_MaxSwitchOperationCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='IdmsShuntImpedanceData.maxNumSwitchOps'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='IdmsShuntImpedanceData.maxNumSwitchOps'"
	 * @generated
	 */
	int getMaxSwitchOperationCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Switch Operation Count</em>' attribute.
	 * @see #getMaxSwitchOperationCount()
	 * @generated
	 */
	void setMaxSwitchOperationCount(int value);

	/**
	 * Returns the value of the '<em><b>Local Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Override</em>' attribute.
	 * @see #setLocalOverride(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_LocalOverride()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the locally controlled capacitor has voltage override capability.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the locally controlled capacitor has voltage override capability.'"
	 * @generated
	 */
	boolean isLocalOverride();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Override</em>' attribute.
	 * @see #isLocalOverride()
	 * @generated
	 */
	void setLocalOverride(boolean value);

	/**
	 * Returns the value of the '<em><b>Local On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local On Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local On Level</em>' attribute.
	 * @see #setLocalOnLevel(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_LocalOnLevel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Lower control setting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lower control setting.'"
	 * @generated
	 */
	String getLocalOnLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local On Level</em>' attribute.
	 * @see #getLocalOnLevel()
	 * @generated
	 */
	void setLocalOnLevel(String value);

	/**
	 * Returns the value of the '<em><b>Reg Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Branch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Branch</em>' attribute.
	 * @see #setRegBranch(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_RegBranch()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For VAR, amp, or power factor locally controlled shunt impedances, the index of the regulation branch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For VAR, amp, or power factor locally controlled shunt impedances, the index of the regulation branch.'"
	 * @generated
	 */
	String getRegBranch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Branch</em>' attribute.
	 * @see #getRegBranch()
	 * @generated
	 */
	void setRegBranch(String value);

	/**
	 * Returns the value of the '<em><b>Control Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @see #setControlKind(ShuntImpedanceControlKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo_ControlKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of control (if any).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of control (if any).'"
	 * @generated
	 */
	ShuntImpedanceControlKind getControlKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @see #getControlKind()
	 * @generated
	 */
	void setControlKind(ShuntImpedanceControlKind value);

} // ShuntImpedanceInfo
