/**
 */
package CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Bid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMin <em>Up Time Min</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getRegisteredGenerator <em>Registered Generator</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaximumEconomicMW <em>Maximum Economic MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getBidSet <em>Bid Set</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpTimeCurve <em>Start Up Time Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMax <em>Up Time Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpType <em>Start Up Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTime <em>Notification Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTimeCurve <em>Notification Time Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaxEmergencyMW <em>Max Emergency MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpCostCurve <em>Start Up Cost Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumEconomicMW <em>Minimum Economic MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinEmergencyMW <em>Min Emergency MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNoLoadCost <em>No Load Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getDownTimeMax <em>Down Time Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpRampRate <em>Start Up Ramp Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getOperatingMode <em>Operating Mode</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid()
 * @model
 * @generated
 */
public interface GeneratingBid extends ResourceBid {
	/**
	 * Returns the value of the '<em><b>Up Time Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up Time Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up Time Min</em>' attribute.
	 * @see #setUpTimeMin(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_UpTimeMin()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum up time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum up time.'"
	 * @generated
	 */
	float getUpTimeMin();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMin <em>Up Time Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up Time Min</em>' attribute.
	 * @see #getUpTimeMin()
	 * @generated
	 */
	void setUpTimeMin(float value);

	/**
	 * Returns the value of the '<em><b>Registered Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Generator</em>' reference.
	 * @see #setRegisteredGenerator(RegisteredGenerator)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_RegisteredGenerator()
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingBids
	 * @model opposite="GeneratingBids"
	 * @generated
	 */
	RegisteredGenerator getRegisteredGenerator();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getRegisteredGenerator <em>Registered Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Generator</em>' reference.
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	void setRegisteredGenerator(RegisteredGenerator value);

	/**
	 * Returns the value of the '<em><b>Maximum Economic MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Economic MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Economic MW</em>' attribute.
	 * @see #setMaximumEconomicMW(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_MaximumEconomicMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum high economic MW limit, that should not exceed the maximum operating MW limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum high economic MW limit, that should not exceed the maximum operating MW limit'"
	 * @generated
	 */
	float getMaximumEconomicMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaximumEconomicMW <em>Maximum Economic MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Economic MW</em>' attribute.
	 * @see #getMaximumEconomicMW()
	 * @generated
	 */
	void setMaximumEconomicMW(float value);

	/**
	 * Returns the value of the '<em><b>Bid Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.BidSet#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid Set</em>' reference.
	 * @see #setBidSet(BidSet)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_BidSet()
	 * @see CIM.IEC61970.Informative.MarketOperations.BidSet#getGeneratingBids
	 * @model opposite="GeneratingBids"
	 * @generated
	 */
	BidSet getBidSet();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getBidSet <em>Bid Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Set</em>' reference.
	 * @see #getBidSet()
	 * @generated
	 */
	void setBidSet(BidSet value);

	/**
	 * Returns the value of the '<em><b>Start Up Time Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Up Time Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Up Time Curve</em>' reference.
	 * @see #setStartUpTimeCurve(StartUpTimeCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_StartUpTimeCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve#getGeneratingBids
	 * @model opposite="GeneratingBids"
	 * @generated
	 */
	StartUpTimeCurve getStartUpTimeCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpTimeCurve <em>Start Up Time Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Up Time Curve</em>' reference.
	 * @see #getStartUpTimeCurve()
	 * @generated
	 */
	void setStartUpTimeCurve(StartUpTimeCurve value);

	/**
	 * Returns the value of the '<em><b>Up Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up Time Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up Time Max</em>' attribute.
	 * @see #setUpTimeMax(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_UpTimeMax()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum up time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum up time.'"
	 * @generated
	 */
	float getUpTimeMax();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getUpTimeMax <em>Up Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up Time Max</em>' attribute.
	 * @see #getUpTimeMax()
	 * @generated
	 */
	void setUpTimeMax(float value);

	/**
	 * Returns the value of the '<em><b>Start Up Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Up Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Up Type</em>' attribute.
	 * @see #setStartUpType(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_StartUpType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resource startup type:\n 1 - Fixed startup time and fixed startup cost\n 2 - Startup time as a function of down time and fixed startup cost\n 3 - Startup cost as a function of down time'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resource startup type:\n 1 - Fixed startup time and fixed startup cost\n 2 - Startup time as a function of down time and fixed startup cost\n 3 - Startup cost as a function of down time'"
	 * @generated
	 */
	int getStartUpType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpType <em>Start Up Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Up Type</em>' attribute.
	 * @see #getStartUpType()
	 * @generated
	 */
	void setStartUpType(int value);

	/**
	 * Returns the value of the '<em><b>Notification Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Time</em>' attribute.
	 * @see #setNotificationTime(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_NotificationTime()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time required for crew notification prior to start up of the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time required for crew notification prior to start up of the unit.'"
	 * @generated
	 */
	float getNotificationTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTime <em>Notification Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Time</em>' attribute.
	 * @see #getNotificationTime()
	 * @generated
	 */
	void setNotificationTime(float value);

	/**
	 * Returns the value of the '<em><b>Notification Time Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Time Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Time Curve</em>' reference.
	 * @see #setNotificationTimeCurve(NotificationTimeCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_NotificationTimeCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve#getGeneratingBids
	 * @model opposite="GeneratingBids"
	 * @generated
	 */
	NotificationTimeCurve getNotificationTimeCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTimeCurve <em>Notification Time Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Time Curve</em>' reference.
	 * @see #getNotificationTimeCurve()
	 * @generated
	 */
	void setNotificationTimeCurve(NotificationTimeCurve value);

	/**
	 * Returns the value of the '<em><b>Max Emergency MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Emergency MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Emergency MW</em>' attribute.
	 * @see #setMaxEmergencyMW(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_MaxEmergencyMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power rating available for unit under emergency conditions greater than or equal to maximum economic limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power rating available for unit under emergency conditions greater than or equal to maximum economic limit.'"
	 * @generated
	 */
	float getMaxEmergencyMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMaxEmergencyMW <em>Max Emergency MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Emergency MW</em>' attribute.
	 * @see #getMaxEmergencyMW()
	 * @generated
	 */
	void setMaxEmergencyMW(float value);

	/**
	 * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Time</em>' attribute.
	 * @see #setStartupTime(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_StartupTime()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time it takes to get the unit on-line, from the time that the prime mover mechanical power is applied'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time it takes to get the unit on-line, from the time that the prime mover mechanical power is applied'"
	 * @generated
	 */
	float getStartupTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartupTime <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Time</em>' attribute.
	 * @see #getStartupTime()
	 * @generated
	 */
	void setStartupTime(float value);

	/**
	 * Returns the value of the '<em><b>Start Up Cost Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getGeneratingBids <em>Generating Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Up Cost Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Up Cost Curve</em>' reference.
	 * @see #setStartUpCostCurve(StartUpCostCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_StartUpCostCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getGeneratingBids
	 * @model opposite="GeneratingBids"
	 * @generated
	 */
	StartUpCostCurve getStartUpCostCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpCostCurve <em>Start Up Cost Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Up Cost Curve</em>' reference.
	 * @see #getStartUpCostCurve()
	 * @generated
	 */
	void setStartUpCostCurve(StartUpCostCurve value);

	/**
	 * Returns the value of the '<em><b>Minimum Economic MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Economic MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Economic MW</em>' attribute.
	 * @see #setMinimumEconomicMW(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_MinimumEconomicMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Low economic MW limit that must be greater than or equal to the minimum operating MW limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Low economic MW limit that must be greater than or equal to the minimum operating MW limit'"
	 * @generated
	 */
	float getMinimumEconomicMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumEconomicMW <em>Minimum Economic MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Economic MW</em>' attribute.
	 * @see #getMinimumEconomicMW()
	 * @generated
	 */
	void setMinimumEconomicMW(float value);

	/**
	 * Returns the value of the '<em><b>Min Emergency MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Emergency MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Emergency MW</em>' attribute.
	 * @see #setMinEmergencyMW(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_MinEmergencyMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum power rating for unit under emergency conditions, which is less than or equal to the economic minimum.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum power rating for unit under emergency conditions, which is less than or equal to the economic minimum.'"
	 * @generated
	 */
	float getMinEmergencyMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinEmergencyMW <em>Min Emergency MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Emergency MW</em>' attribute.
	 * @see #getMinEmergencyMW()
	 * @generated
	 */
	void setMinEmergencyMW(float value);

	/**
	 * Returns the value of the '<em><b>No Load Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Load Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Load Cost</em>' attribute.
	 * @see #setNoLoadCost(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_NoLoadCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resource fixed no load cost.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resource fixed no load cost.'"
	 * @generated
	 */
	float getNoLoadCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNoLoadCost <em>No Load Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Load Cost</em>' attribute.
	 * @see #getNoLoadCost()
	 * @generated
	 */
	void setNoLoadCost(float value);

	/**
	 * Returns the value of the '<em><b>Minimum Down Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Down Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Down Time</em>' attribute.
	 * @see #setMinimumDownTime(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_MinimumDownTime()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum time interval between unit shutdown and startup'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum time interval between unit shutdown and startup'"
	 * @generated
	 */
	float getMinimumDownTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getMinimumDownTime <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Down Time</em>' attribute.
	 * @see #getMinimumDownTime()
	 * @generated
	 */
	void setMinimumDownTime(float value);

	/**
	 * Returns the value of the '<em><b>Down Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Down Time Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down Time Max</em>' attribute.
	 * @see #setDownTimeMax(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_DownTimeMax()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum down time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum down time.'"
	 * @generated
	 */
	float getDownTimeMax();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getDownTimeMax <em>Down Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down Time Max</em>' attribute.
	 * @see #getDownTimeMax()
	 * @generated
	 */
	void setDownTimeMax(float value);

	/**
	 * Returns the value of the '<em><b>Start Up Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Up Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Up Ramp Rate</em>' attribute.
	 * @see #setStartUpRampRate(Object)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_StartUpRampRate()
	 * @model dataType="CIM.RateOfChange" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resource startup ramp rate (MW/minute)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resource startup ramp rate (MW/minute)'"
	 * @generated
	 */
	Object getStartUpRampRate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpRampRate <em>Start Up Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Up Ramp Rate</em>' attribute.
	 * @see #getStartUpRampRate()
	 * @generated
	 */
	void setStartUpRampRate(Object value);

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see #setOperatingMode(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getGeneratingBid_OperatingMode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bid operating mode (\'C\' - cycling, \'F\' - fixed, \'M\' - must run, \'U\' - unavailable)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bid operating mode (\'C\' - cycling, \'F\' - fixed, \'M\' - must run, \'U\' - unavailable)'"
	 * @generated
	 */
	String getOperatingMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see #getOperatingMode()
	 * @generated
	 */
	void setOperatingMode(String value);

} // GeneratingBid
