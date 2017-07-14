/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61968.Common.CoordinateSystem;
import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations <em>Design Locations</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='GML and/or other means are used for rendering objects on various types of displays(geographic, schematic, other) and maps associated with various coordinate systems.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='GML and/or other means are used for rendering objects on various types of displays(geographic, schematic, other) and maps associated with various coordinate systems.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='GML and/or other means are used for rendering objects on various types of displays(geographic, schematic, other) and maps associated with various coordinate systems.' Profile\040documentation='GML and/or other means are used for rendering objects on various types of displays(geographic, schematic, other) and maps associated with various coordinate systems.'"
 * @generated
 */
public interface Diagram extends Document {
	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.CoordinateSystem#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System</em>' reference.
	 * @see #setCoordinateSystem(CoordinateSystem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram_CoordinateSystem()
	 * @see gluemodel.CIM.IEC61968.Common.CoordinateSystem#getDiagrams
	 * @model opposite="Diagrams"
	 * @generated
	 */
	CoordinateSystem getCoordinateSystem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CoordinateSystem value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.DiagramKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @see #setKind(DiagramKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of this diagram.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of this diagram.'"
	 * @generated
	 */
	DiagramKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DiagramKind value);

	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram_GmlDiagramObjects()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams
	 * @model opposite="Diagrams"
	 * @generated
	 */
	EList<GmlDiagramObject> getGmlDiagramObjects();

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram_DesignLocations()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation#getDiagrams
	 * @model opposite="Diagrams"
	 * @generated
	 */
	EList<DesignLocation> getDesignLocations();

} // Diagram
