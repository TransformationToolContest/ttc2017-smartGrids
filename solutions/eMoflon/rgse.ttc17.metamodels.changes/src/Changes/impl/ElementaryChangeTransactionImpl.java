/**
 */
package Changes.impl;

import Changes.ChangesPackage;
import Changes.ElementaryChangeTransaction;
import Changes.ModelChange;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementary Change Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Changes.impl.ElementaryChangeTransactionImpl#getSourceChange <em>Source Change</em>}</li>
 *   <li>{@link Changes.impl.ElementaryChangeTransactionImpl#getNestedChanges <em>Nested Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementaryChangeTransactionImpl extends ElementaryChangeImpl implements ElementaryChangeTransaction {
	/**
	 * The cached value of the '{@link #getSourceChange() <em>Source Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceChange()
	 * @generated
	 * @ordered
	 */
	protected ModelChange sourceChange;

	/**
	 * The cached value of the '{@link #getNestedChanges() <em>Nested Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelChange> nestedChanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryChangeTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangesPackage.Literals.ELEMENTARY_CHANGE_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChange getSourceChange() {
		return sourceChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceChange(ModelChange newSourceChange, NotificationChain msgs) {
		ModelChange oldSourceChange = sourceChange;
		sourceChange = newSourceChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE, oldSourceChange, newSourceChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceChange(ModelChange newSourceChange) {
		if (newSourceChange != sourceChange) {
			NotificationChain msgs = null;
			if (sourceChange != null)
				msgs = ((InternalEObject)sourceChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE, null, msgs);
			if (newSourceChange != null)
				msgs = ((InternalEObject)newSourceChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE, null, msgs);
			msgs = basicSetSourceChange(newSourceChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE, newSourceChange, newSourceChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelChange> getNestedChanges() {
		if (nestedChanges == null) {
			nestedChanges = new EObjectContainmentEList<ModelChange>(ModelChange.class, this, ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES);
		}
		return nestedChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE:
				return basicSetSourceChange(null, msgs);
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES:
				return ((InternalEList<?>)getNestedChanges()).basicRemove(otherEnd, msgs);
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
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE:
				return getSourceChange();
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES:
				return getNestedChanges();
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
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE:
				setSourceChange((ModelChange)newValue);
				return;
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES:
				getNestedChanges().clear();
				getNestedChanges().addAll((Collection<? extends ModelChange>)newValue);
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
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE:
				setSourceChange((ModelChange)null);
				return;
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES:
				getNestedChanges().clear();
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
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE:
				return sourceChange != null;
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES:
				return nestedChanges != null && !nestedChanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementaryChangeTransactionImpl
