/**
 */
package CIM.IEC61970.Informative.InfAssetModels;

import CIM.IEC61968.AssetModels.AssetModel;
import CIM.IEC61968.AssetModels.TransformerInfo;

import CIM.IEC61970.Informative.InfAssets.TransformerAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for a type of a transformer of a particular product model made by a manufacturer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for a type of a transformer of a particular product model made by a manufacturer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for a type of a transformer of a particular product model made by a manufacturer.' Profile\040documentation='Documentation for a type of a transformer of a particular product model made by a manufacturer.'"
 * @generated
 */
public interface TransformerAssetModel extends AssetModel {
	/**
	 * Returns the value of the '<em><b>Hour Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour Over Load Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour Over Load Rating</em>' attribute.
	 * @see #setHourOverLoadRating(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_HourOverLoadRating()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='1-hour overload rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='1-hour overload rating.'"
	 * @generated
	 */
	float getHourOverLoadRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour Over Load Rating</em>' attribute.
	 * @see #getHourOverLoadRating()
	 * @generated
	 */
	void setHourOverLoadRating(float value);

	/**
	 * Returns the value of the '<em><b>Oil Preservation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Preservation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Preservation Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @see #setOilPreservationKind(OilPreservationKind)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_OilPreservationKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of oil preservation system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of oil preservation system.'"
	 * @generated
	 */
	OilPreservationKind getOilPreservationKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Preservation Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @see #getOilPreservationKind()
	 * @generated
	 */
	void setOilPreservationKind(OilPreservationKind value);

	/**
	 * Returns the value of the '<em><b>Core Coils Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Coils Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Coils Weight</em>' attribute.
	 * @see #setCoreCoilsWeight(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_CoreCoilsWeight()
	 * @model dataType="CIM.IEC61970.Domain.Weight" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Weight of core and coils in transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Weight of core and coils in transformer.'"
	 * @generated
	 */
	float getCoreCoilsWeight();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Coils Weight</em>' attribute.
	 * @see #getCoreCoilsWeight()
	 * @generated
	 */
	void setCoreCoilsWeight(float value);

	/**
	 * Returns the value of the '<em><b>Winding Insulation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Insulation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Insulation Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @see #setWindingInsulationKind(WindingInsulationKind)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_WindingInsulationKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of insultation used for transformer windings:\nPaper, Thermally Upgraded Paper, Nomex, other'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of insultation used for transformer windings:\nPaper, Thermally Upgraded Paper, Nomex, other'"
	 * @generated
	 */
	WindingInsulationKind getWindingInsulationKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Insulation Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @see #getWindingInsulationKind()
	 * @generated
	 */
	void setWindingInsulationKind(WindingInsulationKind value);

	/**
	 * Returns the value of the '<em><b>Alt Secondary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Secondary Nom Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Secondary Nom Voltage</em>' attribute.
	 * @see #setAltSecondaryNomVoltage(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_AltSecondaryNomVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nominal voltage rating for alternate configuration for secondary winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nominal voltage rating for alternate configuration for secondary winding.'"
	 * @generated
	 */
	float getAltSecondaryNomVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Secondary Nom Voltage</em>' attribute.
	 * @see #getAltSecondaryNomVoltage()
	 * @generated
	 */
	void setAltSecondaryNomVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssetModels <em>Transformer Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Info</em>' reference.
	 * @see #setTransformerInfo(TransformerInfo)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_TransformerInfo()
	 * @see CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssetModels
	 * @model opposite="TransformerAssetModels"
	 * @generated
	 */
	TransformerInfo getTransformerInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Info</em>' reference.
	 * @see #getTransformerInfo()
	 * @generated
	 */
	void setTransformerInfo(TransformerInfo value);

	/**
	 * Returns the value of the '<em><b>Solid Insulation Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solid Insulation Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solid Insulation Weight</em>' attribute.
	 * @see #setSolidInsulationWeight(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_SolidInsulationWeight()
	 * @model dataType="CIM.IEC61970.Domain.Weight" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Weight of solid insultation in transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Weight of solid insultation in transformer.'"
	 * @generated
	 */
	float getSolidInsulationWeight();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Insulation Weight</em>' attribute.
	 * @see #getSolidInsulationWeight()
	 * @generated
	 */
	void setSolidInsulationWeight(float value);

	/**
	 * Returns the value of the '<em><b>Neutral BIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral BIL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral BIL</em>' attribute.
	 * @see #setNeutralBIL(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_NeutralBIL()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Basic Insulation Level of Neutral'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Basic Insulation Level of Neutral'"
	 * @generated
	 */
	float getNeutralBIL();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral BIL</em>' attribute.
	 * @see #getNeutralBIL()
	 * @generated
	 */
	void setNeutralBIL(float value);

	/**
	 * Returns the value of the '<em><b>Core Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @see #setCoreKind(TransformerCoreKind)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_CoreKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Core kind of this transformer product.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Core kind of this transformer product.'"
	 * @generated
	 */
	TransformerCoreKind getCoreKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @see #getCoreKind()
	 * @generated
	 */
	void setCoreKind(TransformerCoreKind value);

	/**
	 * Returns the value of the '<em><b>Day Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Over Load Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Over Load Rating</em>' attribute.
	 * @see #setDayOverLoadRating(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_DayOverLoadRating()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='24-hour overload rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='24-hour overload rating.'"
	 * @generated
	 */
	float getDayOverLoadRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Over Load Rating</em>' attribute.
	 * @see #getDayOverLoadRating()
	 * @generated
	 */
	void setDayOverLoadRating(float value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @see #setFunction(TransformerFunctionKind)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_Function()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Function of this transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Function of this transformer.'"
	 * @generated
	 */
	TransformerFunctionKind getFunction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(TransformerFunctionKind value);

	/**
	 * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @see #setConstructionKind(TransformerConstructionKind)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_ConstructionKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of construction for this transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of construction for this transformer.'"
	 * @generated
	 */
	TransformerConstructionKind getConstructionKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @see #getConstructionKind()
	 * @generated
	 */
	void setConstructionKind(TransformerConstructionKind value);

	/**
	 * Returns the value of the '<em><b>Auto Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Transformer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Transformer</em>' attribute.
	 * @see #setAutoTransformer(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_AutoTransformer()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this is an autotransformer, false otherwise.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this is an autotransformer, false otherwise.'"
	 * @generated
	 */
	boolean isAutoTransformer();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Transformer</em>' attribute.
	 * @see #isAutoTransformer()
	 * @generated
	 */
	void setAutoTransformer(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformer Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.TransformerAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_TransformerAssets()
	 * @see CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel
	 * @model opposite="TransformerAssetModel"
	 * @generated
	 */
	EList<TransformerAsset> getTransformerAssets();

	/**
	 * Returns the value of the '<em><b>Alt Primary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Primary Nom Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Primary Nom Voltage</em>' attribute.
	 * @see #setAltPrimaryNomVoltage(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_AltPrimaryNomVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nominal voltage rating for alternate configuration for primary winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nominal voltage rating for alternate configuration for primary winding.'"
	 * @generated
	 */
	float getAltPrimaryNomVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Primary Nom Voltage</em>' attribute.
	 * @see #getAltPrimaryNomVoltage()
	 * @generated
	 */
	void setAltPrimaryNomVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Reconfig Winding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfig Winding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfig Winding</em>' attribute.
	 * @see #setReconfigWinding(boolean)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel_ReconfigWinding()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if windings can be re-configured to result in a different input or output voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if windings can be re-configured to result in a different input or output voltage.'"
	 * @generated
	 */
	boolean isReconfigWinding();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfig Winding</em>' attribute.
	 * @see #isReconfigWinding()
	 * @generated
	 */
	void setReconfigWinding(boolean value);

} // TransformerAssetModel
