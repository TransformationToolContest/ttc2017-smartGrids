/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.NonConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.NonConformLoadGroupImpl#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.NonConformLoadGroupImpl#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonConformLoadGroupImpl extends LoadGroupImpl implements NonConformLoadGroup {
	/**
	 * The cached value of the '{@link #getNonConformLoadSchedules() <em>Non Conform Load Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonConformLoadSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<NonConformLoadSchedule> nonConformLoadSchedules;

	/**
	 * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<NonConformLoad> energyConsumers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.NON_CONFORM_LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonConformLoadSchedule> getNonConformLoadSchedules() {
		if (nonConformLoadSchedules == null) {
			nonConformLoadSchedules = new EObjectWithInverseResolvingEList<NonConformLoadSchedule>(NonConformLoadSchedule.class, this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP);
		}
		return nonConformLoadSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonConformLoad> getEnergyConsumers() {
		if (energyConsumers == null) {
			energyConsumers = new EObjectWithInverseResolvingEList<NonConformLoad>(NonConformLoad.class, this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, LoadModelPackage.NON_CONFORM_LOAD__LOAD_GROUP);
		}
		return energyConsumers;
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNonConformLoadSchedules()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<?>)getNonConformLoadSchedules()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return getNonConformLoadSchedules();
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return getEnergyConsumers();
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				getNonConformLoadSchedules().clear();
				getNonConformLoadSchedules().addAll((Collection<? extends NonConformLoadSchedule>)newValue);
				return;
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				getEnergyConsumers().addAll((Collection<? extends NonConformLoad>)newValue);
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				getNonConformLoadSchedules().clear();
				return;
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return nonConformLoadSchedules != null && !nonConformLoadSchedules.isEmpty();
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return energyConsumers != null && !energyConsumers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NonConformLoadGroupImpl
