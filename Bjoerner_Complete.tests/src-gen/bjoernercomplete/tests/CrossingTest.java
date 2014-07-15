/**
 */
package bjoernercomplete.tests;

import bjoernercomplete.BjoernercompleteFactory;
import bjoernercomplete.Crossing;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Crossing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossingTest extends UnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CrossingTest.class);
	}

	/**
	 * Constructs a new Crossing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Crossing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Crossing getFixture() {
		return (Crossing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BjoernercompleteFactory.eINSTANCE.createCrossing());
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

} //CrossingTest
