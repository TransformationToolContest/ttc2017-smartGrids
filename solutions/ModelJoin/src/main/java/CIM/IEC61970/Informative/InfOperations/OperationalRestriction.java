/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod <em>Active Period</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOperationalRestriction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document that can be associated with a device to describe any sort of restrictions compared with the original manufacturer\'s specification e.g. temporary maximum loadings, maximum switching current, do not operate if bus couplers are open etc etc.  Since it is used in the network operations domain, it is associated with ConductingEquipment.\nIn the UK, for example, if a breaker or switch ever mal-operates, this is reported centrally and utilities use their asset systems to identify all the installed devices of the same manufacturer\'s type. They then apply operational restrictions in the operational systems to warn operators of potential problems. After appropriate inspection and maintenance, the operational restrictions may be removed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document that can be associated with a device to describe any sort of restrictions compared with the original manufacturer\'s specification e.g. temporary maximum loadings, maximum switching current, do not operate if bus couplers are open etc etc.  Since it is used in the network operations domain, it is associated with ConductingEquipment.\nIn the UK, for example, if a breaker or switch ever mal-operates, this is reported centrally and utilities use their asset systems to identify all the installed devices of the same manufacturer\'s type. They then apply operational restrictions in the operational systems to warn operators of potential problems. After appropriate inspection and maintenance, the operational restrictions may be removed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document that can be associated with a device to describe any sort of restrictions compared with the original manufacturer\'s specification e.g. temporary maximum loadings, maximum switching current, do not operate if bus couplers are open etc etc.  Since it is used in the network operations domain, it is associated with ConductingEquipment.\nIn the UK, for example, if a breaker or switch ever mal-operates, this is reported centrally and utilities use their asset systems to identify all the installed devices of the same manufacturer\'s type. They then apply operational restrictions in the operational systems to warn operators of potential problems. After appropriate inspection and maintenance, the operational restrictions may be removed.' Profile\040documentation='A document that can be associated with a device to describe any sort of restrictions compared with the original manufacturer\'s specification e.g. temporary maximum loadings, maximum switching current, do not operate if bus couplers are open etc etc.  Since it is used in the network operations domain, it is associated with ConductingEquipment.\nIn the UK, for example, if a breaker or switch ever mal-operates, this is reported centrally and utilities use their asset systems to identify all the installed devices of the same manufacturer\'s type. They then apply operational restrictions in the operational systems to warn operators of potential problems. After appropriate inspection and maintenance, the operational restrictions may be removed.'"
 * @generated
 */
public interface OperationalRestriction extends Document {
	/**
	 * Returns the value of the '<em><b>Active Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Period</em>' reference.
	 * @see #setActivePeriod(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOperationalRestriction_ActivePeriod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval during which the restriction is applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval during which the restriction is applied.'"
	 * @generated
	 */
	DateTimeInterval getActivePeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod <em>Active Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Period</em>' reference.
	 * @see #getActivePeriod()
	 * @generated
	 */
	void setActivePeriod(DateTimeInterval value);

} // OperationalRestriction
