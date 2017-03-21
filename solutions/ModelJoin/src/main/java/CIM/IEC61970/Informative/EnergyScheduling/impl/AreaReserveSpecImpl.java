/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec;
import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import CIM.IEC61970.Informative.EnergyScheduling.Reserve;

import CIM.impl.ElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area Reserve Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getRaiseRegMarginReqt <em>Raise Reg Margin Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getReserveEnergyTransaction <em>Reserve Energy Transaction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getHostControlAreas <em>Host Control Areas</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getAreaReserveSpecName <em>Area Reserve Spec Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getOpReserveReqt <em>Op Reserve Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getLowerRegMarginReqt <em>Lower Reg Margin Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getPrimaryReserveReqt <em>Primary Reserve Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.AreaReserveSpecImpl#getSpinningReserveReqt <em>Spinning Reserve Reqt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaReserveSpecImpl extends ElementImpl implements AreaReserveSpec {
	/**
	 * The default value of the '{@link #getRaiseRegMarginReqt() <em>Raise Reg Margin Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRegMarginReqt()
	 * @generated
	 * @ordered
	 */
	protected static final float RAISE_REG_MARGIN_REQT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRaiseRegMarginReqt() <em>Raise Reg Margin Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRegMarginReqt()
	 * @generated
	 * @ordered
	 */
	protected float raiseRegMarginReqt = RAISE_REG_MARGIN_REQT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReserveEnergyTransaction() <em>Reserve Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveEnergyTransaction()
	 * @generated
	 * @ordered
	 */
	protected Reserve reserveEnergyTransaction;

	/**
	 * The cached value of the '{@link #getHostControlAreas() <em>Host Control Areas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostControlAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<HostControlArea> hostControlAreas;

	/**
	 * The default value of the '{@link #getAreaReserveSpecName() <em>Area Reserve Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaReserveSpecName()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_RESERVE_SPEC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaReserveSpecName() <em>Area Reserve Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaReserveSpecName()
	 * @generated
	 * @ordered
	 */
	protected String areaReserveSpecName = AREA_RESERVE_SPEC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpReserveReqt() <em>Op Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpReserveReqt()
	 * @generated
	 * @ordered
	 */
	protected static final float OP_RESERVE_REQT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOpReserveReqt() <em>Op Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpReserveReqt()
	 * @generated
	 * @ordered
	 */
	protected float opReserveReqt = OP_RESERVE_REQT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerRegMarginReqt() <em>Lower Reg Margin Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRegMarginReqt()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_REG_MARGIN_REQT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerRegMarginReqt() <em>Lower Reg Margin Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRegMarginReqt()
	 * @generated
	 * @ordered
	 */
	protected float lowerRegMarginReqt = LOWER_REG_MARGIN_REQT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryReserveReqt() <em>Primary Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReserveReqt()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIMARY_RESERVE_REQT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrimaryReserveReqt() <em>Primary Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryReserveReqt()
	 * @generated
	 * @ordered
	 */
	protected float primaryReserveReqt = PRIMARY_RESERVE_REQT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpinningReserveReqt() <em>Spinning Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinningReserveReqt()
	 * @generated
	 * @ordered
	 */
	protected static final float SPINNING_RESERVE_REQT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpinningReserveReqt() <em>Spinning Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinningReserveReqt()
	 * @generated
	 * @ordered
	 */
	protected float spinningReserveReqt = SPINNING_RESERVE_REQT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaReserveSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.AREA_RESERVE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRaiseRegMarginReqt() {
		return raiseRegMarginReqt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaiseRegMarginReqt(float newRaiseRegMarginReqt) {
		float oldRaiseRegMarginReqt = raiseRegMarginReqt;
		raiseRegMarginReqt = newRaiseRegMarginReqt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT, oldRaiseRegMarginReqt, raiseRegMarginReqt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserve getReserveEnergyTransaction() {
		if (reserveEnergyTransaction != null && reserveEnergyTransaction.eIsProxy()) {
			InternalEObject oldReserveEnergyTransaction = (InternalEObject)reserveEnergyTransaction;
			reserveEnergyTransaction = (Reserve)eResolveProxy(oldReserveEnergyTransaction);
			if (reserveEnergyTransaction != oldReserveEnergyTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION, oldReserveEnergyTransaction, reserveEnergyTransaction));
			}
		}
		return reserveEnergyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserve basicGetReserveEnergyTransaction() {
		return reserveEnergyTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveEnergyTransaction(Reserve newReserveEnergyTransaction, NotificationChain msgs) {
		Reserve oldReserveEnergyTransaction = reserveEnergyTransaction;
		reserveEnergyTransaction = newReserveEnergyTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION, oldReserveEnergyTransaction, newReserveEnergyTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserveEnergyTransaction(Reserve newReserveEnergyTransaction) {
		if (newReserveEnergyTransaction != reserveEnergyTransaction) {
			NotificationChain msgs = null;
			if (reserveEnergyTransaction != null)
				msgs = ((InternalEObject)reserveEnergyTransaction).eInverseRemove(this, EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC, Reserve.class, msgs);
			if (newReserveEnergyTransaction != null)
				msgs = ((InternalEObject)newReserveEnergyTransaction).eInverseAdd(this, EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC, Reserve.class, msgs);
			msgs = basicSetReserveEnergyTransaction(newReserveEnergyTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION, newReserveEnergyTransaction, newReserveEnergyTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostControlArea> getHostControlAreas() {
		if (hostControlAreas == null) {
			hostControlAreas = new EObjectWithInverseResolvingEList<HostControlArea>(HostControlArea.class, this, EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS, EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC);
		}
		return hostControlAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAreaReserveSpecName() {
		return areaReserveSpecName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaReserveSpecName(String newAreaReserveSpecName) {
		String oldAreaReserveSpecName = areaReserveSpecName;
		areaReserveSpecName = newAreaReserveSpecName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME, oldAreaReserveSpecName, areaReserveSpecName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOpReserveReqt() {
		return opReserveReqt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpReserveReqt(float newOpReserveReqt) {
		float oldOpReserveReqt = opReserveReqt;
		opReserveReqt = newOpReserveReqt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__OP_RESERVE_REQT, oldOpReserveReqt, opReserveReqt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerRegMarginReqt() {
		return lowerRegMarginReqt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerRegMarginReqt(float newLowerRegMarginReqt) {
		float oldLowerRegMarginReqt = lowerRegMarginReqt;
		lowerRegMarginReqt = newLowerRegMarginReqt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT, oldLowerRegMarginReqt, lowerRegMarginReqt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrimaryReserveReqt() {
		return primaryReserveReqt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryReserveReqt(float newPrimaryReserveReqt) {
		float oldPrimaryReserveReqt = primaryReserveReqt;
		primaryReserveReqt = newPrimaryReserveReqt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT, oldPrimaryReserveReqt, primaryReserveReqt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpinningReserveReqt() {
		return spinningReserveReqt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpinningReserveReqt(float newSpinningReserveReqt) {
		float oldSpinningReserveReqt = spinningReserveReqt;
		spinningReserveReqt = newSpinningReserveReqt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT, oldSpinningReserveReqt, spinningReserveReqt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION:
				if (reserveEnergyTransaction != null)
					msgs = ((InternalEObject)reserveEnergyTransaction).eInverseRemove(this, EnergySchedulingPackage.RESERVE__AREA_RESERVE_SPEC, Reserve.class, msgs);
				return basicSetReserveEnergyTransaction((Reserve)otherEnd, msgs);
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHostControlAreas()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION:
				return basicSetReserveEnergyTransaction(null, msgs);
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS:
				return ((InternalEList<?>)getHostControlAreas()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT:
				return getRaiseRegMarginReqt();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION:
				if (resolve) return getReserveEnergyTransaction();
				return basicGetReserveEnergyTransaction();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS:
				return getHostControlAreas();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME:
				return getAreaReserveSpecName();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__OP_RESERVE_REQT:
				return getOpReserveReqt();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT:
				return getLowerRegMarginReqt();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT:
				return getPrimaryReserveReqt();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT:
				return getSpinningReserveReqt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT:
				setRaiseRegMarginReqt((Float)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION:
				setReserveEnergyTransaction((Reserve)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS:
				getHostControlAreas().clear();
				getHostControlAreas().addAll((Collection<? extends HostControlArea>)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME:
				setAreaReserveSpecName((String)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__OP_RESERVE_REQT:
				setOpReserveReqt((Float)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT:
				setLowerRegMarginReqt((Float)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT:
				setPrimaryReserveReqt((Float)newValue);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT:
				setSpinningReserveReqt((Float)newValue);
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
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT:
				setRaiseRegMarginReqt(RAISE_REG_MARGIN_REQT_EDEFAULT);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION:
				setReserveEnergyTransaction((Reserve)null);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS:
				getHostControlAreas().clear();
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME:
				setAreaReserveSpecName(AREA_RESERVE_SPEC_NAME_EDEFAULT);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__OP_RESERVE_REQT:
				setOpReserveReqt(OP_RESERVE_REQT_EDEFAULT);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT:
				setLowerRegMarginReqt(LOWER_REG_MARGIN_REQT_EDEFAULT);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT:
				setPrimaryReserveReqt(PRIMARY_RESERVE_REQT_EDEFAULT);
				return;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT:
				setSpinningReserveReqt(SPINNING_RESERVE_REQT_EDEFAULT);
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
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RAISE_REG_MARGIN_REQT:
				return raiseRegMarginReqt != RAISE_REG_MARGIN_REQT_EDEFAULT;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__RESERVE_ENERGY_TRANSACTION:
				return reserveEnergyTransaction != null;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS:
				return hostControlAreas != null && !hostControlAreas.isEmpty();
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__AREA_RESERVE_SPEC_NAME:
				return AREA_RESERVE_SPEC_NAME_EDEFAULT == null ? areaReserveSpecName != null : !AREA_RESERVE_SPEC_NAME_EDEFAULT.equals(areaReserveSpecName);
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__OP_RESERVE_REQT:
				return opReserveReqt != OP_RESERVE_REQT_EDEFAULT;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__LOWER_REG_MARGIN_REQT:
				return lowerRegMarginReqt != LOWER_REG_MARGIN_REQT_EDEFAULT;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__PRIMARY_RESERVE_REQT:
				return primaryReserveReqt != PRIMARY_RESERVE_REQT_EDEFAULT;
			case EnergySchedulingPackage.AREA_RESERVE_SPEC__SPINNING_RESERVE_REQT:
				return spinningReserveReqt != SPINNING_RESERVE_REQT_EDEFAULT;
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
		result.append(" (raiseRegMarginReqt: ");
		result.append(raiseRegMarginReqt);
		result.append(", areaReserveSpecName: ");
		result.append(areaReserveSpecName);
		result.append(", opReserveReqt: ");
		result.append(opReserveReqt);
		result.append(", lowerRegMarginReqt: ");
		result.append(lowerRegMarginReqt);
		result.append(", primaryReserveReqt: ");
		result.append(primaryReserveReqt);
		result.append(", spinningReserveReqt: ");
		result.append(spinningReserveReqt);
		result.append(')');
		return result.toString();
	}

} //AreaReserveSpecImpl
