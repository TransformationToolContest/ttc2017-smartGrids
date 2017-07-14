/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.SAV;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage;
import gluemodel.substationStandard.LNNodes.LNGroupT.TVTR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TVTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl#getVol <em>Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl#getFuFail <em>Fu Fail</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl#getVRtg <em>VRtg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TVTRImpl extends GroupTImpl implements TVTR {
	/**
	 * The cached value of the '{@link #getVol() <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected SAV vol;

	/**
	 * The cached value of the '{@link #getFuFail() <em>Fu Fail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuFail()
	 * @generated
	 * @ordered
	 */
	protected SPS fuFail;

	/**
	 * The cached value of the '{@link #getVRtg() <em>VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG vRtg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TVTRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupTPackage.Literals.TVTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV getVol() {
		if (vol != null && vol.eIsProxy()) {
			InternalEObject oldVol = (InternalEObject)vol;
			vol = (SAV)eResolveProxy(oldVol);
			if (vol != oldVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.TVTR__VOL, oldVol, vol));
			}
		}
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV basicGetVol() {
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVol(SAV newVol) {
		SAV oldVol = vol;
		vol = newVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.TVTR__VOL, oldVol, vol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getFuFail() {
		if (fuFail != null && fuFail.eIsProxy()) {
			InternalEObject oldFuFail = (InternalEObject)fuFail;
			fuFail = (SPS)eResolveProxy(oldFuFail);
			if (fuFail != oldFuFail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.TVTR__FU_FAIL, oldFuFail, fuFail));
			}
		}
		return fuFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetFuFail() {
		return fuFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuFail(SPS newFuFail) {
		SPS oldFuFail = fuFail;
		fuFail = newFuFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.TVTR__FU_FAIL, oldFuFail, fuFail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getVRtg() {
		if (vRtg != null && vRtg.eIsProxy()) {
			InternalEObject oldVRtg = (InternalEObject)vRtg;
			vRtg = (ASG)eResolveProxy(oldVRtg);
			if (vRtg != oldVRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.TVTR__VRTG, oldVRtg, vRtg));
			}
		}
		return vRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetVRtg() {
		return vRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRtg(ASG newVRtg) {
		ASG oldVRtg = vRtg;
		vRtg = newVRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.TVTR__VRTG, oldVRtg, vRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupTPackage.TVTR__VOL:
				if (resolve) return getVol();
				return basicGetVol();
			case LNGroupTPackage.TVTR__FU_FAIL:
				if (resolve) return getFuFail();
				return basicGetFuFail();
			case LNGroupTPackage.TVTR__VRTG:
				if (resolve) return getVRtg();
				return basicGetVRtg();
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
			case LNGroupTPackage.TVTR__VOL:
				setVol((SAV)newValue);
				return;
			case LNGroupTPackage.TVTR__FU_FAIL:
				setFuFail((SPS)newValue);
				return;
			case LNGroupTPackage.TVTR__VRTG:
				setVRtg((ASG)newValue);
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
			case LNGroupTPackage.TVTR__VOL:
				setVol((SAV)null);
				return;
			case LNGroupTPackage.TVTR__FU_FAIL:
				setFuFail((SPS)null);
				return;
			case LNGroupTPackage.TVTR__VRTG:
				setVRtg((ASG)null);
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
			case LNGroupTPackage.TVTR__VOL:
				return vol != null;
			case LNGroupTPackage.TVTR__FU_FAIL:
				return fuFail != null;
			case LNGroupTPackage.TVTR__VRTG:
				return vRtg != null;
		}
		return super.eIsSet(featureID);
	}

} //TVTRImpl
