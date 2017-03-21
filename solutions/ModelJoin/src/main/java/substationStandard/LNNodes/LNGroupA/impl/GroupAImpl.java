/**
 */
package substationStandard.LNNodes.LNGroupA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl;

import substationStandard.LNNodes.LNGroupA.GroupA;
import substationStandard.LNNodes.LNGroupA.LNGroupAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.GroupAImpl#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.GroupAImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupA.impl.GroupAImpl#getAuto <em>Auto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupAImpl extends DomainLNImpl implements GroupA {
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
	 * The cached value of the '{@link #getAuto() <em>Auto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuto()
	 * @generated
	 * @ordered
	 */
	protected SPS auto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupAPackage.Literals.GROUP_A;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.GROUP_A__LOC, oldLoc, loc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.GROUP_A__LOC, oldLoc, loc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.GROUP_A__OP_CNT_RS, oldOpCntRs, opCntRs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.GROUP_A__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getAuto() {
		if (auto != null && auto.eIsProxy()) {
			InternalEObject oldAuto = (InternalEObject)auto;
			auto = (SPS)eResolveProxy(oldAuto);
			if (auto != oldAuto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.GROUP_A__AUTO, oldAuto, auto));
			}
		}
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetAuto() {
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto(SPS newAuto) {
		SPS oldAuto = auto;
		auto = newAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.GROUP_A__AUTO, oldAuto, auto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupAPackage.GROUP_A__LOC:
				if (resolve) return getLoc();
				return basicGetLoc();
			case LNGroupAPackage.GROUP_A__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupAPackage.GROUP_A__AUTO:
				if (resolve) return getAuto();
				return basicGetAuto();
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
			case LNGroupAPackage.GROUP_A__LOC:
				setLoc((SPS)newValue);
				return;
			case LNGroupAPackage.GROUP_A__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupAPackage.GROUP_A__AUTO:
				setAuto((SPS)newValue);
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
			case LNGroupAPackage.GROUP_A__LOC:
				setLoc((SPS)null);
				return;
			case LNGroupAPackage.GROUP_A__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupAPackage.GROUP_A__AUTO:
				setAuto((SPS)null);
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
			case LNGroupAPackage.GROUP_A__LOC:
				return loc != null;
			case LNGroupAPackage.GROUP_A__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupAPackage.GROUP_A__AUTO:
				return auto != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupAImpl
