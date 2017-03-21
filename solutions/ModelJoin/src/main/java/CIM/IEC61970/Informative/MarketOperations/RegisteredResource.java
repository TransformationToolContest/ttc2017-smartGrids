/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarkets <em>Markets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarketProducts <em>Market Products</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getRtoID <em>Rto ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMeters <em>Meters</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getPnode <em>Pnode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getResourceGroups <em>Resource Groups</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A resource that is registered through the RTO participant registration system. Examples include generating unit, customer meter, and a non-physical generator or load.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A resource that is registered through the RTO participant registration system. Examples include generating unit, customer meter, and a non-physical generator or load.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A resource that is registered through the RTO participant registration system. Examples include generating unit, customer meter, and a non-physical generator or load.' Profile\040documentation='A resource that is registered through the RTO participant registration system. Examples include generating unit, customer meter, and a non-physical generator or load.'"
 * @generated
 */
public interface RegisteredResource extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Markets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Market}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Market#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markets</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_Markets()
	 * @see CIM.IEC61970.Informative.MarketOperations.Market#getRegisteredResources
	 * @model opposite="RegisteredResources"
	 * @generated
	 */
	EList<Market> getMarkets();

	/**
	 * Returns the value of the '<em><b>Market Products</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.MarketProduct}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketProduct#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Products</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_MarketProducts()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketProduct#getRegisteredResources
	 * @model opposite="RegisteredResources"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A registered resource is eligible to bid market products'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A registered resource is eligible to bid market products'"
	 * @generated
	 */
	EList<MarketProduct> getMarketProducts();

	/**
	 * Returns the value of the '<em><b>Rto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rto ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rto ID</em>' attribute.
	 * @see #setRtoID(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_RtoID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unique name obtained via RTO registration'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unique name obtained via RTO registration'"
	 * @generated
	 */
	String getRtoID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getRtoID <em>Rto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rto ID</em>' attribute.
	 * @see #getRtoID()
	 * @generated
	 */
	void setRtoID(String value);

	/**
	 * Returns the value of the '<em><b>Meters</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Meter}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Meter#getRegisteredResource <em>Registered Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meters</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_Meters()
	 * @see CIM.IEC61970.Informative.MarketOperations.Meter#getRegisteredResource
	 * @model opposite="RegisteredResource"
	 * @generated
	 */
	EList<Meter> getMeters();

	/**
	 * Returns the value of the '<em><b>Pnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnode</em>' reference.
	 * @see #setPnode(Pnode)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_Pnode()
	 * @see CIM.IEC61970.Informative.MarketOperations.Pnode#getRegisteredResources
	 * @model opposite="RegisteredResources"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A registered resource injects power at one or more connectivity nodes related to a pnode'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A registered resource injects power at one or more connectivity nodes related to a pnode'"
	 * @generated
	 */
	Pnode getPnode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getPnode <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnode</em>' reference.
	 * @see #getPnode()
	 * @generated
	 */
	void setPnode(Pnode value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(ErpOrganisation)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_Organisation()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRegisteredResources
	 * @model opposite="RegisteredResources"
	 * @generated
	 */
	ErpOrganisation getOrganisation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Resource Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ResourceGroup}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getRegisteredResources <em>Registered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Groups</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredResource_ResourceGroups()
	 * @see CIM.IEC61970.Informative.MarketOperations.ResourceGroup#getRegisteredResources
	 * @model opposite="RegisteredResources"
	 * @generated
	 */
	EList<ResourceGroup> getResourceGroups();

} // RegisteredResource
