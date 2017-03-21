/**
 */
package CIM.IEC61968.LoadControl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.LoadControl.LoadControlPackage
 * @generated
 */
public interface LoadControlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoadControlFactory eINSTANCE = CIM.IEC61968.LoadControl.impl.LoadControlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Remote Connect Disconnect Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Connect Disconnect Info</em>'.
	 * @generated
	 */
	RemoteConnectDisconnectInfo createRemoteConnectDisconnectInfo();

	/**
	 * Returns a new object of class '<em>Connect Disconnect Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Disconnect Function</em>'.
	 * @generated
	 */
	ConnectDisconnectFunction createConnectDisconnectFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoadControlPackage getLoadControlPackage();

} //LoadControlFactory
