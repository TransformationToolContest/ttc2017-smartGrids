/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;
import gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.Measurement;

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
 * An implementation of the model object '<em><b>Tie Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl#getBy_Measurements <em>By Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl#getDeclared_ServicePoint <em>Declared Service Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl#getTiePointMWRating <em>Tie Point MW Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.impl.TiePointImpl#getFor_Measurements <em>For Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TiePointImpl extends IdentifiedObjectImpl implements TiePoint {
	/**
	 * The cached value of the '{@link #getBy_Measurements() <em>By Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy_Measurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> by_Measurements;

	/**
	 * The cached value of the '{@link #getDeclared_ServicePoint() <em>Declared Service Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclared_ServicePoint()
	 * @generated
	 * @ordered
	 */
	protected ServicePoint declared_ServicePoint;

	/**
	 * The default value of the '{@link #getTiePointMWRating() <em>Tie Point MW Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiePointMWRating()
	 * @generated
	 * @ordered
	 */
	protected static final float TIE_POINT_MW_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTiePointMWRating() <em>Tie Point MW Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiePointMWRating()
	 * @generated
	 * @ordered
	 */
	protected float tiePointMWRating = TIE_POINT_MW_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFor_Measurements() <em>For Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor_Measurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> for_Measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TiePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.TIE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getBy_Measurements() {
		if (by_Measurements == null) {
			by_Measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, ReservationPackage.TIE_POINT__BY_MEASUREMENTS, MeasPackage.MEASUREMENT__BY_TIE_POINT);
		}
		return by_Measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint getDeclared_ServicePoint() {
		if (declared_ServicePoint != null && declared_ServicePoint.eIsProxy()) {
			InternalEObject oldDeclared_ServicePoint = (InternalEObject)declared_ServicePoint;
			declared_ServicePoint = (ServicePoint)eResolveProxy(oldDeclared_ServicePoint);
			if (declared_ServicePoint != oldDeclared_ServicePoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT, oldDeclared_ServicePoint, declared_ServicePoint));
			}
		}
		return declared_ServicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint basicGetDeclared_ServicePoint() {
		return declared_ServicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclared_ServicePoint(ServicePoint newDeclared_ServicePoint, NotificationChain msgs) {
		ServicePoint oldDeclared_ServicePoint = declared_ServicePoint;
		declared_ServicePoint = newDeclared_ServicePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT, oldDeclared_ServicePoint, newDeclared_ServicePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclared_ServicePoint(ServicePoint newDeclared_ServicePoint) {
		if (newDeclared_ServicePoint != declared_ServicePoint) {
			NotificationChain msgs = null;
			if (declared_ServicePoint != null)
				msgs = ((InternalEObject)declared_ServicePoint).eInverseRemove(this, ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT, ServicePoint.class, msgs);
			if (newDeclared_ServicePoint != null)
				msgs = ((InternalEObject)newDeclared_ServicePoint).eInverseAdd(this, ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT, ServicePoint.class, msgs);
			msgs = basicSetDeclared_ServicePoint(newDeclared_ServicePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT, newDeclared_ServicePoint, newDeclared_ServicePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTiePointMWRating() {
		return tiePointMWRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiePointMWRating(float newTiePointMWRating) {
		float oldTiePointMWRating = tiePointMWRating;
		tiePointMWRating = newTiePointMWRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.TIE_POINT__TIE_POINT_MW_RATING, oldTiePointMWRating, tiePointMWRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getFor_Measurements() {
		if (for_Measurements == null) {
			for_Measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, ReservationPackage.TIE_POINT__FOR_MEASUREMENTS, MeasPackage.MEASUREMENT__FOR_TIE_POINT);
		}
		return for_Measurements;
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
			case ReservationPackage.TIE_POINT__BY_MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBy_Measurements()).basicAdd(otherEnd, msgs);
			case ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT:
				if (declared_ServicePoint != null)
					msgs = ((InternalEObject)declared_ServicePoint).eInverseRemove(this, ReservationPackage.SERVICE_POINT__DECLARE_TIE_POINT, ServicePoint.class, msgs);
				return basicSetDeclared_ServicePoint((ServicePoint)otherEnd, msgs);
			case ReservationPackage.TIE_POINT__FOR_MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFor_Measurements()).basicAdd(otherEnd, msgs);
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
			case ReservationPackage.TIE_POINT__BY_MEASUREMENTS:
				return ((InternalEList<?>)getBy_Measurements()).basicRemove(otherEnd, msgs);
			case ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT:
				return basicSetDeclared_ServicePoint(null, msgs);
			case ReservationPackage.TIE_POINT__FOR_MEASUREMENTS:
				return ((InternalEList<?>)getFor_Measurements()).basicRemove(otherEnd, msgs);
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
			case ReservationPackage.TIE_POINT__BY_MEASUREMENTS:
				return getBy_Measurements();
			case ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT:
				if (resolve) return getDeclared_ServicePoint();
				return basicGetDeclared_ServicePoint();
			case ReservationPackage.TIE_POINT__TIE_POINT_MW_RATING:
				return getTiePointMWRating();
			case ReservationPackage.TIE_POINT__FOR_MEASUREMENTS:
				return getFor_Measurements();
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
			case ReservationPackage.TIE_POINT__BY_MEASUREMENTS:
				getBy_Measurements().clear();
				getBy_Measurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT:
				setDeclared_ServicePoint((ServicePoint)newValue);
				return;
			case ReservationPackage.TIE_POINT__TIE_POINT_MW_RATING:
				setTiePointMWRating((Float)newValue);
				return;
			case ReservationPackage.TIE_POINT__FOR_MEASUREMENTS:
				getFor_Measurements().clear();
				getFor_Measurements().addAll((Collection<? extends Measurement>)newValue);
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
			case ReservationPackage.TIE_POINT__BY_MEASUREMENTS:
				getBy_Measurements().clear();
				return;
			case ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT:
				setDeclared_ServicePoint((ServicePoint)null);
				return;
			case ReservationPackage.TIE_POINT__TIE_POINT_MW_RATING:
				setTiePointMWRating(TIE_POINT_MW_RATING_EDEFAULT);
				return;
			case ReservationPackage.TIE_POINT__FOR_MEASUREMENTS:
				getFor_Measurements().clear();
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
			case ReservationPackage.TIE_POINT__BY_MEASUREMENTS:
				return by_Measurements != null && !by_Measurements.isEmpty();
			case ReservationPackage.TIE_POINT__DECLARED_SERVICE_POINT:
				return declared_ServicePoint != null;
			case ReservationPackage.TIE_POINT__TIE_POINT_MW_RATING:
				return tiePointMWRating != TIE_POINT_MW_RATING_EDEFAULT;
			case ReservationPackage.TIE_POINT__FOR_MEASUREMENTS:
				return for_Measurements != null && !for_Measurements.isEmpty();
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
		result.append(" (tiePointMWRating: ");
		result.append(tiePointMWRating);
		result.append(')');
		return result.toString();
	}

} //TiePointImpl
