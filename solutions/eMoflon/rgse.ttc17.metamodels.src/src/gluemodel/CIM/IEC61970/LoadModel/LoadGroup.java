/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadGroup#getRegisteredLoads <em>Registered Loads</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadGroup()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.' Profile\040documentation='The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.'"
 * @generated
 */
public interface LoadGroup extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Registered Loads</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Loads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Loads</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadGroup_RegisteredLoads()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredLoad#getLoadArea
	 * @model opposite="LoadArea"
	 * @generated
	 */
	EList<RegisteredLoad> getRegisteredLoads();

	/**
	 * Returns the value of the '<em><b>Sub Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Load Area</em>' reference.
	 * @see #setSubLoadArea(SubLoadArea)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadGroup_SubLoadArea()
	 * @see gluemodel.CIM.IEC61970.LoadModel.SubLoadArea#getLoadGroups
	 * @model opposite="LoadGroups"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SubLoadArea where the Loadgroup belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubLoadArea where the Loadgroup belongs.'"
	 * @generated
	 */
	SubLoadArea getSubLoadArea();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Load Area</em>' reference.
	 * @see #getSubLoadArea()
	 * @generated
	 */
	void setSubLoadArea(SubLoadArea value);

} // LoadGroup
