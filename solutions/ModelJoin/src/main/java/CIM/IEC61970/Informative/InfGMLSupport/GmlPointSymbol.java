/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Point Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointSymbol()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to draw a \"graphic\" at a point.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used to draw a \"graphic\" at a point.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to draw a \"graphic\" at a point.' Profile\040documentation='Used to draw a \"graphic\" at a point.'"
 * @generated
 */
public interface GmlPointSymbol extends GmlSymbol {
	/**
	 * Returns the value of the '<em><b>Gml Graphic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Graphic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Graphic</em>' reference.
	 * @see #setGmlGraphic(GmlGraphic)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointSymbol_GmlGraphic()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols
	 * @model opposite="GmlPointSymbols"
	 * @generated
	 */
	GmlGraphic getGmlGraphic();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Graphic</em>' reference.
	 * @see #getGmlGraphic()
	 * @generated
	 */
	void setGmlGraphic(GmlGraphic value);

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointSymbol_GmlDiagramObject()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols
	 * @model opposite="GmlPointSymbols"
	 * @generated
	 */
	GmlDiagramObject getGmlDiagramObject();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	void setGmlDiagramObject(GmlDiagramObject value);

} // GmlPointSymbol
