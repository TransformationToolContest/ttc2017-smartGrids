/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Case Constraint Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBaseCaseConstraintLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a contingency analysis base case. Use CurveSchedule XAxisUnits to specify MW or MVA. To be used only if the BaseCaseConstraintLimit differs from the DefaultConstraintLimit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a contingency analysis base case. Use CurveSchedule XAxisUnits to specify MW or MVA. To be used only if the BaseCaseConstraintLimit differs from the DefaultConstraintLimit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a contingency analysis base case. Use CurveSchedule XAxisUnits to specify MW or MVA. To be used only if the BaseCaseConstraintLimit differs from the DefaultConstraintLimit.' Profile\040documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a contingency analysis base case. Use CurveSchedule XAxisUnits to specify MW or MVA. To be used only if the BaseCaseConstraintLimit differs from the DefaultConstraintLimit.'"
 * @generated
 */
public interface BaseCaseConstraintLimit extends Curve {
	/**
	 * Returns the value of the '<em><b>Security Constraint Sum</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getBaseCaseConstraintLimit <em>Base Case Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint Sum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint Sum</em>' reference.
	 * @see #setSecurityConstraintSum(SecurityConstraintSum)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBaseCaseConstraintLimit_SecurityConstraintSum()
	 * @see CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getBaseCaseConstraintLimit
	 * @model opposite="BaseCaseConstraintLimit"
	 * @generated
	 */
	SecurityConstraintSum getSecurityConstraintSum();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BaseCaseConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Constraint Sum</em>' reference.
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	void setSecurityConstraintSum(SecurityConstraintSum value);

} // BaseCaseConstraintLimit
