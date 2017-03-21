/**
 */
package CIM.IEC61970.Informative.InfCommon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Market Role Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getMarketRoleKind()
 * @model
 * @generated
 */
public enum MarketRoleKind implements Enumerator {
	/**
	 * The '<em><b>Competitive Retailer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPETITIVE_RETAILER_VALUE
	 * @generated
	 * @ordered
	 */
	COMPETITIVE_RETAILER(0, "competitiveRetailer", "competitiveRetailer"),

	/**
	 * The '<em><b>Standards Developer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARDS_DEVELOPER_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARDS_DEVELOPER(1, "standardsDeveloper", "standardsDeveloper"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "other", "other"),

	/**
	 * The '<em><b>Resource Planner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_PLANNER_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_PLANNER(3, "resourcePlanner", "resourcePlanner"),

	/**
	 * The '<em><b>Interchange Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCHANGE_AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCHANGE_AUTHORITY(4, "interchangeAuthority", "interchangeAuthority"),

	/**
	 * The '<em><b>Transmission Service Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_SERVICE_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_SERVICE_PROVIDER(5, "transmissionServiceProvider", "transmissionServiceProvider"), /**
	 * The '<em><b>Purchasing Selling Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURCHASING_SELLING_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	PURCHASING_SELLING_ENTITY(6, "purchasingSellingEntity", "purchasingSellingEntity"),

	/**
	 * The '<em><b>Balancing Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALANCING_AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	BALANCING_AUTHORITY(7, "balancingAuthority", "balancingAuthority"),

	/**
	 * The '<em><b>Energy Service Consumer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_SERVICE_CONSUMER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_SERVICE_CONSUMER(8, "energyServiceConsumer", "energyServiceConsumer"),

	/**
	 * The '<em><b>Load Serving Entity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_SERVING_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_SERVING_ENTITY(9, "loadServingEntity", "loadServingEntity"),

	/**
	 * The '<em><b>Distribution Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION_PROVIDER(10, "distributionProvider", "distributionProvider"),

	/**
	 * The '<em><b>Transmission Planner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_PLANNER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_PLANNER(11, "transmissionPlanner", "transmissionPlanner"), /**
	 * The '<em><b>Reliability Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY_AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	RELIABILITY_AUTHORITY(12, "reliabilityAuthority", "reliabilityAuthority"),

	/**
	 * The '<em><b>Transmission Owner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_OWNER(13, "transmissionOwner", "transmissionOwner"), /**
	 * The '<em><b>Generator Owner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATOR_OWNER(14, "generatorOwner", "generatorOwner"),

	/**
	 * The '<em><b>Planning Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNING_AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNING_AUTHORITY(15, "planningAuthority", "planningAuthority"),

	/**
	 * The '<em><b>Generator Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATOR_OPERATOR(16, "generatorOperator", "generatorOperator"),

	/**
	 * The '<em><b>Compliance Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIANCE_MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLIANCE_MONITOR(17, "complianceMonitor", "complianceMonitor"),

	/**
	 * The '<em><b>Transmission Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_OPERATOR(18, "transmissionOperator", "transmissionOperator");

	/**
	 * The '<em><b>Competitive Retailer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Competitive Retailer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPETITIVE_RETAILER
	 * @model name="competitiveRetailer"
	 * @generated
	 * @ordered
	 */
	public static final int COMPETITIVE_RETAILER_VALUE = 0;

	/**
	 * The '<em><b>Standards Developer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standards Developer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARDS_DEVELOPER
	 * @model name="standardsDeveloper"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARDS_DEVELOPER_VALUE = 1;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Resource Planner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Planner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_PLANNER
	 * @model name="resourcePlanner"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_PLANNER_VALUE = 3;

	/**
	 * The '<em><b>Interchange Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interchange Authority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCHANGE_AUTHORITY
	 * @model name="interchangeAuthority"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCHANGE_AUTHORITY_VALUE = 4;

	/**
	 * The '<em><b>Transmission Service Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Service Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_SERVICE_PROVIDER
	 * @model name="transmissionServiceProvider"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_SERVICE_PROVIDER_VALUE = 5;

	/**
	 * The '<em><b>Purchasing Selling Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Purchasing Selling Entity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PURCHASING_SELLING_ENTITY
	 * @model name="purchasingSellingEntity"
	 * @generated
	 * @ordered
	 */
	public static final int PURCHASING_SELLING_ENTITY_VALUE = 6;

	/**
	 * The '<em><b>Balancing Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Balancing Authority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALANCING_AUTHORITY
	 * @model name="balancingAuthority"
	 * @generated
	 * @ordered
	 */
	public static final int BALANCING_AUTHORITY_VALUE = 7;

	/**
	 * The '<em><b>Energy Service Consumer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Energy Service Consumer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGY_SERVICE_CONSUMER
	 * @model name="energyServiceConsumer"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SERVICE_CONSUMER_VALUE = 8;

	/**
	 * The '<em><b>Load Serving Entity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Serving Entity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_SERVING_ENTITY
	 * @model name="loadServingEntity"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SERVING_ENTITY_VALUE = 9;

	/**
	 * The '<em><b>Distribution Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distribution Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_PROVIDER
	 * @model name="distributionProvider"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_PROVIDER_VALUE = 10;

	/**
	 * The '<em><b>Transmission Planner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Planner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_PLANNER
	 * @model name="transmissionPlanner"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_PLANNER_VALUE = 11;

	/**
	 * The '<em><b>Reliability Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reliability Authority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY_AUTHORITY
	 * @model name="reliabilityAuthority"
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_AUTHORITY_VALUE = 12;

	/**
	 * The '<em><b>Transmission Owner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Owner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_OWNER
	 * @model name="transmissionOwner"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_OWNER_VALUE = 13;

	/**
	 * The '<em><b>Generator Owner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generator Owner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_OWNER
	 * @model name="generatorOwner"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_OWNER_VALUE = 14;

	/**
	 * The '<em><b>Planning Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Planning Authority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLANNING_AUTHORITY
	 * @model name="planningAuthority"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNING_AUTHORITY_VALUE = 15;

	/**
	 * The '<em><b>Generator Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generator Operator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_OPERATOR
	 * @model name="generatorOperator"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_OPERATOR_VALUE = 16;

	/**
	 * The '<em><b>Compliance Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compliance Monitor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLIANCE_MONITOR
	 * @model name="complianceMonitor"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLIANCE_MONITOR_VALUE = 17;

	/**
	 * The '<em><b>Transmission Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Operator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_OPERATOR
	 * @model name="transmissionOperator"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_OPERATOR_VALUE = 18;

	/**
	 * An array of all the '<em><b>Market Role Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MarketRoleKind[] VALUES_ARRAY =
		new MarketRoleKind[] {
			COMPETITIVE_RETAILER,
			STANDARDS_DEVELOPER,
			OTHER,
			RESOURCE_PLANNER,
			INTERCHANGE_AUTHORITY,
			TRANSMISSION_SERVICE_PROVIDER,
			PURCHASING_SELLING_ENTITY,
			BALANCING_AUTHORITY,
			ENERGY_SERVICE_CONSUMER,
			LOAD_SERVING_ENTITY,
			DISTRIBUTION_PROVIDER,
			TRANSMISSION_PLANNER,
			RELIABILITY_AUTHORITY,
			TRANSMISSION_OWNER,
			GENERATOR_OWNER,
			PLANNING_AUTHORITY,
			GENERATOR_OPERATOR,
			COMPLIANCE_MONITOR,
			TRANSMISSION_OPERATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Market Role Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MarketRoleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Market Role Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MarketRoleKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MarketRoleKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Market Role Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MarketRoleKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MarketRoleKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Market Role Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MarketRoleKind get(int value) {
		switch (value) {
			case COMPETITIVE_RETAILER_VALUE: return COMPETITIVE_RETAILER;
			case STANDARDS_DEVELOPER_VALUE: return STANDARDS_DEVELOPER;
			case OTHER_VALUE: return OTHER;
			case RESOURCE_PLANNER_VALUE: return RESOURCE_PLANNER;
			case INTERCHANGE_AUTHORITY_VALUE: return INTERCHANGE_AUTHORITY;
			case TRANSMISSION_SERVICE_PROVIDER_VALUE: return TRANSMISSION_SERVICE_PROVIDER;
			case PURCHASING_SELLING_ENTITY_VALUE: return PURCHASING_SELLING_ENTITY;
			case BALANCING_AUTHORITY_VALUE: return BALANCING_AUTHORITY;
			case ENERGY_SERVICE_CONSUMER_VALUE: return ENERGY_SERVICE_CONSUMER;
			case LOAD_SERVING_ENTITY_VALUE: return LOAD_SERVING_ENTITY;
			case DISTRIBUTION_PROVIDER_VALUE: return DISTRIBUTION_PROVIDER;
			case TRANSMISSION_PLANNER_VALUE: return TRANSMISSION_PLANNER;
			case RELIABILITY_AUTHORITY_VALUE: return RELIABILITY_AUTHORITY;
			case TRANSMISSION_OWNER_VALUE: return TRANSMISSION_OWNER;
			case GENERATOR_OWNER_VALUE: return GENERATOR_OWNER;
			case PLANNING_AUTHORITY_VALUE: return PLANNING_AUTHORITY;
			case GENERATOR_OPERATOR_VALUE: return GENERATOR_OPERATOR;
			case COMPLIANCE_MONITOR_VALUE: return COMPLIANCE_MONITOR;
			case TRANSMISSION_OPERATOR_VALUE: return TRANSMISSION_OPERATOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MarketRoleKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MarketRoleKind
