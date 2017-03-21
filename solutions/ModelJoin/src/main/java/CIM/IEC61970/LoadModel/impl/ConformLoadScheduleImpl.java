/**
 */
package CIM.IEC61970.LoadModel.impl;

import CIM.IEC61970.LoadModel.ConformLoadGroup;
import CIM.IEC61970.LoadModel.ConformLoadSchedule;
import CIM.IEC61970.LoadModel.LoadModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.ConformLoadScheduleImpl#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformLoadScheduleImpl extends SeasonDayTypeScheduleImpl implements ConformLoadSchedule {
	/**
	 * The cached value of the '{@link #getConformLoadGroup() <em>Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected ConformLoadGroup conformLoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.CONFORM_LOAD_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup getConformLoadGroup() {
		if (conformLoadGroup != null && conformLoadGroup.eIsProxy()) {
			InternalEObject oldConformLoadGroup = (InternalEObject)conformLoadGroup;
			conformLoadGroup = (ConformLoadGroup)eResolveProxy(oldConformLoadGroup);
			if (conformLoadGroup != oldConformLoadGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP, oldConformLoadGroup, conformLoadGroup));
			}
		}
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup basicGetConformLoadGroup() {
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformLoadGroup(ConformLoadGroup newConformLoadGroup, NotificationChain msgs) {
		ConformLoadGroup oldConformLoadGroup = conformLoadGroup;
		conformLoadGroup = newConformLoadGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP, oldConformLoadGroup, newConformLoadGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformLoadGroup(ConformLoadGroup newConformLoadGroup) {
		if (newConformLoadGroup != conformLoadGroup) {
			NotificationChain msgs = null;
			if (conformLoadGroup != null)
				msgs = ((InternalEObject)conformLoadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs);
			if (newConformLoadGroup != null)
				msgs = ((InternalEObject)newConformLoadGroup).eInverseAdd(this, LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs);
			msgs = basicSetConformLoadGroup(newConformLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP, newConformLoadGroup, newConformLoadGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				if (conformLoadGroup != null)
					msgs = ((InternalEObject)conformLoadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs);
				return basicSetConformLoadGroup((ConformLoadGroup)otherEnd, msgs);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				return basicSetConformLoadGroup(null, msgs);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				if (resolve) return getConformLoadGroup();
				return basicGetConformLoadGroup();
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				setConformLoadGroup((ConformLoadGroup)newValue);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				setConformLoadGroup((ConformLoadGroup)null);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				return conformLoadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ConformLoadScheduleImpl
