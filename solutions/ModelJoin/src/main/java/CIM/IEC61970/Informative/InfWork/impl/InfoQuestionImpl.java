/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.InfoQuestion;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getAnswerDateTime <em>Answer Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getQuestionCategory <em>Question Category</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getAnswerRemark <em>Answer Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getQuestionRemark <em>Question Remark</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.InfoQuestionImpl#getQuestionCode <em>Question Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoQuestionImpl extends DocumentImpl implements InfoQuestion {
	/**
	 * The default value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected String answer = ANSWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected String questionText = QUESTION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnswerDateTime() <em>Answer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ANSWER_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswerDateTime() <em>Answer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date answerDateTime = ANSWER_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestionCategory() <em>Question Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionCategory() <em>Question Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionCategory()
	 * @generated
	 * @ordered
	 */
	protected String questionCategory = QUESTION_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnswerRemark() <em>Answer Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSWER_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswerRemark() <em>Answer Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerRemark()
	 * @generated
	 * @ordered
	 */
	protected String answerRemark = ANSWER_REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestionRemark() <em>Question Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionRemark() <em>Question Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionRemark()
	 * @generated
	 * @ordered
	 */
	protected String questionRemark = QUESTION_REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestionCode() <em>Question Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionCode() <em>Question Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionCode()
	 * @generated
	 * @ordered
	 */
	protected String questionCode = QUESTION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.INFO_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswer(String newAnswer) {
		String oldAnswer = answer;
		answer = newAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__ANSWER, oldAnswer, answer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionText(String newQuestionText) {
		String oldQuestionText = questionText;
		questionText = newQuestionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__QUESTION_TEXT, oldQuestionText, questionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAnswerDateTime() {
		return answerDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerDateTime(Date newAnswerDateTime) {
		Date oldAnswerDateTime = answerDateTime;
		answerDateTime = newAnswerDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__ANSWER_DATE_TIME, oldAnswerDateTime, answerDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionCategory() {
		return questionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionCategory(String newQuestionCategory) {
		String oldQuestionCategory = questionCategory;
		questionCategory = newQuestionCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__QUESTION_CATEGORY, oldQuestionCategory, questionCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnswerRemark() {
		return answerRemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerRemark(String newAnswerRemark) {
		String oldAnswerRemark = answerRemark;
		answerRemark = newAnswerRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__ANSWER_REMARK, oldAnswerRemark, answerRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionRemark() {
		return questionRemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionRemark(String newQuestionRemark) {
		String oldQuestionRemark = questionRemark;
		questionRemark = newQuestionRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__QUESTION_REMARK, oldQuestionRemark, questionRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionCode() {
		return questionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionCode(String newQuestionCode) {
		String oldQuestionCode = questionCode;
		questionCode = newQuestionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.INFO_QUESTION__QUESTION_CODE, oldQuestionCode, questionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.INFO_QUESTION__ANSWER:
				return getAnswer();
			case InfWorkPackage.INFO_QUESTION__QUESTION_TEXT:
				return getQuestionText();
			case InfWorkPackage.INFO_QUESTION__ANSWER_DATE_TIME:
				return getAnswerDateTime();
			case InfWorkPackage.INFO_QUESTION__QUESTION_CATEGORY:
				return getQuestionCategory();
			case InfWorkPackage.INFO_QUESTION__ANSWER_REMARK:
				return getAnswerRemark();
			case InfWorkPackage.INFO_QUESTION__QUESTION_REMARK:
				return getQuestionRemark();
			case InfWorkPackage.INFO_QUESTION__QUESTION_CODE:
				return getQuestionCode();
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
			case InfWorkPackage.INFO_QUESTION__ANSWER:
				setAnswer((String)newValue);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_TEXT:
				setQuestionText((String)newValue);
				return;
			case InfWorkPackage.INFO_QUESTION__ANSWER_DATE_TIME:
				setAnswerDateTime((Date)newValue);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_CATEGORY:
				setQuestionCategory((String)newValue);
				return;
			case InfWorkPackage.INFO_QUESTION__ANSWER_REMARK:
				setAnswerRemark((String)newValue);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_REMARK:
				setQuestionRemark((String)newValue);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_CODE:
				setQuestionCode((String)newValue);
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
			case InfWorkPackage.INFO_QUESTION__ANSWER:
				setAnswer(ANSWER_EDEFAULT);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_TEXT:
				setQuestionText(QUESTION_TEXT_EDEFAULT);
				return;
			case InfWorkPackage.INFO_QUESTION__ANSWER_DATE_TIME:
				setAnswerDateTime(ANSWER_DATE_TIME_EDEFAULT);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_CATEGORY:
				setQuestionCategory(QUESTION_CATEGORY_EDEFAULT);
				return;
			case InfWorkPackage.INFO_QUESTION__ANSWER_REMARK:
				setAnswerRemark(ANSWER_REMARK_EDEFAULT);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_REMARK:
				setQuestionRemark(QUESTION_REMARK_EDEFAULT);
				return;
			case InfWorkPackage.INFO_QUESTION__QUESTION_CODE:
				setQuestionCode(QUESTION_CODE_EDEFAULT);
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
			case InfWorkPackage.INFO_QUESTION__ANSWER:
				return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
			case InfWorkPackage.INFO_QUESTION__QUESTION_TEXT:
				return QUESTION_TEXT_EDEFAULT == null ? questionText != null : !QUESTION_TEXT_EDEFAULT.equals(questionText);
			case InfWorkPackage.INFO_QUESTION__ANSWER_DATE_TIME:
				return ANSWER_DATE_TIME_EDEFAULT == null ? answerDateTime != null : !ANSWER_DATE_TIME_EDEFAULT.equals(answerDateTime);
			case InfWorkPackage.INFO_QUESTION__QUESTION_CATEGORY:
				return QUESTION_CATEGORY_EDEFAULT == null ? questionCategory != null : !QUESTION_CATEGORY_EDEFAULT.equals(questionCategory);
			case InfWorkPackage.INFO_QUESTION__ANSWER_REMARK:
				return ANSWER_REMARK_EDEFAULT == null ? answerRemark != null : !ANSWER_REMARK_EDEFAULT.equals(answerRemark);
			case InfWorkPackage.INFO_QUESTION__QUESTION_REMARK:
				return QUESTION_REMARK_EDEFAULT == null ? questionRemark != null : !QUESTION_REMARK_EDEFAULT.equals(questionRemark);
			case InfWorkPackage.INFO_QUESTION__QUESTION_CODE:
				return QUESTION_CODE_EDEFAULT == null ? questionCode != null : !QUESTION_CODE_EDEFAULT.equals(questionCode);
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
		result.append(" (answer: ");
		result.append(answer);
		result.append(", questionText: ");
		result.append(questionText);
		result.append(", answerDateTime: ");
		result.append(answerDateTime);
		result.append(", questionCategory: ");
		result.append(questionCategory);
		result.append(", answerRemark: ");
		result.append(answerRemark);
		result.append(", questionRemark: ");
		result.append(questionRemark);
		result.append(", questionCode: ");
		result.append(questionCode);
		result.append(')');
		return result.toString();
	}

} //InfoQuestionImpl
