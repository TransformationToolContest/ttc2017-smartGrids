/**
 */
package outageDetectionJointarget;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see outageDetectionJointarget.OutageDetectionJointargetFactory
 * @model kind="package"
 * @generated
 */
public interface OutageDetectionJointargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "outageDetectionJointarget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/ConsumerReachabilityView";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "outageDtJt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutageDetectionJointargetPackage eINSTANCE = outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link outageDetectionJointarget.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outageDetectionJointarget.impl.EnergyConsumerImpl
	 * @see outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Reachability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__REACHABILITY = 1;

	/**
	 * The feature id for the '<em><b>Power A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__POWER_A = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__ID = 3;

	/**
	 * The feature id for the '<em><b>Control Area ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__CONTROL_AREA_ID = 4;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outageDetectionJointarget.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outageDetectionJointarget.impl.LocationImpl
	 * @see outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSITION = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outageDetectionJointarget.impl.PositionPointImpl <em>Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outageDetectionJointarget.impl.PositionPointImpl
	 * @see outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl#getPositionPoint()
	 * @generated
	 */
	int POSITION_POINT = 2;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__ZPOSITION = 2;

	/**
	 * The number of structural features of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link outageDetectionJointarget.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see outageDetectionJointarget.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionJointarget.EnergyConsumer#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see outageDetectionJointarget.EnergyConsumer#getLocation()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumer_Location();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.EnergyConsumer#getReachability <em>Reachability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reachability</em>'.
	 * @see outageDetectionJointarget.EnergyConsumer#getReachability()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_Reachability();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.EnergyConsumer#getPowerA <em>Power A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power A</em>'.
	 * @see outageDetectionJointarget.EnergyConsumer#getPowerA()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_PowerA();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.EnergyConsumer#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see outageDetectionJointarget.EnergyConsumer#getID()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_ID();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.EnergyConsumer#getControlAreaID <em>Control Area ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Area ID</em>'.
	 * @see outageDetectionJointarget.EnergyConsumer#getControlAreaID()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_ControlAreaID();

	/**
	 * Returns the meta object for class '{@link outageDetectionJointarget.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see outageDetectionJointarget.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference '{@link outageDetectionJointarget.Location#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see outageDetectionJointarget.Location#getPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Position();

	/**
	 * Returns the meta object for class '{@link outageDetectionJointarget.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point</em>'.
	 * @see outageDetectionJointarget.PositionPoint
	 * @generated
	 */
	EClass getPositionPoint();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.PositionPoint#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see outageDetectionJointarget.PositionPoint#getXPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.PositionPoint#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see outageDetectionJointarget.PositionPoint#getYPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link outageDetectionJointarget.PositionPoint#getZPosition <em>ZPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZPosition</em>'.
	 * @see outageDetectionJointarget.PositionPoint#getZPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_ZPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OutageDetectionJointargetFactory getOutageDetectionJointargetFactory();

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
		 * The meta object literal for the '{@link outageDetectionJointarget.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outageDetectionJointarget.impl.EnergyConsumerImpl
		 * @see outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl#getEnergyConsumer()
		 * @generated
		 */
		EClass ENERGY_CONSUMER = eINSTANCE.getEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER__LOCATION = eINSTANCE.getEnergyConsumer_Location();

		/**
		 * The meta object literal for the '<em><b>Reachability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__REACHABILITY = eINSTANCE.getEnergyConsumer_Reachability();

		/**
		 * The meta object literal for the '<em><b>Power A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__POWER_A = eINSTANCE.getEnergyConsumer_PowerA();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__ID = eINSTANCE.getEnergyConsumer_ID();

		/**
		 * The meta object literal for the '<em><b>Control Area ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__CONTROL_AREA_ID = eINSTANCE.getEnergyConsumer_ControlAreaID();

		/**
		 * The meta object literal for the '{@link outageDetectionJointarget.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outageDetectionJointarget.impl.LocationImpl
		 * @see outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__POSITION = eINSTANCE.getLocation_Position();

		/**
		 * The meta object literal for the '{@link outageDetectionJointarget.impl.PositionPointImpl <em>Position Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outageDetectionJointarget.impl.PositionPointImpl
		 * @see outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl#getPositionPoint()
		 * @generated
		 */
		EClass POSITION_POINT = eINSTANCE.getPositionPoint();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__XPOSITION = eINSTANCE.getPositionPoint_XPosition();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__YPOSITION = eINSTANCE.getPositionPoint_YPosition();

		/**
		 * The meta object literal for the '<em><b>ZPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__ZPOSITION = eINSTANCE.getPositionPoint_ZPosition();

	}

} //OutageDetectionJointargetPackage
