/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.IdentifiedObject;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Initial Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceStatus <em>Resource Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getTimeInStatus <em>Time In Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceMW <em>Resource MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumEnergy <em>Cum Energy</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumStatusChanges <em>Cum Status Changes</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resource status at the end of a given clearing period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Resource status at the end of a given clearing period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resource status at the end of a given clearing period.' Profile\040documentation='Resource status at the end of a given clearing period.'"
 * @generated
 */
public interface UnitInitialConditions extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Resource Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Status</em>' attribute.
	 * @see #setResourceStatus(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_ResourceStatus()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resource status at the end of previous clearing period:\n 0 - off-line\n 1 - on-line production\n 2 - in shutdown process\n 3 - in startup process'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resource status at the end of previous clearing period:\n 0 - off-line\n 1 - on-line production\n 2 - in shutdown process\n 3 - in startup process'"
	 * @generated
	 */
	int getResourceStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceStatus <em>Resource Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Status</em>' attribute.
	 * @see #getResourceStatus()
	 * @generated
	 */
	void setResourceStatus(int value);

	/**
	 * Returns the value of the '<em><b>Time In Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time In Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time In Status</em>' attribute.
	 * @see #setTimeInStatus(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_TimeInStatus()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time in market trading intervals the resource is in the state as of the end of the previous clearing period.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time in market trading intervals the resource is in the state as of the end of the previous clearing period.'"
	 * @generated
	 */
	float getTimeInStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getTimeInStatus <em>Time In Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time In Status</em>' attribute.
	 * @see #getTimeInStatus()
	 * @generated
	 */
	void setTimeInStatus(float value);

	/**
	 * Returns the value of the '<em><b>Resource MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource MW</em>' attribute.
	 * @see #setResourceMW(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_ResourceMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Resource MW output at the end of previous clearing period.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Resource MW output at the end of previous clearing period.'"
	 * @generated
	 */
	float getResourceMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getResourceMW <em>Resource MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource MW</em>' attribute.
	 * @see #getResourceMW()
	 * @generated
	 */
	void setResourceMW(float value);

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getUnitInitialConditions <em>Unit Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(RegisteredGenerator)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_GeneratingUnit()
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getUnitInitialConditions
	 * @model opposite="UnitInitialConditions"
	 * @generated
	 */
	RegisteredGenerator getGeneratingUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(RegisteredGenerator value);

	/**
	 * Returns the value of the '<em><b>Cum Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cum Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cum Energy</em>' attribute.
	 * @see #setCumEnergy(Object)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_CumEnergy()
	 * @model dataType="CIM.EnergyAsMWh" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cumulative energy production over trading period.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cumulative energy production over trading period.'"
	 * @generated
	 */
	Object getCumEnergy();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumEnergy <em>Cum Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cum Energy</em>' attribute.
	 * @see #getCumEnergy()
	 * @generated
	 */
	void setCumEnergy(Object value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_StatusDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time and date for resourceStatus'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time and date for resourceStatus'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cum Status Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cum Status Changes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cum Status Changes</em>' attribute.
	 * @see #setCumStatusChanges(int)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getUnitInitialConditions_CumStatusChanges()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cumulative number of status changes of the resource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cumulative number of status changes of the resource.'"
	 * @generated
	 */
	int getCumStatusChanges();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.UnitInitialConditions#getCumStatusChanges <em>Cum Status Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cum Status Changes</em>' attribute.
	 * @see #getCumStatusChanges()
	 * @generated
	 */
	void setCumStatusChanges(int value);

} // UnitInitialConditions
