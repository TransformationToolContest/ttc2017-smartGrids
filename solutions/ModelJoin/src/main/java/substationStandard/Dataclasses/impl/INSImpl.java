/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.Quality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.INSImpl#getStVal <em>St Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INSImpl#getQ <em>Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INSImpl#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INSImpl#getSubVal <em>Sub Val</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INSImpl#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.INSImpl#getSubID <em>Sub ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INSImpl extends MinimalEObjectImpl.Container implements INS {
	/**
	 * The default value of the '{@link #getStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStVal()
	 * @generated
	 * @ordered
	 */
	protected static final int ST_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStVal()
	 * @generated
	 * @ordered
	 */
	protected int stVal = ST_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Quality q;

	/**
	 * The default value of the '{@link #isSubEna() <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubEna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUB_ENA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubEna() <em>Sub Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubEna()
	 * @generated
	 * @ordered
	 */
	protected boolean subEna = SUB_ENA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVal()
	 * @generated
	 * @ordered
	 */
	protected static final int SUB_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVal()
	 * @generated
	 * @ordered
	 */
	protected int subVal = SUB_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubQ() <em>Sub Q</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubQ()
	 * @generated
	 * @ordered
	 */
	protected Quality subQ;

	/**
	 * The default value of the '{@link #getSubID() <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubID() <em>Sub ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubID()
	 * @generated
	 * @ordered
	 */
	protected String subID = SUB_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.INS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStVal() {
		return stVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStVal(int newStVal) {
		int oldStVal = stVal;
		stVal = newStVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INS__ST_VAL, oldStVal, stVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality getQ() {
		if (q != null && q.eIsProxy()) {
			InternalEObject oldQ = (InternalEObject)q;
			q = (Quality)eResolveProxy(oldQ);
			if (q != oldQ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.INS__Q, oldQ, q));
			}
		}
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality basicGetQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(Quality newQ) {
		Quality oldQ = q;
		q = newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INS__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubEna() {
		return subEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubEna(boolean newSubEna) {
		boolean oldSubEna = subEna;
		subEna = newSubEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INS__SUB_ENA, oldSubEna, subEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubVal() {
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubVal(int newSubVal) {
		int oldSubVal = subVal;
		subVal = newSubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INS__SUB_VAL, oldSubVal, subVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality getSubQ() {
		if (subQ != null && subQ.eIsProxy()) {
			InternalEObject oldSubQ = (InternalEObject)subQ;
			subQ = (Quality)eResolveProxy(oldSubQ);
			if (subQ != oldSubQ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.INS__SUB_Q, oldSubQ, subQ));
			}
		}
		return subQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality basicGetSubQ() {
		return subQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubQ(Quality newSubQ) {
		Quality oldSubQ = subQ;
		subQ = newSubQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INS__SUB_Q, oldSubQ, subQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubID() {
		return subID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubID(String newSubID) {
		String oldSubID = subID;
		subID = newSubID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.INS__SUB_ID, oldSubID, subID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.INS__ST_VAL:
				return getStVal();
			case DataclassesPackage.INS__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.INS__SUB_ENA:
				return isSubEna();
			case DataclassesPackage.INS__SUB_VAL:
				return getSubVal();
			case DataclassesPackage.INS__SUB_Q:
				if (resolve) return getSubQ();
				return basicGetSubQ();
			case DataclassesPackage.INS__SUB_ID:
				return getSubID();
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
			case DataclassesPackage.INS__ST_VAL:
				setStVal((Integer)newValue);
				return;
			case DataclassesPackage.INS__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.INS__SUB_ENA:
				setSubEna((Boolean)newValue);
				return;
			case DataclassesPackage.INS__SUB_VAL:
				setSubVal((Integer)newValue);
				return;
			case DataclassesPackage.INS__SUB_Q:
				setSubQ((Quality)newValue);
				return;
			case DataclassesPackage.INS__SUB_ID:
				setSubID((String)newValue);
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
			case DataclassesPackage.INS__ST_VAL:
				setStVal(ST_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INS__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.INS__SUB_ENA:
				setSubEna(SUB_ENA_EDEFAULT);
				return;
			case DataclassesPackage.INS__SUB_VAL:
				setSubVal(SUB_VAL_EDEFAULT);
				return;
			case DataclassesPackage.INS__SUB_Q:
				setSubQ((Quality)null);
				return;
			case DataclassesPackage.INS__SUB_ID:
				setSubID(SUB_ID_EDEFAULT);
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
			case DataclassesPackage.INS__ST_VAL:
				return stVal != ST_VAL_EDEFAULT;
			case DataclassesPackage.INS__Q:
				return q != null;
			case DataclassesPackage.INS__SUB_ENA:
				return subEna != SUB_ENA_EDEFAULT;
			case DataclassesPackage.INS__SUB_VAL:
				return subVal != SUB_VAL_EDEFAULT;
			case DataclassesPackage.INS__SUB_Q:
				return subQ != null;
			case DataclassesPackage.INS__SUB_ID:
				return SUB_ID_EDEFAULT == null ? subID != null : !SUB_ID_EDEFAULT.equals(subID);
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
		result.append(" (stVal: ");
		result.append(stVal);
		result.append(", subEna: ");
		result.append(subEna);
		result.append(", subVal: ");
		result.append(subVal);
		result.append(", subID: ");
		result.append(subID);
		result.append(')');
		return result.toString();
	}

} //INSImpl
