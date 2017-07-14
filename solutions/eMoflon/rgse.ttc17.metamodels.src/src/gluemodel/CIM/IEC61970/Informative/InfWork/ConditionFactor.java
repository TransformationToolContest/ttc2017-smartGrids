/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getCfValue <em>Cf Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getDesigns <em>Designs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is to specify the various condition factors for a design that may alter the cost estimate or the allocation.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This is to specify the various condition factors for a design that may alter the cost estimate or the allocation.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is to specify the various condition factors for a design that may alter the cost estimate or the allocation.' Profile\040documentation='This is to specify the various condition factors for a design that may alter the cost estimate or the allocation.'"
 * @generated
 */
public interface ConditionFactor extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Cf Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cf Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cf Value</em>' attribute.
	 * @see #setCfValue(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor_CfValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The actual value of the condition factor, such as labor flat fee or percentage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The actual value of the condition factor, such as labor flat fee or percentage.'"
	 * @generated
	 */
	String getCfValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getCfValue <em>Cf Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cf Value</em>' attribute.
	 * @see #getCfValue()
	 * @generated
	 */
	void setCfValue(String value);

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor_DesignLocations()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors
	 * @model opposite="ConditionFactors"
	 * @generated
	 */
	EList<DesignLocation> getDesignLocations();

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor_DesignLocationCUs()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors
	 * @model opposite="ConditionFactors"
	 * @generated
	 */
	EList<DesignLocationCU> getDesignLocationCUs();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactorKind
	 * @see #setKind(ConditionFactorKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of this condition factor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of this condition factor.'"
	 * @generated
	 */
	ConditionFactorKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConditionFactorKind value);

	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Design#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor_Designs()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Design#getConditionFactors
	 * @model opposite="ConditionFactors"
	 * @generated
	 */
	EList<Design> getDesigns();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.ConditionFactor#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // ConditionFactor
