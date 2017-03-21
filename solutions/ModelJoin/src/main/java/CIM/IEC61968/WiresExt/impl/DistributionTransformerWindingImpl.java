/**
 */
package CIM.IEC61968.WiresExt.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.WindingInfo;

import CIM.IEC61968.WiresExt.DistributionTransformer;
import CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import CIM.IEC61968.WiresExt.WindingPiImpedance;
import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.WindingInsulation;

import CIM.IEC61970.Wires.PhaseTapChanger;
import CIM.IEC61970.Wires.RatioTapChanger;
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
 * An implementation of the model object '<em><b>Distribution Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getFromWindingInsulations <em>From Winding Insulations</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getXground <em>Xground</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getPiImpedance <em>Pi Impedance</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getRground <em>Rground</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getToWindingInsulations <em>To Winding Insulations</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.impl.DistributionTransformerWindingImpl#getWindingInfo <em>Winding Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionTransformerWindingImpl extends ConductingEquipmentImpl implements DistributionTransformerWinding {
	/**
	 * The cached value of the '{@link #getFromWindingInsulations() <em>From Winding Insulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromWindingInsulations()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> fromWindingInsulations;

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
	 * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChanger()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChanger phaseTapChanger;

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
	 * The cached value of the '{@link #getPiImpedance() <em>Pi Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiImpedance()
	 * @generated
	 * @ordered
	 */
	protected WindingPiImpedance piImpedance;

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
	 * The cached value of the '{@link #getToWindingInsulations() <em>To Winding Insulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToWindingInsulations()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> toWindingInsulations;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected DistributionTransformer transformer;

	/**
	 * The cached value of the '{@link #getWindingInfo() <em>Winding Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInfo()
	 * @generated
	 * @ordered
	 */
	protected WindingInfo windingInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionTransformerWindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.DISTRIBUTION_TRANSFORMER_WINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingInsulation> getFromWindingInsulations() {
		if (fromWindingInsulations == null) {
			fromWindingInsulations = new EObjectWithInverseResolvingEList<WindingInsulation>(WindingInsulation.class, this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS, InfAssetsPackage.WINDING_INSULATION__FROM_WINDING);
		}
		return fromWindingInsulations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER, oldRatioTapChanger, ratioTapChanger));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER, oldRatioTapChanger, newRatioTapChanger);
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
				msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__WINDING, RatioTapChanger.class, msgs);
			if (newRatioTapChanger != null)
				msgs = ((InternalEObject)newRatioTapChanger).eInverseAdd(this, WiresPackage.RATIO_TAP_CHANGER__WINDING, RatioTapChanger.class, msgs);
			msgs = basicSetRatioTapChanger(newRatioTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER, newRatioTapChanger, newRatioTapChanger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED, oldGrounded, grounded));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER, oldPhaseTapChanger, phaseTapChanger));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER, oldPhaseTapChanger, newPhaseTapChanger);
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
				msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__WINDING, PhaseTapChanger.class, msgs);
			if (newPhaseTapChanger != null)
				msgs = ((InternalEObject)newPhaseTapChanger).eInverseAdd(this, WiresPackage.PHASE_TAP_CHANGER__WINDING, PhaseTapChanger.class, msgs);
			msgs = basicSetPhaseTapChanger(newPhaseTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER, newPhaseTapChanger, newPhaseTapChanger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__XGROUND, oldXground, xground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingPiImpedance getPiImpedance() {
		if (piImpedance != null && piImpedance.eIsProxy()) {
			InternalEObject oldPiImpedance = (InternalEObject)piImpedance;
			piImpedance = (WindingPiImpedance)eResolveProxy(oldPiImpedance);
			if (piImpedance != oldPiImpedance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE, oldPiImpedance, piImpedance));
			}
		}
		return piImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingPiImpedance basicGetPiImpedance() {
		return piImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPiImpedance(WindingPiImpedance newPiImpedance, NotificationChain msgs) {
		WindingPiImpedance oldPiImpedance = piImpedance;
		piImpedance = newPiImpedance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE, oldPiImpedance, newPiImpedance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiImpedance(WindingPiImpedance newPiImpedance) {
		if (newPiImpedance != piImpedance) {
			NotificationChain msgs = null;
			if (piImpedance != null)
				msgs = ((InternalEObject)piImpedance).eInverseRemove(this, WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS, WindingPiImpedance.class, msgs);
			if (newPiImpedance != null)
				msgs = ((InternalEObject)newPiImpedance).eInverseAdd(this, WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS, WindingPiImpedance.class, msgs);
			msgs = basicSetPiImpedance(newPiImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE, newPiImpedance, newPiImpedance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RGROUND, oldRground, rground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingInsulation> getToWindingInsulations() {
		if (toWindingInsulations == null) {
			toWindingInsulations = new EObjectWithInverseResolvingEList<WindingInsulation>(WindingInsulation.class, this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS, InfAssetsPackage.WINDING_INSULATION__TO_WINDING);
		}
		return toWindingInsulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer getTransformer() {
		if (transformer != null && transformer.eIsProxy()) {
			InternalEObject oldTransformer = (InternalEObject)transformer;
			transformer = (DistributionTransformer)eResolveProxy(oldTransformer);
			if (transformer != oldTransformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER, oldTransformer, transformer));
			}
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer basicGetTransformer() {
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformer(DistributionTransformer newTransformer, NotificationChain msgs) {
		DistributionTransformer oldTransformer = transformer;
		transformer = newTransformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER, oldTransformer, newTransformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer(DistributionTransformer newTransformer) {
		if (newTransformer != transformer) {
			NotificationChain msgs = null;
			if (transformer != null)
				msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS, DistributionTransformer.class, msgs);
			if (newTransformer != null)
				msgs = ((InternalEObject)newTransformer).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS, DistributionTransformer.class, msgs);
			msgs = basicSetTransformer(newTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER, newTransformer, newTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo getWindingInfo() {
		if (windingInfo != null && windingInfo.eIsProxy()) {
			InternalEObject oldWindingInfo = (InternalEObject)windingInfo;
			windingInfo = (WindingInfo)eResolveProxy(oldWindingInfo);
			if (windingInfo != oldWindingInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO, oldWindingInfo, windingInfo));
			}
		}
		return windingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo basicGetWindingInfo() {
		return windingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindingInfo(WindingInfo newWindingInfo, NotificationChain msgs) {
		WindingInfo oldWindingInfo = windingInfo;
		windingInfo = newWindingInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO, oldWindingInfo, newWindingInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindingInfo(WindingInfo newWindingInfo) {
		if (newWindingInfo != windingInfo) {
			NotificationChain msgs = null;
			if (windingInfo != null)
				msgs = ((InternalEObject)windingInfo).eInverseRemove(this, AssetModelsPackage.WINDING_INFO__WINDINGS, WindingInfo.class, msgs);
			if (newWindingInfo != null)
				msgs = ((InternalEObject)newWindingInfo).eInverseAdd(this, AssetModelsPackage.WINDING_INFO__WINDINGS, WindingInfo.class, msgs);
			msgs = basicSetWindingInfo(newWindingInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO, newWindingInfo, newWindingInfo));
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromWindingInsulations()).basicAdd(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				if (ratioTapChanger != null)
					msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__WINDING, RatioTapChanger.class, msgs);
				return basicSetRatioTapChanger((RatioTapChanger)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				if (phaseTapChanger != null)
					msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__WINDING, PhaseTapChanger.class, msgs);
				return basicSetPhaseTapChanger((PhaseTapChanger)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE:
				if (piImpedance != null)
					msgs = ((InternalEObject)piImpedance).eInverseRemove(this, WiresExtPackage.WINDING_PI_IMPEDANCE__WINDINGS, WindingPiImpedance.class, msgs);
				return basicSetPiImpedance((WindingPiImpedance)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToWindingInsulations()).basicAdd(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER:
				if (transformer != null)
					msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__WINDINGS, DistributionTransformer.class, msgs);
				return basicSetTransformer((DistributionTransformer)otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO:
				if (windingInfo != null)
					msgs = ((InternalEObject)windingInfo).eInverseRemove(this, AssetModelsPackage.WINDING_INFO__WINDINGS, WindingInfo.class, msgs);
				return basicSetWindingInfo((WindingInfo)otherEnd, msgs);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS:
				return ((InternalEList<?>)getFromWindingInsulations()).basicRemove(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				return basicSetRatioTapChanger(null, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				return basicSetPhaseTapChanger(null, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE:
				return basicSetPiImpedance(null, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS:
				return ((InternalEList<?>)getToWindingInsulations()).basicRemove(otherEnd, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER:
				return basicSetTransformer(null, msgs);
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO:
				return basicSetWindingInfo(null, msgs);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS:
				return getFromWindingInsulations();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				if (resolve) return getRatioTapChanger();
				return basicGetRatioTapChanger();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED:
				return isGrounded();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				if (resolve) return getPhaseTapChanger();
				return basicGetPhaseTapChanger();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__XGROUND:
				return getXground();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE:
				if (resolve) return getPiImpedance();
				return basicGetPiImpedance();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RGROUND:
				return getRground();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS:
				return getToWindingInsulations();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER:
				if (resolve) return getTransformer();
				return basicGetTransformer();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO:
				if (resolve) return getWindingInfo();
				return basicGetWindingInfo();
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS:
				getFromWindingInsulations().clear();
				getFromWindingInsulations().addAll((Collection<? extends WindingInsulation>)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED:
				setGrounded((Boolean)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__XGROUND:
				setXground((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE:
				setPiImpedance((WindingPiImpedance)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RGROUND:
				setRground((Float)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS:
				getToWindingInsulations().clear();
				getToWindingInsulations().addAll((Collection<? extends WindingInsulation>)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER:
				setTransformer((DistributionTransformer)newValue);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO:
				setWindingInfo((WindingInfo)newValue);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS:
				getFromWindingInsulations().clear();
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)null);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED:
				setGrounded(GROUNDED_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)null);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__XGROUND:
				setXground(XGROUND_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE:
				setPiImpedance((WindingPiImpedance)null);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RGROUND:
				setRground(RGROUND_EDEFAULT);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS:
				getToWindingInsulations().clear();
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER:
				setTransformer((DistributionTransformer)null);
				return;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO:
				setWindingInfo((WindingInfo)null);
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
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS:
				return fromWindingInsulations != null && !fromWindingInsulations.isEmpty();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RATIO_TAP_CHANGER:
				return ratioTapChanger != null;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__GROUNDED:
				return grounded != GROUNDED_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PHASE_TAP_CHANGER:
				return phaseTapChanger != null;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__XGROUND:
				return xground != XGROUND_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__PI_IMPEDANCE:
				return piImpedance != null;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__RGROUND:
				return rground != RGROUND_EDEFAULT;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS:
				return toWindingInsulations != null && !toWindingInsulations.isEmpty();
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TRANSFORMER:
				return transformer != null;
			case WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__WINDING_INFO:
				return windingInfo != null;
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
		result.append(" (grounded: ");
		result.append(grounded);
		result.append(", xground: ");
		result.append(xground);
		result.append(", rground: ");
		result.append(rground);
		result.append(')');
		return result.toString();
	}

} //DistributionTransformerWindingImpl
