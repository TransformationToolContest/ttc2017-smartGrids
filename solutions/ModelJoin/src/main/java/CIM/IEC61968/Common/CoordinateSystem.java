/**
 */
package CIM.IEC61968.Common;

import CIM.Element;

import CIM.IEC61970.Informative.InfGMLSupport.Diagram;
import CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.CoordinateSystem#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.CoordinateSystem#getPositionPoints <em>Position Points</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.CoordinateSystem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getCoordinateSystem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coordinate reference system.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Coordinate reference system.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coordinate reference system.' Profile\040documentation='Coordinate reference system.'"
 * @generated
 */
public interface CoordinateSystem extends Element {
	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems <em>Coordinate Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getCoordinateSystem_GmlDiagramObjects()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems
	 * @model opposite="CoordinateSystems"
	 * @generated
	 */
	EList<GmlDiagramObject> getGmlDiagramObjects();

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.Diagram}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getCoordinateSystem_Diagrams()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem
	 * @model opposite="CoordinateSystem"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Location#getCoordinateSystems <em>Coordinate Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM.IEC61968.Common.CommonPackage#getCoordinateSystem_Location()
	 * @see CIM.IEC61968.Common.Location#getCoordinateSystems
	 * @model opposite="CoordinateSystems"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Location described by using position points in this coordinate system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Location described by using position points in this coordinate system.'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Position Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.PositionPoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.PositionPoint#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Points</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getCoordinateSystem_PositionPoints()
	 * @see CIM.IEC61968.Common.PositionPoint#getCoordinateSystem
	 * @model opposite="CoordinateSystem"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence of position points expressed in this coordinate system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence of position points expressed in this coordinate system.'"
	 * @generated
	 */
	EList<PositionPoint> getPositionPoints();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getCoordinateSystem_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of this coordinate system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of this coordinate system.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.CoordinateSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CoordinateSystem
