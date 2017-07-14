/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics <em>Gml Graphics</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls <em>Gml FIlls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes <em>Gml Strokes</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Defines a \"shape\" which has coloring applied to it (i.e. square, circle, triangle, star, ...).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Defines a \"shape\" which has coloring applied to it (i.e. square, circle, triangle, star, ...).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Defines a \"shape\" which has coloring applied to it (i.e. square, circle, triangle, star, ...).' Profile\040documentation='Defines a \"shape\" which has coloring applied to it (i.e. square, circle, triangle, star, ...).'"
 * @generated
 */
public interface GmlMark extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Graphics</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Graphics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Graphics</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark_GmlGraphics()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks
	 * @model opposite="GmlMarks"
	 * @generated
	 */
	EList<GmlGraphic> getGmlGraphics();

	/**
	 * Returns the value of the '<em><b>Gml FIlls</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml FIlls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml FIlls</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark_GmlFIlls()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks
	 * @model opposite="GmlMarks"
	 * @generated
	 */
	EList<GmlFill> getGmlFIlls();

	/**
	 * Returns the value of the '<em><b>Well Known Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Well Known Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Well Known Name</em>' attribute.
	 * @see #setWellKnownName(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark_WellKnownName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Gives the well-known name of the shape of the mark.\nAllowed values include at least square, circle, triangle, star, cross, and x.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Gives the well-known name of the shape of the mark.\nAllowed values include at least square, circle, triangle, star, cross, and x.'"
	 * @generated
	 */
	String getWellKnownName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Known Name</em>' attribute.
	 * @see #getWellKnownName()
	 * @generated
	 */
	void setWellKnownName(String value);

	/**
	 * Returns the value of the '<em><b>Gml Strokes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Strokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Strokes</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark_GmlStrokes()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks
	 * @model opposite="GmlMarks"
	 * @generated
	 */
	EList<GmlStroke> getGmlStrokes();

} // GmlMark
