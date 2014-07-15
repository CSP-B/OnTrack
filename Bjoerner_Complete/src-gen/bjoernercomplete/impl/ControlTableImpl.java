/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.ControlTable;
import bjoernercomplete.Route;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.ControlTableImpl#getHasRoutes <em>Has Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlTableImpl extends MinimalEObjectImpl.Container implements ControlTable {
	/**
	 * The cached value of the '{@link #getHasRoutes() <em>Has Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> hasRoutes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BjoernercompletePackage.Literals.CONTROL_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getHasRoutes() {
		if (hasRoutes == null) {
			hasRoutes = new EObjectResolvingEList<Route>(Route.class, this, BjoernercompletePackage.CONTROL_TABLE__HAS_ROUTES);
		}
		return hasRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.CONTROL_TABLE__HAS_ROUTES:
				return getHasRoutes();
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
			case BjoernercompletePackage.CONTROL_TABLE__HAS_ROUTES:
				getHasRoutes().clear();
				getHasRoutes().addAll((Collection<? extends Route>)newValue);
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
			case BjoernercompletePackage.CONTROL_TABLE__HAS_ROUTES:
				getHasRoutes().clear();
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
			case BjoernercompletePackage.CONTROL_TABLE__HAS_ROUTES:
				return hasRoutes != null && !hasRoutes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlTableImpl
