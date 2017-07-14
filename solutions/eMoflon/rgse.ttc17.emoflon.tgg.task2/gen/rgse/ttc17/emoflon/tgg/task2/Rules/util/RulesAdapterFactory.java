/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

import rgse.ttc17.emoflon.tgg.task2.Rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseTieFlow(TieFlow object) {
			return createTieFlowAdapter();
		}

		@Override
		public Adapter casePositionPoint(PositionPoint object) {
			return createPositionPointAdapter();
		}

		@Override
		public Adapter caseNonConformLoad(NonConformLoad object) {
			return createNonConformLoadAdapter();
		}

		@Override
		public Adapter caseServiceDeliveryPointLinkMeterAsset(ServiceDeliveryPointLinkMeterAsset object) {
			return createServiceDeliveryPointLinkMeterAssetAdapter();
		}

		@Override
		public Adapter caseZone(Zone object) {
			return createZoneAdapter();
		}

		@Override
		public Adapter caseLoadArea(LoadArea object) {
			return createLoadAreaAdapter();
		}

		@Override
		public Adapter caseServiceLocation(ServiceLocation object) {
			return createServiceLocationAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseSDPLocation(SDPLocation object) {
			return createSDPLocationAdapter();
		}

		@Override
		public Adapter caseConformLoad(ConformLoad object) {
			return createConformLoadAdapter();
		}

		@Override
		public Adapter caseControlArea(ControlArea object) {
			return createControlAreaAdapter();
		}

		@Override
		public Adapter caseConformLoadGroup(ConformLoadGroup object) {
			return createConformLoadGroupAdapter();
		}

		@Override
		public Adapter caseStationSupply(StationSupply object) {
			return createStationSupplyAdapter();
		}

		@Override
		public Adapter caseTerminal(Terminal object) {
			return createTerminalAdapter();
		}

		@Override
		public Adapter caseServiceDeliveryPoint(ServiceDeliveryPoint object) {
			return createServiceDeliveryPointAdapter();
		}

		@Override
		public Adapter caseEnergyConsumerLinkServiceDeliveryPoint(EnergyConsumerLinkServiceDeliveryPoint object) {
			return createEnergyConsumerLinkServiceDeliveryPointAdapter();
		}

		@Override
		public Adapter caseLoadAreaLinkControlArea(LoadAreaLinkControlArea object) {
			return createLoadAreaLinkControlAreaAdapter();
		}

		@Override
		public Adapter caseGmlPosition(GmlPosition object) {
			return createGmlPositionAdapter();
		}

		@Override
		public Adapter caseNonConformLoadGroup(NonConformLoadGroup object) {
			return createNonConformLoadGroupAdapter();
		}

		@Override
		public Adapter caseWorkLocation(WorkLocation object) {
			return createWorkLocationAdapter();
		}

		@Override
		public Adapter caseTieFlowLinkControlArea(TieFlowLinkControlArea object) {
			return createTieFlowLinkControlAreaAdapter();
		}

		@Override
		public Adapter casePowerSystemResource(PowerSystemResource object) {
			return createPowerSystemResourceAdapter();
		}

		@Override
		public Adapter casePrivateMeterVoltage(PrivateMeterVoltage object) {
			return createPrivateMeterVoltageAdapter();
		}

		@Override
		public Adapter caseLocationLink(LocationLink object) {
			return createLocationLinkAdapter();
		}

		@Override
		public Adapter casePMUVoltageMeter(PMUVoltageMeter object) {
			return createPMUVoltageMeterAdapter();
		}

		@Override
		public Adapter caseSubLoadArea(SubLoadArea object) {
			return createSubLoadAreaAdapter();
		}

		@Override
		public Adapter caseEnergyConsumer(EnergyConsumer object) {
			return createEnergyConsumerAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow
	 * @generated
	 */
	public Adapter createTieFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint
	 * @generated
	 */
	public Adapter createPositionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad
	 * @generated
	 */
	public Adapter createNonConformLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset <em>Service Delivery Point Link Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset
	 * @generated
	 */
	public Adapter createServiceDeliveryPointLinkMeterAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea
	 * @generated
	 */
	public Adapter createLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation
	 * @generated
	 */
	public Adapter createServiceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation <em>SDP Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation
	 * @generated
	 */
	public Adapter createSDPLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad
	 * @generated
	 */
	public Adapter createConformLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea
	 * @generated
	 */
	public Adapter createControlAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup
	 * @generated
	 */
	public Adapter createConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply
	 * @generated
	 */
	public Adapter createStationSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint
	 * @generated
	 */
	public Adapter createServiceDeliveryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint <em>Energy Consumer Link Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint
	 * @generated
	 */
	public Adapter createEnergyConsumerLinkServiceDeliveryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea <em>Load Area Link Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea
	 * @generated
	 */
	public Adapter createLoadAreaLinkControlAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition
	 * @generated
	 */
	public Adapter createGmlPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup
	 * @generated
	 */
	public Adapter createNonConformLoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation <em>Work Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation
	 * @generated
	 */
	public Adapter createWorkLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea <em>Tie Flow Link Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea
	 * @generated
	 */
	public Adapter createTieFlowLinkControlAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage <em>Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage
	 * @generated
	 */
	public Adapter createPrivateMeterVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink <em>Location Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink
	 * @generated
	 */
	public Adapter createLocationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter <em>PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter
	 * @generated
	 */
	public Adapter createPMUVoltageMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea
	 * @generated
	 */
	public Adapter createSubLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer
	 * @generated
	 */
	public Adapter createEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
