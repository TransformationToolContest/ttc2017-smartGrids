/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Wires.WindingConnection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Winding Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getPhaseAngle <em>Phase Angle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getWindingTests <em>Winding Tests</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getWindings <em>Windings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getToWindingSpecs <em>To Winding Specs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getTransformerInfo <em>Transformer Info</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Winding data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Winding data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Winding data.' Profile\040documentation='Winding data.'"
 * @generated
 */
public interface WindingInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Emergency S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency S</em>' attribute.
	 * @see #setEmergencyS(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_EmergencyS()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Apparent power that the winding can carry under emergency conditions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Apparent power that the winding can carry under emergency conditions.'"
	 * @generated
	 */
	float getEmergencyS();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getEmergencyS <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency S</em>' attribute.
	 * @see #getEmergencyS()
	 * @generated
	 */
	void setEmergencyS(float value);

	/**
	 * Returns the value of the '<em><b>Phase Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Angle</em>' attribute.
	 * @see #setPhaseAngle(int)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_PhaseAngle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Winding phase angle where 360 degrees are represented with clock hours, so the valid values are {0, ..., 11}. For example, to express winding code \'Dyn11\', set attributes as follows: \'connectionKind\' = Yn and \'phaseAngle\' = 11.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Winding phase angle where 360 degrees are represented with clock hours, so the valid values are {0, ..., 11}. For example, to express winding code \'Dyn11\', set attributes as follows: \'connectionKind\' = Yn and \'phaseAngle\' = 11.'"
	 * @generated
	 */
	int getPhaseAngle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getPhaseAngle <em>Phase Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Angle</em>' attribute.
	 * @see #getPhaseAngle()
	 * @generated
	 */
	void setPhaseAngle(int value);

	/**
	 * Returns the value of the '<em><b>Winding Tests</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest#getFromWinding <em>From Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Tests</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_WindingTests()
	 * @see gluemodel.CIM.IEC61968.AssetModels.DistributionWindingTest#getFromWinding
	 * @model opposite="FromWinding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All winding tests during which voltage or current was applied to this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All winding tests during which voltage or current was applied to this winding.'"
	 * @generated
	 */
	EList<DistributionWindingTest> getWindingTests();

	/**
	 * Returns the value of the '<em><b>Windings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getWindingInfo <em>Winding Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_Windings()
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getWindingInfo
	 * @model opposite="WindingInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All windings described by this winding data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All windings described by this winding data.'"
	 * @generated
	 */
	EList<DistributionTransformerWinding> getWindings();

	/**
	 * Returns the value of the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated S</em>' attribute.
	 * @see #setRatedS(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_RatedS()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal apparent power rating of this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal apparent power rating of this winding.'"
	 * @generated
	 */
	float getRatedS();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated S</em>' attribute.
	 * @see #getRatedS()
	 * @generated
	 */
	void setRatedS(float value);

	/**
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #setRatedU(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_RatedU()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated voltage of this winding: phase-phase for three-phase windings, and either phase-phase or phase-neutral for single-phase windings.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated voltage of this winding: phase-phase for three-phase windings, and either phase-phase or phase-neutral for single-phase windings.'"
	 * @generated
	 */
	float getRatedU();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #getRatedU()
	 * @generated
	 */
	void setRatedU(float value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_R()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='DC resistance of this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='DC resistance of this winding.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence number for this winding, corresponding to the winding\'s order in the TransformerBank.vectorGroup attribute. Highest voltage winding should be \'1\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence number for this winding, corresponding to the winding\'s order in the TransformerBank.vectorGroup attribute. Highest voltage winding should be \'1\'.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Short Term S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Term S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Term S</em>' attribute.
	 * @see #setShortTermS(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_ShortTermS()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Apparent power that this winding can carry for a short period of time.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Apparent power that this winding can carry for a short period of time.'"
	 * @generated
	 */
	float getShortTermS();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getShortTermS <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Term S</em>' attribute.
	 * @see #getShortTermS()
	 * @generated
	 */
	void setShortTermS(float value);

	/**
	 * Returns the value of the '<em><b>To Winding Specs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToWinding <em>To Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding Specs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding Specs</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_ToWindingSpecs()
	 * @see gluemodel.CIM.IEC61968.AssetModels.ToWindingSpec#getToWinding
	 * @model opposite="ToWinding"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tap steps and induced voltage/angle measurements for tests in which this winding was not excited.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tap steps and induced voltage/angle measurements for tests in which this winding was not excited.'"
	 * @generated
	 */
	EList<ToWindingSpec> getToWindingSpecs();

	/**
	 * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Wires.WindingConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.WindingConnection
	 * @see #setConnectionKind(WindingConnection)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_ConnectionKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of connection of this winding.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of connection of this winding.'"
	 * @generated
	 */
	WindingConnection getConnectionKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.WindingConnection
	 * @see #getConnectionKind()
	 * @generated
	 */
	void setConnectionKind(WindingConnection value);

	/**
	 * Returns the value of the '<em><b>Insulation U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation U</em>' attribute.
	 * @see #setInsulationU(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_InsulationU()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Basic insulation level voltage rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Basic insulation level voltage rating.'"
	 * @generated
	 */
	float getInsulationU();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getInsulationU <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation U</em>' attribute.
	 * @see #getInsulationU()
	 * @generated
	 */
	void setInsulationU(float value);

	/**
	 * Returns the value of the '<em><b>Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getWindingInfos <em>Winding Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Info</em>' reference.
	 * @see #setTransformerInfo(TransformerInfo)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWindingInfo_TransformerInfo()
	 * @see gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getWindingInfos
	 * @model opposite="WindingInfos"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transformer data that this winding description is part of.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transformer data that this winding description is part of.'"
	 * @generated
	 */
	TransformerInfo getTransformerInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getTransformerInfo <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Info</em>' reference.
	 * @see #getTransformerInfo()
	 * @generated
	 */
	void setTransformerInfo(TransformerInfo value);

} // WindingInfo
