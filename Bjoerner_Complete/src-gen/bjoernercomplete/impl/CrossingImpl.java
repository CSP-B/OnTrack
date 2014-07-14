/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Crossing;
import bjoernercomplete.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crossing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.CrossingImpl#getHasC3 <em>Has C3</em>}</li>
 *   <li>{@link bjoernercomplete.impl.CrossingImpl#getHasC4 <em>Has C4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrossingImpl extends UnitImpl implements Crossing {
	/**
	 * The cached value of the '{@link #getHasC3() <em>Has C3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC3()
	 * @generated
	 * @ordered
	 */
	protected Unit hasC3;

	/**
	 * The cached value of the '{@link #getHasC4() <em>Has C4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC4()
	 * @generated
	 * @ordered
	 */
	protected Unit hasC4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.CROSSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getHasC3() {
		if (hasC3 != null && hasC3.eIsProxy()) {
			InternalEObject oldHasC3 = (InternalEObject)hasC3;
			hasC3 = (Unit)eResolveProxy(oldHasC3);
			if (hasC3 != oldHasC3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.CROSSING__HAS_C3, oldHasC3, hasC3));
			}
		}
		return hasC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasC3() {
		return hasC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC3(Unit newHasC3) {
		Unit oldHasC3 = hasC3;
		hasC3 = newHasC3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CROSSING__HAS_C3, oldHasC3, hasC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getHasC4() {
		if (hasC4 != null && hasC4.eIsProxy()) {
			InternalEObject oldHasC4 = (InternalEObject)hasC4;
			hasC4 = (Unit)eResolveProxy(oldHasC4);
			if (hasC4 != oldHasC4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.CROSSING__HAS_C4, oldHasC4, hasC4));
			}
		}
		return hasC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasC4() {
		return hasC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC4(Unit newHasC4) {
		Unit oldHasC4 = hasC4;
		hasC4 = newHasC4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CROSSING__HAS_C4, oldHasC4, hasC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.CROSSING__HAS_C3:
				if (resolve) return getHasC3();
				return basicGetHasC3();
			case BjoernercompletePackage.CROSSING__HAS_C4:
				if (resolve) return getHasC4();
				return basicGetHasC4();
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
			case BjoernercompletePackage.CROSSING__HAS_C3:
				setHasC3((Unit)newValue);
				return;
			case BjoernercompletePackage.CROSSING__HAS_C4:
				setHasC4((Unit)newValue);
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
			case BjoernercompletePackage.CROSSING__HAS_C3:
				setHasC3((Unit)null);
				return;
			case BjoernercompletePackage.CROSSING__HAS_C4:
				setHasC4((Unit)null);
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
			case BjoernercompletePackage.CROSSING__HAS_C3:
				return hasC3 != null;
			case BjoernercompletePackage.CROSSING__HAS_C4:
				return hasC4 != null;
		}
		return super.eIsSet(featureID);
	}

} //CrossingImpl
