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
 *   <li>{@link bjoernercomplete.impl.CrossingImpl#getHasC3_Crossing <em>Has C3 Crossing</em>}</li>
 *   <li>{@link bjoernercomplete.impl.CrossingImpl#getHasC4_Crossing <em>Has C4 Crossing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrossingImpl extends UnitImpl implements Crossing {
	/**
	 * The cached value of the '{@link #getHasC3_Crossing() <em>Has C3 Crossing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC3_Crossing()
	 * @generated
	 * @ordered
	 */
	protected Unit hasC3_Crossing;

	/**
	 * The cached value of the '{@link #getHasC4_Crossing() <em>Has C4 Crossing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC4_Crossing()
	 * @generated
	 * @ordered
	 */
	protected Unit hasC4_Crossing;

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
	public Unit getHasC3_Crossing() {
		if (hasC3_Crossing != null && hasC3_Crossing.eIsProxy()) {
			InternalEObject oldHasC3_Crossing = (InternalEObject)hasC3_Crossing;
			hasC3_Crossing = (Unit)eResolveProxy(oldHasC3_Crossing);
			if (hasC3_Crossing != oldHasC3_Crossing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.CROSSING__HAS_C3_CROSSING, oldHasC3_Crossing, hasC3_Crossing));
			}
		}
		return hasC3_Crossing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasC3_Crossing() {
		return hasC3_Crossing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC3_Crossing(Unit newHasC3_Crossing) {
		Unit oldHasC3_Crossing = hasC3_Crossing;
		hasC3_Crossing = newHasC3_Crossing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CROSSING__HAS_C3_CROSSING, oldHasC3_Crossing, hasC3_Crossing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getHasC4_Crossing() {
		if (hasC4_Crossing != null && hasC4_Crossing.eIsProxy()) {
			InternalEObject oldHasC4_Crossing = (InternalEObject)hasC4_Crossing;
			hasC4_Crossing = (Unit)eResolveProxy(oldHasC4_Crossing);
			if (hasC4_Crossing != oldHasC4_Crossing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.CROSSING__HAS_C4_CROSSING, oldHasC4_Crossing, hasC4_Crossing));
			}
		}
		return hasC4_Crossing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHasC4_Crossing() {
		return hasC4_Crossing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC4_Crossing(Unit newHasC4_Crossing) {
		Unit oldHasC4_Crossing = hasC4_Crossing;
		hasC4_Crossing = newHasC4_Crossing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.CROSSING__HAS_C4_CROSSING, oldHasC4_Crossing, hasC4_Crossing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.CROSSING__HAS_C3_CROSSING:
				if (resolve) return getHasC3_Crossing();
				return basicGetHasC3_Crossing();
			case BjoernercompletePackage.CROSSING__HAS_C4_CROSSING:
				if (resolve) return getHasC4_Crossing();
				return basicGetHasC4_Crossing();
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
			case BjoernercompletePackage.CROSSING__HAS_C3_CROSSING:
				setHasC3_Crossing((Unit)newValue);
				return;
			case BjoernercompletePackage.CROSSING__HAS_C4_CROSSING:
				setHasC4_Crossing((Unit)newValue);
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
			case BjoernercompletePackage.CROSSING__HAS_C3_CROSSING:
				setHasC3_Crossing((Unit)null);
				return;
			case BjoernercompletePackage.CROSSING__HAS_C4_CROSSING:
				setHasC4_Crossing((Unit)null);
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
			case BjoernercompletePackage.CROSSING__HAS_C3_CROSSING:
				return hasC3_Crossing != null;
			case BjoernercompletePackage.CROSSING__HAS_C4_CROSSING:
				return hasC4_Crossing != null;
		}
		return super.eIsSet(featureID);
	}

} //CrossingImpl
