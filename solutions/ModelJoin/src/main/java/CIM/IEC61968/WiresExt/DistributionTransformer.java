/**
 */
package CIM.IEC61968.WiresExt;

import CIM.IEC61968.AssetModels.TransformerInfo;

import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import CIM.IEC61970.Core.Equipment;

import CIM.IEC61970.Informative.InfAssets.TransformerObservation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerBank <em>Transformer Bank</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerInfo <em>Transformer Info</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformer#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM.IEC61968.WiresExt.DistributionTransformer#getWindings <em>Windings</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An assembly of two or more coupled windings that transform electrical power between voltage levels. Supports both balanced and unbalanced winding connections.\nThis class differs from Wires::PowerTransformer as follows:\n- it is part of a TransformerBank\n- it draws parameters exclusively from TransformerInfo and its associated classes.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An assembly of two or more coupled windings that transform electrical power between voltage levels. Supports both balanced and unbalanced winding connections.\nThis class differs from Wires::PowerTransformer as follows:\n- it is part of a TransformerBank\n- it draws parameters exclusively from TransformerInfo and its associated classes.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An assembly of two or more coupled windings that transform electrical power between voltage levels. Supports both balanced and unbalanced winding connections.\nThis class differs from Wires::PowerTransformer as follows:\n- it is part of a TransformerBank\n- it draws parameters exclusively from TransformerInfo and its associated classes.' Profile\040documentation='An assembly of two or more coupled windings that transform electrical power between voltage levels. Supports both balanced and unbalanced winding connections.\nThis class differs from Wires::PowerTransformer as follows:\n- it is part of a TransformerBank\n- it draws parameters exclusively from TransformerInfo and its associated classes.'"
 * @generated
 */
public interface DistributionTransformer extends Equipment {
	/**
	 * Returns the value of the '<em><b>Transformer Bank</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.TransformerBank#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Bank</em>' reference.
	 * @see #setTransformerBank(TransformerBank)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformer_TransformerBank()
	 * @see CIM.IEC61968.WiresExt.TransformerBank#getTransformers
	 * @model opposite="Transformers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bank this transformer belongs to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bank this transformer belongs to.'"
	 * @generated
	 */
	TransformerBank getTransformerBank();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerBank <em>Transformer Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Bank</em>' reference.
	 * @see #getTransformerBank()
	 * @generated
	 */
	void setTransformerBank(TransformerBank value);

	/**
	 * Returns the value of the '<em><b>Transformer Observations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.TransformerObservation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observations</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformer_TransformerObservations()
	 * @see CIM.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer
	 * @model opposite="Transformer"
	 * @generated
	 */
	EList<TransformerObservation> getTransformerObservations();

	/**
	 * Returns the value of the '<em><b>Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.TransformerInfo#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Info</em>' reference.
	 * @see #setTransformerInfo(TransformerInfo)
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformer_TransformerInfo()
	 * @see CIM.IEC61968.AssetModels.TransformerInfo#getTransformers
	 * @model opposite="Transformers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transformer data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transformer data.'"
	 * @generated
	 */
	TransformerInfo getTransformerInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerInfo <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Info</em>' reference.
	 * @see #getTransformerInfo()
	 * @generated
	 */
	void setTransformerInfo(TransformerInfo value);

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ServiceDeliveryPoint#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformer_ServiceDeliveryPoints()
	 * @see CIM.IEC61968.Metering.ServiceDeliveryPoint#getTransformer
	 * @model opposite="Transformer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points supplied by this transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points supplied by this transformer.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Windings</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.WiresExt.DistributionTransformerWinding}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.WiresExt.DistributionTransformerWinding#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windings</em>' reference list.
	 * @see CIM.IEC61968.WiresExt.WiresExtPackage#getDistributionTransformer_Windings()
	 * @see CIM.IEC61968.WiresExt.DistributionTransformerWinding#getTransformer
	 * @model opposite="Transformer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All windings of this transformer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All windings of this transformer.'"
	 * @generated
	 */
	EList<DistributionTransformerWinding> getWindings();

} // DistributionTransformer
