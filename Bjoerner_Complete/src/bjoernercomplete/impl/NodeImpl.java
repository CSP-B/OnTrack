/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Node;
import bjoernercomplete.Track;
import bjoernercomplete.Unit;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.NodeImpl#getHasUnits <em>Has Units</em>}</li>
 *   <li>{@link bjoernercomplete.impl.NodeImpl#getHasTracks <em>Has Tracks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
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
	 * The cached value of the '{@link #getHasTracks() <em>Has Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> hasTracks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getHasUnits() {
		if (hasUnits == null) {
			hasUnits = new EObjectContainmentEList<Unit>(Unit.class, this, BjoernercompletePackage.NODE__HAS_UNITS);
		}
		return hasUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getHasTracks() {
		if (hasTracks == null) {
			hasTracks = new EObjectContainmentEList<Track>(Track.class, this, BjoernercompletePackage.NODE__HAS_TRACKS);
		}
		return hasTracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.NODE__HAS_UNITS:
				return ((InternalEList<?>)getHasUnits()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.NODE__HAS_TRACKS:
				return ((InternalEList<?>)getHasTracks()).basicRemove(otherEnd, msgs);
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
			case BjoernercompletePackage.NODE__HAS_UNITS:
				return getHasUnits();
			case BjoernercompletePackage.NODE__HAS_TRACKS:
				return getHasTracks();
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
			case BjoernercompletePackage.NODE__HAS_UNITS:
				getHasUnits().clear();
				getHasUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case BjoernercompletePackage.NODE__HAS_TRACKS:
				getHasTracks().clear();
				getHasTracks().addAll((Collection<? extends Track>)newValue);
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
			case BjoernercompletePackage.NODE__HAS_UNITS:
				getHasUnits().clear();
				return;
			case BjoernercompletePackage.NODE__HAS_TRACKS:
				getHasTracks().clear();
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
			case BjoernercompletePackage.NODE__HAS_UNITS:
				return hasUnits != null && !hasUnits.isEmpty();
			case BjoernercompletePackage.NODE__HAS_TRACKS:
				return hasTracks != null && !hasTracks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
