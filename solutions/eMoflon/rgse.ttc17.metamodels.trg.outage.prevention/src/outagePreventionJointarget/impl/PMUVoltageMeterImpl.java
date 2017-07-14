/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import outagePreventionJointarget.EndDeviceAsset;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.PMUVoltageMeter;
import outagePreventionJointarget.ServiceDeliveryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMU Voltage Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getMRID <em>MRID</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageAMag <em>Voltage AMag</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageAAng <em>Voltage AAng</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageBMag <em>Voltage BMag</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageBAng <em>Voltage BAng</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageCMag <em>Voltage CMag</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageCAng <em>Voltage CAng</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageNeutMag <em>Voltage Neut Mag</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageNeutAng <em>Voltage Neut Ang</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageNetMag <em>Voltage Net Mag</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageNetAng <em>Voltage Net Ang</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageResMag <em>Voltage Res Mag</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl#getVoltageResAng <em>Voltage Res Ang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PMUVoltageMeterImpl extends AssetImpl implements PMUVoltageMeter {
	/**
	 * The cached value of the '{@link #getServiceDeliveryPoint() <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint serviceDeliveryPoint;

	/**
	 * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected static final String MRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected String mRID = MRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageAMag() <em>Voltage AMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAMag()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_AMAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageAMag() <em>Voltage AMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAMag()
	 * @generated
	 * @ordered
	 */
	protected double voltageAMag = VOLTAGE_AMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageAAng() <em>Voltage AAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAAng()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_AANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageAAng() <em>Voltage AAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAAng()
	 * @generated
	 * @ordered
	 */
	protected double voltageAAng = VOLTAGE_AANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageBMag() <em>Voltage BMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageBMag()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_BMAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageBMag() <em>Voltage BMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageBMag()
	 * @generated
	 * @ordered
	 */
	protected double voltageBMag = VOLTAGE_BMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageBAng() <em>Voltage BAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageBAng()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_BANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageBAng() <em>Voltage BAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageBAng()
	 * @generated
	 * @ordered
	 */
	protected double voltageBAng = VOLTAGE_BANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageCMag() <em>Voltage CMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageCMag()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_CMAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageCMag() <em>Voltage CMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageCMag()
	 * @generated
	 * @ordered
	 */
	protected double voltageCMag = VOLTAGE_CMAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageCAng() <em>Voltage CAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageCAng()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_CANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageCAng() <em>Voltage CAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageCAng()
	 * @generated
	 * @ordered
	 */
	protected double voltageCAng = VOLTAGE_CANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageNeutMag() <em>Voltage Neut Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNeutMag()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_NEUT_MAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageNeutMag() <em>Voltage Neut Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNeutMag()
	 * @generated
	 * @ordered
	 */
	protected double voltageNeutMag = VOLTAGE_NEUT_MAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageNeutAng() <em>Voltage Neut Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNeutAng()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_NEUT_ANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageNeutAng() <em>Voltage Neut Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNeutAng()
	 * @generated
	 * @ordered
	 */
	protected double voltageNeutAng = VOLTAGE_NEUT_ANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageNetMag() <em>Voltage Net Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNetMag()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_NET_MAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageNetMag() <em>Voltage Net Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNetMag()
	 * @generated
	 * @ordered
	 */
	protected double voltageNetMag = VOLTAGE_NET_MAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageNetAng() <em>Voltage Net Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNetAng()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_NET_ANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageNetAng() <em>Voltage Net Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageNetAng()
	 * @generated
	 * @ordered
	 */
	protected double voltageNetAng = VOLTAGE_NET_ANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageResMag() <em>Voltage Res Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageResMag()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_RES_MAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageResMag() <em>Voltage Res Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageResMag()
	 * @generated
	 * @ordered
	 */
	protected double voltageResMag = VOLTAGE_RES_MAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageResAng() <em>Voltage Res Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageResAng()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_RES_ANG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageResAng() <em>Voltage Res Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageResAng()
	 * @generated
	 * @ordered
	 */
	protected double voltageResAng = VOLTAGE_RES_ANG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMUVoltageMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.PMU_VOLTAGE_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint getServiceDeliveryPoint() {
		if (serviceDeliveryPoint != null && serviceDeliveryPoint.eIsProxy()) {
			InternalEObject oldServiceDeliveryPoint = (InternalEObject)serviceDeliveryPoint;
			serviceDeliveryPoint = (ServiceDeliveryPoint)eResolveProxy(oldServiceDeliveryPoint);
			if (serviceDeliveryPoint != oldServiceDeliveryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
			}
		}
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetServiceDeliveryPoint() {
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint) {
		ServiceDeliveryPoint oldServiceDeliveryPoint = serviceDeliveryPoint;
		serviceDeliveryPoint = newServiceDeliveryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMRID() {
		return mRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRID(String newMRID) {
		String oldMRID = mRID;
		mRID = newMRID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__MRID, oldMRID, mRID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageAMag() {
		return voltageAMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageAMag(double newVoltageAMag) {
		double oldVoltageAMag = voltageAMag;
		voltageAMag = newVoltageAMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AMAG, oldVoltageAMag, voltageAMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageAAng() {
		return voltageAAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageAAng(double newVoltageAAng) {
		double oldVoltageAAng = voltageAAng;
		voltageAAng = newVoltageAAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AANG, oldVoltageAAng, voltageAAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageBMag() {
		return voltageBMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageBMag(double newVoltageBMag) {
		double oldVoltageBMag = voltageBMag;
		voltageBMag = newVoltageBMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BMAG, oldVoltageBMag, voltageBMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageBAng() {
		return voltageBAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageBAng(double newVoltageBAng) {
		double oldVoltageBAng = voltageBAng;
		voltageBAng = newVoltageBAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BANG, oldVoltageBAng, voltageBAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageCMag() {
		return voltageCMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageCMag(double newVoltageCMag) {
		double oldVoltageCMag = voltageCMag;
		voltageCMag = newVoltageCMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CMAG, oldVoltageCMag, voltageCMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageCAng() {
		return voltageCAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageCAng(double newVoltageCAng) {
		double oldVoltageCAng = voltageCAng;
		voltageCAng = newVoltageCAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CANG, oldVoltageCAng, voltageCAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageNeutMag() {
		return voltageNeutMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageNeutMag(double newVoltageNeutMag) {
		double oldVoltageNeutMag = voltageNeutMag;
		voltageNeutMag = newVoltageNeutMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG, oldVoltageNeutMag, voltageNeutMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageNeutAng() {
		return voltageNeutAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageNeutAng(double newVoltageNeutAng) {
		double oldVoltageNeutAng = voltageNeutAng;
		voltageNeutAng = newVoltageNeutAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG, oldVoltageNeutAng, voltageNeutAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageNetMag() {
		return voltageNetMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageNetMag(double newVoltageNetMag) {
		double oldVoltageNetMag = voltageNetMag;
		voltageNetMag = newVoltageNetMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_MAG, oldVoltageNetMag, voltageNetMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageNetAng() {
		return voltageNetAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageNetAng(double newVoltageNetAng) {
		double oldVoltageNetAng = voltageNetAng;
		voltageNetAng = newVoltageNetAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_ANG, oldVoltageNetAng, voltageNetAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageResMag() {
		return voltageResMag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageResMag(double newVoltageResMag) {
		double oldVoltageResMag = voltageResMag;
		voltageResMag = newVoltageResMag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_MAG, oldVoltageResMag, voltageResMag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageResAng() {
		return voltageResAng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageResAng(double newVoltageResAng) {
		double oldVoltageResAng = voltageResAng;
		voltageResAng = newVoltageResAng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_ANG, oldVoltageResAng, voltageResAng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__MRID:
				return getMRID();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AMAG:
				return getVoltageAMag();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AANG:
				return getVoltageAAng();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BMAG:
				return getVoltageBMag();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BANG:
				return getVoltageBAng();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CMAG:
				return getVoltageCMag();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CANG:
				return getVoltageCAng();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG:
				return getVoltageNeutMag();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG:
				return getVoltageNeutAng();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_MAG:
				return getVoltageNetMag();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_ANG:
				return getVoltageNetAng();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_MAG:
				return getVoltageResMag();
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_ANG:
				return getVoltageResAng();
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
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__MRID:
				setMRID((String)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AMAG:
				setVoltageAMag((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AANG:
				setVoltageAAng((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BMAG:
				setVoltageBMag((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BANG:
				setVoltageBAng((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CMAG:
				setVoltageCMag((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CANG:
				setVoltageCAng((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG:
				setVoltageNeutMag((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG:
				setVoltageNeutAng((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_MAG:
				setVoltageNetMag((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_ANG:
				setVoltageNetAng((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_MAG:
				setVoltageResMag((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_ANG:
				setVoltageResAng((Double)newValue);
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
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__MRID:
				setMRID(MRID_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AMAG:
				setVoltageAMag(VOLTAGE_AMAG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AANG:
				setVoltageAAng(VOLTAGE_AANG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BMAG:
				setVoltageBMag(VOLTAGE_BMAG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BANG:
				setVoltageBAng(VOLTAGE_BANG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CMAG:
				setVoltageCMag(VOLTAGE_CMAG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CANG:
				setVoltageCAng(VOLTAGE_CANG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG:
				setVoltageNeutMag(VOLTAGE_NEUT_MAG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG:
				setVoltageNeutAng(VOLTAGE_NEUT_ANG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_MAG:
				setVoltageNetMag(VOLTAGE_NET_MAG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_ANG:
				setVoltageNetAng(VOLTAGE_NET_ANG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_MAG:
				setVoltageResMag(VOLTAGE_RES_MAG_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_ANG:
				setVoltageResAng(VOLTAGE_RES_ANG_EDEFAULT);
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
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__MRID:
				return MRID_EDEFAULT == null ? mRID != null : !MRID_EDEFAULT.equals(mRID);
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AMAG:
				return voltageAMag != VOLTAGE_AMAG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_AANG:
				return voltageAAng != VOLTAGE_AANG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BMAG:
				return voltageBMag != VOLTAGE_BMAG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_BANG:
				return voltageBAng != VOLTAGE_BANG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CMAG:
				return voltageCMag != VOLTAGE_CMAG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_CANG:
				return voltageCAng != VOLTAGE_CANG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG:
				return voltageNeutMag != VOLTAGE_NEUT_MAG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG:
				return voltageNeutAng != VOLTAGE_NEUT_ANG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_MAG:
				return voltageNetMag != VOLTAGE_NET_MAG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_NET_ANG:
				return voltageNetAng != VOLTAGE_NET_ANG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_MAG:
				return voltageResMag != VOLTAGE_RES_MAG_EDEFAULT;
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__VOLTAGE_RES_ANG:
				return voltageResAng != VOLTAGE_RES_ANG_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EndDeviceAsset.class) {
			switch (derivedFeatureID) {
				case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT: return OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EndDeviceAsset.class) {
			switch (baseFeatureID) {
				case OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT: return OutagePreventionJointargetPackage.PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (mRID: ");
		result.append(mRID);
		result.append(", VoltageAMag: ");
		result.append(voltageAMag);
		result.append(", VoltageAAng: ");
		result.append(voltageAAng);
		result.append(", VoltageBMag: ");
		result.append(voltageBMag);
		result.append(", VoltageBAng: ");
		result.append(voltageBAng);
		result.append(", VoltageCMag: ");
		result.append(voltageCMag);
		result.append(", VoltageCAng: ");
		result.append(voltageCAng);
		result.append(", VoltageNeutMag: ");
		result.append(voltageNeutMag);
		result.append(", VoltageNeutAng: ");
		result.append(voltageNeutAng);
		result.append(", VoltageNetMag: ");
		result.append(voltageNetMag);
		result.append(", VoltageNetAng: ");
		result.append(voltageNetAng);
		result.append(", VoltageResMag: ");
		result.append(voltageResMag);
		result.append(", VoltageResAng: ");
		result.append(voltageResAng);
		result.append(')');
		return result.toString();
	}

} //PMUVoltageMeterImpl
