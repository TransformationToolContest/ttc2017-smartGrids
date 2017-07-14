/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Customers.Tariff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tariff Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A schedule of charges; structure associated with Tariff that allows the definition of complex tarif structures such as step and time of use when used in conjunction with TimeTariffInterval and Charge. Inherited \'status.value\' is defined in the context of the utility\'s business rules, for example: active, inactive, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A schedule of charges; structure associated with Tariff that allows the definition of complex tarif structures such as step and time of use when used in conjunction with TimeTariffInterval and Charge. Inherited \'status.value\' is defined in the context of the utility\'s business rules, for example: active, inactive, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A schedule of charges; structure associated with Tariff that allows the definition of complex tarif structures such as step and time of use when used in conjunction with TimeTariffInterval and Charge. Inherited \'status.value\' is defined in the context of the utility\'s business rules, for example: active, inactive, etc.' Profile\040documentation='A schedule of charges; structure associated with Tariff that allows the definition of complex tarif structures such as step and time of use when used in conjunction with TimeTariffInterval and Charge. Inherited \'status.value\' is defined in the context of the utility\'s business rules, for example: active, inactive, etc.'"
 * @generated
 */
public interface TariffProfile extends Document {
	/**
	 * Returns the value of the '<em><b>Tariff Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Cycle</em>' attribute.
	 * @see #setTariffCycle(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile_TariffCycle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The frequency at which the tariff charge schedule is repeated Examples are: once off on a specified date and time; hourly; daily; weekly; monthly; 3-monthly; 6-monthly; 12-monthly; etc. At the end of each cycle, the business rules are reset to start from the beginning again.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The frequency at which the tariff charge schedule is repeated Examples are: once off on a specified date and time; hourly; daily; weekly; monthly; 3-monthly; 6-monthly; 12-monthly; etc. At the end of each cycle, the business rules are reset to start from the beginning again.'"
	 * @generated
	 */
	String getTariffCycle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Cycle</em>' attribute.
	 * @see #getTariffCycle()
	 * @generated
	 */
	void setTariffCycle(String value);

	/**
	 * Returns the value of the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tariff Intervals</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile_TimeTariffIntervals()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles
	 * @model opposite="TariffProfiles"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All time tariff intervals used to define this tariff profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All time tariff intervals used to define this tariff profile.'"
	 * @generated
	 */
	EList<TimeTariffInterval> getTimeTariffIntervals();

	/**
	 * Returns the value of the '<em><b>Tariffs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.Tariff}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.Tariff#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariffs</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile_Tariffs()
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff#getTariffProfiles
	 * @model opposite="TariffProfiles"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All tariffs defined by this tariff profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All tariffs defined by this tariff profile.'"
	 * @generated
	 */
	EList<Tariff> getTariffs();

	/**
	 * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile_ConsumptionTariffIntervals()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles
	 * @model opposite="TariffProfiles"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All consumption tariff intervals used to define this tariff profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All consumption tariff intervals used to define this tariff profile.'"
	 * @generated
	 */
	EList<ConsumptionTariffInterval> getConsumptionTariffIntervals();

} // TariffProfile
