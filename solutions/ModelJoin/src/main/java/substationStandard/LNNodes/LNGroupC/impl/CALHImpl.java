/**
 */
package substationStandard.LNNodes.LNGroupC.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupC.CALH;
import substationStandard.LNNodes.LNGroupC.LNGroupCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CALH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CALHImpl#getGrAlm <em>Gr Alm</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CALHImpl#getGrWrn <em>Gr Wrn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupC.impl.CALHImpl#getAlmLstOv <em>Alm Lst Ov</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CALHImpl extends GroupCImpl implements CALH {
	/**
	 * The cached value of the '{@link #getGrAlm() <em>Gr Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrAlm()
	 * @generated
	 * @ordered
	 */
	protected SPS grAlm;

	/**
	 * The cached value of the '{@link #getGrWrn() <em>Gr Wrn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrWrn()
	 * @generated
	 * @ordered
	 */
	protected SPS grWrn;

	/**
	 * The cached value of the '{@link #getAlmLstOv() <em>Alm Lst Ov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlmLstOv()
	 * @generated
	 * @ordered
	 */
	protected SPS almLstOv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CALHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupCPackage.Literals.CALH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getGrAlm() {
		if (grAlm != null && grAlm.eIsProxy()) {
			InternalEObject oldGrAlm = (InternalEObject)grAlm;
			grAlm = (SPS)eResolveProxy(oldGrAlm);
			if (grAlm != oldGrAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CALH__GR_ALM, oldGrAlm, grAlm));
			}
		}
		return grAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetGrAlm() {
		return grAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrAlm(SPS newGrAlm) {
		SPS oldGrAlm = grAlm;
		grAlm = newGrAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CALH__GR_ALM, oldGrAlm, grAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getGrWrn() {
		if (grWrn != null && grWrn.eIsProxy()) {
			InternalEObject oldGrWrn = (InternalEObject)grWrn;
			grWrn = (SPS)eResolveProxy(oldGrWrn);
			if (grWrn != oldGrWrn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CALH__GR_WRN, oldGrWrn, grWrn));
			}
		}
		return grWrn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetGrWrn() {
		return grWrn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrWrn(SPS newGrWrn) {
		SPS oldGrWrn = grWrn;
		grWrn = newGrWrn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CALH__GR_WRN, oldGrWrn, grWrn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getAlmLstOv() {
		if (almLstOv != null && almLstOv.eIsProxy()) {
			InternalEObject oldAlmLstOv = (InternalEObject)almLstOv;
			almLstOv = (SPS)eResolveProxy(oldAlmLstOv);
			if (almLstOv != oldAlmLstOv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CALH__ALM_LST_OV, oldAlmLstOv, almLstOv));
			}
		}
		return almLstOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetAlmLstOv() {
		return almLstOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlmLstOv(SPS newAlmLstOv) {
		SPS oldAlmLstOv = almLstOv;
		almLstOv = newAlmLstOv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CALH__ALM_LST_OV, oldAlmLstOv, almLstOv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupCPackage.CALH__GR_ALM:
				if (resolve) return getGrAlm();
				return basicGetGrAlm();
			case LNGroupCPackage.CALH__GR_WRN:
				if (resolve) return getGrWrn();
				return basicGetGrWrn();
			case LNGroupCPackage.CALH__ALM_LST_OV:
				if (resolve) return getAlmLstOv();
				return basicGetAlmLstOv();
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
			case LNGroupCPackage.CALH__GR_ALM:
				setGrAlm((SPS)newValue);
				return;
			case LNGroupCPackage.CALH__GR_WRN:
				setGrWrn((SPS)newValue);
				return;
			case LNGroupCPackage.CALH__ALM_LST_OV:
				setAlmLstOv((SPS)newValue);
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
			case LNGroupCPackage.CALH__GR_ALM:
				setGrAlm((SPS)null);
				return;
			case LNGroupCPackage.CALH__GR_WRN:
				setGrWrn((SPS)null);
				return;
			case LNGroupCPackage.CALH__ALM_LST_OV:
				setAlmLstOv((SPS)null);
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
			case LNGroupCPackage.CALH__GR_ALM:
				return grAlm != null;
			case LNGroupCPackage.CALH__GR_WRN:
				return grWrn != null;
			case LNGroupCPackage.CALH__ALM_LST_OV:
				return almLstOv != null;
		}
		return super.eIsSet(featureID);
	}

} //CALHImpl
