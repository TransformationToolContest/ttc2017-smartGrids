/**
 */
package CIM.IEC61970.Informative.InfAssets;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTestDataSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Test results, usually obtained by a lab or other independent organisation.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Test results, usually obtained by a lab or other independent organisation.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Test results, usually obtained by a lab or other independent organisation.' Profile\040documentation='Test results, usually obtained by a lab or other independent organisation.'"
 * @generated
 */
public interface TestDataSet extends ProcedureDataSet {
	/**
	 * Returns the value of the '<em><b>Specimen To Lab Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen To Lab Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen To Lab Date Time</em>' attribute.
	 * @see #setSpecimenToLabDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTestDataSet_SpecimenToLabDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time the specimen was received by the lab.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time the specimen was received by the lab.'"
	 * @generated
	 */
	Date getSpecimenToLabDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen To Lab Date Time</em>' attribute.
	 * @see #getSpecimenToLabDateTime()
	 * @generated
	 */
	void setSpecimenToLabDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Specimen ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen ID</em>' attribute.
	 * @see #setSpecimenID(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTestDataSet_SpecimenID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identifier of specimen used in inspection or test.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identifier of specimen used in inspection or test.'"
	 * @generated
	 */
	String getSpecimenID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen ID</em>' attribute.
	 * @see #getSpecimenID()
	 * @generated
	 */
	void setSpecimenID(String value);

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion</em>' attribute.
	 * @see #setConclusion(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTestDataSet_Conclusion()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conclusion drawn from test results.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conclusion drawn from test results.'"
	 * @generated
	 */
	String getConclusion();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' attribute.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(String value);

} // TestDataSet
