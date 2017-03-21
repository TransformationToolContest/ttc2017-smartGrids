/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.Asset#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getAsset()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepsupertype' order='3'"
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getAsset_Location()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Location of this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Location of this asset.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.Asset#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Asset
