/**
 */
package rgse.ttc17.emoflon.tgg.task1;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see rgse.ttc17.emoflon.tgg.task1.Task1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='rgse.ttc17.emoflon.tgg'"
 * @generated
 */
public interface Task1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/rgse.ttc17.emoflon.tgg.task1/model/Task1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rgse.ttc17.emoflon.tgg.task1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Task1Package eINSTANCE = rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl.init();

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.ControlAreaToEnergyConsumerImpl <em>Control Area To Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.ControlAreaToEnergyConsumerImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getControlAreaToEnergyConsumer()
	 * @generated
	 */
	int CONTROL_AREA_TO_ENERGY_CONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_ENERGY_CONSUMER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_ENERGY_CONSUMER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Area To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_ENERGY_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Area To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_ENERGY_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.LocationToLocationImpl <em>Location To Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.LocationToLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getLocationToLocation()
	 * @generated
	 */
	int LOCATION_TO_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.PhysicalDeviceToEnergyConsumerImpl <em>Physical Device To Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.PhysicalDeviceToEnergyConsumerImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getPhysicalDeviceToEnergyConsumer()
	 * @generated
	 */
	int PHYSICAL_DEVICE_TO_ENERGY_CONSUMER = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Device To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_ENERGY_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Physical Device To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_ENERGY_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.PositionPointToPositionPointImpl <em>Position Point To Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.PositionPointToPositionPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getPositionPointToPositionPoint()
	 * @generated
	 */
	int POSITION_POINT_TO_POSITION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Point To Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position Point To Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.MeterAssetToEnergyConsumerImpl <em>Meter Asset To Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.MeterAssetToEnergyConsumerImpl
	 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getMeterAssetToEnergyConsumer()
	 * @generated
	 */
	int METER_ASSET_TO_ENERGY_CONSUMER = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_ENERGY_CONSUMER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_ENERGY_CONSUMER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Asset To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_ENERGY_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Asset To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_ENERGY_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer <em>Control Area To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area To Energy Consumer</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer
	 * @generated
	 */
	EClass getControlAreaToEnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer#getSource()
	 * @see #getControlAreaToEnergyConsumer()
	 * @generated
	 */
	EReference getControlAreaToEnergyConsumer_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.ControlAreaToEnergyConsumer#getTarget()
	 * @see #getControlAreaToEnergyConsumer()
	 * @generated
	 */
	EReference getControlAreaToEnergyConsumer_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation <em>Location To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location To Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.LocationToLocation
	 * @generated
	 */
	EClass getLocationToLocation();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getSource()
	 * @see #getLocationToLocation()
	 * @generated
	 */
	EReference getLocationToLocation_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.LocationToLocation#getTarget()
	 * @see #getLocationToLocation()
	 * @generated
	 */
	EReference getLocationToLocation_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer <em>Physical Device To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Device To Energy Consumer</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer
	 * @generated
	 */
	EClass getPhysicalDeviceToEnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer#getSource()
	 * @see #getPhysicalDeviceToEnergyConsumer()
	 * @generated
	 */
	EReference getPhysicalDeviceToEnergyConsumer_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer#getTarget()
	 * @see #getPhysicalDeviceToEnergyConsumer()
	 * @generated
	 */
	EReference getPhysicalDeviceToEnergyConsumer_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint <em>Position Point To Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point To Position Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint
	 * @generated
	 */
	EClass getPositionPointToPositionPoint();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint#getSource()
	 * @see #getPositionPointToPositionPoint()
	 * @generated
	 */
	EReference getPositionPointToPositionPoint_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.PositionPointToPositionPoint#getTarget()
	 * @see #getPositionPointToPositionPoint()
	 * @generated
	 */
	EReference getPositionPointToPositionPoint_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer <em>Meter Asset To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset To Energy Consumer</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer
	 * @generated
	 */
	EClass getMeterAssetToEnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer#getSource()
	 * @see #getMeterAssetToEnergyConsumer()
	 * @generated
	 */
	EReference getMeterAssetToEnergyConsumer_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task1.MeterAssetToEnergyConsumer#getTarget()
	 * @see #getMeterAssetToEnergyConsumer()
	 * @generated
	 */
	EReference getMeterAssetToEnergyConsumer_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Task1Factory getTask1Factory();

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
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.ControlAreaToEnergyConsumerImpl <em>Control Area To Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.ControlAreaToEnergyConsumerImpl
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getControlAreaToEnergyConsumer()
		 * @generated
		 */
		EClass CONTROL_AREA_TO_ENERGY_CONSUMER = eINSTANCE.getControlAreaToEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_TO_ENERGY_CONSUMER__SOURCE = eINSTANCE.getControlAreaToEnergyConsumer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_TO_ENERGY_CONSUMER__TARGET = eINSTANCE.getControlAreaToEnergyConsumer_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.LocationToLocationImpl <em>Location To Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.LocationToLocationImpl
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getLocationToLocation()
		 * @generated
		 */
		EClass LOCATION_TO_LOCATION = eINSTANCE.getLocationToLocation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TO_LOCATION__SOURCE = eINSTANCE.getLocationToLocation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TO_LOCATION__TARGET = eINSTANCE.getLocationToLocation_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.PhysicalDeviceToEnergyConsumerImpl <em>Physical Device To Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.PhysicalDeviceToEnergyConsumerImpl
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getPhysicalDeviceToEnergyConsumer()
		 * @generated
		 */
		EClass PHYSICAL_DEVICE_TO_ENERGY_CONSUMER = eINSTANCE.getPhysicalDeviceToEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE = eINSTANCE.getPhysicalDeviceToEnergyConsumer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET = eINSTANCE.getPhysicalDeviceToEnergyConsumer_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.PositionPointToPositionPointImpl <em>Position Point To Position Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.PositionPointToPositionPointImpl
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getPositionPointToPositionPoint()
		 * @generated
		 */
		EClass POSITION_POINT_TO_POSITION_POINT = eINSTANCE.getPositionPointToPositionPoint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_POINT_TO_POSITION_POINT__SOURCE = eINSTANCE.getPositionPointToPositionPoint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_POINT_TO_POSITION_POINT__TARGET = eINSTANCE.getPositionPointToPositionPoint_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task1.impl.MeterAssetToEnergyConsumerImpl <em>Meter Asset To Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.MeterAssetToEnergyConsumerImpl
		 * @see rgse.ttc17.emoflon.tgg.task1.impl.Task1PackageImpl#getMeterAssetToEnergyConsumer()
		 * @generated
		 */
		EClass METER_ASSET_TO_ENERGY_CONSUMER = eINSTANCE.getMeterAssetToEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_ENERGY_CONSUMER__SOURCE = eINSTANCE.getMeterAssetToEnergyConsumer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_ENERGY_CONSUMER__TARGET = eINSTANCE.getMeterAssetToEnergyConsumer_Target();

	}

} //Task1Package
