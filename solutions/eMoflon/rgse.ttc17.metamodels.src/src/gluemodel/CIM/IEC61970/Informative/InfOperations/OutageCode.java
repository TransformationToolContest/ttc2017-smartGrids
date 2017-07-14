/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords <em>Outage Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps <em>Outage Steps</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageCode()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Classification of outage types. Multiple outage codes may apply to a given outage or outage step.The primary overall outage type is recorded in OutageRecord.outageType. There may be more than one classification per outage step and/or per outage record.\nExample codes/subcodes include: weather/ice, weather/lightning, wildlife/squirrel, wildlife/bird, burned/overload, burned/weather, wire down/accident, wire down/tree, wire down/vandalism, etc.\nThe typical \"outage code\" is in the inherited \"name\" attribute. The code is described in the inherited \"description\" attribute.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Classification of outage types. Multiple outage codes may apply to a given outage or outage step.The primary overall outage type is recorded in OutageRecord.outageType. There may be more than one classification per outage step and/or per outage record.\nExample codes/subcodes include: weather/ice, weather/lightning, wildlife/squirrel, wildlife/bird, burned/overload, burned/weather, wire down/accident, wire down/tree, wire down/vandalism, etc.\nThe typical \"outage code\" is in the inherited \"name\" attribute. The code is described in the inherited \"description\" attribute.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Classification of outage types. Multiple outage codes may apply to a given outage or outage step.The primary overall outage type is recorded in OutageRecord.outageType. There may be more than one classification per outage step and/or per outage record.\nExample codes/subcodes include: weather/ice, weather/lightning, wildlife/squirrel, wildlife/bird, burned/overload, burned/weather, wire down/accident, wire down/tree, wire down/vandalism, etc.\nThe typical \"outage code\" is in the inherited \"name\" attribute. The code is described in the inherited \"description\" attribute.' Profile\040documentation='Classification of outage types. Multiple outage codes may apply to a given outage or outage step.The primary overall outage type is recorded in OutageRecord.outageType. There may be more than one classification per outage step and/or per outage record.\nExample codes/subcodes include: weather/ice, weather/lightning, wildlife/squirrel, wildlife/bird, burned/overload, burned/weather, wire down/accident, wire down/tree, wire down/vandalism, etc.\nThe typical \"outage code\" is in the inherited \"name\" attribute. The code is described in the inherited \"description\" attribute.'"
 * @generated
 */
public interface OutageCode extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Code</em>' attribute.
	 * @see #setSubCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageCode_SubCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The main code is stored in the inherited .name. This sub-code provides an additional level of classification detail.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The main code is stored in the inherited .name. This sub-code provides an additional level of classification detail.'"
	 * @generated
	 */
	String getSubCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Code</em>' attribute.
	 * @see #getSubCode()
	 * @generated
	 */
	void setSubCode(String value);

	/**
	 * Returns the value of the '<em><b>Outage Records</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Records</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageCode_OutageRecords()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes
	 * @model opposite="OutageCodes"
	 * @generated
	 */
	EList<OutageRecord> getOutageRecords();

	/**
	 * Returns the value of the '<em><b>Outage Steps</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Steps</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageCode_OutageSteps()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes
	 * @model opposite="OutageCodes"
	 * @generated
	 */
	EList<OutageStep> getOutageSteps();

} // OutageCode
