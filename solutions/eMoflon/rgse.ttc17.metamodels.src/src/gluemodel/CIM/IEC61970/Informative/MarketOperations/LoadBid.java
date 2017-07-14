/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Bid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReduction <em>Min Load Reduction</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getDropRampRate <em>Drop Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionInterval <em>Min Load Reduction Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getLoadReductionPriceCurve <em>Load Reduction Price Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionCost <em>Min Load Reduction Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getPickUpRampRate <em>Pick Up Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getReqNoticeTime <em>Req Notice Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoad <em>Min Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getRegisteredLoad <em>Registered Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinTimeBetLoadRed <em>Min Time Bet Load Red</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getShutdownCost <em>Shutdown Cost</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid()
 * @model
 * @generated
 */
public interface LoadBid extends ResourceBid {
	/**
	 * Returns the value of the '<em><b>Min Load Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Load Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Load Reduction</em>' attribute.
	 * @see #setMinLoadReduction(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_MinLoadReduction()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum MW for a load reduction (e.g., MW rating of a discrete pump.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum MW for a load reduction (e.g., MW rating of a discrete pump.'"
	 * @generated
	 */
	float getMinLoadReduction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReduction <em>Min Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Load Reduction</em>' attribute.
	 * @see #getMinLoadReduction()
	 * @generated
	 */
	void setMinLoadReduction(float value);

	/**
	 * Returns the value of the '<em><b>Drop Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Ramp Rate</em>' attribute.
	 * @see #setDropRampRate(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_DropRampRate()
	 * @model dataType="gluemodel.CIM.RateOfChange" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum rate that load can be reduced (MW/minute)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum rate that load can be reduced (MW/minute)'"
	 * @generated
	 */
	Object getDropRampRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getDropRampRate <em>Drop Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Ramp Rate</em>' attribute.
	 * @see #getDropRampRate()
	 * @generated
	 */
	void setDropRampRate(Object value);

	/**
	 * Returns the value of the '<em><b>Min Load Reduction Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Load Reduction Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Load Reduction Interval</em>' attribute.
	 * @see #setMinLoadReductionInterval(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_MinLoadReductionInterval()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Shortest period load reduction must be maintained before load can be restored to normal levels.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Shortest period load reduction must be maintained before load can be restored to normal levels.'"
	 * @generated
	 */
	float getMinLoadReductionInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionInterval <em>Min Load Reduction Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Load Reduction Interval</em>' attribute.
	 * @see #getMinLoadReductionInterval()
	 * @generated
	 */
	void setMinLoadReductionInterval(float value);

	/**
	 * Returns the value of the '<em><b>Load Reduction Price Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve#getLoadBids <em>Load Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Reduction Price Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Reduction Price Curve</em>' reference.
	 * @see #setLoadReductionPriceCurve(LoadReductionPriceCurve)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_LoadReductionPriceCurve()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve#getLoadBids
	 * @model opposite="LoadBids"
	 * @generated
	 */
	LoadReductionPriceCurve getLoadReductionPriceCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getLoadReductionPriceCurve <em>Load Reduction Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Reduction Price Curve</em>' reference.
	 * @see #getLoadReductionPriceCurve()
	 * @generated
	 */
	void setLoadReductionPriceCurve(LoadReductionPriceCurve value);

	/**
	 * Returns the value of the '<em><b>Min Load Reduction Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Load Reduction Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Load Reduction Cost</em>' attribute.
	 * @see #setMinLoadReductionCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_MinLoadReductionCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cost in $ at the minimum reduced load'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cost in $ at the minimum reduced load'"
	 * @generated
	 */
	float getMinLoadReductionCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoadReductionCost <em>Min Load Reduction Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Load Reduction Cost</em>' attribute.
	 * @see #getMinLoadReductionCost()
	 * @generated
	 */
	void setMinLoadReductionCost(float value);

	/**
	 * Returns the value of the '<em><b>Pick Up Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Up Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Up Ramp Rate</em>' attribute.
	 * @see #setPickUpRampRate(Object)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_PickUpRampRate()
	 * @model dataType="gluemodel.CIM.RateOfChange" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum rate load may be restored (MW/minute)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum rate load may be restored (MW/minute)'"
	 * @generated
	 */
	Object getPickUpRampRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getPickUpRampRate <em>Pick Up Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Up Ramp Rate</em>' attribute.
	 * @see #getPickUpRampRate()
	 * @generated
	 */
	void setPickUpRampRate(Object value);

	/**
	 * Returns the value of the '<em><b>Req Notice Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Notice Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Notice Time</em>' attribute.
	 * @see #setReqNoticeTime(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_ReqNoticeTime()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time period that is required from an order to reduce a load to the time that it takes to get to the minimum load reduction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time period that is required from an order to reduce a load to the time that it takes to get to the minimum load reduction.'"
	 * @generated
	 */
	float getReqNoticeTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getReqNoticeTime <em>Req Notice Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Notice Time</em>' attribute.
	 * @see #getReqNoticeTime()
	 * @generated
	 */
	void setReqNoticeTime(float value);

	/**
	 * Returns the value of the '<em><b>Min Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Load</em>' attribute.
	 * @see #setMinLoad(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_MinLoad()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum MW load below which it may not be reduced.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum MW load below which it may not be reduced.'"
	 * @generated
	 */
	float getMinLoad();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinLoad <em>Min Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Load</em>' attribute.
	 * @see #getMinLoad()
	 * @generated
	 */
	void setMinLoad(float value);

	/**
	 * Returns the value of the '<em><b>Registered Load</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadBids <em>Load Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Load</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Load</em>' reference.
	 * @see #setRegisteredLoad(RegisteredLoad)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_RegisteredLoad()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadBids
	 * @model opposite="LoadBids"
	 * @generated
	 */
	RegisteredLoad getRegisteredLoad();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getRegisteredLoad <em>Registered Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Load</em>' reference.
	 * @see #getRegisteredLoad()
	 * @generated
	 */
	void setRegisteredLoad(RegisteredLoad value);

	/**
	 * Returns the value of the '<em><b>Min Time Bet Load Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time Bet Load Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time Bet Load Red</em>' attribute.
	 * @see #setMinTimeBetLoadRed(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_MinTimeBetLoadRed()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Shortest time that load must be left at normal levels before a new load reduction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Shortest time that load must be left at normal levels before a new load reduction.'"
	 * @generated
	 */
	float getMinTimeBetLoadRed();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getMinTimeBetLoadRed <em>Min Time Bet Load Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time Bet Load Red</em>' attribute.
	 * @see #getMinTimeBetLoadRed()
	 * @generated
	 */
	void setMinTimeBetLoadRed(float value);

	/**
	 * Returns the value of the '<em><b>Shutdown Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Cost</em>' attribute.
	 * @see #setShutdownCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadBid_ShutdownCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The fixed cost associated with committing a load reduction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The fixed cost associated with committing a load reduction.'"
	 * @generated
	 */
	float getShutdownCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.LoadBid#getShutdownCost <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Cost</em>' attribute.
	 * @see #getShutdownCost()
	 * @generated
	 */
	void setShutdownCost(float value);

} // LoadBid
