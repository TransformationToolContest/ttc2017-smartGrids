/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntCompensatorInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of shunt capacitor, shunt reactor or switchable bank of shunt capacitor or reactor assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of shunt capacitor, shunt reactor or switchable bank of shunt capacitor or reactor assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of shunt capacitor, shunt reactor or switchable bank of shunt capacitor or reactor assets.' Profile\040documentation='Properties of shunt capacitor, shunt reactor or switchable bank of shunt capacitor or reactor assets.'"
 * @generated
 */
public interface ShuntCompensatorInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Shunt Impedance Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Impedance Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Impedance Info</em>' reference.
	 * @see #setShuntImpedanceInfo(ShuntImpedanceInfo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntCompensatorInfo_ShuntImpedanceInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos
	 * @model opposite="ShuntCompensatorInfos"
	 * @generated
	 */
	ShuntImpedanceInfo getShuntImpedanceInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt Impedance Info</em>' reference.
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	void setShuntImpedanceInfo(ShuntImpedanceInfo value);

	/**
	 * Returns the value of the '<em><b>Max Power Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Loss</em>' attribute.
	 * @see #setMaxPowerLoss(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntCompensatorInfo_MaxPowerLoss()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum allowed Apparent Power loss'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum allowed Apparent Power loss'"
	 * @generated
	 */
	float getMaxPowerLoss();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Loss</em>' attribute.
	 * @see #getMaxPowerLoss()
	 * @generated
	 */
	void setMaxPowerLoss(float value);

} // ShuntCompensatorInfo
