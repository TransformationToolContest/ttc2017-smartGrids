/**
 */
package CIM.IEC61970.Informative.InfGMLSupport;

import CIM.Element;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues <em>Gml Values</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GML observation models the act of observing, often with a camera, a person or some form of instrument. An observation feature describes the \"metadata\" associated with an information capture event, together with a value for the result of the observation. The basic structures introduced in this class are intended to serve as the foundation for more comprehensive schemas for scientific, technical and engineering measurement schemas.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A GML observation models the act of observing, often with a camera, a person or some form of instrument. An observation feature describes the \"metadata\" associated with an information capture event, together with a value for the result of the observation. The basic structures introduced in this class are intended to serve as the foundation for more comprehensive schemas for scientific, technical and engineering measurement schemas.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GML observation models the act of observing, often with a camera, a person or some form of instrument. An observation feature describes the \"metadata\" associated with an information capture event, together with a value for the result of the observation. The basic structures introduced in this class are intended to serve as the foundation for more comprehensive schemas for scientific, technical and engineering measurement schemas.' Profile\040documentation='A GML observation models the act of observing, often with a camera, a person or some form of instrument. An observation feature describes the \"metadata\" associated with an information capture event, together with a value for the result of the observation. The basic structures introduced in this class are intended to serve as the foundation for more comprehensive schemas for scientific, technical and engineering measurement schemas.'"
 * @generated
 */
public interface GmlObservation extends Element {
	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins <em>Gml Observatins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_GmlDiagramObjects()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins
	 * @model opposite="GmlObservatins"
	 * @generated
	 */
	EList<GmlDiagramObject> getGmlDiagramObjects();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_Target()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains or points to the specimen, region or station which is the object of the observation'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains or points to the specimen, region or station which is the object of the observation'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_DateTime()
	 * @model required="true"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_ChangeItems()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation
	 * @model opposite="GmlObservation"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Result Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of</em>' attribute.
	 * @see #setResultOf(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_ResultOf()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates the result of the observation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates the result of the observation.'"
	 * @generated
	 */
	String getResultOf();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of</em>' attribute.
	 * @see #getResultOf()
	 * @generated
	 */
	void setResultOf(String value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' attribute.
	 * @see #setUsing(String)
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_Using()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contains or points to a description of a sensor, instrument or procedure used for the observation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contains or points to a description of a sensor, instrument or procedure used for the observation.'"
	 * @generated
	 */
	String getUsing();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' attribute.
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(String value);

	/**
	 * Returns the value of the '<em><b>Gml Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Values</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation_GmlValues()
	 * @see CIM.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation
	 * @model opposite="GmlObservation"
	 * @generated
	 */
	EList<GmlValue> getGmlValues();

} // GmlObservation
