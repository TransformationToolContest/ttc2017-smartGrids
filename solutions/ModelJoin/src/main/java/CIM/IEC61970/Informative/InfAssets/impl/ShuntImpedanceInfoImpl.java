/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Core.PhaseCode;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.RegulationBranchKind;
import CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo;
import CIM.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind;
import CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo;
import CIM.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Impedance Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getLowVoltageOverride <em>Low Voltage Override</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getCellSize <em>Cell Size</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getHighVoltageOverride <em>High Voltage Override</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getRegBranchKind <em>Reg Branch Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getRegBranchEnd <em>Reg Branch End</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#isVRegLineLine <em>VReg Line Line</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getSwitchOperationCycle <em>Switch Operation Cycle</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getLocalOffLevel <em>Local Off Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getSensingPhaseCode <em>Sensing Phase Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getLocalControlKind <em>Local Control Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getBranchDirect <em>Branch Direct</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#isLocalOverride <em>Local Override</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getLocalOnLevel <em>Local On Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getRegBranch <em>Reg Branch</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ShuntImpedanceInfoImpl#getControlKind <em>Control Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntImpedanceInfoImpl extends ElectricalInfoImpl implements ShuntImpedanceInfo {
	/**
	 * The default value of the '{@link #getLowVoltageOverride() <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_VOLTAGE_OVERRIDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowVoltageOverride() <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected float lowVoltageOverride = LOW_VOLTAGE_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellSize() <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSize()
	 * @generated
	 * @ordered
	 */
	protected static final float CELL_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCellSize() <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSize()
	 * @generated
	 * @ordered
	 */
	protected float cellSize = CELL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighVoltageOverride() <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_VOLTAGE_OVERRIDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighVoltageOverride() <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected float highVoltageOverride = HIGH_VOLTAGE_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegBranchKind() <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchKind()
	 * @generated
	 * @ordered
	 */
	protected static final RegulationBranchKind REG_BRANCH_KIND_EDEFAULT = RegulationBranchKind.SECTIONNER;

	/**
	 * The cached value of the '{@link #getRegBranchKind() <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchKind()
	 * @generated
	 * @ordered
	 */
	protected RegulationBranchKind regBranchKind = REG_BRANCH_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMAL_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpen = NORMAL_OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShuntCompensatorInfos() <em>Shunt Compensator Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntCompensatorInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ShuntCompensatorInfo> shuntCompensatorInfos;

	/**
	 * The default value of the '{@link #getRegBranchEnd() <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int REG_BRANCH_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegBranchEnd() <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchEnd()
	 * @generated
	 * @ordered
	 */
	protected int regBranchEnd = REG_BRANCH_END_EDEFAULT;

	/**
	 * The default value of the '{@link #isVRegLineLine() <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVRegLineLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VREG_LINE_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVRegLineLine() <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVRegLineLine()
	 * @generated
	 * @ordered
	 */
	protected boolean vRegLineLine = VREG_LINE_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchOperationCycle() <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOperationCycle()
	 * @generated
	 * @ordered
	 */
	protected static final float SWITCH_OPERATION_CYCLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSwitchOperationCycle() <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOperationCycle()
	 * @generated
	 * @ordered
	 */
	protected float switchOperationCycle = SWITCH_OPERATION_CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalOffLevel() <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_OFF_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOffLevel() <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffLevel()
	 * @generated
	 * @ordered
	 */
	protected String localOffLevel = LOCAL_OFF_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensingPhaseCode() <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode SENSING_PHASE_CODE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getSensingPhaseCode() <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode sensingPhaseCode = SENSING_PHASE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalControlKind() <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalControlKind()
	 * @generated
	 * @ordered
	 */
	protected static final ShuntImpedanceLocalControlKind LOCAL_CONTROL_KIND_EDEFAULT = ShuntImpedanceLocalControlKind.CURRENT;

	/**
	 * The cached value of the '{@link #getLocalControlKind() <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalControlKind()
	 * @generated
	 * @ordered
	 */
	protected ShuntImpedanceLocalControlKind localControlKind = LOCAL_CONTROL_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBranchDirect() <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchDirect()
	 * @generated
	 * @ordered
	 */
	protected static final int BRANCH_DIRECT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBranchDirect() <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchDirect()
	 * @generated
	 * @ordered
	 */
	protected int branchDirect = BRANCH_DIRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSwitchOperationCount() <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSwitchOperationCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SWITCH_OPERATION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSwitchOperationCount() <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSwitchOperationCount()
	 * @generated
	 * @ordered
	 */
	protected int maxSwitchOperationCount = MAX_SWITCH_OPERATION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocalOverride() <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalOverride()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_OVERRIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalOverride() <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalOverride()
	 * @generated
	 * @ordered
	 */
	protected boolean localOverride = LOCAL_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalOnLevel() <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOnLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ON_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOnLevel() <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOnLevel()
	 * @generated
	 * @ordered
	 */
	protected String localOnLevel = LOCAL_ON_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegBranch() <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegBranch() <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranch()
	 * @generated
	 * @ordered
	 */
	protected String regBranch = REG_BRANCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlKind() <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlKind()
	 * @generated
	 * @ordered
	 */
	protected static final ShuntImpedanceControlKind CONTROL_KIND_EDEFAULT = ShuntImpedanceControlKind.FIXED;

	/**
	 * The cached value of the '{@link #getControlKind() <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlKind()
	 * @generated
	 * @ordered
	 */
	protected ShuntImpedanceControlKind controlKind = CONTROL_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntImpedanceInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getShuntImpedanceInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowVoltageOverride() {
		return lowVoltageOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowVoltageOverride(float newLowVoltageOverride) {
		float oldLowVoltageOverride = lowVoltageOverride;
		lowVoltageOverride = newLowVoltageOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE, oldLowVoltageOverride, lowVoltageOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCellSize() {
		return cellSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellSize(float newCellSize) {
		float oldCellSize = cellSize;
		cellSize = newCellSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE, oldCellSize, cellSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighVoltageOverride() {
		return highVoltageOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighVoltageOverride(float newHighVoltageOverride) {
		float oldHighVoltageOverride = highVoltageOverride;
		highVoltageOverride = newHighVoltageOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE, oldHighVoltageOverride, highVoltageOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationBranchKind getRegBranchKind() {
		return regBranchKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegBranchKind(RegulationBranchKind newRegBranchKind) {
		RegulationBranchKind oldRegBranchKind = regBranchKind;
		regBranchKind = newRegBranchKind == null ? REG_BRANCH_KIND_EDEFAULT : newRegBranchKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND, oldRegBranchKind, regBranchKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNormalOpen() {
		return normalOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalOpen(boolean newNormalOpen) {
		boolean oldNormalOpen = normalOpen;
		normalOpen = newNormalOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN, oldNormalOpen, normalOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShuntCompensatorInfo> getShuntCompensatorInfos() {
		if (shuntCompensatorInfos == null) {
			shuntCompensatorInfos = new EObjectWithInverseResolvingEList<ShuntCompensatorInfo>(ShuntCompensatorInfo.class, this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO);
		}
		return shuntCompensatorInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegBranchEnd() {
		return regBranchEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegBranchEnd(int newRegBranchEnd) {
		int oldRegBranchEnd = regBranchEnd;
		regBranchEnd = newRegBranchEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END, oldRegBranchEnd, regBranchEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVRegLineLine() {
		return vRegLineLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRegLineLine(boolean newVRegLineLine) {
		boolean oldVRegLineLine = vRegLineLine;
		vRegLineLine = newVRegLineLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE, oldVRegLineLine, vRegLineLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSwitchOperationCycle() {
		return switchOperationCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchOperationCycle(float newSwitchOperationCycle) {
		float oldSwitchOperationCycle = switchOperationCycle;
		switchOperationCycle = newSwitchOperationCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE, oldSwitchOperationCycle, switchOperationCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalOffLevel() {
		return localOffLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOffLevel(String newLocalOffLevel) {
		String oldLocalOffLevel = localOffLevel;
		localOffLevel = newLocalOffLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL, oldLocalOffLevel, localOffLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getSensingPhaseCode() {
		return sensingPhaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensingPhaseCode(PhaseCode newSensingPhaseCode) {
		PhaseCode oldSensingPhaseCode = sensingPhaseCode;
		sensingPhaseCode = newSensingPhaseCode == null ? SENSING_PHASE_CODE_EDEFAULT : newSensingPhaseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE, oldSensingPhaseCode, sensingPhaseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceLocalControlKind getLocalControlKind() {
		return localControlKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalControlKind(ShuntImpedanceLocalControlKind newLocalControlKind) {
		ShuntImpedanceLocalControlKind oldLocalControlKind = localControlKind;
		localControlKind = newLocalControlKind == null ? LOCAL_CONTROL_KIND_EDEFAULT : newLocalControlKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND, oldLocalControlKind, localControlKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBranchDirect() {
		return branchDirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchDirect(int newBranchDirect) {
		int oldBranchDirect = branchDirect;
		branchDirect = newBranchDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT, oldBranchDirect, branchDirect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSwitchOperationCount() {
		return maxSwitchOperationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSwitchOperationCount(int newMaxSwitchOperationCount) {
		int oldMaxSwitchOperationCount = maxSwitchOperationCount;
		maxSwitchOperationCount = newMaxSwitchOperationCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT, oldMaxSwitchOperationCount, maxSwitchOperationCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalOverride() {
		return localOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOverride(boolean newLocalOverride) {
		boolean oldLocalOverride = localOverride;
		localOverride = newLocalOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE, oldLocalOverride, localOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalOnLevel() {
		return localOnLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOnLevel(String newLocalOnLevel) {
		String oldLocalOnLevel = localOnLevel;
		localOnLevel = newLocalOnLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL, oldLocalOnLevel, localOnLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegBranch() {
		return regBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegBranch(String newRegBranch) {
		String oldRegBranch = regBranch;
		regBranch = newRegBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH, oldRegBranch, regBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceControlKind getControlKind() {
		return controlKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlKind(ShuntImpedanceControlKind newControlKind) {
		ShuntImpedanceControlKind oldControlKind = controlKind;
		controlKind = newControlKind == null ? CONTROL_KIND_EDEFAULT : newControlKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND, oldControlKind, controlKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShuntCompensatorInfos()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return ((InternalEList<?>)getShuntCompensatorInfos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				return getLowVoltageOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				return getCellSize();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				return getHighVoltageOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				return getRegBranchKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				return isNormalOpen();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return getShuntCompensatorInfos();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				return getRegBranchEnd();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				return isVRegLineLine();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				return getSwitchOperationCycle();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				return getLocalOffLevel();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				return getSensingPhaseCode();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				return getLocalControlKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				return getBranchDirect();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				return getMaxSwitchOperationCount();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				return isLocalOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				return getLocalOnLevel();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				return getRegBranch();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				return getControlKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				setLowVoltageOverride((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				setCellSize((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				setHighVoltageOverride((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				setRegBranchKind((RegulationBranchKind)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				setNormalOpen((Boolean)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				getShuntCompensatorInfos().clear();
				getShuntCompensatorInfos().addAll((Collection<? extends ShuntCompensatorInfo>)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				setRegBranchEnd((Integer)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				setVRegLineLine((Boolean)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				setSwitchOperationCycle((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				setLocalOffLevel((String)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				setSensingPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				setLocalControlKind((ShuntImpedanceLocalControlKind)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				setBranchDirect((Integer)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				setMaxSwitchOperationCount((Integer)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				setLocalOverride((Boolean)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				setLocalOnLevel((String)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				setRegBranch((String)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				setControlKind((ShuntImpedanceControlKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				setLowVoltageOverride(LOW_VOLTAGE_OVERRIDE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				setCellSize(CELL_SIZE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				setHighVoltageOverride(HIGH_VOLTAGE_OVERRIDE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				setRegBranchKind(REG_BRANCH_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				setNormalOpen(NORMAL_OPEN_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				getShuntCompensatorInfos().clear();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				setRegBranchEnd(REG_BRANCH_END_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				setVRegLineLine(VREG_LINE_LINE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				setSwitchOperationCycle(SWITCH_OPERATION_CYCLE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				setLocalOffLevel(LOCAL_OFF_LEVEL_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				setSensingPhaseCode(SENSING_PHASE_CODE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				setLocalControlKind(LOCAL_CONTROL_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				setBranchDirect(BRANCH_DIRECT_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				setMaxSwitchOperationCount(MAX_SWITCH_OPERATION_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				setLocalOverride(LOCAL_OVERRIDE_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				setLocalOnLevel(LOCAL_ON_LEVEL_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				setRegBranch(REG_BRANCH_EDEFAULT);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				setControlKind(CONTROL_KIND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				return lowVoltageOverride != LOW_VOLTAGE_OVERRIDE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				return cellSize != CELL_SIZE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				return highVoltageOverride != HIGH_VOLTAGE_OVERRIDE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				return regBranchKind != REG_BRANCH_KIND_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				return normalOpen != NORMAL_OPEN_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return shuntCompensatorInfos != null && !shuntCompensatorInfos.isEmpty();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				return regBranchEnd != REG_BRANCH_END_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				return vRegLineLine != VREG_LINE_LINE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				return switchOperationCycle != SWITCH_OPERATION_CYCLE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				return LOCAL_OFF_LEVEL_EDEFAULT == null ? localOffLevel != null : !LOCAL_OFF_LEVEL_EDEFAULT.equals(localOffLevel);
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				return sensingPhaseCode != SENSING_PHASE_CODE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				return localControlKind != LOCAL_CONTROL_KIND_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				return branchDirect != BRANCH_DIRECT_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				return maxSwitchOperationCount != MAX_SWITCH_OPERATION_COUNT_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				return localOverride != LOCAL_OVERRIDE_EDEFAULT;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				return LOCAL_ON_LEVEL_EDEFAULT == null ? localOnLevel != null : !LOCAL_ON_LEVEL_EDEFAULT.equals(localOnLevel);
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				return REG_BRANCH_EDEFAULT == null ? regBranch != null : !REG_BRANCH_EDEFAULT.equals(regBranch);
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				return controlKind != CONTROL_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lowVoltageOverride: ");
		result.append(lowVoltageOverride);
		result.append(", cellSize: ");
		result.append(cellSize);
		result.append(", highVoltageOverride: ");
		result.append(highVoltageOverride);
		result.append(", regBranchKind: ");
		result.append(regBranchKind);
		result.append(", normalOpen: ");
		result.append(normalOpen);
		result.append(", regBranchEnd: ");
		result.append(regBranchEnd);
		result.append(", vRegLineLine: ");
		result.append(vRegLineLine);
		result.append(", switchOperationCycle: ");
		result.append(switchOperationCycle);
		result.append(", localOffLevel: ");
		result.append(localOffLevel);
		result.append(", sensingPhaseCode: ");
		result.append(sensingPhaseCode);
		result.append(", localControlKind: ");
		result.append(localControlKind);
		result.append(", branchDirect: ");
		result.append(branchDirect);
		result.append(", maxSwitchOperationCount: ");
		result.append(maxSwitchOperationCount);
		result.append(", localOverride: ");
		result.append(localOverride);
		result.append(", localOnLevel: ");
		result.append(localOnLevel);
		result.append(", regBranch: ");
		result.append(regBranch);
		result.append(", controlKind: ");
		result.append(controlKind);
		result.append(')');
		return result.toString();
	}

} //ShuntImpedanceInfoImpl
