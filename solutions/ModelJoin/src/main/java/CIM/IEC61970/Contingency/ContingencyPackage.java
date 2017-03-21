/**
 */
package CIM.IEC61970.Contingency;

import CIM.IEC61970.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see CIM.IEC61970.Contingency.ContingencyFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contingencies to be studied.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contingencies to be studied.'"
 * @generated
 */
public interface ContingencyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Contingency";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Contingency";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimContingency";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContingencyPackage eINSTANCE = CIM.IEC61970.Contingency.impl.ContingencyPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Contingency.impl.ContingencyImpl <em>Contingency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Contingency.impl.ContingencyImpl
	 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingency()
	 * @generated
	 */
	int CONTINGENCY = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Contingency Constraint Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Must Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__MUST_STUDY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contingency Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY__CONTINGENCY_ELEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contingency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contingency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Contingency.impl.ContingencyElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Contingency.impl.ContingencyElementImpl
	 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingencyElement()
	 * @generated
	 */
	int CONTINGENCY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Contingency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT__CONTINGENCY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_ELEMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Contingency.impl.ContingencyEquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Contingency.impl.ContingencyEquipmentImpl
	 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingencyEquipment()
	 * @generated
	 */
	int CONTINGENCY_EQUIPMENT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__UUID = CONTINGENCY_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__MRID = CONTINGENCY_ELEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__NAME = CONTINGENCY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__DESCRIPTION = CONTINGENCY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__PATH_NAME = CONTINGENCY_ELEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__MODELING_AUTHORITY_SET = CONTINGENCY_ELEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__LOCAL_NAME = CONTINGENCY_ELEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__ALIAS_NAME = CONTINGENCY_ELEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Contingency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__CONTINGENCY = CONTINGENCY_ELEMENT__CONTINGENCY;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__EQUIPMENT = CONTINGENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contingent Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS = CONTINGENCY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT_FEATURE_COUNT = CONTINGENCY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINGENCY_EQUIPMENT_OPERATION_COUNT = CONTINGENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind <em>Equipment Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingencyEquipmentStatusKind()
	 * @generated
	 */
	int CONTINGENCY_EQUIPMENT_STATUS_KIND = 3;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Contingency.Contingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contingency</em>'.
	 * @see CIM.IEC61970.Contingency.Contingency
	 * @generated
	 */
	EClass getContingency();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Contingency.Contingency#getContingencyConstraintLimit <em>Contingency Constraint Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contingency Constraint Limit</em>'.
	 * @see CIM.IEC61970.Contingency.Contingency#getContingencyConstraintLimit()
	 * @see #getContingency()
	 * @generated
	 */
	EReference getContingency_ContingencyConstraintLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Study</em>'.
	 * @see CIM.IEC61970.Contingency.Contingency#isMustStudy()
	 * @see #getContingency()
	 * @generated
	 */
	EAttribute getContingency_MustStudy();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Contingency.Contingency#getContingencyElement <em>Contingency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contingency Element</em>'.
	 * @see CIM.IEC61970.Contingency.Contingency#getContingencyElement()
	 * @see #getContingency()
	 * @generated
	 */
	EReference getContingency_ContingencyElement();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Contingency.ContingencyEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CIM.IEC61970.Contingency.ContingencyEquipment
	 * @generated
	 */
	EClass getContingencyEquipment();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see CIM.IEC61970.Contingency.ContingencyEquipment#getEquipment()
	 * @see #getContingencyEquipment()
	 * @generated
	 */
	EReference getContingencyEquipment_Equipment();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contingent Status</em>'.
	 * @see CIM.IEC61970.Contingency.ContingencyEquipment#getContingentStatus()
	 * @see #getContingencyEquipment()
	 * @generated
	 */
	EAttribute getContingencyEquipment_ContingentStatus();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Contingency.ContingencyElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CIM.IEC61970.Contingency.ContingencyElement
	 * @generated
	 */
	EClass getContingencyElement();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contingency</em>'.
	 * @see CIM.IEC61970.Contingency.ContingencyElement#getContingency()
	 * @see #getContingencyElement()
	 * @generated
	 */
	EReference getContingencyElement_Contingency();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind <em>Equipment Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Equipment Status Kind</em>'.
	 * @see CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @generated
	 */
	EEnum getContingencyEquipmentStatusKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContingencyFactory getContingencyFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Contingency.impl.ContingencyImpl <em>Contingency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Contingency.impl.ContingencyImpl
		 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingency()
		 * @generated
		 */
		EClass CONTINGENCY = eINSTANCE.getContingency();

		/**
		 * The meta object literal for the '<em><b>Contingency Constraint Limit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT = eINSTANCE.getContingency_ContingencyConstraintLimit();

		/**
		 * The meta object literal for the '<em><b>Must Study</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINGENCY__MUST_STUDY = eINSTANCE.getContingency_MustStudy();

		/**
		 * The meta object literal for the '<em><b>Contingency Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY__CONTINGENCY_ELEMENT = eINSTANCE.getContingency_ContingencyElement();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Contingency.impl.ContingencyEquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Contingency.impl.ContingencyEquipmentImpl
		 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingencyEquipment()
		 * @generated
		 */
		EClass CONTINGENCY_EQUIPMENT = eINSTANCE.getContingencyEquipment();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY_EQUIPMENT__EQUIPMENT = eINSTANCE.getContingencyEquipment_Equipment();

		/**
		 * The meta object literal for the '<em><b>Contingent Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS = eINSTANCE.getContingencyEquipment_ContingentStatus();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Contingency.impl.ContingencyElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Contingency.impl.ContingencyElementImpl
		 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingencyElement()
		 * @generated
		 */
		EClass CONTINGENCY_ELEMENT = eINSTANCE.getContingencyElement();

		/**
		 * The meta object literal for the '<em><b>Contingency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINGENCY_ELEMENT__CONTINGENCY = eINSTANCE.getContingencyElement_Contingency();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind <em>Equipment Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Contingency.ContingencyEquipmentStatusKind
		 * @see CIM.IEC61970.Contingency.impl.ContingencyPackageImpl#getContingencyEquipmentStatusKind()
		 * @generated
		 */
		EEnum CONTINGENCY_EQUIPMENT_STATUS_KIND = eINSTANCE.getContingencyEquipmentStatusKind();

	}

} //ContingencyPackage
