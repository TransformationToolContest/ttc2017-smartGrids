/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Phase Angle Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL1toUL2 <em>From UL 1to UL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL1toUL3 <em>From UL 1to UL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL1toIL1 <em>From UL 1to IL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL1toIL2 <em>From UL 1to IL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL1toIL3 <em>From UL 1to IL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL1toIL0 <em>From UL 1to IL0</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL2toUL1 <em>From UL 2to UL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL2toUL3 <em>From UL 2to UL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL2toIL1 <em>From UL 2to IL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL2toIL2 <em>From UL 2to IL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL2toIL3 <em>From UL 2to IL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL2toIL0 <em>From UL 2to IL0</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL3toUL1 <em>From UL 3to UL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL3toUL2 <em>From UL 3to UL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL3toIL1 <em>From UL 3to IL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL3toIL2 <em>From UL 3to IL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL3toIL3 <em>From UL 3to IL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromUL3toIL0 <em>From UL 3to IL0</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL1toUL1 <em>From IL 1to UL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL1toUL2 <em>From IL 1to UL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL1toUL3 <em>From IL 1to UL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL1toIL2 <em>From IL 1to IL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL1toIL3 <em>From IL 1to IL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL1toIL0 <em>From IL 1to IL0</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL2toUL1 <em>From IL 2to UL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL2toUL2 <em>From IL 2to UL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL2toUL3 <em>From IL 2to UL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL2toIL1 <em>From IL 2to IL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL2toIL3 <em>From IL 2to IL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL2toIL0 <em>From IL 2to IL0</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL3toUL1 <em>From IL 3to UL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL3toUL2 <em>From IL 3to UL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL3toUL3 <em>From IL 3to UL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL3toIL1 <em>From IL 3to IL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL3toIL2 <em>From IL 3to IL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL3toIL0 <em>From IL 3to IL0</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL0toUL1 <em>From IL 0to UL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL0toUL2 <em>From IL 0to UL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL0toUL3 <em>From IL 0to UL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL0toIL1 <em>From IL 0to IL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL0toIL2 <em>From IL 0to IL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl#getFromIL0toIL3 <em>From IL 0to IL3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedPhaseAngleMeasurementImpl extends DataImpl implements ExtendedPhaseAngleMeasurement {
	/**
	 * The default value of the '{@link #getFromUL1toUL2() <em>From UL 1to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toUL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_1TO_UL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL1toUL2() <em>From UL 1to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toUL2()
	 * @generated
	 * @ordered
	 */
	protected double fromUL1toUL2 = FROM_UL_1TO_UL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL1toUL3() <em>From UL 1to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toUL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_1TO_UL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL1toUL3() <em>From UL 1to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toUL3()
	 * @generated
	 * @ordered
	 */
	protected double fromUL1toUL3 = FROM_UL_1TO_UL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL1toIL1() <em>From UL 1to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_1TO_IL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL1toIL1() <em>From UL 1to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL1()
	 * @generated
	 * @ordered
	 */
	protected double fromUL1toIL1 = FROM_UL_1TO_IL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL1toIL2() <em>From UL 1to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_1TO_IL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL1toIL2() <em>From UL 1to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL2()
	 * @generated
	 * @ordered
	 */
	protected double fromUL1toIL2 = FROM_UL_1TO_IL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL1toIL3() <em>From UL 1to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_1TO_IL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL1toIL3() <em>From UL 1to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL3()
	 * @generated
	 * @ordered
	 */
	protected double fromUL1toIL3 = FROM_UL_1TO_IL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL1toIL0() <em>From UL 1to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL0()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_1TO_IL0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL1toIL0() <em>From UL 1to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL1toIL0()
	 * @generated
	 * @ordered
	 */
	protected double fromUL1toIL0 = FROM_UL_1TO_IL0_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL2toUL1() <em>From UL 2to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toUL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_2TO_UL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL2toUL1() <em>From UL 2to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toUL1()
	 * @generated
	 * @ordered
	 */
	protected double fromUL2toUL1 = FROM_UL_2TO_UL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL2toUL3() <em>From UL 2to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toUL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_2TO_UL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL2toUL3() <em>From UL 2to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toUL3()
	 * @generated
	 * @ordered
	 */
	protected double fromUL2toUL3 = FROM_UL_2TO_UL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL2toIL1() <em>From UL 2to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_2TO_IL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL2toIL1() <em>From UL 2to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL1()
	 * @generated
	 * @ordered
	 */
	protected double fromUL2toIL1 = FROM_UL_2TO_IL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL2toIL2() <em>From UL 2to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_2TO_IL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL2toIL2() <em>From UL 2to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL2()
	 * @generated
	 * @ordered
	 */
	protected double fromUL2toIL2 = FROM_UL_2TO_IL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL2toIL3() <em>From UL 2to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_2TO_IL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL2toIL3() <em>From UL 2to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL3()
	 * @generated
	 * @ordered
	 */
	protected double fromUL2toIL3 = FROM_UL_2TO_IL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL2toIL0() <em>From UL 2to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL0()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_2TO_IL0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL2toIL0() <em>From UL 2to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL2toIL0()
	 * @generated
	 * @ordered
	 */
	protected double fromUL2toIL0 = FROM_UL_2TO_IL0_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL3toUL1() <em>From UL 3to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toUL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_3TO_UL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL3toUL1() <em>From UL 3to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toUL1()
	 * @generated
	 * @ordered
	 */
	protected double fromUL3toUL1 = FROM_UL_3TO_UL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL3toUL2() <em>From UL 3to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toUL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_3TO_UL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL3toUL2() <em>From UL 3to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toUL2()
	 * @generated
	 * @ordered
	 */
	protected double fromUL3toUL2 = FROM_UL_3TO_UL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL3toIL1() <em>From UL 3to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_3TO_IL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL3toIL1() <em>From UL 3to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL1()
	 * @generated
	 * @ordered
	 */
	protected double fromUL3toIL1 = FROM_UL_3TO_IL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL3toIL2() <em>From UL 3to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_3TO_IL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL3toIL2() <em>From UL 3to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL2()
	 * @generated
	 * @ordered
	 */
	protected double fromUL3toIL2 = FROM_UL_3TO_IL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL3toIL3() <em>From UL 3to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_3TO_IL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL3toIL3() <em>From UL 3to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL3()
	 * @generated
	 * @ordered
	 */
	protected double fromUL3toIL3 = FROM_UL_3TO_IL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromUL3toIL0() <em>From UL 3to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL0()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_UL_3TO_IL0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromUL3toIL0() <em>From UL 3to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromUL3toIL0()
	 * @generated
	 * @ordered
	 */
	protected double fromUL3toIL0 = FROM_UL_3TO_IL0_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL1toUL1() <em>From IL 1to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toUL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_1TO_UL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL1toUL1() <em>From IL 1to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toUL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL1toUL1 = FROM_IL_1TO_UL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL1toUL2() <em>From IL 1to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toUL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_1TO_UL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL1toUL2() <em>From IL 1to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toUL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL1toUL2 = FROM_IL_1TO_UL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL1toUL3() <em>From IL 1to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toUL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_1TO_UL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL1toUL3() <em>From IL 1to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toUL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL1toUL3 = FROM_IL_1TO_UL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL1toIL2() <em>From IL 1to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_1TO_IL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL1toIL2() <em>From IL 1to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toIL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL1toIL2 = FROM_IL_1TO_IL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL1toIL3() <em>From IL 1to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_1TO_IL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL1toIL3() <em>From IL 1to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toIL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL1toIL3 = FROM_IL_1TO_IL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL1toIL0() <em>From IL 1to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toIL0()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_1TO_IL0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL1toIL0() <em>From IL 1to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL1toIL0()
	 * @generated
	 * @ordered
	 */
	protected double fromIL1toIL0 = FROM_IL_1TO_IL0_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL2toUL1() <em>From IL 2to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toUL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_2TO_UL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL2toUL1() <em>From IL 2to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toUL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL2toUL1 = FROM_IL_2TO_UL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL2toUL2() <em>From IL 2to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toUL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_2TO_UL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL2toUL2() <em>From IL 2to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toUL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL2toUL2 = FROM_IL_2TO_UL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL2toUL3() <em>From IL 2to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toUL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_2TO_UL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL2toUL3() <em>From IL 2to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toUL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL2toUL3 = FROM_IL_2TO_UL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL2toIL1() <em>From IL 2to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_2TO_IL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL2toIL1() <em>From IL 2to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toIL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL2toIL1 = FROM_IL_2TO_IL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL2toIL3() <em>From IL 2to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_2TO_IL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL2toIL3() <em>From IL 2to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toIL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL2toIL3 = FROM_IL_2TO_IL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL2toIL0() <em>From IL 2to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toIL0()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_2TO_IL0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL2toIL0() <em>From IL 2to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL2toIL0()
	 * @generated
	 * @ordered
	 */
	protected double fromIL2toIL0 = FROM_IL_2TO_IL0_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL3toUL1() <em>From IL 3to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toUL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_3TO_UL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL3toUL1() <em>From IL 3to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toUL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL3toUL1 = FROM_IL_3TO_UL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL3toUL2() <em>From IL 3to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toUL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_3TO_UL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL3toUL2() <em>From IL 3to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toUL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL3toUL2 = FROM_IL_3TO_UL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL3toUL3() <em>From IL 3to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toUL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_3TO_UL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL3toUL3() <em>From IL 3to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toUL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL3toUL3 = FROM_IL_3TO_UL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL3toIL1() <em>From IL 3to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_3TO_IL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL3toIL1() <em>From IL 3to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toIL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL3toIL1 = FROM_IL_3TO_IL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL3toIL2() <em>From IL 3to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_3TO_IL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL3toIL2() <em>From IL 3to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toIL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL3toIL2 = FROM_IL_3TO_IL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL3toIL0() <em>From IL 3to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toIL0()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_3TO_IL0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL3toIL0() <em>From IL 3to IL0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL3toIL0()
	 * @generated
	 * @ordered
	 */
	protected double fromIL3toIL0 = FROM_IL_3TO_IL0_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL0toUL1() <em>From IL 0to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toUL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_0TO_UL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL0toUL1() <em>From IL 0to UL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toUL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL0toUL1 = FROM_IL_0TO_UL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL0toUL2() <em>From IL 0to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toUL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_0TO_UL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL0toUL2() <em>From IL 0to UL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toUL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL0toUL2 = FROM_IL_0TO_UL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL0toUL3() <em>From IL 0to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toUL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_0TO_UL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL0toUL3() <em>From IL 0to UL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toUL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL0toUL3 = FROM_IL_0TO_UL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL0toIL1() <em>From IL 0to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_0TO_IL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL0toIL1() <em>From IL 0to IL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toIL1()
	 * @generated
	 * @ordered
	 */
	protected double fromIL0toIL1 = FROM_IL_0TO_IL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL0toIL2() <em>From IL 0to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_0TO_IL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL0toIL2() <em>From IL 0to IL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toIL2()
	 * @generated
	 * @ordered
	 */
	protected double fromIL0toIL2 = FROM_IL_0TO_IL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromIL0toIL3() <em>From IL 0to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double FROM_IL_0TO_IL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFromIL0toIL3() <em>From IL 0to IL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromIL0toIL3()
	 * @generated
	 * @ordered
	 */
	protected double fromIL0toIL3 = FROM_IL_0TO_IL3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedPhaseAngleMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getExtendedPhaseAngleMeasurement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL1toUL2() {
		return fromUL1toUL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL1toUL2(double newFromUL1toUL2) {
		double oldFromUL1toUL2 = fromUL1toUL2;
		fromUL1toUL2 = newFromUL1toUL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL2, oldFromUL1toUL2, fromUL1toUL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL1toUL3() {
		return fromUL1toUL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL1toUL3(double newFromUL1toUL3) {
		double oldFromUL1toUL3 = fromUL1toUL3;
		fromUL1toUL3 = newFromUL1toUL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL3, oldFromUL1toUL3, fromUL1toUL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL1toIL1() {
		return fromUL1toIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL1toIL1(double newFromUL1toIL1) {
		double oldFromUL1toIL1 = fromUL1toIL1;
		fromUL1toIL1 = newFromUL1toIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL1, oldFromUL1toIL1, fromUL1toIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL1toIL2() {
		return fromUL1toIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL1toIL2(double newFromUL1toIL2) {
		double oldFromUL1toIL2 = fromUL1toIL2;
		fromUL1toIL2 = newFromUL1toIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL2, oldFromUL1toIL2, fromUL1toIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL1toIL3() {
		return fromUL1toIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL1toIL3(double newFromUL1toIL3) {
		double oldFromUL1toIL3 = fromUL1toIL3;
		fromUL1toIL3 = newFromUL1toIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL3, oldFromUL1toIL3, fromUL1toIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL1toIL0() {
		return fromUL1toIL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL1toIL0(double newFromUL1toIL0) {
		double oldFromUL1toIL0 = fromUL1toIL0;
		fromUL1toIL0 = newFromUL1toIL0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL0, oldFromUL1toIL0, fromUL1toIL0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL2toUL1() {
		return fromUL2toUL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL2toUL1(double newFromUL2toUL1) {
		double oldFromUL2toUL1 = fromUL2toUL1;
		fromUL2toUL1 = newFromUL2toUL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL1, oldFromUL2toUL1, fromUL2toUL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL2toUL3() {
		return fromUL2toUL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL2toUL3(double newFromUL2toUL3) {
		double oldFromUL2toUL3 = fromUL2toUL3;
		fromUL2toUL3 = newFromUL2toUL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL3, oldFromUL2toUL3, fromUL2toUL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL2toIL1() {
		return fromUL2toIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL2toIL1(double newFromUL2toIL1) {
		double oldFromUL2toIL1 = fromUL2toIL1;
		fromUL2toIL1 = newFromUL2toIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL1, oldFromUL2toIL1, fromUL2toIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL2toIL2() {
		return fromUL2toIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL2toIL2(double newFromUL2toIL2) {
		double oldFromUL2toIL2 = fromUL2toIL2;
		fromUL2toIL2 = newFromUL2toIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL2, oldFromUL2toIL2, fromUL2toIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL2toIL3() {
		return fromUL2toIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL2toIL3(double newFromUL2toIL3) {
		double oldFromUL2toIL3 = fromUL2toIL3;
		fromUL2toIL3 = newFromUL2toIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL3, oldFromUL2toIL3, fromUL2toIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL2toIL0() {
		return fromUL2toIL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL2toIL0(double newFromUL2toIL0) {
		double oldFromUL2toIL0 = fromUL2toIL0;
		fromUL2toIL0 = newFromUL2toIL0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL0, oldFromUL2toIL0, fromUL2toIL0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL3toUL1() {
		return fromUL3toUL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL3toUL1(double newFromUL3toUL1) {
		double oldFromUL3toUL1 = fromUL3toUL1;
		fromUL3toUL1 = newFromUL3toUL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL1, oldFromUL3toUL1, fromUL3toUL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL3toUL2() {
		return fromUL3toUL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL3toUL2(double newFromUL3toUL2) {
		double oldFromUL3toUL2 = fromUL3toUL2;
		fromUL3toUL2 = newFromUL3toUL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL2, oldFromUL3toUL2, fromUL3toUL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL3toIL1() {
		return fromUL3toIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL3toIL1(double newFromUL3toIL1) {
		double oldFromUL3toIL1 = fromUL3toIL1;
		fromUL3toIL1 = newFromUL3toIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL1, oldFromUL3toIL1, fromUL3toIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL3toIL2() {
		return fromUL3toIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL3toIL2(double newFromUL3toIL2) {
		double oldFromUL3toIL2 = fromUL3toIL2;
		fromUL3toIL2 = newFromUL3toIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL2, oldFromUL3toIL2, fromUL3toIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL3toIL3() {
		return fromUL3toIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL3toIL3(double newFromUL3toIL3) {
		double oldFromUL3toIL3 = fromUL3toIL3;
		fromUL3toIL3 = newFromUL3toIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL3, oldFromUL3toIL3, fromUL3toIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromUL3toIL0() {
		return fromUL3toIL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromUL3toIL0(double newFromUL3toIL0) {
		double oldFromUL3toIL0 = fromUL3toIL0;
		fromUL3toIL0 = newFromUL3toIL0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL0, oldFromUL3toIL0, fromUL3toIL0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL1toUL1() {
		return fromIL1toUL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL1toUL1(double newFromIL1toUL1) {
		double oldFromIL1toUL1 = fromIL1toUL1;
		fromIL1toUL1 = newFromIL1toUL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL1, oldFromIL1toUL1, fromIL1toUL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL1toUL2() {
		return fromIL1toUL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL1toUL2(double newFromIL1toUL2) {
		double oldFromIL1toUL2 = fromIL1toUL2;
		fromIL1toUL2 = newFromIL1toUL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL2, oldFromIL1toUL2, fromIL1toUL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL1toUL3() {
		return fromIL1toUL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL1toUL3(double newFromIL1toUL3) {
		double oldFromIL1toUL3 = fromIL1toUL3;
		fromIL1toUL3 = newFromIL1toUL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL3, oldFromIL1toUL3, fromIL1toUL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL1toIL2() {
		return fromIL1toIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL1toIL2(double newFromIL1toIL2) {
		double oldFromIL1toIL2 = fromIL1toIL2;
		fromIL1toIL2 = newFromIL1toIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL2, oldFromIL1toIL2, fromIL1toIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL1toIL3() {
		return fromIL1toIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL1toIL3(double newFromIL1toIL3) {
		double oldFromIL1toIL3 = fromIL1toIL3;
		fromIL1toIL3 = newFromIL1toIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL3, oldFromIL1toIL3, fromIL1toIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL1toIL0() {
		return fromIL1toIL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL1toIL0(double newFromIL1toIL0) {
		double oldFromIL1toIL0 = fromIL1toIL0;
		fromIL1toIL0 = newFromIL1toIL0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL0, oldFromIL1toIL0, fromIL1toIL0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL2toUL1() {
		return fromIL2toUL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL2toUL1(double newFromIL2toUL1) {
		double oldFromIL2toUL1 = fromIL2toUL1;
		fromIL2toUL1 = newFromIL2toUL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL1, oldFromIL2toUL1, fromIL2toUL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL2toUL2() {
		return fromIL2toUL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL2toUL2(double newFromIL2toUL2) {
		double oldFromIL2toUL2 = fromIL2toUL2;
		fromIL2toUL2 = newFromIL2toUL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL2, oldFromIL2toUL2, fromIL2toUL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL2toUL3() {
		return fromIL2toUL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL2toUL3(double newFromIL2toUL3) {
		double oldFromIL2toUL3 = fromIL2toUL3;
		fromIL2toUL3 = newFromIL2toUL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL3, oldFromIL2toUL3, fromIL2toUL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL2toIL1() {
		return fromIL2toIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL2toIL1(double newFromIL2toIL1) {
		double oldFromIL2toIL1 = fromIL2toIL1;
		fromIL2toIL1 = newFromIL2toIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL1, oldFromIL2toIL1, fromIL2toIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL2toIL3() {
		return fromIL2toIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL2toIL3(double newFromIL2toIL3) {
		double oldFromIL2toIL3 = fromIL2toIL3;
		fromIL2toIL3 = newFromIL2toIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL3, oldFromIL2toIL3, fromIL2toIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL2toIL0() {
		return fromIL2toIL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL2toIL0(double newFromIL2toIL0) {
		double oldFromIL2toIL0 = fromIL2toIL0;
		fromIL2toIL0 = newFromIL2toIL0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL0, oldFromIL2toIL0, fromIL2toIL0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL3toUL1() {
		return fromIL3toUL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL3toUL1(double newFromIL3toUL1) {
		double oldFromIL3toUL1 = fromIL3toUL1;
		fromIL3toUL1 = newFromIL3toUL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL1, oldFromIL3toUL1, fromIL3toUL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL3toUL2() {
		return fromIL3toUL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL3toUL2(double newFromIL3toUL2) {
		double oldFromIL3toUL2 = fromIL3toUL2;
		fromIL3toUL2 = newFromIL3toUL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL2, oldFromIL3toUL2, fromIL3toUL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL3toUL3() {
		return fromIL3toUL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL3toUL3(double newFromIL3toUL3) {
		double oldFromIL3toUL3 = fromIL3toUL3;
		fromIL3toUL3 = newFromIL3toUL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL3, oldFromIL3toUL3, fromIL3toUL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL3toIL1() {
		return fromIL3toIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL3toIL1(double newFromIL3toIL1) {
		double oldFromIL3toIL1 = fromIL3toIL1;
		fromIL3toIL1 = newFromIL3toIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL1, oldFromIL3toIL1, fromIL3toIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL3toIL2() {
		return fromIL3toIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL3toIL2(double newFromIL3toIL2) {
		double oldFromIL3toIL2 = fromIL3toIL2;
		fromIL3toIL2 = newFromIL3toIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL2, oldFromIL3toIL2, fromIL3toIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL3toIL0() {
		return fromIL3toIL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL3toIL0(double newFromIL3toIL0) {
		double oldFromIL3toIL0 = fromIL3toIL0;
		fromIL3toIL0 = newFromIL3toIL0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL0, oldFromIL3toIL0, fromIL3toIL0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL0toUL1() {
		return fromIL0toUL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL0toUL1(double newFromIL0toUL1) {
		double oldFromIL0toUL1 = fromIL0toUL1;
		fromIL0toUL1 = newFromIL0toUL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL1, oldFromIL0toUL1, fromIL0toUL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL0toUL2() {
		return fromIL0toUL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL0toUL2(double newFromIL0toUL2) {
		double oldFromIL0toUL2 = fromIL0toUL2;
		fromIL0toUL2 = newFromIL0toUL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL2, oldFromIL0toUL2, fromIL0toUL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL0toUL3() {
		return fromIL0toUL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL0toUL3(double newFromIL0toUL3) {
		double oldFromIL0toUL3 = fromIL0toUL3;
		fromIL0toUL3 = newFromIL0toUL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL3, oldFromIL0toUL3, fromIL0toUL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL0toIL1() {
		return fromIL0toIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL0toIL1(double newFromIL0toIL1) {
		double oldFromIL0toIL1 = fromIL0toIL1;
		fromIL0toIL1 = newFromIL0toIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL1, oldFromIL0toIL1, fromIL0toIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL0toIL2() {
		return fromIL0toIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL0toIL2(double newFromIL0toIL2) {
		double oldFromIL0toIL2 = fromIL0toIL2;
		fromIL0toIL2 = newFromIL0toIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL2, oldFromIL0toIL2, fromIL0toIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFromIL0toIL3() {
		return fromIL0toIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromIL0toIL3(double newFromIL0toIL3) {
		double oldFromIL0toIL3 = fromIL0toIL3;
		fromIL0toIL3 = newFromIL0toIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL3, oldFromIL0toIL3, fromIL0toIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL2:
				return getFromUL1toUL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL3:
				return getFromUL1toUL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL1:
				return getFromUL1toIL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL2:
				return getFromUL1toIL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL3:
				return getFromUL1toIL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL0:
				return getFromUL1toIL0();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL1:
				return getFromUL2toUL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL3:
				return getFromUL2toUL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL1:
				return getFromUL2toIL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL2:
				return getFromUL2toIL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL3:
				return getFromUL2toIL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL0:
				return getFromUL2toIL0();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL1:
				return getFromUL3toUL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL2:
				return getFromUL3toUL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL1:
				return getFromUL3toIL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL2:
				return getFromUL3toIL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL3:
				return getFromUL3toIL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL0:
				return getFromUL3toIL0();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL1:
				return getFromIL1toUL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL2:
				return getFromIL1toUL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL3:
				return getFromIL1toUL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL2:
				return getFromIL1toIL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL3:
				return getFromIL1toIL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL0:
				return getFromIL1toIL0();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL1:
				return getFromIL2toUL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL2:
				return getFromIL2toUL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL3:
				return getFromIL2toUL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL1:
				return getFromIL2toIL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL3:
				return getFromIL2toIL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL0:
				return getFromIL2toIL0();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL1:
				return getFromIL3toUL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL2:
				return getFromIL3toUL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL3:
				return getFromIL3toUL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL1:
				return getFromIL3toIL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL2:
				return getFromIL3toIL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL0:
				return getFromIL3toIL0();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL1:
				return getFromIL0toUL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL2:
				return getFromIL0toUL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL3:
				return getFromIL0toUL3();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL1:
				return getFromIL0toIL1();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL2:
				return getFromIL0toIL2();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL3:
				return getFromIL0toIL3();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL2:
				setFromUL1toUL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL3:
				setFromUL1toUL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL1:
				setFromUL1toIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL2:
				setFromUL1toIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL3:
				setFromUL1toIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL0:
				setFromUL1toIL0((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL1:
				setFromUL2toUL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL3:
				setFromUL2toUL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL1:
				setFromUL2toIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL2:
				setFromUL2toIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL3:
				setFromUL2toIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL0:
				setFromUL2toIL0((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL1:
				setFromUL3toUL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL2:
				setFromUL3toUL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL1:
				setFromUL3toIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL2:
				setFromUL3toIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL3:
				setFromUL3toIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL0:
				setFromUL3toIL0((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL1:
				setFromIL1toUL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL2:
				setFromIL1toUL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL3:
				setFromIL1toUL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL2:
				setFromIL1toIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL3:
				setFromIL1toIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL0:
				setFromIL1toIL0((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL1:
				setFromIL2toUL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL2:
				setFromIL2toUL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL3:
				setFromIL2toUL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL1:
				setFromIL2toIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL3:
				setFromIL2toIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL0:
				setFromIL2toIL0((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL1:
				setFromIL3toUL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL2:
				setFromIL3toUL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL3:
				setFromIL3toUL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL1:
				setFromIL3toIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL2:
				setFromIL3toIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL0:
				setFromIL3toIL0((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL1:
				setFromIL0toUL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL2:
				setFromIL0toUL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL3:
				setFromIL0toUL3((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL1:
				setFromIL0toIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL2:
				setFromIL0toIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL3:
				setFromIL0toIL3((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL2:
				setFromUL1toUL2(FROM_UL_1TO_UL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL3:
				setFromUL1toUL3(FROM_UL_1TO_UL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL1:
				setFromUL1toIL1(FROM_UL_1TO_IL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL2:
				setFromUL1toIL2(FROM_UL_1TO_IL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL3:
				setFromUL1toIL3(FROM_UL_1TO_IL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL0:
				setFromUL1toIL0(FROM_UL_1TO_IL0_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL1:
				setFromUL2toUL1(FROM_UL_2TO_UL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL3:
				setFromUL2toUL3(FROM_UL_2TO_UL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL1:
				setFromUL2toIL1(FROM_UL_2TO_IL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL2:
				setFromUL2toIL2(FROM_UL_2TO_IL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL3:
				setFromUL2toIL3(FROM_UL_2TO_IL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL0:
				setFromUL2toIL0(FROM_UL_2TO_IL0_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL1:
				setFromUL3toUL1(FROM_UL_3TO_UL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL2:
				setFromUL3toUL2(FROM_UL_3TO_UL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL1:
				setFromUL3toIL1(FROM_UL_3TO_IL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL2:
				setFromUL3toIL2(FROM_UL_3TO_IL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL3:
				setFromUL3toIL3(FROM_UL_3TO_IL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL0:
				setFromUL3toIL0(FROM_UL_3TO_IL0_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL1:
				setFromIL1toUL1(FROM_IL_1TO_UL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL2:
				setFromIL1toUL2(FROM_IL_1TO_UL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL3:
				setFromIL1toUL3(FROM_IL_1TO_UL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL2:
				setFromIL1toIL2(FROM_IL_1TO_IL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL3:
				setFromIL1toIL3(FROM_IL_1TO_IL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL0:
				setFromIL1toIL0(FROM_IL_1TO_IL0_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL1:
				setFromIL2toUL1(FROM_IL_2TO_UL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL2:
				setFromIL2toUL2(FROM_IL_2TO_UL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL3:
				setFromIL2toUL3(FROM_IL_2TO_UL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL1:
				setFromIL2toIL1(FROM_IL_2TO_IL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL3:
				setFromIL2toIL3(FROM_IL_2TO_IL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL0:
				setFromIL2toIL0(FROM_IL_2TO_IL0_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL1:
				setFromIL3toUL1(FROM_IL_3TO_UL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL2:
				setFromIL3toUL2(FROM_IL_3TO_UL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL3:
				setFromIL3toUL3(FROM_IL_3TO_UL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL1:
				setFromIL3toIL1(FROM_IL_3TO_IL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL2:
				setFromIL3toIL2(FROM_IL_3TO_IL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL0:
				setFromIL3toIL0(FROM_IL_3TO_IL0_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL1:
				setFromIL0toUL1(FROM_IL_0TO_UL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL2:
				setFromIL0toUL2(FROM_IL_0TO_UL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL3:
				setFromIL0toUL3(FROM_IL_0TO_UL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL1:
				setFromIL0toIL1(FROM_IL_0TO_IL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL2:
				setFromIL0toIL2(FROM_IL_0TO_IL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL3:
				setFromIL0toIL3(FROM_IL_0TO_IL3_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL2:
				return fromUL1toUL2 != FROM_UL_1TO_UL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL3:
				return fromUL1toUL3 != FROM_UL_1TO_UL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL1:
				return fromUL1toIL1 != FROM_UL_1TO_IL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL2:
				return fromUL1toIL2 != FROM_UL_1TO_IL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL3:
				return fromUL1toIL3 != FROM_UL_1TO_IL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL0:
				return fromUL1toIL0 != FROM_UL_1TO_IL0_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL1:
				return fromUL2toUL1 != FROM_UL_2TO_UL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL3:
				return fromUL2toUL3 != FROM_UL_2TO_UL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL1:
				return fromUL2toIL1 != FROM_UL_2TO_IL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL2:
				return fromUL2toIL2 != FROM_UL_2TO_IL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL3:
				return fromUL2toIL3 != FROM_UL_2TO_IL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL0:
				return fromUL2toIL0 != FROM_UL_2TO_IL0_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL1:
				return fromUL3toUL1 != FROM_UL_3TO_UL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL2:
				return fromUL3toUL2 != FROM_UL_3TO_UL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL1:
				return fromUL3toIL1 != FROM_UL_3TO_IL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL2:
				return fromUL3toIL2 != FROM_UL_3TO_IL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL3:
				return fromUL3toIL3 != FROM_UL_3TO_IL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL0:
				return fromUL3toIL0 != FROM_UL_3TO_IL0_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL1:
				return fromIL1toUL1 != FROM_IL_1TO_UL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL2:
				return fromIL1toUL2 != FROM_IL_1TO_UL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL3:
				return fromIL1toUL3 != FROM_IL_1TO_UL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL2:
				return fromIL1toIL2 != FROM_IL_1TO_IL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL3:
				return fromIL1toIL3 != FROM_IL_1TO_IL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL0:
				return fromIL1toIL0 != FROM_IL_1TO_IL0_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL1:
				return fromIL2toUL1 != FROM_IL_2TO_UL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL2:
				return fromIL2toUL2 != FROM_IL_2TO_UL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL3:
				return fromIL2toUL3 != FROM_IL_2TO_UL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL1:
				return fromIL2toIL1 != FROM_IL_2TO_IL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL3:
				return fromIL2toIL3 != FROM_IL_2TO_IL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL0:
				return fromIL2toIL0 != FROM_IL_2TO_IL0_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL1:
				return fromIL3toUL1 != FROM_IL_3TO_UL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL2:
				return fromIL3toUL2 != FROM_IL_3TO_UL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL3:
				return fromIL3toUL3 != FROM_IL_3TO_UL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL1:
				return fromIL3toIL1 != FROM_IL_3TO_IL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL2:
				return fromIL3toIL2 != FROM_IL_3TO_IL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL0:
				return fromIL3toIL0 != FROM_IL_3TO_IL0_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL1:
				return fromIL0toUL1 != FROM_IL_0TO_UL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL2:
				return fromIL0toUL2 != FROM_IL_0TO_UL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL3:
				return fromIL0toUL3 != FROM_IL_0TO_UL3_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL1:
				return fromIL0toIL1 != FROM_IL_0TO_IL1_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL2:
				return fromIL0toIL2 != FROM_IL_0TO_IL2_EDEFAULT;
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL3:
				return fromIL0toIL3 != FROM_IL_0TO_IL3_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (FromUL1toUL2: ");
		result.append(fromUL1toUL2);
		result.append(", FromUL1toUL3: ");
		result.append(fromUL1toUL3);
		result.append(", FromUL1toIL1: ");
		result.append(fromUL1toIL1);
		result.append(", FromUL1toIL2: ");
		result.append(fromUL1toIL2);
		result.append(", FromUL1toIL3: ");
		result.append(fromUL1toIL3);
		result.append(", FromUL1toIL0: ");
		result.append(fromUL1toIL0);
		result.append(", FromUL2toUL1: ");
		result.append(fromUL2toUL1);
		result.append(", FromUL2toUL3: ");
		result.append(fromUL2toUL3);
		result.append(", FromUL2toIL1: ");
		result.append(fromUL2toIL1);
		result.append(", FromUL2toIL2: ");
		result.append(fromUL2toIL2);
		result.append(", FromUL2toIL3: ");
		result.append(fromUL2toIL3);
		result.append(", FromUL2toIL0: ");
		result.append(fromUL2toIL0);
		result.append(", FromUL3toUL1: ");
		result.append(fromUL3toUL1);
		result.append(", FromUL3toUL2: ");
		result.append(fromUL3toUL2);
		result.append(", FromUL3toIL1: ");
		result.append(fromUL3toIL1);
		result.append(", FromUL3toIL2: ");
		result.append(fromUL3toIL2);
		result.append(", FromUL3toIL3: ");
		result.append(fromUL3toIL3);
		result.append(", FromUL3toIL0: ");
		result.append(fromUL3toIL0);
		result.append(", FromIL1toUL1: ");
		result.append(fromIL1toUL1);
		result.append(", FromIL1toUL2: ");
		result.append(fromIL1toUL2);
		result.append(", FromIL1toUL3: ");
		result.append(fromIL1toUL3);
		result.append(", FromIL1toIL2: ");
		result.append(fromIL1toIL2);
		result.append(", FromIL1toIL3: ");
		result.append(fromIL1toIL3);
		result.append(", FromIL1toIL0: ");
		result.append(fromIL1toIL0);
		result.append(", FromIL2toUL1: ");
		result.append(fromIL2toUL1);
		result.append(", FromIL2toUL2: ");
		result.append(fromIL2toUL2);
		result.append(", FromIL2toUL3: ");
		result.append(fromIL2toUL3);
		result.append(", FromIL2toIL1: ");
		result.append(fromIL2toIL1);
		result.append(", FromIL2toIL3: ");
		result.append(fromIL2toIL3);
		result.append(", FromIL2toIL0: ");
		result.append(fromIL2toIL0);
		result.append(", FromIL3toUL1: ");
		result.append(fromIL3toUL1);
		result.append(", FromIL3toUL2: ");
		result.append(fromIL3toUL2);
		result.append(", FromIL3toUL3: ");
		result.append(fromIL3toUL3);
		result.append(", FromIL3toIL1: ");
		result.append(fromIL3toIL1);
		result.append(", FromIL3toIL2: ");
		result.append(fromIL3toIL2);
		result.append(", FromIL3toIL0: ");
		result.append(fromIL3toIL0);
		result.append(", FromIL0toUL1: ");
		result.append(fromIL0toUL1);
		result.append(", FromIL0toUL2: ");
		result.append(fromIL0toUL2);
		result.append(", FromIL0toUL3: ");
		result.append(fromIL0toUL3);
		result.append(", FromIL0toIL1: ");
		result.append(fromIL0toIL1);
		result.append(", FromIL0toIL2: ");
		result.append(fromIL0toIL2);
		result.append(", FromIL0toIL3: ");
		result.append(fromIL0toIL3);
		result.append(')');
		return result.toString();
	}

} //ExtendedPhaseAngleMeasurementImpl
