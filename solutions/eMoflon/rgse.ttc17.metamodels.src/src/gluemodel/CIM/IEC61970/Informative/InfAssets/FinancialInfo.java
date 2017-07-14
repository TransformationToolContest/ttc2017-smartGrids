/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Various current financial properties associated with a particular asset. Historical properties may be determined by ActivityRecords associated with the asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Various current financial properties associated with a particular asset. Historical properties may be determined by ActivityRecords associated with the asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Various current financial properties associated with a particular asset. Historical properties may be determined by ActivityRecords associated with the asset.' Profile\040documentation='Various current financial properties associated with a particular asset. Historical properties may be determined by ActivityRecords associated with the asset.'"
 * @generated
 */
public interface FinancialInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see #setCostType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_CostType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of cost to which this Material Item belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of cost to which this Material Item belongs.'"
	 * @generated
	 */
	String getCostType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(String value);

	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' attribute.
	 * @see #setCostDescription(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_CostDescription()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of the cost.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of the cost.'"
	 * @generated
	 */
	String getCostDescription();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' attribute.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(String value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #setAccount(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_Account()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The account to which this actual material item is charged.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The account to which this actual material item is charged.'"
	 * @generated
	 */
	String getAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(String value);

	/**
	 * Returns the value of the '<em><b>Plant Transfer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Transfer Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Transfer Date Time</em>' attribute.
	 * @see #setPlantTransferDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_PlantTransferDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time asset\'s financial value was put in plant for regulatory accounting purposes (e.g., for rate base calculations). This is sometime referred to as the \"in-service date.\"'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time asset\'s financial value was put in plant for regulatory accounting purposes (e.g., for rate base calculations). This is sometime referred to as the \"in-service date.\"'"
	 * @generated
	 */
	Date getPlantTransferDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Transfer Date Time</em>' attribute.
	 * @see #getPlantTransferDateTime()
	 * @generated
	 */
	void setPlantTransferDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Warranty End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty End Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty End Date Time</em>' attribute.
	 * @see #setWarrantyEndDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_WarrantyEndDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time warranty on asset expires.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time warranty on asset expires.'"
	 * @generated
	 */
	Date getWarrantyEndDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty End Date Time</em>' attribute.
	 * @see #getWarrantyEndDateTime()
	 * @generated
	 */
	void setWarrantyEndDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Purchase Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Purchase Cost</em>' attribute.
	 * @see #setActualPurchaseCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_ActualPurchaseCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The actual purchase cost of this particular asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The actual purchase cost of this particular asset.'"
	 * @generated
	 */
	float getActualPurchaseCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Purchase Cost</em>' attribute.
	 * @see #getActualPurchaseCost()
	 * @generated
	 */
	void setActualPurchaseCost(float value);

	/**
	 * Returns the value of the '<em><b>Purchase Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Date Time</em>' attribute.
	 * @see #setPurchaseDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_PurchaseDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time asset was purchased.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time asset was purchased.'"
	 * @generated
	 */
	Date getPurchaseDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Date Time</em>' attribute.
	 * @see #getPurchaseDateTime()
	 * @generated
	 */
	void setPurchaseDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Order Number</em>' attribute.
	 * @see #setPurchaseOrderNumber(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_PurchaseOrderNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Purchase order identifier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Purchase order identifier.'"
	 * @generated
	 */
	String getPurchaseOrderNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order Number</em>' attribute.
	 * @see #getPurchaseOrderNumber()
	 * @generated
	 */
	void setPurchaseOrderNumber(String value);

	/**
	 * Returns the value of the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Value</em>' attribute.
	 * @see #setFinancialValue(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_FinancialValue()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of asset as of \'valueDateTime\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of asset as of \'valueDateTime\'.'"
	 * @generated
	 */
	float getFinancialValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Value</em>' attribute.
	 * @see #getFinancialValue()
	 * @generated
	 */
	void setFinancialValue(float value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_Quantity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.IntegerQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The quantity of the asset if per unit length, for example conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The quantity of the asset if per unit length, for example conductor.'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' attribute.
	 * @see #setValueDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_ValueDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time at which the financial value was last established.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time at which the financial value was last established.'"
	 * @generated
	 */
	Date getValueDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' attribute.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo_Asset()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getFinancialInfo
	 * @model opposite="FinancialInfo"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

} // FinancialInfo
