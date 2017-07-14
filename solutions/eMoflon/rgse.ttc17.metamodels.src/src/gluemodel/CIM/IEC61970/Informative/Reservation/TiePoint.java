/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Meas.Measurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getBy_Measurements <em>By Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getDeclared_ServicePoint <em>Declared Service Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getTiePointMWRating <em>Tie Point MW Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getFor_Measurements <em>For Measurements</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTiePoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Site of an interface between interchange areas. The tie point can be a network branch (e.g., transmission line or transformer) or a switching device. For transmission lines, the interchange area boundary is usually at a designated point such as the middle of the line. Line end metering is then corrected for line losses.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Site of an interface between interchange areas. The tie point can be a network branch (e.g., transmission line or transformer) or a switching device. For transmission lines, the interchange area boundary is usually at a designated point such as the middle of the line. Line end metering is then corrected for line losses.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Site of an interface between interchange areas. The tie point can be a network branch (e.g., transmission line or transformer) or a switching device. For transmission lines, the interchange area boundary is usually at a designated point such as the middle of the line. Line end metering is then corrected for line losses.' Profile\040documentation='Site of an interface between interchange areas. The tie point can be a network branch (e.g., transmission line or transformer) or a switching device. For transmission lines, the interchange area boundary is usually at a designated point such as the middle of the line. Line end metering is then corrected for line losses.'"
 * @generated
 */
public interface TiePoint extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>By Measurements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getBy_TiePoint <em>By Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Measurements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTiePoint_By_Measurements()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getBy_TiePoint
	 * @model opposite="By_TiePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement is made on the B side of a tie point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement is made on the B side of a tie point'"
	 * @generated
	 */
	EList<Measurement> getBy_Measurements();

	/**
	 * Returns the value of the '<em><b>Declared Service Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getDeclare_TiePoint <em>Declare Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Service Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Service Point</em>' reference.
	 * @see #setDeclared_ServicePoint(ServicePoint)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTiePoint_Declared_ServicePoint()
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint#getDeclare_TiePoint
	 * @model opposite="Declare_TiePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A tiepoint may be declared as a service point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A tiepoint may be declared as a service point.'"
	 * @generated
	 */
	ServicePoint getDeclared_ServicePoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getDeclared_ServicePoint <em>Declared Service Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Service Point</em>' reference.
	 * @see #getDeclared_ServicePoint()
	 * @generated
	 */
	void setDeclared_ServicePoint(ServicePoint value);

	/**
	 * Returns the value of the '<em><b>Tie Point MW Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Point MW Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Point MW Rating</em>' attribute.
	 * @see #setTiePointMWRating(float)
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTiePoint_TiePointMWRating()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The MW rating of the tie point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The MW rating of the tie point'"
	 * @generated
	 */
	float getTiePointMWRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint#getTiePointMWRating <em>Tie Point MW Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Point MW Rating</em>' attribute.
	 * @see #getTiePointMWRating()
	 * @generated
	 */
	void setTiePointMWRating(float value);

	/**
	 * Returns the value of the '<em><b>For Measurements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getFor_TiePoint <em>For Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Measurements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage#getTiePoint_For_Measurements()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getFor_TiePoint
	 * @model opposite="For_TiePoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement is made on the A side of a tie point'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement is made on the A side of a tie point'"
	 * @generated
	 */
	EList<Measurement> getFor_Measurements();

} // TiePoint
