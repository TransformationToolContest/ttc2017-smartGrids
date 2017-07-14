/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFactor <em>Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getSecurityConstraintSum <em>Security Constraint Sum</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getConstraintTerm()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A constraint term is one element of a linear constraint.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A constraint term is one element of a linear constraint.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A constraint term is one element of a linear constraint.' Profile\040documentation='A constraint term is one element of a linear constraint.'"
 * @generated
 */
public interface ConstraintTerm extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getConstraintTerm_Factor()
	 * @model required="true"
	 * @generated
	 */
	String getFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(String value);

	/**
	 * Returns the value of the '<em><b>Security Constraint Sum</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getConstraintTerms <em>Constraint Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint Sum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint Sum</em>' reference.
	 * @see #setSecurityConstraintSum(SecurityConstraintSum)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getConstraintTerm_SecurityConstraintSum()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getConstraintTerms
	 * @model opposite="ConstraintTerms"
	 * @generated
	 */
	SecurityConstraintSum getSecurityConstraintSum();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getSecurityConstraintSum <em>Security Constraint Sum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Constraint Sum</em>' reference.
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	void setSecurityConstraintSum(SecurityConstraintSum value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getConstraintTerm_Function()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The function is an enumerated value that can be \'active\', \'reactive\', or \'VA\' to indicate the type of flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The function is an enumerated value that can be \'active\', \'reactive\', or \'VA\' to indicate the type of flow.'"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ConstraintTerm#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

} // ConstraintTerm
