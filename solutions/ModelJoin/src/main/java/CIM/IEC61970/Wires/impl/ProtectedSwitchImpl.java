/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Protection.ProtectionPackage;
import CIM.IEC61970.Protection.RecloseSequence;

import CIM.IEC61970.Wires.ProtectedSwitch;
import CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protected Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.ProtectedSwitchImpl#getRecloseSequences <em>Reclose Sequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectedSwitchImpl extends SwitchImpl implements ProtectedSwitch {
	/**
	 * The cached value of the '{@link #getRecloseSequences() <em>Reclose Sequences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<RecloseSequence> recloseSequences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectedSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PROTECTED_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecloseSequence> getRecloseSequences() {
		if (recloseSequences == null) {
			recloseSequences = new EObjectWithInverseResolvingEList<RecloseSequence>(RecloseSequence.class, this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH);
		}
		return recloseSequences;
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
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecloseSequences()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return ((InternalEList<?>)getRecloseSequences()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return getRecloseSequences();
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
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				getRecloseSequences().clear();
				getRecloseSequences().addAll((Collection<? extends RecloseSequence>)newValue);
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
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				getRecloseSequences().clear();
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
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return recloseSequences != null && !recloseSequences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtectedSwitchImpl
