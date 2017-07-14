/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cable Shield Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getCableShieldKind()
 * @model
 * @generated
 */
public enum CableShieldKind implements Enumerator {
	/**
	 * The '<em><b>Superclean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERCLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERCLEAN(0, "superclean", "superclean"),

	/**
	 * The '<em><b>Supersmooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERSMOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERSMOOTH(1, "supersmooth", "supersmooth"),

	/**
	 * The '<em><b>Conventional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVENTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONVENTIONAL(2, "conventional", "conventional"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other"),

	/**
	 * The '<em><b>Free Form</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_FORM_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_FORM(4, "freeForm", "freeForm");

	/**
	 * The '<em><b>Superclean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Superclean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERCLEAN
	 * @model name="superclean"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERCLEAN_VALUE = 0;

	/**
	 * The '<em><b>Supersmooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supersmooth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERSMOOTH
	 * @model name="supersmooth"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERSMOOTH_VALUE = 1;

	/**
	 * The '<em><b>Conventional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conventional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONVENTIONAL
	 * @model name="conventional"
	 * @generated
	 * @ordered
	 */
	public static final int CONVENTIONAL_VALUE = 2;

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
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>Free Form</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Free Form</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE_FORM
	 * @model name="freeForm"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_FORM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cable Shield Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CableShieldKind[] VALUES_ARRAY =
		new CableShieldKind[] {
			SUPERCLEAN,
			SUPERSMOOTH,
			CONVENTIONAL,
			OTHER,
			FREE_FORM,
		};

	/**
	 * A public read-only list of all the '<em><b>Cable Shield Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CableShieldKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cable Shield Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CableShieldKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableShieldKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Shield Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CableShieldKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableShieldKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Shield Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CableShieldKind get(int value) {
		switch (value) {
			case SUPERCLEAN_VALUE: return SUPERCLEAN;
			case SUPERSMOOTH_VALUE: return SUPERSMOOTH;
			case CONVENTIONAL_VALUE: return CONVENTIONAL;
			case OTHER_VALUE: return OTHER;
			case FREE_FORM_VALUE: return FREE_FORM;
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
	private CableShieldKind(int value, String name, String literal) {
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
	
} //CableShieldKind
