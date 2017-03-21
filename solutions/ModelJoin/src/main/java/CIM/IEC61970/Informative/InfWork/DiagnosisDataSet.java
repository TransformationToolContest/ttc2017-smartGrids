/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61970.Core.PhaseCode;

import CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnosis Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The result of a problem (typically an asset failure) diagnosis.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The result of a problem (typically an asset failure) diagnosis.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The result of a problem (typically an asset failure) diagnosis.' Profile\040documentation='The result of a problem (typically an asset failure) diagnosis.'"
 * @generated
 */
public interface DiagnosisDataSet extends ProcedureDataSet {
	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see CIM.IEC61970.Core.PhaseCode
	 * @see #setPhaseCode(PhaseCode)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_PhaseCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase(s) diagnosed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase(s) diagnosed.'"
	 * @generated
	 */
	PhaseCode getPhaseCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see CIM.IEC61970.Core.PhaseCode
	 * @see #getPhaseCode()
	 * @generated
	 */
	void setPhaseCode(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>Final Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Code</em>' attribute.
	 * @see #setFinalCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_FinalCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for diagnosed probem category.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for diagnosed probem category.'"
	 * @generated
	 */
	String getFinalCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Code</em>' attribute.
	 * @see #getFinalCode()
	 * @generated
	 */
	void setFinalCode(String value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_Effect()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Effect of problem.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Effect of problem.'"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode</em>' attribute.
	 * @see #setFailureMode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_FailureMode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Failuer mode, for example: Failure to Insulate; Failure to conduct; Failure to contain oil; Failure to provide ground plane; Other.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Failuer mode, for example: Failure to Insulate; Failure to conduct; Failure to contain oil; Failure to provide ground plane; Other.'"
	 * @generated
	 */
	String getFailureMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode</em>' attribute.
	 * @see #getFailureMode()
	 * @generated
	 */
	void setFailureMode(String value);

	/**
	 * Returns the value of the '<em><b>Root Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Origin</em>' attribute.
	 * @see #setRootOrigin(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_RootOrigin()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Root origin of problem determined during diagnosis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Root origin of problem determined during diagnosis.'"
	 * @generated
	 */
	String getRootOrigin();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Origin</em>' attribute.
	 * @see #getRootOrigin()
	 * @generated
	 */
	void setRootOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Final Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Cause</em>' attribute.
	 * @see #setFinalCause(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_FinalCause()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cause of problem determined during diagnosis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cause of problem determined during diagnosis.'"
	 * @generated
	 */
	String getFinalCause();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Cause</em>' attribute.
	 * @see #getFinalCause()
	 * @generated
	 */
	void setFinalCause(String value);

	/**
	 * Returns the value of the '<em><b>Root Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Remark</em>' attribute.
	 * @see #setRootRemark(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_RootRemark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks pertaining to root cause findings during problem diagnosis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks pertaining to root cause findings during problem diagnosis.'"
	 * @generated
	 */
	String getRootRemark();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Remark</em>' attribute.
	 * @see #getRootRemark()
	 * @generated
	 */
	void setRootRemark(String value);

	/**
	 * Returns the value of the '<em><b>Root Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Cause</em>' attribute.
	 * @see #setRootCause(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_RootCause()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Root cause of problem determined during diagnosis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Root cause of problem determined during diagnosis.'"
	 * @generated
	 */
	String getRootCause();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Cause</em>' attribute.
	 * @see #getRootCause()
	 * @generated
	 */
	void setRootCause(String value);

	/**
	 * Returns the value of the '<em><b>Preliminary Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Remark</em>' attribute.
	 * @see #setPreliminaryRemark(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_PreliminaryRemark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks pertaining to preliminary assessment of problem.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks pertaining to preliminary assessment of problem.'"
	 * @generated
	 */
	String getPreliminaryRemark();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Remark</em>' attribute.
	 * @see #getPreliminaryRemark()
	 * @generated
	 */
	void setPreliminaryRemark(String value);

	/**
	 * Returns the value of the '<em><b>Preliminary Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Code</em>' attribute.
	 * @see #setPreliminaryCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_PreliminaryCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for problem category determined during preliminary assessment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for problem category determined during preliminary assessment.'"
	 * @generated
	 */
	String getPreliminaryCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Code</em>' attribute.
	 * @see #getPreliminaryCode()
	 * @generated
	 */
	void setPreliminaryCode(String value);

	/**
	 * Returns the value of the '<em><b>Preliminary Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Date Time</em>' attribute.
	 * @see #setPreliminaryDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_PreliminaryDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time preliminary assessment of problem was performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time preliminary assessment of problem was performed.'"
	 * @generated
	 */
	Date getPreliminaryDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Date Time</em>' attribute.
	 * @see #getPreliminaryDateTime()
	 * @generated
	 */
	void setPreliminaryDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Final Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Remark</em>' attribute.
	 * @see #setFinalRemark(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_FinalRemark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks pertaining to findings during problem diagnosis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks pertaining to findings during problem diagnosis.'"
	 * @generated
	 */
	String getFinalRemark();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Remark</em>' attribute.
	 * @see #getFinalRemark()
	 * @generated
	 */
	void setFinalRemark(String value);

	/**
	 * Returns the value of the '<em><b>Final Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Origin</em>' attribute.
	 * @see #setFinalOrigin(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet_FinalOrigin()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Origin of problem determined during diagnosis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Origin of problem determined during diagnosis.'"
	 * @generated
	 */
	String getFinalOrigin();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Origin</em>' attribute.
	 * @see #getFinalOrigin()
	 * @generated
	 */
	void setFinalOrigin(String value);

} // DiagnosisDataSet
