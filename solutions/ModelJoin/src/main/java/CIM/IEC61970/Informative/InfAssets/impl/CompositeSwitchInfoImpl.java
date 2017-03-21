/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.CompositeSwitchInfo;
import CIM.IEC61970.Informative.InfAssets.CompositeSwitchKind;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Switch Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl#getInitOpMode <em>Init Op Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl#isGang <em>Gang</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl#getSwitchStateCount <em>Switch State Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl#getInterruptingRating <em>Interrupting Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.CompositeSwitchInfoImpl#isRemote <em>Remote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeSwitchInfoImpl extends ElectricalInfoImpl implements CompositeSwitchInfo {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CompositeSwitchKind KIND_EDEFAULT = CompositeSwitchKind.REGULATOR_BYPASS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CompositeSwitchKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitOpMode() <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_OP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitOpMode() <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOpMode()
	 * @generated
	 * @ordered
	 */
	protected String initOpMode = INIT_OP_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGang() <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGang()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GANG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGang() <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGang()
	 * @generated
	 * @ordered
	 */
	protected boolean gang = GANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchStateCount() <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchStateCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCH_STATE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchStateCount() <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchStateCount()
	 * @generated
	 * @ordered
	 */
	protected int switchStateCount = SWITCH_STATE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterruptingRating() <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERRUPTING_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterruptingRating() <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingRating()
	 * @generated
	 * @ordered
	 */
	protected float interruptingRating = INTERRUPTING_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean remote = REMOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSwitchInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getCompositeSwitchInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitchKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CompositeSwitchKind newKind) {
		CompositeSwitchKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitOpMode() {
		return initOpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitOpMode(String newInitOpMode) {
		String oldInitOpMode = initOpMode;
		initOpMode = newInitOpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE, oldInitOpMode, initOpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGang() {
		return gang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGang(boolean newGang) {
		boolean oldGang = gang;
		gang = newGang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANG, oldGang, gang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSwitchStateCount() {
		return switchStateCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchStateCount(int newSwitchStateCount) {
		int oldSwitchStateCount = switchStateCount;
		switchStateCount = newSwitchStateCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT, oldSwitchStateCount, switchStateCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInterruptingRating() {
		return interruptingRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptingRating(float newInterruptingRating) {
		float oldInterruptingRating = interruptingRating;
		interruptingRating = newInterruptingRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING, oldInterruptingRating, interruptingRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(boolean newRemote) {
		boolean oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				return getKind();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				return getInitOpMode();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANG:
				return isGang();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				return getSwitchStateCount();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				return getInterruptingRating();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				return isRemote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				setKind((CompositeSwitchKind)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				setInitOpMode((String)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANG:
				setGang((Boolean)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				setSwitchStateCount((Integer)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				setInterruptingRating((Float)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				setRemote((Boolean)newValue);
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
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				setInitOpMode(INIT_OP_MODE_EDEFAULT);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANG:
				setGang(GANG_EDEFAULT);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				setSwitchStateCount(SWITCH_STATE_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				setInterruptingRating(INTERRUPTING_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				setRemote(REMOTE_EDEFAULT);
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
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				return kind != KIND_EDEFAULT;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				return INIT_OP_MODE_EDEFAULT == null ? initOpMode != null : !INIT_OP_MODE_EDEFAULT.equals(initOpMode);
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANG:
				return gang != GANG_EDEFAULT;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				return switchStateCount != SWITCH_STATE_COUNT_EDEFAULT;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				return interruptingRating != INTERRUPTING_RATING_EDEFAULT;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				return remote != REMOTE_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", initOpMode: ");
		result.append(initOpMode);
		result.append(", gang: ");
		result.append(gang);
		result.append(", switchStateCount: ");
		result.append(switchStateCount);
		result.append(", interruptingRating: ");
		result.append(interruptingRating);
		result.append(", remote: ");
		result.append(remote);
		result.append(')');
		return result.toString();
	}

} //CompositeSwitchInfoImpl
