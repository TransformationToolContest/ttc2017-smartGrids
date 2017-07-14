/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupA.impl;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.BSC;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupA.AVCO;
import gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVCO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl#getBlkEF <em>Blk EF</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl#getBlkAOv <em>Blk AOv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl#getBlkVOv <em>Blk VOv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl#getLimAOv <em>Lim AOv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl#getLimVOv <em>Lim VOv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AVCOImpl extends GroupAImpl implements AVCO {
	/**
	 * The cached value of the '{@link #getTapChg() <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChg()
	 * @generated
	 * @ordered
	 */
	protected BSC tapChg;

	/**
	 * The cached value of the '{@link #getBlkEF() <em>Blk EF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkEF()
	 * @generated
	 * @ordered
	 */
	protected SPS blkEF;

	/**
	 * The cached value of the '{@link #getBlkAOv() <em>Blk AOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkAOv()
	 * @generated
	 * @ordered
	 */
	protected SPS blkAOv;

	/**
	 * The cached value of the '{@link #getBlkVOv() <em>Blk VOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkVOv()
	 * @generated
	 * @ordered
	 */
	protected SPS blkVOv;

	/**
	 * The cached value of the '{@link #getLimAOv() <em>Lim AOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimAOv()
	 * @generated
	 * @ordered
	 */
	protected ASG limAOv;

	/**
	 * The cached value of the '{@link #getLimVOv() <em>Lim VOv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimVOv()
	 * @generated
	 * @ordered
	 */
	protected ASG limVOv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVCOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupAPackage.Literals.AVCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC getTapChg() {
		if (tapChg != null && tapChg.eIsProxy()) {
			InternalEObject oldTapChg = (InternalEObject)tapChg;
			tapChg = (BSC)eResolveProxy(oldTapChg);
			if (tapChg != oldTapChg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.AVCO__TAP_CHG, oldTapChg, tapChg));
			}
		}
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC basicGetTapChg() {
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChg(BSC newTapChg) {
		BSC oldTapChg = tapChg;
		tapChg = newTapChg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.AVCO__TAP_CHG, oldTapChg, tapChg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getBlkEF() {
		if (blkEF != null && blkEF.eIsProxy()) {
			InternalEObject oldBlkEF = (InternalEObject)blkEF;
			blkEF = (SPS)eResolveProxy(oldBlkEF);
			if (blkEF != oldBlkEF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.AVCO__BLK_EF, oldBlkEF, blkEF));
			}
		}
		return blkEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetBlkEF() {
		return blkEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkEF(SPS newBlkEF) {
		SPS oldBlkEF = blkEF;
		blkEF = newBlkEF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.AVCO__BLK_EF, oldBlkEF, blkEF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getBlkAOv() {
		if (blkAOv != null && blkAOv.eIsProxy()) {
			InternalEObject oldBlkAOv = (InternalEObject)blkAOv;
			blkAOv = (SPS)eResolveProxy(oldBlkAOv);
			if (blkAOv != oldBlkAOv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.AVCO__BLK_AOV, oldBlkAOv, blkAOv));
			}
		}
		return blkAOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetBlkAOv() {
		return blkAOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkAOv(SPS newBlkAOv) {
		SPS oldBlkAOv = blkAOv;
		blkAOv = newBlkAOv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.AVCO__BLK_AOV, oldBlkAOv, blkAOv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getBlkVOv() {
		if (blkVOv != null && blkVOv.eIsProxy()) {
			InternalEObject oldBlkVOv = (InternalEObject)blkVOv;
			blkVOv = (SPS)eResolveProxy(oldBlkVOv);
			if (blkVOv != oldBlkVOv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.AVCO__BLK_VOV, oldBlkVOv, blkVOv));
			}
		}
		return blkVOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetBlkVOv() {
		return blkVOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkVOv(SPS newBlkVOv) {
		SPS oldBlkVOv = blkVOv;
		blkVOv = newBlkVOv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.AVCO__BLK_VOV, oldBlkVOv, blkVOv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLimAOv() {
		if (limAOv != null && limAOv.eIsProxy()) {
			InternalEObject oldLimAOv = (InternalEObject)limAOv;
			limAOv = (ASG)eResolveProxy(oldLimAOv);
			if (limAOv != oldLimAOv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.AVCO__LIM_AOV, oldLimAOv, limAOv));
			}
		}
		return limAOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLimAOv() {
		return limAOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimAOv(ASG newLimAOv) {
		ASG oldLimAOv = limAOv;
		limAOv = newLimAOv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.AVCO__LIM_AOV, oldLimAOv, limAOv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLimVOv() {
		if (limVOv != null && limVOv.eIsProxy()) {
			InternalEObject oldLimVOv = (InternalEObject)limVOv;
			limVOv = (ASG)eResolveProxy(oldLimVOv);
			if (limVOv != oldLimVOv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.AVCO__LIM_VOV, oldLimVOv, limVOv));
			}
		}
		return limVOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLimVOv() {
		return limVOv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimVOv(ASG newLimVOv) {
		ASG oldLimVOv = limVOv;
		limVOv = newLimVOv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.AVCO__LIM_VOV, oldLimVOv, limVOv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupAPackage.AVCO__TAP_CHG:
				if (resolve) return getTapChg();
				return basicGetTapChg();
			case LNGroupAPackage.AVCO__BLK_EF:
				if (resolve) return getBlkEF();
				return basicGetBlkEF();
			case LNGroupAPackage.AVCO__BLK_AOV:
				if (resolve) return getBlkAOv();
				return basicGetBlkAOv();
			case LNGroupAPackage.AVCO__BLK_VOV:
				if (resolve) return getBlkVOv();
				return basicGetBlkVOv();
			case LNGroupAPackage.AVCO__LIM_AOV:
				if (resolve) return getLimAOv();
				return basicGetLimAOv();
			case LNGroupAPackage.AVCO__LIM_VOV:
				if (resolve) return getLimVOv();
				return basicGetLimVOv();
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
			case LNGroupAPackage.AVCO__TAP_CHG:
				setTapChg((BSC)newValue);
				return;
			case LNGroupAPackage.AVCO__BLK_EF:
				setBlkEF((SPS)newValue);
				return;
			case LNGroupAPackage.AVCO__BLK_AOV:
				setBlkAOv((SPS)newValue);
				return;
			case LNGroupAPackage.AVCO__BLK_VOV:
				setBlkVOv((SPS)newValue);
				return;
			case LNGroupAPackage.AVCO__LIM_AOV:
				setLimAOv((ASG)newValue);
				return;
			case LNGroupAPackage.AVCO__LIM_VOV:
				setLimVOv((ASG)newValue);
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
			case LNGroupAPackage.AVCO__TAP_CHG:
				setTapChg((BSC)null);
				return;
			case LNGroupAPackage.AVCO__BLK_EF:
				setBlkEF((SPS)null);
				return;
			case LNGroupAPackage.AVCO__BLK_AOV:
				setBlkAOv((SPS)null);
				return;
			case LNGroupAPackage.AVCO__BLK_VOV:
				setBlkVOv((SPS)null);
				return;
			case LNGroupAPackage.AVCO__LIM_AOV:
				setLimAOv((ASG)null);
				return;
			case LNGroupAPackage.AVCO__LIM_VOV:
				setLimVOv((ASG)null);
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
			case LNGroupAPackage.AVCO__TAP_CHG:
				return tapChg != null;
			case LNGroupAPackage.AVCO__BLK_EF:
				return blkEF != null;
			case LNGroupAPackage.AVCO__BLK_AOV:
				return blkAOv != null;
			case LNGroupAPackage.AVCO__BLK_VOV:
				return blkVOv != null;
			case LNGroupAPackage.AVCO__LIM_AOV:
				return limAOv != null;
			case LNGroupAPackage.AVCO__LIM_VOV:
				return limVOv != null;
		}
		return super.eIsSet(featureID);
	}

} //AVCOImpl
