/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crossing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Crossing#getHasC3_Crossing <em>Has C3 Crossing</em>}</li>
 *   <li>{@link bjoernercomplete.Crossing#getHasC4_Crossing <em>Has C4 Crossing</em>}</li>
 *   <li>{@link bjoernercomplete.Crossing#getHasCrossingDirection <em>Has Crossing Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getCrossing()
 * @model
 * @generated
 */
public interface Crossing extends Unit {
	/**
	 * Returns the value of the '<em><b>Has C3 Crossing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has C3 Crossing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has C3 Crossing</em>' reference.
	 * @see #setHasC3_Crossing(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getCrossing_HasC3_Crossing()
	 * @model required="true"
	 * @generated
	 */
	Connector getHasC3_Crossing();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Crossing#getHasC3_Crossing <em>Has C3 Crossing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has C3 Crossing</em>' reference.
	 * @see #getHasC3_Crossing()
	 * @generated
	 */
	void setHasC3_Crossing(Connector value);

	/**
	 * Returns the value of the '<em><b>Has C4 Crossing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has C4 Crossing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has C4 Crossing</em>' reference.
	 * @see #setHasC4_Crossing(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getCrossing_HasC4_Crossing()
	 * @model required="true"
	 * @generated
	 */
	Connector getHasC4_Crossing();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Crossing#getHasC4_Crossing <em>Has C4 Crossing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has C4 Crossing</em>' reference.
	 * @see #getHasC4_Crossing()
	 * @generated
	 */
	void setHasC4_Crossing(Connector value);

	/**
	 * Returns the value of the '<em><b>Has Crossing Direction</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Crossing Direction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Crossing Direction</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getCrossing_HasCrossingDirection()
	 * @model lower="2" upper="4"
	 * @generated
	 */
	EList<Direction> getHasCrossingDirection();

} // Crossing
