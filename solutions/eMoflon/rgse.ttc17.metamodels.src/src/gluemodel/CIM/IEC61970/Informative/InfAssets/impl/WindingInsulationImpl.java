/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation;
import gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation;

import gluemodel.CIM.IEC61970.Wires.Ground;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Winding Insulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getInsulationResistance <em>Insulation Resistance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getToWinding <em>To Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getGround <em>Ground</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getTransformerObservation <em>Transformer Observation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getLeakageReactance <em>Leakage Reactance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getFromWinding <em>From Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.WindingInsulationImpl#getInsulationPFStatus <em>Insulation PF Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindingInsulationImpl extends IdentifiedObjectImpl implements WindingInsulation {
	/**
	 * The default value of the '{@link #getInsulationResistance() <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationResistance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulationResistance() <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationResistance()
	 * @generated
	 * @ordered
	 */
	protected String insulationResistance = INSULATION_RESISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToWinding() <em>To Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToWinding()
	 * @generated
	 * @ordered
	 */
	protected DistributionTransformerWinding toWinding;

	/**
	 * The cached value of the '{@link #getGround() <em>Ground</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected Ground ground;

	/**
	 * The cached value of the '{@link #getTransformerObservation() <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservation()
	 * @generated
	 * @ordered
	 */
	protected TransformerObservation transformerObservation;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getLeakageReactance() <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageReactance()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_REACTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageReactance() <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageReactance()
	 * @generated
	 * @ordered
	 */
	protected float leakageReactance = LEAKAGE_REACTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromWinding() <em>From Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromWinding()
	 * @generated
	 * @ordered
	 */
	protected DistributionTransformerWinding fromWinding;

	/**
	 * The default value of the '{@link #getInsulationPFStatus() <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationPFStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_PF_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulationPFStatus() <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationPFStatus()
	 * @generated
	 * @ordered
	 */
	protected String insulationPFStatus = INSULATION_PF_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindingInsulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getWindingInsulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsulationResistance() {
		return insulationResistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationResistance(String newInsulationResistance) {
		String oldInsulationResistance = insulationResistance;
		insulationResistance = newInsulationResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE, oldInsulationResistance, insulationResistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding getToWinding() {
		if (toWinding != null && toWinding.eIsProxy()) {
			InternalEObject oldToWinding = (InternalEObject)toWinding;
			toWinding = (DistributionTransformerWinding)eResolveProxy(oldToWinding);
			if (toWinding != oldToWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.WINDING_INSULATION__TO_WINDING, oldToWinding, toWinding));
			}
		}
		return toWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding basicGetToWinding() {
		return toWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToWinding(DistributionTransformerWinding newToWinding, NotificationChain msgs) {
		DistributionTransformerWinding oldToWinding = toWinding;
		toWinding = newToWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__TO_WINDING, oldToWinding, newToWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToWinding(DistributionTransformerWinding newToWinding) {
		if (newToWinding != toWinding) {
			NotificationChain msgs = null;
			if (toWinding != null)
				msgs = ((InternalEObject)toWinding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS, DistributionTransformerWinding.class, msgs);
			if (newToWinding != null)
				msgs = ((InternalEObject)newToWinding).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS, DistributionTransformerWinding.class, msgs);
			msgs = basicSetToWinding(newToWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__TO_WINDING, newToWinding, newToWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ground getGround() {
		if (ground != null && ground.eIsProxy()) {
			InternalEObject oldGround = (InternalEObject)ground;
			ground = (Ground)eResolveProxy(oldGround);
			if (ground != oldGround) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.WINDING_INSULATION__GROUND, oldGround, ground));
			}
		}
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ground basicGetGround() {
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGround(Ground newGround, NotificationChain msgs) {
		Ground oldGround = ground;
		ground = newGround;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__GROUND, oldGround, newGround);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGround(Ground newGround) {
		if (newGround != ground) {
			NotificationChain msgs = null;
			if (ground != null)
				msgs = ((InternalEObject)ground).eInverseRemove(this, WiresPackage.GROUND__WINDING_INSULATIONS, Ground.class, msgs);
			if (newGround != null)
				msgs = ((InternalEObject)newGround).eInverseAdd(this, WiresPackage.GROUND__WINDING_INSULATIONS, Ground.class, msgs);
			msgs = basicSetGround(newGround, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__GROUND, newGround, newGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation getTransformerObservation() {
		if (transformerObservation != null && transformerObservation.eIsProxy()) {
			InternalEObject oldTransformerObservation = (InternalEObject)transformerObservation;
			transformerObservation = (TransformerObservation)eResolveProxy(oldTransformerObservation);
			if (transformerObservation != oldTransformerObservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION, oldTransformerObservation, transformerObservation));
			}
		}
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation basicGetTransformerObservation() {
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerObservation(TransformerObservation newTransformerObservation, NotificationChain msgs) {
		TransformerObservation oldTransformerObservation = transformerObservation;
		transformerObservation = newTransformerObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION, oldTransformerObservation, newTransformerObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerObservation(TransformerObservation newTransformerObservation) {
		if (newTransformerObservation != transformerObservation) {
			NotificationChain msgs = null;
			if (transformerObservation != null)
				msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, TransformerObservation.class, msgs);
			if (newTransformerObservation != null)
				msgs = ((InternalEObject)newTransformerObservation).eInverseAdd(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, TransformerObservation.class, msgs);
			msgs = basicSetTransformerObservation(newTransformerObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION, newTransformerObservation, newTransformerObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.WINDING_INSULATION__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeakageReactance() {
		return leakageReactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeakageReactance(float newLeakageReactance) {
		float oldLeakageReactance = leakageReactance;
		leakageReactance = newLeakageReactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE, oldLeakageReactance, leakageReactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding getFromWinding() {
		if (fromWinding != null && fromWinding.eIsProxy()) {
			InternalEObject oldFromWinding = (InternalEObject)fromWinding;
			fromWinding = (DistributionTransformerWinding)eResolveProxy(oldFromWinding);
			if (fromWinding != oldFromWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.WINDING_INSULATION__FROM_WINDING, oldFromWinding, fromWinding));
			}
		}
		return fromWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformerWinding basicGetFromWinding() {
		return fromWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromWinding(DistributionTransformerWinding newFromWinding, NotificationChain msgs) {
		DistributionTransformerWinding oldFromWinding = fromWinding;
		fromWinding = newFromWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__FROM_WINDING, oldFromWinding, newFromWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromWinding(DistributionTransformerWinding newFromWinding) {
		if (newFromWinding != fromWinding) {
			NotificationChain msgs = null;
			if (fromWinding != null)
				msgs = ((InternalEObject)fromWinding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS, DistributionTransformerWinding.class, msgs);
			if (newFromWinding != null)
				msgs = ((InternalEObject)newFromWinding).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS, DistributionTransformerWinding.class, msgs);
			msgs = basicSetFromWinding(newFromWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__FROM_WINDING, newFromWinding, newFromWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsulationPFStatus() {
		return insulationPFStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationPFStatus(String newInsulationPFStatus) {
		String oldInsulationPFStatus = insulationPFStatus;
		insulationPFStatus = newInsulationPFStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS, oldInsulationPFStatus, insulationPFStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				if (toWinding != null)
					msgs = ((InternalEObject)toWinding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__TO_WINDING_INSULATIONS, DistributionTransformerWinding.class, msgs);
				return basicSetToWinding((DistributionTransformerWinding)otherEnd, msgs);
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				if (ground != null)
					msgs = ((InternalEObject)ground).eInverseRemove(this, WiresPackage.GROUND__WINDING_INSULATIONS, Ground.class, msgs);
				return basicSetGround((Ground)otherEnd, msgs);
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				if (transformerObservation != null)
					msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, TransformerObservation.class, msgs);
				return basicSetTransformerObservation((TransformerObservation)otherEnd, msgs);
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				if (fromWinding != null)
					msgs = ((InternalEObject)fromWinding).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER_WINDING__FROM_WINDING_INSULATIONS, DistributionTransformerWinding.class, msgs);
				return basicSetFromWinding((DistributionTransformerWinding)otherEnd, msgs);
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
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				return basicSetToWinding(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				return basicSetGround(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				return basicSetTransformerObservation(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				return basicSetFromWinding(null, msgs);
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				return getInsulationResistance();
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				if (resolve) return getToWinding();
				return basicGetToWinding();
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				if (resolve) return getGround();
				return basicGetGround();
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				if (resolve) return getTransformerObservation();
				return basicGetTransformerObservation();
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				return getLeakageReactance();
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				if (resolve) return getFromWinding();
				return basicGetFromWinding();
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				return getInsulationPFStatus();
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				setInsulationResistance((String)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				setToWinding((DistributionTransformerWinding)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				setGround((Ground)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				setStatus((Status)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				setLeakageReactance((Float)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				setFromWinding((DistributionTransformerWinding)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				setInsulationPFStatus((String)newValue);
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				setInsulationResistance(INSULATION_RESISTANCE_EDEFAULT);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				setToWinding((DistributionTransformerWinding)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				setGround((Ground)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				setStatus((Status)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				setLeakageReactance(LEAKAGE_REACTANCE_EDEFAULT);
				return;
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				setFromWinding((DistributionTransformerWinding)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				setInsulationPFStatus(INSULATION_PF_STATUS_EDEFAULT);
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				return INSULATION_RESISTANCE_EDEFAULT == null ? insulationResistance != null : !INSULATION_RESISTANCE_EDEFAULT.equals(insulationResistance);
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				return toWinding != null;
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				return ground != null;
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				return transformerObservation != null;
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				return status != null;
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				return leakageReactance != LEAKAGE_REACTANCE_EDEFAULT;
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				return fromWinding != null;
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				return INSULATION_PF_STATUS_EDEFAULT == null ? insulationPFStatus != null : !INSULATION_PF_STATUS_EDEFAULT.equals(insulationPFStatus);
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
		result.append(" (insulationResistance: ");
		result.append(insulationResistance);
		result.append(", leakageReactance: ");
		result.append(leakageReactance);
		result.append(", insulationPFStatus: ");
		result.append(insulationPFStatus);
		result.append(')');
		return result.toString();
	}

} //WindingInsulationImpl
