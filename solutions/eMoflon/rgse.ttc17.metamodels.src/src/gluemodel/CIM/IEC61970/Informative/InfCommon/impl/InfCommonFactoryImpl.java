/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon.impl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.*;

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
public class InfCommonFactoryImpl extends EFactoryImpl implements InfCommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfCommonFactory init() {
		try {
			InfCommonFactory theInfCommonFactory = (InfCommonFactory)EPackage.Registry.INSTANCE.getEFactory(InfCommonPackage.eNS_URI);
			if (theInfCommonFactory != null) {
				return theInfCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfCommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCommonFactoryImpl() {
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
			case InfCommonPackage.DOC_DOC_ROLE: return createDocDocRole();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO: return createScheduleParameterInfo();
			case InfCommonPackage.SCHEDULED_EVENT: return createScheduledEvent();
			case InfCommonPackage.BANK_ACCOUNT: return createBankAccount();
			case InfCommonPackage.DOC_PSR_ROLE: return createDocPsrRole();
			case InfCommonPackage.BUSINESS_ROLE: return createBusinessRole();
			case InfCommonPackage.MARKET_ROLE: return createMarketRole();
			case InfCommonPackage.SKILL: return createSkill();
			case InfCommonPackage.ROLE: return createRole();
			case InfCommonPackage.RATIO: return createRatio();
			case InfCommonPackage.BUSINESS_PLAN: return createBusinessPlan();
			case InfCommonPackage.CRAFT: return createCraft();
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
			case InfCommonPackage.SKILL_LEVEL_KIND:
				return createSkillLevelKindFromString(eDataType, initialValue);
			case InfCommonPackage.MARKET_ROLE_KIND:
				return createMarketRoleKindFromString(eDataType, initialValue);
			case InfCommonPackage.DC_POLARITY_KIND:
				return createDCPolarityKindFromString(eDataType, initialValue);
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
			case InfCommonPackage.SKILL_LEVEL_KIND:
				return convertSkillLevelKindToString(eDataType, instanceValue);
			case InfCommonPackage.MARKET_ROLE_KIND:
				return convertMarketRoleKindToString(eDataType, instanceValue);
			case InfCommonPackage.DC_POLARITY_KIND:
				return convertDCPolarityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocDocRole createDocDocRole() {
		DocDocRoleImpl docDocRole = new DocDocRoleImpl();
		return docDocRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleParameterInfo createScheduleParameterInfo() {
		ScheduleParameterInfoImpl scheduleParameterInfo = new ScheduleParameterInfoImpl();
		return scheduleParameterInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvent createScheduledEvent() {
		ScheduledEventImpl scheduledEvent = new ScheduledEventImpl();
		return scheduledEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccount createBankAccount() {
		BankAccountImpl bankAccount = new BankAccountImpl();
		return bankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocPsrRole createDocPsrRole() {
		DocPsrRoleImpl docPsrRole = new DocPsrRoleImpl();
		return docPsrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRole createBusinessRole() {
		BusinessRoleImpl businessRole = new BusinessRoleImpl();
		return businessRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketRole createMarketRole() {
		MarketRoleImpl marketRole = new MarketRoleImpl();
		return marketRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPlan createBusinessPlan() {
		BusinessPlanImpl businessPlan = new BusinessPlanImpl();
		return businessPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Craft createCraft() {
		CraftImpl craft = new CraftImpl();
		return craft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillLevelKind createSkillLevelKindFromString(EDataType eDataType, String initialValue) {
		SkillLevelKind result = SkillLevelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSkillLevelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketRoleKind createMarketRoleKindFromString(EDataType eDataType, String initialValue) {
		MarketRoleKind result = MarketRoleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarketRoleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCPolarityKind createDCPolarityKindFromString(EDataType eDataType, String initialValue) {
		DCPolarityKind result = DCPolarityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDCPolarityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCommonPackage getInfCommonPackage() {
		return (InfCommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfCommonPackage getPackage() {
		return InfCommonPackage.eINSTANCE;
	}

} //InfCommonFactoryImpl
