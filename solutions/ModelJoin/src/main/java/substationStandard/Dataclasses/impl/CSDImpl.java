/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.CSD;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.PointArray;
import substationStandard.Dataclasses.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getXD <em>XD</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getYUnit <em>YUnit</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getYD <em>YD</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getNumPts <em>Num Pts</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getCrvPts <em>Crv Pts</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getD <em>D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CSDImpl#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSDImpl extends MinimalEObjectImpl.Container implements CSD {
	/**
	 * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected Units xUnit;

	/**
	 * The default value of the '{@link #getXD() <em>XD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXD()
	 * @generated
	 * @ordered
	 */
	protected static final String XD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXD() <em>XD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXD()
	 * @generated
	 * @ordered
	 */
	protected String xD = XD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYUnit() <em>YUnit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnit()
	 * @generated
	 * @ordered
	 */
	protected Units yUnit;

	/**
	 * The default value of the '{@link #getYD() <em>YD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYD()
	 * @generated
	 * @ordered
	 */
	protected static final String YD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYD() <em>YD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYD()
	 * @generated
	 * @ordered
	 */
	protected String yD = YD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPts() <em>Num Pts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumPts() <em>Num Pts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPts()
	 * @generated
	 * @ordered
	 */
	protected int numPts = NUM_PTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrvPts() <em>Crv Pts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrvPts()
	 * @generated
	 * @ordered
	 */
	protected PointArray crvPts;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.CSD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getXUnit() {
		if (xUnit != null && xUnit.eIsProxy()) {
			InternalEObject oldXUnit = (InternalEObject)xUnit;
			xUnit = (Units)eResolveProxy(oldXUnit);
			if (xUnit != oldXUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CSD__XUNIT, oldXUnit, xUnit));
			}
		}
		return xUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units basicGetXUnit() {
		return xUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXUnit(Units newXUnit) {
		Units oldXUnit = xUnit;
		xUnit = newXUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__XUNIT, oldXUnit, xUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXD() {
		return xD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXD(String newXD) {
		String oldXD = xD;
		xD = newXD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__XD, oldXD, xD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getYUnit() {
		if (yUnit != null && yUnit.eIsProxy()) {
			InternalEObject oldYUnit = (InternalEObject)yUnit;
			yUnit = (Units)eResolveProxy(oldYUnit);
			if (yUnit != oldYUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CSD__YUNIT, oldYUnit, yUnit));
			}
		}
		return yUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units basicGetYUnit() {
		return yUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYUnit(Units newYUnit) {
		Units oldYUnit = yUnit;
		yUnit = newYUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__YUNIT, oldYUnit, yUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYD() {
		return yD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYD(String newYD) {
		String oldYD = yD;
		yD = newYD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__YD, oldYD, yD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumPts() {
		return numPts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPts(int newNumPts) {
		int oldNumPts = numPts;
		numPts = newNumPts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__NUM_PTS, oldNumPts, numPts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointArray getCrvPts() {
		if (crvPts != null && crvPts.eIsProxy()) {
			InternalEObject oldCrvPts = (InternalEObject)crvPts;
			crvPts = (PointArray)eResolveProxy(oldCrvPts);
			if (crvPts != oldCrvPts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CSD__CRV_PTS, oldCrvPts, crvPts));
			}
		}
		return crvPts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointArray basicGetCrvPts() {
		return crvPts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrvPts(PointArray newCrvPts) {
		PointArray oldCrvPts = crvPts;
		crvPts = newCrvPts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__CRV_PTS, oldCrvPts, crvPts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__D, oldD, d));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CSD__DU, oldDU, dU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.CSD__XUNIT:
				if (resolve) return getXUnit();
				return basicGetXUnit();
			case DataclassesPackage.CSD__XD:
				return getXD();
			case DataclassesPackage.CSD__YUNIT:
				if (resolve) return getYUnit();
				return basicGetYUnit();
			case DataclassesPackage.CSD__YD:
				return getYD();
			case DataclassesPackage.CSD__NUM_PTS:
				return getNumPts();
			case DataclassesPackage.CSD__CRV_PTS:
				if (resolve) return getCrvPts();
				return basicGetCrvPts();
			case DataclassesPackage.CSD__D:
				return getD();
			case DataclassesPackage.CSD__DU:
				return getDU();
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
			case DataclassesPackage.CSD__XUNIT:
				setXUnit((Units)newValue);
				return;
			case DataclassesPackage.CSD__XD:
				setXD((String)newValue);
				return;
			case DataclassesPackage.CSD__YUNIT:
				setYUnit((Units)newValue);
				return;
			case DataclassesPackage.CSD__YD:
				setYD((String)newValue);
				return;
			case DataclassesPackage.CSD__NUM_PTS:
				setNumPts((Integer)newValue);
				return;
			case DataclassesPackage.CSD__CRV_PTS:
				setCrvPts((PointArray)newValue);
				return;
			case DataclassesPackage.CSD__D:
				setD((String)newValue);
				return;
			case DataclassesPackage.CSD__DU:
				setDU((String)newValue);
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
			case DataclassesPackage.CSD__XUNIT:
				setXUnit((Units)null);
				return;
			case DataclassesPackage.CSD__XD:
				setXD(XD_EDEFAULT);
				return;
			case DataclassesPackage.CSD__YUNIT:
				setYUnit((Units)null);
				return;
			case DataclassesPackage.CSD__YD:
				setYD(YD_EDEFAULT);
				return;
			case DataclassesPackage.CSD__NUM_PTS:
				setNumPts(NUM_PTS_EDEFAULT);
				return;
			case DataclassesPackage.CSD__CRV_PTS:
				setCrvPts((PointArray)null);
				return;
			case DataclassesPackage.CSD__D:
				setD(D_EDEFAULT);
				return;
			case DataclassesPackage.CSD__DU:
				setDU(DU_EDEFAULT);
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
			case DataclassesPackage.CSD__XUNIT:
				return xUnit != null;
			case DataclassesPackage.CSD__XD:
				return XD_EDEFAULT == null ? xD != null : !XD_EDEFAULT.equals(xD);
			case DataclassesPackage.CSD__YUNIT:
				return yUnit != null;
			case DataclassesPackage.CSD__YD:
				return YD_EDEFAULT == null ? yD != null : !YD_EDEFAULT.equals(yD);
			case DataclassesPackage.CSD__NUM_PTS:
				return numPts != NUM_PTS_EDEFAULT;
			case DataclassesPackage.CSD__CRV_PTS:
				return crvPts != null;
			case DataclassesPackage.CSD__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case DataclassesPackage.CSD__DU:
				return DU_EDEFAULT == null ? dU != null : !DU_EDEFAULT.equals(dU);
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
		result.append(" (xD: ");
		result.append(xD);
		result.append(", yD: ");
		result.append(yD);
		result.append(", numPts: ");
		result.append(numPts);
		result.append(", d: ");
		result.append(d);
		result.append(", dU: ");
		result.append(dU);
		result.append(')');
		return result.toString();
	}

} //CSDImpl
