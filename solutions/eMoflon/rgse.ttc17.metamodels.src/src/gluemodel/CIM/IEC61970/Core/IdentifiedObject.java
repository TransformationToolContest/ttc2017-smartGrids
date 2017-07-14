/**
 */
package gluemodel.CIM.IEC61970.Core;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getDescription <em>Description</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getPathName <em>Path Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is a root class to provide common naming attributes for all classes needing naming attributes'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This is a root class to provide common naming attributes for all classes needing naming attributes'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is a root class to provide common naming attributes for all classes needing naming attributes' Profile\040documentation='This is a root class to provide common naming attributes for all classes needing naming attributes'"
 * @generated
 */
public interface IdentifiedObject extends Element {
	/**
	 * Returns the value of the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRID</em>' attribute.
	 * @see #setMRID(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_MRID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique.'"
	 * @generated
	 */
	String getMRID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRID</em>' attribute.
	 * @see #getMRID()
	 * @generated
	 */
	void setMRID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_Name()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The name is a free text human readable name of the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The name is a free text human readable name of the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_Description()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy.'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_PathName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The pathname is a system unique name composed from all IdentifiedObject.localNames in a naming hierarchy path from the object to the root.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The pathname is a system unique name composed from all IdentifiedObject.localNames in a naming hierarchy path from the object to the root.'"
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Authority Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getIdentifiedObjects <em>Identified Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Authority Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Authority Set</em>' reference.
	 * @see #setModelingAuthoritySet(ModelingAuthoritySet)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_ModelingAuthoritySet()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCore.ModelingAuthoritySet#getIdentifiedObjects
	 * @model opposite="IdentifiedObjects"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An IdentifiedObject belongs to a Modeling Authority Set for purposes of defining a group of data maintained by the same Modeling Authority.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An IdentifiedObject belongs to a Modeling Authority Set for purposes of defining a group of data maintained by the same Modeling Authority.'"
	 * @generated
	 */
	ModelingAuthoritySet getModelingAuthoritySet();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Authority Set</em>' reference.
	 * @see #getModelingAuthoritySet()
	 * @generated
	 */
	void setModelingAuthoritySet(ModelingAuthoritySet value);

	/**
	 * Returns the value of the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Name</em>' attribute.
	 * @see #setLocalName(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_LocalName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The localName is a human readable name of the object. It is only used with objects organized in a naming hierarchy. The simplest naming hierarchy has just one parent (the root) giving a flat naming hierarchy. However, the naming hierarchy usually has several levels, e.g. Substation, VoltageLevel, Equipment etc. Children of the same parent have names that are unique among them. If the uniqueness requirement cannot be met IdentifiedObject.localName shall not be used, use IdentifiedObject.name  instead.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The localName is a human readable name of the object. It is only used with objects organized in a naming hierarchy. The simplest naming hierarchy has just one parent (the root) giving a flat naming hierarchy. However, the naming hierarchy usually has several levels, e.g. Substation, VoltageLevel, Equipment etc. Children of the same parent have names that are unique among them. If the uniqueness requirement cannot be met IdentifiedObject.localName shall not be used, use IdentifiedObject.name  instead.'"
	 * @generated
	 */
	String getLocalName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getLocalName <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Name</em>' attribute.
	 * @see #getLocalName()
	 * @generated
	 */
	void setLocalName(String value);

	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' attribute.
	 * @see #setAliasName(String)
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getIdentifiedObject_AliasName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The aliasName is free text human readable name of the object alternative to IdentifiedObject.name. It may be non unique and may not correlate to a naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The aliasName is free text human readable name of the object alternative to IdentifiedObject.name. It may be non unique and may not correlate to a naming hierarchy.'"
	 * @generated
	 */
	String getAliasName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' attribute.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(String value);

} // IdentifiedObject
