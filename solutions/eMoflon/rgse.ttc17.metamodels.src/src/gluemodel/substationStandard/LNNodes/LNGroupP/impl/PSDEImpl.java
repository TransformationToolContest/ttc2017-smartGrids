/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;

import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.PSDE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSDE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getAng <em>Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getGndStr <em>Gnd Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getGndOp <em>Gnd Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getStrDlTmms <em>Str Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl#getDirMod <em>Dir Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSDEImpl extends GroupPImpl implements PSDE {
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
	 * The cached value of the '{@link #getAng() <em>Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAng()
	 * @generated
	 * @ordered
	 */
	protected ASG ang;

	/**
	 * The cached value of the '{@link #getGndStr() <em>Gnd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGndStr()
	 * @generated
	 * @ordered
	 */
	protected ASG gndStr;

	/**
	 * The cached value of the '{@link #getGndOp() <em>Gnd Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGndOp()
	 * @generated
	 * @ordered
	 */
	protected ASG gndOp;

	/**
	 * The cached value of the '{@link #getStrDlTmms() <em>Str Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING strDlTmms;

	/**
	 * The cached value of the '{@link #getOpDlTmms() <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING opDlTmms;

	/**
	 * The cached value of the '{@link #getDirMod() <em>Dir Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirMod()
	 * @generated
	 * @ordered
	 */
	protected ING dirMod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSDEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PSDE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getAng() {
		if (ang != null && ang.eIsProxy()) {
			InternalEObject oldAng = (InternalEObject)ang;
			ang = (ASG)eResolveProxy(oldAng);
			if (ang != oldAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__ANG, oldAng, ang));
			}
		}
		return ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetAng() {
		return ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAng(ASG newAng) {
		ASG oldAng = ang;
		ang = newAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__ANG, oldAng, ang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getGndStr() {
		if (gndStr != null && gndStr.eIsProxy()) {
			InternalEObject oldGndStr = (InternalEObject)gndStr;
			gndStr = (ASG)eResolveProxy(oldGndStr);
			if (gndStr != oldGndStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__GND_STR, oldGndStr, gndStr));
			}
		}
		return gndStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetGndStr() {
		return gndStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGndStr(ASG newGndStr) {
		ASG oldGndStr = gndStr;
		gndStr = newGndStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__GND_STR, oldGndStr, gndStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getGndOp() {
		if (gndOp != null && gndOp.eIsProxy()) {
			InternalEObject oldGndOp = (InternalEObject)gndOp;
			gndOp = (ASG)eResolveProxy(oldGndOp);
			if (gndOp != oldGndOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__GND_OP, oldGndOp, gndOp));
			}
		}
		return gndOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetGndOp() {
		return gndOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGndOp(ASG newGndOp) {
		ASG oldGndOp = gndOp;
		gndOp = newGndOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__GND_OP, oldGndOp, gndOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getStrDlTmms() {
		if (strDlTmms != null && strDlTmms.eIsProxy()) {
			InternalEObject oldStrDlTmms = (InternalEObject)strDlTmms;
			strDlTmms = (ING)eResolveProxy(oldStrDlTmms);
			if (strDlTmms != oldStrDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__STR_DL_TMMS, oldStrDlTmms, strDlTmms));
			}
		}
		return strDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetStrDlTmms() {
		return strDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrDlTmms(ING newStrDlTmms) {
		ING oldStrDlTmms = strDlTmms;
		strDlTmms = newStrDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__STR_DL_TMMS, oldStrDlTmms, strDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getOpDlTmms() {
		if (opDlTmms != null && opDlTmms.eIsProxy()) {
			InternalEObject oldOpDlTmms = (InternalEObject)opDlTmms;
			opDlTmms = (ING)eResolveProxy(oldOpDlTmms);
			if (opDlTmms != oldOpDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
			}
		}
		return opDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetOpDlTmms() {
		return opDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDlTmms(ING newOpDlTmms) {
		ING oldOpDlTmms = opDlTmms;
		opDlTmms = newOpDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getDirMod() {
		if (dirMod != null && dirMod.eIsProxy()) {
			InternalEObject oldDirMod = (InternalEObject)dirMod;
			dirMod = (ING)eResolveProxy(oldDirMod);
			if (dirMod != oldDirMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PSDE__DIR_MOD, oldDirMod, dirMod));
			}
		}
		return dirMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetDirMod() {
		return dirMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirMod(ING newDirMod) {
		ING oldDirMod = dirMod;
		dirMod = newDirMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PSDE__DIR_MOD, oldDirMod, dirMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PSDE__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PSDE__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PSDE__ANG:
				if (resolve) return getAng();
				return basicGetAng();
			case LNGroupPPackage.PSDE__GND_STR:
				if (resolve) return getGndStr();
				return basicGetGndStr();
			case LNGroupPPackage.PSDE__GND_OP:
				if (resolve) return getGndOp();
				return basicGetGndOp();
			case LNGroupPPackage.PSDE__STR_DL_TMMS:
				if (resolve) return getStrDlTmms();
				return basicGetStrDlTmms();
			case LNGroupPPackage.PSDE__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PSDE__DIR_MOD:
				if (resolve) return getDirMod();
				return basicGetDirMod();
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
			case LNGroupPPackage.PSDE__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PSDE__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PSDE__ANG:
				setAng((ASG)newValue);
				return;
			case LNGroupPPackage.PSDE__GND_STR:
				setGndStr((ASG)newValue);
				return;
			case LNGroupPPackage.PSDE__GND_OP:
				setGndOp((ASG)newValue);
				return;
			case LNGroupPPackage.PSDE__STR_DL_TMMS:
				setStrDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSDE__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PSDE__DIR_MOD:
				setDirMod((ING)newValue);
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
			case LNGroupPPackage.PSDE__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PSDE__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PSDE__ANG:
				setAng((ASG)null);
				return;
			case LNGroupPPackage.PSDE__GND_STR:
				setGndStr((ASG)null);
				return;
			case LNGroupPPackage.PSDE__GND_OP:
				setGndOp((ASG)null);
				return;
			case LNGroupPPackage.PSDE__STR_DL_TMMS:
				setStrDlTmms((ING)null);
				return;
			case LNGroupPPackage.PSDE__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PSDE__DIR_MOD:
				setDirMod((ING)null);
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
			case LNGroupPPackage.PSDE__STR:
				return str != null;
			case LNGroupPPackage.PSDE__OP:
				return op != null;
			case LNGroupPPackage.PSDE__ANG:
				return ang != null;
			case LNGroupPPackage.PSDE__GND_STR:
				return gndStr != null;
			case LNGroupPPackage.PSDE__GND_OP:
				return gndOp != null;
			case LNGroupPPackage.PSDE__STR_DL_TMMS:
				return strDlTmms != null;
			case LNGroupPPackage.PSDE__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PSDE__DIR_MOD:
				return dirMod != null;
		}
		return super.eIsSet(featureID);
	}

} //PSDEImpl
