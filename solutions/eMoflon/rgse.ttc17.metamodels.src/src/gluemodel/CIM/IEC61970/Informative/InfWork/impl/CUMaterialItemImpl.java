/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.TypeMaterial;

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
 * An implementation of the model object '<em><b>CU Material Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl#getPropertyUnits <em>Property Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.CUMaterialItemImpl#getCorporateCode <em>Corporate Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CUMaterialItemImpl extends IdentifiedObjectImpl implements CUMaterialItem {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getTypeMaterial() <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMaterial()
	 * @generated
	 * @ordered
	 */
	protected TypeMaterial typeMaterial;

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
	 * The cached value of the '{@link #getPropertyUnits() <em>Property Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyUnit> propertyUnits;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUMaterialItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_MATERIAL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList.ManyInverse<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS);
		}
		return compatibleUnits;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_MATERIAL_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_MATERIAL_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial getTypeMaterial() {
		if (typeMaterial != null && typeMaterial.eIsProxy()) {
			InternalEObject oldTypeMaterial = (InternalEObject)typeMaterial;
			typeMaterial = (TypeMaterial)eResolveProxy(oldTypeMaterial);
			if (typeMaterial != oldTypeMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL, oldTypeMaterial, typeMaterial));
			}
		}
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial basicGetTypeMaterial() {
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMaterial(TypeMaterial newTypeMaterial, NotificationChain msgs) {
		TypeMaterial oldTypeMaterial = typeMaterial;
		typeMaterial = newTypeMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL, oldTypeMaterial, newTypeMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMaterial(TypeMaterial newTypeMaterial) {
		if (newTypeMaterial != typeMaterial) {
			NotificationChain msgs = null;
			if (typeMaterial != null)
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL, newTypeMaterial, newTypeMaterial));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyUnit> getPropertyUnits() {
		if (propertyUnits == null) {
			propertyUnits = new EObjectWithInverseResolvingEList.ManyInverse<PropertyUnit>(PropertyUnit.class, this, InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS, InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS);
		}
		return propertyUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		String oldCorporateCode = corporateCode;
		corporateCode = newCorporateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE, oldCorporateCode, corporateCode));
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
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return ((InternalEList<?>)getPropertyUnits()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				return getQuantity();
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return getPropertyUnits();
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				return getCorporateCode();
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
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				getPropertyUnits().clear();
				getPropertyUnits().addAll((Collection<? extends PropertyUnit>)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				setCorporateCode((String)newValue);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				getPropertyUnits().clear();
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				setCorporateCode(CORPORATE_CODE_EDEFAULT);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				return typeMaterial != null;
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return propertyUnits != null && !propertyUnits.isEmpty();
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				return CORPORATE_CODE_EDEFAULT == null ? corporateCode != null : !CORPORATE_CODE_EDEFAULT.equals(corporateCode);
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", corporateCode: ");
		result.append(corporateCode);
		result.append(')');
		return result.toString();
	}

} //CUMaterialItemImpl
