/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.EnergyScheduling.CurtailmentProfile;
import CIM.IEC61970.Informative.EnergyScheduling.EnergyProduct;
import CIM.IEC61970.Informative.EnergyScheduling.EnergyProfile;
import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction;
import CIM.IEC61970.Informative.EnergyScheduling.LossProfile;
import CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.TransactionBid;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getEnergyPriceCurves <em>Energy Price Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getEnergyTransId <em>Energy Trans Id</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getState <em>State</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#isFirmInterchangeFlag <em>Firm Interchange Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getEnergyProduct <em>Energy Product</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getDeliveryPointP <em>Delivery Point P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getExport_SubControlArea <em>Export Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getImport_SubControlArea <em>Import Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getReceiptPointP <em>Receipt Point P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getCongestChargeMax <em>Congest Charge Max</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getEnergyProfiles <em>Energy Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getCurtailmentProfiles <em>Curtailment Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getLossProfiles <em>Loss Profiles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getEnergyMin <em>Energy Min</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.EnergyTransactionImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyTransactionImpl extends DocumentImpl implements EnergyTransaction {
	/**
	 * The cached value of the '{@link #getEnergyPriceCurves() <em>Energy Price Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyPriceCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyPriceCurve> energyPriceCurves;

	/**
	 * The cached value of the '{@link #getEnergyTransId() <em>Energy Trans Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyTransId()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionBid> energyTransId;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Object state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFirmInterchangeFlag() <em>Firm Interchange Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirmInterchangeFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRM_INTERCHANGE_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirmInterchangeFlag() <em>Firm Interchange Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirmInterchangeFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean firmInterchangeFlag = FIRM_INTERCHANGE_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyProduct() <em>Energy Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProduct()
	 * @generated
	 * @ordered
	 */
	protected EnergyProduct energyProduct;

	/**
	 * The default value of the '{@link #getDeliveryPointP() <em>Delivery Point P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPointP()
	 * @generated
	 * @ordered
	 */
	protected static final float DELIVERY_POINT_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeliveryPointP() <em>Delivery Point P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPointP()
	 * @generated
	 * @ordered
	 */
	protected float deliveryPointP = DELIVERY_POINT_P_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExport_SubControlArea() <em>Export Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_SubControlArea()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea export_SubControlArea;

	/**
	 * The cached value of the '{@link #getImport_SubControlArea() <em>Import Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_SubControlArea()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea import_SubControlArea;

	/**
	 * The default value of the '{@link #getReceiptPointP() <em>Receipt Point P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptPointP()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPT_POINT_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptPointP() <em>Receipt Point P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptPointP()
	 * @generated
	 * @ordered
	 */
	protected float receiptPointP = RECEIPT_POINT_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getCongestChargeMax() <em>Congest Charge Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongestChargeMax()
	 * @generated
	 * @ordered
	 */
	protected static final float CONGEST_CHARGE_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCongestChargeMax() <em>Congest Charge Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongestChargeMax()
	 * @generated
	 * @ordered
	 */
	protected float congestChargeMax = CONGEST_CHARGE_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnergyProfiles() <em>Energy Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProfile> energyProfiles;

	/**
	 * The cached value of the '{@link #getCurtailmentProfiles() <em>Curtailment Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailmentProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<CurtailmentProfile> curtailmentProfiles;

	/**
	 * The cached value of the '{@link #getLossProfiles() <em>Loss Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<LossProfile> lossProfiles;

	/**
	 * The default value of the '{@link #getEnergyMin() <em>Energy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMin()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyMin() <em>Energy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMin()
	 * @generated
	 * @ordered
	 */
	protected float energyMin = ENERGY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.ENERGY_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyPriceCurve> getEnergyPriceCurves() {
		if (energyPriceCurves == null) {
			energyPriceCurves = new EObjectWithInverseResolvingEList.ManyInverse<EnergyPriceCurve>(EnergyPriceCurve.class, this, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES, MarketOperationsPackage.ENERGY_PRICE_CURVE__ENERGY_TRANSACTIONS);
		}
		return energyPriceCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionBid> getEnergyTransId() {
		if (energyTransId == null) {
			energyTransId = new EObjectResolvingEList<TransactionBid>(TransactionBid.class, this, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_TRANS_ID);
		}
		return energyTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(Object newState) {
		Object oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirmInterchangeFlag() {
		return firmInterchangeFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmInterchangeFlag(boolean newFirmInterchangeFlag) {
		boolean oldFirmInterchangeFlag = firmInterchangeFlag;
		firmInterchangeFlag = newFirmInterchangeFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG, oldFirmInterchangeFlag, firmInterchangeFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyProduct getEnergyProduct() {
		if (energyProduct != null && energyProduct.eIsProxy()) {
			InternalEObject oldEnergyProduct = (InternalEObject)energyProduct;
			energyProduct = (EnergyProduct)eResolveProxy(oldEnergyProduct);
			if (energyProduct != oldEnergyProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT, oldEnergyProduct, energyProduct));
			}
		}
		return energyProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyProduct basicGetEnergyProduct() {
		return energyProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyProduct(EnergyProduct newEnergyProduct, NotificationChain msgs) {
		EnergyProduct oldEnergyProduct = energyProduct;
		energyProduct = newEnergyProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT, oldEnergyProduct, newEnergyProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyProduct(EnergyProduct newEnergyProduct) {
		if (newEnergyProduct != energyProduct) {
			NotificationChain msgs = null;
			if (energyProduct != null)
				msgs = ((InternalEObject)energyProduct).eInverseRemove(this, EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS, EnergyProduct.class, msgs);
			if (newEnergyProduct != null)
				msgs = ((InternalEObject)newEnergyProduct).eInverseAdd(this, EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS, EnergyProduct.class, msgs);
			msgs = basicSetEnergyProduct(newEnergyProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT, newEnergyProduct, newEnergyProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDeliveryPointP() {
		return deliveryPointP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryPointP(float newDeliveryPointP) {
		float oldDeliveryPointP = deliveryPointP;
		deliveryPointP = newDeliveryPointP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__DELIVERY_POINT_P, oldDeliveryPointP, deliveryPointP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getExport_SubControlArea() {
		if (export_SubControlArea != null && export_SubControlArea.eIsProxy()) {
			InternalEObject oldExport_SubControlArea = (InternalEObject)export_SubControlArea;
			export_SubControlArea = (SubControlArea)eResolveProxy(oldExport_SubControlArea);
			if (export_SubControlArea != oldExport_SubControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA, oldExport_SubControlArea, export_SubControlArea));
			}
		}
		return export_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetExport_SubControlArea() {
		return export_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport_SubControlArea(SubControlArea newExport_SubControlArea, NotificationChain msgs) {
		SubControlArea oldExport_SubControlArea = export_SubControlArea;
		export_SubControlArea = newExport_SubControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA, oldExport_SubControlArea, newExport_SubControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport_SubControlArea(SubControlArea newExport_SubControlArea) {
		if (newExport_SubControlArea != export_SubControlArea) {
			NotificationChain msgs = null;
			if (export_SubControlArea != null)
				msgs = ((InternalEObject)export_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS, SubControlArea.class, msgs);
			if (newExport_SubControlArea != null)
				msgs = ((InternalEObject)newExport_SubControlArea).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS, SubControlArea.class, msgs);
			msgs = basicSetExport_SubControlArea(newExport_SubControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA, newExport_SubControlArea, newExport_SubControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getImport_SubControlArea() {
		if (import_SubControlArea != null && import_SubControlArea.eIsProxy()) {
			InternalEObject oldImport_SubControlArea = (InternalEObject)import_SubControlArea;
			import_SubControlArea = (SubControlArea)eResolveProxy(oldImport_SubControlArea);
			if (import_SubControlArea != oldImport_SubControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA, oldImport_SubControlArea, import_SubControlArea));
			}
		}
		return import_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetImport_SubControlArea() {
		return import_SubControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport_SubControlArea(SubControlArea newImport_SubControlArea, NotificationChain msgs) {
		SubControlArea oldImport_SubControlArea = import_SubControlArea;
		import_SubControlArea = newImport_SubControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA, oldImport_SubControlArea, newImport_SubControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport_SubControlArea(SubControlArea newImport_SubControlArea) {
		if (newImport_SubControlArea != import_SubControlArea) {
			NotificationChain msgs = null;
			if (import_SubControlArea != null)
				msgs = ((InternalEObject)import_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS, SubControlArea.class, msgs);
			if (newImport_SubControlArea != null)
				msgs = ((InternalEObject)newImport_SubControlArea).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS, SubControlArea.class, msgs);
			msgs = basicSetImport_SubControlArea(newImport_SubControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA, newImport_SubControlArea, newImport_SubControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReceiptPointP() {
		return receiptPointP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiptPointP(float newReceiptPointP) {
		float oldReceiptPointP = receiptPointP;
		receiptPointP = newReceiptPointP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__RECEIPT_POINT_P, oldReceiptPointP, receiptPointP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCongestChargeMax() {
		return congestChargeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCongestChargeMax(float newCongestChargeMax) {
		float oldCongestChargeMax = congestChargeMax;
		congestChargeMax = newCongestChargeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__CONGEST_CHARGE_MAX, oldCongestChargeMax, congestChargeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnergyProfile> getEnergyProfiles() {
		if (energyProfiles == null) {
			energyProfiles = new EObjectWithInverseResolvingEList<EnergyProfile>(EnergyProfile.class, this, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES, EnergySchedulingPackage.ENERGY_PROFILE__ENERGY_TRANSACTION);
		}
		return energyProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurtailmentProfile> getCurtailmentProfiles() {
		if (curtailmentProfiles == null) {
			curtailmentProfiles = new EObjectWithInverseResolvingEList<CurtailmentProfile>(CurtailmentProfile.class, this, EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES, EnergySchedulingPackage.CURTAILMENT_PROFILE__ENERGY_TRANSACTION);
		}
		return curtailmentProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LossProfile> getLossProfiles() {
		if (lossProfiles == null) {
			lossProfiles = new EObjectWithInverseResolvingEList<LossProfile>(LossProfile.class, this, EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES, EnergySchedulingPackage.LOSS_PROFILE__ENERGY_TRANSACTION);
		}
		return lossProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyMin() {
		return energyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyMin(float newEnergyMin) {
		float oldEnergyMin = energyMin;
		energyMin = newEnergyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_MIN, oldEnergyMin, energyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.ENERGY_TRANSACTION__REASON, oldReason, reason));
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
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyPriceCurves()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT:
				if (energyProduct != null)
					msgs = ((InternalEObject)energyProduct).eInverseRemove(this, EnergySchedulingPackage.ENERGY_PRODUCT__ENERGY_TRANSACTIONS, EnergyProduct.class, msgs);
				return basicSetEnergyProduct((EnergyProduct)otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA:
				if (export_SubControlArea != null)
					msgs = ((InternalEObject)export_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__EXPORT_ENERGY_TRANSACTIONS, SubControlArea.class, msgs);
				return basicSetExport_SubControlArea((SubControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA:
				if (import_SubControlArea != null)
					msgs = ((InternalEObject)import_SubControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__IMPORT_ENERGY_TRANSACTIONS, SubControlArea.class, msgs);
				return basicSetImport_SubControlArea((SubControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyProfiles()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurtailmentProfiles()).basicAdd(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLossProfiles()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES:
				return ((InternalEList<?>)getEnergyPriceCurves()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT:
				return basicSetEnergyProduct(null, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA:
				return basicSetExport_SubControlArea(null, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA:
				return basicSetImport_SubControlArea(null, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES:
				return ((InternalEList<?>)getEnergyProfiles()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES:
				return ((InternalEList<?>)getCurtailmentProfiles()).basicRemove(otherEnd, msgs);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES:
				return ((InternalEList<?>)getLossProfiles()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES:
				return getEnergyPriceCurves();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_TRANS_ID:
				return getEnergyTransId();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__STATE:
				return getState();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG:
				return isFirmInterchangeFlag();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT:
				if (resolve) return getEnergyProduct();
				return basicGetEnergyProduct();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__DELIVERY_POINT_P:
				return getDeliveryPointP();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA:
				if (resolve) return getExport_SubControlArea();
				return basicGetExport_SubControlArea();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA:
				if (resolve) return getImport_SubControlArea();
				return basicGetImport_SubControlArea();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__RECEIPT_POINT_P:
				return getReceiptPointP();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CONGEST_CHARGE_MAX:
				return getCongestChargeMax();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES:
				return getEnergyProfiles();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES:
				return getCurtailmentProfiles();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES:
				return getLossProfiles();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_MIN:
				return getEnergyMin();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__REASON:
				return getReason();
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
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES:
				getEnergyPriceCurves().clear();
				getEnergyPriceCurves().addAll((Collection<? extends EnergyPriceCurve>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_TRANS_ID:
				getEnergyTransId().clear();
				getEnergyTransId().addAll((Collection<? extends TransactionBid>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__STATE:
				setState(newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG:
				setFirmInterchangeFlag((Boolean)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT:
				setEnergyProduct((EnergyProduct)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__DELIVERY_POINT_P:
				setDeliveryPointP((Float)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA:
				setExport_SubControlArea((SubControlArea)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA:
				setImport_SubControlArea((SubControlArea)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__RECEIPT_POINT_P:
				setReceiptPointP((Float)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CONGEST_CHARGE_MAX:
				setCongestChargeMax((Float)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES:
				getEnergyProfiles().clear();
				getEnergyProfiles().addAll((Collection<? extends EnergyProfile>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES:
				getCurtailmentProfiles().clear();
				getCurtailmentProfiles().addAll((Collection<? extends CurtailmentProfile>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES:
				getLossProfiles().clear();
				getLossProfiles().addAll((Collection<? extends LossProfile>)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_MIN:
				setEnergyMin((Float)newValue);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__REASON:
				setReason((String)newValue);
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
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES:
				getEnergyPriceCurves().clear();
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_TRANS_ID:
				getEnergyTransId().clear();
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG:
				setFirmInterchangeFlag(FIRM_INTERCHANGE_FLAG_EDEFAULT);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT:
				setEnergyProduct((EnergyProduct)null);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__DELIVERY_POINT_P:
				setDeliveryPointP(DELIVERY_POINT_P_EDEFAULT);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA:
				setExport_SubControlArea((SubControlArea)null);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA:
				setImport_SubControlArea((SubControlArea)null);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__RECEIPT_POINT_P:
				setReceiptPointP(RECEIPT_POINT_P_EDEFAULT);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CONGEST_CHARGE_MAX:
				setCongestChargeMax(CONGEST_CHARGE_MAX_EDEFAULT);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES:
				getEnergyProfiles().clear();
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES:
				getCurtailmentProfiles().clear();
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES:
				getLossProfiles().clear();
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_MIN:
				setEnergyMin(ENERGY_MIN_EDEFAULT);
				return;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__REASON:
				setReason(REASON_EDEFAULT);
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
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRICE_CURVES:
				return energyPriceCurves != null && !energyPriceCurves.isEmpty();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_TRANS_ID:
				return energyTransId != null && !energyTransId.isEmpty();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case EnergySchedulingPackage.ENERGY_TRANSACTION__FIRM_INTERCHANGE_FLAG:
				return firmInterchangeFlag != FIRM_INTERCHANGE_FLAG_EDEFAULT;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PRODUCT:
				return energyProduct != null;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__DELIVERY_POINT_P:
				return deliveryPointP != DELIVERY_POINT_P_EDEFAULT;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__EXPORT_SUB_CONTROL_AREA:
				return export_SubControlArea != null;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__IMPORT_SUB_CONTROL_AREA:
				return import_SubControlArea != null;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__RECEIPT_POINT_P:
				return receiptPointP != RECEIPT_POINT_P_EDEFAULT;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CONGEST_CHARGE_MAX:
				return congestChargeMax != CONGEST_CHARGE_MAX_EDEFAULT;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_PROFILES:
				return energyProfiles != null && !energyProfiles.isEmpty();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__CURTAILMENT_PROFILES:
				return curtailmentProfiles != null && !curtailmentProfiles.isEmpty();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__LOSS_PROFILES:
				return lossProfiles != null && !lossProfiles.isEmpty();
			case EnergySchedulingPackage.ENERGY_TRANSACTION__ENERGY_MIN:
				return energyMin != ENERGY_MIN_EDEFAULT;
			case EnergySchedulingPackage.ENERGY_TRANSACTION__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
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
		result.append(" (state: ");
		result.append(state);
		result.append(", firmInterchangeFlag: ");
		result.append(firmInterchangeFlag);
		result.append(", deliveryPointP: ");
		result.append(deliveryPointP);
		result.append(", receiptPointP: ");
		result.append(receiptPointP);
		result.append(", congestChargeMax: ");
		result.append(congestChargeMax);
		result.append(", energyMin: ");
		result.append(energyMin);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //EnergyTransactionImpl
