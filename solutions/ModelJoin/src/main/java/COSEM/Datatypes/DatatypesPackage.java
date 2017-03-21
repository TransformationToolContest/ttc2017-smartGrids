/**
 */
package COSEM.Datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see COSEM.Datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = COSEM.Datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link COSEM.Datatypes.impl.scal_unit_typeImpl <em>scal unit type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see COSEM.Datatypes.impl.scal_unit_typeImpl
	 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getscal_unit_type()
	 * @generated
	 */
	int SCAL_UNIT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Scaler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAL_UNIT_TYPE__SCALER = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAL_UNIT_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>scal unit type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAL_UNIT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>scal unit type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAL_UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link COSEM.Datatypes.Units <em>Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see COSEM.Datatypes.Units
	 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 1;

	/**
	 * The meta object id for the '{@link COSEM.Datatypes.DisconnectControlState <em>Disconnect Control State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see COSEM.Datatypes.DisconnectControlState
	 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getDisconnectControlState()
	 * @generated
	 */
	int DISCONNECT_CONTROL_STATE = 2;

	/**
	 * The meta object id for the '{@link COSEM.Datatypes.DisconnectControlTransition <em>Disconnect Control Transition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see COSEM.Datatypes.DisconnectControlTransition
	 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getDisconnectControlTransition()
	 * @generated
	 */
	int DISCONNECT_CONTROL_TRANSITION = 3;


	/**
	 * Returns the meta object for class '{@link COSEM.Datatypes.scal_unit_type <em>scal unit type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>scal unit type</em>'.
	 * @see COSEM.Datatypes.scal_unit_type
	 * @generated
	 */
	EClass getscal_unit_type();

	/**
	 * Returns the meta object for the attribute '{@link COSEM.Datatypes.scal_unit_type#getScaler <em>Scaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaler</em>'.
	 * @see COSEM.Datatypes.scal_unit_type#getScaler()
	 * @see #getscal_unit_type()
	 * @generated
	 */
	EAttribute getscal_unit_type_Scaler();

	/**
	 * Returns the meta object for the attribute '{@link COSEM.Datatypes.scal_unit_type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see COSEM.Datatypes.scal_unit_type#getUnit()
	 * @see #getscal_unit_type()
	 * @generated
	 */
	EAttribute getscal_unit_type_Unit();

	/**
	 * Returns the meta object for enum '{@link COSEM.Datatypes.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units</em>'.
	 * @see COSEM.Datatypes.Units
	 * @generated
	 */
	EEnum getUnits();

	/**
	 * Returns the meta object for enum '{@link COSEM.Datatypes.DisconnectControlState <em>Disconnect Control State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disconnect Control State</em>'.
	 * @see COSEM.Datatypes.DisconnectControlState
	 * @generated
	 */
	EEnum getDisconnectControlState();

	/**
	 * Returns the meta object for enum '{@link COSEM.Datatypes.DisconnectControlTransition <em>Disconnect Control Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disconnect Control Transition</em>'.
	 * @see COSEM.Datatypes.DisconnectControlTransition
	 * @generated
	 */
	EEnum getDisconnectControlTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link COSEM.Datatypes.impl.scal_unit_typeImpl <em>scal unit type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see COSEM.Datatypes.impl.scal_unit_typeImpl
		 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getscal_unit_type()
		 * @generated
		 */
		EClass SCAL_UNIT_TYPE = eINSTANCE.getscal_unit_type();

		/**
		 * The meta object literal for the '<em><b>Scaler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAL_UNIT_TYPE__SCALER = eINSTANCE.getscal_unit_type_Scaler();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAL_UNIT_TYPE__UNIT = eINSTANCE.getscal_unit_type_Unit();

		/**
		 * The meta object literal for the '{@link COSEM.Datatypes.Units <em>Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see COSEM.Datatypes.Units
		 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getUnits()
		 * @generated
		 */
		EEnum UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '{@link COSEM.Datatypes.DisconnectControlState <em>Disconnect Control State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see COSEM.Datatypes.DisconnectControlState
		 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getDisconnectControlState()
		 * @generated
		 */
		EEnum DISCONNECT_CONTROL_STATE = eINSTANCE.getDisconnectControlState();

		/**
		 * The meta object literal for the '{@link COSEM.Datatypes.DisconnectControlTransition <em>Disconnect Control Transition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see COSEM.Datatypes.DisconnectControlTransition
		 * @see COSEM.Datatypes.impl.DatatypesPackageImpl#getDisconnectControlTransition()
		 * @generated
		 */
		EEnum DISCONNECT_CONTROL_TRANSITION = eINSTANCE.getDisconnectControlTransition();

	}

} //DatatypesPackage
