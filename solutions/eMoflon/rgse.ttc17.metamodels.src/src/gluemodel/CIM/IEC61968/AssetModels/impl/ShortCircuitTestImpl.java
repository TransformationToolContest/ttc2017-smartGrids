/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest;
import gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec;

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
 * An implementation of the model object '<em><b>Short Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl#getLoadLoss <em>Load Loss</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl#getLoadLossZero <em>Load Loss Zero</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl#getShortedWindingSpecs <em>Shorted Winding Specs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ShortCircuitTestImpl#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortCircuitTestImpl extends DistributionWindingTestImpl implements ShortCircuitTest {
	/**
	 * The default value of the '{@link #getLoadLoss() <em>Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadLoss() <em>Load Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLoss()
	 * @generated
	 * @ordered
	 */
	protected float loadLoss = LOAD_LOSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadLossZero() <em>Load Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLossZero()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_LOSS_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadLossZero() <em>Load Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadLossZero()
	 * @generated
	 * @ordered
	 */
	protected float loadLossZero = LOAD_LOSS_ZERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedance()
	 * @generated
	 * @ordered
	 */
	protected float leakageImpedance = LEAKAGE_IMPEDANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShortedWindingSpecs() <em>Shorted Winding Specs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortedWindingSpecs()
	 * @generated
	 * @ordered
	 */
	protected EList<ToWindingSpec> shortedWindingSpecs;

	/**
	 * The default value of the '{@link #getLeakageImpedanceZero() <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedanceZero()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_IMPEDANCE_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageImpedanceZero() <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedanceZero()
	 * @generated
	 * @ordered
	 */
	protected float leakageImpedanceZero = LEAKAGE_IMPEDANCE_ZERO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortCircuitTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.SHORT_CIRCUIT_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadLoss() {
		return loadLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadLoss(float newLoadLoss) {
		float oldLoadLoss = loadLoss;
		loadLoss = newLoadLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS, oldLoadLoss, loadLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadLossZero() {
		return loadLossZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadLossZero(float newLoadLossZero) {
		float oldLoadLossZero = loadLossZero;
		loadLossZero = newLoadLossZero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO, oldLoadLossZero, loadLossZero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeakageImpedance() {
		return leakageImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeakageImpedance(float newLeakageImpedance) {
		float oldLeakageImpedance = leakageImpedance;
		leakageImpedance = newLeakageImpedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE, oldLeakageImpedance, leakageImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToWindingSpec> getShortedWindingSpecs() {
		if (shortedWindingSpecs == null) {
			shortedWindingSpecs = new EObjectWithInverseResolvingEList.ManyInverse<ToWindingSpec>(ToWindingSpec.class, this, AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS, AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS);
		}
		return shortedWindingSpecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeakageImpedanceZero() {
		return leakageImpedanceZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeakageImpedanceZero(float newLeakageImpedanceZero) {
		float oldLeakageImpedanceZero = leakageImpedanceZero;
		leakageImpedanceZero = newLeakageImpedanceZero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO, oldLeakageImpedanceZero, leakageImpedanceZero));
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShortedWindingSpecs()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS:
				return ((InternalEList<?>)getShortedWindingSpecs()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS:
				return getLoadLoss();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO:
				return getLoadLossZero();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				return getLeakageImpedance();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS:
				return getShortedWindingSpecs();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				return getLeakageImpedanceZero();
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS:
				setLoadLoss((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO:
				setLoadLossZero((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				setLeakageImpedance((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS:
				getShortedWindingSpecs().clear();
				getShortedWindingSpecs().addAll((Collection<? extends ToWindingSpec>)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				setLeakageImpedanceZero((Float)newValue);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS:
				setLoadLoss(LOAD_LOSS_EDEFAULT);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO:
				setLoadLossZero(LOAD_LOSS_ZERO_EDEFAULT);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				setLeakageImpedance(LEAKAGE_IMPEDANCE_EDEFAULT);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS:
				getShortedWindingSpecs().clear();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				setLeakageImpedanceZero(LEAKAGE_IMPEDANCE_ZERO_EDEFAULT);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS:
				return loadLoss != LOAD_LOSS_EDEFAULT;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOAD_LOSS_ZERO:
				return loadLossZero != LOAD_LOSS_ZERO_EDEFAULT;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				return leakageImpedance != LEAKAGE_IMPEDANCE_EDEFAULT;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS:
				return shortedWindingSpecs != null && !shortedWindingSpecs.isEmpty();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				return leakageImpedanceZero != LEAKAGE_IMPEDANCE_ZERO_EDEFAULT;
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
		result.append(" (loadLoss: ");
		result.append(loadLoss);
		result.append(", loadLossZero: ");
		result.append(loadLossZero);
		result.append(", leakageImpedance: ");
		result.append(leakageImpedance);
		result.append(", leakageImpedanceZero: ");
		result.append(leakageImpedanceZero);
		result.append(')');
		return result.toString();
	}

} //ShortCircuitTestImpl
