/**
 */
package CIM.IEC61968.WiresExt;

import CIM.IEC61968.AssetModels.WindingInfo;

import CIM.IEC61970.Core.ConductingEquipment;

import CIM.IEC61970.Informative.InfAssets.WindingInsulation;

import CIM.IEC61970.Wires.PhaseTapChanger;
import CIM.IEC61970.Wires.RatioTapChanger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Transformer Winding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getFromWindingInsulations <em>From Winding Insulations</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getXground <em>Xground</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPiImpedance <em>Pi Impedance</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRground <em>Rground</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getToWindingInsulations <em>To Winding Insulations</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getWindingInfo <em>Winding Info</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conducting connection point of a distribution / unbalanced transformer winding instance.\nThis class differs from Wires::TransformerWinding as follows:\n- the eight Pi model attributes are moved into separate class, that can be optionally referred to from several winding instances.\n- the three grounding attributes can differ per winding instance, even for windings that use the same TransformerInfo, so they are kept on DistributionTransformerWinding.\n- \'windingType\' attribute is replaced by \'sequenceNumber\' attribute on WindingInfo class.\n- all the other attributes come from the WindingInfo (and its relationships). TransformerInfo is associated to the DistributionTransformer as referenceable data, so it can be defined once and referred to from instances, instead of being specified with each instance.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Conducting connection point of a distribution / unbalanced transformer winding instance.\nThis class differs from Wires::TransformerWinding as follows:\n- the eight Pi model attributes are moved into separate class, that can be optionally referred to from several winding instances.\n- the three grounding attributes can differ per winding instance, even for windings that use the same TransformerInfo, so they are kept on DistributionTransformerWinding.\n- \'windingType\' attribute is replaced by \'sequenceNumber\' attribute on WindingInfo class.\n- all the other attributes come from the WindingInfo (and its relationships). TransformerInfo is associated to the DistributionTransformer as referenceable data, so it can be defined once and referred to from instances, instead of being specified with each instance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conducting connection point of a distribution / unbalanced transformer winding instance.\nThis class differs from Wires::TransformerWinding as follows:\n- the eight Pi model attributes are moved into separate class, that can be optionally referred to from several winding instances.\n- the three grounding attributes can differ per winding instance, even for windings that use the same TransformerInfo, so they are kept on DistributionTransformerWinding.\n- \'windingType\' attribute is replaced by \'sequenceNumber\' attribute on WindingInfo class.\n- all the other attributes come from the WindingInfo (and its relationships). TransformerInfo is associated to the DistributionTransformer as referenceable data, so it can be defined once and referred to from instances, instead of being specified with each instance.' Profile\040documentation='Conducting connection point of a distribution / unbalanced transformer winding instance.\nThis class differs from Wires::TransformerWinding as follows:\n- the eight Pi model attributes are moved into separate class, that can be optionally referred to from several winding instances.\n- the three grounding attributes can differ per winding instance, even for windings that use the same TransformerInfo, so they are kept on DistributionTransformerWinding.\n- \'windingType\' attribute is replaced by \'sequenceNumber\' attribute on WindingInfo class.\n- all the other attributes come from the WindingInfo (and its relationships). TransformerInfo is associated to the DistributionTransformer as referenceable data, so it can be defined once and referred to from instances, instead of being specified with each instance.'"
 * @generated
 */
public interface DistributionTransformerWinding extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>From Winding Insulations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Winding Insulations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Winding Insulations</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_FromWindingInsulations()
	 * @see CIM.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding
	 * @model opposite="FromWinding"
	 * @generated
	 */
	EList<WindingInsulation> getFromWindingInsulations();

	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.RatioTapChanger#getWinding <em>Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #setRatioTapChanger(RatioTapChanger)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_RatioTapChanger()
	 * @see CIM.IEC61970.Wires.RatioTapChanger#getWinding
	 * @model opposite="Winding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio tap changer associated with this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio tap changer associated with this winding.'"
	 * @generated
	 */
	RatioTapChanger getRatioTapChanger();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	void setRatioTapChanger(RatioTapChanger value);

	/**
	 * Returns the value of the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded</em>' attribute.
	 * @see #setGrounded(boolean)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_Grounded()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(for Yn and Zn connections) True if the neutral is solidly grounded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(for Yn and Zn connections) True if the neutral is solidly grounded.'"
	 * @generated
	 */
	boolean isGrounded();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded</em>' attribute.
	 * @see #isGrounded()
	 * @generated
	 */
	void setGrounded(boolean value);

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.PhaseTapChanger#getWinding <em>Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #setPhaseTapChanger(PhaseTapChanger)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_PhaseTapChanger()
	 * @see CIM.IEC61970.Wires.PhaseTapChanger#getWinding
	 * @model opposite="Winding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase tap changer associated with this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase tap changer associated with this winding.'"
	 * @generated
	 */
	PhaseTapChanger getPhaseTapChanger();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	void setPhaseTapChanger(PhaseTapChanger value);

	/**
	 * Returns the value of the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xground</em>' attribute.
	 * @see #setXground(float)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_Xground()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(for Yn and Zn connections) Reactive part of neutral impedance where \'grounded\' is true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(for Yn and Zn connections) Reactive part of neutral impedance where \'grounded\' is true.'"
	 * @generated
	 */
	float getXground();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getXground <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xground</em>' attribute.
	 * @see #getXground()
	 * @generated
	 */
	void setXground(float value);

	/**
	 * Returns the value of the '<em><b>Pi Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.WindingPiImpedance#getWindings <em>Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pi Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pi Impedance</em>' reference.
	 * @see #setPiImpedance(WindingPiImpedance)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_PiImpedance()
	 * @see CIM.IEC61968.WiresExt.WindingPiImpedance#getWindings
	 * @model opposite="Windings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(accurate for 2- or 3-winding transformers only) Pi-model impedances of this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(accurate for 2- or 3-winding transformers only) Pi-model impedances of this winding.'"
	 * @generated
	 */
	WindingPiImpedance getPiImpedance();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getPiImpedance <em>Pi Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pi Impedance</em>' reference.
	 * @see #getPiImpedance()
	 * @generated
	 */
	void setPiImpedance(WindingPiImpedance value);

	/**
	 * Returns the value of the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rground</em>' attribute.
	 * @see #setRground(float)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_Rground()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(for Yn and Zn connections) Resistance part of neutral impedance where \'grounded\' is true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(for Yn and Zn connections) Resistance part of neutral impedance where \'grounded\' is true.'"
	 * @generated
	 */
	float getRground();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRground <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rground</em>' attribute.
	 * @see #getRground()
	 * @generated
	 */
	void setRground(float value);

	/**
	 * Returns the value of the '<em><b>To Winding Insulations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding Insulations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding Insulations</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_ToWindingInsulations()
	 * @see CIM.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding
	 * @model opposite="ToWinding"
	 * @generated
	 */
	EList<WindingInsulation> getToWindingInsulations();

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformer#getWindings <em>Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' reference.
	 * @see #setTransformer(DistributionTransformer)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_Transformer()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformer#getWindings
	 * @model opposite="Windings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transformer this winding belongs to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transformer this winding belongs to.'"
	 * @generated
	 */
	DistributionTransformer getTransformer();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getTransformer <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' reference.
	 * @see #getTransformer()
	 * @generated
	 */
	void setTransformer(DistributionTransformer value);

	/**
	 * Returns the value of the '<em><b>Winding Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.WindingInfo#getWindings <em>Windings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Info</em>' reference.
	 * @see #setWindingInfo(WindingInfo)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformerWinding_WindingInfo()
	 * @see CIM.IEC61968.AssetModels.WindingInfo#getWindings
	 * @model opposite="Windings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Data for this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Data for this winding.'"
	 * @generated
	 */
	WindingInfo getWindingInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getWindingInfo <em>Winding Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Info</em>' reference.
	 * @see #getWindingInfo()
	 * @generated
	 */
	void setWindingInfo(WindingInfo value);

} // DistributionTransformerWinding
