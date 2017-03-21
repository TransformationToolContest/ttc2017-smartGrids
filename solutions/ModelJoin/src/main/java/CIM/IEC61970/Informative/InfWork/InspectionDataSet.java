/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;

import CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInspectionDataSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documents the result of one inspection, a type of Procedure, for a given attribute of an asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documents the result of one inspection, a type of Procedure, for a given attribute of an asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documents the result of one inspection, a type of Procedure, for a given attribute of an asset.' Profile\040documentation='Documents the result of one inspection, a type of Procedure, for a given attribute of an asset.'"
 * @generated
 */
public interface InspectionDataSet extends ProcedureDataSet {
	/**
	 * Returns the value of the '<em><b>Location Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Condition</em>' attribute.
	 * @see #setLocationCondition(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInspectionDataSet_LocationCondition()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of the conditions of the location where the asset resides.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of the conditions of the location where the asset resides.'"
	 * @generated
	 */
	String getLocationCondition();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Condition</em>' attribute.
	 * @see #getLocationCondition()
	 * @generated
	 */
	void setLocationCondition(String value);

	/**
	 * Returns the value of the '<em><b>According To Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet <em>For Inspection Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>According To Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>According To Schedules</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInspectionDataSet_AccordingToSchedules()
	 * @see CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet
	 * @model opposite="ForInspectionDataSet"
	 * @generated
	 */
	EList<ScheduleParameterInfo> getAccordingToSchedules();

} // InspectionDataSet
