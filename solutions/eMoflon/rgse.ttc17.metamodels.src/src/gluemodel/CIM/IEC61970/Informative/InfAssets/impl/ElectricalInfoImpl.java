/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

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
 * An implementation of the model object '<em><b>Electrical Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getWireCount <em>Wire Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getB0 <em>B0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getElectricalAssetModels <em>Electrical Asset Models</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getBil <em>Bil</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getElectricalAssets <em>Electrical Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getG <em>G</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.ElectricalInfoImpl#getElectricalTypeAssets <em>Electrical Type Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalInfoImpl extends AssetInfoImpl implements ElectricalInfo {
	/**
	 * The default value of the '{@link #getWireCount() <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireCount()
	 * @generated
	 * @ordered
	 */
	protected static final int WIRE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWireCount() <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireCount()
	 * @generated
	 * @ordered
	 */
	protected int wireCount = WIRE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnected = IS_CONNECTED_EDEFAULT;

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
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected float b0 = B0_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectricalAssetModels() <em>Electrical Asset Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalAssetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalAssetModel> electricalAssetModels;

	/**
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

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
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected float g0 = G0_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getElectricalAssets() <em>Electrical Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalAsset> electricalAssets;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

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
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final float G_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected float g = G_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

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
	 * The cached value of the '{@link #getElectricalTypeAssets() <em>Electrical Type Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalTypeAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalTypeAsset> electricalTypeAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getElectricalInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWireCount() {
		return wireCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireCount(int newWireCount) {
		int oldWireCount = wireCount;
		wireCount = newWireCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT, oldWireCount, wireCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConnected() {
		return isConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConnected(boolean newIsConnected) {
		boolean oldIsConnected = isConnected;
		isConnected = newIsConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED, oldIsConnected, isConnected));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB0() {
		return b0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB0(float newB0) {
		float oldB0 = b0;
		b0 = newB0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__B0, oldB0, b0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalAssetModel> getElectricalAssetModels() {
		if (electricalAssetModels == null) {
			electricalAssetModels = new EObjectWithInverseResolvingEList.ManyInverse<ElectricalAssetModel>(ElectricalAssetModel.class, this, InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS, InfAssetModelsPackage.ELECTRICAL_ASSET_MODEL__ELECTRICAL_INFOS);
		}
		return electricalAssetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR0(float newR0) {
		float oldR0 = r0;
		r0 = newR0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__R0, oldR0, r0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__BIL, oldBil, bil));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT, oldPhaseCount, phaseCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0(float newX0) {
		float oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG0() {
		return g0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG0(float newG0) {
		float oldG0 = g0;
		g0 = newG0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__G0, oldG0, g0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		PhaseCode oldPhaseCode = phaseCode;
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE, oldPhaseCode, phaseCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalAsset> getElectricalAssets() {
		if (electricalAssets == null) {
			electricalAssets = new EObjectWithInverseResolvingEList.ManyInverse<ElectricalAsset>(ElectricalAsset.class, this, InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS, InfAssetsPackage.ELECTRICAL_ASSET__ELECTRICAL_INFOS);
		}
		return electricalAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(float newR) {
		float oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__R, oldR, r));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER, oldRatedApparentPower, ratedApparentPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(float newG) {
		float oldG = g;
		g = newG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(float newB) {
		float oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__B, oldB, b));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalTypeAsset> getElectricalTypeAssets() {
		if (electricalTypeAssets == null) {
			electricalTypeAssets = new EObjectWithInverseResolvingEList.ManyInverse<ElectricalTypeAsset>(ElectricalTypeAsset.class, this, InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS, InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS);
		}
		return electricalTypeAssets;
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
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalAssetModels()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalAssets()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalTypeAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS:
				return ((InternalEList<?>)getElectricalAssetModels()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS:
				return ((InternalEList<?>)getElectricalAssets()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS:
				return ((InternalEList<?>)getElectricalTypeAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				return getWireCount();
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				return isIsConnected();
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				return getFrequency();
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				return getB0();
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS:
				return getElectricalAssetModels();
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				return getR0();
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				return getBil();
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				return getPhaseCount();
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				return getX0();
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				return getG0();
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				return getPhaseCode();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				return getRatedCurrent();
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS:
				return getElectricalAssets();
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				return getX();
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				return getR();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				return getRatedApparentPower();
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				return getG();
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				return getB();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				return getRatedVoltage();
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS:
				return getElectricalTypeAssets();
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
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				setWireCount((Integer)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				setB0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS:
				getElectricalAssetModels().clear();
				getElectricalAssetModels().addAll((Collection<? extends ElectricalAssetModel>)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				setR0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				setBil((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				setX0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				setG0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS:
				getElectricalAssets().clear();
				getElectricalAssets().addAll((Collection<? extends ElectricalAsset>)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				setX((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				setR((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				setRatedApparentPower((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				setG((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				setB((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS:
				getElectricalTypeAssets().clear();
				getElectricalTypeAssets().addAll((Collection<? extends ElectricalTypeAsset>)newValue);
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
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				setWireCount(WIRE_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				setIsConnected(IS_CONNECTED_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				setB0(B0_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS:
				getElectricalAssetModels().clear();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				setR0(R0_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				setBil(BIL_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				setPhaseCount(PHASE_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				setX0(X0_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				setG0(G0_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				setPhaseCode(PHASE_CODE_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS:
				getElectricalAssets().clear();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				setX(X_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				setR(R_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				setRatedApparentPower(RATED_APPARENT_POWER_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				setG(G_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				setB(B_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				setRatedVoltage(RATED_VOLTAGE_EDEFAULT);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS:
				getElectricalTypeAssets().clear();
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
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				return wireCount != WIRE_COUNT_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				return isConnected != IS_CONNECTED_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				return b0 != B0_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSET_MODELS:
				return electricalAssetModels != null && !electricalAssetModels.isEmpty();
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				return r0 != R0_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				return bil != BIL_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				return phaseCount != PHASE_COUNT_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				return x0 != X0_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				return g0 != G0_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				return phaseCode != PHASE_CODE_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_ASSETS:
				return electricalAssets != null && !electricalAssets.isEmpty();
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				return x != X_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				return r != R_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				return ratedApparentPower != RATED_APPARENT_POWER_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				return g != G_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				return b != B_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				return ratedVoltage != RATED_VOLTAGE_EDEFAULT;
			case InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS:
				return electricalTypeAssets != null && !electricalTypeAssets.isEmpty();
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
		result.append(" (wireCount: ");
		result.append(wireCount);
		result.append(", isConnected: ");
		result.append(isConnected);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", b0: ");
		result.append(b0);
		result.append(", r0: ");
		result.append(r0);
		result.append(", bil: ");
		result.append(bil);
		result.append(", phaseCount: ");
		result.append(phaseCount);
		result.append(", x0: ");
		result.append(x0);
		result.append(", g0: ");
		result.append(g0);
		result.append(", phaseCode: ");
		result.append(phaseCode);
		result.append(", ratedCurrent: ");
		result.append(ratedCurrent);
		result.append(", x: ");
		result.append(x);
		result.append(", r: ");
		result.append(r);
		result.append(", ratedApparentPower: ");
		result.append(ratedApparentPower);
		result.append(", g: ");
		result.append(g);
		result.append(", b: ");
		result.append(b);
		result.append(", ratedVoltage: ");
		result.append(ratedVoltage);
		result.append(')');
		return result.toString();
	}

} //ElectricalInfoImpl
