/**
 */
package CIM.IEC61970.Equivalents;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentInjection()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the local connectivity node.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the local connectivity node.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the local connectivity node.' Profile\040documentation='This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the local connectivity node.'"
 * @generated
 */
public interface EquivalentInjection extends EquivalentEquipment {
	/**
	 * Returns the value of the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Status</em>' attribute.
	 * @see #setRegulationStatus(boolean)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentInjection_RegulationStatus()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the default regulation status of the EquivalentInjection.  True is regulating.  False is not regulating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the default regulation status of the EquivalentInjection.  True is regulating.  False is not regulating.'"
	 * @generated
	 */
	boolean isRegulationStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Status</em>' attribute.
	 * @see #isRegulationStatus()
	 * @generated
	 */
	void setRegulationStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Regulation Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Capability</em>' attribute.
	 * @see #setRegulationCapability(boolean)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentInjection_RegulationCapability()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies whether or not the EquivalentInjection has the capability to regulate the local voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies whether or not the EquivalentInjection has the capability to regulate the local voltage.'"
	 * @generated
	 */
	boolean isRegulationCapability();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Capability</em>' attribute.
	 * @see #isRegulationCapability()
	 * @generated
	 */
	void setRegulationCapability(boolean value);

	/**
	 * Returns the value of the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min P</em>' attribute.
	 * @see #setMinP(float)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentInjection_MinP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum active power of the injection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum active power of the injection.'"
	 * @generated
	 */
	float getMinP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #getMinP()
	 * @generated
	 */
	void setMinP(float value);

	/**
	 * Returns the value of the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max P</em>' attribute.
	 * @see #setMaxP(float)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentInjection_MaxP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum active power of the injection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum active power of the injection.'"
	 * @generated
	 */
	float getMaxP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #getMaxP()
	 * @generated
	 */
	void setMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Regulation Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Target</em>' attribute.
	 * @see #setRegulationTarget(float)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentInjection_RegulationTarget()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The target voltage for voltage regulation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The target voltage for voltage regulation.'"
	 * @generated
	 */
	float getRegulationTarget();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Target</em>' attribute.
	 * @see #getRegulationTarget()
	 * @generated
	 */
	void setRegulationTarget(float value);

} // EquivalentInjection
