/**
 */
package CIM.IEC61968.WiresExt;

import CIM.IEC61970.Core.Equipment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.TransformerBank#getVectorGroup <em>Vector Group</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.TransformerBank#getTransformers <em>Transformers</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getTransformerBank()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An assembly of transformers that are connected together. For three-phase transformers, there would be one transformer per bank. For banks of single-phase transformers, there will be more than one transformer per bank, and they need not be identical.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An assembly of transformers that are connected together. For three-phase transformers, there would be one transformer per bank. For banks of single-phase transformers, there will be more than one transformer per bank, and they need not be identical.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An assembly of transformers that are connected together. For three-phase transformers, there would be one transformer per bank. For banks of single-phase transformers, there will be more than one transformer per bank, and they need not be identical.' Profile\040documentation='An assembly of transformers that are connected together. For three-phase transformers, there would be one transformer per bank. For banks of single-phase transformers, there will be more than one transformer per bank, and they need not be identical.'"
 * @generated
 */
public interface TransformerBank extends Equipment {
	/**
	 * Returns the value of the '<em><b>Vector Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Group</em>' attribute.
	 * @see #setVectorGroup(String)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getTransformerBank_VectorGroup()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Vector group of the bank for protective relaying, e.g., Dyn1. For unbalanced transformers, this may not be simply determined from the constituent winding connections.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Vector group of the bank for protective relaying, e.g., Dyn1. For unbalanced transformers, this may not be simply determined from the constituent winding connections.'"
	 * @generated
	 */
	String getVectorGroup();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.TransformerBank#getVectorGroup <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Group</em>' attribute.
	 * @see #getVectorGroup()
	 * @generated
	 */
	void setVectorGroup(String value);

	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.WiresExt.DistributionTransformer}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerBank <em>Transformer Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformers</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getTransformerBank_Transformers()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerBank
	 * @model opposite="TransformerBank"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All transformers that belong to this bank.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All transformers that belong to this bank.'"
	 * @generated
	 */
	EList<DistributionTransformer> getTransformers();

} // TransformerBank
