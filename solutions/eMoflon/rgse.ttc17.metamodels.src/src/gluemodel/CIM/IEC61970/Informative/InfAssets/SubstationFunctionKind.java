/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Substation Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSubstationFunctionKind()
 * @model
 * @generated
 */
public enum SubstationFunctionKind implements Enumerator {
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
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "other", "other"),

	/**
	 * The '<em><b>Industrial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INDUSTRIAL(2, "industrial", "industrial"),

	/**
	 * The '<em><b>Transmission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION(3, "transmission", "transmission"),

	/**
	 * The '<em><b>Sub Transmission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_TRANSMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_TRANSMISSION(4, "subTransmission", "subTransmission"),

	/**
	 * The '<em><b>Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION(5, "distribution", "distribution");

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
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Industrial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Industrial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL
	 * @model name="industrial"
	 * @generated
	 * @ordered
	 */
	public static final int INDUSTRIAL_VALUE = 2;

	/**
	 * The '<em><b>Transmission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION
	 * @model name="transmission"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_VALUE = 3;

	/**
	 * The '<em><b>Sub Transmission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sub Transmission</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUB_TRANSMISSION
	 * @model name="subTransmission"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_TRANSMISSION_VALUE = 4;

	/**
	 * The '<em><b>Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distribution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION
	 * @model name="distribution"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Substation Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubstationFunctionKind[] VALUES_ARRAY =
		new SubstationFunctionKind[] {
			GENERATION,
			OTHER,
			INDUSTRIAL,
			TRANSMISSION,
			SUB_TRANSMISSION,
			DISTRIBUTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Substation Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubstationFunctionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Substation Function Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubstationFunctionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubstationFunctionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Substation Function Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubstationFunctionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubstationFunctionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Substation Function Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SubstationFunctionKind get(int value) {
		switch (value) {
			case GENERATION_VALUE: return GENERATION;
			case OTHER_VALUE: return OTHER;
			case INDUSTRIAL_VALUE: return INDUSTRIAL;
			case TRANSMISSION_VALUE: return TRANSMISSION;
			case SUB_TRANSMISSION_VALUE: return SUB_TRANSMISSION;
			case DISTRIBUTION_VALUE: return DISTRIBUTION;
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
	private SubstationFunctionKind(int value, String name, String literal) {
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
	
} //SubstationFunctionKind
