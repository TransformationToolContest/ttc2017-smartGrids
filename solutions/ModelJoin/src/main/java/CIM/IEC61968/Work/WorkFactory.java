/**
 */
package CIM.IEC61968.Work;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.Work.WorkPackage
 * @generated
 */
public interface WorkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkFactory eINSTANCE = CIM.IEC61968.Work.impl.WorkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work</em>'.
	 * @generated
	 */
	Work createWork();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkPackage getWorkPackage();

} //WorkFactory
