/**
 */
package gluemodel.CIM.IEC61968.AssetModels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concentric Neutral Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getConcentricNeutralCableInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Concentric neutral cable data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Concentric neutral cable data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Concentric neutral cable data.' Profile\040documentation='Concentric neutral cable data.'"
 * @generated
 */
public interface ConcentricNeutralCableInfo extends CableInfo {
	/**
	 * Returns the value of the '<em><b>Diameter Over Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Neutral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Neutral</em>' attribute.
	 * @see #setDiameterOverNeutral(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getConcentricNeutralCableInfo_DiameterOverNeutral()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter over the concentric neutral strands.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter over the concentric neutral strands.'"
	 * @generated
	 */
	float getDiameterOverNeutral();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Neutral</em>' attribute.
	 * @see #getDiameterOverNeutral()
	 * @generated
	 */
	void setDiameterOverNeutral(float value);

	/**
	 * Returns the value of the '<em><b>Neutral Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Strand Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Strand Count</em>' attribute.
	 * @see #setNeutralStrandCount(int)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getConcentricNeutralCableInfo_NeutralStrandCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of concentric neutral strands.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of concentric neutral strands.'"
	 * @generated
	 */
	int getNeutralStrandCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Strand Count</em>' attribute.
	 * @see #getNeutralStrandCount()
	 * @generated
	 */
	void setNeutralStrandCount(int value);

	/**
	 * Returns the value of the '<em><b>Wire Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Type</em>' reference.
	 * @see #setWireType(WireType)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getConcentricNeutralCableInfo_WireType()
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos
	 * @model opposite="ConcentricNeutralCableInfos"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Wire type used for this concentric neutral cable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Wire type used for this concentric neutral cable.'"
	 * @generated
	 */
	WireType getWireType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Type</em>' reference.
	 * @see #getWireType()
	 * @generated
	 */
	void setWireType(WireType value);

} // ConcentricNeutralCableInfo
