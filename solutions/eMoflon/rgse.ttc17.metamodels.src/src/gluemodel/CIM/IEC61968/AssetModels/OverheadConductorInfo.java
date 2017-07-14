/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overhead Conductor Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Overhead conductor data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Overhead conductor data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Overhead conductor data.' Profile\040documentation='Overhead conductor data.'"
 * @generated
 */
public interface OverheadConductorInfo extends ConductorInfo {
	/**
	 * Returns the value of the '<em><b>Neutral Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Insulation Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Insulation Thickness</em>' attribute.
	 * @see #setNeutralInsulationThickness(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo_NeutralInsulationThickness()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Insulation thickness of the neutral conductor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Insulation thickness of the neutral conductor.'"
	 * @generated
	 */
	float getNeutralInsulationThickness();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Insulation Thickness</em>' attribute.
	 * @see #getNeutralInsulationThickness()
	 * @generated
	 */
	void setNeutralInsulationThickness(float value);

	/**
	 * Returns the value of the '<em><b>Phase Conductor Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Conductor Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Conductor Spacing</em>' attribute.
	 * @see #setPhaseConductorSpacing(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo_PhaseConductorSpacing()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Distance between conductor strands in a symmetrical bundle.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Distance between conductor strands in a symmetrical bundle.'"
	 * @generated
	 */
	float getPhaseConductorSpacing();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Conductor Spacing</em>' attribute.
	 * @see #getPhaseConductorSpacing()
	 * @generated
	 */
	void setPhaseConductorSpacing(float value);

	/**
	 * Returns the value of the '<em><b>Phase Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Conductor Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Conductor Count</em>' attribute.
	 * @see #setPhaseConductorCount(int)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo_PhaseConductorCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of conductor strands in the symmetrical bundle (1-12).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of conductor strands in the symmetrical bundle (1-12).'"
	 * @generated
	 */
	int getPhaseConductorCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Conductor Count</em>' attribute.
	 * @see #getPhaseConductorCount()
	 * @generated
	 */
	void setPhaseConductorCount(int value);

	/**
	 * Returns the value of the '<em><b>Mounting Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors <em>Overhead Conductors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Point</em>' reference.
	 * @see #setMountingPoint(MountingPoint)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo_MountingPoint()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors
	 * @model opposite="OverheadConductors"
	 * @generated
	 */
	MountingPoint getMountingPoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounting Point</em>' reference.
	 * @see #getMountingPoint()
	 * @generated
	 */
	void setMountingPoint(MountingPoint value);

} // OverheadConductorInfo
