/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Assignment#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Assignment#getEffectivePeriod <em>Effective Period</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAssignment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An assignment is given to an ErpPerson, Crew, Organisation, Equipment Item, Tool, etc. and may be used to perform Work, WorkTasks, Procedures, etc. TimeSchedules may be set up directly for Assignments or indirectly via the associated WorkTask. Note that these associations are all inherited through the recursive relationship on Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An assignment is given to an ErpPerson, Crew, Organisation, Equipment Item, Tool, etc. and may be used to perform Work, WorkTasks, Procedures, etc. TimeSchedules may be set up directly for Assignments or indirectly via the associated WorkTask. Note that these associations are all inherited through the recursive relationship on Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An assignment is given to an ErpPerson, Crew, Organisation, Equipment Item, Tool, etc. and may be used to perform Work, WorkTasks, Procedures, etc. TimeSchedules may be set up directly for Assignments or indirectly via the associated WorkTask. Note that these associations are all inherited through the recursive relationship on Document.' Profile\040documentation='An assignment is given to an ErpPerson, Crew, Organisation, Equipment Item, Tool, etc. and may be used to perform Work, WorkTasks, Procedures, etc. TimeSchedules may be set up directly for Assignments or indirectly via the associated WorkTask. Note that these associations are all inherited through the recursive relationship on Document.'"
 * @generated
 */
public interface Assignment extends Document {
	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAssignment_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getAssignments
	 * @model opposite="Assignments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Crews having this Assignment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Crews having this Assignment.'"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' reference.
	 * @see #setEffectivePeriod(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAssignment_EffectivePeriod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Period between the assignment becoming effective and its expiration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Period between the assignment becoming effective and its expiration.'"
	 * @generated
	 */
	DateTimeInterval getEffectivePeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Assignment#getEffectivePeriod <em>Effective Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(DateTimeInterval value);

} // Assignment
