/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Reserve Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getRaiseRegMarginReqt <em>Raise Reg Margin Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getReserveEnergyTransaction <em>Reserve Energy Transaction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getHostControlAreas <em>Host Control Areas</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getAreaReserveSpecName <em>Area Reserve Spec Name</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getOpReserveReqt <em>Op Reserve Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getLowerRegMarginReqt <em>Lower Reg Margin Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getPrimaryReserveReqt <em>Primary Reserve Reqt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getSpinningReserveReqt <em>Spinning Reserve Reqt</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control area\'s reserve specification'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The control area\'s reserve specification'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area\'s reserve specification' Profile\040documentation='The control area\'s reserve specification'"
 * @generated
 */
public interface AreaReserveSpec extends Element {
	/**
	 * Returns the value of the '<em><b>Raise Reg Margin Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise Reg Margin Reqt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise Reg Margin Reqt</em>' attribute.
	 * @see #setRaiseRegMarginReqt(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_RaiseRegMarginReqt()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Raise active power regulating margin requirement, the amount of generation that can be picked up by control in 10 minutes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Raise active power regulating margin requirement, the amount of generation that can be picked up by control in 10 minutes'"
	 * @generated
	 */
	float getRaiseRegMarginReqt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getRaiseRegMarginReqt <em>Raise Reg Margin Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raise Reg Margin Reqt</em>' attribute.
	 * @see #getRaiseRegMarginReqt()
	 * @generated
	 */
	void setRaiseRegMarginReqt(float value);

	/**
	 * Returns the value of the '<em><b>Reserve Energy Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.Reserve#getAreaReserveSpec <em>Area Reserve Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Energy Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Energy Transaction</em>' reference.
	 * @see #setReserveEnergyTransaction(Reserve)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_ReserveEnergyTransaction()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Reserve#getAreaReserveSpec
	 * @model opposite="AreaReserveSpec"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Reserve type of energy transaction can count towards an area reserve specification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Reserve type of energy transaction can count towards an area reserve specification.'"
	 * @generated
	 */
	Reserve getReserveEnergyTransaction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getReserveEnergyTransaction <em>Reserve Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Energy Transaction</em>' reference.
	 * @see #getReserveEnergyTransaction()
	 * @generated
	 */
	void setReserveEnergyTransaction(Reserve value);

	/**
	 * Returns the value of the '<em><b>Host Control Areas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaReserveSpec <em>Area Reserve Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Control Areas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Control Areas</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_HostControlAreas()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getAreaReserveSpec
	 * @model opposite="AreaReserveSpec"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area has one or more area reserve specifications'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area has one or more area reserve specifications'"
	 * @generated
	 */
	EList<HostControlArea> getHostControlAreas();

	/**
	 * Returns the value of the '<em><b>Area Reserve Spec Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Reserve Spec Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Reserve Spec Name</em>' attribute.
	 * @see #setAreaReserveSpecName(String)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_AreaReserveSpecName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Identification or name of the control area\'s reserve specification. A particular specification could correspond to pre-defined power system conditions, e.g., emergency situations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Identification or name of the control area\'s reserve specification. A particular specification could correspond to pre-defined power system conditions, e.g., emergency situations.'"
	 * @generated
	 */
	String getAreaReserveSpecName();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getAreaReserveSpecName <em>Area Reserve Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Reserve Spec Name</em>' attribute.
	 * @see #getAreaReserveSpecName()
	 * @generated
	 */
	void setAreaReserveSpecName(String value);

	/**
	 * Returns the value of the '<em><b>Op Reserve Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Reserve Reqt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Reserve Reqt</em>' attribute.
	 * @see #setOpReserveReqt(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_OpReserveReqt()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operating active power reserve requirement, where operating reserve is the generating capability that is fully available within 30 minutes. Operating reserve is composed of primary reserve (t less than 10 min) and secondary reserve (10 less than t less than 30 min).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operating active power reserve requirement, where operating reserve is the generating capability that is fully available within 30 minutes. Operating reserve is composed of primary reserve (t less than 10 min) and secondary reserve (10 less than t less than 30 min).'"
	 * @generated
	 */
	float getOpReserveReqt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getOpReserveReqt <em>Op Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Reserve Reqt</em>' attribute.
	 * @see #getOpReserveReqt()
	 * @generated
	 */
	void setOpReserveReqt(float value);

	/**
	 * Returns the value of the '<em><b>Lower Reg Margin Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Reg Margin Reqt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Reg Margin Reqt</em>' attribute.
	 * @see #setLowerRegMarginReqt(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_LowerRegMarginReqt()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Lower active power regulating margin requirement, the amount of generation that can be dropped by control in 10 minutes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Lower active power regulating margin requirement, the amount of generation that can be dropped by control in 10 minutes'"
	 * @generated
	 */
	float getLowerRegMarginReqt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getLowerRegMarginReqt <em>Lower Reg Margin Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Reg Margin Reqt</em>' attribute.
	 * @see #getLowerRegMarginReqt()
	 * @generated
	 */
	void setLowerRegMarginReqt(float value);

	/**
	 * Returns the value of the '<em><b>Primary Reserve Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Reserve Reqt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Reserve Reqt</em>' attribute.
	 * @see #setPrimaryReserveReqt(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_PrimaryReserveReqt()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Primary active power reserve requirement, where primary reserve is generating capability that is fully available within 10 minutes. Primary reserve is composed of spinning reserve and quick-start reserve.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Primary active power reserve requirement, where primary reserve is generating capability that is fully available within 10 minutes. Primary reserve is composed of spinning reserve and quick-start reserve.'"
	 * @generated
	 */
	float getPrimaryReserveReqt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getPrimaryReserveReqt <em>Primary Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Reserve Reqt</em>' attribute.
	 * @see #getPrimaryReserveReqt()
	 * @generated
	 */
	void setPrimaryReserveReqt(float value);

	/**
	 * Returns the value of the '<em><b>Spinning Reserve Reqt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spinning Reserve Reqt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spinning Reserve Reqt</em>' attribute.
	 * @see #setSpinningReserveReqt(float)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getAreaReserveSpec_SpinningReserveReqt()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Spinning active power reserve requirement, spinning reserve is generating capability that is presently synchronized to the network and is fully available within 10 minutes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Spinning active power reserve requirement, spinning reserve is generating capability that is presently synchronized to the network and is fully available within 10 minutes'"
	 * @generated
	 */
	float getSpinningReserveReqt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.AreaReserveSpec#getSpinningReserveReqt <em>Spinning Reserve Reqt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spinning Reserve Reqt</em>' attribute.
	 * @see #getSpinningReserveReqt()
	 * @generated
	 */
	void setSpinningReserveReqt(float value);

} // AreaReserveSpec
