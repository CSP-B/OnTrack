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
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Track#getHasLinears <em>Has Linears</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Linears</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Linear}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Linears</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Linears</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getTrack_HasLinears()
	 * @model
	 * @generated
	 */
	EList<Linear> getHasLinears();

} // Track
