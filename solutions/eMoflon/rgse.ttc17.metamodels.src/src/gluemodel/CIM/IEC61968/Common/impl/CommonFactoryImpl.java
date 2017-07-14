/**
 */
package gluemodel.CIM.IEC61968.Common.impl;

import gluemodel.CIM.IEC61968.Common.*;

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
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory(CommonPackage.eNS_URI);
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl() {
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
			case CommonPackage.DATE_TIME_INTERVAL: return createDateTimeInterval();
			case CommonPackage.POSTAL_ADDRESS: return createPostalAddress();
			case CommonPackage.ORGANISATION: return createOrganisation();
			case CommonPackage.TELEPHONE_NUMBER: return createTelephoneNumber();
			case CommonPackage.STREET_ADDRESS: return createStreetAddress();
			case CommonPackage.TIME_SCHEDULE: return createTimeSchedule();
			case CommonPackage.DOCUMENT: return createDocument();
			case CommonPackage.POSITION_POINT: return createPositionPoint();
			case CommonPackage.COORDINATE_SYSTEM: return createCoordinateSystem();
			case CommonPackage.USER_ATTRIBUTE: return createUserAttribute();
			case CommonPackage.LOCATION: return createLocation();
			case CommonPackage.STREET_DETAIL: return createStreetDetail();
			case CommonPackage.AGREEMENT: return createAgreement();
			case CommonPackage.ACTIVITY_RECORD: return createActivityRecord();
			case CommonPackage.ELECTRONIC_ADDRESS: return createElectronicAddress();
			case CommonPackage.STATUS: return createStatus();
			case CommonPackage.TOWN_DETAIL: return createTownDetail();
			case CommonPackage.TIME_POINT: return createTimePoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval createDateTimeInterval() {
		DateTimeIntervalImpl dateTimeInterval = new DateTimeIntervalImpl();
		return dateTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress createPostalAddress() {
		PostalAddressImpl postalAddress = new PostalAddressImpl();
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber createTelephoneNumber() {
		TelephoneNumberImpl telephoneNumber = new TelephoneNumberImpl();
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress createStreetAddress() {
		StreetAddressImpl streetAddress = new StreetAddressImpl();
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSchedule createTimeSchedule() {
		TimeScheduleImpl timeSchedule = new TimeScheduleImpl();
		return timeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint createPositionPoint() {
		PositionPointImpl positionPoint = new PositionPointImpl();
		return positionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem createCoordinateSystem() {
		CoordinateSystemImpl coordinateSystem = new CoordinateSystemImpl();
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttribute createUserAttribute() {
		UserAttributeImpl userAttribute = new UserAttributeImpl();
		return userAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetDetail createStreetDetail() {
		StreetDetailImpl streetDetail = new StreetDetailImpl();
		return streetDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agreement createAgreement() {
		AgreementImpl agreement = new AgreementImpl();
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityRecord createActivityRecord() {
		ActivityRecordImpl activityRecord = new ActivityRecordImpl();
		return activityRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress createElectronicAddress() {
		ElectronicAddressImpl electronicAddress = new ElectronicAddressImpl();
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownDetail createTownDetail() {
		TownDetailImpl townDetail = new TownDetailImpl();
		return townDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint createTimePoint() {
		TimePointImpl timePoint = new TimePointImpl();
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
