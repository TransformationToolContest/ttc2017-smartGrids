/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.SEC;
import substationStandard.Dataclasses.Severity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.SECImpl#getCnt <em>Cnt</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SECImpl#getSev <em>Sev</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SECImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.SECImpl#getAddInfo <em>Add Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SECImpl extends MinimalEObjectImpl.Container implements SEC {
	/**
	 * The default value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected static final int CNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCnt() <em>Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCnt()
	 * @generated
	 * @ordered
	 */
	protected int cnt = CNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSev() <em>Sev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSev()
	 * @generated
	 * @ordered
	 */
	protected Severity sev;

	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected String addr = ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddInfo() <em>Add Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddInfo() <em>Add Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddInfo()
	 * @generated
	 * @ordered
	 */
	protected String addInfo = ADD_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SECImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCnt() {
		return cnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCnt(int newCnt) {
		int oldCnt = cnt;
		cnt = newCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEC__CNT, oldCnt, cnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSev() {
		if (sev != null && sev.eIsProxy()) {
			InternalEObject oldSev = (InternalEObject)sev;
			sev = (Severity)eResolveProxy(oldSev);
			if (sev != oldSev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SEC__SEV, oldSev, sev));
			}
		}
		return sev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity basicGetSev() {
		return sev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSev(Severity newSev) {
		Severity oldSev = sev;
		sev = newSev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEC__SEV, oldSev, sev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		String oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEC__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddInfo() {
		return addInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddInfo(String newAddInfo) {
		String oldAddInfo = addInfo;
		addInfo = newAddInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SEC__ADD_INFO, oldAddInfo, addInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SEC__CNT:
				return getCnt();
			case DataclassesPackage.SEC__SEV:
				if (resolve) return getSev();
				return basicGetSev();
			case DataclassesPackage.SEC__ADDR:
				return getAddr();
			case DataclassesPackage.SEC__ADD_INFO:
				return getAddInfo();
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
			case DataclassesPackage.SEC__CNT:
				setCnt((Integer)newValue);
				return;
			case DataclassesPackage.SEC__SEV:
				setSev((Severity)newValue);
				return;
			case DataclassesPackage.SEC__ADDR:
				setAddr((String)newValue);
				return;
			case DataclassesPackage.SEC__ADD_INFO:
				setAddInfo((String)newValue);
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
			case DataclassesPackage.SEC__CNT:
				setCnt(CNT_EDEFAULT);
				return;
			case DataclassesPackage.SEC__SEV:
				setSev((Severity)null);
				return;
			case DataclassesPackage.SEC__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case DataclassesPackage.SEC__ADD_INFO:
				setAddInfo(ADD_INFO_EDEFAULT);
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
			case DataclassesPackage.SEC__CNT:
				return cnt != CNT_EDEFAULT;
			case DataclassesPackage.SEC__SEV:
				return sev != null;
			case DataclassesPackage.SEC__ADDR:
				return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
			case DataclassesPackage.SEC__ADD_INFO:
				return ADD_INFO_EDEFAULT == null ? addInfo != null : !ADD_INFO_EDEFAULT.equals(addInfo);
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
		result.append(" (cnt: ");
		result.append(cnt);
		result.append(", addr: ");
		result.append(addr);
		result.append(", addInfo: ");
		result.append(addInfo);
		result.append(')');
		return result.toString();
	}

} //SECImpl
