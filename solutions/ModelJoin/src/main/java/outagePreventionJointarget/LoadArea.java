/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.LoadArea#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLoadArea()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing' order='18'"
 * @generated
 */
public interface LoadArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLoadArea_ControlArea()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control area specification that is used for the load forecast.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area specification that is used for the load forecast.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	ControlArea getControlArea();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.LoadArea#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	void setControlArea(ControlArea value);

} // LoadArea
