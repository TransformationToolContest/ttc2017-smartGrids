/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.LPL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LPL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getSwRev <em>Sw Rev</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getD <em>D</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getDU <em>DU</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getConfigRev <em>Config Rev</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getIdNs <em>Id Ns</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl#getLnNs <em>Ln Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPLImpl extends MinimalEObjectImpl.Container implements LPL {
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
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getDU() <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDU()
	 * @generated
	 * @ordered
	 */
	protected static final String DU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDU() <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDU()
	 * @generated
	 * @ordered
	 */
	protected String dU = DU_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigRev() <em>Config Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigRev()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigRev() <em>Config Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigRev()
	 * @generated
	 * @ordered
	 */
	protected String configRev = CONFIG_REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdNs() <em>Id Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNs()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdNs() <em>Id Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNs()
	 * @generated
	 * @ordered
	 */
	protected String idNs = ID_NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLnNs() <em>Ln Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnNs()
	 * @generated
	 * @ordered
	 */
	protected static final String LN_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnNs() <em>Ln Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnNs()
	 * @generated
	 * @ordered
	 */
	protected String lnNs = LN_NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.LPL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__SW_REV, oldSwRev, swRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDU() {
		return dU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDU(String newDU) {
		String oldDU = dU;
		dU = newDU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__DU, oldDU, dU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigRev() {
		return configRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigRev(String newConfigRev) {
		String oldConfigRev = configRev;
		configRev = newConfigRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__CONFIG_REV, oldConfigRev, configRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdNs() {
		return idNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNs(String newIdNs) {
		String oldIdNs = idNs;
		idNs = newIdNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__ID_NS, oldIdNs, idNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLnNs() {
		return lnNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnNs(String newLnNs) {
		String oldLnNs = lnNs;
		lnNs = newLnNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.LPL__LN_NS, oldLnNs, lnNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.LPL__VENDOR:
				return getVendor();
			case DataclassesPackage.LPL__SW_REV:
				return getSwRev();
			case DataclassesPackage.LPL__D:
				return getD();
			case DataclassesPackage.LPL__DU:
				return getDU();
			case DataclassesPackage.LPL__CONFIG_REV:
				return getConfigRev();
			case DataclassesPackage.LPL__ID_NS:
				return getIdNs();
			case DataclassesPackage.LPL__LN_NS:
				return getLnNs();
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
			case DataclassesPackage.LPL__VENDOR:
				setVendor((String)newValue);
				return;
			case DataclassesPackage.LPL__SW_REV:
				setSwRev((String)newValue);
				return;
			case DataclassesPackage.LPL__D:
				setD((String)newValue);
				return;
			case DataclassesPackage.LPL__DU:
				setDU((String)newValue);
				return;
			case DataclassesPackage.LPL__CONFIG_REV:
				setConfigRev((String)newValue);
				return;
			case DataclassesPackage.LPL__ID_NS:
				setIdNs((String)newValue);
				return;
			case DataclassesPackage.LPL__LN_NS:
				setLnNs((String)newValue);
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
			case DataclassesPackage.LPL__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DataclassesPackage.LPL__SW_REV:
				setSwRev(SW_REV_EDEFAULT);
				return;
			case DataclassesPackage.LPL__D:
				setD(D_EDEFAULT);
				return;
			case DataclassesPackage.LPL__DU:
				setDU(DU_EDEFAULT);
				return;
			case DataclassesPackage.LPL__CONFIG_REV:
				setConfigRev(CONFIG_REV_EDEFAULT);
				return;
			case DataclassesPackage.LPL__ID_NS:
				setIdNs(ID_NS_EDEFAULT);
				return;
			case DataclassesPackage.LPL__LN_NS:
				setLnNs(LN_NS_EDEFAULT);
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
			case DataclassesPackage.LPL__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DataclassesPackage.LPL__SW_REV:
				return SW_REV_EDEFAULT == null ? swRev != null : !SW_REV_EDEFAULT.equals(swRev);
			case DataclassesPackage.LPL__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case DataclassesPackage.LPL__DU:
				return DU_EDEFAULT == null ? dU != null : !DU_EDEFAULT.equals(dU);
			case DataclassesPackage.LPL__CONFIG_REV:
				return CONFIG_REV_EDEFAULT == null ? configRev != null : !CONFIG_REV_EDEFAULT.equals(configRev);
			case DataclassesPackage.LPL__ID_NS:
				return ID_NS_EDEFAULT == null ? idNs != null : !ID_NS_EDEFAULT.equals(idNs);
			case DataclassesPackage.LPL__LN_NS:
				return LN_NS_EDEFAULT == null ? lnNs != null : !LN_NS_EDEFAULT.equals(lnNs);
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
		result.append(", swRev: ");
		result.append(swRev);
		result.append(", d: ");
		result.append(d);
		result.append(", dU: ");
		result.append(dU);
		result.append(", configRev: ");
		result.append(configRev);
		result.append(", IdNs: ");
		result.append(idNs);
		result.append(", lnNs: ");
		result.append(lnNs);
		result.append(')');
		return result.toString();
	}

} //LPLImpl
