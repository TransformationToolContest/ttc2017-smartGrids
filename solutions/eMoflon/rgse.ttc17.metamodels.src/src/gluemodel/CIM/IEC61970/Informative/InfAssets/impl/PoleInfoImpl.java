/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Pole Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getTreatedDateTime <em>Treated Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#isBreastBlock <em>Breast Block</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getPreservativeKind <em>Preservative Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getJpaReference <em>Jpa Reference</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getBaseKind <em>Base Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getStreetlights <em>Streetlights</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getTreatmentKind <em>Treatment Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getConstruction <em>Construction</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getLength <em>Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.PoleInfoImpl#getSpeciesType <em>Species Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoleInfoImpl extends StructureInfoImpl implements PoleInfo {
	/**
	 * The default value of the '{@link #getTreatedDateTime() <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TREATED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreatedDateTime() <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date treatedDateTime = TREATED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBreastBlock() <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreastBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BREAST_BLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBreastBlock() <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreastBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean breastBlock = BREAST_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected String classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreservativeKind() <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreservativeKind()
	 * @generated
	 * @ordered
	 */
	protected static final PolePreservativeKind PRESERVATIVE_KIND_EDEFAULT = PolePreservativeKind.CELLON;

	/**
	 * The cached value of the '{@link #getPreservativeKind() <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreservativeKind()
	 * @generated
	 * @ordered
	 */
	protected PolePreservativeKind preservativeKind = PRESERVATIVE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getJpaReference() <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpaReference()
	 * @generated
	 * @ordered
	 */
	protected static final String JPA_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJpaReference() <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpaReference()
	 * @generated
	 * @ordered
	 */
	protected String jpaReference = JPA_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseKind() <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseKind()
	 * @generated
	 * @ordered
	 */
	protected static final PoleBaseKind BASE_KIND_EDEFAULT = PoleBaseKind.DIRT;

	/**
	 * The cached value of the '{@link #getBaseKind() <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseKind()
	 * @generated
	 * @ordered
	 */
	protected PoleBaseKind baseKind = BASE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected float diameter = DIAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStreetlights() <em>Streetlights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetlights()
	 * @generated
	 * @ordered
	 */
	protected EList<StreetlightInfo> streetlights;

	/**
	 * The default value of the '{@link #getTreatmentKind() <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentKind()
	 * @generated
	 * @ordered
	 */
	protected static final PoleTreatmentKind TREATMENT_KIND_EDEFAULT = PoleTreatmentKind.GRAY_STAIN;

	/**
	 * The cached value of the '{@link #getTreatmentKind() <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentKind()
	 * @generated
	 * @ordered
	 */
	protected PoleTreatmentKind treatmentKind = TREATMENT_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstruction() <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstruction() <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstruction()
	 * @generated
	 * @ordered
	 */
	protected String construction = CONSTRUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeciesType() <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeciesType()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeciesType() <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeciesType()
	 * @generated
	 * @ordered
	 */
	protected String speciesType = SPECIES_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoleInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getPoleInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTreatedDateTime() {
		return treatedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatedDateTime(Date newTreatedDateTime) {
		Date oldTreatedDateTime = treatedDateTime;
		treatedDateTime = newTreatedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__TREATED_DATE_TIME, oldTreatedDateTime, treatedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBreastBlock() {
		return breastBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreastBlock(boolean newBreastBlock) {
		boolean oldBreastBlock = breastBlock;
		breastBlock = newBreastBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__BREAST_BLOCK, oldBreastBlock, breastBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(String newClassification) {
		String oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolePreservativeKind getPreservativeKind() {
		return preservativeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreservativeKind(PolePreservativeKind newPreservativeKind) {
		PolePreservativeKind oldPreservativeKind = preservativeKind;
		preservativeKind = newPreservativeKind == null ? PRESERVATIVE_KIND_EDEFAULT : newPreservativeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__PRESERVATIVE_KIND, oldPreservativeKind, preservativeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJpaReference() {
		return jpaReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJpaReference(String newJpaReference) {
		String oldJpaReference = jpaReference;
		jpaReference = newJpaReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__JPA_REFERENCE, oldJpaReference, jpaReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleBaseKind getBaseKind() {
		return baseKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseKind(PoleBaseKind newBaseKind) {
		PoleBaseKind oldBaseKind = baseKind;
		baseKind = newBaseKind == null ? BASE_KIND_EDEFAULT : newBaseKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__BASE_KIND, oldBaseKind, baseKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameter(float newDiameter) {
		float oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__DIAMETER, oldDiameter, diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreetlightInfo> getStreetlights() {
		if (streetlights == null) {
			streetlights = new EObjectWithInverseResolvingEList<StreetlightInfo>(StreetlightInfo.class, this, InfAssetsPackage.POLE_INFO__STREETLIGHTS, InfAssetsPackage.STREETLIGHT_INFO__POLE);
		}
		return streetlights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleTreatmentKind getTreatmentKind() {
		return treatmentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatmentKind(PoleTreatmentKind newTreatmentKind) {
		PoleTreatmentKind oldTreatmentKind = treatmentKind;
		treatmentKind = newTreatmentKind == null ? TREATMENT_KIND_EDEFAULT : newTreatmentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__TREATMENT_KIND, oldTreatmentKind, treatmentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstruction() {
		return construction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstruction(String newConstruction) {
		String oldConstruction = construction;
		construction = newConstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__CONSTRUCTION, oldConstruction, construction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpeciesType() {
		return speciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeciesType(String newSpeciesType) {
		String oldSpeciesType = speciesType;
		speciesType = newSpeciesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.POLE_INFO__SPECIES_TYPE, oldSpeciesType, speciesType));
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
			case InfAssetsPackage.POLE_INFO__STREETLIGHTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStreetlights()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.POLE_INFO__STREETLIGHTS:
				return ((InternalEList<?>)getStreetlights()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.POLE_INFO__TREATED_DATE_TIME:
				return getTreatedDateTime();
			case InfAssetsPackage.POLE_INFO__BREAST_BLOCK:
				return isBreastBlock();
			case InfAssetsPackage.POLE_INFO__CLASSIFICATION:
				return getClassification();
			case InfAssetsPackage.POLE_INFO__PRESERVATIVE_KIND:
				return getPreservativeKind();
			case InfAssetsPackage.POLE_INFO__JPA_REFERENCE:
				return getJpaReference();
			case InfAssetsPackage.POLE_INFO__BASE_KIND:
				return getBaseKind();
			case InfAssetsPackage.POLE_INFO__DIAMETER:
				return getDiameter();
			case InfAssetsPackage.POLE_INFO__STREETLIGHTS:
				return getStreetlights();
			case InfAssetsPackage.POLE_INFO__TREATMENT_KIND:
				return getTreatmentKind();
			case InfAssetsPackage.POLE_INFO__CONSTRUCTION:
				return getConstruction();
			case InfAssetsPackage.POLE_INFO__LENGTH:
				return getLength();
			case InfAssetsPackage.POLE_INFO__SPECIES_TYPE:
				return getSpeciesType();
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
			case InfAssetsPackage.POLE_INFO__TREATED_DATE_TIME:
				setTreatedDateTime((Date)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__BREAST_BLOCK:
				setBreastBlock((Boolean)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__PRESERVATIVE_KIND:
				setPreservativeKind((PolePreservativeKind)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__JPA_REFERENCE:
				setJpaReference((String)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__BASE_KIND:
				setBaseKind((PoleBaseKind)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__DIAMETER:
				setDiameter((Float)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__STREETLIGHTS:
				getStreetlights().clear();
				getStreetlights().addAll((Collection<? extends StreetlightInfo>)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__TREATMENT_KIND:
				setTreatmentKind((PoleTreatmentKind)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__CONSTRUCTION:
				setConstruction((String)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__LENGTH:
				setLength((Float)newValue);
				return;
			case InfAssetsPackage.POLE_INFO__SPECIES_TYPE:
				setSpeciesType((String)newValue);
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
			case InfAssetsPackage.POLE_INFO__TREATED_DATE_TIME:
				setTreatedDateTime(TREATED_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__BREAST_BLOCK:
				setBreastBlock(BREAST_BLOCK_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__PRESERVATIVE_KIND:
				setPreservativeKind(PRESERVATIVE_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__JPA_REFERENCE:
				setJpaReference(JPA_REFERENCE_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__BASE_KIND:
				setBaseKind(BASE_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__DIAMETER:
				setDiameter(DIAMETER_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__STREETLIGHTS:
				getStreetlights().clear();
				return;
			case InfAssetsPackage.POLE_INFO__TREATMENT_KIND:
				setTreatmentKind(TREATMENT_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__CONSTRUCTION:
				setConstruction(CONSTRUCTION_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case InfAssetsPackage.POLE_INFO__SPECIES_TYPE:
				setSpeciesType(SPECIES_TYPE_EDEFAULT);
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
			case InfAssetsPackage.POLE_INFO__TREATED_DATE_TIME:
				return TREATED_DATE_TIME_EDEFAULT == null ? treatedDateTime != null : !TREATED_DATE_TIME_EDEFAULT.equals(treatedDateTime);
			case InfAssetsPackage.POLE_INFO__BREAST_BLOCK:
				return breastBlock != BREAST_BLOCK_EDEFAULT;
			case InfAssetsPackage.POLE_INFO__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case InfAssetsPackage.POLE_INFO__PRESERVATIVE_KIND:
				return preservativeKind != PRESERVATIVE_KIND_EDEFAULT;
			case InfAssetsPackage.POLE_INFO__JPA_REFERENCE:
				return JPA_REFERENCE_EDEFAULT == null ? jpaReference != null : !JPA_REFERENCE_EDEFAULT.equals(jpaReference);
			case InfAssetsPackage.POLE_INFO__BASE_KIND:
				return baseKind != BASE_KIND_EDEFAULT;
			case InfAssetsPackage.POLE_INFO__DIAMETER:
				return diameter != DIAMETER_EDEFAULT;
			case InfAssetsPackage.POLE_INFO__STREETLIGHTS:
				return streetlights != null && !streetlights.isEmpty();
			case InfAssetsPackage.POLE_INFO__TREATMENT_KIND:
				return treatmentKind != TREATMENT_KIND_EDEFAULT;
			case InfAssetsPackage.POLE_INFO__CONSTRUCTION:
				return CONSTRUCTION_EDEFAULT == null ? construction != null : !CONSTRUCTION_EDEFAULT.equals(construction);
			case InfAssetsPackage.POLE_INFO__LENGTH:
				return length != LENGTH_EDEFAULT;
			case InfAssetsPackage.POLE_INFO__SPECIES_TYPE:
				return SPECIES_TYPE_EDEFAULT == null ? speciesType != null : !SPECIES_TYPE_EDEFAULT.equals(speciesType);
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
		result.append(" (treatedDateTime: ");
		result.append(treatedDateTime);
		result.append(", breastBlock: ");
		result.append(breastBlock);
		result.append(", classification: ");
		result.append(classification);
		result.append(", preservativeKind: ");
		result.append(preservativeKind);
		result.append(", jpaReference: ");
		result.append(jpaReference);
		result.append(", baseKind: ");
		result.append(baseKind);
		result.append(", diameter: ");
		result.append(diameter);
		result.append(", treatmentKind: ");
		result.append(treatmentKind);
		result.append(", construction: ");
		result.append(construction);
		result.append(", length: ");
		result.append(length);
		result.append(", speciesType: ");
		result.append(speciesType);
		result.append(')');
		return result.toString();
	}

} //PoleInfoImpl
