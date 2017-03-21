/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.ActivateNormalMode;
import COSEM.COSEMObjects.ActivateTestMode;
import COSEM.COSEMObjects.Broadcast;
import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.DisconnectControl;
import COSEM.COSEMObjects.GlobalMeterReset;
import COSEM.COSEMObjects.ImageActivation;
import COSEM.COSEMObjects.MDIReset;
import COSEM.COSEMObjects.PowerQualityMeasurementManagement;
import COSEM.COSEMObjects.Push;
import COSEM.COSEMObjects.ScriptTable;
import COSEM.COSEMObjects.SetOutputSignal;
import COSEM.COSEMObjects.SwitchOpticalTestOutput;
import COSEM.COSEMObjects.Tariffication;

import COSEM.InterfaceClasses.impl.ScripttableImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getGlobalMeterReset <em>Global Meter Reset</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getMDIReset <em>MDI Reset</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getTariffication <em>Tariffication</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getAcitvateTest <em>Acitvate Test</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getActivateNormal <em>Activate Normal</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getSetOutput <em>Set Output</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getSwitchOptical <em>Switch Optical</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getPowerQuality <em>Power Quality</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getImage <em>Image</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getPush <em>Push</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ScriptTableImpl#getBroadcast <em>Broadcast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptTableImpl extends ScripttableImpl implements ScriptTable {
	/**
	 * The cached value of the '{@link #getGlobalMeterReset() <em>Global Meter Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalMeterReset()
	 * @generated
	 * @ordered
	 */
	protected GlobalMeterReset globalMeterReset;

	/**
	 * The cached value of the '{@link #getMDIReset() <em>MDI Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDIReset()
	 * @generated
	 * @ordered
	 */
	protected MDIReset mdiReset;

	/**
	 * The cached value of the '{@link #getTariffication() <em>Tariffication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffication()
	 * @generated
	 * @ordered
	 */
	protected Tariffication tariffication;

	/**
	 * The cached value of the '{@link #getAcitvateTest() <em>Acitvate Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcitvateTest()
	 * @generated
	 * @ordered
	 */
	protected ActivateTestMode acitvateTest;

	/**
	 * The cached value of the '{@link #getActivateNormal() <em>Activate Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateNormal()
	 * @generated
	 * @ordered
	 */
	protected ActivateNormalMode activateNormal;

	/**
	 * The cached value of the '{@link #getSetOutput() <em>Set Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetOutput()
	 * @generated
	 * @ordered
	 */
	protected SetOutputSignal setOutput;

	/**
	 * The cached value of the '{@link #getSwitchOptical() <em>Switch Optical</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOptical()
	 * @generated
	 * @ordered
	 */
	protected SwitchOpticalTestOutput switchOptical;

	/**
	 * The cached value of the '{@link #getPowerQuality() <em>Power Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerQuality()
	 * @generated
	 * @ordered
	 */
	protected PowerQualityMeasurementManagement powerQuality;

	/**
	 * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnect()
	 * @generated
	 * @ordered
	 */
	protected DisconnectControl disconnect;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected ImageActivation image;

	/**
	 * The cached value of the '{@link #getPush() <em>Push</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPush()
	 * @generated
	 * @ordered
	 */
	protected Push push;

	/**
	 * The cached value of the '{@link #getBroadcast() <em>Broadcast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroadcast()
	 * @generated
	 * @ordered
	 */
	protected Broadcast broadcast;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getScriptTable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMeterReset getGlobalMeterReset() {
		if (globalMeterReset != null && globalMeterReset.eIsProxy()) {
			InternalEObject oldGlobalMeterReset = (InternalEObject)globalMeterReset;
			globalMeterReset = (GlobalMeterReset)eResolveProxy(oldGlobalMeterReset);
			if (globalMeterReset != oldGlobalMeterReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__GLOBAL_METER_RESET, oldGlobalMeterReset, globalMeterReset));
			}
		}
		return globalMeterReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMeterReset basicGetGlobalMeterReset() {
		return globalMeterReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalMeterReset(GlobalMeterReset newGlobalMeterReset) {
		GlobalMeterReset oldGlobalMeterReset = globalMeterReset;
		globalMeterReset = newGlobalMeterReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__GLOBAL_METER_RESET, oldGlobalMeterReset, globalMeterReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDIReset getMDIReset() {
		if (mdiReset != null && mdiReset.eIsProxy()) {
			InternalEObject oldMDIReset = (InternalEObject)mdiReset;
			mdiReset = (MDIReset)eResolveProxy(oldMDIReset);
			if (mdiReset != oldMDIReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__MDI_RESET, oldMDIReset, mdiReset));
			}
		}
		return mdiReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDIReset basicGetMDIReset() {
		return mdiReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMDIReset(MDIReset newMDIReset) {
		MDIReset oldMDIReset = mdiReset;
		mdiReset = newMDIReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__MDI_RESET, oldMDIReset, mdiReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tariffication getTariffication() {
		if (tariffication != null && tariffication.eIsProxy()) {
			InternalEObject oldTariffication = (InternalEObject)tariffication;
			tariffication = (Tariffication)eResolveProxy(oldTariffication);
			if (tariffication != oldTariffication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__TARIFFICATION, oldTariffication, tariffication));
			}
		}
		return tariffication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tariffication basicGetTariffication() {
		return tariffication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariffication(Tariffication newTariffication) {
		Tariffication oldTariffication = tariffication;
		tariffication = newTariffication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__TARIFFICATION, oldTariffication, tariffication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateTestMode getAcitvateTest() {
		if (acitvateTest != null && acitvateTest.eIsProxy()) {
			InternalEObject oldAcitvateTest = (InternalEObject)acitvateTest;
			acitvateTest = (ActivateTestMode)eResolveProxy(oldAcitvateTest);
			if (acitvateTest != oldAcitvateTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__ACITVATE_TEST, oldAcitvateTest, acitvateTest));
			}
		}
		return acitvateTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateTestMode basicGetAcitvateTest() {
		return acitvateTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcitvateTest(ActivateTestMode newAcitvateTest) {
		ActivateTestMode oldAcitvateTest = acitvateTest;
		acitvateTest = newAcitvateTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__ACITVATE_TEST, oldAcitvateTest, acitvateTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateNormalMode getActivateNormal() {
		if (activateNormal != null && activateNormal.eIsProxy()) {
			InternalEObject oldActivateNormal = (InternalEObject)activateNormal;
			activateNormal = (ActivateNormalMode)eResolveProxy(oldActivateNormal);
			if (activateNormal != oldActivateNormal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__ACTIVATE_NORMAL, oldActivateNormal, activateNormal));
			}
		}
		return activateNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateNormalMode basicGetActivateNormal() {
		return activateNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateNormal(ActivateNormalMode newActivateNormal) {
		ActivateNormalMode oldActivateNormal = activateNormal;
		activateNormal = newActivateNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__ACTIVATE_NORMAL, oldActivateNormal, activateNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOutputSignal getSetOutput() {
		if (setOutput != null && setOutput.eIsProxy()) {
			InternalEObject oldSetOutput = (InternalEObject)setOutput;
			setOutput = (SetOutputSignal)eResolveProxy(oldSetOutput);
			if (setOutput != oldSetOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__SET_OUTPUT, oldSetOutput, setOutput));
			}
		}
		return setOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOutputSignal basicGetSetOutput() {
		return setOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetOutput(SetOutputSignal newSetOutput) {
		SetOutputSignal oldSetOutput = setOutput;
		setOutput = newSetOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__SET_OUTPUT, oldSetOutput, setOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchOpticalTestOutput getSwitchOptical() {
		if (switchOptical != null && switchOptical.eIsProxy()) {
			InternalEObject oldSwitchOptical = (InternalEObject)switchOptical;
			switchOptical = (SwitchOpticalTestOutput)eResolveProxy(oldSwitchOptical);
			if (switchOptical != oldSwitchOptical) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__SWITCH_OPTICAL, oldSwitchOptical, switchOptical));
			}
		}
		return switchOptical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchOpticalTestOutput basicGetSwitchOptical() {
		return switchOptical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchOptical(SwitchOpticalTestOutput newSwitchOptical) {
		SwitchOpticalTestOutput oldSwitchOptical = switchOptical;
		switchOptical = newSwitchOptical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__SWITCH_OPTICAL, oldSwitchOptical, switchOptical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerQualityMeasurementManagement getPowerQuality() {
		if (powerQuality != null && powerQuality.eIsProxy()) {
			InternalEObject oldPowerQuality = (InternalEObject)powerQuality;
			powerQuality = (PowerQualityMeasurementManagement)eResolveProxy(oldPowerQuality);
			if (powerQuality != oldPowerQuality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__POWER_QUALITY, oldPowerQuality, powerQuality));
			}
		}
		return powerQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerQualityMeasurementManagement basicGetPowerQuality() {
		return powerQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerQuality(PowerQualityMeasurementManagement newPowerQuality) {
		PowerQualityMeasurementManagement oldPowerQuality = powerQuality;
		powerQuality = newPowerQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__POWER_QUALITY, oldPowerQuality, powerQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControl getDisconnect() {
		if (disconnect != null && disconnect.eIsProxy()) {
			InternalEObject oldDisconnect = (InternalEObject)disconnect;
			disconnect = (DisconnectControl)eResolveProxy(oldDisconnect);
			if (disconnect != oldDisconnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__DISCONNECT, oldDisconnect, disconnect));
			}
		}
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControl basicGetDisconnect() {
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnect(DisconnectControl newDisconnect) {
		DisconnectControl oldDisconnect = disconnect;
		disconnect = newDisconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__DISCONNECT, oldDisconnect, disconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageActivation getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (ImageActivation)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageActivation basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(ImageActivation newImage) {
		ImageActivation oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push getPush() {
		if (push != null && push.eIsProxy()) {
			InternalEObject oldPush = (InternalEObject)push;
			push = (Push)eResolveProxy(oldPush);
			if (push != oldPush) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__PUSH, oldPush, push));
			}
		}
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push basicGetPush() {
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPush(Push newPush) {
		Push oldPush = push;
		push = newPush;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__PUSH, oldPush, push));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Broadcast getBroadcast() {
		if (broadcast != null && broadcast.eIsProxy()) {
			InternalEObject oldBroadcast = (InternalEObject)broadcast;
			broadcast = (Broadcast)eResolveProxy(oldBroadcast);
			if (broadcast != oldBroadcast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SCRIPT_TABLE__BROADCAST, oldBroadcast, broadcast));
			}
		}
		return broadcast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Broadcast basicGetBroadcast() {
		return broadcast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroadcast(Broadcast newBroadcast) {
		Broadcast oldBroadcast = broadcast;
		broadcast = newBroadcast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SCRIPT_TABLE__BROADCAST, oldBroadcast, broadcast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.SCRIPT_TABLE__GLOBAL_METER_RESET:
				if (resolve) return getGlobalMeterReset();
				return basicGetGlobalMeterReset();
			case COSEMObjectsPackage.SCRIPT_TABLE__MDI_RESET:
				if (resolve) return getMDIReset();
				return basicGetMDIReset();
			case COSEMObjectsPackage.SCRIPT_TABLE__TARIFFICATION:
				if (resolve) return getTariffication();
				return basicGetTariffication();
			case COSEMObjectsPackage.SCRIPT_TABLE__ACITVATE_TEST:
				if (resolve) return getAcitvateTest();
				return basicGetAcitvateTest();
			case COSEMObjectsPackage.SCRIPT_TABLE__ACTIVATE_NORMAL:
				if (resolve) return getActivateNormal();
				return basicGetActivateNormal();
			case COSEMObjectsPackage.SCRIPT_TABLE__SET_OUTPUT:
				if (resolve) return getSetOutput();
				return basicGetSetOutput();
			case COSEMObjectsPackage.SCRIPT_TABLE__SWITCH_OPTICAL:
				if (resolve) return getSwitchOptical();
				return basicGetSwitchOptical();
			case COSEMObjectsPackage.SCRIPT_TABLE__POWER_QUALITY:
				if (resolve) return getPowerQuality();
				return basicGetPowerQuality();
			case COSEMObjectsPackage.SCRIPT_TABLE__DISCONNECT:
				if (resolve) return getDisconnect();
				return basicGetDisconnect();
			case COSEMObjectsPackage.SCRIPT_TABLE__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case COSEMObjectsPackage.SCRIPT_TABLE__PUSH:
				if (resolve) return getPush();
				return basicGetPush();
			case COSEMObjectsPackage.SCRIPT_TABLE__BROADCAST:
				if (resolve) return getBroadcast();
				return basicGetBroadcast();
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
			case COSEMObjectsPackage.SCRIPT_TABLE__GLOBAL_METER_RESET:
				setGlobalMeterReset((GlobalMeterReset)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__MDI_RESET:
				setMDIReset((MDIReset)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__TARIFFICATION:
				setTariffication((Tariffication)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__ACITVATE_TEST:
				setAcitvateTest((ActivateTestMode)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__ACTIVATE_NORMAL:
				setActivateNormal((ActivateNormalMode)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__SET_OUTPUT:
				setSetOutput((SetOutputSignal)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__SWITCH_OPTICAL:
				setSwitchOptical((SwitchOpticalTestOutput)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__POWER_QUALITY:
				setPowerQuality((PowerQualityMeasurementManagement)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__DISCONNECT:
				setDisconnect((DisconnectControl)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__IMAGE:
				setImage((ImageActivation)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__PUSH:
				setPush((Push)newValue);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__BROADCAST:
				setBroadcast((Broadcast)newValue);
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
			case COSEMObjectsPackage.SCRIPT_TABLE__GLOBAL_METER_RESET:
				setGlobalMeterReset((GlobalMeterReset)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__MDI_RESET:
				setMDIReset((MDIReset)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__TARIFFICATION:
				setTariffication((Tariffication)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__ACITVATE_TEST:
				setAcitvateTest((ActivateTestMode)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__ACTIVATE_NORMAL:
				setActivateNormal((ActivateNormalMode)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__SET_OUTPUT:
				setSetOutput((SetOutputSignal)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__SWITCH_OPTICAL:
				setSwitchOptical((SwitchOpticalTestOutput)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__POWER_QUALITY:
				setPowerQuality((PowerQualityMeasurementManagement)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__DISCONNECT:
				setDisconnect((DisconnectControl)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__IMAGE:
				setImage((ImageActivation)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__PUSH:
				setPush((Push)null);
				return;
			case COSEMObjectsPackage.SCRIPT_TABLE__BROADCAST:
				setBroadcast((Broadcast)null);
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
			case COSEMObjectsPackage.SCRIPT_TABLE__GLOBAL_METER_RESET:
				return globalMeterReset != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__MDI_RESET:
				return mdiReset != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__TARIFFICATION:
				return tariffication != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__ACITVATE_TEST:
				return acitvateTest != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__ACTIVATE_NORMAL:
				return activateNormal != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__SET_OUTPUT:
				return setOutput != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__SWITCH_OPTICAL:
				return switchOptical != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__POWER_QUALITY:
				return powerQuality != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__DISCONNECT:
				return disconnect != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__IMAGE:
				return image != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__PUSH:
				return push != null;
			case COSEMObjectsPackage.SCRIPT_TABLE__BROADCAST:
				return broadcast != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptTableImpl
