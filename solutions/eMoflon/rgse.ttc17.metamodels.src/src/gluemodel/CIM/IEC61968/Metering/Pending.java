/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pending</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#getOffset <em>Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#isMultiplyBeforeAdd <em>Multiply Before Add</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarFloat <em>Scalar Float</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarDenominator <em>Scalar Denominator</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarNumerator <em>Scalar Numerator</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='When present, a scalar conversion that is associated with IntervalBlock and which needs to be applied to every contained IntervalReading value. This conversion results in a new associated ReadingType, reflecting the true dimensions of interval reading values after the conversion.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='When present, a scalar conversion that is associated with IntervalBlock and which needs to be applied to every contained IntervalReading value. This conversion results in a new associated ReadingType, reflecting the true dimensions of interval reading values after the conversion.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='When present, a scalar conversion that is associated with IntervalBlock and which needs to be applied to every contained IntervalReading value. This conversion results in a new associated ReadingType, reflecting the true dimensions of interval reading values after the conversion.' Profile\040documentation='When present, a scalar conversion that is associated with IntervalBlock and which needs to be applied to every contained IntervalReading value. This conversion results in a new associated ReadingType, reflecting the true dimensions of interval reading values after the conversion.'"
 * @generated
 */
public interface Pending extends Element {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_Offset()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Offset to be added as well as multiplication using scalars.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Offset to be added as well as multiplication using scalars.'"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Pending#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Multiply Before Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiply Before Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiply Before Add</em>' attribute.
	 * @see #setMultiplyBeforeAdd(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_MultiplyBeforeAdd()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Whether scalars should be applied before adding the \'offset\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Whether scalars should be applied before adding the \'offset\'.'"
	 * @generated
	 */
	boolean isMultiplyBeforeAdd();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Pending#isMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiply Before Add</em>' attribute.
	 * @see #isMultiplyBeforeAdd()
	 * @generated
	 */
	void setMultiplyBeforeAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Scalar Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Float</em>' attribute.
	 * @see #setScalarFloat(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_ScalarFloat()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if scalar is floating number) When multiplied with \'IntervalReading.value\', it causes a unit of measure conversion to occur, resulting in the \'ReadingType.unit\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if scalar is floating number) When multiplied with \'IntervalReading.value\', it causes a unit of measure conversion to occur, resulting in the \'ReadingType.unit\'.'"
	 * @generated
	 */
	float getScalarFloat();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarFloat <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Float</em>' attribute.
	 * @see #getScalarFloat()
	 * @generated
	 */
	void setScalarFloat(float value);

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_ReadingType()
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getPending
	 * @model opposite="Pending"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reading type resulting from this pending conversion.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reading type resulting from this pending conversion.'"
	 * @generated
	 */
	ReadingType getReadingType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Pending#getReadingType <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Type</em>' reference.
	 * @see #getReadingType()
	 * @generated
	 */
	void setReadingType(ReadingType value);

	/**
	 * Returns the value of the '<em><b>Scalar Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Denominator</em>' attribute.
	 * @see #setScalarDenominator(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_ScalarDenominator()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if scalar is rational number) When \'IntervalReading.value\' is multiplied by this attribute and divided by \'scalarDenominator, it causes a unit of measure conversion to occur, resulting in the \'ReadingType.unit\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if scalar is rational number) When \'IntervalReading.value\' is multiplied by this attribute and divided by \'scalarDenominator, it causes a unit of measure conversion to occur, resulting in the \'ReadingType.unit\'.'"
	 * @generated
	 */
	int getScalarDenominator();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarDenominator <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Denominator</em>' attribute.
	 * @see #getScalarDenominator()
	 * @generated
	 */
	void setScalarDenominator(int value);

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_IntervalBlocks()
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getPending
	 * @model opposite="Pending"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All blocks of interval reading values to which this pending conversion applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All blocks of interval reading values to which this pending conversion applies.'"
	 * @generated
	 */
	EList<IntervalBlock> getIntervalBlocks();

	/**
	 * Returns the value of the '<em><b>Scalar Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Numerator</em>' attribute.
	 * @see #setScalarNumerator(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getPending_ScalarNumerator()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if scalar is integer or rational number)  When the scalar is a simple integer, and this attribute is presented alone and multiplied with \'IntervalReading.value\', it causes a unit of measure conversion to occur, resulting in the \'ReadingType.unit\'. It is never used in conjunction with \'scalarFloat\', only with \'scalarDenominator\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if scalar is integer or rational number)  When the scalar is a simple integer, and this attribute is presented alone and multiplied with \'IntervalReading.value\', it causes a unit of measure conversion to occur, resulting in the \'ReadingType.unit\'. It is never used in conjunction with \'scalarFloat\', only with \'scalarDenominator\'.'"
	 * @generated
	 */
	int getScalarNumerator();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarNumerator <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Numerator</em>' attribute.
	 * @see #getScalarNumerator()
	 * @generated
	 */
	void setScalarNumerator(int value);

} // Pending
