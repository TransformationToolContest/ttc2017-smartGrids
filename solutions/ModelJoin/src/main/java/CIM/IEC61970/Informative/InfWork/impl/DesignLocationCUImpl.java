/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfWork.CUGroup;
import CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import CIM.IEC61970.Informative.InfWork.ConditionFactor;
import CIM.IEC61970.Informative.InfWork.Design;
import CIM.IEC61970.Informative.InfWork.DesignLocation;
import CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.WorkActionKind;
import CIM.IEC61970.Informative.InfWork.WorkTask;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Location CU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getRemovalDate <em>Removal Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getCuQuantity <em>Cu Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getCuAccount <em>Cu Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getCuAction <em>Cu Action</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#isEnergizationFlag <em>Energization Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getCUGroups <em>CU Groups</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.DesignLocationCUImpl#getCuUsage <em>Cu Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignLocationCUImpl extends IdentifiedObjectImpl implements DesignLocationCU {
	/**
	 * The cached value of the '{@link #getDesigns() <em>Designs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> designs;

	/**
	 * The default value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalDate()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalDate()
	 * @generated
	 * @ordered
	 */
	protected String removalDate = REMOVAL_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionFactors() <em>Condition Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionFactor> conditionFactors;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The default value of the '{@link #getCuQuantity() <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CU_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuQuantity() <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cuQuantity = CU_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCuAccount() <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String CU_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuAccount() <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAccount()
	 * @generated
	 * @ordered
	 */
	protected String cuAccount = CU_ACCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * The cached value of the '{@link #getDesignLocation() <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocation()
	 * @generated
	 * @ordered
	 */
	protected DesignLocation designLocation;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getCuAction() <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAction()
	 * @generated
	 * @ordered
	 */
	protected static final WorkActionKind CU_ACTION_EDEFAULT = WorkActionKind.ABANDON;

	/**
	 * The cached value of the '{@link #getCuAction() <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAction()
	 * @generated
	 * @ordered
	 */
	protected WorkActionKind cuAction = CU_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnergizationFlag() <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnergizationFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENERGIZATION_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnergizationFlag() <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnergizationFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean energizationFlag = ENERGIZATION_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCUGroups() <em>CU Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CUGroup> cuGroups;

	/**
	 * The default value of the '{@link #getCuUsage() <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String CU_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuUsage() <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuUsage()
	 * @generated
	 * @ordered
	 */
	protected String cuUsage = CU_USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignLocationCUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DESIGN_LOCATION_CU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new EObjectWithInverseResolvingEList.ManyInverse<Design>(Design.class, this, InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS, InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS);
		}
		return designs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemovalDate() {
		return removalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovalDate(String newRemovalDate) {
		String oldRemovalDate = removalDate;
		removalDate = newRemovalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE, oldRemovalDate, removalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionFactor> getConditionFactors() {
		if (conditionFactors == null) {
			conditionFactors = new EObjectWithInverseResolvingEList.ManyInverse<ConditionFactor>(ConditionFactor.class, this, InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS, InfWorkPackage.CONDITION_FACTOR__DESIGN_LOCATION_CUS);
		}
		return conditionFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList.ManyInverse<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS);
		}
		return compatibleUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCuQuantity() {
		return cuQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuQuantity(BigInteger newCuQuantity) {
		BigInteger oldCuQuantity = cuQuantity;
		cuQuantity = newCuQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY, oldCuQuantity, cuQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCuAccount() {
		return cuAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuAccount(String newCuAccount) {
		String oldCuAccount = cuAccount;
		cuAccount = newCuAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT, oldCuAccount, cuAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList.ManyInverse<WorkTask>(WorkTask.class, this, InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS, InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS);
		}
		return workTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation getDesignLocation() {
		if (designLocation != null && designLocation.eIsProxy()) {
			InternalEObject oldDesignLocation = (InternalEObject)designLocation;
			designLocation = (DesignLocation)eResolveProxy(oldDesignLocation);
			if (designLocation != oldDesignLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION, oldDesignLocation, designLocation));
			}
		}
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation basicGetDesignLocation() {
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLocation(DesignLocation newDesignLocation, NotificationChain msgs) {
		DesignLocation oldDesignLocation = designLocation;
		designLocation = newDesignLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION, oldDesignLocation, newDesignLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignLocation(DesignLocation newDesignLocation) {
		if (newDesignLocation != designLocation) {
			NotificationChain msgs = null;
			if (designLocation != null)
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION, newDesignLocation, newDesignLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.DESIGN_LOCATION_CU__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkActionKind getCuAction() {
		return cuAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuAction(WorkActionKind newCuAction) {
		WorkActionKind oldCuAction = cuAction;
		cuAction = newCuAction == null ? CU_ACTION_EDEFAULT : newCuAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION, oldCuAction, cuAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnergizationFlag() {
		return energizationFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergizationFlag(boolean newEnergizationFlag) {
		boolean oldEnergizationFlag = energizationFlag;
		energizationFlag = newEnergizationFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG, oldEnergizationFlag, energizationFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUGroup> getCUGroups() {
		if (cuGroups == null) {
			cuGroups = new EObjectWithInverseResolvingEList.ManyInverse<CUGroup>(CUGroup.class, this, InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS, InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS);
		}
		return cuGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCuUsage() {
		return cuUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuUsage(String newCuUsage) {
		String oldCuUsage = cuUsage;
		cuUsage = newCuUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE, oldCuUsage, cuUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionFactors()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return ((InternalEList<?>)getConditionFactors()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return ((InternalEList<?>)getCUGroups()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return getDesigns();
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				return getRemovalDate();
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return getConditionFactors();
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				return getCuQuantity();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				return getCuAccount();
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				return getCuAction();
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				return isEnergizationFlag();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return getCUGroups();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				return getCuUsage();
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
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				setRemovalDate((String)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				getConditionFactors().clear();
				getConditionFactors().addAll((Collection<? extends ConditionFactor>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				setCuQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				setCuAccount((String)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				setCuAction((WorkActionKind)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				setEnergizationFlag((Boolean)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				getCUGroups().clear();
				getCUGroups().addAll((Collection<? extends CUGroup>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				setCuUsage((String)newValue);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				getDesigns().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				setRemovalDate(REMOVAL_DATE_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				getConditionFactors().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				setCuQuantity(CU_QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				setCuAccount(CU_ACCOUNT_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				setCuAction(CU_ACTION_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				setEnergizationFlag(ENERGIZATION_FLAG_EDEFAULT);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				getCUGroups().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				setCuUsage(CU_USAGE_EDEFAULT);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return designs != null && !designs.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				return REMOVAL_DATE_EDEFAULT == null ? removalDate != null : !REMOVAL_DATE_EDEFAULT.equals(removalDate);
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return conditionFactors != null && !conditionFactors.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				return CU_QUANTITY_EDEFAULT == null ? cuQuantity != null : !CU_QUANTITY_EDEFAULT.equals(cuQuantity);
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				return CU_ACCOUNT_EDEFAULT == null ? cuAccount != null : !CU_ACCOUNT_EDEFAULT.equals(cuAccount);
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				return designLocation != null;
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				return status != null;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				return cuAction != CU_ACTION_EDEFAULT;
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				return energizationFlag != ENERGIZATION_FLAG_EDEFAULT;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return cuGroups != null && !cuGroups.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				return CU_USAGE_EDEFAULT == null ? cuUsage != null : !CU_USAGE_EDEFAULT.equals(cuUsage);
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
		result.append(" (removalDate: ");
		result.append(removalDate);
		result.append(", cuQuantity: ");
		result.append(cuQuantity);
		result.append(", cuAccount: ");
		result.append(cuAccount);
		result.append(", cuAction: ");
		result.append(cuAction);
		result.append(", energizationFlag: ");
		result.append(energizationFlag);
		result.append(", cuUsage: ");
		result.append(cuUsage);
		result.append(')');
		return result.toString();
	}

} //DesignLocationCUImpl
