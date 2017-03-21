/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.Document;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getLandBases <em>Land Bases</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getDocuments <em>Documents</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The updates required in a transaction for an existing data set are grouped into a single ChangeSet. In data sets (e.g., NetworkDataSet), each major step in the ChangeSet is described through a separate ChangeItem associated with the data set. Within each data set, each inidividual object change is described with a seperate ChangeItem associated with the object.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The updates required in a transaction for an existing data set are grouped into a single ChangeSet. In data sets (e.g., NetworkDataSet), each major step in the ChangeSet is described through a separate ChangeItem associated with the data set. Within each data set, each inidividual object change is described with a seperate ChangeItem associated with the object.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The updates required in a transaction for an existing data set are grouped into a single ChangeSet. In data sets (e.g., NetworkDataSet), each major step in the ChangeSet is described through a separate ChangeItem associated with the data set. Within each data set, each inidividual object change is described with a seperate ChangeItem associated with the object.' Profile\040documentation='The updates required in a transaction for an existing data set are grouped into a single ChangeSet. In data sets (e.g., NetworkDataSet), each major step in the ChangeSet is described through a separate ChangeItem associated with the data set. Within each data set, each inidividual object change is described with a seperate ChangeItem associated with the object.'"
 * @generated
 */
public interface ChangeSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet_ChangeItems()
	 * @see CIM.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet
	 * @model opposite="ChangeSet"
	 * @generated
	 */
	EList<ChangeItem> getChangeItems();

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
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ChangeSet#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Land Bases</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.LandBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Bases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Bases</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet_LandBases()
	 * @model
	 * @generated
	 */
	EList<LandBase> getLandBases();

	/**
	 * Returns the value of the '<em><b>Network Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Sets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet_NetworkDataSets()
	 * @see CIM.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets
	 * @model opposite="ChangeSets"
	 * @generated
	 */
	EList<NetworkDataSet> getNetworkDataSets();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Document#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet_Documents()
	 * @see CIM.IEC61968.Common.Document#getChangeSets
	 * @model opposite="ChangeSets"
	 * @generated
	 */
	EList<Document> getDocuments();

} // ChangeSet
