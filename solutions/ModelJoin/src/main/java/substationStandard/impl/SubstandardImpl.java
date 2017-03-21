/**
 */
package substationStandard.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.BSC;
import substationStandard.Dataclasses.BSControl;
import substationStandard.Dataclasses.CMV;
import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.DPStatus;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.LPL;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;
import substationStandard.Dataclasses.ValWithTrans;
import substationStandard.Dataclasses.Vector;
import substationStandard.Dataclasses.WYE;

import substationStandard.LNNodes.DomainLNs.DomainLN;

import substationStandard.Substandard;
import substationStandard.SubstationStandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substandard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getLN <em>LN</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getNamePlt <em>Name Plt</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getLPL <em>LPL</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getDPC <em>DPC</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getACT <em>ACT</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getSPS <em>SPS</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getBSC <em>BSC</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getISC <em>ISC</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getSPC <em>SPC</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getMV <em>MV</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getINS <em>INS</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getASG <em>ASG</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getWYE <em>WYE</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getDPStatus <em>DP Status</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getAnalogueValue <em>Analogue Value</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getCMV <em>CMV</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getValWithTrans <em>Val With Trans</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getBSControl <em>BS Control</em>}</li>
 *   <li>{@link substationStandard.impl.SubstandardImpl#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstandardImpl extends MinimalEObjectImpl.Container implements Substandard {
	/**
	 * The cached value of the '{@link #getLN() <em>LN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLN()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainLN> ln;

	/**
	 * The cached value of the '{@link #getNamePlt() <em>Name Plt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePlt()
	 * @generated
	 * @ordered
	 */
	protected EList<LPL> namePlt;

	/**
	 * The cached value of the '{@link #getLPL() <em>LPL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLPL()
	 * @generated
	 * @ordered
	 */
	protected EList<LPL> lpl;

	/**
	 * The cached value of the '{@link #getDPC() <em>DPC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPC()
	 * @generated
	 * @ordered
	 */
	protected EList<DPC> dpc;

	/**
	 * The cached value of the '{@link #getACT() <em>ACT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACT()
	 * @generated
	 * @ordered
	 */
	protected EList<ACT> act;

	/**
	 * The cached value of the '{@link #getSPS() <em>SPS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS()
	 * @generated
	 * @ordered
	 */
	protected EList<SPS> sps;

	/**
	 * The cached value of the '{@link #getBSC() <em>BSC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSC()
	 * @generated
	 * @ordered
	 */
	protected EList<BSC> bsc;

	/**
	 * The cached value of the '{@link #getISC() <em>ISC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISC()
	 * @generated
	 * @ordered
	 */
	protected EList<ISC> isc;

	/**
	 * The cached value of the '{@link #getSPC() <em>SPC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPC()
	 * @generated
	 * @ordered
	 */
	protected EList<SPC> spc;

	/**
	 * The cached value of the '{@link #getMV() <em>MV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMV()
	 * @generated
	 * @ordered
	 */
	protected EList<MV> mv;

	/**
	 * The cached value of the '{@link #getINS() <em>INS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINS()
	 * @generated
	 * @ordered
	 */
	protected EList<INS> ins;

	/**
	 * The cached value of the '{@link #getASG() <em>ASG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASG()
	 * @generated
	 * @ordered
	 */
	protected EList<ASG> asg;

	/**
	 * The cached value of the '{@link #getWYE() <em>WYE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWYE()
	 * @generated
	 * @ordered
	 */
	protected EList<WYE> wye;

	/**
	 * The cached value of the '{@link #getDPStatus() <em>DP Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<DPStatus> dpStatus;

	/**
	 * The cached value of the '{@link #getAnalogueValue() <em>Analogue Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogueValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogueValue> analogueValue;

	/**
	 * The cached value of the '{@link #getCMV() <em>CMV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMV()
	 * @generated
	 * @ordered
	 */
	protected EList<CMV> cmv;

	/**
	 * The cached value of the '{@link #getValWithTrans() <em>Val With Trans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValWithTrans()
	 * @generated
	 * @ordered
	 */
	protected EList<ValWithTrans> valWithTrans;

	/**
	 * The cached value of the '{@link #getBSControl() <em>BS Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSControl()
	 * @generated
	 * @ordered
	 */
	protected EList<BSControl> bsControl;

	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected EList<Vector> vector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubstationStandardPackage.Literals.SUBSTANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainLN> getLN() {
		if (ln == null) {
			ln = new EObjectContainmentEList<DomainLN>(DomainLN.class, this, SubstationStandardPackage.SUBSTANDARD__LN);
		}
		return ln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPL> getNamePlt() {
		if (namePlt == null) {
			namePlt = new EObjectContainmentEList<LPL>(LPL.class, this, SubstationStandardPackage.SUBSTANDARD__NAME_PLT);
		}
		return namePlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPL> getLPL() {
		if (lpl == null) {
			lpl = new EObjectContainmentEList<LPL>(LPL.class, this, SubstationStandardPackage.SUBSTANDARD__LPL);
		}
		return lpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPC> getDPC() {
		if (dpc == null) {
			dpc = new EObjectContainmentEList<DPC>(DPC.class, this, SubstationStandardPackage.SUBSTANDARD__DPC);
		}
		return dpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ACT> getACT() {
		if (act == null) {
			act = new EObjectContainmentEList<ACT>(ACT.class, this, SubstationStandardPackage.SUBSTANDARD__ACT);
		}
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPS> getSPS() {
		if (sps == null) {
			sps = new EObjectContainmentEList<SPS>(SPS.class, this, SubstationStandardPackage.SUBSTANDARD__SPS);
		}
		return sps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BSC> getBSC() {
		if (bsc == null) {
			bsc = new EObjectContainmentEList<BSC>(BSC.class, this, SubstationStandardPackage.SUBSTANDARD__BSC);
		}
		return bsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISC> getISC() {
		if (isc == null) {
			isc = new EObjectContainmentEList<ISC>(ISC.class, this, SubstationStandardPackage.SUBSTANDARD__ISC);
		}
		return isc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPC> getSPC() {
		if (spc == null) {
			spc = new EObjectContainmentEList<SPC>(SPC.class, this, SubstationStandardPackage.SUBSTANDARD__SPC);
		}
		return spc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MV> getMV() {
		if (mv == null) {
			mv = new EObjectContainmentEList<MV>(MV.class, this, SubstationStandardPackage.SUBSTANDARD__MV);
		}
		return mv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INS> getINS() {
		if (ins == null) {
			ins = new EObjectContainmentEList<INS>(INS.class, this, SubstationStandardPackage.SUBSTANDARD__INS);
		}
		return ins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ASG> getASG() {
		if (asg == null) {
			asg = new EObjectContainmentEList<ASG>(ASG.class, this, SubstationStandardPackage.SUBSTANDARD__ASG);
		}
		return asg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WYE> getWYE() {
		if (wye == null) {
			wye = new EObjectContainmentEList<WYE>(WYE.class, this, SubstationStandardPackage.SUBSTANDARD__WYE);
		}
		return wye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPStatus> getDPStatus() {
		if (dpStatus == null) {
			dpStatus = new EObjectContainmentEList<DPStatus>(DPStatus.class, this, SubstationStandardPackage.SUBSTANDARD__DP_STATUS);
		}
		return dpStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogueValue> getAnalogueValue() {
		if (analogueValue == null) {
			analogueValue = new EObjectContainmentEList<AnalogueValue>(AnalogueValue.class, this, SubstationStandardPackage.SUBSTANDARD__ANALOGUE_VALUE);
		}
		return analogueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CMV> getCMV() {
		if (cmv == null) {
			cmv = new EObjectContainmentEList<CMV>(CMV.class, this, SubstationStandardPackage.SUBSTANDARD__CMV);
		}
		return cmv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValWithTrans> getValWithTrans() {
		if (valWithTrans == null) {
			valWithTrans = new EObjectContainmentEList<ValWithTrans>(ValWithTrans.class, this, SubstationStandardPackage.SUBSTANDARD__VAL_WITH_TRANS);
		}
		return valWithTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BSControl> getBSControl() {
		if (bsControl == null) {
			bsControl = new EObjectContainmentEList<BSControl>(BSControl.class, this, SubstationStandardPackage.SUBSTANDARD__BS_CONTROL);
		}
		return bsControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vector> getVector() {
		if (vector == null) {
			vector = new EObjectContainmentEList<Vector>(Vector.class, this, SubstationStandardPackage.SUBSTANDARD__VECTOR);
		}
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubstationStandardPackage.SUBSTANDARD__LN:
				return ((InternalEList<?>)getLN()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__NAME_PLT:
				return ((InternalEList<?>)getNamePlt()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__LPL:
				return ((InternalEList<?>)getLPL()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__DPC:
				return ((InternalEList<?>)getDPC()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__ACT:
				return ((InternalEList<?>)getACT()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__SPS:
				return ((InternalEList<?>)getSPS()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__BSC:
				return ((InternalEList<?>)getBSC()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__ISC:
				return ((InternalEList<?>)getISC()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__SPC:
				return ((InternalEList<?>)getSPC()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__MV:
				return ((InternalEList<?>)getMV()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__INS:
				return ((InternalEList<?>)getINS()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__ASG:
				return ((InternalEList<?>)getASG()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__WYE:
				return ((InternalEList<?>)getWYE()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__DP_STATUS:
				return ((InternalEList<?>)getDPStatus()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__ANALOGUE_VALUE:
				return ((InternalEList<?>)getAnalogueValue()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__CMV:
				return ((InternalEList<?>)getCMV()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__VAL_WITH_TRANS:
				return ((InternalEList<?>)getValWithTrans()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__BS_CONTROL:
				return ((InternalEList<?>)getBSControl()).basicRemove(otherEnd, msgs);
			case SubstationStandardPackage.SUBSTANDARD__VECTOR:
				return ((InternalEList<?>)getVector()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubstationStandardPackage.SUBSTANDARD__LN:
				return getLN();
			case SubstationStandardPackage.SUBSTANDARD__NAME_PLT:
				return getNamePlt();
			case SubstationStandardPackage.SUBSTANDARD__LPL:
				return getLPL();
			case SubstationStandardPackage.SUBSTANDARD__DPC:
				return getDPC();
			case SubstationStandardPackage.SUBSTANDARD__ACT:
				return getACT();
			case SubstationStandardPackage.SUBSTANDARD__SPS:
				return getSPS();
			case SubstationStandardPackage.SUBSTANDARD__BSC:
				return getBSC();
			case SubstationStandardPackage.SUBSTANDARD__ISC:
				return getISC();
			case SubstationStandardPackage.SUBSTANDARD__SPC:
				return getSPC();
			case SubstationStandardPackage.SUBSTANDARD__MV:
				return getMV();
			case SubstationStandardPackage.SUBSTANDARD__INS:
				return getINS();
			case SubstationStandardPackage.SUBSTANDARD__ASG:
				return getASG();
			case SubstationStandardPackage.SUBSTANDARD__WYE:
				return getWYE();
			case SubstationStandardPackage.SUBSTANDARD__DP_STATUS:
				return getDPStatus();
			case SubstationStandardPackage.SUBSTANDARD__ANALOGUE_VALUE:
				return getAnalogueValue();
			case SubstationStandardPackage.SUBSTANDARD__CMV:
				return getCMV();
			case SubstationStandardPackage.SUBSTANDARD__VAL_WITH_TRANS:
				return getValWithTrans();
			case SubstationStandardPackage.SUBSTANDARD__BS_CONTROL:
				return getBSControl();
			case SubstationStandardPackage.SUBSTANDARD__VECTOR:
				return getVector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubstationStandardPackage.SUBSTANDARD__LN:
				getLN().clear();
				getLN().addAll((Collection<? extends DomainLN>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__NAME_PLT:
				getNamePlt().clear();
				getNamePlt().addAll((Collection<? extends LPL>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__LPL:
				getLPL().clear();
				getLPL().addAll((Collection<? extends LPL>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__DPC:
				getDPC().clear();
				getDPC().addAll((Collection<? extends DPC>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__ACT:
				getACT().clear();
				getACT().addAll((Collection<? extends ACT>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__SPS:
				getSPS().clear();
				getSPS().addAll((Collection<? extends SPS>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__BSC:
				getBSC().clear();
				getBSC().addAll((Collection<? extends BSC>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__ISC:
				getISC().clear();
				getISC().addAll((Collection<? extends ISC>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__SPC:
				getSPC().clear();
				getSPC().addAll((Collection<? extends SPC>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__MV:
				getMV().clear();
				getMV().addAll((Collection<? extends MV>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__INS:
				getINS().clear();
				getINS().addAll((Collection<? extends INS>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__ASG:
				getASG().clear();
				getASG().addAll((Collection<? extends ASG>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__WYE:
				getWYE().clear();
				getWYE().addAll((Collection<? extends WYE>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__DP_STATUS:
				getDPStatus().clear();
				getDPStatus().addAll((Collection<? extends DPStatus>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__ANALOGUE_VALUE:
				getAnalogueValue().clear();
				getAnalogueValue().addAll((Collection<? extends AnalogueValue>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__CMV:
				getCMV().clear();
				getCMV().addAll((Collection<? extends CMV>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__VAL_WITH_TRANS:
				getValWithTrans().clear();
				getValWithTrans().addAll((Collection<? extends ValWithTrans>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__BS_CONTROL:
				getBSControl().clear();
				getBSControl().addAll((Collection<? extends BSControl>)newValue);
				return;
			case SubstationStandardPackage.SUBSTANDARD__VECTOR:
				getVector().clear();
				getVector().addAll((Collection<? extends Vector>)newValue);
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
			case SubstationStandardPackage.SUBSTANDARD__LN:
				getLN().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__NAME_PLT:
				getNamePlt().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__LPL:
				getLPL().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__DPC:
				getDPC().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__ACT:
				getACT().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__SPS:
				getSPS().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__BSC:
				getBSC().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__ISC:
				getISC().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__SPC:
				getSPC().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__MV:
				getMV().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__INS:
				getINS().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__ASG:
				getASG().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__WYE:
				getWYE().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__DP_STATUS:
				getDPStatus().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__ANALOGUE_VALUE:
				getAnalogueValue().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__CMV:
				getCMV().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__VAL_WITH_TRANS:
				getValWithTrans().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__BS_CONTROL:
				getBSControl().clear();
				return;
			case SubstationStandardPackage.SUBSTANDARD__VECTOR:
				getVector().clear();
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
			case SubstationStandardPackage.SUBSTANDARD__LN:
				return ln != null && !ln.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__NAME_PLT:
				return namePlt != null && !namePlt.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__LPL:
				return lpl != null && !lpl.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__DPC:
				return dpc != null && !dpc.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__ACT:
				return act != null && !act.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__SPS:
				return sps != null && !sps.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__BSC:
				return bsc != null && !bsc.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__ISC:
				return isc != null && !isc.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__SPC:
				return spc != null && !spc.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__MV:
				return mv != null && !mv.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__INS:
				return ins != null && !ins.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__ASG:
				return asg != null && !asg.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__WYE:
				return wye != null && !wye.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__DP_STATUS:
				return dpStatus != null && !dpStatus.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__ANALOGUE_VALUE:
				return analogueValue != null && !analogueValue.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__CMV:
				return cmv != null && !cmv.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__VAL_WITH_TRANS:
				return valWithTrans != null && !valWithTrans.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__BS_CONTROL:
				return bsControl != null && !bsControl.isEmpty();
			case SubstationStandardPackage.SUBSTANDARD__VECTOR:
				return vector != null && !vector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstandardImpl
