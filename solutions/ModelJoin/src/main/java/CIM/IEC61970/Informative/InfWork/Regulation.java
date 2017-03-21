/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.Regulation#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRegulation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Special requirements and/or regulations may pertain to certain types of assets or work. For example, fire protection and scaffolding.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Special requirements and/or regulations may pertain to certain types of assets or work. For example, fire protection and scaffolding.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Special requirements and/or regulations may pertain to certain types of assets or work. For example, fire protection and scaffolding.' Profile\040documentation='Special requirements and/or regulations may pertain to certain types of assets or work. For example, fire protection and scaffolding.'"
 * @generated
 */
public interface Regulation extends Document {
	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRegulation_ReferenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='External reference to regulation, if applicable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='External reference to regulation, if applicable.'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.Regulation#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // Regulation
