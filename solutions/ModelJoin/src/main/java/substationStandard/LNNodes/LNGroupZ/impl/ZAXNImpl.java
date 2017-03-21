/**
 */
package substationStandard.LNNodes.LNGroupZ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import substationStandard.LNNodes.LNGroupZ.ZAXN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZAXN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl#getVol <em>Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl#getAmp <em>Amp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZAXNImpl extends GroupZImpl implements ZAXN {
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
	 * The cached value of the '{@link #getVol() <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected MV vol;

	/**
	 * The cached value of the '{@link #getAmp() <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp()
	 * @generated
	 * @ordered
	 */
	protected MV amp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZAXNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZAXN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZAXN__OP_TMH, oldOpTmh, opTmh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZAXN__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVol() {
		if (vol != null && vol.eIsProxy()) {
			InternalEObject oldVol = (InternalEObject)vol;
			vol = (MV)eResolveProxy(oldVol);
			if (vol != oldVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZAXN__VOL, oldVol, vol));
			}
		}
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVol() {
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVol(MV newVol) {
		MV oldVol = vol;
		vol = newVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZAXN__VOL, oldVol, vol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAmp() {
		if (amp != null && amp.eIsProxy()) {
			InternalEObject oldAmp = (InternalEObject)amp;
			amp = (MV)eResolveProxy(oldAmp);
			if (amp != oldAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZAXN__AMP, oldAmp, amp));
			}
		}
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAmp() {
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp(MV newAmp) {
		MV oldAmp = amp;
		amp = newAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZAXN__AMP, oldAmp, amp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZAXN__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZAXN__VOL:
				if (resolve) return getVol();
				return basicGetVol();
			case LNGroupZPackage.ZAXN__AMP:
				if (resolve) return getAmp();
				return basicGetAmp();
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
			case LNGroupZPackage.ZAXN__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupZPackage.ZAXN__VOL:
				setVol((MV)newValue);
				return;
			case LNGroupZPackage.ZAXN__AMP:
				setAmp((MV)newValue);
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
			case LNGroupZPackage.ZAXN__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupZPackage.ZAXN__VOL:
				setVol((MV)null);
				return;
			case LNGroupZPackage.ZAXN__AMP:
				setAmp((MV)null);
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
			case LNGroupZPackage.ZAXN__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZAXN__VOL:
				return vol != null;
			case LNGroupZPackage.ZAXN__AMP:
				return amp != null;
		}
		return super.eIsSet(featureID);
	}

} //ZAXNImpl
