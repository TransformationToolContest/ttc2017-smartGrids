/**
 */
package gluemodel.CIM.IEC61970;

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
 * @see gluemodel.CIM.IEC61970.IEC61970Factory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains entities that describe dynamic measurement data exchanged between applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains entities that describe dynamic measurement data exchanged between applications.'"
 * @generated
 */
public interface IEC61970Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IEC61970";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#IEC61970";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimIEC61970";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IEC61970Package eINSTANCE = gluemodel.CIM.IEC61970.impl.IEC61970PackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.impl.IEC61970CIMVersionImpl <em>CIM Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.impl.IEC61970CIMVersionImpl
	 * @see gluemodel.CIM.IEC61970.impl.IEC61970PackageImpl#getIEC61970CIMVersion()
	 * @generated
	 */
	int IEC61970_CIM_VERSION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970_CIM_VERSION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970_CIM_VERSION__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970_CIM_VERSION__VERSION = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CIM Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970_CIM_VERSION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CIM Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61970_CIM_VERSION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.IEC61970CIMVersion <em>CIM Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIM Version</em>'.
	 * @see gluemodel.CIM.IEC61970.IEC61970CIMVersion
	 * @generated
	 */
	EClass getIEC61970CIMVersion();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.IEC61970CIMVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gluemodel.CIM.IEC61970.IEC61970CIMVersion#getDate()
	 * @see #getIEC61970CIMVersion()
	 * @generated
	 */
	EAttribute getIEC61970CIMVersion_Date();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.IEC61970CIMVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gluemodel.CIM.IEC61970.IEC61970CIMVersion#getVersion()
	 * @see #getIEC61970CIMVersion()
	 * @generated
	 */
	EAttribute getIEC61970CIMVersion_Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IEC61970Factory getIEC61970Factory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.impl.IEC61970CIMVersionImpl <em>CIM Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.impl.IEC61970CIMVersionImpl
		 * @see gluemodel.CIM.IEC61970.impl.IEC61970PackageImpl#getIEC61970CIMVersion()
		 * @generated
		 */
		EClass IEC61970_CIM_VERSION = eINSTANCE.getIEC61970CIMVersion();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC61970_CIM_VERSION__DATE = eINSTANCE.getIEC61970CIMVersion_Date();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC61970_CIM_VERSION__VERSION = eINSTANCE.getIEC61970CIMVersion_Version();

	}

} //IEC61970Package
