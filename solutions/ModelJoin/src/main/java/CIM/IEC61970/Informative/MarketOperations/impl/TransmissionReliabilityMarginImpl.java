/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.MarketOperations.Flowgate;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin;

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
 * An implementation of the model object '<em><b>Transmission Reliability Margin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl#getTrmType <em>Trm Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl#getValueUnit <em>Value Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.TransmissionReliabilityMarginImpl#getTrmValue <em>Trm Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionReliabilityMarginImpl extends IdentifiedObjectImpl implements TransmissionReliabilityMargin {
	/**
	 * The default value of the '{@link #getTrmType() <em>Trm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrmType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrmType() <em>Trm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrmType()
	 * @generated
	 * @ordered
	 */
	protected String trmType = TRM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowgate() <em>Flowgate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgate()
	 * @generated
	 * @ordered
	 */
	protected EList<Flowgate> flowgate;

	/**
	 * The default value of the '{@link #getValueUnit() <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueUnit() <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUnit()
	 * @generated
	 * @ordered
	 */
	protected String valueUnit = VALUE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrmValue() <em>Trm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrmValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TRM_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTrmValue() <em>Trm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrmValue()
	 * @generated
	 * @ordered
	 */
	protected float trmValue = TRM_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionReliabilityMarginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.TRANSMISSION_RELIABILITY_MARGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrmType() {
		return trmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrmType(String newTrmType) {
		String oldTrmType = trmType;
		trmType = newTrmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE, oldTrmType, trmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flowgate> getFlowgate() {
		if (flowgate == null) {
			flowgate = new EObjectWithInverseResolvingEList<Flowgate>(Flowgate.class, this, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE, MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN);
		}
		return flowgate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueUnit() {
		return valueUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUnit(String newValueUnit) {
		String oldValueUnit = valueUnit;
		valueUnit = newValueUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT, oldValueUnit, valueUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTrmValue() {
		return trmValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrmValue(float newTrmValue) {
		float oldTrmValue = trmValue;
		trmValue = newTrmValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE, oldTrmValue, trmValue));
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
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowgate()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE:
				return ((InternalEList<?>)getFlowgate()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE:
				return getTrmType();
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE:
				return getFlowgate();
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT:
				return getValueUnit();
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE:
				return getTrmValue();
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
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE:
				setTrmType((String)newValue);
				return;
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE:
				getFlowgate().clear();
				getFlowgate().addAll((Collection<? extends Flowgate>)newValue);
				return;
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT:
				setValueUnit((String)newValue);
				return;
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE:
				setTrmValue((Float)newValue);
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
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE:
				setTrmType(TRM_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE:
				getFlowgate().clear();
				return;
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT:
				setValueUnit(VALUE_UNIT_EDEFAULT);
				return;
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE:
				setTrmValue(TRM_VALUE_EDEFAULT);
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
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_TYPE:
				return TRM_TYPE_EDEFAULT == null ? trmType != null : !TRM_TYPE_EDEFAULT.equals(trmType);
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE:
				return flowgate != null && !flowgate.isEmpty();
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__VALUE_UNIT:
				return VALUE_UNIT_EDEFAULT == null ? valueUnit != null : !VALUE_UNIT_EDEFAULT.equals(valueUnit);
			case MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__TRM_VALUE:
				return trmValue != TRM_VALUE_EDEFAULT;
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
		result.append(" (TrmType: ");
		result.append(trmType);
		result.append(", valueUnit: ");
		result.append(valueUnit);
		result.append(", trmValue: ");
		result.append(trmValue);
		result.append(')');
		return result.toString();
	}

} //TransmissionReliabilityMarginImpl
