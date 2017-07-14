/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.InspectionDataSet;

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
 * An implementation of the model object '<em><b>Inspection Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.InspectionDataSetImpl#getLocationCondition <em>Location Condition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.InspectionDataSetImpl#getAccordingToSchedules <em>According To Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectionDataSetImpl extends ProcedureDataSetImpl implements InspectionDataSet {
	/**
	 * The default value of the '{@link #getLocationCondition() <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationCondition() <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCondition()
	 * @generated
	 * @ordered
	 */
	protected String locationCondition = LOCATION_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccordingToSchedules() <em>According To Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccordingToSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleParameterInfo> accordingToSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.INSPECTION_DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationCondition() {
		return locationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationCondition(String newLocationCondition) {
		String oldLocationCondition = locationCondition;
		locationCondition = newLocationCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION, oldLocationCondition, locationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleParameterInfo> getAccordingToSchedules() {
		if (accordingToSchedules == null) {
			accordingToSchedules = new EObjectWithInverseResolvingEList<ScheduleParameterInfo>(ScheduleParameterInfo.class, this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET);
		}
		return accordingToSchedules;
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccordingToSchedules()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return ((InternalEList<?>)getAccordingToSchedules()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				return getLocationCondition();
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return getAccordingToSchedules();
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
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				setLocationCondition((String)newValue);
				return;
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				getAccordingToSchedules().clear();
				getAccordingToSchedules().addAll((Collection<? extends ScheduleParameterInfo>)newValue);
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
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				setLocationCondition(LOCATION_CONDITION_EDEFAULT);
				return;
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				getAccordingToSchedules().clear();
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
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				return LOCATION_CONDITION_EDEFAULT == null ? locationCondition != null : !LOCATION_CONDITION_EDEFAULT.equals(locationCondition);
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return accordingToSchedules != null && !accordingToSchedules.isEmpty();
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
		result.append(" (locationCondition: ");
		result.append(locationCondition);
		result.append(')');
		return result.toString();
	}

} //InspectionDataSetImpl
