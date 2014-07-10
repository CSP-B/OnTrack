/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bjoernercomplete.BjoernercompleteFactory
 * @model kind="package"
 * @generated
 */
public interface BjoernercompletePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bjoernercomplete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bjoernercomplete/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bjoernercomplete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BjoernercompletePackage eINSTANCE = bjoernercomplete.impl.BjoernercompletePackageImpl.init();

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.NodeImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Has Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Has Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_TRACKS = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.UnitImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

	/**
	 * The feature id for the '<em><b>Has C1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__HAS_C1 = 0;

	/**
	 * The feature id for the '<em><b>Has C2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__HAS_C2 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LENGTH = 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.LinearImpl <em>Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.LinearImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getLinear()
	 * @generated
	 */
	int LINEAR = 2;

	/**
	 * The feature id for the '<em><b>Has C1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__HAS_C1 = UNIT__HAS_C1;

	/**
	 * The feature id for the '<em><b>Has C2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__HAS_C2 = UNIT__HAS_C2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__LENGTH = UNIT__LENGTH;

	/**
	 * The feature id for the '<em><b>Has Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR__HAS_SIGNALS = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.PointImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 3;

	/**
	 * The feature id for the '<em><b>Has C1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__HAS_C1 = UNIT__HAS_C1;

	/**
	 * The feature id for the '<em><b>Has C2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__HAS_C2 = UNIT__HAS_C2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LENGTH = UNIT__LENGTH;

	/**
	 * The feature id for the '<em><b>Has C3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__HAS_C3 = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__POINT_NAME = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.ConnectorImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Has Unit1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HAS_UNIT1 = 0;

	/**
	 * The feature id for the '<em><b>Has Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HAS_POINT = 1;

	/**
	 * The feature id for the '<em><b>Has Unit2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HAS_UNIT2 = 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.TrackImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 5;

	/**
	 * The feature id for the '<em><b>Has Linears</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__HAS_LINEARS = 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.PathImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 6;

	/**
	 * The feature id for the '<em><b>Has PC2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__HAS_PC2 = 0;

	/**
	 * The feature id for the '<em><b>Has PC1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__HAS_PC1 = 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.UnitPathPairImpl <em>Unit Path Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.UnitPathPairImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getUnitPathPair()
	 * @generated
	 */
	int UNIT_PATH_PAIR = 7;

	/**
	 * The feature id for the '<em><b>Has Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PATH_PAIR__HAS_PATH = 0;

	/**
	 * The feature id for the '<em><b>Has Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PATH_PAIR__HAS_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Unit Path Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PATH_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.SignalImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 8;

	/**
	 * The feature id for the '<em><b>Controls Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__CONTROLS_ROUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Placed On Linear</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PLACED_ON_LINEAR = 2;

	/**
	 * The feature id for the '<em><b>Placed At Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PLACED_AT_CONNECTOR = 3;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.RouteImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 9;

	/**
	 * The feature id for the '<em><b>Has UP Ps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HAS_UP_PS = 0;

	/**
	 * The feature id for the '<em><b>Controlled By Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__CONTROLLED_BY_SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Has Normal Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HAS_NORMAL_POINTS = 3;

	/**
	 * The feature id for the '<em><b>Has Reverse Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HAS_REVERSE_POINTS = 4;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.ControlTableImpl <em>Control Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.ControlTableImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getControlTable()
	 * @generated
	 */
	int CONTROL_TABLE = 10;

	/**
	 * The feature id for the '<em><b>Has Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TABLE__HAS_ROUTES = 0;

	/**
	 * The number of structural features of the '<em>Control Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bjoernercomplete.impl.RailDiagramImpl <em>Rail Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bjoernercomplete.impl.RailDiagramImpl
	 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getRailDiagram()
	 * @generated
	 */
	int RAIL_DIAGRAM = 11;

	/**
	 * The feature id for the '<em><b>Has Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_DIAGRAM__HAS_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Has Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_DIAGRAM__HAS_CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Has Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_DIAGRAM__HAS_SIGNALS = 2;

	/**
	 * The feature id for the '<em><b>Has Control Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_DIAGRAM__HAS_CONTROL_TABLE = 3;

	/**
	 * The number of structural features of the '<em>Rail Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIL_DIAGRAM_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see bjoernercomplete.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link bjoernercomplete.Node#getHasUnits <em>Has Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Units</em>'.
	 * @see bjoernercomplete.Node#getHasUnits()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HasUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link bjoernercomplete.Node#getHasTracks <em>Has Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Tracks</em>'.
	 * @see bjoernercomplete.Node#getHasTracks()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HasTracks();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see bjoernercomplete.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Unit#getHasC1 <em>Has C1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has C1</em>'.
	 * @see bjoernercomplete.Unit#getHasC1()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_HasC1();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Unit#getHasC2 <em>Has C2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has C2</em>'.
	 * @see bjoernercomplete.Unit#getHasC2()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_HasC2();

	/**
	 * Returns the meta object for the attribute '{@link bjoernercomplete.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bjoernercomplete.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link bjoernercomplete.Unit#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see bjoernercomplete.Unit#getLength()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Length();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Linear <em>Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear</em>'.
	 * @see bjoernercomplete.Linear
	 * @generated
	 */
	EClass getLinear();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Linear#getHasSignals <em>Has Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Signals</em>'.
	 * @see bjoernercomplete.Linear#getHasSignals()
	 * @see #getLinear()
	 * @generated
	 */
	EReference getLinear_HasSignals();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see bjoernercomplete.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Point#getHasC3 <em>Has C3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has C3</em>'.
	 * @see bjoernercomplete.Point#getHasC3()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_HasC3();

	/**
	 * Returns the meta object for the attribute '{@link bjoernercomplete.Point#getPointName <em>Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Name</em>'.
	 * @see bjoernercomplete.Point#getPointName()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_PointName();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see bjoernercomplete.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Connector#getHasUnit1 <em>Has Unit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Unit1</em>'.
	 * @see bjoernercomplete.Connector#getHasUnit1()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_HasUnit1();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Connector#getHasPoint <em>Has Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Point</em>'.
	 * @see bjoernercomplete.Connector#getHasPoint()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_HasPoint();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Connector#getHasUnit2 <em>Has Unit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Unit2</em>'.
	 * @see bjoernercomplete.Connector#getHasUnit2()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_HasUnit2();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see bjoernercomplete.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Track#getHasLinears <em>Has Linears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Linears</em>'.
	 * @see bjoernercomplete.Track#getHasLinears()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_HasLinears();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see bjoernercomplete.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Path#getHasPC2 <em>Has PC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has PC2</em>'.
	 * @see bjoernercomplete.Path#getHasPC2()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_HasPC2();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Path#getHasPC1 <em>Has PC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has PC1</em>'.
	 * @see bjoernercomplete.Path#getHasPC1()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_HasPC1();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.UnitPathPair <em>Unit Path Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Path Pair</em>'.
	 * @see bjoernercomplete.UnitPathPair
	 * @generated
	 */
	EClass getUnitPathPair();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.UnitPathPair#getHasPath <em>Has Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Path</em>'.
	 * @see bjoernercomplete.UnitPathPair#getHasPath()
	 * @see #getUnitPathPair()
	 * @generated
	 */
	EReference getUnitPathPair_HasPath();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.UnitPathPair#getHasUnit <em>Has Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Unit</em>'.
	 * @see bjoernercomplete.UnitPathPair#getHasUnit()
	 * @see #getUnitPathPair()
	 * @generated
	 */
	EReference getUnitPathPair_HasUnit();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see bjoernercomplete.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Signal#getControlsRoutes <em>Controls Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls Routes</em>'.
	 * @see bjoernercomplete.Signal#getControlsRoutes()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_ControlsRoutes();

	/**
	 * Returns the meta object for the attribute '{@link bjoernercomplete.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bjoernercomplete.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Signal#getPlacedOnLinear <em>Placed On Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placed On Linear</em>'.
	 * @see bjoernercomplete.Signal#getPlacedOnLinear()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_PlacedOnLinear();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Signal#getPlacedAtConnector <em>Placed At Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placed At Connector</em>'.
	 * @see bjoernercomplete.Signal#getPlacedAtConnector()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_PlacedAtConnector();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see bjoernercomplete.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Route#getHasUPPs <em>Has UP Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has UP Ps</em>'.
	 * @see bjoernercomplete.Route#getHasUPPs()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_HasUPPs();

	/**
	 * Returns the meta object for the reference '{@link bjoernercomplete.Route#getControlledBySignal <em>Controlled By Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlled By Signal</em>'.
	 * @see bjoernercomplete.Route#getControlledBySignal()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_ControlledBySignal();

	/**
	 * Returns the meta object for the attribute '{@link bjoernercomplete.Route#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bjoernercomplete.Route#getName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Name();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Route#getHasNormalPoints <em>Has Normal Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Normal Points</em>'.
	 * @see bjoernercomplete.Route#getHasNormalPoints()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_HasNormalPoints();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.Route#getHasReversePoints <em>Has Reverse Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Reverse Points</em>'.
	 * @see bjoernercomplete.Route#getHasReversePoints()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_HasReversePoints();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.ControlTable <em>Control Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Table</em>'.
	 * @see bjoernercomplete.ControlTable
	 * @generated
	 */
	EClass getControlTable();

	/**
	 * Returns the meta object for the reference list '{@link bjoernercomplete.ControlTable#getHasRoutes <em>Has Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Routes</em>'.
	 * @see bjoernercomplete.ControlTable#getHasRoutes()
	 * @see #getControlTable()
	 * @generated
	 */
	EReference getControlTable_HasRoutes();

	/**
	 * Returns the meta object for class '{@link bjoernercomplete.RailDiagram <em>Rail Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rail Diagram</em>'.
	 * @see bjoernercomplete.RailDiagram
	 * @generated
	 */
	EClass getRailDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link bjoernercomplete.RailDiagram#getHasUnits <em>Has Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Units</em>'.
	 * @see bjoernercomplete.RailDiagram#getHasUnits()
	 * @see #getRailDiagram()
	 * @generated
	 */
	EReference getRailDiagram_HasUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link bjoernercomplete.RailDiagram#getHasConnectors <em>Has Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Connectors</em>'.
	 * @see bjoernercomplete.RailDiagram#getHasConnectors()
	 * @see #getRailDiagram()
	 * @generated
	 */
	EReference getRailDiagram_HasConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link bjoernercomplete.RailDiagram#getHasSignals <em>Has Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Signals</em>'.
	 * @see bjoernercomplete.RailDiagram#getHasSignals()
	 * @see #getRailDiagram()
	 * @generated
	 */
	EReference getRailDiagram_HasSignals();

	/**
	 * Returns the meta object for the containment reference '{@link bjoernercomplete.RailDiagram#getHasControlTable <em>Has Control Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Control Table</em>'.
	 * @see bjoernercomplete.RailDiagram#getHasControlTable()
	 * @see #getRailDiagram()
	 * @generated
	 */
	EReference getRailDiagram_HasControlTable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BjoernercompleteFactory getBjoernercompleteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.NodeImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Has Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HAS_UNITS = eINSTANCE.getNode_HasUnits();

		/**
		 * The meta object literal for the '<em><b>Has Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HAS_TRACKS = eINSTANCE.getNode_HasTracks();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.UnitImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Has C1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__HAS_C1 = eINSTANCE.getUnit_HasC1();

		/**
		 * The meta object literal for the '<em><b>Has C2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__HAS_C2 = eINSTANCE.getUnit_HasC2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__LENGTH = eINSTANCE.getUnit_Length();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.LinearImpl <em>Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.LinearImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getLinear()
		 * @generated
		 */
		EClass LINEAR = eINSTANCE.getLinear();

		/**
		 * The meta object literal for the '<em><b>Has Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR__HAS_SIGNALS = eINSTANCE.getLinear_HasSignals();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.PointImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Has C3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__HAS_C3 = eINSTANCE.getPoint_HasC3();

		/**
		 * The meta object literal for the '<em><b>Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__POINT_NAME = eINSTANCE.getPoint_PointName();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.ConnectorImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Has Unit1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HAS_UNIT1 = eINSTANCE.getConnector_HasUnit1();

		/**
		 * The meta object literal for the '<em><b>Has Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HAS_POINT = eINSTANCE.getConnector_HasPoint();

		/**
		 * The meta object literal for the '<em><b>Has Unit2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HAS_UNIT2 = eINSTANCE.getConnector_HasUnit2();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.TrackImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Has Linears</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__HAS_LINEARS = eINSTANCE.getTrack_HasLinears();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.PathImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Has PC2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__HAS_PC2 = eINSTANCE.getPath_HasPC2();

		/**
		 * The meta object literal for the '<em><b>Has PC1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__HAS_PC1 = eINSTANCE.getPath_HasPC1();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.UnitPathPairImpl <em>Unit Path Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.UnitPathPairImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getUnitPathPair()
		 * @generated
		 */
		EClass UNIT_PATH_PAIR = eINSTANCE.getUnitPathPair();

		/**
		 * The meta object literal for the '<em><b>Has Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_PATH_PAIR__HAS_PATH = eINSTANCE.getUnitPathPair_HasPath();

		/**
		 * The meta object literal for the '<em><b>Has Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_PATH_PAIR__HAS_UNIT = eINSTANCE.getUnitPathPair_HasUnit();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.SignalImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Controls Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__CONTROLS_ROUTES = eINSTANCE.getSignal_ControlsRoutes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '<em><b>Placed On Linear</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__PLACED_ON_LINEAR = eINSTANCE.getSignal_PlacedOnLinear();

		/**
		 * The meta object literal for the '<em><b>Placed At Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__PLACED_AT_CONNECTOR = eINSTANCE.getSignal_PlacedAtConnector();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.RouteImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Has UP Ps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__HAS_UP_PS = eINSTANCE.getRoute_HasUPPs();

		/**
		 * The meta object literal for the '<em><b>Controlled By Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__CONTROLLED_BY_SIGNAL = eINSTANCE.getRoute_ControlledBySignal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__NAME = eINSTANCE.getRoute_Name();

		/**
		 * The meta object literal for the '<em><b>Has Normal Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__HAS_NORMAL_POINTS = eINSTANCE.getRoute_HasNormalPoints();

		/**
		 * The meta object literal for the '<em><b>Has Reverse Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__HAS_REVERSE_POINTS = eINSTANCE.getRoute_HasReversePoints();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.ControlTableImpl <em>Control Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.ControlTableImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getControlTable()
		 * @generated
		 */
		EClass CONTROL_TABLE = eINSTANCE.getControlTable();

		/**
		 * The meta object literal for the '<em><b>Has Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TABLE__HAS_ROUTES = eINSTANCE.getControlTable_HasRoutes();

		/**
		 * The meta object literal for the '{@link bjoernercomplete.impl.RailDiagramImpl <em>Rail Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bjoernercomplete.impl.RailDiagramImpl
		 * @see bjoernercomplete.impl.BjoernercompletePackageImpl#getRailDiagram()
		 * @generated
		 */
		EClass RAIL_DIAGRAM = eINSTANCE.getRailDiagram();

		/**
		 * The meta object literal for the '<em><b>Has Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_DIAGRAM__HAS_UNITS = eINSTANCE.getRailDiagram_HasUnits();

		/**
		 * The meta object literal for the '<em><b>Has Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_DIAGRAM__HAS_CONNECTORS = eINSTANCE.getRailDiagram_HasConnectors();

		/**
		 * The meta object literal for the '<em><b>Has Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_DIAGRAM__HAS_SIGNALS = eINSTANCE.getRailDiagram_HasSignals();

		/**
		 * The meta object literal for the '<em><b>Has Control Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIL_DIAGRAM__HAS_CONTROL_TABLE = eINSTANCE.getRailDiagram_HasControlTable();

	}

} //BjoernercompletePackage
