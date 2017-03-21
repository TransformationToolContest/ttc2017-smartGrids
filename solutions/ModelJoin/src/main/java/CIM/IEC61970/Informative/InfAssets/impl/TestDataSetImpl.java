/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.TestDataSet;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TestDataSetImpl#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TestDataSetImpl#getSpecimenID <em>Specimen ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.TestDataSetImpl#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestDataSetImpl extends ProcedureDataSetImpl implements TestDataSet {
	/**
	 * The default value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenToLabDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenToLabDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenID()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIMEN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenID()
	 * @generated
	 * @ordered
	 */
	protected String specimenID = SPECIMEN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected String conclusion = CONCLUSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTestDataSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSpecimenToLabDateTime() {
		return specimenToLabDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenToLabDateTime(Date newSpecimenToLabDateTime) {
		Date oldSpecimenToLabDateTime = specimenToLabDateTime;
		specimenToLabDateTime = newSpecimenToLabDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME, oldSpecimenToLabDateTime, specimenToLabDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecimenID() {
		return specimenID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenID(String newSpecimenID) {
		String oldSpecimenID = specimenID;
		specimenID = newSpecimenID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID, oldSpecimenID, specimenID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(String newConclusion) {
		String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TEST_DATA_SET__CONCLUSION, oldConclusion, conclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				return getSpecimenToLabDateTime();
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				return getSpecimenID();
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				return getConclusion();
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
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				setSpecimenToLabDateTime((Date)newValue);
				return;
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				setSpecimenID((String)newValue);
				return;
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				setConclusion((String)newValue);
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
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				setSpecimenToLabDateTime(SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				setSpecimenID(SPECIMEN_ID_EDEFAULT);
				return;
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				setConclusion(CONCLUSION_EDEFAULT);
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
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				return SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT == null ? specimenToLabDateTime != null : !SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT.equals(specimenToLabDateTime);
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				return SPECIMEN_ID_EDEFAULT == null ? specimenID != null : !SPECIMEN_ID_EDEFAULT.equals(specimenID);
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				return CONCLUSION_EDEFAULT == null ? conclusion != null : !CONCLUSION_EDEFAULT.equals(conclusion);
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
		result.append(" (specimenToLabDateTime: ");
		result.append(specimenToLabDateTime);
		result.append(", specimenID: ");
		result.append(specimenID);
		result.append(", conclusion: ");
		result.append(conclusion);
		result.append(')');
		return result.toString();
	}

} //TestDataSetImpl
