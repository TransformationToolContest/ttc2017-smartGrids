/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Line Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineSymbol()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to style a \"stroke\" along a linear geometry type, such as a string of line segments.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used to style a \"stroke\" along a linear geometry type, such as a string of line segments.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to style a \"stroke\" along a linear geometry type, such as a string of line segments.' Profile\040documentation='Used to style a \"stroke\" along a linear geometry type, such as a string of line segments.'"
 * @generated
 */
public interface GmlLineSymbol extends GmlSymbol {
	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineSymbol_GmlDiagramObject()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols
	 * @model opposite="GmlLineSymbols"
	 * @generated
	 */
	GmlDiagramObject getGmlDiagramObject();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	void setGmlDiagramObject(GmlDiagramObject value);

	/**
	 * Returns the value of the '<em><b>Gml Stroke</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Stroke</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Stroke</em>' reference.
	 * @see #setGmlStroke(GmlStroke)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineSymbol_GmlStroke()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols
	 * @model opposite="GmlLineSymbols"
	 * @generated
	 */
	GmlStroke getGmlStroke();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Stroke</em>' reference.
	 * @see #getGmlStroke()
	 * @generated
	 */
	void setGmlStroke(GmlStroke value);

	/**
	 * Returns the value of the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Side</em>' attribute.
	 * @see #setSourceSide(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineSymbol_SourceSide()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For dynamic network update (i.e. colouring) purposes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For dynamic network update (i.e. colouring) purposes'"
	 * @generated
	 */
	String getSourceSide();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Side</em>' attribute.
	 * @see #getSourceSide()
	 * @generated
	 */
	void setSourceSide(String value);

} // GmlLineSymbol
