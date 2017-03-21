/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Common.ActivityRecord;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureEvent()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An event where an asset has failed to perform its functions within specified parameters.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An event where an asset has failed to perform its functions within specified parameters.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An event where an asset has failed to perform its functions within specified parameters.' Profile\040documentation='An event where an asset has failed to perform its functions within specified parameters.'"
 * @generated
 */
public interface FailureEvent extends ActivityRecord {
	/**
	 * Returns the value of the '<em><b>Failure Isolation Method</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Isolation Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Isolation Method</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureEvent_FailureIsolationMethod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='How the asset failure was isolated from the system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='How the asset failure was isolated from the system.'"
	 * @generated
	 */
	FailureIsolationMethodKind getFailureIsolationMethod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Isolation Method</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @see #getFailureIsolationMethod()
	 * @generated
	 */
	void setFailureIsolationMethod(FailureIsolationMethodKind value);

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #setCorporateCode(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureEvent_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for asset failure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for asset failure.'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

	/**
	 * Returns the value of the '<em><b>Fault Locating Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Locating Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Locating Method</em>' attribute.
	 * @see #setFaultLocatingMethod(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureEvent_FaultLocatingMethod()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The method used for locating the faulted part of the asset. For example, cable options include: Cap Discharge-Thumping, Bridge Method, Visual Inspection, Other.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The method used for locating the faulted part of the asset. For example, cable options include: Cap Discharge-Thumping, Bridge Method, Visual Inspection, Other.'"
	 * @generated
	 */
	String getFaultLocatingMethod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Locating Method</em>' attribute.
	 * @see #getFaultLocatingMethod()
	 * @generated
	 */
	void setFaultLocatingMethod(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureEvent_Location()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Failure location on an object.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Failure location on an object.'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // FailureEvent
