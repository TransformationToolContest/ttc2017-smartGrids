/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.ControlOutput;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.PulseConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pulse Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl#getOnDur <em>On Dur</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl#getOffDur <em>Off Dur</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl#getNumPls <em>Num Pls</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl#getCmdQual <em>Cmd Qual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PulseConfigImpl extends MinimalEObjectImpl.Container implements PulseConfig {
	/**
	 * The default value of the '{@link #getOnDur() <em>On Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDur()
	 * @generated
	 * @ordered
	 */
	protected static final int ON_DUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOnDur() <em>On Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDur()
	 * @generated
	 * @ordered
	 */
	protected int onDur = ON_DUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffDur() <em>Off Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffDur()
	 * @generated
	 * @ordered
	 */
	protected static final int OFF_DUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffDur() <em>Off Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffDur()
	 * @generated
	 * @ordered
	 */
	protected int offDur = OFF_DUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPls() <em>Num Pls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPls()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumPls() <em>Num Pls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPls()
	 * @generated
	 * @ordered
	 */
	protected int numPls = NUM_PLS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCmdQual() <em>Cmd Qual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdQual()
	 * @generated
	 * @ordered
	 */
	protected ControlOutput cmdQual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PulseConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.PULSE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOnDur() {
		return onDur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDur(int newOnDur) {
		int oldOnDur = onDur;
		onDur = newOnDur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PULSE_CONFIG__ON_DUR, oldOnDur, onDur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffDur() {
		return offDur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffDur(int newOffDur) {
		int oldOffDur = offDur;
		offDur = newOffDur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PULSE_CONFIG__OFF_DUR, oldOffDur, offDur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumPls() {
		return numPls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPls(int newNumPls) {
		int oldNumPls = numPls;
		numPls = newNumPls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PULSE_CONFIG__NUM_PLS, oldNumPls, numPls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlOutput getCmdQual() {
		if (cmdQual != null && cmdQual.eIsProxy()) {
			InternalEObject oldCmdQual = (InternalEObject)cmdQual;
			cmdQual = (ControlOutput)eResolveProxy(oldCmdQual);
			if (cmdQual != oldCmdQual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.PULSE_CONFIG__CMD_QUAL, oldCmdQual, cmdQual));
			}
		}
		return cmdQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlOutput basicGetCmdQual() {
		return cmdQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdQual(ControlOutput newCmdQual) {
		ControlOutput oldCmdQual = cmdQual;
		cmdQual = newCmdQual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PULSE_CONFIG__CMD_QUAL, oldCmdQual, cmdQual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.PULSE_CONFIG__ON_DUR:
				return getOnDur();
			case DataclassesPackage.PULSE_CONFIG__OFF_DUR:
				return getOffDur();
			case DataclassesPackage.PULSE_CONFIG__NUM_PLS:
				return getNumPls();
			case DataclassesPackage.PULSE_CONFIG__CMD_QUAL:
				if (resolve) return getCmdQual();
				return basicGetCmdQual();
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
			case DataclassesPackage.PULSE_CONFIG__ON_DUR:
				setOnDur((Integer)newValue);
				return;
			case DataclassesPackage.PULSE_CONFIG__OFF_DUR:
				setOffDur((Integer)newValue);
				return;
			case DataclassesPackage.PULSE_CONFIG__NUM_PLS:
				setNumPls((Integer)newValue);
				return;
			case DataclassesPackage.PULSE_CONFIG__CMD_QUAL:
				setCmdQual((ControlOutput)newValue);
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
			case DataclassesPackage.PULSE_CONFIG__ON_DUR:
				setOnDur(ON_DUR_EDEFAULT);
				return;
			case DataclassesPackage.PULSE_CONFIG__OFF_DUR:
				setOffDur(OFF_DUR_EDEFAULT);
				return;
			case DataclassesPackage.PULSE_CONFIG__NUM_PLS:
				setNumPls(NUM_PLS_EDEFAULT);
				return;
			case DataclassesPackage.PULSE_CONFIG__CMD_QUAL:
				setCmdQual((ControlOutput)null);
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
			case DataclassesPackage.PULSE_CONFIG__ON_DUR:
				return onDur != ON_DUR_EDEFAULT;
			case DataclassesPackage.PULSE_CONFIG__OFF_DUR:
				return offDur != OFF_DUR_EDEFAULT;
			case DataclassesPackage.PULSE_CONFIG__NUM_PLS:
				return numPls != NUM_PLS_EDEFAULT;
			case DataclassesPackage.PULSE_CONFIG__CMD_QUAL:
				return cmdQual != null;
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
		result.append(" (onDur: ");
		result.append(onDur);
		result.append(", offDur: ");
		result.append(offDur);
		result.append(", numPls: ");
		result.append(numPls);
		result.append(')');
		return result.toString();
	}

} //PulseConfigImpl
