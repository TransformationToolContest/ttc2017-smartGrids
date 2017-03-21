/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo;
import CIM.IEC61968.AssetModels.ConductorMaterialKind;
import CIM.IEC61968.AssetModels.WireArrangement;
import CIM.IEC61968.AssetModels.WireType;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getRAC75 <em>RAC75</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getRAC50 <em>RAC50</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getStrandCount <em>Strand Count</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getCoreRadius <em>Core Radius</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getRAC25 <em>RAC25</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getRDC20 <em>RDC20</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getCoreStrandCount <em>Core Strand Count</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getWireArrangements <em>Wire Arrangements</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getGmr <em>Gmr</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.WireTypeImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireTypeImpl extends IdentifiedObjectImpl implements WireType {
	/**
	 * The default value of the '{@link #getRAC75() <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC75()
	 * @generated
	 * @ordered
	 */
	protected static final float RAC75_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRAC75() <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC75()
	 * @generated
	 * @ordered
	 */
	protected float rAC75 = RAC75_EDEFAULT;

	/**
	 * The default value of the '{@link #getRAC50() <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC50()
	 * @generated
	 * @ordered
	 */
	protected static final float RAC50_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRAC50() <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC50()
	 * @generated
	 * @ordered
	 */
	protected float rAC50 = RAC50_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final float RADIUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected float radius = RADIUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcentricNeutralCableInfos() <em>Concentric Neutral Cable Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentricNeutralCableInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcentricNeutralCableInfo> concentricNeutralCableInfos;

	/**
	 * The default value of the '{@link #getStrandCount() <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrandCount()
	 * @generated
	 * @ordered
	 */
	protected static final int STRAND_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrandCount() <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrandCount()
	 * @generated
	 * @ordered
	 */
	protected int strandCount = STRAND_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreRadius() <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreRadius()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_RADIUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreRadius() <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreRadius()
	 * @generated
	 * @ordered
	 */
	protected float coreRadius = CORE_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRAC25() <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC25()
	 * @generated
	 * @ordered
	 */
	protected static final float RAC25_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRAC25() <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC25()
	 * @generated
	 * @ordered
	 */
	protected float rAC25 = RAC25_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDC20() <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDC20()
	 * @generated
	 * @ordered
	 */
	protected static final float RDC20_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRDC20() <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDC20()
	 * @generated
	 * @ordered
	 */
	protected float rDC20 = RDC20_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDescription()
	 * @generated
	 * @ordered
	 */
	protected String sizeDescription = SIZE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreStrandCount() <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreStrandCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_STRAND_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreStrandCount() <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreStrandCount()
	 * @generated
	 * @ordered
	 */
	protected int coreStrandCount = CORE_STRAND_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWireArrangements() <em>Wire Arrangements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireArrangements()
	 * @generated
	 * @ordered
	 */
	protected EList<WireArrangement> wireArrangements;

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
	 * The default value of the '{@link #getGmr() <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmr()
	 * @generated
	 * @ordered
	 */
	protected static final float GMR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGmr() <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmr()
	 * @generated
	 * @ordered
	 */
	protected float gmr = GMR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final ConductorMaterialKind MATERIAL_EDEFAULT = ConductorMaterialKind.STEEL;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected ConductorMaterialKind material = MATERIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.WIRE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRAC75() {
		return rAC75;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRAC75(float newRAC75) {
		float oldRAC75 = rAC75;
		rAC75 = newRAC75;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__RAC75, oldRAC75, rAC75));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRAC50() {
		return rAC50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRAC50(float newRAC50) {
		float oldRAC50 = rAC50;
		rAC50 = newRAC50;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__RAC50, oldRAC50, rAC50));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(float newRadius) {
		float oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcentricNeutralCableInfo> getConcentricNeutralCableInfos() {
		if (concentricNeutralCableInfos == null) {
			concentricNeutralCableInfos = new EObjectWithInverseResolvingEList<ConcentricNeutralCableInfo>(ConcentricNeutralCableInfo.class, this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE);
		}
		return concentricNeutralCableInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrandCount() {
		return strandCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrandCount(int newStrandCount) {
		int oldStrandCount = strandCount;
		strandCount = newStrandCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__STRAND_COUNT, oldStrandCount, strandCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoreRadius() {
		return coreRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreRadius(float newCoreRadius) {
		float oldCoreRadius = coreRadius;
		coreRadius = newCoreRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__CORE_RADIUS, oldCoreRadius, coreRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRAC25() {
		return rAC25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRAC25(float newRAC25) {
		float oldRAC25 = rAC25;
		rAC25 = newRAC25;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__RAC25, oldRAC25, rAC25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRDC20() {
		return rDC20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDC20(float newRDC20) {
		float oldRDC20 = rDC20;
		rDC20 = newRDC20;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__RDC20, oldRDC20, rDC20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSizeDescription() {
		return sizeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeDescription(String newSizeDescription) {
		String oldSizeDescription = sizeDescription;
		sizeDescription = newSizeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION, oldSizeDescription, sizeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreStrandCount() {
		return coreStrandCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreStrandCount(int newCoreStrandCount) {
		int oldCoreStrandCount = coreStrandCount;
		coreStrandCount = newCoreStrandCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT, oldCoreStrandCount, coreStrandCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireArrangement> getWireArrangements() {
		if (wireArrangements == null) {
			wireArrangements = new EObjectWithInverseResolvingEList<WireArrangement>(WireArrangement.class, this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE);
		}
		return wireArrangements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGmr() {
		return gmr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGmr(float newGmr) {
		float oldGmr = gmr;
		gmr = newGmr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__GMR, oldGmr, gmr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorMaterialKind getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(ConductorMaterialKind newMaterial) {
		ConductorMaterialKind oldMaterial = material;
		material = newMaterial == null ? MATERIAL_EDEFAULT : newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.WIRE_TYPE__MATERIAL, oldMaterial, material));
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
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcentricNeutralCableInfos()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWireArrangements()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return ((InternalEList<?>)getConcentricNeutralCableInfos()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return ((InternalEList<?>)getWireArrangements()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				return getRAC75();
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				return getRAC50();
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				return getRadius();
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return getConcentricNeutralCableInfos();
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				return getStrandCount();
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				return getCoreRadius();
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				return getRAC25();
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				return getRDC20();
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				return getSizeDescription();
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				return getCoreStrandCount();
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return getWireArrangements();
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				return getRatedCurrent();
			case AssetModelsPackage.WIRE_TYPE__GMR:
				return getGmr();
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				return getMaterial();
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
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				setRAC75((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				setRAC50((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				setRadius((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				getConcentricNeutralCableInfos().clear();
				getConcentricNeutralCableInfos().addAll((Collection<? extends ConcentricNeutralCableInfo>)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				setStrandCount((Integer)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				setCoreRadius((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				setRAC25((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				setRDC20((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				setSizeDescription((String)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				setCoreStrandCount((Integer)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				getWireArrangements().addAll((Collection<? extends WireArrangement>)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__GMR:
				setGmr((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				setMaterial((ConductorMaterialKind)newValue);
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
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				setRAC75(RAC75_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				setRAC50(RAC50_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				getConcentricNeutralCableInfos().clear();
				return;
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				setStrandCount(STRAND_COUNT_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				setCoreRadius(CORE_RADIUS_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				setRAC25(RAC25_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				setRDC20(RDC20_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				setSizeDescription(SIZE_DESCRIPTION_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				setCoreStrandCount(CORE_STRAND_COUNT_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				return;
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__GMR:
				setGmr(GMR_EDEFAULT);
				return;
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				setMaterial(MATERIAL_EDEFAULT);
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
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				return rAC75 != RAC75_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				return rAC50 != RAC50_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return concentricNeutralCableInfos != null && !concentricNeutralCableInfos.isEmpty();
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				return strandCount != STRAND_COUNT_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				return coreRadius != CORE_RADIUS_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				return rAC25 != RAC25_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				return rDC20 != RDC20_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				return SIZE_DESCRIPTION_EDEFAULT == null ? sizeDescription != null : !SIZE_DESCRIPTION_EDEFAULT.equals(sizeDescription);
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				return coreStrandCount != CORE_STRAND_COUNT_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return wireArrangements != null && !wireArrangements.isEmpty();
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__GMR:
				return gmr != GMR_EDEFAULT;
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				return material != MATERIAL_EDEFAULT;
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
		result.append(" (rAC75: ");
		result.append(rAC75);
		result.append(", rAC50: ");
		result.append(rAC50);
		result.append(", radius: ");
		result.append(radius);
		result.append(", strandCount: ");
		result.append(strandCount);
		result.append(", coreRadius: ");
		result.append(coreRadius);
		result.append(", rAC25: ");
		result.append(rAC25);
		result.append(", rDC20: ");
		result.append(rDC20);
		result.append(", sizeDescription: ");
		result.append(sizeDescription);
		result.append(", coreStrandCount: ");
		result.append(coreStrandCount);
		result.append(", ratedCurrent: ");
		result.append(ratedCurrent);
		result.append(", gmr: ");
		result.append(gmr);
		result.append(", material: ");
		result.append(material);
		result.append(')');
		return result.toString();
	}

} //WireTypeImpl
