/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

import rgse.ttc17.emoflon.tgg.task1.Rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage
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
		public Adapter caseEnergyConsumerWithIDConfLoad(EnergyConsumerWithIDConfLoad object) {
			return createEnergyConsumerWithIDConfLoadAdapter();
		}

		@Override
		public Adapter caseGmlPosition(GmlPosition object) {
			return createGmlPositionAdapter();
		}

		@Override
		public Adapter casePositionPoint(PositionPoint object) {
			return createPositionPointAdapter();
		}

		@Override
		public Adapter caseWorkLocation(WorkLocation object) {
			return createWorkLocationAdapter();
		}

		@Override
		public Adapter caseEnergyConsumer(EnergyConsumer object) {
			return createEnergyConsumerAdapter();
		}

		@Override
		public Adapter casePositionPointLink(PositionPointLink object) {
			return createPositionPointLinkAdapter();
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
		public Adapter caseEnergyConsumerWithID(EnergyConsumerWithID object) {
			return createEnergyConsumerWithIDAdapter();
		}

		@Override
		public Adapter caseEnergyConsumerWithIDNonConfLoad(EnergyConsumerWithIDNonConfLoad object) {
			return createEnergyConsumerWithIDNonConfLoadAdapter();
		}

		@Override
		public Adapter caseLocationLink(LocationLink object) {
			return createLocationLinkAdapter();
		}

		@Override
		public Adapter caseSDPLocation(SDPLocation object) {
			return createSDPLocationAdapter();
		}

		@Override
		public Adapter caseZone(Zone object) {
			return createZoneAdapter();
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
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad <em>Energy Consumer With ID Conf Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDConfLoad
	 * @generated
	 */
	public Adapter createEnergyConsumerWithIDConfLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.GmlPosition
	 * @generated
	 */
	public Adapter createGmlPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPoint
	 * @generated
	 */
	public Adapter createPositionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation <em>Work Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.WorkLocation
	 * @generated
	 */
	public Adapter createWorkLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer
	 * @generated
	 */
	public Adapter createEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink <em>Position Point Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.PositionPointLink
	 * @generated
	 */
	public Adapter createPositionPointLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.ServiceLocation
	 * @generated
	 */
	public Adapter createServiceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID <em>Energy Consumer With ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithID
	 * @generated
	 */
	public Adapter createEnergyConsumerWithIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad <em>Energy Consumer With ID Non Conf Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumerWithIDNonConfLoad
	 * @generated
	 */
	public Adapter createEnergyConsumerWithIDNonConfLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink <em>Location Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.LocationLink
	 * @generated
	 */
	public Adapter createLocationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation <em>SDP Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.SDPLocation
	 * @generated
	 */
	public Adapter createSDPLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rgse.ttc17.emoflon.tgg.task1.Rules.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rgse.ttc17.emoflon.tgg.task1.Rules.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
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
