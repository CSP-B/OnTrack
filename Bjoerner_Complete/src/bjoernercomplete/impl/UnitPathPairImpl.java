/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Path;
import bjoernercomplete.Unit;
import bjoernercomplete.UnitPathPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Path Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.UnitPathPairImpl#getHasPath <em>Has Path</em>}</li>
 *   <li>{@link bjoernercomplete.impl.UnitPathPairImpl#getHasUnit <em>Has Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitPathPairImpl extends EObjectImpl implements UnitPathPair {
	/**
	 * The cached value of the '{@link #getHasPath() <em>Has Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPath()
	 * @generated
	 * @ordered
	 */
	protected Path hasPath;

	/**
	 * The cached value of the '{@link #getHasUnit() <em>Has Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit hasUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitPathPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.UNIT_PATH_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getHasPath() {
		if (hasPath != null && hasPath.eIsProxy()) {
			InternalEObject oldHasPath = (InternalEObject)hasPath;
			hasPath = (Path)eResolveProxy(oldHasPath);
			if (hasPath != oldHasPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.UNIT_PATH_PAIR__HAS_PATH, oldHasPath, hasPath));
			}
		}
		return hasPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path basicGetHasPath() {
		return hasPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPath(Path newHasPath) {
		Path oldHasPath = hasPath;
		hasPath = newHasPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT_PATH_PAIR__HAS_PATH, oldHasPath, hasPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getHasUnit() {
		if (hasUnit != null && hasUnit.eIsProxy()) {
			InternalEObject oldHasUnit = (InternalEObject)hasUnit;
			hasUnit = (Unit)eResolveProxy(oldHasUnit);
			if (hasUnit != oldHasUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.UNIT_PATH_PAIR__HAS_UNIT, oldHasUnit, hasUnit));
			}
		}
		return hasUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasUnit() {
		return hasUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasUnit(Unit newHasUnit) {
		Unit oldHasUnit = hasUnit;
		hasUnit = newHasUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT_PATH_PAIR__HAS_UNIT, oldHasUnit, hasUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_PATH:
				if (resolve) return getHasPath();
				return basicGetHasPath();
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_UNIT:
				if (resolve) return getHasUnit();
				return basicGetHasUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_PATH:
				setHasPath((Path)newValue);
				return;
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_UNIT:
				setHasUnit((Unit)newValue);
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
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_PATH:
				setHasPath((Path)null);
				return;
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_UNIT:
				setHasUnit((Unit)null);
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
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_PATH:
				return hasPath != null;
			case BjoernercompletePackage.UNIT_PATH_PAIR__HAS_UNIT:
				return hasUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitPathPairImpl
