/**
 */
package CIM.IEC61970.LoadModel;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Wires.EnergyConsumer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Cut Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getPowerCutZone()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An area or zone of the power system which is used for load shedding purposes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An area or zone of the power system which is used for load shedding purposes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An area or zone of the power system which is used for load shedding purposes.' Profile\040documentation='An area or zone of the power system which is used for load shedding purposes.'"
 * @generated
 */
public interface PowerCutZone extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.EnergyConsumer}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getPowerCutZone_EnergyConsumers()
	 * @see CIM.IEC61970.Wires.EnergyConsumer#getPowerCutZone
	 * @model opposite="PowerCutZone"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An energy consumer is assigned to a power cut zone'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An energy consumer is assigned to a power cut zone'"
	 * @generated
	 */
	EList<EnergyConsumer> getEnergyConsumers();

	/**
	 * Returns the value of the '<em><b>Cut Level1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Level1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Level1</em>' attribute.
	 * @see #setCutLevel1(float)
	 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getPowerCutZone_CutLevel1()
	 * @model dataType="CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='First level (amount) of load to cut as a percentage of total zone load'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='First level (amount) of load to cut as a percentage of total zone load'"
	 * @generated
	 */
	float getCutLevel1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Level1</em>' attribute.
	 * @see #getCutLevel1()
	 * @generated
	 */
	void setCutLevel1(float value);

	/**
	 * Returns the value of the '<em><b>Cut Level2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Level2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Level2</em>' attribute.
	 * @see #setCutLevel2(float)
	 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getPowerCutZone_CutLevel2()
	 * @model dataType="CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Second level (amount) of load to cut as a percentage of total zone load'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Second level (amount) of load to cut as a percentage of total zone load'"
	 * @generated
	 */
	float getCutLevel2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Level2</em>' attribute.
	 * @see #getCutLevel2()
	 * @generated
	 */
	void setCutLevel2(float value);

} // PowerCutZone
