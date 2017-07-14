/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.DisconnectControlSchedule;
import gluemodel.COSEM.COSEMObjects.EndOfBillingPeriodSchedule;
import gluemodel.COSEM.COSEMObjects.ImageActivationSchedule;
import gluemodel.COSEM.COSEMObjects.OutputControlSchedule;
import gluemodel.COSEM.COSEMObjects.PushSchedule;
import gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject;

import gluemodel.COSEM.InterfaceClasses.impl.SingleactionscheduleImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Action Schedule Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl#getBillingPeriodEnd <em>Billing Period End</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl#getImage <em>Image</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl#getPush <em>Push</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleActionScheduleObjectImpl extends SingleactionscheduleImpl implements SingleActionScheduleObject {
	/**
	 * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnect()
	 * @generated
	 * @ordered
	 */
	protected DisconnectControlSchedule disconnect;

	/**
	 * The cached value of the '{@link #getBillingPeriodEnd() <em>Billing Period End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingPeriodEnd()
	 * @generated
	 * @ordered
	 */
	protected EndOfBillingPeriodSchedule billingPeriodEnd;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected ImageActivationSchedule image;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected OutputControlSchedule output;

	/**
	 * The cached value of the '{@link #getPush() <em>Push</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPush()
	 * @generated
	 * @ordered
	 */
	protected PushSchedule push;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleActionScheduleObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getSingleActionScheduleObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControlSchedule getDisconnect() {
		if (disconnect != null && disconnect.eIsProxy()) {
			InternalEObject oldDisconnect = (InternalEObject)disconnect;
			disconnect = (DisconnectControlSchedule)eResolveProxy(oldDisconnect);
			if (disconnect != oldDisconnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT, oldDisconnect, disconnect));
			}
		}
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControlSchedule basicGetDisconnect() {
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnect(DisconnectControlSchedule newDisconnect) {
		DisconnectControlSchedule oldDisconnect = disconnect;
		disconnect = newDisconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT, oldDisconnect, disconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfBillingPeriodSchedule getBillingPeriodEnd() {
		if (billingPeriodEnd != null && billingPeriodEnd.eIsProxy()) {
			InternalEObject oldBillingPeriodEnd = (InternalEObject)billingPeriodEnd;
			billingPeriodEnd = (EndOfBillingPeriodSchedule)eResolveProxy(oldBillingPeriodEnd);
			if (billingPeriodEnd != oldBillingPeriodEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END, oldBillingPeriodEnd, billingPeriodEnd));
			}
		}
		return billingPeriodEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfBillingPeriodSchedule basicGetBillingPeriodEnd() {
		return billingPeriodEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingPeriodEnd(EndOfBillingPeriodSchedule newBillingPeriodEnd) {
		EndOfBillingPeriodSchedule oldBillingPeriodEnd = billingPeriodEnd;
		billingPeriodEnd = newBillingPeriodEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END, oldBillingPeriodEnd, billingPeriodEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageActivationSchedule getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (ImageActivationSchedule)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageActivationSchedule basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(ImageActivationSchedule newImage) {
		ImageActivationSchedule oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputControlSchedule getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (OutputControlSchedule)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputControlSchedule basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(OutputControlSchedule newOutput) {
		OutputControlSchedule oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushSchedule getPush() {
		if (push != null && push.eIsProxy()) {
			InternalEObject oldPush = (InternalEObject)push;
			push = (PushSchedule)eResolveProxy(oldPush);
			if (push != oldPush) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__PUSH, oldPush, push));
			}
		}
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushSchedule basicGetPush() {
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPush(PushSchedule newPush) {
		PushSchedule oldPush = push;
		push = newPush;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__PUSH, oldPush, push));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT:
				if (resolve) return getDisconnect();
				return basicGetDisconnect();
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END:
				if (resolve) return getBillingPeriodEnd();
				return basicGetBillingPeriodEnd();
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__PUSH:
				if (resolve) return getPush();
				return basicGetPush();
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
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT:
				setDisconnect((DisconnectControlSchedule)newValue);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END:
				setBillingPeriodEnd((EndOfBillingPeriodSchedule)newValue);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE:
				setImage((ImageActivationSchedule)newValue);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT:
				setOutput((OutputControlSchedule)newValue);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__PUSH:
				setPush((PushSchedule)newValue);
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
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT:
				setDisconnect((DisconnectControlSchedule)null);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END:
				setBillingPeriodEnd((EndOfBillingPeriodSchedule)null);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE:
				setImage((ImageActivationSchedule)null);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT:
				setOutput((OutputControlSchedule)null);
				return;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__PUSH:
				setPush((PushSchedule)null);
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
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT:
				return disconnect != null;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END:
				return billingPeriodEnd != null;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE:
				return image != null;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT:
				return output != null;
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT__PUSH:
				return push != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleActionScheduleObjectImpl
