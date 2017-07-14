/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.impl.AssetModelImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerSwitchingKind;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset;

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
 * An implementation of the model object '<em><b>Tap Changer Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getHighStep <em>High Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getTapCount <em>Tap Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getTapChangerAssets <em>Tap Changer Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getSwitchingKind <em>Switching Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getStepPhaseIncrement <em>Step Phase Increment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.TapChangerAssetModelImpl#getBil <em>Bil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerAssetModelImpl extends AssetModelImpl implements TapChangerAssetModel {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected float frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGH_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected int highStep = HIGH_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseCount = PHASE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTapCount() <em>Tap Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TAP_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTapCount() <em>Tap Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapCount()
	 * @generated
	 * @ordered
	 */
	protected int tapCount = TAP_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTapChangerAssets() <em>Tap Changer Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChangerAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TapChangerAsset> tapChangerAssets;

	/**
	 * The default value of the '{@link #getRatedApparentPower() <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedApparentPower()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_APPARENT_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedApparentPower() <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedApparentPower()
	 * @generated
	 * @ordered
	 */
	protected float ratedApparentPower = RATED_APPARENT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NEUTRAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected int neutralStep = NEUTRAL_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected static final int LOW_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected int lowStep = LOW_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected float initialDelay = INITIAL_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_VOLTAGE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchingKind() <em>Switching Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingKind()
	 * @generated
	 * @ordered
	 */
	protected static final TapChangerSwitchingKind SWITCHING_KIND_EDEFAULT = TapChangerSwitchingKind.RESISTIVE;

	/**
	 * The cached value of the '{@link #getSwitchingKind() <em>Switching Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingKind()
	 * @generated
	 * @ordered
	 */
	protected TapChangerSwitchingKind switchingKind = SWITCHING_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float SUBSEQUENT_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentDelay()
	 * @generated
	 * @ordered
	 */
	protected float subsequentDelay = SUBSEQUENT_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepPhaseIncrement() <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_PHASE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepPhaseIncrement() <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepPhaseIncrement = STEP_PHASE_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBil() <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBil()
	 * @generated
	 * @ordered
	 */
	protected static final float BIL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBil() <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBil()
	 * @generated
	 * @ordered
	 */
	protected float bil = BIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChangerAssetModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.TAP_CHANGER_ASSET_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		float oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedVoltage() {
		return ratedVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedVoltage(float newRatedVoltage) {
		float oldRatedVoltage = ratedVoltage;
		ratedVoltage = newRatedVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHighStep() {
		return highStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighStep(int newHighStep) {
		int oldHighStep = highStep;
		highStep = newHighStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__HIGH_STEP, oldHighStep, highStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		float oldRatedCurrent = ratedCurrent;
		ratedCurrent = newRatedCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhaseCount() {
		return phaseCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCount(int newPhaseCount) {
		int oldPhaseCount = phaseCount;
		phaseCount = newPhaseCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__PHASE_COUNT, oldPhaseCount, phaseCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTapCount() {
		return tapCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapCount(int newTapCount) {
		int oldTapCount = tapCount;
		tapCount = newTapCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_COUNT, oldTapCount, tapCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TapChangerAsset> getTapChangerAssets() {
		if (tapChangerAssets == null) {
			tapChangerAssets = new EObjectWithInverseResolvingEList<TapChangerAsset>(TapChangerAsset.class, this, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS, InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL);
		}
		return tapChangerAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedApparentPower() {
		return ratedApparentPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedApparentPower(float newRatedApparentPower) {
		float oldRatedApparentPower = ratedApparentPower;
		ratedApparentPower = newRatedApparentPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER, oldRatedApparentPower, ratedApparentPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeutralStep() {
		return neutralStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralStep(int newNeutralStep) {
		int oldNeutralStep = neutralStep;
		neutralStep = newNeutralStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP, oldNeutralStep, neutralStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowStep() {
		return lowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowStep(int newLowStep) {
		int oldLowStep = lowStep;
		lowStep = newLowStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__LOW_STEP, oldLowStep, lowStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInitialDelay() {
		return initialDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDelay(float newInitialDelay) {
		float oldInitialDelay = initialDelay;
		initialDelay = newInitialDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY, oldInitialDelay, initialDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStepVoltageIncrement() {
		return stepVoltageIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepVoltageIncrement(float newStepVoltageIncrement) {
		float oldStepVoltageIncrement = stepVoltageIncrement;
		stepVoltageIncrement = newStepVoltageIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT, oldStepVoltageIncrement, stepVoltageIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerSwitchingKind getSwitchingKind() {
		return switchingKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchingKind(TapChangerSwitchingKind newSwitchingKind) {
		TapChangerSwitchingKind oldSwitchingKind = switchingKind;
		switchingKind = newSwitchingKind == null ? SWITCHING_KIND_EDEFAULT : newSwitchingKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND, oldSwitchingKind, switchingKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSubsequentDelay() {
		return subsequentDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsequentDelay(float newSubsequentDelay) {
		float oldSubsequentDelay = subsequentDelay;
		subsequentDelay = newSubsequentDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY, oldSubsequentDelay, subsequentDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStepPhaseIncrement() {
		return stepPhaseIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepPhaseIncrement(float newStepPhaseIncrement) {
		float oldStepPhaseIncrement = stepPhaseIncrement;
		stepPhaseIncrement = newStepPhaseIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT, oldStepPhaseIncrement, stepPhaseIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBil() {
		return bil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBil(float newBil) {
		float oldBil = bil;
		bil = newBil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__BIL, oldBil, bil));
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
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChangerAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS:
				return ((InternalEList<?>)getTapChangerAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__FREQUENCY:
				return getFrequency();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE:
				return getRatedVoltage();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__HIGH_STEP:
				return getHighStep();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_CURRENT:
				return getRatedCurrent();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__PHASE_COUNT:
				return getPhaseCount();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_COUNT:
				return getTapCount();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS:
				return getTapChangerAssets();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER:
				return getRatedApparentPower();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP:
				return getNeutralStep();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__LOW_STEP:
				return getLowStep();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY:
				return getInitialDelay();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT:
				return getStepVoltageIncrement();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND:
				return getSwitchingKind();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY:
				return getSubsequentDelay();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT:
				return getStepPhaseIncrement();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__BIL:
				return getBil();
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
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__HIGH_STEP:
				setHighStep((Integer)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_COUNT:
				setTapCount((Integer)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS:
				getTapChangerAssets().clear();
				getTapChangerAssets().addAll((Collection<? extends TapChangerAsset>)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER:
				setRatedApparentPower((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP:
				setNeutralStep((Integer)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__LOW_STEP:
				setLowStep((Integer)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY:
				setInitialDelay((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND:
				setSwitchingKind((TapChangerSwitchingKind)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY:
				setSubsequentDelay((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT:
				setStepPhaseIncrement((Float)newValue);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__BIL:
				setBil((Float)newValue);
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
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE:
				setRatedVoltage(RATED_VOLTAGE_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__HIGH_STEP:
				setHighStep(HIGH_STEP_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__PHASE_COUNT:
				setPhaseCount(PHASE_COUNT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_COUNT:
				setTapCount(TAP_COUNT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS:
				getTapChangerAssets().clear();
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER:
				setRatedApparentPower(RATED_APPARENT_POWER_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP:
				setNeutralStep(NEUTRAL_STEP_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__LOW_STEP:
				setLowStep(LOW_STEP_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY:
				setInitialDelay(INITIAL_DELAY_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement(STEP_VOLTAGE_INCREMENT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND:
				setSwitchingKind(SWITCHING_KIND_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY:
				setSubsequentDelay(SUBSEQUENT_DELAY_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT:
				setStepPhaseIncrement(STEP_PHASE_INCREMENT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__BIL:
				setBil(BIL_EDEFAULT);
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
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_VOLTAGE:
				return ratedVoltage != RATED_VOLTAGE_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__HIGH_STEP:
				return highStep != HIGH_STEP_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__PHASE_COUNT:
				return phaseCount != PHASE_COUNT_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_COUNT:
				return tapCount != TAP_COUNT_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS:
				return tapChangerAssets != null && !tapChangerAssets.isEmpty();
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__RATED_APPARENT_POWER:
				return ratedApparentPower != RATED_APPARENT_POWER_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__NEUTRAL_STEP:
				return neutralStep != NEUTRAL_STEP_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__LOW_STEP:
				return lowStep != LOW_STEP_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__INITIAL_DELAY:
				return initialDelay != INITIAL_DELAY_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_VOLTAGE_INCREMENT:
				return stepVoltageIncrement != STEP_VOLTAGE_INCREMENT_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SWITCHING_KIND:
				return switchingKind != SWITCHING_KIND_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__SUBSEQUENT_DELAY:
				return subsequentDelay != SUBSEQUENT_DELAY_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__STEP_PHASE_INCREMENT:
				return stepPhaseIncrement != STEP_PHASE_INCREMENT_EDEFAULT;
			case InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__BIL:
				return bil != BIL_EDEFAULT;
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", ratedVoltage: ");
		result.append(ratedVoltage);
		result.append(", highStep: ");
		result.append(highStep);
		result.append(", ratedCurrent: ");
		result.append(ratedCurrent);
		result.append(", phaseCount: ");
		result.append(phaseCount);
		result.append(", tapCount: ");
		result.append(tapCount);
		result.append(", ratedApparentPower: ");
		result.append(ratedApparentPower);
		result.append(", neutralStep: ");
		result.append(neutralStep);
		result.append(", lowStep: ");
		result.append(lowStep);
		result.append(", initialDelay: ");
		result.append(initialDelay);
		result.append(", stepVoltageIncrement: ");
		result.append(stepVoltageIncrement);
		result.append(", switchingKind: ");
		result.append(switchingKind);
		result.append(", subsequentDelay: ");
		result.append(subsequentDelay);
		result.append(", stepPhaseIncrement: ");
		result.append(stepPhaseIncrement);
		result.append(", bil: ");
		result.append(bil);
		result.append(')');
		return result.toString();
	}

} //TapChangerAssetModelImpl
