/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.SwitchInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#isGang <em>Gang</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#getPoleCount <em>Pole Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#getInterruptingRating <em>Interrupting Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#getDielectricStrength <em>Dielectric Strength</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#isLoadBreak <em>Load Break</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#getMinimumCurrent <em>Minimum Current</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#getWithstandCurrent <em>Withstand Current</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#getMakingCapacity <em>Making Capacity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SwitchInfoImpl#isRemote <em>Remote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchInfoImpl extends ElectricalInfoImpl implements SwitchInfo {
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
	 * The default value of the '{@link #getPoleCount() <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoleCount()
	 * @generated
	 * @ordered
	 */
	protected static final int POLE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoleCount() <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoleCount()
	 * @generated
	 * @ordered
	 */
	protected int poleCount = POLE_COUNT_EDEFAULT;

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
	 * The default value of the '{@link #getDielectricStrength() <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected static final float DIELECTRIC_STRENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDielectricStrength() <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected float dielectricStrength = DIELECTRIC_STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoadBreak() <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadBreak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_BREAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoadBreak() <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadBreak()
	 * @generated
	 * @ordered
	 */
	protected boolean loadBreak = LOAD_BREAK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCurrent() <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumCurrent() <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCurrent()
	 * @generated
	 * @ordered
	 */
	protected float minimumCurrent = MINIMUM_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithstandCurrent() <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithstandCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float WITHSTAND_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWithstandCurrent() <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithstandCurrent()
	 * @generated
	 * @ordered
	 */
	protected float withstandCurrent = WITHSTAND_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMakingCapacity() <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float MAKING_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMakingCapacity() <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakingCapacity()
	 * @generated
	 * @ordered
	 */
	protected float makingCapacity = MAKING_CAPACITY_EDEFAULT;

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
	protected SwitchInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSwitchInfo();
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__GANG, oldGang, gang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoleCount() {
		return poleCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoleCount(int newPoleCount) {
		int oldPoleCount = poleCount;
		poleCount = newPoleCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__POLE_COUNT, oldPoleCount, poleCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING, oldInterruptingRating, interruptingRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDielectricStrength() {
		return dielectricStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDielectricStrength(float newDielectricStrength) {
		float oldDielectricStrength = dielectricStrength;
		dielectricStrength = newDielectricStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH, oldDielectricStrength, dielectricStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoadBreak() {
		return loadBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBreak(boolean newLoadBreak) {
		boolean oldLoadBreak = loadBreak;
		loadBreak = newLoadBreak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__LOAD_BREAK, oldLoadBreak, loadBreak));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumCurrent() {
		return minimumCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCurrent(float newMinimumCurrent) {
		float oldMinimumCurrent = minimumCurrent;
		minimumCurrent = newMinimumCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT, oldMinimumCurrent, minimumCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWithstandCurrent() {
		return withstandCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithstandCurrent(float newWithstandCurrent) {
		float oldWithstandCurrent = withstandCurrent;
		withstandCurrent = newWithstandCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT, oldWithstandCurrent, withstandCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMakingCapacity() {
		return makingCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakingCapacity(float newMakingCapacity) {
		float oldMakingCapacity = makingCapacity;
		makingCapacity = newMakingCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY, oldMakingCapacity, makingCapacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SWITCH_INFO__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SWITCH_INFO__GANG:
				return isGang();
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				return getPoleCount();
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				return getInterruptingRating();
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				return getDielectricStrength();
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				return isLoadBreak();
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				return getMinimumCurrent();
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				return getWithstandCurrent();
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				return getMakingCapacity();
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
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
			case InfAssetsPackage.SWITCH_INFO__GANG:
				setGang((Boolean)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				setPoleCount((Integer)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				setInterruptingRating((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				setDielectricStrength((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				setLoadBreak((Boolean)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				setMinimumCurrent((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				setWithstandCurrent((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				setMakingCapacity((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
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
			case InfAssetsPackage.SWITCH_INFO__GANG:
				setGang(GANG_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				setPoleCount(POLE_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				setInterruptingRating(INTERRUPTING_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				setDielectricStrength(DIELECTRIC_STRENGTH_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				setLoadBreak(LOAD_BREAK_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				setMinimumCurrent(MINIMUM_CURRENT_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				setWithstandCurrent(WITHSTAND_CURRENT_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				setMakingCapacity(MAKING_CAPACITY_EDEFAULT);
				return;
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
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
			case InfAssetsPackage.SWITCH_INFO__GANG:
				return gang != GANG_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				return poleCount != POLE_COUNT_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				return interruptingRating != INTERRUPTING_RATING_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				return dielectricStrength != DIELECTRIC_STRENGTH_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				return loadBreak != LOAD_BREAK_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				return minimumCurrent != MINIMUM_CURRENT_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				return withstandCurrent != WITHSTAND_CURRENT_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				return makingCapacity != MAKING_CAPACITY_EDEFAULT;
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
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
		result.append(" (gang: ");
		result.append(gang);
		result.append(", poleCount: ");
		result.append(poleCount);
		result.append(", interruptingRating: ");
		result.append(interruptingRating);
		result.append(", dielectricStrength: ");
		result.append(dielectricStrength);
		result.append(", loadBreak: ");
		result.append(loadBreak);
		result.append(", minimumCurrent: ");
		result.append(minimumCurrent);
		result.append(", withstandCurrent: ");
		result.append(withstandCurrent);
		result.append(", makingCapacity: ");
		result.append(makingCapacity);
		result.append(", remote: ");
		result.append(remote);
		result.append(')');
		return result.toString();
	}

} //SwitchInfoImpl
