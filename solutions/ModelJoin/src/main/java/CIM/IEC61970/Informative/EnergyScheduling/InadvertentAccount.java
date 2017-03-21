/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inadvertent Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount#getHostControlArea <em>Host Control Area</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getInadvertentAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An account for tracking inadvertent interchange versus time for each control area. A control area may have more than one inadvertent account in order to track inadvertent over one or more specific tie points in addition to the usual overall net inadvertent. Separate accounts would also be used to track designated time periods, such as on-peak and off-peak.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An account for tracking inadvertent interchange versus time for each control area. A control area may have more than one inadvertent account in order to track inadvertent over one or more specific tie points in addition to the usual overall net inadvertent. Separate accounts would also be used to track designated time periods, such as on-peak and off-peak.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An account for tracking inadvertent interchange versus time for each control area. A control area may have more than one inadvertent account in order to track inadvertent over one or more specific tie points in addition to the usual overall net inadvertent. Separate accounts would also be used to track designated time periods, such as on-peak and off-peak.' Profile\040documentation='An account for tracking inadvertent interchange versus time for each control area. A control area may have more than one inadvertent account in order to track inadvertent over one or more specific tie points in addition to the usual overall net inadvertent. Separate accounts would also be used to track designated time periods, such as on-peak and off-peak.'"
 * @generated
 */
public interface InadvertentAccount extends Curve {
	/**
	 * Returns the value of the '<em><b>Host Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getInadvertentAccounts <em>Inadvertent Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Control Area</em>' reference.
	 * @see #setHostControlArea(HostControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getInadvertentAccount_HostControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getInadvertentAccounts
	 * @model opposite="InadvertentAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area can have one or more net inadvertent interchange accounts'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area can have one or more net inadvertent interchange accounts'"
	 * @generated
	 */
	HostControlArea getHostControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount#getHostControlArea <em>Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Control Area</em>' reference.
	 * @see #getHostControlArea()
	 * @generated
	 */
	void setHostControlArea(HostControlArea value);

} // InadvertentAccount
