/**
 */
package gluemodel.CIM.IEC61968.Metering;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getComFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Communication function of communication equipment or a device such as a meter.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Communication function of communication equipment or a device such as a meter.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Communication function of communication equipment or a device such as a meter.' Profile\040documentation='Communication function of communication equipment or a device such as a meter.'"
 * @generated
 */
public interface ComFunction extends DeviceFunction {
	/**
	 * Returns the value of the '<em><b>Two Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Two Way</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Two Way</em>' attribute.
	 * @see #setTwoWay(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getComFunction_TwoWay()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True when the AMR module can both send and receive messages. Default is false (i.e., module can only send).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True when the AMR module can both send and receive messages. Default is false (i.e., module can only send).'"
	 * @generated
	 */
	boolean isTwoWay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Two Way</em>' attribute.
	 * @see #isTwoWay()
	 * @generated
	 */
	void setTwoWay(boolean value);

	/**
	 * Returns the value of the '<em><b>Amr Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amr Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amr Address</em>' attribute.
	 * @see #setAmrAddress(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getComFunction_AmrAddress()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Communication ID number (e.g. serial number, IP address, telephone number, etc.) of the AMR module which serves this meter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Communication ID number (e.g. serial number, IP address, telephone number, etc.) of the AMR module which serves this meter.'"
	 * @generated
	 */
	String getAmrAddress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amr Address</em>' attribute.
	 * @see #getAmrAddress()
	 * @generated
	 */
	void setAmrAddress(String value);

	/**
	 * Returns the value of the '<em><b>Amr Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amr Router</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amr Router</em>' attribute.
	 * @see #setAmrRouter(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getComFunction_AmrRouter()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Communication ID number (e.g. port number, serial number, data collector ID, etc.) of the parent device associated to this AMR module.\nNote: If someone swaps out a meter, they may inadvertently disrupt the AMR system. Some technologies route readings from nearby meters through a common collection point on an electricity meter. Removal of such a meter disrupts AMR for numerous nearby meters.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Communication ID number (e.g. port number, serial number, data collector ID, etc.) of the parent device associated to this AMR module.\nNote: If someone swaps out a meter, they may inadvertently disrupt the AMR system. Some technologies route readings from nearby meters through a common collection point on an electricity meter. Removal of such a meter disrupts AMR for numerous nearby meters.'"
	 * @generated
	 */
	String getAmrRouter();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amr Router</em>' attribute.
	 * @see #getAmrRouter()
	 * @generated
	 */
	void setAmrRouter(String value);

} // ComFunction
