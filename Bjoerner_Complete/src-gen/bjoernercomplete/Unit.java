/**
 */
package bjoernercomplete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Unit#getHasC1 <em>Has C1</em>}</li>
 *   <li>{@link bjoernercomplete.Unit#getHasC2 <em>Has C2</em>}</li>
 *   <li>{@link bjoernercomplete.Unit#getName <em>Name</em>}</li>
 *   <li>{@link bjoernercomplete.Unit#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Has C1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Connector#getHasUnit1 <em>Has Unit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has C1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has C1</em>' reference.
	 * @see #setHasC1(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getUnit_HasC1()
	 * @see bjoernercomplete.Connector#getHasUnit1
	 * @model opposite="hasUnit1" required="true"
	 * @generated
	 */
	Connector getHasC1();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Unit#getHasC1 <em>Has C1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has C1</em>' reference.
	 * @see #getHasC1()
	 * @generated
	 */
	void setHasC1(Connector value);

	/**
	 * Returns the value of the '<em><b>Has C2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Connector#getHasUnit2 <em>Has Unit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has C2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has C2</em>' reference.
	 * @see #setHasC2(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getUnit_HasC2()
	 * @see bjoernercomplete.Connector#getHasUnit2
	 * @model opposite="hasUnit2" required="true"
	 * @generated
	 */
	Connector getHasC2();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Unit#getHasC2 <em>Has C2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has C2</em>' reference.
	 * @see #getHasC2()
	 * @generated
	 */
	void setHasC2(Connector value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bjoernercomplete.BjoernercompletePackage#getUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see bjoernercomplete.BjoernercompletePackage#getUnit_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Unit#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Unit
