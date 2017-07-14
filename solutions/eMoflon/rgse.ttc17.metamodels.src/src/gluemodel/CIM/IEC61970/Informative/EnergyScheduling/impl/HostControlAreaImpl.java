/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaControlMode;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.TieLine;

import gluemodel.CIM.IEC61970.Informative.Financial.ControlAreaOperator;
import gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage;

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
 * An implementation of the model object '<em><b>Host Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getSubControlAreas <em>Sub Control Areas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getFrequencyBiasFactor <em>Frequency Bias Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getSideA_TieLines <em>Side ATie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getFreqSetPoint <em>Freq Set Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getInadvertentAccounts <em>Inadvertent Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getSideB_TieLines <em>Side BTie Lines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getReceive_DynamicSchedules <em>Receive Dynamic Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getAreaReserveSpec <em>Area Reserve Spec</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getAreaControlMode <em>Area Control Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.HostControlAreaImpl#getSend_DynamicSchedules <em>Send Dynamic Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostControlAreaImpl extends IdentifiedObjectImpl implements HostControlArea {
	/**
	 * The cached value of the '{@link #getSubControlAreas() <em>Sub Control Areas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubControlAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<SubControlArea> subControlAreas;

	/**
	 * The default value of the '{@link #getFrequencyBiasFactor() <em>Frequency Bias Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyBiasFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Object FREQUENCY_BIAS_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyBiasFactor() <em>Frequency Bias Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyBiasFactor()
	 * @generated
	 * @ordered
	 */
	protected Object frequencyBiasFactor = FREQUENCY_BIAS_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSideA_TieLines() <em>Side ATie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideA_TieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> sideA_TieLines;

	/**
	 * The default value of the '{@link #getFreqSetPoint() <em>Freq Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqSetPoint()
	 * @generated
	 * @ordered
	 */
	protected static final float FREQ_SET_POINT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFreqSetPoint() <em>Freq Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqSetPoint()
	 * @generated
	 * @ordered
	 */
	protected float freqSetPoint = FREQ_SET_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected ControlAreaOperator controls;

	/**
	 * The cached value of the '{@link #getInadvertentAccounts() <em>Inadvertent Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInadvertentAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<InadvertentAccount> inadvertentAccounts;

	/**
	 * The cached value of the '{@link #getSideB_TieLines() <em>Side BTie Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideB_TieLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TieLine> sideB_TieLines;

	/**
	 * The cached value of the '{@link #getReceive_DynamicSchedules() <em>Receive Dynamic Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_DynamicSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicSchedule> receive_DynamicSchedules;

	/**
	 * The cached value of the '{@link #getAreaReserveSpec() <em>Area Reserve Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaReserveSpec()
	 * @generated
	 * @ordered
	 */
	protected AreaReserveSpec areaReserveSpec;

	/**
	 * The default value of the '{@link #getAreaControlMode() <em>Area Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final AreaControlMode AREA_CONTROL_MODE_EDEFAULT = AreaControlMode.TLB;

	/**
	 * The cached value of the '{@link #getAreaControlMode() <em>Area Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaControlMode()
	 * @generated
	 * @ordered
	 */
	protected AreaControlMode areaControlMode = AREA_CONTROL_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSend_DynamicSchedules() <em>Send Dynamic Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_DynamicSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicSchedule> send_DynamicSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.HOST_CONTROL_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubControlArea> getSubControlAreas() {
		if (subControlAreas == null) {
			subControlAreas = new EObjectWithInverseResolvingEList<SubControlArea>(SubControlArea.class, this, EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS, EnergySchedulingPackage.SUB_CONTROL_AREA__HOST_CONTROL_AREA);
		}
		return subControlAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFrequencyBiasFactor() {
		return frequencyBiasFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyBiasFactor(Object newFrequencyBiasFactor) {
		Object oldFrequencyBiasFactor = frequencyBiasFactor;
		frequencyBiasFactor = newFrequencyBiasFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR, oldFrequencyBiasFactor, frequencyBiasFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getSideA_TieLines() {
		if (sideA_TieLines == null) {
			sideA_TieLines = new EObjectWithInverseResolvingEList<TieLine>(TieLine.class, this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES, EnergySchedulingPackage.TIE_LINE__SIDE_AHOST_CONTROL_AREA);
		}
		return sideA_TieLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFreqSetPoint() {
		return freqSetPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreqSetPoint(float newFreqSetPoint) {
		float oldFreqSetPoint = freqSetPoint;
		freqSetPoint = newFreqSetPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__FREQ_SET_POINT, oldFreqSetPoint, freqSetPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaOperator getControls() {
		if (controls != null && controls.eIsProxy()) {
			InternalEObject oldControls = (InternalEObject)controls;
			controls = (ControlAreaOperator)eResolveProxy(oldControls);
			if (controls != oldControls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS, oldControls, controls));
			}
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaOperator basicGetControls() {
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControls(ControlAreaOperator newControls, NotificationChain msgs) {
		ControlAreaOperator oldControls = controls;
		controls = newControls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS, oldControls, newControls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControls(ControlAreaOperator newControls) {
		if (newControls != controls) {
			NotificationChain msgs = null;
			if (controls != null)
				msgs = ((InternalEObject)controls).eInverseRemove(this, FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY, ControlAreaOperator.class, msgs);
			if (newControls != null)
				msgs = ((InternalEObject)newControls).eInverseAdd(this, FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY, ControlAreaOperator.class, msgs);
			msgs = basicSetControls(newControls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS, newControls, newControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InadvertentAccount> getInadvertentAccounts() {
		if (inadvertentAccounts == null) {
			inadvertentAccounts = new EObjectWithInverseResolvingEList<InadvertentAccount>(InadvertentAccount.class, this, EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS, EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA);
		}
		return inadvertentAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TieLine> getSideB_TieLines() {
		if (sideB_TieLines == null) {
			sideB_TieLines = new EObjectWithInverseResolvingEList<TieLine>(TieLine.class, this, EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES, EnergySchedulingPackage.TIE_LINE__SIDE_BHOST_CONTROL_AREA);
		}
		return sideB_TieLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicSchedule> getReceive_DynamicSchedules() {
		if (receive_DynamicSchedules == null) {
			receive_DynamicSchedules = new EObjectWithInverseResolvingEList<DynamicSchedule>(DynamicSchedule.class, this, EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES, EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA);
		}
		return receive_DynamicSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaReserveSpec getAreaReserveSpec() {
		if (areaReserveSpec != null && areaReserveSpec.eIsProxy()) {
			InternalEObject oldAreaReserveSpec = (InternalEObject)areaReserveSpec;
			areaReserveSpec = (AreaReserveSpec)eResolveProxy(oldAreaReserveSpec);
			if (areaReserveSpec != oldAreaReserveSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC, oldAreaReserveSpec, areaReserveSpec));
			}
		}
		return areaReserveSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaReserveSpec basicGetAreaReserveSpec() {
		return areaReserveSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaReserveSpec(AreaReserveSpec newAreaReserveSpec, NotificationChain msgs) {
		AreaReserveSpec oldAreaReserveSpec = areaReserveSpec;
		areaReserveSpec = newAreaReserveSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC, oldAreaReserveSpec, newAreaReserveSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaReserveSpec(AreaReserveSpec newAreaReserveSpec) {
		if (newAreaReserveSpec != areaReserveSpec) {
			NotificationChain msgs = null;
			if (areaReserveSpec != null)
				msgs = ((InternalEObject)areaReserveSpec).eInverseRemove(this, EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS, AreaReserveSpec.class, msgs);
			if (newAreaReserveSpec != null)
				msgs = ((InternalEObject)newAreaReserveSpec).eInverseAdd(this, EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS, AreaReserveSpec.class, msgs);
			msgs = basicSetAreaReserveSpec(newAreaReserveSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC, newAreaReserveSpec, newAreaReserveSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaControlMode getAreaControlMode() {
		return areaControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaControlMode(AreaControlMode newAreaControlMode) {
		AreaControlMode oldAreaControlMode = areaControlMode;
		areaControlMode = newAreaControlMode == null ? AREA_CONTROL_MODE_EDEFAULT : newAreaControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_CONTROL_MODE, oldAreaControlMode, areaControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicSchedule> getSend_DynamicSchedules() {
		if (send_DynamicSchedules == null) {
			send_DynamicSchedules = new EObjectWithInverseResolvingEList<DynamicSchedule>(DynamicSchedule.class, this, EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES, EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA);
		}
		return send_DynamicSchedules;
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
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubControlAreas()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSideA_TieLines()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS:
				if (controls != null)
					msgs = ((InternalEObject)controls).eInverseRemove(this, FinancialPackage.CONTROL_AREA_OPERATOR__CONTROLLED_BY, ControlAreaOperator.class, msgs);
				return basicSetControls((ControlAreaOperator)otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInadvertentAccounts()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSideB_TieLines()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceive_DynamicSchedules()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC:
				if (areaReserveSpec != null)
					msgs = ((InternalEObject)areaReserveSpec).eInverseRemove(this, EnergySchedulingPackage.AREA_RESERVE_SPEC__HOST_CONTROL_AREAS, AreaReserveSpec.class, msgs);
				return basicSetAreaReserveSpec((AreaReserveSpec)otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSend_DynamicSchedules()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS:
				return ((InternalEList<?>)getSubControlAreas()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES:
				return ((InternalEList<?>)getSideA_TieLines()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS:
				return basicSetControls(null, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS:
				return ((InternalEList<?>)getInadvertentAccounts()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES:
				return ((InternalEList<?>)getSideB_TieLines()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES:
				return ((InternalEList<?>)getReceive_DynamicSchedules()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC:
				return basicSetAreaReserveSpec(null, msgs);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES:
				return ((InternalEList<?>)getSend_DynamicSchedules()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS:
				return getSubControlAreas();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR:
				return getFrequencyBiasFactor();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES:
				return getSideA_TieLines();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQ_SET_POINT:
				return getFreqSetPoint();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS:
				if (resolve) return getControls();
				return basicGetControls();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS:
				return getInadvertentAccounts();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES:
				return getSideB_TieLines();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES:
				return getReceive_DynamicSchedules();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC:
				if (resolve) return getAreaReserveSpec();
				return basicGetAreaReserveSpec();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_CONTROL_MODE:
				return getAreaControlMode();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES:
				return getSend_DynamicSchedules();
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
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS:
				getSubControlAreas().clear();
				getSubControlAreas().addAll((Collection<? extends SubControlArea>)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR:
				setFrequencyBiasFactor(newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES:
				getSideA_TieLines().clear();
				getSideA_TieLines().addAll((Collection<? extends TieLine>)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQ_SET_POINT:
				setFreqSetPoint((Float)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS:
				setControls((ControlAreaOperator)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS:
				getInadvertentAccounts().clear();
				getInadvertentAccounts().addAll((Collection<? extends InadvertentAccount>)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES:
				getSideB_TieLines().clear();
				getSideB_TieLines().addAll((Collection<? extends TieLine>)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES:
				getReceive_DynamicSchedules().clear();
				getReceive_DynamicSchedules().addAll((Collection<? extends DynamicSchedule>)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC:
				setAreaReserveSpec((AreaReserveSpec)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_CONTROL_MODE:
				setAreaControlMode((AreaControlMode)newValue);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES:
				getSend_DynamicSchedules().clear();
				getSend_DynamicSchedules().addAll((Collection<? extends DynamicSchedule>)newValue);
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
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS:
				getSubControlAreas().clear();
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR:
				setFrequencyBiasFactor(FREQUENCY_BIAS_FACTOR_EDEFAULT);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES:
				getSideA_TieLines().clear();
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQ_SET_POINT:
				setFreqSetPoint(FREQ_SET_POINT_EDEFAULT);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS:
				setControls((ControlAreaOperator)null);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS:
				getInadvertentAccounts().clear();
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES:
				getSideB_TieLines().clear();
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES:
				getReceive_DynamicSchedules().clear();
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC:
				setAreaReserveSpec((AreaReserveSpec)null);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_CONTROL_MODE:
				setAreaControlMode(AREA_CONTROL_MODE_EDEFAULT);
				return;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES:
				getSend_DynamicSchedules().clear();
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
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SUB_CONTROL_AREAS:
				return subControlAreas != null && !subControlAreas.isEmpty();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQUENCY_BIAS_FACTOR:
				return FREQUENCY_BIAS_FACTOR_EDEFAULT == null ? frequencyBiasFactor != null : !FREQUENCY_BIAS_FACTOR_EDEFAULT.equals(frequencyBiasFactor);
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_ATIE_LINES:
				return sideA_TieLines != null && !sideA_TieLines.isEmpty();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__FREQ_SET_POINT:
				return freqSetPoint != FREQ_SET_POINT_EDEFAULT;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__CONTROLS:
				return controls != null;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS:
				return inadvertentAccounts != null && !inadvertentAccounts.isEmpty();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SIDE_BTIE_LINES:
				return sideB_TieLines != null && !sideB_TieLines.isEmpty();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES:
				return receive_DynamicSchedules != null && !receive_DynamicSchedules.isEmpty();
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_RESERVE_SPEC:
				return areaReserveSpec != null;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__AREA_CONTROL_MODE:
				return areaControlMode != AREA_CONTROL_MODE_EDEFAULT;
			case EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES:
				return send_DynamicSchedules != null && !send_DynamicSchedules.isEmpty();
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
		result.append(" (frequencyBiasFactor: ");
		result.append(frequencyBiasFactor);
		result.append(", freqSetPoint: ");
		result.append(freqSetPoint);
		result.append(", areaControlMode: ");
		result.append(areaControlMode);
		result.append(')');
		return result.toString();
	}

} //HostControlAreaImpl
