/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getWireArrangements <em>Wire Arrangements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Wire conductor (per IEEE specs). A specific type of wire or combination of wires, not insulated from each other, suitable for carrying electrical current.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Wire conductor (per IEEE specs). A specific type of wire or combination of wires, not insulated from each other, suitable for carrying electrical current.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Wire conductor (per IEEE specs). A specific type of wire or combination of wires, not insulated from each other, suitable for carrying electrical current.' Profile\040documentation='Wire conductor (per IEEE specs). A specific type of wire or combination of wires, not insulated from each other, suitable for carrying electrical current.'"
 * @generated
 */
public interface WireType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>RAC75</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAC75</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAC75</em>' attribute.
	 * @see #setRAC75(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_RAC75()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AC resistance per unit length of the conductor at 75 degrees C.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AC resistance per unit length of the conductor at 75 degrees C.'"
	 * @generated
	 */
	float getRAC75();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAC75</em>' attribute.
	 * @see #getRAC75()
	 * @generated
	 */
	void setRAC75(float value);

	/**
	 * Returns the value of the '<em><b>RAC50</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAC50</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAC50</em>' attribute.
	 * @see #setRAC50(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_RAC50()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AC resistance per unit length of the conductor at 50 degrees C.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AC resistance per unit length of the conductor at 50 degrees C.'"
	 * @generated
	 */
	float getRAC50();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAC50</em>' attribute.
	 * @see #getRAC50()
	 * @generated
	 */
	void setRAC50(float value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_Radius()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Outside radius of the wire.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Outside radius of the wire.'"
	 * @generated
	 */
	float getRadius();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(float value);

	/**
	 * Returns the value of the '<em><b>Concentric Neutral Cable Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentric Neutral Cable Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentric Neutral Cable Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_ConcentricNeutralCableInfos()
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType
	 * @model opposite="WireType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All concentric neutral cables using this wire type.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All concentric neutral cables using this wire type.'"
	 * @generated
	 */
	EList<ConcentricNeutralCableInfo> getConcentricNeutralCableInfos();

	/**
	 * Returns the value of the '<em><b>Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strand Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strand Count</em>' attribute.
	 * @see #setStrandCount(int)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_StrandCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of strands in the wire.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of strands in the wire.'"
	 * @generated
	 */
	int getStrandCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand Count</em>' attribute.
	 * @see #getStrandCount()
	 * @generated
	 */
	void setStrandCount(int value);

	/**
	 * Returns the value of the '<em><b>Core Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Radius</em>' attribute.
	 * @see #setCoreRadius(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_CoreRadius()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if there is a different core material) Radius of the central core.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if there is a different core material) Radius of the central core.'"
	 * @generated
	 */
	float getCoreRadius();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Radius</em>' attribute.
	 * @see #getCoreRadius()
	 * @generated
	 */
	void setCoreRadius(float value);

	/**
	 * Returns the value of the '<em><b>RAC25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAC25</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAC25</em>' attribute.
	 * @see #setRAC25(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_RAC25()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AC resistance per unit length of the conductor at 25 degrees C.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AC resistance per unit length of the conductor at 25 degrees C.'"
	 * @generated
	 */
	float getRAC25();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAC25</em>' attribute.
	 * @see #getRAC25()
	 * @generated
	 */
	void setRAC25(float value);

	/**
	 * Returns the value of the '<em><b>RDC20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDC20</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDC20</em>' attribute.
	 * @see #setRDC20(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_RDC20()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='DC resistance per unit length of the conductor at 20 degrees C.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='DC resistance per unit length of the conductor at 20 degrees C.'"
	 * @generated
	 */
	float getRDC20();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDC20</em>' attribute.
	 * @see #getRDC20()
	 * @generated
	 */
	void setRDC20(float value);

	/**
	 * Returns the value of the '<em><b>Size Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Description</em>' attribute.
	 * @see #setSizeDescription(String)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_SizeDescription()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Describes the wire guage or cross section (e.g., 4/0, #2, 336.5).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Describes the wire guage or cross section (e.g., 4/0, #2, 336.5).'"
	 * @generated
	 */
	String getSizeDescription();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Description</em>' attribute.
	 * @see #getSizeDescription()
	 * @generated
	 */
	void setSizeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Core Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Strand Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Strand Count</em>' attribute.
	 * @see #setCoreStrandCount(int)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_CoreStrandCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if used) Number of strands in the steel core.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if used) Number of strands in the steel core.'"
	 * @generated
	 */
	int getCoreStrandCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Strand Count</em>' attribute.
	 * @see #getCoreStrandCount()
	 * @generated
	 */
	void setCoreStrandCount(int value);

	/**
	 * Returns the value of the '<em><b>Wire Arrangements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Arrangements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Arrangements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_WireArrangements()
	 * @see gluemodel.CIM.IEC61968.AssetModels.WireArrangement#getWireType
	 * @model opposite="WireType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All wire arrangements using this wire type.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All wire arrangements using this wire type.'"
	 * @generated
	 */
	EList<WireArrangement> getWireArrangements();

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_RatedCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current carrying capacity of the wire under stated thermal conditions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current carrying capacity of the wire under stated thermal conditions.'"
	 * @generated
	 */
	float getRatedCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Gmr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gmr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gmr</em>' attribute.
	 * @see #setGmr(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_Gmr()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Geometric Mean Radius. If we replace the conductor by a thin walled tube of radius GMR, then its reactance is identical to the reactance of the actual conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Geometric Mean Radius. If we replace the conductor by a thin walled tube of radius GMR, then its reactance is identical to the reactance of the actual conductor.'"
	 * @generated
	 */
	float getGmr();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gmr</em>' attribute.
	 * @see #getGmr()
	 * @generated
	 */
	void setGmr(float value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind
	 * @see #setMaterial(ConductorMaterialKind)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getWireType_Material()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Wire material.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Wire material.'"
	 * @generated
	 */
	ConductorMaterialKind getMaterial();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.AssetModels.ConductorMaterialKind
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(ConductorMaterialKind value);

} // WireType
