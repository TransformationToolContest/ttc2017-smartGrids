/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSubLoadArea()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.' Profile\040documentation='The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 * @generated
 */
public interface SubLoadArea extends EnergyArea {
	/**
	 * Returns the value of the '<em><b>Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Area</em>' reference.
	 * @see #setLoadArea(LoadArea)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSubLoadArea_LoadArea()
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadArea#getSubLoadAreas
	 * @model opposite="SubLoadAreas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The LoadArea where the SubLoadArea belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The LoadArea where the SubLoadArea belongs.'"
	 * @generated
	 */
	LoadArea getLoadArea();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Area</em>' reference.
	 * @see #getLoadArea()
	 * @generated
	 */
	void setLoadArea(LoadArea value);

	/**
	 * Returns the value of the '<em><b>Load Groups</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.LoadModel.LoadGroup}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Groups</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getSubLoadArea_LoadGroups()
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadGroup#getSubLoadArea
	 * @model opposite="SubLoadArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Loadgroups in the SubLoadArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Loadgroups in the SubLoadArea.'"
	 * @generated
	 */
	EList<LoadGroup> getLoadGroups();

} // SubLoadArea
