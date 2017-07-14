/**
 */
package gluemodel.substationStandard.Dataclasses;

import gluemodel.substationStandard.Enumerations.SourceKind;
import gluemodel.substationStandard.Enumerations.ValidityKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Quality#isTest <em>Test</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Quality#isOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Quality#getValidity <em>Validity</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Quality#getSource <em>Source</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Quality#getDetailQual <em>Detail Qual</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getQuality()
 * @model
 * @generated
 */
public interface Quality extends EObject {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getQuality_Test()
	 * @model
	 * @generated
	 */
	boolean isTest();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Quality#isTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #isTest()
	 * @generated
	 */
	void setTest(boolean value);

	/**
	 * Returns the value of the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Blocked</em>' attribute.
	 * @see #setOperatorBlocked(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getQuality_OperatorBlocked()
	 * @model
	 * @generated
	 */
	boolean isOperatorBlocked();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Quality#isOperatorBlocked <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Blocked</em>' attribute.
	 * @see #isOperatorBlocked()
	 * @generated
	 */
	void setOperatorBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.ValidityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.ValidityKind
	 * @see #setValidity(ValidityKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getQuality_Validity()
	 * @model
	 * @generated
	 */
	ValidityKind getValidity();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Quality#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.ValidityKind
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(ValidityKind value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.SourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SourceKind
	 * @see #setSource(SourceKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getQuality_Source()
	 * @model
	 * @generated
	 */
	SourceKind getSource();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Quality#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.SourceKind
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceKind value);

	/**
	 * Returns the value of the '<em><b>Detail Qual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Qual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Qual</em>' reference.
	 * @see #setDetailQual(DetailQual)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getQuality_DetailQual()
	 * @model required="true"
	 * @generated
	 */
	DetailQual getDetailQual();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Quality#getDetailQual <em>Detail Qual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Qual</em>' reference.
	 * @see #getDetailQual()
	 * @generated
	 */
	void setDetailQual(DetailQual value);

} // Quality
