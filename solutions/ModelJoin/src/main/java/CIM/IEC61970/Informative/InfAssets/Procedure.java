/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61970.Informative.InfWork.CompatibleUnit;

import CIM.IEC61970.Meas.Limit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getLimits <em>Limits</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getProcedureValues <em>Procedure Values</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.Procedure#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A documented procedure for various types of Work or Work Tasks. One or more procedures guide a compatible unit, a standard way of performing a unit of work. The type of procedure is defined in Procedure.type. For example, when type=Inspection, this procedure coupled with Schedule and other information provides the key items of an inspection plan. Another type of Procedure is a Diagnosis. Note that each specific values and settings to be used in a procedure is intended to be described in an instance of ProcedureValue.\nA maintenance ticket, a type of Work, is generated whenever maintenance is determined to be needed as a result of an inspection or diagnosis.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A documented procedure for various types of Work or Work Tasks. One or more procedures guide a compatible unit, a standard way of performing a unit of work. The type of procedure is defined in Procedure.type. For example, when type=Inspection, this procedure coupled with Schedule and other information provides the key items of an inspection plan. Another type of Procedure is a Diagnosis. Note that each specific values and settings to be used in a procedure is intended to be described in an instance of ProcedureValue.\nA maintenance ticket, a type of Work, is generated whenever maintenance is determined to be needed as a result of an inspection or diagnosis.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A documented procedure for various types of Work or Work Tasks. One or more procedures guide a compatible unit, a standard way of performing a unit of work. The type of procedure is defined in Procedure.type. For example, when type=Inspection, this procedure coupled with Schedule and other information provides the key items of an inspection plan. Another type of Procedure is a Diagnosis. Note that each specific values and settings to be used in a procedure is intended to be described in an instance of ProcedureValue.\nA maintenance ticket, a type of Work, is generated whenever maintenance is determined to be needed as a result of an inspection or diagnosis.' Profile\040documentation='A documented procedure for various types of Work or Work Tasks. One or more procedures guide a compatible unit, a standard way of performing a unit of work. The type of procedure is defined in Procedure.type. For example, when type=Inspection, this procedure coupled with Schedule and other information provides the key items of an inspection plan. Another type of Procedure is a Diagnosis. Note that each specific values and settings to be used in a procedure is intended to be described in an instance of ProcedureValue.\nA maintenance ticket, a type of Work, is generated whenever maintenance is determined to be needed as a result of an inspection or diagnosis.'"
 * @generated
 */
public interface Procedure extends Document {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.ProcedureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.ProcedureKind
	 * @see #setKind(ProcedureKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of this procedure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of this procedure.'"
	 * @generated
	 */
	ProcedureKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.Procedure#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.ProcedureKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ProcedureKind value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence number in a sequence of procedures being performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence number in a sequence of procedures being performed.'"
	 * @generated
	 */
	String getSequenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.Procedure#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Limit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Limit#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_Limits()
	 * @see CIM.IEC61970.Meas.Limit#getProcedures
	 * @model opposite="Procedures"
	 * @generated
	 */
	EList<Limit> getLimits();

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures
	 * @model opposite="Procedures"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_ProcedureDataSets()
	 * @see CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure
	 * @model opposite="Procedure"
	 * @generated
	 */
	EList<ProcedureDataSet> getProcedureDataSets();

	/**
	 * Returns the value of the '<em><b>Procedure Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Values</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_ProcedureValues()
	 * @see CIM.IEC61968.Common.UserAttribute#getProcedure
	 * @model opposite="Procedure"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='UserAttributes used to specify procedure values. An example is to have an instance for each of the following settings when conducting a test: voltage, current, frequency, temperature specified in \'name\' attribute, and the corresponding value and units in \'value\' attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='UserAttributes used to specify procedure values. An example is to have an instance for each of the following settings when conducting a test: voltage, current, frequency, temperature specified in \'name\' attribute, and the corresponding value and units in \'value\' attribute.'"
	 * @generated
	 */
	EList<UserAttribute> getProcedureValues();

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #setCorporateCode(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for this kind of procedure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for this kind of procedure.'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.Procedure#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see #setInstruction(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure_Instruction()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The textual description of the procedure, which references instances of ProcedureValue as appropriate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The textual description of the procedure, which references instances of ProcedureValue as appropriate.'"
	 * @generated
	 */
	String getInstruction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.Procedure#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(String value);

} // Procedure
