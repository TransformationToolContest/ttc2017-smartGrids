/**
 */
package gluemodel.CIM.IEC61968.Common;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of spatial coordinates that determine a point. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Set of spatial coordinates that determine a point. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of spatial coordinates that determine a point. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).' Profile\040documentation='Set of spatial coordinates that determine a point. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).'"
 * @generated
 */
public interface PositionPoint extends Element {
	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.CoordinateSystem#getPositionPoints <em>Position Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System</em>' reference.
	 * @see #setCoordinateSystem(CoordinateSystem)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint_CoordinateSystem()
	 * @see gluemodel.CIM.IEC61968.Common.CoordinateSystem#getPositionPoints
	 * @model opposite="PositionPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coordinate system in which the coordinates of this position point are expressed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coordinate system in which the coordinates of this position point are expressed.'"
	 * @generated
	 */
	CoordinateSystem getCoordinateSystem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getCoordinateSystem <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CoordinateSystem value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero-relative sequence number of this point within a series of points.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero-relative sequence number of this point within a series of points.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #setXPosition(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint_XPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='X axis position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='X axis position.'"
	 * @generated
	 */
	String getXPosition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #getXPosition()
	 * @generated
	 */
	void setXPosition(String value);

	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint_YPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Y axis position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Y axis position.'"
	 * @generated
	 */
	String getYPosition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(String value);

	/**
	 * Returns the value of the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZPosition</em>' attribute.
	 * @see #setZPosition(String)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint_ZPosition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Z axis position.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Z axis position.'"
	 * @generated
	 */
	String getZPosition();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZPosition</em>' attribute.
	 * @see #getZPosition()
	 * @generated
	 */
	void setZPosition(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see gluemodel.CIM.IEC61968.Common.CommonPackage#getPositionPoint_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // PositionPoint
