/**
 */
package gluemodel.CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Fuse#getRatingCurrent <em>Rating Current</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getFuse()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An overcurrent protective device with a circuit opening fusible part that is heated and severed by the passage of overcurrent through it. A fuse is considered a switching device because it breaks current.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An overcurrent protective device with a circuit opening fusible part that is heated and severed by the passage of overcurrent through it. A fuse is considered a switching device because it breaks current.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An overcurrent protective device with a circuit opening fusible part that is heated and severed by the passage of overcurrent through it. A fuse is considered a switching device because it breaks current.' Profile\040documentation='An overcurrent protective device with a circuit opening fusible part that is heated and severed by the passage of overcurrent through it. A fuse is considered a switching device because it breaks current.'"
 * @generated
 */
public interface Fuse extends Switch {
	/**
	 * Returns the value of the '<em><b>Rating Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Current</em>' attribute.
	 * @see #setRatingCurrent(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getFuse_RatingCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fault interrupting current rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fault interrupting current rating.'"
	 * @generated
	 */
	float getRatingCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Fuse#getRatingCurrent <em>Rating Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating Current</em>' attribute.
	 * @see #getRatingCurrent()
	 * @generated
	 */
	void setRatingCurrent(float value);

} // Fuse
