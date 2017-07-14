/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMinMW <em>Min MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMaxMW <em>Max MW</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getRTO <em>RTO</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getActualMW <em>Actual MW</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraints()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Typical for regional transmission operators (RTOs), these constraints include transmission as well as generation group constraints identified in both base case and critical contingency cases.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Typical for regional transmission operators (RTOs), these constraints include transmission as well as generation group constraints identified in both base case and critical contingency cases.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Typical for regional transmission operators (RTOs), these constraints include transmission as well as generation group constraints identified in both base case and critical contingency cases.' Profile\040documentation='Typical for regional transmission operators (RTOs), these constraints include transmission as well as generation group constraints identified in both base case and critical contingency cases.'"
 * @generated
 */
public interface SecurityConstraints extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Min MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min MW</em>' attribute.
	 * @see #setMinMW(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraints_MinMW()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum MW limit (only for transmission constraints).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum MW limit (only for transmission constraints).'"
	 * @generated
	 */
	float getMinMW();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMinMW <em>Min MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min MW</em>' attribute.
	 * @see #getMinMW()
	 * @generated
	 */
	void setMinMW(float value);

	/**
	 * Returns the value of the '<em><b>Max MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max MW</em>' attribute.
	 * @see #setMaxMW(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraints_MaxMW()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum MW limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum MW limit'"
	 * @generated
	 */
	float getMaxMW();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getMaxMW <em>Max MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max MW</em>' attribute.
	 * @see #getMaxMW()
	 * @generated
	 */
	void setMaxMW(float value);

	/**
	 * Returns the value of the '<em><b>RTO</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraints <em>Security Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTO</em>' reference.
	 * @see #setRTO(RTO)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraints_RTO()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getSecurityConstraints
	 * @model opposite="SecurityConstraints"
	 * @generated
	 */
	RTO getRTO();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getRTO <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTO</em>' reference.
	 * @see #getRTO()
	 * @generated
	 */
	void setRTO(RTO value);

	/**
	 * Returns the value of the '<em><b>Actual MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual MW</em>' attribute.
	 * @see #setActualMW(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraints_ActualMW()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Actual branch or group of branches MW flow (only for transmission constraints)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Actual branch or group of branches MW flow (only for transmission constraints)'"
	 * @generated
	 */
	float getActualMW();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraints#getActualMW <em>Actual MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual MW</em>' attribute.
	 * @see #getActualMW()
	 * @generated
	 */
	void setActualMW(float value);

} // SecurityConstraints
