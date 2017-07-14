/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A value associated with a specific kind of limit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A value associated with a specific kind of limit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A value associated with a specific kind of limit.' Profile\040documentation='A value associated with a specific kind of limit.'"
 * @generated
 */
public interface OperationalLimit extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimit_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to specify high/low and limit levels.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to specify high/low and limit levels.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference.
	 * @see #setOperationalLimitSet(OperationalLimitSet)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimit_OperationalLimitSet()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue
	 * @model opposite="OperationalLimitValue"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The limit set to which the limit values belong.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The limit set to which the limit values belong.'"
	 * @generated
	 */
	OperationalLimitSet getOperationalLimitSet();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Limit Set</em>' reference.
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	void setOperationalLimitSet(OperationalLimitSet value);

	/**
	 * Returns the value of the '<em><b>Operational Limit Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Type</em>' reference.
	 * @see #setOperationalLimitType(OperationalLimitType)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimit_OperationalLimitType()
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit
	 * @model opposite="OperationalLimit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The limit type associated with this limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The limit type associated with this limit.'"
	 * @generated
	 */
	OperationalLimitType getOperationalLimitType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Limit Type</em>' reference.
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	void setOperationalLimitType(OperationalLimitType value);

} // OperationalLimit
