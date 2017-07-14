/**
 */
package gluemodel.substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Live Dead Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.Enumerations.EnumerationsPackage#getLiveDeadModeKind()
 * @model
 * @generated
 */
public enum LiveDeadModeKind implements Enumerator {
	/**
	 * The '<em><b>Line Live</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_LIVE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_LIVE(0, "lineLive", "lineLive"),

	/**
	 * The '<em><b>Both Dead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_DEAD(0, "bothDead", "bothDead"),

	/**
	 * The '<em><b>Bus Live</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_LIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BUS_LIVE(0, "busLive", "busLive"),

	/**
	 * The '<em><b>Both Dead Or Line Live</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_OR_LINE_LIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_DEAD_OR_LINE_LIVE(0, "bothDeadOrLineLive", "bothDeadOrLineLive"),

	/**
	 * The '<em><b>Both Dead Or Bus Live</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_OR_BUS_LIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_DEAD_OR_BUS_LIVE(0, "bothDeadOrBusLive", "bothDeadOrBusLive"),

	/**
	 * The '<em><b>Line Live Bus Dead Or Bus Live Line Dead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_LIVE_BUS_DEAD_OR_BUS_LIVE_LINE_DEAD_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_LIVE_BUS_DEAD_OR_BUS_LIVE_LINE_DEAD(0, "lineLiveBusDeadOrBusLiveLineDead", "lineLiveBusDeadOrBusLiveLineDead"),

	/**
	 * The '<em><b>Both Dead Or Only One Live</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_OR_ONLY_ONE_LIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH_DEAD_OR_ONLY_ONE_LIVE(0, "bothDeadOrOnlyOneLive", "bothDeadOrOnlyOneLive");

	/**
	 * The '<em><b>Line Live</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Live</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_LIVE
	 * @model name="lineLive"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_LIVE_VALUE = 0;

	/**
	 * The '<em><b>Both Dead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both Dead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD
	 * @model name="bothDead"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_DEAD_VALUE = 0;

	/**
	 * The '<em><b>Bus Live</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bus Live</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUS_LIVE
	 * @model name="busLive"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_LIVE_VALUE = 0;

	/**
	 * The '<em><b>Both Dead Or Line Live</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both Dead Or Line Live</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_OR_LINE_LIVE
	 * @model name="bothDeadOrLineLive"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_DEAD_OR_LINE_LIVE_VALUE = 0;

	/**
	 * The '<em><b>Both Dead Or Bus Live</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both Dead Or Bus Live</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_OR_BUS_LIVE
	 * @model name="bothDeadOrBusLive"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_DEAD_OR_BUS_LIVE_VALUE = 0;

	/**
	 * The '<em><b>Line Live Bus Dead Or Bus Live Line Dead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Live Bus Dead Or Bus Live Line Dead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_LIVE_BUS_DEAD_OR_BUS_LIVE_LINE_DEAD
	 * @model name="lineLiveBusDeadOrBusLiveLineDead"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_LIVE_BUS_DEAD_OR_BUS_LIVE_LINE_DEAD_VALUE = 0;

	/**
	 * The '<em><b>Both Dead Or Only One Live</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both Dead Or Only One Live</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_DEAD_OR_ONLY_ONE_LIVE
	 * @model name="bothDeadOrOnlyOneLive"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_DEAD_OR_ONLY_ONE_LIVE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Live Dead Mode Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LiveDeadModeKind[] VALUES_ARRAY =
		new LiveDeadModeKind[] {
			LINE_LIVE,
			BOTH_DEAD,
			BUS_LIVE,
			BOTH_DEAD_OR_LINE_LIVE,
			BOTH_DEAD_OR_BUS_LIVE,
			LINE_LIVE_BUS_DEAD_OR_BUS_LIVE_LINE_DEAD,
			BOTH_DEAD_OR_ONLY_ONE_LIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Live Dead Mode Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LiveDeadModeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Live Dead Mode Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LiveDeadModeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiveDeadModeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Live Dead Mode Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LiveDeadModeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiveDeadModeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Live Dead Mode Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LiveDeadModeKind get(int value) {
		switch (value) {
			case LINE_LIVE_VALUE: return LINE_LIVE;
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
	private LiveDeadModeKind(int value, String name, String literal) {
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
	
} //LiveDeadModeKind
