/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.Track#getHasSignals <em>Has Signals</em>}</li>
 *   <li>{@link bjoernercomplete.Track#getHasSignal <em>Has Signal</em>}</li>
 *   <li>{@link bjoernercomplete.Track#getHasTrackDirection <em>Has Track Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends Unit {
	/**
	 * Returns the value of the '<em><b>Has Signals</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Signal}.
	 * It is bidirectional and its opposite is '{@link bjoernercomplete.Signal#getPlacedOnTrack <em>Placed On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signals</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getTrack_HasSignals()
	 * @see bjoernercomplete.Signal#getPlacedOnTrack
	 * @model opposite="placedOnTrack" upper="2"
	 * @generated
	 */
	EList<Signal> getHasSignals();

	/**
	 * Returns the value of the '<em><b>Has Signal</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signal</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getTrack_HasSignal()
	 * @model upper="2"
	 * @generated
	 */
	EList<Signal> getHasSignal();

	/**
	 * Returns the value of the '<em><b>Has Track Direction</b></em>' reference list.
	 * The list contents are of type {@link bjoernercomplete.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Track Direction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Track Direction</em>' reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getTrack_HasTrackDirection()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Direction> getHasTrackDirection();

} // Track
