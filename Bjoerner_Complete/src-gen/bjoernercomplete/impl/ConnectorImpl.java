/**
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link bjoernercomplete.impl.ConnectorImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getHasUnit1() <em>Has Unit1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnit1()
	 * @generated
	 * @ordered
	 */
	protected Unit hasUnit1;

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
	 * The cached value of the '{@link #getHasUnit2() <em>Has Unit2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasUnit2()
	 * @generated
	 * @ordered
	 */
	protected Unit hasUnit2;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	public Unit getHasUnit1() {
		if (hasUnit1 != null && hasUnit1.eIsProxy()) {
			InternalEObject oldHasUnit1 = (InternalEObject)hasUnit1;
			hasUnit1 = (Unit)eResolveProxy(oldHasUnit1);
			if (hasUnit1 != oldHasUnit1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, oldHasUnit1, hasUnit1));
			}
		}
		return hasUnit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasUnit1() {
		return hasUnit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasUnit1(Unit newHasUnit1, NotificationChain msgs) {
		Unit oldHasUnit1 = hasUnit1;
		hasUnit1 = newHasUnit1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, oldHasUnit1, newHasUnit1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasUnit1(Unit newHasUnit1) {
		if (newHasUnit1 != hasUnit1) {
			NotificationChain msgs = null;
			if (hasUnit1 != null)
				msgs = ((InternalEObject)hasUnit1).eInverseRemove(this, BjoernercompletePackage.UNIT__HAS_C1, Unit.class, msgs);
			if (newHasUnit1 != null)
				msgs = ((InternalEObject)newHasUnit1).eInverseAdd(this, BjoernercompletePackage.UNIT__HAS_C1, Unit.class, msgs);
			msgs = basicSetHasUnit1(newHasUnit1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, newHasUnit1, newHasUnit1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getHasPoint() {
		if (hasPoint == null) {
			hasPoint = new EObjectResolvingEList<Point>(Point.class, this, BjoernercompletePackage.CONNECTOR__HAS_POINT);
		}
		return hasPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getHasUnit2() {
		if (hasUnit2 != null && hasUnit2.eIsProxy()) {
			InternalEObject oldHasUnit2 = (InternalEObject)hasUnit2;
			hasUnit2 = (Unit)eResolveProxy(oldHasUnit2);
			if (hasUnit2 != oldHasUnit2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, oldHasUnit2, hasUnit2));
			}
		}
		return hasUnit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasUnit2() {
		return hasUnit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasUnit2(Unit newHasUnit2, NotificationChain msgs) {
		Unit oldHasUnit2 = hasUnit2;
		hasUnit2 = newHasUnit2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, oldHasUnit2, newHasUnit2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasUnit2(Unit newHasUnit2) {
		if (newHasUnit2 != hasUnit2) {
			NotificationChain msgs = null;
			if (hasUnit2 != null)
				msgs = ((InternalEObject)hasUnit2).eInverseRemove(this, BjoernercompletePackage.UNIT__HAS_C2, Unit.class, msgs);
			if (newHasUnit2 != null)
				msgs = ((InternalEObject)newHasUnit2).eInverseAdd(this, BjoernercompletePackage.UNIT__HAS_C2, Unit.class, msgs);
			msgs = basicSetHasUnit2(newHasUnit2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, newHasUnit2, newHasUnit2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CONNECTOR__ID, oldID, id));
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
				if (hasUnit1 != null)
					msgs = ((InternalEObject)hasUnit1).eInverseRemove(this, BjoernercompletePackage.UNIT__HAS_C1, Unit.class, msgs);
				return basicSetHasUnit1((Unit)otherEnd, msgs);
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				if (hasUnit2 != null)
					msgs = ((InternalEObject)hasUnit2).eInverseRemove(this, BjoernercompletePackage.UNIT__HAS_C2, Unit.class, msgs);
				return basicSetHasUnit2((Unit)otherEnd, msgs);
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
				return basicSetHasUnit1(null, msgs);
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				return basicSetHasUnit2(null, msgs);
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
				if (resolve) return getHasUnit1();
				return basicGetHasUnit1();
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				return getHasPoint();
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				if (resolve) return getHasUnit2();
				return basicGetHasUnit2();
			case BjoernercompletePackage.CONNECTOR__ID:
				return getID();
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
				setHasUnit1((Unit)newValue);
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				getHasPoint().clear();
				getHasPoint().addAll((Collection<? extends Point>)newValue);
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				setHasUnit2((Unit)newValue);
				return;
			case BjoernercompletePackage.CONNECTOR__ID:
				setID((String)newValue);
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
				setHasUnit1((Unit)null);
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				getHasPoint().clear();
				return;
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				setHasUnit2((Unit)null);
				return;
			case BjoernercompletePackage.CONNECTOR__ID:
				setID(ID_EDEFAULT);
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
				return hasUnit1 != null;
			case BjoernercompletePackage.CONNECTOR__HAS_POINT:
				return hasPoint != null && !hasPoint.isEmpty();
			case BjoernercompletePackage.CONNECTOR__HAS_UNIT2:
				return hasUnit2 != null;
			case BjoernercompletePackage.CONNECTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
