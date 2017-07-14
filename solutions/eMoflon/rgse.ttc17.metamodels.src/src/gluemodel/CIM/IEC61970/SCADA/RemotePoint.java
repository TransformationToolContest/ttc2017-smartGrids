/**
 */
package gluemodel.CIM.IEC61970.SCADA;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemotePoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For a RTU remote points correspond to telemetered values or control outputs. Other units (e.g. control centers) usually also contain calculated values.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='For a RTU remote points correspond to telemetered values or control outputs. Other units (e.g. control centers) usually also contain calculated values.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a RTU remote points correspond to telemetered values or control outputs. Other units (e.g. control centers) usually also contain calculated values.' Profile\040documentation='For a RTU remote points correspond to telemetered values or control outputs. Other units (e.g. control centers) usually also contain calculated values.'"
 * @generated
 */
public interface RemotePoint extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Remote Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getRemotePoints <em>Remote Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Unit</em>' reference.
	 * @see #setRemoteUnit(RemoteUnit)
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemotePoint_RemoteUnit()
	 * @see gluemodel.CIM.IEC61970.SCADA.RemoteUnit#getRemotePoints
	 * @model opposite="RemotePoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remote unit this point belongs to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remote unit this point belongs to.'"
	 * @generated
	 */
	RemoteUnit getRemoteUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Unit</em>' reference.
	 * @see #getRemoteUnit()
	 * @generated
	 */
	void setRemoteUnit(RemoteUnit value);

} // RemotePoint
