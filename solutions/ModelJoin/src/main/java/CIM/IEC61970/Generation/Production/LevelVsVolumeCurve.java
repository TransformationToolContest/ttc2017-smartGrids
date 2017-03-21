/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Vs Volume Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getLevelVsVolumeCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between reservoir volume and reservoir level. The  volume is at the y-axis and the reservoir level at the x-axis.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between reservoir volume and reservoir level. The  volume is at the y-axis and the reservoir level at the x-axis.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between reservoir volume and reservoir level. The  volume is at the y-axis and the reservoir level at the x-axis.' Profile\040documentation='Relationship between reservoir volume and reservoir level. The  volume is at the y-axis and the reservoir level at the x-axis.'"
 * @generated
 */
public interface LevelVsVolumeCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservoir</em>' reference.
	 * @see #setReservoir(Reservoir)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getLevelVsVolumeCurve_Reservoir()
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves
	 * @model opposite="LevelVsVolumeCurves"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may have a level versus volume relationship.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may have a level versus volume relationship.'"
	 * @generated
	 */
	Reservoir getReservoir();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservoir</em>' reference.
	 * @see #getReservoir()
	 * @generated
	 */
	void setReservoir(Reservoir value);

} // LevelVsVolumeCurve
