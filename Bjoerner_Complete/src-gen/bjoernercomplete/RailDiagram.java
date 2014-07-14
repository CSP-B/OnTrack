/**
 */
package bjoernercomplete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rail Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bjoernercomplete.RailDiagram#getHasUnits <em>Has Units</em>}</li>
 *   <li>{@link bjoernercomplete.RailDiagram#getHasConnectors <em>Has Connectors</em>}</li>
 *   <li>{@link bjoernercomplete.RailDiagram#getHasSignals <em>Has Signals</em>}</li>
 *   <li>{@link bjoernercomplete.RailDiagram#getHasControlTable <em>Has Control Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see bjoernercomplete.BjoernercompletePackage#getRailDiagram()
 * @model
 * @generated
 */
public interface RailDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Units</b></em>' containment reference list.
	 * The list contents are of type {@link bjoernercomplete.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Units</em>' containment reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getRailDiagram_HasUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getHasUnits();

	/**
	 * Returns the value of the '<em><b>Has Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link bjoernercomplete.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Connectors</em>' containment reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getRailDiagram_HasConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getHasConnectors();

	/**
	 * Returns the value of the '<em><b>Has Signals</b></em>' containment reference list.
	 * The list contents are of type {@link bjoernercomplete.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Signals</em>' containment reference list.
	 * @see bjoernercomplete.BjoernercompletePackage#getRailDiagram_HasSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getHasSignals();

	/**
	 * Returns the value of the '<em><b>Has Control Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Control Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Control Table</em>' containment reference.
	 * @see #setHasControlTable(ControlTable)
	 * @see bjoernercomplete.BjoernercompletePackage#getRailDiagram_HasControlTable()
	 * @model containment="true"
	 * @generated
	 */
	ControlTable getHasControlTable();

	/**
	 * Sets the value of the '{@link bjoernercomplete.RailDiagram#getHasControlTable <em>Has Control Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Control Table</em>' containment reference.
	 * @see #getHasControlTable()
	 * @generated
	 */
	void setHasControlTable(ControlTable value);

} // RailDiagram
