/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.Procedure;
import CIM.IEC61970.Informative.InfAssets.ProcedureDataSet;
import CIM.IEC61970.Informative.InfAssets.TransformerObservation;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.MeasurementValue;

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
 * An implementation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ProcedureDataSetImpl#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureDataSetImpl extends DocumentImpl implements ProcedureDataSet {
	/**
	 * The default value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMPLETED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurementValues() <em>Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementValue> measurementValues;

	/**
	 * The cached value of the '{@link #getTransformerObservations() <em>Transformer Observations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerObservation> transformerObservations;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> properties;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getProcedureDataSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCompletedDateTime() {
		return completedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletedDateTime(Date newCompletedDateTime) {
		Date oldCompletedDateTime = completedDateTime;
		completedDateTime = newCompletedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME, oldCompletedDateTime, completedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementValue> getMeasurementValues() {
		if (measurementValues == null) {
			measurementValues = new EObjectWithInverseResolvingEList.ManyInverse<MeasurementValue>(MeasurementValue.class, this, InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES, MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS);
		}
		return measurementValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerObservation> getTransformerObservations() {
		if (transformerObservations == null) {
			transformerObservations = new EObjectWithInverseResolvingEList.ManyInverse<TransformerObservation>(TransformerObservation.class, this, InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS, InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS);
		}
		return transformerObservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getProperties() {
		if (properties == null) {
			properties = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES, CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		if (procedure != null && procedure.eIsProxy()) {
			InternalEObject oldProcedure = (InternalEObject)procedure;
			procedure = (Procedure)eResolveProxy(oldProcedure);
			if (procedure != oldProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE, oldProcedure, procedure));
			}
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure basicGetProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE, oldProcedure, newProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE, newProcedure, newProcedure));
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurementValues()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerObservations()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				if (procedure != null)
					msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs);
				return basicSetProcedure((Procedure)otherEnd, msgs);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return ((InternalEList<?>)getMeasurementValues()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<?>)getTransformerObservations()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				return basicSetProcedure(null, msgs);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				return getCompletedDateTime();
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return getMeasurementValues();
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return getTransformerObservations();
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return getProperties();
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				setCompletedDateTime((Date)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				getMeasurementValues().addAll((Collection<? extends MeasurementValue>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				getTransformerObservations().addAll((Collection<? extends TransformerObservation>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				setProcedure((Procedure)newValue);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				setCompletedDateTime(COMPLETED_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				getProperties().clear();
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				setProcedure((Procedure)null);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				return COMPLETED_DATE_TIME_EDEFAULT == null ? completedDateTime != null : !COMPLETED_DATE_TIME_EDEFAULT.equals(completedDateTime);
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return measurementValues != null && !measurementValues.isEmpty();
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return transformerObservations != null && !transformerObservations.isEmpty();
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				return procedure != null;
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
		result.append(" (completedDateTime: ");
		result.append(completedDateTime);
		result.append(')');
		return result.toString();
	}

} //ProcedureDataSetImpl
