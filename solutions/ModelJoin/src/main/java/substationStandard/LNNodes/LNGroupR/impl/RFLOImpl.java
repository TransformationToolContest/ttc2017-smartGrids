/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.CMV;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RFLO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFLO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getFltZ <em>Flt Z</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getFltDiskm <em>Flt Diskm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getFltLoop <em>Flt Loop</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getLinLenKm <em>Lin Len Km</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getZ1Mod <em>Z1 Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getZ1Ang <em>Z1 Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getZ0Mod <em>Z0 Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getZ0Ang <em>Z0 Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getRm0 <em>Rm0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getXm0 <em>Xm0</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getZm0Mod <em>Zm0 Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RFLOImpl#getZm0Ang <em>Zm0 Ang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RFLOImpl extends GroupRImpl implements RFLO {
	/**
	 * The cached value of the '{@link #getOpCntRs() <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCntRs()
	 * @generated
	 * @ordered
	 */
	protected INC opCntRs;

	/**
	 * The cached value of the '{@link #getFltZ() <em>Flt Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFltZ()
	 * @generated
	 * @ordered
	 */
	protected CMV fltZ;

	/**
	 * The cached value of the '{@link #getFltDiskm() <em>Flt Diskm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFltDiskm()
	 * @generated
	 * @ordered
	 */
	protected MV fltDiskm;

	/**
	 * The cached value of the '{@link #getFltLoop() <em>Flt Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFltLoop()
	 * @generated
	 * @ordered
	 */
	protected INS fltLoop;

	/**
	 * The cached value of the '{@link #getLinLenKm() <em>Lin Len Km</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinLenKm()
	 * @generated
	 * @ordered
	 */
	protected ASG linLenKm;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected ASG r1;

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
	 * The cached value of the '{@link #getR0() <em>R0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected ASG r0;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected ASG x0;

	/**
	 * The cached value of the '{@link #getZ1Mod() <em>Z1 Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ1Mod()
	 * @generated
	 * @ordered
	 */
	protected ASG z1Mod;

	/**
	 * The cached value of the '{@link #getZ1Ang() <em>Z1 Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ1Ang()
	 * @generated
	 * @ordered
	 */
	protected ASG z1Ang;

	/**
	 * The cached value of the '{@link #getZ0Mod() <em>Z0 Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ0Mod()
	 * @generated
	 * @ordered
	 */
	protected ASG z0Mod;

	/**
	 * The cached value of the '{@link #getZ0Ang() <em>Z0 Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ0Ang()
	 * @generated
	 * @ordered
	 */
	protected ASG z0Ang;

	/**
	 * The cached value of the '{@link #getRm0() <em>Rm0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRm0()
	 * @generated
	 * @ordered
	 */
	protected ASG rm0;

	/**
	 * The cached value of the '{@link #getXm0() <em>Xm0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXm0()
	 * @generated
	 * @ordered
	 */
	protected ASG xm0;

	/**
	 * The cached value of the '{@link #getZm0Mod() <em>Zm0 Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZm0Mod()
	 * @generated
	 * @ordered
	 */
	protected ASG zm0Mod;

	/**
	 * The cached value of the '{@link #getZm0Ang() <em>Zm0 Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZm0Ang()
	 * @generated
	 * @ordered
	 */
	protected ASG zm0Ang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFLOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RFLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getOpCntRs() {
		if (opCntRs != null && opCntRs.eIsProxy()) {
			InternalEObject oldOpCntRs = (InternalEObject)opCntRs;
			opCntRs = (INC)eResolveProxy(oldOpCntRs);
			if (opCntRs != oldOpCntRs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__OP_CNT_RS, oldOpCntRs, opCntRs));
			}
		}
		return opCntRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetOpCntRs() {
		return opCntRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCntRs(INC newOpCntRs) {
		INC oldOpCntRs = opCntRs;
		opCntRs = newOpCntRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV getFltZ() {
		if (fltZ != null && fltZ.eIsProxy()) {
			InternalEObject oldFltZ = (InternalEObject)fltZ;
			fltZ = (CMV)eResolveProxy(oldFltZ);
			if (fltZ != oldFltZ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__FLT_Z, oldFltZ, fltZ));
			}
		}
		return fltZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV basicGetFltZ() {
		return fltZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFltZ(CMV newFltZ) {
		CMV oldFltZ = fltZ;
		fltZ = newFltZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__FLT_Z, oldFltZ, fltZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getFltDiskm() {
		if (fltDiskm != null && fltDiskm.eIsProxy()) {
			InternalEObject oldFltDiskm = (InternalEObject)fltDiskm;
			fltDiskm = (MV)eResolveProxy(oldFltDiskm);
			if (fltDiskm != oldFltDiskm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__FLT_DISKM, oldFltDiskm, fltDiskm));
			}
		}
		return fltDiskm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetFltDiskm() {
		return fltDiskm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFltDiskm(MV newFltDiskm) {
		MV oldFltDiskm = fltDiskm;
		fltDiskm = newFltDiskm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__FLT_DISKM, oldFltDiskm, fltDiskm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getFltLoop() {
		if (fltLoop != null && fltLoop.eIsProxy()) {
			InternalEObject oldFltLoop = (InternalEObject)fltLoop;
			fltLoop = (INS)eResolveProxy(oldFltLoop);
			if (fltLoop != oldFltLoop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__FLT_LOOP, oldFltLoop, fltLoop));
			}
		}
		return fltLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetFltLoop() {
		return fltLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFltLoop(INS newFltLoop) {
		INS oldFltLoop = fltLoop;
		fltLoop = newFltLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__FLT_LOOP, oldFltLoop, fltLoop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLinLenKm() {
		if (linLenKm != null && linLenKm.eIsProxy()) {
			InternalEObject oldLinLenKm = (InternalEObject)linLenKm;
			linLenKm = (ASG)eResolveProxy(oldLinLenKm);
			if (linLenKm != oldLinLenKm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__LIN_LEN_KM, oldLinLenKm, linLenKm));
			}
		}
		return linLenKm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLinLenKm() {
		return linLenKm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinLenKm(ASG newLinLenKm) {
		ASG oldLinLenKm = linLenKm;
		linLenKm = newLinLenKm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__LIN_LEN_KM, oldLinLenKm, linLenKm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getR1() {
		if (r1 != null && r1.eIsProxy()) {
			InternalEObject oldR1 = (InternalEObject)r1;
			r1 = (ASG)eResolveProxy(oldR1);
			if (r1 != oldR1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__R1, oldR1, r1));
			}
		}
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetR1() {
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR1(ASG newR1) {
		ASG oldR1 = r1;
		r1 = newR1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__R1, oldR1, r1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__X1, oldX1, x1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getR0() {
		if (r0 != null && r0.eIsProxy()) {
			InternalEObject oldR0 = (InternalEObject)r0;
			r0 = (ASG)eResolveProxy(oldR0);
			if (r0 != oldR0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__R0, oldR0, r0));
			}
		}
		return r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetR0() {
		return r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR0(ASG newR0) {
		ASG oldR0 = r0;
		r0 = newR0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__R0, oldR0, r0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getX0() {
		if (x0 != null && x0.eIsProxy()) {
			InternalEObject oldX0 = (InternalEObject)x0;
			x0 = (ASG)eResolveProxy(oldX0);
			if (x0 != oldX0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__X0, oldX0, x0));
			}
		}
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0(ASG newX0) {
		ASG oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getZ1Mod() {
		if (z1Mod != null && z1Mod.eIsProxy()) {
			InternalEObject oldZ1Mod = (InternalEObject)z1Mod;
			z1Mod = (ASG)eResolveProxy(oldZ1Mod);
			if (z1Mod != oldZ1Mod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__Z1_MOD, oldZ1Mod, z1Mod));
			}
		}
		return z1Mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetZ1Mod() {
		return z1Mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ1Mod(ASG newZ1Mod) {
		ASG oldZ1Mod = z1Mod;
		z1Mod = newZ1Mod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__Z1_MOD, oldZ1Mod, z1Mod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getZ1Ang() {
		if (z1Ang != null && z1Ang.eIsProxy()) {
			InternalEObject oldZ1Ang = (InternalEObject)z1Ang;
			z1Ang = (ASG)eResolveProxy(oldZ1Ang);
			if (z1Ang != oldZ1Ang) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__Z1_ANG, oldZ1Ang, z1Ang));
			}
		}
		return z1Ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetZ1Ang() {
		return z1Ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ1Ang(ASG newZ1Ang) {
		ASG oldZ1Ang = z1Ang;
		z1Ang = newZ1Ang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__Z1_ANG, oldZ1Ang, z1Ang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getZ0Mod() {
		if (z0Mod != null && z0Mod.eIsProxy()) {
			InternalEObject oldZ0Mod = (InternalEObject)z0Mod;
			z0Mod = (ASG)eResolveProxy(oldZ0Mod);
			if (z0Mod != oldZ0Mod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__Z0_MOD, oldZ0Mod, z0Mod));
			}
		}
		return z0Mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetZ0Mod() {
		return z0Mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ0Mod(ASG newZ0Mod) {
		ASG oldZ0Mod = z0Mod;
		z0Mod = newZ0Mod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__Z0_MOD, oldZ0Mod, z0Mod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getZ0Ang() {
		if (z0Ang != null && z0Ang.eIsProxy()) {
			InternalEObject oldZ0Ang = (InternalEObject)z0Ang;
			z0Ang = (ASG)eResolveProxy(oldZ0Ang);
			if (z0Ang != oldZ0Ang) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__Z0_ANG, oldZ0Ang, z0Ang));
			}
		}
		return z0Ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetZ0Ang() {
		return z0Ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ0Ang(ASG newZ0Ang) {
		ASG oldZ0Ang = z0Ang;
		z0Ang = newZ0Ang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__Z0_ANG, oldZ0Ang, z0Ang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRm0() {
		if (rm0 != null && rm0.eIsProxy()) {
			InternalEObject oldRm0 = (InternalEObject)rm0;
			rm0 = (ASG)eResolveProxy(oldRm0);
			if (rm0 != oldRm0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__RM0, oldRm0, rm0));
			}
		}
		return rm0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRm0() {
		return rm0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRm0(ASG newRm0) {
		ASG oldRm0 = rm0;
		rm0 = newRm0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__RM0, oldRm0, rm0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getXm0() {
		if (xm0 != null && xm0.eIsProxy()) {
			InternalEObject oldXm0 = (InternalEObject)xm0;
			xm0 = (ASG)eResolveProxy(oldXm0);
			if (xm0 != oldXm0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__XM0, oldXm0, xm0));
			}
		}
		return xm0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetXm0() {
		return xm0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXm0(ASG newXm0) {
		ASG oldXm0 = xm0;
		xm0 = newXm0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__XM0, oldXm0, xm0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getZm0Mod() {
		if (zm0Mod != null && zm0Mod.eIsProxy()) {
			InternalEObject oldZm0Mod = (InternalEObject)zm0Mod;
			zm0Mod = (ASG)eResolveProxy(oldZm0Mod);
			if (zm0Mod != oldZm0Mod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__ZM0_MOD, oldZm0Mod, zm0Mod));
			}
		}
		return zm0Mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetZm0Mod() {
		return zm0Mod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZm0Mod(ASG newZm0Mod) {
		ASG oldZm0Mod = zm0Mod;
		zm0Mod = newZm0Mod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__ZM0_MOD, oldZm0Mod, zm0Mod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getZm0Ang() {
		if (zm0Ang != null && zm0Ang.eIsProxy()) {
			InternalEObject oldZm0Ang = (InternalEObject)zm0Ang;
			zm0Ang = (ASG)eResolveProxy(oldZm0Ang);
			if (zm0Ang != oldZm0Ang) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RFLO__ZM0_ANG, oldZm0Ang, zm0Ang));
			}
		}
		return zm0Ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetZm0Ang() {
		return zm0Ang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZm0Ang(ASG newZm0Ang) {
		ASG oldZm0Ang = zm0Ang;
		zm0Ang = newZm0Ang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RFLO__ZM0_ANG, oldZm0Ang, zm0Ang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RFLO__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RFLO__FLT_Z:
				if (resolve) return getFltZ();
				return basicGetFltZ();
			case LNGroupRPackage.RFLO__FLT_DISKM:
				if (resolve) return getFltDiskm();
				return basicGetFltDiskm();
			case LNGroupRPackage.RFLO__FLT_LOOP:
				if (resolve) return getFltLoop();
				return basicGetFltLoop();
			case LNGroupRPackage.RFLO__LIN_LEN_KM:
				if (resolve) return getLinLenKm();
				return basicGetLinLenKm();
			case LNGroupRPackage.RFLO__R1:
				if (resolve) return getR1();
				return basicGetR1();
			case LNGroupRPackage.RFLO__X1:
				if (resolve) return getX1();
				return basicGetX1();
			case LNGroupRPackage.RFLO__R0:
				if (resolve) return getR0();
				return basicGetR0();
			case LNGroupRPackage.RFLO__X0:
				if (resolve) return getX0();
				return basicGetX0();
			case LNGroupRPackage.RFLO__Z1_MOD:
				if (resolve) return getZ1Mod();
				return basicGetZ1Mod();
			case LNGroupRPackage.RFLO__Z1_ANG:
				if (resolve) return getZ1Ang();
				return basicGetZ1Ang();
			case LNGroupRPackage.RFLO__Z0_MOD:
				if (resolve) return getZ0Mod();
				return basicGetZ0Mod();
			case LNGroupRPackage.RFLO__Z0_ANG:
				if (resolve) return getZ0Ang();
				return basicGetZ0Ang();
			case LNGroupRPackage.RFLO__RM0:
				if (resolve) return getRm0();
				return basicGetRm0();
			case LNGroupRPackage.RFLO__XM0:
				if (resolve) return getXm0();
				return basicGetXm0();
			case LNGroupRPackage.RFLO__ZM0_MOD:
				if (resolve) return getZm0Mod();
				return basicGetZm0Mod();
			case LNGroupRPackage.RFLO__ZM0_ANG:
				if (resolve) return getZm0Ang();
				return basicGetZm0Ang();
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
			case LNGroupRPackage.RFLO__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RFLO__FLT_Z:
				setFltZ((CMV)newValue);
				return;
			case LNGroupRPackage.RFLO__FLT_DISKM:
				setFltDiskm((MV)newValue);
				return;
			case LNGroupRPackage.RFLO__FLT_LOOP:
				setFltLoop((INS)newValue);
				return;
			case LNGroupRPackage.RFLO__LIN_LEN_KM:
				setLinLenKm((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__R1:
				setR1((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__X1:
				setX1((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__R0:
				setR0((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__X0:
				setX0((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__Z1_MOD:
				setZ1Mod((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__Z1_ANG:
				setZ1Ang((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__Z0_MOD:
				setZ0Mod((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__Z0_ANG:
				setZ0Ang((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__RM0:
				setRm0((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__XM0:
				setXm0((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__ZM0_MOD:
				setZm0Mod((ASG)newValue);
				return;
			case LNGroupRPackage.RFLO__ZM0_ANG:
				setZm0Ang((ASG)newValue);
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
			case LNGroupRPackage.RFLO__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RFLO__FLT_Z:
				setFltZ((CMV)null);
				return;
			case LNGroupRPackage.RFLO__FLT_DISKM:
				setFltDiskm((MV)null);
				return;
			case LNGroupRPackage.RFLO__FLT_LOOP:
				setFltLoop((INS)null);
				return;
			case LNGroupRPackage.RFLO__LIN_LEN_KM:
				setLinLenKm((ASG)null);
				return;
			case LNGroupRPackage.RFLO__R1:
				setR1((ASG)null);
				return;
			case LNGroupRPackage.RFLO__X1:
				setX1((ASG)null);
				return;
			case LNGroupRPackage.RFLO__R0:
				setR0((ASG)null);
				return;
			case LNGroupRPackage.RFLO__X0:
				setX0((ASG)null);
				return;
			case LNGroupRPackage.RFLO__Z1_MOD:
				setZ1Mod((ASG)null);
				return;
			case LNGroupRPackage.RFLO__Z1_ANG:
				setZ1Ang((ASG)null);
				return;
			case LNGroupRPackage.RFLO__Z0_MOD:
				setZ0Mod((ASG)null);
				return;
			case LNGroupRPackage.RFLO__Z0_ANG:
				setZ0Ang((ASG)null);
				return;
			case LNGroupRPackage.RFLO__RM0:
				setRm0((ASG)null);
				return;
			case LNGroupRPackage.RFLO__XM0:
				setXm0((ASG)null);
				return;
			case LNGroupRPackage.RFLO__ZM0_MOD:
				setZm0Mod((ASG)null);
				return;
			case LNGroupRPackage.RFLO__ZM0_ANG:
				setZm0Ang((ASG)null);
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
			case LNGroupRPackage.RFLO__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RFLO__FLT_Z:
				return fltZ != null;
			case LNGroupRPackage.RFLO__FLT_DISKM:
				return fltDiskm != null;
			case LNGroupRPackage.RFLO__FLT_LOOP:
				return fltLoop != null;
			case LNGroupRPackage.RFLO__LIN_LEN_KM:
				return linLenKm != null;
			case LNGroupRPackage.RFLO__R1:
				return r1 != null;
			case LNGroupRPackage.RFLO__X1:
				return x1 != null;
			case LNGroupRPackage.RFLO__R0:
				return r0 != null;
			case LNGroupRPackage.RFLO__X0:
				return x0 != null;
			case LNGroupRPackage.RFLO__Z1_MOD:
				return z1Mod != null;
			case LNGroupRPackage.RFLO__Z1_ANG:
				return z1Ang != null;
			case LNGroupRPackage.RFLO__Z0_MOD:
				return z0Mod != null;
			case LNGroupRPackage.RFLO__Z0_ANG:
				return z0Ang != null;
			case LNGroupRPackage.RFLO__RM0:
				return rm0 != null;
			case LNGroupRPackage.RFLO__XM0:
				return xm0 != null;
			case LNGroupRPackage.RFLO__ZM0_MOD:
				return zm0Mod != null;
			case LNGroupRPackage.RFLO__ZM0_ANG:
				return zm0Ang != null;
		}
		return super.eIsSet(featureID);
	}

} //RFLOImpl
