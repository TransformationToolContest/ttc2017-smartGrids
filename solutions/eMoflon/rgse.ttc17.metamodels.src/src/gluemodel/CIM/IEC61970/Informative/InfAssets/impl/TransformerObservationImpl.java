/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation;
import gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation;

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
 * An implementation of the model object '<em><b>Transformer Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getOilIFT <em>Oil IFT</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getHotSpotTemp <em>Hot Spot Temp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getOilDielectricStrength <em>Oil Dielectric Strength</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getTransformerAsset <em>Transformer Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getTopOilTemp <em>Top Oil Temp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getPumpVibration <em>Pump Vibration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getBushingTemp <em>Bushing Temp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getWaterContent <em>Water Content</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getFreqResp <em>Freq Resp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getFurfuralDP <em>Furfural DP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getOilLevel <em>Oil Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getOilColor <em>Oil Color</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getWindingInsulationPFs <em>Winding Insulation PFs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getDga <em>Dga</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TransformerObservationImpl#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerObservationImpl extends IdentifiedObjectImpl implements TransformerObservation {
	/**
	 * The default value of the '{@link #getOilIFT() <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilIFT()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_IFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilIFT() <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilIFT()
	 * @generated
	 * @ordered
	 */
	protected String oilIFT = OIL_IFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotSpotTemp() <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpotTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_SPOT_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotSpotTemp() <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpotTemp()
	 * @generated
	 * @ordered
	 */
	protected float hotSpotTemp = HOT_SPOT_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOilDielectricStrength() <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected static final float OIL_DIELECTRIC_STRENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOilDielectricStrength() <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected float oilDielectricStrength = OIL_DIELECTRIC_STRENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerAsset() <em>Transformer Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAsset()
	 * @generated
	 * @ordered
	 */
	protected TransformerAsset transformerAsset;

	/**
	 * The default value of the '{@link #getTopOilTemp() <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOilTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float TOP_OIL_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTopOilTemp() <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOilTemp()
	 * @generated
	 * @ordered
	 */
	protected float topOilTemp = TOP_OIL_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPumpVibration() <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpVibration()
	 * @generated
	 * @ordered
	 */
	protected static final String PUMP_VIBRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPumpVibration() <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpVibration()
	 * @generated
	 * @ordered
	 */
	protected String pumpVibration = PUMP_VIBRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBushingTemp() <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float BUSHING_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBushingTemp() <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingTemp()
	 * @generated
	 * @ordered
	 */
	protected float bushingTemp = BUSHING_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaterContent() <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterContent()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaterContent() <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterContent()
	 * @generated
	 * @ordered
	 */
	protected String waterContent = WATER_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected DistributionTransformer transformer;

	/**
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The default value of the '{@link #getFreqResp() <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqResp()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQ_RESP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreqResp() <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqResp()
	 * @generated
	 * @ordered
	 */
	protected String freqResp = FREQ_RESP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFurfuralDP() <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurfuralDP()
	 * @generated
	 * @ordered
	 */
	protected static final String FURFURAL_DP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFurfuralDP() <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurfuralDP()
	 * @generated
	 * @ordered
	 */
	protected String furfuralDP = FURFURAL_DP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBushingInsultationPFs() <em>Bushing Insultation PFs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInsultationPFs()
	 * @generated
	 * @ordered
	 */
	protected EList<BushingInsulationPF> bushingInsultationPFs;

	/**
	 * The default value of the '{@link #getOilLevel() <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilLevel() <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilLevel()
	 * @generated
	 * @ordered
	 */
	protected String oilLevel = OIL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOilColor() <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilColor()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilColor() <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilColor()
	 * @generated
	 * @ordered
	 */
	protected String oilColor = OIL_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindingInsulationPFs() <em>Winding Insulation PFs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulationPFs()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> windingInsulationPFs;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getDga() <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDga()
	 * @generated
	 * @ordered
	 */
	protected static final String DGA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDga() <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDga()
	 * @generated
	 * @ordered
	 */
	protected String dga = DGA_EDEFAULT;

	/**
	 * The default value of the '{@link #getOilNeutralizationNumber() <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilNeutralizationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_NEUTRALIZATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilNeutralizationNumber() <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilNeutralizationNumber()
	 * @generated
	 * @ordered
	 */
	protected String oilNeutralizationNumber = OIL_NEUTRALIZATION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTransformerObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOilIFT() {
		return oilIFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilIFT(String newOilIFT) {
		String oldOilIFT = oilIFT;
		oilIFT = newOilIFT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT, oldOilIFT, oilIFT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHotSpotTemp() {
		return hotSpotTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotSpotTemp(float newHotSpotTemp) {
		float oldHotSpotTemp = hotSpotTemp;
		hotSpotTemp = newHotSpotTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP, oldHotSpotTemp, hotSpotTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOilDielectricStrength() {
		return oilDielectricStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilDielectricStrength(float newOilDielectricStrength) {
		float oldOilDielectricStrength = oilDielectricStrength;
		oilDielectricStrength = newOilDielectricStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH, oldOilDielectricStrength, oilDielectricStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAsset getTransformerAsset() {
		if (transformerAsset != null && transformerAsset.eIsProxy()) {
			InternalEObject oldTransformerAsset = (InternalEObject)transformerAsset;
			transformerAsset = (TransformerAsset)eResolveProxy(oldTransformerAsset);
			if (transformerAsset != oldTransformerAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET, oldTransformerAsset, transformerAsset));
			}
		}
		return transformerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAsset basicGetTransformerAsset() {
		return transformerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerAsset(TransformerAsset newTransformerAsset, NotificationChain msgs) {
		TransformerAsset oldTransformerAsset = transformerAsset;
		transformerAsset = newTransformerAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET, oldTransformerAsset, newTransformerAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerAsset(TransformerAsset newTransformerAsset) {
		if (newTransformerAsset != transformerAsset) {
			NotificationChain msgs = null;
			if (transformerAsset != null)
				msgs = ((InternalEObject)transformerAsset).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, TransformerAsset.class, msgs);
			if (newTransformerAsset != null)
				msgs = ((InternalEObject)newTransformerAsset).eInverseAdd(this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, TransformerAsset.class, msgs);
			msgs = basicSetTransformerAsset(newTransformerAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET, newTransformerAsset, newTransformerAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTopOilTemp() {
		return topOilTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopOilTemp(float newTopOilTemp) {
		float oldTopOilTemp = topOilTemp;
		topOilTemp = newTopOilTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP, oldTopOilTemp, topOilTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPumpVibration() {
		return pumpVibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPumpVibration(String newPumpVibration) {
		String oldPumpVibration = pumpVibration;
		pumpVibration = newPumpVibration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION, oldPumpVibration, pumpVibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBushingTemp() {
		return bushingTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBushingTemp(float newBushingTemp) {
		float oldBushingTemp = bushingTemp;
		bushingTemp = newBushingTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP, oldBushingTemp, bushingTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaterContent() {
		return waterContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterContent(String newWaterContent) {
		String oldWaterContent = waterContent;
		waterContent = newWaterContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT, oldWaterContent, waterContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer getTransformer() {
		if (transformer != null && transformer.eIsProxy()) {
			InternalEObject oldTransformer = (InternalEObject)transformer;
			transformer = (DistributionTransformer)eResolveProxy(oldTransformer);
			if (transformer != oldTransformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER, oldTransformer, transformer));
			}
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer basicGetTransformer() {
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformer(DistributionTransformer newTransformer, NotificationChain msgs) {
		DistributionTransformer oldTransformer = transformer;
		transformer = newTransformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER, oldTransformer, newTransformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer(DistributionTransformer newTransformer) {
		if (newTransformer != transformer) {
			NotificationChain msgs = null;
			if (transformer != null)
				msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS, DistributionTransformer.class, msgs);
			if (newTransformer != null)
				msgs = ((InternalEObject)newTransformer).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS, DistributionTransformer.class, msgs);
			msgs = basicSetTransformer(newTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER, newTransformer, newTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new EObjectWithInverseResolvingEList.ManyInverse<ProcedureDataSet>(ProcedureDataSet.class, this, InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS, InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS);
		}
		return procedureDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreqResp() {
		return freqResp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreqResp(String newFreqResp) {
		String oldFreqResp = freqResp;
		freqResp = newFreqResp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP, oldFreqResp, freqResp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFurfuralDP() {
		return furfuralDP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFurfuralDP(String newFurfuralDP) {
		String oldFurfuralDP = furfuralDP;
		furfuralDP = newFurfuralDP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP, oldFurfuralDP, furfuralDP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BushingInsulationPF> getBushingInsultationPFs() {
		if (bushingInsultationPFs == null) {
			bushingInsultationPFs = new EObjectWithInverseResolvingEList<BushingInsulationPF>(BushingInsulationPF.class, this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION);
		}
		return bushingInsultationPFs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOilLevel() {
		return oilLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilLevel(String newOilLevel) {
		String oldOilLevel = oilLevel;
		oilLevel = newOilLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL, oldOilLevel, oilLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOilColor() {
		return oilColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilColor(String newOilColor) {
		String oldOilColor = oilColor;
		oilColor = newOilColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR, oldOilColor, oilColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingInsulation> getWindingInsulationPFs() {
		if (windingInsulationPFs == null) {
			windingInsulationPFs = new EObjectWithInverseResolvingEList<WindingInsulation>(WindingInsulation.class, this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION);
		}
		return windingInsulationPFs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDga() {
		return dga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDga(String newDga) {
		String oldDga = dga;
		dga = newDga;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA, oldDga, dga));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOilNeutralizationNumber() {
		return oilNeutralizationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilNeutralizationNumber(String newOilNeutralizationNumber) {
		String oldOilNeutralizationNumber = oilNeutralizationNumber;
		oilNeutralizationNumber = newOilNeutralizationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER, oldOilNeutralizationNumber, oilNeutralizationNumber));
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				if (transformerAsset != null)
					msgs = ((InternalEObject)transformerAsset).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, TransformerAsset.class, msgs);
				return basicSetTransformerAsset((TransformerAsset)otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				if (transformer != null)
					msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_OBSERVATIONS, DistributionTransformer.class, msgs);
				return basicSetTransformer((DistributionTransformer)otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBushingInsultationPFs()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindingInsulationPFs()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				return basicSetTransformerAsset(null, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				return basicSetTransformer(null, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return ((InternalEList<?>)getBushingInsultationPFs()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return ((InternalEList<?>)getWindingInsulationPFs()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				return getOilIFT();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				return getHotSpotTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				return getOilDielectricStrength();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				if (resolve) return getTransformerAsset();
				return basicGetTransformerAsset();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				return getTopOilTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				return getPumpVibration();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				return getBushingTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				return getWaterContent();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				if (resolve) return getTransformer();
				return basicGetTransformer();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				return getFreqResp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				return getFurfuralDP();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return getBushingInsultationPFs();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				return getOilLevel();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				return getOilColor();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return getWindingInsulationPFs();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				return getDga();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				return getOilNeutralizationNumber();
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				setOilIFT((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				setHotSpotTemp((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				setOilDielectricStrength((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				setTransformerAsset((TransformerAsset)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				setTopOilTemp((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				setPumpVibration((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				setBushingTemp((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				setWaterContent((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				setTransformer((DistributionTransformer)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				setFreqResp((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				setFurfuralDP((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				getBushingInsultationPFs().clear();
				getBushingInsultationPFs().addAll((Collection<? extends BushingInsulationPF>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				setOilLevel((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				setOilColor((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				getWindingInsulationPFs().clear();
				getWindingInsulationPFs().addAll((Collection<? extends WindingInsulation>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				setStatus((Status)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				setDga((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				setOilNeutralizationNumber((String)newValue);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				setOilIFT(OIL_IFT_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				setHotSpotTemp(HOT_SPOT_TEMP_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				setOilDielectricStrength(OIL_DIELECTRIC_STRENGTH_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				setTransformerAsset((TransformerAsset)null);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				setTopOilTemp(TOP_OIL_TEMP_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				setPumpVibration(PUMP_VIBRATION_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				setBushingTemp(BUSHING_TEMP_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				setWaterContent(WATER_CONTENT_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				setTransformer((DistributionTransformer)null);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				setFreqResp(FREQ_RESP_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				setFurfuralDP(FURFURAL_DP_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				getBushingInsultationPFs().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				setOilLevel(OIL_LEVEL_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				setOilColor(OIL_COLOR_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				getWindingInsulationPFs().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				setStatus((Status)null);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				setDga(DGA_EDEFAULT);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				setOilNeutralizationNumber(OIL_NEUTRALIZATION_NUMBER_EDEFAULT);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				return OIL_IFT_EDEFAULT == null ? oilIFT != null : !OIL_IFT_EDEFAULT.equals(oilIFT);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				return hotSpotTemp != HOT_SPOT_TEMP_EDEFAULT;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				return oilDielectricStrength != OIL_DIELECTRIC_STRENGTH_EDEFAULT;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				return transformerAsset != null;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				return topOilTemp != TOP_OIL_TEMP_EDEFAULT;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				return PUMP_VIBRATION_EDEFAULT == null ? pumpVibration != null : !PUMP_VIBRATION_EDEFAULT.equals(pumpVibration);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				return bushingTemp != BUSHING_TEMP_EDEFAULT;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				return WATER_CONTENT_EDEFAULT == null ? waterContent != null : !WATER_CONTENT_EDEFAULT.equals(waterContent);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				return transformer != null;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				return FREQ_RESP_EDEFAULT == null ? freqResp != null : !FREQ_RESP_EDEFAULT.equals(freqResp);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				return FURFURAL_DP_EDEFAULT == null ? furfuralDP != null : !FURFURAL_DP_EDEFAULT.equals(furfuralDP);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return bushingInsultationPFs != null && !bushingInsultationPFs.isEmpty();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				return OIL_LEVEL_EDEFAULT == null ? oilLevel != null : !OIL_LEVEL_EDEFAULT.equals(oilLevel);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				return OIL_COLOR_EDEFAULT == null ? oilColor != null : !OIL_COLOR_EDEFAULT.equals(oilColor);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return windingInsulationPFs != null && !windingInsulationPFs.isEmpty();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				return status != null;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				return DGA_EDEFAULT == null ? dga != null : !DGA_EDEFAULT.equals(dga);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				return OIL_NEUTRALIZATION_NUMBER_EDEFAULT == null ? oilNeutralizationNumber != null : !OIL_NEUTRALIZATION_NUMBER_EDEFAULT.equals(oilNeutralizationNumber);
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
		result.append(" (oilIFT: ");
		result.append(oilIFT);
		result.append(", hotSpotTemp: ");
		result.append(hotSpotTemp);
		result.append(", oilDielectricStrength: ");
		result.append(oilDielectricStrength);
		result.append(", topOilTemp: ");
		result.append(topOilTemp);
		result.append(", pumpVibration: ");
		result.append(pumpVibration);
		result.append(", bushingTemp: ");
		result.append(bushingTemp);
		result.append(", waterContent: ");
		result.append(waterContent);
		result.append(", freqResp: ");
		result.append(freqResp);
		result.append(", furfuralDP: ");
		result.append(furfuralDP);
		result.append(", oilLevel: ");
		result.append(oilLevel);
		result.append(", oilColor: ");
		result.append(oilColor);
		result.append(", dga: ");
		result.append(dga);
		result.append(", oilNeutralizationNumber: ");
		result.append(oilNeutralizationNumber);
		result.append(')');
		return result.toString();
	}

} //TransformerObservationImpl
