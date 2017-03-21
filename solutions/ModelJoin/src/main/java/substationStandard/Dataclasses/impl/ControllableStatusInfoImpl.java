/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.ControllableStatusInfo;
import substationStandard.Dataclasses.CtlModels;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.Originator;
import substationStandard.Dataclasses.Quality;
import substationStandard.Dataclasses.SboClasses;
import substationStandard.Dataclasses.TimeStamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controllable Status Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getOperTm <em>Oper Tm</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getCtlNum <em>Ctl Num</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#isStSeld <em>St Seld</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getSubID <em>Sub ID</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getCtlModel <em>Ctl Model</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getSboTimeout <em>Sbo Timeout</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getSboClass <em>Sbo Class</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getD <em>D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ControllableStatusInfoImpl#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllableStatusInfoImpl extends MinimalEObjectImpl.Container implements ControllableStatusInfo {
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
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Originator origin;

	/**
	 * The default value of the '{@link #getCtlNum() <em>Ctl Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlNum()
	 * @generated
	 * @ordered
	 */
	protected static final int CTL_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCtlNum() <em>Ctl Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlNum()
	 * @generated
	 * @ordered
	 */
	protected int ctlNum = CTL_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isStSeld() <em>St Seld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStSeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ST_SELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStSeld() <em>St Seld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStSeld()
	 * @generated
	 * @ordered
	 */
	protected boolean stSeld = ST_SELD_EDEFAULT;

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
	 * The cached value of the '{@link #getCtlModel() <em>Ctl Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtlModel()
	 * @generated
	 * @ordered
	 */
	protected CtlModels ctlModel;

	/**
	 * The default value of the '{@link #getSboTimeout() <em>Sbo Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSboTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int SBO_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSboTimeout() <em>Sbo Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSboTimeout()
	 * @generated
	 * @ordered
	 */
	protected int sboTimeout = SBO_TIMEOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSboClass() <em>Sbo Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSboClass()
	 * @generated
	 * @ordered
	 */
	protected SboClasses sboClass;

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
	protected ControllableStatusInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.CONTROLLABLE_STATUS_INFO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CONTROLLABLE_STATUS_INFO__OPER_TM, oldOperTm, operTm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__OPER_TM, oldOperTm, operTm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CONTROLLABLE_STATUS_INFO__ORIGIN, oldOrigin, origin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCtlNum() {
		return ctlNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtlNum(int newCtlNum) {
		int oldCtlNum = ctlNum;
		ctlNum = newCtlNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_NUM, oldCtlNum, ctlNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStSeld() {
		return stSeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStSeld(boolean newStSeld) {
		boolean oldStSeld = stSeld;
		stSeld = newStSeld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__ST_SELD, oldStSeld, stSeld));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ENA, oldSubEna, subEna));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_Q, oldSubQ, subQ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_Q, oldSubQ, subQ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ID, oldSubID, subID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_MODEL, oldCtlModel, ctlModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_MODEL, oldCtlModel, ctlModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSboTimeout() {
		return sboTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSboTimeout(int newSboTimeout) {
		int oldSboTimeout = sboTimeout;
		sboTimeout = newSboTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT, oldSboTimeout, sboTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SboClasses getSboClass() {
		if (sboClass != null && sboClass.eIsProxy()) {
			InternalEObject oldSboClass = (InternalEObject)sboClass;
			sboClass = (SboClasses)eResolveProxy(oldSboClass);
			if (sboClass != oldSboClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_CLASS, oldSboClass, sboClass));
			}
		}
		return sboClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SboClasses basicGetSboClass() {
		return sboClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSboClass(SboClasses newSboClass) {
		SboClasses oldSboClass = sboClass;
		sboClass = newSboClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_CLASS, oldSboClass, sboClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__D, oldD, d));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CONTROLLABLE_STATUS_INFO__DU, oldDU, dU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__OPER_TM:
				if (resolve) return getOperTm();
				return basicGetOperTm();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_NUM:
				return getCtlNum();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ST_SELD:
				return isStSeld();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ENA:
				return isSubEna();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_Q:
				if (resolve) return getSubQ();
				return basicGetSubQ();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ID:
				return getSubID();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_MODEL:
				if (resolve) return getCtlModel();
				return basicGetCtlModel();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT:
				return getSboTimeout();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_CLASS:
				if (resolve) return getSboClass();
				return basicGetSboClass();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__D:
				return getD();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__DU:
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
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__OPER_TM:
				setOperTm((TimeStamp)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ORIGIN:
				setOrigin((Originator)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_NUM:
				setCtlNum((Integer)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ST_SELD:
				setStSeld((Boolean)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ENA:
				setSubEna((Boolean)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_Q:
				setSubQ((Quality)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ID:
				setSubID((String)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_MODEL:
				setCtlModel((CtlModels)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT:
				setSboTimeout((Integer)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_CLASS:
				setSboClass((SboClasses)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__D:
				setD((String)newValue);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__DU:
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
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__OPER_TM:
				setOperTm((TimeStamp)null);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ORIGIN:
				setOrigin((Originator)null);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_NUM:
				setCtlNum(CTL_NUM_EDEFAULT);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ST_SELD:
				setStSeld(ST_SELD_EDEFAULT);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ENA:
				setSubEna(SUB_ENA_EDEFAULT);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_Q:
				setSubQ((Quality)null);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ID:
				setSubID(SUB_ID_EDEFAULT);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_MODEL:
				setCtlModel((CtlModels)null);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT:
				setSboTimeout(SBO_TIMEOUT_EDEFAULT);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_CLASS:
				setSboClass((SboClasses)null);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__D:
				setD(D_EDEFAULT);
				return;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__DU:
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
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__OPER_TM:
				return operTm != null;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ORIGIN:
				return origin != null;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_NUM:
				return ctlNum != CTL_NUM_EDEFAULT;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__ST_SELD:
				return stSeld != ST_SELD_EDEFAULT;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ENA:
				return subEna != SUB_ENA_EDEFAULT;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_Q:
				return subQ != null;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SUB_ID:
				return SUB_ID_EDEFAULT == null ? subID != null : !SUB_ID_EDEFAULT.equals(subID);
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__CTL_MODEL:
				return ctlModel != null;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT:
				return sboTimeout != SBO_TIMEOUT_EDEFAULT;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__SBO_CLASS:
				return sboClass != null;
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO__DU:
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
		result.append(" (ctlNum: ");
		result.append(ctlNum);
		result.append(", stSeld: ");
		result.append(stSeld);
		result.append(", subEna: ");
		result.append(subEna);
		result.append(", subID: ");
		result.append(subID);
		result.append(", sboTimeout: ");
		result.append(sboTimeout);
		result.append(", d: ");
		result.append(d);
		result.append(", dU: ");
		result.append(dU);
		result.append(')');
		return result.toString();
	}

} //ControllableStatusInfoImpl
