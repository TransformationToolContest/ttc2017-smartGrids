/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLoadControl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Shed Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadShedFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A kind of LoadMgmtFunction that sheds a part of the customer load.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A kind of LoadMgmtFunction that sheds a part of the customer load.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A kind of LoadMgmtFunction that sheds a part of the customer load.' Profile\040documentation='A kind of LoadMgmtFunction that sheds a part of the customer load.'"
 * @generated
 */
public interface LoadShedFunction extends LoadMgmtFunction {
	/**
	 * Returns the value of the '<em><b>Switched Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switched Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switched Load</em>' attribute.
	 * @see #setSwitchedLoad(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadShedFunction_SwitchedLoad()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value of the load that is connected to the shedding switch. Typically this is a noted nominal value rather than a measured value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value of the load that is connected to the shedding switch. Typically this is a noted nominal value rather than a measured value.'"
	 * @generated
	 */
	float getSwitchedLoad();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switched Load</em>' attribute.
	 * @see #getSwitchedLoad()
	 * @generated
	 */
	void setSwitchedLoad(float value);

} // LoadShedFunction
