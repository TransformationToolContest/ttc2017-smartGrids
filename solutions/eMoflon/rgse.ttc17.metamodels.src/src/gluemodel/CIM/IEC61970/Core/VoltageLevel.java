/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getBays <em>Bays</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getVoltageLevel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.' Profile\040documentation='A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.'"
 * @generated
 */
public interface VoltageLevel extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Bays</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.Bay}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bays</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getVoltageLevel_Bays()
	 * @see gluemodel.CIM.IEC61970.Core.Bay#getVoltageLevel
	 * @model opposite="VoltageLevel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EList<Bay> getBays();

	/**
	 * Returns the value of the '<em><b>Low Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Voltage Limit</em>' attribute.
	 * @see #setLowVoltageLimit(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getVoltageLevel_LowVoltageLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The bus bar\'s low voltage limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The bus bar\'s low voltage limit'"
	 * @generated
	 */
	float getLowVoltageLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Voltage Limit</em>' attribute.
	 * @see #getLowVoltageLimit()
	 * @generated
	 */
	void setLowVoltageLimit(float value);

	/**
	 * Returns the value of the '<em><b>High Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Voltage Limit</em>' attribute.
	 * @see #setHighVoltageLimit(float)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getVoltageLevel_HighVoltageLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The bus bar\'s high voltage limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The bus bar\'s high voltage limit'"
	 * @generated
	 */
	float getHighVoltageLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Voltage Limit</em>' attribute.
	 * @see #getHighVoltageLimit()
	 * @generated
	 */
	void setHighVoltageLimit(float value);

	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getVoltageLevel_BaseVoltage()
	 * @see gluemodel.CIM.IEC61970.Core.BaseVoltage#getVoltageLevel
	 * @model opposite="VoltageLevel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The base voltage used for all equipment within the VoltageLevel.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The base voltage used for all equipment within the VoltageLevel.'"
	 * @generated
	 */
	BaseVoltage getBaseVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	void setBaseVoltage(BaseVoltage value);

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Substation#getVoltageLevels <em>Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference.
	 * @see #setSubstation(Substation)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getVoltageLevel_Substation()
	 * @see gluemodel.CIM.IEC61970.Core.Substation#getVoltageLevels
	 * @model opposite="VoltageLevels"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	Substation getSubstation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' reference.
	 * @see #getSubstation()
	 * @generated
	 */
	void setSubstation(Substation value);

} // VoltageLevel
