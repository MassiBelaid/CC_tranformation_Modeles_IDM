/**
 */
package process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process.Activity;
import process.End;
import process.Init;
import process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process.impl.ProcessImpl#getEnd <em>End</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getBegining <em>Begining</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getCurrentActivity <em>Current Activity</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements process.Process {
	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * The cached value of the '{@link #getBegining() <em>Begining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegining()
	 * @generated
	 * @ordered
	 */
	protected Init begining;

	/**
	 * The cached value of the '{@link #getCurrentActivity() <em>Current Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity currentActivity;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PROCESS__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PROCESS__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Init getBegining() {
		return begining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegining(Init newBegining, NotificationChain msgs) {
		Init oldBegining = begining;
		begining = newBegining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__BEGINING, oldBegining, newBegining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegining(Init newBegining) {
		if (newBegining != begining) {
			NotificationChain msgs = null;
			if (begining != null)
				msgs = ((InternalEObject)begining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PROCESS__BEGINING, null, msgs);
			if (newBegining != null)
				msgs = ((InternalEObject)newBegining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.PROCESS__BEGINING, null, msgs);
			msgs = basicSetBegining(newBegining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__BEGINING, newBegining, newBegining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getCurrentActivity() {
		if (currentActivity != null && currentActivity.eIsProxy()) {
			InternalEObject oldCurrentActivity = (InternalEObject)currentActivity;
			currentActivity = (Activity)eResolveProxy(oldCurrentActivity);
			if (currentActivity != oldCurrentActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PROCESS__CURRENT_ACTIVITY, oldCurrentActivity, currentActivity));
			}
		}
		return currentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetCurrentActivity() {
		return currentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentActivity(Activity newCurrentActivity) {
		Activity oldCurrentActivity = currentActivity;
		currentActivity = newCurrentActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__CURRENT_ACTIVITY, oldCurrentActivity, currentActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, ProcessPackage.PROCESS__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PROCESS__END:
				return basicSetEnd(null, msgs);
			case ProcessPackage.PROCESS__BEGINING:
				return basicSetBegining(null, msgs);
			case ProcessPackage.PROCESS__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.PROCESS__END:
				return getEnd();
			case ProcessPackage.PROCESS__BEGINING:
				return getBegining();
			case ProcessPackage.PROCESS__CURRENT_ACTIVITY:
				if (resolve) return getCurrentActivity();
				return basicGetCurrentActivity();
			case ProcessPackage.PROCESS__ACTIVITIES:
				return getActivities();
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
			case ProcessPackage.PROCESS__END:
				setEnd((End)newValue);
				return;
			case ProcessPackage.PROCESS__BEGINING:
				setBegining((Init)newValue);
				return;
			case ProcessPackage.PROCESS__CURRENT_ACTIVITY:
				setCurrentActivity((Activity)newValue);
				return;
			case ProcessPackage.PROCESS__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case ProcessPackage.PROCESS__END:
				setEnd((End)null);
				return;
			case ProcessPackage.PROCESS__BEGINING:
				setBegining((Init)null);
				return;
			case ProcessPackage.PROCESS__CURRENT_ACTIVITY:
				setCurrentActivity((Activity)null);
				return;
			case ProcessPackage.PROCESS__ACTIVITIES:
				getActivities().clear();
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
			case ProcessPackage.PROCESS__END:
				return end != null;
			case ProcessPackage.PROCESS__BEGINING:
				return begining != null;
			case ProcessPackage.PROCESS__CURRENT_ACTIVITY:
				return currentActivity != null;
			case ProcessPackage.PROCESS__ACTIVITIES:
				return activities != null && !activities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
