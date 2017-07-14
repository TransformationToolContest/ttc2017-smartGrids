/**
 */
package gluemodel.CIM.IEC61968.WiresExt.impl;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;
import gluemodel.CIM.IEC61968.WiresExt.TransformerBank;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.EquipmentImpl;

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
 * An implementation of the model object '<em><b>Transformer Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.TransformerBankImpl#getVectorGroup <em>Vector Group</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.WiresExt.impl.TransformerBankImpl#getTransformers <em>Transformers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerBankImpl extends EquipmentImpl implements TransformerBank {
	/**
	 * The default value of the '{@link #getVectorGroup() <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTOR_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVectorGroup() <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorGroup()
	 * @generated
	 * @ordered
	 */
	protected String vectorGroup = VECTOR_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformers() <em>Transformers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformers()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionTransformer> transformers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerBankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresExtPackage.Literals.TRANSFORMER_BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVectorGroup() {
		return vectorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorGroup(String newVectorGroup) {
		String oldVectorGroup = vectorGroup;
		vectorGroup = newVectorGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresExtPackage.TRANSFORMER_BANK__VECTOR_GROUP, oldVectorGroup, vectorGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionTransformer> getTransformers() {
		if (transformers == null) {
			transformers = new EObjectWithInverseResolvingEList<DistributionTransformer>(DistributionTransformer.class, this, WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_BANK);
		}
		return transformers;
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
			case WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformers()).basicAdd(otherEnd, msgs);
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
			case WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS:
				return ((InternalEList<?>)getTransformers()).basicRemove(otherEnd, msgs);
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
			case WiresExtPackage.TRANSFORMER_BANK__VECTOR_GROUP:
				return getVectorGroup();
			case WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS:
				return getTransformers();
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
			case WiresExtPackage.TRANSFORMER_BANK__VECTOR_GROUP:
				setVectorGroup((String)newValue);
				return;
			case WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS:
				getTransformers().clear();
				getTransformers().addAll((Collection<? extends DistributionTransformer>)newValue);
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
			case WiresExtPackage.TRANSFORMER_BANK__VECTOR_GROUP:
				setVectorGroup(VECTOR_GROUP_EDEFAULT);
				return;
			case WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS:
				getTransformers().clear();
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
			case WiresExtPackage.TRANSFORMER_BANK__VECTOR_GROUP:
				return VECTOR_GROUP_EDEFAULT == null ? vectorGroup != null : !VECTOR_GROUP_EDEFAULT.equals(vectorGroup);
			case WiresExtPackage.TRANSFORMER_BANK__TRANSFORMERS:
				return transformers != null && !transformers.isEmpty();
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
		result.append(" (vectorGroup: ");
		result.append(vectorGroup);
		result.append(')');
		return result.toString();
	}

} //TransformerBankImpl
