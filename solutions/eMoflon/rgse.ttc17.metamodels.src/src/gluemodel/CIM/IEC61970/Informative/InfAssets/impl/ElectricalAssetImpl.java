/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Assets.impl.AssetImpl;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;
import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo;
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
 * An implementation of the model object '<em><b>Electrical Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalAssetImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalAssetImpl#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalAssetImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalAssetImpl#getElectricalInfos <em>Electrical Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalAssetImpl extends AssetImpl implements ElectricalAsset {
	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnected = IS_CONNECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * The cached value of the '{@link #getElectricalInfos() <em>Electrical Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalInfo> electricalInfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getElectricalAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		PhaseCode oldPhaseCode = phaseCode;
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_ASSET__PHASE_CODE, oldPhaseCode, phaseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConnected() {
		return isConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConnected(boolean newIsConnected) {
		boolean oldIsConnected = isConnected;
		isConnected = newIsConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_ASSET__IS_CONNECTED, oldIsConnected, isConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT, oldConductingEquipment, conductingEquipment));
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalInfo> getElectricalInfos() {
		if (electricalInfos == null) {
			electricalInfos = new EObjectWithInverseResolvingEList.ManyInverse<ElectricalInfo>(ElectricalInfo.class, this, InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS, InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS);
		}
		return electricalInfos;
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
			case InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
			case InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalInfos()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
			case InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS:
				return ((InternalEList<?>)getElectricalInfos()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.ELECTRICAL_ASSET__PHASE_CODE:
				return getPhaseCode();
			case InfAssetsPackage.ELECTRICAL_ASSET__IS_CONNECTED:
				return isIsConnected();
			case InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
			case InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS:
				return getElectricalInfos();
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
			case InfAssetsPackage.ELECTRICAL_ASSET__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_ASSET__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS:
				getElectricalInfos().clear();
				getElectricalInfos().addAll((Collection<? extends ElectricalInfo>)newValue);
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
			case InfAssetsPackage.ELECTRICAL_ASSET__PHASE_CODE:
				setPhaseCode(PHASE_CODE_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_ASSET__IS_CONNECTED:
				setIsConnected(IS_CONNECTED_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
				return;
			case InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS:
				getElectricalInfos().clear();
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
			case InfAssetsPackage.ELECTRICAL_ASSET__PHASE_CODE:
				return phaseCode != PHASE_CODE_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_ASSET__IS_CONNECTED:
				return isConnected != IS_CONNECTED_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
			case InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS:
				return electricalInfos != null && !electricalInfos.isEmpty();
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
		result.append(" (phaseCode: ");
		result.append(phaseCode);
		result.append(", isConnected: ");
		result.append(isConnected);
		result.append(')');
		return result.toString();
	}

} //ElectricalAssetImpl
