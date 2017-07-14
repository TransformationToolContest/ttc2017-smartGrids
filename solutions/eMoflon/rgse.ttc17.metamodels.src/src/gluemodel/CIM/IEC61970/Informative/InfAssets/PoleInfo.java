/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pole Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatedDateTime <em>Treated Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#isBreastBlock <em>Breast Block</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getClassification <em>Classification</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getPreservativeKind <em>Preservative Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getJpaReference <em>Jpa Reference</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getBaseKind <em>Base Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getStreetlights <em>Streetlights</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatmentKind <em>Treatment Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getConstruction <em>Construction</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getLength <em>Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getSpeciesType <em>Species Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of pole asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of pole asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of pole asset.' Profile\040documentation='Properties of pole asset.'"
 * @generated
 */
public interface PoleInfo extends StructureInfo {
	/**
	 * Returns the value of the '<em><b>Treated Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treated Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treated Date Time</em>' attribute.
	 * @see #setTreatedDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_TreatedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time pole was last treated with preservative.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time pole was last treated with preservative.'"
	 * @generated
	 */
	Date getTreatedDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatedDateTime <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treated Date Time</em>' attribute.
	 * @see #getTreatedDateTime()
	 * @generated
	 */
	void setTreatedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Breast Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breast Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breast Block</em>' attribute.
	 * @see #setBreastBlock(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_BreastBlock()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if a block of material has been attached to base of pole in ground for stability. This technique is used primarily when anchors can not be used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if a block of material has been attached to base of pole in ground for stability. This technique is used primarily when anchors can not be used.'"
	 * @generated
	 */
	boolean isBreastBlock();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#isBreastBlock <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breast Block</em>' attribute.
	 * @see #isBreastBlock()
	 * @generated
	 */
	void setBreastBlock(boolean value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_Classification()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pole class: 1, 2, 3, 4, 5, 6, 7, H1, H2, Other, Unknown.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pole class: 1, 2, 3, 4, 5, 6, 7, H1, H2, Other, Unknown.'"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

	/**
	 * Returns the value of the '<em><b>Preservative Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preservative Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preservative Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @see #setPreservativeKind(PolePreservativeKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_PreservativeKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of preservative for this pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of preservative for this pole.'"
	 * @generated
	 */
	PolePreservativeKind getPreservativeKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getPreservativeKind <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preservative Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @see #getPreservativeKind()
	 * @generated
	 */
	void setPreservativeKind(PolePreservativeKind value);

	/**
	 * Returns the value of the '<em><b>Jpa Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jpa Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpa Reference</em>' attribute.
	 * @see #setJpaReference(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_JpaReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Joint pole agreement reference number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Joint pole agreement reference number.'"
	 * @generated
	 */
	String getJpaReference();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getJpaReference <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpa Reference</em>' attribute.
	 * @see #getJpaReference()
	 * @generated
	 */
	void setJpaReference(String value);

	/**
	 * Returns the value of the '<em><b>Base Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @see #setBaseKind(PoleBaseKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_BaseKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of base for this pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of base for this pole.'"
	 * @generated
	 */
	PoleBaseKind getBaseKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getBaseKind <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @see #getBaseKind()
	 * @generated
	 */
	void setBaseKind(PoleBaseKind value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #setDiameter(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_Diameter()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter of the pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter of the pole.'"
	 * @generated
	 */
	float getDiameter();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(float value);

	/**
	 * Returns the value of the '<em><b>Streetlights</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getPole <em>Pole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streetlights</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streetlights</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_Streetlights()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StreetlightInfo#getPole
	 * @model opposite="Pole"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Streetlight(s) may be attached to a pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Streetlight(s) may be attached to a pole.'"
	 * @generated
	 */
	EList<StreetlightInfo> getStreetlights();

	/**
	 * Returns the value of the '<em><b>Treatment Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatment Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @see #setTreatmentKind(PoleTreatmentKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_TreatmentKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of treatment for this pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of treatment for this pole.'"
	 * @generated
	 */
	PoleTreatmentKind getTreatmentKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getTreatmentKind <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @see #getTreatmentKind()
	 * @generated
	 */
	void setTreatmentKind(PoleTreatmentKind value);

	/**
	 * Returns the value of the '<em><b>Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction</em>' attribute.
	 * @see #setConstruction(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_Construction()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The framing structure mounted on the pole.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The framing structure mounted on the pole.'"
	 * @generated
	 */
	String getConstruction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getConstruction <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction</em>' attribute.
	 * @see #getConstruction()
	 * @generated
	 */
	void setConstruction(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_Length()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Length of the pole (inclusive of any section of the pole that may be underground post-installation).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Length of the pole (inclusive of any section of the pole that may be underground post-installation).'"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Species Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species Type</em>' attribute.
	 * @see #setSpeciesType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleInfo_SpeciesType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pole species. Aluminum, Aluminum Davit, Concrete, Fiberglass, Galvanized Davit, Galvanized, Steel Davit Primed, Steel Davit, Steel Standard Primed, Steel, Truncated, Wood-Treated, Wood-Hard, Wood-Salt Treated, Wood-Soft, Wood, Other, Unknown.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pole species. Aluminum, Aluminum Davit, Concrete, Fiberglass, Galvanized Davit, Galvanized, Steel Davit Primed, Steel Davit, Steel Standard Primed, Steel, Truncated, Wood-Treated, Wood-Hard, Wood-Salt Treated, Wood-Soft, Wood, Other, Unknown.'"
	 * @generated
	 */
	String getSpeciesType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.PoleInfo#getSpeciesType <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species Type</em>' attribute.
	 * @see #getSpeciesType()
	 * @generated
	 */
	void setSpeciesType(String value);

} // PoleInfo
