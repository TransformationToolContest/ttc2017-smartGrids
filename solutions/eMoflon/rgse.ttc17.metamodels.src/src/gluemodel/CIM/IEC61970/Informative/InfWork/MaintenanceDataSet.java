/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaintenanceDataSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The result of a maintenance activity, a type of Procedure, for a given attribute of an asset is documentated in an MaintenanceDataSet.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The result of a maintenance activity, a type of Procedure, for a given attribute of an asset is documentated in an MaintenanceDataSet.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The result of a maintenance activity, a type of Procedure, for a given attribute of an asset is documentated in an MaintenanceDataSet.' Profile\040documentation='The result of a maintenance activity, a type of Procedure, for a given attribute of an asset is documentated in an MaintenanceDataSet.'"
 * @generated
 */
public interface MaintenanceDataSet extends ProcedureDataSet {
	/**
	 * Returns the value of the '<em><b>Maint Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Code</em>' attribute.
	 * @see #setMaintCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaintenanceDataSet_MaintCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for the type of maintenance performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for the type of maintenance performed.'"
	 * @generated
	 */
	String getMaintCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Code</em>' attribute.
	 * @see #getMaintCode()
	 * @generated
	 */
	void setMaintCode(String value);

	/**
	 * Returns the value of the '<em><b>Condition Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Before</em>' attribute.
	 * @see #setConditionBefore(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaintenanceDataSet_ConditionBefore()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of the condition of the asset just prior to maintenance being performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of the condition of the asset just prior to maintenance being performed.'"
	 * @generated
	 */
	String getConditionBefore();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Before</em>' attribute.
	 * @see #getConditionBefore()
	 * @generated
	 */
	void setConditionBefore(String value);

	/**
	 * Returns the value of the '<em><b>Condition After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition After</em>' attribute.
	 * @see #setConditionAfter(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getMaintenanceDataSet_ConditionAfter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Condition of asset just following maintenance procedure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Condition of asset just following maintenance procedure.'"
	 * @generated
	 */
	String getConditionAfter();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition After</em>' attribute.
	 * @see #getConditionAfter()
	 * @generated
	 */
	void setConditionAfter(String value);

} // MaintenanceDataSet
