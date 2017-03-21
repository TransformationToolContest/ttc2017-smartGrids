/**
 */
package CIM.IEC61970.Informative.InfAssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.TransformerInfo;

import CIM.IEC61968.AssetModels.impl.AssetModelImpl;

import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind;
import CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel;
import CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind;
import CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind;
import CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind;
import CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.TransformerAsset;

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
 * An implementation of the model object '<em><b>Transformer Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getHourOverLoadRating <em>Hour Over Load Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getOilPreservationKind <em>Oil Preservation Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getCoreCoilsWeight <em>Core Coils Weight</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getWindingInsulationKind <em>Winding Insulation Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getTransformerInfo <em>Transformer Info</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getSolidInsulationWeight <em>Solid Insulation Weight</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getNeutralBIL <em>Neutral BIL</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getCoreKind <em>Core Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getDayOverLoadRating <em>Day Over Load Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#isAutoTransformer <em>Auto Transformer</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.TransformerAssetModelImpl#isReconfigWinding <em>Reconfig Winding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerAssetModelImpl extends AssetModelImpl implements TransformerAssetModel {
	/**
	 * The default value of the '{@link #getHourOverLoadRating() <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected static final float HOUR_OVER_LOAD_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHourOverLoadRating() <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected float hourOverLoadRating = HOUR_OVER_LOAD_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOilPreservationKind() <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilPreservationKind()
	 * @generated
	 * @ordered
	 */
	protected static final OilPreservationKind OIL_PRESERVATION_KIND_EDEFAULT = OilPreservationKind.NITROGEN_BLANKET;

	/**
	 * The cached value of the '{@link #getOilPreservationKind() <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilPreservationKind()
	 * @generated
	 * @ordered
	 */
	protected OilPreservationKind oilPreservationKind = OIL_PRESERVATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreCoilsWeight() <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCoilsWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_COILS_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreCoilsWeight() <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCoilsWeight()
	 * @generated
	 * @ordered
	 */
	protected float coreCoilsWeight = CORE_COILS_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindingInsulationKind() <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected static final WindingInsulationKind WINDING_INSULATION_KIND_EDEFAULT = WindingInsulationKind.PAPER;

	/**
	 * The cached value of the '{@link #getWindingInsulationKind() <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected WindingInsulationKind windingInsulationKind = WINDING_INSULATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltSecondaryNomVoltage() <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltSecondaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltSecondaryNomVoltage() <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltSecondaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected float altSecondaryNomVoltage = ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerInfo() <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerInfo transformerInfo;

	/**
	 * The default value of the '{@link #getSolidInsulationWeight() <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidInsulationWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float SOLID_INSULATION_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSolidInsulationWeight() <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidInsulationWeight()
	 * @generated
	 * @ordered
	 */
	protected float solidInsulationWeight = SOLID_INSULATION_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralBIL() <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralBIL()
	 * @generated
	 * @ordered
	 */
	protected static final float NEUTRAL_BIL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralBIL() <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralBIL()
	 * @generated
	 * @ordered
	 */
	protected float neutralBIL = NEUTRAL_BIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreKind() <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerCoreKind CORE_KIND_EDEFAULT = TransformerCoreKind.CORE;

	/**
	 * The cached value of the '{@link #getCoreKind() <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreKind()
	 * @generated
	 * @ordered
	 */
	protected TransformerCoreKind coreKind = CORE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayOverLoadRating() <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected static final float DAY_OVER_LOAD_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDayOverLoadRating() <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected float dayOverLoadRating = DAY_OVER_LOAD_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerFunctionKind FUNCTION_EDEFAULT = TransformerFunctionKind.AUTOTRANSFORMER;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected TransformerFunctionKind function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerConstructionKind CONSTRUCTION_KIND_EDEFAULT = TransformerConstructionKind.VALUT;

	/**
	 * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected TransformerConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoTransformer() <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoTransformer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_TRANSFORMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoTransformer() <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoTransformer()
	 * @generated
	 * @ordered
	 */
	protected boolean autoTransformer = AUTO_TRANSFORMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformerAssets() <em>Transformer Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAsset> transformerAssets;

	/**
	 * The default value of the '{@link #getAltPrimaryNomVoltage() <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltPrimaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltPrimaryNomVoltage() <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltPrimaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected float altPrimaryNomVoltage = ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReconfigWinding() <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconfigWinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONFIG_WINDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReconfigWinding() <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconfigWinding()
	 * @generated
	 * @ordered
	 */
	protected boolean reconfigWinding = RECONFIG_WINDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerAssetModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.TRANSFORMER_ASSET_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHourOverLoadRating() {
		return hourOverLoadRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourOverLoadRating(float newHourOverLoadRating) {
		float oldHourOverLoadRating = hourOverLoadRating;
		hourOverLoadRating = newHourOverLoadRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING, oldHourOverLoadRating, hourOverLoadRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OilPreservationKind getOilPreservationKind() {
		return oilPreservationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilPreservationKind(OilPreservationKind newOilPreservationKind) {
		OilPreservationKind oldOilPreservationKind = oilPreservationKind;
		oilPreservationKind = newOilPreservationKind == null ? OIL_PRESERVATION_KIND_EDEFAULT : newOilPreservationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND, oldOilPreservationKind, oilPreservationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreCoilsWeight() {
		return coreCoilsWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreCoilsWeight(float newCoreCoilsWeight) {
		float oldCoreCoilsWeight = coreCoilsWeight;
		coreCoilsWeight = newCoreCoilsWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT, oldCoreCoilsWeight, coreCoilsWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInsulationKind getWindingInsulationKind() {
		return windingInsulationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindingInsulationKind(WindingInsulationKind newWindingInsulationKind) {
		WindingInsulationKind oldWindingInsulationKind = windingInsulationKind;
		windingInsulationKind = newWindingInsulationKind == null ? WINDING_INSULATION_KIND_EDEFAULT : newWindingInsulationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND, oldWindingInsulationKind, windingInsulationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltSecondaryNomVoltage() {
		return altSecondaryNomVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltSecondaryNomVoltage(float newAltSecondaryNomVoltage) {
		float oldAltSecondaryNomVoltage = altSecondaryNomVoltage;
		altSecondaryNomVoltage = newAltSecondaryNomVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE, oldAltSecondaryNomVoltage, altSecondaryNomVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo getTransformerInfo() {
		if (transformerInfo != null && transformerInfo.eIsProxy()) {
			InternalEObject oldTransformerInfo = (InternalEObject)transformerInfo;
			transformerInfo = (TransformerInfo)eResolveProxy(oldTransformerInfo);
			if (transformerInfo != oldTransformerInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO, oldTransformerInfo, transformerInfo));
			}
		}
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerInfo basicGetTransformerInfo() {
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerInfo(TransformerInfo newTransformerInfo, NotificationChain msgs) {
		TransformerInfo oldTransformerInfo = transformerInfo;
		transformerInfo = newTransformerInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO, oldTransformerInfo, newTransformerInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerInfo(TransformerInfo newTransformerInfo) {
		if (newTransformerInfo != transformerInfo) {
			NotificationChain msgs = null;
			if (transformerInfo != null)
				msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS, TransformerInfo.class, msgs);
			if (newTransformerInfo != null)
				msgs = ((InternalEObject)newTransformerInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS, TransformerInfo.class, msgs);
			msgs = basicSetTransformerInfo(newTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO, newTransformerInfo, newTransformerInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolidInsulationWeight() {
		return solidInsulationWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolidInsulationWeight(float newSolidInsulationWeight) {
		float oldSolidInsulationWeight = solidInsulationWeight;
		solidInsulationWeight = newSolidInsulationWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT, oldSolidInsulationWeight, solidInsulationWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNeutralBIL() {
		return neutralBIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralBIL(float newNeutralBIL) {
		float oldNeutralBIL = neutralBIL;
		neutralBIL = newNeutralBIL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL, oldNeutralBIL, neutralBIL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerCoreKind getCoreKind() {
		return coreKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreKind(TransformerCoreKind newCoreKind) {
		TransformerCoreKind oldCoreKind = coreKind;
		coreKind = newCoreKind == null ? CORE_KIND_EDEFAULT : newCoreKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND, oldCoreKind, coreKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDayOverLoadRating() {
		return dayOverLoadRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOverLoadRating(float newDayOverLoadRating) {
		float oldDayOverLoadRating = dayOverLoadRating;
		dayOverLoadRating = newDayOverLoadRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING, oldDayOverLoadRating, dayOverLoadRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerFunctionKind getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(TransformerFunctionKind newFunction) {
		TransformerFunctionKind oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerConstructionKind getConstructionKind() {
		return constructionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionKind(TransformerConstructionKind newConstructionKind) {
		TransformerConstructionKind oldConstructionKind = constructionKind;
		constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND, oldConstructionKind, constructionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoTransformer() {
		return autoTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoTransformer(boolean newAutoTransformer) {
		boolean oldAutoTransformer = autoTransformer;
		autoTransformer = newAutoTransformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER, oldAutoTransformer, autoTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerAsset> getTransformerAssets() {
		if (transformerAssets == null) {
			transformerAssets = new EObjectWithInverseResolvingEList<TransformerAsset>(TransformerAsset.class, this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL);
		}
		return transformerAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltPrimaryNomVoltage() {
		return altPrimaryNomVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltPrimaryNomVoltage(float newAltPrimaryNomVoltage) {
		float oldAltPrimaryNomVoltage = altPrimaryNomVoltage;
		altPrimaryNomVoltage = newAltPrimaryNomVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE, oldAltPrimaryNomVoltage, altPrimaryNomVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReconfigWinding() {
		return reconfigWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigWinding(boolean newReconfigWinding) {
		boolean oldReconfigWinding = reconfigWinding;
		reconfigWinding = newReconfigWinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING, oldReconfigWinding, reconfigWinding));
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				if (transformerInfo != null)
					msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS, TransformerInfo.class, msgs);
				return basicSetTransformerInfo((TransformerInfo)otherEnd, msgs);
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				return basicSetTransformerInfo(null, msgs);
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return ((InternalEList<?>)getTransformerAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				return getHourOverLoadRating();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				return getOilPreservationKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				return getCoreCoilsWeight();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				return getWindingInsulationKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				return getAltSecondaryNomVoltage();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				if (resolve) return getTransformerInfo();
				return basicGetTransformerInfo();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				return getSolidInsulationWeight();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				return getNeutralBIL();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				return getCoreKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				return getDayOverLoadRating();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				return getFunction();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				return getConstructionKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				return isAutoTransformer();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return getTransformerAssets();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				return getAltPrimaryNomVoltage();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				return isReconfigWinding();
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				setHourOverLoadRating((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				setOilPreservationKind((OilPreservationKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				setCoreCoilsWeight((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				setWindingInsulationKind((WindingInsulationKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				setAltSecondaryNomVoltage((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				setSolidInsulationWeight((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				setNeutralBIL((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				setCoreKind((TransformerCoreKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				setDayOverLoadRating((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				setFunction((TransformerFunctionKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				setConstructionKind((TransformerConstructionKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				setAutoTransformer((Boolean)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				getTransformerAssets().addAll((Collection<? extends TransformerAsset>)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				setAltPrimaryNomVoltage((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				setReconfigWinding((Boolean)newValue);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				setHourOverLoadRating(HOUR_OVER_LOAD_RATING_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				setOilPreservationKind(OIL_PRESERVATION_KIND_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				setCoreCoilsWeight(CORE_COILS_WEIGHT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				setWindingInsulationKind(WINDING_INSULATION_KIND_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				setAltSecondaryNomVoltage(ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				setTransformerInfo((TransformerInfo)null);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				setSolidInsulationWeight(SOLID_INSULATION_WEIGHT_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				setNeutralBIL(NEUTRAL_BIL_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				setCoreKind(CORE_KIND_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				setDayOverLoadRating(DAY_OVER_LOAD_RATING_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				setConstructionKind(CONSTRUCTION_KIND_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				setAutoTransformer(AUTO_TRANSFORMER_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				setAltPrimaryNomVoltage(ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				setReconfigWinding(RECONFIG_WINDING_EDEFAULT);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				return hourOverLoadRating != HOUR_OVER_LOAD_RATING_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				return oilPreservationKind != OIL_PRESERVATION_KIND_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				return coreCoilsWeight != CORE_COILS_WEIGHT_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				return windingInsulationKind != WINDING_INSULATION_KIND_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				return altSecondaryNomVoltage != ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				return transformerInfo != null;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				return solidInsulationWeight != SOLID_INSULATION_WEIGHT_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				return neutralBIL != NEUTRAL_BIL_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				return coreKind != CORE_KIND_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				return dayOverLoadRating != DAY_OVER_LOAD_RATING_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				return constructionKind != CONSTRUCTION_KIND_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				return autoTransformer != AUTO_TRANSFORMER_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return transformerAssets != null && !transformerAssets.isEmpty();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				return altPrimaryNomVoltage != ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				return reconfigWinding != RECONFIG_WINDING_EDEFAULT;
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
		result.append(" (hourOverLoadRating: ");
		result.append(hourOverLoadRating);
		result.append(", oilPreservationKind: ");
		result.append(oilPreservationKind);
		result.append(", coreCoilsWeight: ");
		result.append(coreCoilsWeight);
		result.append(", windingInsulationKind: ");
		result.append(windingInsulationKind);
		result.append(", altSecondaryNomVoltage: ");
		result.append(altSecondaryNomVoltage);
		result.append(", solidInsulationWeight: ");
		result.append(solidInsulationWeight);
		result.append(", neutralBIL: ");
		result.append(neutralBIL);
		result.append(", coreKind: ");
		result.append(coreKind);
		result.append(", dayOverLoadRating: ");
		result.append(dayOverLoadRating);
		result.append(", function: ");
		result.append(function);
		result.append(", constructionKind: ");
		result.append(constructionKind);
		result.append(", autoTransformer: ");
		result.append(autoTransformer);
		result.append(", altPrimaryNomVoltage: ");
		result.append(altPrimaryNomVoltage);
		result.append(", reconfigWinding: ");
		result.append(reconfigWinding);
		result.append(')');
		return result.toString();
	}

} //TransformerAssetModelImpl
