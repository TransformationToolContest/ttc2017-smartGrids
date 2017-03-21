/**
 */
package outageDetectionMjtrace;

import org.eclipse.emf.ecore.EClass;
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
 * @see outageDetectionMjtrace.OutageDetectionMjtraceFactory
 * @model kind="package"
 * @generated
 */
public interface OutageDetectionMjtracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "outageDetectionMjtrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/ConsumerReachabilityView.trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "outageDtMjt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutageDetectionMjtracePackage eINSTANCE = outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl.init();

	/**
	 * The meta object id for the '{@link outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl <em>join Meter Asset Physical Device Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl
	 * @see outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl#getjoin_MeterAsset_PhysicalDevice_EnergyConsumer()
	 * @generated
	 */
	int JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET = 2;

	/**
	 * The number of structural features of the '<em>join Meter Asset Physical Device Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>join Meter Asset Physical Device Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outageDetectionMjtrace.impl.ref_Location_Location_LocationImpl <em>ref Location Location Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outageDetectionMjtrace.impl.ref_Location_Location_LocationImpl
	 * @see outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl#getref_Location_Location_Location()
	 * @generated
	 */
	int REF_LOCATION_LOCATION_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_LOCATION_LOCATION_LOCATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_LOCATION_LOCATION_LOCATION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>ref Location Location Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_LOCATION_LOCATION_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ref Location Location Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_LOCATION_LOCATION_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outageDetectionMjtrace.impl.ref_PositionPoint_PositionPoint_PositionImpl <em>ref Position Point Position Point Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outageDetectionMjtrace.impl.ref_PositionPoint_PositionPoint_PositionImpl
	 * @see outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl#getref_PositionPoint_PositionPoint_Position()
	 * @generated
	 */
	int REF_POSITION_POINT_POSITION_POINT_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>ref Position Point Position Point Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_POSITION_POINT_POSITION_POINT_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ref Position Point Position Point Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_POSITION_POINT_POSITION_POINT_POSITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer <em>join Meter Asset Physical Device Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>join Meter Asset Physical Device Energy Consumer</em>'.
	 * @see outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer
	 * @generated
	 */
	EClass getjoin_MeterAsset_PhysicalDevice_EnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getLeft()
	 * @see #getjoin_MeterAsset_PhysicalDevice_EnergyConsumer()
	 * @generated
	 */
	EReference getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Left();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getRight()
	 * @see #getjoin_MeterAsset_PhysicalDevice_EnergyConsumer()
	 * @generated
	 */
	EReference getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Right();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getTarget()
	 * @see #getjoin_MeterAsset_PhysicalDevice_EnergyConsumer()
	 * @generated
	 */
	EReference getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Target();

	/**
	 * Returns the meta object for class '{@link outageDetectionMjtrace.ref_Location_Location_Location <em>ref Location Location Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ref Location Location Location</em>'.
	 * @see outageDetectionMjtrace.ref_Location_Location_Location
	 * @generated
	 */
	EClass getref_Location_Location_Location();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.ref_Location_Location_Location#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see outageDetectionMjtrace.ref_Location_Location_Location#getSource()
	 * @see #getref_Location_Location_Location()
	 * @generated
	 */
	EReference getref_Location_Location_Location_Source();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.ref_Location_Location_Location#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see outageDetectionMjtrace.ref_Location_Location_Location#getTarget()
	 * @see #getref_Location_Location_Location()
	 * @generated
	 */
	EReference getref_Location_Location_Location_Target();

	/**
	 * Returns the meta object for class '{@link outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position <em>ref Position Point Position Point Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ref Position Point Position Point Position</em>'.
	 * @see outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position
	 * @generated
	 */
	EClass getref_PositionPoint_PositionPoint_Position();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position#getSource()
	 * @see #getref_PositionPoint_PositionPoint_Position()
	 * @generated
	 */
	EReference getref_PositionPoint_PositionPoint_Position_Source();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position#getTarget()
	 * @see #getref_PositionPoint_PositionPoint_Position()
	 * @generated
	 */
	EReference getref_PositionPoint_PositionPoint_Position_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OutageDetectionMjtraceFactory getOutageDetectionMjtraceFactory();

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
		 * The meta object literal for the '{@link outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl <em>join Meter Asset Physical Device Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl
		 * @see outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl#getjoin_MeterAsset_PhysicalDevice_EnergyConsumer()
		 * @generated
		 */
		EClass JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER = eINSTANCE.getjoin_MeterAsset_PhysicalDevice_EnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT = eINSTANCE.getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT = eINSTANCE.getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Right();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET = eINSTANCE.getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Target();

		/**
		 * The meta object literal for the '{@link outageDetectionMjtrace.impl.ref_Location_Location_LocationImpl <em>ref Location Location Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outageDetectionMjtrace.impl.ref_Location_Location_LocationImpl
		 * @see outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl#getref_Location_Location_Location()
		 * @generated
		 */
		EClass REF_LOCATION_LOCATION_LOCATION = eINSTANCE.getref_Location_Location_Location();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_LOCATION_LOCATION_LOCATION__SOURCE = eINSTANCE.getref_Location_Location_Location_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_LOCATION_LOCATION_LOCATION__TARGET = eINSTANCE.getref_Location_Location_Location_Target();

		/**
		 * The meta object literal for the '{@link outageDetectionMjtrace.impl.ref_PositionPoint_PositionPoint_PositionImpl <em>ref Position Point Position Point Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outageDetectionMjtrace.impl.ref_PositionPoint_PositionPoint_PositionImpl
		 * @see outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl#getref_PositionPoint_PositionPoint_Position()
		 * @generated
		 */
		EClass REF_POSITION_POINT_POSITION_POINT_POSITION = eINSTANCE.getref_PositionPoint_PositionPoint_Position();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE = eINSTANCE.getref_PositionPoint_PositionPoint_Position_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET = eINSTANCE.getref_PositionPoint_PositionPoint_Position_Target();

	}

} //OutageDetectionMjtracePackage
