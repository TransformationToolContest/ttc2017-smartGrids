/**
 */
package CIM.IEC61970.OperationalLimits;

import CIM.Element;

import CIM.IEC61970.Core.Terminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Group Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroupTerminal()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A specific directed terminal flow for a branch group.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A specific directed terminal flow for a branch group.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A specific directed terminal flow for a branch group.' Profile\040documentation='A specific directed terminal flow for a branch group.'"
 * @generated
 */
public interface BranchGroupTerminal extends Element {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroupTerminal_Terminal()
	 * @see CIM.IEC61970.Core.Terminal#getBranchGroupTerminal
	 * @model opposite="BranchGroupTerminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminal to be summed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal to be summed.'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Branch Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Group</em>' reference.
	 * @see #setBranchGroup(BranchGroup)
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroupTerminal_BranchGroup()
	 * @see CIM.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal
	 * @model opposite="BranchGroupTerminal"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The branch group to which the directed branch group terminals belong.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The branch group to which the directed branch group terminals belong.'"
	 * @generated
	 */
	BranchGroup getBranchGroup();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Group</em>' reference.
	 * @see #getBranchGroup()
	 * @generated
	 */
	void setBranchGroup(BranchGroup value);

	/**
	 * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Flow In</em>' attribute.
	 * @see #setPositiveFlowIn(boolean)
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroupTerminal_PositiveFlowIn()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The flow into the terminal is summed if set true.   The flow out of the terminanl is summed if set false.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The flow into the terminal is summed if set true.   The flow out of the terminanl is summed if set false.'"
	 * @generated
	 */
	boolean isPositiveFlowIn();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	void setPositiveFlowIn(boolean value);

} // BranchGroupTerminal
