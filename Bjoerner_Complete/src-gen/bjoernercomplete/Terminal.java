/**
 */
package bjoernercomplete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Terminal#getHasTerminalSignal <em>Has Terminal Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends Track {
	/**
	 * Returns the value of the '<em><b>Has Terminal Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Terminal Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Terminal Signal</em>' reference.
	 * @see #setHasTerminalSignal(Signal)
	 * @see bjoernercomplete.BjoernercompletePackage#getTerminal_HasTerminalSignal()
	 * @model required="true"
	 * @generated
	 */
	Signal getHasTerminalSignal();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Terminal#getHasTerminalSignal <em>Has Terminal Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Terminal Signal</em>' reference.
	 * @see #getHasTerminalSignal()
	 * @generated
	 */
	void setHasTerminalSignal(Signal value);

} // Terminal
