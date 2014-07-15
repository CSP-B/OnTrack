/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Direction;
import bjoernercomplete.Signal;
import bjoernercomplete.Track;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.TrackImpl#getHasSignals <em>Has Signals</em>}</li>
 *   <li>{@link bjoernercomplete.impl.TrackImpl#getHasSignal <em>Has Signal</em>}</li>
 *   <li>{@link bjoernercomplete.impl.TrackImpl#getHasTrackDirection <em>Has Track Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackImpl extends UnitImpl implements Track {
	/**
	 * The cached value of the '{@link #getHasSignals() <em>Has Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> hasSignals;

	/**
	 * The cached value of the '{@link #getHasSignal() <em>Has Signal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> hasSignal;

	/**
	 * The cached value of the '{@link #getHasTrackDirection() <em>Has Track Direction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTrackDirection()
	 * @generated
	 * @ordered
	 */
	protected EList<Direction> hasTrackDirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getHasSignals() {
		if (hasSignals == null) {
			hasSignals = new EObjectWithInverseResolvingEList<Signal>(Signal.class, this, BjoernercompletePackage.TRACK__HAS_SIGNALS, BjoernercompletePackage.SIGNAL__PLACED_ON_TRACK);
		}
		return hasSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getHasSignal() {
		if (hasSignal == null) {
			hasSignal = new EObjectResolvingEList<Signal>(Signal.class, this, BjoernercompletePackage.TRACK__HAS_SIGNAL);
		}
		return hasSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Direction> getHasTrackDirection() {
		if (hasTrackDirection == null) {
			hasTrackDirection = new EObjectResolvingEList<Direction>(Direction.class, this, BjoernercompletePackage.TRACK__HAS_TRACK_DIRECTION);
		}
		return hasTrackDirection;
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
			case BjoernercompletePackage.TRACK__HAS_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasSignals()).basicAdd(otherEnd, msgs);
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
			case BjoernercompletePackage.TRACK__HAS_SIGNALS:
				return ((InternalEList<?>)getHasSignals()).basicRemove(otherEnd, msgs);
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
			case BjoernercompletePackage.TRACK__HAS_SIGNALS:
				return getHasSignals();
			case BjoernercompletePackage.TRACK__HAS_SIGNAL:
				return getHasSignal();
			case BjoernercompletePackage.TRACK__HAS_TRACK_DIRECTION:
				return getHasTrackDirection();
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
			case BjoernercompletePackage.TRACK__HAS_SIGNALS:
				getHasSignals().clear();
				getHasSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case BjoernercompletePackage.TRACK__HAS_SIGNAL:
				getHasSignal().clear();
				getHasSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case BjoernercompletePackage.TRACK__HAS_TRACK_DIRECTION:
				getHasTrackDirection().clear();
				getHasTrackDirection().addAll((Collection<? extends Direction>)newValue);
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
			case BjoernercompletePackage.TRACK__HAS_SIGNALS:
				getHasSignals().clear();
				return;
			case BjoernercompletePackage.TRACK__HAS_SIGNAL:
				getHasSignal().clear();
				return;
			case BjoernercompletePackage.TRACK__HAS_TRACK_DIRECTION:
				getHasTrackDirection().clear();
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
			case BjoernercompletePackage.TRACK__HAS_SIGNALS:
				return hasSignals != null && !hasSignals.isEmpty();
			case BjoernercompletePackage.TRACK__HAS_SIGNAL:
				return hasSignal != null && !hasSignal.isEmpty();
			case BjoernercompletePackage.TRACK__HAS_TRACK_DIRECTION:
				return hasTrackDirection != null && !hasTrackDirection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrackImpl
