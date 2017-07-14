/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC.impl;

import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupC.CPOW;
import gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPOW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl#getTmExc <em>Tm Exc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl#getStrPOW <em>Str POW</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl#getOpOpn <em>Op Opn</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl#getOpCls <em>Op Cls</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl#getMaxDlTmms <em>Max Dl Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPOWImpl extends GroupCImpl implements CPOW {
	/**
	 * The cached value of the '{@link #getTmExc() <em>Tm Exc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmExc()
	 * @generated
	 * @ordered
	 */
	protected SPS tmExc;

	/**
	 * The cached value of the '{@link #getStrPOW() <em>Str POW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrPOW()
	 * @generated
	 * @ordered
	 */
	protected SPS strPOW;

	/**
	 * The cached value of the '{@link #getOpOpn() <em>Op Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpOpn()
	 * @generated
	 * @ordered
	 */
	protected ACT opOpn;

	/**
	 * The cached value of the '{@link #getOpCls() <em>Op Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCls()
	 * @generated
	 * @ordered
	 */
	protected ACT opCls;

	/**
	 * The cached value of the '{@link #getMaxDlTmms() <em>Max Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING maxDlTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPOWImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupCPackage.Literals.CPOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getTmExc() {
		if (tmExc != null && tmExc.eIsProxy()) {
			InternalEObject oldTmExc = (InternalEObject)tmExc;
			tmExc = (SPS)eResolveProxy(oldTmExc);
			if (tmExc != oldTmExc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CPOW__TM_EXC, oldTmExc, tmExc));
			}
		}
		return tmExc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetTmExc() {
		return tmExc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmExc(SPS newTmExc) {
		SPS oldTmExc = tmExc;
		tmExc = newTmExc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CPOW__TM_EXC, oldTmExc, tmExc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getStrPOW() {
		if (strPOW != null && strPOW.eIsProxy()) {
			InternalEObject oldStrPOW = (InternalEObject)strPOW;
			strPOW = (SPS)eResolveProxy(oldStrPOW);
			if (strPOW != oldStrPOW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CPOW__STR_POW, oldStrPOW, strPOW));
			}
		}
		return strPOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetStrPOW() {
		return strPOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrPOW(SPS newStrPOW) {
		SPS oldStrPOW = strPOW;
		strPOW = newStrPOW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CPOW__STR_POW, oldStrPOW, strPOW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOpOpn() {
		if (opOpn != null && opOpn.eIsProxy()) {
			InternalEObject oldOpOpn = (InternalEObject)opOpn;
			opOpn = (ACT)eResolveProxy(oldOpOpn);
			if (opOpn != oldOpOpn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CPOW__OP_OPN, oldOpOpn, opOpn));
			}
		}
		return opOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOpOpn() {
		return opOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpOpn(ACT newOpOpn) {
		ACT oldOpOpn = opOpn;
		opOpn = newOpOpn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CPOW__OP_OPN, oldOpOpn, opOpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOpCls() {
		if (opCls != null && opCls.eIsProxy()) {
			InternalEObject oldOpCls = (InternalEObject)opCls;
			opCls = (ACT)eResolveProxy(oldOpCls);
			if (opCls != oldOpCls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CPOW__OP_CLS, oldOpCls, opCls));
			}
		}
		return opCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOpCls() {
		return opCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCls(ACT newOpCls) {
		ACT oldOpCls = opCls;
		opCls = newOpCls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CPOW__OP_CLS, oldOpCls, opCls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxDlTmms() {
		if (maxDlTmms != null && maxDlTmms.eIsProxy()) {
			InternalEObject oldMaxDlTmms = (InternalEObject)maxDlTmms;
			maxDlTmms = (ING)eResolveProxy(oldMaxDlTmms);
			if (maxDlTmms != oldMaxDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CPOW__MAX_DL_TMMS, oldMaxDlTmms, maxDlTmms));
			}
		}
		return maxDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxDlTmms() {
		return maxDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDlTmms(ING newMaxDlTmms) {
		ING oldMaxDlTmms = maxDlTmms;
		maxDlTmms = newMaxDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CPOW__MAX_DL_TMMS, oldMaxDlTmms, maxDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupCPackage.CPOW__TM_EXC:
				if (resolve) return getTmExc();
				return basicGetTmExc();
			case LNGroupCPackage.CPOW__STR_POW:
				if (resolve) return getStrPOW();
				return basicGetStrPOW();
			case LNGroupCPackage.CPOW__OP_OPN:
				if (resolve) return getOpOpn();
				return basicGetOpOpn();
			case LNGroupCPackage.CPOW__OP_CLS:
				if (resolve) return getOpCls();
				return basicGetOpCls();
			case LNGroupCPackage.CPOW__MAX_DL_TMMS:
				if (resolve) return getMaxDlTmms();
				return basicGetMaxDlTmms();
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
			case LNGroupCPackage.CPOW__TM_EXC:
				setTmExc((SPS)newValue);
				return;
			case LNGroupCPackage.CPOW__STR_POW:
				setStrPOW((SPS)newValue);
				return;
			case LNGroupCPackage.CPOW__OP_OPN:
				setOpOpn((ACT)newValue);
				return;
			case LNGroupCPackage.CPOW__OP_CLS:
				setOpCls((ACT)newValue);
				return;
			case LNGroupCPackage.CPOW__MAX_DL_TMMS:
				setMaxDlTmms((ING)newValue);
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
			case LNGroupCPackage.CPOW__TM_EXC:
				setTmExc((SPS)null);
				return;
			case LNGroupCPackage.CPOW__STR_POW:
				setStrPOW((SPS)null);
				return;
			case LNGroupCPackage.CPOW__OP_OPN:
				setOpOpn((ACT)null);
				return;
			case LNGroupCPackage.CPOW__OP_CLS:
				setOpCls((ACT)null);
				return;
			case LNGroupCPackage.CPOW__MAX_DL_TMMS:
				setMaxDlTmms((ING)null);
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
			case LNGroupCPackage.CPOW__TM_EXC:
				return tmExc != null;
			case LNGroupCPackage.CPOW__STR_POW:
				return strPOW != null;
			case LNGroupCPackage.CPOW__OP_OPN:
				return opOpn != null;
			case LNGroupCPackage.CPOW__OP_CLS:
				return opCls != null;
			case LNGroupCPackage.CPOW__MAX_DL_TMMS:
				return maxDlTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //CPOWImpl
