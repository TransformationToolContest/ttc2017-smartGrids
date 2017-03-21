/**
 */
package CIM.IEC61970.Informative.InfGMLSupport.impl;

import CIM.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;
import CIM.IEC61970.Informative.InfGMLSupport.GmlObservation;
import CIM.IEC61970.Informative.InfGMLSupport.GmlValue;
import CIM.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Gml Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfGMLSupport.impl.GmlObservationImpl#getGmlValues <em>Gml Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GmlObservationImpl extends ElementImpl implements GmlObservation {
	/**
	 * The cached value of the '{@link #getGmlDiagramObjects() <em>Gml Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlDiagramObject> gmlDiagramObjects;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The default value of the '{@link #getResultOf() <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOf()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultOf() <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOf()
	 * @generated
	 * @ordered
	 */
	protected String resultOf = RESULT_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected static final String USING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected String using = USING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGmlValues() <em>Gml Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlValues()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlValue> gmlValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new EObjectWithInverseResolvingEList.ManyInverse<GmlDiagramObject>(GmlDiagramObject.class, this, InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS);
		}
		return gmlDiagramObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_OBSERVATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultOf() {
		return resultOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultOf(String newResultOf) {
		String oldResultOf = resultOf;
		resultOf = newResultOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF, oldResultOf, resultOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsing() {
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsing(String newUsing) {
		String oldUsing = using;
		using = newUsing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfGMLSupportPackage.GML_OBSERVATION__USING, oldUsing, using));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GmlValue> getGmlValues() {
		if (gmlValues == null) {
			gmlValues = new EObjectWithInverseResolvingEList<GmlValue>(GmlValue.class, this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION);
		}
		return gmlValues;
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlValues()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return ((InternalEList<?>)getGmlValues()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				return getTarget();
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				return getDateTime();
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return getChangeItems();
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				return getResultOf();
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				return getUsing();
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return getGmlValues();
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				setTarget((String)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				setResultOf((String)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				setUsing((String)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				getGmlValues().clear();
				getGmlValues().addAll((Collection<? extends GmlValue>)newValue);
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				setResultOf(RESULT_OF_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				setUsing(USING_EDEFAULT);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				getGmlValues().clear();
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				return RESULT_OF_EDEFAULT == null ? resultOf != null : !RESULT_OF_EDEFAULT.equals(resultOf);
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				return USING_EDEFAULT == null ? using != null : !USING_EDEFAULT.equals(using);
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return gmlValues != null && !gmlValues.isEmpty();
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
		result.append(" (target: ");
		result.append(target);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(", resultOf: ");
		result.append(resultOf);
		result.append(", using: ");
		result.append(using);
		result.append(')');
		return result.toString();
	}

} //GmlObservationImpl
