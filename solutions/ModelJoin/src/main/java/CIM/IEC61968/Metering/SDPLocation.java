/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61968.Common.Location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDP Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getSDPLocation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Location of an individual service delivery point. For residential or most businesses, it is typically the location of a meter on the customer\'s premises. For transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party. The point(s) of delivery is specified in the Service Agreement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Location of an individual service delivery point. For residential or most businesses, it is typically the location of a meter on the customer\'s premises. For transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party. The point(s) of delivery is specified in the Service Agreement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Location of an individual service delivery point. For residential or most businesses, it is typically the location of a meter on the customer\'s premises. For transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party. The point(s) of delivery is specified in the Service Agreement.' Profile\040documentation='Location of an individual service delivery point. For residential or most businesses, it is typically the location of a meter on the customer\'s premises. For transmission, it is the point(s) of interconnection on the transmission provider\'s transmission system where capacity and/or energy transmitted by the transmission provider is made available to the receiving party. The point(s) of delivery is specified in the Service Agreement.'"
 * @generated
 */
public interface SDPLocation extends Location {
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
	 * @see CIM.IEC61968.Metering.MeteringPackage#getSDPLocation_AccessMethod()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Method for the service person to access this service delivery point location. For example, a description of where to obtain a key if the facility is unmanned and secured.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Method for the service person to access this service delivery point location. For example, a description of where to obtain a key if the facility is unmanned and secured.'"
	 * @generated
	 */
	String getAccessMethod();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Method</em>' attribute.
	 * @see #getAccessMethod()
	 * @generated
	 */
	void setAccessMethod(String value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getSDPLocation_Remark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks about this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks about this location.'"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

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
	 * @see CIM.IEC61968.Metering.MeteringPackage#getSDPLocation_SiteAccessProblem()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Problems previously encountered when visiting or performing work at this service delivery point location. Examples include: bad dog, violent customer, verbally abusive occupant, obstructions, safety hazards, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Problems previously encountered when visiting or performing work at this service delivery point location. Examples include: bad dog, violent customer, verbally abusive occupant, obstructions, safety hazards, etc.'"
	 * @generated
	 */
	String getSiteAccessProblem();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Access Problem</em>' attribute.
	 * @see #getSiteAccessProblem()
	 * @generated
	 */
	void setSiteAccessProblem(String value);

	/**
	 * Returns the value of the '<em><b>Occupancy Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy Date</em>' attribute.
	 * @see #setOccupancyDate(String)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getSDPLocation_OccupancyDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date when certificate of occupancy was provided for this location, 0 if valid certificate of occupancy does not exist for (inherited) \'Location.corporateCode\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date when certificate of occupancy was provided for this location, 0 if valid certificate of occupancy does not exist for (inherited) \'Location.corporateCode\'.'"
	 * @generated
	 */
	String getOccupancyDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy Date</em>' attribute.
	 * @see #getOccupancyDate()
	 * @generated
	 */
	void setOccupancyDate(String value);

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations <em>SDP Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getSDPLocation_ServiceDeliveryPoints()
	 * @see CIM.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations
	 * @model opposite="SDPLocations"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points at this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points at this location.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

} // SDPLocation
