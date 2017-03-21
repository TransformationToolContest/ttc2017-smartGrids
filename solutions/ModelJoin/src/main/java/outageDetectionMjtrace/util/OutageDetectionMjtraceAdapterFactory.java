/**
 */
package outageDetectionMjtrace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import outageDetectionMjtrace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage
 * @generated
 */
public class OutageDetectionMjtraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutageDetectionMjtracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageDetectionMjtraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OutageDetectionMjtracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageDetectionMjtraceSwitch<Adapter> modelSwitch =
		new OutageDetectionMjtraceSwitch<Adapter>() {
			@Override
			public Adapter casejoin_MeterAsset_PhysicalDevice_EnergyConsumer(join_MeterAsset_PhysicalDevice_EnergyConsumer object) {
				return createjoin_MeterAsset_PhysicalDevice_EnergyConsumerAdapter();
			}
			@Override
			public Adapter caseref_Location_Location_Location(ref_Location_Location_Location object) {
				return createref_Location_Location_LocationAdapter();
			}
			@Override
			public Adapter caseref_PositionPoint_PositionPoint_Position(ref_PositionPoint_PositionPoint_Position object) {
				return createref_PositionPoint_PositionPoint_PositionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer <em>join Meter Asset Physical Device Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer
	 * @generated
	 */
	public Adapter createjoin_MeterAsset_PhysicalDevice_EnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outageDetectionMjtrace.ref_Location_Location_Location <em>ref Location Location Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outageDetectionMjtrace.ref_Location_Location_Location
	 * @generated
	 */
	public Adapter createref_Location_Location_LocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position <em>ref Position Point Position Point Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position
	 * @generated
	 */
	public Adapter createref_PositionPoint_PositionPoint_PositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OutageDetectionMjtraceAdapterFactory
