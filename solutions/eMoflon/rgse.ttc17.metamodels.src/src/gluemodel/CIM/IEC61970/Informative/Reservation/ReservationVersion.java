/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getDate <em>Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getReservationVersion()
 * @model
 * @generated
 */
public interface ReservationVersion extends Element {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getReservationVersion_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getReservationVersion_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ReservationVersion
