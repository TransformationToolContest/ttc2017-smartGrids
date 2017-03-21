/**
 */
package substationStandard.LNNodes.LNGroupP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PHAR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHAR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PHARImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PHARImpl#getHaRst <em>Ha Rst</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PHARImpl#getPhStr <em>Ph Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PHARImpl#getPhStop <em>Ph Stop</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PHARImpl#getOpDiTmms <em>Op Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PHARImpl#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PHARImpl extends GroupPImpl implements PHAR {
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
	 * The cached value of the '{@link #getHaRst() <em>Ha Rst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaRst()
	 * @generated
	 * @ordered
	 */
	protected ING haRst;

	/**
	 * The cached value of the '{@link #getPhStr() <em>Ph Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhStr()
	 * @generated
	 * @ordered
	 */
	protected ASG phStr;

	/**
	 * The cached value of the '{@link #getPhStop() <em>Ph Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhStop()
	 * @generated
	 * @ordered
	 */
	protected ASG phStop;

	/**
	 * The cached value of the '{@link #getOpDiTmms() <em>Op Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDiTmms()
	 * @generated
	 * @ordered
	 */
	protected ING opDiTmms;

	/**
	 * The cached value of the '{@link #getRsDiTmms() <em>Rs Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsDiTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rsDiTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PHARImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PHAR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PHAR__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PHAR__STR, oldStr, str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getHaRst() {
		if (haRst != null && haRst.eIsProxy()) {
			InternalEObject oldHaRst = (InternalEObject)haRst;
			haRst = (ING)eResolveProxy(oldHaRst);
			if (haRst != oldHaRst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PHAR__HA_RST, oldHaRst, haRst));
			}
		}
		return haRst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetHaRst() {
		return haRst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaRst(ING newHaRst) {
		ING oldHaRst = haRst;
		haRst = newHaRst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PHAR__HA_RST, oldHaRst, haRst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPhStr() {
		if (phStr != null && phStr.eIsProxy()) {
			InternalEObject oldPhStr = (InternalEObject)phStr;
			phStr = (ASG)eResolveProxy(oldPhStr);
			if (phStr != oldPhStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PHAR__PH_STR, oldPhStr, phStr));
			}
		}
		return phStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPhStr() {
		return phStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhStr(ASG newPhStr) {
		ASG oldPhStr = phStr;
		phStr = newPhStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PHAR__PH_STR, oldPhStr, phStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPhStop() {
		if (phStop != null && phStop.eIsProxy()) {
			InternalEObject oldPhStop = (InternalEObject)phStop;
			phStop = (ASG)eResolveProxy(oldPhStop);
			if (phStop != oldPhStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PHAR__PH_STOP, oldPhStop, phStop));
			}
		}
		return phStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPhStop() {
		return phStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhStop(ASG newPhStop) {
		ASG oldPhStop = phStop;
		phStop = newPhStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PHAR__PH_STOP, oldPhStop, phStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getOpDiTmms() {
		if (opDiTmms != null && opDiTmms.eIsProxy()) {
			InternalEObject oldOpDiTmms = (InternalEObject)opDiTmms;
			opDiTmms = (ING)eResolveProxy(oldOpDiTmms);
			if (opDiTmms != oldOpDiTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PHAR__OP_DI_TMMS, oldOpDiTmms, opDiTmms));
			}
		}
		return opDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetOpDiTmms() {
		return opDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDiTmms(ING newOpDiTmms) {
		ING oldOpDiTmms = opDiTmms;
		opDiTmms = newOpDiTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PHAR__OP_DI_TMMS, oldOpDiTmms, opDiTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRsDiTmms() {
		if (rsDiTmms != null && rsDiTmms.eIsProxy()) {
			InternalEObject oldRsDiTmms = (InternalEObject)rsDiTmms;
			rsDiTmms = (ING)eResolveProxy(oldRsDiTmms);
			if (rsDiTmms != oldRsDiTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PHAR__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
			}
		}
		return rsDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRsDiTmms() {
		return rsDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsDiTmms(ING newRsDiTmms) {
		ING oldRsDiTmms = rsDiTmms;
		rsDiTmms = newRsDiTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PHAR__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PHAR__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PHAR__HA_RST:
				if (resolve) return getHaRst();
				return basicGetHaRst();
			case LNGroupPPackage.PHAR__PH_STR:
				if (resolve) return getPhStr();
				return basicGetPhStr();
			case LNGroupPPackage.PHAR__PH_STOP:
				if (resolve) return getPhStop();
				return basicGetPhStop();
			case LNGroupPPackage.PHAR__OP_DI_TMMS:
				if (resolve) return getOpDiTmms();
				return basicGetOpDiTmms();
			case LNGroupPPackage.PHAR__RS_DI_TMMS:
				if (resolve) return getRsDiTmms();
				return basicGetRsDiTmms();
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
			case LNGroupPPackage.PHAR__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PHAR__HA_RST:
				setHaRst((ING)newValue);
				return;
			case LNGroupPPackage.PHAR__PH_STR:
				setPhStr((ASG)newValue);
				return;
			case LNGroupPPackage.PHAR__PH_STOP:
				setPhStop((ASG)newValue);
				return;
			case LNGroupPPackage.PHAR__OP_DI_TMMS:
				setOpDiTmms((ING)newValue);
				return;
			case LNGroupPPackage.PHAR__RS_DI_TMMS:
				setRsDiTmms((ING)newValue);
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
			case LNGroupPPackage.PHAR__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PHAR__HA_RST:
				setHaRst((ING)null);
				return;
			case LNGroupPPackage.PHAR__PH_STR:
				setPhStr((ASG)null);
				return;
			case LNGroupPPackage.PHAR__PH_STOP:
				setPhStop((ASG)null);
				return;
			case LNGroupPPackage.PHAR__OP_DI_TMMS:
				setOpDiTmms((ING)null);
				return;
			case LNGroupPPackage.PHAR__RS_DI_TMMS:
				setRsDiTmms((ING)null);
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
			case LNGroupPPackage.PHAR__STR:
				return str != null;
			case LNGroupPPackage.PHAR__HA_RST:
				return haRst != null;
			case LNGroupPPackage.PHAR__PH_STR:
				return phStr != null;
			case LNGroupPPackage.PHAR__PH_STOP:
				return phStop != null;
			case LNGroupPPackage.PHAR__OP_DI_TMMS:
				return opDiTmms != null;
			case LNGroupPPackage.PHAR__RS_DI_TMMS:
				return rsDiTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PHARImpl
