/**
 */
package gluemodel.CIM.IEC61970.Contingency.impl;

import gluemodel.CIM.IEC61970.Contingency.Contingency;
import gluemodel.CIM.IEC61970.Contingency.ContingencyElement;
import gluemodel.CIM.IEC61970.Contingency.ContingencyPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.ContingencyConstraintLimit;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Contingency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.impl.ContingencyImpl#getContingencyConstraintLimit <em>Contingency Constraint Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.impl.ContingencyImpl#isMustStudy <em>Must Study</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Contingency.impl.ContingencyImpl#getContingencyElement <em>Contingency Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyImpl extends IdentifiedObjectImpl implements Contingency {
	/**
	 * The cached value of the '{@link #getContingencyConstraintLimit() <em>Contingency Constraint Limit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingencyConstraintLimit()
	 * @generated
	 * @ordered
	 */
	protected EList<ContingencyConstraintLimit> contingencyConstraintLimit;

	/**
	 * The default value of the '{@link #isMustStudy() <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustStudy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_STUDY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustStudy() <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustStudy()
	 * @generated
	 * @ordered
	 */
	protected boolean mustStudy = MUST_STUDY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContingencyElement() <em>Contingency Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingencyElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ContingencyElement> contingencyElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContingencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContingencyPackage.Literals.CONTINGENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContingencyConstraintLimit> getContingencyConstraintLimit() {
		if (contingencyConstraintLimit == null) {
			contingencyConstraintLimit = new EObjectWithInverseResolvingEList<ContingencyConstraintLimit>(ContingencyConstraintLimit.class, this, ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT, MarketOperationsPackage.CONTINGENCY_CONSTRAINT_LIMIT__CONTINGENCY);
		}
		return contingencyConstraintLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustStudy() {
		return mustStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustStudy(boolean newMustStudy) {
		boolean oldMustStudy = mustStudy;
		mustStudy = newMustStudy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContingencyPackage.CONTINGENCY__MUST_STUDY, oldMustStudy, mustStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContingencyElement> getContingencyElement() {
		if (contingencyElement == null) {
			contingencyElement = new EObjectWithInverseResolvingEList<ContingencyElement>(ContingencyElement.class, this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY);
		}
		return contingencyElement;
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContingencyConstraintLimit()).basicAdd(otherEnd, msgs);
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContingencyElement()).basicAdd(otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT:
				return ((InternalEList<?>)getContingencyConstraintLimit()).basicRemove(otherEnd, msgs);
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return ((InternalEList<?>)getContingencyElement()).basicRemove(otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT:
				return getContingencyConstraintLimit();
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				return isMustStudy();
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return getContingencyElement();
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT:
				getContingencyConstraintLimit().clear();
				getContingencyConstraintLimit().addAll((Collection<? extends ContingencyConstraintLimit>)newValue);
				return;
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				setMustStudy((Boolean)newValue);
				return;
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				getContingencyElement().clear();
				getContingencyElement().addAll((Collection<? extends ContingencyElement>)newValue);
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT:
				getContingencyConstraintLimit().clear();
				return;
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				setMustStudy(MUST_STUDY_EDEFAULT);
				return;
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				getContingencyElement().clear();
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_CONSTRAINT_LIMIT:
				return contingencyConstraintLimit != null && !contingencyConstraintLimit.isEmpty();
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				return mustStudy != MUST_STUDY_EDEFAULT;
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return contingencyElement != null && !contingencyElement.isEmpty();
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
		result.append(" (mustStudy: ");
		result.append(mustStudy);
		result.append(')');
		return result.toString();
	}

} //ContingencyImpl
