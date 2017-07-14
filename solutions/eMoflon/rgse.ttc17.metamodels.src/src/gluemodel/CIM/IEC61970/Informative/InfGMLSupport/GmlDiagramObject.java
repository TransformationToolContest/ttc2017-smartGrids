/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61968.Common.CoordinateSystem;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols <em>Gml Raster Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols <em>Gml Point Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols <em>Gml Line Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems <em>Coordinate Systems</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins <em>Gml Observatins</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors <em>Gml Selectors</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Any of the magnitudes that serve to define the position of a point by reference to a fixed figure, system of lines, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Any of the magnitudes that serve to define the position of a point by reference to a fixed figure, system of lines, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Any of the magnitudes that serve to define the position of a point by reference to a fixed figure, system of lines, etc.' Profile\040documentation='Any of the magnitudes that serve to define the position of a point by reference to a fixed figure, system of lines, etc.'"
 * @generated
 */
public interface GmlDiagramObject extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Raster Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Raster Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlRasterSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject
	 * @model opposite="GmlDiagramObject"
	 * @generated
	 */
	EList<GmlRasterSymbol> getGmlRasterSymbols();

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_Diagrams()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects
	 * @model opposite="GmlDiagramObjects"
	 * @generated
	 */
	EList<Diagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Point Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Point Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlPointSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject
	 * @model opposite="GmlDiagramObject"
	 * @generated
	 */
	EList<GmlPointSymbol> getGmlPointSymbols();

	/**
	 * Returns the value of the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Polygon Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Polygon Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlPolygonSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject
	 * @model opposite="GmlDiagramObject"
	 * @generated
	 */
	EList<GmlPolygonSymbol> getGmlPolygonSymbols();

	/**
	 * Returns the value of the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Line Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Line Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlLineSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject
	 * @model opposite="GmlDiagramObject"
	 * @generated
	 */
	EList<GmlLineSymbol> getGmlLineSymbols();

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlTextSymbols()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject
	 * @model opposite="GmlDiagramObject"
	 * @generated
	 */
	EList<GmlTextSymbol> getGmlTextSymbols();

	/**
	 * Returns the value of the '<em><b>Coordinate Systems</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.CoordinateSystem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Systems</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_CoordinateSystems()
	 * @see gluemodel.CIM.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects
	 * @model opposite="GmlDiagramObjects"
	 * @generated
	 */
	EList<CoordinateSystem> getCoordinateSystems();

	/**
	 * Returns the value of the '<em><b>Gml Observatins</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlObservation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Observatins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Observatins</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlObservatins()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects
	 * @model opposite="GmlDiagramObjects"
	 * @generated
	 */
	EList<GmlObservation> getGmlObservatins();

	/**
	 * Returns the value of the '<em><b>Gml Selectors</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSelector}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Selectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Selectors</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject_GmlSelectors()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects
	 * @model opposite="GmlDiagramObjects"
	 * @generated
	 */
	EList<GmlSelector> getGmlSelectors();

} // GmlDiagramObject
