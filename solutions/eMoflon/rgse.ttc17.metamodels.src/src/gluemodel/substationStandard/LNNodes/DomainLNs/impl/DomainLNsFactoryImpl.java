/**
 */
package gluemodel.substationStandard.LNNodes.DomainLNs.impl;

import gluemodel.substationStandard.LNNodes.DomainLNs.*;

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
public class DomainLNsFactoryImpl extends EFactoryImpl implements DomainLNsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainLNsFactory init() {
		try {
			DomainLNsFactory theDomainLNsFactory = (DomainLNsFactory)EPackage.Registry.INSTANCE.getEFactory(DomainLNsPackage.eNS_URI);
			if (theDomainLNsFactory != null) {
				return theDomainLNsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainLNsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainLNsFactoryImpl() {
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
			case DomainLNsPackage.DOMAIN_LN: return createDomainLN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainLN createDomainLN() {
		DomainLNImpl domainLN = new DomainLNImpl();
		return domainLN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainLNsPackage getDomainLNsPackage() {
		return (DomainLNsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainLNsPackage getPackage() {
		return DomainLNsPackage.eINSTANCE;
	}

} //DomainLNsFactoryImpl
