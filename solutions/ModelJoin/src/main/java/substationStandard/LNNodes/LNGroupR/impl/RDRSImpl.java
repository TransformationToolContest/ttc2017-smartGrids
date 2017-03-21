/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.SPC;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RDRS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDRS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDRSImpl#getAutoUpLod <em>Auto Up Lod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDRSImpl#getDltRcd <em>Dlt Rcd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDRSImpl extends GroupRImpl implements RDRS {
	/**
	 * The cached value of the '{@link #getAutoUpLod() <em>Auto Up Lod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoUpLod()
	 * @generated
	 * @ordered
	 */
	protected SPC autoUpLod;

	/**
	 * The cached value of the '{@link #getDltRcd() <em>Dlt Rcd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDltRcd()
	 * @generated
	 * @ordered
	 */
	protected SPC dltRcd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RDRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getAutoUpLod() {
		if (autoUpLod != null && autoUpLod.eIsProxy()) {
			InternalEObject oldAutoUpLod = (InternalEObject)autoUpLod;
			autoUpLod = (SPC)eResolveProxy(oldAutoUpLod);
			if (autoUpLod != oldAutoUpLod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRS__AUTO_UP_LOD, oldAutoUpLod, autoUpLod));
			}
		}
		return autoUpLod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetAutoUpLod() {
		return autoUpLod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoUpLod(SPC newAutoUpLod) {
		SPC oldAutoUpLod = autoUpLod;
		autoUpLod = newAutoUpLod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRS__AUTO_UP_LOD, oldAutoUpLod, autoUpLod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getDltRcd() {
		if (dltRcd != null && dltRcd.eIsProxy()) {
			InternalEObject oldDltRcd = (InternalEObject)dltRcd;
			dltRcd = (SPC)eResolveProxy(oldDltRcd);
			if (dltRcd != oldDltRcd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRS__DLT_RCD, oldDltRcd, dltRcd));
			}
		}
		return dltRcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetDltRcd() {
		return dltRcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDltRcd(SPC newDltRcd) {
		SPC oldDltRcd = dltRcd;
		dltRcd = newDltRcd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRS__DLT_RCD, oldDltRcd, dltRcd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RDRS__AUTO_UP_LOD:
				if (resolve) return getAutoUpLod();
				return basicGetAutoUpLod();
			case LNGroupRPackage.RDRS__DLT_RCD:
				if (resolve) return getDltRcd();
				return basicGetDltRcd();
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
			case LNGroupRPackage.RDRS__AUTO_UP_LOD:
				setAutoUpLod((SPC)newValue);
				return;
			case LNGroupRPackage.RDRS__DLT_RCD:
				setDltRcd((SPC)newValue);
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
			case LNGroupRPackage.RDRS__AUTO_UP_LOD:
				setAutoUpLod((SPC)null);
				return;
			case LNGroupRPackage.RDRS__DLT_RCD:
				setDltRcd((SPC)null);
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
			case LNGroupRPackage.RDRS__AUTO_UP_LOD:
				return autoUpLod != null;
			case LNGroupRPackage.RDRS__DLT_RCD:
				return dltRcd != null;
		}
		return super.eIsSet(featureID);
	}

} //RDRSImpl
