/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketFactors <em>Market Factors</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getStart <em>Start</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getMarketProducts <em>Market Products</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRTO <em>RTO</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalNonSpinRes <em>Ramp Interval Non Spin Res</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getEnd <em>End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getTimeIntervalLength <em>Time Interval Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getSettlements <em>Settlements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getBids <em>Bids</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalReg <em>Ramp Interval Reg</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRegisteredResources <em>Registered Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalSpinRes <em>Ramp Interval Spin Res</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#isDst <em>Dst</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalEnergy <em>Ramp Interval Energy</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getLocalTimeZone <em>Local Time Zone</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market (e.g., DAM, HAM)\n\nzzMarket operation control parameters.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Market (e.g., DAM, HAM)\n\nzzMarket operation control parameters.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market (e.g., DAM, HAM)\n\nzzMarket operation control parameters.' Profile\040documentation='Market (e.g., DAM, HAM)\n\nzzMarket operation control parameters.'"
 * @generated
 */
public interface Market extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of a market.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of a market.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Market Factors</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Factors</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_MarketFactors()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketFactors#getMarket
	 * @model opposite="Market"
	 * @generated
	 */
	EList<MarketFactors> getMarketFactors();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_Start()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market start time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market start time.'"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>Market Products</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Products</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_MarketProducts()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketProduct#getMarket
	 * @model opposite="Market"
	 * @generated
	 */
	EList<MarketProduct> getMarketProducts();

	/**
	 * Returns the value of the '<em><b>RTO</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getMarkets <em>Markets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTO</em>' reference.
	 * @see #setRTO(RTO)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_RTO()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RTO#getMarkets
	 * @model opposite="Markets"
	 * @generated
	 */
	RTO getRTO();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRTO <em>RTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTO</em>' reference.
	 * @see #getRTO()
	 * @generated
	 */
	void setRTO(RTO value);

	/**
	 * Returns the value of the '<em><b>Ramp Interval Non Spin Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Interval Non Spin Res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Interval Non Spin Res</em>' attribute.
	 * @see #setRampIntervalNonSpinRes(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_RampIntervalNonSpinRes()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ramping time interval for non-spinning reserve.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ramping time interval for non-spinning reserve.'"
	 * @generated
	 */
	float getRampIntervalNonSpinRes();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalNonSpinRes <em>Ramp Interval Non Spin Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Interval Non Spin Res</em>' attribute.
	 * @see #getRampIntervalNonSpinRes()
	 * @generated
	 */
	void setRampIntervalNonSpinRes(float value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_End()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market end time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market end time.'"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Time Interval Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval Length</em>' attribute.
	 * @see #setTimeIntervalLength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_TimeIntervalLength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Trading time interval length.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Trading time interval length.'"
	 * @generated
	 */
	float getTimeIntervalLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getTimeIntervalLength <em>Time Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval Length</em>' attribute.
	 * @see #getTimeIntervalLength()
	 * @generated
	 */
	void setTimeIntervalLength(float value);

	/**
	 * Returns the value of the '<em><b>Settlements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_Settlements()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Settlement#getMarket
	 * @model opposite="Market"
	 * @generated
	 */
	EList<Settlement> getSettlements();

	/**
	 * Returns the value of the '<em><b>Bids</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bids</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_Bids()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Bid#getMarket
	 * @model opposite="Market"
	 * @generated
	 */
	EList<Bid> getBids();

	/**
	 * Returns the value of the '<em><b>Ramp Interval Reg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Interval Reg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Interval Reg</em>' attribute.
	 * @see #setRampIntervalReg(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_RampIntervalReg()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ramping time interval for regulation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ramping time interval for regulation.'"
	 * @generated
	 */
	float getRampIntervalReg();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalReg <em>Ramp Interval Reg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Interval Reg</em>' attribute.
	 * @see #getRampIntervalReg()
	 * @generated
	 */
	void setRampIntervalReg(float value);

	/**
	 * Returns the value of the '<em><b>Registered Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarkets <em>Markets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_RegisteredResources()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredResource#getMarkets
	 * @model opposite="Markets"
	 * @generated
	 */
	EList<RegisteredResource> getRegisteredResources();

	/**
	 * Returns the value of the '<em><b>Ramp Interval Spin Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Interval Spin Res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Interval Spin Res</em>' attribute.
	 * @see #setRampIntervalSpinRes(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_RampIntervalSpinRes()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ramping time interval for spinning reserve.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ramping time interval for spinning reserve.'"
	 * @generated
	 */
	float getRampIntervalSpinRes();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalSpinRes <em>Ramp Interval Spin Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Interval Spin Res</em>' attribute.
	 * @see #getRampIntervalSpinRes()
	 * @generated
	 */
	void setRampIntervalSpinRes(float value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' attribute.
	 * @see #setDst(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_Dst()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if daylight savings time (DST) is in effect.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if daylight savings time (DST) is in effect.'"
	 * @generated
	 */
	boolean isDst();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#isDst <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' attribute.
	 * @see #isDst()
	 * @generated
	 */
	void setDst(boolean value);

	/**
	 * Returns the value of the '<em><b>Ramp Interval Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Interval Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Interval Energy</em>' attribute.
	 * @see #setRampIntervalEnergy(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_RampIntervalEnergy()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ramping time interval for energy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ramping time interval for energy.'"
	 * @generated
	 */
	float getRampIntervalEnergy();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getRampIntervalEnergy <em>Ramp Interval Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Interval Energy</em>' attribute.
	 * @see #getRampIntervalEnergy()
	 * @generated
	 */
	void setRampIntervalEnergy(float value);

	/**
	 * Returns the value of the '<em><b>Local Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Time Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Time Zone</em>' attribute.
	 * @see #setLocalTimeZone(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getMarket_LocalTimeZone()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Local time zone.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Local time zone.'"
	 * @generated
	 */
	String getLocalTimeZone();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Market#getLocalTimeZone <em>Local Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Time Zone</em>' attribute.
	 * @see #getLocalTimeZone()
	 * @generated
	 */
	void setLocalTimeZone(String value);

} // Market
