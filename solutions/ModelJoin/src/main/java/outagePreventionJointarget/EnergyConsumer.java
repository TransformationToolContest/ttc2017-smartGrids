/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.EnergyConsumer#getMRID <em>MRID</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getEnergyConsumer()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing' order='13'"
 * @generated
 */
public interface EnergyConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRID</em>' attribute.
	 * @see #setMRID(String)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getEnergyConsumer_MRID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepattributes'"
	 * @generated
	 */
	String getMRID();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.EnergyConsumer#getMRID <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRID</em>' attribute.
	 * @see #getMRID()
	 * @generated
	 */
	void setMRID(String value);

} // EnergyConsumer
