/**
 */
package gluemodel.CIM.IEC61968;

import gluemodel.CIM.CIMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see gluemodel.CIM.IEC61968.IEC61968Factory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package contains the information classes that extend IEC61970::Wires package with power system resources required for distribution network modelling, including unbalanced networks.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package contains the information classes that extend IEC61970::Wires package with power system resources required for distribution network modelling, including unbalanced networks.'"
 * @generated
 */
public interface IEC61968Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IEC61968";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#IEC61968";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimIEC61968";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEC61968Package eINSTANCE = gluemodel.CIM.IEC61968.impl.IEC61968PackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.impl.IEC61968CIMVersionImpl <em>CIM Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.impl.IEC61968CIMVersionImpl
	 * @see gluemodel.CIM.IEC61968.impl.IEC61968PackageImpl#getIEC61968CIMVersion()
	 * @generated
	 */
	int IEC61968_CIM_VERSION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61968_CIM_VERSION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61968_CIM_VERSION__VERSION = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61968_CIM_VERSION__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CIM Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61968_CIM_VERSION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CIM Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61968_CIM_VERSION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.IEC61968CIMVersion <em>CIM Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIM Version</em>'.
	 * @see gluemodel.CIM.IEC61968.IEC61968CIMVersion
	 * @generated
	 */
	EClass getIEC61968CIMVersion();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.IEC61968CIMVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gluemodel.CIM.IEC61968.IEC61968CIMVersion#getVersion()
	 * @see #getIEC61968CIMVersion()
	 * @generated
	 */
	EAttribute getIEC61968CIMVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.IEC61968CIMVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gluemodel.CIM.IEC61968.IEC61968CIMVersion#getDate()
	 * @see #getIEC61968CIMVersion()
	 * @generated
	 */
	EAttribute getIEC61968CIMVersion_Date();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IEC61968Factory getIEC61968Factory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.impl.IEC61968CIMVersionImpl <em>CIM Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.impl.IEC61968CIMVersionImpl
		 * @see gluemodel.CIM.IEC61968.impl.IEC61968PackageImpl#getIEC61968CIMVersion()
		 * @generated
		 */
		EClass IEC61968_CIM_VERSION = eINSTANCE.getIEC61968CIMVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC61968_CIM_VERSION__VERSION = eINSTANCE.getIEC61968CIMVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC61968_CIM_VERSION__DATE = eINSTANCE.getIEC61968CIMVersion_Date();

	}

} //IEC61968Package
