/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.Bay;
import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.SubGeographicalRegion;
import gluemodel.CIM.IEC61970.Core.Substation;
import gluemodel.CIM.IEC61970.Core.VoltageLevel;

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
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.SubstationImpl#getBays <em>Bays</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.SubstationImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.SubstationImpl#getVoltageLevels <em>Voltage Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstationImpl extends EquipmentContainerImpl implements Substation {
	/**
	 * The cached value of the '{@link #getBays() <em>Bays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBays()
	 * @generated
	 * @ordered
	 */
	protected EList<Bay> bays;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected SubGeographicalRegion region;

	/**
	 * The cached value of the '{@link #getVoltageLevels() <em>Voltage Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLevel> voltageLevels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SUBSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bay> getBays() {
		if (bays == null) {
			bays = new EObjectWithInverseResolvingEList<Bay>(Bay.class, this, CorePackage.SUBSTATION__BAYS, CorePackage.BAY__SUBSTATION);
		}
		return bays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (SubGeographicalRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SUBSTATION__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(SubGeographicalRegion newRegion, NotificationChain msgs) {
		SubGeographicalRegion oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBSTATION__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(SubGeographicalRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBSTATION__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageLevel> getVoltageLevels() {
		if (voltageLevels == null) {
			voltageLevels = new EObjectWithInverseResolvingEList<VoltageLevel>(VoltageLevel.class, this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, CorePackage.VOLTAGE_LEVEL__SUBSTATION);
		}
		return voltageLevels;
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
			case CorePackage.SUBSTATION__BAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBays()).basicAdd(otherEnd, msgs);
			case CorePackage.SUBSTATION__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
				return basicSetRegion((SubGeographicalRegion)otherEnd, msgs);
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLevels()).basicAdd(otherEnd, msgs);
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
			case CorePackage.SUBSTATION__BAYS:
				return ((InternalEList<?>)getBays()).basicRemove(otherEnd, msgs);
			case CorePackage.SUBSTATION__REGION:
				return basicSetRegion(null, msgs);
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return ((InternalEList<?>)getVoltageLevels()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SUBSTATION__BAYS:
				return getBays();
			case CorePackage.SUBSTATION__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return getVoltageLevels();
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
			case CorePackage.SUBSTATION__BAYS:
				getBays().clear();
				getBays().addAll((Collection<? extends Bay>)newValue);
				return;
			case CorePackage.SUBSTATION__REGION:
				setRegion((SubGeographicalRegion)newValue);
				return;
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				getVoltageLevels().clear();
				getVoltageLevels().addAll((Collection<? extends VoltageLevel>)newValue);
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
			case CorePackage.SUBSTATION__BAYS:
				getBays().clear();
				return;
			case CorePackage.SUBSTATION__REGION:
				setRegion((SubGeographicalRegion)null);
				return;
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				getVoltageLevels().clear();
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
			case CorePackage.SUBSTATION__BAYS:
				return bays != null && !bays.isEmpty();
			case CorePackage.SUBSTATION__REGION:
				return region != null;
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return voltageLevels != null && !voltageLevels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstationImpl
