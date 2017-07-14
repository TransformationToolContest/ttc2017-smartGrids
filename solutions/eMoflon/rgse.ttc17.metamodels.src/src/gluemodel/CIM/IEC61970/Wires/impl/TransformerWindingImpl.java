/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import gluemodel.CIM.IEC61970.Wires.PhaseTapChanger;
import gluemodel.CIM.IEC61970.Wires.PowerTransformer;
import gluemodel.CIM.IEC61970.Wires.RatioTapChanger;
import gluemodel.CIM.IEC61970.Wires.TransformerWinding;
import gluemodel.CIM.IEC61970.Wires.WindingConnection;
import gluemodel.CIM.IEC61970.Wires.WindingTest;
import gluemodel.CIM.IEC61970.Wires.WindingType;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getTo_WindingTest <em>To Winding Test</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getRground <em>Rground</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getG <em>G</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getB0 <em>B0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getWindingType <em>Winding Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getFrom_WindingTest <em>From Winding Test</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.TransformerWindingImpl#getXground <em>Xground</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerWindingImpl extends ConductingEquipmentImpl implements TransformerWinding {
	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected float g0 = G0_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo_WindingTest() <em>To Winding Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_WindingTest()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingTest> to_WindingTest;

	/**
	 * The default value of the '{@link #getRground() <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRground()
	 * @generated
	 * @ordered
	 */
	protected static final float RGROUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRground() <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRground()
	 * @generated
	 * @ordered
	 */
	protected float rground = RGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected boolean grounded = GROUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTermS()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_TERM_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTermS()
	 * @generated
	 * @ordered
	 */
	protected float shortTermS = SHORT_TERM_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final float G_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected float g = G_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

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
	 * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChanger()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChanger phaseTapChanger;

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
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected float b0 = B0_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformer()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformer powerTransformer;

	/**
	 * The default value of the '{@link #getWindingType() <em>Winding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingType()
	 * @generated
	 * @ordered
	 */
	protected static final WindingType WINDING_TYPE_EDEFAULT = WindingType.TERTIARY;

	/**
	 * The cached value of the '{@link #getWindingType() <em>Winding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingType()
	 * @generated
	 * @ordered
	 */
	protected WindingType windingType = WINDING_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected float ratedU = RATED_U_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom_WindingTest() <em>From Winding Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_WindingTest()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingTest> from_WindingTest;

	/**
	 * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChanger()
	 * @generated
	 * @ordered
	 */
	protected RatioTapChanger ratioTapChanger;

	/**
	 * The default value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationU()
	 * @generated
	 * @ordered
	 */
	protected static final float INSULATION_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationU()
	 * @generated
	 * @ordered
	 */
	protected float insulationU = INSULATION_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyS()
	 * @generated
	 * @ordered
	 */
	protected static final float EMERGENCY_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyS()
	 * @generated
	 * @ordered
	 */
	protected float emergencyS = EMERGENCY_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final WindingConnection CONNECTION_TYPE_EDEFAULT = WindingConnection.I;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected WindingConnection connectionType = CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXground() <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXground()
	 * @generated
	 * @ordered
	 */
	protected static final float XGROUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXground() <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXground()
	 * @generated
	 * @ordered
	 */
	protected float xground = XGROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerWindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_WINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG0() {
		return g0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG0(float newG0) {
		float oldG0 = g0;
		g0 = newG0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__G0, oldG0, g0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingTest> getTo_WindingTest() {
		if (to_WindingTest == null) {
			to_WindingTest = new EObjectWithInverseResolvingEList<WindingTest>(WindingTest.class, this, WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST, WiresPackage.WINDING_TEST__TO_TRANSFORMER_WINDING);
		}
		return to_WindingTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRground() {
		return rground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRground(float newRground) {
		float oldRground = rground;
		rground = newRground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RGROUND, oldRground, rground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrounded() {
		return grounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrounded(boolean newGrounded) {
		boolean oldGrounded = grounded;
		grounded = newGrounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__GROUNDED, oldGrounded, grounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShortTermS() {
		return shortTermS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortTermS(float newShortTermS) {
		float oldShortTermS = shortTermS;
		shortTermS = newShortTermS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__SHORT_TERM_S, oldShortTermS, shortTermS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(float newG) {
		float oldG = g;
		g = newG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(float newB) {
		float oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__B, oldB, b));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger getPhaseTapChanger() {
		if (phaseTapChanger != null && phaseTapChanger.eIsProxy()) {
			InternalEObject oldPhaseTapChanger = (InternalEObject)phaseTapChanger;
			phaseTapChanger = (PhaseTapChanger)eResolveProxy(oldPhaseTapChanger);
			if (phaseTapChanger != oldPhaseTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER, oldPhaseTapChanger, phaseTapChanger));
			}
		}
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger basicGetPhaseTapChanger() {
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseTapChanger(PhaseTapChanger newPhaseTapChanger, NotificationChain msgs) {
		PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
		phaseTapChanger = newPhaseTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER, oldPhaseTapChanger, newPhaseTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseTapChanger(PhaseTapChanger newPhaseTapChanger) {
		if (newPhaseTapChanger != phaseTapChanger) {
			NotificationChain msgs = null;
			if (phaseTapChanger != null)
				msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING, PhaseTapChanger.class, msgs);
			if (newPhaseTapChanger != null)
				msgs = ((InternalEObject)newPhaseTapChanger).eInverseAdd(this, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING, PhaseTapChanger.class, msgs);
			msgs = basicSetPhaseTapChanger(newPhaseTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER, newPhaseTapChanger, newPhaseTapChanger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__R, oldR, r));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__R0, oldR0, r0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB0() {
		return b0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB0(float newB0) {
		float oldB0 = b0;
		b0 = newB0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__B0, oldB0, b0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer getPowerTransformer() {
		if (powerTransformer != null && powerTransformer.eIsProxy()) {
			InternalEObject oldPowerTransformer = (InternalEObject)powerTransformer;
			powerTransformer = (PowerTransformer)eResolveProxy(oldPowerTransformer);
			if (powerTransformer != oldPowerTransformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER, oldPowerTransformer, powerTransformer));
			}
		}
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer basicGetPowerTransformer() {
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerTransformer(PowerTransformer newPowerTransformer, NotificationChain msgs) {
		PowerTransformer oldPowerTransformer = powerTransformer;
		powerTransformer = newPowerTransformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER, oldPowerTransformer, newPowerTransformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerTransformer(PowerTransformer newPowerTransformer) {
		if (newPowerTransformer != powerTransformer) {
			NotificationChain msgs = null;
			if (powerTransformer != null)
				msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS, PowerTransformer.class, msgs);
			if (newPowerTransformer != null)
				msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS, PowerTransformer.class, msgs);
			msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER, newPowerTransformer, newPowerTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingType getWindingType() {
		return windingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindingType(WindingType newWindingType) {
		WindingType oldWindingType = windingType;
		windingType = newWindingType == null ? WINDING_TYPE_EDEFAULT : newWindingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE, oldWindingType, windingType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__X0, oldX0, x0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RATED_S, oldRatedS, ratedS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedU() {
		return ratedU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedU(float newRatedU) {
		float oldRatedU = ratedU;
		ratedU = newRatedU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RATED_U, oldRatedU, ratedU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingTest> getFrom_WindingTest() {
		if (from_WindingTest == null) {
			from_WindingTest = new EObjectWithInverseResolvingEList<WindingTest>(WindingTest.class, this, WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST, WiresPackage.WINDING_TEST__FROM_TRANSFORMER_WINDING);
		}
		return from_WindingTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger getRatioTapChanger() {
		if (ratioTapChanger != null && ratioTapChanger.eIsProxy()) {
			InternalEObject oldRatioTapChanger = (InternalEObject)ratioTapChanger;
			ratioTapChanger = (RatioTapChanger)eResolveProxy(oldRatioTapChanger);
			if (ratioTapChanger != oldRatioTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER, oldRatioTapChanger, ratioTapChanger));
			}
		}
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger basicGetRatioTapChanger() {
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioTapChanger(RatioTapChanger newRatioTapChanger, NotificationChain msgs) {
		RatioTapChanger oldRatioTapChanger = ratioTapChanger;
		ratioTapChanger = newRatioTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER, oldRatioTapChanger, newRatioTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatioTapChanger(RatioTapChanger newRatioTapChanger) {
		if (newRatioTapChanger != ratioTapChanger) {
			NotificationChain msgs = null;
			if (ratioTapChanger != null)
				msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING, RatioTapChanger.class, msgs);
			if (newRatioTapChanger != null)
				msgs = ((InternalEObject)newRatioTapChanger).eInverseAdd(this, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING, RatioTapChanger.class, msgs);
			msgs = basicSetRatioTapChanger(newRatioTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER, newRatioTapChanger, newRatioTapChanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInsulationU() {
		return insulationU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationU(float newInsulationU) {
		float oldInsulationU = insulationU;
		insulationU = newInsulationU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__INSULATION_U, oldInsulationU, insulationU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEmergencyS() {
		return emergencyS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyS(float newEmergencyS) {
		float oldEmergencyS = emergencyS;
		emergencyS = newEmergencyS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__EMERGENCY_S, oldEmergencyS, emergencyS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingConnection getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(WindingConnection newConnectionType) {
		WindingConnection oldConnectionType = connectionType;
		connectionType = newConnectionType == null ? CONNECTION_TYPE_EDEFAULT : newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__CONNECTION_TYPE, oldConnectionType, connectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXground() {
		return xground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXground(float newXground) {
		float oldXground = xground;
		xground = newXground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.TRANSFORMER_WINDING__XGROUND, oldXground, xground));
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
			case WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTo_WindingTest()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				if (phaseTapChanger != null)
					msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_WINDING, PhaseTapChanger.class, msgs);
				return basicSetPhaseTapChanger((PhaseTapChanger)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				if (powerTransformer != null)
					msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS, PowerTransformer.class, msgs);
				return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrom_WindingTest()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				if (ratioTapChanger != null)
					msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_WINDING, RatioTapChanger.class, msgs);
				return basicSetRatioTapChanger((RatioTapChanger)otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST:
				return ((InternalEList<?>)getTo_WindingTest()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				return basicSetPhaseTapChanger(null, msgs);
			case WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				return basicSetPowerTransformer(null, msgs);
			case WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST:
				return ((InternalEList<?>)getFrom_WindingTest()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				return basicSetRatioTapChanger(null, msgs);
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
			case WiresPackage.TRANSFORMER_WINDING__G0:
				return getG0();
			case WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST:
				return getTo_WindingTest();
			case WiresPackage.TRANSFORMER_WINDING__RGROUND:
				return getRground();
			case WiresPackage.TRANSFORMER_WINDING__GROUNDED:
				return isGrounded();
			case WiresPackage.TRANSFORMER_WINDING__SHORT_TERM_S:
				return getShortTermS();
			case WiresPackage.TRANSFORMER_WINDING__G:
				return getG();
			case WiresPackage.TRANSFORMER_WINDING__B:
				return getB();
			case WiresPackage.TRANSFORMER_WINDING__X:
				return getX();
			case WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				if (resolve) return getPhaseTapChanger();
				return basicGetPhaseTapChanger();
			case WiresPackage.TRANSFORMER_WINDING__R:
				return getR();
			case WiresPackage.TRANSFORMER_WINDING__R0:
				return getR0();
			case WiresPackage.TRANSFORMER_WINDING__B0:
				return getB0();
			case WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				if (resolve) return getPowerTransformer();
				return basicGetPowerTransformer();
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				return getWindingType();
			case WiresPackage.TRANSFORMER_WINDING__X0:
				return getX0();
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				return getRatedS();
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				return getRatedU();
			case WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST:
				return getFrom_WindingTest();
			case WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				if (resolve) return getRatioTapChanger();
				return basicGetRatioTapChanger();
			case WiresPackage.TRANSFORMER_WINDING__INSULATION_U:
				return getInsulationU();
			case WiresPackage.TRANSFORMER_WINDING__EMERGENCY_S:
				return getEmergencyS();
			case WiresPackage.TRANSFORMER_WINDING__CONNECTION_TYPE:
				return getConnectionType();
			case WiresPackage.TRANSFORMER_WINDING__XGROUND:
				return getXground();
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
			case WiresPackage.TRANSFORMER_WINDING__G0:
				setG0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST:
				getTo_WindingTest().clear();
				getTo_WindingTest().addAll((Collection<? extends WindingTest>)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RGROUND:
				setRground((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__GROUNDED:
				setGrounded((Boolean)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__SHORT_TERM_S:
				setShortTermS((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__G:
				setG((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__B:
				setB((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__X:
				setX((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__R:
				setR((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__B0:
				setB0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				setWindingType((WindingType)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				setRatedS((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				setRatedU((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST:
				getFrom_WindingTest().clear();
				getFrom_WindingTest().addAll((Collection<? extends WindingTest>)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__INSULATION_U:
				setInsulationU((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__EMERGENCY_S:
				setEmergencyS((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__CONNECTION_TYPE:
				setConnectionType((WindingConnection)newValue);
				return;
			case WiresPackage.TRANSFORMER_WINDING__XGROUND:
				setXground((Float)newValue);
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
			case WiresPackage.TRANSFORMER_WINDING__G0:
				setG0(G0_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST:
				getTo_WindingTest().clear();
				return;
			case WiresPackage.TRANSFORMER_WINDING__RGROUND:
				setRground(RGROUND_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__GROUNDED:
				setGrounded(GROUNDED_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__SHORT_TERM_S:
				setShortTermS(SHORT_TERM_S_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__G:
				setG(G_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__B:
				setB(B_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__X:
				setX(X_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)null);
				return;
			case WiresPackage.TRANSFORMER_WINDING__R:
				setR(R_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__R0:
				setR0(R0_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__B0:
				setB0(B0_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)null);
				return;
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				setWindingType(WINDING_TYPE_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__X0:
				setX0(X0_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				setRatedS(RATED_S_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				setRatedU(RATED_U_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST:
				getFrom_WindingTest().clear();
				return;
			case WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)null);
				return;
			case WiresPackage.TRANSFORMER_WINDING__INSULATION_U:
				setInsulationU(INSULATION_U_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__EMERGENCY_S:
				setEmergencyS(EMERGENCY_S_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__CONNECTION_TYPE:
				setConnectionType(CONNECTION_TYPE_EDEFAULT);
				return;
			case WiresPackage.TRANSFORMER_WINDING__XGROUND:
				setXground(XGROUND_EDEFAULT);
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
			case WiresPackage.TRANSFORMER_WINDING__G0:
				return g0 != G0_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__TO_WINDING_TEST:
				return to_WindingTest != null && !to_WindingTest.isEmpty();
			case WiresPackage.TRANSFORMER_WINDING__RGROUND:
				return rground != RGROUND_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__GROUNDED:
				return grounded != GROUNDED_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__SHORT_TERM_S:
				return shortTermS != SHORT_TERM_S_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__G:
				return g != G_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__B:
				return b != B_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__X:
				return x != X_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				return phaseTapChanger != null;
			case WiresPackage.TRANSFORMER_WINDING__R:
				return r != R_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__R0:
				return r0 != R0_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__B0:
				return b0 != B0_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER:
				return powerTransformer != null;
			case WiresPackage.TRANSFORMER_WINDING__WINDING_TYPE:
				return windingType != WINDING_TYPE_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__X0:
				return x0 != X0_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__RATED_S:
				return ratedS != RATED_S_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__RATED_U:
				return ratedU != RATED_U_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__FROM_WINDING_TEST:
				return from_WindingTest != null && !from_WindingTest.isEmpty();
			case WiresPackage.TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				return ratioTapChanger != null;
			case WiresPackage.TRANSFORMER_WINDING__INSULATION_U:
				return insulationU != INSULATION_U_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__EMERGENCY_S:
				return emergencyS != EMERGENCY_S_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__CONNECTION_TYPE:
				return connectionType != CONNECTION_TYPE_EDEFAULT;
			case WiresPackage.TRANSFORMER_WINDING__XGROUND:
				return xground != XGROUND_EDEFAULT;
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
		result.append(" (g0: ");
		result.append(g0);
		result.append(", rground: ");
		result.append(rground);
		result.append(", grounded: ");
		result.append(grounded);
		result.append(", shortTermS: ");
		result.append(shortTermS);
		result.append(", g: ");
		result.append(g);
		result.append(", b: ");
		result.append(b);
		result.append(", x: ");
		result.append(x);
		result.append(", r: ");
		result.append(r);
		result.append(", r0: ");
		result.append(r0);
		result.append(", b0: ");
		result.append(b0);
		result.append(", windingType: ");
		result.append(windingType);
		result.append(", x0: ");
		result.append(x0);
		result.append(", ratedS: ");
		result.append(ratedS);
		result.append(", ratedU: ");
		result.append(ratedU);
		result.append(", insulationU: ");
		result.append(insulationU);
		result.append(", emergencyS: ");
		result.append(emergencyS);
		result.append(", connectionType: ");
		result.append(connectionType);
		result.append(", xground: ");
		result.append(xground);
		result.append(')');
		return result.toString();
	}

} //TransformerWindingImpl
