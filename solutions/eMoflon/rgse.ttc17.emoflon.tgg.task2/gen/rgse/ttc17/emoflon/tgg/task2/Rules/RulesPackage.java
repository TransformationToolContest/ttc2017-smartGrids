/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/rgse.ttc17.emoflon.tgg.task2/model/Task2.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.TieFlowImpl <em>Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.TieFlowImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getTieFlow()
	 * @generated
	 */
	int TIE_FLOW = 0;

	/**
	 * The number of structural features of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_TERMINAL_TIEFLOW_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_TERMINAL_TIEFLOW_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_TERMINAL_TIEFLOW_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETMMXUPAIR_TERMINALTOTERMINAL_CONDUCTINGEQUIPMENT_METERASSET_TERMINAL_TIEFLOW_LOCATION_TERMINAL = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW___CHECK_DEC_FWD__METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_TERMINAL_TIEFLOW_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.PositionPointImpl <em>Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.PositionPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getPositionPoint()
	 * @generated
	 */
	int POSITION_POINT = 1;

	/**
	 * The number of structural features of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_METERASSET_LOCATION_POSITIONPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_METERASSET_LOCATION_POSITIONPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_METERASSET_LOCATION_POSITIONPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LOCATIONTOLOCATION_METERASSETMMXUPAIR_METERASSET_LOCATION_POSITIONPOINT_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_14__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT___CHECK_DEC_FWD__METERASSETMMXUPAIR_METERASSET_LOCATION_POSITIONPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.NonConformLoadImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getNonConformLoad()
	 * @generated
	 */
	int NON_CONFORM_LOAD = 2;

	/**
	 * The number of structural features of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPROPRIATE_FWD__MATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NONCONFORMLOAD_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD___CHECK_DEC_FWD__NONCONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ServiceDeliveryPointLinkMeterAssetImpl <em>Service Delivery Point Link Meter Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ServiceDeliveryPointLinkMeterAssetImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getServiceDeliveryPointLinkMeterAsset()
	 * @generated
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET = 3;

	/**
	 * The number of structural features of the '<em>Service Delivery Point Link Meter Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPROPRIATE_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETPHYSICALDEVICEPAIR_METERASSET_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_METERASSET_METERASSETTOPRIVATEMETERVOLTAGE_PRIVATEMETERVOLTAGE_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 16</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPROPRIATE_FWD_EMOFLON_EDGE_16__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET___CHECK_DEC_FWD__METERASSETPHYSICALDEVICEPAIR_METERASSET_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Service Delivery Point Link Meter Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_LINK_METER_ASSET_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ZoneImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 4;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_FWD__MATCH_ZONE_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ZONE_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ZONE_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ZONE_METERASSET_PMUVOLTAGEMETER_METERASSETTOPMUVOLTAGEMETER_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 17</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_17__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___CHECK_DEC_FWD__ZONE_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.LoadAreaImpl <em>Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.LoadAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getLoadArea()
	 * @generated
	 */
	int LOAD_AREA = 5;

	/**
	 * The number of structural features of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPROPRIATE_FWD__MATCH_SUBLOADAREA_CONFORMLOADGROUP_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_LOADAREA_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SUBLOADAREA_CONFORMLOADGROUP_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_LOADAREA_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SUBLOADAREA_CONFORMLOADGROUP_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_LOADAREA_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SUBLOADAREA_CONFORMLOADGROUP_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_LOADAREA_SUBLOADAREATOSUBLOADAREA_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 18</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_18__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA___CHECK_DEC_FWD__SUBLOADAREA_CONFORMLOADGROUP_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_LOADAREA_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ServiceLocationImpl <em>Service Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ServiceLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getServiceLocation()
	 * @generated
	 */
	int SERVICE_LOCATION = 6;

	/**
	 * The number of structural features of the '<em>Service Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_FWD__MATCH_SERVICELOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICELOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICELOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICELOCATION_METERASSET_PMUVOLTAGEMETER_METERASSETTOPMUVOLTAGEMETER_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 19</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION___CHECK_DEC_FWD__SERVICELOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Service Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.LocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_FWD__MATCH_LOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_LOCATION_PMUVOLTAGEMETER_METERASSETTOPMUVOLTAGEMETER_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 20</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_20__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CHECK_DEC_FWD__LOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.SDPLocationImpl <em>SDP Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.SDPLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getSDPLocation()
	 * @generated
	 */
	int SDP_LOCATION = 8;

	/**
	 * The number of structural features of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_FWD__MATCH_SDPLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SDPLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SDPLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SDPLOCATION_METERASSET_PMUVOLTAGEMETER_METERASSETTOPMUVOLTAGEMETER_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 21</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_21__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION___CHECK_DEC_FWD__SDPLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ConformLoadImpl <em>Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ConformLoadImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getConformLoad()
	 * @generated
	 */
	int CONFORM_LOAD = 9;

	/**
	 * The number of structural features of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPROPRIATE_FWD__MATCH_CONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONFORMLOAD_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 22</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD___CHECK_DEC_FWD__CONFORMLOAD_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ControlAreaImpl <em>Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ControlAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getControlArea()
	 * @generated
	 */
	int CONTROL_AREA = 10;

	/**
	 * The number of structural features of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPROPRIATE_FWD__MATCH_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Control Area 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPROPRIATE_FWD_CONTROL_AREA_0__CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA___CHECK_DEC_FWD__CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ConformLoadGroupImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getConformLoadGroup()
	 * @generated
	 */
	int CONFORM_LOAD_GROUP = 11;

	/**
	 * The number of structural features of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD__MATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_ENERGYCONSUMERTOENERGYCONSUMER_CONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 23</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP___CHECK_DEC_FWD__METERASSET_CONFORMLOAD_CONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.StationSupplyImpl <em>Station Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.StationSupplyImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getStationSupply()
	 * @generated
	 */
	int STATION_SUPPLY = 12;

	/**
	 * The number of structural features of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPROPRIATE_FWD__MATCH_STATIONSUPPLY_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STATIONSUPPLY_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STATIONSUPPLY_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STATIONSUPPLY_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 24</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY___CHECK_DEC_FWD__STATIONSUPPLY_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SUPPLY_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.TerminalImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 13;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPROPRIATE_FWD__MATCH_TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TERMINAL_POWERSYSTEMRESOURCETOPOWERSYSTEMRESOURCE_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_POWERSYSTEMRESOURCE_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 25</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CHECK_DEC_FWD__TERMINAL_METERASSETMMXUPAIR_CONDUCTINGEQUIPMENT_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.ServiceDeliveryPointImpl <em>Service Delivery Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.ServiceDeliveryPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getServiceDeliveryPoint()
	 * @generated
	 */
	int SERVICE_DELIVERY_POINT = 14;

	/**
	 * The number of structural features of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICEDELIVERYPOINT_METERASSETTOPRIVATEMETERVOLTAGE_METERASSET_METERASSETPHYSICALDEVICEPAIR_PRIVATEMETERVOLTAGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 26</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_26__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_METERASSET_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.EnergyConsumerLinkServiceDeliveryPointImpl <em>Energy Consumer Link Service Delivery Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.EnergyConsumerLinkServiceDeliveryPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getEnergyConsumerLinkServiceDeliveryPoint()
	 * @generated
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT = 15;

	/**
	 * The number of structural features of the '<em>Energy Consumer Link Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENERGYCONSUMERTOENERGYCONSUMER_METERASSET_ENERGYCONSUMER_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_ENERGYCONSUMER_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 27</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT___CHECK_DEC_FWD__METERASSET_METERASSETPHYSICALDEVICEPAIR_ENERGYCONSUMER_SERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Energy Consumer Link Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.LoadAreaLinkControlAreaImpl <em>Load Area Link Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.LoadAreaLinkControlAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getLoadAreaLinkControlArea()
	 * @generated
	 */
	int LOAD_AREA_LINK_CONTROL_AREA = 16;

	/**
	 * The number of structural features of the '<em>Load Area Link Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD__MATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SERVICEDELIVERYPOINT_SUBLOADAREA_LOADAREATOLOADAREA_CONTROLAREA_LOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONTROLAREATOCONTROLSREA_CONFORMLOADGROUP_LOADAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 28</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA___CHECK_DEC_FWD__SERVICEDELIVERYPOINT_SUBLOADAREA_METERASSET_METERASSETPHYSICALDEVICEPAIR_CONFORMLOAD_CONTROLAREA_CONFORMLOADGROUP_LOADAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Load Area Link Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_LINK_CONTROL_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.GmlPositionImpl <em>Gml Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.GmlPositionImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getGmlPosition()
	 * @generated
	 */
	int GML_POSITION = 17;

	/**
	 * The number of structural features of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_FWD__MATCH_GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GMLPOSITION_METERASSET_LOCATION_LOCATION_METERASSETMMXUPAIR_LOCATIONTOLOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 29</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION___CHECK_DEC_FWD__GMLPOSITION_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_POSITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.NonConformLoadGroupImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getNonConformLoadGroup()
	 * @generated
	 */
	int NON_CONFORM_LOAD_GROUP = 18;

	/**
	 * The number of structural features of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD__MATCH_METERASSET_NONCONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_NONCONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_NONCONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_NONCONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOAD_NONCONFORMLOAD_ENERGYCONSUMERTOENERGYCONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 30</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP___CHECK_DEC_FWD__METERASSET_NONCONFORMLOADGROUP_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_NONCONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.WorkLocationImpl <em>Work Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.WorkLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getWorkLocation()
	 * @generated
	 */
	int WORK_LOCATION = 19;

	/**
	 * The number of structural features of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_FWD__MATCH_WORKLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WORKLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WORKLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WORKLOCATION_METERASSET_PMUVOLTAGEMETER_METERASSETTOPMUVOLTAGEMETER_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 31</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION___CHECK_DEC_FWD__WORKLOCATION_METERASSET_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.TieFlowLinkControlAreaImpl <em>Tie Flow Link Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.TieFlowLinkControlAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getTieFlowLinkControlArea()
	 * @generated
	 */
	int TIE_FLOW_LINK_CONTROL_AREA = 20;

	/**
	 * The number of structural features of the '<em>Tie Flow Link Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_TIEFLOW_LOCATION_CONDUCTINGEQUIPMENT_TERMINAL_METERASSET_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_TIEFLOW_LOCATION_CONDUCTINGEQUIPMENT_TERMINAL_METERASSET_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_TIEFLOW_LOCATION_CONDUCTINGEQUIPMENT_TERMINAL_METERASSET_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTROLAREATOCONTROLSREA_METERASSETMMXUPAIR_TIEFLOW_LOCATION_TIEFLOWTOTIEFLOW_CONDUCTINGEQUIPMENT_TERMINAL_CONTROLAREA_METERASSET_CONTROLAREA_TIEFLOW = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA___CHECK_DEC_FWD__METERASSETMMXUPAIR_TIEFLOW_LOCATION_CONDUCTINGEQUIPMENT_TERMINAL_METERASSET_CONTROLAREA = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Tie Flow Link Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_LINK_CONTROL_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.PowerSystemResourceImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getPowerSystemResource()
	 * @generated
	 */
	int POWER_SYSTEM_RESOURCE = 21;

	/**
	 * The number of structural features of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_FWD__MATCH_POWERSYSTEMRESOURCE_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_POWERSYSTEMRESOURCE_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_POWERSYSTEMRESOURCE_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_POWERSYSTEMRESOURCE_LOCATION_METERASSET_LOCATION_LOCATIONTOLOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 33</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE___CHECK_DEC_FWD__POWERSYSTEMRESOURCE_METERASSET_LOCATION_METERASSETMMXUPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.PrivateMeterVoltageImpl <em>Private Meter Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.PrivateMeterVoltageImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getPrivateMeterVoltage()
	 * @generated
	 */
	int PRIVATE_METER_VOLTAGE = 22;

	/**
	 * The number of structural features of the '<em>Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 34</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_34__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE___CHECK_DEC_FWD__METERASSET_METERASSETPHYSICALDEVICEPAIR_ELECTRICITYVALUES_PHYSICALDEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.LocationLinkImpl <em>Location Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.LocationLinkImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getLocationLink()
	 * @generated
	 */
	int LOCATION_LINK = 23;

	/**
	 * The number of structural features of the '<em>Location Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_FWD__MATCH_METERASSETMMXUPAIR_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSETMMXUPAIR_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSETMMXUPAIR_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSETMMXUPAIR_METERASSET_LOCATIONTOLOCATION_LOCATION_PMUVOLTAGEMETER_LOCATION_METERASSETTOPMUVOLTAGEMETER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 35</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_35__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK___CHECK_DEC_FWD__METERASSETMMXUPAIR_METERASSET_LOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Location Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LINK_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.PMUVoltageMeterImpl <em>PMU Voltage Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.PMUVoltageMeterImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getPMUVoltageMeter()
	 * @generated
	 */
	int PMU_VOLTAGE_METER = 24;

	/**
	 * The number of structural features of the '<em>PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPROPRIATE_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_MMXU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_MMXU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_METERASSETMMXUPAIR_MMXU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_METERASSETMMXUPAIR_MMXU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_36__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER___CHECK_DEC_FWD__METERASSET_METERASSETMMXUPAIR_MMXU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.SubLoadAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getSubLoadArea()
	 * @generated
	 */
	int SUB_LOAD_AREA = 25;

	/**
	 * The number of structural features of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPROPRIATE_FWD__MATCH_METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METERASSET_CONFORMLOADGROUP_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOADGROUPTOCONFORMLOADGROUP_CONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA___CHECK_DEC_FWD__METERASSET_CONFORMLOADGROUP_SUBLOADAREA_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINT_CONFORMLOAD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.EnergyConsumerImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 26;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_FWD__MATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR_SERVICEDELIVERYPOINTTOSERVICEDELIVERYPOINT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER___CHECK_DEC_FWD__ENERGYCONSUMER_METERASSET_SERVICEDELIVERYPOINT_METERASSETPHYSICALDEVICEPAIR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow
	 * @generated
	 */
	EClass getTieFlow();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTieFlow__IsAppropriate_FWD__Match_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTieFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTieFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTieFlow__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTieFlow__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTieFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetMMXUPair, rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, outagePreventionJointarget.Terminal) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetMMXUPair, rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, outagePreventionJointarget.Terminal)
	 * @generated
	 */
	EOperation getTieFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetMMXUPair_TerminalToTerminal_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location_Terminal();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTieFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTieFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTieFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_FWD_EMoflonEdge_13(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isAppropriate_FWD_EMoflonEdge_13(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTieFlow__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getTieFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTieFlow__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlow#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTieFlow__CheckDEC_FWD__MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Terminal_TieFlow_Location();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint
	 * @generated
	 */
	EClass getPositionPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPositionPoint__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint)
	 * @generated
	 */
	EOperation getPositionPoint__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task2.LocationToLocation, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint, outagePreventionJointarget.Location) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task2.LocationToLocation, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint, outagePreventionJointarget.Location)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_LocationToLocation_MeterAssetMMXUPair_MeterAsset_Location_PositionPoint_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPositionPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPoint__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_FWD_EMoflonEdge_14(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 14</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isAppropriate_FWD_EMoflonEdge_14(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPositionPoint__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPositionPoint__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPositionPoint__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PositionPoint#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Common.PositionPoint)
	 * @generated
	 */
	EOperation getPositionPoint__CheckDEC_FWD__MeterAssetMMXUPair_MeterAsset_Location_PositionPoint();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad
	 * @generated
	 */
	EClass getNonConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getNonConformLoad__IsAppropriate_FWD__Match_NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNonConformLoad__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getNonConformLoad__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getNonConformLoad__RegisterObjectsToMatch_FWD__Match_NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getNonConformLoad__IsAppropriate_solveCsp_FWD__Match_NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getNonConformLoad__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getNonConformLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_NonConformLoad_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getNonConformLoad__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNonConformLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getNonConformLoad__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_FWD_EMoflonEdge_15(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 15</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isAppropriate_FWD_EMoflonEdge_15(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNonConformLoad__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getNonConformLoad__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getNonConformLoad__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getNonConformLoad__CheckDEC_FWD__NonConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset <em>Service Delivery Point Link Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Delivery Point Link Meter Asset</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset
	 * @generated
	 */
	EClass getServiceDeliveryPointLinkMeterAsset();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_FWD__Match_MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__RegisterObjectsToMatch_FWD__Match_MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_solveCsp_FWD__Match_MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetPhysicalDevicePair, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage, outagePreventionJointarget.PrivateMeterVoltage, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetPhysicalDevicePair, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage, outagePreventionJointarget.PrivateMeterVoltage, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetToPrivateMeterVoltage_PrivateMeterVoltage_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_FWD_EMoflonEdge_16(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 16</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 16</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isAppropriate_FWD_EMoflonEdge_16(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#checkDEC_FWD(gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPointLinkMeterAsset#checkDEC_FWD(gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getServiceDeliveryPointLinkMeterAsset__CheckDEC_FWD__MeterAssetPhysicalDevicePair_MeterAsset_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_FWD__Match_Zone_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getZone__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getZone__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getZone__RegisterObjectsToMatch_FWD__Match_Zone_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_solveCsp_FWD__Match_Zone_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getZone__IsApplicable_solveCsp_FWD__IsApplicableMatch_Zone_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getZone__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getZone__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getZone__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_FWD_EMoflonEdge_17(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 17</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 17</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isAppropriate_FWD_EMoflonEdge_17(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getZone__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getZone__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getZone__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Zone#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Zone#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfLocations.Zone, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getZone__CheckDEC_FWD__Zone_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea
	 * @generated
	 */
	EClass getLoadArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getLoadArea__IsAppropriate_FWD__Match_SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLoadArea__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLoadArea__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getLoadArea__RegisterObjectsToMatch_FWD__Match_SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getLoadArea__IsAppropriate_solveCsp_FWD__Match_SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLoadArea__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, outagePreventionJointarget.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, outagePreventionJointarget.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getLoadArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_SubLoadArea_ConformLoadGroup_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_SubLoadAreaToSubLoadArea_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLoadArea__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLoadArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLoadArea__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_FWD_EMoflonEdge_18(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 18</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 18</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isAppropriate_FWD_EMoflonEdge_18(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLoadArea__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getLoadArea__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLoadArea__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadArea#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.LoadArea, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getLoadArea__CheckDEC_FWD__SubLoadArea_ConformLoadGroup_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_LoadArea_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation
	 * @generated
	 */
	EClass getServiceLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_FWD__Match_ServiceLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getServiceLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getServiceLocation__RegisterObjectsToMatch_FWD__Match_ServiceLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_solveCsp_FWD__Match_ServiceLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceLocation_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getServiceLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_FWD_EMoflonEdge_19(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 19</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 19</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isAppropriate_FWD_EMoflonEdge_19(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceLocation__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getServiceLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Customers.ServiceLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getServiceLocation__CheckDEC_FWD__ServiceLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_FWD__Match_Location_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getLocation__RegisterObjectsToMatch_FWD__Match_Location_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_solveCsp_FWD__Match_Location_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Common.Location, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Common.Location, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_Location_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_FWD_EMoflonEdge_20(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 20</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 20</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isAppropriate_FWD_EMoflonEdge_20(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLocation__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Location#checkDEC_FWD(gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Location#checkDEC_FWD(gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getLocation__CheckDEC_FWD__Location_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation <em>SDP Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDP Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation
	 * @generated
	 */
	EClass getSDPLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_FWD__Match_SDPLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSDPLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getSDPLocation__RegisterObjectsToMatch_FWD__Match_SDPLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_solveCsp_FWD__Match_SDPLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_SDPLocation_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSDPLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSDPLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_FWD_EMoflonEdge_21(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 21</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 21</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isAppropriate_FWD_EMoflonEdge_21(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSDPLocation__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSDPLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSDPLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SDPLocation#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.SDPLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getSDPLocation__CheckDEC_FWD__SDPLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad
	 * @generated
	 */
	EClass getConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getConformLoad__IsAppropriate_FWD__Match_ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getConformLoad__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getConformLoad__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getConformLoad__RegisterObjectsToMatch_FWD__Match_ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getConformLoad__IsAppropriate_solveCsp_FWD__Match_ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getConformLoad__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getConformLoad__IsApplicable_solveCsp_FWD__IsApplicableMatch_ConformLoad_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getConformLoad__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getConformLoad__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getConformLoad__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_FWD_EMoflonEdge_22(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 22</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 22</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isAppropriate_FWD_EMoflonEdge_22(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getConformLoad__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getConformLoad__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getConformLoad__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoad#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getConformLoad__CheckDEC_FWD__ConformLoad_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea
	 * @generated
	 */
	EClass getControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getControlArea__IsAppropriate_FWD__Match_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getControlArea__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getControlArea__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getControlArea__RegisterObjectsToMatch_FWD__Match_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getControlArea__IsAppropriate_solveCsp_FWD__Match_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getControlArea__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getControlArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getControlArea__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getControlArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getControlArea__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_FWD_ControlArea_0(gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Is Appropriate FWD Control Area 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Control Area 0</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isAppropriate_FWD_ControlArea_0(gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getControlArea__IsAppropriate_FWD_ControlArea_0__ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getControlArea__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getControlArea__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#checkDEC_FWD(gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ControlArea#checkDEC_FWD(gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getControlArea__CheckDEC_FWD__ControlArea();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup
	 * @generated
	 */
	EClass getConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsAppropriate_FWD__Match_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getConformLoadGroup__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getConformLoadGroup__RegisterObjectsToMatch_FWD__Match_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsAppropriate_solveCsp_FWD__Match_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer, outagePreventionJointarget.ConformLoad) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer, outagePreventionJointarget.ConformLoad)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_EnergyConsumerToEnergyConsumer_ConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getConformLoadGroup__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getConformLoadGroup__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_FWD_EMoflonEdge_23(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 23</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 23</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isAppropriate_FWD_EMoflonEdge_23(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getConformLoadGroup__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getConformLoadGroup__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ConformLoadGroup#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getConformLoadGroup__CheckDEC_FWD__MeterAsset_ConformLoad_ConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Supply</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply
	 * @generated
	 */
	EClass getStationSupply();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getStationSupply__IsAppropriate_FWD__Match_StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getStationSupply__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getStationSupply__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getStationSupply__RegisterObjectsToMatch_FWD__Match_StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getStationSupply__IsAppropriate_solveCsp_FWD__Match_StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getStationSupply__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getStationSupply__IsApplicable_solveCsp_FWD__IsApplicableMatch_StationSupply_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointToServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getStationSupply__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getStationSupply__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getStationSupply__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_FWD_EMoflonEdge_24(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 24</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 24</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isAppropriate_FWD_EMoflonEdge_24(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getStationSupply__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getStationSupply__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getStationSupply__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.StationSupply#checkDEC_FWD(gluemodel.CIM.IEC61970.LoadModel.StationSupply, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getStationSupply__CheckDEC_FWD__StationSupply_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTerminal__IsAppropriate_FWD__Match_Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminal__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTerminal__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTerminal__RegisterObjectsToMatch_FWD__Match_Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTerminal__IsAppropriate_solveCsp_FWD__Match_Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTerminal__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Core.Terminal, rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, outagePreventionJointarget.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Core.Terminal, rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, outagePreventionJointarget.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTerminal__IsApplicable_solveCsp_FWD__IsApplicableMatch_Terminal_PowerSystemResourceToPowerSystemResource_MeterAssetMMXUPair_ConductingEquipment_PowerSystemResource_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTerminal__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminal__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTerminal__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_FWD_EMoflonEdge_25(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 25</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 25</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isAppropriate_FWD_EMoflonEdge_25(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminal__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminal__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTerminal__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#checkDEC_FWD(gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.Terminal#checkDEC_FWD(gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getTerminal__CheckDEC_FWD__Terminal_MeterAssetMMXUPair_ConductingEquipment_MeterAsset_Location();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Delivery Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint
	 * @generated
	 */
	EClass getServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsAppropriate_FWD__Match_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__RegisterObjectsToMatch_FWD__Match_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsAppropriate_solveCsp_FWD__Match_ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outagePreventionJointarget.PrivateMeterVoltage) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, outagePreventionJointarget.PrivateMeterVoltage)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceDeliveryPoint_MeterAssetToPrivateMeterVoltage_MeterAsset_MeterAssetPhysicalDevicePair_PrivateMeterVoltage();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_FWD_EMoflonEdge_26(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 26</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 26</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isAppropriate_FWD_EMoflonEdge_26(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.ServiceDeliveryPoint#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getServiceDeliveryPoint__CheckDEC_FWD__ServiceDeliveryPoint_MeterAsset_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint <em>Energy Consumer Link Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer Link Service Delivery Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint
	 * @generated
	 */
	EClass getEnergyConsumerLinkServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, outagePreventionJointarget.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.EnergyConsumer, gluemodel.MeterAssetPhysicalDevicePair, outagePreventionJointarget.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnergyConsumerToEnergyConsumer_MeterAsset_EnergyConsumer_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_EnergyConsumer_ServiceDeliveryPointToServiceDeliveryPoint_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_FWD_EMoflonEdge_27(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 27</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 27</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isAppropriate_FWD_EMoflonEdge_27(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumerLinkServiceDeliveryPoint#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getEnergyConsumerLinkServiceDeliveryPoint__CheckDEC_FWD__MeterAsset_MeterAssetPhysicalDevicePair_EnergyConsumer_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea <em>Load Area Link Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area Link Control Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea
	 * @generated
	 */
	EClass getLoadAreaLinkControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsAppropriate_FWD__Match_ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__RegisterObjectsToMatch_FWD__Match_ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsAppropriate_solveCsp_FWD__Match_ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea, outagePreventionJointarget.ControlArea, outagePreventionJointarget.LoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea, outagePreventionJointarget.ControlArea, outagePreventionJointarget.LoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_ServiceDeliveryPoint_SubLoadArea_LoadAreaToLoadArea_ControlArea_LoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ControlAreaToControlSrea_ConformLoadGroup_LoadArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_FWD_EMoflonEdge_28(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 28</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 28</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isAppropriate_FWD_EMoflonEdge_28(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LoadAreaLinkControlArea#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61970.LoadModel.ConformLoad, gluemodel.CIM.IEC61970.ControlArea.ControlArea, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.LoadArea)
	 * @generated
	 */
	EOperation getLoadAreaLinkControlArea__CheckDEC_FWD__ServiceDeliveryPoint_SubLoadArea_MeterAsset_MeterAssetPhysicalDevicePair_ConformLoad_ControlArea_ConformLoadGroup_LoadArea();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Position</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition
	 * @generated
	 */
	EClass getGmlPosition();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_FWD__Match_GmlPosition_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getGmlPosition__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getGmlPosition__RegisterObjectsToMatch_FWD__Match_GmlPosition_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_solveCsp_FWD__Match_GmlPosition_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.Location, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair, rgse.ttc17.emoflon.tgg.task2.LocationToLocation) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.Location, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair, rgse.ttc17.emoflon.tgg.task2.LocationToLocation)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_solveCsp_FWD__IsApplicableMatch_GmlPosition_MeterAsset_Location_Location_MeterAssetMMXUPair_LocationToLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getGmlPosition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getGmlPosition__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_FWD_EMoflonEdge_29(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 29</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 29</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isAppropriate_FWD_EMoflonEdge_29(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getGmlPosition__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getGmlPosition__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getGmlPosition__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.GmlPosition#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfGMLSupport.GmlPosition, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getGmlPosition__CheckDEC_FWD__GmlPosition_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup
	 * @generated
	 */
	EClass getNonConformLoadGroup();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsAppropriate_FWD__Match_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__RegisterObjectsToMatch_FWD__Match_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsAppropriate_solveCsp_FWD__Match_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.NonConformLoad, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, outagePreventionJointarget.NonConformLoad, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad, rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad_NonConformLoad_EnergyConsumerToEnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_FWD_EMoflonEdge_30(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 30</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 30</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isAppropriate_FWD_EMoflonEdge_30(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.NonConformLoadGroup#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.NonConformLoad)
	 * @generated
	 */
	EOperation getNonConformLoadGroup__CheckDEC_FWD__MeterAsset_NonConformLoadGroup_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_NonConformLoad();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation <em>Work Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation
	 * @generated
	 */
	EClass getWorkLocation();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_FWD__Match_WorkLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getWorkLocation__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getWorkLocation__RegisterObjectsToMatch_FWD__Match_WorkLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_solveCsp_FWD__Match_WorkLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.PMUVoltageMeter, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_WorkLocation_MeterAsset_PMUVoltageMeter_MeterAssetToPMUVoltageMeter_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getWorkLocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getWorkLocation__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_FWD_EMoflonEdge_31(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 31</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 31</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isAppropriate_FWD_EMoflonEdge_31(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getWorkLocation__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getWorkLocation__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getWorkLocation__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.WorkLocation#checkDEC_FWD(gluemodel.CIM.IEC61970.Informative.InfWork.WorkLocation, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getWorkLocation__CheckDEC_FWD__WorkLocation_MeterAsset_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea <em>Tie Flow Link Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow Link Control Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea
	 * @generated
	 */
	EClass getTieFlowLinkControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsAppropriate_FWD__Match_MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, outagePreventionJointarget.ControlArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea, outagePreventionJointarget.TieFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, outagePreventionJointarget.ControlArea, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea, outagePreventionJointarget.TieFlow)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_ControlAreaToControlSrea_MeterAssetMMXUPair_TieFlow_Location_TieFlowToTieFlow_ConductingEquipment_Terminal_ControlArea_MeterAsset_ControlArea_TieFlow();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_FWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 32</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isAppropriate_FWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.TieFlowLinkControlArea#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61970.ControlArea.TieFlow, gluemodel.CIM.IEC61968.Common.Location, gluemodel.CIM.IEC61970.Core.ConductingEquipment, gluemodel.CIM.IEC61970.Core.Terminal, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.ControlArea.ControlArea)
	 * @generated
	 */
	EOperation getTieFlowLinkControlArea__CheckDEC_FWD__MeterAssetMMXUPair_TieFlow_Location_ConductingEquipment_Terminal_MeterAsset_ControlArea();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource
	 * @generated
	 */
	EClass getPowerSystemResource();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsAppropriate_FWD__Match_PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPowerSystemResource__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getPowerSystemResource__RegisterObjectsToMatch_FWD__Match_PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsAppropriate_solveCsp_FWD__Match_PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Core.PowerSystemResource, outagePreventionJointarget.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task2.LocationToLocation, gluemodel.MeterAssetMMXUPair) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Core.PowerSystemResource, outagePreventionJointarget.Location, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, rgse.ttc17.emoflon.tgg.task2.LocationToLocation, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsApplicable_solveCsp_FWD__IsApplicableMatch_PowerSystemResource_Location_MeterAsset_Location_LocationToLocation_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPowerSystemResource__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPowerSystemResource__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_FWD_EMoflonEdge_33(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 33</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 33</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isAppropriate_FWD_EMoflonEdge_33(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsAppropriate_FWD_EMoflonEdge_33__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPowerSystemResource__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPowerSystemResource__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#checkDEC_FWD(gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PowerSystemResource#checkDEC_FWD(gluemodel.CIM.IEC61970.Core.PowerSystemResource, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location, gluemodel.MeterAssetMMXUPair)
	 * @generated
	 */
	EOperation getPowerSystemResource__CheckDEC_FWD__PowerSystemResource_MeterAsset_Location_MeterAssetMMXUPair();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage <em>Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Meter Voltage</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage
	 * @generated
	 */
	EClass getPrivateMeterVoltage();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsAppropriate_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_FWD_EMoflonEdge_34(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 34</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 34</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isAppropriate_FWD_EMoflonEdge_34(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsAppropriate_FWD_EMoflonEdge_34__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PrivateMeterVoltage#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.COSEM.COSEMObjects.ElectricityValues, gluemodel.COSEM.PhysicalDevice)
	 * @generated
	 */
	EOperation getPrivateMeterVoltage__CheckDEC_FWD__MeterAsset_MeterAssetPhysicalDevicePair_ElectricityValues_PhysicalDevice();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink <em>Location Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Link</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink
	 * @generated
	 */
	EClass getLocationLink();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLocationLink__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__RegisterObjectsToMatch_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_solveCsp_FWD__Match_MeterAssetMMXUPair_MeterAsset_Location();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, rgse.ttc17.emoflon.tgg.task2.LocationToLocation, gluemodel.CIM.IEC61968.Common.Location, outagePreventionJointarget.PMUVoltageMeter, outagePreventionJointarget.Location, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, rgse.ttc17.emoflon.tgg.task2.LocationToLocation, gluemodel.CIM.IEC61968.Common.Location, outagePreventionJointarget.PMUVoltageMeter, outagePreventionJointarget.Location, rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAssetMMXUPair_MeterAsset_LocationToLocation_Location_PMUVoltageMeter_Location_MeterAssetToPMUVoltageMeter();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLocationLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocationLink__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_FWD_EMoflonEdge_35(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 35</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 35</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isAppropriate_FWD_EMoflonEdge_35(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLocationLink__IsAppropriate_FWD_EMoflonEdge_35__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getLocationLink__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getLocationLink__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.LocationLink#checkDEC_FWD(gluemodel.MeterAssetMMXUPair, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Common.Location)
	 * @generated
	 */
	EOperation getLocationLink__CheckDEC_FWD__MeterAssetMMXUPair_MeterAsset_Location();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter <em>PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMU Voltage Meter</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter
	 * @generated
	 */
	EClass getPMUVoltageMeter();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsAppropriate_FWD__Match_MeterAsset_MeterAssetMMXUPair_MMXU();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__RegisterObjectsToMatch_FWD__Match_MeterAsset_MeterAssetMMXUPair_MMXU();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsAppropriate_solveCsp_FWD__Match_MeterAsset_MeterAssetMMXUPair_MMXU();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_MeterAssetMMXUPair_MMXU();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_FWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 36</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isAppropriate_FWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsAppropriate_FWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.PMUVoltageMeter#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.MeterAssetMMXUPair, gluemodel.substationStandard.LNNodes.LNGroupM.MMXU)
	 * @generated
	 */
	EOperation getPMUVoltageMeter__CheckDEC_FWD__MeterAsset_MeterAssetMMXUPair_MMXU();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea
	 * @generated
	 */
	EClass getSubLoadArea();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad)
	 * @generated
	 */
	EOperation getSubLoadArea__IsAppropriate_FWD__Match_MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSubLoadArea__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSubLoadArea__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad)
	 * @generated
	 */
	EOperation getSubLoadArea__RegisterObjectsToMatch_FWD__Match_MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad)
	 * @generated
	 */
	EOperation getSubLoadArea__IsAppropriate_solveCsp_FWD__Match_MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSubLoadArea__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, outagePreventionJointarget.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.ConformLoad) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, outagePreventionJointarget.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.ConformLoad)
	 * @generated
	 */
	EOperation getSubLoadArea__IsApplicable_solveCsp_FWD__IsApplicableMatch_MeterAsset_ConformLoadGroup_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoadGroupToConformLoadGroup_ConformLoad();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSubLoadArea__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSubLoadArea__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSubLoadArea__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_FWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 37</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isAppropriate_FWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSubLoadArea__IsAppropriate_FWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSubLoadArea__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSubLoadArea__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.SubLoadArea#checkDEC_FWD(gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup, gluemodel.CIM.IEC61970.LoadModel.SubLoadArea, gluemodel.MeterAssetPhysicalDevicePair, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.CIM.IEC61970.LoadModel.ConformLoad)
	 * @generated
	 */
	EOperation getSubLoadArea__CheckDEC_FWD__MeterAsset_ConformLoadGroup_SubLoadArea_MeterAssetPhysicalDevicePair_ServiceDeliveryPoint_ConformLoad();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_FWD__Match_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEnergyConsumer__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getEnergyConsumer__RegisterObjectsToMatch_FWD__Match_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_solveCsp_FWD__Match_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, outagePreventionJointarget.ServiceDeliveryPoint, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair, rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnergyConsumer_MeterAsset_ServiceDeliveryPoint_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair_ServiceDeliveryPointToServiceDeliveryPoint();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEnergyConsumer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumer__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_FWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 38</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isAppropriate_FWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsAppropriate_FWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getEnergyConsumer__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getEnergyConsumer__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#checkDEC_FWD(gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see rgse.ttc17.emoflon.tgg.task2.Rules.EnergyConsumer#checkDEC_FWD(gluemodel.CIM.IEC61970.Wires.EnergyConsumer, gluemodel.CIM.IEC61968.Metering.MeterAsset, gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint, gluemodel.MeterAssetPhysicalDevicePair)
	 * @generated
	 */
	EOperation getEnergyConsumer__CheckDEC_FWD__EnergyConsumer_MeterAsset_ServiceDeliveryPoint_MeterAssetPhysicalDevicePair();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
