/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Composite Switch Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchKind()
 * @model
 * @generated
 */
public enum CompositeSwitchKind implements Enumerator {
	/**
	 * The '<em><b>Regulator Bypass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULATOR_BYPASS_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATOR_BYPASS(0, "regulatorBypass", "regulatorBypass"),

	/**
	 * The '<em><b>Throw Over</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THROW_OVER_VALUE
	 * @generated
	 * @ordered
	 */
	THROW_OVER(1, "throwOver", "throwOver"),

	/**
	 * The '<em><b>Ug Multi Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UG_MULTI_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	UG_MULTI_SWITCH(2, "ugMultiSwitch", "ugMultiSwitch"),

	/**
	 * The '<em><b>Gral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAL_VALUE
	 * @generated
	 * @ordered
	 */
	GRAL(3, "gral", "gral"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other"),

	/**
	 * The '<em><b>Esco Throw Over</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCO_THROW_OVER_VALUE
	 * @generated
	 * @ordered
	 */
	ESCO_THROW_OVER(5, "escoThrowOver", "escoThrowOver"),

	/**
	 * The '<em><b>Ral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAL_VALUE
	 * @generated
	 * @ordered
	 */
	RAL(6, "ral", "ral");

	/**
	 * The '<em><b>Regulator Bypass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regulator Bypass</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULATOR_BYPASS
	 * @model name="regulatorBypass"
	 * @generated
	 * @ordered
	 */
	public static final int REGULATOR_BYPASS_VALUE = 0;

	/**
	 * The '<em><b>Throw Over</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Throw Over</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THROW_OVER
	 * @model name="throwOver"
	 * @generated
	 * @ordered
	 */
	public static final int THROW_OVER_VALUE = 1;

	/**
	 * The '<em><b>Ug Multi Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ug Multi Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UG_MULTI_SWITCH
	 * @model name="ugMultiSwitch"
	 * @generated
	 * @ordered
	 */
	public static final int UG_MULTI_SWITCH_VALUE = 2;

	/**
	 * The '<em><b>Gral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAL
	 * @model name="gral"
	 * @generated
	 * @ordered
	 */
	public static final int GRAL_VALUE = 3;

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
	public static final int OTHER_VALUE = 4;

	/**
	 * The '<em><b>Esco Throw Over</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Esco Throw Over</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESCO_THROW_OVER
	 * @model name="escoThrowOver"
	 * @generated
	 * @ordered
	 */
	public static final int ESCO_THROW_OVER_VALUE = 5;

	/**
	 * The '<em><b>Ral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAL
	 * @model name="ral"
	 * @generated
	 * @ordered
	 */
	public static final int RAL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Composite Switch Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompositeSwitchKind[] VALUES_ARRAY =
		new CompositeSwitchKind[] {
			REGULATOR_BYPASS,
			THROW_OVER,
			UG_MULTI_SWITCH,
			GRAL,
			OTHER,
			ESCO_THROW_OVER,
			RAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Composite Switch Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompositeSwitchKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Composite Switch Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositeSwitchKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositeSwitchKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composite Switch Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositeSwitchKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositeSwitchKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composite Switch Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositeSwitchKind get(int value) {
		switch (value) {
			case REGULATOR_BYPASS_VALUE: return REGULATOR_BYPASS;
			case THROW_OVER_VALUE: return THROW_OVER;
			case UG_MULTI_SWITCH_VALUE: return UG_MULTI_SWITCH;
			case GRAL_VALUE: return GRAL;
			case OTHER_VALUE: return OTHER;
			case ESCO_THROW_OVER_VALUE: return ESCO_THROW_OVER;
			case RAL_VALUE: return RAL;
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
	private CompositeSwitchKind(int value, String name, String literal) {
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
	
} //CompositeSwitchKind
