/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBOM;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.Design;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Erp BOM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBOMImpl#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpBOMImpl#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpBOMImpl extends DocumentImpl implements ErpBOM {
	/**
	 * The cached value of the '{@link #getErpBomItemDatas() <em>Erp Bom Item Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBomItemDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBomItemData> erpBomItemDatas;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpBOMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_BOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpBomItemData> getErpBomItemDatas() {
		if (erpBomItemDatas == null) {
			erpBomItemDatas = new EObjectWithInverseResolvingEList<ErpBomItemData>(ErpBomItemData.class, this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM);
		}
		return erpBomItemDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design getDesign() {
		if (design != null && design.eIsProxy()) {
			InternalEObject oldDesign = (InternalEObject)design;
			design = (Design)eResolveProxy(oldDesign);
			if (design != oldDesign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_BOM__DESIGN, oldDesign, design));
			}
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design basicGetDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__ERP_BO_MS, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__ERP_BO_MS, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BOM__DESIGN, newDesign, newDesign));
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
			case InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBomItemDatas()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_BOM__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__ERP_BO_MS, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<?>)getErpBomItemDatas()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_BOM__DESIGN:
				return basicSetDesign(null, msgs);
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
			case InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS:
				return getErpBomItemDatas();
			case InfERPSupportPackage.ERP_BOM__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
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
			case InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				getErpBomItemDatas().addAll((Collection<? extends ErpBomItemData>)newValue);
				return;
			case InfERPSupportPackage.ERP_BOM__DESIGN:
				setDesign((Design)newValue);
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
			case InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				return;
			case InfERPSupportPackage.ERP_BOM__DESIGN:
				setDesign((Design)null);
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
			case InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS:
				return erpBomItemDatas != null && !erpBomItemDatas.isEmpty();
			case InfERPSupportPackage.ERP_BOM__DESIGN:
				return design != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpBOMImpl
