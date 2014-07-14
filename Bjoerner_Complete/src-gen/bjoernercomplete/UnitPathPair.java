/**
 */
package bjoernercomplete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Path Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.UnitPathPair#getHasPath <em>Has Path</em>}</li>
 *   <li>{@link bjoernercomplete.UnitPathPair#getHasUnit <em>Has Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getUnitPathPair()
 * @model
 * @generated
 */
public interface UnitPathPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Path</em>' reference.
	 * @see #setHasPath(Path)
	 * @see bjoernercomplete.BjoernercompletePackage#getUnitPathPair_HasPath()
	 * @model required="true"
	 * @generated
	 */
	Path getHasPath();

	/**
	 * Sets the value of the '{@link bjoernercomplete.UnitPathPair#getHasPath <em>Has Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Path</em>' reference.
	 * @see #getHasPath()
	 * @generated
	 */
	void setHasPath(Path value);

	/**
	 * Returns the value of the '<em><b>Has Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Unit</em>' reference.
	 * @see #setHasUnit(Unit)
	 * @see bjoernercomplete.BjoernercompletePackage#getUnitPathPair_HasUnit()
	 * @model required="true"
	 * @generated
	 */
	Unit getHasUnit();

	/**
	 * Sets the value of the '{@link bjoernercomplete.UnitPathPair#getHasUnit <em>Has Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Unit</em>' reference.
	 * @see #getHasUnit()
	 * @generated
	 */
	void setHasUnit(Unit value);

} // UnitPathPair
