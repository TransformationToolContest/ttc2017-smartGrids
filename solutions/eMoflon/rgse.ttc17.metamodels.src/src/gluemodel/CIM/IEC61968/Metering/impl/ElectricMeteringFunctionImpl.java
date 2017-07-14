/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61970.Informative.InfMetering.InfMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electric Metering Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#isDemandMultiplierApplied <em>Demand Multiplier Applied</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getTransformerCTRatio <em>Transformer CT Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getBillingMultiplier <em>Billing Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getMeteringFunctionConfiguration <em>Metering Function Configuration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getCurrentRating <em>Current Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#isTransformerRatiosApplied <em>Transformer Ratios Applied</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getKWMultiplier <em>KW Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#isBillingMultiplierApplied <em>Billing Multiplier Applied</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getDemandMultiplier <em>Demand Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getKWhMultiplier <em>KWh Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getTransformerVTRatio <em>Transformer VT Ratio</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl#getVoltageRating <em>Voltage Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricMeteringFunctionImpl extends DeviceFunctionImpl implements ElectricMeteringFunction {
	/**
	 * The default value of the '{@link #isDemandMultiplierApplied() <em>Demand Multiplier Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDemandMultiplierApplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEMAND_MULTIPLIER_APPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDemandMultiplierApplied() <em>Demand Multiplier Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDemandMultiplierApplied()
	 * @generated
	 * @ordered
	 */
	protected boolean demandMultiplierApplied = DEMAND_MULTIPLIER_APPLIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerCTRatio() <em>Transformer CT Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerCTRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSFORMER_CT_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransformerCTRatio() <em>Transformer CT Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerCTRatio()
	 * @generated
	 * @ordered
	 */
	protected float transformerCTRatio = TRANSFORMER_CT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingMultiplier() <em>Billing Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final float BILLING_MULTIPLIER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBillingMultiplier() <em>Billing Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingMultiplier()
	 * @generated
	 * @ordered
	 */
	protected float billingMultiplier = BILLING_MULTIPLIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeteringFunctionConfiguration() <em>Metering Function Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeteringFunctionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected MeteringFunctionConfiguration meteringFunctionConfiguration;

	/**
	 * The default value of the '{@link #getCurrentRating() <em>Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentRating() <em>Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRating()
	 * @generated
	 * @ordered
	 */
	protected float currentRating = CURRENT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransformerRatiosApplied() <em>Transformer Ratios Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransformerRatiosApplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSFORMER_RATIOS_APPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransformerRatiosApplied() <em>Transformer Ratios Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransformerRatiosApplied()
	 * @generated
	 * @ordered
	 */
	protected boolean transformerRatiosApplied = TRANSFORMER_RATIOS_APPLIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKWMultiplier() <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final int KW_MULTIPLIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKWMultiplier() <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWMultiplier()
	 * @generated
	 * @ordered
	 */
	protected int kWMultiplier = KW_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isBillingMultiplierApplied() <em>Billing Multiplier Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBillingMultiplierApplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BILLING_MULTIPLIER_APPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBillingMultiplierApplied() <em>Billing Multiplier Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBillingMultiplierApplied()
	 * @generated
	 * @ordered
	 */
	protected boolean billingMultiplierApplied = BILLING_MULTIPLIER_APPLIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemandMultiplier() <em>Demand Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final float DEMAND_MULTIPLIER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDemandMultiplier() <em>Demand Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandMultiplier()
	 * @generated
	 * @ordered
	 */
	protected float demandMultiplier = DEMAND_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKWhMultiplier() <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWhMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final int KWH_MULTIPLIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKWhMultiplier() <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWhMultiplier()
	 * @generated
	 * @ordered
	 */
	protected int kWhMultiplier = KWH_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformerVTRatio() <em>Transformer VT Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerVTRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSFORMER_VT_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransformerVTRatio() <em>Transformer VT Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerVTRatio()
	 * @generated
	 * @ordered
	 */
	protected float transformerVTRatio = TRANSFORMER_VT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageRating() <em>Voltage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageRating()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageRating() <em>Voltage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageRating()
	 * @generated
	 * @ordered
	 */
	protected float voltageRating = VOLTAGE_RATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricMeteringFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.ELECTRIC_METERING_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDemandMultiplierApplied() {
		return demandMultiplierApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandMultiplierApplied(boolean newDemandMultiplierApplied) {
		boolean oldDemandMultiplierApplied = demandMultiplierApplied;
		demandMultiplierApplied = newDemandMultiplierApplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED, oldDemandMultiplierApplied, demandMultiplierApplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransformerCTRatio() {
		return transformerCTRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerCTRatio(float newTransformerCTRatio) {
		float oldTransformerCTRatio = transformerCTRatio;
		transformerCTRatio = newTransformerCTRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO, oldTransformerCTRatio, transformerCTRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBillingMultiplier() {
		return billingMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingMultiplier(float newBillingMultiplier) {
		float oldBillingMultiplier = billingMultiplier;
		billingMultiplier = newBillingMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER, oldBillingMultiplier, billingMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringFunctionConfiguration getMeteringFunctionConfiguration() {
		if (meteringFunctionConfiguration != null && meteringFunctionConfiguration.eIsProxy()) {
			InternalEObject oldMeteringFunctionConfiguration = (InternalEObject)meteringFunctionConfiguration;
			meteringFunctionConfiguration = (MeteringFunctionConfiguration)eResolveProxy(oldMeteringFunctionConfiguration);
			if (meteringFunctionConfiguration != oldMeteringFunctionConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION, oldMeteringFunctionConfiguration, meteringFunctionConfiguration));
			}
		}
		return meteringFunctionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringFunctionConfiguration basicGetMeteringFunctionConfiguration() {
		return meteringFunctionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeteringFunctionConfiguration(MeteringFunctionConfiguration newMeteringFunctionConfiguration, NotificationChain msgs) {
		MeteringFunctionConfiguration oldMeteringFunctionConfiguration = meteringFunctionConfiguration;
		meteringFunctionConfiguration = newMeteringFunctionConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION, oldMeteringFunctionConfiguration, newMeteringFunctionConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeteringFunctionConfiguration(MeteringFunctionConfiguration newMeteringFunctionConfiguration) {
		if (newMeteringFunctionConfiguration != meteringFunctionConfiguration) {
			NotificationChain msgs = null;
			if (meteringFunctionConfiguration != null)
				msgs = ((InternalEObject)meteringFunctionConfiguration).eInverseRemove(this, InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS, MeteringFunctionConfiguration.class, msgs);
			if (newMeteringFunctionConfiguration != null)
				msgs = ((InternalEObject)newMeteringFunctionConfiguration).eInverseAdd(this, InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS, MeteringFunctionConfiguration.class, msgs);
			msgs = basicSetMeteringFunctionConfiguration(newMeteringFunctionConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION, newMeteringFunctionConfiguration, newMeteringFunctionConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentRating() {
		return currentRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentRating(float newCurrentRating) {
		float oldCurrentRating = currentRating;
		currentRating = newCurrentRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__CURRENT_RATING, oldCurrentRating, currentRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransformerRatiosApplied() {
		return transformerRatiosApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerRatiosApplied(boolean newTransformerRatiosApplied) {
		boolean oldTransformerRatiosApplied = transformerRatiosApplied;
		transformerRatiosApplied = newTransformerRatiosApplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED, oldTransformerRatiosApplied, transformerRatiosApplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKWMultiplier() {
		return kWMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKWMultiplier(int newKWMultiplier) {
		int oldKWMultiplier = kWMultiplier;
		kWMultiplier = newKWMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER, oldKWMultiplier, kWMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBillingMultiplierApplied() {
		return billingMultiplierApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingMultiplierApplied(boolean newBillingMultiplierApplied) {
		boolean oldBillingMultiplierApplied = billingMultiplierApplied;
		billingMultiplierApplied = newBillingMultiplierApplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED, oldBillingMultiplierApplied, billingMultiplierApplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDemandMultiplier() {
		return demandMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandMultiplier(float newDemandMultiplier) {
		float oldDemandMultiplier = demandMultiplier;
		demandMultiplier = newDemandMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER, oldDemandMultiplier, demandMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKWhMultiplier() {
		return kWhMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKWhMultiplier(int newKWhMultiplier) {
		int oldKWhMultiplier = kWhMultiplier;
		kWhMultiplier = newKWhMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER, oldKWhMultiplier, kWhMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransformerVTRatio() {
		return transformerVTRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerVTRatio(float newTransformerVTRatio) {
		float oldTransformerVTRatio = transformerVTRatio;
		transformerVTRatio = newTransformerVTRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO, oldTransformerVTRatio, transformerVTRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltageRating() {
		return voltageRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageRating(float newVoltageRating) {
		float oldVoltageRating = voltageRating;
		voltageRating = newVoltageRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING, oldVoltageRating, voltageRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION:
				if (meteringFunctionConfiguration != null)
					msgs = ((InternalEObject)meteringFunctionConfiguration).eInverseRemove(this, InfMeteringPackage.METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS, MeteringFunctionConfiguration.class, msgs);
				return basicSetMeteringFunctionConfiguration((MeteringFunctionConfiguration)otherEnd, msgs);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION:
				return basicSetMeteringFunctionConfiguration(null, msgs);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED:
				return isDemandMultiplierApplied();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO:
				return getTransformerCTRatio();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				return getBillingMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION:
				if (resolve) return getMeteringFunctionConfiguration();
				return basicGetMeteringFunctionConfiguration();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CURRENT_RATING:
				return getCurrentRating();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED:
				return isTransformerRatiosApplied();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				return getKWMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED:
				return isBillingMultiplierApplied();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				return getDemandMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				return getKWhMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO:
				return getTransformerVTRatio();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING:
				return getVoltageRating();
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED:
				setDemandMultiplierApplied((Boolean)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO:
				setTransformerCTRatio((Float)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				setBillingMultiplier((Float)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION:
				setMeteringFunctionConfiguration((MeteringFunctionConfiguration)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CURRENT_RATING:
				setCurrentRating((Float)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED:
				setTransformerRatiosApplied((Boolean)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				setKWMultiplier((Integer)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED:
				setBillingMultiplierApplied((Boolean)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				setDemandMultiplier((Float)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				setKWhMultiplier((Integer)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO:
				setTransformerVTRatio((Float)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING:
				setVoltageRating((Float)newValue);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED:
				setDemandMultiplierApplied(DEMAND_MULTIPLIER_APPLIED_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO:
				setTransformerCTRatio(TRANSFORMER_CT_RATIO_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				setBillingMultiplier(BILLING_MULTIPLIER_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION:
				setMeteringFunctionConfiguration((MeteringFunctionConfiguration)null);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CURRENT_RATING:
				setCurrentRating(CURRENT_RATING_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED:
				setTransformerRatiosApplied(TRANSFORMER_RATIOS_APPLIED_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				setKWMultiplier(KW_MULTIPLIER_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED:
				setBillingMultiplierApplied(BILLING_MULTIPLIER_APPLIED_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				setDemandMultiplier(DEMAND_MULTIPLIER_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				setKWhMultiplier(KWH_MULTIPLIER_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO:
				setTransformerVTRatio(TRANSFORMER_VT_RATIO_EDEFAULT);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING:
				setVoltageRating(VOLTAGE_RATING_EDEFAULT);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED:
				return demandMultiplierApplied != DEMAND_MULTIPLIER_APPLIED_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO:
				return transformerCTRatio != TRANSFORMER_CT_RATIO_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				return billingMultiplier != BILLING_MULTIPLIER_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION:
				return meteringFunctionConfiguration != null;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CURRENT_RATING:
				return currentRating != CURRENT_RATING_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED:
				return transformerRatiosApplied != TRANSFORMER_RATIOS_APPLIED_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				return kWMultiplier != KW_MULTIPLIER_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED:
				return billingMultiplierApplied != BILLING_MULTIPLIER_APPLIED_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				return demandMultiplier != DEMAND_MULTIPLIER_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				return kWhMultiplier != KWH_MULTIPLIER_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO:
				return transformerVTRatio != TRANSFORMER_VT_RATIO_EDEFAULT;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING:
				return voltageRating != VOLTAGE_RATING_EDEFAULT;
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
		result.append(" (demandMultiplierApplied: ");
		result.append(demandMultiplierApplied);
		result.append(", transformerCTRatio: ");
		result.append(transformerCTRatio);
		result.append(", billingMultiplier: ");
		result.append(billingMultiplier);
		result.append(", currentRating: ");
		result.append(currentRating);
		result.append(", transformerRatiosApplied: ");
		result.append(transformerRatiosApplied);
		result.append(", kWMultiplier: ");
		result.append(kWMultiplier);
		result.append(", billingMultiplierApplied: ");
		result.append(billingMultiplierApplied);
		result.append(", demandMultiplier: ");
		result.append(demandMultiplier);
		result.append(", kWhMultiplier: ");
		result.append(kWhMultiplier);
		result.append(", transformerVTRatio: ");
		result.append(transformerVTRatio);
		result.append(", voltageRating: ");
		result.append(voltageRating);
		result.append(')');
		return result.toString();
	}

} //ElectricMeteringFunctionImpl
