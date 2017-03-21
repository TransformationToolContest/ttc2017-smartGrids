/**
 */
package CIM.IEC61968.LoadControl.impl;

import CIM.IEC61968.LoadControl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadControlFactoryImpl extends EFactoryImpl implements LoadControlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadControlFactory init() {
		try {
			LoadControlFactory theLoadControlFactory = (LoadControlFactory)EPackage.Registry.INSTANCE.getEFactory(LoadControlPackage.eNS_URI);
			if (theLoadControlFactory != null) {
				return theLoadControlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoadControlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadControlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO: return createRemoteConnectDisconnectInfo();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION: return createConnectDisconnectFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteConnectDisconnectInfo createRemoteConnectDisconnectInfo() {
		RemoteConnectDisconnectInfoImpl remoteConnectDisconnectInfo = new RemoteConnectDisconnectInfoImpl();
		return remoteConnectDisconnectInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectDisconnectFunction createConnectDisconnectFunction() {
		ConnectDisconnectFunctionImpl connectDisconnectFunction = new ConnectDisconnectFunctionImpl();
		return connectDisconnectFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadControlPackage getLoadControlPackage() {
		return (LoadControlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoadControlPackage getPackage() {
		return LoadControlPackage.eINSTANCE;
	}

} //LoadControlFactoryImpl
