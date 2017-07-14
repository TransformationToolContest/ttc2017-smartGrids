/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Bid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxWeek <em>Start Ups Max Week</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getCommodityType <em>Commodity Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMaxDay <em>Energy Max Day</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMinDay <em>Energy Min Day</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxWeek <em>Shut Downs Max Week</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxDay <em>Shut Downs Max Day</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxDay <em>Start Ups Max Day</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy bid for generation, load, or virtual type for the whole of the market-trading period (i.e., one day in day ahead market or one hour in the real time market)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Energy bid for generation, load, or virtual type for the whole of the market-trading period (i.e., one day in day ahead market or one hour in the real time market)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy bid for generation, load, or virtual type for the whole of the market-trading period (i.e., one day in day ahead market or one hour in the real time market)' Profile\040documentation='Energy bid for generation, load, or virtual type for the whole of the market-trading period (i.e., one day in day ahead market or one hour in the real time market)'"
 * @generated
 */
public interface ResourceBid extends Bid {
	/**
	 * Returns the value of the '<em><b>Start Ups Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ups Max Week</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ups Max Week</em>' attribute.
	 * @see #setStartUpsMaxWeek(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_StartUpsMaxWeek()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum number of startups per week.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum number of startups per week.'"
	 * @generated
	 */
	int getStartUpsMaxWeek();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxWeek <em>Start Ups Max Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ups Max Week</em>' attribute.
	 * @see #getStartUpsMaxWeek()
	 * @generated
	 */
	void setStartUpsMaxWeek(int value);

	/**
	 * Returns the value of the '<em><b>Commodity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commodity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commodity Type</em>' attribute.
	 * @see #setCommodityType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_CommodityType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy product (commodity) type:\n \'En\' - Energy\n \'Ru\' - Regulation Up\n \'Rd\' - Regulation Dn\n \'Sr\' - Spinning Reserve\n \'Nr\' - Non-Spinning Reserve\n \'Or\' - Operating Reserve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy product (commodity) type:\n \'En\' - Energy\n \'Ru\' - Regulation Up\n \'Rd\' - Regulation Dn\n \'Sr\' - Spinning Reserve\n \'Nr\' - Non-Spinning Reserve\n \'Or\' - Operating Reserve'"
	 * @generated
	 */
	String getCommodityType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getCommodityType <em>Commodity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Type</em>' attribute.
	 * @see #getCommodityType()
	 * @generated
	 */
	void setCommodityType(String value);

	/**
	 * Returns the value of the '<em><b>Energy Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Max Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Max Day</em>' attribute.
	 * @see #setEnergyMaxDay(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_EnergyMaxDay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum amount of energy per day which can be produced during the trading period in MWh'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum amount of energy per day which can be produced during the trading period in MWh'"
	 * @generated
	 */
	float getEnergyMaxDay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMaxDay <em>Energy Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Max Day</em>' attribute.
	 * @see #getEnergyMaxDay()
	 * @generated
	 */
	void setEnergyMaxDay(float value);

	/**
	 * Returns the value of the '<em><b>Energy Min Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Min Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Min Day</em>' attribute.
	 * @see #setEnergyMinDay(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_EnergyMinDay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum amount of energy per day which has to be produced during the trading period in MWh'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum amount of energy per day which has to be produced during the trading period in MWh'"
	 * @generated
	 */
	float getEnergyMinDay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getEnergyMinDay <em>Energy Min Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Min Day</em>' attribute.
	 * @see #getEnergyMinDay()
	 * @generated
	 */
	void setEnergyMinDay(float value);

	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see #setVirtual(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_Virtual()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if bid is virtual.  Bid is assumed to be non-virtual if attribute is absent'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if bid is virtual.  Bid is assumed to be non-virtual if attribute is absent'"
	 * @generated
	 */
	boolean isVirtual();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see #isVirtual()
	 * @generated
	 */
	void setVirtual(boolean value);

	/**
	 * Returns the value of the '<em><b>Shut Downs Max Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shut Downs Max Week</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shut Downs Max Week</em>' attribute.
	 * @see #setShutDownsMaxWeek(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_ShutDownsMaxWeek()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum number of shutdowns per week.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum number of shutdowns per week.'"
	 * @generated
	 */
	int getShutDownsMaxWeek();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxWeek <em>Shut Downs Max Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shut Downs Max Week</em>' attribute.
	 * @see #getShutDownsMaxWeek()
	 * @generated
	 */
	void setShutDownsMaxWeek(int value);

	/**
	 * Returns the value of the '<em><b>Shut Downs Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shut Downs Max Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shut Downs Max Day</em>' attribute.
	 * @see #setShutDownsMaxDay(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_ShutDownsMaxDay()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum number of shutdowns per day.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum number of shutdowns per day.'"
	 * @generated
	 */
	int getShutDownsMaxDay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getShutDownsMaxDay <em>Shut Downs Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shut Downs Max Day</em>' attribute.
	 * @see #getShutDownsMaxDay()
	 * @generated
	 */
	void setShutDownsMaxDay(int value);

	/**
	 * Returns the value of the '<em><b>Start Ups Max Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ups Max Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ups Max Day</em>' attribute.
	 * @see #setStartUpsMaxDay(int)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getResourceBid_StartUpsMaxDay()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum number of startups per day.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum number of startups per day.'"
	 * @generated
	 */
	int getStartUpsMaxDay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ResourceBid#getStartUpsMaxDay <em>Start Ups Max Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ups Max Day</em>' attribute.
	 * @see #getStartUpsMaxDay()
	 * @generated
	 */
	void setStartUpsMaxDay(int value);

} // ResourceBid
