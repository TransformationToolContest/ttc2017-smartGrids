/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.LevelVsVolumeCurve;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.Reservoir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Vs Volume Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.LevelVsVolumeCurveImpl#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelVsVolumeCurveImpl extends CurveImpl implements LevelVsVolumeCurve {
	/**
	 * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir reservoir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelVsVolumeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.LEVEL_VS_VOLUME_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir getReservoir() {
		if (reservoir != null && reservoir.eIsProxy()) {
			InternalEObject oldReservoir = (InternalEObject)reservoir;
			reservoir = (Reservoir)eResolveProxy(oldReservoir);
			if (reservoir != oldReservoir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, oldReservoir, reservoir));
			}
		}
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetReservoir() {
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservoir(Reservoir newReservoir, NotificationChain msgs) {
		Reservoir oldReservoir = reservoir;
		reservoir = newReservoir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, oldReservoir, newReservoir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservoir(Reservoir newReservoir) {
		if (newReservoir != reservoir) {
			NotificationChain msgs = null;
			if (reservoir != null)
				msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, Reservoir.class, msgs);
			if (newReservoir != null)
				msgs = ((InternalEObject)newReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, Reservoir.class, msgs);
			msgs = basicSetReservoir(newReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR, newReservoir, newReservoir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
				if (reservoir != null)
					msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, Reservoir.class, msgs);
				return basicSetReservoir((Reservoir)otherEnd, msgs);
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
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
				return basicSetReservoir(null, msgs);
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
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
				if (resolve) return getReservoir();
				return basicGetReservoir();
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
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
				setReservoir((Reservoir)newValue);
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
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
				setReservoir((Reservoir)null);
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
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR:
				return reservoir != null;
		}
		return super.eIsSet(featureID);
	}

} //LevelVsVolumeCurveImpl
