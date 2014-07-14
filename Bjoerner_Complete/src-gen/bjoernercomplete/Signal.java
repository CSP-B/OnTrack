/**
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
 *   <li>{@link bjoernercomplete.Signal#getPlacedOnTrack <em>Placed On Track</em>}</li>
 *   <li>{@link bjoernercomplete.Signal#getPlacedAtConnector <em>Placed At Connector</em>}</li>
 *   <li>{@link bjoernercomplete.Signal#getPlacedAt <em>Placed At</em>}</li>
 *   <li>{@link bjoernercomplete.Signal#getHasDirection <em>Has Direction</em>}</li>
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
	 * Returns the value of the '<em><b>Placed On Track</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Track#getHasSignals <em>Has Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placed On Track</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placed On Track</em>' reference.
	 * @see #setPlacedOnTrack(Track)
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_PlacedOnTrack()
	 * @see bjoernercomplete.Track#getHasSignals
	 * @model opposite="hasSignals" required="true"
	 * @generated
	 */
	Track getPlacedOnTrack();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Signal#getPlacedOnTrack <em>Placed On Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed On Track</em>' reference.
	 * @see #getPlacedOnTrack()
	 * @generated
	 */
	void setPlacedOnTrack(Track value);

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

	/**
	 * Returns the value of the '<em><b>Placed At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placed At</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placed At</em>' reference.
	 * @see #setPlacedAt(Track)
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_PlacedAt()
	 * @model required="true"
	 * @generated
	 */
	Track getPlacedAt();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Signal#getPlacedAt <em>Placed At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed At</em>' reference.
	 * @see #getPlacedAt()
	 * @generated
	 */
	void setPlacedAt(Track value);

	/**
	 * Returns the value of the '<em><b>Has Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Direction</em>' reference.
	 * @see #setHasDirection(Direction)
	 * @see bjoernercomplete.BjoernercompletePackage#getSignal_HasDirection()
	 * @model required="true"
	 * @generated
	 */
	Direction getHasDirection();

	/**
	 * Sets the value of the '{@link bjoernercomplete.Signal#getHasDirection <em>Has Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Direction</em>' reference.
	 * @see #getHasDirection()
	 * @generated
	 */
	void setHasDirection(Direction value);

} // Signal
