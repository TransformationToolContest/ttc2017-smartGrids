/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.BCR;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.TimeStamp;
import gluemodel.substationStandard.Dataclasses.Units;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getActVal <em>Act Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getFrVal <em>Fr Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getFrTm <em>Fr Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getPulsQty <em>Puls Qty</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#isFrEna <em>Fr Ena</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getStrTm <em>Str Tm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#getFrPd <em>Fr Pd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl#isFrRs <em>Fr Rs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BCRImpl extends MinimalEObjectImpl.Container implements BCR {
	/**
	 * The default value of the '{@link #getActVal() <em>Act Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActVal()
	 * @generated
	 * @ordered
	 */
	protected static final int ACT_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActVal() <em>Act Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActVal()
	 * @generated
	 * @ordered
	 */
	protected int actVal = ACT_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrVal() <em>Fr Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrVal()
	 * @generated
	 * @ordered
	 */
	protected static final int FR_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrVal() <em>Fr Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrVal()
	 * @generated
	 * @ordered
	 */
	protected int frVal = FR_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrTm() <em>Fr Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrTm()
	 * @generated
	 * @ordered
	 */
	protected TimeStamp frTm;

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
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected Units units;

	/**
	 * The default value of the '{@link #getPulsQty() <em>Puls Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulsQty()
	 * @generated
	 * @ordered
	 */
	protected static final float PULS_QTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPulsQty() <em>Puls Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulsQty()
	 * @generated
	 * @ordered
	 */
	protected float pulsQty = PULS_QTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFrEna() <em>Fr Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrEna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FR_ENA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFrEna() <em>Fr Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrEna()
	 * @generated
	 * @ordered
	 */
	protected boolean frEna = FR_ENA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStrTm() <em>Str Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrTm()
	 * @generated
	 * @ordered
	 */
	protected TimeStamp strTm;

	/**
	 * The default value of the '{@link #getFrPd() <em>Fr Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrPd()
	 * @generated
	 * @ordered
	 */
	protected static final int FR_PD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrPd() <em>Fr Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrPd()
	 * @generated
	 * @ordered
	 */
	protected int frPd = FR_PD_EDEFAULT;

	/**
	 * The default value of the '{@link #isFrRs() <em>Fr Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrRs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FR_RS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFrRs() <em>Fr Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrRs()
	 * @generated
	 * @ordered
	 */
	protected boolean frRs = FR_RS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.BCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActVal() {
		return actVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActVal(int newActVal) {
		int oldActVal = actVal;
		actVal = newActVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__ACT_VAL, oldActVal, actVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrVal() {
		return frVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrVal(int newFrVal) {
		int oldFrVal = frVal;
		frVal = newFrVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__FR_VAL, oldFrVal, frVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp getFrTm() {
		if (frTm != null && frTm.eIsProxy()) {
			InternalEObject oldFrTm = (InternalEObject)frTm;
			frTm = (TimeStamp)eResolveProxy(oldFrTm);
			if (frTm != oldFrTm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.BCR__FR_TM, oldFrTm, frTm));
			}
		}
		return frTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp basicGetFrTm() {
		return frTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrTm(TimeStamp newFrTm) {
		TimeStamp oldFrTm = frTm;
		frTm = newFrTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__FR_TM, oldFrTm, frTm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.BCR__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getUnits() {
		if (units != null && units.eIsProxy()) {
			InternalEObject oldUnits = (InternalEObject)units;
			units = (Units)eResolveProxy(oldUnits);
			if (units != oldUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.BCR__UNITS, oldUnits, units));
			}
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units basicGetUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(Units newUnits) {
		Units oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPulsQty() {
		return pulsQty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPulsQty(float newPulsQty) {
		float oldPulsQty = pulsQty;
		pulsQty = newPulsQty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__PULS_QTY, oldPulsQty, pulsQty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrEna() {
		return frEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrEna(boolean newFrEna) {
		boolean oldFrEna = frEna;
		frEna = newFrEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__FR_ENA, oldFrEna, frEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp getStrTm() {
		if (strTm != null && strTm.eIsProxy()) {
			InternalEObject oldStrTm = (InternalEObject)strTm;
			strTm = (TimeStamp)eResolveProxy(oldStrTm);
			if (strTm != oldStrTm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.BCR__STR_TM, oldStrTm, strTm));
			}
		}
		return strTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp basicGetStrTm() {
		return strTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrTm(TimeStamp newStrTm) {
		TimeStamp oldStrTm = strTm;
		strTm = newStrTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__STR_TM, oldStrTm, strTm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrPd() {
		return frPd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrPd(int newFrPd) {
		int oldFrPd = frPd;
		frPd = newFrPd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__FR_PD, oldFrPd, frPd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrRs() {
		return frRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrRs(boolean newFrRs) {
		boolean oldFrRs = frRs;
		frRs = newFrRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.BCR__FR_RS, oldFrRs, frRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.BCR__ACT_VAL:
				return getActVal();
			case DataclassesPackage.BCR__FR_VAL:
				return getFrVal();
			case DataclassesPackage.BCR__FR_TM:
				if (resolve) return getFrTm();
				return basicGetFrTm();
			case DataclassesPackage.BCR__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.BCR__UNITS:
				if (resolve) return getUnits();
				return basicGetUnits();
			case DataclassesPackage.BCR__PULS_QTY:
				return getPulsQty();
			case DataclassesPackage.BCR__FR_ENA:
				return isFrEna();
			case DataclassesPackage.BCR__STR_TM:
				if (resolve) return getStrTm();
				return basicGetStrTm();
			case DataclassesPackage.BCR__FR_PD:
				return getFrPd();
			case DataclassesPackage.BCR__FR_RS:
				return isFrRs();
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
			case DataclassesPackage.BCR__ACT_VAL:
				setActVal((Integer)newValue);
				return;
			case DataclassesPackage.BCR__FR_VAL:
				setFrVal((Integer)newValue);
				return;
			case DataclassesPackage.BCR__FR_TM:
				setFrTm((TimeStamp)newValue);
				return;
			case DataclassesPackage.BCR__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.BCR__UNITS:
				setUnits((Units)newValue);
				return;
			case DataclassesPackage.BCR__PULS_QTY:
				setPulsQty((Float)newValue);
				return;
			case DataclassesPackage.BCR__FR_ENA:
				setFrEna((Boolean)newValue);
				return;
			case DataclassesPackage.BCR__STR_TM:
				setStrTm((TimeStamp)newValue);
				return;
			case DataclassesPackage.BCR__FR_PD:
				setFrPd((Integer)newValue);
				return;
			case DataclassesPackage.BCR__FR_RS:
				setFrRs((Boolean)newValue);
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
			case DataclassesPackage.BCR__ACT_VAL:
				setActVal(ACT_VAL_EDEFAULT);
				return;
			case DataclassesPackage.BCR__FR_VAL:
				setFrVal(FR_VAL_EDEFAULT);
				return;
			case DataclassesPackage.BCR__FR_TM:
				setFrTm((TimeStamp)null);
				return;
			case DataclassesPackage.BCR__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.BCR__UNITS:
				setUnits((Units)null);
				return;
			case DataclassesPackage.BCR__PULS_QTY:
				setPulsQty(PULS_QTY_EDEFAULT);
				return;
			case DataclassesPackage.BCR__FR_ENA:
				setFrEna(FR_ENA_EDEFAULT);
				return;
			case DataclassesPackage.BCR__STR_TM:
				setStrTm((TimeStamp)null);
				return;
			case DataclassesPackage.BCR__FR_PD:
				setFrPd(FR_PD_EDEFAULT);
				return;
			case DataclassesPackage.BCR__FR_RS:
				setFrRs(FR_RS_EDEFAULT);
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
			case DataclassesPackage.BCR__ACT_VAL:
				return actVal != ACT_VAL_EDEFAULT;
			case DataclassesPackage.BCR__FR_VAL:
				return frVal != FR_VAL_EDEFAULT;
			case DataclassesPackage.BCR__FR_TM:
				return frTm != null;
			case DataclassesPackage.BCR__Q:
				return q != null;
			case DataclassesPackage.BCR__UNITS:
				return units != null;
			case DataclassesPackage.BCR__PULS_QTY:
				return pulsQty != PULS_QTY_EDEFAULT;
			case DataclassesPackage.BCR__FR_ENA:
				return frEna != FR_ENA_EDEFAULT;
			case DataclassesPackage.BCR__STR_TM:
				return strTm != null;
			case DataclassesPackage.BCR__FR_PD:
				return frPd != FR_PD_EDEFAULT;
			case DataclassesPackage.BCR__FR_RS:
				return frRs != FR_RS_EDEFAULT;
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
		result.append(" (actVal: ");
		result.append(actVal);
		result.append(", frVal: ");
		result.append(frVal);
		result.append(", pulsQty: ");
		result.append(pulsQty);
		result.append(", frEna: ");
		result.append(frEna);
		result.append(", frPd: ");
		result.append(frPd);
		result.append(", frRs: ");
		result.append(frRs);
		result.append(')');
		return result.toString();
	}

} //BCRImpl
