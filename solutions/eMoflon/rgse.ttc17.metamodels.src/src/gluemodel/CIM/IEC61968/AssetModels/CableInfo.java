/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cable data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Cable data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cable data.' Profile\040documentation='Cable data.'"
 * @generated
 */
public interface CableInfo extends ConductorInfo {
	/**
	 * Returns the value of the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheath As Neutral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheath As Neutral</em>' attribute.
	 * @see #setSheathAsNeutral(boolean)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_SheathAsNeutral()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if sheath / shield is used as a neutral (i.e., bonded).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if sheath / shield is used as a neutral (i.e., bonded).'"
	 * @generated
	 */
	boolean isSheathAsNeutral();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheath As Neutral</em>' attribute.
	 * @see #isSheathAsNeutral()
	 * @generated
	 */
	void setSheathAsNeutral(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strand Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strand Fill</em>' attribute.
	 * @see #setIsStrandFill(boolean)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_IsStrandFill()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if wire strands are extruded in a way to fill the voids in the cable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if wire strands are extruded in a way to fill the voids in the cable.'"
	 * @generated
	 */
	boolean isIsStrandFill();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strand Fill</em>' attribute.
	 * @see #isIsStrandFill()
	 * @generated
	 */
	void setIsStrandFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Jacket Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Jacket Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind
	 * @see #setOuterJacketKind(CableOuterJacketKind)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_OuterJacketKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of outer jacket of this cable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of outer jacket of this cable.'"
	 * @generated
	 */
	CableOuterJacketKind getOuterJacketKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Jacket Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableOuterJacketKind
	 * @see #getOuterJacketKind()
	 * @generated
	 */
	void setOuterJacketKind(CableOuterJacketKind value);

	/**
	 * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind
	 * @see #setConstructionKind(CableConstructionKind)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_ConstructionKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of construction of this cable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of construction of this cable.'"
	 * @generated
	 */
	CableConstructionKind getConstructionKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableConstructionKind
	 * @see #getConstructionKind()
	 * @generated
	 */
	void setConstructionKind(CableConstructionKind value);

	/**
	 * Returns the value of the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Screen</em>' attribute.
	 * @see #setDiameterOverScreen(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_DiameterOverScreen()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter over the outer screen; should be the shield\'s inside diameter..'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter over the outer screen; should be the shield\'s inside diameter..'"
	 * @generated
	 */
	float getDiameterOverScreen();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Screen</em>' attribute.
	 * @see #getDiameterOverScreen()
	 * @generated
	 */
	void setDiameterOverScreen(float value);

	/**
	 * Returns the value of the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Temperature</em>' attribute.
	 * @see #setNominalTemperature(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_NominalTemperature()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum nominal design operating temperature.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum nominal design operating temperature.'"
	 * @generated
	 */
	float getNominalTemperature();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Temperature</em>' attribute.
	 * @see #getNominalTemperature()
	 * @generated
	 */
	void setNominalTemperature(float value);

	/**
	 * Returns the value of the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Jacket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Jacket</em>' attribute.
	 * @see #setDiameterOverJacket(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_DiameterOverJacket()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter over the outermost jacketing layer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter over the outermost jacketing layer.'"
	 * @generated
	 */
	float getDiameterOverJacket();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Jacket</em>' attribute.
	 * @see #getDiameterOverJacket()
	 * @generated
	 */
	void setDiameterOverJacket(float value);

	/**
	 * Returns the value of the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Core</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Core</em>' attribute.
	 * @see #setDiameterOverCore(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_DiameterOverCore()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter over the core, including any semi-con screen; should be the insulating layer\'s inside diameter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter over the core, including any semi-con screen; should be the insulating layer\'s inside diameter.'"
	 * @generated
	 */
	float getDiameterOverCore();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Core</em>' attribute.
	 * @see #getDiameterOverCore()
	 * @generated
	 */
	void setDiameterOverCore(float value);

	/**
	 * Returns the value of the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Insulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Insulation</em>' attribute.
	 * @see #setDiameterOverInsulation(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_DiameterOverInsulation()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter over the insulating layer, excluding outer screen.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter over the insulating layer, excluding outer screen.'"
	 * @generated
	 */
	float getDiameterOverInsulation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Insulation</em>' attribute.
	 * @see #getDiameterOverInsulation()
	 * @generated
	 */
	void setDiameterOverInsulation(float value);

	/**
	 * Returns the value of the '<em><b>Shield Material</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shield Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shield Material</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind
	 * @see #setShieldMaterial(CableShieldMaterialKind)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_ShieldMaterial()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Material of the shield.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Material of the shield.'"
	 * @generated
	 */
	CableShieldMaterialKind getShieldMaterial();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shield Material</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableShieldMaterialKind
	 * @see #getShieldMaterial()
	 * @generated
	 */
	void setShieldMaterial(CableShieldMaterialKind value);

	/**
	 * Returns the value of the '<em><b>Duct Bank Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getCableInfos <em>Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct Bank Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct Bank Info</em>' reference.
	 * @see #setDuctBankInfo(DuctInfo)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getCableInfo_DuctBankInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getCableInfos
	 * @model opposite="CableInfos"
	 * @generated
	 */
	DuctInfo getDuctBankInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct Bank Info</em>' reference.
	 * @see #getDuctBankInfo()
	 * @generated
	 */
	void setDuctBankInfo(DuctInfo value);

} // CableInfo
