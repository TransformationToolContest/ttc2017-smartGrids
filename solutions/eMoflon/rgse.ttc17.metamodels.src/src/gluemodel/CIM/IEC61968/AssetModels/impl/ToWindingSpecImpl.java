/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.OpenCircuitTest;
import gluemodel.CIM.IEC61968.AssetModels.ShortCircuitTest;
import gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec;
import gluemodel.CIM.IEC61968.AssetModels.WindingInfo;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Winding Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl#getOpenCircuitTests <em>Open Circuit Tests</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl#getToWinding <em>To Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl#getToTapStep <em>To Tap Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.ToWindingSpecImpl#getShortCircuitTests <em>Short Circuit Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToWindingSpecImpl extends IdentifiedObjectImpl implements ToWindingSpec {
	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected float voltage = VOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpenCircuitTests() <em>Open Circuit Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenCircuitTests()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenCircuitTest> openCircuitTests;

	/**
	 * The cached value of the '{@link #getToWinding() <em>To Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToWinding()
	 * @generated
	 * @ordered
	 */
	protected WindingInfo toWinding;

	/**
	 * The default value of the '{@link #getToTapStep() <em>To Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTapStep()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_TAP_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToTapStep() <em>To Tap Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTapStep()
	 * @generated
	 * @ordered
	 */
	protected int toTapStep = TO_TAP_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_SHIFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected float phaseShift = PHASE_SHIFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShortCircuitTests() <em>Short Circuit Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortCircuitTests()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortCircuitTest> shortCircuitTests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToWindingSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TO_WINDING_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(float newVoltage) {
		float oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TO_WINDING_SPEC__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenCircuitTest> getOpenCircuitTests() {
		if (openCircuitTests == null) {
			openCircuitTests = new EObjectWithInverseResolvingEList.ManyInverse<OpenCircuitTest>(OpenCircuitTest.class, this, AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS, AssetModelsPackage.OPEN_CIRCUIT_TEST__MEASURED_WINDING_SPECS);
		}
		return openCircuitTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo getToWinding() {
		if (toWinding != null && toWinding.eIsProxy()) {
			InternalEObject oldToWinding = (InternalEObject)toWinding;
			toWinding = (WindingInfo)eResolveProxy(oldToWinding);
			if (toWinding != oldToWinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING, oldToWinding, toWinding));
			}
		}
		return toWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInfo basicGetToWinding() {
		return toWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToWinding(WindingInfo newToWinding, NotificationChain msgs) {
		WindingInfo oldToWinding = toWinding;
		toWinding = newToWinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING, oldToWinding, newToWinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToWinding(WindingInfo newToWinding) {
		if (newToWinding != toWinding) {
			NotificationChain msgs = null;
			if (toWinding != null)
				msgs = ((InternalEObject)toWinding).eInverseRemove(this, AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS, WindingInfo.class, msgs);
			if (newToWinding != null)
				msgs = ((InternalEObject)newToWinding).eInverseAdd(this, AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS, WindingInfo.class, msgs);
			msgs = basicSetToWinding(newToWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING, newToWinding, newToWinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToTapStep() {
		return toTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTapStep(int newToTapStep) {
		int oldToTapStep = toTapStep;
		toTapStep = newToTapStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TO_WINDING_SPEC__TO_TAP_STEP, oldToTapStep, toTapStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPhaseShift() {
		return phaseShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseShift(float newPhaseShift) {
		float oldPhaseShift = phaseShift;
		phaseShift = newPhaseShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TO_WINDING_SPEC__PHASE_SHIFT, oldPhaseShift, phaseShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShortCircuitTest> getShortCircuitTests() {
		if (shortCircuitTests == null) {
			shortCircuitTests = new EObjectWithInverseResolvingEList.ManyInverse<ShortCircuitTest>(ShortCircuitTest.class, this, AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS, AssetModelsPackage.SHORT_CIRCUIT_TEST__SHORTED_WINDING_SPECS);
		}
		return shortCircuitTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpenCircuitTests()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING:
				if (toWinding != null)
					msgs = ((InternalEObject)toWinding).eInverseRemove(this, AssetModelsPackage.WINDING_INFO__TO_WINDING_SPECS, WindingInfo.class, msgs);
				return basicSetToWinding((WindingInfo)otherEnd, msgs);
			case AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShortCircuitTests()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS:
				return ((InternalEList<?>)getOpenCircuitTests()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING:
				return basicSetToWinding(null, msgs);
			case AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS:
				return ((InternalEList<?>)getShortCircuitTests()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssetModelsPackage.TO_WINDING_SPEC__VOLTAGE:
				return getVoltage();
			case AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS:
				return getOpenCircuitTests();
			case AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING:
				if (resolve) return getToWinding();
				return basicGetToWinding();
			case AssetModelsPackage.TO_WINDING_SPEC__TO_TAP_STEP:
				return getToTapStep();
			case AssetModelsPackage.TO_WINDING_SPEC__PHASE_SHIFT:
				return getPhaseShift();
			case AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS:
				return getShortCircuitTests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssetModelsPackage.TO_WINDING_SPEC__VOLTAGE:
				setVoltage((Float)newValue);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS:
				getOpenCircuitTests().clear();
				getOpenCircuitTests().addAll((Collection<? extends OpenCircuitTest>)newValue);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING:
				setToWinding((WindingInfo)newValue);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__TO_TAP_STEP:
				setToTapStep((Integer)newValue);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__PHASE_SHIFT:
				setPhaseShift((Float)newValue);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS:
				getShortCircuitTests().clear();
				getShortCircuitTests().addAll((Collection<? extends ShortCircuitTest>)newValue);
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
			case AssetModelsPackage.TO_WINDING_SPEC__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS:
				getOpenCircuitTests().clear();
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING:
				setToWinding((WindingInfo)null);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__TO_TAP_STEP:
				setToTapStep(TO_TAP_STEP_EDEFAULT);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__PHASE_SHIFT:
				setPhaseShift(PHASE_SHIFT_EDEFAULT);
				return;
			case AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS:
				getShortCircuitTests().clear();
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
			case AssetModelsPackage.TO_WINDING_SPEC__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case AssetModelsPackage.TO_WINDING_SPEC__OPEN_CIRCUIT_TESTS:
				return openCircuitTests != null && !openCircuitTests.isEmpty();
			case AssetModelsPackage.TO_WINDING_SPEC__TO_WINDING:
				return toWinding != null;
			case AssetModelsPackage.TO_WINDING_SPEC__TO_TAP_STEP:
				return toTapStep != TO_TAP_STEP_EDEFAULT;
			case AssetModelsPackage.TO_WINDING_SPEC__PHASE_SHIFT:
				return phaseShift != PHASE_SHIFT_EDEFAULT;
			case AssetModelsPackage.TO_WINDING_SPEC__SHORT_CIRCUIT_TESTS:
				return shortCircuitTests != null && !shortCircuitTests.isEmpty();
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
		result.append(" (voltage: ");
		result.append(voltage);
		result.append(", toTapStep: ");
		result.append(toTapStep);
		result.append(", phaseShift: ");
		result.append(phaseShift);
		result.append(')');
		return result.toString();
	}

} //ToWindingSpecImpl
