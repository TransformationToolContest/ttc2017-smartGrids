/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLoadControl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Limit Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A kind of LoadMgmtFunction that limits the customer load to a given value.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A kind of LoadMgmtFunction that limits the customer load to a given value.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A kind of LoadMgmtFunction that limits the customer load to a given value.' Profile\040documentation='A kind of LoadMgmtFunction that limits the customer load to a given value.'"
 * @generated
 */
public interface LoadLimitFunction extends LoadMgmtFunction {
	/**
	 * Returns the value of the '<em><b>Is Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto Recon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Recon Op</em>' attribute.
	 * @see #setIsAutoReconOp(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction_IsAutoReconOp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the switch will reconnect automatically, otherwise it will reconnect under manual control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the switch will reconnect automatically, otherwise it will reconnect under manual control.'"
	 * @generated
	 */
	boolean isIsAutoReconOp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Recon Op</em>' attribute.
	 * @see #isIsAutoReconOp()
	 * @generated
	 */
	void setIsAutoReconOp(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Load</em>' attribute.
	 * @see #setMaximumLoad(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction_MaximumLoad()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The power level, to which the customer load is being limited when this function activates. When the maximum load is exceeded the switch will typically open to shed the complete customer load.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The power level, to which the customer load is being limited when this function activates. When the maximum load is exceeded the switch will typically open to shed the complete customer load.'"
	 * @generated
	 */
	float getMaximumLoad();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Load</em>' attribute.
	 * @see #getMaximumLoad()
	 * @generated
	 */
	void setMaximumLoad(float value);

	/**
	 * Returns the value of the '<em><b>Reconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconnect Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconnect Time Delay</em>' attribute.
	 * @see #setReconnectTimeDelay(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction_ReconnectTimeDelay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='From the point when the load recovers from an overload condition and crosses the maximumLoad threshold going down, there may be a finite time delay before the switch actually reconnects the load. Typically this is to give overload conditions sufficient time to clear, thus preventing unnecessary load switching activity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='From the point when the load recovers from an overload condition and crosses the maximumLoad threshold going down, there may be a finite time delay before the switch actually reconnects the load. Typically this is to give overload conditions sufficient time to clear, thus preventing unnecessary load switching activity.'"
	 * @generated
	 */
	float getReconnectTimeDelay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnect Time Delay</em>' attribute.
	 * @see #getReconnectTimeDelay()
	 * @generated
	 */
	void setReconnectTimeDelay(float value);

	/**
	 * Returns the value of the '<em><b>Disconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disconnect Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect Time Delay</em>' attribute.
	 * @see #setDisconnectTimeDelay(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction_DisconnectTimeDelay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='From the point when the maximumLoad threshold is crossed there may be a finite delay before the switch actually disconnects the load. Typically this is to buffer against transient load fluctuations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='From the point when the maximumLoad threshold is crossed there may be a finite delay before the switch actually disconnects the load. Typically this is to buffer against transient load fluctuations.'"
	 * @generated
	 */
	float getDisconnectTimeDelay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect Time Delay</em>' attribute.
	 * @see #getDisconnectTimeDelay()
	 * @generated
	 */
	void setDisconnectTimeDelay(float value);

} // LoadLimitFunction
