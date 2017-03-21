/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.ING;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RDIR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDIR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getChrAng <em>Chr Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getMinFwdAng <em>Min Fwd Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getMinRvAng <em>Min Rv Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getMaxFwdAng <em>Max Fwd Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getMaxRvAng <em>Max Rv Ang</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getBlkValA <em>Blk Val A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getBlkValV <em>Blk Val V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getPolQty <em>Pol Qty</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDIRImpl#getMinPPV <em>Min PPV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDIRImpl extends GroupRImpl implements RDIR {
	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected ACD dir;

	/**
	 * The cached value of the '{@link #getChrAng() <em>Chr Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChrAng()
	 * @generated
	 * @ordered
	 */
	protected ASG chrAng;

	/**
	 * The cached value of the '{@link #getMinFwdAng() <em>Min Fwd Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFwdAng()
	 * @generated
	 * @ordered
	 */
	protected ASG minFwdAng;

	/**
	 * The cached value of the '{@link #getMinRvAng() <em>Min Rv Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRvAng()
	 * @generated
	 * @ordered
	 */
	protected ASG minRvAng;

	/**
	 * The cached value of the '{@link #getMaxFwdAng() <em>Max Fwd Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFwdAng()
	 * @generated
	 * @ordered
	 */
	protected ASG maxFwdAng;

	/**
	 * The cached value of the '{@link #getMaxRvAng() <em>Max Rv Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRvAng()
	 * @generated
	 * @ordered
	 */
	protected ASG maxRvAng;

	/**
	 * The cached value of the '{@link #getBlkValA() <em>Blk Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkValA()
	 * @generated
	 * @ordered
	 */
	protected ASG blkValA;

	/**
	 * The cached value of the '{@link #getBlkValV() <em>Blk Val V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkValV()
	 * @generated
	 * @ordered
	 */
	protected ASG blkValV;

	/**
	 * The cached value of the '{@link #getPolQty() <em>Pol Qty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolQty()
	 * @generated
	 * @ordered
	 */
	protected ING polQty;

	/**
	 * The cached value of the '{@link #getMinPPV() <em>Min PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPPV()
	 * @generated
	 * @ordered
	 */
	protected ASG minPPV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDIRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RDIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD getDir() {
		if (dir != null && dir.eIsProxy()) {
			InternalEObject oldDir = (InternalEObject)dir;
			dir = (ACD)eResolveProxy(oldDir);
			if (dir != oldDir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__DIR, oldDir, dir));
			}
		}
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD basicGetDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(ACD newDir) {
		ACD oldDir = dir;
		dir = newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__DIR, oldDir, dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getChrAng() {
		if (chrAng != null && chrAng.eIsProxy()) {
			InternalEObject oldChrAng = (InternalEObject)chrAng;
			chrAng = (ASG)eResolveProxy(oldChrAng);
			if (chrAng != oldChrAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__CHR_ANG, oldChrAng, chrAng));
			}
		}
		return chrAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetChrAng() {
		return chrAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChrAng(ASG newChrAng) {
		ASG oldChrAng = chrAng;
		chrAng = newChrAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__CHR_ANG, oldChrAng, chrAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getMinFwdAng() {
		if (minFwdAng != null && minFwdAng.eIsProxy()) {
			InternalEObject oldMinFwdAng = (InternalEObject)minFwdAng;
			minFwdAng = (ASG)eResolveProxy(oldMinFwdAng);
			if (minFwdAng != oldMinFwdAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__MIN_FWD_ANG, oldMinFwdAng, minFwdAng));
			}
		}
		return minFwdAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetMinFwdAng() {
		return minFwdAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinFwdAng(ASG newMinFwdAng) {
		ASG oldMinFwdAng = minFwdAng;
		minFwdAng = newMinFwdAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__MIN_FWD_ANG, oldMinFwdAng, minFwdAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getMinRvAng() {
		if (minRvAng != null && minRvAng.eIsProxy()) {
			InternalEObject oldMinRvAng = (InternalEObject)minRvAng;
			minRvAng = (ASG)eResolveProxy(oldMinRvAng);
			if (minRvAng != oldMinRvAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__MIN_RV_ANG, oldMinRvAng, minRvAng));
			}
		}
		return minRvAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetMinRvAng() {
		return minRvAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRvAng(ASG newMinRvAng) {
		ASG oldMinRvAng = minRvAng;
		minRvAng = newMinRvAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__MIN_RV_ANG, oldMinRvAng, minRvAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getMaxFwdAng() {
		if (maxFwdAng != null && maxFwdAng.eIsProxy()) {
			InternalEObject oldMaxFwdAng = (InternalEObject)maxFwdAng;
			maxFwdAng = (ASG)eResolveProxy(oldMaxFwdAng);
			if (maxFwdAng != oldMaxFwdAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__MAX_FWD_ANG, oldMaxFwdAng, maxFwdAng));
			}
		}
		return maxFwdAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetMaxFwdAng() {
		return maxFwdAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFwdAng(ASG newMaxFwdAng) {
		ASG oldMaxFwdAng = maxFwdAng;
		maxFwdAng = newMaxFwdAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__MAX_FWD_ANG, oldMaxFwdAng, maxFwdAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getMaxRvAng() {
		if (maxRvAng != null && maxRvAng.eIsProxy()) {
			InternalEObject oldMaxRvAng = (InternalEObject)maxRvAng;
			maxRvAng = (ASG)eResolveProxy(oldMaxRvAng);
			if (maxRvAng != oldMaxRvAng) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__MAX_RV_ANG, oldMaxRvAng, maxRvAng));
			}
		}
		return maxRvAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetMaxRvAng() {
		return maxRvAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRvAng(ASG newMaxRvAng) {
		ASG oldMaxRvAng = maxRvAng;
		maxRvAng = newMaxRvAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__MAX_RV_ANG, oldMaxRvAng, maxRvAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkValA() {
		if (blkValA != null && blkValA.eIsProxy()) {
			InternalEObject oldBlkValA = (InternalEObject)blkValA;
			blkValA = (ASG)eResolveProxy(oldBlkValA);
			if (blkValA != oldBlkValA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__BLK_VAL_A, oldBlkValA, blkValA));
			}
		}
		return blkValA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkValA() {
		return blkValA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkValA(ASG newBlkValA) {
		ASG oldBlkValA = blkValA;
		blkValA = newBlkValA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__BLK_VAL_A, oldBlkValA, blkValA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkValV() {
		if (blkValV != null && blkValV.eIsProxy()) {
			InternalEObject oldBlkValV = (InternalEObject)blkValV;
			blkValV = (ASG)eResolveProxy(oldBlkValV);
			if (blkValV != oldBlkValV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__BLK_VAL_V, oldBlkValV, blkValV));
			}
		}
		return blkValV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkValV() {
		return blkValV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkValV(ASG newBlkValV) {
		ASG oldBlkValV = blkValV;
		blkValV = newBlkValV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__BLK_VAL_V, oldBlkValV, blkValV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPolQty() {
		if (polQty != null && polQty.eIsProxy()) {
			InternalEObject oldPolQty = (InternalEObject)polQty;
			polQty = (ING)eResolveProxy(oldPolQty);
			if (polQty != oldPolQty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__POL_QTY, oldPolQty, polQty));
			}
		}
		return polQty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPolQty() {
		return polQty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolQty(ING newPolQty) {
		ING oldPolQty = polQty;
		polQty = newPolQty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__POL_QTY, oldPolQty, polQty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getMinPPV() {
		if (minPPV != null && minPPV.eIsProxy()) {
			InternalEObject oldMinPPV = (InternalEObject)minPPV;
			minPPV = (ASG)eResolveProxy(oldMinPPV);
			if (minPPV != oldMinPPV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDIR__MIN_PPV, oldMinPPV, minPPV));
			}
		}
		return minPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetMinPPV() {
		return minPPV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPPV(ASG newMinPPV) {
		ASG oldMinPPV = minPPV;
		minPPV = newMinPPV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDIR__MIN_PPV, oldMinPPV, minPPV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RDIR__DIR:
				if (resolve) return getDir();
				return basicGetDir();
			case LNGroupRPackage.RDIR__CHR_ANG:
				if (resolve) return getChrAng();
				return basicGetChrAng();
			case LNGroupRPackage.RDIR__MIN_FWD_ANG:
				if (resolve) return getMinFwdAng();
				return basicGetMinFwdAng();
			case LNGroupRPackage.RDIR__MIN_RV_ANG:
				if (resolve) return getMinRvAng();
				return basicGetMinRvAng();
			case LNGroupRPackage.RDIR__MAX_FWD_ANG:
				if (resolve) return getMaxFwdAng();
				return basicGetMaxFwdAng();
			case LNGroupRPackage.RDIR__MAX_RV_ANG:
				if (resolve) return getMaxRvAng();
				return basicGetMaxRvAng();
			case LNGroupRPackage.RDIR__BLK_VAL_A:
				if (resolve) return getBlkValA();
				return basicGetBlkValA();
			case LNGroupRPackage.RDIR__BLK_VAL_V:
				if (resolve) return getBlkValV();
				return basicGetBlkValV();
			case LNGroupRPackage.RDIR__POL_QTY:
				if (resolve) return getPolQty();
				return basicGetPolQty();
			case LNGroupRPackage.RDIR__MIN_PPV:
				if (resolve) return getMinPPV();
				return basicGetMinPPV();
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
			case LNGroupRPackage.RDIR__DIR:
				setDir((ACD)newValue);
				return;
			case LNGroupRPackage.RDIR__CHR_ANG:
				setChrAng((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__MIN_FWD_ANG:
				setMinFwdAng((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__MIN_RV_ANG:
				setMinRvAng((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__MAX_FWD_ANG:
				setMaxFwdAng((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__MAX_RV_ANG:
				setMaxRvAng((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__BLK_VAL_A:
				setBlkValA((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__BLK_VAL_V:
				setBlkValV((ASG)newValue);
				return;
			case LNGroupRPackage.RDIR__POL_QTY:
				setPolQty((ING)newValue);
				return;
			case LNGroupRPackage.RDIR__MIN_PPV:
				setMinPPV((ASG)newValue);
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
			case LNGroupRPackage.RDIR__DIR:
				setDir((ACD)null);
				return;
			case LNGroupRPackage.RDIR__CHR_ANG:
				setChrAng((ASG)null);
				return;
			case LNGroupRPackage.RDIR__MIN_FWD_ANG:
				setMinFwdAng((ASG)null);
				return;
			case LNGroupRPackage.RDIR__MIN_RV_ANG:
				setMinRvAng((ASG)null);
				return;
			case LNGroupRPackage.RDIR__MAX_FWD_ANG:
				setMaxFwdAng((ASG)null);
				return;
			case LNGroupRPackage.RDIR__MAX_RV_ANG:
				setMaxRvAng((ASG)null);
				return;
			case LNGroupRPackage.RDIR__BLK_VAL_A:
				setBlkValA((ASG)null);
				return;
			case LNGroupRPackage.RDIR__BLK_VAL_V:
				setBlkValV((ASG)null);
				return;
			case LNGroupRPackage.RDIR__POL_QTY:
				setPolQty((ING)null);
				return;
			case LNGroupRPackage.RDIR__MIN_PPV:
				setMinPPV((ASG)null);
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
			case LNGroupRPackage.RDIR__DIR:
				return dir != null;
			case LNGroupRPackage.RDIR__CHR_ANG:
				return chrAng != null;
			case LNGroupRPackage.RDIR__MIN_FWD_ANG:
				return minFwdAng != null;
			case LNGroupRPackage.RDIR__MIN_RV_ANG:
				return minRvAng != null;
			case LNGroupRPackage.RDIR__MAX_FWD_ANG:
				return maxFwdAng != null;
			case LNGroupRPackage.RDIR__MAX_RV_ANG:
				return maxRvAng != null;
			case LNGroupRPackage.RDIR__BLK_VAL_A:
				return blkValA != null;
			case LNGroupRPackage.RDIR__BLK_VAL_V:
				return blkValV != null;
			case LNGroupRPackage.RDIR__POL_QTY:
				return polQty != null;
			case LNGroupRPackage.RDIR__MIN_PPV:
				return minPPV != null;
		}
		return super.eIsSet(featureID);
	}

} //RDIRImpl
