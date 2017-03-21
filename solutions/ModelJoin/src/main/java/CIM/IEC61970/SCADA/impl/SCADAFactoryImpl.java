/**
 */
package CIM.IEC61970.SCADA.impl;

import CIM.IEC61970.SCADA.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SCADAFactoryImpl extends EFactoryImpl implements SCADAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SCADAFactory init() {
		try {
			SCADAFactory theSCADAFactory = (SCADAFactory)EPackage.Registry.INSTANCE.getEFactory(SCADAPackage.eNS_URI);
			if (theSCADAFactory != null) {
				return theSCADAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SCADAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCADAFactoryImpl() {
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
			case SCADAPackage.COMMUNICATION_LINK: return createCommunicationLink();
			case SCADAPackage.REMOTE_POINT: return createRemotePoint();
			case SCADAPackage.REMOTE_UNIT: return createRemoteUnit();
			case SCADAPackage.REMOTE_CONTROL: return createRemoteControl();
			case SCADAPackage.REMOTE_SOURCE: return createRemoteSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SCADAPackage.SOURCE:
				return createSourceFromString(eDataType, initialValue);
			case SCADAPackage.REMOTE_UNIT_TYPE:
				return createRemoteUnitTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SCADAPackage.SOURCE:
				return convertSourceToString(eDataType, instanceValue);
			case SCADAPackage.REMOTE_UNIT_TYPE:
				return convertRemoteUnitTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink createCommunicationLink() {
		CommunicationLinkImpl communicationLink = new CommunicationLinkImpl();
		return communicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemotePoint createRemotePoint() {
		RemotePointImpl remotePoint = new RemotePointImpl();
		return remotePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteUnit createRemoteUnit() {
		RemoteUnitImpl remoteUnit = new RemoteUnitImpl();
		return remoteUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteControl createRemoteControl() {
		RemoteControlImpl remoteControl = new RemoteControlImpl();
		return remoteControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteSource createRemoteSource() {
		RemoteSourceImpl remoteSource = new RemoteSourceImpl();
		return remoteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSourceFromString(EDataType eDataType, String initialValue) {
		Source result = Source.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteUnitType createRemoteUnitTypeFromString(EDataType eDataType, String initialValue) {
		RemoteUnitType result = RemoteUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCADAPackage getSCADAPackage() {
		return (SCADAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SCADAPackage getPackage() {
		return SCADAPackage.eINSTANCE;
	}

} //SCADAFactoryImpl
