/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage
 * @generated
 */
public interface LNGroupTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupTFactory eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group T</em>'.
	 * @generated
	 */
	GroupT createGroupT();

	/**
	 * Returns a new object of class '<em>TCTR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCTR</em>'.
	 * @generated
	 */
	TCTR createTCTR();

	/**
	 * Returns a new object of class '<em>TVTR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TVTR</em>'.
	 * @generated
	 */
	TVTR createTVTR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LNGroupTPackage getLNGroupTPackage();

} //LNGroupTFactory
