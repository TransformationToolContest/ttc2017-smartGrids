/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61970.Meas.MeasurementValue;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties <em>Properties</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A data set recorded each time a procedure is executed. Observed results are captured in associated measurement values and/or values for properties relevant to the type of procedure performed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A data set recorded each time a procedure is executed. Observed results are captured in associated measurement values and/or values for properties relevant to the type of procedure performed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A data set recorded each time a procedure is executed. Observed results are captured in associated measurement values and/or values for properties relevant to the type of procedure performed.' Profile\040documentation='A data set recorded each time a procedure is executed. Observed results are captured in associated measurement values and/or values for properties relevant to the type of procedure performed.'"
 * @generated
 */
public interface ProcedureDataSet extends Document {
	/**
	 * Returns the value of the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Date Time</em>' attribute.
	 * @see #setCompletedDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet_CompletedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time procedure was completed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time procedure was completed.'"
	 * @generated
	 */
	Date getCompletedDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Date Time</em>' attribute.
	 * @see #getCompletedDateTime()
	 * @generated
	 */
	void setCompletedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.MeasurementValue}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Values</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet_MeasurementValues()
	 * @see gluemodel.CIM.IEC61970.Meas.MeasurementValue#getProcedureDataSets
	 * @model opposite="ProcedureDataSets"
	 * @generated
	 */
	EList<MeasurementValue> getMeasurementValues();

	/**
	 * Returns the value of the '<em><b>Transformer Observations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet_TransformerObservations()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets
	 * @model opposite="ProcedureDataSets"
	 * @generated
	 */
	EList<TransformerObservation> getTransformerObservations();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet_Properties()
	 * @see gluemodel.CIM.IEC61968.Common.UserAttribute#getProcedureDataSets
	 * @model opposite="ProcedureDataSets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='UserAttributes used to specify further properties of this procedure data set. Use \'name\' to specify what kind of property it is, and \'value.value\' attribute for the actual value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='UserAttributes used to specify further properties of this procedure data set. Use \'name\' to specify what kind of property it is, and \'value.value\' attribute for the actual value.'"
	 * @generated
	 */
	EList<UserAttribute> getProperties();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(Procedure)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet_Procedure()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets
	 * @model opposite="ProcedureDataSets"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

} // ProcedureDataSet
