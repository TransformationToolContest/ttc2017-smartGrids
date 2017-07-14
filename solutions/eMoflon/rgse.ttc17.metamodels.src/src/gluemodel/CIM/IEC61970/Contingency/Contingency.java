/**
 */
package gluemodel.CIM.IEC61970.Contingency;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contingency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.Contingency#getContingencyConstraintLimit <em>Contingency Constraint Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.Contingency#getContingencyElement <em>Contingency Element</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Contingency.ContingencyPackage#getContingency()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An event threatening system reliability, consisting of one or more contingency elements.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An event threatening system reliability, consisting of one or more contingency elements.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An event threatening system reliability, consisting of one or more contingency elements.' Profile\040documentation='An event threatening system reliability, consisting of one or more contingency elements.'"
 * @generated
 */
public interface Contingency extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Contingency Constraint Limit</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency Constraint Limit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency Constraint Limit</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Contingency.ContingencyPackage#getContingency_ContingencyConstraintLimit()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit#getContingency
	 * @model opposite="Contingency"
	 * @generated
	 */
	EList<ContingencyConstraintLimit> getContingencyConstraintLimit();

	/**
	 * Returns the value of the '<em><b>Must Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Study</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Study</em>' attribute.
	 * @see #setMustStudy(boolean)
	 * @see gluemodel.CIM.IEC61970.Contingency.ContingencyPackage#getContingency_MustStudy()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set true if must study this contingency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set true if must study this contingency.'"
	 * @generated
	 */
	boolean isMustStudy();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Study</em>' attribute.
	 * @see #isMustStudy()
	 * @generated
	 */
	void setMustStudy(boolean value);

	/**
	 * Returns the value of the '<em><b>Contingency Element</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Contingency.ContingencyElement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency Element</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Contingency.ContingencyPackage#getContingency_ContingencyElement()
	 * @see gluemodel.CIM.IEC61970.Contingency.ContingencyElement#getContingency
	 * @model opposite="Contingency"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A contingency can have any number of contingency elements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A contingency can have any number of contingency elements.'"
	 * @generated
	 */
	EList<ContingencyElement> getContingencyElement();

} // Contingency
