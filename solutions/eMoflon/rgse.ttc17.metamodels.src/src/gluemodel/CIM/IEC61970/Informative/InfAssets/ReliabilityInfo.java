/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getReliabilityInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information regarding the experienced and expected reliability of a specific asset, type of asset, or asset model.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information regarding the experienced and expected reliability of a specific asset, type of asset, or asset model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information regarding the experienced and expected reliability of a specific asset, type of asset, or asset model.' Profile\040documentation='Information regarding the experienced and expected reliability of a specific asset, type of asset, or asset model.'"
 * @generated
 */
public interface ReliabilityInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Mom Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mom Failure Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mom Failure Rate</em>' attribute.
	 * @see #setMomFailureRate(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getReliabilityInfo_MomFailureRate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Momentary failure rate (temporary failures/kft-year).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Momentary failure rate (temporary failures/kft-year).'"
	 * @generated
	 */
	float getMomFailureRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mom Failure Rate</em>' attribute.
	 * @see #getMomFailureRate()
	 * @generated
	 */
	void setMomFailureRate(float value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getReliabilityInfo_Assets()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getReliabilityInfos
	 * @model opposite="ReliabilityInfos"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTTR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTTR</em>' attribute.
	 * @see #setMTTR(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getReliabilityInfo_MTTR()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Hours" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Mean time to repair (MTTR - hours).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mean time to repair (MTTR - hours).'"
	 * @generated
	 */
	float getMTTR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTR</em>' attribute.
	 * @see #getMTTR()
	 * @generated
	 */
	void setMTTR(float value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Specification)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getReliabilityInfo_Specification()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos
	 * @model opposite="ReliabilityInfos"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

} // ReliabilityInfo
