/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Direction#getHasConnectors <em>Has Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getDirection()
 * @model
 * @generated
 */
public interface Direction extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Connectors</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Connectors</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getDirection_HasConnectors()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Connector> getHasConnectors();

} // Direction
