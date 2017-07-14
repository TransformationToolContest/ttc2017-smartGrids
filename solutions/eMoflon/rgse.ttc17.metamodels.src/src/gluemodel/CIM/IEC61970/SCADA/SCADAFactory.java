/**
 */
package gluemodel.CIM.IEC61970.SCADA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage
 * @generated
 */
public interface SCADAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SCADAFactory eINSTANCE = gluemodel.CIM.IEC61970.SCADA.impl.SCADAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link</em>'.
	 * @generated
	 */
	CommunicationLink createCommunicationLink();

	/**
	 * Returns a new object of class '<em>Remote Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Point</em>'.
	 * @generated
	 */
	RemotePoint createRemotePoint();

	/**
	 * Returns a new object of class '<em>Remote Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Unit</em>'.
	 * @generated
	 */
	RemoteUnit createRemoteUnit();

	/**
	 * Returns a new object of class '<em>Remote Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Control</em>'.
	 * @generated
	 */
	RemoteControl createRemoteControl();

	/**
	 * Returns a new object of class '<em>Remote Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Source</em>'.
	 * @generated
	 */
	RemoteSource createRemoteSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SCADAPackage getSCADAPackage();

} //SCADAFactory
