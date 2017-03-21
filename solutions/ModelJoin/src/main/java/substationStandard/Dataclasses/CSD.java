/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.CSD#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getXD <em>XD</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getYUnit <em>YUnit</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getYD <em>YD</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getNumPts <em>Num Pts</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getCrvPts <em>Crv Pts</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getD <em>D</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.CSD#getDU <em>DU</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD()
 * @model
 * @generated
 */
public interface CSD extends EObject {
	/**
	 * Returns the value of the '<em><b>XUnit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XUnit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XUnit</em>' reference.
	 * @see #setXUnit(Units)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_XUnit()
	 * @model required="true"
	 * @generated
	 */
	Units getXUnit();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getXUnit <em>XUnit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnit</em>' reference.
	 * @see #getXUnit()
	 * @generated
	 */
	void setXUnit(Units value);

	/**
	 * Returns the value of the '<em><b>XD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XD</em>' attribute.
	 * @see #setXD(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_XD()
	 * @model
	 * @generated
	 */
	String getXD();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getXD <em>XD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XD</em>' attribute.
	 * @see #getXD()
	 * @generated
	 */
	void setXD(String value);

	/**
	 * Returns the value of the '<em><b>YUnit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YUnit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YUnit</em>' reference.
	 * @see #setYUnit(Units)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_YUnit()
	 * @model required="true"
	 * @generated
	 */
	Units getYUnit();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getYUnit <em>YUnit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YUnit</em>' reference.
	 * @see #getYUnit()
	 * @generated
	 */
	void setYUnit(Units value);

	/**
	 * Returns the value of the '<em><b>YD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YD</em>' attribute.
	 * @see #setYD(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_YD()
	 * @model
	 * @generated
	 */
	String getYD();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getYD <em>YD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YD</em>' attribute.
	 * @see #getYD()
	 * @generated
	 */
	void setYD(String value);

	/**
	 * Returns the value of the '<em><b>Num Pts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Pts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Pts</em>' attribute.
	 * @see #setNumPts(int)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_NumPts()
	 * @model
	 * @generated
	 */
	int getNumPts();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getNumPts <em>Num Pts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Pts</em>' attribute.
	 * @see #getNumPts()
	 * @generated
	 */
	void setNumPts(int value);

	/**
	 * Returns the value of the '<em><b>Crv Pts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crv Pts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crv Pts</em>' reference.
	 * @see #setCrvPts(PointArray)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_CrvPts()
	 * @model required="true"
	 * @generated
	 */
	PointArray getCrvPts();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getCrvPts <em>Crv Pts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crv Pts</em>' reference.
	 * @see #getCrvPts()
	 * @generated
	 */
	void setCrvPts(PointArray value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DU</em>' attribute.
	 * @see #setDU(String)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getCSD_DU()
	 * @model
	 * @generated
	 */
	String getDU();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.CSD#getDU <em>DU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DU</em>' attribute.
	 * @see #getDU()
	 * @generated
	 */
	void setDU(String value);

} // CSD
