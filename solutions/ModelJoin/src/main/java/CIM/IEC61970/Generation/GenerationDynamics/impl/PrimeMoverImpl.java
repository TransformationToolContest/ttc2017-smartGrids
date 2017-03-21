/**
 */
package CIM.IEC61970.Generation.GenerationDynamics.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import CIM.IEC61970.Generation.GenerationDynamics.PrimeMover;

import CIM.IEC61970.Wires.SynchronousMachine;
import CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Prime Mover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PrimeMoverImpl#getPrimeMoverRating <em>Prime Mover Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.PrimeMoverImpl#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimeMoverImpl extends PowerSystemResourceImpl implements PrimeMover {
	/**
	 * The default value of the '{@link #getPrimeMoverRating() <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMoverRating()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIME_MOVER_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrimeMoverRating() <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMoverRating()
	 * @generated
	 * @ordered
	 */
	protected float primeMoverRating = PRIME_MOVER_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> synchronousMachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimeMoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.PRIME_MOVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrimeMoverRating() {
		return primeMoverRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimeMoverRating(float newPrimeMoverRating) {
		float oldPrimeMoverRating = primeMoverRating;
		primeMoverRating = newPrimeMoverRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING, oldPrimeMoverRating, primeMoverRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronousMachine> getSynchronousMachines() {
		if (synchronousMachines == null) {
			synchronousMachines = new EObjectWithInverseResolvingEList.ManyInverse<SynchronousMachine>(SynchronousMachine.class, this, GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES, WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS);
		}
		return synchronousMachines;
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronousMachines()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getSynchronousMachines()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				return getPrimeMoverRating();
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return getSynchronousMachines();
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
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				setPrimeMoverRating((Float)newValue);
				return;
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				getSynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
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
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				setPrimeMoverRating(PRIME_MOVER_RATING_EDEFAULT);
				return;
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
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
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				return primeMoverRating != PRIME_MOVER_RATING_EDEFAULT;
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return synchronousMachines != null && !synchronousMachines.isEmpty();
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
		result.append(" (primeMoverRating: ");
		result.append(primeMoverRating);
		result.append(')');
		return result.toString();
	}

} //PrimeMoverImpl
