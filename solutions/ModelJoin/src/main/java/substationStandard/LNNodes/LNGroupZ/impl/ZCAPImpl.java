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

import substationStandard.LNNodes.LNGroupA.ARCO;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import substationStandard.LNNodes.LNGroupZ.ZCAP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZCAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl#getCapDS <em>Cap DS</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl#getDschBlk <em>Dsch Blk</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl#getCapControl <em>Cap Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZCAPImpl extends GroupZImpl implements ZCAP {
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
	 * The cached value of the '{@link #getCapDS() <em>Cap DS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapDS()
	 * @generated
	 * @ordered
	 */
	protected SPC capDS;

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
	 * The cached value of the '{@link #getCapControl() <em>Cap Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapControl()
	 * @generated
	 * @ordered
	 */
	protected ARCO capControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZCAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZCAP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZCAP__OP_TMH, oldOpTmh, opTmh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZCAP__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getCapDS() {
		if (capDS != null && capDS.eIsProxy()) {
			InternalEObject oldCapDS = (InternalEObject)capDS;
			capDS = (SPC)eResolveProxy(oldCapDS);
			if (capDS != oldCapDS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZCAP__CAP_DS, oldCapDS, capDS));
			}
		}
		return capDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetCapDS() {
		return capDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapDS(SPC newCapDS) {
		SPC oldCapDS = capDS;
		capDS = newCapDS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZCAP__CAP_DS, oldCapDS, capDS));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZCAP__DSCH_BLK, oldDschBlk, dschBlk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZCAP__DSCH_BLK, oldDschBlk, dschBlk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARCO getCapControl() {
		if (capControl != null && capControl.eIsProxy()) {
			InternalEObject oldCapControl = (InternalEObject)capControl;
			capControl = (ARCO)eResolveProxy(oldCapControl);
			if (capControl != oldCapControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZCAP__CAP_CONTROL, oldCapControl, capControl));
			}
		}
		return capControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARCO basicGetCapControl() {
		return capControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapControl(ARCO newCapControl) {
		ARCO oldCapControl = capControl;
		capControl = newCapControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZCAP__CAP_CONTROL, oldCapControl, capControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZCAP__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZCAP__CAP_DS:
				if (resolve) return getCapDS();
				return basicGetCapDS();
			case LNGroupZPackage.ZCAP__DSCH_BLK:
				if (resolve) return getDschBlk();
				return basicGetDschBlk();
			case LNGroupZPackage.ZCAP__CAP_CONTROL:
				if (resolve) return getCapControl();
				return basicGetCapControl();
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
			case LNGroupZPackage.ZCAP__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupZPackage.ZCAP__CAP_DS:
				setCapDS((SPC)newValue);
				return;
			case LNGroupZPackage.ZCAP__DSCH_BLK:
				setDschBlk((SPS)newValue);
				return;
			case LNGroupZPackage.ZCAP__CAP_CONTROL:
				setCapControl((ARCO)newValue);
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
			case LNGroupZPackage.ZCAP__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupZPackage.ZCAP__CAP_DS:
				setCapDS((SPC)null);
				return;
			case LNGroupZPackage.ZCAP__DSCH_BLK:
				setDschBlk((SPS)null);
				return;
			case LNGroupZPackage.ZCAP__CAP_CONTROL:
				setCapControl((ARCO)null);
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
			case LNGroupZPackage.ZCAP__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZCAP__CAP_DS:
				return capDS != null;
			case LNGroupZPackage.ZCAP__DSCH_BLK:
				return dschBlk != null;
			case LNGroupZPackage.ZCAP__CAP_CONTROL:
				return capControl != null;
		}
		return super.eIsSet(featureID);
	}

} //ZCAPImpl
