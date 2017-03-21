/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import CIM.IEC61970.Generation.GenerationDynamics.PrimeMover;

import CIM.IEC61970.Generation.Production.GeneratingUnit;
import CIM.IEC61970.Generation.Production.HydroPump;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import CIM.IEC61970.Wires.CoolantType;
import CIM.IEC61970.Wires.ReactiveCapabilityCurve;
import CIM.IEC61970.Wires.SynchronousMachine;
import CIM.IEC61970.Wires.SynchronousMachineOperatingMode;
import CIM.IEC61970.Wires.SynchronousMachineType;
import CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getXQuadTrans <em>XQuad Trans</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getCoolantCondition <em>Coolant Condition</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getCoolantType <em>Coolant Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getCondenserP <em>Condenser P</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getAVRToManualLag <em>AVR To Manual Lag</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getAVRToManualLead <em>AVR To Manual Lead</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getDamping <em>Damping</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getR <em>R</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getX <em>X</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getManualToAVR <em>Manual To AVR</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getInertia <em>Inertia</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getHydroPump <em>Hydro Pump</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getBaseQ <em>Base Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SynchronousMachineImpl#getPrimeMovers <em>Prime Movers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineImpl extends RegulatingCondEqImpl implements SynchronousMachine {
	/**
	 * The default value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSync()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSync()
	 * @generated
	 * @ordered
	 */
	protected float xDirectSync = XDIRECT_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected float xQuadTrans = XQUAD_TRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolantCondition() <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantCondition()
	 * @generated
	 * @ordered
	 */
	protected static final float COOLANT_CONDITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoolantCondition() <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantCondition()
	 * @generated
	 * @ordered
	 */
	protected float coolantCondition = COOLANT_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReactiveCapabilityCurves() <em>Reactive Capability Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactiveCapabilityCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactiveCapabilityCurve> reactiveCapabilityCurves;

	/**
	 * The default value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float xQuadSubtrans = XQUAD_SUBTRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolantType() <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantType()
	 * @generated
	 * @ordered
	 */
	protected static final CoolantType COOLANT_TYPE_EDEFAULT = CoolantType.WATER;

	/**
	 * The cached value of the '{@link #getCoolantType() <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantType()
	 * @generated
	 * @ordered
	 */
	protected CoolantType coolantType = COOLANT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondenserP() <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondenserP()
	 * @generated
	 * @ordered
	 */
	protected static final float CONDENSER_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCondenserP() <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondenserP()
	 * @generated
	 * @ordered
	 */
	protected float condenserP = CONDENSER_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getAVRToManualLag() <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLag()
	 * @generated
	 * @ordered
	 */
	protected static final float AVR_TO_MANUAL_LAG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAVRToManualLag() <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLag()
	 * @generated
	 * @ordered
	 */
	protected float aVRToManualLag = AVR_TO_MANUAL_LAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected float minQ = MIN_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getAVRToManualLead() <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLead()
	 * @generated
	 * @ordered
	 */
	protected static final float AVR_TO_MANUAL_LEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAVRToManualLead() <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLead()
	 * @generated
	 * @ordered
	 */
	protected float aVRToManualLead = AVR_TO_MANUAL_LEAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected float maxU = MAX_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamping() <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected static final float DAMPING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDamping() <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected float damping = DAMPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected float maxQ = MAX_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronousMachineType TYPE_EDEFAULT = SynchronousMachineType.CONDENSER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachineType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected static final float R2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected float r2 = R2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int REFERENCE_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePriority()
	 * @generated
	 * @ordered
	 */
	protected int referencePriority = REFERENCE_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final float X2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected float x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialReactiveCapabilityCurve() <em>Initial Reactive Capability Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReactiveCapabilityCurve()
	 * @generated
	 * @ordered
	 */
	protected ReactiveCapabilityCurve initialReactiveCapabilityCurve;

	/**
	 * The default value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float xDirectSubtrans = XDIRECT_SUBTRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPercent()
	 * @generated
	 * @ordered
	 */
	protected static final float QPERCENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPercent()
	 * @generated
	 * @ordered
	 */
	protected float qPercent = QPERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSync()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSync()
	 * @generated
	 * @ordered
	 */
	protected float xQuadSync = XQUAD_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected float ratedS = RATED_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getManualToAVR() <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualToAVR()
	 * @generated
	 * @ordered
	 */
	protected static final float MANUAL_TO_AVR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getManualToAVR() <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualToAVR()
	 * @generated
	 * @ordered
	 */
	protected float manualToAVR = MANUAL_TO_AVR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInertia() <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertia()
	 * @generated
	 * @ordered
	 */
	protected static final float INERTIA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInertia() <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertia()
	 * @generated
	 * @ordered
	 */
	protected float inertia = INERTIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHydroPump() <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPump()
	 * @generated
	 * @ordered
	 */
	protected HydroPump hydroPump;

	/**
	 * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected float minU = MIN_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected float xDirectTrans = XDIRECT_TRANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseQ() <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQ()
	 * @generated
	 * @ordered
	 */
	protected static final float BASE_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBaseQ() <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQ()
	 * @generated
	 * @ordered
	 */
	protected float baseQ = BASE_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronousMachineOperatingMode OPERATING_MODE_EDEFAULT = SynchronousMachineOperatingMode.CONDENSER;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachineOperatingMode operatingMode = OPERATING_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimeMovers() <em>Prime Movers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMovers()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimeMover> primeMovers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SYNCHRONOUS_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXDirectSync() {
		return xDirectSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDirectSync(float newXDirectSync) {
		float oldXDirectSync = xDirectSync;
		xDirectSync = newXDirectSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC, oldXDirectSync, xDirectSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXQuadTrans() {
		return xQuadTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuadTrans(float newXQuadTrans) {
		float oldXQuadTrans = xQuadTrans;
		xQuadTrans = newXQuadTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS, oldXQuadTrans, xQuadTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoolantCondition() {
		return coolantCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolantCondition(float newCoolantCondition) {
		float oldCoolantCondition = coolantCondition;
		coolantCondition = newCoolantCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION, oldCoolantCondition, coolantCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactiveCapabilityCurve> getReactiveCapabilityCurves() {
		if (reactiveCapabilityCurves == null) {
			reactiveCapabilityCurves = new EObjectWithInverseResolvingEList.ManyInverse<ReactiveCapabilityCurve>(ReactiveCapabilityCurve.class, this, WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES, WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES);
		}
		return reactiveCapabilityCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXQuadSubtrans() {
		return xQuadSubtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuadSubtrans(float newXQuadSubtrans) {
		float oldXQuadSubtrans = xQuadSubtrans;
		xQuadSubtrans = newXQuadSubtrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS, oldXQuadSubtrans, xQuadSubtrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoolantType getCoolantType() {
		return coolantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolantType(CoolantType newCoolantType) {
		CoolantType oldCoolantType = coolantType;
		coolantType = newCoolantType == null ? COOLANT_TYPE_EDEFAULT : newCoolantType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE, oldCoolantType, coolantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCondenserP() {
		return condenserP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondenserP(float newCondenserP) {
		float oldCondenserP = condenserP;
		condenserP = newCondenserP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P, oldCondenserP, condenserP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAVRToManualLag() {
		return aVRToManualLag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAVRToManualLag(float newAVRToManualLag) {
		float oldAVRToManualLag = aVRToManualLag;
		aVRToManualLag = newAVRToManualLag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG, oldAVRToManualLag, aVRToManualLag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinQ() {
		return minQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinQ(float newMinQ) {
		float oldMinQ = minQ;
		minQ = newMinQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q, oldMinQ, minQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAVRToManualLead() {
		return aVRToManualLead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAVRToManualLead(float newAVRToManualLead) {
		float oldAVRToManualLead = aVRToManualLead;
		aVRToManualLead = newAVRToManualLead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD, oldAVRToManualLead, aVRToManualLead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxU() {
		return maxU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxU(float newMaxU) {
		float oldMaxU = maxU;
		maxU = newMaxU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__MAX_U, oldMaxU, maxU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDamping() {
		return damping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamping(float newDamping) {
		float oldDamping = damping;
		damping = newDamping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__DAMPING, oldDamping, damping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT, oldGeneratingUnit, generatingUnit));
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxQ() {
		return maxQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxQ(float newMaxQ) {
		float oldMaxQ = maxQ;
		maxQ = newMaxQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q, oldMaxQ, maxQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR0(float newR0) {
		float oldR0 = r0;
		r0 = newR0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__R0, oldR0, r0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SynchronousMachineType newType) {
		SynchronousMachineType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR2() {
		return r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR2(float newR2) {
		float oldR2 = r2;
		r2 = newR2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__R2, oldR2, r2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReferencePriority() {
		return referencePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePriority(int newReferencePriority) {
		int oldReferencePriority = referencePriority;
		referencePriority = newReferencePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY, oldReferencePriority, referencePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0(float newX0) {
		float oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(float newX2) {
		float oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(float newR) {
		float oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
		if (initialReactiveCapabilityCurve != null && initialReactiveCapabilityCurve.eIsProxy()) {
			InternalEObject oldInitialReactiveCapabilityCurve = (InternalEObject)initialReactiveCapabilityCurve;
			initialReactiveCapabilityCurve = (ReactiveCapabilityCurve)eResolveProxy(oldInitialReactiveCapabilityCurve);
			if (initialReactiveCapabilityCurve != oldInitialReactiveCapabilityCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, oldInitialReactiveCapabilityCurve, initialReactiveCapabilityCurve));
			}
		}
		return initialReactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve basicGetInitialReactiveCapabilityCurve() {
		return initialReactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialReactiveCapabilityCurve(ReactiveCapabilityCurve newInitialReactiveCapabilityCurve, NotificationChain msgs) {
		ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
		initialReactiveCapabilityCurve = newInitialReactiveCapabilityCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, oldInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve newInitialReactiveCapabilityCurve) {
		if (newInitialReactiveCapabilityCurve != initialReactiveCapabilityCurve) {
			NotificationChain msgs = null;
			if (initialReactiveCapabilityCurve != null)
				msgs = ((InternalEObject)initialReactiveCapabilityCurve).eInverseRemove(this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, ReactiveCapabilityCurve.class, msgs);
			if (newInitialReactiveCapabilityCurve != null)
				msgs = ((InternalEObject)newInitialReactiveCapabilityCurve).eInverseAdd(this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, ReactiveCapabilityCurve.class, msgs);
			msgs = basicSetInitialReactiveCapabilityCurve(newInitialReactiveCapabilityCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, newInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXDirectSubtrans() {
		return xDirectSubtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDirectSubtrans(float newXDirectSubtrans) {
		float oldXDirectSubtrans = xDirectSubtrans;
		xDirectSubtrans = newXDirectSubtrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS, oldXDirectSubtrans, xDirectSubtrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQPercent() {
		return qPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQPercent(float newQPercent) {
		float oldQPercent = qPercent;
		qPercent = newQPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT, oldQPercent, qPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXQuadSync() {
		return xQuadSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXQuadSync(float newXQuadSync) {
		float oldXQuadSync = xQuadSync;
		xQuadSync = newXQuadSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC, oldXQuadSync, xQuadSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedS() {
		return ratedS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedS(float newRatedS) {
		float oldRatedS = ratedS;
		ratedS = newRatedS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__RATED_S, oldRatedS, ratedS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getManualToAVR() {
		return manualToAVR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualToAVR(float newManualToAVR) {
		float oldManualToAVR = manualToAVR;
		manualToAVR = newManualToAVR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR, oldManualToAVR, manualToAVR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInertia() {
		return inertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInertia(float newInertia) {
		float oldInertia = inertia;
		inertia = newInertia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__INERTIA, oldInertia, inertia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump getHydroPump() {
		if (hydroPump != null && hydroPump.eIsProxy()) {
			InternalEObject oldHydroPump = (InternalEObject)hydroPump;
			hydroPump = (HydroPump)eResolveProxy(oldHydroPump);
			if (hydroPump != oldHydroPump) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, oldHydroPump, hydroPump));
			}
		}
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump basicGetHydroPump() {
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPump(HydroPump newHydroPump, NotificationChain msgs) {
		HydroPump oldHydroPump = hydroPump;
		hydroPump = newHydroPump;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, oldHydroPump, newHydroPump);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroPump(HydroPump newHydroPump) {
		if (newHydroPump != hydroPump) {
			NotificationChain msgs = null;
			if (hydroPump != null)
				msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, HydroPump.class, msgs);
			if (newHydroPump != null)
				msgs = ((InternalEObject)newHydroPump).eInverseAdd(this, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, HydroPump.class, msgs);
			msgs = basicSetHydroPump(newHydroPump, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, newHydroPump, newHydroPump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinU() {
		return minU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinU(float newMinU) {
		float oldMinU = minU;
		minU = newMinU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__MIN_U, oldMinU, minU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXDirectTrans() {
		return xDirectTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDirectTrans(float newXDirectTrans) {
		float oldXDirectTrans = xDirectTrans;
		xDirectTrans = newXDirectTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS, oldXDirectTrans, xDirectTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBaseQ() {
		return baseQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseQ(float newBaseQ) {
		float oldBaseQ = baseQ;
		baseQ = newBaseQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q, oldBaseQ, baseQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineOperatingMode getOperatingMode() {
		return operatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingMode(SynchronousMachineOperatingMode newOperatingMode) {
		SynchronousMachineOperatingMode oldOperatingMode = operatingMode;
		operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE, oldOperatingMode, operatingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimeMover> getPrimeMovers() {
		if (primeMovers == null) {
			primeMovers = new EObjectWithInverseResolvingEList.ManyInverse<PrimeMover>(PrimeMover.class, this, WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS, GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES);
		}
		return primeMovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReactiveCapabilityCurves()).basicAdd(otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				if (initialReactiveCapabilityCurve != null)
					msgs = ((InternalEObject)initialReactiveCapabilityCurve).eInverseRemove(this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, ReactiveCapabilityCurve.class, msgs);
				return basicSetInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				if (hydroPump != null)
					msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, HydroPump.class, msgs);
				return basicSetHydroPump((HydroPump)otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimeMovers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return ((InternalEList<?>)getReactiveCapabilityCurves()).basicRemove(otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				return basicSetInitialReactiveCapabilityCurve(null, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				return basicSetHydroPump(null, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return ((InternalEList<?>)getPrimeMovers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				return getXDirectSync();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				return getXQuadTrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				return getCoolantCondition();
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return getReactiveCapabilityCurves();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				return getXQuadSubtrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				return getCoolantType();
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				return getCondenserP();
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				return getAVRToManualLag();
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				return getMinQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				return getAVRToManualLead();
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				return getMaxU();
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				return getDamping();
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				return getMaxQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				return getR0();
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				return getType();
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				return getR2();
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				return getReferencePriority();
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				return getX0();
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				return getX2();
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				return getR();
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				if (resolve) return getInitialReactiveCapabilityCurve();
				return basicGetInitialReactiveCapabilityCurve();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				return getXDirectSubtrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				return getX();
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				return getQPercent();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				return getXQuadSync();
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				return getRatedS();
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				return getManualToAVR();
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				return getInertia();
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				if (resolve) return getHydroPump();
				return basicGetHydroPump();
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				return getMinU();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				return getXDirectTrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				return getBaseQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				return getOperatingMode();
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return getPrimeMovers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				setXDirectSync((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				setXQuadTrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				setCoolantCondition((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				getReactiveCapabilityCurves().clear();
				getReactiveCapabilityCurves().addAll((Collection<? extends ReactiveCapabilityCurve>)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				setXQuadSubtrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				setCoolantType((CoolantType)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				setCondenserP((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				setAVRToManualLag((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				setMinQ((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				setAVRToManualLead((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				setDamping((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				setMaxQ((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				setType((SynchronousMachineType)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				setR2((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				setReferencePriority((Integer)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				setX2((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				setR((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				setXDirectSubtrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				setX((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				setQPercent((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				setXQuadSync((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				setRatedS((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				setManualToAVR((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				setInertia((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				setHydroPump((HydroPump)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				setXDirectTrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				setBaseQ((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				setOperatingMode((SynchronousMachineOperatingMode)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				getPrimeMovers().clear();
				getPrimeMovers().addAll((Collection<? extends PrimeMover>)newValue);
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
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				setXDirectSync(XDIRECT_SYNC_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				setXQuadTrans(XQUAD_TRANS_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				setCoolantCondition(COOLANT_CONDITION_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				getReactiveCapabilityCurves().clear();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				setXQuadSubtrans(XQUAD_SUBTRANS_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				setCoolantType(COOLANT_TYPE_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				setCondenserP(CONDENSER_P_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				setAVRToManualLag(AVR_TO_MANUAL_LAG_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				setMinQ(MIN_Q_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				setAVRToManualLead(AVR_TO_MANUAL_LEAD_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				setMaxU(MAX_U_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				setDamping(DAMPING_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				setMaxQ(MAX_Q_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				setR0(R0_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				setR2(R2_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				setReferencePriority(REFERENCE_PRIORITY_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				setX0(X0_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				setX2(X2_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				setR(R_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)null);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				setXDirectSubtrans(XDIRECT_SUBTRANS_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				setX(X_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				setQPercent(QPERCENT_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				setXQuadSync(XQUAD_SYNC_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				setRatedS(RATED_S_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				setManualToAVR(MANUAL_TO_AVR_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				setInertia(INERTIA_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				setHydroPump((HydroPump)null);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				setMinU(MIN_U_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				setXDirectTrans(XDIRECT_TRANS_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				setBaseQ(BASE_Q_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				setOperatingMode(OPERATING_MODE_EDEFAULT);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				getPrimeMovers().clear();
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
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				return xDirectSync != XDIRECT_SYNC_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				return xQuadTrans != XQUAD_TRANS_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				return coolantCondition != COOLANT_CONDITION_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return reactiveCapabilityCurves != null && !reactiveCapabilityCurves.isEmpty();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				return xQuadSubtrans != XQUAD_SUBTRANS_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				return coolantType != COOLANT_TYPE_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				return condenserP != CONDENSER_P_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				return aVRToManualLag != AVR_TO_MANUAL_LAG_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				return minQ != MIN_Q_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				return aVRToManualLead != AVR_TO_MANUAL_LEAD_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				return maxU != MAX_U_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				return damping != DAMPING_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				return generatingUnit != null;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				return maxQ != MAX_Q_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				return r0 != R0_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				return type != TYPE_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				return r2 != R2_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				return referencePriority != REFERENCE_PRIORITY_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				return x0 != X0_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				return x2 != X2_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				return r != R_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				return initialReactiveCapabilityCurve != null;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				return xDirectSubtrans != XDIRECT_SUBTRANS_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				return x != X_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				return qPercent != QPERCENT_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				return xQuadSync != XQUAD_SYNC_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				return ratedS != RATED_S_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				return manualToAVR != MANUAL_TO_AVR_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				return inertia != INERTIA_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				return hydroPump != null;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				return minU != MIN_U_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				return xDirectTrans != XDIRECT_TRANS_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				return baseQ != BASE_Q_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				return operatingMode != OPERATING_MODE_EDEFAULT;
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return primeMovers != null && !primeMovers.isEmpty();
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
		result.append(" (xDirectSync: ");
		result.append(xDirectSync);
		result.append(", xQuadTrans: ");
		result.append(xQuadTrans);
		result.append(", coolantCondition: ");
		result.append(coolantCondition);
		result.append(", xQuadSubtrans: ");
		result.append(xQuadSubtrans);
		result.append(", coolantType: ");
		result.append(coolantType);
		result.append(", condenserP: ");
		result.append(condenserP);
		result.append(", aVRToManualLag: ");
		result.append(aVRToManualLag);
		result.append(", minQ: ");
		result.append(minQ);
		result.append(", aVRToManualLead: ");
		result.append(aVRToManualLead);
		result.append(", maxU: ");
		result.append(maxU);
		result.append(", damping: ");
		result.append(damping);
		result.append(", maxQ: ");
		result.append(maxQ);
		result.append(", r0: ");
		result.append(r0);
		result.append(", type: ");
		result.append(type);
		result.append(", r2: ");
		result.append(r2);
		result.append(", referencePriority: ");
		result.append(referencePriority);
		result.append(", x0: ");
		result.append(x0);
		result.append(", x2: ");
		result.append(x2);
		result.append(", r: ");
		result.append(r);
		result.append(", xDirectSubtrans: ");
		result.append(xDirectSubtrans);
		result.append(", x: ");
		result.append(x);
		result.append(", qPercent: ");
		result.append(qPercent);
		result.append(", xQuadSync: ");
		result.append(xQuadSync);
		result.append(", ratedS: ");
		result.append(ratedS);
		result.append(", manualToAVR: ");
		result.append(manualToAVR);
		result.append(", inertia: ");
		result.append(inertia);
		result.append(", minU: ");
		result.append(minU);
		result.append(", xDirectTrans: ");
		result.append(xDirectTrans);
		result.append(", baseQ: ");
		result.append(baseQ);
		result.append(", operatingMode: ");
		result.append(operatingMode);
		result.append(')');
		return result.toString();
	}

} //SynchronousMachineImpl
