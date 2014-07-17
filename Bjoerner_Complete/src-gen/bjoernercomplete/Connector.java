/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Connector#getHasUnit1 <em>Has Unit1</em>}</li>
 *   <li>{@link bjoernercomplete.Connector#getHasPoint <em>Has Point</em>}</li>
 *   <li>{@link bjoernercomplete.Connector#getHasUnit2 <em>Has Unit2</em>}</li>
 *   <li>{@link bjoernercomplete.Connector#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Unit1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Unit#getHasC1 <em>Has C1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Unit1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Unit1</em>' reference.
	 * @see #setHasUnit1(Unit)
	 * @see bjoernercomplete.BjoernercompletePackage#getConnector_HasUnit1()
	 * @see bjoernercomplete.Unit#getHasC1
	 * @model opposite="hasC1"
	 * @generated
	 */
	Unit getHasUnit1();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Connector#getHasUnit1 <em>Has Unit1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Unit1</em>' reference.
	 * @see #getHasUnit1()
	 * @generated
	 */
	void setHasUnit1(Unit value);

	/**
	 * Returns the value of the '<em><b>Has Point</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Point</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getConnector_HasPoint()
	 * @model upper="2"
	 * @generated
	 */
	EList<Point> getHasPoint();

	/**
	 * Returns the value of the '<em><b>Has Unit2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Unit#getHasC2 <em>Has C2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Unit2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Unit2</em>' reference.
	 * @see #setHasUnit2(Unit)
	 * @see bjoernercomplete.BjoernercompletePackage#getConnector_HasUnit2()
	 * @see bjoernercomplete.Unit#getHasC2
	 * @model opposite="hasC2"
	 * @generated
	 */
	Unit getHasUnit2();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Connector#getHasUnit2 <em>Has Unit2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Unit2</em>' reference.
	 * @see #getHasUnit2()
	 * @generated
	 */
	void setHasUnit2(Unit value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see bjoernercomplete.BjoernercompletePackage#getConnector_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Connector#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Connector
