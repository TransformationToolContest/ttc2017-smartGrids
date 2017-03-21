/**
 */
package CIM.IEC61970.Informative.MarketOperations.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.TransmissionProvider;

import CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin;
import CIM.IEC61970.Informative.MarketOperations.FTR;
import CIM.IEC61970.Informative.MarketOperations.Flowgate;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin;
import CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import CIM.IEC61970.Wires.Line;
import CIM.IEC61970.Wires.PowerTransformer;
import CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Flowgate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getTransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getAfcUseCode <em>Afc Use Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getIdcOperationalName <em>Idc Operational Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getInServiceDate <em>In Service Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getOutOfServiceDate <em>Out Of Service Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#isCoordinatedFlag <em>Coordinated Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#isAtcFlag <em>Atc Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getDeletionDate <em>Deletion Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#isReciprocalFlag <em>Reciprocal Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getIdcAssignedId <em>Idc Assigned Id</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getPowerTransormers <em>Power Transormers</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getPositiveImpactValue <em>Positive Impact Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getFTRs <em>FT Rs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getCounterFlowValue <em>Counter Flow Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getCoordinationStudyDate <em>Coordination Study Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getSubControlArea <em>Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getIdcType <em>Idc Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#isManagingEntityFlag <em>Managing Entity Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.impl.FlowgateImpl#getTransmissionProvider <em>Transmission Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowgateImpl extends PowerSystemResourceImpl implements Flowgate {
	/**
	 * The cached value of the '{@link #getTransmissionReliabilityMargin() <em>Transmission Reliability Margin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionReliabilityMargin()
	 * @generated
	 * @ordered
	 */
	protected TransmissionReliabilityMargin transmissionReliabilityMargin;

	/**
	 * The default value of the '{@link #getAfcUseCode() <em>Afc Use Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfcUseCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object AFC_USE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfcUseCode() <em>Afc Use Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfcUseCode()
	 * @generated
	 * @ordered
	 */
	protected Object afcUseCode = AFC_USE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdcOperationalName() <em>Idc Operational Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcOperationalName()
	 * @generated
	 * @ordered
	 */
	protected static final String IDC_OPERATIONAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdcOperationalName() <em>Idc Operational Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcOperationalName()
	 * @generated
	 * @ordered
	 */
	protected String idcOperationalName = IDC_OPERATIONAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInServiceDate() <em>In Service Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInServiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date IN_SERVICE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInServiceDate() <em>In Service Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInServiceDate()
	 * @generated
	 * @ordered
	 */
	protected Date inServiceDate = IN_SERVICE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViolationLimits() <em>Violation Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ViolationLimit> violationLimits;

	/**
	 * The default value of the '{@link #getOutOfServiceDate() <em>Out Of Service Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutOfServiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date OUT_OF_SERVICE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutOfServiceDate() <em>Out Of Service Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutOfServiceDate()
	 * @generated
	 * @ordered
	 */
	protected Date outOfServiceDate = OUT_OF_SERVICE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapacityBenefitMargin() <em>Capacity Benefit Margin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityBenefitMargin()
	 * @generated
	 * @ordered
	 */
	protected EList<CapacityBenefitMargin> capacityBenefitMargin;

	/**
	 * The default value of the '{@link #isCoordinatedFlag() <em>Coordinated Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCoordinatedFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COORDINATED_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCoordinatedFlag() <em>Coordinated Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCoordinatedFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean coordinatedFlag = COORDINATED_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isAtcFlag() <em>Atc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtcFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATC_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtcFlag() <em>Atc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtcFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean atcFlag = ATC_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeletionDate() <em>Deletion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELETION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeletionDate() <em>Deletion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionDate()
	 * @generated
	 * @ordered
	 */
	protected Date deletionDate = DELETION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReciprocalFlag() <em>Reciprocal Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReciprocalFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECIPROCAL_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReciprocalFlag() <em>Reciprocal Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReciprocalFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean reciprocalFlag = RECIPROCAL_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdcAssignedId() <em>Idc Assigned Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcAssignedId()
	 * @generated
	 * @ordered
	 */
	protected static final int IDC_ASSIGNED_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdcAssignedId() <em>Idc Assigned Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcAssignedId()
	 * @generated
	 * @ordered
	 */
	protected int idcAssignedId = IDC_ASSIGNED_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerTransormers() <em>Power Transormers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransormers()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerTransformer> powerTransormers;

	/**
	 * The default value of the '{@link #getPositiveImpactValue() <em>Positive Impact Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveImpactValue()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITIVE_IMPACT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositiveImpactValue() <em>Positive Impact Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveImpactValue()
	 * @generated
	 * @ordered
	 */
	protected int positiveImpactValue = POSITIVE_IMPACT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFTRs() <em>FT Rs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTRs()
	 * @generated
	 * @ordered
	 */
	protected EList<FTR> ftRs;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The default value of the '{@link #getCounterFlowValue() <em>Counter Flow Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterFlowValue()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTER_FLOW_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCounterFlowValue() <em>Counter Flow Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterFlowValue()
	 * @generated
	 * @ordered
	 */
	protected int counterFlowValue = COUNTER_FLOW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordinationStudyDate() <em>Coordination Study Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationStudyDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date COORDINATION_STUDY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinationStudyDate() <em>Coordination Study Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationStudyDate()
	 * @generated
	 * @ordered
	 */
	protected Date coordinationStudyDate = COORDINATION_STUDY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubControlArea() <em>Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubControlArea()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea subControlArea;

	/**
	 * The default value of the '{@link #getIdcType() <em>Idc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcType()
	 * @generated
	 * @ordered
	 */
	protected static final Object IDC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdcType() <em>Idc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcType()
	 * @generated
	 * @ordered
	 */
	protected Object idcType = IDC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isManagingEntityFlag() <em>Managing Entity Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManagingEntityFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANAGING_ENTITY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManagingEntityFlag() <em>Managing Entity Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManagingEntityFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean managingEntityFlag = MANAGING_ENTITY_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransmissionProvider() <em>Transmission Provider</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionProvider> transmissionProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowgateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.FLOWGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionReliabilityMargin getTransmissionReliabilityMargin() {
		if (transmissionReliabilityMargin != null && transmissionReliabilityMargin.eIsProxy()) {
			InternalEObject oldTransmissionReliabilityMargin = (InternalEObject)transmissionReliabilityMargin;
			transmissionReliabilityMargin = (TransmissionReliabilityMargin)eResolveProxy(oldTransmissionReliabilityMargin);
			if (transmissionReliabilityMargin != oldTransmissionReliabilityMargin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN, oldTransmissionReliabilityMargin, transmissionReliabilityMargin));
			}
		}
		return transmissionReliabilityMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionReliabilityMargin basicGetTransmissionReliabilityMargin() {
		return transmissionReliabilityMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionReliabilityMargin(TransmissionReliabilityMargin newTransmissionReliabilityMargin, NotificationChain msgs) {
		TransmissionReliabilityMargin oldTransmissionReliabilityMargin = transmissionReliabilityMargin;
		transmissionReliabilityMargin = newTransmissionReliabilityMargin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN, oldTransmissionReliabilityMargin, newTransmissionReliabilityMargin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionReliabilityMargin(TransmissionReliabilityMargin newTransmissionReliabilityMargin) {
		if (newTransmissionReliabilityMargin != transmissionReliabilityMargin) {
			NotificationChain msgs = null;
			if (transmissionReliabilityMargin != null)
				msgs = ((InternalEObject)transmissionReliabilityMargin).eInverseRemove(this, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE, TransmissionReliabilityMargin.class, msgs);
			if (newTransmissionReliabilityMargin != null)
				msgs = ((InternalEObject)newTransmissionReliabilityMargin).eInverseAdd(this, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE, TransmissionReliabilityMargin.class, msgs);
			msgs = basicSetTransmissionReliabilityMargin(newTransmissionReliabilityMargin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN, newTransmissionReliabilityMargin, newTransmissionReliabilityMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAfcUseCode() {
		return afcUseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfcUseCode(Object newAfcUseCode) {
		Object oldAfcUseCode = afcUseCode;
		afcUseCode = newAfcUseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__AFC_USE_CODE, oldAfcUseCode, afcUseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdcOperationalName() {
		return idcOperationalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdcOperationalName(String newIdcOperationalName) {
		String oldIdcOperationalName = idcOperationalName;
		idcOperationalName = newIdcOperationalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__IDC_OPERATIONAL_NAME, oldIdcOperationalName, idcOperationalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInServiceDate() {
		return inServiceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInServiceDate(Date newInServiceDate) {
		Date oldInServiceDate = inServiceDate;
		inServiceDate = newInServiceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__IN_SERVICE_DATE, oldInServiceDate, inServiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViolationLimit> getViolationLimits() {
		if (violationLimits == null) {
			violationLimits = new EObjectWithInverseResolvingEList<ViolationLimit>(ViolationLimit.class, this, MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS, MarketOperationsPackage.VIOLATION_LIMIT__FLOWGATE);
		}
		return violationLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOutOfServiceDate() {
		return outOfServiceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutOfServiceDate(Date newOutOfServiceDate) {
		Date oldOutOfServiceDate = outOfServiceDate;
		outOfServiceDate = newOutOfServiceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__OUT_OF_SERVICE_DATE, oldOutOfServiceDate, outOfServiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapacityBenefitMargin> getCapacityBenefitMargin() {
		if (capacityBenefitMargin == null) {
			capacityBenefitMargin = new EObjectWithInverseResolvingEList.ManyInverse<CapacityBenefitMargin>(CapacityBenefitMargin.class, this, MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN, MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__FLOWGATE);
		}
		return capacityBenefitMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCoordinatedFlag() {
		return coordinatedFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinatedFlag(boolean newCoordinatedFlag) {
		boolean oldCoordinatedFlag = coordinatedFlag;
		coordinatedFlag = newCoordinatedFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__COORDINATED_FLAG, oldCoordinatedFlag, coordinatedFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtcFlag() {
		return atcFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtcFlag(boolean newAtcFlag) {
		boolean oldAtcFlag = atcFlag;
		atcFlag = newAtcFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__ATC_FLAG, oldAtcFlag, atcFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeletionDate() {
		return deletionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletionDate(Date newDeletionDate) {
		Date oldDeletionDate = deletionDate;
		deletionDate = newDeletionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__DELETION_DATE, oldDeletionDate, deletionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReciprocalFlag() {
		return reciprocalFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReciprocalFlag(boolean newReciprocalFlag) {
		boolean oldReciprocalFlag = reciprocalFlag;
		reciprocalFlag = newReciprocalFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__RECIPROCAL_FLAG, oldReciprocalFlag, reciprocalFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdcAssignedId() {
		return idcAssignedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdcAssignedId(int newIdcAssignedId) {
		int oldIdcAssignedId = idcAssignedId;
		idcAssignedId = newIdcAssignedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__IDC_ASSIGNED_ID, oldIdcAssignedId, idcAssignedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerTransformer> getPowerTransormers() {
		if (powerTransormers == null) {
			powerTransormers = new EObjectWithInverseResolvingEList.ManyInverse<PowerTransformer>(PowerTransformer.class, this, MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS, WiresPackage.POWER_TRANSFORMER__FLOWGATES);
		}
		return powerTransormers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositiveImpactValue() {
		return positiveImpactValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveImpactValue(int newPositiveImpactValue) {
		int oldPositiveImpactValue = positiveImpactValue;
		positiveImpactValue = newPositiveImpactValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__POSITIVE_IMPACT_VALUE, oldPositiveImpactValue, positiveImpactValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTR> getFTRs() {
		if (ftRs == null) {
			ftRs = new EObjectWithInverseResolvingEList<FTR>(FTR.class, this, MarketOperationsPackage.FLOWGATE__FT_RS, MarketOperationsPackage.FTR__FLOWGATE);
		}
		return ftRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectWithInverseResolvingEList.ManyInverse<Line>(Line.class, this, MarketOperationsPackage.FLOWGATE__LINES, WiresPackage.LINE__FLOWGATES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCounterFlowValue() {
		return counterFlowValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterFlowValue(int newCounterFlowValue) {
		int oldCounterFlowValue = counterFlowValue;
		counterFlowValue = newCounterFlowValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__COUNTER_FLOW_VALUE, oldCounterFlowValue, counterFlowValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCoordinationStudyDate() {
		return coordinationStudyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationStudyDate(Date newCoordinationStudyDate) {
		Date oldCoordinationStudyDate = coordinationStudyDate;
		coordinationStudyDate = newCoordinationStudyDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__COORDINATION_STUDY_DATE, oldCoordinationStudyDate, coordinationStudyDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getSubControlArea() {
		if (subControlArea != null && subControlArea.eIsProxy()) {
			InternalEObject oldSubControlArea = (InternalEObject)subControlArea;
			subControlArea = (SubControlArea)eResolveProxy(oldSubControlArea);
			if (subControlArea != oldSubControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA, oldSubControlArea, subControlArea));
			}
		}
		return subControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetSubControlArea() {
		return subControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubControlArea(SubControlArea newSubControlArea, NotificationChain msgs) {
		SubControlArea oldSubControlArea = subControlArea;
		subControlArea = newSubControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA, oldSubControlArea, newSubControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubControlArea(SubControlArea newSubControlArea) {
		if (newSubControlArea != subControlArea) {
			NotificationChain msgs = null;
			if (subControlArea != null)
				msgs = ((InternalEObject)subControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE, SubControlArea.class, msgs);
			if (newSubControlArea != null)
				msgs = ((InternalEObject)newSubControlArea).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE, SubControlArea.class, msgs);
			msgs = basicSetSubControlArea(newSubControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA, newSubControlArea, newSubControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIdcType() {
		return idcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdcType(Object newIdcType) {
		Object oldIdcType = idcType;
		idcType = newIdcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__IDC_TYPE, oldIdcType, idcType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManagingEntityFlag() {
		return managingEntityFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingEntityFlag(boolean newManagingEntityFlag) {
		boolean oldManagingEntityFlag = managingEntityFlag;
		managingEntityFlag = newManagingEntityFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.FLOWGATE__MANAGING_ENTITY_FLAG, oldManagingEntityFlag, managingEntityFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionProvider> getTransmissionProvider() {
		if (transmissionProvider == null) {
			transmissionProvider = new EObjectWithInverseResolvingEList.ManyInverse<TransmissionProvider>(TransmissionProvider.class, this, MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER, FinancialPackage.TRANSMISSION_PROVIDER__FLOWGATE);
		}
		return transmissionProvider;
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
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN:
				if (transmissionReliabilityMargin != null)
					msgs = ((InternalEObject)transmissionReliabilityMargin).eInverseRemove(this, MarketOperationsPackage.TRANSMISSION_RELIABILITY_MARGIN__FLOWGATE, TransmissionReliabilityMargin.class, msgs);
				return basicSetTransmissionReliabilityMargin((TransmissionReliabilityMargin)otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViolationLimits()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacityBenefitMargin()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerTransormers()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__FT_RS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFTRs()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA:
				if (subControlArea != null)
					msgs = ((InternalEObject)subControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__FLOWGATE, SubControlArea.class, msgs);
				return basicSetSubControlArea((SubControlArea)otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransmissionProvider()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN:
				return basicSetTransmissionReliabilityMargin(null, msgs);
			case MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS:
				return ((InternalEList<?>)getViolationLimits()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN:
				return ((InternalEList<?>)getCapacityBenefitMargin()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS:
				return ((InternalEList<?>)getPowerTransormers()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__FT_RS:
				return ((InternalEList<?>)getFTRs()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA:
				return basicSetSubControlArea(null, msgs);
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER:
				return ((InternalEList<?>)getTransmissionProvider()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN:
				if (resolve) return getTransmissionReliabilityMargin();
				return basicGetTransmissionReliabilityMargin();
			case MarketOperationsPackage.FLOWGATE__AFC_USE_CODE:
				return getAfcUseCode();
			case MarketOperationsPackage.FLOWGATE__IDC_OPERATIONAL_NAME:
				return getIdcOperationalName();
			case MarketOperationsPackage.FLOWGATE__IN_SERVICE_DATE:
				return getInServiceDate();
			case MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS:
				return getViolationLimits();
			case MarketOperationsPackage.FLOWGATE__OUT_OF_SERVICE_DATE:
				return getOutOfServiceDate();
			case MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN:
				return getCapacityBenefitMargin();
			case MarketOperationsPackage.FLOWGATE__COORDINATED_FLAG:
				return isCoordinatedFlag();
			case MarketOperationsPackage.FLOWGATE__ATC_FLAG:
				return isAtcFlag();
			case MarketOperationsPackage.FLOWGATE__DELETION_DATE:
				return getDeletionDate();
			case MarketOperationsPackage.FLOWGATE__RECIPROCAL_FLAG:
				return isReciprocalFlag();
			case MarketOperationsPackage.FLOWGATE__IDC_ASSIGNED_ID:
				return getIdcAssignedId();
			case MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS:
				return getPowerTransormers();
			case MarketOperationsPackage.FLOWGATE__POSITIVE_IMPACT_VALUE:
				return getPositiveImpactValue();
			case MarketOperationsPackage.FLOWGATE__FT_RS:
				return getFTRs();
			case MarketOperationsPackage.FLOWGATE__LINES:
				return getLines();
			case MarketOperationsPackage.FLOWGATE__COUNTER_FLOW_VALUE:
				return getCounterFlowValue();
			case MarketOperationsPackage.FLOWGATE__COORDINATION_STUDY_DATE:
				return getCoordinationStudyDate();
			case MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA:
				if (resolve) return getSubControlArea();
				return basicGetSubControlArea();
			case MarketOperationsPackage.FLOWGATE__IDC_TYPE:
				return getIdcType();
			case MarketOperationsPackage.FLOWGATE__MANAGING_ENTITY_FLAG:
				return isManagingEntityFlag();
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER:
				return getTransmissionProvider();
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
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN:
				setTransmissionReliabilityMargin((TransmissionReliabilityMargin)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__AFC_USE_CODE:
				setAfcUseCode(newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__IDC_OPERATIONAL_NAME:
				setIdcOperationalName((String)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__IN_SERVICE_DATE:
				setInServiceDate((Date)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS:
				getViolationLimits().clear();
				getViolationLimits().addAll((Collection<? extends ViolationLimit>)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__OUT_OF_SERVICE_DATE:
				setOutOfServiceDate((Date)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN:
				getCapacityBenefitMargin().clear();
				getCapacityBenefitMargin().addAll((Collection<? extends CapacityBenefitMargin>)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__COORDINATED_FLAG:
				setCoordinatedFlag((Boolean)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__ATC_FLAG:
				setAtcFlag((Boolean)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__DELETION_DATE:
				setDeletionDate((Date)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__RECIPROCAL_FLAG:
				setReciprocalFlag((Boolean)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__IDC_ASSIGNED_ID:
				setIdcAssignedId((Integer)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS:
				getPowerTransormers().clear();
				getPowerTransormers().addAll((Collection<? extends PowerTransformer>)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__POSITIVE_IMPACT_VALUE:
				setPositiveImpactValue((Integer)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__FT_RS:
				getFTRs().clear();
				getFTRs().addAll((Collection<? extends FTR>)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__COUNTER_FLOW_VALUE:
				setCounterFlowValue((Integer)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__COORDINATION_STUDY_DATE:
				setCoordinationStudyDate((Date)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA:
				setSubControlArea((SubControlArea)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__IDC_TYPE:
				setIdcType(newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__MANAGING_ENTITY_FLAG:
				setManagingEntityFlag((Boolean)newValue);
				return;
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER:
				getTransmissionProvider().clear();
				getTransmissionProvider().addAll((Collection<? extends TransmissionProvider>)newValue);
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
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN:
				setTransmissionReliabilityMargin((TransmissionReliabilityMargin)null);
				return;
			case MarketOperationsPackage.FLOWGATE__AFC_USE_CODE:
				setAfcUseCode(AFC_USE_CODE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__IDC_OPERATIONAL_NAME:
				setIdcOperationalName(IDC_OPERATIONAL_NAME_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__IN_SERVICE_DATE:
				setInServiceDate(IN_SERVICE_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS:
				getViolationLimits().clear();
				return;
			case MarketOperationsPackage.FLOWGATE__OUT_OF_SERVICE_DATE:
				setOutOfServiceDate(OUT_OF_SERVICE_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN:
				getCapacityBenefitMargin().clear();
				return;
			case MarketOperationsPackage.FLOWGATE__COORDINATED_FLAG:
				setCoordinatedFlag(COORDINATED_FLAG_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__ATC_FLAG:
				setAtcFlag(ATC_FLAG_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__DELETION_DATE:
				setDeletionDate(DELETION_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__RECIPROCAL_FLAG:
				setReciprocalFlag(RECIPROCAL_FLAG_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__IDC_ASSIGNED_ID:
				setIdcAssignedId(IDC_ASSIGNED_ID_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS:
				getPowerTransormers().clear();
				return;
			case MarketOperationsPackage.FLOWGATE__POSITIVE_IMPACT_VALUE:
				setPositiveImpactValue(POSITIVE_IMPACT_VALUE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__FT_RS:
				getFTRs().clear();
				return;
			case MarketOperationsPackage.FLOWGATE__LINES:
				getLines().clear();
				return;
			case MarketOperationsPackage.FLOWGATE__COUNTER_FLOW_VALUE:
				setCounterFlowValue(COUNTER_FLOW_VALUE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__COORDINATION_STUDY_DATE:
				setCoordinationStudyDate(COORDINATION_STUDY_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA:
				setSubControlArea((SubControlArea)null);
				return;
			case MarketOperationsPackage.FLOWGATE__IDC_TYPE:
				setIdcType(IDC_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__MANAGING_ENTITY_FLAG:
				setManagingEntityFlag(MANAGING_ENTITY_FLAG_EDEFAULT);
				return;
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER:
				getTransmissionProvider().clear();
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
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_RELIABILITY_MARGIN:
				return transmissionReliabilityMargin != null;
			case MarketOperationsPackage.FLOWGATE__AFC_USE_CODE:
				return AFC_USE_CODE_EDEFAULT == null ? afcUseCode != null : !AFC_USE_CODE_EDEFAULT.equals(afcUseCode);
			case MarketOperationsPackage.FLOWGATE__IDC_OPERATIONAL_NAME:
				return IDC_OPERATIONAL_NAME_EDEFAULT == null ? idcOperationalName != null : !IDC_OPERATIONAL_NAME_EDEFAULT.equals(idcOperationalName);
			case MarketOperationsPackage.FLOWGATE__IN_SERVICE_DATE:
				return IN_SERVICE_DATE_EDEFAULT == null ? inServiceDate != null : !IN_SERVICE_DATE_EDEFAULT.equals(inServiceDate);
			case MarketOperationsPackage.FLOWGATE__VIOLATION_LIMITS:
				return violationLimits != null && !violationLimits.isEmpty();
			case MarketOperationsPackage.FLOWGATE__OUT_OF_SERVICE_DATE:
				return OUT_OF_SERVICE_DATE_EDEFAULT == null ? outOfServiceDate != null : !OUT_OF_SERVICE_DATE_EDEFAULT.equals(outOfServiceDate);
			case MarketOperationsPackage.FLOWGATE__CAPACITY_BENEFIT_MARGIN:
				return capacityBenefitMargin != null && !capacityBenefitMargin.isEmpty();
			case MarketOperationsPackage.FLOWGATE__COORDINATED_FLAG:
				return coordinatedFlag != COORDINATED_FLAG_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__ATC_FLAG:
				return atcFlag != ATC_FLAG_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__DELETION_DATE:
				return DELETION_DATE_EDEFAULT == null ? deletionDate != null : !DELETION_DATE_EDEFAULT.equals(deletionDate);
			case MarketOperationsPackage.FLOWGATE__RECIPROCAL_FLAG:
				return reciprocalFlag != RECIPROCAL_FLAG_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__IDC_ASSIGNED_ID:
				return idcAssignedId != IDC_ASSIGNED_ID_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__POWER_TRANSORMERS:
				return powerTransormers != null && !powerTransormers.isEmpty();
			case MarketOperationsPackage.FLOWGATE__POSITIVE_IMPACT_VALUE:
				return positiveImpactValue != POSITIVE_IMPACT_VALUE_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__FT_RS:
				return ftRs != null && !ftRs.isEmpty();
			case MarketOperationsPackage.FLOWGATE__LINES:
				return lines != null && !lines.isEmpty();
			case MarketOperationsPackage.FLOWGATE__COUNTER_FLOW_VALUE:
				return counterFlowValue != COUNTER_FLOW_VALUE_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__COORDINATION_STUDY_DATE:
				return COORDINATION_STUDY_DATE_EDEFAULT == null ? coordinationStudyDate != null : !COORDINATION_STUDY_DATE_EDEFAULT.equals(coordinationStudyDate);
			case MarketOperationsPackage.FLOWGATE__SUB_CONTROL_AREA:
				return subControlArea != null;
			case MarketOperationsPackage.FLOWGATE__IDC_TYPE:
				return IDC_TYPE_EDEFAULT == null ? idcType != null : !IDC_TYPE_EDEFAULT.equals(idcType);
			case MarketOperationsPackage.FLOWGATE__MANAGING_ENTITY_FLAG:
				return managingEntityFlag != MANAGING_ENTITY_FLAG_EDEFAULT;
			case MarketOperationsPackage.FLOWGATE__TRANSMISSION_PROVIDER:
				return transmissionProvider != null && !transmissionProvider.isEmpty();
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
		result.append(" (AfcUseCode: ");
		result.append(afcUseCode);
		result.append(", IdcOperationalName: ");
		result.append(idcOperationalName);
		result.append(", inServiceDate: ");
		result.append(inServiceDate);
		result.append(", outOfServiceDate: ");
		result.append(outOfServiceDate);
		result.append(", coordinatedFlag: ");
		result.append(coordinatedFlag);
		result.append(", AtcFlag: ");
		result.append(atcFlag);
		result.append(", deletionDate: ");
		result.append(deletionDate);
		result.append(", reciprocalFlag: ");
		result.append(reciprocalFlag);
		result.append(", IdcAssignedId: ");
		result.append(idcAssignedId);
		result.append(", positiveImpactValue: ");
		result.append(positiveImpactValue);
		result.append(", counterFlowValue: ");
		result.append(counterFlowValue);
		result.append(", coordinationStudyDate: ");
		result.append(coordinationStudyDate);
		result.append(", IdcType: ");
		result.append(idcType);
		result.append(", managingEntityFlag: ");
		result.append(managingEntityFlag);
		result.append(')');
		return result.toString();
	}

} //FlowgateImpl
