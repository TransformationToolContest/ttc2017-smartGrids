/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

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
 * An implementation of the model object '<em><b>Duct Bank Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DuctBankInfoImpl#getDuctInfos <em>Duct Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.DuctBankInfoImpl#getCircuitCount <em>Circuit Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DuctBankInfoImpl extends AssetInfoImpl implements DuctBankInfo {
	/**
	 * The cached value of the '{@link #getDuctInfos() <em>Duct Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<DuctInfo> ductInfos;

	/**
	 * The default value of the '{@link #getCircuitCount() <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CIRCUIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCircuitCount() <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitCount()
	 * @generated
	 * @ordered
	 */
	protected int circuitCount = CIRCUIT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctBankInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getDuctBankInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DuctInfo> getDuctInfos() {
		if (ductInfos == null) {
			ductInfos = new EObjectWithInverseResolvingEList<DuctInfo>(DuctInfo.class, this, InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS, InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO);
		}
		return ductInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCircuitCount() {
		return circuitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitCount(int newCircuitCount) {
		int oldCircuitCount = circuitCount;
		circuitCount = newCircuitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DUCT_BANK_INFO__CIRCUIT_COUNT, oldCircuitCount, circuitCount));
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
			case InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuctInfos()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS:
				return ((InternalEList<?>)getDuctInfos()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS:
				return getDuctInfos();
			case InfAssetsPackage.DUCT_BANK_INFO__CIRCUIT_COUNT:
				return getCircuitCount();
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
			case InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS:
				getDuctInfos().clear();
				getDuctInfos().addAll((Collection<? extends DuctInfo>)newValue);
				return;
			case InfAssetsPackage.DUCT_BANK_INFO__CIRCUIT_COUNT:
				setCircuitCount((Integer)newValue);
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
			case InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS:
				getDuctInfos().clear();
				return;
			case InfAssetsPackage.DUCT_BANK_INFO__CIRCUIT_COUNT:
				setCircuitCount(CIRCUIT_COUNT_EDEFAULT);
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
			case InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS:
				return ductInfos != null && !ductInfos.isEmpty();
			case InfAssetsPackage.DUCT_BANK_INFO__CIRCUIT_COUNT:
				return circuitCount != CIRCUIT_COUNT_EDEFAULT;
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
		result.append(" (circuitCount: ");
		result.append(circuitCount);
		result.append(')');
		return result.toString();
	}

} //DuctBankInfoImpl
