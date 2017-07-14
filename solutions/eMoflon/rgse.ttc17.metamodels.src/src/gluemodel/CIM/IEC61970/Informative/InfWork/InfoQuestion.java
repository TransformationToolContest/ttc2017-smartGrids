/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Document;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswer <em>Answer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerDateTime <em>Answer Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCategory <em>Question Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerRemark <em>Answer Remark</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionRemark <em>Question Remark</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCode <em>Question Code</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Questions and answers associated with a type of document for purposes of clarification. Questions may be predefined or ad hoc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Questions and answers associated with a type of document for purposes of clarification. Questions may be predefined or ad hoc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Questions and answers associated with a type of document for purposes of clarification. Questions may be predefined or ad hoc.' Profile\040documentation='Questions and answers associated with a type of document for purposes of clarification. Questions may be predefined or ad hoc.'"
 * @generated
 */
public interface InfoQuestion extends Document {
	/**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_Answer()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Answer to question.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Answer to question.'"
	 * @generated
	 */
	String getAnswer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(String value);

	/**
	 * Returns the value of the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Text</em>' attribute.
	 * @see #setQuestionText(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_QuestionText()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For non-coded questions, the question is provided here.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For non-coded questions, the question is provided here.'"
	 * @generated
	 */
	String getQuestionText();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionText <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Text</em>' attribute.
	 * @see #getQuestionText()
	 * @generated
	 */
	void setQuestionText(String value);

	/**
	 * Returns the value of the '<em><b>Answer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Date Time</em>' attribute.
	 * @see #setAnswerDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_AnswerDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time the quesiton was answered.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time the quesiton was answered.'"
	 * @generated
	 */
	Date getAnswerDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerDateTime <em>Answer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Date Time</em>' attribute.
	 * @see #getAnswerDateTime()
	 * @generated
	 */
	void setAnswerDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Question Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Category</em>' attribute.
	 * @see #setQuestionCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_QuestionCategory()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The category of the question.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The category of the question.'"
	 * @generated
	 */
	String getQuestionCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCategory <em>Question Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Category</em>' attribute.
	 * @see #getQuestionCategory()
	 * @generated
	 */
	void setQuestionCategory(String value);

	/**
	 * Returns the value of the '<em><b>Answer Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Remark</em>' attribute.
	 * @see #setAnswerRemark(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_AnswerRemark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks to qualify the answer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks to qualify the answer.'"
	 * @generated
	 */
	String getAnswerRemark();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getAnswerRemark <em>Answer Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Remark</em>' attribute.
	 * @see #getAnswerRemark()
	 * @generated
	 */
	void setAnswerRemark(String value);

	/**
	 * Returns the value of the '<em><b>Question Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Remark</em>' attribute.
	 * @see #setQuestionRemark(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_QuestionRemark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks to qualify the question in this situation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks to qualify the question in this situation.'"
	 * @generated
	 */
	String getQuestionRemark();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionRemark <em>Question Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Remark</em>' attribute.
	 * @see #getQuestionRemark()
	 * @generated
	 */
	void setQuestionRemark(String value);

	/**
	 * Returns the value of the '<em><b>Question Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Code</em>' attribute.
	 * @see #setQuestionCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion_QuestionCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The question code. If blank, refer to questionText.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The question code. If blank, refer to questionText.'"
	 * @generated
	 */
	String getQuestionCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCode <em>Question Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Code</em>' attribute.
	 * @see #getQuestionCode()
	 * @generated
	 */
	void setQuestionCode(String value);

} // InfoQuestion
