/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.Agreement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getBaseEnergy <em>Base Energy</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getAction <em>Action</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getEnergyPriceCurve <em>Energy Price Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getOptimized <em>Optimized</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getClass_ <em>Class</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getPnodes <em>Pnodes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getFtrType <em>Ftr Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.FTR#getFlowgate <em>Flowgate</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Financial Transmission Rights (FTR) regarding transmission capacity at a flowgate.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Financial Transmission Rights (FTR) regarding transmission capacity at a flowgate.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Financial Transmission Rights (FTR) regarding transmission capacity at a flowgate.' Profile\040documentation='Financial Transmission Rights (FTR) regarding transmission capacity at a flowgate.'"
 * @generated
 */
public interface FTR extends Agreement {
	/**
	 * Returns the value of the '<em><b>Base Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Energy</em>' attribute.
	 * @see #setBaseEnergy(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_BaseEnergy()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Quantity, typically MWs - Seller owns all rights being offered, MWs over time on same Point of Receipt, Point of Delivery, or Resource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Quantity, typically MWs - Seller owns all rights being offered, MWs over time on same Point of Receipt, Point of Delivery, or Resource.'"
	 * @generated
	 */
	float getBaseEnergy();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getBaseEnergy <em>Base Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Energy</em>' attribute.
	 * @see #getBaseEnergy()
	 * @generated
	 */
	void setBaseEnergy(float value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_Action()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Buy, Sell'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Buy, Sell'"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Energy Price Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getFTRs <em>FT Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Price Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Price Curve</em>' reference.
	 * @see #setEnergyPriceCurve(EnergyPriceCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_EnergyPriceCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getFTRs
	 * @model opposite="FTRs"
	 * @generated
	 */
	EnergyPriceCurve getEnergyPriceCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getEnergyPriceCurve <em>Energy Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Price Curve</em>' reference.
	 * @see #getEnergyPriceCurve()
	 * @generated
	 */
	void setEnergyPriceCurve(EnergyPriceCurve value);

	/**
	 * Returns the value of the '<em><b>Optimized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimized</em>' attribute.
	 * @see #setOptimized(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_Optimized()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fixed (covers re-configuration, grandfathering) or Optimized (up for sale/purchase'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed (covers re-configuration, grandfathering) or Optimized (up for sale/purchase'"
	 * @generated
	 */
	String getOptimized();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getOptimized <em>Optimized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimized</em>' attribute.
	 * @see #getOptimized()
	 * @generated
	 */
	void setOptimized(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_Class()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Peak, Off-peak, 24-hour'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Peak, Off-peak, 24-hour'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Pnodes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Pnode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Pnode#getFTRs <em>FT Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnodes</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_Pnodes()
	 * @see CIM.IEC61970.Informative.MarketOperations.Pnode#getFTRs
	 * @model opposite="FTRs"
	 * @generated
	 */
	EList<Pnode> getPnodes();

	/**
	 * Returns the value of the '<em><b>Ftr Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ftr Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftr Type</em>' attribute.
	 * @see #setFtrType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_FtrType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of rights being offered (product) allowed to be auctioned (option, obligation).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of rights being offered (product) allowed to be auctioned (option, obligation).'"
	 * @generated
	 */
	String getFtrType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getFtrType <em>Ftr Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ftr Type</em>' attribute.
	 * @see #getFtrType()
	 * @generated
	 */
	void setFtrType(String value);

	/**
	 * Returns the value of the '<em><b>Flowgate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Flowgate#getFTRs <em>FT Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgate</em>' reference.
	 * @see #setFlowgate(Flowgate)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getFTR_Flowgate()
	 * @see CIM.IEC61970.Informative.MarketOperations.Flowgate#getFTRs
	 * @model opposite="FTRs"
	 * @generated
	 */
	Flowgate getFlowgate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getFlowgate <em>Flowgate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowgate</em>' reference.
	 * @see #getFlowgate()
	 * @generated
	 */
	void setFlowgate(Flowgate value);

} // FTR
