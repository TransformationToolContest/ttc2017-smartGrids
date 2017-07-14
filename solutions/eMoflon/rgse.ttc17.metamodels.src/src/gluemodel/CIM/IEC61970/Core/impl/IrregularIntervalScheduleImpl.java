/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule;
import gluemodel.CIM.IEC61970.Core.IrregularTimePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irregular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IrregularIntervalScheduleImpl#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrregularIntervalScheduleImpl extends BasicIntervalScheduleImpl implements IrregularIntervalSchedule {
	/**
	 * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<IrregularTimePoint> timePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrregularIntervalScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IRREGULAR_INTERVAL_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IrregularTimePoint> getTimePoints() {
		if (timePoints == null) {
			timePoints = new EObjectWithInverseResolvingEList<IrregularTimePoint>(IrregularTimePoint.class, this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE);
		}
		return timePoints;
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
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimePoints()).basicAdd(otherEnd, msgs);
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
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return ((InternalEList<?>)getTimePoints()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return getTimePoints();
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
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				getTimePoints().addAll((Collection<? extends IrregularTimePoint>)newValue);
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
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
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
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return timePoints != null && !timePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IrregularIntervalScheduleImpl
