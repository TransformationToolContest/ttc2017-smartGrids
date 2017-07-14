/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getProductBids <em>Product Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getMarket <em>Market</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getReserveReqs <em>Reserve Reqs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getRegisteredResources <em>Registered Resources</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketProduct()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A product traded by an RTO (e.g., energy, 10 minute spinning reserve).\n\nAncillary service product examples include:\nRegulation Up\nRegulation Dn\nSpinning Reserve\nNon-Spinning Reserve\nOperating Reserve'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A product traded by an RTO (e.g., energy, 10 minute spinning reserve).\n\nAncillary service product examples include:\nRegulation Up\nRegulation Dn\nSpinning Reserve\nNon-Spinning Reserve\nOperating Reserve'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A product traded by an RTO (e.g., energy, 10 minute spinning reserve).\n\nAncillary service product examples include:\nRegulation Up\nRegulation Dn\nSpinning Reserve\nNon-Spinning Reserve\nOperating Reserve' Profile\040documentation='A product traded by an RTO (e.g., energy, 10 minute spinning reserve).\n\nAncillary service product examples include:\nRegulation Up\nRegulation Dn\nSpinning Reserve\nNon-Spinning Reserve\nOperating Reserve'"
 * @generated
 */
public interface MarketProduct extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Product Bids</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getMarketProduct <em>Market Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bids</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketProduct_ProductBids()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getMarketProduct
	 * @model opposite="MarketProduct"
	 * @generated
	 */
	EList<ProductBid> getProductBids();

	/**
	 * Returns the value of the '<em><b>Market</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketProducts <em>Market Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market</em>' reference.
	 * @see #setMarket(Market)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketProduct_Market()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketProducts
	 * @model opposite="MarketProducts"
	 * @generated
	 */
	Market getMarket();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getMarket <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market</em>' reference.
	 * @see #getMarket()
	 * @generated
	 */
	void setMarket(Market value);

	/**
	 * Returns the value of the '<em><b>Reserve Reqs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getMarketProduct <em>Market Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Reqs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Reqs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketProduct_ReserveReqs()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getMarketProduct
	 * @model opposite="MarketProduct"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market product associated with reserve requirement must be a reserve or regulation product.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market product associated with reserve requirement must be a reserve or regulation product.'"
	 * @generated
	 */
	EList<ReserveReq> getReserveReqs();

	/**
	 * Returns the value of the '<em><b>Registered Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarketProducts <em>Market Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarketProduct_RegisteredResources()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarketProducts
	 * @model opposite="MarketProducts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A registered resource is eligible to bid market products'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A registered resource is eligible to bid market products'"
	 * @generated
	 */
	EList<RegisteredResource> getRegisteredResources();

} // MarketProduct
