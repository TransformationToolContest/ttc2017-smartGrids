/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curtailment Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile#getEnergyTransaction <em>Energy Transaction</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getCurtailmentProfile()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Curtailing entity must be providing at least one service to the EnergyTransaction. The CurtailmentProfile must be completely contained within the EnergyProfile timeframe for this EnergyTransaction.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Curtailing entity must be providing at least one service to the EnergyTransaction. The CurtailmentProfile must be completely contained within the EnergyProfile timeframe for this EnergyTransaction.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Curtailing entity must be providing at least one service to the EnergyTransaction. The CurtailmentProfile must be completely contained within the EnergyProfile timeframe for this EnergyTransaction.' Profile\040documentation='Curtailing entity must be providing at least one service to the EnergyTransaction. The CurtailmentProfile must be completely contained within the EnergyProfile timeframe for this EnergyTransaction.'"
 * @generated
 */
public interface CurtailmentProfile extends Profile {
	/**
	 * Returns the value of the '<em><b>Energy Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCurtailmentProfiles <em>Curtailment Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Transaction</em>' reference.
	 * @see #setEnergyTransaction(EnergyTransaction)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getCurtailmentProfile_EnergyTransaction()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCurtailmentProfiles
	 * @model opposite="CurtailmentProfiles"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyTransaction may be curtailed by any of the participating entities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyTransaction may be curtailed by any of the participating entities.'"
	 * @generated
	 */
	EnergyTransaction getEnergyTransaction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile#getEnergyTransaction <em>Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Transaction</em>' reference.
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	void setEnergyTransaction(EnergyTransaction value);

} // CurtailmentProfile
