/**
 */
package substationStandard.LNNodes.LNGroupZ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INS;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import substationStandard.LNNodes.LNGroupZ.ZTCF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZTCF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZTCFImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZTCFImpl#getPwrFrq <em>Pwr Frq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZTCFImpl extends GroupZImpl implements ZTCF {
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
	 * The cached value of the '{@link #getPwrFrq() <em>Pwr Frq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwrFrq()
	 * @generated
	 * @ordered
	 */
	protected ASG pwrFrq;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZTCFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZTCF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZTCF__OP_TMH, oldOpTmh, opTmh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZTCF__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPwrFrq() {
		if (pwrFrq != null && pwrFrq.eIsProxy()) {
			InternalEObject oldPwrFrq = (InternalEObject)pwrFrq;
			pwrFrq = (ASG)eResolveProxy(oldPwrFrq);
			if (pwrFrq != oldPwrFrq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZTCF__PWR_FRQ, oldPwrFrq, pwrFrq));
			}
		}
		return pwrFrq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPwrFrq() {
		return pwrFrq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwrFrq(ASG newPwrFrq) {
		ASG oldPwrFrq = pwrFrq;
		pwrFrq = newPwrFrq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZTCF__PWR_FRQ, oldPwrFrq, pwrFrq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZTCF__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZTCF__PWR_FRQ:
				if (resolve) return getPwrFrq();
				return basicGetPwrFrq();
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
			case LNGroupZPackage.ZTCF__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupZPackage.ZTCF__PWR_FRQ:
				setPwrFrq((ASG)newValue);
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
			case LNGroupZPackage.ZTCF__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupZPackage.ZTCF__PWR_FRQ:
				setPwrFrq((ASG)null);
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
			case LNGroupZPackage.ZTCF__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZTCF__PWR_FRQ:
				return pwrFrq != null;
		}
		return super.eIsSet(featureID);
	}

} //ZTCFImpl
