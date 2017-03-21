/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.StartRampCurve;
import CIM.IEC61970.Generation.Production.StartupModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Ramp Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.StartRampCurveImpl#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.StartRampCurveImpl#getHotStandbyRamp <em>Hot Standby Ramp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartRampCurveImpl extends CurveImpl implements StartRampCurve {
	/**
	 * The cached value of the '{@link #getStartupModel() <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupModel()
	 * @generated
	 * @ordered
	 */
	protected StartupModel startupModel;

	/**
	 * The default value of the '{@link #getHotStandbyRamp() <em>Hot Standby Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandbyRamp()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_STANDBY_RAMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotStandbyRamp() <em>Hot Standby Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandbyRamp()
	 * @generated
	 * @ordered
	 */
	protected float hotStandbyRamp = HOT_STANDBY_RAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartRampCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.START_RAMP_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel getStartupModel() {
		if (startupModel != null && startupModel.eIsProxy()) {
			InternalEObject oldStartupModel = (InternalEObject)startupModel;
			startupModel = (StartupModel)eResolveProxy(oldStartupModel);
			if (startupModel != oldStartupModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, oldStartupModel, startupModel));
			}
		}
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel basicGetStartupModel() {
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartupModel(StartupModel newStartupModel, NotificationChain msgs) {
		StartupModel oldStartupModel = startupModel;
		startupModel = newStartupModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, oldStartupModel, newStartupModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupModel(StartupModel newStartupModel) {
		if (newStartupModel != startupModel) {
			NotificationChain msgs = null;
			if (startupModel != null)
				msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE, StartupModel.class, msgs);
			if (newStartupModel != null)
				msgs = ((InternalEObject)newStartupModel).eInverseAdd(this, ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE, StartupModel.class, msgs);
			msgs = basicSetStartupModel(newStartupModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, newStartupModel, newStartupModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHotStandbyRamp() {
		return hotStandbyRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotStandbyRamp(float newHotStandbyRamp) {
		float oldHotStandbyRamp = hotStandbyRamp;
		hotStandbyRamp = newHotStandbyRamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.START_RAMP_CURVE__HOT_STANDBY_RAMP, oldHotStandbyRamp, hotStandbyRamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL:
				if (startupModel != null)
					msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE, StartupModel.class, msgs);
				return basicSetStartupModel((StartupModel)otherEnd, msgs);
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
			case ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL:
				return basicSetStartupModel(null, msgs);
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
			case ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL:
				if (resolve) return getStartupModel();
				return basicGetStartupModel();
			case ProductionPackage.START_RAMP_CURVE__HOT_STANDBY_RAMP:
				return getHotStandbyRamp();
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
			case ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)newValue);
				return;
			case ProductionPackage.START_RAMP_CURVE__HOT_STANDBY_RAMP:
				setHotStandbyRamp((Float)newValue);
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
			case ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)null);
				return;
			case ProductionPackage.START_RAMP_CURVE__HOT_STANDBY_RAMP:
				setHotStandbyRamp(HOT_STANDBY_RAMP_EDEFAULT);
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
			case ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL:
				return startupModel != null;
			case ProductionPackage.START_RAMP_CURVE__HOT_STANDBY_RAMP:
				return hotStandbyRamp != HOT_STANDBY_RAMP_EDEFAULT;
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
		result.append(" (hotStandbyRamp: ");
		result.append(hotStandbyRamp);
		result.append(')');
		return result.toString();
	}

} //StartRampCurveImpl
