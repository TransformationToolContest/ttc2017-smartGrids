/**
 */
package CIM.IEC61970.Outage.impl;

import CIM.IEC61970.Outage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class OutageFactoryImpl extends EFactoryImpl implements OutageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutageFactory init() {
		try {
			OutageFactory theOutageFactory = (OutageFactory)EPackage.Registry.INSTANCE.getEFactory(OutagePackage.eNS_URI);
			if (theOutageFactory != null) {
				return theOutageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageFactoryImpl() {
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
			case OutagePackage.OUTAGE_SCHEDULE: return createOutageSchedule();
			case OutagePackage.CLEARANCE_TAG_TYPE: return createClearanceTagType();
			case OutagePackage.CLEARANCE_TAG: return createClearanceTag();
			case OutagePackage.SWITCHING_OPERATION: return createSwitchingOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OutagePackage.SWITCH_STATE:
				return createSwitchStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OutagePackage.SWITCH_STATE:
				return convertSwitchStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule createOutageSchedule() {
		OutageScheduleImpl outageSchedule = new OutageScheduleImpl();
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearanceTagType createClearanceTagType() {
		ClearanceTagTypeImpl clearanceTagType = new ClearanceTagTypeImpl();
		return clearanceTagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearanceTag createClearanceTag() {
		ClearanceTagImpl clearanceTag = new ClearanceTagImpl();
		return clearanceTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingOperation createSwitchingOperation() {
		SwitchingOperationImpl switchingOperation = new SwitchingOperationImpl();
		return switchingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchState createSwitchStateFromString(EDataType eDataType, String initialValue) {
		SwitchState result = SwitchState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwitchStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePackage getOutagePackage() {
		return (OutagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutagePackage getPackage() {
		return OutagePackage.eINSTANCE;
	}

} //OutageFactoryImpl
