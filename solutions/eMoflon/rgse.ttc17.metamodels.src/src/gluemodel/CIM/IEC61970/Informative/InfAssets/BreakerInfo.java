/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breaker Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBreakerInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of breaker assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of breaker assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of breaker assets.' Profile\040documentation='Properties of breaker assets.'"
 * @generated
 */
public interface BreakerInfo extends SwitchInfo {
	/**
	 * Returns the value of the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Trip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Trip</em>' attribute.
	 * @see #setPhaseTrip(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getBreakerInfo_PhaseTrip()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase trip rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase trip rating.'"
	 * @generated
	 */
	float getPhaseTrip();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Trip</em>' attribute.
	 * @see #getPhaseTrip()
	 * @generated
	 */
	void setPhaseTrip(float value);

} // BreakerInfo
