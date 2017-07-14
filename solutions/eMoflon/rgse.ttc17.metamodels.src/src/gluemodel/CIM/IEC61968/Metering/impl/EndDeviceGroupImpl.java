/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.DemandResponseProgram;
import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.EndDeviceControl;
import gluemodel.CIM.IEC61968.Metering.EndDeviceGroup;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>End Device Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl#getGroupAddress <em>Group Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl#getEndDeviceAssets <em>End Device Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceGroupImpl extends IdentifiedObjectImpl implements EndDeviceGroup {
	/**
	 * The cached value of the '{@link #getDemandResponseProgram() <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandResponseProgram()
	 * @generated
	 * @ordered
	 */
	protected DemandResponseProgram demandResponseProgram;

	/**
	 * The default value of the '{@link #getGroupAddress() <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int GROUP_ADDRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGroupAddress() <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddress()
	 * @generated
	 * @ordered
	 */
	protected int groupAddress = GROUP_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndDeviceAssets() <em>End Device Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceAsset> endDeviceAssets;

	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram getDemandResponseProgram() {
		if (demandResponseProgram != null && demandResponseProgram.eIsProxy()) {
			InternalEObject oldDemandResponseProgram = (InternalEObject)demandResponseProgram;
			demandResponseProgram = (DemandResponseProgram)eResolveProxy(oldDemandResponseProgram);
			if (demandResponseProgram != oldDemandResponseProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM, oldDemandResponseProgram, demandResponseProgram));
			}
		}
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram basicGetDemandResponseProgram() {
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandResponseProgram(DemandResponseProgram newDemandResponseProgram, NotificationChain msgs) {
		DemandResponseProgram oldDemandResponseProgram = demandResponseProgram;
		demandResponseProgram = newDemandResponseProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM, oldDemandResponseProgram, newDemandResponseProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandResponseProgram(DemandResponseProgram newDemandResponseProgram) {
		if (newDemandResponseProgram != demandResponseProgram) {
			NotificationChain msgs = null;
			if (demandResponseProgram != null)
				msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, DemandResponseProgram.class, msgs);
			if (newDemandResponseProgram != null)
				msgs = ((InternalEObject)newDemandResponseProgram).eInverseAdd(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, DemandResponseProgram.class, msgs);
			msgs = basicSetDemandResponseProgram(newDemandResponseProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM, newDemandResponseProgram, newDemandResponseProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGroupAddress() {
		return groupAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupAddress(int newGroupAddress) {
		int oldGroupAddress = groupAddress;
		groupAddress = newGroupAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS, oldGroupAddress, groupAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceAsset> getEndDeviceAssets() {
		if (endDeviceAssets == null) {
			endDeviceAssets = new EObjectWithInverseResolvingEList.ManyInverse<EndDeviceAsset>(EndDeviceAsset.class, this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS);
		}
		return endDeviceAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new EObjectWithInverseResolvingEList<EndDeviceControl>(EndDeviceControl.class, this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP);
		}
		return endDeviceControls;
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
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				if (demandResponseProgram != null)
					msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, DemandResponseProgram.class, msgs);
				return basicSetDemandResponseProgram((DemandResponseProgram)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceAssets()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				return basicSetDemandResponseProgram(null, msgs);
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS:
				return ((InternalEList<?>)getEndDeviceAssets()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				if (resolve) return getDemandResponseProgram();
				return basicGetDemandResponseProgram();
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				return getGroupAddress();
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS:
				return getEndDeviceAssets();
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
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
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)newValue);
				return;
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				setGroupAddress((Integer)newValue);
				return;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				getEndDeviceAssets().addAll((Collection<? extends EndDeviceAsset>)newValue);
				return;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
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
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)null);
				return;
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				setGroupAddress(GROUP_ADDRESS_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				return;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
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
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				return demandResponseProgram != null;
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				return groupAddress != GROUP_ADDRESS_EDEFAULT;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS:
				return endDeviceAssets != null && !endDeviceAssets.isEmpty();
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
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
		result.append(" (groupAddress: ");
		result.append(groupAddress);
		result.append(')');
		return result.toString();
	}

} //EndDeviceGroupImpl
