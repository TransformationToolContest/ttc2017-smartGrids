/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Location CU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups <em>CU Groups</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compatible unit at a given design location.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compatible unit at a given design location.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compatible unit at a given design location.' Profile\040documentation='Compatible unit at a given design location.'"
 * @generated
 */
public interface DesignLocationCU extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs <em>Design Locations CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_Designs()
	 * @see CIM.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs
	 * @model opposite="DesignLocationsCUs"
	 * @generated
	 */
	EList<Design> getDesigns();

	/**
	 * Returns the value of the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removal Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Date</em>' attribute.
	 * @see #setRemovalDate(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_RemovalDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Year when a CU that represents an asset is removed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Year when a CU that represents an asset is removed.'"
	 * @generated
	 */
	String getRemovalDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Date</em>' attribute.
	 * @see #getRemovalDate()
	 * @generated
	 */
	void setRemovalDate(String value);

	/**
	 * Returns the value of the '<em><b>Condition Factors</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.ConditionFactor}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Factors</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_ConditionFactors()
	 * @see CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs
	 * @model opposite="DesignLocationCUs"
	 * @generated
	 */
	EList<ConditionFactor> getConditionFactors();

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs
	 * @model opposite="DesignLocationCUs"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

	/**
	 * Returns the value of the '<em><b>Cu Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Quantity</em>' attribute.
	 * @see #setCuQuantity(BigInteger)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_CuQuantity()
	 * @model dataType="CIM.IEC61970.Domain.IntegerQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity of the CU being assigned to this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity of the CU being assigned to this location.'"
	 * @generated
	 */
	BigInteger getCuQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Quantity</em>' attribute.
	 * @see #getCuQuantity()
	 * @generated
	 */
	void setCuQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cu Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Account</em>' attribute.
	 * @see #setCuAccount(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_CuAccount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A code that helps direct accounting (capital, expense, or accounting treatment).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A code that helps direct accounting (capital, expense, or accounting treatment).'"
	 * @generated
	 */
	String getCuAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Account</em>' attribute.
	 * @see #getCuAccount()
	 * @generated
	 */
	void setCuAccount(String value);

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_WorkTasks()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs
	 * @model opposite="DesignLocationCUs"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_DesignLocation()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs
	 * @model opposite="DesignLocationCUs"
	 * @generated
	 */
	DesignLocation getDesignLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	void setDesignLocation(DesignLocation value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Cu Action</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfWork.WorkActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Action</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #setCuAction(WorkActionKind)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_CuAction()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A code that instructs the crew what action to perform.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A code that instructs the crew what action to perform.'"
	 * @generated
	 */
	WorkActionKind getCuAction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Action</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #getCuAction()
	 * @generated
	 */
	void setCuAction(WorkActionKind value);

	/**
	 * Returns the value of the '<em><b>Energization Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energization Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energization Flag</em>' attribute.
	 * @see #setEnergizationFlag(boolean)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_EnergizationFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if associated electrical equipment is intended to be energized while work is being performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if associated electrical equipment is intended to be energized while work is being performed.'"
	 * @generated
	 */
	boolean isEnergizationFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energization Flag</em>' attribute.
	 * @see #isEnergizationFlag()
	 * @generated
	 */
	void setEnergizationFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>CU Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CUGroup}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Groups</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_CUGroups()
	 * @see CIM.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs
	 * @model opposite="DesignLocationCUs"
	 * @generated
	 */
	EList<CUGroup> getCUGroups();

	/**
	 * Returns the value of the '<em><b>Cu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Usage</em>' attribute.
	 * @see #setCuUsage(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU_CuUsage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='As the same CU can be used for different purposes and accounting purposes, usage must be specified. Examples include: distribution, transmission, substation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='As the same CU can be used for different purposes and accounting purposes, usage must be specified. Examples include: distribution, transmission, substation.'"
	 * @generated
	 */
	String getCuUsage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Usage</em>' attribute.
	 * @see #getCuUsage()
	 * @generated
	 */
	void setCuUsage(String value);

} // DesignLocationCU
