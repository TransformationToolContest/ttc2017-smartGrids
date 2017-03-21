/**
 */
package CIM.IEC61968.AssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cable Shield Material Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getCableShieldMaterialKind()
 * @model
 * @generated
 */
public enum CableShieldMaterialKind implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "other", "other"),

	/**
	 * The '<em><b>Lead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAD_VALUE
	 * @generated
	 * @ordered
	 */
	LEAD(1, "lead", "lead"),

	/**
	 * The '<em><b>Steel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEEL_VALUE
	 * @generated
	 * @ordered
	 */
	STEEL(2, "steel", "steel"),

	/**
	 * The '<em><b>Aluminum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALUMINUM_VALUE
	 * @generated
	 * @ordered
	 */
	ALUMINUM(3, "aluminum", "aluminum"),

	/**
	 * The '<em><b>Copper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPPER_VALUE
	 * @generated
	 * @ordered
	 */
	COPPER(4, "copper", "copper");

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
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Lead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAD
	 * @model name="lead"
	 * @generated
	 * @ordered
	 */
	public static final int LEAD_VALUE = 1;

	/**
	 * The '<em><b>Steel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Steel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEEL
	 * @model name="steel"
	 * @generated
	 * @ordered
	 */
	public static final int STEEL_VALUE = 2;

	/**
	 * The '<em><b>Aluminum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aluminum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALUMINUM
	 * @model name="aluminum"
	 * @generated
	 * @ordered
	 */
	public static final int ALUMINUM_VALUE = 3;

	/**
	 * The '<em><b>Copper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPPER
	 * @model name="copper"
	 * @generated
	 * @ordered
	 */
	public static final int COPPER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cable Shield Material Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CableShieldMaterialKind[] VALUES_ARRAY =
		new CableShieldMaterialKind[] {
			OTHER,
			LEAD,
			STEEL,
			ALUMINUM,
			COPPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Cable Shield Material Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CableShieldMaterialKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cable Shield Material Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CableShieldMaterialKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableShieldMaterialKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Shield Material Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CableShieldMaterialKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableShieldMaterialKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Shield Material Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CableShieldMaterialKind get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case LEAD_VALUE: return LEAD;
			case STEEL_VALUE: return STEEL;
			case ALUMINUM_VALUE: return ALUMINUM;
			case COPPER_VALUE: return COPPER;
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
	private CableShieldMaterialKind(int value, String name, String literal) {
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
	
} //CableShieldMaterialKind
