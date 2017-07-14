/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.Terminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTerminalConstraintTerm()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A constraint term associated with a specific terminal on a physical piece of equipment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A constraint term associated with a specific terminal on a physical piece of equipment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A constraint term associated with a specific terminal on a physical piece of equipment.' Profile\040documentation='A constraint term associated with a specific terminal on a physical piece of equipment.'"
 * @generated
 */
public interface TerminalConstraintTerm extends ConstraintTerm {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getTerminalConstraints <em>Terminal Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTerminalConstraintTerm_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getTerminalConstraints
	 * @model opposite="TerminalConstraints"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TerminalConstraintTerm#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

} // TerminalConstraintTerm
