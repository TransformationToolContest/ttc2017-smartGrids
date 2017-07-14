/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getMap()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of diagram that is usually printed on paper. It normally depicts part of the earth\'s surface, showing utility assets, right of ways, topological data, coordinates, grids, etc. Maps vary depending on whether they are used for dispatch, design, schematic, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of diagram that is usually printed on paper. It normally depicts part of the earth\'s surface, showing utility assets, right of ways, topological data, coordinates, grids, etc. Maps vary depending on whether they are used for dispatch, design, schematic, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of diagram that is usually printed on paper. It normally depicts part of the earth\'s surface, showing utility assets, right of ways, topological data, coordinates, grids, etc. Maps vary depending on whether they are used for dispatch, design, schematic, etc.' Profile\040documentation='A type of diagram that is usually printed on paper. It normally depicts part of the earth\'s surface, showing utility assets, right of ways, topological data, coordinates, grids, etc. Maps vary depending on whether they are used for dispatch, design, schematic, etc.'"
 * @generated
 */
public interface Map extends Diagram {
	/**
	 * Returns the value of the '<em><b>Map Loc Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Loc Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Loc Grid</em>' attribute.
	 * @see #setMapLocGrid(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getMap_MapLocGrid()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Map grid number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Map grid number.'"
	 * @generated
	 */
	String getMapLocGrid();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Loc Grid</em>' attribute.
	 * @see #getMapLocGrid()
	 * @generated
	 */
	void setMapLocGrid(String value);

	/**
	 * Returns the value of the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Number</em>' attribute.
	 * @see #setPageNumber(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getMap_PageNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Page number for particular set of maps specified by \'category\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Page number for particular set of maps specified by \'category\'.'"
	 * @generated
	 */
	int getPageNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Number</em>' attribute.
	 * @see #getPageNumber()
	 * @generated
	 */
	void setPageNumber(int value);

} // Map
