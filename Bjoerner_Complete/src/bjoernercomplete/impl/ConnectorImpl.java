/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.Point;
import bjoernercomplete.Unit;

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
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.ConnectorImpl#getHasUnit1 <em>Has Unit1</em>}</li>
 *   <li>{@link bjoernercomplete.impl.ConnectorImpl#getHasPoint <em>Has Point</em>}</li>
 *   <li>{@link bjoernercomplete.impl.ConnectorImpl#getHasUnit2 <em>Has Unit2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EObjectImpl implements Connector {
	/**
	 * The cached value of the '{@link #getHasUnit1() <em>Has Unit1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnit1()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> hasUnit1;

	/**
	 * The cached value of the '{@link #getHasPoint() <em>Has Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> hasPoint;

	/**
	 * The cached value of the '{@link #getHasUnit2() <em>Has Unit2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnit2()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> hasUnit2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getHasUnit1() {
		if (hasUnit1 == null) {
			hasUnit1 = new EObjectWithInverseResolvingEList<Unit>(Unit.class, this, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, BjoernercompletePackage.UNIT__HAS_C1);
		}
		return hasUnit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getHasPoint() {
		if (hasPoint == null) {
			hasPoint = new EObjectWithInverseResolvingEList<Point>(Point.class, this, BjoernercompletePackage.CONNECTOR__HAS_POINT, BjoernercompletePackage.POINT__HAS_C3);
		}
		return hasPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getHasUnit2() {
		if (hasUnit2 == null) {
			hasUnit2 = new EObjectWithInverseResolvingEList<Unit>(Unit.class, this, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, BjoernercompletePackage.UNIT__HAS_C2);
		}
		return hasUnit2;
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
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasUnit1()).basicAdd(otherEnd, msgs);
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasPoint()).basicAdd(otherEnd, msgs);
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasUnit2()).basicAdd(otherEnd, msgs);
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
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT1:
				return ((InternalEList<?>)getHasUnit1()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				return ((InternalEList<?>)getHasPoint()).basicRemove(otherEnd, msgs);
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				return ((InternalEList<?>)getHasUnit2()).basicRemove(otherEnd, msgs);
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
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT1:
				return getHasUnit1();
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				return getHasPoint();
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				return getHasUnit2();
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
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT1:
				getHasUnit1().clear();
				getHasUnit1().addAll((Collection<? extends Unit>)newValue);
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				getHasPoint().clear();
				getHasPoint().addAll((Collection<? extends Point>)newValue);
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				getHasUnit2().clear();
				getHasUnit2().addAll((Collection<? extends Unit>)newValue);
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
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT1:
				getHasUnit1().clear();
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				getHasPoint().clear();
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				getHasUnit2().clear();
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
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT1:
				return hasUnit1 != null && !hasUnit1.isEmpty();
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				return hasPoint != null && !hasPoint.isEmpty();
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				return hasUnit2 != null && !hasUnit2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
