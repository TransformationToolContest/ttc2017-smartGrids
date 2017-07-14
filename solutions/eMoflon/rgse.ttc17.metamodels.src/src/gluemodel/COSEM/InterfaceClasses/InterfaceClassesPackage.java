/**
 */
package gluemodel.COSEM.InterfaceClasses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesFactory
 * @model kind="package"
 * @generated
 */
public interface InterfaceClassesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InterfaceClasses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "interface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceClassesPackage eINSTANCE = gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.BaseImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 68;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__LOGICAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__OBI_SCODE = 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSK_PHY_MACsetupImpl <em>SFSK PHY MA Csetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSK_PHY_MACsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSK_PHY_MACsetup()
	 * @generated
	 */
	int SFSK_PHY_MA_CSETUP = 0;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MA_CSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MA_CSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSK PHY MA Csetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MA_CSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSK PHY MA Csetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MA_CSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKActiveinitiatorImpl <em>SFSK Activeinitiator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKActiveinitiatorImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKActiveinitiator()
	 * @generated
	 */
	int SFSK_ACTIVEINITIATOR = 1;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVEINITIATOR__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVEINITIATOR__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSK Activeinitiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVEINITIATOR_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSK Activeinitiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVEINITIATOR_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACsynctimeoutsImpl <em>SFSKMA Csynctimeouts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACsynctimeoutsImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKMACsynctimeouts()
	 * @generated
	 */
	int SFSKMA_CSYNCTIMEOUTS = 2;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CSYNCTIMEOUTS__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CSYNCTIMEOUTS__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSKMA Csynctimeouts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CSYNCTIMEOUTS_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSKMA Csynctimeouts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CSYNCTIMEOUTS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACcountersImpl <em>SFSKMA Ccounters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACcountersImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKMACcounters()
	 * @generated
	 */
	int SFSKMA_CCOUNTERS = 3;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CCOUNTERS__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CCOUNTERS__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSKMA Ccounters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CCOUNTERS_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSKMA Ccounters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMA_CCOUNTERS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC61334_4_32LLCsetupImpl <em>IEC61334 432LL Csetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC61334_4_32LLCsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC61334_4_32LLCsetup()
	 * @generated
	 */
	int IEC61334_432LL_CSETUP = 4;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LL_CSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LL_CSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC61334 432LL Csetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LL_CSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC61334 432LL Csetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LL_CSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKReportingsystemlistImpl <em>SFSK Reportingsystemlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKReportingsystemlistImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKReportingsystemlist()
	 * @generated
	 */
	int SFSK_REPORTINGSYSTEMLIST = 5;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTINGSYSTEMLIST__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTINGSYSTEMLIST__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSK Reportingsystemlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTINGSYSTEMLIST_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSK Reportingsystemlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTINGSYSTEMLIST_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.t61334_32_LLC_SSCS_setupImpl <em>t61334 32 LLC SSCS setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.t61334_32_LLC_SSCS_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#gett61334_32_LLC_SSCS_setup()
	 * @generated
	 */
	int T61334_32_LLC_SSCS_SETUP = 6;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_32_LLC_SSCS_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_32_LLC_SSCS_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>t61334 32 LLC SSCS setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_32_LLC_SSCS_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>t61334 32 LLC SSCS setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_32_LLC_SSCS_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Phy_layer_countersImpl <em>PRIME NB OFDM PLC Phy layer counters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Phy_layer_countersImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_Phy_layer_counters()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS = 7;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC Phy layer counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC Phy layer counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACsetupImpl <em>PRIME NB OFDM PLC MA Csetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MACsetup()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MA_CSETUP = 8;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MA Csetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MA Csetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_countersImpl <em>PRIME NB OFDM PLC MAC counters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_countersImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MAC_counters()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS = 9;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_functionalparamsImpl <em>PRIME NB OFDM PLC MAC functionalparams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_functionalparamsImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MAC_functionalparams()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS = 10;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC functionalparams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC functionalparams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACnetworkadmindataImpl <em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACnetworkadmindataImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MACnetworkadmindata()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA = 11;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Application_identificationImpl <em>PRIME NB OFDM PLC Application identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Application_identificationImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_Application_identification()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC Application identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC Application identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_layer_countersImpl <em>G3 PLC MAC layer counters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_layer_countersImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getG3_PLC_MAC_layer_counters()
	 * @generated
	 */
	int G3_PLC_MAC_LAYER_COUNTERS = 13;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>G3 PLC MAC layer counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>G3 PLC MAC layer counters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_setupImpl <em>G3 PLC MAC setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getG3_PLC_MAC_setup()
	 * @generated
	 */
	int G3_PLC_MAC_SETUP = 14;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>G3 PLC MAC setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>G3 PLC MAC setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_6LoWPANImpl <em>G3 PLC 6Lo WPAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_6LoWPANImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getG3_PLC_6LoWPAN()
	 * @generated
	 */
	int G3_PLC_6LO_WPAN = 15;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>G3 PLC 6Lo WPAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>G3 PLC 6Lo WPAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_startupImpl <em>Zig Bee SAS startup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_startupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBee_SAS_startup()
	 * @generated
	 */
	int ZIG_BEE_SAS_STARTUP = 16;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee SAS startup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee SAS startup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_joinImpl <em>Zig Bee SAS join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_joinImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBee_SAS_join()
	 * @generated
	 */
	int ZIG_BEE_SAS_JOIN = 17;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee SAS join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee SAS join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_APS_fragmentationImpl <em>Zig Bee SAS APS fragmentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_APS_fragmentationImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBee_SAS_APS_fragmentation()
	 * @generated
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION = 18;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee SAS APS fragmentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee SAS APS fragmentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBeenetworkcontrolImpl <em>Zig Beenetworkcontrol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBeenetworkcontrolImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBeenetworkcontrol()
	 * @generated
	 */
	int ZIG_BEENETWORKCONTROL = 19;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEENETWORKCONTROL__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEENETWORKCONTROL__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Beenetworkcontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEENETWORKCONTROL_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Beenetworkcontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEENETWORKCONTROL_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBeetunnelsetupImpl <em>Zig Beetunnelsetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBeetunnelsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBeetunnelsetup()
	 * @generated
	 */
	int ZIG_BEETUNNELSETUP = 20;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEETUNNELSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEETUNNELSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Beetunnelsetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEETUNNELSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Beetunnelsetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEETUNNELSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.TCP_UDPsetupImpl <em>TCP UD Psetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.TCP_UDPsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getTCP_UDPsetup()
	 * @generated
	 */
	int TCP_UD_PSETUP = 21;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UD_PSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UD_PSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>TCP UD Psetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UD_PSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCP UD Psetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UD_PSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IPv4setupImpl <em>IPv4setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IPv4setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIPv4setup()
	 * @generated
	 */
	int IPV4SETUP = 22;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IPv4setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPv4setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IPv6setupImpl <em>IPv6setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IPv6setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIPv6setup()
	 * @generated
	 */
	int IPV6SETUP = 23;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IPv6setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPv6setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.MACaddresssetupImpl <em>MA Caddresssetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.MACaddresssetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getMACaddresssetup()
	 * @generated
	 */
	int MA_CADDRESSSETUP = 24;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA_CADDRESSSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA_CADDRESSSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MA Caddresssetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA_CADDRESSSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MA Caddresssetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA_CADDRESSSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PPPsetupImpl <em>PP Psetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PPPsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPPPsetup()
	 * @generated
	 */
	int PP_PSETUP = 25;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_PSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_PSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PP Psetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_PSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PP Psetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PP_PSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SMTPsetupImpl <em>SMT Psetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.SMTPsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSMTPsetup()
	 * @generated
	 */
	int SMT_PSETUP = 26;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMT_PSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMT_PSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SMT Psetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMT_PSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SMT Psetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMT_PSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ModemconfigurationImpl <em>Modemconfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ModemconfigurationImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getModemconfiguration()
	 * @generated
	 */
	int MODEMCONFIGURATION = 27;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEMCONFIGURATION__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEMCONFIGURATION__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Modemconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEMCONFIGURATION_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modemconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEMCONFIGURATION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.Auto_answerImpl <em>Auto answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.Auto_answerImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAuto_answer()
	 * @generated
	 */
	int AUTO_ANSWER = 28;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Auto answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auto answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.Auto_connectImpl <em>Auto connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.Auto_connectImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAuto_connect()
	 * @generated
	 */
	int AUTO_CONNECT = 29;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Auto connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auto connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.GPRS_modem_setupImpl <em>GPRS modem setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.GPRS_modem_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getGPRS_modem_setup()
	 * @generated
	 */
	int GPRS_MODEM_SETUP = 30;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>GPRS modem setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GPRS modem setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.GSM_DiagnosticImpl <em>GSM Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.GSM_DiagnosticImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getGSM_Diagnostic()
	 * @generated
	 */
	int GSM_DIAGNOSTIC = 31;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>GSM Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSM Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_twisted_pair_setupImpl <em>IEC twisted pair setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_twisted_pair_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_twisted_pair_setup()
	 * @generated
	 */
	int IEC_TWISTED_PAIR_SETUP = 32;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC twisted pair setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC twisted pair setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_slave_port_setupImpl <em>MBus slave port setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_slave_port_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_slave_port_setup()
	 * @generated
	 */
	int MBUS_SLAVE_PORT_SETUP = 33;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus slave port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus slave port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_clientImpl <em>MBus client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_clientImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_client()
	 * @generated
	 */
	int MBUS_CLIENT = 34;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.Wireless_Mode_Q_ChannelImpl <em>Wireless Mode QChannel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.Wireless_Mode_Q_ChannelImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getWireless_Mode_Q_Channel()
	 * @generated
	 */
	int WIRELESS_MODE_QCHANNEL = 35;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Wireless Mode QChannel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wireless Mode QChannel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_master_port_setupImpl <em>MBus master port setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_master_port_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_master_port_setup()
	 * @generated
	 */
	int MBUS_MASTER_PORT_SETUP = 36;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus master port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus master port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DLMS_COSEM_Server_M_Bus_port_setupImpl <em>DLMS COSEM Server MBus port setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.DLMS_COSEM_Server_M_Bus_port_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDLMS_COSEM_Server_M_Bus_port_setup()
	 * @generated
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP = 37;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>DLMS COSEM Server MBus port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DLMS COSEM Server MBus port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_diagnosticImpl <em>MBus diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_diagnosticImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_diagnostic()
	 * @generated
	 */
	int MBUS_DIAGNOSTIC = 38;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ScripttableImpl <em>Scripttable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ScripttableImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getScripttable()
	 * @generated
	 */
	int SCRIPTTABLE = 39;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTTABLE__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTTABLE__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTTABLE__INCLUDES = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scripttable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTTABLE_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTTABLE___EXECUTE = BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scripttable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTTABLE_OPERATION_COUNT = BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ScriptImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 40;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ScheduleImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 41;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SpecialdaystableImpl <em>Specialdaystable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.SpecialdaystableImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSpecialdaystable()
	 * @generated
	 */
	int SPECIALDAYSTABLE = 42;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALDAYSTABLE__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALDAYSTABLE__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Specialdaystable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALDAYSTABLE_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specialdaystable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALDAYSTABLE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ActivitycalendarImpl <em>Activitycalendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ActivitycalendarImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getActivitycalendar()
	 * @generated
	 */
	int ACTIVITYCALENDAR = 43;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYCALENDAR__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYCALENDAR__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Activitycalendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYCALENDAR_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activitycalendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITYCALENDAR_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegistermonitorImpl <em>Registermonitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.RegistermonitorImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegistermonitor()
	 * @generated
	 */
	int REGISTERMONITOR = 44;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERMONITOR__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERMONITOR__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Registermonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERMONITOR_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Registermonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERMONITOR_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SingleactionscheduleImpl <em>Singleactionschedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.SingleactionscheduleImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSingleactionschedule()
	 * @generated
	 */
	int SINGLEACTIONSCHEDULE = 45;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLEACTIONSCHEDULE__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLEACTIONSCHEDULE__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Singleactionschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLEACTIONSCHEDULE_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Singleactionschedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLEACTIONSCHEDULE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ParametermonitorImpl <em>Parametermonitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ParametermonitorImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getParametermonitor()
	 * @generated
	 */
	int PARAMETERMONITOR = 46;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERMONITOR__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERMONITOR__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Parametermonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERMONITOR_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parametermonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERMONITOR_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SensormanagerImpl <em>Sensormanager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.SensormanagerImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSensormanager()
	 * @generated
	 */
	int SENSORMANAGER = 47;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORMANAGER__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORMANAGER__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Sensormanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORMANAGER_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensormanager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORMANAGER_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ArbitratorImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getArbitrator()
	 * @generated
	 */
	int ARBITRATOR = 48;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DisconnectControlImpl <em>Disconnect Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.DisconnectControlImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDisconnectControl()
	 * @generated
	 */
	int DISCONNECT_CONTROL = 49;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__STATE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__TRANSITION = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disconnect Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Disconnect Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.LimiterImpl <em>Limiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.LimiterImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getLimiter()
	 * @generated
	 */
	int LIMITER = 50;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Limiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.AccountImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 51;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.CreditImpl <em>Credit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.CreditImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getCredit()
	 * @generated
	 */
	int CREDIT = 52;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Credit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ChargeImpl <em>Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ChargeImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getCharge()
	 * @generated
	 */
	int CHARGE = 53;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.TokengatewayImpl <em>Tokengateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.TokengatewayImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getTokengateway()
	 * @generated
	 */
	int TOKENGATEWAY = 54;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENGATEWAY__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENGATEWAY__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Tokengateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENGATEWAY_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tokengateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENGATEWAY_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_local_port_setupImpl <em>IEC local port setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_local_port_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_local_port_setup()
	 * @generated
	 */
	int IEC_LOCAL_PORT_SETUP = 55;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_LOCAL_PORT_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_LOCAL_PORT_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC local port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_LOCAL_PORT_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC local port setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_LOCAL_PORT_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_HDLC_setupImpl <em>IEC HDLC setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_HDLC_setupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_HDLC_setup()
	 * @generated
	 */
	int IEC_HDLC_SETUP = 56;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_HDLC_SETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_HDLC_SETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC HDLC setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_HDLC_SETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC HDLC setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_HDLC_SETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_Type_1Impl <em>IEC 8802 2LLC Type 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_Type_1Impl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_8802_2_LLC_Type_1()
	 * @generated
	 */
	int IEC_8802_2LLC_TYPE_1 = 57;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_TYPE_1__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_TYPE_1__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC 8802 2LLC Type 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_TYPE_1_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC 8802 2LLC Type 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_TYPE_1_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_G3_NBImpl <em>IEC 8802 2LLC G3 NB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_G3_NBImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_8802_2_LLC_G3_NB()
	 * @generated
	 */
	int IEC_8802_2LLC_G3_NB = 58;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_G3_NB__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_G3_NB__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC 8802 2LLC G3 NB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_G3_NB_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC 8802 2LLC G3 NB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_8802_2LLC_G3_NB_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC8802_2LLCType3Impl <em>IEC8802 2LLC Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC8802_2LLCType3Impl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC8802_2LLCType3()
	 * @generated
	 */
	int IEC8802_2LLC_TYPE3 = 59;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC8802_2LLC_TYPE3__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC8802_2LLC_TYPE3__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC8802 2LLC Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC8802_2LLC_TYPE3_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC8802 2LLC Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC8802_2LLC_TYPE3_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.DataImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getData()
	 * @generated
	 */
	int DATA = 63;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.RegisterImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 60;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__LOGICAL_NAME = DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__OBI_SCODE = DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__SCALER_UNIT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___RESET = DATA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = DATA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SAPAssignmentImpl <em>SAP Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.SAPAssignmentImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSAPAssignment()
	 * @generated
	 */
	int SAP_ASSIGNMENT = 61;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Ldnname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT__LDNNAME = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAP Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SAP Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.AssociationLNImpl <em>Association LN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.AssociationLNImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAssociationLN()
	 * @generated
	 */
	int ASSOCIATION_LN = 62;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LN__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LN__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>AA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LN__AA = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association LN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LN_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association LN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LN_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ExtendedRegisterImpl <em>Extended Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ExtendedRegisterImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getExtendedRegister()
	 * @generated
	 */
	int EXTENDED_REGISTER = 64;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER__LOGICAL_NAME = REGISTER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER__OBI_SCODE = REGISTER__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER__VALUE = REGISTER__VALUE;

	/**
	 * The feature id for the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER__SCALER_UNIT = REGISTER__SCALER_UNIT;

	/**
	 * The number of structural features of the '<em>Extended Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER___RESET = REGISTER___RESET;

	/**
	 * The number of operations of the '<em>Extended Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_REGISTER_OPERATION_COUNT = REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DemandRegisterImpl <em>Demand Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.DemandRegisterImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDemandRegister()
	 * @generated
	 */
	int DEMAND_REGISTER = 65;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__LOGICAL_NAME = EXTENDED_REGISTER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__OBI_SCODE = EXTENDED_REGISTER__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__VALUE = EXTENDED_REGISTER__VALUE;

	/**
	 * The feature id for the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__SCALER_UNIT = EXTENDED_REGISTER__SCALER_UNIT;

	/**
	 * The feature id for the '<em><b>Number of periods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__NUMBER_OF_PERIODS = EXTENDED_REGISTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__PERIOD = EXTENDED_REGISTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current average value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER__CURRENT_AVERAGE_VALUE = EXTENDED_REGISTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Demand Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER_FEATURE_COUNT = EXTENDED_REGISTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER___RESET = EXTENDED_REGISTER___RESET;

	/**
	 * The operation id for the '<em>Calculate current average value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER___CALCULATE_CURRENT_AVERAGE_VALUE = EXTENDED_REGISTER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate last average value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER___CALCULATE_LAST_AVERAGE_VALUE = EXTENDED_REGISTER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Demand Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_REGISTER_OPERATION_COUNT = EXTENDED_REGISTER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegisterActivationImpl <em>Register Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.RegisterActivationImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegisterActivation()
	 * @generated
	 */
	int REGISTER_ACTIVATION = 66;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Register Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ProfilegenericImpl <em>Profilegeneric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ProfilegenericImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getProfilegeneric()
	 * @generated
	 */
	int PROFILEGENERIC = 67;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILEGENERIC__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILEGENERIC__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Profilegeneric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILEGENERIC_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profilegeneric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILEGENERIC_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.UtilitytablesImpl <em>Utilitytables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.UtilitytablesImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getUtilitytables()
	 * @generated
	 */
	int UTILITYTABLES = 69;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITYTABLES__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITYTABLES__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Utilitytables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITYTABLES_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Utilitytables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITYTABLES_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegistertableImpl <em>Registertable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.RegistertableImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegistertable()
	 * @generated
	 */
	int REGISTERTABLE = 70;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERTABLE__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERTABLE__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Registertable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERTABLE_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Registertable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERTABLE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl <em>Compactdata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getCompactdata()
	 * @generated
	 */
	int COMPACTDATA = 71;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Compact buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA__COMPACT_BUFFER = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA__TEMPLATE_ID = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA__TEMPLATE_DESCRIPTION = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compactdata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA_FEATURE_COUNT = BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compactdata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACTDATA_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.StatusmappingImpl <em>Statusmapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.StatusmappingImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getStatusmapping()
	 * @generated
	 */
	int STATUSMAPPING = 72;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAPPING__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAPPING__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Statusmapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAPPING_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statusmapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSMAPPING_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.AssociationSNImpl <em>Association SN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.AssociationSNImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAssociationSN()
	 * @generated
	 */
	int ASSOCIATION_SN = 73;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SN__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SN__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Association SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SN_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association SN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SN_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ImagetransferImpl <em>Imagetransfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ImagetransferImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getImagetransfer()
	 * @generated
	 */
	int IMAGETRANSFER = 74;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGETRANSFER__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGETRANSFER__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Imagetransfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGETRANSFER_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Imagetransfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGETRANSFER_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DataprotectionImpl <em>Dataprotection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.DataprotectionImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDataprotection()
	 * @generated
	 */
	int DATAPROTECTION = 75;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAPROTECTION__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAPROTECTION__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Dataprotection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAPROTECTION_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dataprotection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAPROTECTION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PushsetupImpl <em>Pushsetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.PushsetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPushsetup()
	 * @generated
	 */
	int PUSHSETUP = 76;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Pushsetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pushsetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SecuritysetupImpl <em>Securitysetup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.SecuritysetupImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSecuritysetup()
	 * @generated
	 */
	int SECURITYSETUP = 77;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYSETUP__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYSETUP__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Securitysetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYSETUP_FEATURE_COUNT = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Securitysetup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYSETUP_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ClockImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 78;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__LOGICAL_NAME = BASE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OBI_SCODE = BASE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__TIME = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time zone</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__TIME_ZONE = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__STATUS = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Daylight savings begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__DAYLIGHT_SAVINGS_BEGIN = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Daylight savings end</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__DAYLIGHT_SAVINGS_END = BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Daylight savings deviation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__DAYLIGHT_SAVINGS_DEVIATION = BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Daylight savings enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__DAYLIGHT_SAVINGS_ENABLED = BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = BASE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Adjust to quarter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ADJUST_TO_QUARTER = BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Adjust to measuring period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ADJUST_TO_MEASURING_PERIOD = BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Adjust to minute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ADJUST_TO_MINUTE = BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Adjust to present time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ADJUST_TO_PRESENT_TIME = BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Present adjusting time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___PRESENT_ADJUSTING_TIME = BASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Shift time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___SHIFT_TIME = BASE_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = BASE_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ApplicationAssociationImpl <em>Application Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.InterfaceClasses.impl.ApplicationAssociationImpl
	 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getApplicationAssociation()
	 * @generated
	 */
	int APPLICATION_ASSOCIATION = 79;

	/**
	 * The number of structural features of the '<em>Application Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSOCIATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Application Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ASSOCIATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.S_FSK_PHY_MACsetup <em>SFSK PHY MA Csetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSK PHY MA Csetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSK_PHY_MACsetup
	 * @generated
	 */
	EClass getS_FSK_PHY_MACsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKActiveinitiator <em>SFSK Activeinitiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSK Activeinitiator</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKActiveinitiator
	 * @generated
	 */
	EClass getS_FSKActiveinitiator();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKMACsynctimeouts <em>SFSKMA Csynctimeouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSKMA Csynctimeouts</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKMACsynctimeouts
	 * @generated
	 */
	EClass getS_FSKMACsynctimeouts();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKMACcounters <em>SFSKMA Ccounters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSKMA Ccounters</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKMACcounters
	 * @generated
	 */
	EClass getS_FSKMACcounters();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC61334_4_32LLCsetup <em>IEC61334 432LL Csetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC61334 432LL Csetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC61334_4_32LLCsetup
	 * @generated
	 */
	EClass getIEC61334_4_32LLCsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKReportingsystemlist <em>SFSK Reportingsystemlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSK Reportingsystemlist</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKReportingsystemlist
	 * @generated
	 */
	EClass getS_FSKReportingsystemlist();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.t61334_32_LLC_SSCS_setup <em>t61334 32 LLC SSCS setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>t61334 32 LLC SSCS setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.t61334_32_LLC_SSCS_setup
	 * @generated
	 */
	EClass gett61334_32_LLC_SSCS_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Phy_layer_counters <em>PRIME NB OFDM PLC Phy layer counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC Phy layer counters</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Phy_layer_counters
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_Phy_layer_counters();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACsetup <em>PRIME NB OFDM PLC MA Csetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MA Csetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACsetup
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MACsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_counters <em>PRIME NB OFDM PLC MAC counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC counters</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_counters
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_counters();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_functionalparams <em>PRIME NB OFDM PLC MAC functionalparams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC functionalparams</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_functionalparams
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_functionalparams();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACnetworkadmindata <em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACnetworkadmindata
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MACnetworkadmindata();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Application_identification <em>PRIME NB OFDM PLC Application identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC Application identification</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Application_identification
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_Application_identification();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_layer_counters <em>G3 PLC MAC layer counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 PLC MAC layer counters</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_layer_counters
	 * @generated
	 */
	EClass getG3_PLC_MAC_layer_counters();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_setup <em>G3 PLC MAC setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 PLC MAC setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_setup
	 * @generated
	 */
	EClass getG3_PLC_MAC_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.G3_PLC_6LoWPAN <em>G3 PLC 6Lo WPAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 PLC 6Lo WPAN</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.G3_PLC_6LoWPAN
	 * @generated
	 */
	EClass getG3_PLC_6LoWPAN();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_startup <em>Zig Bee SAS startup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee SAS startup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_startup
	 * @generated
	 */
	EClass getZigBee_SAS_startup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_join <em>Zig Bee SAS join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee SAS join</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_join
	 * @generated
	 */
	EClass getZigBee_SAS_join();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_APS_fragmentation <em>Zig Bee SAS APS fragmentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee SAS APS fragmentation</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_APS_fragmentation
	 * @generated
	 */
	EClass getZigBee_SAS_APS_fragmentation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ZigBeenetworkcontrol <em>Zig Beenetworkcontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Beenetworkcontrol</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBeenetworkcontrol
	 * @generated
	 */
	EClass getZigBeenetworkcontrol();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ZigBeetunnelsetup <em>Zig Beetunnelsetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Beetunnelsetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBeetunnelsetup
	 * @generated
	 */
	EClass getZigBeetunnelsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.TCP_UDPsetup <em>TCP UD Psetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP UD Psetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.TCP_UDPsetup
	 * @generated
	 */
	EClass getTCP_UDPsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IPv4setup <em>IPv4setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPv4setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IPv4setup
	 * @generated
	 */
	EClass getIPv4setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IPv6setup <em>IPv6setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPv6setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IPv6setup
	 * @generated
	 */
	EClass getIPv6setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.MACaddresssetup <em>MA Caddresssetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MA Caddresssetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.MACaddresssetup
	 * @generated
	 */
	EClass getMACaddresssetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.PPPsetup <em>PP Psetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PP Psetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.PPPsetup
	 * @generated
	 */
	EClass getPPPsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.SMTPsetup <em>SMT Psetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMT Psetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.SMTPsetup
	 * @generated
	 */
	EClass getSMTPsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Modemconfiguration <em>Modemconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modemconfiguration</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Modemconfiguration
	 * @generated
	 */
	EClass getModemconfiguration();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Auto_answer <em>Auto answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto answer</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Auto_answer
	 * @generated
	 */
	EClass getAuto_answer();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Auto_connect <em>Auto connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto connect</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Auto_connect
	 * @generated
	 */
	EClass getAuto_connect();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.GPRS_modem_setup <em>GPRS modem setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPRS modem setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.GPRS_modem_setup
	 * @generated
	 */
	EClass getGPRS_modem_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.GSM_Diagnostic <em>GSM Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSM Diagnostic</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.GSM_Diagnostic
	 * @generated
	 */
	EClass getGSM_Diagnostic();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC_twisted_pair_setup <em>IEC twisted pair setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC twisted pair setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_twisted_pair_setup
	 * @generated
	 */
	EClass getIEC_twisted_pair_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_slave_port_setup <em>MBus slave port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus slave port setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_slave_port_setup
	 * @generated
	 */
	EClass getM_Bus_slave_port_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_client <em>MBus client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus client</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_client
	 * @generated
	 */
	EClass getM_Bus_client();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Wireless_Mode_Q_Channel <em>Wireless Mode QChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wireless Mode QChannel</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Wireless_Mode_Q_Channel
	 * @generated
	 */
	EClass getWireless_Mode_Q_Channel();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_master_port_setup <em>MBus master port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus master port setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_master_port_setup
	 * @generated
	 */
	EClass getM_Bus_master_port_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.DLMS_COSEM_Server_M_Bus_port_setup <em>DLMS COSEM Server MBus port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DLMS COSEM Server MBus port setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DLMS_COSEM_Server_M_Bus_port_setup
	 * @generated
	 */
	EClass getDLMS_COSEM_Server_M_Bus_port_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_diagnostic <em>MBus diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus diagnostic</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_diagnostic
	 * @generated
	 */
	EClass getM_Bus_diagnostic();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Scripttable <em>Scripttable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripttable</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Scripttable
	 * @generated
	 */
	EClass getScripttable();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.COSEM.InterfaceClasses.Scripttable#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Scripttable#getIncludes()
	 * @see #getScripttable()
	 * @generated
	 */
	EReference getScripttable_Includes();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Scripttable#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Scripttable#execute()
	 * @generated
	 */
	EOperation getScripttable__Execute();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Specialdaystable <em>Specialdaystable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialdaystable</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Specialdaystable
	 * @generated
	 */
	EClass getSpecialdaystable();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Activitycalendar <em>Activitycalendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activitycalendar</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Activitycalendar
	 * @generated
	 */
	EClass getActivitycalendar();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Registermonitor <em>Registermonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registermonitor</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Registermonitor
	 * @generated
	 */
	EClass getRegistermonitor();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Singleactionschedule <em>Singleactionschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleactionschedule</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Singleactionschedule
	 * @generated
	 */
	EClass getSingleactionschedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Parametermonitor <em>Parametermonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametermonitor</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Parametermonitor
	 * @generated
	 */
	EClass getParametermonitor();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Sensormanager <em>Sensormanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensormanager</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Sensormanager
	 * @generated
	 */
	EClass getSensormanager();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrator</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Arbitrator
	 * @generated
	 */
	EClass getArbitrator();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl <em>Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Control</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DisconnectControl
	 * @generated
	 */
	EClass getDisconnectControl();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DisconnectControl#getState()
	 * @see #getDisconnectControl()
	 * @generated
	 */
	EAttribute getDisconnectControl_State();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DisconnectControl#getTransition()
	 * @see #getDisconnectControl()
	 * @generated
	 */
	EAttribute getDisconnectControl_Transition();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Limiter <em>Limiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limiter</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Limiter
	 * @generated
	 */
	EClass getLimiter();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Credit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Credit
	 * @generated
	 */
	EClass getCredit();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Charge
	 * @generated
	 */
	EClass getCharge();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Tokengateway <em>Tokengateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tokengateway</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Tokengateway
	 * @generated
	 */
	EClass getTokengateway();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC_local_port_setup <em>IEC local port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC local port setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_local_port_setup
	 * @generated
	 */
	EClass getIEC_local_port_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC_HDLC_setup <em>IEC HDLC setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC HDLC setup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_HDLC_setup
	 * @generated
	 */
	EClass getIEC_HDLC_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_Type_1 <em>IEC 8802 2LLC Type 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC 8802 2LLC Type 1</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_Type_1
	 * @generated
	 */
	EClass getIEC_8802_2_LLC_Type_1();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_G3_NB <em>IEC 8802 2LLC G3 NB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC 8802 2LLC G3 NB</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_G3_NB
	 * @generated
	 */
	EClass getIEC_8802_2_LLC_G3_NB();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.IEC8802_2LLCType3 <em>IEC8802 2LLC Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC8802 2LLC Type3</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC8802_2LLCType3
	 * @generated
	 */
	EClass getIEC8802_2LLCType3();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Register#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Register#getValue()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Value();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.InterfaceClasses.Register#getScaler_unit <em>Scaler unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scaler unit</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Register#getScaler_unit()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_Scaler_unit();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Register#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Register#reset()
	 * @generated
	 */
	EOperation getRegister__Reset();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.SAPAssignment <em>SAP Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAP Assignment</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.SAPAssignment
	 * @generated
	 */
	EClass getSAPAssignment();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.InterfaceClasses.SAPAssignment#getLdnname <em>Ldnname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ldnname</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.SAPAssignment#getLdnname()
	 * @see #getSAPAssignment()
	 * @generated
	 */
	EReference getSAPAssignment_Ldnname();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.AssociationLN <em>Association LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association LN</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.AssociationLN
	 * @generated
	 */
	EClass getAssociationLN();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.InterfaceClasses.AssociationLN#getAA <em>AA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AA</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.AssociationLN#getAA()
	 * @see #getAssociationLN()
	 * @generated
	 */
	EReference getAssociationLN_AA();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ExtendedRegister <em>Extended Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Register</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ExtendedRegister
	 * @generated
	 */
	EClass getExtendedRegister();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister <em>Demand Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand Register</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister
	 * @generated
	 */
	EClass getDemandRegister();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister#getNumber_of_periods <em>Number of periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number of periods</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister#getNumber_of_periods()
	 * @see #getDemandRegister()
	 * @generated
	 */
	EAttribute getDemandRegister_Number_of_periods();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister#getPeriod()
	 * @see #getDemandRegister()
	 * @generated
	 */
	EAttribute getDemandRegister_Period();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister#getCurrent_average_value <em>Current average value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current average value</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister#getCurrent_average_value()
	 * @see #getDemandRegister()
	 * @generated
	 */
	EAttribute getDemandRegister_Current_average_value();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister#calculate_current_average_value() <em>Calculate current average value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate current average value</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister#calculate_current_average_value()
	 * @generated
	 */
	EOperation getDemandRegister__Calculate_current_average_value();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister#calculate_last_average_value() <em>Calculate last average value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate last average value</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister#calculate_last_average_value()
	 * @generated
	 */
	EOperation getDemandRegister__Calculate_last_average_value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.RegisterActivation <em>Register Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Activation</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.RegisterActivation
	 * @generated
	 */
	EClass getRegisterActivation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Profilegeneric <em>Profilegeneric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profilegeneric</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Profilegeneric
	 * @generated
	 */
	EClass getProfilegeneric();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Base#getLogical_name <em>Logical name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical name</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Base#getLogical_name()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_Logical_name();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Base#getOBIScode <em>OBI Scode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OBI Scode</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Base#getOBIScode()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_OBIScode();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Utilitytables <em>Utilitytables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilitytables</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Utilitytables
	 * @generated
	 */
	EClass getUtilitytables();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Registertable <em>Registertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registertable</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Registertable
	 * @generated
	 */
	EClass getRegistertable();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Compactdata <em>Compactdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compactdata</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Compactdata
	 * @generated
	 */
	EClass getCompactdata();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Compactdata#getCompact_buffer <em>Compact buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compact buffer</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Compactdata#getCompact_buffer()
	 * @see #getCompactdata()
	 * @generated
	 */
	EAttribute getCompactdata_Compact_buffer();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Compactdata#getTemplate_id <em>Template id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template id</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Compactdata#getTemplate_id()
	 * @see #getCompactdata()
	 * @generated
	 */
	EAttribute getCompactdata_Template_id();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Compactdata#getTemplate_description <em>Template description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template description</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Compactdata#getTemplate_description()
	 * @see #getCompactdata()
	 * @generated
	 */
	EAttribute getCompactdata_Template_description();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Statusmapping <em>Statusmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statusmapping</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Statusmapping
	 * @generated
	 */
	EClass getStatusmapping();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.AssociationSN <em>Association SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association SN</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.AssociationSN
	 * @generated
	 */
	EClass getAssociationSN();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Imagetransfer <em>Imagetransfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imagetransfer</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Imagetransfer
	 * @generated
	 */
	EClass getImagetransfer();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Dataprotection <em>Dataprotection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataprotection</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Dataprotection
	 * @generated
	 */
	EClass getDataprotection();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Pushsetup <em>Pushsetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pushsetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Pushsetup
	 * @generated
	 */
	EClass getPushsetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Securitysetup <em>Securitysetup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Securitysetup</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Securitysetup
	 * @generated
	 */
	EClass getSecuritysetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Clock#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#getTime()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Time();

	/**
	 * Returns the meta object for the attribute list '{@link gluemodel.COSEM.InterfaceClasses.Clock#getTime_zone <em>Time zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time zone</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#getTime_zone()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Time_zone();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Clock#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#getStatus()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Clock#getDaylight_savings_begin <em>Daylight savings begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daylight savings begin</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#getDaylight_savings_begin()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Daylight_savings_begin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Clock#getDaylight_savings_end <em>Daylight savings end</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daylight savings end</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#getDaylight_savings_end()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Daylight_savings_end();

	/**
	 * Returns the meta object for the attribute list '{@link gluemodel.COSEM.InterfaceClasses.Clock#getDaylight_savings_deviation <em>Daylight savings deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Daylight savings deviation</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#getDaylight_savings_deviation()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Daylight_savings_deviation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.InterfaceClasses.Clock#isDaylight_savings_enabled <em>Daylight savings enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daylight savings enabled</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#isDaylight_savings_enabled()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Daylight_savings_enabled();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_quarter() <em>Adjust to quarter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adjust to quarter</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_quarter()
	 * @generated
	 */
	EOperation getClock__Adjust_to_quarter();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_measuring_period() <em>Adjust to measuring period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adjust to measuring period</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_measuring_period()
	 * @generated
	 */
	EOperation getClock__Adjust_to_measuring_period();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_minute() <em>Adjust to minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adjust to minute</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_minute()
	 * @generated
	 */
	EOperation getClock__Adjust_to_minute();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_present_time() <em>Adjust to present time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adjust to present time</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#adjust_to_present_time()
	 * @generated
	 */
	EOperation getClock__Adjust_to_present_time();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Clock#present_adjusting_time() <em>Present adjusting time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Present adjusting time</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#present_adjusting_time()
	 * @generated
	 */
	EOperation getClock__Present_adjusting_time();

	/**
	 * Returns the meta object for the '{@link gluemodel.COSEM.InterfaceClasses.Clock#shift_time() <em>Shift time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shift time</em>' operation.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock#shift_time()
	 * @generated
	 */
	EOperation getClock__Shift_time();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.InterfaceClasses.ApplicationAssociation <em>Application Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Association</em>'.
	 * @see gluemodel.COSEM.InterfaceClasses.ApplicationAssociation
	 * @generated
	 */
	EClass getApplicationAssociation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceClassesFactory getInterfaceClassesFactory();

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
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSK_PHY_MACsetupImpl <em>SFSK PHY MA Csetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSK_PHY_MACsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSK_PHY_MACsetup()
		 * @generated
		 */
		EClass SFSK_PHY_MA_CSETUP = eINSTANCE.getS_FSK_PHY_MACsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKActiveinitiatorImpl <em>SFSK Activeinitiator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKActiveinitiatorImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKActiveinitiator()
		 * @generated
		 */
		EClass SFSK_ACTIVEINITIATOR = eINSTANCE.getS_FSKActiveinitiator();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACsynctimeoutsImpl <em>SFSKMA Csynctimeouts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACsynctimeoutsImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKMACsynctimeouts()
		 * @generated
		 */
		EClass SFSKMA_CSYNCTIMEOUTS = eINSTANCE.getS_FSKMACsynctimeouts();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACcountersImpl <em>SFSKMA Ccounters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKMACcountersImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKMACcounters()
		 * @generated
		 */
		EClass SFSKMA_CCOUNTERS = eINSTANCE.getS_FSKMACcounters();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC61334_4_32LLCsetupImpl <em>IEC61334 432LL Csetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC61334_4_32LLCsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC61334_4_32LLCsetup()
		 * @generated
		 */
		EClass IEC61334_432LL_CSETUP = eINSTANCE.getIEC61334_4_32LLCsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.S_FSKReportingsystemlistImpl <em>SFSK Reportingsystemlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.S_FSKReportingsystemlistImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getS_FSKReportingsystemlist()
		 * @generated
		 */
		EClass SFSK_REPORTINGSYSTEMLIST = eINSTANCE.getS_FSKReportingsystemlist();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.t61334_32_LLC_SSCS_setupImpl <em>t61334 32 LLC SSCS setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.t61334_32_LLC_SSCS_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#gett61334_32_LLC_SSCS_setup()
		 * @generated
		 */
		EClass T61334_32_LLC_SSCS_SETUP = eINSTANCE.gett61334_32_LLC_SSCS_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Phy_layer_countersImpl <em>PRIME NB OFDM PLC Phy layer counters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Phy_layer_countersImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_Phy_layer_counters()
		 * @generated
		 */
		EClass PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS = eINSTANCE.getPRIME_NB_OFDM_PLC_Phy_layer_counters();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACsetupImpl <em>PRIME NB OFDM PLC MA Csetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MACsetup()
		 * @generated
		 */
		EClass PRIME_NB_OFDM_PLC_MA_CSETUP = eINSTANCE.getPRIME_NB_OFDM_PLC_MACsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_countersImpl <em>PRIME NB OFDM PLC MAC counters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_countersImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MAC_counters()
		 * @generated
		 */
		EClass PRIME_NB_OFDM_PLC_MAC_COUNTERS = eINSTANCE.getPRIME_NB_OFDM_PLC_MAC_counters();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_functionalparamsImpl <em>PRIME NB OFDM PLC MAC functionalparams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MAC_functionalparamsImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MAC_functionalparams()
		 * @generated
		 */
		EClass PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS = eINSTANCE.getPRIME_NB_OFDM_PLC_MAC_functionalparams();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACnetworkadmindataImpl <em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_MACnetworkadmindataImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_MACnetworkadmindata()
		 * @generated
		 */
		EClass PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA = eINSTANCE.getPRIME_NB_OFDM_PLC_MACnetworkadmindata();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Application_identificationImpl <em>PRIME NB OFDM PLC Application identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PRIME_NB_OFDM_PLC_Application_identificationImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPRIME_NB_OFDM_PLC_Application_identification()
		 * @generated
		 */
		EClass PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION = eINSTANCE.getPRIME_NB_OFDM_PLC_Application_identification();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_layer_countersImpl <em>G3 PLC MAC layer counters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_layer_countersImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getG3_PLC_MAC_layer_counters()
		 * @generated
		 */
		EClass G3_PLC_MAC_LAYER_COUNTERS = eINSTANCE.getG3_PLC_MAC_layer_counters();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_setupImpl <em>G3 PLC MAC setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_MAC_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getG3_PLC_MAC_setup()
		 * @generated
		 */
		EClass G3_PLC_MAC_SETUP = eINSTANCE.getG3_PLC_MAC_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_6LoWPANImpl <em>G3 PLC 6Lo WPAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.G3_PLC_6LoWPANImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getG3_PLC_6LoWPAN()
		 * @generated
		 */
		EClass G3_PLC_6LO_WPAN = eINSTANCE.getG3_PLC_6LoWPAN();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_startupImpl <em>Zig Bee SAS startup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_startupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBee_SAS_startup()
		 * @generated
		 */
		EClass ZIG_BEE_SAS_STARTUP = eINSTANCE.getZigBee_SAS_startup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_joinImpl <em>Zig Bee SAS join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_joinImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBee_SAS_join()
		 * @generated
		 */
		EClass ZIG_BEE_SAS_JOIN = eINSTANCE.getZigBee_SAS_join();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_APS_fragmentationImpl <em>Zig Bee SAS APS fragmentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBee_SAS_APS_fragmentationImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBee_SAS_APS_fragmentation()
		 * @generated
		 */
		EClass ZIG_BEE_SAS_APS_FRAGMENTATION = eINSTANCE.getZigBee_SAS_APS_fragmentation();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBeenetworkcontrolImpl <em>Zig Beenetworkcontrol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBeenetworkcontrolImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBeenetworkcontrol()
		 * @generated
		 */
		EClass ZIG_BEENETWORKCONTROL = eINSTANCE.getZigBeenetworkcontrol();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ZigBeetunnelsetupImpl <em>Zig Beetunnelsetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ZigBeetunnelsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getZigBeetunnelsetup()
		 * @generated
		 */
		EClass ZIG_BEETUNNELSETUP = eINSTANCE.getZigBeetunnelsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.TCP_UDPsetupImpl <em>TCP UD Psetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.TCP_UDPsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getTCP_UDPsetup()
		 * @generated
		 */
		EClass TCP_UD_PSETUP = eINSTANCE.getTCP_UDPsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IPv4setupImpl <em>IPv4setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IPv4setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIPv4setup()
		 * @generated
		 */
		EClass IPV4SETUP = eINSTANCE.getIPv4setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IPv6setupImpl <em>IPv6setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IPv6setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIPv6setup()
		 * @generated
		 */
		EClass IPV6SETUP = eINSTANCE.getIPv6setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.MACaddresssetupImpl <em>MA Caddresssetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.MACaddresssetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getMACaddresssetup()
		 * @generated
		 */
		EClass MA_CADDRESSSETUP = eINSTANCE.getMACaddresssetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PPPsetupImpl <em>PP Psetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PPPsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPPPsetup()
		 * @generated
		 */
		EClass PP_PSETUP = eINSTANCE.getPPPsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SMTPsetupImpl <em>SMT Psetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.SMTPsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSMTPsetup()
		 * @generated
		 */
		EClass SMT_PSETUP = eINSTANCE.getSMTPsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ModemconfigurationImpl <em>Modemconfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ModemconfigurationImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getModemconfiguration()
		 * @generated
		 */
		EClass MODEMCONFIGURATION = eINSTANCE.getModemconfiguration();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.Auto_answerImpl <em>Auto answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.Auto_answerImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAuto_answer()
		 * @generated
		 */
		EClass AUTO_ANSWER = eINSTANCE.getAuto_answer();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.Auto_connectImpl <em>Auto connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.Auto_connectImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAuto_connect()
		 * @generated
		 */
		EClass AUTO_CONNECT = eINSTANCE.getAuto_connect();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.GPRS_modem_setupImpl <em>GPRS modem setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.GPRS_modem_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getGPRS_modem_setup()
		 * @generated
		 */
		EClass GPRS_MODEM_SETUP = eINSTANCE.getGPRS_modem_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.GSM_DiagnosticImpl <em>GSM Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.GSM_DiagnosticImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getGSM_Diagnostic()
		 * @generated
		 */
		EClass GSM_DIAGNOSTIC = eINSTANCE.getGSM_Diagnostic();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_twisted_pair_setupImpl <em>IEC twisted pair setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_twisted_pair_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_twisted_pair_setup()
		 * @generated
		 */
		EClass IEC_TWISTED_PAIR_SETUP = eINSTANCE.getIEC_twisted_pair_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_slave_port_setupImpl <em>MBus slave port setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_slave_port_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_slave_port_setup()
		 * @generated
		 */
		EClass MBUS_SLAVE_PORT_SETUP = eINSTANCE.getM_Bus_slave_port_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_clientImpl <em>MBus client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_clientImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_client()
		 * @generated
		 */
		EClass MBUS_CLIENT = eINSTANCE.getM_Bus_client();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.Wireless_Mode_Q_ChannelImpl <em>Wireless Mode QChannel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.Wireless_Mode_Q_ChannelImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getWireless_Mode_Q_Channel()
		 * @generated
		 */
		EClass WIRELESS_MODE_QCHANNEL = eINSTANCE.getWireless_Mode_Q_Channel();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_master_port_setupImpl <em>MBus master port setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_master_port_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_master_port_setup()
		 * @generated
		 */
		EClass MBUS_MASTER_PORT_SETUP = eINSTANCE.getM_Bus_master_port_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DLMS_COSEM_Server_M_Bus_port_setupImpl <em>DLMS COSEM Server MBus port setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.DLMS_COSEM_Server_M_Bus_port_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDLMS_COSEM_Server_M_Bus_port_setup()
		 * @generated
		 */
		EClass DLMS_COSEM_SERVER_MBUS_PORT_SETUP = eINSTANCE.getDLMS_COSEM_Server_M_Bus_port_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.M_Bus_diagnosticImpl <em>MBus diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.M_Bus_diagnosticImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getM_Bus_diagnostic()
		 * @generated
		 */
		EClass MBUS_DIAGNOSTIC = eINSTANCE.getM_Bus_diagnostic();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ScripttableImpl <em>Scripttable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ScripttableImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getScripttable()
		 * @generated
		 */
		EClass SCRIPTTABLE = eINSTANCE.getScripttable();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTTABLE__INCLUDES = eINSTANCE.getScripttable_Includes();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCRIPTTABLE___EXECUTE = eINSTANCE.getScripttable__Execute();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ScriptImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ScheduleImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SpecialdaystableImpl <em>Specialdaystable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.SpecialdaystableImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSpecialdaystable()
		 * @generated
		 */
		EClass SPECIALDAYSTABLE = eINSTANCE.getSpecialdaystable();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ActivitycalendarImpl <em>Activitycalendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ActivitycalendarImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getActivitycalendar()
		 * @generated
		 */
		EClass ACTIVITYCALENDAR = eINSTANCE.getActivitycalendar();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegistermonitorImpl <em>Registermonitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.RegistermonitorImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegistermonitor()
		 * @generated
		 */
		EClass REGISTERMONITOR = eINSTANCE.getRegistermonitor();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SingleactionscheduleImpl <em>Singleactionschedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.SingleactionscheduleImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSingleactionschedule()
		 * @generated
		 */
		EClass SINGLEACTIONSCHEDULE = eINSTANCE.getSingleactionschedule();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ParametermonitorImpl <em>Parametermonitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ParametermonitorImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getParametermonitor()
		 * @generated
		 */
		EClass PARAMETERMONITOR = eINSTANCE.getParametermonitor();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SensormanagerImpl <em>Sensormanager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.SensormanagerImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSensormanager()
		 * @generated
		 */
		EClass SENSORMANAGER = eINSTANCE.getSensormanager();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ArbitratorImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getArbitrator()
		 * @generated
		 */
		EClass ARBITRATOR = eINSTANCE.getArbitrator();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DisconnectControlImpl <em>Disconnect Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.DisconnectControlImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDisconnectControl()
		 * @generated
		 */
		EClass DISCONNECT_CONTROL = eINSTANCE.getDisconnectControl();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECT_CONTROL__STATE = eINSTANCE.getDisconnectControl_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECT_CONTROL__TRANSITION = eINSTANCE.getDisconnectControl_Transition();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.LimiterImpl <em>Limiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.LimiterImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getLimiter()
		 * @generated
		 */
		EClass LIMITER = eINSTANCE.getLimiter();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.AccountImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.CreditImpl <em>Credit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.CreditImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getCredit()
		 * @generated
		 */
		EClass CREDIT = eINSTANCE.getCredit();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ChargeImpl <em>Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ChargeImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getCharge()
		 * @generated
		 */
		EClass CHARGE = eINSTANCE.getCharge();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.TokengatewayImpl <em>Tokengateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.TokengatewayImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getTokengateway()
		 * @generated
		 */
		EClass TOKENGATEWAY = eINSTANCE.getTokengateway();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_local_port_setupImpl <em>IEC local port setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_local_port_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_local_port_setup()
		 * @generated
		 */
		EClass IEC_LOCAL_PORT_SETUP = eINSTANCE.getIEC_local_port_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_HDLC_setupImpl <em>IEC HDLC setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_HDLC_setupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_HDLC_setup()
		 * @generated
		 */
		EClass IEC_HDLC_SETUP = eINSTANCE.getIEC_HDLC_setup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_Type_1Impl <em>IEC 8802 2LLC Type 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_Type_1Impl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_8802_2_LLC_Type_1()
		 * @generated
		 */
		EClass IEC_8802_2LLC_TYPE_1 = eINSTANCE.getIEC_8802_2_LLC_Type_1();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_G3_NBImpl <em>IEC 8802 2LLC G3 NB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC_8802_2_LLC_G3_NBImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC_8802_2_LLC_G3_NB()
		 * @generated
		 */
		EClass IEC_8802_2LLC_G3_NB = eINSTANCE.getIEC_8802_2_LLC_G3_NB();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.IEC8802_2LLCType3Impl <em>IEC8802 2LLC Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.IEC8802_2LLCType3Impl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getIEC8802_2LLCType3()
		 * @generated
		 */
		EClass IEC8802_2LLC_TYPE3 = eINSTANCE.getIEC8802_2LLCType3();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.RegisterImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__VALUE = eINSTANCE.getRegister_Value();

		/**
		 * The meta object literal for the '<em><b>Scaler unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__SCALER_UNIT = eINSTANCE.getRegister_Scaler_unit();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTER___RESET = eINSTANCE.getRegister__Reset();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SAPAssignmentImpl <em>SAP Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.SAPAssignmentImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSAPAssignment()
		 * @generated
		 */
		EClass SAP_ASSIGNMENT = eINSTANCE.getSAPAssignment();

		/**
		 * The meta object literal for the '<em><b>Ldnname</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAP_ASSIGNMENT__LDNNAME = eINSTANCE.getSAPAssignment_Ldnname();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.AssociationLNImpl <em>Association LN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.AssociationLNImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAssociationLN()
		 * @generated
		 */
		EClass ASSOCIATION_LN = eINSTANCE.getAssociationLN();

		/**
		 * The meta object literal for the '<em><b>AA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_LN__AA = eINSTANCE.getAssociationLN_AA();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.DataImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ExtendedRegisterImpl <em>Extended Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ExtendedRegisterImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getExtendedRegister()
		 * @generated
		 */
		EClass EXTENDED_REGISTER = eINSTANCE.getExtendedRegister();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DemandRegisterImpl <em>Demand Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.DemandRegisterImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDemandRegister()
		 * @generated
		 */
		EClass DEMAND_REGISTER = eINSTANCE.getDemandRegister();

		/**
		 * The meta object literal for the '<em><b>Number of periods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMAND_REGISTER__NUMBER_OF_PERIODS = eINSTANCE.getDemandRegister_Number_of_periods();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMAND_REGISTER__PERIOD = eINSTANCE.getDemandRegister_Period();

		/**
		 * The meta object literal for the '<em><b>Current average value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMAND_REGISTER__CURRENT_AVERAGE_VALUE = eINSTANCE.getDemandRegister_Current_average_value();

		/**
		 * The meta object literal for the '<em><b>Calculate current average value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEMAND_REGISTER___CALCULATE_CURRENT_AVERAGE_VALUE = eINSTANCE.getDemandRegister__Calculate_current_average_value();

		/**
		 * The meta object literal for the '<em><b>Calculate last average value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEMAND_REGISTER___CALCULATE_LAST_AVERAGE_VALUE = eINSTANCE.getDemandRegister__Calculate_last_average_value();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegisterActivationImpl <em>Register Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.RegisterActivationImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegisterActivation()
		 * @generated
		 */
		EClass REGISTER_ACTIVATION = eINSTANCE.getRegisterActivation();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ProfilegenericImpl <em>Profilegeneric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ProfilegenericImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getProfilegeneric()
		 * @generated
		 */
		EClass PROFILEGENERIC = eINSTANCE.getProfilegeneric();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.BaseImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Logical name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__LOGICAL_NAME = eINSTANCE.getBase_Logical_name();

		/**
		 * The meta object literal for the '<em><b>OBI Scode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__OBI_SCODE = eINSTANCE.getBase_OBIScode();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.UtilitytablesImpl <em>Utilitytables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.UtilitytablesImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getUtilitytables()
		 * @generated
		 */
		EClass UTILITYTABLES = eINSTANCE.getUtilitytables();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.RegistertableImpl <em>Registertable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.RegistertableImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getRegistertable()
		 * @generated
		 */
		EClass REGISTERTABLE = eINSTANCE.getRegistertable();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl <em>Compactdata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.CompactdataImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getCompactdata()
		 * @generated
		 */
		EClass COMPACTDATA = eINSTANCE.getCompactdata();

		/**
		 * The meta object literal for the '<em><b>Compact buffer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACTDATA__COMPACT_BUFFER = eINSTANCE.getCompactdata_Compact_buffer();

		/**
		 * The meta object literal for the '<em><b>Template id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACTDATA__TEMPLATE_ID = eINSTANCE.getCompactdata_Template_id();

		/**
		 * The meta object literal for the '<em><b>Template description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACTDATA__TEMPLATE_DESCRIPTION = eINSTANCE.getCompactdata_Template_description();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.StatusmappingImpl <em>Statusmapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.StatusmappingImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getStatusmapping()
		 * @generated
		 */
		EClass STATUSMAPPING = eINSTANCE.getStatusmapping();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.AssociationSNImpl <em>Association SN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.AssociationSNImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getAssociationSN()
		 * @generated
		 */
		EClass ASSOCIATION_SN = eINSTANCE.getAssociationSN();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ImagetransferImpl <em>Imagetransfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ImagetransferImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getImagetransfer()
		 * @generated
		 */
		EClass IMAGETRANSFER = eINSTANCE.getImagetransfer();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.DataprotectionImpl <em>Dataprotection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.DataprotectionImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getDataprotection()
		 * @generated
		 */
		EClass DATAPROTECTION = eINSTANCE.getDataprotection();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.PushsetupImpl <em>Pushsetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.PushsetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getPushsetup()
		 * @generated
		 */
		EClass PUSHSETUP = eINSTANCE.getPushsetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.SecuritysetupImpl <em>Securitysetup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.SecuritysetupImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getSecuritysetup()
		 * @generated
		 */
		EClass SECURITYSETUP = eINSTANCE.getSecuritysetup();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ClockImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__TIME = eINSTANCE.getClock_Time();

		/**
		 * The meta object literal for the '<em><b>Time zone</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__TIME_ZONE = eINSTANCE.getClock_Time_zone();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__STATUS = eINSTANCE.getClock_Status();

		/**
		 * The meta object literal for the '<em><b>Daylight savings begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__DAYLIGHT_SAVINGS_BEGIN = eINSTANCE.getClock_Daylight_savings_begin();

		/**
		 * The meta object literal for the '<em><b>Daylight savings end</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__DAYLIGHT_SAVINGS_END = eINSTANCE.getClock_Daylight_savings_end();

		/**
		 * The meta object literal for the '<em><b>Daylight savings deviation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__DAYLIGHT_SAVINGS_DEVIATION = eINSTANCE.getClock_Daylight_savings_deviation();

		/**
		 * The meta object literal for the '<em><b>Daylight savings enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__DAYLIGHT_SAVINGS_ENABLED = eINSTANCE.getClock_Daylight_savings_enabled();

		/**
		 * The meta object literal for the '<em><b>Adjust to quarter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___ADJUST_TO_QUARTER = eINSTANCE.getClock__Adjust_to_quarter();

		/**
		 * The meta object literal for the '<em><b>Adjust to measuring period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___ADJUST_TO_MEASURING_PERIOD = eINSTANCE.getClock__Adjust_to_measuring_period();

		/**
		 * The meta object literal for the '<em><b>Adjust to minute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___ADJUST_TO_MINUTE = eINSTANCE.getClock__Adjust_to_minute();

		/**
		 * The meta object literal for the '<em><b>Adjust to present time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___ADJUST_TO_PRESENT_TIME = eINSTANCE.getClock__Adjust_to_present_time();

		/**
		 * The meta object literal for the '<em><b>Present adjusting time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___PRESENT_ADJUSTING_TIME = eINSTANCE.getClock__Present_adjusting_time();

		/**
		 * The meta object literal for the '<em><b>Shift time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___SHIFT_TIME = eINSTANCE.getClock__Shift_time();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.InterfaceClasses.impl.ApplicationAssociationImpl <em>Application Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.InterfaceClasses.impl.ApplicationAssociationImpl
		 * @see gluemodel.COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl#getApplicationAssociation()
		 * @generated
		 */
		EClass APPLICATION_ASSOCIATION = eINSTANCE.getApplicationAssociation();

	}

} //InterfaceClassesPackage
