/**
 */
package gluemodel.substationStandard.LNNodes.DomainLNs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.LNNodes.DomainLNs.DomainLNsPackage
 * @generated
 */
public interface DomainLNsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainLNsFactory eINSTANCE = gluemodel.substationStandard.LNNodes.DomainLNs.impl.DomainLNsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain LN</em>'.
	 * @generated
	 */
	DomainLN createDomainLN();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainLNsPackage getDomainLNsPackage();

} //DomainLNsFactory
