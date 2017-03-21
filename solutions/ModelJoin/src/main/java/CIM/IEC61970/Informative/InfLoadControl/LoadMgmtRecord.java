/**
 */
package CIM.IEC61970.Informative.InfLoadControl;

import CIM.IEC61968.Common.ActivityRecord;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Mgmt Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtRecord()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A log of actual measured load reductions as a result of load shed operations.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A log of actual measured load reductions as a result of load shed operations.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A log of actual measured load reductions as a result of load shed operations.' Profile\040documentation='A log of actual measured load reductions as a result of load shed operations.'"
 * @generated
 */
public interface LoadMgmtRecord extends ActivityRecord {
	/**
	 * Returns the value of the '<em><b>Load Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Reduction</em>' attribute.
	 * @see #setLoadReduction(float)
	 * @see CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtRecord_LoadReduction()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The measured reduction of the total load power as a result of the load shed activation. Thus it is the difference in power before and after the load shed operation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The measured reduction of the total load power as a result of the load shed activation. Thus it is the difference in power before and after the load shed operation.'"
	 * @generated
	 */
	float getLoadReduction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Reduction</em>' attribute.
	 * @see #getLoadReduction()
	 * @generated
	 */
	void setLoadReduction(float value);

	/**
	 * Returns the value of the '<em><b>Load Mgmt Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords <em>Load Mgmt Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt Function</em>' reference.
	 * @see #setLoadMgmtFunction(LoadMgmtFunction)
	 * @see CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtRecord_LoadMgmtFunction()
	 * @see CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords
	 * @model opposite="LoadMgmtRecords"
	 * @generated
	 */
	LoadMgmtFunction getLoadMgmtFunction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Mgmt Function</em>' reference.
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	void setLoadMgmtFunction(LoadMgmtFunction value);

} // LoadMgmtRecord
