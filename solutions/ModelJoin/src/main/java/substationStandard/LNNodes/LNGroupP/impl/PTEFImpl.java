/**
 */
package substationStandard.LNNodes.LNGroupP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PTEF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTEF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTEFImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTEFImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTEFImpl#getGndStr <em>Gnd Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTEFImpl#getDirMod <em>Dir Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTEFImpl extends GroupPImpl implements PTEF {
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
	 * The cached value of the '{@link #getGndStr() <em>Gnd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGndStr()
	 * @generated
	 * @ordered
	 */
	protected ASG gndStr;

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
	protected PTEFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PTEF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTEF__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTEF__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTEF__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTEF__OP, oldOp, op));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTEF__GND_STR, oldGndStr, gndStr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTEF__GND_STR, oldGndStr, gndStr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTEF__DIR_MOD, oldDirMod, dirMod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTEF__DIR_MOD, oldDirMod, dirMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PTEF__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PTEF__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PTEF__GND_STR:
				if (resolve) return getGndStr();
				return basicGetGndStr();
			case LNGroupPPackage.PTEF__DIR_MOD:
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
			case LNGroupPPackage.PTEF__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PTEF__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PTEF__GND_STR:
				setGndStr((ASG)newValue);
				return;
			case LNGroupPPackage.PTEF__DIR_MOD:
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
			case LNGroupPPackage.PTEF__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PTEF__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PTEF__GND_STR:
				setGndStr((ASG)null);
				return;
			case LNGroupPPackage.PTEF__DIR_MOD:
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
			case LNGroupPPackage.PTEF__STR:
				return str != null;
			case LNGroupPPackage.PTEF__OP:
				return op != null;
			case LNGroupPPackage.PTEF__GND_STR:
				return gndStr != null;
			case LNGroupPPackage.PTEF__DIR_MOD:
				return dirMod != null;
		}
		return super.eIsSet(featureID);
	}

} //PTEFImpl
