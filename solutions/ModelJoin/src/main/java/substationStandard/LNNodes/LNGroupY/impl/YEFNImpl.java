/**
 */
package substationStandard.LNNodes.LNGroupY.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.APC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.ISC;
import substationStandard.Dataclasses.MV;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupY.LNGroupYPackage;
import substationStandard.LNNodes.LNGroupY.YEFN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YEFN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YEFNImpl#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YEFNImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YEFNImpl#getECA <em>ECA</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YEFNImpl#getColTapPos <em>Col Tap Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YEFNImpl#getColPos <em>Col Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YEFNImpl extends GroupYImpl implements YEFN {
	/**
	 * The cached value of the '{@link #getLoc() <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected SPS loc;

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
	 * The cached value of the '{@link #getECA() <em>ECA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECA()
	 * @generated
	 * @ordered
	 */
	protected MV eca;

	/**
	 * The cached value of the '{@link #getColTapPos() <em>Col Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColTapPos()
	 * @generated
	 * @ordered
	 */
	protected ISC colTapPos;

	/**
	 * The cached value of the '{@link #getColPos() <em>Col Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColPos()
	 * @generated
	 * @ordered
	 */
	protected APC colPos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YEFNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupYPackage.Literals.YEFN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLoc() {
		if (loc != null && loc.eIsProxy()) {
			InternalEObject oldLoc = (InternalEObject)loc;
			loc = (SPS)eResolveProxy(oldLoc);
			if (loc != oldLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YEFN__LOC, oldLoc, loc));
			}
		}
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLoc() {
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoc(SPS newLoc) {
		SPS oldLoc = loc;
		loc = newLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YEFN__LOC, oldLoc, loc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YEFN__OP_TMH, oldOpTmh, opTmh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YEFN__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getECA() {
		if (eca != null && eca.eIsProxy()) {
			InternalEObject oldECA = (InternalEObject)eca;
			eca = (MV)eResolveProxy(oldECA);
			if (eca != oldECA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YEFN__ECA, oldECA, eca));
			}
		}
		return eca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetECA() {
		return eca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECA(MV newECA) {
		MV oldECA = eca;
		eca = newECA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YEFN__ECA, oldECA, eca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC getColTapPos() {
		if (colTapPos != null && colTapPos.eIsProxy()) {
			InternalEObject oldColTapPos = (InternalEObject)colTapPos;
			colTapPos = (ISC)eResolveProxy(oldColTapPos);
			if (colTapPos != oldColTapPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YEFN__COL_TAP_POS, oldColTapPos, colTapPos));
			}
		}
		return colTapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC basicGetColTapPos() {
		return colTapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColTapPos(ISC newColTapPos) {
		ISC oldColTapPos = colTapPos;
		colTapPos = newColTapPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YEFN__COL_TAP_POS, oldColTapPos, colTapPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APC getColPos() {
		if (colPos != null && colPos.eIsProxy()) {
			InternalEObject oldColPos = (InternalEObject)colPos;
			colPos = (APC)eResolveProxy(oldColPos);
			if (colPos != oldColPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YEFN__COL_POS, oldColPos, colPos));
			}
		}
		return colPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APC basicGetColPos() {
		return colPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColPos(APC newColPos) {
		APC oldColPos = colPos;
		colPos = newColPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YEFN__COL_POS, oldColPos, colPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupYPackage.YEFN__LOC:
				if (resolve) return getLoc();
				return basicGetLoc();
			case LNGroupYPackage.YEFN__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupYPackage.YEFN__ECA:
				if (resolve) return getECA();
				return basicGetECA();
			case LNGroupYPackage.YEFN__COL_TAP_POS:
				if (resolve) return getColTapPos();
				return basicGetColTapPos();
			case LNGroupYPackage.YEFN__COL_POS:
				if (resolve) return getColPos();
				return basicGetColPos();
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
			case LNGroupYPackage.YEFN__LOC:
				setLoc((SPS)newValue);
				return;
			case LNGroupYPackage.YEFN__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupYPackage.YEFN__ECA:
				setECA((MV)newValue);
				return;
			case LNGroupYPackage.YEFN__COL_TAP_POS:
				setColTapPos((ISC)newValue);
				return;
			case LNGroupYPackage.YEFN__COL_POS:
				setColPos((APC)newValue);
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
			case LNGroupYPackage.YEFN__LOC:
				setLoc((SPS)null);
				return;
			case LNGroupYPackage.YEFN__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupYPackage.YEFN__ECA:
				setECA((MV)null);
				return;
			case LNGroupYPackage.YEFN__COL_TAP_POS:
				setColTapPos((ISC)null);
				return;
			case LNGroupYPackage.YEFN__COL_POS:
				setColPos((APC)null);
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
			case LNGroupYPackage.YEFN__LOC:
				return loc != null;
			case LNGroupYPackage.YEFN__OP_TMH:
				return opTmh != null;
			case LNGroupYPackage.YEFN__ECA:
				return eca != null;
			case LNGroupYPackage.YEFN__COL_TAP_POS:
				return colTapPos != null;
			case LNGroupYPackage.YEFN__COL_POS:
				return colPos != null;
		}
		return super.eIsSet(featureID);
	}

} //YEFNImpl
