/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.DirectionPhase;
import gluemodel.substationStandard.Dataclasses.FaultDirection;
import gluemodel.substationStandard.Dataclasses.Quality;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#isGeneral <em>General</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#getDirGeneral <em>Dir General</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#isPhsA <em>Phs A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#getDirPhsA <em>Dir Phs A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#isPhsB <em>Phs B</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#getDirPhsB <em>Dir Phs B</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#isPhsC <em>Phs C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#getDirPhsC <em>Dir Phs C</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#isNeut <em>Neut</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#getDirNeut <em>Dir Neut</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACDImpl extends MinimalEObjectImpl.Container implements ACD {
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
	 * The cached value of the '{@link #getDirGeneral() <em>Dir General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirGeneral()
	 * @generated
	 * @ordered
	 */
	protected FaultDirection dirGeneral;

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
	 * The cached value of the '{@link #getDirPhsA() <em>Dir Phs A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirPhsA()
	 * @generated
	 * @ordered
	 */
	protected DirectionPhase dirPhsA;

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
	 * The cached value of the '{@link #getDirPhsB() <em>Dir Phs B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirPhsB()
	 * @generated
	 * @ordered
	 */
	protected DirectionPhase dirPhsB;

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
	 * The cached value of the '{@link #getDirPhsC() <em>Dir Phs C</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirPhsC()
	 * @generated
	 * @ordered
	 */
	protected DirectionPhase dirPhsC;

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
	 * The cached value of the '{@link #getDirNeut() <em>Dir Neut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirNeut()
	 * @generated
	 * @ordered
	 */
	protected DirectionPhase dirNeut;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ACD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultDirection getDirGeneral() {
		if (dirGeneral != null && dirGeneral.eIsProxy()) {
			InternalEObject oldDirGeneral = (InternalEObject)dirGeneral;
			dirGeneral = (FaultDirection)eResolveProxy(oldDirGeneral);
			if (dirGeneral != oldDirGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACD__DIR_GENERAL, oldDirGeneral, dirGeneral));
			}
		}
		return dirGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultDirection basicGetDirGeneral() {
		return dirGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirGeneral(FaultDirection newDirGeneral) {
		FaultDirection oldDirGeneral = dirGeneral;
		dirGeneral = newDirGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__DIR_GENERAL, oldDirGeneral, dirGeneral));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__PHS_A, oldPhsA, phsA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase getDirPhsA() {
		if (dirPhsA != null && dirPhsA.eIsProxy()) {
			InternalEObject oldDirPhsA = (InternalEObject)dirPhsA;
			dirPhsA = (DirectionPhase)eResolveProxy(oldDirPhsA);
			if (dirPhsA != oldDirPhsA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACD__DIR_PHS_A, oldDirPhsA, dirPhsA));
			}
		}
		return dirPhsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase basicGetDirPhsA() {
		return dirPhsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirPhsA(DirectionPhase newDirPhsA) {
		DirectionPhase oldDirPhsA = dirPhsA;
		dirPhsA = newDirPhsA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__DIR_PHS_A, oldDirPhsA, dirPhsA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__PHS_B, oldPhsB, phsB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase getDirPhsB() {
		if (dirPhsB != null && dirPhsB.eIsProxy()) {
			InternalEObject oldDirPhsB = (InternalEObject)dirPhsB;
			dirPhsB = (DirectionPhase)eResolveProxy(oldDirPhsB);
			if (dirPhsB != oldDirPhsB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACD__DIR_PHS_B, oldDirPhsB, dirPhsB));
			}
		}
		return dirPhsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase basicGetDirPhsB() {
		return dirPhsB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirPhsB(DirectionPhase newDirPhsB) {
		DirectionPhase oldDirPhsB = dirPhsB;
		dirPhsB = newDirPhsB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__DIR_PHS_B, oldDirPhsB, dirPhsB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__PHS_C, oldPhsC, phsC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase getDirPhsC() {
		if (dirPhsC != null && dirPhsC.eIsProxy()) {
			InternalEObject oldDirPhsC = (InternalEObject)dirPhsC;
			dirPhsC = (DirectionPhase)eResolveProxy(oldDirPhsC);
			if (dirPhsC != oldDirPhsC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACD__DIR_PHS_C, oldDirPhsC, dirPhsC));
			}
		}
		return dirPhsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase basicGetDirPhsC() {
		return dirPhsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirPhsC(DirectionPhase newDirPhsC) {
		DirectionPhase oldDirPhsC = dirPhsC;
		dirPhsC = newDirPhsC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__DIR_PHS_C, oldDirPhsC, dirPhsC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__NEUT, oldNeut, neut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase getDirNeut() {
		if (dirNeut != null && dirNeut.eIsProxy()) {
			InternalEObject oldDirNeut = (InternalEObject)dirNeut;
			dirNeut = (DirectionPhase)eResolveProxy(oldDirNeut);
			if (dirNeut != oldDirNeut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACD__DIR_NEUT, oldDirNeut, dirNeut));
			}
		}
		return dirNeut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase basicGetDirNeut() {
		return dirNeut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirNeut(DirectionPhase newDirNeut) {
		DirectionPhase oldDirNeut = dirNeut;
		dirNeut = newDirNeut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__DIR_NEUT, oldDirNeut, dirNeut));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ACD__Q, oldQ, q));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ACD__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ACD__GENERAL:
				return isGeneral();
			case DataclassesPackage.ACD__DIR_GENERAL:
				if (resolve) return getDirGeneral();
				return basicGetDirGeneral();
			case DataclassesPackage.ACD__PHS_A:
				return isPhsA();
			case DataclassesPackage.ACD__DIR_PHS_A:
				if (resolve) return getDirPhsA();
				return basicGetDirPhsA();
			case DataclassesPackage.ACD__PHS_B:
				return isPhsB();
			case DataclassesPackage.ACD__DIR_PHS_B:
				if (resolve) return getDirPhsB();
				return basicGetDirPhsB();
			case DataclassesPackage.ACD__PHS_C:
				return isPhsC();
			case DataclassesPackage.ACD__DIR_PHS_C:
				if (resolve) return getDirPhsC();
				return basicGetDirPhsC();
			case DataclassesPackage.ACD__NEUT:
				return isNeut();
			case DataclassesPackage.ACD__DIR_NEUT:
				if (resolve) return getDirNeut();
				return basicGetDirNeut();
			case DataclassesPackage.ACD__Q:
				if (resolve) return getQ();
				return basicGetQ();
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
			case DataclassesPackage.ACD__GENERAL:
				setGeneral((Boolean)newValue);
				return;
			case DataclassesPackage.ACD__DIR_GENERAL:
				setDirGeneral((FaultDirection)newValue);
				return;
			case DataclassesPackage.ACD__PHS_A:
				setPhsA((Boolean)newValue);
				return;
			case DataclassesPackage.ACD__DIR_PHS_A:
				setDirPhsA((DirectionPhase)newValue);
				return;
			case DataclassesPackage.ACD__PHS_B:
				setPhsB((Boolean)newValue);
				return;
			case DataclassesPackage.ACD__DIR_PHS_B:
				setDirPhsB((DirectionPhase)newValue);
				return;
			case DataclassesPackage.ACD__PHS_C:
				setPhsC((Boolean)newValue);
				return;
			case DataclassesPackage.ACD__DIR_PHS_C:
				setDirPhsC((DirectionPhase)newValue);
				return;
			case DataclassesPackage.ACD__NEUT:
				setNeut((Boolean)newValue);
				return;
			case DataclassesPackage.ACD__DIR_NEUT:
				setDirNeut((DirectionPhase)newValue);
				return;
			case DataclassesPackage.ACD__Q:
				setQ((Quality)newValue);
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
			case DataclassesPackage.ACD__GENERAL:
				setGeneral(GENERAL_EDEFAULT);
				return;
			case DataclassesPackage.ACD__DIR_GENERAL:
				setDirGeneral((FaultDirection)null);
				return;
			case DataclassesPackage.ACD__PHS_A:
				setPhsA(PHS_A_EDEFAULT);
				return;
			case DataclassesPackage.ACD__DIR_PHS_A:
				setDirPhsA((DirectionPhase)null);
				return;
			case DataclassesPackage.ACD__PHS_B:
				setPhsB(PHS_B_EDEFAULT);
				return;
			case DataclassesPackage.ACD__DIR_PHS_B:
				setDirPhsB((DirectionPhase)null);
				return;
			case DataclassesPackage.ACD__PHS_C:
				setPhsC(PHS_C_EDEFAULT);
				return;
			case DataclassesPackage.ACD__DIR_PHS_C:
				setDirPhsC((DirectionPhase)null);
				return;
			case DataclassesPackage.ACD__NEUT:
				setNeut(NEUT_EDEFAULT);
				return;
			case DataclassesPackage.ACD__DIR_NEUT:
				setDirNeut((DirectionPhase)null);
				return;
			case DataclassesPackage.ACD__Q:
				setQ((Quality)null);
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
			case DataclassesPackage.ACD__GENERAL:
				return general != GENERAL_EDEFAULT;
			case DataclassesPackage.ACD__DIR_GENERAL:
				return dirGeneral != null;
			case DataclassesPackage.ACD__PHS_A:
				return phsA != PHS_A_EDEFAULT;
			case DataclassesPackage.ACD__DIR_PHS_A:
				return dirPhsA != null;
			case DataclassesPackage.ACD__PHS_B:
				return phsB != PHS_B_EDEFAULT;
			case DataclassesPackage.ACD__DIR_PHS_B:
				return dirPhsB != null;
			case DataclassesPackage.ACD__PHS_C:
				return phsC != PHS_C_EDEFAULT;
			case DataclassesPackage.ACD__DIR_PHS_C:
				return dirPhsC != null;
			case DataclassesPackage.ACD__NEUT:
				return neut != NEUT_EDEFAULT;
			case DataclassesPackage.ACD__DIR_NEUT:
				return dirNeut != null;
			case DataclassesPackage.ACD__Q:
				return q != null;
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

} //ACDImpl
