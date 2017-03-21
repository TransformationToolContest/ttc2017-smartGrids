/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.LoadModel.LoadGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadArea <em>Load Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadBids <em>Load Bids</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredLoad()
 * @model
 * @generated
 */
public interface RegisteredLoad extends RegisteredResource {
	/**
	 * Returns the value of the '<em><b>Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.LoadModel.LoadGroup#getRegisteredLoads <em>Registered Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Area</em>' reference.
	 * @see #setLoadArea(LoadGroup)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredLoad_LoadArea()
	 * @see CIM.IEC61970.LoadModel.LoadGroup#getRegisteredLoads
	 * @model opposite="RegisteredLoads"
	 * @generated
	 */
	LoadGroup getLoadArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadArea <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Area</em>' reference.
	 * @see #getLoadArea()
	 * @generated
	 */
	void setLoadArea(LoadGroup value);

	/**
	 * Returns the value of the '<em><b>Load Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.LoadBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.LoadBid#getRegisteredLoad <em>Registered Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRegisteredLoad_LoadBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.LoadBid#getRegisteredLoad
	 * @model opposite="RegisteredLoad"
	 * @generated
	 */
	EList<LoadBid> getLoadBids();

} // RegisteredLoad
