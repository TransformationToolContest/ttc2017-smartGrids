/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLoadControl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage
 * @generated
 */
public interface InfLoadControlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfLoadControlFactory eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Load Mgmt Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Mgmt Record</em>'.
	 * @generated
	 */
	LoadMgmtRecord createLoadMgmtRecord();

	/**
	 * Returns a new object of class '<em>Load Mgmt Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Mgmt Function</em>'.
	 * @generated
	 */
	LoadMgmtFunction createLoadMgmtFunction();

	/**
	 * Returns a new object of class '<em>Load Shed Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Shed Function</em>'.
	 * @generated
	 */
	LoadShedFunction createLoadShedFunction();

	/**
	 * Returns a new object of class '<em>Load Limit Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Limit Function</em>'.
	 * @generated
	 */
	LoadLimitFunction createLoadLimitFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfLoadControlPackage getInfLoadControlPackage();

} //InfLoadControlFactory
