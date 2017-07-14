/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.Profile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getPassTroughBill <em>Pass Trough Bill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getChargeProfileData <em>Charge Profile Data</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getBillDeterminant <em>Bill Determinant</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getNumberInterval <em>Number Interval</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of profile for financial charges'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of profile for financial charges'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of profile for financial charges' Profile\040documentation='A type of profile for financial charges'"
 * @generated
 */
public interface ChargeProfile extends Profile {
	/**
	 * Returns the value of the '<em><b>Pass Trough Bill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getChargeProfiles <em>Charge Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Trough Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Trough Bill</em>' reference.
	 * @see #setPassTroughBill(PassThroughBill)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_PassTroughBill()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getChargeProfiles
	 * @model opposite="ChargeProfiles"
	 * @generated
	 */
	PassThroughBill getPassTroughBill();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getPassTroughBill <em>Pass Trough Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Trough Bill</em>' reference.
	 * @see #getPassTroughBill()
	 * @generated
	 */
	void setPassTroughBill(PassThroughBill value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of profile.  It could be amount, price, or quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of profile.  It could be amount, price, or quantity.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Charge Profile Data</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getChargeProfile <em>Charge Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Profile Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Profile Data</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_ChargeProfileData()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getChargeProfile
	 * @model opposite="ChargeProfile"
	 * @generated
	 */
	EList<ChargeProfileData> getChargeProfileData();

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #setUnitOfMeasure(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_UnitOfMeasure()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit of measure applied to the value attribute of the profile data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit of measure applied to the value attribute of the profile data.'"
	 * @generated
	 */
	String getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Bill Determinant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfile <em>Charge Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Determinant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Determinant</em>' reference.
	 * @see #setBillDeterminant(BillDeterminant)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_BillDeterminant()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfile
	 * @model opposite="ChargeProfile"
	 * @generated
	 */
	BillDeterminant getBillDeterminant();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getBillDeterminant <em>Bill Determinant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Determinant</em>' reference.
	 * @see #getBillDeterminant()
	 * @generated
	 */
	void setBillDeterminant(BillDeterminant value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_Frequency()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The calculation frequency, daily or monthly.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The calculation frequency, daily or monthly.'"
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Number Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Interval</em>' attribute.
	 * @see #setNumberInterval(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfile_NumberInterval()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The number of intervals in the profile data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The number of intervals in the profile data.'"
	 * @generated
	 */
	int getNumberInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getNumberInterval <em>Number Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Interval</em>' attribute.
	 * @see #getNumberInterval()
	 * @generated
	 */
	void setNumberInterval(int value);

} // ChargeProfile
