/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Signal;
import bjoernercomplete.Terminal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.TerminalImpl#getHasTerminalSignal <em>Has Terminal Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends TrackImpl implements Terminal {
	/**
	 * The cached value of the '{@link #getHasTerminalSignal() <em>Has Terminal Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTerminalSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal hasTerminalSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getHasTerminalSignal() {
		if (hasTerminalSignal != null && hasTerminalSignal.eIsProxy()) {
			InternalEObject oldHasTerminalSignal = (InternalEObject)hasTerminalSignal;
			hasTerminalSignal = (Signal)eResolveProxy(oldHasTerminalSignal);
			if (hasTerminalSignal != oldHasTerminalSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.TERMINAL__HAS_TERMINAL_SIGNAL, oldHasTerminalSignal, hasTerminalSignal));
			}
		}
		return hasTerminalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetHasTerminalSignal() {
		return hasTerminalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTerminalSignal(Signal newHasTerminalSignal) {
		Signal oldHasTerminalSignal = hasTerminalSignal;
		hasTerminalSignal = newHasTerminalSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.TERMINAL__HAS_TERMINAL_SIGNAL, oldHasTerminalSignal, hasTerminalSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.TERMINAL__HAS_TERMINAL_SIGNAL:
				if (resolve) return getHasTerminalSignal();
				return basicGetHasTerminalSignal();
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
			case BjoernercompletePackage.TERMINAL__HAS_TERMINAL_SIGNAL:
				setHasTerminalSignal((Signal)newValue);
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
			case BjoernercompletePackage.TERMINAL__HAS_TERMINAL_SIGNAL:
				setHasTerminalSignal((Signal)null);
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
			case BjoernercompletePackage.TERMINAL__HAS_TERMINAL_SIGNAL:
				return hasTerminalSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminalImpl
