/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import gluemodel.CIM.IEC61970.Informative.Financial.CustomerConsumer;
import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.CustomerConsumerImpl#getTieLines <em>Tie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Financial.impl.CustomerConsumerImpl#getServicePoint <em>Service Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerConsumerImpl extends ErpOrganisationImpl implements CustomerConsumer {
	/**
	 * The cached value of the '{@link #getTieLines() <em>Tie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> tieLines;

	/**
	 * The cached value of the '{@link #getServicePoint() <em>Service Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicePoint> servicePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancialPackage.Literals.CUSTOMER_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getTieLines() {
		if (tieLines == null) {
			tieLines = new EObjectWithInverseResolvingEList<TieLine>(TieLine.class, this, FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES, EnergySchedulingPackage.TIE_LINE__CUSTOMER_CONSUMER);
		}
		return tieLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServicePoint> getServicePoint() {
		if (servicePoint == null) {
			servicePoint = new EObjectWithInverseResolvingEList<ServicePoint>(ServicePoint.class, this, FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT, ReservationPackage.SERVICE_POINT__CUSTOMER_CONSUMER);
		}
		return servicePoint;
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
			case FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieLines()).basicAdd(otherEnd, msgs);
			case FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicePoint()).basicAdd(otherEnd, msgs);
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
			case FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES:
				return ((InternalEList<?>)getTieLines()).basicRemove(otherEnd, msgs);
			case FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT:
				return ((InternalEList<?>)getServicePoint()).basicRemove(otherEnd, msgs);
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
			case FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES:
				return getTieLines();
			case FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT:
				return getServicePoint();
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
			case FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES:
				getTieLines().clear();
				getTieLines().addAll((Collection<? extends TieLine>)newValue);
				return;
			case FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT:
				getServicePoint().clear();
				getServicePoint().addAll((Collection<? extends ServicePoint>)newValue);
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
			case FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES:
				getTieLines().clear();
				return;
			case FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT:
				getServicePoint().clear();
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
			case FinancialPackage.CUSTOMER_CONSUMER__TIE_LINES:
				return tieLines != null && !tieLines.isEmpty();
			case FinancialPackage.CUSTOMER_CONSUMER__SERVICE_POINT:
				return servicePoint != null && !servicePoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerConsumerImpl
