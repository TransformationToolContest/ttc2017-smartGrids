/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage
 * @generated
 */
public interface LNGroupAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupAFactory eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group A</em>'.
	 * @generated
	 */
	GroupA createGroupA();

	/**
	 * Returns a new object of class '<em>ANCR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ANCR</em>'.
	 * @generated
	 */
	ANCR createANCR();

	/**
	 * Returns a new object of class '<em>ARCO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARCO</em>'.
	 * @generated
	 */
	ARCO createARCO();

	/**
	 * Returns a new object of class '<em>ATCC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATCC</em>'.
	 * @generated
	 */
	ATCC createATCC();

	/**
	 * Returns a new object of class '<em>AVCO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVCO</em>'.
	 * @generated
	 */
	AVCO createAVCO();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LNGroupAPackage getLNGroupAPackage();

} //LNGroupAFactory
