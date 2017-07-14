/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='One of a sequence of time intervals defined in terms of real time. It is typically used in association with TariffProfile to define the intervals in a time of use tariff structure, where startDateTime simultaneously determines the starting point of this interval and the ending point of the previous interval.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='One of a sequence of time intervals defined in terms of real time. It is typically used in association with TariffProfile to define the intervals in a time of use tariff structure, where startDateTime simultaneously determines the starting point of this interval and the ending point of the previous interval.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='One of a sequence of time intervals defined in terms of real time. It is typically used in association with TariffProfile to define the intervals in a time of use tariff structure, where startDateTime simultaneously determines the starting point of this interval and the ending point of the previous interval.' Profile\040documentation='One of a sequence of time intervals defined in terms of real time. It is typically used in association with TariffProfile to define the intervals in a time of use tariff structure, where startDateTime simultaneously determines the starting point of this interval and the ending point of the previous interval.'"
 * @generated
 */
public interface TimeTariffInterval extends Element {
	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Time</em>' attribute.
	 * @see #setStartDateTime(Date)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval_StartDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A real time marker that defines the starting time (typically it is the time of day) for this interval. The interval extends to the start of the next interval or until it is reset to the start of the first interval by TariffProfile.tariffCycle.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A real time marker that defines the starting time (typically it is the time of day) for this interval. The interval extends to the start of the next interval or until it is reset to the start of the first interval by TariffProfile.tariffCycle.'"
	 * @generated
	 */
	Date getStartDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' attribute.
	 * @see #getStartDateTime()
	 * @generated
	 */
	void setStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A sequential reference that defines the identity of this interval and its relative position with respect to other intervals in a sequence of intervals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A sequential reference that defines the identity of this interval and its relative position with respect to other intervals in a sequence of intervals.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Tariff Profiles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Profiles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval_TariffProfiles()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals
	 * @model opposite="TimeTariffIntervals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All tariff profiles defined by this time tariff interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All tariff profiles defined by this time tariff interval.'"
	 * @generated
	 */
	EList<TariffProfile> getTariffProfiles();

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval_Charges()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals
	 * @model opposite="TimeTariffIntervals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All charges used to define this time tariff interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All charges used to define this time tariff interval.'"
	 * @generated
	 */
	EList<Charge> getCharges();

} // TimeTariffInterval
