/**
 */
package gluemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gluemodel.GluemodelFactory
 * @model kind="package"
 * @generated
 */
public interface GluemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gluemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/rgse.ttc17.metamodels.src/model/Gluemodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rgse.ttc17";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GluemodelPackage eINSTANCE = gluemodel.impl.GluemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.impl.RootImpl
	 * @see gluemodel.impl.GluemodelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Cim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CIM = 0;

	/**
	 * The feature id for the '<em><b>Cosem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__COSEM = 1;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ASSETS = 2;

	/**
	 * The feature id for the '<em><b>Substandard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SUBSTANDARD = 3;

	/**
	 * The feature id for the '<em><b>Mmxus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MMXUS = 4;

	/**
	 * The feature id for the '<em><b>Meter Asset To Physical Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__METER_ASSET_TO_PHYSICAL_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Meter Asset To MXXU</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__METER_ASSET_TO_MXXU = 6;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link gluemodel.impl.MeterAssetMMXUPairImpl <em>Meter Asset MMXU Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.impl.MeterAssetMMXUPairImpl
	 * @see gluemodel.impl.GluemodelPackageImpl#getMeterAssetMMXUPair()
	 * @generated
	 */
	int METER_ASSET_MMXU_PAIR = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__B = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__NAME = 2;

	/**
	 * The feature id for the '<em><b>AMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__AMAG = 3;

	/**
	 * The feature id for the '<em><b>AAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__AANG = 4;

	/**
	 * The feature id for the '<em><b>BMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__BMAG = 5;

	/**
	 * The feature id for the '<em><b>BAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__BANG = 6;

	/**
	 * The feature id for the '<em><b>CMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__CMAG = 7;

	/**
	 * The feature id for the '<em><b>CAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__CANG = 8;

	/**
	 * The feature id for the '<em><b>Neut Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__NEUT_MAG = 9;

	/**
	 * The feature id for the '<em><b>Neut Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__NEUT_ANG = 10;

	/**
	 * The feature id for the '<em><b>Net Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__NET_MAG = 11;

	/**
	 * The feature id for the '<em><b>Net Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__NET_ANG = 12;

	/**
	 * The feature id for the '<em><b>Res Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__RES_MAG = 13;

	/**
	 * The feature id for the '<em><b>Res Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR__RES_ANG = 14;

	/**
	 * The number of structural features of the '<em>Meter Asset MMXU Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Meter Asset MMXU Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_MMXU_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.impl.MeterAssetPhysicalDevicePairImpl <em>Meter Asset Physical Device Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.impl.MeterAssetPhysicalDevicePairImpl
	 * @see gluemodel.impl.GluemodelPackageImpl#getMeterAssetPhysicalDevicePair()
	 * @generated
	 */
	int METER_ASSET_PHYSICAL_DEVICE_PAIR = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_PHYSICAL_DEVICE_PAIR__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_PHYSICAL_DEVICE_PAIR__B = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME = 2;

	/**
	 * The number of structural features of the '<em>Meter Asset Physical Device Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_PHYSICAL_DEVICE_PAIR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meter Asset Physical Device Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_PHYSICAL_DEVICE_PAIR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see gluemodel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.Root#getCim <em>Cim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cim</em>'.
	 * @see gluemodel.Root#getCim()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Cim();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.Root#getCosem <em>Cosem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cosem</em>'.
	 * @see gluemodel.Root#getCosem()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Cosem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.Root#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see gluemodel.Root#getAssets()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Assets();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.Root#getSubstandard <em>Substandard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substandard</em>'.
	 * @see gluemodel.Root#getSubstandard()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Substandard();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.Root#getMmxus <em>Mmxus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mmxus</em>'.
	 * @see gluemodel.Root#getMmxus()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Mmxus();

	/**
	 * Returns the meta object for the containment reference list '{@link gluemodel.Root#getMeterAssetToPhysicalDevice <em>Meter Asset To Physical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meter Asset To Physical Device</em>'.
	 * @see gluemodel.Root#getMeterAssetToPhysicalDevice()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_MeterAssetToPhysicalDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link gluemodel.Root#getMeterAssetToMXXU <em>Meter Asset To MXXU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meter Asset To MXXU</em>'.
	 * @see gluemodel.Root#getMeterAssetToMXXU()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_MeterAssetToMXXU();

	/**
	 * Returns the meta object for class '{@link gluemodel.MeterAssetMMXUPair <em>Meter Asset MMXU Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset MMXU Pair</em>'.
	 * @see gluemodel.MeterAssetMMXUPair
	 * @generated
	 */
	EClass getMeterAssetMMXUPair();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.MeterAssetMMXUPair#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getA()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EReference getMeterAssetMMXUPair_A();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.MeterAssetMMXUPair#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getB()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EReference getMeterAssetMMXUPair_B();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getName()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_Name();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getAMag <em>AMag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AMag</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getAMag()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_AMag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getAAng <em>AAng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AAng</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getAAng()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_AAng();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getBMag <em>BMag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BMag</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getBMag()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_BMag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getBAng <em>BAng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BAng</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getBAng()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_BAng();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getCMag <em>CMag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CMag</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getCMag()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_CMag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getCAng <em>CAng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CAng</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getCAng()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_CAng();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getNeutMag <em>Neut Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neut Mag</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getNeutMag()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_NeutMag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getNeutAng <em>Neut Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neut Ang</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getNeutAng()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_NeutAng();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getNetMag <em>Net Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Mag</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getNetMag()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_NetMag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getNetAng <em>Net Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Ang</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getNetAng()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_NetAng();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getResMag <em>Res Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Mag</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getResMag()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_ResMag();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetMMXUPair#getResAng <em>Res Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Ang</em>'.
	 * @see gluemodel.MeterAssetMMXUPair#getResAng()
	 * @see #getMeterAssetMMXUPair()
	 * @generated
	 */
	EAttribute getMeterAssetMMXUPair_ResAng();

	/**
	 * Returns the meta object for class '{@link gluemodel.MeterAssetPhysicalDevicePair <em>Meter Asset Physical Device Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset Physical Device Pair</em>'.
	 * @see gluemodel.MeterAssetPhysicalDevicePair
	 * @generated
	 */
	EClass getMeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.MeterAssetPhysicalDevicePair#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A</em>'.
	 * @see gluemodel.MeterAssetPhysicalDevicePair#getA()
	 * @see #getMeterAssetPhysicalDevicePair()
	 * @generated
	 */
	EReference getMeterAssetPhysicalDevicePair_A();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.MeterAssetPhysicalDevicePair#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see gluemodel.MeterAssetPhysicalDevicePair#getB()
	 * @see #getMeterAssetPhysicalDevicePair()
	 * @generated
	 */
	EReference getMeterAssetPhysicalDevicePair_B();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.MeterAssetPhysicalDevicePair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gluemodel.MeterAssetPhysicalDevicePair#getName()
	 * @see #getMeterAssetPhysicalDevicePair()
	 * @generated
	 */
	EAttribute getMeterAssetPhysicalDevicePair_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GluemodelFactory getGluemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gluemodel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.impl.RootImpl
		 * @see gluemodel.impl.GluemodelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Cim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CIM = eINSTANCE.getRoot_Cim();

		/**
		 * The meta object literal for the '<em><b>Cosem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__COSEM = eINSTANCE.getRoot_Cosem();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ASSETS = eINSTANCE.getRoot_Assets();

		/**
		 * The meta object literal for the '<em><b>Substandard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SUBSTANDARD = eINSTANCE.getRoot_Substandard();

		/**
		 * The meta object literal for the '<em><b>Mmxus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MMXUS = eINSTANCE.getRoot_Mmxus();

		/**
		 * The meta object literal for the '<em><b>Meter Asset To Physical Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__METER_ASSET_TO_PHYSICAL_DEVICE = eINSTANCE.getRoot_MeterAssetToPhysicalDevice();

		/**
		 * The meta object literal for the '<em><b>Meter Asset To MXXU</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__METER_ASSET_TO_MXXU = eINSTANCE.getRoot_MeterAssetToMXXU();

		/**
		 * The meta object literal for the '{@link gluemodel.impl.MeterAssetMMXUPairImpl <em>Meter Asset MMXU Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.impl.MeterAssetMMXUPairImpl
		 * @see gluemodel.impl.GluemodelPackageImpl#getMeterAssetMMXUPair()
		 * @generated
		 */
		EClass METER_ASSET_MMXU_PAIR = eINSTANCE.getMeterAssetMMXUPair();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_MMXU_PAIR__A = eINSTANCE.getMeterAssetMMXUPair_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_MMXU_PAIR__B = eINSTANCE.getMeterAssetMMXUPair_B();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__NAME = eINSTANCE.getMeterAssetMMXUPair_Name();

		/**
		 * The meta object literal for the '<em><b>AMag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__AMAG = eINSTANCE.getMeterAssetMMXUPair_AMag();

		/**
		 * The meta object literal for the '<em><b>AAng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__AANG = eINSTANCE.getMeterAssetMMXUPair_AAng();

		/**
		 * The meta object literal for the '<em><b>BMag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__BMAG = eINSTANCE.getMeterAssetMMXUPair_BMag();

		/**
		 * The meta object literal for the '<em><b>BAng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__BANG = eINSTANCE.getMeterAssetMMXUPair_BAng();

		/**
		 * The meta object literal for the '<em><b>CMag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__CMAG = eINSTANCE.getMeterAssetMMXUPair_CMag();

		/**
		 * The meta object literal for the '<em><b>CAng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__CANG = eINSTANCE.getMeterAssetMMXUPair_CAng();

		/**
		 * The meta object literal for the '<em><b>Neut Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__NEUT_MAG = eINSTANCE.getMeterAssetMMXUPair_NeutMag();

		/**
		 * The meta object literal for the '<em><b>Neut Ang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__NEUT_ANG = eINSTANCE.getMeterAssetMMXUPair_NeutAng();

		/**
		 * The meta object literal for the '<em><b>Net Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__NET_MAG = eINSTANCE.getMeterAssetMMXUPair_NetMag();

		/**
		 * The meta object literal for the '<em><b>Net Ang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__NET_ANG = eINSTANCE.getMeterAssetMMXUPair_NetAng();

		/**
		 * The meta object literal for the '<em><b>Res Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__RES_MAG = eINSTANCE.getMeterAssetMMXUPair_ResMag();

		/**
		 * The meta object literal for the '<em><b>Res Ang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_MMXU_PAIR__RES_ANG = eINSTANCE.getMeterAssetMMXUPair_ResAng();

		/**
		 * The meta object literal for the '{@link gluemodel.impl.MeterAssetPhysicalDevicePairImpl <em>Meter Asset Physical Device Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.impl.MeterAssetPhysicalDevicePairImpl
		 * @see gluemodel.impl.GluemodelPackageImpl#getMeterAssetPhysicalDevicePair()
		 * @generated
		 */
		EClass METER_ASSET_PHYSICAL_DEVICE_PAIR = eINSTANCE.getMeterAssetPhysicalDevicePair();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_PHYSICAL_DEVICE_PAIR__A = eINSTANCE.getMeterAssetPhysicalDevicePair_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_PHYSICAL_DEVICE_PAIR__B = eINSTANCE.getMeterAssetPhysicalDevicePair_B();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME = eINSTANCE.getMeterAssetPhysicalDevicePair_Name();

	}

} //GluemodelPackage
