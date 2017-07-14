/**
 */
package gluemodel.CIM.IEC61970.SCADA.impl;

import gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import gluemodel.CIM.IEC61970.SCADA.CommunicationLink;
import gluemodel.CIM.IEC61970.SCADA.RemoteUnit;
import gluemodel.CIM.IEC61970.SCADA.SCADAPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.impl.CommunicationLinkImpl#getRemoteUnits <em>Remote Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkImpl extends PowerSystemResourceImpl implements CommunicationLink {
	/**
	 * The cached value of the '{@link #getRemoteUnits() <em>Remote Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteUnit> remoteUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.COMMUNICATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteUnit> getRemoteUnits() {
		if (remoteUnits == null) {
			remoteUnits = new EObjectWithInverseResolvingEList.ManyInverse<RemoteUnit>(RemoteUnit.class, this, SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS, SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS);
		}
		return remoteUnits;
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemoteUnits()).basicAdd(otherEnd, msgs);
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return ((InternalEList<?>)getRemoteUnits()).basicRemove(otherEnd, msgs);
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return getRemoteUnits();
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				getRemoteUnits().clear();
				getRemoteUnits().addAll((Collection<? extends RemoteUnit>)newValue);
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				getRemoteUnits().clear();
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return remoteUnits != null && !remoteUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationLinkImpl
