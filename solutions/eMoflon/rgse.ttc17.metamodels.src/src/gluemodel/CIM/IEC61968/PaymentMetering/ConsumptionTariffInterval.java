/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumption Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges <em>Charges</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='One of a sequence of intervals defined in terms of consumption quantity of a service such as electricity, water, gas, etc. It is typically used in association with TariffProfile to define the steps or blocks in a step tariff structure, where startValue simultaneously defines the entry value of this step and the closing value of the previous step. Where consumption is &gt;= startValue it falls within this interval and where consumption is &lt; startValue it falls within the previous interval.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='One of a sequence of intervals defined in terms of consumption quantity of a service such as electricity, water, gas, etc. It is typically used in association with TariffProfile to define the steps or blocks in a step tariff structure, where startValue simultaneously defines the entry value of this step and the closing value of the previous step. Where consumption is &gt;= startValue it falls within this interval and where consumption is &lt; startValue it falls within the previous interval.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='One of a sequence of intervals defined in terms of consumption quantity of a service such as electricity, water, gas, etc. It is typically used in association with TariffProfile to define the steps or blocks in a step tariff structure, where startValue simultaneously defines the entry value of this step and the closing value of the previous step. Where consumption is &gt;= startValue it falls within this interval and where consumption is &lt; startValue it falls within the previous interval.' Profile\040documentation='One of a sequence of intervals defined in terms of consumption quantity of a service such as electricity, water, gas, etc. It is typically used in association with TariffProfile to define the steps or blocks in a step tariff structure, where startValue simultaneously defines the entry value of this step and the closing value of the previous step. Where consumption is &gt;= startValue it falls within this interval and where consumption is &lt; startValue it falls within the previous interval.'"
 * @generated
 */
public interface ConsumptionTariffInterval extends Element {
	/**
	 * Returns the value of the '<em><b>Tariff Profiles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Profiles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval_TariffProfiles()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals
	 * @model opposite="ConsumptionTariffIntervals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All tariff profiles defined by this consumption tariff interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All tariff profiles defined by this consumption tariff interval.'"
	 * @generated
	 */
	EList<TariffProfile> getTariffProfiles();

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
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A sequential reference that defines the identity of this interval and its relative position with respect to other intervals in a sequence of intervals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A sequential reference that defines the identity of this interval and its relative position with respect to other intervals in a sequence of intervals.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval_Charges()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals
	 * @model opposite="ConsumptionTariffIntervals"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All charges used to define this consumption tariff interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All charges used to define this consumption tariff interval.'"
	 * @generated
	 */
	EList<Charge> getCharges();

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' attribute.
	 * @see #setStartValue(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval_StartValue()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The lowest level of consumption that defines the starting point of this interval. The interval extends to the start of the next interval or until it is reset to the start of the first interval by TariffProfile.tariffCycle.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The lowest level of consumption that defines the starting point of this interval. The interval extends to the start of the next interval or until it is reset to the start of the first interval by TariffProfile.tariffCycle.'"
	 * @generated
	 */
	float getStartValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(float value);

} // ConsumptionTariffInterval
