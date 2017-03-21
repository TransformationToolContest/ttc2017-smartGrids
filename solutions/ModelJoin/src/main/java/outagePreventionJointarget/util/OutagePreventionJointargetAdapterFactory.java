/**
 */
package outagePreventionJointarget.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import outagePreventionJointarget.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage
 * @generated
 */
public class OutagePreventionJointargetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutagePreventionJointargetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionJointargetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OutagePreventionJointargetPackage.eINSTANCE;
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
	protected OutagePreventionJointargetSwitch<Adapter> modelSwitch =
		new OutagePreventionJointargetSwitch<Adapter>() {
			@Override
			public Adapter casePMUVoltageMeter(PMUVoltageMeter object) {
				return createPMUVoltageMeterAdapter();
			}
			@Override
			public Adapter casePrivateMeterVoltage(PrivateMeterVoltage object) {
				return createPrivateMeterVoltageAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter casePositionPoint(PositionPoint object) {
				return createPositionPointAdapter();
			}
			@Override
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseConductingEquipment(ConductingEquipment object) {
				return createConductingEquipmentAdapter();
			}
			@Override
			public Adapter caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			@Override
			public Adapter caseTieFlow(TieFlow object) {
				return createTieFlowAdapter();
			}
			@Override
			public Adapter caseControlArea(ControlArea object) {
				return createControlAreaAdapter();
			}
			@Override
			public Adapter caseEndDeviceAsset(EndDeviceAsset object) {
				return createEndDeviceAssetAdapter();
			}
			@Override
			public Adapter caseServiceDeliveryPoint(ServiceDeliveryPoint object) {
				return createServiceDeliveryPointAdapter();
			}
			@Override
			public Adapter caseEnergyConsumer(EnergyConsumer object) {
				return createEnergyConsumerAdapter();
			}
			@Override
			public Adapter caseConformLoad(ConformLoad object) {
				return createConformLoadAdapter();
			}
			@Override
			public Adapter caseConformLoadGroup(ConformLoadGroup object) {
				return createConformLoadGroupAdapter();
			}
			@Override
			public Adapter caseLoadGroup(LoadGroup object) {
				return createLoadGroupAdapter();
			}
			@Override
			public Adapter caseSubLoadArea(SubLoadArea object) {
				return createSubLoadAreaAdapter();
			}
			@Override
			public Adapter caseLoadArea(LoadArea object) {
				return createLoadAreaAdapter();
			}
			@Override
			public Adapter caseNonConformLoad(NonConformLoad object) {
				return createNonConformLoadAdapter();
			}
			@Override
			public Adapter caseNonConformLoadGroup(NonConformLoadGroup object) {
				return createNonConformLoadGroupAdapter();
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
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.PMUVoltageMeter <em>PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.PMUVoltageMeter
	 * @generated
	 */
	public Adapter createPMUVoltageMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.PrivateMeterVoltage <em>Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.PrivateMeterVoltage
	 * @generated
	 */
	public Adapter createPrivateMeterVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.PositionPoint
	 * @generated
	 */
	public Adapter createPositionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.ConductingEquipment
	 * @generated
	 */
	public Adapter createConductingEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.TieFlow
	 * @generated
	 */
	public Adapter createTieFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.ControlArea
	 * @generated
	 */
	public Adapter createControlAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.EndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.EndDeviceAsset
	 * @generated
	 */
	public Adapter createEndDeviceAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.ServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.ServiceDeliveryPoint
	 * @generated
	 */
	public Adapter createServiceDeliveryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.EnergyConsumer
	 * @generated
	 */
	public Adapter createEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.ConformLoad
	 * @generated
	 */
	public Adapter createConformLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.ConformLoadGroup
	 * @generated
	 */
	public Adapter createConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.LoadGroup
	 * @generated
	 */
	public Adapter createLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.SubLoadArea
	 * @generated
	 */
	public Adapter createSubLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.LoadArea
	 * @generated
	 */
	public Adapter createLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.NonConformLoad
	 * @generated
	 */
	public Adapter createNonConformLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionJointarget.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionJointarget.NonConformLoadGroup
	 * @generated
	 */
	public Adapter createNonConformLoadGroupAdapter() {
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

} //OutagePreventionJointargetAdapterFactory
