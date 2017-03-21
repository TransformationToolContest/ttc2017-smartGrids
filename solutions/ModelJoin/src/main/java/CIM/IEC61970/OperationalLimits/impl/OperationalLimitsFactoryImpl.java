/**
 */
package CIM.IEC61970.OperationalLimits.impl;

import CIM.IEC61970.OperationalLimits.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class OperationalLimitsFactoryImpl extends EFactoryImpl implements OperationalLimitsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationalLimitsFactory init() {
		try {
			OperationalLimitsFactory theOperationalLimitsFactory = (OperationalLimitsFactory)EPackage.Registry.INSTANCE.getEFactory(OperationalLimitsPackage.eNS_URI);
			if (theOperationalLimitsFactory != null) {
				return theOperationalLimitsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationalLimitsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsFactoryImpl() {
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL: return createBranchGroupTerminal();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT: return createOperationalLimit();
			case OperationalLimitsPackage.BRANCH_GROUP: return createBranchGroup();
			case OperationalLimitsPackage.VOLTAGE_LIMIT: return createVoltageLimit();
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT: return createApparentPowerLimit();
			case OperationalLimitsPackage.CURRENT_LIMIT: return createCurrentLimit();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET: return createOperationalLimitSet();
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT: return createActivePowerLimit();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE: return createOperationalLimitType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
				return createOperationalLimitDirectionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
				return convertOperationalLimitDirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroupTerminal createBranchGroupTerminal() {
		BranchGroupTerminalImpl branchGroupTerminal = new BranchGroupTerminalImpl();
		return branchGroupTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimit createOperationalLimit() {
		OperationalLimitImpl operationalLimit = new OperationalLimitImpl();
		return operationalLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroup createBranchGroup() {
		BranchGroupImpl branchGroup = new BranchGroupImpl();
		return branchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLimit createVoltageLimit() {
		VoltageLimitImpl voltageLimit = new VoltageLimitImpl();
		return voltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApparentPowerLimit createApparentPowerLimit() {
		ApparentPowerLimitImpl apparentPowerLimit = new ApparentPowerLimitImpl();
		return apparentPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentLimit createCurrentLimit() {
		CurrentLimitImpl currentLimit = new CurrentLimitImpl();
		return currentLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet createOperationalLimitSet() {
		OperationalLimitSetImpl operationalLimitSet = new OperationalLimitSetImpl();
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivePowerLimit createActivePowerLimit() {
		ActivePowerLimitImpl activePowerLimit = new ActivePowerLimitImpl();
		return activePowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitType createOperationalLimitType() {
		OperationalLimitTypeImpl operationalLimitType = new OperationalLimitTypeImpl();
		return operationalLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitDirectionKind createOperationalLimitDirectionKindFromString(EDataType eDataType, String initialValue) {
		OperationalLimitDirectionKind result = OperationalLimitDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalLimitDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsPackage getOperationalLimitsPackage() {
		return (OperationalLimitsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationalLimitsPackage getPackage() {
		return OperationalLimitsPackage.eINSTANCE;
	}

} //OperationalLimitsFactoryImpl
