/**
 */
package CIM.IEC61970;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.IEC61970Package
 * @generated
 */
public interface IEC61970Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEC61970Factory eINSTANCE = CIM.IEC61970.impl.IEC61970FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIM Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Version</em>'.
	 * @generated
	 */
	IEC61970CIMVersion createIEC61970CIMVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IEC61970Package getIEC61970Package();

} //IEC61970Factory
