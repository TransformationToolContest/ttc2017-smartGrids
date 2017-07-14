/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Market Case Clearing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl#getAncillaryServiceClearing <em>Ancillary Service Clearing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl#getCaseType <em>Case Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketCaseClearingImpl#getModifiedDate <em>Modified Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketCaseClearingImpl extends MarketFactorsImpl implements MarketCaseClearing {
	/**
	 * The cached value of the '{@link #getAncillaryServiceClearing() <em>Ancillary Service Clearing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncillaryServiceClearing()
	 * @generated
	 * @ordered
	 */
	protected EList<AncillaryServiceClearing> ancillaryServiceClearing;

	/**
	 * The default value of the '{@link #getPostedDate() <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostedDate() <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected Date postedDate = POSTED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseType() <em>Case Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseType() <em>Case Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseType()
	 * @generated
	 * @ordered
	 */
	protected String caseType = CASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date modifiedDate = MODIFIED_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketCaseClearingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MARKET_CASE_CLEARING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AncillaryServiceClearing> getAncillaryServiceClearing() {
		if (ancillaryServiceClearing == null) {
			ancillaryServiceClearing = new EObjectWithInverseResolvingEList<AncillaryServiceClearing>(AncillaryServiceClearing.class, this, MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING, MarketOperationsPackage.ANCILLARY_SERVICE_CLEARING__MARKET_CASE_CLEARING);
		}
		return ancillaryServiceClearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPostedDate() {
		return postedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostedDate(Date newPostedDate) {
		Date oldPostedDate = postedDate;
		postedDate = newPostedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_CASE_CLEARING__POSTED_DATE, oldPostedDate, postedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaseType() {
		return caseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseType(String newCaseType) {
		String oldCaseType = caseType;
		caseType = newCaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_CASE_CLEARING__CASE_TYPE, oldCaseType, caseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(Date newModifiedDate) {
		Date oldModifiedDate = modifiedDate;
		modifiedDate = newModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_CASE_CLEARING__MODIFIED_DATE, oldModifiedDate, modifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAncillaryServiceClearing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING:
				return ((InternalEList<?>)getAncillaryServiceClearing()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING:
				return getAncillaryServiceClearing();
			case MarketOperationsPackage.MARKET_CASE_CLEARING__POSTED_DATE:
				return getPostedDate();
			case MarketOperationsPackage.MARKET_CASE_CLEARING__CASE_TYPE:
				return getCaseType();
			case MarketOperationsPackage.MARKET_CASE_CLEARING__MODIFIED_DATE:
				return getModifiedDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING:
				getAncillaryServiceClearing().clear();
				getAncillaryServiceClearing().addAll((Collection<? extends AncillaryServiceClearing>)newValue);
				return;
			case MarketOperationsPackage.MARKET_CASE_CLEARING__POSTED_DATE:
				setPostedDate((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET_CASE_CLEARING__CASE_TYPE:
				setCaseType((String)newValue);
				return;
			case MarketOperationsPackage.MARKET_CASE_CLEARING__MODIFIED_DATE:
				setModifiedDate((Date)newValue);
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
			case MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING:
				getAncillaryServiceClearing().clear();
				return;
			case MarketOperationsPackage.MARKET_CASE_CLEARING__POSTED_DATE:
				setPostedDate(POSTED_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_CASE_CLEARING__CASE_TYPE:
				setCaseType(CASE_TYPE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_CASE_CLEARING__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
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
			case MarketOperationsPackage.MARKET_CASE_CLEARING__ANCILLARY_SERVICE_CLEARING:
				return ancillaryServiceClearing != null && !ancillaryServiceClearing.isEmpty();
			case MarketOperationsPackage.MARKET_CASE_CLEARING__POSTED_DATE:
				return POSTED_DATE_EDEFAULT == null ? postedDate != null : !POSTED_DATE_EDEFAULT.equals(postedDate);
			case MarketOperationsPackage.MARKET_CASE_CLEARING__CASE_TYPE:
				return CASE_TYPE_EDEFAULT == null ? caseType != null : !CASE_TYPE_EDEFAULT.equals(caseType);
			case MarketOperationsPackage.MARKET_CASE_CLEARING__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
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
		result.append(" (postedDate: ");
		result.append(postedDate);
		result.append(", caseType: ");
		result.append(caseType);
		result.append(", modifiedDate: ");
		result.append(modifiedDate);
		result.append(')');
		return result.toString();
	}

} //MarketCaseClearingImpl
