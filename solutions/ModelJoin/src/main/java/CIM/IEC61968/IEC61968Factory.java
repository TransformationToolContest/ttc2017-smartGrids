/**
 */
package CIM.IEC61968;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.IEC61968Package
 * @generated
 */
public interface IEC61968Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEC61968Factory eINSTANCE = CIM.IEC61968.impl.IEC61968FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIM Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Version</em>'.
	 * @generated
	 */
	IEC61968CIMVersion createIEC61968CIMVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IEC61968Package getIEC61968Package();

} //IEC61968Factory
