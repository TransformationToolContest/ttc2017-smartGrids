/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupA.impl;

import gluemodel.substationStandard.Dataclasses.BSC;
import gluemodel.substationStandard.Dataclasses.SPC;

import gluemodel.substationStandard.LNNodes.LNGroupA.ANCR;
import gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ANCR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl#getRCol <em>RCol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl#getLCol <em>LCol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANCRImpl extends GroupAImpl implements ANCR {
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
	 * The cached value of the '{@link #getRCol() <em>RCol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCol()
	 * @generated
	 * @ordered
	 */
	protected SPC rCol;

	/**
	 * The cached value of the '{@link #getLCol() <em>LCol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCol()
	 * @generated
	 * @ordered
	 */
	protected SPC lCol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupAPackage.Literals.ANCR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ANCR__TAP_CHG, oldTapChg, tapChg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ANCR__TAP_CHG, oldTapChg, tapChg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getRCol() {
		if (rCol != null && rCol.eIsProxy()) {
			InternalEObject oldRCol = (InternalEObject)rCol;
			rCol = (SPC)eResolveProxy(oldRCol);
			if (rCol != oldRCol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ANCR__RCOL, oldRCol, rCol));
			}
		}
		return rCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetRCol() {
		return rCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCol(SPC newRCol) {
		SPC oldRCol = rCol;
		rCol = newRCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ANCR__RCOL, oldRCol, rCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getLCol() {
		if (lCol != null && lCol.eIsProxy()) {
			InternalEObject oldLCol = (InternalEObject)lCol;
			lCol = (SPC)eResolveProxy(oldLCol);
			if (lCol != oldLCol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupAPackage.ANCR__LCOL, oldLCol, lCol));
			}
		}
		return lCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetLCol() {
		return lCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCol(SPC newLCol) {
		SPC oldLCol = lCol;
		lCol = newLCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupAPackage.ANCR__LCOL, oldLCol, lCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupAPackage.ANCR__TAP_CHG:
				if (resolve) return getTapChg();
				return basicGetTapChg();
			case LNGroupAPackage.ANCR__RCOL:
				if (resolve) return getRCol();
				return basicGetRCol();
			case LNGroupAPackage.ANCR__LCOL:
				if (resolve) return getLCol();
				return basicGetLCol();
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
			case LNGroupAPackage.ANCR__TAP_CHG:
				setTapChg((BSC)newValue);
				return;
			case LNGroupAPackage.ANCR__RCOL:
				setRCol((SPC)newValue);
				return;
			case LNGroupAPackage.ANCR__LCOL:
				setLCol((SPC)newValue);
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
			case LNGroupAPackage.ANCR__TAP_CHG:
				setTapChg((BSC)null);
				return;
			case LNGroupAPackage.ANCR__RCOL:
				setRCol((SPC)null);
				return;
			case LNGroupAPackage.ANCR__LCOL:
				setLCol((SPC)null);
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
			case LNGroupAPackage.ANCR__TAP_CHG:
				return tapChg != null;
			case LNGroupAPackage.ANCR__RCOL:
				return rCol != null;
			case LNGroupAPackage.ANCR__LCOL:
				return lCol != null;
		}
		return super.eIsSet(featureID);
	}

} //ANCRImpl
