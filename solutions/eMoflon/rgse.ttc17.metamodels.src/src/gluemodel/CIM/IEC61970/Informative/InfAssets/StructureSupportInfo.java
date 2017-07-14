/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Support Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorKind <em>Anchor Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSize <em>Size</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSecuredStructure <em>Secured Structure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodCount <em>Anchor Rod Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getLength <em>Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodLength <em>Anchor Rod Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of support for structure assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of support for structure assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of support for structure assets.' Profile\040documentation='Properties of support for structure assets.'"
 * @generated
 */
public interface StructureSupportInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Anchor Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind
	 * @see #setAnchorKind(AnchorKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_AnchorKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if anchor) Kind of anchor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if anchor) Kind of anchor.'"
	 * @generated
	 */
	AnchorKind getAnchorKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorKind <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AnchorKind
	 * @see #getAnchorKind()
	 * @generated
	 */
	void setAnchorKind(AnchorKind value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @see #setKind(StructureSupportKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of structure support.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of structure support.'"
	 * @generated
	 */
	StructureSupportKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StructureSupportKind value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_Size()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Size of this support structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Size of this support structure.'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Secured Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getStructureSupportInfos <em>Structure Support Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secured Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secured Structure</em>' reference.
	 * @see #setSecuredStructure(StructureInfo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_SecuredStructure()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getStructureSupportInfos
	 * @model opposite="StructureSupportInfos"
	 * @generated
	 */
	StructureInfo getSecuredStructure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSecuredStructure <em>Secured Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secured Structure</em>' reference.
	 * @see #getSecuredStructure()
	 * @generated
	 */
	void setSecuredStructure(StructureInfo value);

	/**
	 * Returns the value of the '<em><b>Anchor Rod Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Rod Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Rod Count</em>' attribute.
	 * @see #setAnchorRodCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_AnchorRodCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if anchor) Number of rods used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if anchor) Number of rods used.'"
	 * @generated
	 */
	int getAnchorRodCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Rod Count</em>' attribute.
	 * @see #getAnchorRodCount()
	 * @generated
	 */
	void setAnchorRodCount(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_Length()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Length of this support structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Length of this support structure.'"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Anchor Rod Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Rod Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Rod Length</em>' attribute.
	 * @see #setAnchorRodLength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_AnchorRodLength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if anchor) Length of rod used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if anchor) Length of rod used.'"
	 * @generated
	 */
	float getAnchorRodLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Rod Length</em>' attribute.
	 * @see #getAnchorRodLength()
	 * @generated
	 */
	void setAnchorRodLength(float value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportInfo_Direction()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AngleDegrees" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Direction of this support structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Direction of this support structure.'"
	 * @generated
	 */
	float getDirection();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(float value);

} // StructureSupportInfo
