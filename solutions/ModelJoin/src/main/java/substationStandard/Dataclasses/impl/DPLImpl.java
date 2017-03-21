/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.DataclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DPL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.DPLImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DPLImpl#getHwRev <em>Hw Rev</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DPLImpl#getSwRev <em>Sw Rev</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DPLImpl#getSerNum <em>Ser Num</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DPLImpl#getModel <em>Model</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.DPLImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DPLImpl extends MinimalEObjectImpl.Container implements DPL {
	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHwRev() <em>Hw Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwRev()
	 * @generated
	 * @ordered
	 */
	protected static final String HW_REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHwRev() <em>Hw Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwRev()
	 * @generated
	 * @ordered
	 */
	protected String hwRev = HW_REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwRev() <em>Sw Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwRev()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwRev() <em>Sw Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwRev()
	 * @generated
	 * @ordered
	 */
	protected String swRev = SW_REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerNum() <em>Ser Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerNum()
	 * @generated
	 * @ordered
	 */
	protected static final String SER_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerNum() <em>Ser Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerNum()
	 * @generated
	 * @ordered
	 */
	protected String serNum = SER_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.DPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPL__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHwRev() {
		return hwRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwRev(String newHwRev) {
		String oldHwRev = hwRev;
		hwRev = newHwRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPL__HW_REV, oldHwRev, hwRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwRev() {
		return swRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwRev(String newSwRev) {
		String oldSwRev = swRev;
		swRev = newSwRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPL__SW_REV, oldSwRev, swRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerNum() {
		return serNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerNum(String newSerNum) {
		String oldSerNum = serNum;
		serNum = newSerNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPL__SER_NUM, oldSerNum, serNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.DPL__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.DPL__VENDOR:
				return getVendor();
			case DataclassesPackage.DPL__HW_REV:
				return getHwRev();
			case DataclassesPackage.DPL__SW_REV:
				return getSwRev();
			case DataclassesPackage.DPL__SER_NUM:
				return getSerNum();
			case DataclassesPackage.DPL__MODEL:
				return getModel();
			case DataclassesPackage.DPL__LOCATION:
				return getLocation();
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
			case DataclassesPackage.DPL__VENDOR:
				setVendor((String)newValue);
				return;
			case DataclassesPackage.DPL__HW_REV:
				setHwRev((String)newValue);
				return;
			case DataclassesPackage.DPL__SW_REV:
				setSwRev((String)newValue);
				return;
			case DataclassesPackage.DPL__SER_NUM:
				setSerNum((String)newValue);
				return;
			case DataclassesPackage.DPL__MODEL:
				setModel((String)newValue);
				return;
			case DataclassesPackage.DPL__LOCATION:
				setLocation((String)newValue);
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
			case DataclassesPackage.DPL__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DataclassesPackage.DPL__HW_REV:
				setHwRev(HW_REV_EDEFAULT);
				return;
			case DataclassesPackage.DPL__SW_REV:
				setSwRev(SW_REV_EDEFAULT);
				return;
			case DataclassesPackage.DPL__SER_NUM:
				setSerNum(SER_NUM_EDEFAULT);
				return;
			case DataclassesPackage.DPL__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case DataclassesPackage.DPL__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case DataclassesPackage.DPL__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DataclassesPackage.DPL__HW_REV:
				return HW_REV_EDEFAULT == null ? hwRev != null : !HW_REV_EDEFAULT.equals(hwRev);
			case DataclassesPackage.DPL__SW_REV:
				return SW_REV_EDEFAULT == null ? swRev != null : !SW_REV_EDEFAULT.equals(swRev);
			case DataclassesPackage.DPL__SER_NUM:
				return SER_NUM_EDEFAULT == null ? serNum != null : !SER_NUM_EDEFAULT.equals(serNum);
			case DataclassesPackage.DPL__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case DataclassesPackage.DPL__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", hwRev: ");
		result.append(hwRev);
		result.append(", swRev: ");
		result.append(swRev);
		result.append(", serNum: ");
		result.append(serNum);
		result.append(", model: ");
		result.append(model);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //DPLImpl
