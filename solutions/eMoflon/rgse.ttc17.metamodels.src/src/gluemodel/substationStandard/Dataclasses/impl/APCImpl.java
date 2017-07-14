/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.APC;
import gluemodel.substationStandard.Dataclasses.AnalogueValue;
import gluemodel.substationStandard.Dataclasses.CtlModels;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.Originator;
import gluemodel.substationStandard.Dataclasses.Quality;
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
 * An implementation of the model object '<em><b>APC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getSetMag <em>Set Mag</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getOperTm <em>Oper Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getT <em>T</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getCtlModel <em>Ctl Model</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getSVC <em>SVC</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getD <em>D</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APCImpl extends MinimalEObjectImpl.Container implements APC {
	/**
	 * The cached value of the '{@link #getSetMag() <em>Set Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMag()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue setMag;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Originator origin;

	/**
	 * The cached value of the '{@link #getOperTm() <em>Oper Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperTm()
	 * @generated
	 * @ordered
	 */
	protected TimeStamp operTm;

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
	 * The cached value of the '{@link #getCtlModel() <em>Ctl Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlModel()
	 * @generated
	 * @ordered
	 */
	protected CtlModels ctlModel;

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
	 * The cached value of the '{@link #getSVC() <em>SVC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVC()
	 * @generated
	 * @ordered
	 */
	protected ScaledValueConfig sVC;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue minVal;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue maxVal;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected AnalogueValue stepSize;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getDU() <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDU()
	 * @generated
	 * @ordered
	 */
	protected static final String DU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDU() <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDU()
	 * @generated
	 * @ordered
	 */
	protected String dU = DU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.APC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getSetMag() {
		if (setMag != null && setMag.eIsProxy()) {
			InternalEObject oldSetMag = (InternalEObject)setMag;
			setMag = (AnalogueValue)eResolveProxy(oldSetMag);
			if (setMag != oldSetMag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__SET_MAG, oldSetMag, setMag));
			}
		}
		return setMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetSetMag() {
		return setMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMag(AnalogueValue newSetMag) {
		AnalogueValue oldSetMag = setMag;
		setMag = newSetMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__SET_MAG, oldSetMag, setMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Originator getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Originator)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Originator basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Originator newOrigin) {
		Originator oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp getOperTm() {
		if (operTm != null && operTm.eIsProxy()) {
			InternalEObject oldOperTm = (InternalEObject)operTm;
			operTm = (TimeStamp)eResolveProxy(oldOperTm);
			if (operTm != oldOperTm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__OPER_TM, oldOperTm, operTm));
			}
		}
		return operTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp basicGetOperTm() {
		return operTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperTm(TimeStamp newOperTm) {
		TimeStamp oldOperTm = operTm;
		operTm = newOperTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__OPER_TM, oldOperTm, operTm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__Q, oldQ, q));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__T, oldT, t));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlModels getCtlModel() {
		if (ctlModel != null && ctlModel.eIsProxy()) {
			InternalEObject oldCtlModel = (InternalEObject)ctlModel;
			ctlModel = (CtlModels)eResolveProxy(oldCtlModel);
			if (ctlModel != oldCtlModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__CTL_MODEL, oldCtlModel, ctlModel));
			}
		}
		return ctlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlModels basicGetCtlModel() {
		return ctlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtlModel(CtlModels newCtlModel) {
		CtlModels oldCtlModel = ctlModel;
		ctlModel = newCtlModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__CTL_MODEL, oldCtlModel, ctlModel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__UNITS, oldUnits, units));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__SVC, oldSVC, sVC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__SVC, oldSVC, sVC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMinVal() {
		if (minVal != null && minVal.eIsProxy()) {
			InternalEObject oldMinVal = (InternalEObject)minVal;
			minVal = (AnalogueValue)eResolveProxy(oldMinVal);
			if (minVal != oldMinVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__MIN_VAL, oldMinVal, minVal));
			}
		}
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(AnalogueValue newMinVal) {
		AnalogueValue oldMinVal = minVal;
		minVal = newMinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__MIN_VAL, oldMinVal, minVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getMaxVal() {
		if (maxVal != null && maxVal.eIsProxy()) {
			InternalEObject oldMaxVal = (InternalEObject)maxVal;
			maxVal = (AnalogueValue)eResolveProxy(oldMaxVal);
			if (maxVal != oldMaxVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__MAX_VAL, oldMaxVal, maxVal));
			}
		}
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(AnalogueValue newMaxVal) {
		AnalogueValue oldMaxVal = maxVal;
		maxVal = newMaxVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__MAX_VAL, oldMaxVal, maxVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue getStepSize() {
		if (stepSize != null && stepSize.eIsProxy()) {
			InternalEObject oldStepSize = (InternalEObject)stepSize;
			stepSize = (AnalogueValue)eResolveProxy(oldStepSize);
			if (stepSize != oldStepSize) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.APC__STEP_SIZE, oldStepSize, stepSize));
			}
		}
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue basicGetStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSize(AnalogueValue newStepSize) {
		AnalogueValue oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDU() {
		return dU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDU(String newDU) {
		String oldDU = dU;
		dU = newDU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.APC__DU, oldDU, dU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.APC__SET_MAG:
				if (resolve) return getSetMag();
				return basicGetSetMag();
			case DataclassesPackage.APC__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case DataclassesPackage.APC__OPER_TM:
				if (resolve) return getOperTm();
				return basicGetOperTm();
			case DataclassesPackage.APC__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.APC__T:
				if (resolve) return getT();
				return basicGetT();
			case DataclassesPackage.APC__CTL_MODEL:
				if (resolve) return getCtlModel();
				return basicGetCtlModel();
			case DataclassesPackage.APC__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.APC__SVC:
				if (resolve) return getSVC();
				return basicGetSVC();
			case DataclassesPackage.APC__MIN_VAL:
				if (resolve) return getMinVal();
				return basicGetMinVal();
			case DataclassesPackage.APC__MAX_VAL:
				if (resolve) return getMaxVal();
				return basicGetMaxVal();
			case DataclassesPackage.APC__STEP_SIZE:
				if (resolve) return getStepSize();
				return basicGetStepSize();
			case DataclassesPackage.APC__D:
				return getD();
			case DataclassesPackage.APC__DU:
				return getDU();
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
			case DataclassesPackage.APC__SET_MAG:
				setSetMag((AnalogueValue)newValue);
				return;
			case DataclassesPackage.APC__ORIGIN:
				setOrigin((Originator)newValue);
				return;
			case DataclassesPackage.APC__OPER_TM:
				setOperTm((TimeStamp)newValue);
				return;
			case DataclassesPackage.APC__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.APC__T:
				setT((TimeStamp)newValue);
				return;
			case DataclassesPackage.APC__CTL_MODEL:
				setCtlModel((CtlModels)newValue);
				return;
			case DataclassesPackage.APC__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.APC__SVC:
				setSVC((ScaledValueConfig)newValue);
				return;
			case DataclassesPackage.APC__MIN_VAL:
				setMinVal((AnalogueValue)newValue);
				return;
			case DataclassesPackage.APC__MAX_VAL:
				setMaxVal((AnalogueValue)newValue);
				return;
			case DataclassesPackage.APC__STEP_SIZE:
				setStepSize((AnalogueValue)newValue);
				return;
			case DataclassesPackage.APC__D:
				setD((String)newValue);
				return;
			case DataclassesPackage.APC__DU:
				setDU((String)newValue);
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
			case DataclassesPackage.APC__SET_MAG:
				setSetMag((AnalogueValue)null);
				return;
			case DataclassesPackage.APC__ORIGIN:
				setOrigin((Originator)null);
				return;
			case DataclassesPackage.APC__OPER_TM:
				setOperTm((TimeStamp)null);
				return;
			case DataclassesPackage.APC__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.APC__T:
				setT((TimeStamp)null);
				return;
			case DataclassesPackage.APC__CTL_MODEL:
				setCtlModel((CtlModels)null);
				return;
			case DataclassesPackage.APC__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.APC__SVC:
				setSVC((ScaledValueConfig)null);
				return;
			case DataclassesPackage.APC__MIN_VAL:
				setMinVal((AnalogueValue)null);
				return;
			case DataclassesPackage.APC__MAX_VAL:
				setMaxVal((AnalogueValue)null);
				return;
			case DataclassesPackage.APC__STEP_SIZE:
				setStepSize((AnalogueValue)null);
				return;
			case DataclassesPackage.APC__D:
				setD(D_EDEFAULT);
				return;
			case DataclassesPackage.APC__DU:
				setDU(DU_EDEFAULT);
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
			case DataclassesPackage.APC__SET_MAG:
				return setMag != null;
			case DataclassesPackage.APC__ORIGIN:
				return origin != null;
			case DataclassesPackage.APC__OPER_TM:
				return operTm != null;
			case DataclassesPackage.APC__Q:
				return q != null;
			case DataclassesPackage.APC__T:
				return t != null;
			case DataclassesPackage.APC__CTL_MODEL:
				return ctlModel != null;
			case DataclassesPackage.APC__UNITS:
				return units != null;
			case DataclassesPackage.APC__SVC:
				return sVC != null;
			case DataclassesPackage.APC__MIN_VAL:
				return minVal != null;
			case DataclassesPackage.APC__MAX_VAL:
				return maxVal != null;
			case DataclassesPackage.APC__STEP_SIZE:
				return stepSize != null;
			case DataclassesPackage.APC__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case DataclassesPackage.APC__DU:
				return DU_EDEFAULT == null ? dU != null : !DU_EDEFAULT.equals(dU);
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
		result.append(" (d: ");
		result.append(d);
		result.append(", dU: ");
		result.append(dU);
		result.append(')');
		return result.toString();
	}

} //APCImpl
