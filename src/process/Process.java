/**
 */
package process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process.Process#getEnd <em>End</em>}</li>
 *   <li>{@link process.Process#getBegining <em>Begining</em>}</li>
 *   <li>{@link process.Process#getCurrentActivity <em>Current Activity</em>}</li>
 *   <li>{@link process.Process#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see process.ProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see process.ProcessPackage#getProcess_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link process.Process#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Begining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begining</em>' containment reference.
	 * @see #setBegining(Init)
	 * @see process.ProcessPackage#getProcess_Begining()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Init getBegining();

	/**
	 * Sets the value of the '{@link process.Process#getBegining <em>Begining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begining</em>' containment reference.
	 * @see #getBegining()
	 * @generated
	 */
	void setBegining(Init value);

	/**
	 * Returns the value of the '<em><b>Current Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Activity</em>' reference.
	 * @see #setCurrentActivity(Activity)
	 * @see process.ProcessPackage#getProcess_CurrentActivity()
	 * @model
	 * @generated
	 */
	Activity getCurrentActivity();

	/**
	 * Sets the value of the '{@link process.Process#getCurrentActivity <em>Current Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Activity</em>' reference.
	 * @see #getCurrentActivity()
	 * @generated
	 */
	void setCurrentActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link process.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see process.ProcessPackage#getProcess_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Process
