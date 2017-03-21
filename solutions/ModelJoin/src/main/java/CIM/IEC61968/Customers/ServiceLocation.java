/**
 */
package CIM.IEC61968.Customers;

import CIM.IEC61968.Common.Location;

import CIM.IEC61968.Metering.EndDeviceAsset;
import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceLocation#getEndDeviceAssets <em>End Device Assets</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A customer ServiceLocation has one or more ServiceDeliveryPoint(s), which in turn relate to Meters. The location may be a point or a polygon, depending on the specific circumstances.\nFor distribution, the ServiceLocation is typically the location of the utility customer\'s premise. Because a customer\'s premise may have one or more meters, the ServiceDeliveryPoint is used to define the actual conducting equipment that the EndDeviceAsset attaches to at the utility customer\'s ServiceLocation.\nFor transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A customer ServiceLocation has one or more ServiceDeliveryPoint(s), which in turn relate to Meters. The location may be a point or a polygon, depending on the specific circumstances.\nFor distribution, the ServiceLocation is typically the location of the utility customer\'s premise. Because a customer\'s premise may have one or more meters, the ServiceDeliveryPoint is used to define the actual conducting equipment that the EndDeviceAsset attaches to at the utility customer\'s ServiceLocation.\nFor transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A customer ServiceLocation has one or more ServiceDeliveryPoint(s), which in turn relate to Meters. The location may be a point or a polygon, depending on the specific circumstances.\nFor distribution, the ServiceLocation is typically the location of the utility customer\'s premise. Because a customer\'s premise may have one or more meters, the ServiceDeliveryPoint is used to define the actual conducting equipment that the EndDeviceAsset attaches to at the utility customer\'s ServiceLocation.\nFor transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party.' Profile\040documentation='A customer ServiceLocation has one or more ServiceDeliveryPoint(s), which in turn relate to Meters. The location may be a point or a polygon, depending on the specific circumstances.\nFor distribution, the ServiceLocation is typically the location of the utility customer\'s premise. Because a customer\'s premise may have one or more meters, the ServiceDeliveryPoint is used to define the actual conducting equipment that the EndDeviceAsset attaches to at the utility customer\'s ServiceLocation.\nFor transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party.'"
 * @generated
 */
public interface ServiceLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Needs Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Inspection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inspection</em>' attribute.
	 * @see #setNeedsInspection(boolean)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_NeedsInspection()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if inspection is needed of facilities at this service location. This could be requested by a customer, due to suspected tampering, environmental concerns (e.g., a fire in the vicinity), or to correct incompatible data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if inspection is needed of facilities at this service location. This could be requested by a customer, due to suspected tampering, environmental concerns (e.g., a fire in the vicinity), or to correct incompatible data.'"
	 * @generated
	 */
	boolean isNeedsInspection();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inspection</em>' attribute.
	 * @see #isNeedsInspection()
	 * @generated
	 */
	void setNeedsInspection(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_ServiceDeliveryPoints()
	 * @see CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation
	 * @model opposite="ServiceLocation"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points delivering service (of the same type) to this service location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points delivering service (of the same type) to this service location.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_ErpPersons()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation
	 * @model opposite="ServiceLocation"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

	/**
	 * Returns the value of the '<em><b>Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Method</em>' attribute.
	 * @see #setAccessMethod(String)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_AccessMethod()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Method for the service person to access the appropriate service locations. For example, a description of where to obtain a key if the facility is unmanned and secured.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Method for the service person to access the appropriate service locations. For example, a description of where to obtain a key if the facility is unmanned and secured.'"
	 * @generated
	 */
	String getAccessMethod();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Method</em>' attribute.
	 * @see #getAccessMethod()
	 * @generated
	 */
	void setAccessMethod(String value);

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAgreement#getServiceLocations <em>Service Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_CustomerAgreements()
	 * @see CIM.IEC61968.Customers.CustomerAgreement#getServiceLocations
	 * @model opposite="ServiceLocations"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All customer agreements regulating this service location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All customer agreements regulating this service location.'"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Site Access Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Access Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Access Problem</em>' attribute.
	 * @see #setSiteAccessProblem(String)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_SiteAccessProblem()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Problems previously encountered when visiting or performing work on this site. Examples include: bad dog, violent customer, verbally abusive occupant, obstructions, safety hazards, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Problems previously encountered when visiting or performing work on this site. Examples include: bad dog, violent customer, verbally abusive occupant, obstructions, safety hazards, etc.'"
	 * @generated
	 */
	String getSiteAccessProblem();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Access Problem</em>' attribute.
	 * @see #getSiteAccessProblem()
	 * @generated
	 */
	void setSiteAccessProblem(String value);

	/**
	 * Returns the value of the '<em><b>End Device Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.EndDeviceAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Assets</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceLocation_EndDeviceAssets()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getServiceLocation
	 * @model opposite="ServiceLocation"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device assets that measure the service delivered to this service location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device assets that measure the service delivered to this service location.'"
	 * @generated
	 */
	EList<EndDeviceAsset> getEndDeviceAssets();

} // ServiceLocation
