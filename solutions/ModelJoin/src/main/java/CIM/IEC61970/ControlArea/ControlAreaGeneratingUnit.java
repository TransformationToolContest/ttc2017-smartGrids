/**
 */
package CIM.IEC61970.ControlArea;

import CIM.Element;

import CIM.IEC61970.Generation.Production.GeneratingUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlAreaGeneratingUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.' Profile\040documentation='A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.'"
 * @generated
 */
public interface ControlAreaGeneratingUnit extends Element {
	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlAreaGeneratingUnit_ControlArea()
	 * @see CIM.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit
	 * @model opposite="ControlAreaGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The parent control area for the generating unit specifications.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The parent control area for the generating unit specifications.'"
	 * @generated
	 */
	ControlArea getControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	void setControlArea(ControlArea value);

	/**
	 * Returns the value of the '<em><b>Alt Generating Unit Meas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Generating Unit Meas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Generating Unit Meas</em>' reference list.
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlAreaGeneratingUnit_AltGeneratingUnitMeas()
	 * @see CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit
	 * @model opposite="ControlAreaGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The link to prioritized measurements for this GeneratingUnit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The link to prioritized measurements for this GeneratingUnit.'"
	 * @generated
	 */
	EList<AltGeneratingUnitMeas> getAltGeneratingUnitMeas();

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlAreaGeneratingUnit_GeneratingUnit()
	 * @see CIM.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit
	 * @model opposite="ControlAreaGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The generating unit specified for this control area.  Note that a control area should include a GeneratingUnit only once.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The generating unit specified for this control area.  Note that a control area should include a GeneratingUnit only once.'"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

} // ControlAreaGeneratingUnit
