/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Terminal;

import CIM.IEC61970.Informative.InfAssets.BushingInfo;
import CIM.IEC61970.Informative.InfAssets.BushingInsulationKind;
import CIM.IEC61970.Informative.InfAssets.BushingInsulationPF;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

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
 * An implementation of the model object '<em><b>Bushing Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getC2PowerFactor <em>C2 Power Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getC2Capacitance <em>C2 Capacitance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getC1Capacitance <em>C1 Capacitance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getC1PowerFactor <em>C1 Power Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BushingInfoImpl#getInsulationKind <em>Insulation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BushingInfoImpl extends AssetInfoImpl implements BushingInfo {
	/**
	 * The default value of the '{@link #getC2PowerFactor() <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float C2_POWER_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC2PowerFactor() <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected float c2PowerFactor = C2_POWER_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBushingInsulationPFs() <em>Bushing Insulation PFs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInsulationPFs()
	 * @generated
	 * @ordered
	 */
	protected EList<BushingInsulationPF> bushingInsulationPFs;

	/**
	 * The default value of the '{@link #getC2Capacitance() <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2Capacitance()
	 * @generated
	 * @ordered
	 */
	protected static final float C2_CAPACITANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC2Capacitance() <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2Capacitance()
	 * @generated
	 * @ordered
	 */
	protected float c2Capacitance = C2_CAPACITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getC1Capacitance() <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1Capacitance()
	 * @generated
	 * @ordered
	 */
	protected static final float C1_CAPACITANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC1Capacitance() <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1Capacitance()
	 * @generated
	 * @ordered
	 */
	protected float c1Capacitance = C1_CAPACITANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The default value of the '{@link #getC1PowerFactor() <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float C1_POWER_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC1PowerFactor() <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected float c1PowerFactor = C1_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsulationKind() <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected static final BushingInsulationKind INSULATION_KIND_EDEFAULT = BushingInsulationKind.OTHER;

	/**
	 * The cached value of the '{@link #getInsulationKind() <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected BushingInsulationKind insulationKind = INSULATION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BushingInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getBushingInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getC2PowerFactor() {
		return c2PowerFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2PowerFactor(float newC2PowerFactor) {
		float oldC2PowerFactor = c2PowerFactor;
		c2PowerFactor = newC2PowerFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__C2_POWER_FACTOR, oldC2PowerFactor, c2PowerFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BushingInsulationPF> getBushingInsulationPFs() {
		if (bushingInsulationPFs == null) {
			bushingInsulationPFs = new EObjectWithInverseResolvingEList<BushingInsulationPF>(BushingInsulationPF.class, this, InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS, InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO);
		}
		return bushingInsulationPFs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getC2Capacitance() {
		return c2Capacitance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2Capacitance(float newC2Capacitance) {
		float oldC2Capacitance = c2Capacitance;
		c2Capacitance = newC2Capacitance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__C2_CAPACITANCE, oldC2Capacitance, c2Capacitance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getC1Capacitance() {
		return c1Capacitance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1Capacitance(float newC1Capacitance) {
		float oldC1Capacitance = c1Capacitance;
		c1Capacitance = newC1Capacitance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__C1_CAPACITANCE, oldC1Capacitance, c1Capacitance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.BUSHING_INFO__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__TERMINAL, oldTerminal, newTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BUSHING_INFO, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__BUSHING_INFO, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getC1PowerFactor() {
		return c1PowerFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1PowerFactor(float newC1PowerFactor) {
		float oldC1PowerFactor = c1PowerFactor;
		c1PowerFactor = newC1PowerFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__C1_POWER_FACTOR, oldC1PowerFactor, c1PowerFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationKind getInsulationKind() {
		return insulationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulationKind(BushingInsulationKind newInsulationKind) {
		BushingInsulationKind oldInsulationKind = insulationKind;
		insulationKind = newInsulationKind == null ? INSULATION_KIND_EDEFAULT : newInsulationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BUSHING_INFO__INSULATION_KIND, oldInsulationKind, insulationKind));
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
			case InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBushingInsulationPFs()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.BUSHING_INFO__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BUSHING_INFO, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
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
			case InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS:
				return ((InternalEList<?>)getBushingInsulationPFs()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.BUSHING_INFO__TERMINAL:
				return basicSetTerminal(null, msgs);
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
			case InfAssetsPackage.BUSHING_INFO__C2_POWER_FACTOR:
				return getC2PowerFactor();
			case InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS:
				return getBushingInsulationPFs();
			case InfAssetsPackage.BUSHING_INFO__C2_CAPACITANCE:
				return getC2Capacitance();
			case InfAssetsPackage.BUSHING_INFO__C1_CAPACITANCE:
				return getC1Capacitance();
			case InfAssetsPackage.BUSHING_INFO__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case InfAssetsPackage.BUSHING_INFO__C1_POWER_FACTOR:
				return getC1PowerFactor();
			case InfAssetsPackage.BUSHING_INFO__INSULATION_KIND:
				return getInsulationKind();
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
			case InfAssetsPackage.BUSHING_INFO__C2_POWER_FACTOR:
				setC2PowerFactor((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS:
				getBushingInsulationPFs().clear();
				getBushingInsulationPFs().addAll((Collection<? extends BushingInsulationPF>)newValue);
				return;
			case InfAssetsPackage.BUSHING_INFO__C2_CAPACITANCE:
				setC2Capacitance((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING_INFO__C1_CAPACITANCE:
				setC1Capacitance((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING_INFO__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case InfAssetsPackage.BUSHING_INFO__C1_POWER_FACTOR:
				setC1PowerFactor((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING_INFO__INSULATION_KIND:
				setInsulationKind((BushingInsulationKind)newValue);
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
			case InfAssetsPackage.BUSHING_INFO__C2_POWER_FACTOR:
				setC2PowerFactor(C2_POWER_FACTOR_EDEFAULT);
				return;
			case InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS:
				getBushingInsulationPFs().clear();
				return;
			case InfAssetsPackage.BUSHING_INFO__C2_CAPACITANCE:
				setC2Capacitance(C2_CAPACITANCE_EDEFAULT);
				return;
			case InfAssetsPackage.BUSHING_INFO__C1_CAPACITANCE:
				setC1Capacitance(C1_CAPACITANCE_EDEFAULT);
				return;
			case InfAssetsPackage.BUSHING_INFO__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case InfAssetsPackage.BUSHING_INFO__C1_POWER_FACTOR:
				setC1PowerFactor(C1_POWER_FACTOR_EDEFAULT);
				return;
			case InfAssetsPackage.BUSHING_INFO__INSULATION_KIND:
				setInsulationKind(INSULATION_KIND_EDEFAULT);
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
			case InfAssetsPackage.BUSHING_INFO__C2_POWER_FACTOR:
				return c2PowerFactor != C2_POWER_FACTOR_EDEFAULT;
			case InfAssetsPackage.BUSHING_INFO__BUSHING_INSULATION_PFS:
				return bushingInsulationPFs != null && !bushingInsulationPFs.isEmpty();
			case InfAssetsPackage.BUSHING_INFO__C2_CAPACITANCE:
				return c2Capacitance != C2_CAPACITANCE_EDEFAULT;
			case InfAssetsPackage.BUSHING_INFO__C1_CAPACITANCE:
				return c1Capacitance != C1_CAPACITANCE_EDEFAULT;
			case InfAssetsPackage.BUSHING_INFO__TERMINAL:
				return terminal != null;
			case InfAssetsPackage.BUSHING_INFO__C1_POWER_FACTOR:
				return c1PowerFactor != C1_POWER_FACTOR_EDEFAULT;
			case InfAssetsPackage.BUSHING_INFO__INSULATION_KIND:
				return insulationKind != INSULATION_KIND_EDEFAULT;
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
		result.append(" (c2PowerFactor: ");
		result.append(c2PowerFactor);
		result.append(", c2Capacitance: ");
		result.append(c2Capacitance);
		result.append(", c1Capacitance: ");
		result.append(c1Capacitance);
		result.append(", c1PowerFactor: ");
		result.append(c1PowerFactor);
		result.append(", insulationKind: ");
		result.append(insulationKind);
		result.append(')');
		return result.toString();
	}

} //BushingInfoImpl
