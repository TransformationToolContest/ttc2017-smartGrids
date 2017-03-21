/**
 */
package CIM.IEC61970.ControlArea;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.LoadModel.EnergyArea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.' Profile\040documentation='A <b>control area </b>is a grouping of <b>generating units</b> and/or loads and a cutset of tie lines (as <b>terminals</b>) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.'"
 * @generated
 */
public interface ControlArea extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.ControlArea.ControlAreaTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CIM.IEC61970.ControlArea.ControlAreaTypeKind
	 * @see #setType(ControlAreaTypeKind)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea_Type()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of control area defintion used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of control area defintion used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.'"
	 * @generated
	 */
	ControlAreaTypeKind getType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CIM.IEC61970.ControlArea.ControlAreaTypeKind
	 * @see #getType()
	 * @generated
	 */
	void setType(ControlAreaTypeKind value);

	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea_ControlAreaGeneratingUnit()
	 * @see CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea
	 * @model opposite="ControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The generating unit specificaitons for the control area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The generating unit specificaitons for the control area.'"
	 * @generated
	 */
	EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit();

	/**
	 * Returns the value of the '<em><b>Energy Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.LoadModel.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Area</em>' reference.
	 * @see #setEnergyArea(EnergyArea)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea_EnergyArea()
	 * @see CIM.IEC61970.LoadModel.EnergyArea#getControlArea
	 * @model opposite="ControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The energy area that is forecast from this control area specification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The energy area that is forecast from this control area specification.'"
	 * @generated
	 */
	EnergyArea getEnergyArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Area</em>' reference.
	 * @see #getEnergyArea()
	 * @generated
	 */
	void setEnergyArea(EnergyArea value);

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.ControlArea.TieFlow}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference list.
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea_TieFlow()
	 * @see CIM.IEC61970.ControlArea.TieFlow#getControlArea
	 * @model opposite="ControlArea"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tie flows associated with the control area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tie flows associated with the control area.'"
	 * @generated
	 */
	EList<TieFlow> getTieFlow();

	/**
	 * Returns the value of the '<em><b>PTolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTolerance</em>' attribute.
	 * @see #setPTolerance(float)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea_PTolerance()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power net interchange tolerance'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power net interchange tolerance'"
	 * @generated
	 */
	float getPTolerance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTolerance</em>' attribute.
	 * @see #getPTolerance()
	 * @generated
	 */
	void setPTolerance(float value);

	/**
	 * Returns the value of the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Interchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Interchange</em>' attribute.
	 * @see #setNetInterchange(float)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getControlArea_NetInterchange()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The specified positive net interchange into the control area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The specified positive net interchange into the control area.'"
	 * @generated
	 */
	float getNetInterchange();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Interchange</em>' attribute.
	 * @see #getNetInterchange()
	 * @generated
	 */
	void setNetInterchange(float value);

} // ControlArea
