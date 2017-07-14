/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.ComFunction;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl#isTwoWay <em>Two Way</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl#getAmrAddress <em>Amr Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl#getAmrRouter <em>Amr Router</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComFunctionImpl extends DeviceFunctionImpl implements ComFunction {
	/**
	 * The default value of the '{@link #isTwoWay() <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoWay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TWO_WAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTwoWay() <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoWay()
	 * @generated
	 * @ordered
	 */
	protected boolean twoWay = TWO_WAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmrAddress() <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String AMR_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmrAddress() <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrAddress()
	 * @generated
	 * @ordered
	 */
	protected String amrAddress = AMR_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmrRouter() <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrRouter()
	 * @generated
	 * @ordered
	 */
	protected static final String AMR_ROUTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmrRouter() <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrRouter()
	 * @generated
	 * @ordered
	 */
	protected String amrRouter = AMR_ROUTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.COM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTwoWay() {
		return twoWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwoWay(boolean newTwoWay) {
		boolean oldTwoWay = twoWay;
		twoWay = newTwoWay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.COM_FUNCTION__TWO_WAY, oldTwoWay, twoWay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmrAddress() {
		return amrAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmrAddress(String newAmrAddress) {
		String oldAmrAddress = amrAddress;
		amrAddress = newAmrAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.COM_FUNCTION__AMR_ADDRESS, oldAmrAddress, amrAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmrRouter() {
		return amrRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmrRouter(String newAmrRouter) {
		String oldAmrRouter = amrRouter;
		amrRouter = newAmrRouter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.COM_FUNCTION__AMR_ROUTER, oldAmrRouter, amrRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				return isTwoWay();
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				return getAmrAddress();
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				return getAmrRouter();
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
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				setTwoWay((Boolean)newValue);
				return;
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				setAmrAddress((String)newValue);
				return;
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				setAmrRouter((String)newValue);
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
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				setTwoWay(TWO_WAY_EDEFAULT);
				return;
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				setAmrAddress(AMR_ADDRESS_EDEFAULT);
				return;
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				setAmrRouter(AMR_ROUTER_EDEFAULT);
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
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				return twoWay != TWO_WAY_EDEFAULT;
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				return AMR_ADDRESS_EDEFAULT == null ? amrAddress != null : !AMR_ADDRESS_EDEFAULT.equals(amrAddress);
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				return AMR_ROUTER_EDEFAULT == null ? amrRouter != null : !AMR_ROUTER_EDEFAULT.equals(amrRouter);
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
		result.append(" (twoWay: ");
		result.append(twoWay);
		result.append(", amrAddress: ");
		result.append(amrAddress);
		result.append(", amrRouter: ");
		result.append(amrRouter);
		result.append(')');
		return result.toString();
	}

} //ComFunctionImpl
