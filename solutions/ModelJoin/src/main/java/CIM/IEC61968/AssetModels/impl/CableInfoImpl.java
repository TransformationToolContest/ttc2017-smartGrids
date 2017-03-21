/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.CableConstructionKind;
import CIM.IEC61968.AssetModels.CableInfo;
import CIM.IEC61968.AssetModels.CableOuterJacketKind;
import CIM.IEC61968.AssetModels.CableShieldMaterialKind;

import CIM.IEC61970.Informative.InfAssets.DuctInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#isSheathAsNeutral <em>Sheath As Neutral</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#isIsStrandFill <em>Is Strand Fill</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getOuterJacketKind <em>Outer Jacket Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getDiameterOverScreen <em>Diameter Over Screen</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getNominalTemperature <em>Nominal Temperature</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getDiameterOverJacket <em>Diameter Over Jacket</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getDiameterOverCore <em>Diameter Over Core</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getDiameterOverInsulation <em>Diameter Over Insulation</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getShieldMaterial <em>Shield Material</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.CableInfoImpl#getDuctBankInfo <em>Duct Bank Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CableInfoImpl extends ConductorInfoImpl implements CableInfo {
	/**
	 * The default value of the '{@link #isSheathAsNeutral() <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSheathAsNeutral()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHEATH_AS_NEUTRAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSheathAsNeutral() <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSheathAsNeutral()
	 * @generated
	 * @ordered
	 */
	protected boolean sheathAsNeutral = SHEATH_AS_NEUTRAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStrandFill() <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrandFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRAND_FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrandFill() <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrandFill()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrandFill = IS_STRAND_FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuterJacketKind() <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJacketKind()
	 * @generated
	 * @ordered
	 */
	protected static final CableOuterJacketKind OUTER_JACKET_KIND_EDEFAULT = CableOuterJacketKind.INSULATING;

	/**
	 * The cached value of the '{@link #getOuterJacketKind() <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJacketKind()
	 * @generated
	 * @ordered
	 */
	protected CableOuterJacketKind outerJacketKind = OUTER_JACKET_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected static final CableConstructionKind CONSTRUCTION_KIND_EDEFAULT = CableConstructionKind.SOLID;

	/**
	 * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected CableConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterOverScreen() <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverScreen()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_SCREEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverScreen() <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverScreen()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverScreen = DIAMETER_OVER_SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalTemperature()
	 * @generated
	 * @ordered
	 */
	protected float nominalTemperature = NOMINAL_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterOverJacket() <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverJacket()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_JACKET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverJacket() <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverJacket()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverJacket = DIAMETER_OVER_JACKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterOverCore() <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverCore()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_CORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverCore() <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverCore()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverCore = DIAMETER_OVER_CORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameterOverInsulation() <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverInsulation()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_INSULATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverInsulation() <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverInsulation()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverInsulation = DIAMETER_OVER_INSULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShieldMaterial() <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShieldMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final CableShieldMaterialKind SHIELD_MATERIAL_EDEFAULT = CableShieldMaterialKind.OTHER;

	/**
	 * The cached value of the '{@link #getShieldMaterial() <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShieldMaterial()
	 * @generated
	 * @ordered
	 */
	protected CableShieldMaterialKind shieldMaterial = SHIELD_MATERIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDuctBankInfo() <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctBankInfo()
	 * @generated
	 * @ordered
	 */
	protected DuctInfo ductBankInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CableInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.CABLE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSheathAsNeutral() {
		return sheathAsNeutral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheathAsNeutral(boolean newSheathAsNeutral) {
		boolean oldSheathAsNeutral = sheathAsNeutral;
		sheathAsNeutral = newSheathAsNeutral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL, oldSheathAsNeutral, sheathAsNeutral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStrandFill() {
		return isStrandFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrandFill(boolean newIsStrandFill) {
		boolean oldIsStrandFill = isStrandFill;
		isStrandFill = newIsStrandFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL, oldIsStrandFill, isStrandFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableOuterJacketKind getOuterJacketKind() {
		return outerJacketKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterJacketKind(CableOuterJacketKind newOuterJacketKind) {
		CableOuterJacketKind oldOuterJacketKind = outerJacketKind;
		outerJacketKind = newOuterJacketKind == null ? OUTER_JACKET_KIND_EDEFAULT : newOuterJacketKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND, oldOuterJacketKind, outerJacketKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableConstructionKind getConstructionKind() {
		return constructionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionKind(CableConstructionKind newConstructionKind) {
		CableConstructionKind oldConstructionKind = constructionKind;
		constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND, oldConstructionKind, constructionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiameterOverScreen() {
		return diameterOverScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameterOverScreen(float newDiameterOverScreen) {
		float oldDiameterOverScreen = diameterOverScreen;
		diameterOverScreen = newDiameterOverScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN, oldDiameterOverScreen, diameterOverScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalTemperature() {
		return nominalTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalTemperature(float newNominalTemperature) {
		float oldNominalTemperature = nominalTemperature;
		nominalTemperature = newNominalTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE, oldNominalTemperature, nominalTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiameterOverJacket() {
		return diameterOverJacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameterOverJacket(float newDiameterOverJacket) {
		float oldDiameterOverJacket = diameterOverJacket;
		diameterOverJacket = newDiameterOverJacket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET, oldDiameterOverJacket, diameterOverJacket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiameterOverCore() {
		return diameterOverCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameterOverCore(float newDiameterOverCore) {
		float oldDiameterOverCore = diameterOverCore;
		diameterOverCore = newDiameterOverCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE, oldDiameterOverCore, diameterOverCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiameterOverInsulation() {
		return diameterOverInsulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameterOverInsulation(float newDiameterOverInsulation) {
		float oldDiameterOverInsulation = diameterOverInsulation;
		diameterOverInsulation = newDiameterOverInsulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION, oldDiameterOverInsulation, diameterOverInsulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableShieldMaterialKind getShieldMaterial() {
		return shieldMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShieldMaterial(CableShieldMaterialKind newShieldMaterial) {
		CableShieldMaterialKind oldShieldMaterial = shieldMaterial;
		shieldMaterial = newShieldMaterial == null ? SHIELD_MATERIAL_EDEFAULT : newShieldMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL, oldShieldMaterial, shieldMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctInfo getDuctBankInfo() {
		if (ductBankInfo != null && ductBankInfo.eIsProxy()) {
			InternalEObject oldDuctBankInfo = (InternalEObject)ductBankInfo;
			ductBankInfo = (DuctInfo)eResolveProxy(oldDuctBankInfo);
			if (ductBankInfo != oldDuctBankInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO, oldDuctBankInfo, ductBankInfo));
			}
		}
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctInfo basicGetDuctBankInfo() {
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuctBankInfo(DuctInfo newDuctBankInfo, NotificationChain msgs) {
		DuctInfo oldDuctBankInfo = ductBankInfo;
		ductBankInfo = newDuctBankInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO, oldDuctBankInfo, newDuctBankInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuctBankInfo(DuctInfo newDuctBankInfo) {
		if (newDuctBankInfo != ductBankInfo) {
			NotificationChain msgs = null;
			if (ductBankInfo != null)
				msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT_INFO__CABLE_INFOS, DuctInfo.class, msgs);
			if (newDuctBankInfo != null)
				msgs = ((InternalEObject)newDuctBankInfo).eInverseAdd(this, InfAssetsPackage.DUCT_INFO__CABLE_INFOS, DuctInfo.class, msgs);
			msgs = basicSetDuctBankInfo(newDuctBankInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO, newDuctBankInfo, newDuctBankInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				if (ductBankInfo != null)
					msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT_INFO__CABLE_INFOS, DuctInfo.class, msgs);
				return basicSetDuctBankInfo((DuctInfo)otherEnd, msgs);
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
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				return basicSetDuctBankInfo(null, msgs);
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
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				return isSheathAsNeutral();
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				return isIsStrandFill();
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				return getOuterJacketKind();
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				return getConstructionKind();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				return getDiameterOverScreen();
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				return getNominalTemperature();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				return getDiameterOverJacket();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				return getDiameterOverCore();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				return getDiameterOverInsulation();
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				return getShieldMaterial();
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				if (resolve) return getDuctBankInfo();
				return basicGetDuctBankInfo();
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
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				setSheathAsNeutral((Boolean)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				setIsStrandFill((Boolean)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				setOuterJacketKind((CableOuterJacketKind)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				setConstructionKind((CableConstructionKind)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				setDiameterOverScreen((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				setNominalTemperature((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				setDiameterOverJacket((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				setDiameterOverCore((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				setDiameterOverInsulation((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				setShieldMaterial((CableShieldMaterialKind)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				setDuctBankInfo((DuctInfo)newValue);
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
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				setSheathAsNeutral(SHEATH_AS_NEUTRAL_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				setIsStrandFill(IS_STRAND_FILL_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				setOuterJacketKind(OUTER_JACKET_KIND_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				setConstructionKind(CONSTRUCTION_KIND_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				setDiameterOverScreen(DIAMETER_OVER_SCREEN_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				setNominalTemperature(NOMINAL_TEMPERATURE_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				setDiameterOverJacket(DIAMETER_OVER_JACKET_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				setDiameterOverCore(DIAMETER_OVER_CORE_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				setDiameterOverInsulation(DIAMETER_OVER_INSULATION_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				setShieldMaterial(SHIELD_MATERIAL_EDEFAULT);
				return;
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				setDuctBankInfo((DuctInfo)null);
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
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				return sheathAsNeutral != SHEATH_AS_NEUTRAL_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				return isStrandFill != IS_STRAND_FILL_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				return outerJacketKind != OUTER_JACKET_KIND_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				return constructionKind != CONSTRUCTION_KIND_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				return diameterOverScreen != DIAMETER_OVER_SCREEN_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				return nominalTemperature != NOMINAL_TEMPERATURE_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				return diameterOverJacket != DIAMETER_OVER_JACKET_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				return diameterOverCore != DIAMETER_OVER_CORE_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				return diameterOverInsulation != DIAMETER_OVER_INSULATION_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				return shieldMaterial != SHIELD_MATERIAL_EDEFAULT;
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				return ductBankInfo != null;
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
		result.append(" (sheathAsNeutral: ");
		result.append(sheathAsNeutral);
		result.append(", isStrandFill: ");
		result.append(isStrandFill);
		result.append(", outerJacketKind: ");
		result.append(outerJacketKind);
		result.append(", constructionKind: ");
		result.append(constructionKind);
		result.append(", diameterOverScreen: ");
		result.append(diameterOverScreen);
		result.append(", nominalTemperature: ");
		result.append(nominalTemperature);
		result.append(", diameterOverJacket: ");
		result.append(diameterOverJacket);
		result.append(", diameterOverCore: ");
		result.append(diameterOverCore);
		result.append(", diameterOverInsulation: ");
		result.append(diameterOverInsulation);
		result.append(", shieldMaterial: ");
		result.append(shieldMaterial);
		result.append(')');
		return result.toString();
	}

} //CableInfoImpl
