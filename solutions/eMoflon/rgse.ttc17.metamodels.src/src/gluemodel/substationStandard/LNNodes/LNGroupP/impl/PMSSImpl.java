/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;

import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.PMSS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMSS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl#getSetA <em>Set A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl#getSetTms <em>Set Tms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl#getMotStr <em>Mot Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl#getLokRotTms <em>Lok Rot Tms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PMSSImpl extends GroupPImpl implements PMSS {
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
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ACT op;

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
	 * The cached value of the '{@link #getMotStr() <em>Mot Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotStr()
	 * @generated
	 * @ordered
	 */
	protected ASG motStr;

	/**
	 * The cached value of the '{@link #getLokRotTms() <em>Lok Rot Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLokRotTms()
	 * @generated
	 * @ordered
	 */
	protected ING lokRotTms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMSSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PMSS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMSS__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMSS__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMSS__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMSS__OP, oldOp, op));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMSS__SET_A, oldSetA, setA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMSS__SET_A, oldSetA, setA));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMSS__SET_TMS, oldSetTms, setTms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMSS__SET_TMS, oldSetTms, setTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getMotStr() {
		if (motStr != null && motStr.eIsProxy()) {
			InternalEObject oldMotStr = (InternalEObject)motStr;
			motStr = (ASG)eResolveProxy(oldMotStr);
			if (motStr != oldMotStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMSS__MOT_STR, oldMotStr, motStr));
			}
		}
		return motStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetMotStr() {
		return motStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotStr(ASG newMotStr) {
		ASG oldMotStr = motStr;
		motStr = newMotStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMSS__MOT_STR, oldMotStr, motStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getLokRotTms() {
		if (lokRotTms != null && lokRotTms.eIsProxy()) {
			InternalEObject oldLokRotTms = (InternalEObject)lokRotTms;
			lokRotTms = (ING)eResolveProxy(oldLokRotTms);
			if (lokRotTms != oldLokRotTms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PMSS__LOK_ROT_TMS, oldLokRotTms, lokRotTms));
			}
		}
		return lokRotTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetLokRotTms() {
		return lokRotTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLokRotTms(ING newLokRotTms) {
		ING oldLokRotTms = lokRotTms;
		lokRotTms = newLokRotTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PMSS__LOK_ROT_TMS, oldLokRotTms, lokRotTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PMSS__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PMSS__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PMSS__SET_A:
				if (resolve) return getSetA();
				return basicGetSetA();
			case LNGroupPPackage.PMSS__SET_TMS:
				if (resolve) return getSetTms();
				return basicGetSetTms();
			case LNGroupPPackage.PMSS__MOT_STR:
				if (resolve) return getMotStr();
				return basicGetMotStr();
			case LNGroupPPackage.PMSS__LOK_ROT_TMS:
				if (resolve) return getLokRotTms();
				return basicGetLokRotTms();
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
			case LNGroupPPackage.PMSS__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PMSS__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PMSS__SET_A:
				setSetA((ASG)newValue);
				return;
			case LNGroupPPackage.PMSS__SET_TMS:
				setSetTms((ING)newValue);
				return;
			case LNGroupPPackage.PMSS__MOT_STR:
				setMotStr((ASG)newValue);
				return;
			case LNGroupPPackage.PMSS__LOK_ROT_TMS:
				setLokRotTms((ING)newValue);
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
			case LNGroupPPackage.PMSS__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PMSS__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PMSS__SET_A:
				setSetA((ASG)null);
				return;
			case LNGroupPPackage.PMSS__SET_TMS:
				setSetTms((ING)null);
				return;
			case LNGroupPPackage.PMSS__MOT_STR:
				setMotStr((ASG)null);
				return;
			case LNGroupPPackage.PMSS__LOK_ROT_TMS:
				setLokRotTms((ING)null);
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
			case LNGroupPPackage.PMSS__STR:
				return str != null;
			case LNGroupPPackage.PMSS__OP:
				return op != null;
			case LNGroupPPackage.PMSS__SET_A:
				return setA != null;
			case LNGroupPPackage.PMSS__SET_TMS:
				return setTms != null;
			case LNGroupPPackage.PMSS__MOT_STR:
				return motStr != null;
			case LNGroupPPackage.PMSS__LOK_ROT_TMS:
				return lokRotTms != null;
		}
		return super.eIsSet(featureID);
	}

} //PMSSImpl
