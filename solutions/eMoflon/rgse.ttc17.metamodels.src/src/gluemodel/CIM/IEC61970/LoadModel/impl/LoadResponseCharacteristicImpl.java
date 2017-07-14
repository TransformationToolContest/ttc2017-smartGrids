/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#isExponentModel <em>Exponent Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getPConstantCurrent <em>PConstant Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getQConstantImpedance <em>QConstant Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getPConstantImpedance <em>PConstant Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getQConstantCurrent <em>QConstant Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getPConstantPower <em>PConstant Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.LoadResponseCharacteristicImpl#getQConstantPower <em>QConstant Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadResponseCharacteristicImpl extends IdentifiedObjectImpl implements LoadResponseCharacteristic {
	/**
	 * The default value of the '{@link #isExponentModel() <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExponentModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPONENT_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExponentModel() <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExponentModel()
	 * @generated
	 * @ordered
	 */
	protected boolean exponentModel = EXPONENT_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPConstantCurrent() <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float PCONSTANT_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPConstantCurrent() <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected float pConstantCurrent = PCONSTANT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQConstantImpedance() <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float QCONSTANT_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQConstantImpedance() <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected float qConstantImpedance = QCONSTANT_IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float QFREQUENCY_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected float qFrequencyExponent = QFREQUENCY_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float PFREQUENCY_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected float pFrequencyExponent = PFREQUENCY_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPConstantImpedance() <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float PCONSTANT_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPConstantImpedance() <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected float pConstantImpedance = PCONSTANT_IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float QVOLTAGE_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected float qVoltageExponent = QVOLTAGE_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float PVOLTAGE_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected float pVoltageExponent = PVOLTAGE_EXPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumer()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyConsumer> energyConsumer;

	/**
	 * The default value of the '{@link #getQConstantCurrent() <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float QCONSTANT_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQConstantCurrent() <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected float qConstantCurrent = QCONSTANT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPConstantPower() <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantPower()
	 * @generated
	 * @ordered
	 */
	protected static final float PCONSTANT_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPConstantPower() <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantPower()
	 * @generated
	 * @ordered
	 */
	protected float pConstantPower = PCONSTANT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQConstantPower() <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantPower()
	 * @generated
	 * @ordered
	 */
	protected static final float QCONSTANT_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQConstantPower() <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantPower()
	 * @generated
	 * @ordered
	 */
	protected float qConstantPower = QCONSTANT_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadResponseCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_RESPONSE_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExponentModel() {
		return exponentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExponentModel(boolean newExponentModel) {
		boolean oldExponentModel = exponentModel;
		exponentModel = newExponentModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL, oldExponentModel, exponentModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPConstantCurrent() {
		return pConstantCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPConstantCurrent(float newPConstantCurrent) {
		float oldPConstantCurrent = pConstantCurrent;
		pConstantCurrent = newPConstantCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT, oldPConstantCurrent, pConstantCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQConstantImpedance() {
		return qConstantImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQConstantImpedance(float newQConstantImpedance) {
		float oldQConstantImpedance = qConstantImpedance;
		qConstantImpedance = newQConstantImpedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE, oldQConstantImpedance, qConstantImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQFrequencyExponent() {
		return qFrequencyExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQFrequencyExponent(float newQFrequencyExponent) {
		float oldQFrequencyExponent = qFrequencyExponent;
		qFrequencyExponent = newQFrequencyExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT, oldQFrequencyExponent, qFrequencyExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPFrequencyExponent() {
		return pFrequencyExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPFrequencyExponent(float newPFrequencyExponent) {
		float oldPFrequencyExponent = pFrequencyExponent;
		pFrequencyExponent = newPFrequencyExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT, oldPFrequencyExponent, pFrequencyExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPConstantImpedance() {
		return pConstantImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPConstantImpedance(float newPConstantImpedance) {
		float oldPConstantImpedance = pConstantImpedance;
		pConstantImpedance = newPConstantImpedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE, oldPConstantImpedance, pConstantImpedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQVoltageExponent() {
		return qVoltageExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQVoltageExponent(float newQVoltageExponent) {
		float oldQVoltageExponent = qVoltageExponent;
		qVoltageExponent = newQVoltageExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT, oldQVoltageExponent, qVoltageExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPVoltageExponent() {
		return pVoltageExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPVoltageExponent(float newPVoltageExponent) {
		float oldPVoltageExponent = pVoltageExponent;
		pVoltageExponent = newPVoltageExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT, oldPVoltageExponent, pVoltageExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyConsumer> getEnergyConsumer() {
		if (energyConsumer == null) {
			energyConsumer = new EObjectWithInverseResolvingEList<EnergyConsumer>(EnergyConsumer.class, this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE);
		}
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQConstantCurrent() {
		return qConstantCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQConstantCurrent(float newQConstantCurrent) {
		float oldQConstantCurrent = qConstantCurrent;
		qConstantCurrent = newQConstantCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT, oldQConstantCurrent, qConstantCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPConstantPower() {
		return pConstantPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPConstantPower(float newPConstantPower) {
		float oldPConstantPower = pConstantPower;
		pConstantPower = newPConstantPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER, oldPConstantPower, pConstantPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQConstantPower() {
		return qConstantPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQConstantPower(float newQConstantPower) {
		float oldQConstantPower = qConstantPower;
		qConstantPower = newQConstantPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER, oldQConstantPower, qConstantPower));
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumer()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return ((InternalEList<?>)getEnergyConsumer()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				return isExponentModel();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				return getPConstantCurrent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				return getQConstantImpedance();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				return getQFrequencyExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				return getPFrequencyExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				return getPConstantImpedance();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				return getQVoltageExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				return getPVoltageExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return getEnergyConsumer();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				return getQConstantCurrent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				return getPConstantPower();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				return getQConstantPower();
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				setExponentModel((Boolean)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				setPConstantCurrent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				setQConstantImpedance((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				setQFrequencyExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				setPFrequencyExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				setPConstantImpedance((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				setQVoltageExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				setPVoltageExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				getEnergyConsumer().clear();
				getEnergyConsumer().addAll((Collection<? extends EnergyConsumer>)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				setQConstantCurrent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				setPConstantPower((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				setQConstantPower((Float)newValue);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				setExponentModel(EXPONENT_MODEL_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				setPConstantCurrent(PCONSTANT_CURRENT_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				setQConstantImpedance(QCONSTANT_IMPEDANCE_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				setQFrequencyExponent(QFREQUENCY_EXPONENT_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				setPFrequencyExponent(PFREQUENCY_EXPONENT_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				setPConstantImpedance(PCONSTANT_IMPEDANCE_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				setQVoltageExponent(QVOLTAGE_EXPONENT_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				setPVoltageExponent(PVOLTAGE_EXPONENT_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				getEnergyConsumer().clear();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				setQConstantCurrent(QCONSTANT_CURRENT_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				setPConstantPower(PCONSTANT_POWER_EDEFAULT);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				setQConstantPower(QCONSTANT_POWER_EDEFAULT);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				return exponentModel != EXPONENT_MODEL_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				return pConstantCurrent != PCONSTANT_CURRENT_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				return qConstantImpedance != QCONSTANT_IMPEDANCE_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				return qFrequencyExponent != QFREQUENCY_EXPONENT_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				return pFrequencyExponent != PFREQUENCY_EXPONENT_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				return pConstantImpedance != PCONSTANT_IMPEDANCE_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				return qVoltageExponent != QVOLTAGE_EXPONENT_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				return pVoltageExponent != PVOLTAGE_EXPONENT_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return energyConsumer != null && !energyConsumer.isEmpty();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				return qConstantCurrent != QCONSTANT_CURRENT_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				return pConstantPower != PCONSTANT_POWER_EDEFAULT;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				return qConstantPower != QCONSTANT_POWER_EDEFAULT;
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
		result.append(" (exponentModel: ");
		result.append(exponentModel);
		result.append(", pConstantCurrent: ");
		result.append(pConstantCurrent);
		result.append(", qConstantImpedance: ");
		result.append(qConstantImpedance);
		result.append(", qFrequencyExponent: ");
		result.append(qFrequencyExponent);
		result.append(", pFrequencyExponent: ");
		result.append(pFrequencyExponent);
		result.append(", pConstantImpedance: ");
		result.append(pConstantImpedance);
		result.append(", qVoltageExponent: ");
		result.append(qVoltageExponent);
		result.append(", pVoltageExponent: ");
		result.append(pVoltageExponent);
		result.append(", qConstantCurrent: ");
		result.append(qConstantCurrent);
		result.append(", pConstantPower: ");
		result.append(pConstantPower);
		result.append(", qConstantPower: ");
		result.append(qConstantPower);
		result.append(')');
		return result.toString();
	}

} //LoadResponseCharacteristicImpl
