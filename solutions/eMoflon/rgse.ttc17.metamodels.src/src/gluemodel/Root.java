/**
 */
package gluemodel;

import gluemodel.CIM.CIMRoot;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.COSEM.COSEMRoot;

import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;
import gluemodel.substationStandard.Substandard;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.Root#getCim <em>Cim</em>}</li>
 *   <li>{@link gluemodel.Root#getCosem <em>Cosem</em>}</li>
 *   <li>{@link gluemodel.Root#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.Root#getSubstandard <em>Substandard</em>}</li>
 *   <li>{@link gluemodel.Root#getMmxus <em>Mmxus</em>}</li>
 *   <li>{@link gluemodel.Root#getMeterAssetToPhysicalDevice <em>Meter Asset To Physical Device</em>}</li>
 *   <li>{@link gluemodel.Root#getMeterAssetToMXXU <em>Meter Asset To MXXU</em>}</li>
 * </ul>
 *
 * @see gluemodel.GluemodelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Cim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cim</em>' containment reference.
	 * @see #setCim(CIMRoot)
	 * @see gluemodel.GluemodelPackage#getRoot_Cim()
	 * @model containment="true"
	 * @generated
	 */
	CIMRoot getCim();

	/**
	 * Sets the value of the '{@link gluemodel.Root#getCim <em>Cim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cim</em>' containment reference.
	 * @see #getCim()
	 * @generated
	 */
	void setCim(CIMRoot value);

	/**
	 * Returns the value of the '<em><b>Cosem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cosem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cosem</em>' containment reference.
	 * @see #setCosem(COSEMRoot)
	 * @see gluemodel.GluemodelPackage#getRoot_Cosem()
	 * @model containment="true"
	 * @generated
	 */
	COSEMRoot getCosem();

	/**
	 * Sets the value of the '{@link gluemodel.Root#getCosem <em>Cosem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cosem</em>' containment reference.
	 * @see #getCosem()
	 * @generated
	 */
	void setCosem(COSEMRoot value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.MeterAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see gluemodel.GluemodelPackage#getRoot_Assets()
	 * @model
	 * @generated
	 */
	EList<MeterAsset> getAssets();

	/**
	 * Returns the value of the '<em><b>Substandard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substandard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substandard</em>' containment reference.
	 * @see #setSubstandard(Substandard)
	 * @see gluemodel.GluemodelPackage#getRoot_Substandard()
	 * @model containment="true"
	 * @generated
	 */
	Substandard getSubstandard();

	/**
	 * Sets the value of the '{@link gluemodel.Root#getSubstandard <em>Substandard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substandard</em>' containment reference.
	 * @see #getSubstandard()
	 * @generated
	 */
	void setSubstandard(Substandard value);

	/**
	 * Returns the value of the '<em><b>Mmxus</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.substationStandard.LNNodes.LNGroupM.MMXU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mmxus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mmxus</em>' reference list.
	 * @see gluemodel.GluemodelPackage#getRoot_Mmxus()
	 * @model
	 * @generated
	 */
	EList<MMXU> getMmxus();

	/**
	 * Returns the value of the '<em><b>Meter Asset To Physical Device</b></em>' containment reference list.
	 * The list contents are of type {@link gluemodel.MeterAssetPhysicalDevicePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Asset To Physical Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Asset To Physical Device</em>' containment reference list.
	 * @see gluemodel.GluemodelPackage#getRoot_MeterAssetToPhysicalDevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeterAssetPhysicalDevicePair> getMeterAssetToPhysicalDevice();

	/**
	 * Returns the value of the '<em><b>Meter Asset To MXXU</b></em>' containment reference list.
	 * The list contents are of type {@link gluemodel.MeterAssetMMXUPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Asset To MXXU</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Asset To MXXU</em>' containment reference list.
	 * @see gluemodel.GluemodelPackage#getRoot_MeterAssetToMXXU()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeterAssetMMXUPair> getMeterAssetToMXXU();

} // Root
