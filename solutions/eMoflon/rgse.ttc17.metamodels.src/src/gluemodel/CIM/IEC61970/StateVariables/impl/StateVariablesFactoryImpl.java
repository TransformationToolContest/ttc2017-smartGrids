/**
 */
package gluemodel.CIM.IEC61970.StateVariables.impl;

import gluemodel.CIM.IEC61970.StateVariables.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateVariablesFactoryImpl extends EFactoryImpl implements StateVariablesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateVariablesFactory init() {
		try {
			StateVariablesFactory theStateVariablesFactory = (StateVariablesFactory)EPackage.Registry.INSTANCE.getEFactory(StateVariablesPackage.eNS_URI);
			if (theStateVariablesFactory != null) {
				return theStateVariablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateVariablesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariablesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StateVariablesPackage.SV_INJECTION: return createSvInjection();
			case StateVariablesPackage.SV_POWER_FLOW: return createSvPowerFlow();
			case StateVariablesPackage.TOPOLOGICAL_ISLAND: return createTopologicalIsland();
			case StateVariablesPackage.SV_STATUS: return createSvStatus();
			case StateVariablesPackage.STATE_VARIABLE: return createStateVariable();
			case StateVariablesPackage.SV_SHORT_CIRCUIT: return createSvShortCircuit();
			case StateVariablesPackage.SV_TAP_STEP: return createSvTapStep();
			case StateVariablesPackage.SV_VOLTAGE: return createSvVoltage();
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS: return createSvShuntCompensatorSections();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvInjection createSvInjection() {
		SvInjectionImpl svInjection = new SvInjectionImpl();
		return svInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvPowerFlow createSvPowerFlow() {
		SvPowerFlowImpl svPowerFlow = new SvPowerFlowImpl();
		return svPowerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalIsland createTopologicalIsland() {
		TopologicalIslandImpl topologicalIsland = new TopologicalIslandImpl();
		return topologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvStatus createSvStatus() {
		SvStatusImpl svStatus = new SvStatusImpl();
		return svStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable createStateVariable() {
		StateVariableImpl stateVariable = new StateVariableImpl();
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShortCircuit createSvShortCircuit() {
		SvShortCircuitImpl svShortCircuit = new SvShortCircuitImpl();
		return svShortCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvTapStep createSvTapStep() {
		SvTapStepImpl svTapStep = new SvTapStepImpl();
		return svTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvVoltage createSvVoltage() {
		SvVoltageImpl svVoltage = new SvVoltageImpl();
		return svVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShuntCompensatorSections createSvShuntCompensatorSections() {
		SvShuntCompensatorSectionsImpl svShuntCompensatorSections = new SvShuntCompensatorSectionsImpl();
		return svShuntCompensatorSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariablesPackage getStateVariablesPackage() {
		return (StateVariablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateVariablesPackage getPackage() {
		return StateVariablesPackage.eINSTANCE;
	}

} //StateVariablesFactoryImpl
