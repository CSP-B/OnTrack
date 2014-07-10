/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Path#getHasPC2 <em>Has PC2</em>}</li>
 *   <li>{@link bjoernercomplete.Path#getHasPC1 <em>Has PC1</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Has PC2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has PC2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has PC2</em>' reference.
	 * @see #setHasPC2(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getPath_HasPC2()
	 * @model required="true"
	 * @generated
	 */
	Connector getHasPC2();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Path#getHasPC2 <em>Has PC2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has PC2</em>' reference.
	 * @see #getHasPC2()
	 * @generated
	 */
	void setHasPC2(Connector value);

	/**
	 * Returns the value of the '<em><b>Has PC1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has PC1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has PC1</em>' reference.
	 * @see #setHasPC1(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getPath_HasPC1()
	 * @model required="true"
	 * @generated
	 */
	Connector getHasPC1();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Path#getHasPC1 <em>Has PC1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has PC1</em>' reference.
	 * @see #getHasPC1()
	 * @generated
	 */
	void setHasPC1(Connector value);

} // Path
