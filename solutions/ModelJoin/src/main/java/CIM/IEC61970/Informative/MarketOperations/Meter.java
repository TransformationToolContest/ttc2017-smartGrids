/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Meter#getRegisteredResource <em>Registered Resource</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMeter()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is generic logical meter object.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This is generic logical meter object.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is generic logical meter object.' Profile\040documentation='This is generic logical meter object.'"
 * @generated
 */
public interface Meter extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Registered Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMeters <em>Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Resource</em>' reference.
	 * @see #setRegisteredResource(RegisteredResource)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMeter_RegisteredResource()
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMeters
	 * @model opposite="Meters"
	 * @generated
	 */
	RegisteredResource getRegisteredResource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Meter#getRegisteredResource <em>Registered Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Resource</em>' reference.
	 * @see #getRegisteredResource()
	 * @generated
	 */
	void setRegisteredResource(RegisteredResource value);

} // Meter
