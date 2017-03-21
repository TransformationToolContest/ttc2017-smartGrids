/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvShuntCompensatorSections;

import CIM.IEC61970.Wires.ShuntCompensator;
import CIM.IEC61970.Wires.WiresPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getB0PerSection <em>B0 Per Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getNomQ <em>Nom Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getNomU <em>Nom U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getGPerSection <em>GPer Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getG0PerSection <em>G0 Per Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.ShuntCompensatorImpl#getReactivePerSection <em>Reactive Per Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntCompensatorImpl extends RegulatingCondEqImpl implements ShuntCompensator {
	/**
	 * The default value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSections()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSections()
	 * @generated
	 * @ordered
	 */
	protected int normalSections = NORMAL_SECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected float minU = MIN_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getB0PerSection() <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0PerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0PerSection() <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0PerSection()
	 * @generated
	 * @ordered
	 */
	protected float b0PerSection = B0_PER_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomQ() <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomQ()
	 * @generated
	 * @ordered
	 */
	protected static final float NOM_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNomQ() <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomQ()
	 * @generated
	 * @ordered
	 */
	protected float nomQ = NOM_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomU()
	 * @generated
	 * @ordered
	 */
	protected static final float NOM_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomU()
	 * @generated
	 * @ordered
	 */
	protected float nomU = NOM_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSections()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSections()
	 * @generated
	 * @ordered
	 */
	protected int maximumSections = MAXIMUM_SECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCH_ON_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected int switchOnCount = SWITCH_ON_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected float maxU = MAX_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getBPerSection() <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float BPER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBPerSection() <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPerSection()
	 * @generated
	 * @ordered
	 */
	protected float bPerSection = BPER_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGPerSection() <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float GPER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGPerSection() <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPerSection()
	 * @generated
	 * @ordered
	 */
	protected float gPerSection = GPER_SECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSvShuntCompensatorSections() <em>Sv Shunt Compensator Sections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 * @ordered
	 */
	protected SvShuntCompensatorSections svShuntCompensatorSections;

	/**
	 * The default value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SWITCH_ON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected Date switchOnDate = SWITCH_ON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float AVR_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRDelay()
	 * @generated
	 * @ordered
	 */
	protected float aVRDelay = AVR_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSensitivity()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_SENSITIVITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSensitivity()
	 * @generated
	 * @ordered
	 */
	protected float voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getG0PerSection() <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0PerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0PerSection() <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0PerSection()
	 * @generated
	 * @ordered
	 */
	protected float g0PerSection = G0_PER_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePerSection() <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float REACTIVE_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReactivePerSection() <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePerSection()
	 * @generated
	 * @ordered
	 */
	protected float reactivePerSection = REACTIVE_PER_SECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntCompensatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SHUNT_COMPENSATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormalSections() {
		return normalSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalSections(int newNormalSections) {
		int oldNormalSections = normalSections;
		normalSections = newNormalSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS, oldNormalSections, normalSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinU() {
		return minU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinU(float newMinU) {
		float oldMinU = minU;
		minU = newMinU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__MIN_U, oldMinU, minU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB0PerSection() {
		return b0PerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB0PerSection(float newB0PerSection) {
		float oldB0PerSection = b0PerSection;
		b0PerSection = newB0PerSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION, oldB0PerSection, b0PerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNomQ() {
		return nomQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomQ(float newNomQ) {
		float oldNomQ = nomQ;
		nomQ = newNomQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__NOM_Q, oldNomQ, nomQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNomU() {
		return nomU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomU(float newNomU) {
		float oldNomU = nomU;
		nomU = newNomU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__NOM_U, oldNomU, nomU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumSections() {
		return maximumSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSections(int newMaximumSections) {
		int oldMaximumSections = maximumSections;
		maximumSections = newMaximumSections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS, oldMaximumSections, maximumSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSwitchOnCount() {
		return switchOnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchOnCount(int newSwitchOnCount) {
		int oldSwitchOnCount = switchOnCount;
		switchOnCount = newSwitchOnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT, oldSwitchOnCount, switchOnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxU() {
		return maxU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxU(float newMaxU) {
		float oldMaxU = maxU;
		maxU = newMaxU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__MAX_U, oldMaxU, maxU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBPerSection() {
		return bPerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPerSection(float newBPerSection) {
		float oldBPerSection = bPerSection;
		bPerSection = newBPerSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION, oldBPerSection, bPerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGPerSection() {
		return gPerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPerSection(float newGPerSection) {
		float oldGPerSection = gPerSection;
		gPerSection = newGPerSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION, oldGPerSection, gPerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShuntCompensatorSections getSvShuntCompensatorSections() {
		if (svShuntCompensatorSections != null && svShuntCompensatorSections.eIsProxy()) {
			InternalEObject oldSvShuntCompensatorSections = (InternalEObject)svShuntCompensatorSections;
			svShuntCompensatorSections = (SvShuntCompensatorSections)eResolveProxy(oldSvShuntCompensatorSections);
			if (svShuntCompensatorSections != oldSvShuntCompensatorSections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections, svShuntCompensatorSections));
			}
		}
		return svShuntCompensatorSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShuntCompensatorSections basicGetSvShuntCompensatorSections() {
		return svShuntCompensatorSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvShuntCompensatorSections(SvShuntCompensatorSections newSvShuntCompensatorSections, NotificationChain msgs) {
		SvShuntCompensatorSections oldSvShuntCompensatorSections = svShuntCompensatorSections;
		svShuntCompensatorSections = newSvShuntCompensatorSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections, newSvShuntCompensatorSections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvShuntCompensatorSections(SvShuntCompensatorSections newSvShuntCompensatorSections) {
		if (newSvShuntCompensatorSections != svShuntCompensatorSections) {
			NotificationChain msgs = null;
			if (svShuntCompensatorSections != null)
				msgs = ((InternalEObject)svShuntCompensatorSections).eInverseRemove(this, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class, msgs);
			if (newSvShuntCompensatorSections != null)
				msgs = ((InternalEObject)newSvShuntCompensatorSections).eInverseAdd(this, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class, msgs);
			msgs = basicSetSvShuntCompensatorSections(newSvShuntCompensatorSections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, newSvShuntCompensatorSections, newSvShuntCompensatorSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSwitchOnDate() {
		return switchOnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchOnDate(Date newSwitchOnDate) {
		Date oldSwitchOnDate = switchOnDate;
		switchOnDate = newSwitchOnDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE, oldSwitchOnDate, switchOnDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAVRDelay() {
		return aVRDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAVRDelay(float newAVRDelay) {
		float oldAVRDelay = aVRDelay;
		aVRDelay = newAVRDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY, oldAVRDelay, aVRDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltageSensitivity() {
		return voltageSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageSensitivity(float newVoltageSensitivity) {
		float oldVoltageSensitivity = voltageSensitivity;
		voltageSensitivity = newVoltageSensitivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY, oldVoltageSensitivity, voltageSensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getG0PerSection() {
		return g0PerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG0PerSection(float newG0PerSection) {
		float oldG0PerSection = g0PerSection;
		g0PerSection = newG0PerSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION, oldG0PerSection, g0PerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReactivePerSection() {
		return reactivePerSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePerSection(float newReactivePerSection) {
		float oldReactivePerSection = reactivePerSection;
		reactivePerSection = newReactivePerSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION, oldReactivePerSection, reactivePerSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				if (svShuntCompensatorSections != null)
					msgs = ((InternalEObject)svShuntCompensatorSections).eInverseRemove(this, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class, msgs);
				return basicSetSvShuntCompensatorSections((SvShuntCompensatorSections)otherEnd, msgs);
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
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				return basicSetSvShuntCompensatorSections(null, msgs);
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
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				return getNormalSections();
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				return getMinU();
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				return getB0PerSection();
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				return getNomQ();
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				return getNomU();
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				return getMaximumSections();
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				return getSwitchOnCount();
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				return getMaxU();
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				return getBPerSection();
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				return getGPerSection();
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				if (resolve) return getSvShuntCompensatorSections();
				return basicGetSvShuntCompensatorSections();
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				return getSwitchOnDate();
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				return getAVRDelay();
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				return getVoltageSensitivity();
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				return getG0PerSection();
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				return getReactivePerSection();
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
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				setNormalSections((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				setB0PerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				setNomQ((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				setNomU((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				setMaximumSections((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				setSwitchOnCount((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				setBPerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				setGPerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				setSvShuntCompensatorSections((SvShuntCompensatorSections)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				setSwitchOnDate((Date)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				setAVRDelay((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				setVoltageSensitivity((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				setG0PerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				setReactivePerSection((Float)newValue);
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
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				setNormalSections(NORMAL_SECTIONS_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				setMinU(MIN_U_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				setB0PerSection(B0_PER_SECTION_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				setNomQ(NOM_Q_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				setNomU(NOM_U_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				setMaximumSections(MAXIMUM_SECTIONS_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				setSwitchOnCount(SWITCH_ON_COUNT_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				setMaxU(MAX_U_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				setBPerSection(BPER_SECTION_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				setGPerSection(GPER_SECTION_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				setSvShuntCompensatorSections((SvShuntCompensatorSections)null);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				setSwitchOnDate(SWITCH_ON_DATE_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				setAVRDelay(AVR_DELAY_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				setVoltageSensitivity(VOLTAGE_SENSITIVITY_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				setG0PerSection(G0_PER_SECTION_EDEFAULT);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				setReactivePerSection(REACTIVE_PER_SECTION_EDEFAULT);
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
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				return normalSections != NORMAL_SECTIONS_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				return minU != MIN_U_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				return b0PerSection != B0_PER_SECTION_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				return nomQ != NOM_Q_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				return nomU != NOM_U_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				return maximumSections != MAXIMUM_SECTIONS_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				return switchOnCount != SWITCH_ON_COUNT_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				return maxU != MAX_U_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				return bPerSection != BPER_SECTION_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				return gPerSection != GPER_SECTION_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				return svShuntCompensatorSections != null;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				return SWITCH_ON_DATE_EDEFAULT == null ? switchOnDate != null : !SWITCH_ON_DATE_EDEFAULT.equals(switchOnDate);
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				return aVRDelay != AVR_DELAY_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				return voltageSensitivity != VOLTAGE_SENSITIVITY_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				return g0PerSection != G0_PER_SECTION_EDEFAULT;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				return reactivePerSection != REACTIVE_PER_SECTION_EDEFAULT;
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
		result.append(" (normalSections: ");
		result.append(normalSections);
		result.append(", minU: ");
		result.append(minU);
		result.append(", b0PerSection: ");
		result.append(b0PerSection);
		result.append(", nomQ: ");
		result.append(nomQ);
		result.append(", nomU: ");
		result.append(nomU);
		result.append(", maximumSections: ");
		result.append(maximumSections);
		result.append(", switchOnCount: ");
		result.append(switchOnCount);
		result.append(", maxU: ");
		result.append(maxU);
		result.append(", bPerSection: ");
		result.append(bPerSection);
		result.append(", gPerSection: ");
		result.append(gPerSection);
		result.append(", switchOnDate: ");
		result.append(switchOnDate);
		result.append(", aVRDelay: ");
		result.append(aVRDelay);
		result.append(", voltageSensitivity: ");
		result.append(voltageSensitivity);
		result.append(", g0PerSection: ");
		result.append(g0PerSection);
		result.append(", reactivePerSection: ");
		result.append(reactivePerSection);
		result.append(')');
		return result.toString();
	}

} //ShuntCompensatorImpl
