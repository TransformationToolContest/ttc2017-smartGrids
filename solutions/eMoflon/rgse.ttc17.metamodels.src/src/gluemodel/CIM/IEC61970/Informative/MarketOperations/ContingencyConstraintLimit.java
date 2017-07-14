/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Contingency.Contingency;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contingency Constraint Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getMWLimitSchedules <em>MW Limit Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getContingency <em>Contingency</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getContingencyConstraintLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a constraint for a specific contingency. Use CurveSchedule XAxisUnits to specify MW or MVA.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a constraint for a specific contingency. Use CurveSchedule XAxisUnits to specify MW or MVA.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a constraint for a specific contingency. Use CurveSchedule XAxisUnits to specify MW or MVA.' Profile\040documentation='Possibly time-varying max MW or MVA and optionally Min MW limit or MVA limit (Y1 and Y2, respectively) assigned to a constraint for a specific contingency. Use CurveSchedule XAxisUnits to specify MW or MVA.'"
 * @generated
 */
public interface ContingencyConstraintLimit extends Curve {
	/**
	 * Returns the value of the '<em><b>Security Constraint Sum</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getContingencyConstraintLimits <em>Contingency Constraint Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint Sum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint Sum</em>' reference.
	 * @see #setSecurityConstraintSum(SecurityConstraintSum)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getContingencyConstraintLimit_SecurityConstraintSum()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintSum#getContingencyConstraintLimits
	 * @model opposite="ContingencyConstraintLimits"
	 * @generated
	 */
	SecurityConstraintSum getSecurityConstraintSum();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getSecurityConstraintSum <em>Security Constraint Sum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Constraint Sum</em>' reference.
	 * @see #getSecurityConstraintSum()
	 * @generated
	 */
	void setSecurityConstraintSum(SecurityConstraintSum value);

	/**
	 * Returns the value of the '<em><b>MW Limit Schedules</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule#getSecurityConstraintLimit <em>Security Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MW Limit Schedules</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MW Limit Schedules</em>' reference.
	 * @see #setMWLimitSchedules(MWLimitSchedule)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getContingencyConstraintLimit_MWLimitSchedules()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MWLimitSchedule#getSecurityConstraintLimit
	 * @model opposite="SecurityConstraintLimit"
	 * @generated
	 */
	MWLimitSchedule getMWLimitSchedules();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getMWLimitSchedules <em>MW Limit Schedules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MW Limit Schedules</em>' reference.
	 * @see #getMWLimitSchedules()
	 * @generated
	 */
	void setMWLimitSchedules(MWLimitSchedule value);

	/**
	 * Returns the value of the '<em><b>Contingency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Contingency.Contingency#getContingencyConstraintLimit <em>Contingency Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency</em>' reference.
	 * @see #setContingency(Contingency)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getContingencyConstraintLimit_Contingency()
	 * @see gluemodel.CIM.IEC61970.Contingency.Contingency#getContingencyConstraintLimit
	 * @model opposite="ContingencyConstraintLimit"
	 * @generated
	 */
	Contingency getContingency();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getContingency <em>Contingency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingency</em>' reference.
	 * @see #getContingency()
	 * @generated
	 */
	void setContingency(Contingency value);

} // ContingencyConstraintLimit
