/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs <em>Winding Insulation PFs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Common information captured during transformer inspections and/or diagnostics. Note that some properties may be measured through other means and therefore have measurement values in addition to the observed values recorded here.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Common information captured during transformer inspections and/or diagnostics. Note that some properties may be measured through other means and therefore have measurement values in addition to the observed values recorded here.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Common information captured during transformer inspections and/or diagnostics. Note that some properties may be measured through other means and therefore have measurement values in addition to the observed values recorded here.' Profile\040documentation='Common information captured during transformer inspections and/or diagnostics. Note that some properties may be measured through other means and therefore have measurement values in addition to the observed values recorded here.'"
 * @generated
 */
public interface TransformerObservation extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Oil IFT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil IFT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil IFT</em>' attribute.
	 * @see #setOilIFT(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_OilIFT()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Oil Quality Analysis- inter facial tension (IFT) - number-Dynes/CM.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Oil Quality Analysis- inter facial tension (IFT) - number-Dynes/CM.'"
	 * @generated
	 */
	String getOilIFT();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil IFT</em>' attribute.
	 * @see #getOilIFT()
	 * @generated
	 */
	void setOilIFT(String value);

	/**
	 * Returns the value of the '<em><b>Hot Spot Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Spot Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot Temp</em>' attribute.
	 * @see #setHotSpotTemp(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_HotSpotTemp()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Hotspot oil temperature.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Hotspot oil temperature.'"
	 * @generated
	 */
	float getHotSpotTemp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot Temp</em>' attribute.
	 * @see #getHotSpotTemp()
	 * @generated
	 */
	void setHotSpotTemp(float value);

	/**
	 * Returns the value of the '<em><b>Oil Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Dielectric Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Dielectric Strength</em>' attribute.
	 * @see #setOilDielectricStrength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_OilDielectricStrength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Oil Quality Analysis-Dielectric Strength.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Oil Quality Analysis-Dielectric Strength.'"
	 * @generated
	 */
	float getOilDielectricStrength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Dielectric Strength</em>' attribute.
	 * @see #getOilDielectricStrength()
	 * @generated
	 */
	void setOilDielectricStrength(float value);

	/**
	 * Returns the value of the '<em><b>Transformer Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Asset</em>' reference.
	 * @see #setTransformerAsset(TransformerAsset)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_TransformerAsset()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations
	 * @model opposite="TransformerObservations"
	 * @generated
	 */
	TransformerAsset getTransformerAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Asset</em>' reference.
	 * @see #getTransformerAsset()
	 * @generated
	 */
	void setTransformerAsset(TransformerAsset value);

	/**
	 * Returns the value of the '<em><b>Top Oil Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Oil Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Oil Temp</em>' attribute.
	 * @see #setTopOilTemp(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_TopOilTemp()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Top oil temperature.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Top oil temperature.'"
	 * @generated
	 */
	float getTopOilTemp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Oil Temp</em>' attribute.
	 * @see #getTopOilTemp()
	 * @generated
	 */
	void setTopOilTemp(float value);

	/**
	 * Returns the value of the '<em><b>Pump Vibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Vibration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Vibration</em>' attribute.
	 * @see #setPumpVibration(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_PumpVibration()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pump vibration, with typical values being: nominal, high.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pump vibration, with typical values being: nominal, high.'"
	 * @generated
	 */
	String getPumpVibration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Vibration</em>' attribute.
	 * @see #getPumpVibration()
	 * @generated
	 */
	void setPumpVibration(String value);

	/**
	 * Returns the value of the '<em><b>Bushing Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Temp</em>' attribute.
	 * @see #setBushingTemp(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_BushingTemp()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bushing temperature.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bushing temperature.'"
	 * @generated
	 */
	float getBushingTemp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bushing Temp</em>' attribute.
	 * @see #getBushingTemp()
	 * @generated
	 */
	void setBushingTemp(float value);

	/**
	 * Returns the value of the '<em><b>Water Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Content</em>' attribute.
	 * @see #setWaterContent(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_WaterContent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Water Content expressed in parts per million.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Water Content expressed in parts per million.'"
	 * @generated
	 */
	String getWaterContent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Content</em>' attribute.
	 * @see #getWaterContent()
	 * @generated
	 */
	void setWaterContent(String value);

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' reference.
	 * @see #setTransformer(DistributionTransformer)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_Transformer()
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerObservations
	 * @model opposite="TransformerObservations"
	 * @generated
	 */
	DistributionTransformer getTransformer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' reference.
	 * @see #getTransformer()
	 * @generated
	 */
	void setTransformer(DistributionTransformer value);

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_ProcedureDataSets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations
	 * @model opposite="TransformerObservations"
	 * @generated
	 */
	EList<ProcedureDataSet> getProcedureDataSets();

	/**
	 * Returns the value of the '<em><b>Freq Resp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freq Resp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq Resp</em>' attribute.
	 * @see #setFreqResp(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_FreqResp()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Frequency Response Analysis. Typical values are: acceptable, slight movement, significant movement, failed, near failure. A graphic of the response diagram, which is a type of document, may be associated with this analysis through the recursive document relationship of the ProcedureDataSet.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Frequency Response Analysis. Typical values are: acceptable, slight movement, significant movement, failed, near failure. A graphic of the response diagram, which is a type of document, may be associated with this analysis through the recursive document relationship of the ProcedureDataSet.'"
	 * @generated
	 */
	String getFreqResp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq Resp</em>' attribute.
	 * @see #getFreqResp()
	 * @generated
	 */
	void setFreqResp(String value);

	/**
	 * Returns the value of the '<em><b>Furfural DP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Furfural DP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Furfural DP</em>' attribute.
	 * @see #setFurfuralDP(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_FurfuralDP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Overall measure of furfural in oil and mechanical strength of paper. DP, the degree of polymerization, is the strength of the paper. Furfural is a measure of furfural compounds, often expressed in parts per million.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Overall measure of furfural in oil and mechanical strength of paper. DP, the degree of polymerization, is the strength of the paper. Furfural is a measure of furfural compounds, often expressed in parts per million.'"
	 * @generated
	 */
	String getFurfuralDP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Furfural DP</em>' attribute.
	 * @see #getFurfuralDP()
	 * @generated
	 */
	void setFurfuralDP(String value);

	/**
	 * Returns the value of the '<em><b>Bushing Insultation PFs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Insultation PFs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Insultation PFs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_BushingInsultationPFs()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation
	 * @model opposite="TransformerObservation"
	 * @generated
	 */
	EList<BushingInsulationPF> getBushingInsultationPFs();

	/**
	 * Returns the value of the '<em><b>Oil Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Level</em>' attribute.
	 * @see #setOilLevel(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_OilLevel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The level of oil in the transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The level of oil in the transformer.'"
	 * @generated
	 */
	String getOilLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Level</em>' attribute.
	 * @see #getOilLevel()
	 * @generated
	 */
	void setOilLevel(String value);

	/**
	 * Returns the value of the '<em><b>Oil Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Color</em>' attribute.
	 * @see #setOilColor(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_OilColor()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Oil Quality Analysis-Color.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Oil Quality Analysis-Color.'"
	 * @generated
	 */
	String getOilColor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Color</em>' attribute.
	 * @see #getOilColor()
	 * @generated
	 */
	void setOilColor(String value);

	/**
	 * Returns the value of the '<em><b>Winding Insulation PFs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Insulation PFs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Insulation PFs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_WindingInsulationPFs()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation
	 * @model opposite="TransformerObservation"
	 * @generated
	 */
	EList<WindingInsulation> getWindingInsulationPFs();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Dga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dga</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dga</em>' attribute.
	 * @see #setDga(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_Dga()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Dissolved Gas Analysis. Typical values are: Acceptable, Overheating, Corona, Sparking, Arcing.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Dissolved Gas Analysis. Typical values are: Acceptable, Overheating, Corona, Sparking, Arcing.'"
	 * @generated
	 */
	String getDga();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dga</em>' attribute.
	 * @see #getDga()
	 * @generated
	 */
	void setDga(String value);

	/**
	 * Returns the value of the '<em><b>Oil Neutralization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Neutralization Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Neutralization Number</em>' attribute.
	 * @see #setOilNeutralizationNumber(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation_OilNeutralizationNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Oil Quality Analysis-Neutralization Number - Number - Mg KOH.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Oil Quality Analysis-Neutralization Number - Number - Mg KOH.'"
	 * @generated
	 */
	String getOilNeutralizationNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Neutralization Number</em>' attribute.
	 * @see #getOilNeutralizationNumber()
	 * @generated
	 */
	void setOilNeutralizationNumber(String value);

} // TransformerObservation
