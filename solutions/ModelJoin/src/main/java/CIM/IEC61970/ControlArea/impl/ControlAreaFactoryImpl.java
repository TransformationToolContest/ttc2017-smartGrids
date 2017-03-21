/**
 */
package CIM.IEC61970.ControlArea.impl;

import CIM.IEC61970.ControlArea.*;

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
public class ControlAreaFactoryImpl extends EFactoryImpl implements ControlAreaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlAreaFactory init() {
		try {
			ControlAreaFactory theControlAreaFactory = (ControlAreaFactory)EPackage.Registry.INSTANCE.getEFactory(ControlAreaPackage.eNS_URI);
			if (theControlAreaFactory != null) {
				return theControlAreaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlAreaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaFactoryImpl() {
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
			case ControlAreaPackage.CONTROL_AREA: return createControlArea();
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS: return createAltGeneratingUnitMeas();
			case ControlAreaPackage.TIE_FLOW: return createTieFlow();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT: return createControlAreaGeneratingUnit();
			case ControlAreaPackage.ALT_TIE_MEAS: return createAltTieMeas();
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
			case ControlAreaPackage.CONTROL_AREA_TYPE_KIND:
				return createControlAreaTypeKindFromString(eDataType, initialValue);
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
			case ControlAreaPackage.CONTROL_AREA_TYPE_KIND:
				return convertControlAreaTypeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea createControlArea() {
		ControlAreaImpl controlArea = new ControlAreaImpl();
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltGeneratingUnitMeas createAltGeneratingUnitMeas() {
		AltGeneratingUnitMeasImpl altGeneratingUnitMeas = new AltGeneratingUnitMeasImpl();
		return altGeneratingUnitMeas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlow createTieFlow() {
		TieFlowImpl tieFlow = new TieFlowImpl();
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaGeneratingUnit createControlAreaGeneratingUnit() {
		ControlAreaGeneratingUnitImpl controlAreaGeneratingUnit = new ControlAreaGeneratingUnitImpl();
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltTieMeas createAltTieMeas() {
		AltTieMeasImpl altTieMeas = new AltTieMeasImpl();
		return altTieMeas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaTypeKind createControlAreaTypeKindFromString(EDataType eDataType, String initialValue) {
		ControlAreaTypeKind result = ControlAreaTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlAreaTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaPackage getControlAreaPackage() {
		return (ControlAreaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControlAreaPackage getPackage() {
		return ControlAreaPackage.eINSTANCE;
	}

} //ControlAreaFactoryImpl
