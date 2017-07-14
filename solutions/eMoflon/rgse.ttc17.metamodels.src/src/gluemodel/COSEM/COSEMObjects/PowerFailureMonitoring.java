/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Failure Monitoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAllPhases <em>Failures All Phases</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL1 <em>Failures L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL2 <em>Failures L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL3 <em>Failures L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAny <em>Failures Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getAuxiliarysupply <em>Auxiliarysupply</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAll <em>Long Fails All</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL1 <em>Long Fails L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL2 <em>Long Fails L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL3 <em>Long Fails L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAny <em>Long Fails Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAll <em>Time All</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL1 <em>Time L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL2 <em>Time L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL3 <em>Time L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAny <em>Time Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAll <em>Duration All</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL1 <em>Duration L1</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL2 <em>Duration L2</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL3 <em>Duration L3</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAny <em>Duration Any</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTime_threshold_long_powerfailure <em>Time threshold long powerfailure</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring()
 * @model
 * @generated
 */
public interface PowerFailureMonitoring extends Data {
	/**
	 * Returns the value of the '<em><b>Failures All Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures All Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures All Phases</em>' attribute.
	 * @see #setFailuresAllPhases(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_FailuresAllPhases()
	 * @model
	 * @generated
	 */
	int getFailuresAllPhases();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAllPhases <em>Failures All Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failures All Phases</em>' attribute.
	 * @see #getFailuresAllPhases()
	 * @generated
	 */
	void setFailuresAllPhases(int value);

	/**
	 * Returns the value of the '<em><b>Failures L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures L1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures L1</em>' attribute.
	 * @see #setFailuresL1(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_FailuresL1()
	 * @model
	 * @generated
	 */
	int getFailuresL1();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL1 <em>Failures L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failures L1</em>' attribute.
	 * @see #getFailuresL1()
	 * @generated
	 */
	void setFailuresL1(int value);

	/**
	 * Returns the value of the '<em><b>Failures L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures L2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures L2</em>' attribute.
	 * @see #setFailuresL2(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_FailuresL2()
	 * @model
	 * @generated
	 */
	int getFailuresL2();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL2 <em>Failures L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failures L2</em>' attribute.
	 * @see #getFailuresL2()
	 * @generated
	 */
	void setFailuresL2(int value);

	/**
	 * Returns the value of the '<em><b>Failures L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures L3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures L3</em>' attribute.
	 * @see #setFailuresL3(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_FailuresL3()
	 * @model
	 * @generated
	 */
	int getFailuresL3();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL3 <em>Failures L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failures L3</em>' attribute.
	 * @see #getFailuresL3()
	 * @generated
	 */
	void setFailuresL3(int value);

	/**
	 * Returns the value of the '<em><b>Failures Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failures Any</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failures Any</em>' attribute.
	 * @see #setFailuresAny(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_FailuresAny()
	 * @model
	 * @generated
	 */
	int getFailuresAny();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAny <em>Failures Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failures Any</em>' attribute.
	 * @see #getFailuresAny()
	 * @generated
	 */
	void setFailuresAny(int value);

	/**
	 * Returns the value of the '<em><b>Auxiliarysupply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliarysupply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliarysupply</em>' attribute.
	 * @see #setAuxiliarysupply(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_Auxiliarysupply()
	 * @model
	 * @generated
	 */
	String getAuxiliarysupply();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getAuxiliarysupply <em>Auxiliarysupply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliarysupply</em>' attribute.
	 * @see #getAuxiliarysupply()
	 * @generated
	 */
	void setAuxiliarysupply(String value);

	/**
	 * Returns the value of the '<em><b>Long Fails All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Fails All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Fails All</em>' attribute.
	 * @see #setLongFailsAll(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_LongFailsAll()
	 * @model
	 * @generated
	 */
	int getLongFailsAll();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAll <em>Long Fails All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Fails All</em>' attribute.
	 * @see #getLongFailsAll()
	 * @generated
	 */
	void setLongFailsAll(int value);

	/**
	 * Returns the value of the '<em><b>Long Fails L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Fails L1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Fails L1</em>' attribute.
	 * @see #setLongFailsL1(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_LongFailsL1()
	 * @model
	 * @generated
	 */
	int getLongFailsL1();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL1 <em>Long Fails L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Fails L1</em>' attribute.
	 * @see #getLongFailsL1()
	 * @generated
	 */
	void setLongFailsL1(int value);

	/**
	 * Returns the value of the '<em><b>Long Fails L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Fails L2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Fails L2</em>' attribute.
	 * @see #setLongFailsL2(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_LongFailsL2()
	 * @model
	 * @generated
	 */
	int getLongFailsL2();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL2 <em>Long Fails L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Fails L2</em>' attribute.
	 * @see #getLongFailsL2()
	 * @generated
	 */
	void setLongFailsL2(int value);

	/**
	 * Returns the value of the '<em><b>Long Fails L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Fails L3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Fails L3</em>' attribute.
	 * @see #setLongFailsL3(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_LongFailsL3()
	 * @model
	 * @generated
	 */
	int getLongFailsL3();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL3 <em>Long Fails L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Fails L3</em>' attribute.
	 * @see #getLongFailsL3()
	 * @generated
	 */
	void setLongFailsL3(int value);

	/**
	 * Returns the value of the '<em><b>Long Fails Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Fails Any</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Fails Any</em>' attribute.
	 * @see #setLongFailsAny(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_LongFailsAny()
	 * @model
	 * @generated
	 */
	int getLongFailsAny();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAny <em>Long Fails Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Fails Any</em>' attribute.
	 * @see #getLongFailsAny()
	 * @generated
	 */
	void setLongFailsAny(int value);

	/**
	 * Returns the value of the '<em><b>Time All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time All</em>' attribute.
	 * @see #setTimeAll(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_TimeAll()
	 * @model
	 * @generated
	 */
	String getTimeAll();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAll <em>Time All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time All</em>' attribute.
	 * @see #getTimeAll()
	 * @generated
	 */
	void setTimeAll(String value);

	/**
	 * Returns the value of the '<em><b>Time L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time L1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time L1</em>' attribute.
	 * @see #setTimeL1(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_TimeL1()
	 * @model
	 * @generated
	 */
	String getTimeL1();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL1 <em>Time L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time L1</em>' attribute.
	 * @see #getTimeL1()
	 * @generated
	 */
	void setTimeL1(String value);

	/**
	 * Returns the value of the '<em><b>Time L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time L2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time L2</em>' attribute.
	 * @see #setTimeL2(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_TimeL2()
	 * @model
	 * @generated
	 */
	String getTimeL2();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL2 <em>Time L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time L2</em>' attribute.
	 * @see #getTimeL2()
	 * @generated
	 */
	void setTimeL2(String value);

	/**
	 * Returns the value of the '<em><b>Time L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time L3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time L3</em>' attribute.
	 * @see #setTimeL3(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_TimeL3()
	 * @model
	 * @generated
	 */
	String getTimeL3();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL3 <em>Time L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time L3</em>' attribute.
	 * @see #getTimeL3()
	 * @generated
	 */
	void setTimeL3(String value);

	/**
	 * Returns the value of the '<em><b>Time Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Any</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Any</em>' attribute.
	 * @see #setTimeAny(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_TimeAny()
	 * @model
	 * @generated
	 */
	String getTimeAny();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAny <em>Time Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Any</em>' attribute.
	 * @see #getTimeAny()
	 * @generated
	 */
	void setTimeAny(String value);

	/**
	 * Returns the value of the '<em><b>Duration All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration All</em>' attribute.
	 * @see #setDurationAll(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_DurationAll()
	 * @model
	 * @generated
	 */
	int getDurationAll();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAll <em>Duration All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration All</em>' attribute.
	 * @see #getDurationAll()
	 * @generated
	 */
	void setDurationAll(int value);

	/**
	 * Returns the value of the '<em><b>Duration L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration L1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration L1</em>' attribute.
	 * @see #setDurationL1(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_DurationL1()
	 * @model
	 * @generated
	 */
	int getDurationL1();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL1 <em>Duration L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration L1</em>' attribute.
	 * @see #getDurationL1()
	 * @generated
	 */
	void setDurationL1(int value);

	/**
	 * Returns the value of the '<em><b>Duration L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration L2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration L2</em>' attribute.
	 * @see #setDurationL2(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_DurationL2()
	 * @model
	 * @generated
	 */
	int getDurationL2();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL2 <em>Duration L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration L2</em>' attribute.
	 * @see #getDurationL2()
	 * @generated
	 */
	void setDurationL2(int value);

	/**
	 * Returns the value of the '<em><b>Duration L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration L3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration L3</em>' attribute.
	 * @see #setDurationL3(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_DurationL3()
	 * @model
	 * @generated
	 */
	int getDurationL3();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL3 <em>Duration L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration L3</em>' attribute.
	 * @see #getDurationL3()
	 * @generated
	 */
	void setDurationL3(int value);

	/**
	 * Returns the value of the '<em><b>Duration Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Any</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Any</em>' attribute.
	 * @see #setDurationAny(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_DurationAny()
	 * @model
	 * @generated
	 */
	int getDurationAny();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAny <em>Duration Any</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Any</em>' attribute.
	 * @see #getDurationAny()
	 * @generated
	 */
	void setDurationAny(int value);

	/**
	 * Returns the value of the '<em><b>Time threshold long powerfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time threshold long powerfailure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time threshold long powerfailure</em>' attribute.
	 * @see #setTime_threshold_long_powerfailure(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getPowerFailureMonitoring_Time_threshold_long_powerfailure()
	 * @model
	 * @generated
	 */
	int getTime_threshold_long_powerfailure();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTime_threshold_long_powerfailure <em>Time threshold long powerfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time threshold long powerfailure</em>' attribute.
	 * @see #getTime_threshold_long_powerfailure()
	 * @generated
	 */
	void setTime_threshold_long_powerfailure(int value);

} // PowerFailureMonitoring
