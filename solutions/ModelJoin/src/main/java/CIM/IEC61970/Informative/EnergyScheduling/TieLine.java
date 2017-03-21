/**
 */
package CIM.IEC61970.Informative.EnergyScheduling;

import CIM.Element;

import CIM.IEC61970.Informative.Financial.ControlAreaOperator;
import CIM.IEC61970.Informative.Financial.CustomerConsumer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getDynamicEnergyTransaction <em>Dynamic Energy Transaction</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getCustomerConsumer <em>Customer Consumer</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_SubControlArea <em>Side ASub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_HostControlArea <em>Side BHost Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_SubControlArea <em>Side BSub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_HostControlArea <em>Side AHost Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getControlAreaOperators <em>Control Area Operators</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine()
 * @model
 * @generated
 */
public interface TieLine extends Element {
	/**
	 * Returns the value of the '<em><b>Dynamic Energy Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.Dynamic#getTieLines <em>Tie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Energy Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Energy Transaction</em>' reference.
	 * @see #setDynamicEnergyTransaction(Dynamic)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_DynamicEnergyTransaction()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.Dynamic#getTieLines
	 * @model opposite="TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A dynamic energy transaction can act as a pseudo tie line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A dynamic energy transaction can act as a pseudo tie line.'"
	 * @generated
	 */
	Dynamic getDynamicEnergyTransaction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getDynamicEnergyTransaction <em>Dynamic Energy Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Energy Transaction</em>' reference.
	 * @see #getDynamicEnergyTransaction()
	 * @generated
	 */
	void setDynamicEnergyTransaction(Dynamic value);

	/**
	 * Returns the value of the '<em><b>Customer Consumer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.CustomerConsumer#getTieLines <em>Tie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Consumer</em>' reference.
	 * @see #setCustomerConsumer(CustomerConsumer)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_CustomerConsumer()
	 * @see CIM.IEC61970.Informative.Financial.CustomerConsumer#getTieLines
	 * @model opposite="TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A CustomerConsumer may ring its perimeter with metering, which can create a unique SubControlArea at the collection of metering points, called a TieLine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A CustomerConsumer may ring its perimeter with metering, which can create a unique SubControlArea at the collection of metering points, called a TieLine.'"
	 * @generated
	 */
	CustomerConsumer getCustomerConsumer();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getCustomerConsumer <em>Customer Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Consumer</em>' reference.
	 * @see #getCustomerConsumer()
	 * @generated
	 */
	void setCustomerConsumer(CustomerConsumer value);

	/**
	 * Returns the value of the '<em><b>Side ASub Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideA_TieLines <em>Side ATie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side ASub Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side ASub Control Area</em>' reference.
	 * @see #setSideA_SubControlArea(SubControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_SideA_SubControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideA_TieLines
	 * @model opposite="SideA_TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SubControlArea is on the A side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubControlArea is on the A side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 * @generated
	 */
	SubControlArea getSideA_SubControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_SubControlArea <em>Side ASub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side ASub Control Area</em>' reference.
	 * @see #getSideA_SubControlArea()
	 * @generated
	 */
	void setSideA_SubControlArea(SubControlArea value);

	/**
	 * Returns the value of the '<em><b>Side BHost Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideB_TieLines <em>Side BTie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side BHost Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side BHost Control Area</em>' reference.
	 * @see #setSideB_HostControlArea(HostControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_SideB_HostControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideB_TieLines
	 * @model opposite="SideB_TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A HostControlArea can have zero or more tie lines.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A HostControlArea can have zero or more tie lines.'"
	 * @generated
	 */
	HostControlArea getSideB_HostControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_HostControlArea <em>Side BHost Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side BHost Control Area</em>' reference.
	 * @see #getSideB_HostControlArea()
	 * @generated
	 */
	void setSideB_HostControlArea(HostControlArea value);

	/**
	 * Returns the value of the '<em><b>Side BSub Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideB_TieLines <em>Side BTie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side BSub Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side BSub Control Area</em>' reference.
	 * @see #setSideB_SubControlArea(SubControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_SideB_SubControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getSideB_TieLines
	 * @model opposite="SideB_TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The SubControlArea is on the B side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The SubControlArea is on the B side of a collection of metered points which define the SubControlArea\'s boundary for a ControlAreaOperator or CustomerConsumer.'"
	 * @generated
	 */
	SubControlArea getSideB_SubControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideB_SubControlArea <em>Side BSub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side BSub Control Area</em>' reference.
	 * @see #getSideB_SubControlArea()
	 * @generated
	 */
	void setSideB_SubControlArea(SubControlArea value);

	/**
	 * Returns the value of the '<em><b>Side AHost Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideA_TieLines <em>Side ATie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side AHost Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side AHost Control Area</em>' reference.
	 * @see #setSideA_HostControlArea(HostControlArea)
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_SideA_HostControlArea()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSideA_TieLines
	 * @model opposite="SideA_TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A HostControlArea can have zero or more tie lines.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A HostControlArea can have zero or more tie lines.'"
	 * @generated
	 */
	HostControlArea getSideA_HostControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.EnergyScheduling.TieLine#getSideA_HostControlArea <em>Side AHost Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side AHost Control Area</em>' reference.
	 * @see #getSideA_HostControlArea()
	 * @generated
	 */
	void setSideA_HostControlArea(HostControlArea value);

	/**
	 * Returns the value of the '<em><b>Control Area Operators</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.Financial.ControlAreaOperator}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getTieLines <em>Tie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Operators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Operators</em>' reference list.
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getTieLine_ControlAreaOperators()
	 * @see CIM.IEC61970.Informative.Financial.ControlAreaOperator#getTieLines
	 * @model opposite="TieLines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ControlAreaOperator has a collection of tie points that ring the ControlArea, called a TieLine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ControlAreaOperator has a collection of tie points that ring the ControlArea, called a TieLine.'"
	 * @generated
	 */
	EList<ControlAreaOperator> getControlAreaOperators();

} // TieLine
