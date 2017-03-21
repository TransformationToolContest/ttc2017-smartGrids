/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Common.impl.LocationImpl;

import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.SDPLocation;
import CIM.IEC61968.Metering.ServiceDeliveryPoint;

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
 * An implementation of the model object '<em><b>SDP Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.SDPLocationImpl#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.SDPLocationImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.SDPLocationImpl#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.SDPLocationImpl#getOccupancyDate <em>Occupancy Date</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.SDPLocationImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDPLocationImpl extends LocationImpl implements SDPLocation {
	/**
	 * The default value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected String accessMethod = ACCESS_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_ACCESS_PROBLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected String siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupancyDate() <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancyDate()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPANCY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupancyDate() <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancyDate()
	 * @generated
	 * @ordered
	 */
	protected String occupancyDate = OCCUPANCY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDPLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.SDP_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessMethod() {
		return accessMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMethod(String newAccessMethod) {
		String oldAccessMethod = accessMethod;
		accessMethod = newAccessMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SDP_LOCATION__ACCESS_METHOD, oldAccessMethod, accessMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(String newRemark) {
		String oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SDP_LOCATION__REMARK, oldRemark, remark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteAccessProblem() {
		return siteAccessProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAccessProblem(String newSiteAccessProblem) {
		String oldSiteAccessProblem = siteAccessProblem;
		siteAccessProblem = newSiteAccessProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM, oldSiteAccessProblem, siteAccessProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccupancyDate() {
		return occupancyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupancyDate(String newOccupancyDate) {
		String oldOccupancyDate = occupancyDate;
		occupancyDate = newOccupancyDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE, oldOccupancyDate, occupancyDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList.ManyInverse<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS);
		}
		return serviceDeliveryPoints;
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
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				return getAccessMethod();
			case MeteringPackage.SDP_LOCATION__REMARK:
				return getRemark();
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				return getSiteAccessProblem();
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				return getOccupancyDate();
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				setAccessMethod((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__REMARK:
				setRemark((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				setSiteAccessProblem((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				setOccupancyDate((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				setAccessMethod(ACCESS_METHOD_EDEFAULT);
				return;
			case MeteringPackage.SDP_LOCATION__REMARK:
				setRemark(REMARK_EDEFAULT);
				return;
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				setSiteAccessProblem(SITE_ACCESS_PROBLEM_EDEFAULT);
				return;
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				setOccupancyDate(OCCUPANCY_DATE_EDEFAULT);
				return;
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				return ACCESS_METHOD_EDEFAULT == null ? accessMethod != null : !ACCESS_METHOD_EDEFAULT.equals(accessMethod);
			case MeteringPackage.SDP_LOCATION__REMARK:
				return REMARK_EDEFAULT == null ? remark != null : !REMARK_EDEFAULT.equals(remark);
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				return SITE_ACCESS_PROBLEM_EDEFAULT == null ? siteAccessProblem != null : !SITE_ACCESS_PROBLEM_EDEFAULT.equals(siteAccessProblem);
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				return OCCUPANCY_DATE_EDEFAULT == null ? occupancyDate != null : !OCCUPANCY_DATE_EDEFAULT.equals(occupancyDate);
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
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
		result.append(" (accessMethod: ");
		result.append(accessMethod);
		result.append(", remark: ");
		result.append(remark);
		result.append(", siteAccessProblem: ");
		result.append(siteAccessProblem);
		result.append(", occupancyDate: ");
		result.append(occupancyDate);
		result.append(')');
		return result.toString();
	}

} //SDPLocationImpl
