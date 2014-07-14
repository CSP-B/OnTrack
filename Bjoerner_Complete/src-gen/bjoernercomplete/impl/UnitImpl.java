/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.UnitImpl#getHasC1 <em>Has C1</em>}</li>
 *   <li>{@link bjoernercomplete.impl.UnitImpl#getHasC2 <em>Has C2</em>}</li>
 *   <li>{@link bjoernercomplete.impl.UnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link bjoernercomplete.impl.UnitImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitImpl extends EObjectImpl implements Unit {
	/**
	 * The cached value of the '{@link #getHasC1() <em>Has C1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC1()
	 * @generated
	 * @ordered
	 */
	protected Connector hasC1;

	/**
	 * The cached value of the '{@link #getHasC2() <em>Has C2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC2()
	 * @generated
	 * @ordered
	 */
	protected Connector hasC2;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getHasC1() {
		if (hasC1 != null && hasC1.eIsProxy()) {
			InternalEObject oldHasC1 = (InternalEObject)hasC1;
			hasC1 = (Connector)eResolveProxy(oldHasC1);
			if (hasC1 != oldHasC1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.UNIT__HAS_C1, oldHasC1, hasC1));
			}
		}
		return hasC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetHasC1() {
		return hasC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasC1(Connector newHasC1, NotificationChain msgs) {
		Connector oldHasC1 = hasC1;
		hasC1 = newHasC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT__HAS_C1, oldHasC1, newHasC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC1(Connector newHasC1) {
		if (newHasC1 != hasC1) {
			NotificationChain msgs = null;
			if (hasC1 != null)
				msgs = ((InternalEObject)hasC1).eInverseRemove(this, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, Connector.class, msgs);
			if (newHasC1 != null)
				msgs = ((InternalEObject)newHasC1).eInverseAdd(this, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, Connector.class, msgs);
			msgs = basicSetHasC1(newHasC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT__HAS_C1, newHasC1, newHasC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getHasC2() {
		if (hasC2 != null && hasC2.eIsProxy()) {
			InternalEObject oldHasC2 = (InternalEObject)hasC2;
			hasC2 = (Connector)eResolveProxy(oldHasC2);
			if (hasC2 != oldHasC2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.UNIT__HAS_C2, oldHasC2, hasC2));
			}
		}
		return hasC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetHasC2() {
		return hasC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasC2(Connector newHasC2, NotificationChain msgs) {
		Connector oldHasC2 = hasC2;
		hasC2 = newHasC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT__HAS_C2, oldHasC2, newHasC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC2(Connector newHasC2) {
		if (newHasC2 != hasC2) {
			NotificationChain msgs = null;
			if (hasC2 != null)
				msgs = ((InternalEObject)hasC2).eInverseRemove(this, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, Connector.class, msgs);
			if (newHasC2 != null)
				msgs = ((InternalEObject)newHasC2).eInverseAdd(this, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, Connector.class, msgs);
			msgs = basicSetHasC2(newHasC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT__HAS_C2, newHasC2, newHasC2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.UNIT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BjoernercompletePackage.UNIT__HAS_C1:
				if (hasC1 != null)
					msgs = ((InternalEObject)hasC1).eInverseRemove(this, BjoernercompletePackage.CONNECTOR__HAS_UNIT1, Connector.class, msgs);
				return basicSetHasC1((Connector)otherEnd, msgs);
			case BjoernercompletePackage.UNIT__HAS_C2:
				if (hasC2 != null)
					msgs = ((InternalEObject)hasC2).eInverseRemove(this, BjoernercompletePackage.CONNECTOR__HAS_UNIT2, Connector.class, msgs);
				return basicSetHasC2((Connector)otherEnd, msgs);
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
			case BjoernercompletePackage.UNIT__HAS_C1:
				return basicSetHasC1(null, msgs);
			case BjoernercompletePackage.UNIT__HAS_C2:
				return basicSetHasC2(null, msgs);
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
			case BjoernercompletePackage.UNIT__HAS_C1:
				if (resolve) return getHasC1();
				return basicGetHasC1();
			case BjoernercompletePackage.UNIT__HAS_C2:
				if (resolve) return getHasC2();
				return basicGetHasC2();
			case BjoernercompletePackage.UNIT__NAME:
				return getName();
			case BjoernercompletePackage.UNIT__LENGTH:
				return getLength();
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
			case BjoernercompletePackage.UNIT__HAS_C1:
				setHasC1((Connector)newValue);
				return;
			case BjoernercompletePackage.UNIT__HAS_C2:
				setHasC2((Connector)newValue);
				return;
			case BjoernercompletePackage.UNIT__NAME:
				setName((String)newValue);
				return;
			case BjoernercompletePackage.UNIT__LENGTH:
				setLength((Integer)newValue);
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
			case BjoernercompletePackage.UNIT__HAS_C1:
				setHasC1((Connector)null);
				return;
			case BjoernercompletePackage.UNIT__HAS_C2:
				setHasC2((Connector)null);
				return;
			case BjoernercompletePackage.UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BjoernercompletePackage.UNIT__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case BjoernercompletePackage.UNIT__HAS_C1:
				return hasC1 != null;
			case BjoernercompletePackage.UNIT__HAS_C2:
				return hasC2 != null;
			case BjoernercompletePackage.UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BjoernercompletePackage.UNIT__LENGTH:
				return length != LENGTH_EDEFAULT;
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
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
