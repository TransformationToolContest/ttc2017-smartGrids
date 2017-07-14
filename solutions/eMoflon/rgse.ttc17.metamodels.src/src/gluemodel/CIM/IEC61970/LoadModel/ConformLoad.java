/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoad()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.' Profile\040documentation='ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.'"
 * @generated
 */
public interface ConformLoad extends EnergyConsumer {
	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(ConformLoadGroup)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoad_LoadGroup()
	 * @see gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers
	 * @model opposite="EnergyConsumers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Group of this ConformLoad.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Group of this ConformLoad.'"
	 * @generated
	 */
	ConformLoadGroup getLoadGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	void setLoadGroup(ConformLoadGroup value);

} // ConformLoad
