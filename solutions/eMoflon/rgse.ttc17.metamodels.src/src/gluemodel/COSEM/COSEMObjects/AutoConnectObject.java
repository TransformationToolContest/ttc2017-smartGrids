/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Auto_connect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Connect Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.AutoConnectObject#isConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getAutoConnectObject()
 * @model
 * @generated
 */
public interface AutoConnectObject extends Auto_connect {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see #setConnection(boolean)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getAutoConnectObject_Connection()
	 * @model
	 * @generated
	 */
	boolean isConnection();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.AutoConnectObject#isConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #isConnection()
	 * @generated
	 */
	void setConnection(boolean value);

} // AutoConnectObject
