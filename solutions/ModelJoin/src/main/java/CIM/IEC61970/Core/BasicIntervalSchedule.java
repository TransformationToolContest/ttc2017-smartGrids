/**
 */
package CIM.IEC61970.Core;

import CIM.IEC61970.Domain.UnitMultiplier;
import CIM.IEC61970.Domain.UnitSymbol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Core.CorePackage#getBasicIntervalSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Schedule of values at points in time.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Schedule of values at points in time.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedule of values at points in time.' Profile\040documentation='Schedule of values at points in time.'"
 * @generated
 */
public interface BasicIntervalSchedule extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2 Multiplier</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setValue2Multiplier(UnitMultiplier)
	 * @see CIM.IEC61970.Core.CorePackage#getBasicIntervalSchedule_Value2Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for value2.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for value2.'"
	 * @generated
	 */
	UnitMultiplier getValue2Multiplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2 Multiplier</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getValue2Multiplier()
	 * @generated
	 */
	void setValue2Multiplier(UnitMultiplier value);

	/**
	 * Returns the value of the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1 Multiplier</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitMultiplier
	 * @see #setValue1Multiplier(UnitMultiplier)
	 * @see CIM.IEC61970.Core.CorePackage#getBasicIntervalSchedule_Value1Multiplier()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiplier for value1.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiplier for value1.'"
	 * @generated
	 */
	UnitMultiplier getValue1Multiplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1 Multiplier</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitMultiplier
	 * @see #getValue1Multiplier()
	 * @generated
	 */
	void setValue1Multiplier(UnitMultiplier value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see CIM.IEC61970.Core.CorePackage#getBasicIntervalSchedule_StartTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time for the first time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time for the first time point.'"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Value2 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2 Unit</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitSymbol
	 * @see #setValue2Unit(UnitSymbol)
	 * @see CIM.IEC61970.Core.CorePackage#getBasicIntervalSchedule_Value2Unit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value2 units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value2 units of measure.'"
	 * @generated
	 */
	UnitSymbol getValue2Unit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2 Unit</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitSymbol
	 * @see #getValue2Unit()
	 * @generated
	 */
	void setValue2Unit(UnitSymbol value);

	/**
	 * Returns the value of the '<em><b>Value1 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1 Unit</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitSymbol
	 * @see #setValue1Unit(UnitSymbol)
	 * @see CIM.IEC61970.Core.CorePackage#getBasicIntervalSchedule_Value1Unit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value1 units of measure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value1 units of measure.'"
	 * @generated
	 */
	UnitSymbol getValue1Unit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1 Unit</em>' attribute.
	 * @see CIM.IEC61970.Domain.UnitSymbol
	 * @see #getValue1Unit()
	 * @generated
	 */
	void setValue1Unit(UnitSymbol value);

} // BasicIntervalSchedule
