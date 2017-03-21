/**
 */
package CIM.IEC61970.Informative.InfAssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transformer Construction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerConstructionKind()
 * @model
 * @generated
 */
public enum TransformerConstructionKind implements Enumerator {
	/**
	 * The '<em><b>Valut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUT_VALUE
	 * @generated
	 * @ordered
	 */
	VALUT(0, "valut", "valut"),

	/**
	 * The '<em><b>Subway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBWAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUBWAY(1, "subway", "subway"),

	/**
	 * The '<em><b>Aerial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	AERIAL(2, "aerial", "aerial"),

	/**
	 * The '<em><b>Padmount Feed Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_FEED_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_FEED_THROUGH(3, "padmountFeedThrough", "padmountFeedThrough"),

	/**
	 * The '<em><b>Padmount Loop Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LOOP_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_LOOP_THROUGH(4, "padmountLoopThrough", "padmountLoopThrough"),

	/**
	 * The '<em><b>Padmount Dead Front</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_DEAD_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_DEAD_FRONT(5, "padmountDeadFront", "padmountDeadFront"),

	/**
	 * The '<em><b>Padmounted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNTED_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNTED(6, "padmounted", "padmounted"),

	/**
	 * The '<em><b>Three Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_PHASE(7, "threePhase", "threePhase"),

	/**
	 * The '<em><b>Padmount Live Front</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LIVE_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_LIVE_FRONT(8, "padmountLiveFront", "padmountLiveFront"),

	/**
	 * The '<em><b>Overhead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERHEAD_VALUE
	 * @generated
	 * @ordered
	 */
	OVERHEAD(9, "overhead", "overhead"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(10, "unknown", "unknown"),

	/**
	 * The '<em><b>Vault Three Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAULT_THREE_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	VAULT_THREE_PHASE(11, "vaultThreePhase", "vaultThreePhase"),

	/**
	 * The '<em><b>Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(12, "network", "network"),

	/**
	 * The '<em><b>Underground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERGROUND(13, "underground", "underground"),

	/**
	 * The '<em><b>One Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_PHASE(14, "onePhase", "onePhase"),

	/**
	 * The '<em><b>Dry Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DRY_TYPE(15, "dryType", "dryType");

	/**
	 * The '<em><b>Valut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Valut</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUT
	 * @model name="valut"
	 * @generated
	 * @ordered
	 */
	public static final int VALUT_VALUE = 0;

	/**
	 * The '<em><b>Subway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subway</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBWAY
	 * @model name="subway"
	 * @generated
	 * @ordered
	 */
	public static final int SUBWAY_VALUE = 1;

	/**
	 * The '<em><b>Aerial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aerial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AERIAL
	 * @model name="aerial"
	 * @generated
	 * @ordered
	 */
	public static final int AERIAL_VALUE = 2;

	/**
	 * The '<em><b>Padmount Feed Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Feed Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_FEED_THROUGH
	 * @model name="padmountFeedThrough"
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_FEED_THROUGH_VALUE = 3;

	/**
	 * The '<em><b>Padmount Loop Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Loop Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LOOP_THROUGH
	 * @model name="padmountLoopThrough"
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_LOOP_THROUGH_VALUE = 4;

	/**
	 * The '<em><b>Padmount Dead Front</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Dead Front</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_DEAD_FRONT
	 * @model name="padmountDeadFront"
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_DEAD_FRONT_VALUE = 5;

	/**
	 * The '<em><b>Padmounted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmounted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNTED
	 * @model name="padmounted"
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNTED_VALUE = 6;

	/**
	 * The '<em><b>Three Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Three Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_PHASE
	 * @model name="threePhase"
	 * @generated
	 * @ordered
	 */
	public static final int THREE_PHASE_VALUE = 7;

	/**
	 * The '<em><b>Padmount Live Front</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Live Front</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LIVE_FRONT
	 * @model name="padmountLiveFront"
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_LIVE_FRONT_VALUE = 8;

	/**
	 * The '<em><b>Overhead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overhead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERHEAD
	 * @model name="overhead"
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_VALUE = 9;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 10;

	/**
	 * The '<em><b>Vault Three Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vault Three Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAULT_THREE_PHASE
	 * @model name="vaultThreePhase"
	 * @generated
	 * @ordered
	 */
	public static final int VAULT_THREE_PHASE_VALUE = 11;

	/**
	 * The '<em><b>Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Network</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK
	 * @model name="network"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 12;

	/**
	 * The '<em><b>Underground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underground</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND
	 * @model name="underground"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_VALUE = 13;

	/**
	 * The '<em><b>One Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_PHASE
	 * @model name="onePhase"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_PHASE_VALUE = 14;

	/**
	 * The '<em><b>Dry Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dry Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRY_TYPE
	 * @model name="dryType"
	 * @generated
	 * @ordered
	 */
	public static final int DRY_TYPE_VALUE = 15;

	/**
	 * An array of all the '<em><b>Transformer Construction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransformerConstructionKind[] VALUES_ARRAY =
		new TransformerConstructionKind[] {
			VALUT,
			SUBWAY,
			AERIAL,
			PADMOUNT_FEED_THROUGH,
			PADMOUNT_LOOP_THROUGH,
			PADMOUNT_DEAD_FRONT,
			PADMOUNTED,
			THREE_PHASE,
			PADMOUNT_LIVE_FRONT,
			OVERHEAD,
			UNKNOWN,
			VAULT_THREE_PHASE,
			NETWORK,
			UNDERGROUND,
			ONE_PHASE,
			DRY_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Transformer Construction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransformerConstructionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transformer Construction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformerConstructionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformerConstructionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformer Construction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformerConstructionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformerConstructionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformer Construction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformerConstructionKind get(int value) {
		switch (value) {
			case VALUT_VALUE: return VALUT;
			case SUBWAY_VALUE: return SUBWAY;
			case AERIAL_VALUE: return AERIAL;
			case PADMOUNT_FEED_THROUGH_VALUE: return PADMOUNT_FEED_THROUGH;
			case PADMOUNT_LOOP_THROUGH_VALUE: return PADMOUNT_LOOP_THROUGH;
			case PADMOUNT_DEAD_FRONT_VALUE: return PADMOUNT_DEAD_FRONT;
			case PADMOUNTED_VALUE: return PADMOUNTED;
			case THREE_PHASE_VALUE: return THREE_PHASE;
			case PADMOUNT_LIVE_FRONT_VALUE: return PADMOUNT_LIVE_FRONT;
			case OVERHEAD_VALUE: return OVERHEAD;
			case UNKNOWN_VALUE: return UNKNOWN;
			case VAULT_THREE_PHASE_VALUE: return VAULT_THREE_PHASE;
			case NETWORK_VALUE: return NETWORK;
			case UNDERGROUND_VALUE: return UNDERGROUND;
			case ONE_PHASE_VALUE: return ONE_PHASE;
			case DRY_TYPE_VALUE: return DRY_TYPE;
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
	private TransformerConstructionKind(int value, String name, String literal) {
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
	
} //TransformerConstructionKind
