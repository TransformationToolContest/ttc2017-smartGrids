/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import gluemodel.substationStandard.LNNodes.LNGroupR.RSYN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RSYN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getRHz <em>RHz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getLHz <em>LHz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getRV <em>RV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getLV <em>LV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getVlnd <em>Vlnd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getAngInd <em>Ang Ind</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getHzInd <em>Hz Ind</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getSynPrg <em>Syn Prg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDifVClc <em>Dif VClc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDifAngClc <em>Dif Ang Clc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDifV <em>Dif V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDifHz <em>Dif Hz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDifAng <em>Dif Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getLivDeaMod <em>Liv Dea Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDeaLinVal <em>Dea Lin Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getLivLinVal <em>Liv Lin Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getDeaBusVal <em>Dea Bus Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getPlsTmms <em>Pls Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl#getBkrTmms <em>Bkr Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSYNImpl extends GroupRImpl implements RSYN {
	/**
	 * The cached value of the '{@link #getRHz() <em>RHz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRHz()
	 * @generated
	 * @ordered
	 */
	protected SPC rHz;

	/**
	 * The cached value of the '{@link #getLHz() <em>LHz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLHz()
	 * @generated
	 * @ordered
	 */
	protected SPC lHz;

	/**
	 * The cached value of the '{@link #getRV() <em>RV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRV()
	 * @generated
	 * @ordered
	 */
	protected SPC rv;

	/**
	 * The cached value of the '{@link #getLV() <em>LV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLV()
	 * @generated
	 * @ordered
	 */
	protected SPC lv;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected SPS rel;

	/**
	 * The cached value of the '{@link #getVlnd() <em>Vlnd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlnd()
	 * @generated
	 * @ordered
	 */
	protected SPS vlnd;

	/**
	 * The cached value of the '{@link #getAngInd() <em>Ang Ind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngInd()
	 * @generated
	 * @ordered
	 */
	protected SPS angInd;

	/**
	 * The cached value of the '{@link #getHzInd() <em>Hz Ind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHzInd()
	 * @generated
	 * @ordered
	 */
	protected SPS hzInd;

	/**
	 * The cached value of the '{@link #getSynPrg() <em>Syn Prg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynPrg()
	 * @generated
	 * @ordered
	 */
	protected SPS synPrg;

	/**
	 * The cached value of the '{@link #getDifVClc() <em>Dif VClc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifVClc()
	 * @generated
	 * @ordered
	 */
	protected MV difVClc;

	/**
	 * The cached value of the '{@link #getDifAngClc() <em>Dif Ang Clc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifAngClc()
	 * @generated
	 * @ordered
	 */
	protected MV difAngClc;

	/**
	 * The cached value of the '{@link #getDifV() <em>Dif V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifV()
	 * @generated
	 * @ordered
	 */
	protected ASG difV;

	/**
	 * The cached value of the '{@link #getDifHz() <em>Dif Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifHz()
	 * @generated
	 * @ordered
	 */
	protected ASG difHz;

	/**
	 * The cached value of the '{@link #getDifAng() <em>Dif Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifAng()
	 * @generated
	 * @ordered
	 */
	protected ASG difAng;

	/**
	 * The cached value of the '{@link #getLivDeaMod() <em>Liv Dea Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivDeaMod()
	 * @generated
	 * @ordered
	 */
	protected ING livDeaMod;

	/**
	 * The cached value of the '{@link #getDeaLinVal() <em>Dea Lin Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeaLinVal()
	 * @generated
	 * @ordered
	 */
	protected ASG deaLinVal;

	/**
	 * The cached value of the '{@link #getLivLinVal() <em>Liv Lin Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivLinVal()
	 * @generated
	 * @ordered
	 */
	protected ASG livLinVal;

	/**
	 * The cached value of the '{@link #getDeaBusVal() <em>Dea Bus Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeaBusVal()
	 * @generated
	 * @ordered
	 */
	protected ASG deaBusVal;

	/**
	 * The cached value of the '{@link #getPlsTmms() <em>Pls Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlsTmms()
	 * @generated
	 * @ordered
	 */
	protected ING plsTmms;

	/**
	 * The cached value of the '{@link #getBkrTmms() <em>Bkr Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBkrTmms()
	 * @generated
	 * @ordered
	 */
	protected ING bkrTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSYNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RSYN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getRHz() {
		if (rHz != null && rHz.eIsProxy()) {
			InternalEObject oldRHz = (InternalEObject)rHz;
			rHz = (SPC)eResolveProxy(oldRHz);
			if (rHz != oldRHz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__RHZ, oldRHz, rHz));
			}
		}
		return rHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetRHz() {
		return rHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRHz(SPC newRHz) {
		SPC oldRHz = rHz;
		rHz = newRHz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__RHZ, oldRHz, rHz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getLHz() {
		if (lHz != null && lHz.eIsProxy()) {
			InternalEObject oldLHz = (InternalEObject)lHz;
			lHz = (SPC)eResolveProxy(oldLHz);
			if (lHz != oldLHz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__LHZ, oldLHz, lHz));
			}
		}
		return lHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetLHz() {
		return lHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLHz(SPC newLHz) {
		SPC oldLHz = lHz;
		lHz = newLHz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__LHZ, oldLHz, lHz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getRV() {
		if (rv != null && rv.eIsProxy()) {
			InternalEObject oldRV = (InternalEObject)rv;
			rv = (SPC)eResolveProxy(oldRV);
			if (rv != oldRV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__RV, oldRV, rv));
			}
		}
		return rv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetRV() {
		return rv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRV(SPC newRV) {
		SPC oldRV = rv;
		rv = newRV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__RV, oldRV, rv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getLV() {
		if (lv != null && lv.eIsProxy()) {
			InternalEObject oldLV = (InternalEObject)lv;
			lv = (SPC)eResolveProxy(oldLV);
			if (lv != oldLV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__LV, oldLV, lv));
			}
		}
		return lv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetLV() {
		return lv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLV(SPC newLV) {
		SPC oldLV = lv;
		lv = newLV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__LV, oldLV, lv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getRel() {
		if (rel != null && rel.eIsProxy()) {
			InternalEObject oldRel = (InternalEObject)rel;
			rel = (SPS)eResolveProxy(oldRel);
			if (rel != oldRel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__REL, oldRel, rel));
			}
		}
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(SPS newRel) {
		SPS oldRel = rel;
		rel = newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__REL, oldRel, rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getVlnd() {
		if (vlnd != null && vlnd.eIsProxy()) {
			InternalEObject oldVlnd = (InternalEObject)vlnd;
			vlnd = (SPS)eResolveProxy(oldVlnd);
			if (vlnd != oldVlnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__VLND, oldVlnd, vlnd));
			}
		}
		return vlnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetVlnd() {
		return vlnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVlnd(SPS newVlnd) {
		SPS oldVlnd = vlnd;
		vlnd = newVlnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__VLND, oldVlnd, vlnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getAngInd() {
		if (angInd != null && angInd.eIsProxy()) {
			InternalEObject oldAngInd = (InternalEObject)angInd;
			angInd = (SPS)eResolveProxy(oldAngInd);
			if (angInd != oldAngInd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__ANG_IND, oldAngInd, angInd));
			}
		}
		return angInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetAngInd() {
		return angInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngInd(SPS newAngInd) {
		SPS oldAngInd = angInd;
		angInd = newAngInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__ANG_IND, oldAngInd, angInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getHzInd() {
		if (hzInd != null && hzInd.eIsProxy()) {
			InternalEObject oldHzInd = (InternalEObject)hzInd;
			hzInd = (SPS)eResolveProxy(oldHzInd);
			if (hzInd != oldHzInd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__HZ_IND, oldHzInd, hzInd));
			}
		}
		return hzInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetHzInd() {
		return hzInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHzInd(SPS newHzInd) {
		SPS oldHzInd = hzInd;
		hzInd = newHzInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__HZ_IND, oldHzInd, hzInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getSynPrg() {
		if (synPrg != null && synPrg.eIsProxy()) {
			InternalEObject oldSynPrg = (InternalEObject)synPrg;
			synPrg = (SPS)eResolveProxy(oldSynPrg);
			if (synPrg != oldSynPrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__SYN_PRG, oldSynPrg, synPrg));
			}
		}
		return synPrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetSynPrg() {
		return synPrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynPrg(SPS newSynPrg) {
		SPS oldSynPrg = synPrg;
		synPrg = newSynPrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__SYN_PRG, oldSynPrg, synPrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getDifVClc() {
		if (difVClc != null && difVClc.eIsProxy()) {
			InternalEObject oldDifVClc = (InternalEObject)difVClc;
			difVClc = (MV)eResolveProxy(oldDifVClc);
			if (difVClc != oldDifVClc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DIF_VCLC, oldDifVClc, difVClc));
			}
		}
		return difVClc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetDifVClc() {
		return difVClc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifVClc(MV newDifVClc) {
		MV oldDifVClc = difVClc;
		difVClc = newDifVClc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DIF_VCLC, oldDifVClc, difVClc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getDifAngClc() {
		if (difAngClc != null && difAngClc.eIsProxy()) {
			InternalEObject oldDifAngClc = (InternalEObject)difAngClc;
			difAngClc = (MV)eResolveProxy(oldDifAngClc);
			if (difAngClc != oldDifAngClc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DIF_ANG_CLC, oldDifAngClc, difAngClc));
			}
		}
		return difAngClc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetDifAngClc() {
		return difAngClc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifAngClc(MV newDifAngClc) {
		MV oldDifAngClc = difAngClc;
		difAngClc = newDifAngClc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DIF_ANG_CLC, oldDifAngClc, difAngClc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDifV() {
		if (difV != null && difV.eIsProxy()) {
			InternalEObject oldDifV = (InternalEObject)difV;
			difV = (ASG)eResolveProxy(oldDifV);
			if (difV != oldDifV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DIF_V, oldDifV, difV));
			}
		}
		return difV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDifV() {
		return difV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifV(ASG newDifV) {
		ASG oldDifV = difV;
		difV = newDifV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DIF_V, oldDifV, difV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDifHz() {
		if (difHz != null && difHz.eIsProxy()) {
			InternalEObject oldDifHz = (InternalEObject)difHz;
			difHz = (ASG)eResolveProxy(oldDifHz);
			if (difHz != oldDifHz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DIF_HZ, oldDifHz, difHz));
			}
		}
		return difHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDifHz() {
		return difHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifHz(ASG newDifHz) {
		ASG oldDifHz = difHz;
		difHz = newDifHz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DIF_HZ, oldDifHz, difHz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDifAng() {
		if (difAng != null && difAng.eIsProxy()) {
			InternalEObject oldDifAng = (InternalEObject)difAng;
			difAng = (ASG)eResolveProxy(oldDifAng);
			if (difAng != oldDifAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DIF_ANG, oldDifAng, difAng));
			}
		}
		return difAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDifAng() {
		return difAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifAng(ASG newDifAng) {
		ASG oldDifAng = difAng;
		difAng = newDifAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DIF_ANG, oldDifAng, difAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getLivDeaMod() {
		if (livDeaMod != null && livDeaMod.eIsProxy()) {
			InternalEObject oldLivDeaMod = (InternalEObject)livDeaMod;
			livDeaMod = (ING)eResolveProxy(oldLivDeaMod);
			if (livDeaMod != oldLivDeaMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__LIV_DEA_MOD, oldLivDeaMod, livDeaMod));
			}
		}
		return livDeaMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetLivDeaMod() {
		return livDeaMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivDeaMod(ING newLivDeaMod) {
		ING oldLivDeaMod = livDeaMod;
		livDeaMod = newLivDeaMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__LIV_DEA_MOD, oldLivDeaMod, livDeaMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDeaLinVal() {
		if (deaLinVal != null && deaLinVal.eIsProxy()) {
			InternalEObject oldDeaLinVal = (InternalEObject)deaLinVal;
			deaLinVal = (ASG)eResolveProxy(oldDeaLinVal);
			if (deaLinVal != oldDeaLinVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DEA_LIN_VAL, oldDeaLinVal, deaLinVal));
			}
		}
		return deaLinVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDeaLinVal() {
		return deaLinVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeaLinVal(ASG newDeaLinVal) {
		ASG oldDeaLinVal = deaLinVal;
		deaLinVal = newDeaLinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DEA_LIN_VAL, oldDeaLinVal, deaLinVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLivLinVal() {
		if (livLinVal != null && livLinVal.eIsProxy()) {
			InternalEObject oldLivLinVal = (InternalEObject)livLinVal;
			livLinVal = (ASG)eResolveProxy(oldLivLinVal);
			if (livLinVal != oldLivLinVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__LIV_LIN_VAL, oldLivLinVal, livLinVal));
			}
		}
		return livLinVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLivLinVal() {
		return livLinVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivLinVal(ASG newLivLinVal) {
		ASG oldLivLinVal = livLinVal;
		livLinVal = newLivLinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__LIV_LIN_VAL, oldLivLinVal, livLinVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDeaBusVal() {
		if (deaBusVal != null && deaBusVal.eIsProxy()) {
			InternalEObject oldDeaBusVal = (InternalEObject)deaBusVal;
			deaBusVal = (ASG)eResolveProxy(oldDeaBusVal);
			if (deaBusVal != oldDeaBusVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__DEA_BUS_VAL, oldDeaBusVal, deaBusVal));
			}
		}
		return deaBusVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDeaBusVal() {
		return deaBusVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeaBusVal(ASG newDeaBusVal) {
		ASG oldDeaBusVal = deaBusVal;
		deaBusVal = newDeaBusVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__DEA_BUS_VAL, oldDeaBusVal, deaBusVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPlsTmms() {
		if (plsTmms != null && plsTmms.eIsProxy()) {
			InternalEObject oldPlsTmms = (InternalEObject)plsTmms;
			plsTmms = (ING)eResolveProxy(oldPlsTmms);
			if (plsTmms != oldPlsTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__PLS_TMMS, oldPlsTmms, plsTmms));
			}
		}
		return plsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPlsTmms() {
		return plsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlsTmms(ING newPlsTmms) {
		ING oldPlsTmms = plsTmms;
		plsTmms = newPlsTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__PLS_TMMS, oldPlsTmms, plsTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getBkrTmms() {
		if (bkrTmms != null && bkrTmms.eIsProxy()) {
			InternalEObject oldBkrTmms = (InternalEObject)bkrTmms;
			bkrTmms = (ING)eResolveProxy(oldBkrTmms);
			if (bkrTmms != oldBkrTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RSYN__BKR_TMMS, oldBkrTmms, bkrTmms));
			}
		}
		return bkrTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetBkrTmms() {
		return bkrTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBkrTmms(ING newBkrTmms) {
		ING oldBkrTmms = bkrTmms;
		bkrTmms = newBkrTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RSYN__BKR_TMMS, oldBkrTmms, bkrTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RSYN__RHZ:
				if (resolve) return getRHz();
				return basicGetRHz();
			case LNGroupRPackage.RSYN__LHZ:
				if (resolve) return getLHz();
				return basicGetLHz();
			case LNGroupRPackage.RSYN__RV:
				if (resolve) return getRV();
				return basicGetRV();
			case LNGroupRPackage.RSYN__LV:
				if (resolve) return getLV();
				return basicGetLV();
			case LNGroupRPackage.RSYN__REL:
				if (resolve) return getRel();
				return basicGetRel();
			case LNGroupRPackage.RSYN__VLND:
				if (resolve) return getVlnd();
				return basicGetVlnd();
			case LNGroupRPackage.RSYN__ANG_IND:
				if (resolve) return getAngInd();
				return basicGetAngInd();
			case LNGroupRPackage.RSYN__HZ_IND:
				if (resolve) return getHzInd();
				return basicGetHzInd();
			case LNGroupRPackage.RSYN__SYN_PRG:
				if (resolve) return getSynPrg();
				return basicGetSynPrg();
			case LNGroupRPackage.RSYN__DIF_VCLC:
				if (resolve) return getDifVClc();
				return basicGetDifVClc();
			case LNGroupRPackage.RSYN__DIF_ANG_CLC:
				if (resolve) return getDifAngClc();
				return basicGetDifAngClc();
			case LNGroupRPackage.RSYN__DIF_V:
				if (resolve) return getDifV();
				return basicGetDifV();
			case LNGroupRPackage.RSYN__DIF_HZ:
				if (resolve) return getDifHz();
				return basicGetDifHz();
			case LNGroupRPackage.RSYN__DIF_ANG:
				if (resolve) return getDifAng();
				return basicGetDifAng();
			case LNGroupRPackage.RSYN__LIV_DEA_MOD:
				if (resolve) return getLivDeaMod();
				return basicGetLivDeaMod();
			case LNGroupRPackage.RSYN__DEA_LIN_VAL:
				if (resolve) return getDeaLinVal();
				return basicGetDeaLinVal();
			case LNGroupRPackage.RSYN__LIV_LIN_VAL:
				if (resolve) return getLivLinVal();
				return basicGetLivLinVal();
			case LNGroupRPackage.RSYN__DEA_BUS_VAL:
				if (resolve) return getDeaBusVal();
				return basicGetDeaBusVal();
			case LNGroupRPackage.RSYN__PLS_TMMS:
				if (resolve) return getPlsTmms();
				return basicGetPlsTmms();
			case LNGroupRPackage.RSYN__BKR_TMMS:
				if (resolve) return getBkrTmms();
				return basicGetBkrTmms();
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
			case LNGroupRPackage.RSYN__RHZ:
				setRHz((SPC)newValue);
				return;
			case LNGroupRPackage.RSYN__LHZ:
				setLHz((SPC)newValue);
				return;
			case LNGroupRPackage.RSYN__RV:
				setRV((SPC)newValue);
				return;
			case LNGroupRPackage.RSYN__LV:
				setLV((SPC)newValue);
				return;
			case LNGroupRPackage.RSYN__REL:
				setRel((SPS)newValue);
				return;
			case LNGroupRPackage.RSYN__VLND:
				setVlnd((SPS)newValue);
				return;
			case LNGroupRPackage.RSYN__ANG_IND:
				setAngInd((SPS)newValue);
				return;
			case LNGroupRPackage.RSYN__HZ_IND:
				setHzInd((SPS)newValue);
				return;
			case LNGroupRPackage.RSYN__SYN_PRG:
				setSynPrg((SPS)newValue);
				return;
			case LNGroupRPackage.RSYN__DIF_VCLC:
				setDifVClc((MV)newValue);
				return;
			case LNGroupRPackage.RSYN__DIF_ANG_CLC:
				setDifAngClc((MV)newValue);
				return;
			case LNGroupRPackage.RSYN__DIF_V:
				setDifV((ASG)newValue);
				return;
			case LNGroupRPackage.RSYN__DIF_HZ:
				setDifHz((ASG)newValue);
				return;
			case LNGroupRPackage.RSYN__DIF_ANG:
				setDifAng((ASG)newValue);
				return;
			case LNGroupRPackage.RSYN__LIV_DEA_MOD:
				setLivDeaMod((ING)newValue);
				return;
			case LNGroupRPackage.RSYN__DEA_LIN_VAL:
				setDeaLinVal((ASG)newValue);
				return;
			case LNGroupRPackage.RSYN__LIV_LIN_VAL:
				setLivLinVal((ASG)newValue);
				return;
			case LNGroupRPackage.RSYN__DEA_BUS_VAL:
				setDeaBusVal((ASG)newValue);
				return;
			case LNGroupRPackage.RSYN__PLS_TMMS:
				setPlsTmms((ING)newValue);
				return;
			case LNGroupRPackage.RSYN__BKR_TMMS:
				setBkrTmms((ING)newValue);
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
			case LNGroupRPackage.RSYN__RHZ:
				setRHz((SPC)null);
				return;
			case LNGroupRPackage.RSYN__LHZ:
				setLHz((SPC)null);
				return;
			case LNGroupRPackage.RSYN__RV:
				setRV((SPC)null);
				return;
			case LNGroupRPackage.RSYN__LV:
				setLV((SPC)null);
				return;
			case LNGroupRPackage.RSYN__REL:
				setRel((SPS)null);
				return;
			case LNGroupRPackage.RSYN__VLND:
				setVlnd((SPS)null);
				return;
			case LNGroupRPackage.RSYN__ANG_IND:
				setAngInd((SPS)null);
				return;
			case LNGroupRPackage.RSYN__HZ_IND:
				setHzInd((SPS)null);
				return;
			case LNGroupRPackage.RSYN__SYN_PRG:
				setSynPrg((SPS)null);
				return;
			case LNGroupRPackage.RSYN__DIF_VCLC:
				setDifVClc((MV)null);
				return;
			case LNGroupRPackage.RSYN__DIF_ANG_CLC:
				setDifAngClc((MV)null);
				return;
			case LNGroupRPackage.RSYN__DIF_V:
				setDifV((ASG)null);
				return;
			case LNGroupRPackage.RSYN__DIF_HZ:
				setDifHz((ASG)null);
				return;
			case LNGroupRPackage.RSYN__DIF_ANG:
				setDifAng((ASG)null);
				return;
			case LNGroupRPackage.RSYN__LIV_DEA_MOD:
				setLivDeaMod((ING)null);
				return;
			case LNGroupRPackage.RSYN__DEA_LIN_VAL:
				setDeaLinVal((ASG)null);
				return;
			case LNGroupRPackage.RSYN__LIV_LIN_VAL:
				setLivLinVal((ASG)null);
				return;
			case LNGroupRPackage.RSYN__DEA_BUS_VAL:
				setDeaBusVal((ASG)null);
				return;
			case LNGroupRPackage.RSYN__PLS_TMMS:
				setPlsTmms((ING)null);
				return;
			case LNGroupRPackage.RSYN__BKR_TMMS:
				setBkrTmms((ING)null);
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
			case LNGroupRPackage.RSYN__RHZ:
				return rHz != null;
			case LNGroupRPackage.RSYN__LHZ:
				return lHz != null;
			case LNGroupRPackage.RSYN__RV:
				return rv != null;
			case LNGroupRPackage.RSYN__LV:
				return lv != null;
			case LNGroupRPackage.RSYN__REL:
				return rel != null;
			case LNGroupRPackage.RSYN__VLND:
				return vlnd != null;
			case LNGroupRPackage.RSYN__ANG_IND:
				return angInd != null;
			case LNGroupRPackage.RSYN__HZ_IND:
				return hzInd != null;
			case LNGroupRPackage.RSYN__SYN_PRG:
				return synPrg != null;
			case LNGroupRPackage.RSYN__DIF_VCLC:
				return difVClc != null;
			case LNGroupRPackage.RSYN__DIF_ANG_CLC:
				return difAngClc != null;
			case LNGroupRPackage.RSYN__DIF_V:
				return difV != null;
			case LNGroupRPackage.RSYN__DIF_HZ:
				return difHz != null;
			case LNGroupRPackage.RSYN__DIF_ANG:
				return difAng != null;
			case LNGroupRPackage.RSYN__LIV_DEA_MOD:
				return livDeaMod != null;
			case LNGroupRPackage.RSYN__DEA_LIN_VAL:
				return deaLinVal != null;
			case LNGroupRPackage.RSYN__LIV_LIN_VAL:
				return livLinVal != null;
			case LNGroupRPackage.RSYN__DEA_BUS_VAL:
				return deaBusVal != null;
			case LNGroupRPackage.RSYN__PLS_TMMS:
				return plsTmms != null;
			case LNGroupRPackage.RSYN__BKR_TMMS:
				return bkrTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //RSYNImpl
