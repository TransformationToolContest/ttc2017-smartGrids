/**
 */
package CIM.IEC61968.AssetModels;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Arrangement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Identification, spacing and configuration of the wires of a Conductor, with reference to their type.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Identification, spacing and configuration of the wires of a Conductor, with reference to their type.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Identification, spacing and configuration of the wires of a Conductor, with reference to their type.' Profile\040documentation='Identification, spacing and configuration of the wires of a Conductor, with reference to their type.'"
 * @generated
 */
public interface WireArrangement extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Wire Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.WireType#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Type</em>' reference.
	 * @see #setWireType(WireType)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement_WireType()
	 * @see CIM.IEC61968.AssetModels.WireType#getWireArrangements
	 * @model opposite="WireArrangements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Wire type used for this wire arrangement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Wire type used for this wire arrangement.'"
	 * @generated
	 */
	WireType getWireType();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Type</em>' reference.
	 * @see #getWireType()
	 * @generated
	 */
	void setWireType(WireType value);

	/**
	 * Returns the value of the '<em><b>Conductor Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.ConductorInfo#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Info</em>' reference.
	 * @see #setConductorInfo(ConductorInfo)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement_ConductorInfo()
	 * @see CIM.IEC61968.AssetModels.ConductorInfo#getWireArrangements
	 * @model opposite="WireArrangements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Conductor data this wire arrangement belongs to.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Conductor data this wire arrangement belongs to.'"
	 * @generated
	 */
	ConductorInfo getConductorInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Info</em>' reference.
	 * @see #getConductorInfo()
	 * @generated
	 */
	void setConductorInfo(ConductorInfo value);

	/**
	 * Returns the value of the '<em><b>Mounting Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Point X</em>' attribute.
	 * @see #setMountingPointX(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement_MountingPointX()
	 * @model dataType="CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Signed horizontal distance from the first wire to a common reference point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Signed horizontal distance from the first wire to a common reference point.'"
	 * @generated
	 */
	float getMountingPointX();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounting Point X</em>' attribute.
	 * @see #getMountingPointX()
	 * @generated
	 */
	void setMountingPointX(float value);

	/**
	 * Returns the value of the '<em><b>Mounting Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Point Y</em>' attribute.
	 * @see #setMountingPointY(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement_MountingPointY()
	 * @model dataType="CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Height above ground of the first wire.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Height above ground of the first wire.'"
	 * @generated
	 */
	float getMountingPointY();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounting Point Y</em>' attribute.
	 * @see #getMountingPointY()
	 * @generated
	 */
	void setMountingPointY(float value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement_Position()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Position number on the structure corresponding to this wire. For example, use 1..3 for phases and 4 for the neutral on a 3-phase structure. The individual phase assignments matter; for example, ABC will produce a different set of unbalanced line parameters, by phase, than BAC.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Position number on the structure corresponding to this wire. For example, use 1..3 for phases and 4 for the neutral on a 3-phase structure. The individual phase assignments matter; for example, ABC will produce a different set of unbalanced line parameters, by phase, than BAC.'"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // WireArrangement
