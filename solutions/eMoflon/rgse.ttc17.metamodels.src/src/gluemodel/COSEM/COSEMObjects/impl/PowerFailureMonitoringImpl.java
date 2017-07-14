/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring;

import gluemodel.COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Failure Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getFailuresAllPhases <em>Failures All Phases</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getFailuresL1 <em>Failures L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getFailuresL2 <em>Failures L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getFailuresL3 <em>Failures L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getFailuresAny <em>Failures Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getAuxiliarysupply <em>Auxiliarysupply</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getLongFailsAll <em>Long Fails All</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getLongFailsL1 <em>Long Fails L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getLongFailsL2 <em>Long Fails L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getLongFailsL3 <em>Long Fails L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getLongFailsAny <em>Long Fails Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getTimeAll <em>Time All</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getTimeL1 <em>Time L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getTimeL2 <em>Time L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getTimeL3 <em>Time L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getTimeAny <em>Time Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getDurationAll <em>Duration All</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getDurationL1 <em>Duration L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getDurationL2 <em>Duration L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getDurationL3 <em>Duration L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getDurationAny <em>Duration Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl#getTime_threshold_long_powerfailure <em>Time threshold long powerfailure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerFailureMonitoringImpl extends DataImpl implements PowerFailureMonitoring {
	/**
	 * The default value of the '{@link #getFailuresAllPhases() <em>Failures All Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresAllPhases()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURES_ALL_PHASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailuresAllPhases() <em>Failures All Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresAllPhases()
	 * @generated
	 * @ordered
	 */
	protected int failuresAllPhases = FAILURES_ALL_PHASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailuresL1() <em>Failures L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresL1()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURES_L1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailuresL1() <em>Failures L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresL1()
	 * @generated
	 * @ordered
	 */
	protected int failuresL1 = FAILURES_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailuresL2() <em>Failures L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresL2()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURES_L2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailuresL2() <em>Failures L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresL2()
	 * @generated
	 * @ordered
	 */
	protected int failuresL2 = FAILURES_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailuresL3() <em>Failures L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresL3()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURES_L3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailuresL3() <em>Failures L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresL3()
	 * @generated
	 * @ordered
	 */
	protected int failuresL3 = FAILURES_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailuresAny() <em>Failures Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresAny()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURES_ANY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailuresAny() <em>Failures Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuresAny()
	 * @generated
	 * @ordered
	 */
	protected int failuresAny = FAILURES_ANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliarysupply() <em>Auxiliarysupply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliarysupply()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARYSUPPLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliarysupply() <em>Auxiliarysupply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliarysupply()
	 * @generated
	 * @ordered
	 */
	protected String auxiliarysupply = AUXILIARYSUPPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongFailsAll() <em>Long Fails All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsAll()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_FAILS_ALL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongFailsAll() <em>Long Fails All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsAll()
	 * @generated
	 * @ordered
	 */
	protected int longFailsAll = LONG_FAILS_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongFailsL1() <em>Long Fails L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsL1()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_FAILS_L1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongFailsL1() <em>Long Fails L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsL1()
	 * @generated
	 * @ordered
	 */
	protected int longFailsL1 = LONG_FAILS_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongFailsL2() <em>Long Fails L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsL2()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_FAILS_L2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongFailsL2() <em>Long Fails L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsL2()
	 * @generated
	 * @ordered
	 */
	protected int longFailsL2 = LONG_FAILS_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongFailsL3() <em>Long Fails L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsL3()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_FAILS_L3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongFailsL3() <em>Long Fails L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsL3()
	 * @generated
	 * @ordered
	 */
	protected int longFailsL3 = LONG_FAILS_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongFailsAny() <em>Long Fails Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsAny()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_FAILS_ANY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongFailsAny() <em>Long Fails Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFailsAny()
	 * @generated
	 * @ordered
	 */
	protected int longFailsAny = LONG_FAILS_ANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeAll() <em>Time All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAll()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeAll() <em>Time All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAll()
	 * @generated
	 * @ordered
	 */
	protected String timeAll = TIME_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeL1() <em>Time L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeL1()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_L1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeL1() <em>Time L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeL1()
	 * @generated
	 * @ordered
	 */
	protected String timeL1 = TIME_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeL2() <em>Time L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeL2()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_L2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeL2() <em>Time L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeL2()
	 * @generated
	 * @ordered
	 */
	protected String timeL2 = TIME_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeL3() <em>Time L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeL3()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_L3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeL3() <em>Time L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeL3()
	 * @generated
	 * @ordered
	 */
	protected String timeL3 = TIME_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeAny() <em>Time Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAny()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeAny() <em>Time Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAny()
	 * @generated
	 * @ordered
	 */
	protected String timeAny = TIME_ANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationAll() <em>Duration All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAll()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_ALL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationAll() <em>Duration All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAll()
	 * @generated
	 * @ordered
	 */
	protected int durationAll = DURATION_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationL1() <em>Duration L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationL1()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_L1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationL1() <em>Duration L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationL1()
	 * @generated
	 * @ordered
	 */
	protected int durationL1 = DURATION_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationL2() <em>Duration L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationL2()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_L2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationL2() <em>Duration L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationL2()
	 * @generated
	 * @ordered
	 */
	protected int durationL2 = DURATION_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationL3() <em>Duration L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationL3()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_L3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationL3() <em>Duration L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationL3()
	 * @generated
	 * @ordered
	 */
	protected int durationL3 = DURATION_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationAny() <em>Duration Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAny()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_ANY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationAny() <em>Duration Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAny()
	 * @generated
	 * @ordered
	 */
	protected int durationAny = DURATION_ANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_threshold_long_powerfailure() <em>Time threshold long powerfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_long_powerfailure()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_THRESHOLD_LONG_POWERFAILURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime_threshold_long_powerfailure() <em>Time threshold long powerfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_long_powerfailure()
	 * @generated
	 * @ordered
	 */
	protected int time_threshold_long_powerfailure = TIME_THRESHOLD_LONG_POWERFAILURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerFailureMonitoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getPowerFailureMonitoring();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailuresAllPhases() {
		return failuresAllPhases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailuresAllPhases(int newFailuresAllPhases) {
		int oldFailuresAllPhases = failuresAllPhases;
		failuresAllPhases = newFailuresAllPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ALL_PHASES, oldFailuresAllPhases, failuresAllPhases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailuresL1() {
		return failuresL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailuresL1(int newFailuresL1) {
		int oldFailuresL1 = failuresL1;
		failuresL1 = newFailuresL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L1, oldFailuresL1, failuresL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailuresL2() {
		return failuresL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailuresL2(int newFailuresL2) {
		int oldFailuresL2 = failuresL2;
		failuresL2 = newFailuresL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L2, oldFailuresL2, failuresL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailuresL3() {
		return failuresL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailuresL3(int newFailuresL3) {
		int oldFailuresL3 = failuresL3;
		failuresL3 = newFailuresL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L3, oldFailuresL3, failuresL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailuresAny() {
		return failuresAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailuresAny(int newFailuresAny) {
		int oldFailuresAny = failuresAny;
		failuresAny = newFailuresAny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ANY, oldFailuresAny, failuresAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxiliarysupply() {
		return auxiliarysupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliarysupply(String newAuxiliarysupply) {
		String oldAuxiliarysupply = auxiliarysupply;
		auxiliarysupply = newAuxiliarysupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__AUXILIARYSUPPLY, oldAuxiliarysupply, auxiliarysupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongFailsAll() {
		return longFailsAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongFailsAll(int newLongFailsAll) {
		int oldLongFailsAll = longFailsAll;
		longFailsAll = newLongFailsAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ALL, oldLongFailsAll, longFailsAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongFailsL1() {
		return longFailsL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongFailsL1(int newLongFailsL1) {
		int oldLongFailsL1 = longFailsL1;
		longFailsL1 = newLongFailsL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L1, oldLongFailsL1, longFailsL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongFailsL2() {
		return longFailsL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongFailsL2(int newLongFailsL2) {
		int oldLongFailsL2 = longFailsL2;
		longFailsL2 = newLongFailsL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L2, oldLongFailsL2, longFailsL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongFailsL3() {
		return longFailsL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongFailsL3(int newLongFailsL3) {
		int oldLongFailsL3 = longFailsL3;
		longFailsL3 = newLongFailsL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L3, oldLongFailsL3, longFailsL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongFailsAny() {
		return longFailsAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongFailsAny(int newLongFailsAny) {
		int oldLongFailsAny = longFailsAny;
		longFailsAny = newLongFailsAny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ANY, oldLongFailsAny, longFailsAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeAll() {
		return timeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAll(String newTimeAll) {
		String oldTimeAll = timeAll;
		timeAll = newTimeAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ALL, oldTimeAll, timeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeL1() {
		return timeL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeL1(String newTimeL1) {
		String oldTimeL1 = timeL1;
		timeL1 = newTimeL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L1, oldTimeL1, timeL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeL2() {
		return timeL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeL2(String newTimeL2) {
		String oldTimeL2 = timeL2;
		timeL2 = newTimeL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L2, oldTimeL2, timeL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeL3() {
		return timeL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeL3(String newTimeL3) {
		String oldTimeL3 = timeL3;
		timeL3 = newTimeL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L3, oldTimeL3, timeL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeAny() {
		return timeAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAny(String newTimeAny) {
		String oldTimeAny = timeAny;
		timeAny = newTimeAny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ANY, oldTimeAny, timeAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationAll() {
		return durationAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationAll(int newDurationAll) {
		int oldDurationAll = durationAll;
		durationAll = newDurationAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ALL, oldDurationAll, durationAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationL1() {
		return durationL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationL1(int newDurationL1) {
		int oldDurationL1 = durationL1;
		durationL1 = newDurationL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L1, oldDurationL1, durationL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationL2() {
		return durationL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationL2(int newDurationL2) {
		int oldDurationL2 = durationL2;
		durationL2 = newDurationL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L2, oldDurationL2, durationL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationL3() {
		return durationL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationL3(int newDurationL3) {
		int oldDurationL3 = durationL3;
		durationL3 = newDurationL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L3, oldDurationL3, durationL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationAny() {
		return durationAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationAny(int newDurationAny) {
		int oldDurationAny = durationAny;
		durationAny = newDurationAny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ANY, oldDurationAny, durationAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime_threshold_long_powerfailure() {
		return time_threshold_long_powerfailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_threshold_long_powerfailure(int newTime_threshold_long_powerfailure) {
		int oldTime_threshold_long_powerfailure = time_threshold_long_powerfailure;
		time_threshold_long_powerfailure = newTime_threshold_long_powerfailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_THRESHOLD_LONG_POWERFAILURE, oldTime_threshold_long_powerfailure, time_threshold_long_powerfailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ALL_PHASES:
				return getFailuresAllPhases();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L1:
				return getFailuresL1();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L2:
				return getFailuresL2();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L3:
				return getFailuresL3();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ANY:
				return getFailuresAny();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__AUXILIARYSUPPLY:
				return getAuxiliarysupply();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ALL:
				return getLongFailsAll();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L1:
				return getLongFailsL1();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L2:
				return getLongFailsL2();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L3:
				return getLongFailsL3();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ANY:
				return getLongFailsAny();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ALL:
				return getTimeAll();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L1:
				return getTimeL1();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L2:
				return getTimeL2();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L3:
				return getTimeL3();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ANY:
				return getTimeAny();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ALL:
				return getDurationAll();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L1:
				return getDurationL1();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L2:
				return getDurationL2();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L3:
				return getDurationL3();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ANY:
				return getDurationAny();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_THRESHOLD_LONG_POWERFAILURE:
				return getTime_threshold_long_powerfailure();
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
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ALL_PHASES:
				setFailuresAllPhases((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L1:
				setFailuresL1((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L2:
				setFailuresL2((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L3:
				setFailuresL3((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ANY:
				setFailuresAny((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__AUXILIARYSUPPLY:
				setAuxiliarysupply((String)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ALL:
				setLongFailsAll((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L1:
				setLongFailsL1((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L2:
				setLongFailsL2((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L3:
				setLongFailsL3((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ANY:
				setLongFailsAny((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ALL:
				setTimeAll((String)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L1:
				setTimeL1((String)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L2:
				setTimeL2((String)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L3:
				setTimeL3((String)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ANY:
				setTimeAny((String)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ALL:
				setDurationAll((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L1:
				setDurationL1((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L2:
				setDurationL2((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L3:
				setDurationL3((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ANY:
				setDurationAny((Integer)newValue);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_THRESHOLD_LONG_POWERFAILURE:
				setTime_threshold_long_powerfailure((Integer)newValue);
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
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ALL_PHASES:
				setFailuresAllPhases(FAILURES_ALL_PHASES_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L1:
				setFailuresL1(FAILURES_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L2:
				setFailuresL2(FAILURES_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L3:
				setFailuresL3(FAILURES_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ANY:
				setFailuresAny(FAILURES_ANY_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__AUXILIARYSUPPLY:
				setAuxiliarysupply(AUXILIARYSUPPLY_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ALL:
				setLongFailsAll(LONG_FAILS_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L1:
				setLongFailsL1(LONG_FAILS_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L2:
				setLongFailsL2(LONG_FAILS_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L3:
				setLongFailsL3(LONG_FAILS_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ANY:
				setLongFailsAny(LONG_FAILS_ANY_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ALL:
				setTimeAll(TIME_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L1:
				setTimeL1(TIME_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L2:
				setTimeL2(TIME_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L3:
				setTimeL3(TIME_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ANY:
				setTimeAny(TIME_ANY_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ALL:
				setDurationAll(DURATION_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L1:
				setDurationL1(DURATION_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L2:
				setDurationL2(DURATION_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L3:
				setDurationL3(DURATION_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ANY:
				setDurationAny(DURATION_ANY_EDEFAULT);
				return;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_THRESHOLD_LONG_POWERFAILURE:
				setTime_threshold_long_powerfailure(TIME_THRESHOLD_LONG_POWERFAILURE_EDEFAULT);
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
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ALL_PHASES:
				return failuresAllPhases != FAILURES_ALL_PHASES_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L1:
				return failuresL1 != FAILURES_L1_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L2:
				return failuresL2 != FAILURES_L2_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_L3:
				return failuresL3 != FAILURES_L3_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__FAILURES_ANY:
				return failuresAny != FAILURES_ANY_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__AUXILIARYSUPPLY:
				return AUXILIARYSUPPLY_EDEFAULT == null ? auxiliarysupply != null : !AUXILIARYSUPPLY_EDEFAULT.equals(auxiliarysupply);
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ALL:
				return longFailsAll != LONG_FAILS_ALL_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L1:
				return longFailsL1 != LONG_FAILS_L1_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L2:
				return longFailsL2 != LONG_FAILS_L2_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_L3:
				return longFailsL3 != LONG_FAILS_L3_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__LONG_FAILS_ANY:
				return longFailsAny != LONG_FAILS_ANY_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ALL:
				return TIME_ALL_EDEFAULT == null ? timeAll != null : !TIME_ALL_EDEFAULT.equals(timeAll);
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L1:
				return TIME_L1_EDEFAULT == null ? timeL1 != null : !TIME_L1_EDEFAULT.equals(timeL1);
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L2:
				return TIME_L2_EDEFAULT == null ? timeL2 != null : !TIME_L2_EDEFAULT.equals(timeL2);
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_L3:
				return TIME_L3_EDEFAULT == null ? timeL3 != null : !TIME_L3_EDEFAULT.equals(timeL3);
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_ANY:
				return TIME_ANY_EDEFAULT == null ? timeAny != null : !TIME_ANY_EDEFAULT.equals(timeAny);
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ALL:
				return durationAll != DURATION_ALL_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L1:
				return durationL1 != DURATION_L1_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L2:
				return durationL2 != DURATION_L2_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_L3:
				return durationL3 != DURATION_L3_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__DURATION_ANY:
				return durationAny != DURATION_ANY_EDEFAULT;
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING__TIME_THRESHOLD_LONG_POWERFAILURE:
				return time_threshold_long_powerfailure != TIME_THRESHOLD_LONG_POWERFAILURE_EDEFAULT;
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
		result.append(" (FailuresAllPhases: ");
		result.append(failuresAllPhases);
		result.append(", FailuresL1: ");
		result.append(failuresL1);
		result.append(", FailuresL2: ");
		result.append(failuresL2);
		result.append(", FailuresL3: ");
		result.append(failuresL3);
		result.append(", FailuresAny: ");
		result.append(failuresAny);
		result.append(", Auxiliarysupply: ");
		result.append(auxiliarysupply);
		result.append(", LongFailsAll: ");
		result.append(longFailsAll);
		result.append(", LongFailsL1: ");
		result.append(longFailsL1);
		result.append(", LongFailsL2: ");
		result.append(longFailsL2);
		result.append(", LongFailsL3: ");
		result.append(longFailsL3);
		result.append(", LongFailsAny: ");
		result.append(longFailsAny);
		result.append(", TimeAll: ");
		result.append(timeAll);
		result.append(", TimeL1: ");
		result.append(timeL1);
		result.append(", TimeL2: ");
		result.append(timeL2);
		result.append(", TimeL3: ");
		result.append(timeL3);
		result.append(", TimeAny: ");
		result.append(timeAny);
		result.append(", DurationAll: ");
		result.append(durationAll);
		result.append(", DurationL1: ");
		result.append(durationL1);
		result.append(", DurationL2: ");
		result.append(durationL2);
		result.append(", DurationL3: ");
		result.append(durationL3);
		result.append(", DurationAny: ");
		result.append(durationAny);
		result.append(", Time_threshold_long_powerfailure: ");
		result.append(time_threshold_long_powerfailure);
		result.append(')');
		return result.toString();
	}

} //PowerFailureMonitoringImpl
