/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve;
import CIM.IEC61970.Informative.MarketOperations.TransactionBid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyPriceCurves <em>Energy Price Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyTransId <em>Energy Trans Id</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getState <em>State</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#isFirmInterchangeFlag <em>Firm Interchange Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProduct <em>Energy Product</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getDeliveryPointP <em>Delivery Point P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getExport_SubControlArea <em>Export Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getImport_SubControlArea <em>Import Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReceiptPointP <em>Receipt Point P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCongestChargeMax <em>Congest Charge Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProfiles <em>Energy Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCurtailmentProfiles <em>Curtailment Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getLossProfiles <em>Loss Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyMin <em>Energy Min</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the schedule for energy transfers between interchange areas that are necessary to satisfy the associated interchange transaction.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies the schedule for energy transfers between interchange areas that are necessary to satisfy the associated interchange transaction.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the schedule for energy transfers between interchange areas that are necessary to satisfy the associated interchange transaction.' Profile\040documentation='Specifies the schedule for energy transfers between interchange areas that are necessary to satisfy the associated interchange transaction.'"
 * @generated
 */
public interface EnergyTransaction extends Document {
	/**
	 * Returns the value of the '<em><b>Energy Price Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getEnergyTransactions <em>Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Price Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Price Curves</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_EnergyPriceCurves()
	 * @see CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getEnergyTransactions
	 * @model opposite="EnergyTransactions"
	 * @generated
	 */
	EList<EnergyPriceCurve> getEnergyPriceCurves();

	/**
	 * Returns the value of the '<em><b>Energy Trans Id</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.TransactionBid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Trans Id</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Trans Id</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_EnergyTransId()
	 * @model
	 * @generated
	 */
	EList<TransactionBid> getEnergyTransId();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Object)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_State()
	 * @model dataType="CIM.EnumeratedType" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='{ Approve | Deny | Study }'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='{ Approve | Deny | Study }'"
	 * @generated
	 */
	Object getState();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Object value);

	/**
	 * Returns the value of the '<em><b>Firm Interchange Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firm Interchange Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firm Interchange Flag</em>' attribute.
	 * @see #setFirmInterchangeFlag(boolean)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_FirmInterchangeFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Firm interchange flag indicates whether or not this energy transaction can be changed without potential financial consequences.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Firm interchange flag indicates whether or not this energy transaction can be changed without potential financial consequences.'"
	 * @generated
	 */
	boolean isFirmInterchangeFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#isFirmInterchangeFlag <em>Firm Interchange Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firm Interchange Flag</em>' attribute.
	 * @see #isFirmInterchangeFlag()
	 * @generated
	 */
	void setFirmInterchangeFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Energy Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getEnergyTransactions <em>Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Product</em>' reference.
	 * @see #setEnergyProduct(EnergyProduct)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_EnergyProduct()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct#getEnergyTransactions
	 * @model opposite="EnergyTransactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The \"Source\" for an EnergyTransaction is an EnergyProduct which is injected into a ControlArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The \"Source\" for an EnergyTransaction is an EnergyProduct which is injected into a ControlArea.'"
	 * @generated
	 */
	EnergyProduct getEnergyProduct();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyProduct <em>Energy Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Product</em>' reference.
	 * @see #getEnergyProduct()
	 * @generated
	 */
	void setEnergyProduct(EnergyProduct value);

	/**
	 * Returns the value of the '<em><b>Delivery Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Point P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Point P</em>' attribute.
	 * @see #setDeliveryPointP(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_DeliveryPointP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Delivery point active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Delivery point active power'"
	 * @generated
	 */
	float getDeliveryPointP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getDeliveryPointP <em>Delivery Point P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Point P</em>' attribute.
	 * @see #getDeliveryPointP()
	 * @generated
	 */
	void setDeliveryPointP(float value);

	/**
	 * Returns the value of the '<em><b>Export Sub Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getExport_EnergyTransactions <em>Export Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Sub Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Sub Control Area</em>' reference.
	 * @see #setExport_SubControlArea(SubControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_Export_SubControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getExport_EnergyTransactions
	 * @model opposite="Export_EnergyTransactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy is transferred between interchange areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy is transferred between interchange areas'"
	 * @generated
	 */
	SubControlArea getExport_SubControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getExport_SubControlArea <em>Export Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Sub Control Area</em>' reference.
	 * @see #getExport_SubControlArea()
	 * @generated
	 */
	void setExport_SubControlArea(SubControlArea value);

	/**
	 * Returns the value of the '<em><b>Import Sub Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getImport_EnergyTransactions <em>Import Energy Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Sub Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Sub Control Area</em>' reference.
	 * @see #setImport_SubControlArea(SubControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_Import_SubControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getImport_EnergyTransactions
	 * @model opposite="Import_EnergyTransactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy is transferred between interchange areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy is transferred between interchange areas'"
	 * @generated
	 */
	SubControlArea getImport_SubControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getImport_SubControlArea <em>Import Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Sub Control Area</em>' reference.
	 * @see #getImport_SubControlArea()
	 * @generated
	 */
	void setImport_SubControlArea(SubControlArea value);

	/**
	 * Returns the value of the '<em><b>Receipt Point P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Point P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Point P</em>' attribute.
	 * @see #setReceiptPointP(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_ReceiptPointP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Receipt point active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Receipt point active power'"
	 * @generated
	 */
	float getReceiptPointP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReceiptPointP <em>Receipt Point P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Point P</em>' attribute.
	 * @see #getReceiptPointP()
	 * @generated
	 */
	void setReceiptPointP(float value);

	/**
	 * Returns the value of the '<em><b>Congest Charge Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Congest Charge Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Congest Charge Max</em>' attribute.
	 * @see #setCongestChargeMax(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_CongestChargeMax()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum congestion charges in monetary units'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum congestion charges in monetary units'"
	 * @generated
	 */
	float getCongestChargeMax();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getCongestChargeMax <em>Congest Charge Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Congest Charge Max</em>' attribute.
	 * @see #getCongestChargeMax()
	 * @generated
	 */
	void setCongestChargeMax(float value);

	/**
	 * Returns the value of the '<em><b>Energy Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getEnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Profiles</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_EnergyProfiles()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile#getEnergyTransaction
	 * @model opposite="EnergyTransaction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyTransaction must have at least one EnergyProfile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyTransaction must have at least one EnergyProfile.'"
	 * @generated
	 */
	EList<EnergyProfile> getEnergyProfiles();

	/**
	 * Returns the value of the '<em><b>Curtailment Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile#getEnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtailment Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtailment Profiles</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_CurtailmentProfiles()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile#getEnergyTransaction
	 * @model opposite="EnergyTransaction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyTransaction may be curtailed by any of the participating entities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyTransaction may be curtailed by any of the participating entities.'"
	 * @generated
	 */
	EList<CurtailmentProfile> getCurtailmentProfiles();

	/**
	 * Returns the value of the '<em><b>Loss Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getEnergyTransaction <em>Energy Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Profiles</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_LossProfiles()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.LossProfile#getEnergyTransaction
	 * @model opposite="EnergyTransaction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An EnergyTransaction may have a LossProfile.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An EnergyTransaction may have a LossProfile.'"
	 * @generated
	 */
	EList<LossProfile> getLossProfiles();

	/**
	 * Returns the value of the '<em><b>Energy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Min</em>' attribute.
	 * @see #setEnergyMin(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_EnergyMin()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction minimum active power if dispatchable'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction minimum active power if dispatchable'"
	 * @generated
	 */
	float getEnergyMin();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyMin <em>Energy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Min</em>' attribute.
	 * @see #getEnergyMin()
	 * @generated
	 */
	void setEnergyMin(float value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getEnergyTransaction_Reason()
	 * @model required="true"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

} // EnergyTransaction
