/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;

import gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getVol <em>Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getVolChgRte <em>Vol Chg Rte</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getAmp <em>Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getBatTest <em>Bat Test</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getTestRsl <em>Test Rsl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getBatHi <em>Bat Hi</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getBatLo <em>Bat Lo</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getLoBatVal <em>Lo Bat Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl#getHiBatVal <em>Hi Bat Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBATImpl extends GroupZImpl implements ZBAT {
	/**
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected MV opTmh;

	/**
	 * The cached value of the '{@link #getVol() <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected MV vol;

	/**
	 * The cached value of the '{@link #getVolChgRte() <em>Vol Chg Rte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolChgRte()
	 * @generated
	 * @ordered
	 */
	protected MV volChgRte;

	/**
	 * The cached value of the '{@link #getAmp() <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp()
	 * @generated
	 * @ordered
	 */
	protected MV amp;

	/**
	 * The cached value of the '{@link #getBatTest() <em>Bat Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatTest()
	 * @generated
	 * @ordered
	 */
	protected SPC batTest;

	/**
	 * The cached value of the '{@link #getTestRsl() <em>Test Rsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRsl()
	 * @generated
	 * @ordered
	 */
	protected SPC testRsl;

	/**
	 * The cached value of the '{@link #getBatHi() <em>Bat Hi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatHi()
	 * @generated
	 * @ordered
	 */
	protected SPC batHi;

	/**
	 * The cached value of the '{@link #getBatLo() <em>Bat Lo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatLo()
	 * @generated
	 * @ordered
	 */
	protected SPC batLo;

	/**
	 * The cached value of the '{@link #getLoBatVal() <em>Lo Bat Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoBatVal()
	 * @generated
	 * @ordered
	 */
	protected ASG loBatVal;

	/**
	 * The cached value of the '{@link #getHiBatVal() <em>Hi Bat Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiBatVal()
	 * @generated
	 * @ordered
	 */
	protected ASG hiBatVal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZBAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getOpTmh() {
		if (opTmh != null && opTmh.eIsProxy()) {
			InternalEObject oldOpTmh = (InternalEObject)opTmh;
			opTmh = (MV)eResolveProxy(oldOpTmh);
			if (opTmh != oldOpTmh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__OP_TMH, oldOpTmh, opTmh));
			}
		}
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetOpTmh() {
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTmh(MV newOpTmh) {
		MV oldOpTmh = opTmh;
		opTmh = newOpTmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVol() {
		if (vol != null && vol.eIsProxy()) {
			InternalEObject oldVol = (InternalEObject)vol;
			vol = (MV)eResolveProxy(oldVol);
			if (vol != oldVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__VOL, oldVol, vol));
			}
		}
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVol() {
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVol(MV newVol) {
		MV oldVol = vol;
		vol = newVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__VOL, oldVol, vol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVolChgRte() {
		if (volChgRte != null && volChgRte.eIsProxy()) {
			InternalEObject oldVolChgRte = (InternalEObject)volChgRte;
			volChgRte = (MV)eResolveProxy(oldVolChgRte);
			if (volChgRte != oldVolChgRte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__VOL_CHG_RTE, oldVolChgRte, volChgRte));
			}
		}
		return volChgRte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVolChgRte() {
		return volChgRte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolChgRte(MV newVolChgRte) {
		MV oldVolChgRte = volChgRte;
		volChgRte = newVolChgRte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__VOL_CHG_RTE, oldVolChgRte, volChgRte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAmp() {
		if (amp != null && amp.eIsProxy()) {
			InternalEObject oldAmp = (InternalEObject)amp;
			amp = (MV)eResolveProxy(oldAmp);
			if (amp != oldAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__AMP, oldAmp, amp));
			}
		}
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAmp() {
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp(MV newAmp) {
		MV oldAmp = amp;
		amp = newAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__AMP, oldAmp, amp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getBatTest() {
		if (batTest != null && batTest.eIsProxy()) {
			InternalEObject oldBatTest = (InternalEObject)batTest;
			batTest = (SPC)eResolveProxy(oldBatTest);
			if (batTest != oldBatTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__BAT_TEST, oldBatTest, batTest));
			}
		}
		return batTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetBatTest() {
		return batTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatTest(SPC newBatTest) {
		SPC oldBatTest = batTest;
		batTest = newBatTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__BAT_TEST, oldBatTest, batTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getTestRsl() {
		if (testRsl != null && testRsl.eIsProxy()) {
			InternalEObject oldTestRsl = (InternalEObject)testRsl;
			testRsl = (SPC)eResolveProxy(oldTestRsl);
			if (testRsl != oldTestRsl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__TEST_RSL, oldTestRsl, testRsl));
			}
		}
		return testRsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetTestRsl() {
		return testRsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestRsl(SPC newTestRsl) {
		SPC oldTestRsl = testRsl;
		testRsl = newTestRsl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__TEST_RSL, oldTestRsl, testRsl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getBatHi() {
		if (batHi != null && batHi.eIsProxy()) {
			InternalEObject oldBatHi = (InternalEObject)batHi;
			batHi = (SPC)eResolveProxy(oldBatHi);
			if (batHi != oldBatHi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__BAT_HI, oldBatHi, batHi));
			}
		}
		return batHi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetBatHi() {
		return batHi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatHi(SPC newBatHi) {
		SPC oldBatHi = batHi;
		batHi = newBatHi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__BAT_HI, oldBatHi, batHi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getBatLo() {
		if (batLo != null && batLo.eIsProxy()) {
			InternalEObject oldBatLo = (InternalEObject)batLo;
			batLo = (SPC)eResolveProxy(oldBatLo);
			if (batLo != oldBatLo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__BAT_LO, oldBatLo, batLo));
			}
		}
		return batLo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetBatLo() {
		return batLo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatLo(SPC newBatLo) {
		SPC oldBatLo = batLo;
		batLo = newBatLo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__BAT_LO, oldBatLo, batLo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLoBatVal() {
		if (loBatVal != null && loBatVal.eIsProxy()) {
			InternalEObject oldLoBatVal = (InternalEObject)loBatVal;
			loBatVal = (ASG)eResolveProxy(oldLoBatVal);
			if (loBatVal != oldLoBatVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__LO_BAT_VAL, oldLoBatVal, loBatVal));
			}
		}
		return loBatVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLoBatVal() {
		return loBatVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoBatVal(ASG newLoBatVal) {
		ASG oldLoBatVal = loBatVal;
		loBatVal = newLoBatVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__LO_BAT_VAL, oldLoBatVal, loBatVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getHiBatVal() {
		if (hiBatVal != null && hiBatVal.eIsProxy()) {
			InternalEObject oldHiBatVal = (InternalEObject)hiBatVal;
			hiBatVal = (ASG)eResolveProxy(oldHiBatVal);
			if (hiBatVal != oldHiBatVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBAT__HI_BAT_VAL, oldHiBatVal, hiBatVal));
			}
		}
		return hiBatVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetHiBatVal() {
		return hiBatVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiBatVal(ASG newHiBatVal) {
		ASG oldHiBatVal = hiBatVal;
		hiBatVal = newHiBatVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBAT__HI_BAT_VAL, oldHiBatVal, hiBatVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZBAT__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZBAT__VOL:
				if (resolve) return getVol();
				return basicGetVol();
			case LNGroupZPackage.ZBAT__VOL_CHG_RTE:
				if (resolve) return getVolChgRte();
				return basicGetVolChgRte();
			case LNGroupZPackage.ZBAT__AMP:
				if (resolve) return getAmp();
				return basicGetAmp();
			case LNGroupZPackage.ZBAT__BAT_TEST:
				if (resolve) return getBatTest();
				return basicGetBatTest();
			case LNGroupZPackage.ZBAT__TEST_RSL:
				if (resolve) return getTestRsl();
				return basicGetTestRsl();
			case LNGroupZPackage.ZBAT__BAT_HI:
				if (resolve) return getBatHi();
				return basicGetBatHi();
			case LNGroupZPackage.ZBAT__BAT_LO:
				if (resolve) return getBatLo();
				return basicGetBatLo();
			case LNGroupZPackage.ZBAT__LO_BAT_VAL:
				if (resolve) return getLoBatVal();
				return basicGetLoBatVal();
			case LNGroupZPackage.ZBAT__HI_BAT_VAL:
				if (resolve) return getHiBatVal();
				return basicGetHiBatVal();
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
			case LNGroupZPackage.ZBAT__OP_TMH:
				setOpTmh((MV)newValue);
				return;
			case LNGroupZPackage.ZBAT__VOL:
				setVol((MV)newValue);
				return;
			case LNGroupZPackage.ZBAT__VOL_CHG_RTE:
				setVolChgRte((MV)newValue);
				return;
			case LNGroupZPackage.ZBAT__AMP:
				setAmp((MV)newValue);
				return;
			case LNGroupZPackage.ZBAT__BAT_TEST:
				setBatTest((SPC)newValue);
				return;
			case LNGroupZPackage.ZBAT__TEST_RSL:
				setTestRsl((SPC)newValue);
				return;
			case LNGroupZPackage.ZBAT__BAT_HI:
				setBatHi((SPC)newValue);
				return;
			case LNGroupZPackage.ZBAT__BAT_LO:
				setBatLo((SPC)newValue);
				return;
			case LNGroupZPackage.ZBAT__LO_BAT_VAL:
				setLoBatVal((ASG)newValue);
				return;
			case LNGroupZPackage.ZBAT__HI_BAT_VAL:
				setHiBatVal((ASG)newValue);
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
			case LNGroupZPackage.ZBAT__OP_TMH:
				setOpTmh((MV)null);
				return;
			case LNGroupZPackage.ZBAT__VOL:
				setVol((MV)null);
				return;
			case LNGroupZPackage.ZBAT__VOL_CHG_RTE:
				setVolChgRte((MV)null);
				return;
			case LNGroupZPackage.ZBAT__AMP:
				setAmp((MV)null);
				return;
			case LNGroupZPackage.ZBAT__BAT_TEST:
				setBatTest((SPC)null);
				return;
			case LNGroupZPackage.ZBAT__TEST_RSL:
				setTestRsl((SPC)null);
				return;
			case LNGroupZPackage.ZBAT__BAT_HI:
				setBatHi((SPC)null);
				return;
			case LNGroupZPackage.ZBAT__BAT_LO:
				setBatLo((SPC)null);
				return;
			case LNGroupZPackage.ZBAT__LO_BAT_VAL:
				setLoBatVal((ASG)null);
				return;
			case LNGroupZPackage.ZBAT__HI_BAT_VAL:
				setHiBatVal((ASG)null);
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
			case LNGroupZPackage.ZBAT__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZBAT__VOL:
				return vol != null;
			case LNGroupZPackage.ZBAT__VOL_CHG_RTE:
				return volChgRte != null;
			case LNGroupZPackage.ZBAT__AMP:
				return amp != null;
			case LNGroupZPackage.ZBAT__BAT_TEST:
				return batTest != null;
			case LNGroupZPackage.ZBAT__TEST_RSL:
				return testRsl != null;
			case LNGroupZPackage.ZBAT__BAT_HI:
				return batHi != null;
			case LNGroupZPackage.ZBAT__BAT_LO:
				return batLo != null;
			case LNGroupZPackage.ZBAT__LO_BAT_VAL:
				return loBatVal != null;
			case LNGroupZPackage.ZBAT__HI_BAT_VAL:
				return hiBatVal != null;
		}
		return super.eIsSet(featureID);
	}

} //ZBATImpl
