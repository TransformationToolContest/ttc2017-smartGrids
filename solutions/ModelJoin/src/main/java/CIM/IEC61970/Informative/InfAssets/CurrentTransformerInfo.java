/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61970.Informative.InfCommon.Ratio;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio <em>Max Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of current transformer asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of current transformer asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of current transformer asset.' Profile\040documentation='Properties of current transformer asset.'"
 * @generated
 */
public interface CurrentTransformerInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Class</em>' attribute.
	 * @see #setAccuracyClass(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_AccuracyClass()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='CT accuracy classification'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='CT accuracy classification'"
	 * @generated
	 */
	String getAccuracyClass();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Class</em>' attribute.
	 * @see #getAccuracyClass()
	 * @generated
	 */
	void setAccuracyClass(String value);

	/**
	 * Returns the value of the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Class</em>' attribute.
	 * @see #setCtClass(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_CtClass()
	 * @model required="true"
	 * @generated
	 */
	String getCtClass();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Class</em>' attribute.
	 * @see #getCtClass()
	 * @generated
	 */
	void setCtClass(String value);

	/**
	 * Returns the value of the '<em><b>Max Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ratio</em>' reference.
	 * @see #setMaxRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_MaxRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum ratio between the primary and secondary current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum ratio between the primary and secondary current.'"
	 * @generated
	 */
	Ratio getMaxRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio <em>Max Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ratio</em>' reference.
	 * @see #getMaxRatio()
	 * @generated
	 */
	void setMaxRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Primary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ratio</em>' reference.
	 * @see #setPrimaryRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_PrimaryRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio for the primary winding tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio for the primary winding tap changer.'"
	 * @generated
	 */
	Ratio getPrimaryRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ratio</em>' reference.
	 * @see #getPrimaryRatio()
	 * @generated
	 */
	void setPrimaryRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Core Burden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Burden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Burden</em>' attribute.
	 * @see #setCoreBurden(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_CoreBurden()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power burden of the CT core'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power burden of the CT core'"
	 * @generated
	 */
	float getCoreBurden();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Burden</em>' attribute.
	 * @see #getCoreBurden()
	 * @generated
	 */
	void setCoreBurden(float value);

	/**
	 * Returns the value of the '<em><b>Primary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Fls Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Fls Rating</em>' attribute.
	 * @see #setPrimaryFlsRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_PrimaryFlsRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Full load secondary (FLS) rating for primary winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Full load secondary (FLS) rating for primary winding.'"
	 * @generated
	 */
	float getPrimaryFlsRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Fls Rating</em>' attribute.
	 * @see #getPrimaryFlsRating()
	 * @generated
	 */
	void setPrimaryFlsRating(float value);

	/**
	 * Returns the value of the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #setAccuracyLimit(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_AccuracyLimit()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 * @generated
	 */
	float getAccuracyLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #getAccuracyLimit()
	 * @generated
	 */
	void setAccuracyLimit(float value);

	/**
	 * Returns the value of the '<em><b>Knee Point Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knee Point Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knee Point Current</em>' attribute.
	 * @see #setKneePointCurrent(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_KneePointCurrent()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum primary current where the CT still displays linear characteristicts.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum primary current where the CT still displays linear characteristicts.'"
	 * @generated
	 */
	float getKneePointCurrent();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knee Point Current</em>' attribute.
	 * @see #getKneePointCurrent()
	 * @generated
	 */
	void setKneePointCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Tertiary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tertiary Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary Ratio</em>' reference.
	 * @see #setTertiaryRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_TertiaryRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio for the tertiary winding tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio for the tertiary winding tap changer.'"
	 * @generated
	 */
	Ratio getTertiaryRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary Ratio</em>' reference.
	 * @see #getTertiaryRatio()
	 * @generated
	 */
	void setTertiaryRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Nominal Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Ratio</em>' reference.
	 * @see #setNominalRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_NominalRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nominal ratio between the primary and secondary current; i.e. 100:5'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nominal ratio between the primary and secondary current; i.e. 100:5'"
	 * @generated
	 */
	Ratio getNominalRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Ratio</em>' reference.
	 * @see #getNominalRatio()
	 * @generated
	 */
	void setNominalRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_Usage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='eg. metering, protection, etc'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='eg. metering, protection, etc'"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Secondary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Fls Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Fls Rating</em>' attribute.
	 * @see #setSecondaryFlsRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_SecondaryFlsRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Full load secondary (FLS) rating for secondary winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Full load secondary (FLS) rating for secondary winding.'"
	 * @generated
	 */
	float getSecondaryFlsRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Fls Rating</em>' attribute.
	 * @see #getSecondaryFlsRating()
	 * @generated
	 */
	void setSecondaryFlsRating(float value);

	/**
	 * Returns the value of the '<em><b>Tertiary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tertiary Fls Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary Fls Rating</em>' attribute.
	 * @see #setTertiaryFlsRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_TertiaryFlsRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Full load secondary (FLS) rating for tertiary winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Full load secondary (FLS) rating for tertiary winding.'"
	 * @generated
	 */
	float getTertiaryFlsRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary Fls Rating</em>' attribute.
	 * @see #getTertiaryFlsRating()
	 * @generated
	 */
	void setTertiaryFlsRating(float value);

	/**
	 * Returns the value of the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Count</em>' attribute.
	 * @see #setCoreCount(int)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_CoreCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of cores.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of cores.'"
	 * @generated
	 */
	int getCoreCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Count</em>' attribute.
	 * @see #getCoreCount()
	 * @generated
	 */
	void setCoreCount(int value);

	/**
	 * Returns the value of the '<em><b>Knee Point Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knee Point Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knee Point Voltage</em>' attribute.
	 * @see #setKneePointVoltage(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_KneePointVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum voltage across the secondary terminals where the CT still displays linear characteristicts.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum voltage across the secondary terminals where the CT still displays linear characteristicts.'"
	 * @generated
	 */
	float getKneePointVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knee Point Voltage</em>' attribute.
	 * @see #getKneePointVoltage()
	 * @generated
	 */
	void setKneePointVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Secondary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Ratio</em>' reference.
	 * @see #setSecondaryRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo_SecondaryRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio for the secondary winding tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio for the secondary winding tap changer.'"
	 * @generated
	 */
	Ratio getSecondaryRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Ratio</em>' reference.
	 * @see #getSecondaryRatio()
	 * @generated
	 */
	void setSecondaryRatio(Ratio value);

} // CurrentTransformerInfo
