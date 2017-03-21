/**
 */
package CIM.IEC61970.Protection.impl;

import CIM.IEC61970.Protection.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtectionFactoryImpl extends EFactoryImpl implements ProtectionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtectionFactory init() {
		try {
			ProtectionFactory theProtectionFactory = (ProtectionFactory)EPackage.Registry.INSTANCE.getEFactory(ProtectionPackage.eNS_URI);
			if (theProtectionFactory != null) {
				return theProtectionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProtectionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProtectionPackage.CURRENT_RELAY: return createCurrentRelay();
			case ProtectionPackage.SYNCHROCHECK_RELAY: return createSynchrocheckRelay();
			case ProtectionPackage.RECLOSE_SEQUENCE: return createRecloseSequence();
			case ProtectionPackage.SURGE_PROTECTOR: return createSurgeProtector();
			case ProtectionPackage.PROTECTION_EQUIPMENT: return createProtectionEquipment();
			case ProtectionPackage.FAULT_INDICATOR: return createFaultIndicator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentRelay createCurrentRelay() {
		CurrentRelayImpl currentRelay = new CurrentRelayImpl();
		return currentRelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchrocheckRelay createSynchrocheckRelay() {
		SynchrocheckRelayImpl synchrocheckRelay = new SynchrocheckRelayImpl();
		return synchrocheckRelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecloseSequence createRecloseSequence() {
		RecloseSequenceImpl recloseSequence = new RecloseSequenceImpl();
		return recloseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeProtector createSurgeProtector() {
		SurgeProtectorImpl surgeProtector = new SurgeProtectorImpl();
		return surgeProtector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionEquipment createProtectionEquipment() {
		ProtectionEquipmentImpl protectionEquipment = new ProtectionEquipmentImpl();
		return protectionEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicator createFaultIndicator() {
		FaultIndicatorImpl faultIndicator = new FaultIndicatorImpl();
		return faultIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionPackage getProtectionPackage() {
		return (ProtectionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProtectionPackage getPackage() {
		return ProtectionPackage.eINSTANCE;
	}

} //ProtectionFactoryImpl
