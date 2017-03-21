/**
 */
package CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Underground Structure Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureKind()
 * @model
 * @generated
 */
public enum UndergroundStructureKind implements Enumerator {
	/**
	 * The '<em><b>Trench</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	TRENCH(0, "trench", "trench"),

	/**
	 * The '<em><b>Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	ENCLOSURE(1, "enclosure", "enclosure"),

	/**
	 * The '<em><b>Pad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAD_VALUE
	 * @generated
	 * @ordered
	 */
	PAD(2, "pad", "pad"),

	/**
	 * The '<em><b>Burd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURD_VALUE
	 * @generated
	 * @ordered
	 */
	BURD(3, "burd", "burd"),

	/**
	 * The '<em><b>Pullbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULLBOX_VALUE
	 * @generated
	 * @ordered
	 */
	PULLBOX(4, "pullbox", "pullbox"),

	/**
	 * The '<em><b>Subsurface Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSURFACE_ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSURFACE_ENCLOSURE(5, "subsurfaceEnclosure", "subsurfaceEnclosure"),

	/**
	 * The '<em><b>Tunnel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNNEL_VALUE
	 * @generated
	 * @ordered
	 */
	TUNNEL(6, "tunnel", "tunnel"),

	/**
	 * The '<em><b>Manhole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	MANHOLE(7, "manhole", "manhole"),

	/**
	 * The '<em><b>Vault</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAULT_VALUE
	 * @generated
	 * @ordered
	 */
	VAULT(8, "vault", "vault"),

	/**
	 * The '<em><b>Handhole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	HANDHOLE(9, "handhole", "handhole");

	/**
	 * The '<em><b>Trench</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trench</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRENCH
	 * @model name="trench"
	 * @generated
	 * @ordered
	 */
	public static final int TRENCH_VALUE = 0;

	/**
	 * The '<em><b>Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCLOSURE
	 * @model name="enclosure"
	 * @generated
	 * @ordered
	 */
	public static final int ENCLOSURE_VALUE = 1;

	/**
	 * The '<em><b>Pad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAD
	 * @model name="pad"
	 * @generated
	 * @ordered
	 */
	public static final int PAD_VALUE = 2;

	/**
	 * The '<em><b>Burd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Burd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BURD
	 * @model name="burd"
	 * @generated
	 * @ordered
	 */
	public static final int BURD_VALUE = 3;

	/**
	 * The '<em><b>Pullbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pullbox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PULLBOX
	 * @model name="pullbox"
	 * @generated
	 * @ordered
	 */
	public static final int PULLBOX_VALUE = 4;

	/**
	 * The '<em><b>Subsurface Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subsurface Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSURFACE_ENCLOSURE
	 * @model name="subsurfaceEnclosure"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSURFACE_ENCLOSURE_VALUE = 5;

	/**
	 * The '<em><b>Tunnel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tunnel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNNEL
	 * @model name="tunnel"
	 * @generated
	 * @ordered
	 */
	public static final int TUNNEL_VALUE = 6;

	/**
	 * The '<em><b>Manhole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manhole</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANHOLE
	 * @model name="manhole"
	 * @generated
	 * @ordered
	 */
	public static final int MANHOLE_VALUE = 7;

	/**
	 * The '<em><b>Vault</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vault</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAULT
	 * @model name="vault"
	 * @generated
	 * @ordered
	 */
	public static final int VAULT_VALUE = 8;

	/**
	 * The '<em><b>Handhole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Handhole</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HANDHOLE
	 * @model name="handhole"
	 * @generated
	 * @ordered
	 */
	public static final int HANDHOLE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Underground Structure Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UndergroundStructureKind[] VALUES_ARRAY =
		new UndergroundStructureKind[] {
			TRENCH,
			ENCLOSURE,
			PAD,
			BURD,
			PULLBOX,
			SUBSURFACE_ENCLOSURE,
			TUNNEL,
			MANHOLE,
			VAULT,
			HANDHOLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Underground Structure Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UndergroundStructureKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Underground Structure Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UndergroundStructureKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UndergroundStructureKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Underground Structure Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UndergroundStructureKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UndergroundStructureKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Underground Structure Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UndergroundStructureKind get(int value) {
		switch (value) {
			case TRENCH_VALUE: return TRENCH;
			case ENCLOSURE_VALUE: return ENCLOSURE;
			case PAD_VALUE: return PAD;
			case BURD_VALUE: return BURD;
			case PULLBOX_VALUE: return PULLBOX;
			case SUBSURFACE_ENCLOSURE_VALUE: return SUBSURFACE_ENCLOSURE;
			case TUNNEL_VALUE: return TUNNEL;
			case MANHOLE_VALUE: return MANHOLE;
			case VAULT_VALUE: return VAULT;
			case HANDHOLE_VALUE: return HANDHOLE;
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
	private UndergroundStructureKind(int value, String name, String literal) {
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
	
} //UndergroundStructureKind
