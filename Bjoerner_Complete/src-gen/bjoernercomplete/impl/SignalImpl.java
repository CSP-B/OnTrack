/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.Direction;
import bjoernercomplete.Route;
import bjoernercomplete.Signal;
import bjoernercomplete.Track;

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
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getPlacedOnTrack <em>Placed On Track</em>}</li>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getPlacedAtConnector <em>Placed At Connector</em>}</li>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getPlacedAt <em>Placed At</em>}</li>
 *   <li>{@link bjoernercomplete.impl.SignalImpl#getHasDirection <em>Has Direction</em>}</li>
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
	 * The cached value of the '{@link #getPlacedOnTrack() <em>Placed On Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacedOnTrack()
	 * @generated
	 * @ordered
	 */
	protected Track placedOnTrack;

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
	 * The cached value of the '{@link #getPlacedAt() <em>Placed At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacedAt()
	 * @generated
	 * @ordered
	 */
	protected Track placedAt;

	/**
	 * The cached value of the '{@link #getHasDirection() <em>Has Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction hasDirection;

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
	public Track getPlacedOnTrack() {
		if (placedOnTrack != null && placedOnTrack.eIsProxy()) {
			InternalEObject oldPlacedOnTrack = (InternalEObject)placedOnTrack;
			placedOnTrack = (Track)eResolveProxy(oldPlacedOnTrack);
			if (placedOnTrack != oldPlacedOnTrack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK, oldPlacedOnTrack, placedOnTrack));
			}
		}
		return placedOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track basicGetPlacedOnTrack() {
		return placedOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacedOnTrack(Track newPlacedOnTrack, NotificationChain msgs) {
		Track oldPlacedOnTrack = placedOnTrack;
		placedOnTrack = newPlacedOnTrack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK, oldPlacedOnTrack, newPlacedOnTrack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacedOnTrack(Track newPlacedOnTrack) {
		if (newPlacedOnTrack != placedOnTrack) {
			NotificationChain msgs = null;
			if (placedOnTrack != null)
				msgs = ((InternalEObject)placedOnTrack).eInverseRemove(this, BjoernercompletePackage.TRACK__HAS_SIGNALS, Track.class, msgs);
			if (newPlacedOnTrack != null)
				msgs = ((InternalEObject)newPlacedOnTrack).eInverseAdd(this, BjoernercompletePackage.TRACK__HAS_SIGNALS, Track.class, msgs);
			msgs = basicSetPlacedOnTrack(newPlacedOnTrack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK, newPlacedOnTrack, newPlacedOnTrack));
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
	public Track getPlacedAt() {
		if (placedAt != null && placedAt.eIsProxy()) {
			InternalEObject oldPlacedAt = (InternalEObject)placedAt;
			placedAt = (Track)eResolveProxy(oldPlacedAt);
			if (placedAt != oldPlacedAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.SIGNAL__PLACED_AT, oldPlacedAt, placedAt));
			}
		}
		return placedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track basicGetPlacedAt() {
		return placedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacedAt(Track newPlacedAt) {
		Track oldPlacedAt = placedAt;
		placedAt = newPlacedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__PLACED_AT, oldPlacedAt, placedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getHasDirection() {
		if (hasDirection != null && hasDirection.eIsProxy()) {
			InternalEObject oldHasDirection = (InternalEObject)hasDirection;
			hasDirection = (Direction)eResolveProxy(oldHasDirection);
			if (hasDirection != oldHasDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.SIGNAL__HAS_DIRECTION, oldHasDirection, hasDirection));
			}
		}
		return hasDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction basicGetHasDirection() {
		return hasDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDirection(Direction newHasDirection) {
		Direction oldHasDirection = hasDirection;
		hasDirection = newHasDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.SIGNAL__HAS_DIRECTION, oldHasDirection, hasDirection));
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
			case BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK:
				if (placedOnTrack != null)
					msgs = ((InternalEObject)placedOnTrack).eInverseRemove(this, BjoernercompletePackage.TRACK__HAS_SIGNALS, Track.class, msgs);
				return basicSetPlacedOnTrack((Track)otherEnd, msgs);
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
			case BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK:
				return basicSetPlacedOnTrack(null, msgs);
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
			case BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK:
				if (resolve) return getPlacedOnTrack();
				return basicGetPlacedOnTrack();
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				if (resolve) return getPlacedAtConnector();
				return basicGetPlacedAtConnector();
			case BjoernercompletePackage.SIGNAL__PLACED_AT:
				if (resolve) return getPlacedAt();
				return basicGetPlacedAt();
			case BjoernercompletePackage.SIGNAL__HAS_DIRECTION:
				if (resolve) return getHasDirection();
				return basicGetHasDirection();
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
			case BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK:
				setPlacedOnTrack((Track)newValue);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				setPlacedAtConnector((Connector)newValue);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_AT:
				setPlacedAt((Track)newValue);
				return;
			case BjoernercompletePackage.SIGNAL__HAS_DIRECTION:
				setHasDirection((Direction)newValue);
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
			case BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK:
				setPlacedOnTrack((Track)null);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				setPlacedAtConnector((Connector)null);
				return;
			case BjoernercompletePackage.SIGNAL__PLACED_AT:
				setPlacedAt((Track)null);
				return;
			case BjoernercompletePackage.SIGNAL__HAS_DIRECTION:
				setHasDirection((Direction)null);
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
			case BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK:
				return placedOnTrack != null;
			case BjoernercompletePackage.SIGNAL__PLACED_AT_CONNECTOR:
				return placedAtConnector != null;
			case BjoernercompletePackage.SIGNAL__PLACED_AT:
				return placedAt != null;
			case BjoernercompletePackage.SIGNAL__HAS_DIRECTION:
				return hasDirection != null;
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
