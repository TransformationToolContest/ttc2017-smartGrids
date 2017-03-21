/**
 */
package CIM.IEC61970.Informative.Financial.impl;

import CIM.IEC61970.Informative.Financial.*;

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
public class FinancialFactoryImpl extends EFactoryImpl implements FinancialFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinancialFactory init() {
		try {
			FinancialFactory theFinancialFactory = (FinancialFactory)EPackage.Registry.INSTANCE.getEFactory(FinancialPackage.eNS_URI);
			if (theFinancialFactory != null) {
				return theFinancialFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinancialFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialFactoryImpl() {
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
			case FinancialPackage.FINANCIAL_VERSION: return createFinancialVersion();
			case FinancialPackage.MARKETER: return createMarketer();
			case FinancialPackage.INT_SCHED_AGREEMENT: return createIntSchedAgreement();
			case FinancialPackage.TRANSMISSION_PROVIDER: return createTransmissionProvider();
			case FinancialPackage.TRANSMISSION_PRODUCT: return createTransmissionProduct();
			case FinancialPackage.GENERATION_PROVIDER: return createGenerationProvider();
			case FinancialPackage.CUSTOMER_CONSUMER: return createCustomerConsumer();
			case FinancialPackage.OPEN_ACCESS_PRODUCT: return createOpenAccessProduct();
			case FinancialPackage.CONTROL_AREA_OPERATOR: return createControlAreaOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialVersion createFinancialVersion() {
		FinancialVersionImpl financialVersion = new FinancialVersionImpl();
		return financialVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marketer createMarketer() {
		MarketerImpl marketer = new MarketerImpl();
		return marketer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntSchedAgreement createIntSchedAgreement() {
		IntSchedAgreementImpl intSchedAgreement = new IntSchedAgreementImpl();
		return intSchedAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProvider createTransmissionProvider() {
		TransmissionProviderImpl transmissionProvider = new TransmissionProviderImpl();
		return transmissionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionProduct createTransmissionProduct() {
		TransmissionProductImpl transmissionProduct = new TransmissionProductImpl();
		return transmissionProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationProvider createGenerationProvider() {
		GenerationProviderImpl generationProvider = new GenerationProviderImpl();
		return generationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerConsumer createCustomerConsumer() {
		CustomerConsumerImpl customerConsumer = new CustomerConsumerImpl();
		return customerConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAccessProduct createOpenAccessProduct() {
		OpenAccessProductImpl openAccessProduct = new OpenAccessProductImpl();
		return openAccessProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaOperator createControlAreaOperator() {
		ControlAreaOperatorImpl controlAreaOperator = new ControlAreaOperatorImpl();
		return controlAreaOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialPackage getFinancialPackage() {
		return (FinancialPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinancialPackage getPackage() {
		return FinancialPackage.eINSTANCE;
	}

} //FinancialFactoryImpl
