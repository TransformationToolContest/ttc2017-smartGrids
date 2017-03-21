/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61970.Core.IdentifiedObject;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Statement Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentAmount <em>Current Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOAmount <em>Previous ISO Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getQuantityUOM <em>Quantity UOM</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOAmount <em>Net ISO Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOAmount <em>Current ISO Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousQuantity <em>Previous Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getComponentMarketStatementLineItem <em>Component Market Statement Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousAmount <em>Previous Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOQuantity <em>Net ISO Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetPrice <em>Net Price</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOQuantity <em>Current ISO Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentPrice <em>Current Price</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPassThroughBill <em>Pass Through Bill</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPrevisouPrice <em>Previsou Price</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getMarketStatement <em>Market Statement</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOQuantity <em>Previous ISO Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalDate <em>Interval Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetQuantity <em>Net Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetAmount <em>Net Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentQuantity <em>Current Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalNumber <em>Interval Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getContainerMarketStatementLineItem <em>Container Market Statement Line Item</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An individual line item on a statement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An individual line item on a statement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An individual line item on a statement.' Profile\040documentation='An individual line item on a statement.'"
 * @generated
 */
public interface MarketStatementLineItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Current Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Amount</em>' attribute.
	 * @see #setCurrentAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_CurrentAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current settlement amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current settlement amount.'"
	 * @generated
	 */
	float getCurrentAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentAmount <em>Current Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Amount</em>' attribute.
	 * @see #getCurrentAmount()
	 * @generated
	 */
	void setCurrentAmount(float value);

	/**
	 * Returns the value of the '<em><b>Previous ISO Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous ISO Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous ISO Amount</em>' attribute.
	 * @see #setPreviousISOAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_PreviousISOAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Previous ISO settlement amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Previous ISO settlement amount.'"
	 * @generated
	 */
	float getPreviousISOAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOAmount <em>Previous ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous ISO Amount</em>' attribute.
	 * @see #getPreviousISOAmount()
	 * @generated
	 */
	void setPreviousISOAmount(float value);

	/**
	 * Returns the value of the '<em><b>Quantity UOM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity UOM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity UOM</em>' attribute.
	 * @see #setQuantityUOM(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_QuantityUOM()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit of measure for the quantity element of the line item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit of measure for the quantity element of the line item.'"
	 * @generated
	 */
	String getQuantityUOM();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getQuantityUOM <em>Quantity UOM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity UOM</em>' attribute.
	 * @see #getQuantityUOM()
	 * @generated
	 */
	void setQuantityUOM(String value);

	/**
	 * Returns the value of the '<em><b>Net ISO Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net ISO Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net ISO Amount</em>' attribute.
	 * @see #setNetISOAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_NetISOAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Net ISO settlement amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Net ISO settlement amount.'"
	 * @generated
	 */
	float getNetISOAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOAmount <em>Net ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net ISO Amount</em>' attribute.
	 * @see #getNetISOAmount()
	 * @generated
	 */
	void setNetISOAmount(float value);

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.UserAttribute#getErpStatementLineItems <em>Erp Statement Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_UserAttributes()
	 * @see CIM.IEC61968.Common.UserAttribute#getErpStatementLineItems
	 * @model opposite="ErpStatementLineItems"
	 * @generated
	 */
	EList<UserAttribute> getUserAttributes();

	/**
	 * Returns the value of the '<em><b>Current ISO Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current ISO Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current ISO Amount</em>' attribute.
	 * @see #setCurrentISOAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_CurrentISOAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current ISO settlement amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current ISO settlement amount.'"
	 * @generated
	 */
	float getCurrentISOAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOAmount <em>Current ISO Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current ISO Amount</em>' attribute.
	 * @see #getCurrentISOAmount()
	 * @generated
	 */
	void setCurrentISOAmount(float value);

	/**
	 * Returns the value of the '<em><b>Previous Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Quantity</em>' attribute.
	 * @see #setPreviousQuantity(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_PreviousQuantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Previous settlement quantity, subject to the UOM.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Previous settlement quantity, subject to the UOM.'"
	 * @generated
	 */
	float getPreviousQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousQuantity <em>Previous Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Quantity</em>' attribute.
	 * @see #getPreviousQuantity()
	 * @generated
	 */
	void setPreviousQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Component Market Statement Line Item</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getContainerMarketStatementLineItem <em>Container Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Market Statement Line Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Market Statement Line Item</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_ComponentMarketStatementLineItem()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getContainerMarketStatementLineItem
	 * @model opposite="ContainerMarketStatementLineItem"
	 * @generated
	 */
	EList<MarketStatementLineItem> getComponentMarketStatementLineItem();

	/**
	 * Returns the value of the '<em><b>Previous Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Amount</em>' attribute.
	 * @see #setPreviousAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_PreviousAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Previous settlement amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Previous settlement amount.'"
	 * @generated
	 */
	float getPreviousAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousAmount <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Amount</em>' attribute.
	 * @see #getPreviousAmount()
	 * @generated
	 */
	void setPreviousAmount(float value);

	/**
	 * Returns the value of the '<em><b>Net ISO Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net ISO Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net ISO Quantity</em>' attribute.
	 * @see #setNetISOQuantity(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_NetISOQuantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Net ISO settlement quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Net ISO settlement quantity.'"
	 * @generated
	 */
	float getNetISOQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetISOQuantity <em>Net ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net ISO Quantity</em>' attribute.
	 * @see #getNetISOQuantity()
	 * @generated
	 */
	void setNetISOQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Net Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Price</em>' attribute.
	 * @see #setNetPrice(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_NetPrice()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Net settlement price.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Net settlement price.'"
	 * @generated
	 */
	float getNetPrice();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetPrice <em>Net Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Price</em>' attribute.
	 * @see #getNetPrice()
	 * @generated
	 */
	void setNetPrice(float value);

	/**
	 * Returns the value of the '<em><b>Current ISO Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current ISO Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current ISO Quantity</em>' attribute.
	 * @see #setCurrentISOQuantity(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_CurrentISOQuantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current ISO settlement quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current ISO settlement quantity.'"
	 * @generated
	 */
	float getCurrentISOQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentISOQuantity <em>Current ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current ISO Quantity</em>' attribute.
	 * @see #getCurrentISOQuantity()
	 * @generated
	 */
	void setCurrentISOQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Current Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Price</em>' attribute.
	 * @see #setCurrentPrice(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_CurrentPrice()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current settlement price.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current settlement price.'"
	 * @generated
	 */
	float getCurrentPrice();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentPrice <em>Current Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Price</em>' attribute.
	 * @see #getCurrentPrice()
	 * @generated
	 */
	void setCurrentPrice(float value);

	/**
	 * Returns the value of the '<em><b>Pass Through Bill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getMarketStatementLineItem <em>Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Through Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Through Bill</em>' reference.
	 * @see #setPassThroughBill(PassThroughBill)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_PassThroughBill()
	 * @see CIM.IEC61970.Informative.MarketOperations.PassThroughBill#getMarketStatementLineItem
	 * @model opposite="MarketStatementLineItem"
	 * @generated
	 */
	PassThroughBill getPassThroughBill();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPassThroughBill <em>Pass Through Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through Bill</em>' reference.
	 * @see #getPassThroughBill()
	 * @generated
	 */
	void setPassThroughBill(PassThroughBill value);

	/**
	 * Returns the value of the '<em><b>Previsou Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previsou Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previsou Price</em>' attribute.
	 * @see #setPrevisouPrice(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_PrevisouPrice()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Previous settlement price.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Previous settlement price.'"
	 * @generated
	 */
	float getPrevisouPrice();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPrevisouPrice <em>Previsou Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previsou Price</em>' attribute.
	 * @see #getPrevisouPrice()
	 * @generated
	 */
	void setPrevisouPrice(float value);

	/**
	 * Returns the value of the '<em><b>Market Statement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatement#getMarketStatementLineItem <em>Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Statement</em>' reference.
	 * @see #setMarketStatement(MarketStatement)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_MarketStatement()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatement#getMarketStatementLineItem
	 * @model opposite="MarketStatementLineItem"
	 * @generated
	 */
	MarketStatement getMarketStatement();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getMarketStatement <em>Market Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Statement</em>' reference.
	 * @see #getMarketStatement()
	 * @generated
	 */
	void setMarketStatement(MarketStatement value);

	/**
	 * Returns the value of the '<em><b>Previous ISO Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous ISO Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous ISO Quantity</em>' attribute.
	 * @see #setPreviousISOQuantity(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_PreviousISOQuantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Previous ISO settlement quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Previous ISO settlement quantity.'"
	 * @generated
	 */
	float getPreviousISOQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getPreviousISOQuantity <em>Previous ISO Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous ISO Quantity</em>' attribute.
	 * @see #getPreviousISOQuantity()
	 * @generated
	 */
	void setPreviousISOQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Interval Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Date</em>' attribute.
	 * @see #setIntervalDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_IntervalDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date of which the settlement is run.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date of which the settlement is run.'"
	 * @generated
	 */
	Date getIntervalDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalDate <em>Interval Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Date</em>' attribute.
	 * @see #getIntervalDate()
	 * @generated
	 */
	void setIntervalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Net Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Quantity</em>' attribute.
	 * @see #setNetQuantity(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_NetQuantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Net settlement quantity, subject to the UOM.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Net settlement quantity, subject to the UOM.'"
	 * @generated
	 */
	float getNetQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetQuantity <em>Net Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Quantity</em>' attribute.
	 * @see #getNetQuantity()
	 * @generated
	 */
	void setNetQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Net Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Amount</em>' attribute.
	 * @see #setNetAmount(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_NetAmount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Net settlement amount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Net settlement amount.'"
	 * @generated
	 */
	float getNetAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getNetAmount <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Amount</em>' attribute.
	 * @see #getNetAmount()
	 * @generated
	 */
	void setNetAmount(float value);

	/**
	 * Returns the value of the '<em><b>Current Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Quantity</em>' attribute.
	 * @see #setCurrentQuantity(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_CurrentQuantity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current settlement quantity, subject to the UOM.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current settlement quantity, subject to the UOM.'"
	 * @generated
	 */
	float getCurrentQuantity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getCurrentQuantity <em>Current Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Quantity</em>' attribute.
	 * @see #getCurrentQuantity()
	 * @generated
	 */
	void setCurrentQuantity(float value);

	/**
	 * Returns the value of the '<em><b>Interval Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Number</em>' attribute.
	 * @see #setIntervalNumber(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_IntervalNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The number of intervals.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The number of intervals.'"
	 * @generated
	 */
	String getIntervalNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getIntervalNumber <em>Interval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Number</em>' attribute.
	 * @see #getIntervalNumber()
	 * @generated
	 */
	void setIntervalNumber(String value);

	/**
	 * Returns the value of the '<em><b>Container Market Statement Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getComponentMarketStatementLineItem <em>Component Market Statement Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Market Statement Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Market Statement Line Item</em>' reference.
	 * @see #setContainerMarketStatementLineItem(MarketStatementLineItem)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketStatementLineItem_ContainerMarketStatementLineItem()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getComponentMarketStatementLineItem
	 * @model opposite="ComponentMarketStatementLineItem"
	 * @generated
	 */
	MarketStatementLineItem getContainerMarketStatementLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem#getContainerMarketStatementLineItem <em>Container Market Statement Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Market Statement Line Item</em>' reference.
	 * @see #getContainerMarketStatementLineItem()
	 * @generated
	 */
	void setContainerMarketStatementLineItem(MarketStatementLineItem value);

} // MarketStatementLineItem
