/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.Quality;
import gluemodel.substationStandard.Dataclasses.TimeStamp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#isGeneral <em>General</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#isPhsA <em>Phs A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#isPhsB <em>Phs B</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#isPhsC <em>Phs C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#isNeut <em>Neut</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl#getOperTm <em>Oper Tm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACTImpl extends MinimalEObjectImpl.Container implements ACT {
	/**
	 * The default value of the '{@link #isGeneral() <em>General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneral()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneral() <em>General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneral()
	 * @generated
	 * @ordered
	 */
	protected boolean general = GENERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPhsA() <em>Phs A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhsA()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHS_A_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPhsA() <em>Phs A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhsA()
	 * @generated
	 * @ordered
	 */
	protected boolean phsA = PHS_A_EDEFAULT;

	/**
	 * The default value of the '{@link #isPhsB() <em>Phs B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhsB()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHS_B_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPhsB() <em>Phs B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhsB()
	 * @generated
	 * @ordered
	 */
	protected boolean phsB = PHS_B_EDEFAULT;

	/**
	 * The default value of the '{@link #isPhsC() <em>Phs C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhsC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHS_C_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPhsC() <em>Phs C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhsC()
	 * @generated
	 * @ordered
	 */
	protected boolean phsC = PHS_C_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeut() <em>Neut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeut() <em>Neut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeut()
	 * @generated
	 * @ordered
	 */
	protected boolean neut = NEUT_EDEFAULT;

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
	 * The cached value of the '{@link #getOperTm() <em>Oper Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperTm()
	 * @generated
	 * @ordered
	 */
	protected TimeStamp operTm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(boolean newGeneral) {
		boolean oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhsA() {
		return phsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsA(boolean newPhsA) {
		boolean oldPhsA = phsA;
		phsA = newPhsA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__PHS_A, oldPhsA, phsA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhsB() {
		return phsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsB(boolean newPhsB) {
		boolean oldPhsB = phsB;
		phsB = newPhsB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__PHS_B, oldPhsB, phsB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPhsC() {
		return phsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhsC(boolean newPhsC) {
		boolean oldPhsC = phsC;
		phsC = newPhsC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__PHS_C, oldPhsC, phsC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeut() {
		return neut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeut(boolean newNeut) {
		boolean oldNeut = neut;
		neut = newNeut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__NEUT, oldNeut, neut));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACT__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp getOperTm() {
		if (operTm != null && operTm.eIsProxy()) {
			InternalEObject oldOperTm = (InternalEObject)operTm;
			operTm = (TimeStamp)eResolveProxy(oldOperTm);
			if (operTm != oldOperTm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACT__OPER_TM, oldOperTm, operTm));
			}
		}
		return operTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp basicGetOperTm() {
		return operTm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperTm(TimeStamp newOperTm) {
		TimeStamp oldOperTm = operTm;
		operTm = newOperTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACT__OPER_TM, oldOperTm, operTm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ACT__GENERAL:
				return isGeneral();
			case DataclassesPackage.ACT__PHS_A:
				return isPhsA();
			case DataclassesPackage.ACT__PHS_B:
				return isPhsB();
			case DataclassesPackage.ACT__PHS_C:
				return isPhsC();
			case DataclassesPackage.ACT__NEUT:
				return isNeut();
			case DataclassesPackage.ACT__Q:
				if (resolve) return getQ();
				return basicGetQ();
			case DataclassesPackage.ACT__OPER_TM:
				if (resolve) return getOperTm();
				return basicGetOperTm();
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
			case DataclassesPackage.ACT__GENERAL:
				setGeneral((Boolean)newValue);
				return;
			case DataclassesPackage.ACT__PHS_A:
				setPhsA((Boolean)newValue);
				return;
			case DataclassesPackage.ACT__PHS_B:
				setPhsB((Boolean)newValue);
				return;
			case DataclassesPackage.ACT__PHS_C:
				setPhsC((Boolean)newValue);
				return;
			case DataclassesPackage.ACT__NEUT:
				setNeut((Boolean)newValue);
				return;
			case DataclassesPackage.ACT__Q:
				setQ((Quality)newValue);
				return;
			case DataclassesPackage.ACT__OPER_TM:
				setOperTm((TimeStamp)newValue);
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
			case DataclassesPackage.ACT__GENERAL:
				setGeneral(GENERAL_EDEFAULT);
				return;
			case DataclassesPackage.ACT__PHS_A:
				setPhsA(PHS_A_EDEFAULT);
				return;
			case DataclassesPackage.ACT__PHS_B:
				setPhsB(PHS_B_EDEFAULT);
				return;
			case DataclassesPackage.ACT__PHS_C:
				setPhsC(PHS_C_EDEFAULT);
				return;
			case DataclassesPackage.ACT__NEUT:
				setNeut(NEUT_EDEFAULT);
				return;
			case DataclassesPackage.ACT__Q:
				setQ((Quality)null);
				return;
			case DataclassesPackage.ACT__OPER_TM:
				setOperTm((TimeStamp)null);
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
			case DataclassesPackage.ACT__GENERAL:
				return general != GENERAL_EDEFAULT;
			case DataclassesPackage.ACT__PHS_A:
				return phsA != PHS_A_EDEFAULT;
			case DataclassesPackage.ACT__PHS_B:
				return phsB != PHS_B_EDEFAULT;
			case DataclassesPackage.ACT__PHS_C:
				return phsC != PHS_C_EDEFAULT;
			case DataclassesPackage.ACT__NEUT:
				return neut != NEUT_EDEFAULT;
			case DataclassesPackage.ACT__Q:
				return q != null;
			case DataclassesPackage.ACT__OPER_TM:
				return operTm != null;
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
		result.append(" (general: ");
		result.append(general);
		result.append(", phsA: ");
		result.append(phsA);
		result.append(", phsB: ");
		result.append(phsB);
		result.append(", phsC: ");
		result.append(phsC);
		result.append(", neut: ");
		result.append(neut);
		result.append(')');
		return result.toString();
	}

} //ACTImpl
