/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Domain.Currency;
import gluemodel.CIM.IEC61970.Domain.UnitMultiplier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounting Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit for accounting; use either \'energyUnit\' or \'currencyUnit\' to specify the unit for \'value\'.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Unit for accounting; use either \'energyUnit\' or \'currencyUnit\' to specify the unit for \'value\'.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit for accounting; use either \'energyUnit\' or \'currencyUnit\' to specify the unit for \'value\'.' Profile\040documentation='Unit for accounting; use either \'energyUnit\' or \'currencyUnit\' to specify the unit for \'value\'.'"
 * @generated
 */
public interface AccountingUnit extends Element {
	/**
	 * Returns the value of the '<em><b>Monetary Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.Currency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monetary Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.Currency
	 * @see #setMonetaryUnit(Currency)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit_MonetaryUnit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit of currency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit of currency.'"
	 * @generated
	 */
	Currency getMonetaryUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monetary Unit</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.Currency
	 * @see #getMonetaryUnit()
	 * @generated
	 */
	void setMonetaryUnit(Currency value);

	/**
	 * Returns the value of the '<em><b>Energy Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Unit</em>' attribute.
	 * @see #setEnergyUnit(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit_EnergyUnit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit of service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit of service.'"
	 * @generated
	 */
	float getEnergyUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Unit</em>' attribute.
	 * @see #getEnergyUnit()
	 * @generated
	 */
	void setEnergyUnit(float value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value expressed in applicable units.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value expressed in applicable units.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setMultiplier(UnitMultiplier)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit_Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for the \'energyUnit\' or \'monetaryUnit\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for the \'energyUnit\' or \'monetaryUnit\'.'"
	 * @generated
	 */
	UnitMultiplier getMultiplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(UnitMultiplier value);

} // AccountingUnit
