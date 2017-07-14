/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val With Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.ValWithTrans#getPosVal <em>Pos Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.ValWithTrans#isTransInd <em>Trans Ind</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getValWithTrans()
 * @model
 * @generated
 */
public interface ValWithTrans extends EObject {
	/**
	 * Returns the value of the '<em><b>Pos Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Val</em>' attribute.
	 * @see #setPosVal(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getValWithTrans_PosVal()
	 * @model
	 * @generated
	 */
	int getPosVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.ValWithTrans#getPosVal <em>Pos Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Val</em>' attribute.
	 * @see #getPosVal()
	 * @generated
	 */
	void setPosVal(int value);

	/**
	 * Returns the value of the '<em><b>Trans Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Ind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Ind</em>' attribute.
	 * @see #setTransInd(boolean)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getValWithTrans_TransInd()
	 * @model
	 * @generated
	 */
	boolean isTransInd();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.ValWithTrans#isTransInd <em>Trans Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Ind</em>' attribute.
	 * @see #isTransInd()
	 * @generated
	 */
	void setTransInd(boolean value);

} // ValWithTrans
