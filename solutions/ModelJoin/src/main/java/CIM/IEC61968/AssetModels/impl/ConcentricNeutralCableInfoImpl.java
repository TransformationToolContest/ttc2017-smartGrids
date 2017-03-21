/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo;
import CIM.IEC61968.AssetModels.WireType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concentric Neutral Cable Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl#getDiameterOverNeutral <em>Diameter Over Neutral</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl#getNeutralStrandCount <em>Neutral Strand Count</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.ConcentricNeutralCableInfoImpl#getWireType <em>Wire Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcentricNeutralCableInfoImpl extends CableInfoImpl implements ConcentricNeutralCableInfo {
	/**
	 * The default value of the '{@link #getDiameterOverNeutral() <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverNeutral()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_NEUTRAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverNeutral() <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverNeutral()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverNeutral = DIAMETER_OVER_NEUTRAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralStrandCount() <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStrandCount()
	 * @generated
	 * @ordered
	 */
	protected static final int NEUTRAL_STRAND_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeutralStrandCount() <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStrandCount()
	 * @generated
	 * @ordered
	 */
	protected int neutralStrandCount = NEUTRAL_STRAND_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWireType() <em>Wire Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireType()
	 * @generated
	 * @ordered
	 */
	protected WireType wireType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcentricNeutralCableInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.CONCENTRIC_NEUTRAL_CABLE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiameterOverNeutral() {
		return diameterOverNeutral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameterOverNeutral(float newDiameterOverNeutral) {
		float oldDiameterOverNeutral = diameterOverNeutral;
		diameterOverNeutral = newDiameterOverNeutral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL, oldDiameterOverNeutral, diameterOverNeutral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeutralStrandCount() {
		return neutralStrandCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralStrandCount(int newNeutralStrandCount) {
		int oldNeutralStrandCount = neutralStrandCount;
		neutralStrandCount = newNeutralStrandCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT, oldNeutralStrandCount, neutralStrandCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType getWireType() {
		if (wireType != null && wireType.eIsProxy()) {
			InternalEObject oldWireType = (InternalEObject)wireType;
			wireType = (WireType)eResolveProxy(oldWireType);
			if (wireType != oldWireType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE, oldWireType, wireType));
			}
		}
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType basicGetWireType() {
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireType(WireType newWireType, NotificationChain msgs) {
		WireType oldWireType = wireType;
		wireType = newWireType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE, oldWireType, newWireType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireType(WireType newWireType) {
		if (newWireType != wireType) {
			NotificationChain msgs = null;
			if (wireType != null)
				msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, WireType.class, msgs);
			if (newWireType != null)
				msgs = ((InternalEObject)newWireType).eInverseAdd(this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, WireType.class, msgs);
			msgs = basicSetWireType(newWireType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE, newWireType, newWireType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				if (wireType != null)
					msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, WireType.class, msgs);
				return basicSetWireType((WireType)otherEnd, msgs);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				return basicSetWireType(null, msgs);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				return getDiameterOverNeutral();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				return getNeutralStrandCount();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				if (resolve) return getWireType();
				return basicGetWireType();
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				setDiameterOverNeutral((Float)newValue);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				setNeutralStrandCount((Integer)newValue);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				setWireType((WireType)newValue);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				setDiameterOverNeutral(DIAMETER_OVER_NEUTRAL_EDEFAULT);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				setNeutralStrandCount(NEUTRAL_STRAND_COUNT_EDEFAULT);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				setWireType((WireType)null);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				return diameterOverNeutral != DIAMETER_OVER_NEUTRAL_EDEFAULT;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				return neutralStrandCount != NEUTRAL_STRAND_COUNT_EDEFAULT;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				return wireType != null;
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
		result.append(" (diameterOverNeutral: ");
		result.append(diameterOverNeutral);
		result.append(", neutralStrandCount: ");
		result.append(neutralStrandCount);
		result.append(')');
		return result.toString();
	}

} //ConcentricNeutralCableInfoImpl
