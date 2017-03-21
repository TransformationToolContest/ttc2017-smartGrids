/**
 */
package substationStandard.LNNodes.LNGroupZ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import substationStandard.LNNodes.LNGroupZ.ZMOT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZMOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl#getDExt <em>DExt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl#getLosOil <em>Los Oil</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl#getLosVac <em>Los Vac</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl#getPresAlm <em>Pres Alm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZMOTImpl extends GroupZImpl implements ZMOT {
	/**
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected INS opTmh;

	/**
	 * The cached value of the '{@link #getDExt() <em>DExt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDExt()
	 * @generated
	 * @ordered
	 */
	protected SPC dExt;

	/**
	 * The cached value of the '{@link #getLosOil() <em>Los Oil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosOil()
	 * @generated
	 * @ordered
	 */
	protected SPS losOil;

	/**
	 * The cached value of the '{@link #getLosVac() <em>Los Vac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosVac()
	 * @generated
	 * @ordered
	 */
	protected SPS losVac;

	/**
	 * The cached value of the '{@link #getPresAlm() <em>Pres Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS presAlm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZMOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZMOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpTmh() {
		if (opTmh != null && opTmh.eIsProxy()) {
			InternalEObject oldOpTmh = (InternalEObject)opTmh;
			opTmh = (INS)eResolveProxy(oldOpTmh);
			if (opTmh != oldOpTmh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZMOT__OP_TMH, oldOpTmh, opTmh));
			}
		}
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpTmh() {
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTmh(INS newOpTmh) {
		INS oldOpTmh = opTmh;
		opTmh = newOpTmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZMOT__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getDExt() {
		if (dExt != null && dExt.eIsProxy()) {
			InternalEObject oldDExt = (InternalEObject)dExt;
			dExt = (SPC)eResolveProxy(oldDExt);
			if (dExt != oldDExt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZMOT__DEXT, oldDExt, dExt));
			}
		}
		return dExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetDExt() {
		return dExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDExt(SPC newDExt) {
		SPC oldDExt = dExt;
		dExt = newDExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZMOT__DEXT, oldDExt, dExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLosOil() {
		if (losOil != null && losOil.eIsProxy()) {
			InternalEObject oldLosOil = (InternalEObject)losOil;
			losOil = (SPS)eResolveProxy(oldLosOil);
			if (losOil != oldLosOil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZMOT__LOS_OIL, oldLosOil, losOil));
			}
		}
		return losOil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLosOil() {
		return losOil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosOil(SPS newLosOil) {
		SPS oldLosOil = losOil;
		losOil = newLosOil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZMOT__LOS_OIL, oldLosOil, losOil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLosVac() {
		if (losVac != null && losVac.eIsProxy()) {
			InternalEObject oldLosVac = (InternalEObject)losVac;
			losVac = (SPS)eResolveProxy(oldLosVac);
			if (losVac != oldLosVac) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZMOT__LOS_VAC, oldLosVac, losVac));
			}
		}
		return losVac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLosVac() {
		return losVac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosVac(SPS newLosVac) {
		SPS oldLosVac = losVac;
		losVac = newLosVac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZMOT__LOS_VAC, oldLosVac, losVac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getPresAlm() {
		if (presAlm != null && presAlm.eIsProxy()) {
			InternalEObject oldPresAlm = (InternalEObject)presAlm;
			presAlm = (SPS)eResolveProxy(oldPresAlm);
			if (presAlm != oldPresAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZMOT__PRES_ALM, oldPresAlm, presAlm));
			}
		}
		return presAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetPresAlm() {
		return presAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresAlm(SPS newPresAlm) {
		SPS oldPresAlm = presAlm;
		presAlm = newPresAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZMOT__PRES_ALM, oldPresAlm, presAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZMOT__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZMOT__DEXT:
				if (resolve) return getDExt();
				return basicGetDExt();
			case LNGroupZPackage.ZMOT__LOS_OIL:
				if (resolve) return getLosOil();
				return basicGetLosOil();
			case LNGroupZPackage.ZMOT__LOS_VAC:
				if (resolve) return getLosVac();
				return basicGetLosVac();
			case LNGroupZPackage.ZMOT__PRES_ALM:
				if (resolve) return getPresAlm();
				return basicGetPresAlm();
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
			case LNGroupZPackage.ZMOT__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupZPackage.ZMOT__DEXT:
				setDExt((SPC)newValue);
				return;
			case LNGroupZPackage.ZMOT__LOS_OIL:
				setLosOil((SPS)newValue);
				return;
			case LNGroupZPackage.ZMOT__LOS_VAC:
				setLosVac((SPS)newValue);
				return;
			case LNGroupZPackage.ZMOT__PRES_ALM:
				setPresAlm((SPS)newValue);
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
			case LNGroupZPackage.ZMOT__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupZPackage.ZMOT__DEXT:
				setDExt((SPC)null);
				return;
			case LNGroupZPackage.ZMOT__LOS_OIL:
				setLosOil((SPS)null);
				return;
			case LNGroupZPackage.ZMOT__LOS_VAC:
				setLosVac((SPS)null);
				return;
			case LNGroupZPackage.ZMOT__PRES_ALM:
				setPresAlm((SPS)null);
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
			case LNGroupZPackage.ZMOT__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZMOT__DEXT:
				return dExt != null;
			case LNGroupZPackage.ZMOT__LOS_OIL:
				return losOil != null;
			case LNGroupZPackage.ZMOT__LOS_VAC:
				return losVac != null;
			case LNGroupZPackage.ZMOT__PRES_ALM:
				return presAlm != null;
		}
		return super.eIsSet(featureID);
	}

} //ZMOTImpl
