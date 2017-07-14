/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Misc Cost Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Various cost items that are not associated with compatible units. Examples include rental equipment, labor, materials, contractor costs, permits - anything not covered in a CU.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Various cost items that are not associated with compatible units. Examples include rental equipment, labor, materials, contractor costs, permits - anything not covered in a CU.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Various cost items that are not associated with compatible units. Examples include rental equipment, labor, materials, contractor costs, permits - anything not covered in a CU.' Profile\040documentation='Various cost items that are not associated with compatible units. Examples include rental equipment, labor, materials, contractor costs, permits - anything not covered in a CU.'"
 * @generated
 */
public interface MiscCostItem extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_DesignLocation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems
	 * @model opposite="MiscCostItems"
	 * @generated
	 */
	DesignLocation getDesignLocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	void setDesignLocation(DesignLocation value);

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_WorkTask()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems
	 * @model opposite="MiscCostItems"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Unit</em>' attribute.
	 * @see #setCostPerUnit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_CostPerUnit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The cost per unit for this misc. item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The cost per unit for this misc. item.'"
	 * @generated
	 */
	float getCostPerUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Unit</em>' attribute.
	 * @see #getCostPerUnit()
	 * @generated
	 */
	void setCostPerUnit(float value);

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_WorkCostDetail()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems
	 * @model opposite="MiscCostItems"
	 * @generated
	 */
	WorkCostDetail getWorkCostDetail();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	void setWorkCostDetail(WorkCostDetail value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_Quantity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.IntegerQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity of the misc. item being assigned to this location.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity of the misc. item being assigned to this location.'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #setAccount(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_Account()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This drives the accounting treatment for this misc. item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This drives the accounting treatment for this misc. item.'"
	 * @generated
	 */
	String getAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(String value);

	/**
	 * Returns the value of the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref ID</em>' attribute.
	 * @see #setExternalRefID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_ExternalRefID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='External Reference ID (e.g. PO#, Serial #)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='External Reference ID (e.g. PO#, Serial #)'"
	 * @generated
	 */
	String getExternalRefID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ref ID</em>' attribute.
	 * @see #getExternalRefID()
	 * @generated
	 */
	void setExternalRefID(String value);

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see #setCostType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem_CostType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The cost category for accounting, such as material, labor, vehicle, contractor, equipment, overhead.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The cost category for accounting, such as material, labor, vehicle, contractor, equipment, overhead.'"
	 * @generated
	 */
	String getCostType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(String value);

} // MiscCostItem
