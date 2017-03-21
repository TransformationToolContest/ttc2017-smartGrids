/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getDate <em>Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergySchedulingVersion()
 * @model
 * @generated
 */
public interface EnergySchedulingVersion extends Element {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergySchedulingVersion_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergySchedulingVersion_Version()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='v 4 moved SubControlArea'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='v 4 moved SubControlArea'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // EnergySchedulingVersion
