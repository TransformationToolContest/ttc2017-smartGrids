/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.OpenCircuitTest;
import CIM.IEC61968.AssetModels.ToWindingSpec;

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
 * An implementation of the model object '<em><b>Open Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl#getNoLoadLoss <em>No Load Loss</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl#getExcitingCurrent <em>Exciting Current</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl#getExcitingCurrentZero <em>Exciting Current Zero</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl#getMeasuredWindingSpecs <em>Measured Winding Specs</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.OpenCircuitTestImpl#getNoLoadLossZero <em>No Load Loss Zero</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenCircuitTestImpl extends DistributionWindingTestImpl implements OpenCircuitTest {
	/**
	 * The default value of the '{@link #getNoLoadLoss() <em>No Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float NO_LOAD_LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNoLoadLoss() <em>No Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected float noLoadLoss = NO_LOAD_LOSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float EXCITING_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrent()
	 * @generated
	 * @ordered
	 */
	protected float excitingCurrent = EXCITING_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcitingCurrentZero() <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrentZero()
	 * @generated
	 * @ordered
	 */
	protected static final float EXCITING_CURRENT_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExcitingCurrentZero() <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrentZero()
	 * @generated
	 * @ordered
	 */
	protected float excitingCurrentZero = EXCITING_CURRENT_ZERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasuredWindingSpecs() <em>Measured Winding Specs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredWindingSpecs()
	 * @generated
	 * @ordered
	 */
	protected EList<ToWindingSpec> measuredWindingSpecs;

	/**
	 * The default value of the '{@link #getNoLoadLossZero() <em>No Load Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadLossZero()
	 * @generated
	 * @ordered
	 */
	protected static final float NO_LOAD_LOSS_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNoLoadLossZero() <em>No Load Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoLoadLossZero()
	 * @generated
	 * @ordered
	 */
	protected float noLoadLossZero = NO_LOAD_LOSS_ZERO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenCircuitTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.OPEN_CIRCUIT_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNoLoadLoss() {
		return noLoadLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLoadLoss(float newNoLoadLoss) {
		float oldNoLoadLoss = noLoadLoss;
		noLoadLoss = newNoLoadLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS, oldNoLoadLoss, noLoadLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExcitingCurrent() {
		return excitingCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcitingCurrent(float newExcitingCurrent) {
		float oldExcitingCurrent = excitingCurrent;
		excitingCurrent = newExcitingCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT, oldExcitingCurrent, excitingCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExcitingCurrentZero() {
		return excitingCurrentZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcitingCurrentZero(float newExcitingCurrentZero) {
		float oldExcitingCurrentZero = excitingCurrentZero;
		excitingCurrentZero = newExcitingCurrentZero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO, oldExcitingCurrentZero, excitingCurrentZero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToWindingSpec> getMeasuredWindingSpecs() {
		if (measuredWindingSpecs == null) {
			measuredWindingSpecs = new EObjectWithInverseResolvingEList.ManyInverse<ToWindingSpec>(ToWindingSpec.class, this, AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS, AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS);
		}
		return measuredWindingSpecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNoLoadLossZero() {
		return noLoadLossZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoLoadLossZero(float newNoLoadLossZero) {
		float oldNoLoadLossZero = noLoadLossZero;
		noLoadLossZero = newNoLoadLossZero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO, oldNoLoadLossZero, noLoadLossZero));
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasuredWindingSpecs()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS:
				return ((InternalEList<?>)getMeasuredWindingSpecs()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS:
				return getNoLoadLoss();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT:
				return getExcitingCurrent();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO:
				return getExcitingCurrentZero();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS:
				return getMeasuredWindingSpecs();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO:
				return getNoLoadLossZero();
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS:
				setNoLoadLoss((Float)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT:
				setExcitingCurrent((Float)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO:
				setExcitingCurrentZero((Float)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS:
				getMeasuredWindingSpecs().clear();
				getMeasuredWindingSpecs().addAll((Collection<? extends ToWindingSpec>)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO:
				setNoLoadLossZero((Float)newValue);
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS:
				setNoLoadLoss(NO_LOAD_LOSS_EDEFAULT);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT:
				setExcitingCurrent(EXCITING_CURRENT_EDEFAULT);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO:
				setExcitingCurrentZero(EXCITING_CURRENT_ZERO_EDEFAULT);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS:
				getMeasuredWindingSpecs().clear();
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO:
				setNoLoadLossZero(NO_LOAD_LOSS_ZERO_EDEFAULT);
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS:
				return noLoadLoss != NO_LOAD_LOSS_EDEFAULT;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT:
				return excitingCurrent != EXCITING_CURRENT_EDEFAULT;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__EXCITING_CURRENT_ZERO:
				return excitingCurrentZero != EXCITING_CURRENT_ZERO_EDEFAULT;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS:
				return measuredWindingSpecs != null && !measuredWindingSpecs.isEmpty();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__NO_LOAD_LOSS_ZERO:
				return noLoadLossZero != NO_LOAD_LOSS_ZERO_EDEFAULT;
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
		result.append(" (noLoadLoss: ");
		result.append(noLoadLoss);
		result.append(", excitingCurrent: ");
		result.append(excitingCurrent);
		result.append(", excitingCurrentZero: ");
		result.append(excitingCurrentZero);
		result.append(", noLoadLossZero: ");
		result.append(noLoadLossZero);
		result.append(')');
		return result.toString();
	}

} //OpenCircuitTestImpl
