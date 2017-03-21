/**
 */
package CIM.IEC61970.Contingency.impl;

import CIM.IEC61970.Contingency.*;

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
public class ContingencyFactoryImpl extends EFactoryImpl implements ContingencyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContingencyFactory init() {
		try {
			ContingencyFactory theContingencyFactory = (ContingencyFactory)EPackage.Registry.INSTANCE.getEFactory(ContingencyPackage.eNS_URI);
			if (theContingencyFactory != null) {
				return theContingencyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContingencyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyFactoryImpl() {
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
			case ContingencyPackage.CONTINGENCY: return createContingency();
			case ContingencyPackage.CONTINGENCY_EQUIPMENT: return createContingencyEquipment();
			case ContingencyPackage.CONTINGENCY_ELEMENT: return createContingencyElement();
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT_STATUS_KIND:
				return createContingencyEquipmentStatusKindFromString(eDataType, initialValue);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT_STATUS_KIND:
				return convertContingencyEquipmentStatusKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency createContingency() {
		ContingencyImpl contingency = new ContingencyImpl();
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyEquipment createContingencyEquipment() {
		ContingencyEquipmentImpl contingencyEquipment = new ContingencyEquipmentImpl();
		return contingencyEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyElement createContingencyElement() {
		ContingencyElementImpl contingencyElement = new ContingencyElementImpl();
		return contingencyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyEquipmentStatusKind createContingencyEquipmentStatusKindFromString(EDataType eDataType, String initialValue) {
		ContingencyEquipmentStatusKind result = ContingencyEquipmentStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContingencyEquipmentStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContingencyPackage getContingencyPackage() {
		return (ContingencyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContingencyPackage getPackage() {
		return ContingencyPackage.eINSTANCE;
	}

} //ContingencyFactoryImpl
