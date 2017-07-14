/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RSYN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRHz <em>RHz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLHz <em>LHz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRV <em>RV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLV <em>LV</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRel <em>Rel</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getVlnd <em>Vlnd</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getAngInd <em>Ang Ind</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getHzInd <em>Hz Ind</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getSynPrg <em>Syn Prg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifVClc <em>Dif VClc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAngClc <em>Dif Ang Clc</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifV <em>Dif V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifHz <em>Dif Hz</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAng <em>Dif Ang</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivDeaMod <em>Liv Dea Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaLinVal <em>Dea Lin Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivLinVal <em>Liv Lin Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaBusVal <em>Dea Bus Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getPlsTmms <em>Pls Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getBkrTmms <em>Bkr Tmms</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN()
 * @model
 * @generated
 */
public interface RSYN extends GroupR {
	/**
	 * Returns the value of the '<em><b>RHz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RHz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RHz</em>' reference.
	 * @see #setRHz(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_RHz()
	 * @model required="true"
	 * @generated
	 */
	SPC getRHz();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRHz <em>RHz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RHz</em>' reference.
	 * @see #getRHz()
	 * @generated
	 */
	void setRHz(SPC value);

	/**
	 * Returns the value of the '<em><b>LHz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LHz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LHz</em>' reference.
	 * @see #setLHz(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_LHz()
	 * @model required="true"
	 * @generated
	 */
	SPC getLHz();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLHz <em>LHz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LHz</em>' reference.
	 * @see #getLHz()
	 * @generated
	 */
	void setLHz(SPC value);

	/**
	 * Returns the value of the '<em><b>RV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RV</em>' reference.
	 * @see #setRV(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_RV()
	 * @model required="true"
	 * @generated
	 */
	SPC getRV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRV <em>RV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RV</em>' reference.
	 * @see #getRV()
	 * @generated
	 */
	void setRV(SPC value);

	/**
	 * Returns the value of the '<em><b>LV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LV</em>' reference.
	 * @see #setLV(SPC)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_LV()
	 * @model required="true"
	 * @generated
	 */
	SPC getLV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLV <em>LV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LV</em>' reference.
	 * @see #getLV()
	 * @generated
	 */
	void setLV(SPC value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' reference.
	 * @see #setRel(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_Rel()
	 * @model required="true"
	 * @generated
	 */
	SPS getRel();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRel <em>Rel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' reference.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(SPS value);

	/**
	 * Returns the value of the '<em><b>Vlnd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlnd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlnd</em>' reference.
	 * @see #setVlnd(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_Vlnd()
	 * @model required="true"
	 * @generated
	 */
	SPS getVlnd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getVlnd <em>Vlnd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlnd</em>' reference.
	 * @see #getVlnd()
	 * @generated
	 */
	void setVlnd(SPS value);

	/**
	 * Returns the value of the '<em><b>Ang Ind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang Ind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang Ind</em>' reference.
	 * @see #setAngInd(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_AngInd()
	 * @model required="true"
	 * @generated
	 */
	SPS getAngInd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getAngInd <em>Ang Ind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang Ind</em>' reference.
	 * @see #getAngInd()
	 * @generated
	 */
	void setAngInd(SPS value);

	/**
	 * Returns the value of the '<em><b>Hz Ind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hz Ind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hz Ind</em>' reference.
	 * @see #setHzInd(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_HzInd()
	 * @model required="true"
	 * @generated
	 */
	SPS getHzInd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getHzInd <em>Hz Ind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hz Ind</em>' reference.
	 * @see #getHzInd()
	 * @generated
	 */
	void setHzInd(SPS value);

	/**
	 * Returns the value of the '<em><b>Syn Prg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syn Prg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syn Prg</em>' reference.
	 * @see #setSynPrg(SPS)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_SynPrg()
	 * @model required="true"
	 * @generated
	 */
	SPS getSynPrg();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getSynPrg <em>Syn Prg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syn Prg</em>' reference.
	 * @see #getSynPrg()
	 * @generated
	 */
	void setSynPrg(SPS value);

	/**
	 * Returns the value of the '<em><b>Dif VClc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dif VClc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dif VClc</em>' reference.
	 * @see #setDifVClc(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DifVClc()
	 * @model required="true"
	 * @generated
	 */
	MV getDifVClc();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifVClc <em>Dif VClc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dif VClc</em>' reference.
	 * @see #getDifVClc()
	 * @generated
	 */
	void setDifVClc(MV value);

	/**
	 * Returns the value of the '<em><b>Dif Ang Clc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dif Ang Clc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dif Ang Clc</em>' reference.
	 * @see #setDifAngClc(MV)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DifAngClc()
	 * @model required="true"
	 * @generated
	 */
	MV getDifAngClc();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAngClc <em>Dif Ang Clc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dif Ang Clc</em>' reference.
	 * @see #getDifAngClc()
	 * @generated
	 */
	void setDifAngClc(MV value);

	/**
	 * Returns the value of the '<em><b>Dif V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dif V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dif V</em>' reference.
	 * @see #setDifV(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DifV()
	 * @model required="true"
	 * @generated
	 */
	ASG getDifV();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifV <em>Dif V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dif V</em>' reference.
	 * @see #getDifV()
	 * @generated
	 */
	void setDifV(ASG value);

	/**
	 * Returns the value of the '<em><b>Dif Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dif Hz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dif Hz</em>' reference.
	 * @see #setDifHz(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DifHz()
	 * @model required="true"
	 * @generated
	 */
	ASG getDifHz();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifHz <em>Dif Hz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dif Hz</em>' reference.
	 * @see #getDifHz()
	 * @generated
	 */
	void setDifHz(ASG value);

	/**
	 * Returns the value of the '<em><b>Dif Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dif Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dif Ang</em>' reference.
	 * @see #setDifAng(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DifAng()
	 * @model required="true"
	 * @generated
	 */
	ASG getDifAng();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAng <em>Dif Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dif Ang</em>' reference.
	 * @see #getDifAng()
	 * @generated
	 */
	void setDifAng(ASG value);

	/**
	 * Returns the value of the '<em><b>Liv Dea Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liv Dea Mod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liv Dea Mod</em>' reference.
	 * @see #setLivDeaMod(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_LivDeaMod()
	 * @model required="true"
	 * @generated
	 */
	ING getLivDeaMod();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivDeaMod <em>Liv Dea Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liv Dea Mod</em>' reference.
	 * @see #getLivDeaMod()
	 * @generated
	 */
	void setLivDeaMod(ING value);

	/**
	 * Returns the value of the '<em><b>Dea Lin Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dea Lin Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dea Lin Val</em>' reference.
	 * @see #setDeaLinVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DeaLinVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getDeaLinVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaLinVal <em>Dea Lin Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dea Lin Val</em>' reference.
	 * @see #getDeaLinVal()
	 * @generated
	 */
	void setDeaLinVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Liv Lin Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liv Lin Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liv Lin Val</em>' reference.
	 * @see #setLivLinVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_LivLinVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getLivLinVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivLinVal <em>Liv Lin Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liv Lin Val</em>' reference.
	 * @see #getLivLinVal()
	 * @generated
	 */
	void setLivLinVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Dea Bus Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dea Bus Val</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dea Bus Val</em>' reference.
	 * @see #setDeaBusVal(ASG)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_DeaBusVal()
	 * @model required="true"
	 * @generated
	 */
	ASG getDeaBusVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaBusVal <em>Dea Bus Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dea Bus Val</em>' reference.
	 * @see #getDeaBusVal()
	 * @generated
	 */
	void setDeaBusVal(ASG value);

	/**
	 * Returns the value of the '<em><b>Pls Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pls Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pls Tmms</em>' reference.
	 * @see #setPlsTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_PlsTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getPlsTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getPlsTmms <em>Pls Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pls Tmms</em>' reference.
	 * @see #getPlsTmms()
	 * @generated
	 */
	void setPlsTmms(ING value);

	/**
	 * Returns the value of the '<em><b>Bkr Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bkr Tmms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bkr Tmms</em>' reference.
	 * @see #setBkrTmms(ING)
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage#getRSYN_BkrTmms()
	 * @model required="true"
	 * @generated
	 */
	ING getBkrTmms();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getBkrTmms <em>Bkr Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bkr Tmms</em>' reference.
	 * @see #getBkrTmms()
	 * @generated
	 */
	void setBkrTmms(ING value);

} // RSYN
