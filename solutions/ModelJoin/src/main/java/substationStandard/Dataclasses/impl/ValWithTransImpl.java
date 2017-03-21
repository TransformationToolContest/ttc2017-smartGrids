/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.ValWithTrans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Val With Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.ValWithTransImpl#getPosVal <em>Pos Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.ValWithTransImpl#isTransInd <em>Trans Ind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValWithTransImpl extends MinimalEObjectImpl.Container implements ValWithTrans {
	/**
	 * The default value of the '{@link #getPosVal() <em>Pos Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosVal()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosVal() <em>Pos Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosVal()
	 * @generated
	 * @ordered
	 */
	protected int posVal = POS_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransInd() <em>Trans Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransInd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANS_IND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransInd() <em>Trans Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransInd()
	 * @generated
	 * @ordered
	 */
	protected boolean transInd = TRANS_IND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValWithTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.VAL_WITH_TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosVal() {
		return posVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosVal(int newPosVal) {
		int oldPosVal = posVal;
		posVal = newPosVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.VAL_WITH_TRANS__POS_VAL, oldPosVal, posVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransInd() {
		return transInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransInd(boolean newTransInd) {
		boolean oldTransInd = transInd;
		transInd = newTransInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.VAL_WITH_TRANS__TRANS_IND, oldTransInd, transInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.VAL_WITH_TRANS__POS_VAL:
				return getPosVal();
			case DataclassesPackage.VAL_WITH_TRANS__TRANS_IND:
				return isTransInd();
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
			case DataclassesPackage.VAL_WITH_TRANS__POS_VAL:
				setPosVal((Integer)newValue);
				return;
			case DataclassesPackage.VAL_WITH_TRANS__TRANS_IND:
				setTransInd((Boolean)newValue);
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
			case DataclassesPackage.VAL_WITH_TRANS__POS_VAL:
				setPosVal(POS_VAL_EDEFAULT);
				return;
			case DataclassesPackage.VAL_WITH_TRANS__TRANS_IND:
				setTransInd(TRANS_IND_EDEFAULT);
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
			case DataclassesPackage.VAL_WITH_TRANS__POS_VAL:
				return posVal != POS_VAL_EDEFAULT;
			case DataclassesPackage.VAL_WITH_TRANS__TRANS_IND:
				return transInd != TRANS_IND_EDEFAULT;
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
		result.append(" (posVal: ");
		result.append(posVal);
		result.append(", transInd: ");
		result.append(transInd);
		result.append(')');
		return result.toString();
	}

} //ValWithTransImpl
