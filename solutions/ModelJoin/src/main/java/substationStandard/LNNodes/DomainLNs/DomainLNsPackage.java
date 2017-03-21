/**
 */
package substationStandard.LNNodes.DomainLNs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see substationStandard.LNNodes.DomainLNs.DomainLNsFactory
 * @model kind="package"
 * @generated
 */
public interface DomainLNsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DomainLNs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/DomainLNs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainLNsPackage eINSTANCE = substationStandard.LNNodes.DomainLNs.impl.DomainLNsPackageImpl.init();

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl <em>Domain LN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl
	 * @see substationStandard.LNNodes.DomainLNs.impl.DomainLNsPackageImpl#getDomainLN()
	 * @generated
	 */
	int DOMAIN_LN = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LN__MODE = 0;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LN__BEHAVIOUR = 1;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LN__HEALTH = 2;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LN__NAME_PLT = 3;

	/**
	 * The number of structural features of the '<em>Domain LN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain LN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_LN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.DomainLNs.DomainLN <em>Domain LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain LN</em>'.
	 * @see substationStandard.LNNodes.DomainLNs.DomainLN
	 * @generated
	 */
	EClass getDomainLN();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see substationStandard.LNNodes.DomainLNs.DomainLN#getMode()
	 * @see #getDomainLN()
	 * @generated
	 */
	EReference getDomainLN_Mode();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behaviour</em>'.
	 * @see substationStandard.LNNodes.DomainLNs.DomainLN#getBehaviour()
	 * @see #getDomainLN()
	 * @generated
	 */
	EReference getDomainLN_Behaviour();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getHealth <em>Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Health</em>'.
	 * @see substationStandard.LNNodes.DomainLNs.DomainLN#getHealth()
	 * @see #getDomainLN()
	 * @generated
	 */
	EReference getDomainLN_Health();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.DomainLNs.DomainLN#getNamePlt <em>Name Plt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Plt</em>'.
	 * @see substationStandard.LNNodes.DomainLNs.DomainLN#getNamePlt()
	 * @see #getDomainLN()
	 * @generated
	 */
	EReference getDomainLN_NamePlt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainLNsFactory getDomainLNsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl <em>Domain LN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl
		 * @see substationStandard.LNNodes.DomainLNs.impl.DomainLNsPackageImpl#getDomainLN()
		 * @generated
		 */
		EClass DOMAIN_LN = eINSTANCE.getDomainLN();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_LN__MODE = eINSTANCE.getDomainLN_Mode();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_LN__BEHAVIOUR = eINSTANCE.getDomainLN_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Health</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_LN__HEALTH = eINSTANCE.getDomainLN_Health();

		/**
		 * The meta object literal for the '<em><b>Name Plt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_LN__NAME_PLT = eINSTANCE.getDomainLN_NamePlt();

	}

} //DomainLNsPackage
