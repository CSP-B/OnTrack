/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Point#getHasC3 <em>Has C3</em>}</li>
 *   <li>{@link bjoernercomplete.Point#getPointName <em>Point Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends Unit {
	/**
	 * Returns the value of the '<em><b>Has C3</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Connector#getHasPoint <em>Has Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has C3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has C3</em>' reference.
	 * @see #setHasC3(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getPoint_HasC3()
	 * @see bjoernercomplete.Connector#getHasPoint
	 * @model opposite="hasPoint" required="true"
	 * @generated
	 */
	Connector getHasC3();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Point#getHasC3 <em>Has C3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has C3</em>' reference.
	 * @see #getHasC3()
	 * @generated
	 */
	void setHasC3(Connector value);

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

} // Point
