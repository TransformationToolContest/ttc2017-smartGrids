/**
 */
package substationStandard.LNNodes.LNGroupR;

import substationStandard.Dataclasses.SPC;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RDRS#getAutoUpLod <em>Auto Up Lod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.RDRS#getDltRcd <em>Dlt Rcd</em>}</li>
 * </ul>
 *
 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRS()
 * @model
 * @generated
 */
public interface RDRS extends GroupR {
	/**
	 * Returns the value of the '<em><b>Auto Up Lod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Up Lod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Up Lod</em>' reference.
	 * @see #setAutoUpLod(SPC)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRS_AutoUpLod()
	 * @model required="true"
	 * @generated
	 */
	SPC getAutoUpLod();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RDRS#getAutoUpLod <em>Auto Up Lod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Up Lod</em>' reference.
	 * @see #getAutoUpLod()
	 * @generated
	 */
	void setAutoUpLod(SPC value);

	/**
	 * Returns the value of the '<em><b>Dlt Rcd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dlt Rcd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dlt Rcd</em>' reference.
	 * @see #setDltRcd(SPC)
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDRS_DltRcd()
	 * @model required="true"
	 * @generated
	 */
	SPC getDltRcd();

	/**
	 * Sets the value of the '{@link substationStandard.LNNodes.LNGroupR.RDRS#getDltRcd <em>Dlt Rcd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dlt Rcd</em>' reference.
	 * @see #getDltRcd()
	 * @generated
	 */
	void setDltRcd(SPC value);

} // RDRS
