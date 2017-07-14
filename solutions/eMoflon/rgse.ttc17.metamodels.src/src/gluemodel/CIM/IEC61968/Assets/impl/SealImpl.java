/**
 */
package gluemodel.CIM.IEC61968.Assets.impl;

import gluemodel.CIM.IEC61968.Assets.AssetContainer;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;
import gluemodel.CIM.IEC61968.Assets.Seal;
import gluemodel.CIM.IEC61968.Assets.SealConditionKind;
import gluemodel.CIM.IEC61968.Assets.SealKind;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.SealImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.SealImpl#getSealNumber <em>Seal Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.SealImpl#getAppliedDateTime <em>Applied Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.SealImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.SealImpl#getAssetContainer <em>Asset Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SealImpl extends IdentifiedObjectImpl implements Seal {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final SealConditionKind CONDITION_EDEFAULT = SealConditionKind.MISSING;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected SealConditionKind condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSealNumber() <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSealNumber() <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealNumber()
	 * @generated
	 * @ordered
	 */
	protected String sealNumber = SEAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppliedDateTime() <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPLIED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppliedDateTime() <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date appliedDateTime = APPLIED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SealKind KIND_EDEFAULT = SealKind.LEAD;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SealKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetContainer()
	 * @generated
	 * @ordered
	 */
	protected AssetContainer assetContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SealImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.SEAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealConditionKind getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(SealConditionKind newCondition) {
		SealConditionKind oldCondition = condition;
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.SEAL__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSealNumber() {
		return sealNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSealNumber(String newSealNumber) {
		String oldSealNumber = sealNumber;
		sealNumber = newSealNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.SEAL__SEAL_NUMBER, oldSealNumber, sealNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAppliedDateTime() {
		return appliedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedDateTime(Date newAppliedDateTime) {
		Date oldAppliedDateTime = appliedDateTime;
		appliedDateTime = newAppliedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.SEAL__APPLIED_DATE_TIME, oldAppliedDateTime, appliedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(SealKind newKind) {
		SealKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.SEAL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer getAssetContainer() {
		if (assetContainer != null && assetContainer.eIsProxy()) {
			InternalEObject oldAssetContainer = (InternalEObject)assetContainer;
			assetContainer = (AssetContainer)eResolveProxy(oldAssetContainer);
			if (assetContainer != oldAssetContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.SEAL__ASSET_CONTAINER, oldAssetContainer, assetContainer));
			}
		}
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer basicGetAssetContainer() {
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetContainer(AssetContainer newAssetContainer, NotificationChain msgs) {
		AssetContainer oldAssetContainer = assetContainer;
		assetContainer = newAssetContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.SEAL__ASSET_CONTAINER, oldAssetContainer, newAssetContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetContainer(AssetContainer newAssetContainer) {
		if (newAssetContainer != assetContainer) {
			NotificationChain msgs = null;
			if (assetContainer != null)
				msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs);
			if (newAssetContainer != null)
				msgs = ((InternalEObject)newAssetContainer).eInverseAdd(this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs);
			msgs = basicSetAssetContainer(newAssetContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.SEAL__ASSET_CONTAINER, newAssetContainer, newAssetContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				if (assetContainer != null)
					msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs);
				return basicSetAssetContainer((AssetContainer)otherEnd, msgs);
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
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				return basicSetAssetContainer(null, msgs);
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
			case AssetsPackage.SEAL__CONDITION:
				return getCondition();
			case AssetsPackage.SEAL__SEAL_NUMBER:
				return getSealNumber();
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				return getAppliedDateTime();
			case AssetsPackage.SEAL__KIND:
				return getKind();
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				if (resolve) return getAssetContainer();
				return basicGetAssetContainer();
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
			case AssetsPackage.SEAL__CONDITION:
				setCondition((SealConditionKind)newValue);
				return;
			case AssetsPackage.SEAL__SEAL_NUMBER:
				setSealNumber((String)newValue);
				return;
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				setAppliedDateTime((Date)newValue);
				return;
			case AssetsPackage.SEAL__KIND:
				setKind((SealKind)newValue);
				return;
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)newValue);
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
			case AssetsPackage.SEAL__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case AssetsPackage.SEAL__SEAL_NUMBER:
				setSealNumber(SEAL_NUMBER_EDEFAULT);
				return;
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				setAppliedDateTime(APPLIED_DATE_TIME_EDEFAULT);
				return;
			case AssetsPackage.SEAL__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)null);
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
			case AssetsPackage.SEAL__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case AssetsPackage.SEAL__SEAL_NUMBER:
				return SEAL_NUMBER_EDEFAULT == null ? sealNumber != null : !SEAL_NUMBER_EDEFAULT.equals(sealNumber);
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				return APPLIED_DATE_TIME_EDEFAULT == null ? appliedDateTime != null : !APPLIED_DATE_TIME_EDEFAULT.equals(appliedDateTime);
			case AssetsPackage.SEAL__KIND:
				return kind != KIND_EDEFAULT;
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				return assetContainer != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", sealNumber: ");
		result.append(sealNumber);
		result.append(", appliedDateTime: ");
		result.append(appliedDateTime);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SealImpl
