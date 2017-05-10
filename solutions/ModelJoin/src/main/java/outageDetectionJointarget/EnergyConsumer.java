/**
 */
package outageDetectionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionJointarget.EnergyConsumer#getLocation <em>Location</em>}</li>
 *   <li>{@link outageDetectionJointarget.EnergyConsumer#getReachability <em>Reachability</em>}</li>
 *   <li>{@link outageDetectionJointarget.EnergyConsumer#getPowerA <em>Power A</em>}</li>
 *   <li>{@link outageDetectionJointarget.EnergyConsumer#getID <em>ID</em>}</li>
 *   <li>{@link outageDetectionJointarget.EnergyConsumer#getControlAreaID <em>Control Area ID</em>}</li>
 * </ul>
 *
 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getEnergyConsumer()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy order='1' operator='thetajoin' condition='CIM.IEC61968.Metering.MeterAsset.mRID = COSEM.PhysicalDevice.ID'"
 * @generated
 */
public interface EnergyConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getEnergyConsumer_Location()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Location of this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Location of this asset.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.EnergyConsumer#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Reachability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reachability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachability</em>' attribute.
	 * @see #setReachability(int)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getEnergyConsumer_Reachability()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='COSEM.PhysicalDevice.AutoConnect.Connection'"
	 * @generated
	 */
	int getReachability();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.EnergyConsumer#getReachability <em>Reachability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reachability</em>' attribute.
	 * @see #getReachability()
	 * @generated
	 */
	void setReachability(int value);

	/**
	 * Returns the value of the '<em><b>Power A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power A</em>' attribute.
	 * @see #setPowerA(double)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getEnergyConsumer_PowerA()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='COSEM.PhysicalDevice.ElectricityValues.ApparentPowermL1'"
	 * @generated
	 */
	double getPowerA();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.EnergyConsumer#getPowerA <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power A</em>' attribute.
	 * @see #getPowerA()
	 * @generated
	 */
	void setPowerA(double value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getEnergyConsumer_ID()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='CIM.IEC61968.Metering.MeterAsset.ServiceDeliveryPoint.EnergyConsumer.mRID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.EnergyConsumer#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Control Area ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area ID</em>' attribute.
	 * @see #setControlAreaID(String)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getEnergyConsumer_ControlAreaID()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='if CIM.IEC61968.Metering.MeterAsset.ServiceDeliveryPoint.EnergyConsumer->oclIsKindOf(CIM.IEC61970.LoadModel.ConformLoad) then CIM.IEC61968.Metering.MeterAsset.ServiceDeliveryPoint.EnergyConsumer.ConformLoadGroup.SubLoadArea.LoadArea.ControlArea.mRID else CIM.IEC61968.Metering.MeterAsset.ServiceDeliveryPoint.EnergyConsumer.NonConformLoadGroup.SubLoadArea.LoadArea.ControlArea.mRID endif'"
	 * @generated
	 */
	String getControlAreaID();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.EnergyConsumer#getControlAreaID <em>Control Area ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area ID</em>' attribute.
	 * @see #getControlAreaID()
	 * @generated
	 */
	void setControlAreaID(String value);

} // EnergyConsumer
