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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.PointImpl#getHasC3 <em>Has C3</em>}</li>
 *   <li>{@link bjoernercomplete.impl.PointImpl#getPointName <em>Point Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointImpl extends UnitImpl implements Point {
	/**
	 * The cached value of the '{@link #getHasC3() <em>Has C3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC3()
	 * @generated
	 * @ordered
	 */
	protected Connector hasC3;

	/**
	 * The default value of the '{@link #getPointName() <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointName()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointName() <em>Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointName()
	 * @generated
	 * @ordered
	 */
	protected String pointName = POINT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getHasC3() {
		if (hasC3 != null && hasC3.eIsProxy()) {
			InternalEObject oldHasC3 = (InternalEObject)hasC3;
			hasC3 = (Connector)eResolveProxy(oldHasC3);
			if (hasC3 != oldHasC3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.POINT__HAS_C3, oldHasC3, hasC3));
			}
		}
		return hasC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetHasC3() {
		return hasC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasC3(Connector newHasC3, NotificationChain msgs) {
		Connector oldHasC3 = hasC3;
		hasC3 = newHasC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.POINT__HAS_C3, oldHasC3, newHasC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC3(Connector newHasC3) {
		if (newHasC3 != hasC3) {
			NotificationChain msgs = null;
			if (hasC3 != null)
				msgs = ((InternalEObject)hasC3).eInverseRemove(this, BjoernercompletePackage.CONNECTOR__HAS_POINT, Connector.class, msgs);
			if (newHasC3 != null)
				msgs = ((InternalEObject)newHasC3).eInverseAdd(this, BjoernercompletePackage.CONNECTOR__HAS_POINT, Connector.class, msgs);
			msgs = basicSetHasC3(newHasC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.POINT__HAS_C3, newHasC3, newHasC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointName() {
		return pointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointName(String newPointName) {
		String oldPointName = pointName;
		pointName = newPointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.POINT__POINT_NAME, oldPointName, pointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.POINT__HAS_C3:
				if (hasC3 != null)
					msgs = ((InternalEObject)hasC3).eInverseRemove(this, BjoernercompletePackage.CONNECTOR__HAS_POINT, Connector.class, msgs);
				return basicSetHasC3((Connector)otherEnd, msgs);
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
			case BjoernercompletePackage.POINT__HAS_C3:
				return basicSetHasC3(null, msgs);
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
			case BjoernercompletePackage.POINT__HAS_C3:
				if (resolve) return getHasC3();
				return basicGetHasC3();
			case BjoernercompletePackage.POINT__POINT_NAME:
				return getPointName();
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
			case BjoernercompletePackage.POINT__HAS_C3:
				setHasC3((Connector)newValue);
				return;
			case BjoernercompletePackage.POINT__POINT_NAME:
				setPointName((String)newValue);
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
			case BjoernercompletePackage.POINT__HAS_C3:
				setHasC3((Connector)null);
				return;
			case BjoernercompletePackage.POINT__POINT_NAME:
				setPointName(POINT_NAME_EDEFAULT);
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
			case BjoernercompletePackage.POINT__HAS_C3:
				return hasC3 != null;
			case BjoernercompletePackage.POINT__POINT_NAME:
				return POINT_NAME_EDEFAULT == null ? pointName != null : !POINT_NAME_EDEFAULT.equals(pointName);
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
		result.append(" (pointName: ");
		result.append(pointName);
		result.append(')');
		return result.toString();
	}

} //PointImpl
