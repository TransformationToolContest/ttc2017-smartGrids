/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.PowerCutZone;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;
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
 * An implementation of the model object '<em><b>Power Cut Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl#getCutLevel1 <em>Cut Level1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.PowerCutZoneImpl#getCutLevel2 <em>Cut Level2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerCutZoneImpl extends PowerSystemResourceImpl implements PowerCutZone {
	/**
	 * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyConsumer> energyConsumers;

	/**
	 * The default value of the '{@link #getCutLevel1() <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel1()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_LEVEL1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutLevel1() <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel1()
	 * @generated
	 * @ordered
	 */
	protected float cutLevel1 = CUT_LEVEL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutLevel2() <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel2()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_LEVEL2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutLevel2() <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel2()
	 * @generated
	 * @ordered
	 */
	protected float cutLevel2 = CUT_LEVEL2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerCutZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.POWER_CUT_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyConsumer> getEnergyConsumers() {
		if (energyConsumers == null) {
			energyConsumers = new EObjectWithInverseResolvingEList<EnergyConsumer>(EnergyConsumer.class, this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE);
		}
		return energyConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCutLevel1() {
		return cutLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutLevel1(float newCutLevel1) {
		float oldCutLevel1 = cutLevel1;
		cutLevel1 = newCutLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1, oldCutLevel1, cutLevel1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCutLevel2() {
		return cutLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutLevel2(float newCutLevel2) {
		float oldCutLevel2 = cutLevel2;
		cutLevel2 = newCutLevel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2, oldCutLevel2, cutLevel2));
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumers()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return ((InternalEList<?>)getEnergyConsumers()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return getEnergyConsumers();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				return getCutLevel1();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				return getCutLevel2();
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				getEnergyConsumers().addAll((Collection<? extends EnergyConsumer>)newValue);
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				setCutLevel1((Float)newValue);
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				setCutLevel2((Float)newValue);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				setCutLevel1(CUT_LEVEL1_EDEFAULT);
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				setCutLevel2(CUT_LEVEL2_EDEFAULT);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return energyConsumers != null && !energyConsumers.isEmpty();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				return cutLevel1 != CUT_LEVEL1_EDEFAULT;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				return cutLevel2 != CUT_LEVEL2_EDEFAULT;
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
		result.append(" (cutLevel1: ");
		result.append(cutLevel1);
		result.append(", cutLevel2: ");
		result.append(cutLevel2);
		result.append(')');
		return result.toString();
	}

} //PowerCutZoneImpl
