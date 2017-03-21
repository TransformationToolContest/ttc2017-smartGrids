/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Profile Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getSequence <em>Sequence</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getChargeProfile <em>Charge Profile</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getBillDeterminant <em>Bill Determinant</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfileData()
 * @model
 * @generated
 */
public interface ChargeProfileData extends Element {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfileData_Sequence()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The sequence number of the profile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The sequence number of the profile.'"
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfileData_TimeStamp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time of an interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time of an interval.'"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Charge Profile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getChargeProfileData <em>Charge Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Profile</em>' reference.
	 * @see #setChargeProfile(ChargeProfile)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfileData_ChargeProfile()
	 * @see CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getChargeProfileData
	 * @model opposite="ChargeProfileData"
	 * @generated
	 */
	ChargeProfile getChargeProfile();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getChargeProfile <em>Charge Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Profile</em>' reference.
	 * @see #getChargeProfile()
	 * @generated
	 */
	void setChargeProfile(ChargeProfile value);

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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfileData_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value of an interval given a profile type (amount, price, or quantity), subject to the UOM.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value of an interval given a profile type (amount, price, or quantity), subject to the UOM.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Bill Determinant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfileData <em>Charge Profile Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Determinant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Determinant</em>' reference.
	 * @see #setBillDeterminant(BillDeterminant)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getChargeProfileData_BillDeterminant()
	 * @see CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfileData
	 * @model opposite="ChargeProfileData"
	 * @generated
	 */
	BillDeterminant getBillDeterminant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getBillDeterminant <em>Bill Determinant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Determinant</em>' reference.
	 * @see #getBillDeterminant()
	 * @generated
	 */
	void setBillDeterminant(BillDeterminant value);

} // ChargeProfileData
