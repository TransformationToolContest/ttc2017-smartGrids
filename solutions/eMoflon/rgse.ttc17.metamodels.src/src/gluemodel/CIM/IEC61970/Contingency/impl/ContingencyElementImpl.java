/**
 */
package gluemodel.CIM.IEC61970.Contingency.impl;

import gluemodel.CIM.IEC61970.Contingency.Contingency;
import gluemodel.CIM.IEC61970.Contingency.ContingencyElement;
import gluemodel.CIM.IEC61970.Contingency.ContingencyPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.impl.ContingencyElementImpl#getContingency <em>Contingency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyElementImpl extends IdentifiedObjectImpl implements ContingencyElement {
	/**
	 * The cached value of the '{@link #getContingency() <em>Contingency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingency()
	 * @generated
	 * @ordered
	 */
	protected Contingency contingency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContingencyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContingencyPackage.Literals.CONTINGENCY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency getContingency() {
		if (contingency != null && contingency.eIsProxy()) {
			InternalEObject oldContingency = (InternalEObject)contingency;
			contingency = (Contingency)eResolveProxy(oldContingency);
			if (contingency != oldContingency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY, oldContingency, contingency));
			}
		}
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency basicGetContingency() {
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContingency(Contingency newContingency, NotificationChain msgs) {
		Contingency oldContingency = contingency;
		contingency = newContingency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY, oldContingency, newContingency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContingency(Contingency newContingency) {
		if (newContingency != contingency) {
			NotificationChain msgs = null;
			if (contingency != null)
				msgs = ((InternalEObject)contingency).eInverseRemove(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs);
			if (newContingency != null)
				msgs = ((InternalEObject)newContingency).eInverseAdd(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs);
			msgs = basicSetContingency(newContingency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY, newContingency, newContingency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				if (contingency != null)
					msgs = ((InternalEObject)contingency).eInverseRemove(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs);
				return basicSetContingency((Contingency)otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				return basicSetContingency(null, msgs);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				if (resolve) return getContingency();
				return basicGetContingency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				setContingency((Contingency)newValue);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				setContingency((Contingency)null);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				return contingency != null;
		}
		return super.eIsSet(featureID);
	}

} //ContingencyElementImpl
