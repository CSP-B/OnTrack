/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete.impl;

import bjoernercomplete.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BjoernercompleteFactoryImpl extends EFactoryImpl implements BjoernercompleteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BjoernercompleteFactory init() {
		try {
			BjoernercompleteFactory theBjoernercompleteFactory = (BjoernercompleteFactory)EPackage.Registry.INSTANCE.getEFactory("http://bjoernercomplete/1.0"); 
			if (theBjoernercompleteFactory != null) {
				return theBjoernercompleteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BjoernercompleteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BjoernercompleteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BjoernercompletePackage.NODE: return createNode();
			case BjoernercompletePackage.UNIT: return createUnit();
			case BjoernercompletePackage.LINEAR: return createLinear();
			case BjoernercompletePackage.POINT: return createPoint();
			case BjoernercompletePackage.CONNECTOR: return createConnector();
			case BjoernercompletePackage.TRACK: return createTrack();
			case BjoernercompletePackage.PATH: return createPath();
			case BjoernercompletePackage.UNIT_PATH_PAIR: return createUnitPathPair();
			case BjoernercompletePackage.SIGNAL: return createSignal();
			case BjoernercompletePackage.ROUTE: return createRoute();
			case BjoernercompletePackage.CONTROL_TABLE: return createControlTable();
			case BjoernercompletePackage.RAIL_DIAGRAM: return createRailDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linear createLinear() {
		LinearImpl linear = new LinearImpl();
		return linear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track createTrack() {
		TrackImpl track = new TrackImpl();
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPathPair createUnitPathPair() {
		UnitPathPairImpl unitPathPair = new UnitPathPairImpl();
		return unitPathPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTable createControlTable() {
		ControlTableImpl controlTable = new ControlTableImpl();
		return controlTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailDiagram createRailDiagram() {
		RailDiagramImpl railDiagram = new RailDiagramImpl();
		return railDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BjoernercompletePackage getBjoernercompletePackage() {
		return (BjoernercompletePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BjoernercompletePackage getPackage() {
		return BjoernercompletePackage.eINSTANCE;
	}

} //BjoernercompleteFactoryImpl
