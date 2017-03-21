/**
 */
package CIM.IEC61970.Contingency;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Contingency.ContingencyPackage#getContingencyElement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An element of a system event to be studied by contingency analysis, representing a change in status of a single piece of equipment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An element of a system event to be studied by contingency analysis, representing a change in status of a single piece of equipment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An element of a system event to be studied by contingency analysis, representing a change in status of a single piece of equipment.' Profile\040documentation='An element of a system event to be studied by contingency analysis, representing a change in status of a single piece of equipment.'"
 * @generated
 */
public interface ContingencyElement extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Contingency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Contingency.Contingency#getContingencyElement <em>Contingency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency</em>' reference.
	 * @see #setContingency(Contingency)
	 * @see CIM.IEC61970.Contingency.ContingencyPackage#getContingencyElement_Contingency()
	 * @see CIM.IEC61970.Contingency.Contingency#getContingencyElement
	 * @model opposite="ContingencyElement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A contingency element belongs to one contingency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A contingency element belongs to one contingency.'"
	 * @generated
	 */
	Contingency getContingency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingency</em>' reference.
	 * @see #getContingency()
	 * @generated
	 */
	void setContingency(Contingency value);

} // ContingencyElement
