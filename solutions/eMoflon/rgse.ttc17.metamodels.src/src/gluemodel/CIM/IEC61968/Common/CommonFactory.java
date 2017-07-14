/**
 */
package gluemodel.CIM.IEC61968.Common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = gluemodel.CIM.IEC61968.Common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Date Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Interval</em>'.
	 * @generated
	 */
	DateTimeInterval createDateTimeInterval();

	/**
	 * Returns a new object of class '<em>Postal Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postal Address</em>'.
	 * @generated
	 */
	PostalAddress createPostalAddress();

	/**
	 * Returns a new object of class '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisation</em>'.
	 * @generated
	 */
	Organisation createOrganisation();

	/**
	 * Returns a new object of class '<em>Telephone Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telephone Number</em>'.
	 * @generated
	 */
	TelephoneNumber createTelephoneNumber();

	/**
	 * Returns a new object of class '<em>Street Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Street Address</em>'.
	 * @generated
	 */
	StreetAddress createStreetAddress();

	/**
	 * Returns a new object of class '<em>Time Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Schedule</em>'.
	 * @generated
	 */
	TimeSchedule createTimeSchedule();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Point</em>'.
	 * @generated
	 */
	PositionPoint createPositionPoint();

	/**
	 * Returns a new object of class '<em>Coordinate System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate System</em>'.
	 * @generated
	 */
	CoordinateSystem createCoordinateSystem();

	/**
	 * Returns a new object of class '<em>User Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attribute</em>'.
	 * @generated
	 */
	UserAttribute createUserAttribute();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Street Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Street Detail</em>'.
	 * @generated
	 */
	StreetDetail createStreetDetail();

	/**
	 * Returns a new object of class '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement</em>'.
	 * @generated
	 */
	Agreement createAgreement();

	/**
	 * Returns a new object of class '<em>Activity Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Record</em>'.
	 * @generated
	 */
	ActivityRecord createActivityRecord();

	/**
	 * Returns a new object of class '<em>Electronic Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electronic Address</em>'.
	 * @generated
	 */
	ElectronicAddress createElectronicAddress();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Town Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Town Detail</em>'.
	 * @generated
	 */
	TownDetail createTownDetail();

	/**
	 * Returns a new object of class '<em>Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Point</em>'.
	 * @generated
	 */
	TimePoint createTimePoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
