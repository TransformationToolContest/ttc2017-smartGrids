/**
 */
package CIM.IEC61970.Informative.Reservation.impl;

import CIM.IEC61970.Informative.Reservation.*;

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
public class ReservationFactoryImpl extends EFactoryImpl implements ReservationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReservationFactory init() {
		try {
			ReservationFactory theReservationFactory = (ReservationFactory)EPackage.Registry.INSTANCE.getEFactory(ReservationPackage.eNS_URI);
			if (theReservationFactory != null) {
				return theReservationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReservationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationFactoryImpl() {
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
			case ReservationPackage.TRANSMISSION_PATH: return createTransmissionPath();
			case ReservationPackage.TIE_POINT: return createTiePoint();
			case ReservationPackage.SERVICE_RESERVATION: return createServiceReservation();
			case ReservationPackage.SERVICE_POINT: return createServicePoint();
			case ReservationPackage.ANCILLARY_SERVICE: return createAncillaryService();
			case ReservationPackage.RESERVATION_VERSION: return createReservationVersion();
			case ReservationPackage.TRANSMISSION_SERVICE: return createTransmissionService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionPath createTransmissionPath() {
		TransmissionPathImpl transmissionPath = new TransmissionPathImpl();
		return transmissionPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint createTiePoint() {
		TiePointImpl tiePoint = new TiePointImpl();
		return tiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReservation createServiceReservation() {
		ServiceReservationImpl serviceReservation = new ServiceReservationImpl();
		return serviceReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePoint createServicePoint() {
		ServicePointImpl servicePoint = new ServicePointImpl();
		return servicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AncillaryService createAncillaryService() {
		AncillaryServiceImpl ancillaryService = new AncillaryServiceImpl();
		return ancillaryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationVersion createReservationVersion() {
		ReservationVersionImpl reservationVersion = new ReservationVersionImpl();
		return reservationVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionService createTransmissionService() {
		TransmissionServiceImpl transmissionService = new TransmissionServiceImpl();
		return transmissionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationPackage getReservationPackage() {
		return (ReservationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReservationPackage getPackage() {
		return ReservationPackage.eINSTANCE;
	}

} //ReservationFactoryImpl
