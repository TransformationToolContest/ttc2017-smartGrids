/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVol <em>Vol</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVolChgRte <em>Vol Chg Rte</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getAmp <em>Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatTest <em>Bat Test</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getTestRsl <em>Test Rsl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatHi <em>Bat Hi</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatLo <em>Bat Lo</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getLoBatVal <em>Lo Bat Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getHiBatVal <em>Hi Bat Val</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT()
 * @model
 * @generated
 */
public interface ZBAT extends GroupZ {
	/**
	 * Returns the value of the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Tmh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Tmh</em>' reference.
	 * @see #setOpTmh(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_OpTmh()
	 * @model required="true"
	 * @generated
	 */
	MV getOpTmh();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getOpTmh <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Tmh</em>' reference.
	 * @see #getOpTmh()
	 * @generated
	 */
	void setOpTmh(MV value);

	/**
	 * Returns the value of the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol</em>' reference.
	 * @see #setVol(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_Vol()
	 * @model required="true"
	 * @generated
	 */
	MV getVol();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVol <em>Vol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol</em>' reference.
	 * @see #getVol()
	 * @generated
	 */
	void setVol(MV value);

	/**
	 * Returns the value of the '<em><b>Vol Chg Rte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vol Chg Rte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vol Chg Rte</em>' reference.
	 * @see #setVolChgRte(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_VolChgRte()
	 * @model required="true"
	 * @generated
	 */
	MV getVolChgRte();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVolChgRte <em>Vol Chg Rte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vol Chg Rte</em>' reference.
	 * @see #getVolChgRte()
	 * @generated
	 */
	void setVolChgRte(MV value);

	/**
	 * Returns the value of the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amp</em>' reference.
	 * @see #setAmp(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_Amp()
	 * @model required="true"
	 * @generated
	 */
	MV getAmp();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getAmp <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amp</em>' reference.
	 * @see #getAmp()
	 * @generated
	 */
	void setAmp(MV value);

	/**
	 * Returns the value of the '<em><b>Bat Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bat Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bat Test</em>' reference.
	 * @see #setBatTest(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_BatTest()
	 * @model required="true"
	 * @generated
	 */
	SPC getBatTest();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatTest <em>Bat Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bat Test</em>' reference.
	 * @see #getBatTest()
	 * @generated
	 */
	void setBatTest(SPC value);

	/**
	 * Returns the value of the '<em><b>Test Rsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Rsl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Rsl</em>' reference.
	 * @see #setTestRsl(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_TestRsl()
	 * @model required="true"
	 * @generated
	 */
	SPC getTestRsl();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getTestRsl <em>Test Rsl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Rsl</em>' reference.
	 * @see #getTestRsl()
	 * @generated
	 */
	void setTestRsl(SPC value);

	/**
	 * Returns the value of the '<em><b>Bat Hi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bat Hi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bat Hi</em>' reference.
	 * @see #setBatHi(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_BatHi()
	 * @model required="true"
	 * @generated
	 */
	SPC getBatHi();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatHi <em>Bat Hi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bat Hi</em>' reference.
	 * @see #getBatHi()
	 * @generated
	 */
	void setBatHi(SPC value);

	/**
	 * Returns the value of the '<em><b>Bat Lo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bat Lo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bat Lo</em>' reference.
	 * @see #setBatLo(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_BatLo()
	 * @model required="true"
	 * @generated
	 */
	SPC getBatLo();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatLo <em>Bat Lo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bat Lo</em>' reference.
	 * @see #getBatLo()
	 * @generated
	 */
	void setBatLo(SPC value);

	/**
	 * Returns the value of the '<em><b>Lo Bat Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lo Bat Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lo Bat Val</em>' reference.
	 * @see #setLoBatVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_LoBatVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getLoBatVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getLoBatVal <em>Lo Bat Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lo Bat Val</em>' reference.
	 * @see #getLoBatVal()
	 * @generated
	 */
	void setLoBatVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Hi Bat Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hi Bat Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hi Bat Val</em>' reference.
	 * @see #setHiBatVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#getZBAT_HiBatVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getHiBatVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getHiBatVal <em>Hi Bat Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hi Bat Val</em>' reference.
	 * @see #getHiBatVal()
	 * @generated
	 */
	void setHiBatVal(ASG value);

} // ZBAT
