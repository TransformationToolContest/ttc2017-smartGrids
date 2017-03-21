/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.AutoAnswerObject;
import COSEM.COSEMObjects.COSEMObjectsPackage;

import COSEM.InterfaceClasses.impl.Auto_answerImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Answer Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.AutoAnswerObjectImpl#isAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoAnswerObjectImpl extends Auto_answerImpl implements AutoAnswerObject {
	/**
	 * The default value of the '{@link #isAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnswer()
	 * @generated
	 * @ordered
	 */
	protected boolean answer = ANSWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoAnswerObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getAutoAnswerObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnswer() {
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswer(boolean newAnswer) {
		boolean oldAnswer = answer;
		answer = newAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.AUTO_ANSWER_OBJECT__ANSWER, oldAnswer, answer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.AUTO_ANSWER_OBJECT__ANSWER:
				return isAnswer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSEMObjectsPackage.AUTO_ANSWER_OBJECT__ANSWER:
				setAnswer((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.AUTO_ANSWER_OBJECT__ANSWER:
				setAnswer(ANSWER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.AUTO_ANSWER_OBJECT__ANSWER:
				return answer != ANSWER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Answer: ");
		result.append(answer);
		result.append(')');
		return result.toString();
	}

} //AutoAnswerObjectImpl
