/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Reliability Margin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmType <em>Trm Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getFlowgate <em>Flowgate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getValueUnit <em>Value Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmValue <em>Trm Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransmissionReliabilityMargin()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transmission Reliability Margin (TRM) is defined as that amount of transmission transfer capability necessary to ensure that the interconnected transmission network is secure under a reasonable range of uncertainties in system conditions.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Transmission Reliability Margin (TRM) is defined as that amount of transmission transfer capability necessary to ensure that the interconnected transmission network is secure under a reasonable range of uncertainties in system conditions.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transmission Reliability Margin (TRM) is defined as that amount of transmission transfer capability necessary to ensure that the interconnected transmission network is secure under a reasonable range of uncertainties in system conditions.' Profile\040documentation='Transmission Reliability Margin (TRM) is defined as that amount of transmission transfer capability necessary to ensure that the interconnected transmission network is secure under a reasonable range of uncertainties in system conditions.'"
 * @generated
 */
public interface TransmissionReliabilityMargin extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Trm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trm Type</em>' attribute.
	 * @see #setTrmType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransmissionReliabilityMargin_TrmType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='the type of TRM'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='the type of TRM'"
	 * @generated
	 */
	String getTrmType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmType <em>Trm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trm Type</em>' attribute.
	 * @see #getTrmType()
	 * @generated
	 */
	void setTrmType(String value);

	/**
	 * Returns the value of the '<em><b>Flowgate</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionReliabilityMargin <em>Transmission Reliability Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowgate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowgate</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransmissionReliabilityMargin_Flowgate()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Flowgate#getTransmissionReliabilityMargin
	 * @model opposite="TransmissionReliabilityMargin"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A fowgate may have 0 to 1 TRM'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A fowgate may have 0 to 1 TRM'"
	 * @generated
	 */
	EList<Flowgate> getFlowgate();

	/**
	 * Returns the value of the '<em><b>Value Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Unit</em>' attribute.
	 * @see #setValueUnit(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransmissionReliabilityMargin_ValueUnit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='unit of the TRM value. Could be MW or Percentage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='unit of the TRM value. Could be MW or Percentage.'"
	 * @generated
	 */
	String getValueUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getValueUnit <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Unit</em>' attribute.
	 * @see #getValueUnit()
	 * @generated
	 */
	void setValueUnit(String value);

	/**
	 * Returns the value of the '<em><b>Trm Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trm Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trm Value</em>' attribute.
	 * @see #setTrmValue(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getTransmissionReliabilityMargin_TrmValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of the TRM'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of the TRM'"
	 * @generated
	 */
	float getTrmValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.TransmissionReliabilityMargin#getTrmValue <em>Trm Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trm Value</em>' attribute.
	 * @see #getTrmValue()
	 * @generated
	 */
	void setTrmValue(float value);

} // TransmissionReliabilityMargin
