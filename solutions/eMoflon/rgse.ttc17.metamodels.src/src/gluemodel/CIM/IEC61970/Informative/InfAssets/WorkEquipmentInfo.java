/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.Usage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Equipment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getCrew <em>Crew</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWorkEquipmentInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties for various equipment used to perform units of work by crews, office staff, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties for various equipment used to perform units of work by crews, office staff, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties for various equipment used to perform units of work by crews, office staff, etc.' Profile\040documentation='Properties for various equipment used to perform units of work by crews, office staff, etc.'"
 * @generated
 */
public interface WorkEquipmentInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets <em>Work Equipment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWorkEquipmentInfo_Crew()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets
	 * @model opposite="WorkEquipmentAssets"
	 * @generated
	 */
	Crew getCrew();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(Crew value);

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Usage}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getWorkEquipmentInfo_Usages()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset
	 * @model opposite="WorkEquipmentAsset"
	 * @generated
	 */
	EList<Usage> getUsages();

} // WorkEquipmentInfo
