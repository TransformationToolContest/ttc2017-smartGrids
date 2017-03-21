/**
 */
package CIM.IEC61970.LoadModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoadGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A group of loads conforming to an allocation pattern.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A group of loads conforming to an allocation pattern.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A group of loads conforming to an allocation pattern.' Profile\040documentation='A group of loads conforming to an allocation pattern.'"
 * @generated
 */
public interface ConformLoadGroup extends LoadGroup {
	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.LoadModel.ConformLoad}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoadGroup_EnergyConsumers()
	 * @see CIM.IEC61970.LoadModel.ConformLoad#getLoadGroup
	 * @model opposite="LoadGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conform loads assigned to this ConformLoadGroup.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conform loads assigned to this ConformLoadGroup.'"
	 * @generated
	 */
	EList<ConformLoad> getEnergyConsumers();

	/**
	 * Returns the value of the '<em><b>Conform Load Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.LoadModel.ConformLoadSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conform Load Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conform Load Schedules</em>' reference list.
	 * @see CIM.IEC61970.LoadModel.LoadModelPackage#getConformLoadGroup_ConformLoadSchedules()
	 * @see CIM.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup
	 * @model opposite="ConformLoadGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ConformLoadSchedules in the ConformLoadGroup.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ConformLoadSchedules in the ConformLoadGroup.'"
	 * @generated
	 */
	EList<ConformLoadSchedule> getConformLoadSchedules();

} // ConformLoadGroup
