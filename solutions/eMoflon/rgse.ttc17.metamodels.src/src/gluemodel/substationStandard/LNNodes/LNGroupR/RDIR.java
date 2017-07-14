/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDIR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getDir <em>Dir</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getChrAng <em>Chr Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinFwdAng <em>Min Fwd Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinRvAng <em>Min Rv Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxFwdAng <em>Max Fwd Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxRvAng <em>Max Rv Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValA <em>Blk Val A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValV <em>Blk Val V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getPolQty <em>Pol Qty</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinPPV <em>Min PPV</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR()
 * @model
 * @generated
 */
public interface RDIR extends GroupR {
	/**
	 * Returns the value of the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' reference.
	 * @see #setDir(ACD)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_Dir()
	 * @model required="true"
	 * @generated
	 */
	ACD getDir();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getDir <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' reference.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(ACD value);

	/**
	 * Returns the value of the '<em><b>Chr Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chr Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chr Ang</em>' reference.
	 * @see #setChrAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_ChrAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getChrAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getChrAng <em>Chr Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chr Ang</em>' reference.
	 * @see #getChrAng()
	 * @generated
	 */
	void setChrAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Min Fwd Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Fwd Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fwd Ang</em>' reference.
	 * @see #setMinFwdAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_MinFwdAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getMinFwdAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinFwdAng <em>Min Fwd Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fwd Ang</em>' reference.
	 * @see #getMinFwdAng()
	 * @generated
	 */
	void setMinFwdAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Min Rv Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Rv Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Rv Ang</em>' reference.
	 * @see #setMinRvAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_MinRvAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getMinRvAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinRvAng <em>Min Rv Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Rv Ang</em>' reference.
	 * @see #getMinRvAng()
	 * @generated
	 */
	void setMinRvAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Max Fwd Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Fwd Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fwd Ang</em>' reference.
	 * @see #setMaxFwdAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_MaxFwdAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getMaxFwdAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxFwdAng <em>Max Fwd Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fwd Ang</em>' reference.
	 * @see #getMaxFwdAng()
	 * @generated
	 */
	void setMaxFwdAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Max Rv Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Rv Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Rv Ang</em>' reference.
	 * @see #setMaxRvAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_MaxRvAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getMaxRvAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxRvAng <em>Max Rv Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Rv Ang</em>' reference.
	 * @see #getMaxRvAng()
	 * @generated
	 */
	void setMaxRvAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val A</em>' reference.
	 * @see #setBlkValA(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_BlkValA()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkValA();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValA <em>Blk Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val A</em>' reference.
	 * @see #getBlkValA()
	 * @generated
	 */
	void setBlkValA(ASG value);

	/**
	 * Returns the value of the '<em><b>Blk Val V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blk Val V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blk Val V</em>' reference.
	 * @see #setBlkValV(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_BlkValV()
	 * @model required="true"
	 * @generated
	 */
	ASG getBlkValV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValV <em>Blk Val V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blk Val V</em>' reference.
	 * @see #getBlkValV()
	 * @generated
	 */
	void setBlkValV(ASG value);

	/**
	 * Returns the value of the '<em><b>Pol Qty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pol Qty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pol Qty</em>' reference.
	 * @see #setPolQty(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_PolQty()
	 * @model required="true"
	 * @generated
	 */
	ING getPolQty();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getPolQty <em>Pol Qty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pol Qty</em>' reference.
	 * @see #getPolQty()
	 * @generated
	 */
	void setPolQty(ING value);

	/**
	 * Returns the value of the '<em><b>Min PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min PPV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min PPV</em>' reference.
	 * @see #setMinPPV(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRDIR_MinPPV()
	 * @model required="true"
	 * @generated
	 */
	ASG getMinPPV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinPPV <em>Min PPV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min PPV</em>' reference.
	 * @see #getMinPPV()
	 * @generated
	 */
	void setMinPPV(ASG value);

} // RDIR
