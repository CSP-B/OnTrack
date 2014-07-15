/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Point#getPointName <em>Point Name</em>}</li>
 *   <li>{@link bjoernercomplete.Point#getHasC3_Point <em>Has C3 Point</em>}</li>
 *   <li>{@link bjoernercomplete.Point#getHasPointDirection <em>Has Point Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Unit {
	/**
	 * Returns the value of the '<em><b>Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Name</em>' attribute.
	 * @see #setPointName(String)
	 * @see bjoernercomplete.BjoernercompletePackage#getPoint_PointName()
	 * @model
	 * @generated
	 */
	String getPointName();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Point#getPointName <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Name</em>' attribute.
	 * @see #getPointName()
	 * @generated
	 */
	void setPointName(String value);

	/**
	 * Returns the value of the '<em><b>Has C3 Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has C3 Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has C3 Point</em>' reference.
	 * @see #setHasC3_Point(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getPoint_HasC3_Point()
	 * @model required="true"
	 * @generated
	 */
	Connector getHasC3_Point();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Point#getHasC3_Point <em>Has C3 Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has C3 Point</em>' reference.
	 * @see #getHasC3_Point()
	 * @generated
	 */
	void setHasC3_Point(Connector value);

	/**
	 * Returns the value of the '<em><b>Has Point Direction</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Point Direction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Point Direction</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getPoint_HasPointDirection()
	 * @model lower="2" upper="4"
	 * @generated
	 */
	EList<Direction> getHasPointDirection();

} // Point
