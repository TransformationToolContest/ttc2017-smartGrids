/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transformer Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerFunctionKind()
 * @model
 * @generated
 */
public enum TransformerFunctionKind implements Enumerator {
	/**
	 * The '<em><b>Autotransformer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOTRANSFORMER_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOTRANSFORMER(0, "autotransformer", "autotransformer"),

	/**
	 * The '<em><b>Secondary Transformer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_TRANSFORMER_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY_TRANSFORMER(1, "secondaryTransformer", "secondaryTransformer"),

	/**
	 * The '<em><b>Voltage Regulator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_REGULATOR_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE_REGULATOR(2, "voltageRegulator", "voltageRegulator"),

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
	 * The '<em><b>Power Transformer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_TRANSFORMER_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_TRANSFORMER(4, "powerTransformer", "powerTransformer");

	/**
	 * The '<em><b>Autotransformer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autotransformer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOTRANSFORMER
	 * @model name="autotransformer"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOTRANSFORMER_VALUE = 0;

	/**
	 * The '<em><b>Secondary Transformer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secondary Transformer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_TRANSFORMER
	 * @model name="secondaryTransformer"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_TRANSFORMER_VALUE = 1;

	/**
	 * The '<em><b>Voltage Regulator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage Regulator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_REGULATOR
	 * @model name="voltageRegulator"
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_REGULATOR_VALUE = 2;

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
	 * The '<em><b>Power Transformer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Transformer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_TRANSFORMER
	 * @model name="powerTransformer"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Transformer Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransformerFunctionKind[] VALUES_ARRAY =
		new TransformerFunctionKind[] {
			AUTOTRANSFORMER,
			SECONDARY_TRANSFORMER,
			VOLTAGE_REGULATOR,
			OTHER,
			POWER_TRANSFORMER,
		};

	/**
	 * A public read-only list of all the '<em><b>Transformer Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransformerFunctionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transformer Function Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformerFunctionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformerFunctionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformer Function Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformerFunctionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformerFunctionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformer Function Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformerFunctionKind get(int value) {
		switch (value) {
			case AUTOTRANSFORMER_VALUE: return AUTOTRANSFORMER;
			case SECONDARY_TRANSFORMER_VALUE: return SECONDARY_TRANSFORMER;
			case VOLTAGE_REGULATOR_VALUE: return VOLTAGE_REGULATOR;
			case OTHER_VALUE: return OTHER;
			case POWER_TRANSFORMER_VALUE: return POWER_TRANSFORMER;
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
	private TransformerFunctionKind(int value, String name, String literal) {
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
	
} //TransformerFunctionKind
