/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tower Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo#getConstructionKind <em>Construction Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTowerInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of tower asset. Dimensions of the Tower are specified in associated DimensionsInfo class.\nWhen used for planning purposes, a transmission tower carrying two 3-phase circuits will have 2 instances of Connection, each of which will have 3 MountingPoint instances, one for each phase all with coordinates relative to a common origin on the tower. (It may also have a 3rd Connection with a single MountingPoint for the Neutral line).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of tower asset. Dimensions of the Tower are specified in associated DimensionsInfo class.\nWhen used for planning purposes, a transmission tower carrying two 3-phase circuits will have 2 instances of Connection, each of which will have 3 MountingPoint instances, one for each phase all with coordinates relative to a common origin on the tower. (It may also have a 3rd Connection with a single MountingPoint for the Neutral line).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of tower asset. Dimensions of the Tower are specified in associated DimensionsInfo class.\nWhen used for planning purposes, a transmission tower carrying two 3-phase circuits will have 2 instances of Connection, each of which will have 3 MountingPoint instances, one for each phase all with coordinates relative to a common origin on the tower. (It may also have a 3rd Connection with a single MountingPoint for the Neutral line).' Profile\040documentation='Properties of tower asset. Dimensions of the Tower are specified in associated DimensionsInfo class.\nWhen used for planning purposes, a transmission tower carrying two 3-phase circuits will have 2 instances of Connection, each of which will have 3 MountingPoint instances, one for each phase all with coordinates relative to a common origin on the tower. (It may also have a 3rd Connection with a single MountingPoint for the Neutral line).'"
 * @generated
 */
public interface TowerInfo extends StructureInfo {
	/**
	 * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @see #setConstructionKind(TowerConstructionKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTowerInfo_ConstructionKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Construction structure on the tower.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Construction structure on the tower.'"
	 * @generated
	 */
	TowerConstructionKind getConstructionKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @see #getConstructionKind()
	 * @generated
	 */
	void setConstructionKind(TowerConstructionKind value);

} // TowerInfo
