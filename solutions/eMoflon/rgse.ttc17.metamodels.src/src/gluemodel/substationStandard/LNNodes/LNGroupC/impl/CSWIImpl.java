/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC.impl;

import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.DPC;
import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupC.CSWI;
import gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSWI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getLoc <em>Loc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getPosA <em>Pos A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getPosB <em>Pos B</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getPosC <em>Pos C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getOpOpn <em>Op Opn</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl#getOpCls <em>Op Cls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSWIImpl extends GroupCImpl implements CSWI {
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
	 * The cached value of the '{@link #getOpCntRs() <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCntRs()
	 * @generated
	 * @ordered
	 */
	protected INC opCntRs;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected DPC pos;

	/**
	 * The cached value of the '{@link #getPosA() <em>Pos A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosA()
	 * @generated
	 * @ordered
	 */
	protected DPC posA;

	/**
	 * The cached value of the '{@link #getPosB() <em>Pos B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosB()
	 * @generated
	 * @ordered
	 */
	protected DPC posB;

	/**
	 * The cached value of the '{@link #getPosC() <em>Pos C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosC()
	 * @generated
	 * @ordered
	 */
	protected DPC posC;

	/**
	 * The cached value of the '{@link #getOpOpn() <em>Op Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpOpn()
	 * @generated
	 * @ordered
	 */
	protected ACT opOpn;

	/**
	 * The cached value of the '{@link #getOpCls() <em>Op Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCls()
	 * @generated
	 * @ordered
	 */
	protected ACT opCls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSWIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupCPackage.Literals.CSWI;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__LOC, oldLoc, loc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__LOC, oldLoc, loc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getOpCntRs() {
		if (opCntRs != null && opCntRs.eIsProxy()) {
			InternalEObject oldOpCntRs = (InternalEObject)opCntRs;
			opCntRs = (INC)eResolveProxy(oldOpCntRs);
			if (opCntRs != oldOpCntRs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__OP_CNT_RS, oldOpCntRs, opCntRs));
			}
		}
		return opCntRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetOpCntRs() {
		return opCntRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCntRs(INC newOpCntRs) {
		INC oldOpCntRs = opCntRs;
		opCntRs = newOpCntRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getPos() {
		if (pos != null && pos.eIsProxy()) {
			InternalEObject oldPos = (InternalEObject)pos;
			pos = (DPC)eResolveProxy(oldPos);
			if (pos != oldPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__POS, oldPos, pos));
			}
		}
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(DPC newPos) {
		DPC oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getPosA() {
		if (posA != null && posA.eIsProxy()) {
			InternalEObject oldPosA = (InternalEObject)posA;
			posA = (DPC)eResolveProxy(oldPosA);
			if (posA != oldPosA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__POS_A, oldPosA, posA));
			}
		}
		return posA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetPosA() {
		return posA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosA(DPC newPosA) {
		DPC oldPosA = posA;
		posA = newPosA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__POS_A, oldPosA, posA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getPosB() {
		if (posB != null && posB.eIsProxy()) {
			InternalEObject oldPosB = (InternalEObject)posB;
			posB = (DPC)eResolveProxy(oldPosB);
			if (posB != oldPosB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__POS_B, oldPosB, posB));
			}
		}
		return posB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetPosB() {
		return posB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosB(DPC newPosB) {
		DPC oldPosB = posB;
		posB = newPosB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__POS_B, oldPosB, posB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getPosC() {
		if (posC != null && posC.eIsProxy()) {
			InternalEObject oldPosC = (InternalEObject)posC;
			posC = (DPC)eResolveProxy(oldPosC);
			if (posC != oldPosC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__POS_C, oldPosC, posC));
			}
		}
		return posC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetPosC() {
		return posC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosC(DPC newPosC) {
		DPC oldPosC = posC;
		posC = newPosC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__POS_C, oldPosC, posC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOpOpn() {
		if (opOpn != null && opOpn.eIsProxy()) {
			InternalEObject oldOpOpn = (InternalEObject)opOpn;
			opOpn = (ACT)eResolveProxy(oldOpOpn);
			if (opOpn != oldOpOpn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__OP_OPN, oldOpOpn, opOpn));
			}
		}
		return opOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOpOpn() {
		return opOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpOpn(ACT newOpOpn) {
		ACT oldOpOpn = opOpn;
		opOpn = newOpOpn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__OP_OPN, oldOpOpn, opOpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOpCls() {
		if (opCls != null && opCls.eIsProxy()) {
			InternalEObject oldOpCls = (InternalEObject)opCls;
			opCls = (ACT)eResolveProxy(oldOpCls);
			if (opCls != oldOpCls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupCPackage.CSWI__OP_CLS, oldOpCls, opCls));
			}
		}
		return opCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOpCls() {
		return opCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCls(ACT newOpCls) {
		ACT oldOpCls = opCls;
		opCls = newOpCls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupCPackage.CSWI__OP_CLS, oldOpCls, opCls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupCPackage.CSWI__LOC:
				if (resolve) return getLoc();
				return basicGetLoc();
			case LNGroupCPackage.CSWI__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupCPackage.CSWI__POS:
				if (resolve) return getPos();
				return basicGetPos();
			case LNGroupCPackage.CSWI__POS_A:
				if (resolve) return getPosA();
				return basicGetPosA();
			case LNGroupCPackage.CSWI__POS_B:
				if (resolve) return getPosB();
				return basicGetPosB();
			case LNGroupCPackage.CSWI__POS_C:
				if (resolve) return getPosC();
				return basicGetPosC();
			case LNGroupCPackage.CSWI__OP_OPN:
				if (resolve) return getOpOpn();
				return basicGetOpOpn();
			case LNGroupCPackage.CSWI__OP_CLS:
				if (resolve) return getOpCls();
				return basicGetOpCls();
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
			case LNGroupCPackage.CSWI__LOC:
				setLoc((SPS)newValue);
				return;
			case LNGroupCPackage.CSWI__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupCPackage.CSWI__POS:
				setPos((DPC)newValue);
				return;
			case LNGroupCPackage.CSWI__POS_A:
				setPosA((DPC)newValue);
				return;
			case LNGroupCPackage.CSWI__POS_B:
				setPosB((DPC)newValue);
				return;
			case LNGroupCPackage.CSWI__POS_C:
				setPosC((DPC)newValue);
				return;
			case LNGroupCPackage.CSWI__OP_OPN:
				setOpOpn((ACT)newValue);
				return;
			case LNGroupCPackage.CSWI__OP_CLS:
				setOpCls((ACT)newValue);
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
			case LNGroupCPackage.CSWI__LOC:
				setLoc((SPS)null);
				return;
			case LNGroupCPackage.CSWI__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupCPackage.CSWI__POS:
				setPos((DPC)null);
				return;
			case LNGroupCPackage.CSWI__POS_A:
				setPosA((DPC)null);
				return;
			case LNGroupCPackage.CSWI__POS_B:
				setPosB((DPC)null);
				return;
			case LNGroupCPackage.CSWI__POS_C:
				setPosC((DPC)null);
				return;
			case LNGroupCPackage.CSWI__OP_OPN:
				setOpOpn((ACT)null);
				return;
			case LNGroupCPackage.CSWI__OP_CLS:
				setOpCls((ACT)null);
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
			case LNGroupCPackage.CSWI__LOC:
				return loc != null;
			case LNGroupCPackage.CSWI__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupCPackage.CSWI__POS:
				return pos != null;
			case LNGroupCPackage.CSWI__POS_A:
				return posA != null;
			case LNGroupCPackage.CSWI__POS_B:
				return posB != null;
			case LNGroupCPackage.CSWI__POS_C:
				return posC != null;
			case LNGroupCPackage.CSWI__OP_OPN:
				return opOpn != null;
			case LNGroupCPackage.CSWI__OP_CLS:
				return opCls != null;
		}
		return super.eIsSet(featureID);
	}

} //CSWIImpl
