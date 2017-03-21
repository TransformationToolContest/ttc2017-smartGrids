/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.CURVE;
import substationStandard.Dataclasses.CurveChar;
import substationStandard.Dataclasses.DataclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CURVE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetCharact <em>Set Charact</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetParA <em>Set Par A</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetParB <em>Set Par B</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetParC <em>Set Par C</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetParD <em>Set Par D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetParE <em>Set Par E</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.CURVEImpl#getSetParF <em>Set Par F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CURVEImpl extends MinimalEObjectImpl.Container implements CURVE {
	/**
	 * The cached value of the '{@link #getSetCharact() <em>Set Charact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetCharact()
	 * @generated
	 * @ordered
	 */
	protected CurveChar setCharact;

	/**
	 * The default value of the '{@link #getSetParA() <em>Set Par A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParA()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PAR_A_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetParA() <em>Set Par A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParA()
	 * @generated
	 * @ordered
	 */
	protected float setParA = SET_PAR_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetParB() <em>Set Par B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParB()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PAR_B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetParB() <em>Set Par B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParB()
	 * @generated
	 * @ordered
	 */
	protected float setParB = SET_PAR_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetParC() <em>Set Par C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParC()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PAR_C_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetParC() <em>Set Par C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParC()
	 * @generated
	 * @ordered
	 */
	protected float setParC = SET_PAR_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetParD() <em>Set Par D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParD()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PAR_D_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetParD() <em>Set Par D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParD()
	 * @generated
	 * @ordered
	 */
	protected float setParD = SET_PAR_D_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetParE() <em>Set Par E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParE()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PAR_E_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetParE() <em>Set Par E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParE()
	 * @generated
	 * @ordered
	 */
	protected float setParE = SET_PAR_E_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetParF() <em>Set Par F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParF()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PAR_F_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetParF() <em>Set Par F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetParF()
	 * @generated
	 * @ordered
	 */
	protected float setParF = SET_PAR_F_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CURVEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveChar getSetCharact() {
		if (setCharact != null && setCharact.eIsProxy()) {
			InternalEObject oldSetCharact = (InternalEObject)setCharact;
			setCharact = (CurveChar)eResolveProxy(oldSetCharact);
			if (setCharact != oldSetCharact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.CURVE__SET_CHARACT, oldSetCharact, setCharact));
			}
		}
		return setCharact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveChar basicGetSetCharact() {
		return setCharact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetCharact(CurveChar newSetCharact) {
		CurveChar oldSetCharact = setCharact;
		setCharact = newSetCharact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_CHARACT, oldSetCharact, setCharact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSetParA() {
		return setParA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetParA(float newSetParA) {
		float oldSetParA = setParA;
		setParA = newSetParA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_PAR_A, oldSetParA, setParA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSetParB() {
		return setParB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetParB(float newSetParB) {
		float oldSetParB = setParB;
		setParB = newSetParB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_PAR_B, oldSetParB, setParB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSetParC() {
		return setParC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetParC(float newSetParC) {
		float oldSetParC = setParC;
		setParC = newSetParC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_PAR_C, oldSetParC, setParC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSetParD() {
		return setParD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetParD(float newSetParD) {
		float oldSetParD = setParD;
		setParD = newSetParD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_PAR_D, oldSetParD, setParD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSetParE() {
		return setParE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetParE(float newSetParE) {
		float oldSetParE = setParE;
		setParE = newSetParE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_PAR_E, oldSetParE, setParE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSetParF() {
		return setParF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetParF(float newSetParF) {
		float oldSetParF = setParF;
		setParF = newSetParF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CURVE__SET_PAR_F, oldSetParF, setParF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.CURVE__SET_CHARACT:
				if (resolve) return getSetCharact();
				return basicGetSetCharact();
			case DataclassesPackage.CURVE__SET_PAR_A:
				return getSetParA();
			case DataclassesPackage.CURVE__SET_PAR_B:
				return getSetParB();
			case DataclassesPackage.CURVE__SET_PAR_C:
				return getSetParC();
			case DataclassesPackage.CURVE__SET_PAR_D:
				return getSetParD();
			case DataclassesPackage.CURVE__SET_PAR_E:
				return getSetParE();
			case DataclassesPackage.CURVE__SET_PAR_F:
				return getSetParF();
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
			case DataclassesPackage.CURVE__SET_CHARACT:
				setSetCharact((CurveChar)newValue);
				return;
			case DataclassesPackage.CURVE__SET_PAR_A:
				setSetParA((Float)newValue);
				return;
			case DataclassesPackage.CURVE__SET_PAR_B:
				setSetParB((Float)newValue);
				return;
			case DataclassesPackage.CURVE__SET_PAR_C:
				setSetParC((Float)newValue);
				return;
			case DataclassesPackage.CURVE__SET_PAR_D:
				setSetParD((Float)newValue);
				return;
			case DataclassesPackage.CURVE__SET_PAR_E:
				setSetParE((Float)newValue);
				return;
			case DataclassesPackage.CURVE__SET_PAR_F:
				setSetParF((Float)newValue);
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
			case DataclassesPackage.CURVE__SET_CHARACT:
				setSetCharact((CurveChar)null);
				return;
			case DataclassesPackage.CURVE__SET_PAR_A:
				setSetParA(SET_PAR_A_EDEFAULT);
				return;
			case DataclassesPackage.CURVE__SET_PAR_B:
				setSetParB(SET_PAR_B_EDEFAULT);
				return;
			case DataclassesPackage.CURVE__SET_PAR_C:
				setSetParC(SET_PAR_C_EDEFAULT);
				return;
			case DataclassesPackage.CURVE__SET_PAR_D:
				setSetParD(SET_PAR_D_EDEFAULT);
				return;
			case DataclassesPackage.CURVE__SET_PAR_E:
				setSetParE(SET_PAR_E_EDEFAULT);
				return;
			case DataclassesPackage.CURVE__SET_PAR_F:
				setSetParF(SET_PAR_F_EDEFAULT);
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
			case DataclassesPackage.CURVE__SET_CHARACT:
				return setCharact != null;
			case DataclassesPackage.CURVE__SET_PAR_A:
				return setParA != SET_PAR_A_EDEFAULT;
			case DataclassesPackage.CURVE__SET_PAR_B:
				return setParB != SET_PAR_B_EDEFAULT;
			case DataclassesPackage.CURVE__SET_PAR_C:
				return setParC != SET_PAR_C_EDEFAULT;
			case DataclassesPackage.CURVE__SET_PAR_D:
				return setParD != SET_PAR_D_EDEFAULT;
			case DataclassesPackage.CURVE__SET_PAR_E:
				return setParE != SET_PAR_E_EDEFAULT;
			case DataclassesPackage.CURVE__SET_PAR_F:
				return setParF != SET_PAR_F_EDEFAULT;
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
		result.append(" (setParA: ");
		result.append(setParA);
		result.append(", setParB: ");
		result.append(setParB);
		result.append(", setParC: ");
		result.append(setParC);
		result.append(", setParD: ");
		result.append(setParD);
		result.append(", setParE: ");
		result.append(setParE);
		result.append(", setParF: ");
		result.append(setParF);
		result.append(')');
		return result.toString();
	}

} //CURVEImpl
