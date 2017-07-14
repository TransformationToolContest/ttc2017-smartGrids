/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReadDateTime <em>Odometer Read Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getCrew <em>Crew</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReading <em>Odometer Reading</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicleInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of vehicle assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of vehicle assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of vehicle assets.' Profile\040documentation='Properties of vehicle assets.'"
 * @generated
 */
public interface VehicleInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @see #setUsageKind(VehicleUsageKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicleInfo_UsageKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The general categorization type of vehicle as categorized by the utility\'s asset management standards and practices.\nNote: (1) Vehicle model is defined by AssetModel, and (2) Specific people and organizations and their roles relative to this vehicle may be determined by the inherited Asset-ErpPerson and Asset-ErpOrganization associations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The general categorization type of vehicle as categorized by the utility\'s asset management standards and practices.\nNote: (1) Vehicle model is defined by AssetModel, and (2) Specific people and organizations and their roles relative to this vehicle may be determined by the inherited Asset-ErpPerson and Asset-ErpOrganization associations.'"
	 * @generated
	 */
	VehicleUsageKind getUsageKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getUsageKind <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @see #getUsageKind()
	 * @generated
	 */
	void setUsageKind(VehicleUsageKind value);

	/**
	 * Returns the value of the '<em><b>Odometer Read Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odometer Read Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odometer Read Date Time</em>' attribute.
	 * @see #setOdometerReadDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicleInfo_OdometerReadDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time the last odometer reading was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time the last odometer reading was recorded.'"
	 * @generated
	 */
	Date getOdometerReadDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odometer Read Date Time</em>' attribute.
	 * @see #getOdometerReadDateTime()
	 * @generated
	 */
	void setOdometerReadDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicleInfo_Crew()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getVehicles
	 * @model opposite="Vehicles"
	 * @generated
	 */
	Crew getCrew();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(Crew value);

	/**
	 * Returns the value of the '<em><b>Odometer Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odometer Reading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odometer Reading</em>' attribute.
	 * @see #setOdometerReading(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicleInfo_OdometerReading()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Odometer reading of this vehicle as of the \'odometerReadingDateTime\'. Refer to associated ActivityRecords for earlier readings.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Odometer reading of this vehicle as of the \'odometerReadingDateTime\'. Refer to associated ActivityRecords for earlier readings.'"
	 * @generated
	 */
	float getOdometerReading();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo#getOdometerReading <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odometer Reading</em>' attribute.
	 * @see #getOdometerReading()
	 * @generated
	 */
	void setOdometerReading(float value);

} // VehicleInfo
