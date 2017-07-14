/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getChildCharges <em>Child Charges</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getFixedPortion <em>Fixed Portion</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A charge element associated with other entities such as tariff structures, auxiliary agreements or other charge elements. The total charge amount applicable to this instance of Charge is the sum of fixedPortion plus percentagePortion.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A charge element associated with other entities such as tariff structures, auxiliary agreements or other charge elements. The total charge amount applicable to this instance of Charge is the sum of fixedPortion plus percentagePortion.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A charge element associated with other entities such as tariff structures, auxiliary agreements or other charge elements. The total charge amount applicable to this instance of Charge is the sum of fixedPortion plus percentagePortion.' Profile\040documentation='A charge element associated with other entities such as tariff structures, auxiliary agreements or other charge elements. The total charge amount applicable to this instance of Charge is the sum of fixedPortion plus percentagePortion.'"
 * @generated
 */
public interface Charge extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Accounts</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_AuxiliaryAccounts()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges
	 * @model opposite="Charges"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All auxiliary accounts to which this charge must be levied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All auxiliary accounts to which this charge must be levied.'"
	 * @generated
	 */
	EList<AuxiliaryAccount> getAuxiliaryAccounts();

	/**
	 * Returns the value of the '<em><b>Parent Charge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getChildCharges <em>Child Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Charge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Charge</em>' reference.
	 * @see #setParentCharge(Charge)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_ParentCharge()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Charge#getChildCharges
	 * @model opposite="ChildCharges"
	 * @generated
	 */
	Charge getParentCharge();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Charge</em>' reference.
	 * @see #getParentCharge()
	 * @generated
	 */
	void setParentCharge(Charge value);

	/**
	 * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_ConsumptionTariffIntervals()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges
	 * @model opposite="Charges"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tariff intervals to which this consumption-based charge must be levied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tariff intervals to which this consumption-based charge must be levied.'"
	 * @generated
	 */
	EList<ConsumptionTariffInterval> getConsumptionTariffIntervals();

	/**
	 * Returns the value of the '<em><b>Child Charges</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Charges</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_ChildCharges()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Charge#getParentCharge
	 * @model opposite="ParentCharge"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All sub-components of this complex charge.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All sub-components of this complex charge.'"
	 * @generated
	 */
	EList<Charge> getChildCharges();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind
	 * @see #setKind(ChargeKind)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The kind of charge to be applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The kind of charge to be applied.'"
	 * @generated
	 */
	ChargeKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ChargeKind value);

	/**
	 * Returns the value of the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tariff Intervals</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_TimeTariffIntervals()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval#getCharges
	 * @model opposite="Charges"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tariff intervals to which this time-based charge must be levied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tariff intervals to which this time-based charge must be levied.'"
	 * @generated
	 */
	EList<TimeTariffInterval> getTimeTariffIntervals();

	/**
	 * Returns the value of the '<em><b>Variable Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Portion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Portion</em>' attribute.
	 * @see #setVariablePortion(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_VariablePortion()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The variable portion of this charge element, calculated as a percentage of the total amount of a parent charge.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The variable portion of this charge element, calculated as a percentage of the total amount of a parent charge.'"
	 * @generated
	 */
	float getVariablePortion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Portion</em>' attribute.
	 * @see #getVariablePortion()
	 * @generated
	 */
	void setVariablePortion(float value);

	/**
	 * Returns the value of the '<em><b>Fixed Portion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Portion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Portion</em>' reference.
	 * @see #setFixedPortion(AccountingUnit)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge_FixedPortion()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The fixed portion of this charge element.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The fixed portion of this charge element.'"
	 * @generated
	 */
	AccountingUnit getFixedPortion();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getFixedPortion <em>Fixed Portion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Portion</em>' reference.
	 * @see #getFixedPortion()
	 * @generated
	 */
	void setFixedPortion(AccountingUnit value);

} // Charge
