/**
 */
package gluemodel.CIM.IEC61968.Customers.impl;

import gluemodel.CIM.IEC61968.Customers.*;

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
public class CustomersFactoryImpl extends EFactoryImpl implements CustomersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomersFactory init() {
		try {
			CustomersFactory theCustomersFactory = (CustomersFactory)EPackage.Registry.INSTANCE.getEFactory(CustomersPackage.eNS_URI);
			if (theCustomersFactory != null) {
				return theCustomersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomersFactoryImpl() {
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
			case CustomersPackage.CUSTOMER: return createCustomer();
			case CustomersPackage.SERVICE_CATEGORY: return createServiceCategory();
			case CustomersPackage.PRICING_STRUCTURE: return createPricingStructure();
			case CustomersPackage.SERVICE_LOCATION: return createServiceLocation();
			case CustomersPackage.CUSTOMER_ACCOUNT: return createCustomerAccount();
			case CustomersPackage.CUSTOMER_AGREEMENT: return createCustomerAgreement();
			case CustomersPackage.TARIFF: return createTariff();
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
			case CustomersPackage.CUSTOMER_KIND:
				return createCustomerKindFromString(eDataType, initialValue);
			case CustomersPackage.SERVICE_KIND:
				return createServiceKindFromString(eDataType, initialValue);
			case CustomersPackage.REVENUE_KIND:
				return createRevenueKindFromString(eDataType, initialValue);
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
			case CustomersPackage.CUSTOMER_KIND:
				return convertCustomerKindToString(eDataType, instanceValue);
			case CustomersPackage.SERVICE_KIND:
				return convertServiceKindToString(eDataType, instanceValue);
			case CustomersPackage.REVENUE_KIND:
				return convertRevenueKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory createServiceCategory() {
		ServiceCategoryImpl serviceCategory = new ServiceCategoryImpl();
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure createPricingStructure() {
		PricingStructureImpl pricingStructure = new PricingStructureImpl();
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation createServiceLocation() {
		ServiceLocationImpl serviceLocation = new ServiceLocationImpl();
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount createCustomerAccount() {
		CustomerAccountImpl customerAccount = new CustomerAccountImpl();
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement createCustomerAgreement() {
		CustomerAgreementImpl customerAgreement = new CustomerAgreementImpl();
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tariff createTariff() {
		TariffImpl tariff = new TariffImpl();
		return tariff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerKind createCustomerKindFromString(EDataType eDataType, String initialValue) {
		CustomerKind result = CustomerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceKind createServiceKindFromString(EDataType eDataType, String initialValue) {
		ServiceKind result = ServiceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevenueKind createRevenueKindFromString(EDataType eDataType, String initialValue) {
		RevenueKind result = RevenueKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevenueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomersPackage getCustomersPackage() {
		return (CustomersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CustomersPackage getPackage() {
		return CustomersPackage.eINSTANCE;
	}

} //CustomersFactoryImpl
