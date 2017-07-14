/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.LoadModel.ConformLoad;
import gluemodel.CIM.IEC61970.LoadModel.ConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;

import gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.ConformLoadImpl#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformLoadImpl extends EnergyConsumerImpl implements ConformLoad {
	/**
	 * The cached value of the '{@link #getLoadGroup() <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected ConformLoadGroup loadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.CONFORM_LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup getLoadGroup() {
		if (loadGroup != null && loadGroup.eIsProxy()) {
			InternalEObject oldLoadGroup = (InternalEObject)loadGroup;
			loadGroup = (ConformLoadGroup)eResolveProxy(oldLoadGroup);
			if (loadGroup != oldLoadGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.CONFORM_LOAD__LOAD_GROUP, oldLoadGroup, loadGroup));
			}
		}
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup basicGetLoadGroup() {
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadGroup(ConformLoadGroup newLoadGroup, NotificationChain msgs) {
		ConformLoadGroup oldLoadGroup = loadGroup;
		loadGroup = newLoadGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.CONFORM_LOAD__LOAD_GROUP, oldLoadGroup, newLoadGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadGroup(ConformLoadGroup newLoadGroup) {
		if (newLoadGroup != loadGroup) {
			NotificationChain msgs = null;
			if (loadGroup != null)
				msgs = ((InternalEObject)loadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs);
			if (newLoadGroup != null)
				msgs = ((InternalEObject)newLoadGroup).eInverseAdd(this, LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs);
			msgs = basicSetLoadGroup(newLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.CONFORM_LOAD__LOAD_GROUP, newLoadGroup, newLoadGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				if (loadGroup != null)
					msgs = ((InternalEObject)loadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs);
				return basicSetLoadGroup((ConformLoadGroup)otherEnd, msgs);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				return basicSetLoadGroup(null, msgs);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				if (resolve) return getLoadGroup();
				return basicGetLoadGroup();
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				setLoadGroup((ConformLoadGroup)newValue);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				setLoadGroup((ConformLoadGroup)null);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				return loadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ConformLoadImpl
