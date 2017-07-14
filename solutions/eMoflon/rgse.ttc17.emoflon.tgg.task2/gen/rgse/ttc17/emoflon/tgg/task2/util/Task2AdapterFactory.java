/**
 */
package rgse.ttc17.emoflon.tgg.task2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import rgse.ttc17.emoflon.tgg.task2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package
 * @generated
 */
public class Task2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Task2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Task2Package.eINSTANCE;
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
	protected Task2Switch<Adapter> modelSwitch = new Task2Switch<Adapter>() {
		@Override
		public Adapter caseControlAreaToControlSrea(ControlAreaToControlSrea object) {
			return createControlAreaToControlSreaAdapter();
		}

		@Override
		public Adapter caseServiceDeliveryPointToServiceDeliveryPoint(
				ServiceDeliveryPointToServiceDeliveryPoint object) {
			return createServiceDeliveryPointToServiceDeliveryPointAdapter();
		}

		@Override
		public Adapter casePowerSystemResourceToPowerSystemResource(PowerSystemResourceToPowerSystemResource object) {
			return createPowerSystemResourceToPowerSystemResourceAdapter();
		}

		@Override
		public Adapter casePhysicalDeviceToPrivateMeterVoltage(PhysicalDeviceToPrivateMeterVoltage object) {
			return createPhysicalDeviceToPrivateMeterVoltageAdapter();
		}

		@Override
		public Adapter caseLocationToLocation(LocationToLocation object) {
			return createLocationToLocationAdapter();
		}

		@Override
		public Adapter caseEnergyConsumerToEnergyConsumer(EnergyConsumerToEnergyConsumer object) {
			return createEnergyConsumerToEnergyConsumerAdapter();
		}

		@Override
		public Adapter caseMeterAssetToPrivateMeterVoltage(MeterAssetToPrivateMeterVoltage object) {
			return createMeterAssetToPrivateMeterVoltageAdapter();
		}

		@Override
		public Adapter caseMeterAssetToMMXUToVoltageMeter(MeterAssetToMMXUToVoltageMeter object) {
			return createMeterAssetToMMXUToVoltageMeterAdapter();
		}

		@Override
		public Adapter caseMMXUToPMUVoltageMeter(MMXUToPMUVoltageMeter object) {
			return createMMXUToPMUVoltageMeterAdapter();
		}

		@Override
		public Adapter caseConformLoadGroupToConformLoadGroup(ConformLoadGroupToConformLoadGroup object) {
			return createConformLoadGroupToConformLoadGroupAdapter();
		}

		@Override
		public Adapter caseSubLoadAreaToSubLoadArea(SubLoadAreaToSubLoadArea object) {
			return createSubLoadAreaToSubLoadAreaAdapter();
		}

		@Override
		public Adapter caseLoadAreaToLoadArea(LoadAreaToLoadArea object) {
			return createLoadAreaToLoadAreaAdapter();
		}

		@Override
		public Adapter caseMeterAssetToPMUVoltageMeter(MeterAssetToPMUVoltageMeter object) {
			return createMeterAssetToPMUVoltageMeterAdapter();
		}

		@Override
		public Adapter casePositionPointToPositionPoint(PositionPointToPositionPoint object) {
			return createPositionPointToPositionPointAdapter();
		}

		@Override
		public Adapter caseNonConformLoadGroupNonToConformLoadGroup(NonConformLoadGroupNonToConformLoadGroup object) {
			return createNonConformLoadGroupNonToConformLoadGroupAdapter();
		}

		@Override
		public Adapter caseTerminalToTerminal(TerminalToTerminal object) {
			return createTerminalToTerminalAdapter();
		}

		@Override
		public Adapter caseTieFlowToTieFlow(TieFlowToTieFlow object) {
			return createTieFlowToTieFlowAdapter();
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
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea <em>Control Area To Control Srea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea
	 * @generated
	 */
	public Adapter createControlAreaToControlSreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint <em>Service Delivery Point To Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint
	 * @generated
	 */
	public Adapter createServiceDeliveryPointToServiceDeliveryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource <em>Power System Resource To Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceToPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage <em>Physical Device To Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage
	 * @generated
	 */
	public Adapter createPhysicalDeviceToPrivateMeterVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.LocationToLocation <em>Location To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.LocationToLocation
	 * @generated
	 */
	public Adapter createLocationToLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer <em>Energy Consumer To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer
	 * @generated
	 */
	public Adapter createEnergyConsumerToEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage <em>Meter Asset To Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage
	 * @generated
	 */
	public Adapter createMeterAssetToPrivateMeterVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter <em>Meter Asset To MMXU To Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter
	 * @generated
	 */
	public Adapter createMeterAssetToMMXUToVoltageMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter <em>MMXU To PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter
	 * @generated
	 */
	public Adapter createMMXUToPMUVoltageMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup <em>Conform Load Group To Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup
	 * @generated
	 */
	public Adapter createConformLoadGroupToConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea <em>Sub Load Area To Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea
	 * @generated
	 */
	public Adapter createSubLoadAreaToSubLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea <em>Load Area To Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea
	 * @generated
	 */
	public Adapter createLoadAreaToLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter <em>Meter Asset To PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter
	 * @generated
	 */
	public Adapter createMeterAssetToPMUVoltageMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint <em>Position Point To Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint
	 * @generated
	 */
	public Adapter createPositionPointToPositionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup <em>Non Conform Load Group Non To Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup
	 * @generated
	 */
	public Adapter createNonConformLoadGroupNonToConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal <em>Terminal To Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal
	 * @generated
	 */
	public Adapter createTerminalToTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow <em>Tie Flow To Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow
	 * @generated
	 */
	public Adapter createTieFlowToTieFlowAdapter() {
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

} //Task2AdapterFactory
