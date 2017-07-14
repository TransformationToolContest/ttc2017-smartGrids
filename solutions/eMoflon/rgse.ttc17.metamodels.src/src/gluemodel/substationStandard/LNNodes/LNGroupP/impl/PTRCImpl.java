/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ING;

import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.PTRC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTRC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl#getTrMod <em>Tr Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl#getTrPlsTmms <em>Tr Pls Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTRCImpl extends GroupPImpl implements PTRC {
	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected ACT tr;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ACT op;

	/**
	 * The cached value of the '{@link #getStr() <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr()
	 * @generated
	 * @ordered
	 */
	protected ACD str;

	/**
	 * The cached value of the '{@link #getTrMod() <em>Tr Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrMod()
	 * @generated
	 * @ordered
	 */
	protected ING trMod;

	/**
	 * The cached value of the '{@link #getTrPlsTmms() <em>Tr Pls Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrPlsTmms()
	 * @generated
	 * @ordered
	 */
	protected ING trPlsTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTRCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PTRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getTr() {
		if (tr != null && tr.eIsProxy()) {
			InternalEObject oldTr = (InternalEObject)tr;
			tr = (ACT)eResolveProxy(oldTr);
			if (tr != oldTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTRC__TR, oldTr, tr));
			}
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetTr() {
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTr(ACT newTr) {
		ACT oldTr = tr;
		tr = newTr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTRC__TR, oldTr, tr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (ACT)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTRC__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(ACT newOp) {
		ACT oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTRC__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD getStr() {
		if (str != null && str.eIsProxy()) {
			InternalEObject oldStr = (InternalEObject)str;
			str = (ACD)eResolveProxy(oldStr);
			if (str != oldStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTRC__STR, oldStr, str));
			}
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD basicGetStr() {
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStr(ACD newStr) {
		ACD oldStr = str;
		str = newStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTRC__STR, oldStr, str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getTrMod() {
		if (trMod != null && trMod.eIsProxy()) {
			InternalEObject oldTrMod = (InternalEObject)trMod;
			trMod = (ING)eResolveProxy(oldTrMod);
			if (trMod != oldTrMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTRC__TR_MOD, oldTrMod, trMod));
			}
		}
		return trMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetTrMod() {
		return trMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrMod(ING newTrMod) {
		ING oldTrMod = trMod;
		trMod = newTrMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTRC__TR_MOD, oldTrMod, trMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getTrPlsTmms() {
		if (trPlsTmms != null && trPlsTmms.eIsProxy()) {
			InternalEObject oldTrPlsTmms = (InternalEObject)trPlsTmms;
			trPlsTmms = (ING)eResolveProxy(oldTrPlsTmms);
			if (trPlsTmms != oldTrPlsTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTRC__TR_PLS_TMMS, oldTrPlsTmms, trPlsTmms));
			}
		}
		return trPlsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetTrPlsTmms() {
		return trPlsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrPlsTmms(ING newTrPlsTmms) {
		ING oldTrPlsTmms = trPlsTmms;
		trPlsTmms = newTrPlsTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTRC__TR_PLS_TMMS, oldTrPlsTmms, trPlsTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PTRC__TR:
				if (resolve) return getTr();
				return basicGetTr();
			case LNGroupPPackage.PTRC__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PTRC__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PTRC__TR_MOD:
				if (resolve) return getTrMod();
				return basicGetTrMod();
			case LNGroupPPackage.PTRC__TR_PLS_TMMS:
				if (resolve) return getTrPlsTmms();
				return basicGetTrPlsTmms();
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
			case LNGroupPPackage.PTRC__TR:
				setTr((ACT)newValue);
				return;
			case LNGroupPPackage.PTRC__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PTRC__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PTRC__TR_MOD:
				setTrMod((ING)newValue);
				return;
			case LNGroupPPackage.PTRC__TR_PLS_TMMS:
				setTrPlsTmms((ING)newValue);
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
			case LNGroupPPackage.PTRC__TR:
				setTr((ACT)null);
				return;
			case LNGroupPPackage.PTRC__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PTRC__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PTRC__TR_MOD:
				setTrMod((ING)null);
				return;
			case LNGroupPPackage.PTRC__TR_PLS_TMMS:
				setTrPlsTmms((ING)null);
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
			case LNGroupPPackage.PTRC__TR:
				return tr != null;
			case LNGroupPPackage.PTRC__OP:
				return op != null;
			case LNGroupPPackage.PTRC__STR:
				return str != null;
			case LNGroupPPackage.PTRC__TR_MOD:
				return trMod != null;
			case LNGroupPPackage.PTRC__TR_PLS_TMMS:
				return trPlsTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PTRCImpl
