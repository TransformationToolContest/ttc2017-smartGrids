/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.AnalogueValue;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.Range;
import gluemodel.substationStandard.Dataclasses.RangeConfig;
import gluemodel.substationStandard.Dataclasses.ScaledValueConfig;
import gluemodel.substationStandard.Dataclasses.TimeStamp;
import gluemodel.substationStandard.Dataclasses.Units;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getInstMag <em>Inst Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getMag <em>Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getRange <em>Range</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getSubMag <em>Sub Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getSubID <em>Sub ID</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getDb <em>Db</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getZeroDb <em>Zero Db</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getSVC <em>SVC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getRangeC <em>Range C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl#getSmpRate <em>Smp Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MVImpl extends MinimalEObjectImpl.Container implements MV {
	/**
	 * The cached value of the '{@link #getInstMag() <em>Inst Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue instMag;

	/**
	 * The cached value of the '{@link #getMag() <em>Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue mag;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Quality q;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected TimeStamp t;

	/**
	 * The default value of the '{@link #isSubEna() <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubEna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUB_ENA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubEna() <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubEna()
	 * @generated
	 * @ordered
	 */
	protected boolean subEna = SUB_ENA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubMag() <em>Sub Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue subMag;

	/**
	 * The cached value of the '{@link #getSubQ() <em>Sub Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubQ()
	 * @generated
	 * @ordered
	 */
	protected Quality subQ;

	/**
	 * The default value of the '{@link #getSubID() <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubID() <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubID()
	 * @generated
	 * @ordered
	 */
	protected String subID = SUB_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected Units units;

	/**
	 * The default value of the '{@link #getDb() <em>Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb()
	 * @generated
	 * @ordered
	 */
	protected static final int DB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDb() <em>Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb()
	 * @generated
	 * @ordered
	 */
	protected int db = DB_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeroDb() <em>Zero Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroDb()
	 * @generated
	 * @ordered
	 */
	protected static final int ZERO_DB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZeroDb() <em>Zero Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroDb()
	 * @generated
	 * @ordered
	 */
	protected int zeroDb = ZERO_DB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVC() <em>SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVC()
	 * @generated
	 * @ordered
	 */
	protected ScaledValueConfig sVC;

	/**
	 * The cached value of the '{@link #getRangeC() <em>Range C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeC()
	 * @generated
	 * @ordered
	 */
	protected RangeConfig rangeC;

	/**
	 * The default value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected static final int SMP_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected int smpRate = SMP_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.MV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getInstMag() {
		if (instMag != null && instMag.eIsProxy()) {
			InternalEObject oldInstMag = (InternalEObject)instMag;
			instMag = (AnalogueValue)eResolveProxy(oldInstMag);
			if (instMag != oldInstMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__INST_MAG, oldInstMag, instMag));
			}
		}
		return instMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetInstMag() {
		return instMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstMag(AnalogueValue newInstMag) {
		AnalogueValue oldInstMag = instMag;
		instMag = newInstMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__INST_MAG, oldInstMag, instMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMag() {
		if (mag != null && mag.eIsProxy()) {
			InternalEObject oldMag = (InternalEObject)mag;
			mag = (AnalogueValue)eResolveProxy(oldMag);
			if (mag != oldMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__MAG, oldMag, mag));
			}
		}
		return mag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMag() {
		return mag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMag(AnalogueValue newMag) {
		AnalogueValue oldMag = mag;
		mag = newMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__MAG, oldMag, mag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (Range)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality getQ() {
		if (q != null && q.eIsProxy()) {
			InternalEObject oldQ = (InternalEObject)q;
			q = (Quality)eResolveProxy(oldQ);
			if (q != oldQ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__Q, oldQ, q));
			}
		}
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality basicGetQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(Quality newQ) {
		Quality oldQ = q;
		q = newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp getT() {
		if (t != null && t.eIsProxy()) {
			InternalEObject oldT = (InternalEObject)t;
			t = (TimeStamp)eResolveProxy(oldT);
			if (t != oldT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__T, oldT, t));
			}
		}
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp basicGetT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT(TimeStamp newT) {
		TimeStamp oldT = t;
		t = newT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubEna() {
		return subEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubEna(boolean newSubEna) {
		boolean oldSubEna = subEna;
		subEna = newSubEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__SUB_ENA, oldSubEna, subEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getSubMag() {
		if (subMag != null && subMag.eIsProxy()) {
			InternalEObject oldSubMag = (InternalEObject)subMag;
			subMag = (AnalogueValue)eResolveProxy(oldSubMag);
			if (subMag != oldSubMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__SUB_MAG, oldSubMag, subMag));
			}
		}
		return subMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetSubMag() {
		return subMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubMag(AnalogueValue newSubMag) {
		AnalogueValue oldSubMag = subMag;
		subMag = newSubMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__SUB_MAG, oldSubMag, subMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality getSubQ() {
		if (subQ != null && subQ.eIsProxy()) {
			InternalEObject oldSubQ = (InternalEObject)subQ;
			subQ = (Quality)eResolveProxy(oldSubQ);
			if (subQ != oldSubQ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__SUB_Q, oldSubQ, subQ));
			}
		}
		return subQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality basicGetSubQ() {
		return subQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubQ(Quality newSubQ) {
		Quality oldSubQ = subQ;
		subQ = newSubQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__SUB_Q, oldSubQ, subQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubID() {
		return subID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubID(String newSubID) {
		String oldSubID = subID;
		subID = newSubID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__SUB_ID, oldSubID, subID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getUnits() {
		if (units != null && units.eIsProxy()) {
			InternalEObject oldUnits = (InternalEObject)units;
			units = (Units)eResolveProxy(oldUnits);
			if (units != oldUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__UNITS, oldUnits, units));
			}
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units basicGetUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(Units newUnits) {
		Units oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDb() {
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDb(int newDb) {
		int oldDb = db;
		db = newDb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__DB, oldDb, db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZeroDb() {
		return zeroDb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroDb(int newZeroDb) {
		int oldZeroDb = zeroDb;
		zeroDb = newZeroDb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__ZERO_DB, oldZeroDb, zeroDb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig getSVC() {
		if (sVC != null && sVC.eIsProxy()) {
			InternalEObject oldSVC = (InternalEObject)sVC;
			sVC = (ScaledValueConfig)eResolveProxy(oldSVC);
			if (sVC != oldSVC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__SVC, oldSVC, sVC));
			}
		}
		return sVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig basicGetSVC() {
		return sVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSVC(ScaledValueConfig newSVC) {
		ScaledValueConfig oldSVC = sVC;
		sVC = newSVC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__SVC, oldSVC, sVC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConfig getRangeC() {
		if (rangeC != null && rangeC.eIsProxy()) {
			InternalEObject oldRangeC = (InternalEObject)rangeC;
			rangeC = (RangeConfig)eResolveProxy(oldRangeC);
			if (rangeC != oldRangeC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.MV__RANGE_C, oldRangeC, rangeC));
			}
		}
		return rangeC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConfig basicGetRangeC() {
		return rangeC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeC(RangeConfig newRangeC) {
		RangeConfig oldRangeC = rangeC;
		rangeC = newRangeC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__RANGE_C, oldRangeC, rangeC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSmpRate() {
		return smpRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpRate(int newSmpRate) {
		int oldSmpRate = smpRate;
		smpRate = newSmpRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.MV__SMP_RATE, oldSmpRate, smpRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.MV__INST_MAG:
				if (resolve) return getInstMag();
				return basicGetInstMag();
			case DataclassesPackage.MV__MAG:
				if (resolve) return getMag();
				return basicGetMag();
			case DataclassesPackage.MV__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case DataclassesPackage.MV__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.MV__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.MV__SUB_ENA:
				return isSubEna();
			case DataclassesPackage.MV__SUB_MAG:
				if (resolve) return getSubMag();
				return basicGetSubMag();
			case DataclassesPackage.MV__SUB_Q:
				if (resolve) return getSubQ();
				return basicGetSubQ();
			case DataclassesPackage.MV__SUB_ID:
				return getSubID();
			case DataclassesPackage.MV__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.MV__DB:
				return getDb();
			case DataclassesPackage.MV__ZERO_DB:
				return getZeroDb();
			case DataclassesPackage.MV__SVC:
				if (resolve) return getSVC();
				return basicGetSVC();
			case DataclassesPackage.MV__RANGE_C:
				if (resolve) return getRangeC();
				return basicGetRangeC();
			case DataclassesPackage.MV__SMP_RATE:
				return getSmpRate();
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
			case DataclassesPackage.MV__INST_MAG:
				setInstMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.MV__MAG:
				setMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.MV__RANGE:
				setRange((Range)newValue);
				return;
			case DataclassesPackage.MV__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.MV__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.MV__SUB_ENA:
				setSubEna((Boolean)newValue);
				return;
			case DataclassesPackage.MV__SUB_MAG:
				setSubMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.MV__SUB_Q:
				setSubQ((Quality)newValue);
				return;
			case DataclassesPackage.MV__SUB_ID:
				setSubID((String)newValue);
				return;
			case DataclassesPackage.MV__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.MV__DB:
				setDb((Integer)newValue);
				return;
			case DataclassesPackage.MV__ZERO_DB:
				setZeroDb((Integer)newValue);
				return;
			case DataclassesPackage.MV__SVC:
				setSVC((ScaledValueConfig)newValue);
				return;
			case DataclassesPackage.MV__RANGE_C:
				setRangeC((RangeConfig)newValue);
				return;
			case DataclassesPackage.MV__SMP_RATE:
				setSmpRate((Integer)newValue);
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
			case DataclassesPackage.MV__INST_MAG:
				setInstMag((AnalogueValue)null);
				return;
			case DataclassesPackage.MV__MAG:
				setMag((AnalogueValue)null);
				return;
			case DataclassesPackage.MV__RANGE:
				setRange((Range)null);
				return;
			case DataclassesPackage.MV__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.MV__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.MV__SUB_ENA:
				setSubEna(SUB_ENA_EDEFAULT);
				return;
			case DataclassesPackage.MV__SUB_MAG:
				setSubMag((AnalogueValue)null);
				return;
			case DataclassesPackage.MV__SUB_Q:
				setSubQ((Quality)null);
				return;
			case DataclassesPackage.MV__SUB_ID:
				setSubID(SUB_ID_EDEFAULT);
				return;
			case DataclassesPackage.MV__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.MV__DB:
				setDb(DB_EDEFAULT);
				return;
			case DataclassesPackage.MV__ZERO_DB:
				setZeroDb(ZERO_DB_EDEFAULT);
				return;
			case DataclassesPackage.MV__SVC:
				setSVC((ScaledValueConfig)null);
				return;
			case DataclassesPackage.MV__RANGE_C:
				setRangeC((RangeConfig)null);
				return;
			case DataclassesPackage.MV__SMP_RATE:
				setSmpRate(SMP_RATE_EDEFAULT);
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
			case DataclassesPackage.MV__INST_MAG:
				return instMag != null;
			case DataclassesPackage.MV__MAG:
				return mag != null;
			case DataclassesPackage.MV__RANGE:
				return range != null;
			case DataclassesPackage.MV__Q:
				return q != null;
			case DataclassesPackage.MV__T:
				return t != null;
			case DataclassesPackage.MV__SUB_ENA:
				return subEna != SUB_ENA_EDEFAULT;
			case DataclassesPackage.MV__SUB_MAG:
				return subMag != null;
			case DataclassesPackage.MV__SUB_Q:
				return subQ != null;
			case DataclassesPackage.MV__SUB_ID:
				return SUB_ID_EDEFAULT == null ? subID != null : !SUB_ID_EDEFAULT.equals(subID);
			case DataclassesPackage.MV__UNITS:
				return units != null;
			case DataclassesPackage.MV__DB:
				return db != DB_EDEFAULT;
			case DataclassesPackage.MV__ZERO_DB:
				return zeroDb != ZERO_DB_EDEFAULT;
			case DataclassesPackage.MV__SVC:
				return sVC != null;
			case DataclassesPackage.MV__RANGE_C:
				return rangeC != null;
			case DataclassesPackage.MV__SMP_RATE:
				return smpRate != SMP_RATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (subEna: ");
		result.append(subEna);
		result.append(", subID: ");
		result.append(subID);
		result.append(", db: ");
		result.append(db);
		result.append(", zeroDb: ");
		result.append(zeroDb);
		result.append(", smpRate: ");
		result.append(smpRate);
		result.append(')');
		return result.toString();
	}

} //MVImpl
