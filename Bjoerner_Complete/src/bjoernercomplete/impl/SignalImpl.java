/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.Linear;
import bjoernercomplete.Path;
import bjoernercomplete.Route;
import bjoernercomplete.Signal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getControlsRoutes <em>Controls Routes</em>}</li>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getName <em>Name</em>}</li>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getPlacedOnLinear <em>Placed On Linear</em>}</li>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getPlacedAtConnector <em>Placed At Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends EObjectImpl implements Signal {
	/**
	 * The cached value of the '{@link #getControlsRoutes() <em>Controls Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlsRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> controlsRoutes;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlacedOnLinear() <em>Placed On Linear</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacedOnLinear()
	 * @generated
	 * @ordered
	 */
	protected Linear placedOnLinear;

	/**
	 * The cached value of the '{@link #getPlacedAtConnector() <em>Placed At Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacedAtConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector placedAtConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getControlsRoutes() {
		if (controlsRoutes == null) {
			controlsRoutes = new EObjectWithInverseResolvingEList<Route>(Route.class, this, BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES, BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL);
		}
		return controlsRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linear getPlacedOnLinear() {
		if (placedOnLinear != null && placedOnLinear.eIsProxy()) {
			InternalEObject oldPlacedOnLinear = (InternalEObject)placedOnLinear;
			placedOnLinear = (Linear)eResolveProxy(oldPlacedOnLinear);
			if (placedOnLinear != oldPlacedOnLinear) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR, oldPlacedOnLinear, placedOnLinear));
			}
		}
		return placedOnLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linear basicGetPlacedOnLinear() {
		return placedOnLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacedOnLinear(Linear newPlacedOnLinear, NotificationChain msgs) {
		Linear oldPlacedOnLinear = placedOnLinear;
		placedOnLinear = newPlacedOnLinear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR, oldPlacedOnLinear, newPlacedOnLinear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacedOnLinear(Linear newPlacedOnLinear) {
		if (newPlacedOnLinear != placedOnLinear) {
			NotificationChain msgs = null;
			if (placedOnLinear != null)
				msgs = ((InternalEObject)placedOnLinear).eInverseRemove(this, BjoernercompletePackage.LINEAR__HAS_SIGNALS, Linear.class, msgs);
			if (newPlacedOnLinear != null)
				msgs = ((InternalEObject)newPlacedOnLinear).eInverseAdd(this, BjoernercompletePackage.LINEAR__HAS_SIGNALS, Linear.class, msgs);
			msgs = basicSetPlacedOnLinear(newPlacedOnLinear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR, newPlacedOnLinear, newPlacedOnLinear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getPlacedAtConnector() {
		if (placedAtConnector != null && placedAtConnector.eIsProxy()) {
			InternalEObject oldPlacedAtConnector = (InternalEObject)placedAtConnector;
			placedAtConnector = (Connector)eResolveProxy(oldPlacedAtConnector);
			if (placedAtConnector != oldPlacedAtConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR, oldPlacedAtConnector, placedAtConnector));
			}
		}
		return placedAtConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetPlacedAtConnector() {
		return placedAtConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacedAtConnector(Connector newPlacedAtConnector) {
		Connector oldPlacedAtConnector = placedAtConnector;
		placedAtConnector = newPlacedAtConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR, oldPlacedAtConnector, placedAtConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlsRoutes()).basicAdd(otherEnd, msgs);
			case BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR:
				if (placedOnLinear != null)
					msgs = ((InternalEObject)placedOnLinear).eInverseRemove(this, BjoernercompletePackage.LINEAR__HAS_SIGNALS, Linear.class, msgs);
				return basicSetPlacedOnLinear((Linear)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES:
				return ((InternalEList<?>)getControlsRoutes()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR:
				return basicSetPlacedOnLinear(null, msgs);
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
			case BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES:
				return getControlsRoutes();
			case BjoernercompletePackage.SIGNAL__NAME:
				return getName();
			case BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR:
				if (resolve) return getPlacedOnLinear();
				return basicGetPlacedOnLinear();
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				if (resolve) return getPlacedAtConnector();
				return basicGetPlacedAtConnector();
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
			case BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES:
				getControlsRoutes().clear();
				getControlsRoutes().addAll((Collection<? extends Route>)newValue);
				return;
			case BjoernercompletePackage.SIGNAL__NAME:
				setName((String)newValue);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR:
				setPlacedOnLinear((Linear)newValue);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				setPlacedAtConnector((Connector)newValue);
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
			case BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES:
				getControlsRoutes().clear();
				return;
			case BjoernercompletePackage.SIGNAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR:
				setPlacedOnLinear((Linear)null);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				setPlacedAtConnector((Connector)null);
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
			case BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES:
				return controlsRoutes != null && !controlsRoutes.isEmpty();
			case BjoernercompletePackage.SIGNAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BjoernercompletePackage.SIGNAL__PLACED_ON_LINEAR:
				return placedOnLinear != null;
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				return placedAtConnector != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
