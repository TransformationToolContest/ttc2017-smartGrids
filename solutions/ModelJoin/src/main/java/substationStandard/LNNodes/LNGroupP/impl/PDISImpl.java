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
import substationStandard.Dataclasses.SPG;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PDIS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDIS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getPoRch <em>Po Rch</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getPhStr <em>Ph Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getGndStr <em>Gnd Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getDirMod <em>Dir Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getPctRch <em>Pct Rch</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getOfs <em>Ofs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getPctOfs <em>Pct Ofs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getRisLod <em>Ris Lod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getAngLod <em>Ang Lod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getTmDlMod <em>Tm Dl Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getPhDlMod <em>Ph Dl Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getPhDlTmms <em>Ph Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getGndDlMod <em>Gnd Dl Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getGndDlTmms <em>Gnd Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getLinAng <em>Lin Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getRisGndRch <em>Ris Gnd Rch</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getRisPhRch <em>Ris Ph Rch</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getK0Fact <em>K0 Fact</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getK0FactAng <em>K0 Fact Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDISImpl#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDISImpl extends GroupPImpl implements PDIS {
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
	 * The cached value of the '{@link #getPoRch() <em>Po Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoRch()
	 * @generated
	 * @ordered
	 */
	protected ASG poRch;

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
	 * The cached value of the '{@link #getPctRch() <em>Pct Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPctRch()
	 * @generated
	 * @ordered
	 */
	protected ASG pctRch;

	/**
	 * The cached value of the '{@link #getOfs() <em>Ofs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfs()
	 * @generated
	 * @ordered
	 */
	protected ASG ofs;

	/**
	 * The cached value of the '{@link #getPctOfs() <em>Pct Ofs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPctOfs()
	 * @generated
	 * @ordered
	 */
	protected ASG pctOfs;

	/**
	 * The cached value of the '{@link #getRisLod() <em>Ris Lod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisLod()
	 * @generated
	 * @ordered
	 */
	protected ASG risLod;

	/**
	 * The cached value of the '{@link #getAngLod() <em>Ang Lod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngLod()
	 * @generated
	 * @ordered
	 */
	protected ASG angLod;

	/**
	 * The cached value of the '{@link #getTmDlMod() <em>Tm Dl Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmDlMod()
	 * @generated
	 * @ordered
	 */
	protected SPG tmDlMod;

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
	 * The cached value of the '{@link #getPhDlMod() <em>Ph Dl Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhDlMod()
	 * @generated
	 * @ordered
	 */
	protected SPG phDlMod;

	/**
	 * The cached value of the '{@link #getPhDlTmms() <em>Ph Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING phDlTmms;

	/**
	 * The cached value of the '{@link #getGndDlMod() <em>Gnd Dl Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGndDlMod()
	 * @generated
	 * @ordered
	 */
	protected SPG gndDlMod;

	/**
	 * The cached value of the '{@link #getGndDlTmms() <em>Gnd Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGndDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING gndDlTmms;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected ASG x1;

	/**
	 * The cached value of the '{@link #getLinAng() <em>Lin Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinAng()
	 * @generated
	 * @ordered
	 */
	protected ASG linAng;

	/**
	 * The cached value of the '{@link #getRisGndRch() <em>Ris Gnd Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisGndRch()
	 * @generated
	 * @ordered
	 */
	protected ASG risGndRch;

	/**
	 * The cached value of the '{@link #getRisPhRch() <em>Ris Ph Rch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisPhRch()
	 * @generated
	 * @ordered
	 */
	protected ASG risPhRch;

	/**
	 * The cached value of the '{@link #getK0Fact() <em>K0 Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK0Fact()
	 * @generated
	 * @ordered
	 */
	protected ASG k0Fact;

	/**
	 * The cached value of the '{@link #getK0FactAng() <em>K0 Fact Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK0FactAng()
	 * @generated
	 * @ordered
	 */
	protected ASG k0FactAng;

	/**
	 * The cached value of the '{@link #getRsDlTmms() <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rsDlTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDISImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PDIS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPoRch() {
		if (poRch != null && poRch.eIsProxy()) {
			InternalEObject oldPoRch = (InternalEObject)poRch;
			poRch = (ASG)eResolveProxy(oldPoRch);
			if (poRch != oldPoRch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__PO_RCH, oldPoRch, poRch));
			}
		}
		return poRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPoRch() {
		return poRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoRch(ASG newPoRch) {
		ASG oldPoRch = poRch;
		poRch = newPoRch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__PO_RCH, oldPoRch, poRch));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__PH_STR, oldPhStr, phStr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__PH_STR, oldPhStr, phStr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__GND_STR, oldGndStr, gndStr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__GND_STR, oldGndStr, gndStr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__DIR_MOD, oldDirMod, dirMod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__DIR_MOD, oldDirMod, dirMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPctRch() {
		if (pctRch != null && pctRch.eIsProxy()) {
			InternalEObject oldPctRch = (InternalEObject)pctRch;
			pctRch = (ASG)eResolveProxy(oldPctRch);
			if (pctRch != oldPctRch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__PCT_RCH, oldPctRch, pctRch));
			}
		}
		return pctRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPctRch() {
		return pctRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPctRch(ASG newPctRch) {
		ASG oldPctRch = pctRch;
		pctRch = newPctRch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__PCT_RCH, oldPctRch, pctRch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getOfs() {
		if (ofs != null && ofs.eIsProxy()) {
			InternalEObject oldOfs = (InternalEObject)ofs;
			ofs = (ASG)eResolveProxy(oldOfs);
			if (ofs != oldOfs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__OFS, oldOfs, ofs));
			}
		}
		return ofs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetOfs() {
		return ofs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfs(ASG newOfs) {
		ASG oldOfs = ofs;
		ofs = newOfs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__OFS, oldOfs, ofs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPctOfs() {
		if (pctOfs != null && pctOfs.eIsProxy()) {
			InternalEObject oldPctOfs = (InternalEObject)pctOfs;
			pctOfs = (ASG)eResolveProxy(oldPctOfs);
			if (pctOfs != oldPctOfs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__PCT_OFS, oldPctOfs, pctOfs));
			}
		}
		return pctOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPctOfs() {
		return pctOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPctOfs(ASG newPctOfs) {
		ASG oldPctOfs = pctOfs;
		pctOfs = newPctOfs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__PCT_OFS, oldPctOfs, pctOfs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRisLod() {
		if (risLod != null && risLod.eIsProxy()) {
			InternalEObject oldRisLod = (InternalEObject)risLod;
			risLod = (ASG)eResolveProxy(oldRisLod);
			if (risLod != oldRisLod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__RIS_LOD, oldRisLod, risLod));
			}
		}
		return risLod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRisLod() {
		return risLod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisLod(ASG newRisLod) {
		ASG oldRisLod = risLod;
		risLod = newRisLod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__RIS_LOD, oldRisLod, risLod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getAngLod() {
		if (angLod != null && angLod.eIsProxy()) {
			InternalEObject oldAngLod = (InternalEObject)angLod;
			angLod = (ASG)eResolveProxy(oldAngLod);
			if (angLod != oldAngLod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__ANG_LOD, oldAngLod, angLod));
			}
		}
		return angLod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetAngLod() {
		return angLod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngLod(ASG newAngLod) {
		ASG oldAngLod = angLod;
		angLod = newAngLod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__ANG_LOD, oldAngLod, angLod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getTmDlMod() {
		if (tmDlMod != null && tmDlMod.eIsProxy()) {
			InternalEObject oldTmDlMod = (InternalEObject)tmDlMod;
			tmDlMod = (SPG)eResolveProxy(oldTmDlMod);
			if (tmDlMod != oldTmDlMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__TM_DL_MOD, oldTmDlMod, tmDlMod));
			}
		}
		return tmDlMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetTmDlMod() {
		return tmDlMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmDlMod(SPG newTmDlMod) {
		SPG oldTmDlMod = tmDlMod;
		tmDlMod = newTmDlMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__TM_DL_MOD, oldTmDlMod, tmDlMod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getPhDlMod() {
		if (phDlMod != null && phDlMod.eIsProxy()) {
			InternalEObject oldPhDlMod = (InternalEObject)phDlMod;
			phDlMod = (SPG)eResolveProxy(oldPhDlMod);
			if (phDlMod != oldPhDlMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__PH_DL_MOD, oldPhDlMod, phDlMod));
			}
		}
		return phDlMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetPhDlMod() {
		return phDlMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhDlMod(SPG newPhDlMod) {
		SPG oldPhDlMod = phDlMod;
		phDlMod = newPhDlMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__PH_DL_MOD, oldPhDlMod, phDlMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPhDlTmms() {
		if (phDlTmms != null && phDlTmms.eIsProxy()) {
			InternalEObject oldPhDlTmms = (InternalEObject)phDlTmms;
			phDlTmms = (ING)eResolveProxy(oldPhDlTmms);
			if (phDlTmms != oldPhDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__PH_DL_TMMS, oldPhDlTmms, phDlTmms));
			}
		}
		return phDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPhDlTmms() {
		return phDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhDlTmms(ING newPhDlTmms) {
		ING oldPhDlTmms = phDlTmms;
		phDlTmms = newPhDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__PH_DL_TMMS, oldPhDlTmms, phDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getGndDlMod() {
		if (gndDlMod != null && gndDlMod.eIsProxy()) {
			InternalEObject oldGndDlMod = (InternalEObject)gndDlMod;
			gndDlMod = (SPG)eResolveProxy(oldGndDlMod);
			if (gndDlMod != oldGndDlMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__GND_DL_MOD, oldGndDlMod, gndDlMod));
			}
		}
		return gndDlMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetGndDlMod() {
		return gndDlMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGndDlMod(SPG newGndDlMod) {
		SPG oldGndDlMod = gndDlMod;
		gndDlMod = newGndDlMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__GND_DL_MOD, oldGndDlMod, gndDlMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getGndDlTmms() {
		if (gndDlTmms != null && gndDlTmms.eIsProxy()) {
			InternalEObject oldGndDlTmms = (InternalEObject)gndDlTmms;
			gndDlTmms = (ING)eResolveProxy(oldGndDlTmms);
			if (gndDlTmms != oldGndDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__GND_DL_TMMS, oldGndDlTmms, gndDlTmms));
			}
		}
		return gndDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetGndDlTmms() {
		return gndDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGndDlTmms(ING newGndDlTmms) {
		ING oldGndDlTmms = gndDlTmms;
		gndDlTmms = newGndDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__GND_DL_TMMS, oldGndDlTmms, gndDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getX1() {
		if (x1 != null && x1.eIsProxy()) {
			InternalEObject oldX1 = (InternalEObject)x1;
			x1 = (ASG)eResolveProxy(oldX1);
			if (x1 != oldX1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__X1, oldX1, x1));
			}
		}
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(ASG newX1) {
		ASG oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLinAng() {
		if (linAng != null && linAng.eIsProxy()) {
			InternalEObject oldLinAng = (InternalEObject)linAng;
			linAng = (ASG)eResolveProxy(oldLinAng);
			if (linAng != oldLinAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__LIN_ANG, oldLinAng, linAng));
			}
		}
		return linAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLinAng() {
		return linAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinAng(ASG newLinAng) {
		ASG oldLinAng = linAng;
		linAng = newLinAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__LIN_ANG, oldLinAng, linAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRisGndRch() {
		if (risGndRch != null && risGndRch.eIsProxy()) {
			InternalEObject oldRisGndRch = (InternalEObject)risGndRch;
			risGndRch = (ASG)eResolveProxy(oldRisGndRch);
			if (risGndRch != oldRisGndRch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__RIS_GND_RCH, oldRisGndRch, risGndRch));
			}
		}
		return risGndRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRisGndRch() {
		return risGndRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisGndRch(ASG newRisGndRch) {
		ASG oldRisGndRch = risGndRch;
		risGndRch = newRisGndRch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__RIS_GND_RCH, oldRisGndRch, risGndRch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRisPhRch() {
		if (risPhRch != null && risPhRch.eIsProxy()) {
			InternalEObject oldRisPhRch = (InternalEObject)risPhRch;
			risPhRch = (ASG)eResolveProxy(oldRisPhRch);
			if (risPhRch != oldRisPhRch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__RIS_PH_RCH, oldRisPhRch, risPhRch));
			}
		}
		return risPhRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRisPhRch() {
		return risPhRch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisPhRch(ASG newRisPhRch) {
		ASG oldRisPhRch = risPhRch;
		risPhRch = newRisPhRch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__RIS_PH_RCH, oldRisPhRch, risPhRch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getK0Fact() {
		if (k0Fact != null && k0Fact.eIsProxy()) {
			InternalEObject oldK0Fact = (InternalEObject)k0Fact;
			k0Fact = (ASG)eResolveProxy(oldK0Fact);
			if (k0Fact != oldK0Fact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__K0_FACT, oldK0Fact, k0Fact));
			}
		}
		return k0Fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetK0Fact() {
		return k0Fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK0Fact(ASG newK0Fact) {
		ASG oldK0Fact = k0Fact;
		k0Fact = newK0Fact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__K0_FACT, oldK0Fact, k0Fact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getK0FactAng() {
		if (k0FactAng != null && k0FactAng.eIsProxy()) {
			InternalEObject oldK0FactAng = (InternalEObject)k0FactAng;
			k0FactAng = (ASG)eResolveProxy(oldK0FactAng);
			if (k0FactAng != oldK0FactAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__K0_FACT_ANG, oldK0FactAng, k0FactAng));
			}
		}
		return k0FactAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetK0FactAng() {
		return k0FactAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK0FactAng(ASG newK0FactAng) {
		ASG oldK0FactAng = k0FactAng;
		k0FactAng = newK0FactAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__K0_FACT_ANG, oldK0FactAng, k0FactAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRsDlTmms() {
		if (rsDlTmms != null && rsDlTmms.eIsProxy()) {
			InternalEObject oldRsDlTmms = (InternalEObject)rsDlTmms;
			rsDlTmms = (ING)eResolveProxy(oldRsDlTmms);
			if (rsDlTmms != oldRsDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIS__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
			}
		}
		return rsDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRsDlTmms() {
		return rsDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsDlTmms(ING newRsDlTmms) {
		ING oldRsDlTmms = rsDlTmms;
		rsDlTmms = newRsDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIS__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PDIS__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PDIS__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PDIS__PO_RCH:
				if (resolve) return getPoRch();
				return basicGetPoRch();
			case LNGroupPPackage.PDIS__PH_STR:
				if (resolve) return getPhStr();
				return basicGetPhStr();
			case LNGroupPPackage.PDIS__GND_STR:
				if (resolve) return getGndStr();
				return basicGetGndStr();
			case LNGroupPPackage.PDIS__DIR_MOD:
				if (resolve) return getDirMod();
				return basicGetDirMod();
			case LNGroupPPackage.PDIS__PCT_RCH:
				if (resolve) return getPctRch();
				return basicGetPctRch();
			case LNGroupPPackage.PDIS__OFS:
				if (resolve) return getOfs();
				return basicGetOfs();
			case LNGroupPPackage.PDIS__PCT_OFS:
				if (resolve) return getPctOfs();
				return basicGetPctOfs();
			case LNGroupPPackage.PDIS__RIS_LOD:
				if (resolve) return getRisLod();
				return basicGetRisLod();
			case LNGroupPPackage.PDIS__ANG_LOD:
				if (resolve) return getAngLod();
				return basicGetAngLod();
			case LNGroupPPackage.PDIS__TM_DL_MOD:
				if (resolve) return getTmDlMod();
				return basicGetTmDlMod();
			case LNGroupPPackage.PDIS__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PDIS__PH_DL_MOD:
				if (resolve) return getPhDlMod();
				return basicGetPhDlMod();
			case LNGroupPPackage.PDIS__PH_DL_TMMS:
				if (resolve) return getPhDlTmms();
				return basicGetPhDlTmms();
			case LNGroupPPackage.PDIS__GND_DL_MOD:
				if (resolve) return getGndDlMod();
				return basicGetGndDlMod();
			case LNGroupPPackage.PDIS__GND_DL_TMMS:
				if (resolve) return getGndDlTmms();
				return basicGetGndDlTmms();
			case LNGroupPPackage.PDIS__X1:
				if (resolve) return getX1();
				return basicGetX1();
			case LNGroupPPackage.PDIS__LIN_ANG:
				if (resolve) return getLinAng();
				return basicGetLinAng();
			case LNGroupPPackage.PDIS__RIS_GND_RCH:
				if (resolve) return getRisGndRch();
				return basicGetRisGndRch();
			case LNGroupPPackage.PDIS__RIS_PH_RCH:
				if (resolve) return getRisPhRch();
				return basicGetRisPhRch();
			case LNGroupPPackage.PDIS__K0_FACT:
				if (resolve) return getK0Fact();
				return basicGetK0Fact();
			case LNGroupPPackage.PDIS__K0_FACT_ANG:
				if (resolve) return getK0FactAng();
				return basicGetK0FactAng();
			case LNGroupPPackage.PDIS__RS_DL_TMMS:
				if (resolve) return getRsDlTmms();
				return basicGetRsDlTmms();
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
			case LNGroupPPackage.PDIS__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PDIS__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PDIS__PO_RCH:
				setPoRch((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__PH_STR:
				setPhStr((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__GND_STR:
				setGndStr((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__DIR_MOD:
				setDirMod((ING)newValue);
				return;
			case LNGroupPPackage.PDIS__PCT_RCH:
				setPctRch((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__OFS:
				setOfs((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__PCT_OFS:
				setPctOfs((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__RIS_LOD:
				setRisLod((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__ANG_LOD:
				setAngLod((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__TM_DL_MOD:
				setTmDlMod((SPG)newValue);
				return;
			case LNGroupPPackage.PDIS__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PDIS__PH_DL_MOD:
				setPhDlMod((SPG)newValue);
				return;
			case LNGroupPPackage.PDIS__PH_DL_TMMS:
				setPhDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PDIS__GND_DL_MOD:
				setGndDlMod((SPG)newValue);
				return;
			case LNGroupPPackage.PDIS__GND_DL_TMMS:
				setGndDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PDIS__X1:
				setX1((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__LIN_ANG:
				setLinAng((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__RIS_GND_RCH:
				setRisGndRch((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__RIS_PH_RCH:
				setRisPhRch((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__K0_FACT:
				setK0Fact((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__K0_FACT_ANG:
				setK0FactAng((ASG)newValue);
				return;
			case LNGroupPPackage.PDIS__RS_DL_TMMS:
				setRsDlTmms((ING)newValue);
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
			case LNGroupPPackage.PDIS__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PDIS__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PDIS__PO_RCH:
				setPoRch((ASG)null);
				return;
			case LNGroupPPackage.PDIS__PH_STR:
				setPhStr((ASG)null);
				return;
			case LNGroupPPackage.PDIS__GND_STR:
				setGndStr((ASG)null);
				return;
			case LNGroupPPackage.PDIS__DIR_MOD:
				setDirMod((ING)null);
				return;
			case LNGroupPPackage.PDIS__PCT_RCH:
				setPctRch((ASG)null);
				return;
			case LNGroupPPackage.PDIS__OFS:
				setOfs((ASG)null);
				return;
			case LNGroupPPackage.PDIS__PCT_OFS:
				setPctOfs((ASG)null);
				return;
			case LNGroupPPackage.PDIS__RIS_LOD:
				setRisLod((ASG)null);
				return;
			case LNGroupPPackage.PDIS__ANG_LOD:
				setAngLod((ASG)null);
				return;
			case LNGroupPPackage.PDIS__TM_DL_MOD:
				setTmDlMod((SPG)null);
				return;
			case LNGroupPPackage.PDIS__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PDIS__PH_DL_MOD:
				setPhDlMod((SPG)null);
				return;
			case LNGroupPPackage.PDIS__PH_DL_TMMS:
				setPhDlTmms((ING)null);
				return;
			case LNGroupPPackage.PDIS__GND_DL_MOD:
				setGndDlMod((SPG)null);
				return;
			case LNGroupPPackage.PDIS__GND_DL_TMMS:
				setGndDlTmms((ING)null);
				return;
			case LNGroupPPackage.PDIS__X1:
				setX1((ASG)null);
				return;
			case LNGroupPPackage.PDIS__LIN_ANG:
				setLinAng((ASG)null);
				return;
			case LNGroupPPackage.PDIS__RIS_GND_RCH:
				setRisGndRch((ASG)null);
				return;
			case LNGroupPPackage.PDIS__RIS_PH_RCH:
				setRisPhRch((ASG)null);
				return;
			case LNGroupPPackage.PDIS__K0_FACT:
				setK0Fact((ASG)null);
				return;
			case LNGroupPPackage.PDIS__K0_FACT_ANG:
				setK0FactAng((ASG)null);
				return;
			case LNGroupPPackage.PDIS__RS_DL_TMMS:
				setRsDlTmms((ING)null);
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
			case LNGroupPPackage.PDIS__STR:
				return str != null;
			case LNGroupPPackage.PDIS__OP:
				return op != null;
			case LNGroupPPackage.PDIS__PO_RCH:
				return poRch != null;
			case LNGroupPPackage.PDIS__PH_STR:
				return phStr != null;
			case LNGroupPPackage.PDIS__GND_STR:
				return gndStr != null;
			case LNGroupPPackage.PDIS__DIR_MOD:
				return dirMod != null;
			case LNGroupPPackage.PDIS__PCT_RCH:
				return pctRch != null;
			case LNGroupPPackage.PDIS__OFS:
				return ofs != null;
			case LNGroupPPackage.PDIS__PCT_OFS:
				return pctOfs != null;
			case LNGroupPPackage.PDIS__RIS_LOD:
				return risLod != null;
			case LNGroupPPackage.PDIS__ANG_LOD:
				return angLod != null;
			case LNGroupPPackage.PDIS__TM_DL_MOD:
				return tmDlMod != null;
			case LNGroupPPackage.PDIS__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PDIS__PH_DL_MOD:
				return phDlMod != null;
			case LNGroupPPackage.PDIS__PH_DL_TMMS:
				return phDlTmms != null;
			case LNGroupPPackage.PDIS__GND_DL_MOD:
				return gndDlMod != null;
			case LNGroupPPackage.PDIS__GND_DL_TMMS:
				return gndDlTmms != null;
			case LNGroupPPackage.PDIS__X1:
				return x1 != null;
			case LNGroupPPackage.PDIS__LIN_ANG:
				return linAng != null;
			case LNGroupPPackage.PDIS__RIS_GND_RCH:
				return risGndRch != null;
			case LNGroupPPackage.PDIS__RIS_PH_RCH:
				return risPhRch != null;
			case LNGroupPPackage.PDIS__K0_FACT:
				return k0Fact != null;
			case LNGroupPPackage.PDIS__K0_FACT_ANG:
				return k0FactAng != null;
			case LNGroupPPackage.PDIS__RS_DL_TMMS:
				return rsDlTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PDISImpl
