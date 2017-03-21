/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MW Limit Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule#getSecurityConstraintLimit <em>Security Constraint Limit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMWLimitSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum MW and optionally Minimum MW (Y1 and Y2, respectively)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Maximum MW and optionally Minimum MW (Y1 and Y2, respectively)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum MW and optionally Minimum MW (Y1 and Y2, respectively)' Profile\040documentation='Maximum MW and optionally Minimum MW (Y1 and Y2, respectively)'"
 * @generated
 */
public interface MWLimitSchedule extends Curve {
	/**
	 * Returns the value of the '<em><b>Security Constraint Limit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getMWLimitSchedules <em>MW Limit Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint Limit</em>' reference.
	 * @see #setSecurityConstraintLimit(ContingencyConstraintLimit)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMWLimitSchedule_SecurityConstraintLimit()
	 * @see CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getMWLimitSchedules
	 * @model opposite="MWLimitSchedules"
	 * @generated
	 */
	ContingencyConstraintLimit getSecurityConstraintLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule#getSecurityConstraintLimit <em>Security Constraint Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Constraint Limit</em>' reference.
	 * @see #getSecurityConstraintLimit()
	 * @generated
	 */
	void setSecurityConstraintLimit(ContingencyConstraintLimit value);

} // MWLimitSchedule
