/**
 */
package CIM.IEC61970.Generation.GenerationDynamics.impl;

import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;
import CIM.IEC61970.Generation.GenerationDynamics.SteamSupply;
import CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine;

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
 * An implementation of the model object '<em><b>Steam Turbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getSteamSupplys <em>Steam Supplys</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft2PowerHP <em>Shaft2 Power HP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft1PowerIP <em>Shaft1 Power IP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getReheater1TC <em>Reheater1 TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getCrossoverTC <em>Crossover TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getSteamChestTC <em>Steam Chest TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft1PowerHP <em>Shaft1 Power HP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getShaft2PowerIP <em>Shaft2 Power IP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.SteamTurbineImpl#getReheater2TC <em>Reheater2 TC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SteamTurbineImpl extends PrimeMoverImpl implements SteamTurbine {
	/**
	 * The default value of the '{@link #getShaft2PowerLP1() <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_LP1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerLP1() <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerLP1 = SHAFT2_POWER_LP1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShaft2PowerLP2() <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_LP2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerLP2() <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerLP2 = SHAFT2_POWER_LP2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteamSupplys() <em>Steam Supplys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplys()
	 * @generated
	 * @ordered
	 */
	protected EList<SteamSupply> steamSupplys;

	/**
	 * The default value of the '{@link #getShaft2PowerHP() <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerHP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_HP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerHP() <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerHP()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerHP = SHAFT2_POWER_HP_EDEFAULT;

	/**
	 * The default value of the '{@link #getShaft1PowerIP() <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerIP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_IP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerIP() <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerIP()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerIP = SHAFT1_POWER_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getReheater1TC() <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater1TC()
	 * @generated
	 * @ordered
	 */
	protected static final float REHEATER1_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReheater1TC() <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater1TC()
	 * @generated
	 * @ordered
	 */
	protected float reheater1TC = REHEATER1_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getShaft1PowerLP2() <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_LP2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerLP2() <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerLP2 = SHAFT1_POWER_LP2_EDEFAULT;

	/**
	 * The default value of the '{@link #getShaft1PowerLP1() <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_LP1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerLP1() <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerLP1 = SHAFT1_POWER_LP1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossoverTC() <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossoverTC()
	 * @generated
	 * @ordered
	 */
	protected static final float CROSSOVER_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCrossoverTC() <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossoverTC()
	 * @generated
	 * @ordered
	 */
	protected float crossoverTC = CROSSOVER_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteamChestTC() <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamChestTC()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_CHEST_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamChestTC() <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamChestTC()
	 * @generated
	 * @ordered
	 */
	protected float steamChestTC = STEAM_CHEST_TC_EDEFAULT;

	/**
	 * The default value of the '{@link #getShaft1PowerHP() <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerHP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_HP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerHP() <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerHP()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerHP = SHAFT1_POWER_HP_EDEFAULT;

	/**
	 * The default value of the '{@link #getShaft2PowerIP() <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerIP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_IP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerIP() <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerIP()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerIP = SHAFT2_POWER_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getReheater2TC() <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater2TC()
	 * @generated
	 * @ordered
	 */
	protected static final float REHEATER2_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReheater2TC() <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater2TC()
	 * @generated
	 * @ordered
	 */
	protected float reheater2TC = REHEATER2_TC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteamTurbineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.STEAM_TURBINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft2PowerLP1() {
		return shaft2PowerLP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft2PowerLP1(float newShaft2PowerLP1) {
		float oldShaft2PowerLP1 = shaft2PowerLP1;
		shaft2PowerLP1 = newShaft2PowerLP1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1, oldShaft2PowerLP1, shaft2PowerLP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft2PowerLP2() {
		return shaft2PowerLP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft2PowerLP2(float newShaft2PowerLP2) {
		float oldShaft2PowerLP2 = shaft2PowerLP2;
		shaft2PowerLP2 = newShaft2PowerLP2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2, oldShaft2PowerLP2, shaft2PowerLP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SteamSupply> getSteamSupplys() {
		if (steamSupplys == null) {
			steamSupplys = new EObjectWithInverseResolvingEList.ManyInverse<SteamSupply>(SteamSupply.class, this, GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS, GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES);
		}
		return steamSupplys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft2PowerHP() {
		return shaft2PowerHP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft2PowerHP(float newShaft2PowerHP) {
		float oldShaft2PowerHP = shaft2PowerHP;
		shaft2PowerHP = newShaft2PowerHP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP, oldShaft2PowerHP, shaft2PowerHP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft1PowerIP() {
		return shaft1PowerIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft1PowerIP(float newShaft1PowerIP) {
		float oldShaft1PowerIP = shaft1PowerIP;
		shaft1PowerIP = newShaft1PowerIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP, oldShaft1PowerIP, shaft1PowerIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReheater1TC() {
		return reheater1TC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReheater1TC(float newReheater1TC) {
		float oldReheater1TC = reheater1TC;
		reheater1TC = newReheater1TC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC, oldReheater1TC, reheater1TC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft1PowerLP2() {
		return shaft1PowerLP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft1PowerLP2(float newShaft1PowerLP2) {
		float oldShaft1PowerLP2 = shaft1PowerLP2;
		shaft1PowerLP2 = newShaft1PowerLP2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2, oldShaft1PowerLP2, shaft1PowerLP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft1PowerLP1() {
		return shaft1PowerLP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft1PowerLP1(float newShaft1PowerLP1) {
		float oldShaft1PowerLP1 = shaft1PowerLP1;
		shaft1PowerLP1 = newShaft1PowerLP1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1, oldShaft1PowerLP1, shaft1PowerLP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCrossoverTC() {
		return crossoverTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossoverTC(float newCrossoverTC) {
		float oldCrossoverTC = crossoverTC;
		crossoverTC = newCrossoverTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC, oldCrossoverTC, crossoverTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteamChestTC() {
		return steamChestTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteamChestTC(float newSteamChestTC) {
		float oldSteamChestTC = steamChestTC;
		steamChestTC = newSteamChestTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC, oldSteamChestTC, steamChestTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft1PowerHP() {
		return shaft1PowerHP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft1PowerHP(float newShaft1PowerHP) {
		float oldShaft1PowerHP = shaft1PowerHP;
		shaft1PowerHP = newShaft1PowerHP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP, oldShaft1PowerHP, shaft1PowerHP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShaft2PowerIP() {
		return shaft2PowerIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShaft2PowerIP(float newShaft2PowerIP) {
		float oldShaft2PowerIP = shaft2PowerIP;
		shaft2PowerIP = newShaft2PowerIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP, oldShaft2PowerIP, shaft2PowerIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReheater2TC() {
		return reheater2TC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReheater2TC(float newReheater2TC) {
		float oldReheater2TC = reheater2TC;
		reheater2TC = newReheater2TC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC, oldReheater2TC, reheater2TC));
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
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteamSupplys()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return ((InternalEList<?>)getSteamSupplys()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				return getShaft2PowerLP1();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				return getShaft2PowerLP2();
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return getSteamSupplys();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				return getShaft2PowerHP();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				return getShaft1PowerIP();
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				return getReheater1TC();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				return getShaft1PowerLP2();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				return getShaft1PowerLP1();
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				return getCrossoverTC();
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				return getSteamChestTC();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				return getShaft1PowerHP();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				return getShaft2PowerIP();
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				return getReheater2TC();
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				setShaft2PowerLP1((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				setShaft2PowerLP2((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				getSteamSupplys().clear();
				getSteamSupplys().addAll((Collection<? extends SteamSupply>)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				setShaft2PowerHP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				setShaft1PowerIP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				setReheater1TC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				setShaft1PowerLP2((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				setShaft1PowerLP1((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				setCrossoverTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				setSteamChestTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				setShaft1PowerHP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				setShaft2PowerIP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				setReheater2TC((Float)newValue);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				setShaft2PowerLP1(SHAFT2_POWER_LP1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				setShaft2PowerLP2(SHAFT2_POWER_LP2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				getSteamSupplys().clear();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				setShaft2PowerHP(SHAFT2_POWER_HP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				setShaft1PowerIP(SHAFT1_POWER_IP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				setReheater1TC(REHEATER1_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				setShaft1PowerLP2(SHAFT1_POWER_LP2_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				setShaft1PowerLP1(SHAFT1_POWER_LP1_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				setCrossoverTC(CROSSOVER_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				setSteamChestTC(STEAM_CHEST_TC_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				setShaft1PowerHP(SHAFT1_POWER_HP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				setShaft2PowerIP(SHAFT2_POWER_IP_EDEFAULT);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				setReheater2TC(REHEATER2_TC_EDEFAULT);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				return shaft2PowerLP1 != SHAFT2_POWER_LP1_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				return shaft2PowerLP2 != SHAFT2_POWER_LP2_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return steamSupplys != null && !steamSupplys.isEmpty();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				return shaft2PowerHP != SHAFT2_POWER_HP_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				return shaft1PowerIP != SHAFT1_POWER_IP_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				return reheater1TC != REHEATER1_TC_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				return shaft1PowerLP2 != SHAFT1_POWER_LP2_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				return shaft1PowerLP1 != SHAFT1_POWER_LP1_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				return crossoverTC != CROSSOVER_TC_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				return steamChestTC != STEAM_CHEST_TC_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				return shaft1PowerHP != SHAFT1_POWER_HP_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				return shaft2PowerIP != SHAFT2_POWER_IP_EDEFAULT;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				return reheater2TC != REHEATER2_TC_EDEFAULT;
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
		result.append(" (shaft2PowerLP1: ");
		result.append(shaft2PowerLP1);
		result.append(", shaft2PowerLP2: ");
		result.append(shaft2PowerLP2);
		result.append(", shaft2PowerHP: ");
		result.append(shaft2PowerHP);
		result.append(", shaft1PowerIP: ");
		result.append(shaft1PowerIP);
		result.append(", reheater1TC: ");
		result.append(reheater1TC);
		result.append(", shaft1PowerLP2: ");
		result.append(shaft1PowerLP2);
		result.append(", shaft1PowerLP1: ");
		result.append(shaft1PowerLP1);
		result.append(", crossoverTC: ");
		result.append(crossoverTC);
		result.append(", steamChestTC: ");
		result.append(steamChestTC);
		result.append(", shaft1PowerHP: ");
		result.append(shaft1PowerHP);
		result.append(", shaft2PowerIP: ");
		result.append(shaft2PowerIP);
		result.append(", reheater2TC: ");
		result.append(reheater2TC);
		result.append(')');
		return result.toString();
	}

} //SteamTurbineImpl
