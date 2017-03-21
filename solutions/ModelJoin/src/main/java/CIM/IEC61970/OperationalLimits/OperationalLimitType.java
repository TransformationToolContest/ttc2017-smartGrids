/**
 */
package CIM.IEC61970.OperationalLimits;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}</li>
 *   <li>{@link CIM.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of limit.  The meaning of a specific limit is described in this class.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of limit.  The meaning of a specific limit is described in this class.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of limit.  The meaning of a specific limit is described in this class.' Profile\040documentation='A type of limit.  The meaning of a specific limit is described in this class.'"
 * @generated
 */
public interface OperationalLimitType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Acceptable Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptable Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptable Duration</em>' attribute.
	 * @see #setAcceptableDuration(float)
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitType_AcceptableDuration()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The nominal acceptable duration of the limit.  Limits are commonly expressed in terms of the a time limit for which the limit is normally acceptable.   The actual acceptable duration of a specific limit may depend on other local factors such as temperature or wind speed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The nominal acceptable duration of the limit.  Limits are commonly expressed in terms of the a time limit for which the limit is normally acceptable.   The actual acceptable duration of a specific limit may depend on other local factors such as temperature or wind speed.'"
	 * @generated
	 */
	float getAcceptableDuration();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptable Duration</em>' attribute.
	 * @see #getAcceptableDuration()
	 * @generated
	 */
	void setAcceptableDuration(float value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @see #setDirection(OperationalLimitDirectionKind)
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitType_Direction()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The direction of the limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The direction of the limit.'"
	 * @generated
	 */
	OperationalLimitDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(OperationalLimitDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Operational Limit</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.OperationalLimits.OperationalLimit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit</em>' reference list.
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitType_OperationalLimit()
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType
	 * @model opposite="OperationalLimitType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operational limits associated with this type of limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operational limits associated with this type of limit.'"
	 * @generated
	 */
	EList<OperationalLimit> getOperationalLimit();

} // OperationalLimitType
