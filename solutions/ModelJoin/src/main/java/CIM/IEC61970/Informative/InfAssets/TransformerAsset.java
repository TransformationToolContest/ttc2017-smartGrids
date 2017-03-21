/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.AssetModels.TransformerInfo;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings <em>Power Ratings</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A specific physical (vs. logical) transformer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A specific physical (vs. logical) transformer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A specific physical (vs. logical) transformer.' Profile\040documentation='A specific physical (vs. logical) transformer.'"
 * @generated
 */
public interface TransformerAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Power Ratings</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.PowerRating}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Ratings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Ratings</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset_PowerRatings()
	 * @see CIM.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets
	 * @model opposite="TransformerAssets"
	 * @generated
	 */
	EList<PowerRating> getPowerRatings();

	/**
	 * Returns the value of the '<em><b>Transformer Observations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.TransformerObservation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observations</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset_TransformerObservations()
	 * @see CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset
	 * @model opposite="TransformerAsset"
	 * @generated
	 */
	EList<TransformerObservation> getTransformerObservations();

	/**
	 * Returns the value of the '<em><b>Reconditioned Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconditioned Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconditioned Date Time</em>' attribute.
	 * @see #setReconditionedDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset_ReconditionedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time this asset was last reconditioned or had a major overhaul.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time this asset was last reconditioned or had a major overhaul.'"
	 * @generated
	 */
	Date getReconditionedDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconditioned Date Time</em>' attribute.
	 * @see #getReconditionedDateTime()
	 * @generated
	 */
	void setReconditionedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Transformer Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Asset Model</em>' reference.
	 * @see #setTransformerAssetModel(TransformerAssetModel)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset_TransformerAssetModel()
	 * @see CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets
	 * @model opposite="TransformerAssets"
	 * @generated
	 */
	TransformerAssetModel getTransformerAssetModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Asset Model</em>' reference.
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	void setTransformerAssetModel(TransformerAssetModel value);

	/**
	 * Returns the value of the '<em><b>Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Info</em>' reference.
	 * @see #setTransformerInfo(TransformerInfo)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset_TransformerInfo()
	 * @see CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssets
	 * @model opposite="TransformerAssets"
	 * @generated
	 */
	TransformerInfo getTransformerInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Info</em>' reference.
	 * @see #getTransformerInfo()
	 * @generated
	 */
	void setTransformerInfo(TransformerInfo value);

} // TransformerAsset
