/**
 */
package gluemodel.CIM.IEC61970.Informative.InfGMLSupport;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems <em>Change Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSelector()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A diagram element that allows selection by a user, i.e. as \"hyperNode\" for navigating between diagrams, or as composite object representing multiple grouped objects.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A diagram element that allows selection by a user, i.e. as \"hyperNode\" for navigating between diagrams, or as composite object representing multiple grouped objects.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A diagram element that allows selection by a user, i.e. as \"hyperNode\" for navigating between diagrams, or as composite object representing multiple grouped objects.' Profile\040documentation='A diagram element that allows selection by a user, i.e. as \"hyperNode\" for navigating between diagrams, or as composite object representing multiple grouped objects.'"
 * @generated
 */
public interface GmlSelector extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors <em>Gml Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSelector_GmlDiagramObjects()
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors
	 * @model opposite="GmlSelectors"
	 * @generated
	 */
	EList<GmlDiagramObject> getGmlDiagramObjects();

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSelector_ChangeItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector
	 * @model opposite="GmlSelector"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

} // GmlSelector
