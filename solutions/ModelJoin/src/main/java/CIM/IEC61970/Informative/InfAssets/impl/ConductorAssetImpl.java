/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Assets.impl.AssetImpl;

import CIM.IEC61968.WiresExt.DistributionLineSegment;
import CIM.IEC61968.WiresExt.WiresExtPackage;

import CIM.IEC61970.Informative.InfAssets.ConductorAsset;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfOperations.CircuitSection;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conductor Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl#getGroundingMethod <em>Grounding Method</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl#getCircuitSection <em>Circuit Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl#getConductorSegment <em>Conductor Segment</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl#isInsulated <em>Insulated</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ConductorAssetImpl#isIsHorizontal <em>Is Horizontal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductorAssetImpl extends AssetImpl implements ConductorAsset {
	/**
	 * The default value of the '{@link #getGroundingMethod() <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundingMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUNDING_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroundingMethod() <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundingMethod()
	 * @generated
	 * @ordered
	 */
	protected String groundingMethod = GROUNDING_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCircuitSection() <em>Circuit Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitSection()
	 * @generated
	 * @ordered
	 */
	protected CircuitSection circuitSection;

	/**
	 * The cached value of the '{@link #getConductorSegment() <em>Conductor Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorSegment()
	 * @generated
	 * @ordered
	 */
	protected DistributionLineSegment conductorSegment;

	/**
	 * The default value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean insulated = INSULATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HORIZONTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean isHorizontal = IS_HORIZONTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getConductorAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroundingMethod() {
		return groundingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundingMethod(String newGroundingMethod) {
		String oldGroundingMethod = groundingMethod;
		groundingMethod = newGroundingMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD, oldGroundingMethod, groundingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitSection getCircuitSection() {
		if (circuitSection != null && circuitSection.eIsProxy()) {
			InternalEObject oldCircuitSection = (InternalEObject)circuitSection;
			circuitSection = (CircuitSection)eResolveProxy(oldCircuitSection);
			if (circuitSection != oldCircuitSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION, oldCircuitSection, circuitSection));
			}
		}
		return circuitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitSection basicGetCircuitSection() {
		return circuitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitSection(CircuitSection newCircuitSection, NotificationChain msgs) {
		CircuitSection oldCircuitSection = circuitSection;
		circuitSection = newCircuitSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION, oldCircuitSection, newCircuitSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitSection(CircuitSection newCircuitSection) {
		if (newCircuitSection != circuitSection) {
			NotificationChain msgs = null;
			if (circuitSection != null)
				msgs = ((InternalEObject)circuitSection).eInverseRemove(this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, CircuitSection.class, msgs);
			if (newCircuitSection != null)
				msgs = ((InternalEObject)newCircuitSection).eInverseAdd(this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, CircuitSection.class, msgs);
			msgs = basicSetCircuitSection(newCircuitSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION, newCircuitSection, newCircuitSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionLineSegment getConductorSegment() {
		if (conductorSegment != null && conductorSegment.eIsProxy()) {
			InternalEObject oldConductorSegment = (InternalEObject)conductorSegment;
			conductorSegment = (DistributionLineSegment)eResolveProxy(oldConductorSegment);
			if (conductorSegment != oldConductorSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT, oldConductorSegment, conductorSegment));
			}
		}
		return conductorSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionLineSegment basicGetConductorSegment() {
		return conductorSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductorSegment(DistributionLineSegment newConductorSegment, NotificationChain msgs) {
		DistributionLineSegment oldConductorSegment = conductorSegment;
		conductorSegment = newConductorSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT, oldConductorSegment, newConductorSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductorSegment(DistributionLineSegment newConductorSegment) {
		if (newConductorSegment != conductorSegment) {
			NotificationChain msgs = null;
			if (conductorSegment != null)
				msgs = ((InternalEObject)conductorSegment).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS, DistributionLineSegment.class, msgs);
			if (newConductorSegment != null)
				msgs = ((InternalEObject)newConductorSegment).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS, DistributionLineSegment.class, msgs);
			msgs = basicSetConductorSegment(newConductorSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT, newConductorSegment, newConductorSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsulated() {
		return insulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulated(boolean newInsulated) {
		boolean oldInsulated = insulated;
		insulated = newInsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__INSULATED, oldInsulated, insulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHorizontal() {
		return isHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHorizontal(boolean newIsHorizontal) {
		boolean oldIsHorizontal = isHorizontal;
		isHorizontal = newIsHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL, oldIsHorizontal, isHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				if (circuitSection != null)
					msgs = ((InternalEObject)circuitSection).eInverseRemove(this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, CircuitSection.class, msgs);
				return basicSetCircuitSection((CircuitSection)otherEnd, msgs);
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				if (conductorSegment != null)
					msgs = ((InternalEObject)conductorSegment).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_LINE_SEGMENT__CONDUCTOR_ASSETS, DistributionLineSegment.class, msgs);
				return basicSetConductorSegment((DistributionLineSegment)otherEnd, msgs);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				return basicSetCircuitSection(null, msgs);
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				return basicSetConductorSegment(null, msgs);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				return getGroundingMethod();
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				if (resolve) return getCircuitSection();
				return basicGetCircuitSection();
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				if (resolve) return getConductorSegment();
				return basicGetConductorSegment();
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				return isInsulated();
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				return isIsHorizontal();
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
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				setGroundingMethod((String)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				setCircuitSection((CircuitSection)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				setConductorSegment((DistributionLineSegment)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				setInsulated((Boolean)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				setIsHorizontal((Boolean)newValue);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				setGroundingMethod(GROUNDING_METHOD_EDEFAULT);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				setCircuitSection((CircuitSection)null);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				setConductorSegment((DistributionLineSegment)null);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				setInsulated(INSULATED_EDEFAULT);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				setIsHorizontal(IS_HORIZONTAL_EDEFAULT);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				return GROUNDING_METHOD_EDEFAULT == null ? groundingMethod != null : !GROUNDING_METHOD_EDEFAULT.equals(groundingMethod);
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				return circuitSection != null;
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				return conductorSegment != null;
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				return insulated != INSULATED_EDEFAULT;
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				return isHorizontal != IS_HORIZONTAL_EDEFAULT;
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
		result.append(" (groundingMethod: ");
		result.append(groundingMethod);
		result.append(", insulated: ");
		result.append(insulated);
		result.append(", isHorizontal: ");
		result.append(isHorizontal);
		result.append(')');
		return result.toString();
	}

} //ConductorAssetImpl
