/**
 */
package bjoernercomplete.tests;

import bjoernercomplete.BjoernercompleteFactory;
import bjoernercomplete.RailDiagram;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rail Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailDiagramTest extends TestCase {

	/**
	 * The fixture for this Rail Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RailDiagramTest.class);
	}

	/**
	 * Constructs a new Rail Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rail Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RailDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rail Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailDiagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BjoernercompleteFactory.eINSTANCE.createRailDiagram());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RailDiagramTest
