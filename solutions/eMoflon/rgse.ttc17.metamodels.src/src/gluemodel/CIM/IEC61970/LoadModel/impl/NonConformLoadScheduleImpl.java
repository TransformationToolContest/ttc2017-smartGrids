/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup;
import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.NonConformLoadScheduleImpl#getNonConformLoadGroup <em>Non Conform Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonConformLoadScheduleImpl extends SeasonDayTypeScheduleImpl implements NonConformLoadSchedule {
	/**
	 * The cached value of the '{@link #getNonConformLoadGroup() <em>Non Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonConformLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected NonConformLoadGroup nonConformLoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.NON_CONFORM_LOAD_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup getNonConformLoadGroup() {
		if (nonConformLoadGroup != null && nonConformLoadGroup.eIsProxy()) {
			InternalEObject oldNonConformLoadGroup = (InternalEObject)nonConformLoadGroup;
			nonConformLoadGroup = (NonConformLoadGroup)eResolveProxy(oldNonConformLoadGroup);
			if (nonConformLoadGroup != oldNonConformLoadGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, oldNonConformLoadGroup, nonConformLoadGroup));
			}
		}
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup basicGetNonConformLoadGroup() {
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonConformLoadGroup(NonConformLoadGroup newNonConformLoadGroup, NotificationChain msgs) {
		NonConformLoadGroup oldNonConformLoadGroup = nonConformLoadGroup;
		nonConformLoadGroup = newNonConformLoadGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, oldNonConformLoadGroup, newNonConformLoadGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonConformLoadGroup(NonConformLoadGroup newNonConformLoadGroup) {
		if (newNonConformLoadGroup != nonConformLoadGroup) {
			NotificationChain msgs = null;
			if (nonConformLoadGroup != null)
				msgs = ((InternalEObject)nonConformLoadGroup).eInverseRemove(this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs);
			if (newNonConformLoadGroup != null)
				msgs = ((InternalEObject)newNonConformLoadGroup).eInverseAdd(this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs);
			msgs = basicSetNonConformLoadGroup(newNonConformLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, newNonConformLoadGroup, newNonConformLoadGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				if (nonConformLoadGroup != null)
					msgs = ((InternalEObject)nonConformLoadGroup).eInverseRemove(this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs);
				return basicSetNonConformLoadGroup((NonConformLoadGroup)otherEnd, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				return basicSetNonConformLoadGroup(null, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				if (resolve) return getNonConformLoadGroup();
				return basicGetNonConformLoadGroup();
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				setNonConformLoadGroup((NonConformLoadGroup)newValue);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				setNonConformLoadGroup((NonConformLoadGroup)null);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				return nonConformLoadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //NonConformLoadScheduleImpl
