/**
 */
package CIM.IEC61970.Protection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchrocheck Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Protection.ProtectionPackage#getSynchrocheckRelay()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A device that operates when two AC circuits are within the desired limits of frequency, phase angle, and voltage, to permit or to cause the paralleling of these two circuits. Used to prevent the paralleling of non-synchronous topological islands.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A device that operates when two AC circuits are within the desired limits of frequency, phase angle, and voltage, to permit or to cause the paralleling of these two circuits. Used to prevent the paralleling of non-synchronous topological islands.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A device that operates when two AC circuits are within the desired limits of frequency, phase angle, and voltage, to permit or to cause the paralleling of these two circuits. Used to prevent the paralleling of non-synchronous topological islands.' Profile\040documentation='A device that operates when two AC circuits are within the desired limits of frequency, phase angle, and voltage, to permit or to cause the paralleling of these two circuits. Used to prevent the paralleling of non-synchronous topological islands.'"
 * @generated
 */
public interface SynchrocheckRelay extends ProtectionEquipment {
	/**
	 * Returns the value of the '<em><b>Max Volt Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Volt Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Volt Diff</em>' attribute.
	 * @see #setMaxVoltDiff(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getSynchrocheckRelay_MaxVoltDiff()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum allowable difference voltage across the open device'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum allowable difference voltage across the open device'"
	 * @generated
	 */
	float getMaxVoltDiff();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volt Diff</em>' attribute.
	 * @see #getMaxVoltDiff()
	 * @generated
	 */
	void setMaxVoltDiff(float value);

	/**
	 * Returns the value of the '<em><b>Max Freq Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Freq Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Freq Diff</em>' attribute.
	 * @see #setMaxFreqDiff(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getSynchrocheckRelay_MaxFreqDiff()
	 * @model dataType="CIM.IEC61970.Domain.Frequency" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum allowable frequency difference across the open device'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum allowable frequency difference across the open device'"
	 * @generated
	 */
	float getMaxFreqDiff();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Freq Diff</em>' attribute.
	 * @see #getMaxFreqDiff()
	 * @generated
	 */
	void setMaxFreqDiff(float value);

	/**
	 * Returns the value of the '<em><b>Max Angle Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Angle Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Angle Diff</em>' attribute.
	 * @see #setMaxAngleDiff(float)
	 * @see CIM.IEC61970.Protection.ProtectionPackage#getSynchrocheckRelay_MaxAngleDiff()
	 * @model dataType="CIM.IEC61970.Domain.AngleRadians" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum allowable voltage vector phase angle difference across the open device'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum allowable voltage vector phase angle difference across the open device'"
	 * @generated
	 */
	float getMaxAngleDiff();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Angle Diff</em>' attribute.
	 * @see #getMaxAngleDiff()
	 * @generated
	 */
	void setMaxAngleDiff(float value);

} // SynchrocheckRelay
