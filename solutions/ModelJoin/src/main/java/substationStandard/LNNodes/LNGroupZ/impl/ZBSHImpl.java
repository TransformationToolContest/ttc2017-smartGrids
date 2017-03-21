/**
 */
package substationStandard.LNNodes.LNGroupZ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.MV;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;
import substationStandard.LNNodes.LNGroupZ.ZBSH;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBSH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getReact <em>React</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getLosFact <em>Los Fact</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getVol <em>Vol</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getRefReact <em>Ref React</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getRefPF <em>Ref PF</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl#getRefV <em>Ref V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBSHImpl extends GroupZImpl implements ZBSH {
	/**
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected INS opTmh;

	/**
	 * The cached value of the '{@link #getReact() <em>React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReact()
	 * @generated
	 * @ordered
	 */
	protected MV react;

	/**
	 * The cached value of the '{@link #getLosFact() <em>Los Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosFact()
	 * @generated
	 * @ordered
	 */
	protected MV losFact;

	/**
	 * The cached value of the '{@link #getVol() <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVol()
	 * @generated
	 * @ordered
	 */
	protected MV vol;

	/**
	 * The cached value of the '{@link #getRefReact() <em>Ref React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefReact()
	 * @generated
	 * @ordered
	 */
	protected ASG refReact;

	/**
	 * The cached value of the '{@link #getRefPF() <em>Ref PF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPF()
	 * @generated
	 * @ordered
	 */
	protected ASG refPF;

	/**
	 * The cached value of the '{@link #getRefV() <em>Ref V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefV()
	 * @generated
	 * @ordered
	 */
	protected ASG refV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBSHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupZPackage.Literals.ZBSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpTmh() {
		if (opTmh != null && opTmh.eIsProxy()) {
			InternalEObject oldOpTmh = (InternalEObject)opTmh;
			opTmh = (INS)eResolveProxy(oldOpTmh);
			if (opTmh != oldOpTmh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__OP_TMH, oldOpTmh, opTmh));
			}
		}
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpTmh() {
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTmh(INS newOpTmh) {
		INS oldOpTmh = opTmh;
		opTmh = newOpTmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getReact() {
		if (react != null && react.eIsProxy()) {
			InternalEObject oldReact = (InternalEObject)react;
			react = (MV)eResolveProxy(oldReact);
			if (react != oldReact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__REACT, oldReact, react));
			}
		}
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetReact() {
		return react;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReact(MV newReact) {
		MV oldReact = react;
		react = newReact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__REACT, oldReact, react));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getLosFact() {
		if (losFact != null && losFact.eIsProxy()) {
			InternalEObject oldLosFact = (InternalEObject)losFact;
			losFact = (MV)eResolveProxy(oldLosFact);
			if (losFact != oldLosFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__LOS_FACT, oldLosFact, losFact));
			}
		}
		return losFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetLosFact() {
		return losFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosFact(MV newLosFact) {
		MV oldLosFact = losFact;
		losFact = newLosFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__LOS_FACT, oldLosFact, losFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getVol() {
		if (vol != null && vol.eIsProxy()) {
			InternalEObject oldVol = (InternalEObject)vol;
			vol = (MV)eResolveProxy(oldVol);
			if (vol != oldVol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__VOL, oldVol, vol));
			}
		}
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetVol() {
		return vol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVol(MV newVol) {
		MV oldVol = vol;
		vol = newVol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__VOL, oldVol, vol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRefReact() {
		if (refReact != null && refReact.eIsProxy()) {
			InternalEObject oldRefReact = (InternalEObject)refReact;
			refReact = (ASG)eResolveProxy(oldRefReact);
			if (refReact != oldRefReact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__REF_REACT, oldRefReact, refReact));
			}
		}
		return refReact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRefReact() {
		return refReact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefReact(ASG newRefReact) {
		ASG oldRefReact = refReact;
		refReact = newRefReact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__REF_REACT, oldRefReact, refReact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRefPF() {
		if (refPF != null && refPF.eIsProxy()) {
			InternalEObject oldRefPF = (InternalEObject)refPF;
			refPF = (ASG)eResolveProxy(oldRefPF);
			if (refPF != oldRefPF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__REF_PF, oldRefPF, refPF));
			}
		}
		return refPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRefPF() {
		return refPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefPF(ASG newRefPF) {
		ASG oldRefPF = refPF;
		refPF = newRefPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__REF_PF, oldRefPF, refPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRefV() {
		if (refV != null && refV.eIsProxy()) {
			InternalEObject oldRefV = (InternalEObject)refV;
			refV = (ASG)eResolveProxy(oldRefV);
			if (refV != oldRefV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupZPackage.ZBSH__REF_V, oldRefV, refV));
			}
		}
		return refV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRefV() {
		return refV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefV(ASG newRefV) {
		ASG oldRefV = refV;
		refV = newRefV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupZPackage.ZBSH__REF_V, oldRefV, refV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupZPackage.ZBSH__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupZPackage.ZBSH__REACT:
				if (resolve) return getReact();
				return basicGetReact();
			case LNGroupZPackage.ZBSH__LOS_FACT:
				if (resolve) return getLosFact();
				return basicGetLosFact();
			case LNGroupZPackage.ZBSH__VOL:
				if (resolve) return getVol();
				return basicGetVol();
			case LNGroupZPackage.ZBSH__REF_REACT:
				if (resolve) return getRefReact();
				return basicGetRefReact();
			case LNGroupZPackage.ZBSH__REF_PF:
				if (resolve) return getRefPF();
				return basicGetRefPF();
			case LNGroupZPackage.ZBSH__REF_V:
				if (resolve) return getRefV();
				return basicGetRefV();
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
			case LNGroupZPackage.ZBSH__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupZPackage.ZBSH__REACT:
				setReact((MV)newValue);
				return;
			case LNGroupZPackage.ZBSH__LOS_FACT:
				setLosFact((MV)newValue);
				return;
			case LNGroupZPackage.ZBSH__VOL:
				setVol((MV)newValue);
				return;
			case LNGroupZPackage.ZBSH__REF_REACT:
				setRefReact((ASG)newValue);
				return;
			case LNGroupZPackage.ZBSH__REF_PF:
				setRefPF((ASG)newValue);
				return;
			case LNGroupZPackage.ZBSH__REF_V:
				setRefV((ASG)newValue);
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
			case LNGroupZPackage.ZBSH__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupZPackage.ZBSH__REACT:
				setReact((MV)null);
				return;
			case LNGroupZPackage.ZBSH__LOS_FACT:
				setLosFact((MV)null);
				return;
			case LNGroupZPackage.ZBSH__VOL:
				setVol((MV)null);
				return;
			case LNGroupZPackage.ZBSH__REF_REACT:
				setRefReact((ASG)null);
				return;
			case LNGroupZPackage.ZBSH__REF_PF:
				setRefPF((ASG)null);
				return;
			case LNGroupZPackage.ZBSH__REF_V:
				setRefV((ASG)null);
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
			case LNGroupZPackage.ZBSH__OP_TMH:
				return opTmh != null;
			case LNGroupZPackage.ZBSH__REACT:
				return react != null;
			case LNGroupZPackage.ZBSH__LOS_FACT:
				return losFact != null;
			case LNGroupZPackage.ZBSH__VOL:
				return vol != null;
			case LNGroupZPackage.ZBSH__REF_REACT:
				return refReact != null;
			case LNGroupZPackage.ZBSH__REF_PF:
				return refPF != null;
			case LNGroupZPackage.ZBSH__REF_V:
				return refV != null;
		}
		return super.eIsSet(featureID);
	}

} //ZBSHImpl
