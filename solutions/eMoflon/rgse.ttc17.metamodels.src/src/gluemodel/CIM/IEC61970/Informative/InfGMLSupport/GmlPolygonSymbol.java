/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Polygon Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonSymbol()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to draw a polygon (or other area-type geometries), including filling its interior and stroking its border (outline).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used to draw a polygon (or other area-type geometries), including filling its interior and stroking its border (outline).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to draw a polygon (or other area-type geometries), including filling its interior and stroking its border (outline).' Profile\040documentation='Used to draw a polygon (or other area-type geometries), including filling its interior and stroking its border (outline).'"
 * @generated
 */
public interface GmlPolygonSymbol extends GmlSymbol {
	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonSymbol_GmlDiagramObject()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols
	 * @model opposite="GmlPolygonSymbols"
	 * @generated
	 */
	GmlDiagramObject getGmlDiagramObject();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	void setGmlDiagramObject(GmlDiagramObject value);

	/**
	 * Returns the value of the '<em><b>Gml Stroke</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Stroke</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Stroke</em>' reference.
	 * @see #setGmlStroke(GmlStroke)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonSymbol_GmlStroke()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols
	 * @model opposite="GmlPolygonSymbols"
	 * @generated
	 */
	GmlStroke getGmlStroke();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Stroke</em>' reference.
	 * @see #getGmlStroke()
	 * @generated
	 */
	void setGmlStroke(GmlStroke value);

	/**
	 * Returns the value of the '<em><b>Gml Fill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fill</em>' reference.
	 * @see #setGmlFill(GmlFill)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonSymbol_GmlFill()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols
	 * @model opposite="GmlPolygonSymbols"
	 * @generated
	 */
	GmlFill getGmlFill();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Fill</em>' reference.
	 * @see #getGmlFill()
	 * @generated
	 */
	void setGmlFill(GmlFill value);

} // GmlPolygonSymbol
