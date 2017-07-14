/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.SPS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl#isStVal <em>St Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl#isSubEna <em>Sub Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl#isSubVal <em>Sub Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl#getSubQ <em>Sub Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl#getSubID <em>Sub ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPSImpl extends MinimalEObjectImpl.Container implements SPS {
	/**
	 * The default value of the '{@link #isStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ST_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStVal() <em>St Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStVal()
	 * @generated
	 * @ordered
	 */
	protected boolean stVal = ST_VAL_EDEFAULT;

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
	 * The default value of the '{@link #isSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubVal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUB_VAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubVal() <em>Sub Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubVal()
	 * @generated
	 * @ordered
	 */
	protected boolean subVal = SUB_VAL_EDEFAULT;

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
	protected SPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.SPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStVal() {
		return stVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStVal(boolean newStVal) {
		boolean oldStVal = stVal;
		stVal = newStVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPS__ST_VAL, oldStVal, stVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SPS__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPS__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPS__SUB_ENA, oldSubEna, subEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubVal() {
		return subVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubVal(boolean newSubVal) {
		boolean oldSubVal = subVal;
		subVal = newSubVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPS__SUB_VAL, oldSubVal, subVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.SPS__SUB_Q, oldSubQ, subQ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPS__SUB_Q, oldSubQ, subQ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.SPS__SUB_ID, oldSubID, subID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.SPS__ST_VAL:
				return isStVal();
			case DataclassesPackage.SPS__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.SPS__SUB_ENA:
				return isSubEna();
			case DataclassesPackage.SPS__SUB_VAL:
				return isSubVal();
			case DataclassesPackage.SPS__SUB_Q:
				if (resolve) return getSubQ();
				return basicGetSubQ();
			case DataclassesPackage.SPS__SUB_ID:
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
			case DataclassesPackage.SPS__ST_VAL:
				setStVal((Boolean)newValue);
				return;
			case DataclassesPackage.SPS__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.SPS__SUB_ENA:
				setSubEna((Boolean)newValue);
				return;
			case DataclassesPackage.SPS__SUB_VAL:
				setSubVal((Boolean)newValue);
				return;
			case DataclassesPackage.SPS__SUB_Q:
				setSubQ((Quality)newValue);
				return;
			case DataclassesPackage.SPS__SUB_ID:
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
			case DataclassesPackage.SPS__ST_VAL:
				setStVal(ST_VAL_EDEFAULT);
				return;
			case DataclassesPackage.SPS__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.SPS__SUB_ENA:
				setSubEna(SUB_ENA_EDEFAULT);
				return;
			case DataclassesPackage.SPS__SUB_VAL:
				setSubVal(SUB_VAL_EDEFAULT);
				return;
			case DataclassesPackage.SPS__SUB_Q:
				setSubQ((Quality)null);
				return;
			case DataclassesPackage.SPS__SUB_ID:
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
			case DataclassesPackage.SPS__ST_VAL:
				return stVal != ST_VAL_EDEFAULT;
			case DataclassesPackage.SPS__Q:
				return q != null;
			case DataclassesPackage.SPS__SUB_ENA:
				return subEna != SUB_ENA_EDEFAULT;
			case DataclassesPackage.SPS__SUB_VAL:
				return subVal != SUB_VAL_EDEFAULT;
			case DataclassesPackage.SPS__SUB_Q:
				return subQ != null;
			case DataclassesPackage.SPS__SUB_ID:
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

} //SPSImpl
