/**
 */
package CIM.IEC61970.LoadModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.LoadModel.LoadModelPackage
 * @generated
 */
public interface LoadModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoadModelFactory eINSTANCE = CIM.IEC61970.LoadModel.impl.LoadModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conform Load Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conform Load Schedule</em>'.
	 * @generated
	 */
	ConformLoadSchedule createConformLoadSchedule();

	/**
	 * Returns a new object of class '<em>Non Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Conform Load Group</em>'.
	 * @generated
	 */
	NonConformLoadGroup createNonConformLoadGroup();

	/**
	 * Returns a new object of class '<em>Non Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Conform Load</em>'.
	 * @generated
	 */
	NonConformLoad createNonConformLoad();

	/**
	 * Returns a new object of class '<em>Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day Type</em>'.
	 * @generated
	 */
	DayType createDayType();

	/**
	 * Returns a new object of class '<em>Sub Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Load Area</em>'.
	 * @generated
	 */
	SubLoadArea createSubLoadArea();

	/**
	 * Returns a new object of class '<em>Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conform Load Group</em>'.
	 * @generated
	 */
	ConformLoadGroup createConformLoadGroup();

	/**
	 * Returns a new object of class '<em>Station Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Supply</em>'.
	 * @generated
	 */
	StationSupply createStationSupply();

	/**
	 * Returns a new object of class '<em>Season Day Type Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Season Day Type Schedule</em>'.
	 * @generated
	 */
	SeasonDayTypeSchedule createSeasonDayTypeSchedule();

	/**
	 * Returns a new object of class '<em>Non Conform Load Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Conform Load Schedule</em>'.
	 * @generated
	 */
	NonConformLoadSchedule createNonConformLoadSchedule();

	/**
	 * Returns a new object of class '<em>Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Area</em>'.
	 * @generated
	 */
	LoadArea createLoadArea();

	/**
	 * Returns a new object of class '<em>Energy Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Area</em>'.
	 * @generated
	 */
	EnergyArea createEnergyArea();

	/**
	 * Returns a new object of class '<em>Load Response Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Response Characteristic</em>'.
	 * @generated
	 */
	LoadResponseCharacteristic createLoadResponseCharacteristic();

	/**
	 * Returns a new object of class '<em>Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Group</em>'.
	 * @generated
	 */
	LoadGroup createLoadGroup();

	/**
	 * Returns a new object of class '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Season</em>'.
	 * @generated
	 */
	Season createSeason();

	/**
	 * Returns a new object of class '<em>Power Cut Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Cut Zone</em>'.
	 * @generated
	 */
	PowerCutZone createPowerCutZone();

	/**
	 * Returns a new object of class '<em>Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conform Load</em>'.
	 * @generated
	 */
	ConformLoad createConformLoad();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoadModelPackage getLoadModelPackage();

} //LoadModelFactory
