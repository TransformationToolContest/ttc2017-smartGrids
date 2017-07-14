/**
 */
package gluemodel;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Asset MMXU Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getA <em>A</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getName <em>Name</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getAMag <em>AMag</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getAAng <em>AAng</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getBMag <em>BMag</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getBAng <em>BAng</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getCMag <em>CMag</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getCAng <em>CAng</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getNeutMag <em>Neut Mag</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getNeutAng <em>Neut Ang</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getNetMag <em>Net Mag</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getNetAng <em>Net Ang</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getResMag <em>Res Mag</em>}</li>
 *   <li>{@link gluemodel.MeterAssetMMXUPair#getResAng <em>Res Ang</em>}</li>
 * </ul>
 *
 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair()
 * @model
 * @generated
 */
public interface MeterAssetMMXUPair extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(MeterAsset)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_A()
	 * @model
	 * @generated
	 */
	MeterAsset getA();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(MMXU)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_B()
	 * @model
	 * @generated
	 */
	MMXU getB();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(MMXU value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>AMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AMag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AMag</em>' attribute.
	 * @see #setAMag(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_AMag()
	 * @model
	 * @generated
	 */
	double getAMag();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getAMag <em>AMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AMag</em>' attribute.
	 * @see #getAMag()
	 * @generated
	 */
	void setAMag(double value);

	/**
	 * Returns the value of the '<em><b>AAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAng</em>' attribute.
	 * @see #setAAng(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_AAng()
	 * @model
	 * @generated
	 */
	double getAAng();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getAAng <em>AAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AAng</em>' attribute.
	 * @see #getAAng()
	 * @generated
	 */
	void setAAng(double value);

	/**
	 * Returns the value of the '<em><b>BMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BMag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BMag</em>' attribute.
	 * @see #setBMag(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_BMag()
	 * @model
	 * @generated
	 */
	double getBMag();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getBMag <em>BMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BMag</em>' attribute.
	 * @see #getBMag()
	 * @generated
	 */
	void setBMag(double value);

	/**
	 * Returns the value of the '<em><b>BAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BAng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BAng</em>' attribute.
	 * @see #setBAng(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_BAng()
	 * @model
	 * @generated
	 */
	double getBAng();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getBAng <em>BAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BAng</em>' attribute.
	 * @see #getBAng()
	 * @generated
	 */
	void setBAng(double value);

	/**
	 * Returns the value of the '<em><b>CMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CMag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMag</em>' attribute.
	 * @see #setCMag(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_CMag()
	 * @model
	 * @generated
	 */
	double getCMag();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getCMag <em>CMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMag</em>' attribute.
	 * @see #getCMag()
	 * @generated
	 */
	void setCMag(double value);

	/**
	 * Returns the value of the '<em><b>CAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CAng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAng</em>' attribute.
	 * @see #setCAng(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_CAng()
	 * @model
	 * @generated
	 */
	double getCAng();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getCAng <em>CAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAng</em>' attribute.
	 * @see #getCAng()
	 * @generated
	 */
	void setCAng(double value);

	/**
	 * Returns the value of the '<em><b>Neut Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neut Mag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neut Mag</em>' attribute.
	 * @see #setNeutMag(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_NeutMag()
	 * @model
	 * @generated
	 */
	double getNeutMag();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getNeutMag <em>Neut Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neut Mag</em>' attribute.
	 * @see #getNeutMag()
	 * @generated
	 */
	void setNeutMag(double value);

	/**
	 * Returns the value of the '<em><b>Neut Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neut Ang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neut Ang</em>' attribute.
	 * @see #setNeutAng(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_NeutAng()
	 * @model
	 * @generated
	 */
	double getNeutAng();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getNeutAng <em>Neut Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neut Ang</em>' attribute.
	 * @see #getNeutAng()
	 * @generated
	 */
	void setNeutAng(double value);

	/**
	 * Returns the value of the '<em><b>Net Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Mag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Mag</em>' attribute.
	 * @see #setNetMag(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_NetMag()
	 * @model
	 * @generated
	 */
	double getNetMag();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getNetMag <em>Net Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Mag</em>' attribute.
	 * @see #getNetMag()
	 * @generated
	 */
	void setNetMag(double value);

	/**
	 * Returns the value of the '<em><b>Net Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Ang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Ang</em>' attribute.
	 * @see #setNetAng(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_NetAng()
	 * @model
	 * @generated
	 */
	double getNetAng();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getNetAng <em>Net Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Ang</em>' attribute.
	 * @see #getNetAng()
	 * @generated
	 */
	void setNetAng(double value);

	/**
	 * Returns the value of the '<em><b>Res Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Mag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Mag</em>' attribute.
	 * @see #setResMag(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_ResMag()
	 * @model
	 * @generated
	 */
	double getResMag();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getResMag <em>Res Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Mag</em>' attribute.
	 * @see #getResMag()
	 * @generated
	 */
	void setResMag(double value);

	/**
	 * Returns the value of the '<em><b>Res Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Ang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Ang</em>' attribute.
	 * @see #setResAng(double)
	 * @see gluemodel.GluemodelPackage#getMeterAssetMMXUPair_ResAng()
	 * @model
	 * @generated
	 */
	double getResAng();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetMMXUPair#getResAng <em>Res Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Ang</em>' attribute.
	 * @see #getResAng()
	 * @generated
	 */
	void setResAng(double value);

} // MeterAssetMMXUPair
