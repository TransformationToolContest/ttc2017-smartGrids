/**
 */
package substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ctl Models Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see substationStandard.Enumerations.EnumerationsPackage#getCtlModelsKind()
 * @model
 * @generated
 */
public enum CtlModelsKind implements Enumerator {
	/**
	 * The '<em><b>Status Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_ONLY(0, "statusOnly", "statusOnly"),

	/**
	 * The '<em><b>Direct With Normal Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_WITH_NORMAL_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_WITH_NORMAL_SECURITY(0, "directWithNormalSecurity", "directWithNormalSecurity"),

	/**
	 * The '<em><b>Sbo With Normal Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SBO_WITH_NORMAL_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SBO_WITH_NORMAL_SECURITY(0, "sboWithNormalSecurity", "sboWithNormalSecurity"),

	/**
	 * The '<em><b>Direct With Enhanced Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_WITH_ENHANCED_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_WITH_ENHANCED_SECURITY(0, "directWithEnhancedSecurity", "directWithEnhancedSecurity"),

	/**
	 * The '<em><b>Sbo With Enhanced Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SBO_WITH_ENHANCED_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SBO_WITH_ENHANCED_SECURITY(0, "sboWithEnhancedSecurity", "sboWithEnhancedSecurity");

	/**
	 * The '<em><b>Status Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Status Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS_ONLY
	 * @model name="statusOnly"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Direct With Normal Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Direct With Normal Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECT_WITH_NORMAL_SECURITY
	 * @model name="directWithNormalSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_WITH_NORMAL_SECURITY_VALUE = 0;

	/**
	 * The '<em><b>Sbo With Normal Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sbo With Normal Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SBO_WITH_NORMAL_SECURITY
	 * @model name="sboWithNormalSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int SBO_WITH_NORMAL_SECURITY_VALUE = 0;

	/**
	 * The '<em><b>Direct With Enhanced Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Direct With Enhanced Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECT_WITH_ENHANCED_SECURITY
	 * @model name="directWithEnhancedSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_WITH_ENHANCED_SECURITY_VALUE = 0;

	/**
	 * The '<em><b>Sbo With Enhanced Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sbo With Enhanced Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SBO_WITH_ENHANCED_SECURITY
	 * @model name="sboWithEnhancedSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int SBO_WITH_ENHANCED_SECURITY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Ctl Models Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CtlModelsKind[] VALUES_ARRAY =
		new CtlModelsKind[] {
			STATUS_ONLY,
			DIRECT_WITH_NORMAL_SECURITY,
			SBO_WITH_NORMAL_SECURITY,
			DIRECT_WITH_ENHANCED_SECURITY,
			SBO_WITH_ENHANCED_SECURITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Ctl Models Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CtlModelsKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ctl Models Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtlModelsKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtlModelsKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ctl Models Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtlModelsKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtlModelsKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ctl Models Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtlModelsKind get(int value) {
		switch (value) {
			case STATUS_ONLY_VALUE: return STATUS_ONLY;
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
	private CtlModelsKind(int value, String name, String literal) {
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
	
} //CtlModelsKind
