/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import gluemodel.CIM.IEC61970.Wires.HeatExchanger;
import gluemodel.CIM.IEC61970.Wires.PowerTransformer;
import gluemodel.CIM.IEC61970.Wires.TransformerWinding;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.PowerTransformerImpl#getFlowgates <em>Flowgates</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.PowerTransformerImpl#getHeatExchanger <em>Heat Exchanger</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.PowerTransformerImpl#getTransformerWindings <em>Transformer Windings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.PowerTransformerImpl#getMagBaseU <em>Mag Base U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.PowerTransformerImpl#getMagSatFlux <em>Mag Sat Flux</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.PowerTransformerImpl#getBmagSat <em>Bmag Sat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerImpl extends EquipmentImpl implements PowerTransformer {
	/**
	 * The cached value of the '{@link #getFlowgates() <em>Flowgates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowgates()
	 * @generated
	 * @ordered
	 */
	protected EList<Flowgate> flowgates;

	/**
	 * The cached value of the '{@link #getHeatExchanger() <em>Heat Exchanger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatExchanger()
	 * @generated
	 * @ordered
	 */
	protected HeatExchanger heatExchanger;

	/**
	 * The cached value of the '{@link #getTransformerWindings() <em>Transformer Windings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerWindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerWinding> transformerWindings;

	/**
	 * The default value of the '{@link #getMagBaseU() <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagBaseU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAG_BASE_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMagBaseU() <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagBaseU()
	 * @generated
	 * @ordered
	 */
	protected float magBaseU = MAG_BASE_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getMagSatFlux() <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagSatFlux()
	 * @generated
	 * @ordered
	 */
	protected static final float MAG_SAT_FLUX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMagSatFlux() <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagSatFlux()
	 * @generated
	 * @ordered
	 */
	protected float magSatFlux = MAG_SAT_FLUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBmagSat() <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmagSat()
	 * @generated
	 * @ordered
	 */
	protected static final float BMAG_SAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBmagSat() <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmagSat()
	 * @generated
	 * @ordered
	 */
	protected float bmagSat = BMAG_SAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.POWER_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flowgate> getFlowgates() {
		if (flowgates == null) {
			flowgates = new EObjectWithInverseResolvingEList.ManyInverse<Flowgate>(Flowgate.class, this, WiresPackage.POWER_TRANSFORMER__FLOWGATES, MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS);
		}
		return flowgates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatExchanger getHeatExchanger() {
		if (heatExchanger != null && heatExchanger.eIsProxy()) {
			InternalEObject oldHeatExchanger = (InternalEObject)heatExchanger;
			heatExchanger = (HeatExchanger)eResolveProxy(oldHeatExchanger);
			if (heatExchanger != oldHeatExchanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER, oldHeatExchanger, heatExchanger));
			}
		}
		return heatExchanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatExchanger basicGetHeatExchanger() {
		return heatExchanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatExchanger(HeatExchanger newHeatExchanger, NotificationChain msgs) {
		HeatExchanger oldHeatExchanger = heatExchanger;
		heatExchanger = newHeatExchanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER, oldHeatExchanger, newHeatExchanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatExchanger(HeatExchanger newHeatExchanger) {
		if (newHeatExchanger != heatExchanger) {
			NotificationChain msgs = null;
			if (heatExchanger != null)
				msgs = ((InternalEObject)heatExchanger).eInverseRemove(this, WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER, HeatExchanger.class, msgs);
			if (newHeatExchanger != null)
				msgs = ((InternalEObject)newHeatExchanger).eInverseAdd(this, WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER, HeatExchanger.class, msgs);
			msgs = basicSetHeatExchanger(newHeatExchanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER, newHeatExchanger, newHeatExchanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerWinding> getTransformerWindings() {
		if (transformerWindings == null) {
			transformerWindings = new EObjectWithInverseResolvingEList<TransformerWinding>(TransformerWinding.class, this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS, WiresPackage.TRANSFORMER_WINDING__POWER_TRANSFORMER);
		}
		return transformerWindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMagBaseU() {
		return magBaseU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagBaseU(float newMagBaseU) {
		float oldMagBaseU = magBaseU;
		magBaseU = newMagBaseU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.POWER_TRANSFORMER__MAG_BASE_U, oldMagBaseU, magBaseU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMagSatFlux() {
		return magSatFlux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagSatFlux(float newMagSatFlux) {
		float oldMagSatFlux = magSatFlux;
		magSatFlux = newMagSatFlux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.POWER_TRANSFORMER__MAG_SAT_FLUX, oldMagSatFlux, magSatFlux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBmagSat() {
		return bmagSat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBmagSat(float newBmagSat) {
		float oldBmagSat = bmagSat;
		bmagSat = newBmagSat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.POWER_TRANSFORMER__BMAG_SAT, oldBmagSat, bmagSat));
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
			case WiresPackage.POWER_TRANSFORMER__FLOWGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowgates()).basicAdd(otherEnd, msgs);
			case WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER:
				if (heatExchanger != null)
					msgs = ((InternalEObject)heatExchanger).eInverseRemove(this, WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER, HeatExchanger.class, msgs);
				return basicSetHeatExchanger((HeatExchanger)otherEnd, msgs);
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerWindings()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER__FLOWGATES:
				return ((InternalEList<?>)getFlowgates()).basicRemove(otherEnd, msgs);
			case WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER:
				return basicSetHeatExchanger(null, msgs);
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS:
				return ((InternalEList<?>)getTransformerWindings()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER__FLOWGATES:
				return getFlowgates();
			case WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER:
				if (resolve) return getHeatExchanger();
				return basicGetHeatExchanger();
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS:
				return getTransformerWindings();
			case WiresPackage.POWER_TRANSFORMER__MAG_BASE_U:
				return getMagBaseU();
			case WiresPackage.POWER_TRANSFORMER__MAG_SAT_FLUX:
				return getMagSatFlux();
			case WiresPackage.POWER_TRANSFORMER__BMAG_SAT:
				return getBmagSat();
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
			case WiresPackage.POWER_TRANSFORMER__FLOWGATES:
				getFlowgates().clear();
				getFlowgates().addAll((Collection<? extends Flowgate>)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER:
				setHeatExchanger((HeatExchanger)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS:
				getTransformerWindings().clear();
				getTransformerWindings().addAll((Collection<? extends TransformerWinding>)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__MAG_BASE_U:
				setMagBaseU((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__MAG_SAT_FLUX:
				setMagSatFlux((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__BMAG_SAT:
				setBmagSat((Float)newValue);
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
			case WiresPackage.POWER_TRANSFORMER__FLOWGATES:
				getFlowgates().clear();
				return;
			case WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER:
				setHeatExchanger((HeatExchanger)null);
				return;
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS:
				getTransformerWindings().clear();
				return;
			case WiresPackage.POWER_TRANSFORMER__MAG_BASE_U:
				setMagBaseU(MAG_BASE_U_EDEFAULT);
				return;
			case WiresPackage.POWER_TRANSFORMER__MAG_SAT_FLUX:
				setMagSatFlux(MAG_SAT_FLUX_EDEFAULT);
				return;
			case WiresPackage.POWER_TRANSFORMER__BMAG_SAT:
				setBmagSat(BMAG_SAT_EDEFAULT);
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
			case WiresPackage.POWER_TRANSFORMER__FLOWGATES:
				return flowgates != null && !flowgates.isEmpty();
			case WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER:
				return heatExchanger != null;
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_WINDINGS:
				return transformerWindings != null && !transformerWindings.isEmpty();
			case WiresPackage.POWER_TRANSFORMER__MAG_BASE_U:
				return magBaseU != MAG_BASE_U_EDEFAULT;
			case WiresPackage.POWER_TRANSFORMER__MAG_SAT_FLUX:
				return magSatFlux != MAG_SAT_FLUX_EDEFAULT;
			case WiresPackage.POWER_TRANSFORMER__BMAG_SAT:
				return bmagSat != BMAG_SAT_EDEFAULT;
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
		result.append(" (magBaseU: ");
		result.append(magBaseU);
		result.append(", magSatFlux: ");
		result.append(magSatFlux);
		result.append(", bmagSat: ");
		result.append(bmagSat);
		result.append(')');
		return result.toString();
	}

} //PowerTransformerImpl
