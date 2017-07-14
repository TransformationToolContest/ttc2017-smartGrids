/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Craft;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Capabilities of a crew.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Capabilities of a crew.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Capabilities of a crew.' Profile\040documentation='Capabilities of a crew.'"
 * @generated
 */
public interface Capability extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category by utility\'s work management standards and practices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category by utility\'s work management standards and practices.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_WorkTasks()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getCapabilities
	 * @model opposite="Capabilities"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_ValidityInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time interval for which this capability is valid (when it became effective and when it expires).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time interval for which this capability is valid (when it became effective and when it expires).'"
	 * @generated
	 */
	DateTimeInterval getValidityInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getValidityInterval <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	void setValidityInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_Crew()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getCapabilities
	 * @model opposite="Capabilities"
	 * @generated
	 */
	Crew getCrew();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(Crew value);

	/**
	 * Returns the value of the '<em><b>Crafts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crafts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crafts</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_Crafts()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.Craft#getCapabilities
	 * @model opposite="Capabilities"
	 * @generated
	 */
	EList<Craft> getCrafts();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Performance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Factor</em>' attribute.
	 * @see #setPerformanceFactor(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCapability_PerformanceFactor()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Capability performance factor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Capability performance factor.'"
	 * @generated
	 */
	String getPerformanceFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Factor</em>' attribute.
	 * @see #getPerformanceFactor()
	 * @generated
	 */
	void setPerformanceFactor(String value);

} // Capability
