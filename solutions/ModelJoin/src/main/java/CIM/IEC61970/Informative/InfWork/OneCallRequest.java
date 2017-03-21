/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Call Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations <em>Work Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A request for other utilities to mark their underground facilities prior to commencement of construction and/or maintenance.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A request for other utilities to mark their underground facilities prior to commencement of construction and/or maintenance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A request for other utilities to mark their underground facilities prior to commencement of construction and/or maintenance.' Profile\040documentation='A request for other utilities to mark their underground facilities prior to commencement of construction and/or maintenance.'"
 * @generated
 */
public interface OneCallRequest extends Document {
	/**
	 * Returns the value of the '<em><b>Marking Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking Instruction</em>' attribute.
	 * @see #setMarkingInstruction(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest_MarkingInstruction()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Instructions for marking a dig area, if applicable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Instructions for marking a dig area, if applicable.'"
	 * @generated
	 */
	String getMarkingInstruction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking Instruction</em>' attribute.
	 * @see #getMarkingInstruction()
	 * @generated
	 */
	void setMarkingInstruction(String value);

	/**
	 * Returns the value of the '<em><b>Explosives Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explosives Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explosives Used</em>' attribute.
	 * @see #setExplosivesUsed(boolean)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest_ExplosivesUsed()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if explosives have been or are planned to be used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if explosives have been or are planned to be used.'"
	 * @generated
	 */
	boolean isExplosivesUsed();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explosives Used</em>' attribute.
	 * @see #isExplosivesUsed()
	 * @generated
	 */
	void setExplosivesUsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Work Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkLocation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Locations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest_WorkLocations()
	 * @see CIM.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest
	 * @model opposite="OneCallRequest"
	 * @generated
	 */
	EList<WorkLocation> getWorkLocations();

	/**
	 * Returns the value of the '<em><b>Marked Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marked Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked Indicator</em>' attribute.
	 * @see #setMarkedIndicator(boolean)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest_MarkedIndicator()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if work location has been marked, for example for a dig area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if work location has been marked, for example for a dig area.'"
	 * @generated
	 */
	boolean isMarkedIndicator();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marked Indicator</em>' attribute.
	 * @see #isMarkedIndicator()
	 * @generated
	 */
	void setMarkedIndicator(boolean value);

} // OneCallRequest
