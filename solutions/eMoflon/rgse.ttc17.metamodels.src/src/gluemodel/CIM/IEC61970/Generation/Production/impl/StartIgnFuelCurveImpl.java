/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Generation.Production.FuelType;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;
import gluemodel.CIM.IEC61970.Generation.Production.StartIgnFuelCurve;
import gluemodel.CIM.IEC61970.Generation.Production.StartupModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Ign Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartIgnFuelCurveImpl#getIgnitionFuelType <em>Ignition Fuel Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.StartIgnFuelCurveImpl#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartIgnFuelCurveImpl extends CurveImpl implements StartIgnFuelCurve {
	/**
	 * The default value of the '{@link #getIgnitionFuelType() <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnitionFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType IGNITION_FUEL_TYPE_EDEFAULT = FuelType.OIL;

	/**
	 * The cached value of the '{@link #getIgnitionFuelType() <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnitionFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType ignitionFuelType = IGNITION_FUEL_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartIgnFuelCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.START_IGN_FUEL_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelType getIgnitionFuelType() {
		return ignitionFuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnitionFuelType(FuelType newIgnitionFuelType) {
		FuelType oldIgnitionFuelType = ignitionFuelType;
		ignitionFuelType = newIgnitionFuelType == null ? IGNITION_FUEL_TYPE_EDEFAULT : newIgnitionFuelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE, oldIgnitionFuelType, ignitionFuelType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, oldStartupModel, startupModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, oldStartupModel, newStartupModel);
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
				msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, StartupModel.class, msgs);
			if (newStartupModel != null)
				msgs = ((InternalEObject)newStartupModel).eInverseAdd(this, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, StartupModel.class, msgs);
			msgs = basicSetStartupModel(newStartupModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, newStartupModel, newStartupModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				if (startupModel != null)
					msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, StartupModel.class, msgs);
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
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
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
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				return getIgnitionFuelType();
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				if (resolve) return getStartupModel();
				return basicGetStartupModel();
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
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				setIgnitionFuelType((FuelType)newValue);
				return;
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)newValue);
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
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				setIgnitionFuelType(IGNITION_FUEL_TYPE_EDEFAULT);
				return;
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)null);
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
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				return ignitionFuelType != IGNITION_FUEL_TYPE_EDEFAULT;
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				return startupModel != null;
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
		result.append(" (ignitionFuelType: ");
		result.append(ignitionFuelType);
		result.append(')');
		return result.toString();
	}

} //StartIgnFuelCurveImpl
