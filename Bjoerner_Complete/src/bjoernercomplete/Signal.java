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
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Signal#getControlsRoutes <em>Controls Routes</em>}</li>
 *   <li>{@link bjoernercomplete.Signal#getName <em>Name</em>}</li>
 *   <li>{@link bjoernercomplete.Signal#getPlacedOnLinear <em>Placed On Linear</em>}</li>
 *   <li>{@link bjoernercomplete.Signal#getPlacedAtConnector <em>Placed At Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls Routes</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Route}.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Route#getControlledBySignal <em>Controlled By Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls Routes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls Routes</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_ControlsRoutes()
	 * @see bjoernercomplete.Route#getControlledBySignal
	 * @model opposite="controlledBySignal"
	 * @generated
	 */
	EList<Route> getControlsRoutes();

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
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Signal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Placed On Linear</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Linear#getHasSignals <em>Has Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placed On Linear</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placed On Linear</em>' reference.
	 * @see #setPlacedOnLinear(Linear)
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_PlacedOnLinear()
	 * @see bjoernercomplete.Linear#getHasSignals
	 * @model opposite="hasSignals" required="true"
	 * @generated
	 */
	Linear getPlacedOnLinear();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Signal#getPlacedOnLinear <em>Placed On Linear</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed On Linear</em>' reference.
	 * @see #getPlacedOnLinear()
	 * @generated
	 */
	void setPlacedOnLinear(Linear value);

	/**
	 * Returns the value of the '<em><b>Placed At Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placed At Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placed At Connector</em>' reference.
	 * @see #setPlacedAtConnector(Connector)
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_PlacedAtConnector()
	 * @model required="true"
	 * @generated
	 */
	Connector getPlacedAtConnector();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Signal#getPlacedAtConnector <em>Placed At Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed At Connector</em>' reference.
	 * @see #getPlacedAtConnector()
	 * @generated
	 */
	void setPlacedAtConnector(Connector value);

} // Signal
