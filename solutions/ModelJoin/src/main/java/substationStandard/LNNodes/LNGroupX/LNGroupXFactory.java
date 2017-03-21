/**
 */
package substationStandard.LNNodes.LNGroupX;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see substationStandard.LNNodes.LNGroupX.LNGroupXPackage
 * @generated
 */
public interface LNGroupXFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupXFactory eINSTANCE = substationStandard.LNNodes.LNGroupX.impl.LNGroupXFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group X</em>'.
	 * @generated
	 */
	GroupX createGroupX();

	/**
	 * Returns a new object of class '<em>XCBR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XCBR</em>'.
	 * @generated
	 */
	XCBR createXCBR();

	/**
	 * Returns a new object of class '<em>XSWI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSWI</em>'.
	 * @generated
	 */
	XSWI createXSWI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LNGroupXPackage getLNGroupXPackage();

} //LNGroupXFactory
