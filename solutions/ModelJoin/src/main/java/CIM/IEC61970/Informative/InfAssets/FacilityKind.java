/**
 */
package CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Facility Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFacilityKind()
 * @model
 * @generated
 */
public enum FacilityKind implements Enumerator {
	/**
	 * The '<em><b>Generation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATION(0, "generation", "generation"),

	/**
	 * The '<em><b>Building</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILDING_VALUE
	 * @generated
	 * @ordered
	 */
	BUILDING(1, "building", "building"),

	/**
	 * The '<em><b>Plant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANT_VALUE
	 * @generated
	 * @ordered
	 */
	PLANT(2, "plant", "plant"),

	/**
	 * The '<em><b>Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE(3, "storage", "storage"),

	/**
	 * The '<em><b>Switching</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCHING_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCHING(4, "switching", "switching");

	/**
	 * The '<em><b>Generation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATION
	 * @model name="generation"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATION_VALUE = 0;

	/**
	 * The '<em><b>Building</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Building</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILDING
	 * @model name="building"
	 * @generated
	 * @ordered
	 */
	public static final int BUILDING_VALUE = 1;

	/**
	 * The '<em><b>Plant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLANT
	 * @model name="plant"
	 * @generated
	 * @ordered
	 */
	public static final int PLANT_VALUE = 2;

	/**
	 * The '<em><b>Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @model name="storage"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VALUE = 3;

	/**
	 * The '<em><b>Switching</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Switching</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCHING
	 * @model name="switching"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Facility Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FacilityKind[] VALUES_ARRAY =
		new FacilityKind[] {
			GENERATION,
			BUILDING,
			PLANT,
			STORAGE,
			SWITCHING,
		};

	/**
	 * A public read-only list of all the '<em><b>Facility Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FacilityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Facility Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FacilityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FacilityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Facility Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FacilityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FacilityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Facility Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FacilityKind get(int value) {
		switch (value) {
			case GENERATION_VALUE: return GENERATION;
			case BUILDING_VALUE: return BUILDING;
			case PLANT_VALUE: return PLANT;
			case STORAGE_VALUE: return STORAGE;
			case SWITCHING_VALUE: return SWITCHING;
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
	private FacilityKind(int value, String name, String literal) {
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
	
} //FacilityKind
