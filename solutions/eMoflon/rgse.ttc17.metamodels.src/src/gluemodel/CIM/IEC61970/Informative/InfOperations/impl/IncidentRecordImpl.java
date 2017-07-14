/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentCode;
import gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket;

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
 * An implementation of the model object '<em><b>Incident Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl#getIncidentCodes <em>Incident Codes</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.IncidentRecordImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentRecordImpl extends DocumentImpl implements IncidentRecord {
	/**
	 * The cached value of the '{@link #getIncidentCodes() <em>Incident Codes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<IncidentCode> incidentCodes;

	/**
	 * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroubleTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<TroubleTicket> troubleTickets;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.INCIDENT_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncidentCode> getIncidentCodes() {
		if (incidentCodes == null) {
			incidentCodes = new EObjectWithInverseResolvingEList.ManyInverse<IncidentCode>(IncidentCode.class, this, InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES, InfOperationsPackage.INCIDENT_CODE__INCIDENT_RECORDS);
		}
		return incidentCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TroubleTicket> getTroubleTickets() {
		if (troubleTickets == null) {
			troubleTickets = new EObjectWithInverseResolvingEList<TroubleTicket>(TroubleTicket.class, this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD);
		}
		return troubleTickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (DateTimeInterval)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.INCIDENT_RECORD__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(DateTimeInterval newPeriod) {
		DateTimeInterval oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.INCIDENT_RECORD__PERIOD, oldPeriod, period));
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
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncidentCodes()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTroubleTickets()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return ((InternalEList<?>)getIncidentCodes()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return ((InternalEList<?>)getTroubleTickets()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return getIncidentCodes();
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return getTroubleTickets();
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
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
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				getIncidentCodes().clear();
				getIncidentCodes().addAll((Collection<? extends IncidentCode>)newValue);
				return;
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				getTroubleTickets().addAll((Collection<? extends TroubleTicket>)newValue);
				return;
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				setPeriod((DateTimeInterval)newValue);
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
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				getIncidentCodes().clear();
				return;
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				return;
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				setPeriod((DateTimeInterval)null);
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
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return incidentCodes != null && !incidentCodes.isEmpty();
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return troubleTickets != null && !troubleTickets.isEmpty();
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //IncidentRecordImpl
