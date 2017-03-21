/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Constraint Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getContingencyConstraintLimits <em>Contingency Constraint Limits</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getDefaultConstraintLimit <em>Default Constraint Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getBaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getConstraintTerms <em>Constraint Terms</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getRTO <em>RTO</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintSum()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Typically provided by RTO systems, constraints identified in both base case and critical contingency cases have to be transferred.\nA constraint has N (>=1) constraint terms. A term is represented by an\ninstance of TerminalConstraintTerm. \nThe constraint expression is:\nminValue <= c1*x1 + c2*x2 + .... cn*xn + k <= maxValue\nwhere:\n- cn is ConstraintTerm.factor \n- xn is the flow at the terminal\nFlow into the associated equipment is positive for the purpose of ConnectivityNode NodeConstraintTerm\n\nk is SecurityConstraintsLinear.resourceMW\nThe units of k are assumed to be same as the units of the flows, xn.  The constants, cn, are dimensionless.\nWith these conventions, cn and k are all positive for a typical constraint such as \"weighted sum of generation must be less than limit\". Furthermore, cn are all 1.0 for a case such as \"interface flow must be less than limit\", assuming the terminals are chosen on the importing side of the interface.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Typically provided by RTO systems, constraints identified in both base case and critical contingency cases have to be transferred.\nA constraint has N (>=1) constraint terms. A term is represented by an\ninstance of TerminalConstraintTerm. \nThe constraint expression is:\nminValue <= c1*x1 + c2*x2 + .... cn*xn + k <= maxValue\nwhere:\n- cn is ConstraintTerm.factor \n- xn is the flow at the terminal\nFlow into the associated equipment is positive for the purpose of ConnectivityNode NodeConstraintTerm\n\nk is SecurityConstraintsLinear.resourceMW\nThe units of k are assumed to be same as the units of the flows, xn.  The constants, cn, are dimensionless.\nWith these conventions, cn and k are all positive for a typical constraint such as \"weighted sum of generation must be less than limit\". Furthermore, cn are all 1.0 for a case such as \"interface flow must be less than limit\", assuming the terminals are chosen on the importing side of the interface.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Typically provided by RTO systems, constraints identified in both base case and critical contingency cases have to be transferred.\nA constraint has N (>=1) constraint terms. A term is represented by an\ninstance of TerminalConstraintTerm. \nThe constraint expression is:\nminValue <= c1*x1 + c2*x2 + .... cn*xn + k <= maxValue\nwhere:\n- cn is ConstraintTerm.factor \n- xn is the flow at the terminal\nFlow into the associated equipment is positive for the purpose of ConnectivityNode NodeConstraintTerm\n\nk is SecurityConstraintsLinear.resourceMW\nThe units of k are assumed to be same as the units of the flows, xn.  The constants, cn, are dimensionless.\nWith these conventions, cn and k are all positive for a typical constraint such as \"weighted sum of generation must be less than limit\". Furthermore, cn are all 1.0 for a case such as \"interface flow must be less than limit\", assuming the terminals are chosen on the importing side of the interface.' Profile\040documentation='Typically provided by RTO systems, constraints identified in both base case and critical contingency cases have to be transferred.\nA constraint has N (>=1) constraint terms. A term is represented by an\ninstance of TerminalConstraintTerm. \nThe constraint expression is:\nminValue <= c1*x1 + c2*x2 + .... cn*xn + k <= maxValue\nwhere:\n- cn is ConstraintTerm.factor \n- xn is the flow at the terminal\nFlow into the associated equipment is positive for the purpose of ConnectivityNode NodeConstraintTerm\n\nk is SecurityConstraintsLinear.resourceMW\nThe units of k are assumed to be same as the units of the flows, xn.  The constants, cn, are dimensionless.\nWith these conventions, cn and k are all positive for a typical constraint such as \"weighted sum of generation must be less than limit\". Furthermore, cn are all 1.0 for a case such as \"interface flow must be less than limit\", assuming the terminals are chosen on the importing side of the interface.'"
 * @generated
 */
public interface SecurityConstraintSum extends MarketFactors {
	/**
	 * Returns the value of the '<em><b>Contingency Constraint Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency Constraint Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency Constraint Limits</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintSum_ContingencyConstraintLimits()
	 * @see CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getSecurityConstraintSum
	 * @model opposite="SecurityConstraintSum"
	 * @generated
	 */
	EList<ContingencyConstraintLimit> getContingencyConstraintLimits();

	/**
	 * Returns the value of the '<em><b>Default Constraint Limit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Constraint Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Constraint Limit</em>' reference.
	 * @see #setDefaultConstraintLimit(DefaultConstraintLimit)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintSum_DefaultConstraintLimit()
	 * @see CIM.IEC61970.Informative.MarketOperations.DefaultConstraintLimit#getSecurityConstraintSum
	 * @model opposite="SecurityConstraintSum"
	 * @generated
	 */
	DefaultConstraintLimit getDefaultConstraintLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getDefaultConstraintLimit <em>Default Constraint Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Constraint Limit</em>' reference.
	 * @see #getDefaultConstraintLimit()
	 * @generated
	 */
	void setDefaultConstraintLimit(DefaultConstraintLimit value);

	/**
	 * Returns the value of the '<em><b>Base Case Constraint Limit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Case Constraint Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Case Constraint Limit</em>' reference.
	 * @see #setBaseCaseConstraintLimit(BaseCaseConstraintLimit)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintSum_BaseCaseConstraintLimit()
	 * @see CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit#getSecurityConstraintSum
	 * @model opposite="SecurityConstraintSum"
	 * @generated
	 */
	BaseCaseConstraintLimit getBaseCaseConstraintLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getBaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Case Constraint Limit</em>' reference.
	 * @see #getBaseCaseConstraintLimit()
	 * @generated
	 */
	void setBaseCaseConstraintLimit(BaseCaseConstraintLimit value);

	/**
	 * Returns the value of the '<em><b>Constraint Terms</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ConstraintTerm}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getSecurityConstraintSum <em>Security Constraint Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Terms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Terms</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintSum_ConstraintTerms()
	 * @see CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getSecurityConstraintSum
	 * @model opposite="SecurityConstraintSum"
	 * @generated
	 */
	EList<ConstraintTerm> getConstraintTerms();

	/**
	 * Returns the value of the '<em><b>RTO</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraintsLinear <em>Security Constraints Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTO</em>' reference.
	 * @see #setRTO(RTO)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintSum_RTO()
	 * @see CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraintsLinear
	 * @model opposite="SecurityConstraintsLinear"
	 * @generated
	 */
	RTO getRTO();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getRTO <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTO</em>' reference.
	 * @see #getRTO()
	 * @generated
	 */
	void setRTO(RTO value);

} // SecurityConstraintSum
