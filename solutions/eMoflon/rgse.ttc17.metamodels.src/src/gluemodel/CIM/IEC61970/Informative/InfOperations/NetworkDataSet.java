/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCircuitSections <em>Circuit Sections</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getLandBases <em>Land Bases</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Categorized as a type of document, model of a portion of the electrical network that includes a list of the equipment, along with relevant connectivity, electrical characteristics, geographical location, and various parameters associated with the equipment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Categorized as a type of document, model of a portion of the electrical network that includes a list of the equipment, along with relevant connectivity, electrical characteristics, geographical location, and various parameters associated with the equipment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Categorized as a type of document, model of a portion of the electrical network that includes a list of the equipment, along with relevant connectivity, electrical characteristics, geographical location, and various parameters associated with the equipment.' Profile\040documentation='Categorized as a type of document, model of a portion of the electrical network that includes a list of the equipment, along with relevant connectivity, electrical characteristics, geographical location, and various parameters associated with the equipment.'"
 * @generated
 */
public interface NetworkDataSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Circuit Sections</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Sections</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_CircuitSections()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CircuitSection#getNetworkDataSets
	 * @model opposite="NetworkDataSets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A NetworkDataSet may contain sections of circuits (vs. whole circuits).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A NetworkDataSet may contain sections of circuits (vs. whole circuits).'"
	 * @generated
	 */
	EList<CircuitSection> getCircuitSections();

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_ChangeItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet
	 * @model opposite="NetworkDataSet"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

	/**
	 * Returns the value of the '<em><b>Change Sets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Sets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_ChangeSets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets
	 * @model opposite="NetworkDataSets"
	 * @generated
	 */
	EList<ChangeSet> getChangeSets();

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.PowerSystemResource#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_PowerSystemResources()
	 * @see gluemodel.CIM.IEC61970.Core.PowerSystemResource#getNetworkDataSets
	 * @model opposite="NetworkDataSets"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Land Bases</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.LandBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Bases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Bases</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_LandBases()
	 * @model
	 * @generated
	 */
	EList<LandBase> getLandBases();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Document#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_Documents()
	 * @see gluemodel.CIM.IEC61968.Common.Document#getNetworkDataSets
	 * @model opposite="NetworkDataSets"
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of network data set.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of network data set.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // NetworkDataSet
