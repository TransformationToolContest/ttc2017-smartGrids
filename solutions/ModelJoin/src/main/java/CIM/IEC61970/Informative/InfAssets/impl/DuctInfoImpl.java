/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.CableInfo;

import CIM.IEC61970.Informative.InfAssets.DuctBankInfo;
import CIM.IEC61970.Informative.InfAssets.DuctInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

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
 * An implementation of the model object '<em><b>Duct Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DuctInfoImpl#getYCoord <em>YCoord</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DuctInfoImpl#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DuctInfoImpl#getCableInfos <em>Cable Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.DuctInfoImpl#getDuctBankInfo <em>Duct Bank Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DuctInfoImpl extends AssetInfoImpl implements DuctInfo {
	/**
	 * The default value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoord()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoord()
	 * @generated
	 * @ordered
	 */
	protected int yCoord = YCOORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoord()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoord()
	 * @generated
	 * @ordered
	 */
	protected int xCoord = XCOORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCableInfos() <em>Cable Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<CableInfo> cableInfos;

	/**
	 * The cached value of the '{@link #getDuctBankInfo() <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctBankInfo()
	 * @generated
	 * @ordered
	 */
	protected DuctBankInfo ductBankInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getDuctInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYCoord() {
		return yCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCoord(int newYCoord) {
		int oldYCoord = yCoord;
		yCoord = newYCoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DUCT_INFO__YCOORD, oldYCoord, yCoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXCoord() {
		return xCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCoord(int newXCoord) {
		int oldXCoord = xCoord;
		xCoord = newXCoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DUCT_INFO__XCOORD, oldXCoord, xCoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CableInfo> getCableInfos() {
		if (cableInfos == null) {
			cableInfos = new EObjectWithInverseResolvingEList<CableInfo>(CableInfo.class, this, InfAssetsPackage.DUCT_INFO__CABLE_INFOS, AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO);
		}
		return cableInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctBankInfo getDuctBankInfo() {
		if (ductBankInfo != null && ductBankInfo.eIsProxy()) {
			InternalEObject oldDuctBankInfo = (InternalEObject)ductBankInfo;
			ductBankInfo = (DuctBankInfo)eResolveProxy(oldDuctBankInfo);
			if (ductBankInfo != oldDuctBankInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO, oldDuctBankInfo, ductBankInfo));
			}
		}
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctBankInfo basicGetDuctBankInfo() {
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuctBankInfo(DuctBankInfo newDuctBankInfo, NotificationChain msgs) {
		DuctBankInfo oldDuctBankInfo = ductBankInfo;
		ductBankInfo = newDuctBankInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO, oldDuctBankInfo, newDuctBankInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuctBankInfo(DuctBankInfo newDuctBankInfo) {
		if (newDuctBankInfo != ductBankInfo) {
			NotificationChain msgs = null;
			if (ductBankInfo != null)
				msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS, DuctBankInfo.class, msgs);
			if (newDuctBankInfo != null)
				msgs = ((InternalEObject)newDuctBankInfo).eInverseAdd(this, InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS, DuctBankInfo.class, msgs);
			msgs = basicSetDuctBankInfo(newDuctBankInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO, newDuctBankInfo, newDuctBankInfo));
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
			case InfAssetsPackage.DUCT_INFO__CABLE_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCableInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO:
				if (ductBankInfo != null)
					msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT_BANK_INFO__DUCT_INFOS, DuctBankInfo.class, msgs);
				return basicSetDuctBankInfo((DuctBankInfo)otherEnd, msgs);
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
			case InfAssetsPackage.DUCT_INFO__CABLE_INFOS:
				return ((InternalEList<?>)getCableInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO:
				return basicSetDuctBankInfo(null, msgs);
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
			case InfAssetsPackage.DUCT_INFO__YCOORD:
				return getYCoord();
			case InfAssetsPackage.DUCT_INFO__XCOORD:
				return getXCoord();
			case InfAssetsPackage.DUCT_INFO__CABLE_INFOS:
				return getCableInfos();
			case InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO:
				if (resolve) return getDuctBankInfo();
				return basicGetDuctBankInfo();
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
			case InfAssetsPackage.DUCT_INFO__YCOORD:
				setYCoord((Integer)newValue);
				return;
			case InfAssetsPackage.DUCT_INFO__XCOORD:
				setXCoord((Integer)newValue);
				return;
			case InfAssetsPackage.DUCT_INFO__CABLE_INFOS:
				getCableInfos().clear();
				getCableInfos().addAll((Collection<? extends CableInfo>)newValue);
				return;
			case InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO:
				setDuctBankInfo((DuctBankInfo)newValue);
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
			case InfAssetsPackage.DUCT_INFO__YCOORD:
				setYCoord(YCOORD_EDEFAULT);
				return;
			case InfAssetsPackage.DUCT_INFO__XCOORD:
				setXCoord(XCOORD_EDEFAULT);
				return;
			case InfAssetsPackage.DUCT_INFO__CABLE_INFOS:
				getCableInfos().clear();
				return;
			case InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO:
				setDuctBankInfo((DuctBankInfo)null);
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
			case InfAssetsPackage.DUCT_INFO__YCOORD:
				return yCoord != YCOORD_EDEFAULT;
			case InfAssetsPackage.DUCT_INFO__XCOORD:
				return xCoord != XCOORD_EDEFAULT;
			case InfAssetsPackage.DUCT_INFO__CABLE_INFOS:
				return cableInfos != null && !cableInfos.isEmpty();
			case InfAssetsPackage.DUCT_INFO__DUCT_BANK_INFO:
				return ductBankInfo != null;
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
		result.append(" (yCoord: ");
		result.append(yCoord);
		result.append(", xCoord: ");
		result.append(xCoord);
		result.append(')');
		return result.toString();
	}

} //DuctInfoImpl
