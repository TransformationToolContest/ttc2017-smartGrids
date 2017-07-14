/**
 */
package gluemodel.CIM.IEC61970.Equivalents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Equivalents.EquivalentsPackage
 * @generated
 */
public interface EquivalentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EquivalentsFactory eINSTANCE = gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Equivalent Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Equipment</em>'.
	 * @generated
	 */
	EquivalentEquipment createEquivalentEquipment();

	/**
	 * Returns a new object of class '<em>Equivalent Injection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Injection</em>'.
	 * @generated
	 */
	EquivalentInjection createEquivalentInjection();

	/**
	 * Returns a new object of class '<em>Equivalent Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Network</em>'.
	 * @generated
	 */
	EquivalentNetwork createEquivalentNetwork();

	/**
	 * Returns a new object of class '<em>Equivalent Shunt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Shunt</em>'.
	 * @generated
	 */
	EquivalentShunt createEquivalentShunt();

	/**
	 * Returns a new object of class '<em>Equivalent Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalent Branch</em>'.
	 * @generated
	 */
	EquivalentBranch createEquivalentBranch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EquivalentsPackage getEquivalentsPackage();

} //EquivalentsFactory
