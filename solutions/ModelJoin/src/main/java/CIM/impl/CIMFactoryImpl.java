/**
 */
package CIM.impl;

import CIM.CIMFactory;
import CIM.CIMPackage;
import CIM.CIMRoot;
import CIM.CombinedVersion;
import CIM.Stereotype;

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
public class CIMFactoryImpl extends EFactoryImpl implements CIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CIMFactory init() {
		try {
			CIMFactory theCIMFactory = (CIMFactory)EPackage.Registry.INSTANCE.getEFactory(CIMPackage.eNS_URI);
			if (theCIMFactory != null) {
				return theCIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIMFactoryImpl() {
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
			case CIMPackage.CIM_ROOT: return createCIMRoot();
			case CIMPackage.STEREOTYPE: return createStereotype();
			case CIMPackage.COMBINED_VERSION: return createCombinedVersion();
			case CIMPackage.PACKAGE: return createPackage();
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
			case CIMPackage.ENUMERATED_TYPE:
				return createEnumeratedTypeFromString(eDataType, initialValue);
			case CIMPackage.POWER_ROC_PER_MIN:
				return createPowerROCPerMinFromString(eDataType, initialValue);
			case CIMPackage.FLOWGATE_IDC_TYPE:
				return createFlowgateIdcTypeFromString(eDataType, initialValue);
			case CIMPackage.QUANTITY:
				return createQuantityFromString(eDataType, initialValue);
			case CIMPackage.ENERGY_AS_MWH:
				return createEnergyAsMWhFromString(eDataType, initialValue);
			case CIMPackage.PENALTY_FACTOR:
				return createPenaltyFactorFromString(eDataType, initialValue);
			case CIMPackage.FREQ_BIAS_FACTOR:
				return createFreqBiasFactorFromString(eDataType, initialValue);
			case CIMPackage.RATE_OF_CHANGE:
				return createRateOfChangeFromString(eDataType, initialValue);
			case CIMPackage.FLOWGATE_AFC_USE_CODE:
				return createFlowgateAfcUseCodeFromString(eDataType, initialValue);
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
			case CIMPackage.ENUMERATED_TYPE:
				return convertEnumeratedTypeToString(eDataType, instanceValue);
			case CIMPackage.POWER_ROC_PER_MIN:
				return convertPowerROCPerMinToString(eDataType, instanceValue);
			case CIMPackage.FLOWGATE_IDC_TYPE:
				return convertFlowgateIdcTypeToString(eDataType, instanceValue);
			case CIMPackage.QUANTITY:
				return convertQuantityToString(eDataType, instanceValue);
			case CIMPackage.ENERGY_AS_MWH:
				return convertEnergyAsMWhToString(eDataType, instanceValue);
			case CIMPackage.PENALTY_FACTOR:
				return convertPenaltyFactorToString(eDataType, instanceValue);
			case CIMPackage.FREQ_BIAS_FACTOR:
				return convertFreqBiasFactorToString(eDataType, instanceValue);
			case CIMPackage.RATE_OF_CHANGE:
				return convertRateOfChangeToString(eDataType, instanceValue);
			case CIMPackage.FLOWGATE_AFC_USE_CODE:
				return convertFlowgateAfcUseCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIMRoot createCIMRoot() {
		CIMRootImpl cimRoot = new CIMRootImpl();
		return cimRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedVersion createCombinedVersion() {
		CombinedVersionImpl combinedVersion = new CombinedVersionImpl();
		return combinedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEnumeratedTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumeratedTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPowerROCPerMinFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerROCPerMinToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFlowgateIdcTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowgateIdcTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createQuantityFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEnergyAsMWhFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergyAsMWhToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPenaltyFactorFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPenaltyFactorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFreqBiasFactorFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFreqBiasFactorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRateOfChangeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateOfChangeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFlowgateAfcUseCodeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowgateAfcUseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIMPackage getCIMPackage() {
		return (CIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CIMPackage getPackage() {
		return CIMPackage.eINSTANCE;
	}

} //CIMFactoryImpl
