/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC;

import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CALH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrAlm <em>Gr Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrWrn <em>Gr Wrn</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getAlmLstOv <em>Alm Lst Ov</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCALH()
 * @model
 * @generated
 */
public interface CALH extends GroupC {
	/**
	 * Returns the value of the '<em><b>Gr Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gr Alm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gr Alm</em>' reference.
	 * @see #setGrAlm(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCALH_GrAlm()
	 * @model required="true"
	 * @generated
	 */
	SPS getGrAlm();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrAlm <em>Gr Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gr Alm</em>' reference.
	 * @see #getGrAlm()
	 * @generated
	 */
	void setGrAlm(SPS value);

	/**
	 * Returns the value of the '<em><b>Gr Wrn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gr Wrn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gr Wrn</em>' reference.
	 * @see #setGrWrn(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCALH_GrWrn()
	 * @model required="true"
	 * @generated
	 */
	SPS getGrWrn();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrWrn <em>Gr Wrn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gr Wrn</em>' reference.
	 * @see #getGrWrn()
	 * @generated
	 */
	void setGrWrn(SPS value);

	/**
	 * Returns the value of the '<em><b>Alm Lst Ov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Lst Ov</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Lst Ov</em>' reference.
	 * @see #setAlmLstOv(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCPackage#getCALH_AlmLstOv()
	 * @model required="true"
	 * @generated
	 */
	SPS getAlmLstOv();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getAlmLstOv <em>Alm Lst Ov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Lst Ov</em>' reference.
	 * @see #getAlmLstOv()
	 * @generated
	 */
	void setAlmLstOv(SPS value);

} // CALH
