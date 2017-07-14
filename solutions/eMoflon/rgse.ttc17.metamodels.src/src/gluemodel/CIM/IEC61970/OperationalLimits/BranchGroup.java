/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A group of branch terminals whose directed flow summation is to be monitored. Abranch group need not form a cutset of the network.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A group of branch terminals whose directed flow summation is to be monitored. Abranch group need not form a cutset of the network.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A group of branch terminals whose directed flow summation is to be monitored. Abranch group need not form a cutset of the network.' Profile\040documentation='A group of branch terminals whose directed flow summation is to be monitored. Abranch group need not form a cutset of the network.'"
 * @generated
 */
public interface BranchGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Monitor Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Reactive Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Reactive Power</em>' attribute.
	 * @see #setMonitorReactivePower(boolean)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_MonitorReactivePower()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Monitor the reactive power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Monitor the reactive power flow.'"
	 * @generated
	 */
	boolean isMonitorReactivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Reactive Power</em>' attribute.
	 * @see #isMonitorReactivePower()
	 * @generated
	 */
	void setMonitorReactivePower(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Reactive Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Reactive Power</em>' attribute.
	 * @see #setMinimumReactivePower(float)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_MinimumReactivePower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum reactive power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum reactive power flow.'"
	 * @generated
	 */
	float getMinimumReactivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Reactive Power</em>' attribute.
	 * @see #getMinimumReactivePower()
	 * @generated
	 */
	void setMinimumReactivePower(float value);

	/**
	 * Returns the value of the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Group Terminal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Group Terminal</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_BranchGroupTerminal()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup
	 * @model opposite="BranchGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The directed branch group terminals to be summed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The directed branch group terminals to be summed.'"
	 * @generated
	 */
	EList<BranchGroupTerminal> getBranchGroupTerminal();

	/**
	 * Returns the value of the '<em><b>Monitor Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Active Power</em>' attribute.
	 * @see #setMonitorActivePower(boolean)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_MonitorActivePower()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Monitor the active power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Monitor the active power flow.'"
	 * @generated
	 */
	boolean isMonitorActivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Active Power</em>' attribute.
	 * @see #isMonitorActivePower()
	 * @generated
	 */
	void setMonitorActivePower(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Reactive Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Reactive Power</em>' attribute.
	 * @see #setMaximumReactivePower(float)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_MaximumReactivePower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum reactive power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum reactive power flow.'"
	 * @generated
	 */
	float getMaximumReactivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Reactive Power</em>' attribute.
	 * @see #getMaximumReactivePower()
	 * @generated
	 */
	void setMaximumReactivePower(float value);

	/**
	 * Returns the value of the '<em><b>Maximum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Active Power</em>' attribute.
	 * @see #setMaximumActivePower(float)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_MaximumActivePower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum active power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum active power flow.'"
	 * @generated
	 */
	float getMaximumActivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Active Power</em>' attribute.
	 * @see #getMaximumActivePower()
	 * @generated
	 */
	void setMaximumActivePower(float value);

	/**
	 * Returns the value of the '<em><b>Minimum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Active Power</em>' attribute.
	 * @see #setMinimumActivePower(float)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup_MinimumActivePower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum active power flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum active power flow.'"
	 * @generated
	 */
	float getMinimumActivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Active Power</em>' attribute.
	 * @see #getMinimumActivePower()
	 * @generated
	 */
	void setMinimumActivePower(float value);

} // BranchGroup
