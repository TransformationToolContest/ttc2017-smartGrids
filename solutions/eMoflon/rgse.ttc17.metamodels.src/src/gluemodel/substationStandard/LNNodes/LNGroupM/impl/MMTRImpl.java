/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupM.impl;

import gluemodel.substationStandard.Dataclasses.BCR;
import gluemodel.substationStandard.Dataclasses.DPL;

import gluemodel.substationStandard.Enumerations.HealthStateKind;

import gluemodel.substationStandard.LNNodes.LNGroupM.LNGroupMPackage;
import gluemodel.substationStandard.LNNodes.LNGroupM.MMTR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getTotVAh <em>Tot VAh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getTotWh <em>Tot Wh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getTotVArh <em>Tot VArh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getSupWh <em>Sup Wh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getSupVArh <em>Sup VArh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getDmdWh <em>Dmd Wh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupM.impl.MMTRImpl#getDmdVArh <em>Dmd VArh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMTRImpl extends GroupMImpl implements MMTR {
	/**
	 * The cached value of the '{@link #getEEName() <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEName()
	 * @generated
	 * @ordered
	 */
	protected DPL eeName;

	/**
	 * The default value of the '{@link #getEEHealth() <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected static final HealthStateKind EE_HEALTH_EDEFAULT = HealthStateKind.OK;

	/**
	 * The cached value of the '{@link #getEEHealth() <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected HealthStateKind eeHealth = EE_HEALTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTotVAh() <em>Tot VAh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotVAh()
	 * @generated
	 * @ordered
	 */
	protected BCR totVAh;

	/**
	 * The cached value of the '{@link #getTotWh() <em>Tot Wh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotWh()
	 * @generated
	 * @ordered
	 */
	protected BCR totWh;

	/**
	 * The cached value of the '{@link #getTotVArh() <em>Tot VArh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotVArh()
	 * @generated
	 * @ordered
	 */
	protected BCR totVArh;

	/**
	 * The cached value of the '{@link #getSupWh() <em>Sup Wh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupWh()
	 * @generated
	 * @ordered
	 */
	protected BCR supWh;

	/**
	 * The cached value of the '{@link #getSupVArh() <em>Sup VArh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupVArh()
	 * @generated
	 * @ordered
	 */
	protected BCR supVArh;

	/**
	 * The cached value of the '{@link #getDmdWh() <em>Dmd Wh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmdWh()
	 * @generated
	 * @ordered
	 */
	protected BCR dmdWh;

	/**
	 * The cached value of the '{@link #getDmdVArh() <em>Dmd VArh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmdVArh()
	 * @generated
	 * @ordered
	 */
	protected BCR dmdVArh;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMTRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupMPackage.Literals.MMTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL getEEName() {
		if (eeName != null && eeName.eIsProxy()) {
			InternalEObject oldEEName = (InternalEObject)eeName;
			eeName = (DPL)eResolveProxy(oldEEName);
			if (eeName != oldEEName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__EE_NAME, oldEEName, eeName));
			}
		}
		return eeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL basicGetEEName() {
		return eeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEName(DPL newEEName) {
		DPL oldEEName = eeName;
		eeName = newEEName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__EE_NAME, oldEEName, eeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStateKind getEEHealth() {
		return eeHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEHealth(HealthStateKind newEEHealth) {
		HealthStateKind oldEEHealth = eeHealth;
		eeHealth = newEEHealth == null ? EE_HEALTH_EDEFAULT : newEEHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getTotVAh() {
		if (totVAh != null && totVAh.eIsProxy()) {
			InternalEObject oldTotVAh = (InternalEObject)totVAh;
			totVAh = (BCR)eResolveProxy(oldTotVAh);
			if (totVAh != oldTotVAh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__TOT_VAH, oldTotVAh, totVAh));
			}
		}
		return totVAh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetTotVAh() {
		return totVAh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotVAh(BCR newTotVAh) {
		BCR oldTotVAh = totVAh;
		totVAh = newTotVAh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__TOT_VAH, oldTotVAh, totVAh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getTotWh() {
		if (totWh != null && totWh.eIsProxy()) {
			InternalEObject oldTotWh = (InternalEObject)totWh;
			totWh = (BCR)eResolveProxy(oldTotWh);
			if (totWh != oldTotWh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__TOT_WH, oldTotWh, totWh));
			}
		}
		return totWh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetTotWh() {
		return totWh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotWh(BCR newTotWh) {
		BCR oldTotWh = totWh;
		totWh = newTotWh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__TOT_WH, oldTotWh, totWh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getTotVArh() {
		if (totVArh != null && totVArh.eIsProxy()) {
			InternalEObject oldTotVArh = (InternalEObject)totVArh;
			totVArh = (BCR)eResolveProxy(oldTotVArh);
			if (totVArh != oldTotVArh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__TOT_VARH, oldTotVArh, totVArh));
			}
		}
		return totVArh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetTotVArh() {
		return totVArh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotVArh(BCR newTotVArh) {
		BCR oldTotVArh = totVArh;
		totVArh = newTotVArh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__TOT_VARH, oldTotVArh, totVArh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getSupWh() {
		if (supWh != null && supWh.eIsProxy()) {
			InternalEObject oldSupWh = (InternalEObject)supWh;
			supWh = (BCR)eResolveProxy(oldSupWh);
			if (supWh != oldSupWh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__SUP_WH, oldSupWh, supWh));
			}
		}
		return supWh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetSupWh() {
		return supWh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupWh(BCR newSupWh) {
		BCR oldSupWh = supWh;
		supWh = newSupWh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__SUP_WH, oldSupWh, supWh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getSupVArh() {
		if (supVArh != null && supVArh.eIsProxy()) {
			InternalEObject oldSupVArh = (InternalEObject)supVArh;
			supVArh = (BCR)eResolveProxy(oldSupVArh);
			if (supVArh != oldSupVArh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__SUP_VARH, oldSupVArh, supVArh));
			}
		}
		return supVArh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetSupVArh() {
		return supVArh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupVArh(BCR newSupVArh) {
		BCR oldSupVArh = supVArh;
		supVArh = newSupVArh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__SUP_VARH, oldSupVArh, supVArh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getDmdWh() {
		if (dmdWh != null && dmdWh.eIsProxy()) {
			InternalEObject oldDmdWh = (InternalEObject)dmdWh;
			dmdWh = (BCR)eResolveProxy(oldDmdWh);
			if (dmdWh != oldDmdWh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__DMD_WH, oldDmdWh, dmdWh));
			}
		}
		return dmdWh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetDmdWh() {
		return dmdWh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmdWh(BCR newDmdWh) {
		BCR oldDmdWh = dmdWh;
		dmdWh = newDmdWh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__DMD_WH, oldDmdWh, dmdWh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getDmdVArh() {
		if (dmdVArh != null && dmdVArh.eIsProxy()) {
			InternalEObject oldDmdVArh = (InternalEObject)dmdVArh;
			dmdVArh = (BCR)eResolveProxy(oldDmdVArh);
			if (dmdVArh != oldDmdVArh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupMPackage.MMTR__DMD_VARH, oldDmdVArh, dmdVArh));
			}
		}
		return dmdVArh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetDmdVArh() {
		return dmdVArh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmdVArh(BCR newDmdVArh) {
		BCR oldDmdVArh = dmdVArh;
		dmdVArh = newDmdVArh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupMPackage.MMTR__DMD_VARH, oldDmdVArh, dmdVArh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupMPackage.MMTR__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupMPackage.MMTR__EE_HEALTH:
				return getEEHealth();
			case LNGroupMPackage.MMTR__TOT_VAH:
				if (resolve) return getTotVAh();
				return basicGetTotVAh();
			case LNGroupMPackage.MMTR__TOT_WH:
				if (resolve) return getTotWh();
				return basicGetTotWh();
			case LNGroupMPackage.MMTR__TOT_VARH:
				if (resolve) return getTotVArh();
				return basicGetTotVArh();
			case LNGroupMPackage.MMTR__SUP_WH:
				if (resolve) return getSupWh();
				return basicGetSupWh();
			case LNGroupMPackage.MMTR__SUP_VARH:
				if (resolve) return getSupVArh();
				return basicGetSupVArh();
			case LNGroupMPackage.MMTR__DMD_WH:
				if (resolve) return getDmdWh();
				return basicGetDmdWh();
			case LNGroupMPackage.MMTR__DMD_VARH:
				if (resolve) return getDmdVArh();
				return basicGetDmdVArh();
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
			case LNGroupMPackage.MMTR__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupMPackage.MMTR__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupMPackage.MMTR__TOT_VAH:
				setTotVAh((BCR)newValue);
				return;
			case LNGroupMPackage.MMTR__TOT_WH:
				setTotWh((BCR)newValue);
				return;
			case LNGroupMPackage.MMTR__TOT_VARH:
				setTotVArh((BCR)newValue);
				return;
			case LNGroupMPackage.MMTR__SUP_WH:
				setSupWh((BCR)newValue);
				return;
			case LNGroupMPackage.MMTR__SUP_VARH:
				setSupVArh((BCR)newValue);
				return;
			case LNGroupMPackage.MMTR__DMD_WH:
				setDmdWh((BCR)newValue);
				return;
			case LNGroupMPackage.MMTR__DMD_VARH:
				setDmdVArh((BCR)newValue);
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
			case LNGroupMPackage.MMTR__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupMPackage.MMTR__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupMPackage.MMTR__TOT_VAH:
				setTotVAh((BCR)null);
				return;
			case LNGroupMPackage.MMTR__TOT_WH:
				setTotWh((BCR)null);
				return;
			case LNGroupMPackage.MMTR__TOT_VARH:
				setTotVArh((BCR)null);
				return;
			case LNGroupMPackage.MMTR__SUP_WH:
				setSupWh((BCR)null);
				return;
			case LNGroupMPackage.MMTR__SUP_VARH:
				setSupVArh((BCR)null);
				return;
			case LNGroupMPackage.MMTR__DMD_WH:
				setDmdWh((BCR)null);
				return;
			case LNGroupMPackage.MMTR__DMD_VARH:
				setDmdVArh((BCR)null);
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
			case LNGroupMPackage.MMTR__EE_NAME:
				return eeName != null;
			case LNGroupMPackage.MMTR__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupMPackage.MMTR__TOT_VAH:
				return totVAh != null;
			case LNGroupMPackage.MMTR__TOT_WH:
				return totWh != null;
			case LNGroupMPackage.MMTR__TOT_VARH:
				return totVArh != null;
			case LNGroupMPackage.MMTR__SUP_WH:
				return supWh != null;
			case LNGroupMPackage.MMTR__SUP_VARH:
				return supVArh != null;
			case LNGroupMPackage.MMTR__DMD_WH:
				return dmdWh != null;
			case LNGroupMPackage.MMTR__DMD_VARH:
				return dmdVArh != null;
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
		result.append(" (EEHealth: ");
		result.append(eeHealth);
		result.append(')');
		return result.toString();
	}

} //MMTRImpl
