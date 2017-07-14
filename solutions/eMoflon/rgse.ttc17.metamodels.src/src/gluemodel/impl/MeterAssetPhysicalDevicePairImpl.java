/**
 */
package gluemodel.impl;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.COSEM.PhysicalDevice;

import gluemodel.GluemodelPackage;
import gluemodel.MeterAssetPhysicalDevicePair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Asset Physical Device Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.impl.MeterAssetPhysicalDevicePairImpl#getA <em>A</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetPhysicalDevicePairImpl#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.impl.MeterAssetPhysicalDevicePairImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterAssetPhysicalDevicePairImpl extends MinimalEObjectImpl.Container implements MeterAssetPhysicalDevicePair {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected PhysicalDevice b;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterAssetPhysicalDevicePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GluemodelPackage.Literals.METER_ASSET_PHYSICAL_DEVICE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getA() {
		if (a != null && a.eIsProxy()) {
			InternalEObject oldA = (InternalEObject)a;
			a = (MeterAsset)eResolveProxy(oldA);
			if (a != oldA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(MeterAsset newA) {
		MeterAsset oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice getB() {
		if (b != null && b.eIsProxy()) {
			InternalEObject oldB = (InternalEObject)b;
			b = (PhysicalDevice)eResolveProxy(oldB);
			if (b != oldB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__B, oldB, b));
			}
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice basicGetB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(PhysicalDevice newB) {
		PhysicalDevice oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__A:
				if (resolve) return getA();
				return basicGetA();
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__B:
				if (resolve) return getB();
				return basicGetB();
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME:
				return getName();
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
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__A:
				setA((MeterAsset)newValue);
				return;
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__B:
				setB((PhysicalDevice)newValue);
				return;
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME:
				setName((String)newValue);
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
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__A:
				setA((MeterAsset)null);
				return;
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__B:
				setB((PhysicalDevice)null);
				return;
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME:
				setName(NAME_EDEFAULT);
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
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__A:
				return a != null;
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__B:
				return b != null;
			case GluemodelPackage.METER_ASSET_PHYSICAL_DEVICE_PAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MeterAssetPhysicalDevicePairImpl
