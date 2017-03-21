/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Line Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineGeometry()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Typically used for rendering linear assets and/or power system resources.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Typically used for rendering linear assets and/or power system resources.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Typically used for rendering linear assets and/or power system resources.' Profile\040documentation='Typically used for rendering linear assets and/or power system resources.'"
 * @generated
 */
public interface GmlLineGeometry extends GmlDiagramObject {
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
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineGeometry_SourceSide()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For dynamic network update (i.e. colouring) purposes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For dynamic network update (i.e. colouring) purposes'"
	 * @generated
	 */
	String getSourceSide();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Side</em>' attribute.
	 * @see #getSourceSide()
	 * @generated
	 */
	void setSourceSide(String value);

} // GmlLineGeometry
