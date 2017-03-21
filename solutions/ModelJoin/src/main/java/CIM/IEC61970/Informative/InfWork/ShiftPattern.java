/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The patterns of shifts worked by people or crews.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The patterns of shifts worked by people or crews.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The patterns of shifts worked by people or crews.' Profile\040documentation='The patterns of shifts worked by people or crews.'"
 * @generated
 */
public interface ShiftPattern extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Assignment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Type</em>' attribute.
	 * @see #setAssignmentType(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern_AssignmentType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of assignement intended to be worked on this shift, for example, temporary, standard, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of assignement intended to be worked on this shift, for example, temporary, standard, etc.'"
	 * @generated
	 */
	String getAssignmentType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Type</em>' attribute.
	 * @see #getAssignmentType()
	 * @generated
	 */
	void setAssignmentType(String value);

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getShiftPatterns <em>Shift Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getShiftPatterns
	 * @model opposite="ShiftPatterns"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Cycle Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Count</em>' attribute.
	 * @see #setCycleCount(int)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern_CycleCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of cycles for a temporary shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of cycles for a temporary shift.'"
	 * @generated
	 */
	int getCycleCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Count</em>' attribute.
	 * @see #getCycleCount()
	 * @generated
	 */
	void setCycleCount(int value);

	/**
	 * Returns the value of the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Interval</em>' reference.
	 * @see #setValidityInterval(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern_ValidityInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time interval for which this shift pattern is valid (when it became effective and when it expires).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time interval for which this shift pattern is valid (when it became effective and when it expires).'"
	 * @generated
	 */
	DateTimeInterval getValidityInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	void setValidityInterval(DateTimeInterval value);

} // ShiftPattern
