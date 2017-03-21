/**
 */
package CIM.IEC61968.Metering;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceAssets <em>End Device Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Abstraction for management of group communications within a two-way AMR system or the data for a group of related meters. Commands can be issued to all of the meters that belong to a meter group using a defined group address and the underlying AMR communication infrastructure.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Abstraction for management of group communications within a two-way AMR system or the data for a group of related meters. Commands can be issued to all of the meters that belong to a meter group using a defined group address and the underlying AMR communication infrastructure.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Abstraction for management of group communications within a two-way AMR system or the data for a group of related meters. Commands can be issued to all of the meters that belong to a meter group using a defined group address and the underlying AMR communication infrastructure.' Profile\040documentation='Abstraction for management of group communications within a two-way AMR system or the data for a group of related meters. Commands can be issued to all of the meters that belong to a meter group using a defined group address and the underlying AMR communication infrastructure.'"
 * @generated
 */
public interface EndDeviceGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Demand Response Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response Program</em>' reference.
	 * @see #setDemandResponseProgram(DemandResponseProgram)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceGroup_DemandResponseProgram()
	 * @see CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups
	 * @model opposite="EndDeviceGroups"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demand response program for this group of end devices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demand response program for this group of end devices.'"
	 * @generated
	 */
	DemandResponseProgram getDemandResponseProgram();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Response Program</em>' reference.
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	void setDemandResponseProgram(DemandResponseProgram value);

	/**
	 * Returns the value of the '<em><b>Group Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Address</em>' attribute.
	 * @see #setGroupAddress(int)
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceGroup_GroupAddress()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Address of this end device group.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Address of this end device group.'"
	 * @generated
	 */
	int getGroupAddress();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Address</em>' attribute.
	 * @see #getGroupAddress()
	 * @generated
	 */
	void setGroupAddress(int value);

	/**
	 * Returns the value of the '<em><b>End Device Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.EndDeviceAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Assets</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceGroup_EndDeviceAssets()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceGroups
	 * @model opposite="EndDeviceGroups"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device assets this end device group refers to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device assets this end device group refers to.'"
	 * @generated
	 */
	EList<EndDeviceAsset> getEndDeviceAssets();

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see CIM.IEC61968.Metering.MeteringPackage#getEndDeviceGroup_EndDeviceControls()
	 * @see CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup
	 * @model opposite="EndDeviceGroup"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device controls sending commands to this end device group.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device controls sending commands to this end device group.'"
	 * @generated
	 */
	EList<EndDeviceControl> getEndDeviceControls();

} // EndDeviceGroup
