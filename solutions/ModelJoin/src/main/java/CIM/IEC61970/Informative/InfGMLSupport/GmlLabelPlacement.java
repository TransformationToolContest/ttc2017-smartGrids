/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Label Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to position a label relative to a point or a line.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Used to position a label relative to a point or a line.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to position a label relative to a point or a line.' Profile\040documentation='Used to position a label relative to a point or a line.'"
 * @generated
 */
public interface GmlLabelPlacement extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of \"LabelPlacement\" which in turn specifies where and how a text label should be rendered relative to a geometry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of \"LabelPlacement\" which in turn specifies where and how a text label should be rendered relative to a geometry.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_Offset()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Perpendicular distance away from a line to draw a label. The distance is in pixels and is positive to the left-hand side of the line string. Negative numbers mean right. The default offset is 0.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Perpendicular distance away from a line to draw a label. The distance is in pixels and is positive to the left-hand side of the line string. Negative numbers mean right. The default offset is 0.'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Anchor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Y</em>' attribute.
	 * @see #setAnchorY(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_AnchorY()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Y-coordinate location inside of a label to use for anchoring the label to the main-geometry point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Y-coordinate location inside of a label to use for anchoring the label to the main-geometry point.'"
	 * @generated
	 */
	String getAnchorY();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Y</em>' attribute.
	 * @see #getAnchorY()
	 * @generated
	 */
	void setAnchorY(String value);

	/**
	 * Returns the value of the '<em><b>Anchor X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor X</em>' attribute.
	 * @see #setAnchorX(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_AnchorX()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='X-coordinate location inside of a label to use for anchoring the label to the main-geometry point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='X-coordinate location inside of a label to use for anchoring the label to the main-geometry point.'"
	 * @generated
	 */
	String getAnchorX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor X</em>' attribute.
	 * @see #getAnchorX()
	 * @generated
	 */
	void setAnchorX(String value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_Rotation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Clockwise rotation of the label in degrees from the normal direction for a font.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Clockwise rotation of the label in degrees from the normal direction for a font.'"
	 * @generated
	 */
	String getRotation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(String value);

	/**
	 * Returns the value of the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement Y</em>' attribute.
	 * @see #setDisplacementY(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_DisplacementY()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Y displacement from the main-geometry point to render a text label.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Y displacement from the main-geometry point to render a text label.'"
	 * @generated
	 */
	String getDisplacementY();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Y</em>' attribute.
	 * @see #getDisplacementY()
	 * @generated
	 */
	void setDisplacementY(String value);

	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement X</em>' attribute.
	 * @see #setDisplacementX(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_DisplacementX()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='X displacement from the main-geometry point to render a text label.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='X displacement from the main-geometry point to render a text label.'"
	 * @generated
	 */
	String getDisplacementX();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement X</em>' attribute.
	 * @see #getDisplacementX()
	 * @generated
	 */
	void setDisplacementX(String value);

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement_GmlTextSymbols()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement
	 * @model opposite="GmlLabelPlacement"
	 * @generated
	 */
	EList<GmlTextSymbol> getGmlTextSymbols();

} // GmlLabelPlacement
