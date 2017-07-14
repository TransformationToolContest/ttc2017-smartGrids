/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Craft;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.Capability;
import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

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
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CapabilityImpl#getPerformanceFactor <em>Performance Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends IdentifiedObjectImpl implements Capability {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The cached value of the '{@link #getCrafts() <em>Crafts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Craft> crafts;

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
	 * The default value of the '{@link #getPerformanceFactor() <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceFactor() <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceFactor()
	 * @generated
	 * @ordered
	 */
	protected String performanceFactor = PERFORMANCE_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CAPABILITY__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList.ManyInverse<WorkTask>(WorkTask.class, this, InfWorkPackage.CAPABILITY__WORK_TASKS, InfWorkPackage.WORK_TASK__CAPABILITIES);
		}
		return workTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getValidityInterval() {
		if (validityInterval != null && validityInterval.eIsProxy()) {
			InternalEObject oldValidityInterval = (InternalEObject)validityInterval;
			validityInterval = (DateTimeInterval)eResolveProxy(oldValidityInterval);
			if (validityInterval != oldValidityInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
			}
		}
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetValidityInterval() {
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityInterval(DateTimeInterval newValidityInterval) {
		DateTimeInterval oldValidityInterval = validityInterval;
		validityInterval = newValidityInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CAPABILITY__CREW, oldCrew, crew));
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CAPABILITY__CREW, oldCrew, newCrew);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__CAPABILITIES, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__CAPABILITIES, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CAPABILITY__CREW, newCrew, newCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Craft> getCrafts() {
		if (crafts == null) {
			crafts = new EObjectWithInverseResolvingEList.ManyInverse<Craft>(Craft.class, this, InfWorkPackage.CAPABILITY__CRAFTS, InfCommonPackage.CRAFT__CAPABILITIES);
		}
		return crafts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CAPABILITY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CAPABILITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceFactor() {
		return performanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceFactor(String newPerformanceFactor) {
		String oldPerformanceFactor = performanceFactor;
		performanceFactor = newPerformanceFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR, oldPerformanceFactor, performanceFactor));
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
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__CAPABILITIES, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrafts()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__CREW:
				return basicSetCrew(null, msgs);
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return ((InternalEList<?>)getCrafts()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CAPABILITY__CATEGORY:
				return getCategory();
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				if (resolve) return getValidityInterval();
				return basicGetValidityInterval();
			case InfWorkPackage.CAPABILITY__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return getCrafts();
			case InfWorkPackage.CAPABILITY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				return getPerformanceFactor();
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
			case InfWorkPackage.CAPABILITY__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
				return;
			case InfWorkPackage.CAPABILITY__CREW:
				setCrew((Crew)newValue);
				return;
			case InfWorkPackage.CAPABILITY__CRAFTS:
				getCrafts().clear();
				getCrafts().addAll((Collection<? extends Craft>)newValue);
				return;
			case InfWorkPackage.CAPABILITY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				setPerformanceFactor((String)newValue);
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
			case InfWorkPackage.CAPABILITY__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
				return;
			case InfWorkPackage.CAPABILITY__CREW:
				setCrew((Crew)null);
				return;
			case InfWorkPackage.CAPABILITY__CRAFTS:
				getCrafts().clear();
				return;
			case InfWorkPackage.CAPABILITY__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				setPerformanceFactor(PERFORMANCE_FACTOR_EDEFAULT);
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
			case InfWorkPackage.CAPABILITY__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				return validityInterval != null;
			case InfWorkPackage.CAPABILITY__CREW:
				return crew != null;
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return crafts != null && !crafts.isEmpty();
			case InfWorkPackage.CAPABILITY__STATUS:
				return status != null;
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				return PERFORMANCE_FACTOR_EDEFAULT == null ? performanceFactor != null : !PERFORMANCE_FACTOR_EDEFAULT.equals(performanceFactor);
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
		result.append(" (category: ");
		result.append(category);
		result.append(", performanceFactor: ");
		result.append(performanceFactor);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
