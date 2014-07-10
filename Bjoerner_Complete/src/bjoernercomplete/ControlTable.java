/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.ControlTable#getHasRoutes <em>Has Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getControlTable()
 * @model
 * @generated
 */
public interface ControlTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Routes</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Routes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Routes</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getControlTable_HasRoutes()
	 * @model
	 * @generated
	 */
	EList<Route> getHasRoutes();

} // ControlTable
