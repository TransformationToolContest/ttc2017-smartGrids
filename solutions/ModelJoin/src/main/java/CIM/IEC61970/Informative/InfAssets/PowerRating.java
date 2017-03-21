/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPowerRating()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='There are often stages of power which are associated with stages of cooling. For instance, a transformer may be rated 121kV on the primary, 15kV on the secondary and 4kV on the tertiary winding. These are voltage ratings and the power ratings are generally the same for all three windings and independent of the voltage ratings, there are instances where the tertiary may have a lower power rating.\nFor example, for three stages, the power rating may be 15/20/25 MVA and the cooling is OA/FA/FOA. The 15 MVA rating goes with the OA cooling (Oil and Air cooling). This is called the self cooled rating as there are no external cooling enhancements. The 20 MVA rating goes with the FA cooling (Forced Air cooling), this means that when the fans are running and thus enhancing the cooling characteristics, the transformer can operate at a power level of 20 MVA. The 25 MVA rating goes with the FOA cooling (Forced Oil and Air cooling), this means that when the fans and pumps are running and thus enhancing the cooling characteristics even more than before, the transformer can operate at a power level of 25 MVA. This 15/20/25 MVA does not state how the power is split between the various windings. It may be 25 MVA input on the primary, 25 MVA output on the secondary and 0 MVA output on the tertiary. It may also operate at 25 MVA input on the primary, 17 MVA output on the secondary and 8 MVA output on the tertiary.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='There are often stages of power which are associated with stages of cooling. For instance, a transformer may be rated 121kV on the primary, 15kV on the secondary and 4kV on the tertiary winding. These are voltage ratings and the power ratings are generally the same for all three windings and independent of the voltage ratings, there are instances where the tertiary may have a lower power rating.\nFor example, for three stages, the power rating may be 15/20/25 MVA and the cooling is OA/FA/FOA. The 15 MVA rating goes with the OA cooling (Oil and Air cooling). This is called the self cooled rating as there are no external cooling enhancements. The 20 MVA rating goes with the FA cooling (Forced Air cooling), this means that when the fans are running and thus enhancing the cooling characteristics, the transformer can operate at a power level of 20 MVA. The 25 MVA rating goes with the FOA cooling (Forced Oil and Air cooling), this means that when the fans and pumps are running and thus enhancing the cooling characteristics even more than before, the transformer can operate at a power level of 25 MVA. This 15/20/25 MVA does not state how the power is split between the various windings. It may be 25 MVA input on the primary, 25 MVA output on the secondary and 0 MVA output on the tertiary. It may also operate at 25 MVA input on the primary, 17 MVA output on the secondary and 8 MVA output on the tertiary.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='There are often stages of power which are associated with stages of cooling. For instance, a transformer may be rated 121kV on the primary, 15kV on the secondary and 4kV on the tertiary winding. These are voltage ratings and the power ratings are generally the same for all three windings and independent of the voltage ratings, there are instances where the tertiary may have a lower power rating.\nFor example, for three stages, the power rating may be 15/20/25 MVA and the cooling is OA/FA/FOA. The 15 MVA rating goes with the OA cooling (Oil and Air cooling). This is called the self cooled rating as there are no external cooling enhancements. The 20 MVA rating goes with the FA cooling (Forced Air cooling), this means that when the fans are running and thus enhancing the cooling characteristics, the transformer can operate at a power level of 20 MVA. The 25 MVA rating goes with the FOA cooling (Forced Oil and Air cooling), this means that when the fans and pumps are running and thus enhancing the cooling characteristics even more than before, the transformer can operate at a power level of 25 MVA. This 15/20/25 MVA does not state how the power is split between the various windings. It may be 25 MVA input on the primary, 25 MVA output on the secondary and 0 MVA output on the tertiary. It may also operate at 25 MVA input on the primary, 17 MVA output on the secondary and 8 MVA output on the tertiary.' Profile\040documentation='There are often stages of power which are associated with stages of cooling. For instance, a transformer may be rated 121kV on the primary, 15kV on the secondary and 4kV on the tertiary winding. These are voltage ratings and the power ratings are generally the same for all three windings and independent of the voltage ratings, there are instances where the tertiary may have a lower power rating.\nFor example, for three stages, the power rating may be 15/20/25 MVA and the cooling is OA/FA/FOA. The 15 MVA rating goes with the OA cooling (Oil and Air cooling). This is called the self cooled rating as there are no external cooling enhancements. The 20 MVA rating goes with the FA cooling (Forced Air cooling), this means that when the fans are running and thus enhancing the cooling characteristics, the transformer can operate at a power level of 20 MVA. The 25 MVA rating goes with the FOA cooling (Forced Oil and Air cooling), this means that when the fans and pumps are running and thus enhancing the cooling characteristics even more than before, the transformer can operate at a power level of 25 MVA. This 15/20/25 MVA does not state how the power is split between the various windings. It may be 25 MVA input on the primary, 25 MVA output on the secondary and 0 MVA output on the tertiary. It may also operate at 25 MVA input on the primary, 17 MVA output on the secondary and 8 MVA output on the tertiary.'"
 * @generated
 */
public interface PowerRating extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Cooling Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfAssets.CoolingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.CoolingKind
	 * @see #setCoolingKind(CoolingKind)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPowerRating_CoolingKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of cooling system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of cooling system.'"
	 * @generated
	 */
	CoolingKind getCoolingKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfAssets.CoolingKind
	 * @see #getCoolingKind()
	 * @generated
	 */
	void setCoolingKind(CoolingKind value);

	/**
	 * Returns the value of the '<em><b>Power Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Rating</em>' attribute.
	 * @see #setPowerRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPowerRating_PowerRating()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The power rating associated with type of cooling specified for this stage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The power rating associated with type of cooling specified for this stage.'"
	 * @generated
	 */
	float getPowerRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Rating</em>' attribute.
	 * @see #getPowerRating()
	 * @generated
	 */
	void setPowerRating(float value);

	/**
	 * Returns the value of the '<em><b>Transformer Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.TransformerAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings <em>Power Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPowerRating_TransformerAssets()
	 * @see CIM.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings
	 * @model opposite="PowerRatings"
	 * @generated
	 */
	EList<TransformerAsset> getTransformerAssets();

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see #setStage(int)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPowerRating_Stage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Stage of cooling and associated power rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Stage of cooling and associated power rating.'"
	 * @generated
	 */
	int getStage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(int value);

} // PowerRating
