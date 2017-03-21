/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.IEC61970.Informative.Financial.TransmissionProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getHasLoss_ <em>Has Loss </em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getEnergyTransaction <em>Energy Transaction</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getLossProfile()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='LossProfile is associated with an EnerrgyTransaction and must be completely contained within the time frame of the EnergyProfile associated with this EnergyTransaction.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='LossProfile is associated with an EnerrgyTransaction and must be completely contained within the time frame of the EnergyProfile associated with this EnergyTransaction.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='LossProfile is associated with an EnerrgyTransaction and must be completely contained within the time frame of the EnergyProfile associated with this EnergyTransaction.' Profile\040documentation='LossProfile is associated with an EnerrgyTransaction and must be completely contained within the time frame of the EnergyProfile associated with this EnergyTransaction.'"
 * @generated
 */
public interface LossProfile extends Profile {
	/**
	 * Returns the value of the '<em><b>Has Loss </b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Loss </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Loss </em>' reference.
	 * @see #setHasLoss_(TransmissionProvider)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getLossProfile_HasLoss_()
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getFor
	 * @model opposite="For"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Part of the LossProfile for an EnergyTransaction may be a loss for a TransmissionProvider.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Part of the LossProfile for an EnergyTransaction may be a loss for a TransmissionProvider.'"
	 * @generated
	 */
	TransmissionProvider getHasLoss_();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getHasLoss_ <em>Has Loss </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Loss </em>' reference.
	 * @see #getHasLoss_()
	 * @generated
	 */
	void setHasLoss_(TransmissionProvider value);

	/**
	 * Returns the value of the '<em><b>Energy Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getLossProfiles <em>Loss Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Transaction</em>' reference.
	 * @see #setEnergyTransaction(EnergyTransaction)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getLossProfile_EnergyTransaction()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getLossProfiles
	 * @model opposite="LossProfiles"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyTransaction may have a LossProfile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyTransaction may have a LossProfile.'"
	 * @generated
	 */
	EnergyTransaction getEnergyTransaction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getEnergyTransaction <em>Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Transaction</em>' reference.
	 * @see #getEnergyTransaction()
	 * @generated
	 */
	void setEnergyTransaction(EnergyTransaction value);

} // LossProfile
