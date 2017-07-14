/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset;
import gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>CU Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl#getTypeAssetCode <em>Type Asset Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUAssetImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CUAssetImpl extends IdentifiedObjectImpl implements CUAsset {
	/**
	 * The default value of the '{@link #getTypeAssetCode() <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssetCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ASSET_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAssetCode() <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssetCode()
	 * @generated
	 * @ordered
	 */
	protected String typeAssetCode = TYPE_ASSET_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected TypeAsset typeAsset;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAssetCode() {
		return typeAssetCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAssetCode(String newTypeAssetCode) {
		String oldTypeAssetCode = typeAssetCode;
		typeAssetCode = newTypeAssetCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE, oldTypeAssetCode, typeAssetCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_ASSET__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_ASSET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset getTypeAsset() {
		if (typeAsset != null && typeAsset.eIsProxy()) {
			InternalEObject oldTypeAsset = (InternalEObject)typeAsset;
			typeAsset = (TypeAsset)eResolveProxy(oldTypeAsset);
			if (typeAsset != oldTypeAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_ASSET__TYPE_ASSET, oldTypeAsset, typeAsset));
			}
		}
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset basicGetTypeAsset() {
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAsset(TypeAsset newTypeAsset, NotificationChain msgs) {
		TypeAsset oldTypeAsset = typeAsset;
		typeAsset = newTypeAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_ASSET__TYPE_ASSET, oldTypeAsset, newTypeAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAsset(TypeAsset newTypeAsset) {
		if (newTypeAsset != typeAsset) {
			NotificationChain msgs = null;
			if (typeAsset != null)
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__CU_ASSET, TypeAsset.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET__CU_ASSET, TypeAsset.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_ASSET__TYPE_ASSET, newTypeAsset, newTypeAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		BigInteger oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_ASSET__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList.ManyInverse<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS);
		}
		return compatibleUnits;
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
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__CU_ASSET, TypeAsset.class, msgs);
				return basicSetTypeAsset((TypeAsset)otherEnd, msgs);
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				return getTypeAssetCode();
			case InfWorkPackage.CU_ASSET__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfWorkPackage.CU_ASSET__QUANTITY:
				return getQuantity();
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return getCompatibleUnits();
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
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				setTypeAssetCode((String)newValue);
				return;
			case InfWorkPackage.CU_ASSET__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				setTypeAsset((TypeAsset)newValue);
				return;
			case InfWorkPackage.CU_ASSET__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
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
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				setTypeAssetCode(TYPE_ASSET_CODE_EDEFAULT);
				return;
			case InfWorkPackage.CU_ASSET__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				setTypeAsset((TypeAsset)null);
				return;
			case InfWorkPackage.CU_ASSET__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
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
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				return TYPE_ASSET_CODE_EDEFAULT == null ? typeAssetCode != null : !TYPE_ASSET_CODE_EDEFAULT.equals(typeAssetCode);
			case InfWorkPackage.CU_ASSET__STATUS:
				return status != null;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				return typeAsset != null;
			case InfWorkPackage.CU_ASSET__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
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
		result.append(" (typeAssetCode: ");
		result.append(typeAssetCode);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //CUAssetImpl
