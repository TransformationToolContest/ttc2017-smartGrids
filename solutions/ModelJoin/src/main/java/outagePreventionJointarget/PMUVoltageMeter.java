/**
 */
package outagePreventionJointarget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMU Voltage Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getMRID <em>MRID</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageAMag <em>Voltage AMag</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageAAng <em>Voltage AAng</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageBMag <em>Voltage BMag</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageBAng <em>Voltage BAng</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageCMag <em>Voltage CMag</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageCAng <em>Voltage CAng</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutMag <em>Voltage Neut Mag</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutAng <em>Voltage Neut Ang</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNetMag <em>Voltage Net Mag</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNetAng <em>Voltage Net Ang</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageResMag <em>Voltage Res Mag</em>}</li>
 *   <li>{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageResAng <em>Voltage Res Ang</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy order='1' operator='thetajoin' condition='CIM.IEC61968.Metering.MeterAsset = substationStandard.LNNodes.LNGroupM.MMXU.NamePlt.IdNs'"
 * @generated
 */
public interface PMUVoltageMeter extends Asset, EndDeviceAsset {
	/**
	 * Returns the value of the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRID</em>' attribute.
	 * @see #setMRID(String)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_MRID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepattributes'"
	 * @generated
	 */
	String getMRID();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getMRID <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRID</em>' attribute.
	 * @see #getMRID()
	 * @generated
	 */
	void setMRID(String value);

	/**
	 * Returns the value of the '<em><b>Voltage AMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage AMag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage AMag</em>' attribute.
	 * @see #setVoltageAMag(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageAMag()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsA.cVal.mag.f'"
	 * @generated
	 */
	double getVoltageAMag();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageAMag <em>Voltage AMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage AMag</em>' attribute.
	 * @see #getVoltageAMag()
	 * @generated
	 */
	void setVoltageAMag(double value);

	/**
	 * Returns the value of the '<em><b>Voltage AAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage AAng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage AAng</em>' attribute.
	 * @see #setVoltageAAng(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageAAng()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsA.cVal.ang.f'"
	 * @generated
	 */
	double getVoltageAAng();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageAAng <em>Voltage AAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage AAng</em>' attribute.
	 * @see #getVoltageAAng()
	 * @generated
	 */
	void setVoltageAAng(double value);

	/**
	 * Returns the value of the '<em><b>Voltage BMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage BMag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage BMag</em>' attribute.
	 * @see #setVoltageBMag(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageBMag()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsB.cVal.mag.f'"
	 * @generated
	 */
	double getVoltageBMag();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageBMag <em>Voltage BMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage BMag</em>' attribute.
	 * @see #getVoltageBMag()
	 * @generated
	 */
	void setVoltageBMag(double value);

	/**
	 * Returns the value of the '<em><b>Voltage BAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage BAng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage BAng</em>' attribute.
	 * @see #setVoltageBAng(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageBAng()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsB.cVal.ang.f'"
	 * @generated
	 */
	double getVoltageBAng();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageBAng <em>Voltage BAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage BAng</em>' attribute.
	 * @see #getVoltageBAng()
	 * @generated
	 */
	void setVoltageBAng(double value);

	/**
	 * Returns the value of the '<em><b>Voltage CMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage CMag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage CMag</em>' attribute.
	 * @see #setVoltageCMag(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageCMag()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsC.cVal.mag.f'"
	 * @generated
	 */
	double getVoltageCMag();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageCMag <em>Voltage CMag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage CMag</em>' attribute.
	 * @see #getVoltageCMag()
	 * @generated
	 */
	void setVoltageCMag(double value);

	/**
	 * Returns the value of the '<em><b>Voltage CAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage CAng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage CAng</em>' attribute.
	 * @see #setVoltageCAng(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageCAng()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsC.cVal.ang.f'"
	 * @generated
	 */
	double getVoltageCAng();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageCAng <em>Voltage CAng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage CAng</em>' attribute.
	 * @see #getVoltageCAng()
	 * @generated
	 */
	void setVoltageCAng(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Neut Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Neut Mag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Neut Mag</em>' attribute.
	 * @see #setVoltageNeutMag(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageNeutMag()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.neut.cVal.mag.f'"
	 * @generated
	 */
	double getVoltageNeutMag();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutMag <em>Voltage Neut Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Neut Mag</em>' attribute.
	 * @see #getVoltageNeutMag()
	 * @generated
	 */
	void setVoltageNeutMag(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Neut Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Neut Ang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Neut Ang</em>' attribute.
	 * @see #setVoltageNeutAng(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageNeutAng()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.neut.cVal.ang.f'"
	 * @generated
	 */
	double getVoltageNeutAng();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutAng <em>Voltage Neut Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Neut Ang</em>' attribute.
	 * @see #getVoltageNeutAng()
	 * @generated
	 */
	void setVoltageNeutAng(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Net Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Net Mag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Net Mag</em>' attribute.
	 * @see #setVoltageNetMag(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageNetMag()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.net.cVal.mag.f'"
	 * @generated
	 */
	double getVoltageNetMag();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNetMag <em>Voltage Net Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Net Mag</em>' attribute.
	 * @see #getVoltageNetMag()
	 * @generated
	 */
	void setVoltageNetMag(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Net Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Net Ang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Net Ang</em>' attribute.
	 * @see #setVoltageNetAng(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageNetAng()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.net.cVal.ang.f'"
	 * @generated
	 */
	double getVoltageNetAng();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNetAng <em>Voltage Net Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Net Ang</em>' attribute.
	 * @see #getVoltageNetAng()
	 * @generated
	 */
	void setVoltageNetAng(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Res Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Res Mag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Res Mag</em>' attribute.
	 * @see #setVoltageResMag(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageResMag()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.res.cVal.mag.f'"
	 * @generated
	 */
	double getVoltageResMag();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageResMag <em>Voltage Res Mag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Res Mag</em>' attribute.
	 * @see #getVoltageResMag()
	 * @generated
	 */
	void setVoltageResMag(double value);

	/**
	 * Returns the value of the '<em><b>Voltage Res Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Res Ang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Res Ang</em>' attribute.
	 * @see #setVoltageResAng(double)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getPMUVoltageMeter_VoltageResAng()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepcalculated' formula='substationStandard.LNNodes.LNGroupM.MMXU.PhV.res.cVal.ang.f'"
	 * @generated
	 */
	double getVoltageResAng();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageResAng <em>Voltage Res Ang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Res Ang</em>' attribute.
	 * @see #getVoltageResAng()
	 * @generated
	 */
	void setVoltageResAng(double value);

} // PMUVoltageMeter
