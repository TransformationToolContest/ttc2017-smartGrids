/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupY.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupA.ATCC;

import gluemodel.substationStandard.LNNodes.LNGroupY.LNGroupYPackage;
import gluemodel.substationStandard.LNNodes.LNGroupY.YPTR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YPTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getHPTmp <em>HP Tmp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getHPZmpAlm <em>HP Zmp Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getHPTmpTr <em>HP Tmp Tr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getOANL <em>OANL</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getOpOvA <em>Op Ov A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getOpOvV <em>Op Ov V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getOpUnV <em>Op Un V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getCGAlm <em>CG Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getHiVRtg <em>Hi VRtg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getLoVRtg <em>Lo VRtg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getPwrRtg <em>Pwr Rtg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl#getTransformerControl <em>Transformer Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YPTRImpl extends GroupYImpl implements YPTR {
	/**
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected INS opTmh;

	/**
	 * The cached value of the '{@link #getHPTmp() <em>HP Tmp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHPTmp()
	 * @generated
	 * @ordered
	 */
	protected MV hpTmp;

	/**
	 * The cached value of the '{@link #getHPZmpAlm() <em>HP Zmp Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHPZmpAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS hpZmpAlm;

	/**
	 * The cached value of the '{@link #getHPTmpTr() <em>HP Tmp Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHPTmpTr()
	 * @generated
	 * @ordered
	 */
	protected SPS hpTmpTr;

	/**
	 * The cached value of the '{@link #getOANL() <em>OANL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOANL()
	 * @generated
	 * @ordered
	 */
	protected SPS oanl;

	/**
	 * The cached value of the '{@link #getOpOvA() <em>Op Ov A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpOvA()
	 * @generated
	 * @ordered
	 */
	protected SPS opOvA;

	/**
	 * The cached value of the '{@link #getOpOvV() <em>Op Ov V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpOvV()
	 * @generated
	 * @ordered
	 */
	protected SPS opOvV;

	/**
	 * The cached value of the '{@link #getOpUnV() <em>Op Un V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpUnV()
	 * @generated
	 * @ordered
	 */
	protected SPS opUnV;

	/**
	 * The cached value of the '{@link #getCGAlm() <em>CG Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCGAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS cgAlm;

	/**
	 * The cached value of the '{@link #getHiVRtg() <em>Hi VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiVRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG hiVRtg;

	/**
	 * The cached value of the '{@link #getLoVRtg() <em>Lo VRtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoVRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG loVRtg;

	/**
	 * The cached value of the '{@link #getPwrRtg() <em>Pwr Rtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwrRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG pwrRtg;

	/**
	 * The cached value of the '{@link #getTransformerControl() <em>Transformer Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerControl()
	 * @generated
	 * @ordered
	 */
	protected ATCC transformerControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YPTRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupYPackage.Literals.YPTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpTmh() {
		if (opTmh != null && opTmh.eIsProxy()) {
			InternalEObject oldOpTmh = (InternalEObject)opTmh;
			opTmh = (INS)eResolveProxy(oldOpTmh);
			if (opTmh != oldOpTmh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__OP_TMH, oldOpTmh, opTmh));
			}
		}
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpTmh() {
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTmh(INS newOpTmh) {
		INS oldOpTmh = opTmh;
		opTmh = newOpTmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getHPTmp() {
		if (hpTmp != null && hpTmp.eIsProxy()) {
			InternalEObject oldHPTmp = (InternalEObject)hpTmp;
			hpTmp = (MV)eResolveProxy(oldHPTmp);
			if (hpTmp != oldHPTmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__HP_TMP, oldHPTmp, hpTmp));
			}
		}
		return hpTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetHPTmp() {
		return hpTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHPTmp(MV newHPTmp) {
		MV oldHPTmp = hpTmp;
		hpTmp = newHPTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__HP_TMP, oldHPTmp, hpTmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getHPZmpAlm() {
		if (hpZmpAlm != null && hpZmpAlm.eIsProxy()) {
			InternalEObject oldHPZmpAlm = (InternalEObject)hpZmpAlm;
			hpZmpAlm = (SPS)eResolveProxy(oldHPZmpAlm);
			if (hpZmpAlm != oldHPZmpAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__HP_ZMP_ALM, oldHPZmpAlm, hpZmpAlm));
			}
		}
		return hpZmpAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetHPZmpAlm() {
		return hpZmpAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHPZmpAlm(SPS newHPZmpAlm) {
		SPS oldHPZmpAlm = hpZmpAlm;
		hpZmpAlm = newHPZmpAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__HP_ZMP_ALM, oldHPZmpAlm, hpZmpAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getHPTmpTr() {
		if (hpTmpTr != null && hpTmpTr.eIsProxy()) {
			InternalEObject oldHPTmpTr = (InternalEObject)hpTmpTr;
			hpTmpTr = (SPS)eResolveProxy(oldHPTmpTr);
			if (hpTmpTr != oldHPTmpTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__HP_TMP_TR, oldHPTmpTr, hpTmpTr));
			}
		}
		return hpTmpTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetHPTmpTr() {
		return hpTmpTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHPTmpTr(SPS newHPTmpTr) {
		SPS oldHPTmpTr = hpTmpTr;
		hpTmpTr = newHPTmpTr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__HP_TMP_TR, oldHPTmpTr, hpTmpTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOANL() {
		if (oanl != null && oanl.eIsProxy()) {
			InternalEObject oldOANL = (InternalEObject)oanl;
			oanl = (SPS)eResolveProxy(oldOANL);
			if (oanl != oldOANL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__OANL, oldOANL, oanl));
			}
		}
		return oanl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOANL() {
		return oanl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOANL(SPS newOANL) {
		SPS oldOANL = oanl;
		oanl = newOANL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__OANL, oldOANL, oanl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOpOvA() {
		if (opOvA != null && opOvA.eIsProxy()) {
			InternalEObject oldOpOvA = (InternalEObject)opOvA;
			opOvA = (SPS)eResolveProxy(oldOpOvA);
			if (opOvA != oldOpOvA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__OP_OV_A, oldOpOvA, opOvA));
			}
		}
		return opOvA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOpOvA() {
		return opOvA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpOvA(SPS newOpOvA) {
		SPS oldOpOvA = opOvA;
		opOvA = newOpOvA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__OP_OV_A, oldOpOvA, opOvA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOpOvV() {
		if (opOvV != null && opOvV.eIsProxy()) {
			InternalEObject oldOpOvV = (InternalEObject)opOvV;
			opOvV = (SPS)eResolveProxy(oldOpOvV);
			if (opOvV != oldOpOvV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__OP_OV_V, oldOpOvV, opOvV));
			}
		}
		return opOvV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOpOvV() {
		return opOvV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpOvV(SPS newOpOvV) {
		SPS oldOpOvV = opOvV;
		opOvV = newOpOvV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__OP_OV_V, oldOpOvV, opOvV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOpUnV() {
		if (opUnV != null && opUnV.eIsProxy()) {
			InternalEObject oldOpUnV = (InternalEObject)opUnV;
			opUnV = (SPS)eResolveProxy(oldOpUnV);
			if (opUnV != oldOpUnV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__OP_UN_V, oldOpUnV, opUnV));
			}
		}
		return opUnV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOpUnV() {
		return opUnV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpUnV(SPS newOpUnV) {
		SPS oldOpUnV = opUnV;
		opUnV = newOpUnV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__OP_UN_V, oldOpUnV, opUnV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getCGAlm() {
		if (cgAlm != null && cgAlm.eIsProxy()) {
			InternalEObject oldCGAlm = (InternalEObject)cgAlm;
			cgAlm = (SPS)eResolveProxy(oldCGAlm);
			if (cgAlm != oldCGAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__CG_ALM, oldCGAlm, cgAlm));
			}
		}
		return cgAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetCGAlm() {
		return cgAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCGAlm(SPS newCGAlm) {
		SPS oldCGAlm = cgAlm;
		cgAlm = newCGAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__CG_ALM, oldCGAlm, cgAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getHiVRtg() {
		if (hiVRtg != null && hiVRtg.eIsProxy()) {
			InternalEObject oldHiVRtg = (InternalEObject)hiVRtg;
			hiVRtg = (ASG)eResolveProxy(oldHiVRtg);
			if (hiVRtg != oldHiVRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__HI_VRTG, oldHiVRtg, hiVRtg));
			}
		}
		return hiVRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetHiVRtg() {
		return hiVRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiVRtg(ASG newHiVRtg) {
		ASG oldHiVRtg = hiVRtg;
		hiVRtg = newHiVRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__HI_VRTG, oldHiVRtg, hiVRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLoVRtg() {
		if (loVRtg != null && loVRtg.eIsProxy()) {
			InternalEObject oldLoVRtg = (InternalEObject)loVRtg;
			loVRtg = (ASG)eResolveProxy(oldLoVRtg);
			if (loVRtg != oldLoVRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__LO_VRTG, oldLoVRtg, loVRtg));
			}
		}
		return loVRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLoVRtg() {
		return loVRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoVRtg(ASG newLoVRtg) {
		ASG oldLoVRtg = loVRtg;
		loVRtg = newLoVRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__LO_VRTG, oldLoVRtg, loVRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getPwrRtg() {
		if (pwrRtg != null && pwrRtg.eIsProxy()) {
			InternalEObject oldPwrRtg = (InternalEObject)pwrRtg;
			pwrRtg = (ASG)eResolveProxy(oldPwrRtg);
			if (pwrRtg != oldPwrRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__PWR_RTG, oldPwrRtg, pwrRtg));
			}
		}
		return pwrRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetPwrRtg() {
		return pwrRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwrRtg(ASG newPwrRtg) {
		ASG oldPwrRtg = pwrRtg;
		pwrRtg = newPwrRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__PWR_RTG, oldPwrRtg, pwrRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCC getTransformerControl() {
		if (transformerControl != null && transformerControl.eIsProxy()) {
			InternalEObject oldTransformerControl = (InternalEObject)transformerControl;
			transformerControl = (ATCC)eResolveProxy(oldTransformerControl);
			if (transformerControl != oldTransformerControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPTR__TRANSFORMER_CONTROL, oldTransformerControl, transformerControl));
			}
		}
		return transformerControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCC basicGetTransformerControl() {
		return transformerControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerControl(ATCC newTransformerControl) {
		ATCC oldTransformerControl = transformerControl;
		transformerControl = newTransformerControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPTR__TRANSFORMER_CONTROL, oldTransformerControl, transformerControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupYPackage.YPTR__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupYPackage.YPTR__HP_TMP:
				if (resolve) return getHPTmp();
				return basicGetHPTmp();
			case LNGroupYPackage.YPTR__HP_ZMP_ALM:
				if (resolve) return getHPZmpAlm();
				return basicGetHPZmpAlm();
			case LNGroupYPackage.YPTR__HP_TMP_TR:
				if (resolve) return getHPTmpTr();
				return basicGetHPTmpTr();
			case LNGroupYPackage.YPTR__OANL:
				if (resolve) return getOANL();
				return basicGetOANL();
			case LNGroupYPackage.YPTR__OP_OV_A:
				if (resolve) return getOpOvA();
				return basicGetOpOvA();
			case LNGroupYPackage.YPTR__OP_OV_V:
				if (resolve) return getOpOvV();
				return basicGetOpOvV();
			case LNGroupYPackage.YPTR__OP_UN_V:
				if (resolve) return getOpUnV();
				return basicGetOpUnV();
			case LNGroupYPackage.YPTR__CG_ALM:
				if (resolve) return getCGAlm();
				return basicGetCGAlm();
			case LNGroupYPackage.YPTR__HI_VRTG:
				if (resolve) return getHiVRtg();
				return basicGetHiVRtg();
			case LNGroupYPackage.YPTR__LO_VRTG:
				if (resolve) return getLoVRtg();
				return basicGetLoVRtg();
			case LNGroupYPackage.YPTR__PWR_RTG:
				if (resolve) return getPwrRtg();
				return basicGetPwrRtg();
			case LNGroupYPackage.YPTR__TRANSFORMER_CONTROL:
				if (resolve) return getTransformerControl();
				return basicGetTransformerControl();
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
			case LNGroupYPackage.YPTR__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupYPackage.YPTR__HP_TMP:
				setHPTmp((MV)newValue);
				return;
			case LNGroupYPackage.YPTR__HP_ZMP_ALM:
				setHPZmpAlm((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__HP_TMP_TR:
				setHPTmpTr((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__OANL:
				setOANL((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__OP_OV_A:
				setOpOvA((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__OP_OV_V:
				setOpOvV((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__OP_UN_V:
				setOpUnV((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__CG_ALM:
				setCGAlm((SPS)newValue);
				return;
			case LNGroupYPackage.YPTR__HI_VRTG:
				setHiVRtg((ASG)newValue);
				return;
			case LNGroupYPackage.YPTR__LO_VRTG:
				setLoVRtg((ASG)newValue);
				return;
			case LNGroupYPackage.YPTR__PWR_RTG:
				setPwrRtg((ASG)newValue);
				return;
			case LNGroupYPackage.YPTR__TRANSFORMER_CONTROL:
				setTransformerControl((ATCC)newValue);
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
			case LNGroupYPackage.YPTR__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupYPackage.YPTR__HP_TMP:
				setHPTmp((MV)null);
				return;
			case LNGroupYPackage.YPTR__HP_ZMP_ALM:
				setHPZmpAlm((SPS)null);
				return;
			case LNGroupYPackage.YPTR__HP_TMP_TR:
				setHPTmpTr((SPS)null);
				return;
			case LNGroupYPackage.YPTR__OANL:
				setOANL((SPS)null);
				return;
			case LNGroupYPackage.YPTR__OP_OV_A:
				setOpOvA((SPS)null);
				return;
			case LNGroupYPackage.YPTR__OP_OV_V:
				setOpOvV((SPS)null);
				return;
			case LNGroupYPackage.YPTR__OP_UN_V:
				setOpUnV((SPS)null);
				return;
			case LNGroupYPackage.YPTR__CG_ALM:
				setCGAlm((SPS)null);
				return;
			case LNGroupYPackage.YPTR__HI_VRTG:
				setHiVRtg((ASG)null);
				return;
			case LNGroupYPackage.YPTR__LO_VRTG:
				setLoVRtg((ASG)null);
				return;
			case LNGroupYPackage.YPTR__PWR_RTG:
				setPwrRtg((ASG)null);
				return;
			case LNGroupYPackage.YPTR__TRANSFORMER_CONTROL:
				setTransformerControl((ATCC)null);
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
			case LNGroupYPackage.YPTR__OP_TMH:
				return opTmh != null;
			case LNGroupYPackage.YPTR__HP_TMP:
				return hpTmp != null;
			case LNGroupYPackage.YPTR__HP_ZMP_ALM:
				return hpZmpAlm != null;
			case LNGroupYPackage.YPTR__HP_TMP_TR:
				return hpTmpTr != null;
			case LNGroupYPackage.YPTR__OANL:
				return oanl != null;
			case LNGroupYPackage.YPTR__OP_OV_A:
				return opOvA != null;
			case LNGroupYPackage.YPTR__OP_OV_V:
				return opOvV != null;
			case LNGroupYPackage.YPTR__OP_UN_V:
				return opUnV != null;
			case LNGroupYPackage.YPTR__CG_ALM:
				return cgAlm != null;
			case LNGroupYPackage.YPTR__HI_VRTG:
				return hiVRtg != null;
			case LNGroupYPackage.YPTR__LO_VRTG:
				return loVRtg != null;
			case LNGroupYPackage.YPTR__PWR_RTG:
				return pwrRtg != null;
			case LNGroupYPackage.YPTR__TRANSFORMER_CONTROL:
				return transformerControl != null;
		}
		return super.eIsSet(featureID);
	}

} //YPTRImpl
