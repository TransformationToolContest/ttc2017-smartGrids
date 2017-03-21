/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.OperatingParticipant;
import CIM.IEC61970.Core.OperatingShare;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.OperatingParticipantImpl#getOperatingShare <em>Operating Share</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingParticipantImpl extends IdentifiedObjectImpl implements OperatingParticipant {
	/**
	 * The cached value of the '{@link #getOperatingShare() <em>Operating Share</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingShare()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingShare> operatingShare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.OPERATING_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingShare> getOperatingShare() {
		if (operatingShare == null) {
			operatingShare = new EObjectWithInverseResolvingEList<OperatingShare>(OperatingShare.class, this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT);
		}
		return operatingShare;
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingShare()).basicAdd(otherEnd, msgs);
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return ((InternalEList<?>)getOperatingShare()).basicRemove(otherEnd, msgs);
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return getOperatingShare();
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				getOperatingShare().clear();
				getOperatingShare().addAll((Collection<? extends OperatingShare>)newValue);
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				getOperatingShare().clear();
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return operatingShare != null && !operatingShare.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperatingParticipantImpl
