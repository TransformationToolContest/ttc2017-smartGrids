/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.IEC61970.Informative.MarketOperations.TransactionBid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getTransactionBid <em>Transaction Bid</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getEnergyTransaction <em>Energy Transaction</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProfile()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the start time, stop time, level for an EnergyTransaction.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies the start time, stop time, level for an EnergyTransaction.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the start time, stop time, level for an EnergyTransaction.' Profile\040documentation='Specifies the start time, stop time, level for an EnergyTransaction.'"
 * @generated
 */
public interface EnergyProfile extends Profile {
	/**
	 * Returns the value of the '<em><b>Transaction Bid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyProfiles <em>Energy Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Bid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Bid</em>' reference.
	 * @see #setTransactionBid(TransactionBid)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProfile_TransactionBid()
	 * @see CIM.IEC61970.Informative.MarketOperations.TransactionBid#getEnergyProfiles
	 * @model opposite="EnergyProfiles"
	 * @generated
	 */
	TransactionBid getTransactionBid();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getTransactionBid <em>Transaction Bid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Bid</em>' reference.
	 * @see #getTransactionBid()
	 * @generated
	 */
	void setTransactionBid(TransactionBid value);

	/**
	 * Returns the value of the '<em><b>Energy Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProfiles <em>Energy Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Transaction</em>' reference.
	 * @see #setEnergyTransaction(EnergyTransaction)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyProfile_EnergyTransaction()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProfiles
	 * @model opposite="EnergyProfiles"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyTransaction must have at least one EnergyProfile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyTransaction must have at least one EnergyProfile.'"
	 * @generated
	 */
	EnergyTransaction getEnergyTransaction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getEnergyTransaction <em>Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Transaction</em>' reference.
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	void setEnergyTransaction(EnergyTransaction value);

} // EnergyProfile
