/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.CMV;
import gluemodel.substationStandard.Dataclasses.CMVAngleReference;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.Range;
import gluemodel.substationStandard.Dataclasses.RangeConfig;
import gluemodel.substationStandard.Dataclasses.ScaledValueConfig;
import gluemodel.substationStandard.Dataclasses.TimeStamp;
import gluemodel.substationStandard.Dataclasses.Units;
import gluemodel.substationStandard.Dataclasses.Vector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getInstCVal <em>Inst CVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getCVal <em>CVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getRange <em>Range</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getSubCVal <em>Sub CVal</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getSubID <em>Sub ID</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getDb <em>Db</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getZeroDb <em>Zero Db</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getRangeC <em>Range C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getMagSVC <em>Mag SVC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getAngSVC <em>Ang SVC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getAngRef <em>Ang Ref</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl#getSmpRate <em>Smp Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMVImpl extends MinimalEObjectImpl.Container implements CMV {
	/**
	 * The cached value of the '{@link #getInstCVal() <em>Inst CVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstCVal()
	 * @generated
	 * @ordered
	 */
	protected Vector instCVal;

	/**
	 * The cached value of the '{@link #getCVal() <em>CVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVal()
	 * @generated
	 * @ordered
	 */
	protected Vector cVal;

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
	 * The cached value of the '{@link #getSubCVal() <em>Sub CVal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCVal()
	 * @generated
	 * @ordered
	 */
	protected Vector subCVal;

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
	 * The cached value of the '{@link #getRangeC() <em>Range C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeC()
	 * @generated
	 * @ordered
	 */
	protected RangeConfig rangeC;

	/**
	 * The cached value of the '{@link #getMagSVC() <em>Mag SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagSVC()
	 * @generated
	 * @ordered
	 */
	protected ScaledValueConfig magSVC;

	/**
	 * The cached value of the '{@link #getAngSVC() <em>Ang SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngSVC()
	 * @generated
	 * @ordered
	 */
	protected ScaledValueConfig angSVC;

	/**
	 * The cached value of the '{@link #getAngRef() <em>Ang Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngRef()
	 * @generated
	 * @ordered
	 */
	protected CMVAngleReference angRef;

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
	protected CMVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.CMV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector getInstCVal() {
		if (instCVal != null && instCVal.eIsProxy()) {
			InternalEObject oldInstCVal = (InternalEObject)instCVal;
			instCVal = (Vector)eResolveProxy(oldInstCVal);
			if (instCVal != oldInstCVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__INST_CVAL, oldInstCVal, instCVal));
			}
		}
		return instCVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector basicGetInstCVal() {
		return instCVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstCVal(Vector newInstCVal) {
		Vector oldInstCVal = instCVal;
		instCVal = newInstCVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__INST_CVAL, oldInstCVal, instCVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector getCVal() {
		if (cVal != null && cVal.eIsProxy()) {
			InternalEObject oldCVal = (InternalEObject)cVal;
			cVal = (Vector)eResolveProxy(oldCVal);
			if (cVal != oldCVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__CVAL, oldCVal, cVal));
			}
		}
		return cVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector basicGetCVal() {
		return cVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVal(Vector newCVal) {
		Vector oldCVal = cVal;
		cVal = newCVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__CVAL, oldCVal, cVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__RANGE, oldRange, range));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__RANGE, oldRange, range));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__SUB_ENA, oldSubEna, subEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector getSubCVal() {
		if (subCVal != null && subCVal.eIsProxy()) {
			InternalEObject oldSubCVal = (InternalEObject)subCVal;
			subCVal = (Vector)eResolveProxy(oldSubCVal);
			if (subCVal != oldSubCVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__SUB_CVAL, oldSubCVal, subCVal));
			}
		}
		return subCVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector basicGetSubCVal() {
		return subCVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCVal(Vector newSubCVal) {
		Vector oldSubCVal = subCVal;
		subCVal = newSubCVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__SUB_CVAL, oldSubCVal, subCVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__SUB_Q, oldSubQ, subQ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__SUB_Q, oldSubQ, subQ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__SUB_ID, oldSubID, subID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__DB, oldDb, db));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__ZERO_DB, oldZeroDb, zeroDb));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__RANGE_C, oldRangeC, rangeC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__RANGE_C, oldRangeC, rangeC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig getMagSVC() {
		if (magSVC != null && magSVC.eIsProxy()) {
			InternalEObject oldMagSVC = (InternalEObject)magSVC;
			magSVC = (ScaledValueConfig)eResolveProxy(oldMagSVC);
			if (magSVC != oldMagSVC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__MAG_SVC, oldMagSVC, magSVC));
			}
		}
		return magSVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig basicGetMagSVC() {
		return magSVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagSVC(ScaledValueConfig newMagSVC) {
		ScaledValueConfig oldMagSVC = magSVC;
		magSVC = newMagSVC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__MAG_SVC, oldMagSVC, magSVC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig getAngSVC() {
		if (angSVC != null && angSVC.eIsProxy()) {
			InternalEObject oldAngSVC = (InternalEObject)angSVC;
			angSVC = (ScaledValueConfig)eResolveProxy(oldAngSVC);
			if (angSVC != oldAngSVC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__ANG_SVC, oldAngSVC, angSVC));
			}
		}
		return angSVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig basicGetAngSVC() {
		return angSVC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngSVC(ScaledValueConfig newAngSVC) {
		ScaledValueConfig oldAngSVC = angSVC;
		angSVC = newAngSVC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__ANG_SVC, oldAngSVC, angSVC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMVAngleReference getAngRef() {
		if (angRef != null && angRef.eIsProxy()) {
			InternalEObject oldAngRef = (InternalEObject)angRef;
			angRef = (CMVAngleReference)eResolveProxy(oldAngRef);
			if (angRef != oldAngRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CMV__ANG_REF, oldAngRef, angRef));
			}
		}
		return angRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMVAngleReference basicGetAngRef() {
		return angRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngRef(CMVAngleReference newAngRef) {
		CMVAngleReference oldAngRef = angRef;
		angRef = newAngRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__ANG_REF, oldAngRef, angRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CMV__SMP_RATE, oldSmpRate, smpRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.CMV__INST_CVAL:
				if (resolve) return getInstCVal();
				return basicGetInstCVal();
			case DataclassesPackage.CMV__CVAL:
				if (resolve) return getCVal();
				return basicGetCVal();
			case DataclassesPackage.CMV__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case DataclassesPackage.CMV__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.CMV__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.CMV__SUB_ENA:
				return isSubEna();
			case DataclassesPackage.CMV__SUB_CVAL:
				if (resolve) return getSubCVal();
				return basicGetSubCVal();
			case DataclassesPackage.CMV__SUB_Q:
				if (resolve) return getSubQ();
				return basicGetSubQ();
			case DataclassesPackage.CMV__SUB_ID:
				return getSubID();
			case DataclassesPackage.CMV__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.CMV__DB:
				return getDb();
			case DataclassesPackage.CMV__ZERO_DB:
				return getZeroDb();
			case DataclassesPackage.CMV__RANGE_C:
				if (resolve) return getRangeC();
				return basicGetRangeC();
			case DataclassesPackage.CMV__MAG_SVC:
				if (resolve) return getMagSVC();
				return basicGetMagSVC();
			case DataclassesPackage.CMV__ANG_SVC:
				if (resolve) return getAngSVC();
				return basicGetAngSVC();
			case DataclassesPackage.CMV__ANG_REF:
				if (resolve) return getAngRef();
				return basicGetAngRef();
			case DataclassesPackage.CMV__SMP_RATE:
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
			case DataclassesPackage.CMV__INST_CVAL:
				setInstCVal((Vector)newValue);
				return;
			case DataclassesPackage.CMV__CVAL:
				setCVal((Vector)newValue);
				return;
			case DataclassesPackage.CMV__RANGE:
				setRange((Range)newValue);
				return;
			case DataclassesPackage.CMV__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.CMV__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.CMV__SUB_ENA:
				setSubEna((Boolean)newValue);
				return;
			case DataclassesPackage.CMV__SUB_CVAL:
				setSubCVal((Vector)newValue);
				return;
			case DataclassesPackage.CMV__SUB_Q:
				setSubQ((Quality)newValue);
				return;
			case DataclassesPackage.CMV__SUB_ID:
				setSubID((String)newValue);
				return;
			case DataclassesPackage.CMV__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.CMV__DB:
				setDb((Integer)newValue);
				return;
			case DataclassesPackage.CMV__ZERO_DB:
				setZeroDb((Integer)newValue);
				return;
			case DataclassesPackage.CMV__RANGE_C:
				setRangeC((RangeConfig)newValue);
				return;
			case DataclassesPackage.CMV__MAG_SVC:
				setMagSVC((ScaledValueConfig)newValue);
				return;
			case DataclassesPackage.CMV__ANG_SVC:
				setAngSVC((ScaledValueConfig)newValue);
				return;
			case DataclassesPackage.CMV__ANG_REF:
				setAngRef((CMVAngleReference)newValue);
				return;
			case DataclassesPackage.CMV__SMP_RATE:
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
			case DataclassesPackage.CMV__INST_CVAL:
				setInstCVal((Vector)null);
				return;
			case DataclassesPackage.CMV__CVAL:
				setCVal((Vector)null);
				return;
			case DataclassesPackage.CMV__RANGE:
				setRange((Range)null);
				return;
			case DataclassesPackage.CMV__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.CMV__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.CMV__SUB_ENA:
				setSubEna(SUB_ENA_EDEFAULT);
				return;
			case DataclassesPackage.CMV__SUB_CVAL:
				setSubCVal((Vector)null);
				return;
			case DataclassesPackage.CMV__SUB_Q:
				setSubQ((Quality)null);
				return;
			case DataclassesPackage.CMV__SUB_ID:
				setSubID(SUB_ID_EDEFAULT);
				return;
			case DataclassesPackage.CMV__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.CMV__DB:
				setDb(DB_EDEFAULT);
				return;
			case DataclassesPackage.CMV__ZERO_DB:
				setZeroDb(ZERO_DB_EDEFAULT);
				return;
			case DataclassesPackage.CMV__RANGE_C:
				setRangeC((RangeConfig)null);
				return;
			case DataclassesPackage.CMV__MAG_SVC:
				setMagSVC((ScaledValueConfig)null);
				return;
			case DataclassesPackage.CMV__ANG_SVC:
				setAngSVC((ScaledValueConfig)null);
				return;
			case DataclassesPackage.CMV__ANG_REF:
				setAngRef((CMVAngleReference)null);
				return;
			case DataclassesPackage.CMV__SMP_RATE:
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
			case DataclassesPackage.CMV__INST_CVAL:
				return instCVal != null;
			case DataclassesPackage.CMV__CVAL:
				return cVal != null;
			case DataclassesPackage.CMV__RANGE:
				return range != null;
			case DataclassesPackage.CMV__Q:
				return q != null;
			case DataclassesPackage.CMV__T:
				return t != null;
			case DataclassesPackage.CMV__SUB_ENA:
				return subEna != SUB_ENA_EDEFAULT;
			case DataclassesPackage.CMV__SUB_CVAL:
				return subCVal != null;
			case DataclassesPackage.CMV__SUB_Q:
				return subQ != null;
			case DataclassesPackage.CMV__SUB_ID:
				return SUB_ID_EDEFAULT == null ? subID != null : !SUB_ID_EDEFAULT.equals(subID);
			case DataclassesPackage.CMV__UNITS:
				return units != null;
			case DataclassesPackage.CMV__DB:
				return db != DB_EDEFAULT;
			case DataclassesPackage.CMV__ZERO_DB:
				return zeroDb != ZERO_DB_EDEFAULT;
			case DataclassesPackage.CMV__RANGE_C:
				return rangeC != null;
			case DataclassesPackage.CMV__MAG_SVC:
				return magSVC != null;
			case DataclassesPackage.CMV__ANG_SVC:
				return angSVC != null;
			case DataclassesPackage.CMV__ANG_REF:
				return angRef != null;
			case DataclassesPackage.CMV__SMP_RATE:
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

} //CMVImpl
