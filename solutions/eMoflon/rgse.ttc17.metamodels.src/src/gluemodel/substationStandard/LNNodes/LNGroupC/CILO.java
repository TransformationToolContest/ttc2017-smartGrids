/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC;

import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CILO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaOpn <em>Ena Opn</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaCls <em>Ena Cls</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCILO()
 * @model
 * @generated
 */
public interface CILO extends GroupC {
	/**
	 * Returns the value of the '<em><b>Ena Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ena Opn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ena Opn</em>' reference.
	 * @see #setEnaOpn(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCILO_EnaOpn()
	 * @model required="true"
	 * @generated
	 */
	SPS getEnaOpn();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaOpn <em>Ena Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ena Opn</em>' reference.
	 * @see #getEnaOpn()
	 * @generated
	 */
	void setEnaOpn(SPS value);

	/**
	 * Returns the value of the '<em><b>Ena Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ena Cls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ena Cls</em>' reference.
	 * @see #setEnaCls(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCILO_EnaCls()
	 * @model required="true"
	 * @generated
	 */
	SPS getEnaCls();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaCls <em>Ena Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ena Cls</em>' reference.
	 * @see #getEnaCls()
	 * @generated
	 */
	void setEnaCls(SPS value);

} // CILO
