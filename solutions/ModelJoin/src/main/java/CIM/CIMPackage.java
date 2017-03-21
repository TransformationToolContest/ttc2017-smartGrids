/**
 */
package CIM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see CIM.CIMFactory
 * @model kind="package"
 *        annotation="http://cimphony.com/rdf/2010/serialisation suffix='#'"
 * @generated
 */
public interface CIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CIMPackage eINSTANCE = CIM.impl.CIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.impl.ElementImpl
	 * @see CIM.impl.CIMPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UUID = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM.impl.CIMRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.impl.CIMRootImpl
	 * @see CIM.impl.CIMPackageImpl#getCIMRoot()
	 * @generated
	 */
	int CIM_ROOT = 1;

	/**
	 * The feature id for the '<em><b>IDobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ROOT__IDOBJECT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM.impl.StereotypeImpl <em>Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.impl.StereotypeImpl
	 * @see CIM.impl.CIMPackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__UUID = ELEMENT__UUID;

	/**
	 * The number of structural features of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.impl.CombinedVersionImpl <em>Combined Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.impl.CombinedVersionImpl
	 * @see CIM.impl.CIMPackageImpl#getCombinedVersion()
	 * @generated
	 */
	int COMBINED_VERSION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_VERSION__UUID = ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_VERSION__VERSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_VERSION__DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combined Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_VERSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combined Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_VERSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.impl.PackageImpl
	 * @see CIM.impl.CIMPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__UUID = ELEMENT__UUID;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Enumerated Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getEnumeratedType()
	 * @generated
	 */
	int ENUMERATED_TYPE = 5;

	/**
	 * The meta object id for the '<em>Power ROC Per Min</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getPowerROCPerMin()
	 * @generated
	 */
	int POWER_ROC_PER_MIN = 6;

	/**
	 * The meta object id for the '<em>Flowgate Idc Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getFlowgateIdcType()
	 * @generated
	 */
	int FLOWGATE_IDC_TYPE = 7;

	/**
	 * The meta object id for the '<em>Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 8;

	/**
	 * The meta object id for the '<em>Energy As MWh</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getEnergyAsMWh()
	 * @generated
	 */
	int ENERGY_AS_MWH = 9;

	/**
	 * The meta object id for the '<em>Penalty Factor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getPenaltyFactor()
	 * @generated
	 */
	int PENALTY_FACTOR = 10;

	/**
	 * The meta object id for the '<em>Freq Bias Factor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getFreqBiasFactor()
	 * @generated
	 */
	int FREQ_BIAS_FACTOR = 11;

	/**
	 * The meta object id for the '<em>Rate Of Change</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getRateOfChange()
	 * @generated
	 */
	int RATE_OF_CHANGE = 12;

	/**
	 * The meta object id for the '<em>Flowgate Afc Use Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see CIM.impl.CIMPackageImpl#getFlowgateAfcUseCode()
	 * @generated
	 */
	int FLOWGATE_AFC_USE_CODE = 13;


	/**
	 * Returns the meta object for class '{@link CIM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CIM.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.Element#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see CIM.Element#getUUID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UUID();

	/**
	 * Returns the meta object for class '{@link CIM.CIMRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see CIM.CIMRoot
	 * @generated
	 */
	EClass getCIMRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link CIM.CIMRoot#getIDobject <em>IDobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IDobject</em>'.
	 * @see CIM.CIMRoot#getIDobject()
	 * @see #getCIMRoot()
	 * @generated
	 */
	EReference getCIMRoot_IDobject();

	/**
	 * Returns the meta object for class '{@link CIM.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype</em>'.
	 * @see CIM.Stereotype
	 * @generated
	 */
	EClass getStereotype();

	/**
	 * Returns the meta object for class '{@link CIM.CombinedVersion <em>Combined Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Version</em>'.
	 * @see CIM.CombinedVersion
	 * @generated
	 */
	EClass getCombinedVersion();

	/**
	 * Returns the meta object for the attribute '{@link CIM.CombinedVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM.CombinedVersion#getVersion()
	 * @see #getCombinedVersion()
	 * @generated
	 */
	EAttribute getCombinedVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link CIM.CombinedVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CIM.CombinedVersion#getDate()
	 * @see #getCombinedVersion()
	 * @generated
	 */
	EAttribute getCombinedVersion_Date();

	/**
	 * Returns the meta object for class '{@link CIM.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see CIM.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enumerated Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getEnumeratedType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Power ROC Per Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Power ROC Per Min</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getPowerROCPerMin();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Flowgate Idc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flowgate Idc Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getFlowgateIdcType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Quantity</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getQuantity();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Energy As MWh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Energy As MWh</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getEnergyAsMWh();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Penalty Factor</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getPenaltyFactor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Freq Bias Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Freq Bias Factor</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getFreqBiasFactor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Rate Of Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rate Of Change</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getRateOfChange();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Flowgate Afc Use Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flowgate Afc Use Code</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="baseType='null'"
	 * @generated
	 */
	EDataType getFlowgateAfcUseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CIMFactory getCIMFactory();

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
		 * The meta object literal for the '{@link CIM.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.impl.ElementImpl
		 * @see CIM.impl.CIMPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UUID = eINSTANCE.getElement_UUID();

		/**
		 * The meta object literal for the '{@link CIM.impl.CIMRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.impl.CIMRootImpl
		 * @see CIM.impl.CIMPackageImpl#getCIMRoot()
		 * @generated
		 */
		EClass CIM_ROOT = eINSTANCE.getCIMRoot();

		/**
		 * The meta object literal for the '<em><b>IDobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIM_ROOT__IDOBJECT = eINSTANCE.getCIMRoot_IDobject();

		/**
		 * The meta object literal for the '{@link CIM.impl.StereotypeImpl <em>Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.impl.StereotypeImpl
		 * @see CIM.impl.CIMPackageImpl#getStereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '{@link CIM.impl.CombinedVersionImpl <em>Combined Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.impl.CombinedVersionImpl
		 * @see CIM.impl.CIMPackageImpl#getCombinedVersion()
		 * @generated
		 */
		EClass COMBINED_VERSION = eINSTANCE.getCombinedVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_VERSION__VERSION = eINSTANCE.getCombinedVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_VERSION__DATE = eINSTANCE.getCombinedVersion_Date();

		/**
		 * The meta object literal for the '{@link CIM.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.impl.PackageImpl
		 * @see CIM.impl.CIMPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em>Enumerated Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getEnumeratedType()
		 * @generated
		 */
		EDataType ENUMERATED_TYPE = eINSTANCE.getEnumeratedType();

		/**
		 * The meta object literal for the '<em>Power ROC Per Min</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getPowerROCPerMin()
		 * @generated
		 */
		EDataType POWER_ROC_PER_MIN = eINSTANCE.getPowerROCPerMin();

		/**
		 * The meta object literal for the '<em>Flowgate Idc Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getFlowgateIdcType()
		 * @generated
		 */
		EDataType FLOWGATE_IDC_TYPE = eINSTANCE.getFlowgateIdcType();

		/**
		 * The meta object literal for the '<em>Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getQuantity()
		 * @generated
		 */
		EDataType QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em>Energy As MWh</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getEnergyAsMWh()
		 * @generated
		 */
		EDataType ENERGY_AS_MWH = eINSTANCE.getEnergyAsMWh();

		/**
		 * The meta object literal for the '<em>Penalty Factor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getPenaltyFactor()
		 * @generated
		 */
		EDataType PENALTY_FACTOR = eINSTANCE.getPenaltyFactor();

		/**
		 * The meta object literal for the '<em>Freq Bias Factor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getFreqBiasFactor()
		 * @generated
		 */
		EDataType FREQ_BIAS_FACTOR = eINSTANCE.getFreqBiasFactor();

		/**
		 * The meta object literal for the '<em>Rate Of Change</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getRateOfChange()
		 * @generated
		 */
		EDataType RATE_OF_CHANGE = eINSTANCE.getRateOfChange();

		/**
		 * The meta object literal for the '<em>Flowgate Afc Use Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see CIM.impl.CIMPackageImpl#getFlowgateAfcUseCode()
		 * @generated
		 */
		EDataType FLOWGATE_AFC_USE_CODE = eINSTANCE.getFlowgateAfcUseCode();

	}

} //CIMPackage
