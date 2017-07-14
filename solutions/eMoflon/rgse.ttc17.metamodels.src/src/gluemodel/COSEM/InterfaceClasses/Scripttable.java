/**
 */
package gluemodel.COSEM.InterfaceClasses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripttable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.Scripttable#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getScripttable()
 * @model
 * @generated
 */
public interface Scripttable extends Base {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.COSEM.InterfaceClasses.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getScripttable_Includes()
	 * @model
	 * @generated
	 */
	EList<Script> getIncludes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // Scripttable
