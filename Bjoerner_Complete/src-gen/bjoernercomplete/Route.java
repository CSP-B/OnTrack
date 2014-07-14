/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Route#getHasUPPs <em>Has UP Ps</em>}</li>
 *   <li>{@link bjoernercomplete.Route#getControlledBySignal <em>Controlled By Signal</em>}</li>
 *   <li>{@link bjoernercomplete.Route#getName <em>Name</em>}</li>
 *   <li>{@link bjoernercomplete.Route#getHasNormalPoints <em>Has Normal Points</em>}</li>
 *   <li>{@link bjoernercomplete.Route#getHasReversePoints <em>Has Reverse Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Has UP Ps</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.UnitPathPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has UP Ps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has UP Ps</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getRoute_HasUPPs()
	 * @model
	 * @generated
	 */
	EList<UnitPathPair> getHasUPPs();

	/**
	 * Returns the value of the '<em><b>Controlled By Signal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Signal#getControlsRoutes <em>Controls Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By Signal</em>' reference.
	 * @see #setControlledBySignal(Signal)
	 * @see bjoernercomplete.BjoernercompletePackage#getRoute_ControlledBySignal()
	 * @see bjoernercomplete.Signal#getControlsRoutes
	 * @model opposite="controlsRoutes" required="true"
	 * @generated
	 */
	Signal getControlledBySignal();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Route#getControlledBySignal <em>Controlled By Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled By Signal</em>' reference.
	 * @see #getControlledBySignal()
	 * @generated
	 */
	void setControlledBySignal(Signal value);

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
	 * @see bjoernercomplete.BjoernercompletePackage#getRoute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Route#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Normal Points</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Normal Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Normal Points</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getRoute_HasNormalPoints()
	 * @model
	 * @generated
	 */
	EList<Point> getHasNormalPoints();

	/**
	 * Returns the value of the '<em><b>Has Reverse Points</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Reverse Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Reverse Points</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getRoute_HasReversePoints()
	 * @model
	 * @generated
	 */
	EList<Point> getHasReversePoints();

} // Route
