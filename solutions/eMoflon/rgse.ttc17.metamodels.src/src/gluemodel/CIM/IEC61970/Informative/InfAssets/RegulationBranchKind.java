/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regulation Branch Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getRegulationBranchKind()
 * @model
 * @generated
 */
public enum RegulationBranchKind implements Enumerator {
	/**
	 * The '<em><b>Sectionner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTIONNER_VALUE
	 * @generated
	 * @ordered
	 */
	SECTIONNER(0, "sectionner", "sectionner"),

	/**
	 * The '<em><b>Breaker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	BREAKER(1, "breaker", "breaker"),

	/**
	 * The '<em><b>Transformer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMER(2, "transformer", "transformer"),

	/**
	 * The '<em><b>Recloser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECLOSER_VALUE
	 * @generated
	 * @ordered
	 */
	RECLOSER(3, "recloser", "recloser"),

	/**
	 * The '<em><b>Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCH(4, "switch", "switch"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other"),

	/**
	 * The '<em><b>Fuse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUSE_VALUE
	 * @generated
	 * @ordered
	 */
	FUSE(6, "fuse", "fuse"),

	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(7, "line", "line");

	/**
	 * The '<em><b>Sectionner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sectionner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECTIONNER
	 * @model name="sectionner"
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONNER_VALUE = 0;

	/**
	 * The '<em><b>Breaker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Breaker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAKER
	 * @model name="breaker"
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_VALUE = 1;

	/**
	 * The '<em><b>Transformer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transformer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMER
	 * @model name="transformer"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_VALUE = 2;

	/**
	 * The '<em><b>Recloser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recloser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECLOSER
	 * @model name="recloser"
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_VALUE = 3;

	/**
	 * The '<em><b>Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCH
	 * @model name="switch"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_VALUE = 4;

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
	public static final int OTHER_VALUE = 5;

	/**
	 * The '<em><b>Fuse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fuse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUSE
	 * @model name="fuse"
	 * @generated
	 * @ordered
	 */
	public static final int FUSE_VALUE = 6;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model name="line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Regulation Branch Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegulationBranchKind[] VALUES_ARRAY =
		new RegulationBranchKind[] {
			SECTIONNER,
			BREAKER,
			TRANSFORMER,
			RECLOSER,
			SWITCH,
			OTHER,
			FUSE,
			LINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Regulation Branch Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegulationBranchKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Regulation Branch Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegulationBranchKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegulationBranchKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regulation Branch Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegulationBranchKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegulationBranchKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regulation Branch Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegulationBranchKind get(int value) {
		switch (value) {
			case SECTIONNER_VALUE: return SECTIONNER;
			case BREAKER_VALUE: return BREAKER;
			case TRANSFORMER_VALUE: return TRANSFORMER;
			case RECLOSER_VALUE: return RECLOSER;
			case SWITCH_VALUE: return SWITCH;
			case OTHER_VALUE: return OTHER;
			case FUSE_VALUE: return FUSE;
			case LINE_VALUE: return LINE;
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
	private RegulationBranchKind(int value, String name, String literal) {
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
	
} //RegulationBranchKind
