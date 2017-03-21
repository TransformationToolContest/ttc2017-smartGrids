/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.SubLoadArea#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getSubLoadArea()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing' order='17'"
 * @generated
 */
public interface SubLoadArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Area</em>' reference.
	 * @see #setLoadArea(LoadArea)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getSubLoadArea_LoadArea()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The LoadArea where the SubLoadArea belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The LoadArea where the SubLoadArea belongs.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	LoadArea getLoadArea();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.SubLoadArea#getLoadArea <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Area</em>' reference.
	 * @see #getLoadArea()
	 * @generated
	 */
	void setLoadArea(LoadArea value);

} // SubLoadArea
