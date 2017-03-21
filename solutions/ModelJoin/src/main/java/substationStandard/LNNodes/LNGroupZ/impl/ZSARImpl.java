/**
 */
package substationStandard.LNNodes.LNGroupZ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import substationStandard.LNNodes.LNGroupZ.ZSAR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZSAR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZSARImpl#getOpCnt <em>Op Cnt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZSARImpl#getOPSA <em>OPSA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZSARImpl extends GroupZImpl implements ZSAR {
	/**
	 * The cached value of the '{@link #getOpCnt() <em>Op Cnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCnt()
	 * @generated
	 * @ordered
	 */
	protected INS opCnt;

	/**
	 * The cached value of the '{@link #getOPSA() <em>OPSA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOPSA()
	 * @generated
	 * @ordered
	 */
	protected SPS opsa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZSARImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZSAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpCnt() {
		if (opCnt != null && opCnt.eIsProxy()) {
			InternalEObject oldOpCnt = (InternalEObject)opCnt;
			opCnt = (INS)eResolveProxy(oldOpCnt);
			if (opCnt != oldOpCnt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZSAR__OP_CNT, oldOpCnt, opCnt));
			}
		}
		return opCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpCnt() {
		return opCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCnt(INS newOpCnt) {
		INS oldOpCnt = opCnt;
		opCnt = newOpCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZSAR__OP_CNT, oldOpCnt, opCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOPSA() {
		if (opsa != null && opsa.eIsProxy()) {
			InternalEObject oldOPSA = (InternalEObject)opsa;
			opsa = (SPS)eResolveProxy(oldOPSA);
			if (opsa != oldOPSA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZSAR__OPSA, oldOPSA, opsa));
			}
		}
		return opsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOPSA() {
		return opsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOPSA(SPS newOPSA) {
		SPS oldOPSA = opsa;
		opsa = newOPSA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZSAR__OPSA, oldOPSA, opsa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZSAR__OP_CNT:
				if (resolve) return getOpCnt();
				return basicGetOpCnt();
			case LNGroupZPackage.ZSAR__OPSA:
				if (resolve) return getOPSA();
				return basicGetOPSA();
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
			case LNGroupZPackage.ZSAR__OP_CNT:
				setOpCnt((INS)newValue);
				return;
			case LNGroupZPackage.ZSAR__OPSA:
				setOPSA((SPS)newValue);
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
			case LNGroupZPackage.ZSAR__OP_CNT:
				setOpCnt((INS)null);
				return;
			case LNGroupZPackage.ZSAR__OPSA:
				setOPSA((SPS)null);
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
			case LNGroupZPackage.ZSAR__OP_CNT:
				return opCnt != null;
			case LNGroupZPackage.ZSAR__OPSA:
				return opsa != null;
		}
		return super.eIsSet(featureID);
	}

} //ZSARImpl
