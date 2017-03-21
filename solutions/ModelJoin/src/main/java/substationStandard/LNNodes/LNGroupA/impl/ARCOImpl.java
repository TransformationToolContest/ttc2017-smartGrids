/**
 */
package substationStandard.LNNodes.LNGroupA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupA.ARCO;
import substationStandard.LNNodes.LNGroupA.LNGroupAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARCO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ARCOImpl#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ARCOImpl#getVOvSt <em>VOv St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ARCOImpl#getNeutAlm <em>Neut Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.ARCOImpl#getDschBlk <em>Dsch Blk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARCOImpl extends GroupAImpl implements ARCO {
	/**
	 * The cached value of the '{@link #getTapChg() <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChg()
	 * @generated
	 * @ordered
	 */
	protected BSC tapChg;

	/**
	 * The cached value of the '{@link #getVOvSt() <em>VOv St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVOvSt()
	 * @generated
	 * @ordered
	 */
	protected SPS vOvSt;

	/**
	 * The cached value of the '{@link #getNeutAlm() <em>Neut Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS neutAlm;

	/**
	 * The cached value of the '{@link #getDschBlk() <em>Dsch Blk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDschBlk()
	 * @generated
	 * @ordered
	 */
	protected SPS dschBlk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ARCOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupAPackage.Literals.ARCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC getTapChg() {
		if (tapChg != null && tapChg.eIsProxy()) {
			InternalEObject oldTapChg = (InternalEObject)tapChg;
			tapChg = (BSC)eResolveProxy(oldTapChg);
			if (tapChg != oldTapChg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ARCO__TAP_CHG, oldTapChg, tapChg));
			}
		}
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC basicGetTapChg() {
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChg(BSC newTapChg) {
		BSC oldTapChg = tapChg;
		tapChg = newTapChg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ARCO__TAP_CHG, oldTapChg, tapChg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getVOvSt() {
		if (vOvSt != null && vOvSt.eIsProxy()) {
			InternalEObject oldVOvSt = (InternalEObject)vOvSt;
			vOvSt = (SPS)eResolveProxy(oldVOvSt);
			if (vOvSt != oldVOvSt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ARCO__VOV_ST, oldVOvSt, vOvSt));
			}
		}
		return vOvSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetVOvSt() {
		return vOvSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVOvSt(SPS newVOvSt) {
		SPS oldVOvSt = vOvSt;
		vOvSt = newVOvSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ARCO__VOV_ST, oldVOvSt, vOvSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getNeutAlm() {
		if (neutAlm != null && neutAlm.eIsProxy()) {
			InternalEObject oldNeutAlm = (InternalEObject)neutAlm;
			neutAlm = (SPS)eResolveProxy(oldNeutAlm);
			if (neutAlm != oldNeutAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ARCO__NEUT_ALM, oldNeutAlm, neutAlm));
			}
		}
		return neutAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetNeutAlm() {
		return neutAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutAlm(SPS newNeutAlm) {
		SPS oldNeutAlm = neutAlm;
		neutAlm = newNeutAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ARCO__NEUT_ALM, oldNeutAlm, neutAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getDschBlk() {
		if (dschBlk != null && dschBlk.eIsProxy()) {
			InternalEObject oldDschBlk = (InternalEObject)dschBlk;
			dschBlk = (SPS)eResolveProxy(oldDschBlk);
			if (dschBlk != oldDschBlk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ARCO__DSCH_BLK, oldDschBlk, dschBlk));
			}
		}
		return dschBlk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetDschBlk() {
		return dschBlk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDschBlk(SPS newDschBlk) {
		SPS oldDschBlk = dschBlk;
		dschBlk = newDschBlk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ARCO__DSCH_BLK, oldDschBlk, dschBlk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupAPackage.ARCO__TAP_CHG:
				if (resolve) return getTapChg();
				return basicGetTapChg();
			case LNGroupAPackage.ARCO__VOV_ST:
				if (resolve) return getVOvSt();
				return basicGetVOvSt();
			case LNGroupAPackage.ARCO__NEUT_ALM:
				if (resolve) return getNeutAlm();
				return basicGetNeutAlm();
			case LNGroupAPackage.ARCO__DSCH_BLK:
				if (resolve) return getDschBlk();
				return basicGetDschBlk();
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
			case LNGroupAPackage.ARCO__TAP_CHG:
				setTapChg((BSC)newValue);
				return;
			case LNGroupAPackage.ARCO__VOV_ST:
				setVOvSt((SPS)newValue);
				return;
			case LNGroupAPackage.ARCO__NEUT_ALM:
				setNeutAlm((SPS)newValue);
				return;
			case LNGroupAPackage.ARCO__DSCH_BLK:
				setDschBlk((SPS)newValue);
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
			case LNGroupAPackage.ARCO__TAP_CHG:
				setTapChg((BSC)null);
				return;
			case LNGroupAPackage.ARCO__VOV_ST:
				setVOvSt((SPS)null);
				return;
			case LNGroupAPackage.ARCO__NEUT_ALM:
				setNeutAlm((SPS)null);
				return;
			case LNGroupAPackage.ARCO__DSCH_BLK:
				setDschBlk((SPS)null);
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
			case LNGroupAPackage.ARCO__TAP_CHG:
				return tapChg != null;
			case LNGroupAPackage.ARCO__VOV_ST:
				return vOvSt != null;
			case LNGroupAPackage.ARCO__NEUT_ALM:
				return neutAlm != null;
			case LNGroupAPackage.ARCO__DSCH_BLK:
				return dschBlk != null;
		}
		return super.eIsSet(featureID);
	}

} //ARCOImpl
