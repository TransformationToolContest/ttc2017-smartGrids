/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Cycle Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCombinedCyclePlant()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A set of combustion turbines and steam turbines where the exhaust heat from the combustion turbines is recovered to make steam for the steam turbines, resulting in greater overall plant efficiency'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A set of combustion turbines and steam turbines where the exhaust heat from the combustion turbines is recovered to make steam for the steam turbines, resulting in greater overall plant efficiency'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A set of combustion turbines and steam turbines where the exhaust heat from the combustion turbines is recovered to make steam for the steam turbines, resulting in greater overall plant efficiency' Profile\040documentation='A set of combustion turbines and steam turbines where the exhaust heat from the combustion turbines is recovered to make steam for the steam turbines, resulting in greater overall plant efficiency'"
 * @generated
 */
public interface CombinedCyclePlant extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Comb Cycle Plant Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comb Cycle Plant Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comb Cycle Plant Rating</em>' attribute.
	 * @see #setCombCyclePlantRating(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCombinedCyclePlant_CombCyclePlantRating()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The combined cycle plant\'s active power output rating'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The combined cycle plant\'s active power output rating'"
	 * @generated
	 */
	float getCombCyclePlantRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comb Cycle Plant Rating</em>' attribute.
	 * @see #getCombCyclePlantRating()
	 * @generated
	 */
	void setCombCyclePlantRating(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Units</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getCombinedCyclePlant_ThermalGeneratingUnits()
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant
	 * @model opposite="CombinedCyclePlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may be a member of a combined cycle plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may be a member of a combined cycle plant'"
	 * @generated
	 */
	EList<ThermalGeneratingUnit> getThermalGeneratingUnits();

} // CombinedCyclePlant
