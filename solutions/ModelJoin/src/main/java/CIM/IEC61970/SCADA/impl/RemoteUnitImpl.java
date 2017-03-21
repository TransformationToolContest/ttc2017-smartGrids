/**
 */
package CIM.IEC61970.SCADA.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.SCADA.CommunicationLink;
import CIM.IEC61970.SCADA.RemotePoint;
import CIM.IEC61970.SCADA.RemoteUnit;
import CIM.IEC61970.SCADA.RemoteUnitType;
import CIM.IEC61970.SCADA.SCADAPackage;

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
 * An implementation of the model object '<em><b>Remote Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteUnitImpl#getRemotePoints <em>Remote Points</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteUnitImpl#getRemoteUnitType <em>Remote Unit Type</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteUnitImpl#getCommunicationLinks <em>Communication Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteUnitImpl extends PowerSystemResourceImpl implements RemoteUnit {
	/**
	 * The cached value of the '{@link #getRemotePoints() <em>Remote Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RemotePoint> remotePoints;

	/**
	 * The default value of the '{@link #getRemoteUnitType() <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final RemoteUnitType REMOTE_UNIT_TYPE_EDEFAULT = RemoteUnitType.IED;

	/**
	 * The cached value of the '{@link #getRemoteUnitType() <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnitType()
	 * @generated
	 * @ordered
	 */
	protected RemoteUnitType remoteUnitType = REMOTE_UNIT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationLinks() <em>Communication Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> communicationLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemotePoint> getRemotePoints() {
		if (remotePoints == null) {
			remotePoints = new EObjectWithInverseResolvingEList<RemotePoint>(RemotePoint.class, this, SCADAPackage.REMOTE_UNIT__REMOTE_POINTS, SCADAPackage.REMOTE_POINT__REMOTE_UNIT);
		}
		return remotePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteUnitType getRemoteUnitType() {
		return remoteUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteUnitType(RemoteUnitType newRemoteUnitType) {
		RemoteUnitType oldRemoteUnitType = remoteUnitType;
		remoteUnitType = newRemoteUnitType == null ? REMOTE_UNIT_TYPE_EDEFAULT : newRemoteUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE, oldRemoteUnitType, remoteUnitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getCommunicationLinks() {
		if (communicationLinks == null) {
			communicationLinks = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationLink>(CommunicationLink.class, this, SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS, SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS);
		}
		return communicationLinks;
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemotePoints()).basicAdd(otherEnd, msgs);
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationLinks()).basicAdd(otherEnd, msgs);
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return ((InternalEList<?>)getRemotePoints()).basicRemove(otherEnd, msgs);
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return ((InternalEList<?>)getCommunicationLinks()).basicRemove(otherEnd, msgs);
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return getRemotePoints();
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				return getRemoteUnitType();
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return getCommunicationLinks();
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				getRemotePoints().clear();
				getRemotePoints().addAll((Collection<? extends RemotePoint>)newValue);
				return;
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				setRemoteUnitType((RemoteUnitType)newValue);
				return;
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				getCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				getRemotePoints().clear();
				return;
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				setRemoteUnitType(REMOTE_UNIT_TYPE_EDEFAULT);
				return;
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return remotePoints != null && !remotePoints.isEmpty();
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				return remoteUnitType != REMOTE_UNIT_TYPE_EDEFAULT;
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return communicationLinks != null && !communicationLinks.isEmpty();
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
		result.append(" (remoteUnitType: ");
		result.append(remoteUnitType);
		result.append(')');
		return result.toString();
	}

} //RemoteUnitImpl
