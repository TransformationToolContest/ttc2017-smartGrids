/**
 */
package CIM.IEC61970.Protection;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Wires.ProtectedSwitch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclose Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Protection.ProtectionPackage#getRecloseSequence()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reclose sequence (open and close) is defined for each possible reclosure of a breaker.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A reclose sequence (open and close) is defined for each possible reclosure of a breaker.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reclose sequence (open and close) is defined for each possible reclosure of a breaker.' Profile\040documentation='A reclose sequence (open and close) is defined for each possible reclosure of a breaker.'"
 * @generated
 */
public interface RecloseSequence extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Protected Switch</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Switch</em>' reference.
	 * @see #setProtectedSwitch(ProtectedSwitch)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getRecloseSequence_ProtectedSwitch()
	 * @see CIM.IEC61970.Wires.ProtectedSwitch#getRecloseSequences
	 * @model opposite="RecloseSequences"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A breaker may have zero or more automatic reclosures after a trip occurs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A breaker may have zero or more automatic reclosures after a trip occurs.'"
	 * @generated
	 */
	ProtectedSwitch getProtectedSwitch();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Switch</em>' reference.
	 * @see #getProtectedSwitch()
	 * @generated
	 */
	void setProtectedSwitch(ProtectedSwitch value);

	/**
	 * Returns the value of the '<em><b>Reclose Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Delay</em>' attribute.
	 * @see #setRecloseDelay(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getRecloseSequence_RecloseDelay()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates the time lapse before the reclose step will execute a reclose.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates the time lapse before the reclose step will execute a reclose.'"
	 * @generated
	 */
	float getRecloseDelay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclose Delay</em>' attribute.
	 * @see #getRecloseDelay()
	 * @generated
	 */
	void setRecloseDelay(float value);

	/**
	 * Returns the value of the '<em><b>Reclose Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Step</em>' attribute.
	 * @see #setRecloseStep(int)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getRecloseSequence_RecloseStep()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates the ordinal position of the reclose step relative to other steps in the sequence.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates the ordinal position of the reclose step relative to other steps in the sequence.'"
	 * @generated
	 */
	int getRecloseStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclose Step</em>' attribute.
	 * @see #getRecloseStep()
	 * @generated
	 */
	void setRecloseStep(int value);

} // RecloseSequence
