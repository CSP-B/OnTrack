/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.ControlTable;
import bjoernercomplete.RailDiagram;
import bjoernercomplete.Signal;
import bjoernercomplete.Unit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rail Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.RailDiagramImpl#getHasUnits <em>Has Units</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RailDiagramImpl#getHasConnectors <em>Has Connectors</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RailDiagramImpl#getHasSignals <em>Has Signals</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RailDiagramImpl#getHasControlTable <em>Has Control Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailDiagramImpl extends EObjectImpl implements RailDiagram {
	/**
	 * The cached value of the '{@link #getHasUnits() <em>Has Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> hasUnits;

	/**
	 * The cached value of the '{@link #getHasConnectors() <em>Has Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> hasConnectors;

	/**
	 * The cached value of the '{@link #getHasSignals() <em>Has Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> hasSignals;

	/**
	 * The cached value of the '{@link #getHasControlTable() <em>Has Control Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasControlTable()
	 * @generated
	 * @ordered
	 */
	protected ControlTable hasControlTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.RAIL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getHasUnits() {
		if (hasUnits == null) {
			hasUnits = new EObjectContainmentEList<Unit>(Unit.class, this, BjoernercompletePackage.RAIL_DIAGRAM__HAS_UNITS);
		}
		return hasUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getHasConnectors() {
		if (hasConnectors == null) {
			hasConnectors = new EObjectContainmentEList<Connector>(Connector.class, this, BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONNECTORS);
		}
		return hasConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getHasSignals() {
		if (hasSignals == null) {
			hasSignals = new EObjectContainmentEList<Signal>(Signal.class, this, BjoernercompletePackage.RAIL_DIAGRAM__HAS_SIGNALS);
		}
		return hasSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTable getHasControlTable() {
		return hasControlTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasControlTable(ControlTable newHasControlTable, NotificationChain msgs) {
		ControlTable oldHasControlTable = hasControlTable;
		hasControlTable = newHasControlTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE, oldHasControlTable, newHasControlTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasControlTable(ControlTable newHasControlTable) {
		if (newHasControlTable != hasControlTable) {
			NotificationChain msgs = null;
			if (hasControlTable != null)
				msgs = ((InternalEObject)hasControlTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE, null, msgs);
			if (newHasControlTable != null)
				msgs = ((InternalEObject)newHasControlTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE, null, msgs);
			msgs = basicSetHasControlTable(newHasControlTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE, newHasControlTable, newHasControlTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_UNITS:
				return ((InternalEList<?>)getHasUnits()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONNECTORS:
				return ((InternalEList<?>)getHasConnectors()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_SIGNALS:
				return ((InternalEList<?>)getHasSignals()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE:
				return basicSetHasControlTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_UNITS:
				return getHasUnits();
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONNECTORS:
				return getHasConnectors();
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_SIGNALS:
				return getHasSignals();
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE:
				return getHasControlTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_UNITS:
				getHasUnits().clear();
				getHasUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONNECTORS:
				getHasConnectors().clear();
				getHasConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_SIGNALS:
				getHasSignals().clear();
				getHasSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE:
				setHasControlTable((ControlTable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_UNITS:
				getHasUnits().clear();
				return;
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONNECTORS:
				getHasConnectors().clear();
				return;
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_SIGNALS:
				getHasSignals().clear();
				return;
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE:
				setHasControlTable((ControlTable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_UNITS:
				return hasUnits != null && !hasUnits.isEmpty();
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONNECTORS:
				return hasConnectors != null && !hasConnectors.isEmpty();
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_SIGNALS:
				return hasSignals != null && !hasSignals.isEmpty();
			case BjoernercompletePackage.RAIL_DIAGRAM__HAS_CONTROL_TABLE:
				return hasControlTable != null;
		}
		return super.eIsSet(featureID);
	}

} //RailDiagramImpl
