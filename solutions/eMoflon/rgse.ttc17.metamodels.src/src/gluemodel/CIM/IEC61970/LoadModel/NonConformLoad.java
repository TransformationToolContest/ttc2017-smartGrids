/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getNonConformLoad()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.' Profile\040documentation='NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.'"
 * @generated
 */
public interface NonConformLoad extends EnergyConsumer {
	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(NonConformLoadGroup)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getNonConformLoad_LoadGroup()
	 * @see gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers
	 * @model opposite="EnergyConsumers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Group of this ConformLoad.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Group of this ConformLoad.'"
	 * @generated
	 */
	NonConformLoadGroup getLoadGroup();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	void setLoadGroup(NonConformLoadGroup value);

} // NonConformLoad
