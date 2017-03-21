/**
 */
package CIM.IEC61970.Generation.Production;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Emission Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionType()
 * @model
 * @generated
 */
public enum EmissionType implements Enumerator {
	/**
	 * The '<em><b>Chlorine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHLORINE_VALUE
	 * @generated
	 * @ordered
	 */
	CHLORINE(0, "chlorine", "chlorine"),

	/**
	 * The '<em><b>Nitrogen Oxide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NITROGEN_OXIDE_VALUE
	 * @generated
	 * @ordered
	 */
	NITROGEN_OXIDE(1, "nitrogenOxide", "nitrogenOxide"),

	/**
	 * The '<em><b>Carbon Dioxide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBON_DIOXIDE_VALUE
	 * @generated
	 * @ordered
	 */
	CARBON_DIOXIDE(2, "carbonDioxide", "carbonDioxide"),

	/**
	 * The '<em><b>Hydrogen Sulfide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYDROGEN_SULFIDE_VALUE
	 * @generated
	 * @ordered
	 */
	HYDROGEN_SULFIDE(3, "hydrogenSulfide", "hydrogenSulfide"),

	/**
	 * The '<em><b>Sulfur Dioxide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SULFUR_DIOXIDE_VALUE
	 * @generated
	 * @ordered
	 */
	SULFUR_DIOXIDE(4, "sulfurDioxide", "sulfurDioxide"),

	/**
	 * The '<em><b>Carbon Disulfide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBON_DISULFIDE_VALUE
	 * @generated
	 * @ordered
	 */
	CARBON_DISULFIDE(5, "carbonDisulfide", "carbonDisulfide");

	/**
	 * The '<em><b>Chlorine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chlorine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHLORINE
	 * @model name="chlorine"
	 * @generated
	 * @ordered
	 */
	public static final int CHLORINE_VALUE = 0;

	/**
	 * The '<em><b>Nitrogen Oxide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nitrogen Oxide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NITROGEN_OXIDE
	 * @model name="nitrogenOxide"
	 * @generated
	 * @ordered
	 */
	public static final int NITROGEN_OXIDE_VALUE = 1;

	/**
	 * The '<em><b>Carbon Dioxide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carbon Dioxide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARBON_DIOXIDE
	 * @model name="carbonDioxide"
	 * @generated
	 * @ordered
	 */
	public static final int CARBON_DIOXIDE_VALUE = 2;

	/**
	 * The '<em><b>Hydrogen Sulfide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hydrogen Sulfide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYDROGEN_SULFIDE
	 * @model name="hydrogenSulfide"
	 * @generated
	 * @ordered
	 */
	public static final int HYDROGEN_SULFIDE_VALUE = 3;

	/**
	 * The '<em><b>Sulfur Dioxide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sulfur Dioxide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SULFUR_DIOXIDE
	 * @model name="sulfurDioxide"
	 * @generated
	 * @ordered
	 */
	public static final int SULFUR_DIOXIDE_VALUE = 4;

	/**
	 * The '<em><b>Carbon Disulfide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carbon Disulfide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARBON_DISULFIDE
	 * @model name="carbonDisulfide"
	 * @generated
	 * @ordered
	 */
	public static final int CARBON_DISULFIDE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Emission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EmissionType[] VALUES_ARRAY =
		new EmissionType[] {
			CHLORINE,
			NITROGEN_OXIDE,
			CARBON_DIOXIDE,
			HYDROGEN_SULFIDE,
			SULFUR_DIOXIDE,
			CARBON_DISULFIDE,
		};

	/**
	 * A public read-only list of all the '<em><b>Emission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EmissionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Emission Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmissionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EmissionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Emission Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmissionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EmissionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Emission Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EmissionType get(int value) {
		switch (value) {
			case CHLORINE_VALUE: return CHLORINE;
			case NITROGEN_OXIDE_VALUE: return NITROGEN_OXIDE;
			case CARBON_DIOXIDE_VALUE: return CARBON_DIOXIDE;
			case HYDROGEN_SULFIDE_VALUE: return HYDROGEN_SULFIDE;
			case SULFUR_DIOXIDE_VALUE: return SULFUR_DIOXIDE;
			case CARBON_DISULFIDE_VALUE: return CARBON_DISULFIDE;
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
	private EmissionType(int value, String name, String literal) {
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
	
} //EmissionType
