/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve Req Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve#getReserveReq <em>Reserve Req</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getReserveReqCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A curve relating  reserve requirement versus time, showing the values of a specific reserve requirement for each unit of the period covered. The  curve can be based on \"absolute\" time or on \"normalized\' time. \nX is time, typically expressed in absolute time\nY1 is reserve requirement, typically expressed in MW'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A curve relating  reserve requirement versus time, showing the values of a specific reserve requirement for each unit of the period covered. The  curve can be based on \"absolute\" time or on \"normalized\' time. \nX is time, typically expressed in absolute time\nY1 is reserve requirement, typically expressed in MW'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A curve relating  reserve requirement versus time, showing the values of a specific reserve requirement for each unit of the period covered. The  curve can be based on \"absolute\" time or on \"normalized\' time. \nX is time, typically expressed in absolute time\nY1 is reserve requirement, typically expressed in MW' Profile\040documentation='A curve relating  reserve requirement versus time, showing the values of a specific reserve requirement for each unit of the period covered. The  curve can be based on \"absolute\" time or on \"normalized\' time. \nX is time, typically expressed in absolute time\nY1 is reserve requirement, typically expressed in MW'"
 * @generated
 */
public interface ReserveReqCurve extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Reserve Req</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getReserveReqCurve <em>Reserve Req Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Req</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Req</em>' reference.
	 * @see #setReserveReq(ReserveReq)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getReserveReqCurve_ReserveReq()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getReserveReqCurve
	 * @model opposite="ReserveReqCurve"
	 * @generated
	 */
	ReserveReq getReserveReq();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve#getReserveReq <em>Reserve Req</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Req</em>' reference.
	 * @see #getReserveReq()
	 * @generated
	 */
	void setReserveReq(ReserveReq value);

} // ReserveReqCurve
