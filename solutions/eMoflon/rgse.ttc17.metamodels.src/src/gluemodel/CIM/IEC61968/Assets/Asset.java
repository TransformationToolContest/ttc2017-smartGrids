/**
 */
package gluemodel.CIM.IEC61968.Assets;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.ElectronicAddress;
import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.Status;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole;
import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve;
import gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole;
import gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.Medium;
import gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo;

import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem;

import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

import gluemodel.CIM.IEC61970.Meas.Measurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetPropertyCurves <em>Asset Property Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getFromAssetRoles <em>From Asset Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#isCritical <em>Critical</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getErpInventory <em>Erp Inventory</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getReliabilityInfos <em>Reliability Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetFunctions <em>Asset Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getRatings <em>Ratings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getMediums <em>Mediums</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getProperties <em>Properties</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getToAssetRoles <em>To Asset Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getLocation <em>Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getApplication <em>Application</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getErpItemMaster <em>Erp Item Master</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.Asset#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tangible resource of the utility, including power system equipment, cabinets, buildings, etc. For electrical network equipment, the role of the asset is defined through PowerSystemResource and its subclasses, defined mainly in the Wires model (refer to IEC61970-301 and model package IEC61970::Wires). Asset description places emphasis on the physical characteristics of the equipment fulfilling that role.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Tangible resource of the utility, including power system equipment, cabinets, buildings, etc. For electrical network equipment, the role of the asset is defined through PowerSystemResource and its subclasses, defined mainly in the Wires model (refer to IEC61970-301 and model package IEC61970::Wires). Asset description places emphasis on the physical characteristics of the equipment fulfilling that role.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tangible resource of the utility, including power system equipment, cabinets, buildings, etc. For electrical network equipment, the role of the asset is defined through PowerSystemResource and its subclasses, defined mainly in the Wires model (refer to IEC61970-301 and model package IEC61970::Wires). Asset description places emphasis on the physical characteristics of the equipment fulfilling that role.' Profile\040documentation='Tangible resource of the utility, including power system equipment, cabinets, buildings, etc. For electrical network equipment, the role of the asset is defined through PowerSystemResource and its subclasses, defined mainly in the Wires model (refer to IEC61970-301 and model package IEC61970::Wires). Asset description places emphasis on the physical characteristics of the equipment fulfilling that role.'"
 * @generated
 */
public interface Asset extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Asset Property Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Property Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Property Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_AssetPropertyCurves()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	EList<AssetPropertyCurve> getAssetPropertyCurves();

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_SerialNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Serial number of this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Serial number of this asset.'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Measurements()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Financial Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Info</em>' reference.
	 * @see #setFinancialInfo(FinancialInfo)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_FinancialInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	FinancialInfo getFinancialInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Info</em>' reference.
	 * @see #getFinancialInfo()
	 * @generated
	 */
	void setFinancialInfo(FinancialInfo value);

	/**
	 * Returns the value of the '<em><b>From Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Asset Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_FromAssetRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset
	 * @model opposite="ToAsset"
	 * @generated
	 */
	EList<AssetAssetRole> getFromAssetRoles();

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ActivityRecords()
	 * @see gluemodel.CIM.IEC61968.Common.ActivityRecord#getAssets
	 * @model opposite="Assets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All activity records created for this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All activity records created for this asset.'"
	 * @generated
	 */
	EList<ActivityRecord> getActivityRecords();

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_DocumentRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	EList<DocAssetRole> getDocumentRoles();

	/**
	 * Returns the value of the '<em><b>Asset Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.AssetContainer#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Container</em>' reference.
	 * @see #setAssetContainer(AssetContainer)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_AssetContainer()
	 * @see gluemodel.CIM.IEC61968.Assets.AssetContainer#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	AssetContainer getAssetContainer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Container</em>' reference.
	 * @see #getAssetContainer()
	 * @generated
	 */
	void setAssetContainer(AssetContainer value);

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #setCritical(boolean)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Critical()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if asset is considered critical for some reason (for example, a pole with critical attachments).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if asset is considered critical for some reason (for example, a pole with critical attachments).'"
	 * @generated
	 */
	boolean isCritical();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isCritical()
	 * @generated
	 */
	void setCritical(boolean value);

	/**
	 * Returns the value of the '<em><b>Erp Inventory</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory</em>' reference.
	 * @see #setErpInventory(ErpInventory)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ErpInventory()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	ErpInventory getErpInventory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getErpInventory <em>Erp Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Inventory</em>' reference.
	 * @see #getErpInventory()
	 * @generated
	 */
	void setErpInventory(ErpInventory value);

	/**
	 * Returns the value of the '<em><b>Reliability Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ReliabilityInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	EList<ReliabilityInfo> getReliabilityInfos();

	/**
	 * Returns the value of the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Date</em>' attribute.
	 * @see #setManufacturedDate(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ManufacturedDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date this asset was manufactured.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date this asset was manufactured.'"
	 * @generated
	 */
	String getManufacturedDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Date</em>' attribute.
	 * @see #getManufacturedDate()
	 * @generated
	 */
	void setManufacturedDate(String value);

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_WorkTask()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Number</em>' attribute.
	 * @see #setLotNumber(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_LotNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Lot number for this asset. Even for the same model and version number, many assets are manufactured in lots.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lot number for this asset. Even for the same model and version number, many assets are manufactured in lots.'"
	 * @generated
	 */
	String getLotNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' attribute.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(String value);

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ElectronicAddress()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Electronic address.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Electronic address.'"
	 * @generated
	 */
	ElectronicAddress getElectronicAddress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getElectronicAddress <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	void setElectronicAddress(ElectronicAddress value);

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ScheduledEvents()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	EList<ScheduledEvent> getScheduledEvents();

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ChangeItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Loss Of Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Loss Of Life</em>' attribute.
	 * @see #setInitialLossOfLife(float)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_InitialLossOfLife()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Whenever an asset is reconditioned, percentage of expected life for the asset when it was new; zero for new devices.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Whenever an asset is reconditioned, percentage of expected life for the asset when it was new; zero for new devices.'"
	 * @generated
	 */
	float getInitialLossOfLife();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Loss Of Life</em>' attribute.
	 * @see #getInitialLossOfLife()
	 * @generated
	 */
	void setInitialLossOfLife(float value);

	/**
	 * Returns the value of the '<em><b>Asset Functions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.AssetFunction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Functions</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_AssetFunctions()
	 * @see gluemodel.CIM.IEC61968.Assets.AssetFunction#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	EList<AssetFunction> getAssetFunctions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this asset.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Condition</em>' attribute.
	 * @see #setInitialCondition(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_InitialCondition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Condition of asset in inventory or at time of installation. Examples include new, rebuilt, overhaul required, other. Refer to inspection data for information on the most current condition of the asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Condition of asset in inventory or at time of installation. Examples include new, rebuilt, overhaul required, other. Refer to inspection data for information on the most current condition of the asset.'"
	 * @generated
	 */
	String getInitialCondition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Condition</em>' attribute.
	 * @see #getInitialCondition()
	 * @generated
	 */
	void setInitialCondition(String value);

	/**
	 * Returns the value of the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Number</em>' attribute.
	 * @see #setUtcNumber(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_UtcNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Uniquely Tracked Commodity (UTC) number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Uniquely Tracked Commodity (UTC) number.'"
	 * @generated
	 */
	String getUtcNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Number</em>' attribute.
	 * @see #getUtcNumber()
	 * @generated
	 */
	void setUtcNumber(String value);

	/**
	 * Returns the value of the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Date</em>' attribute.
	 * @see #setInstallationDate(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_InstallationDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Date current installation was completed, which may not be the same as the in-service date. Asset may have been installed at other locations previously. Ignored if asset is (1) not currently installed (e.g., stored in a depot) or (2) not intended to be installed (e.g., vehicle, tool).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Date current installation was completed, which may not be the same as the in-service date. Asset may have been installed at other locations previously. Ignored if asset is (1) not currently installed (e.g., stored in a depot) or (2) not intended to be installed (e.g., vehicle, tool).'"
	 * @generated
	 */
	String getInstallationDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation Date</em>' attribute.
	 * @see #getInstallationDate()
	 * @generated
	 */
	void setInstallationDate(String value);

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ErpOrganisationRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	EList<OrgAssetRole> getErpOrganisationRoles();

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingAssets <em>Rating Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Ratings()
	 * @see gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingAssets
	 * @model opposite="RatingAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='UserAttributes used to specify ratings of this asset. Ratings also can be used to set the initial value of operational measurement limits. Use \'name\' to specify what kind of rating it is (e.g., voltage, current), and \'value\' attribute for the actual value and unit information of the rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='UserAttributes used to specify ratings of this asset. Ratings also can be used to set the initial value of operational measurement limits. Use \'name\' to specify what kind of rating it is (e.g., voltage, current), and \'value\' attribute for the actual value and unit information of the rating.'"
	 * @generated
	 */
	EList<UserAttribute> getRatings();

	/**
	 * Returns the value of the '<em><b>Mediums</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediums</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediums</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Mediums()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	EList<Medium> getMediums();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertyAssets <em>Property Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Properties()
	 * @see gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertyAssets
	 * @model opposite="PropertyAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='UserAttributes used to specify further properties of this asset. Use \'name\' to specify what kind of property it is, and \'value.value\' attribute for the actual value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='UserAttributes used to specify further properties of this asset. Use \'name\' to specify what kind of property it is, and \'value.value\' attribute for the actual value.'"
	 * @generated
	 */
	EList<UserAttribute> getProperties();

	/**
	 * Returns the value of the '<em><b>Asset Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Info</em>' reference.
	 * @see #setAssetInfo(AssetInfo)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_AssetInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getAsset
	 * @model opposite="Asset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of parameters applicable to this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of parameters applicable to this asset.'"
	 * @generated
	 */
	AssetInfo getAssetInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Info</em>' reference.
	 * @see #getAssetInfo()
	 * @generated
	 */
	void setAssetInfo(AssetInfo value);

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #setCorporateCode(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for this type of asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for this type of asset.'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

	/**
	 * Returns the value of the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Price</em>' attribute.
	 * @see #setPurchasePrice(float)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_PurchasePrice()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Purchase price of asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Purchase price of asset.'"
	 * @generated
	 */
	float getPurchasePrice();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Price</em>' attribute.
	 * @see #getPurchasePrice()
	 * @generated
	 */
	void setPurchasePrice(float value);

	/**
	 * Returns the value of the '<em><b>To Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Asset Roles</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ToAssetRoles()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset
	 * @model opposite="FromAsset"
	 * @generated
	 */
	EList<AssetAssetRole> getToAssetRoles();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Location()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getAssets
	 * @model opposite="Assets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Location of this asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Location of this asset.'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Application()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The way this particular asset is being used in this installation. For example, the application of a bushing when attached to a specific transformer winding would be one of the following: H1, H2, H3, H0, X1, X2, X3, X0, Y1, Y2, Y3, Y0.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The way this particular asset is being used in this installation. For example, the application of a bushing when attached to a specific transformer winding would be one of the following: H1, H2, H3, H0, X1, X2, X3, X0, Y1, Y2, Y3, Y0.'"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_PowerSystemResources()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getAssets
	 * @model opposite="Assets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All power system resources used to electrically model this asset. For example, transformer asset is electrically modelled with a transformer and its windings and tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All power system resources used to electrically model this asset. For example, transformer asset is electrically modelled with a transformer and its windings and tap changer.'"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Extension mechanism to accommodate utility-specific categorisation of Asset and its subtypes, according to their corporate standards, practices, and existing IT systems (e.g., for management of assets, maintenance, work, outage, customers, etc.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Extension mechanism to accommodate utility-specific categorisation of Asset and its subtypes, according to their corporate standards, practices, and existing IT systems (e.g., for management of assets, maintenance, work, outage, customers, etc.).'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Erp Item Master</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Item Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Item Master</em>' reference.
	 * @see #setErpItemMaster(ErpItemMaster)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ErpItemMaster()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset
	 * @model opposite="Asset"
	 * @generated
	 */
	ErpItemMaster getErpItemMaster();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getErpItemMaster <em>Erp Item Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Item Master</em>' reference.
	 * @see #getErpItemMaster()
	 * @generated
	 */
	void setErpItemMaster(ErpItemMaster value);

	/**
	 * Returns the value of the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test</em>' reference.
	 * @see #setAcceptanceTest(AcceptanceTest)
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_AcceptanceTest()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information on acceptance test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information on acceptance test.'"
	 * @generated
	 */
	AcceptanceTest getAcceptanceTest();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Assets.Asset#getAcceptanceTest <em>Acceptance Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Test</em>' reference.
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	void setAcceptanceTest(AcceptanceTest value);

	/**
	 * Returns the value of the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delivery Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delivery Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAsset_ErpRecDeliveryItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets
	 * @model opposite="Assets"
	 * @generated
	 */
	EList<ErpRecDelvLineItem> getErpRecDeliveryItems();

} // Asset
