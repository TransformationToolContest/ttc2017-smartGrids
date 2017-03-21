/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.UserAttribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Determinant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getPrecisionLevel <em>Precision Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfileData <em>Charge Profile Data</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getCalculationLevel <em>Calculation Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getConfigVersion <em>Config Version</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfile <em>Charge Profile</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getNumberInterval <em>Number Interval</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant()
 * @model
 * @generated
 */
public interface BillDeterminant extends Document {
	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.UserAttribute#getBillDeterminants <em>Bill Determinants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_UserAttributes()
	 * @see CIM.IEC61968.Common.UserAttribute#getBillDeterminants
	 * @model opposite="BillDeterminants"
	 * @generated
	 */
	EList<UserAttribute> getUserAttributes();

	/**
	 * Returns the value of the '<em><b>Precision Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Level</em>' attribute.
	 * @see #setPrecisionLevel(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_PrecisionLevel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The level of precision in the current value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The level of precision in the current value.'"
	 * @generated
	 */
	String getPrecisionLevel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getPrecisionLevel <em>Precision Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Level</em>' attribute.
	 * @see #getPrecisionLevel()
	 * @generated
	 */
	void setPrecisionLevel(String value);

	/**
	 * Returns the value of the '<em><b>Charge Profile Data</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getBillDeterminant <em>Bill Determinant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Profile Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Profile Data</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_ChargeProfileData()
	 * @see CIM.IEC61970.Informative.MarketOperations.ChargeProfileData#getBillDeterminant
	 * @model opposite="BillDeterminant"
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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_UnitOfMeasure()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The UOM for the current value of the Bill Determinant.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The UOM for the current value of the Bill Determinant.'"
	 * @generated
	 */
	String getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Calculation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Level</em>' attribute.
	 * @see #setCalculationLevel(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_CalculationLevel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Level in charge calculation order.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Level in charge calculation order.'"
	 * @generated
	 */
	String getCalculationLevel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getCalculationLevel <em>Calculation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Level</em>' attribute.
	 * @see #getCalculationLevel()
	 * @generated
	 */
	void setCalculationLevel(String value);

	/**
	 * Returns the value of the '<em><b>Config Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Version</em>' attribute.
	 * @see #setConfigVersion(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_ConfigVersion()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The version of configuration of calculation logic in the settlement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The version of configuration of calculation logic in the settlement.'"
	 * @generated
	 */
	String getConfigVersion();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getConfigVersion <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Version</em>' attribute.
	 * @see #getConfigVersion()
	 * @generated
	 */
	void setConfigVersion(String value);

	/**
	 * Returns the value of the '<em><b>Charge Profile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getBillDeterminant <em>Bill Determinant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Profile</em>' reference.
	 * @see #setChargeProfile(ChargeProfile)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_ChargeProfile()
	 * @see CIM.IEC61970.Informative.MarketOperations.ChargeProfile#getBillDeterminant
	 * @model opposite="BillDeterminant"
	 * @generated
	 */
	ChargeProfile getChargeProfile();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getChargeProfile <em>Charge Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Profile</em>' reference.
	 * @see #getChargeProfile()
	 * @generated
	 */
	void setChargeProfile(ChargeProfile value);

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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBillDeterminant_NumberInterval()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of intervals of bill determiant in trade day, eg 300 for five minute intervals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of intervals of bill determiant in trade day, eg 300 for five minute intervals.'"
	 * @generated
	 */
	int getNumberInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BillDeterminant#getNumberInterval <em>Number Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Interval</em>' attribute.
	 * @see #getNumberInterval()
	 * @generated
	 */
	void setNumberInterval(int value);

} // BillDeterminant
