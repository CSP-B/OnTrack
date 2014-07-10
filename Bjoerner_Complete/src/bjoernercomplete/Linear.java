/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Linear#getHasSignals <em>Has Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getLinear()
 * @model
 * @generated
 */
public interface Linear extends Unit {

	/**
	 * Returns the value of the '<em><b>Has Signals</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Signal}.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Signal#getPlacedOnLinear <em>Placed On Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signals</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getLinear_HasSignals()
	 * @see bjoernercomplete.Signal#getPlacedOnLinear
	 * @model opposite="placedOnLinear" upper="2"
	 * @generated
	 */
	EList<Signal> getHasSignals();
} // Linear
