/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Point;
import bjoernercomplete.Route;
import bjoernercomplete.Signal;
import bjoernercomplete.UnitPathPair;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.RouteImpl#getHasUPPs <em>Has UP Ps</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RouteImpl#getControlledBySignal <em>Controlled By Signal</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RouteImpl#getName <em>Name</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RouteImpl#getHasNormalPoints <em>Has Normal Points</em>}</li>
 *   <li>{@link bjoernercomplete.impl.RouteImpl#getHasReversePoints <em>Has Reverse Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends EObjectImpl implements Route {
	/**
	 * The cached value of the '{@link #getHasUPPs() <em>Has UP Ps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUPPs()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitPathPair> hasUPPs;

	/**
	 * The cached value of the '{@link #getControlledBySignal() <em>Controlled By Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBySignal()
	 * @generated
	 * @ordered
	 */
	protected Signal controlledBySignal;

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
	 * The cached value of the '{@link #getHasNormalPoints() <em>Has Normal Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNormalPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> hasNormalPoints;

	/**
	 * The cached value of the '{@link #getHasReversePoints() <em>Has Reverse Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReversePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> hasReversePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitPathPair> getHasUPPs() {
		if (hasUPPs == null) {
			hasUPPs = new EObjectResolvingEList<UnitPathPair>(UnitPathPair.class, this, BjoernercompletePackage.ROUTE__HAS_UP_PS);
		}
		return hasUPPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getControlledBySignal() {
		if (controlledBySignal != null && controlledBySignal.eIsProxy()) {
			InternalEObject oldControlledBySignal = (InternalEObject)controlledBySignal;
			controlledBySignal = (Signal)eResolveProxy(oldControlledBySignal);
			if (controlledBySignal != oldControlledBySignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL, oldControlledBySignal, controlledBySignal));
			}
		}
		return controlledBySignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetControlledBySignal() {
		return controlledBySignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledBySignal(Signal newControlledBySignal, NotificationChain msgs) {
		Signal oldControlledBySignal = controlledBySignal;
		controlledBySignal = newControlledBySignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL, oldControlledBySignal, newControlledBySignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledBySignal(Signal newControlledBySignal) {
		if (newControlledBySignal != controlledBySignal) {
			NotificationChain msgs = null;
			if (controlledBySignal != null)
				msgs = ((InternalEObject)controlledBySignal).eInverseRemove(this, BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES, Signal.class, msgs);
			if (newControlledBySignal != null)
				msgs = ((InternalEObject)newControlledBySignal).eInverseAdd(this, BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES, Signal.class, msgs);
			msgs = basicSetControlledBySignal(newControlledBySignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL, newControlledBySignal, newControlledBySignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.ROUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getHasNormalPoints() {
		if (hasNormalPoints == null) {
			hasNormalPoints = new EObjectResolvingEList<Point>(Point.class, this, BjoernercompletePackage.ROUTE__HAS_NORMAL_POINTS);
		}
		return hasNormalPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getHasReversePoints() {
		if (hasReversePoints == null) {
			hasReversePoints = new EObjectResolvingEList<Point>(Point.class, this, BjoernercompletePackage.ROUTE__HAS_REVERSE_POINTS);
		}
		return hasReversePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL:
				if (controlledBySignal != null)
					msgs = ((InternalEObject)controlledBySignal).eInverseRemove(this, BjoernercompletePackage.SIGNAL__CONTROLS_ROUTES, Signal.class, msgs);
				return basicSetControlledBySignal((Signal)otherEnd, msgs);
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
			case BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL:
				return basicSetControlledBySignal(null, msgs);
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
			case BjoernercompletePackage.ROUTE__HAS_UP_PS:
				return getHasUPPs();
			case BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL:
				if (resolve) return getControlledBySignal();
				return basicGetControlledBySignal();
			case BjoernercompletePackage.ROUTE__NAME:
				return getName();
			case BjoernercompletePackage.ROUTE__HAS_NORMAL_POINTS:
				return getHasNormalPoints();
			case BjoernercompletePackage.ROUTE__HAS_REVERSE_POINTS:
				return getHasReversePoints();
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
			case BjoernercompletePackage.ROUTE__HAS_UP_PS:
				getHasUPPs().clear();
				getHasUPPs().addAll((Collection<? extends UnitPathPair>)newValue);
				return;
			case BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL:
				setControlledBySignal((Signal)newValue);
				return;
			case BjoernercompletePackage.ROUTE__NAME:
				setName((String)newValue);
				return;
			case BjoernercompletePackage.ROUTE__HAS_NORMAL_POINTS:
				getHasNormalPoints().clear();
				getHasNormalPoints().addAll((Collection<? extends Point>)newValue);
				return;
			case BjoernercompletePackage.ROUTE__HAS_REVERSE_POINTS:
				getHasReversePoints().clear();
				getHasReversePoints().addAll((Collection<? extends Point>)newValue);
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
			case BjoernercompletePackage.ROUTE__HAS_UP_PS:
				getHasUPPs().clear();
				return;
			case BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL:
				setControlledBySignal((Signal)null);
				return;
			case BjoernercompletePackage.ROUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BjoernercompletePackage.ROUTE__HAS_NORMAL_POINTS:
				getHasNormalPoints().clear();
				return;
			case BjoernercompletePackage.ROUTE__HAS_REVERSE_POINTS:
				getHasReversePoints().clear();
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
			case BjoernercompletePackage.ROUTE__HAS_UP_PS:
				return hasUPPs != null && !hasUPPs.isEmpty();
			case BjoernercompletePackage.ROUTE__CONTROLLED_BY_SIGNAL:
				return controlledBySignal != null;
			case BjoernercompletePackage.ROUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BjoernercompletePackage.ROUTE__HAS_NORMAL_POINTS:
				return hasNormalPoints != null && !hasNormalPoints.isEmpty();
			case BjoernercompletePackage.ROUTE__HAS_REVERSE_POINTS:
				return hasReversePoints != null && !hasReversePoints.isEmpty();
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

} //RouteImpl
