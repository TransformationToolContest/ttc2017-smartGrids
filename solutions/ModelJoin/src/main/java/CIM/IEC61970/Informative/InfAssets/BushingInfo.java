/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61970.Core.Terminal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bushing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getInsulationKind <em>Insulation Kind</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of bushing asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of bushing asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of bushing asset.' Profile\040documentation='Properties of bushing asset.'"
 * @generated
 */
public interface BushingInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>C2 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C2 Power Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C2 Power Factor</em>' attribute.
	 * @see #setC2PowerFactor(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_C2PowerFactor()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Factory measured insulation power factor, measured between the power factor tap and ground.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Factory measured insulation power factor, measured between the power factor tap and ground.'"
	 * @generated
	 */
	float getC2PowerFactor();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2PowerFactor <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2 Power Factor</em>' attribute.
	 * @see #getC2PowerFactor()
	 * @generated
	 */
	void setC2PowerFactor(float value);

	/**
	 * Returns the value of the '<em><b>Bushing Insulation PFs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.BushingInsulationPF}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Insulation PFs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Insulation PFs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_BushingInsulationPFs()
	 * @see CIM.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo
	 * @model opposite="BushingInfo"
	 * @generated
	 */
	EList<BushingInsulationPF> getBushingInsulationPFs();

	/**
	 * Returns the value of the '<em><b>C2 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C2 Capacitance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C2 Capacitance</em>' attribute.
	 * @see #setC2Capacitance(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_C2Capacitance()
	 * @model dataType="CIM.IEC61970.Domain.Capacitance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Factory measured capacitance measured between the power factor tap and ground.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Factory measured capacitance measured between the power factor tap and ground.'"
	 * @generated
	 */
	float getC2Capacitance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC2Capacitance <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2 Capacitance</em>' attribute.
	 * @see #getC2Capacitance()
	 * @generated
	 */
	void setC2Capacitance(float value);

	/**
	 * Returns the value of the '<em><b>C1 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C1 Capacitance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C1 Capacitance</em>' attribute.
	 * @see #setC1Capacitance(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_C1Capacitance()
	 * @model dataType="CIM.IEC61970.Domain.Capacitance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Factory measured capacitance, measured between the power factor tap and the bushing conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Factory measured capacitance, measured between the power factor tap and the bushing conductor.'"
	 * @generated
	 */
	float getC1Capacitance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1Capacitance <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C1 Capacitance</em>' attribute.
	 * @see #getC1Capacitance()
	 * @generated
	 */
	void setC1Capacitance(float value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_Terminal()
	 * @see CIM.IEC61970.Core.Terminal#getBushingInfo
	 * @model opposite="BushingInfo"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>C1 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C1 Power Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C1 Power Factor</em>' attribute.
	 * @see #setC1PowerFactor(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_C1PowerFactor()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Factory measured insulation power factor, measured between the power factor tap and the bushing conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Factory measured insulation power factor, measured between the power factor tap and the bushing conductor.'"
	 * @generated
	 */
	float getC1PowerFactor();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getC1PowerFactor <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C1 Power Factor</em>' attribute.
	 * @see #getC1PowerFactor()
	 * @generated
	 */
	void setC1PowerFactor(float value);

	/**
	 * Returns the value of the '<em><b>Insulation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.BushingInsulationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @see #setInsulationKind(BushingInsulationKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInfo_InsulationKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of insulation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of insulation.'"
	 * @generated
	 */
	BushingInsulationKind getInsulationKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.BushingInfo#getInsulationKind <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @see #getInsulationKind()
	 * @generated
	 */
	void setInsulationKind(BushingInsulationKind value);

} // BushingInfo
