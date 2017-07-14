/**
 */
package rgse.ttc17.emoflon.tgg.task1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import rgse.ttc17.emoflon.tgg.task1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package
 * @generated
 */
public class Task1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Task1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Task1Package.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task1Switch<Adapter> modelSwitch = new Task1Switch<Adapter>() {
		@Override
		public Adapter caseControlAreaToEnergyConsumer(ControlAreaToEnergyConsumer object) {
			return createControlAreaToEnergyConsumerAdapter();
		}

		@Override
		public Adapter caseLocationToLocation(LocationToLocation object) {
			return createLocationToLocationAdapter();
		}

		@Override
		public Adapter casePhysicalDeviceToEnergyConsumer(PhysicalDeviceToEnergyConsumer object) {
			return createPhysicalDeviceToEnergyConsumerAdapter();
		}

		@Override
		public Adapter casePositionPointToPositionPoint(PositionPointToPositionPoint object) {
			return createPositionPointToPositionPointAdapter();
		}

		@Override
		public Adapter caseMeterAssetToEnergyConsumer(MeterAssetToEnergyConsumer object) {
			return createMeterAssetToEnergyConsumerAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer <em>Control Area To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer
	 * @generated
	 */
	public Adapter createControlAreaToEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation <em>Location To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.LocationToLocation
	 * @generated
	 */
	public Adapter createLocationToLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer <em>Physical Device To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer
	 * @generated
	 */
	public Adapter createPhysicalDeviceToEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint <em>Position Point To Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint
	 * @generated
	 */
	public Adapter createPositionPointToPositionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer <em>Meter Asset To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer
	 * @generated
	 */
	public Adapter createMeterAssetToEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //Task1AdapterFactory
