/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;
import CIM.IEC61970.Core.PsrList;

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
 * An implementation of the model object '<em><b>Psr List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.PsrListImpl#getTypePSRList <em>Type PSR List</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.PsrListImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PsrListImpl extends IdentifiedObjectImpl implements PsrList {
	/**
	 * The default value of the '{@link #getTypePSRList() <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePSRList()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PSR_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypePSRList() <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePSRList()
	 * @generated
	 * @ordered
	 */
	protected String typePSRList = TYPE_PSR_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PsrListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PSR_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypePSRList() {
		return typePSRList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePSRList(String newTypePSRList) {
		String oldTypePSRList = typePSRList;
		typePSRList = newTypePSRList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PSR_LIST__TYPE_PSR_LIST, oldTypePSRList, typePSRList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new EObjectWithInverseResolvingEList.ManyInverse<PowerSystemResource>(PowerSystemResource.class, this, CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES, CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS);
		}
		return powerSystemResources;
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
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
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				return getTypePSRList();
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
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
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				setTypePSRList((String)newValue);
				return;
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
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
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				setTypePSRList(TYPE_PSR_LIST_EDEFAULT);
				return;
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
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
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				return TYPE_PSR_LIST_EDEFAULT == null ? typePSRList != null : !TYPE_PSR_LIST_EDEFAULT.equals(typePSRList);
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
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
		result.append(" (typePSRList: ");
		result.append(typePSRList);
		result.append(')');
		return result.toString();
	}

} //PsrListImpl
