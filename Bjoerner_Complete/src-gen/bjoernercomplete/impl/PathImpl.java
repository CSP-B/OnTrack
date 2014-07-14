/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.Path;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.PathImpl#getHasPC2 <em>Has PC2</em>}</li>
 *   <li>{@link bjoernercomplete.impl.PathImpl#getHasPC1 <em>Has PC1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathImpl extends EObjectImpl implements Path {
	/**
	 * The cached value of the '{@link #getHasPC2() <em>Has PC2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPC2()
	 * @generated
	 * @ordered
	 */
	protected Connector hasPC2;

	/**
	 * The cached value of the '{@link #getHasPC1() <em>Has PC1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPC1()
	 * @generated
	 * @ordered
	 */
	protected Connector hasPC1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getHasPC2() {
		if (hasPC2 != null && hasPC2.eIsProxy()) {
			InternalEObject oldHasPC2 = (InternalEObject)hasPC2;
			hasPC2 = (Connector)eResolveProxy(oldHasPC2);
			if (hasPC2 != oldHasPC2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.PATH__HAS_PC2, oldHasPC2, hasPC2));
			}
		}
		return hasPC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetHasPC2() {
		return hasPC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPC2(Connector newHasPC2) {
		Connector oldHasPC2 = hasPC2;
		hasPC2 = newHasPC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.PATH__HAS_PC2, oldHasPC2, hasPC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getHasPC1() {
		if (hasPC1 != null && hasPC1.eIsProxy()) {
			InternalEObject oldHasPC1 = (InternalEObject)hasPC1;
			hasPC1 = (Connector)eResolveProxy(oldHasPC1);
			if (hasPC1 != oldHasPC1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.PATH__HAS_PC1, oldHasPC1, hasPC1));
			}
		}
		return hasPC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetHasPC1() {
		return hasPC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPC1(Connector newHasPC1) {
		Connector oldHasPC1 = hasPC1;
		hasPC1 = newHasPC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.PATH__HAS_PC1, oldHasPC1, hasPC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.PATH__HAS_PC2:
				if (resolve) return getHasPC2();
				return basicGetHasPC2();
			case BjoernercompletePackage.PATH__HAS_PC1:
				if (resolve) return getHasPC1();
				return basicGetHasPC1();
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
			case BjoernercompletePackage.PATH__HAS_PC2:
				setHasPC2((Connector)newValue);
				return;
			case BjoernercompletePackage.PATH__HAS_PC1:
				setHasPC1((Connector)newValue);
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
			case BjoernercompletePackage.PATH__HAS_PC2:
				setHasPC2((Connector)null);
				return;
			case BjoernercompletePackage.PATH__HAS_PC1:
				setHasPC1((Connector)null);
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
			case BjoernercompletePackage.PATH__HAS_PC2:
				return hasPC2 != null;
			case BjoernercompletePackage.PATH__HAS_PC1:
				return hasPC1 != null;
		}
		return super.eIsSet(featureID);
	}

} //PathImpl
