/**
 */
package substationStandard.LNNodes.LNGroupP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PMRI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMRI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getStrInh <em>Str Inh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getStrInhTmm <em>Str Inh Tmm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getSetA <em>Set A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getSetTms <em>Set Tms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getMaxNumStr <em>Max Num Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getMaxWrmStr <em>Max Wrm Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getMaxStrTmm <em>Max Str Tmm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getEqTmm <em>Eq Tmm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PMRIImpl#getInhTmm <em>Inh Tmm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PMRIImpl extends GroupPImpl implements PMRI {
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
	 * The cached value of the '{@link #getStrInh() <em>Str Inh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrInh()
	 * @generated
	 * @ordered
	 */
	protected SPS strInh;

	/**
	 * The cached value of the '{@link #getStrInhTmm() <em>Str Inh Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrInhTmm()
	 * @generated
	 * @ordered
	 */
	protected INS strInhTmm;

	/**
	 * The cached value of the '{@link #getSetA() <em>Set A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetA()
	 * @generated
	 * @ordered
	 */
	protected ASG setA;

	/**
	 * The cached value of the '{@link #getSetTms() <em>Set Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetTms()
	 * @generated
	 * @ordered
	 */
	protected ING setTms;

	/**
	 * The cached value of the '{@link #getMaxNumStr() <em>Max Num Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumStr()
	 * @generated
	 * @ordered
	 */
	protected ING maxNumStr;

	/**
	 * The cached value of the '{@link #getMaxWrmStr() <em>Max Wrm Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWrmStr()
	 * @generated
	 * @ordered
	 */
	protected ING maxWrmStr;

	/**
	 * The cached value of the '{@link #getMaxStrTmm() <em>Max Str Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStrTmm()
	 * @generated
	 * @ordered
	 */
	protected ING maxStrTmm;

	/**
	 * The cached value of the '{@link #getEqTmm() <em>Eq Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqTmm()
	 * @generated
	 * @ordered
	 */
	protected ING eqTmm;

	/**
	 * The cached value of the '{@link #getInhTmm() <em>Inh Tmm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhTmm()
	 * @generated
	 * @ordered
	 */
	protected ING inhTmm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMRIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PMRI;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getStrInh() {
		if (strInh != null && strInh.eIsProxy()) {
			InternalEObject oldStrInh = (InternalEObject)strInh;
			strInh = (SPS)eResolveProxy(oldStrInh);
			if (strInh != oldStrInh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__STR_INH, oldStrInh, strInh));
			}
		}
		return strInh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetStrInh() {
		return strInh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrInh(SPS newStrInh) {
		SPS oldStrInh = strInh;
		strInh = newStrInh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__STR_INH, oldStrInh, strInh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getStrInhTmm() {
		if (strInhTmm != null && strInhTmm.eIsProxy()) {
			InternalEObject oldStrInhTmm = (InternalEObject)strInhTmm;
			strInhTmm = (INS)eResolveProxy(oldStrInhTmm);
			if (strInhTmm != oldStrInhTmm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__STR_INH_TMM, oldStrInhTmm, strInhTmm));
			}
		}
		return strInhTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetStrInhTmm() {
		return strInhTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrInhTmm(INS newStrInhTmm) {
		INS oldStrInhTmm = strInhTmm;
		strInhTmm = newStrInhTmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__STR_INH_TMM, oldStrInhTmm, strInhTmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getSetA() {
		if (setA != null && setA.eIsProxy()) {
			InternalEObject oldSetA = (InternalEObject)setA;
			setA = (ASG)eResolveProxy(oldSetA);
			if (setA != oldSetA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__SET_A, oldSetA, setA));
			}
		}
		return setA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetSetA() {
		return setA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetA(ASG newSetA) {
		ASG oldSetA = setA;
		setA = newSetA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__SET_A, oldSetA, setA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getSetTms() {
		if (setTms != null && setTms.eIsProxy()) {
			InternalEObject oldSetTms = (InternalEObject)setTms;
			setTms = (ING)eResolveProxy(oldSetTms);
			if (setTms != oldSetTms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__SET_TMS, oldSetTms, setTms));
			}
		}
		return setTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetSetTms() {
		return setTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetTms(ING newSetTms) {
		ING oldSetTms = setTms;
		setTms = newSetTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__SET_TMS, oldSetTms, setTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxNumStr() {
		if (maxNumStr != null && maxNumStr.eIsProxy()) {
			InternalEObject oldMaxNumStr = (InternalEObject)maxNumStr;
			maxNumStr = (ING)eResolveProxy(oldMaxNumStr);
			if (maxNumStr != oldMaxNumStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__MAX_NUM_STR, oldMaxNumStr, maxNumStr));
			}
		}
		return maxNumStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxNumStr() {
		return maxNumStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumStr(ING newMaxNumStr) {
		ING oldMaxNumStr = maxNumStr;
		maxNumStr = newMaxNumStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__MAX_NUM_STR, oldMaxNumStr, maxNumStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxWrmStr() {
		if (maxWrmStr != null && maxWrmStr.eIsProxy()) {
			InternalEObject oldMaxWrmStr = (InternalEObject)maxWrmStr;
			maxWrmStr = (ING)eResolveProxy(oldMaxWrmStr);
			if (maxWrmStr != oldMaxWrmStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__MAX_WRM_STR, oldMaxWrmStr, maxWrmStr));
			}
		}
		return maxWrmStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxWrmStr() {
		return maxWrmStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWrmStr(ING newMaxWrmStr) {
		ING oldMaxWrmStr = maxWrmStr;
		maxWrmStr = newMaxWrmStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__MAX_WRM_STR, oldMaxWrmStr, maxWrmStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxStrTmm() {
		if (maxStrTmm != null && maxStrTmm.eIsProxy()) {
			InternalEObject oldMaxStrTmm = (InternalEObject)maxStrTmm;
			maxStrTmm = (ING)eResolveProxy(oldMaxStrTmm);
			if (maxStrTmm != oldMaxStrTmm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__MAX_STR_TMM, oldMaxStrTmm, maxStrTmm));
			}
		}
		return maxStrTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxStrTmm() {
		return maxStrTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStrTmm(ING newMaxStrTmm) {
		ING oldMaxStrTmm = maxStrTmm;
		maxStrTmm = newMaxStrTmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__MAX_STR_TMM, oldMaxStrTmm, maxStrTmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getEqTmm() {
		if (eqTmm != null && eqTmm.eIsProxy()) {
			InternalEObject oldEqTmm = (InternalEObject)eqTmm;
			eqTmm = (ING)eResolveProxy(oldEqTmm);
			if (eqTmm != oldEqTmm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__EQ_TMM, oldEqTmm, eqTmm));
			}
		}
		return eqTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetEqTmm() {
		return eqTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqTmm(ING newEqTmm) {
		ING oldEqTmm = eqTmm;
		eqTmm = newEqTmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__EQ_TMM, oldEqTmm, eqTmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getInhTmm() {
		if (inhTmm != null && inhTmm.eIsProxy()) {
			InternalEObject oldInhTmm = (InternalEObject)inhTmm;
			inhTmm = (ING)eResolveProxy(oldInhTmm);
			if (inhTmm != oldInhTmm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMRI__INH_TMM, oldInhTmm, inhTmm));
			}
		}
		return inhTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetInhTmm() {
		return inhTmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhTmm(ING newInhTmm) {
		ING oldInhTmm = inhTmm;
		inhTmm = newInhTmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMRI__INH_TMM, oldInhTmm, inhTmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PMRI__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PMRI__STR_INH:
				if (resolve) return getStrInh();
				return basicGetStrInh();
			case LNGroupPPackage.PMRI__STR_INH_TMM:
				if (resolve) return getStrInhTmm();
				return basicGetStrInhTmm();
			case LNGroupPPackage.PMRI__SET_A:
				if (resolve) return getSetA();
				return basicGetSetA();
			case LNGroupPPackage.PMRI__SET_TMS:
				if (resolve) return getSetTms();
				return basicGetSetTms();
			case LNGroupPPackage.PMRI__MAX_NUM_STR:
				if (resolve) return getMaxNumStr();
				return basicGetMaxNumStr();
			case LNGroupPPackage.PMRI__MAX_WRM_STR:
				if (resolve) return getMaxWrmStr();
				return basicGetMaxWrmStr();
			case LNGroupPPackage.PMRI__MAX_STR_TMM:
				if (resolve) return getMaxStrTmm();
				return basicGetMaxStrTmm();
			case LNGroupPPackage.PMRI__EQ_TMM:
				if (resolve) return getEqTmm();
				return basicGetEqTmm();
			case LNGroupPPackage.PMRI__INH_TMM:
				if (resolve) return getInhTmm();
				return basicGetInhTmm();
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
			case LNGroupPPackage.PMRI__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PMRI__STR_INH:
				setStrInh((SPS)newValue);
				return;
			case LNGroupPPackage.PMRI__STR_INH_TMM:
				setStrInhTmm((INS)newValue);
				return;
			case LNGroupPPackage.PMRI__SET_A:
				setSetA((ASG)newValue);
				return;
			case LNGroupPPackage.PMRI__SET_TMS:
				setSetTms((ING)newValue);
				return;
			case LNGroupPPackage.PMRI__MAX_NUM_STR:
				setMaxNumStr((ING)newValue);
				return;
			case LNGroupPPackage.PMRI__MAX_WRM_STR:
				setMaxWrmStr((ING)newValue);
				return;
			case LNGroupPPackage.PMRI__MAX_STR_TMM:
				setMaxStrTmm((ING)newValue);
				return;
			case LNGroupPPackage.PMRI__EQ_TMM:
				setEqTmm((ING)newValue);
				return;
			case LNGroupPPackage.PMRI__INH_TMM:
				setInhTmm((ING)newValue);
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
			case LNGroupPPackage.PMRI__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PMRI__STR_INH:
				setStrInh((SPS)null);
				return;
			case LNGroupPPackage.PMRI__STR_INH_TMM:
				setStrInhTmm((INS)null);
				return;
			case LNGroupPPackage.PMRI__SET_A:
				setSetA((ASG)null);
				return;
			case LNGroupPPackage.PMRI__SET_TMS:
				setSetTms((ING)null);
				return;
			case LNGroupPPackage.PMRI__MAX_NUM_STR:
				setMaxNumStr((ING)null);
				return;
			case LNGroupPPackage.PMRI__MAX_WRM_STR:
				setMaxWrmStr((ING)null);
				return;
			case LNGroupPPackage.PMRI__MAX_STR_TMM:
				setMaxStrTmm((ING)null);
				return;
			case LNGroupPPackage.PMRI__EQ_TMM:
				setEqTmm((ING)null);
				return;
			case LNGroupPPackage.PMRI__INH_TMM:
				setInhTmm((ING)null);
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
			case LNGroupPPackage.PMRI__OP:
				return op != null;
			case LNGroupPPackage.PMRI__STR_INH:
				return strInh != null;
			case LNGroupPPackage.PMRI__STR_INH_TMM:
				return strInhTmm != null;
			case LNGroupPPackage.PMRI__SET_A:
				return setA != null;
			case LNGroupPPackage.PMRI__SET_TMS:
				return setTms != null;
			case LNGroupPPackage.PMRI__MAX_NUM_STR:
				return maxNumStr != null;
			case LNGroupPPackage.PMRI__MAX_WRM_STR:
				return maxWrmStr != null;
			case LNGroupPPackage.PMRI__MAX_STR_TMM:
				return maxStrTmm != null;
			case LNGroupPPackage.PMRI__EQ_TMM:
				return eqTmm != null;
			case LNGroupPPackage.PMRI__INH_TMM:
				return inhTmm != null;
		}
		return super.eIsSet(featureID);
	}

} //PMRIImpl
