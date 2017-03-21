/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.ConductorInfo;
import CIM.IEC61968.AssetModels.WireArrangement;
import CIM.IEC61968.AssetModels.WireType;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Arrangement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireArrangementImpl#getWireType <em>Wire Type</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireArrangementImpl#getConductorInfo <em>Conductor Info</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireArrangementImpl#getMountingPointX <em>Mounting Point X</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireArrangementImpl#getMountingPointY <em>Mounting Point Y</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireArrangementImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireArrangementImpl extends IdentifiedObjectImpl implements WireArrangement {
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
	 * The cached value of the '{@link #getConductorInfo() <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorInfo()
	 * @generated
	 * @ordered
	 */
	protected ConductorInfo conductorInfo;

	/**
	 * The default value of the '{@link #getMountingPointX() <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointX()
	 * @generated
	 * @ordered
	 */
	protected static final float MOUNTING_POINT_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMountingPointX() <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointX()
	 * @generated
	 * @ordered
	 */
	protected float mountingPointX = MOUNTING_POINT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountingPointY() <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointY()
	 * @generated
	 * @ordered
	 */
	protected static final float MOUNTING_POINT_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMountingPointY() <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointY()
	 * @generated
	 * @ordered
	 */
	protected float mountingPointY = MOUNTING_POINT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireArrangementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.WIRE_ARRANGEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE, oldWireType, wireType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE, oldWireType, newWireType);
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
				msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, WireType.class, msgs);
			if (newWireType != null)
				msgs = ((InternalEObject)newWireType).eInverseAdd(this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, WireType.class, msgs);
			msgs = basicSetWireType(newWireType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE, newWireType, newWireType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo getConductorInfo() {
		if (conductorInfo != null && conductorInfo.eIsProxy()) {
			InternalEObject oldConductorInfo = (InternalEObject)conductorInfo;
			conductorInfo = (ConductorInfo)eResolveProxy(oldConductorInfo);
			if (conductorInfo != oldConductorInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO, oldConductorInfo, conductorInfo));
			}
		}
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo basicGetConductorInfo() {
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductorInfo(ConductorInfo newConductorInfo, NotificationChain msgs) {
		ConductorInfo oldConductorInfo = conductorInfo;
		conductorInfo = newConductorInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO, oldConductorInfo, newConductorInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductorInfo(ConductorInfo newConductorInfo) {
		if (newConductorInfo != conductorInfo) {
			NotificationChain msgs = null;
			if (conductorInfo != null)
				msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, ConductorInfo.class, msgs);
			if (newConductorInfo != null)
				msgs = ((InternalEObject)newConductorInfo).eInverseAdd(this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, ConductorInfo.class, msgs);
			msgs = basicSetConductorInfo(newConductorInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO, newConductorInfo, newConductorInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMountingPointX() {
		return mountingPointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountingPointX(float newMountingPointX) {
		float oldMountingPointX = mountingPointX;
		mountingPointX = newMountingPointX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X, oldMountingPointX, mountingPointX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMountingPointY() {
		return mountingPointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountingPointY(float newMountingPointY) {
		float oldMountingPointY = mountingPointY;
		mountingPointY = newMountingPointY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y, oldMountingPointY, mountingPointY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_ARRANGEMENT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				if (wireType != null)
					msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, WireType.class, msgs);
				return basicSetWireType((WireType)otherEnd, msgs);
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				if (conductorInfo != null)
					msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, ConductorInfo.class, msgs);
				return basicSetConductorInfo((ConductorInfo)otherEnd, msgs);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				return basicSetWireType(null, msgs);
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				return basicSetConductorInfo(null, msgs);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				if (resolve) return getWireType();
				return basicGetWireType();
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				if (resolve) return getConductorInfo();
				return basicGetConductorInfo();
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				return getMountingPointX();
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				return getMountingPointY();
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				return getPosition();
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				setWireType((WireType)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				setMountingPointX((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				setMountingPointY((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				setPosition((Integer)newValue);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				setWireType((WireType)null);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)null);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				setMountingPointX(MOUNTING_POINT_X_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				setMountingPointY(MOUNTING_POINT_Y_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				return wireType != null;
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				return conductorInfo != null;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				return mountingPointX != MOUNTING_POINT_X_EDEFAULT;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				return mountingPointY != MOUNTING_POINT_Y_EDEFAULT;
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				return position != POSITION_EDEFAULT;
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
		result.append(" (mountingPointX: ");
		result.append(mountingPointX);
		result.append(", mountingPointY: ");
		result.append(mountingPointY);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //WireArrangementImpl
