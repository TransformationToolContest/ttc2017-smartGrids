/**
 */
package outagePreventionMjtrace;

import CIM.IEC61968.Metering.MeterAsset;

import org.eclipse.emf.ecore.EObject;

import outagePreventionJointarget.PMUVoltageMeter;

import substationStandard.LNNodes.LNGroupM.MMXU;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>join Meter Asset MMXU PMU Voltage Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter#getLeft <em>Left</em>}</li>
 *   <li>{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter#getRight <em>Right</em>}</li>
 *   <li>{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_MMXU_PMUVoltageMeter()
 * @model
 * @generated
 */
public interface join_MeterAsset_MMXU_PMUVoltageMeter extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(MeterAsset)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_MMXU_PMUVoltageMeter_Left()
	 * @model ordered="false"
	 * @generated
	 */
	MeterAsset getLeft();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(MMXU)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_MMXU_PMUVoltageMeter_Right()
	 * @model ordered="false"
	 * @generated
	 */
	MMXU getRight();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(MMXU value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PMUVoltageMeter)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_MMXU_PMUVoltageMeter_Target()
	 * @model ordered="false"
	 * @generated
	 */
	PMUVoltageMeter getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PMUVoltageMeter value);

} // join_MeterAsset_MMXU_PMUVoltageMeter
