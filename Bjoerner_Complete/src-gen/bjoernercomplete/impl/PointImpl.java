/**
 */
package bjoernercomplete.impl;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.Direction;
import bjoernercomplete.Point;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bjoernercomplete.impl.PointImpl#getPointName <em>Point Name</em>}</li>
 *   <li>{@link bjoernercomplete.impl.PointImpl#getHasC3_Point <em>Has C3 Point</em>}</li>
 *   <li>{@link bjoernercomplete.impl.PointImpl#getHasPointDirection <em>Has Point Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointImpl extends UnitImpl implements Point {
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
	 * The cached value of the '{@link #getHasC3_Point() <em>Has C3 Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasC3_Point()
	 * @generated
	 * @ordered
	 */
	protected Connector hasC3_Point;

	/**
	 * The cached value of the '{@link #getHasPointDirection() <em>Has Point Direction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPointDirection()
	 * @generated
	 * @ordered
	 */
	protected EList<Direction> hasPointDirection;

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
	public Connector getHasC3_Point() {
		if (hasC3_Point != null && hasC3_Point.eIsProxy()) {
			InternalEObject oldHasC3_Point = (InternalEObject)hasC3_Point;
			hasC3_Point = (Connector)eResolveProxy(oldHasC3_Point);
			if (hasC3_Point != oldHasC3_Point) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BjoernercompletePackage.POINT__HAS_C3_POINT, oldHasC3_Point, hasC3_Point));
			}
		}
		return hasC3_Point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetHasC3_Point() {
		return hasC3_Point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasC3_Point(Connector newHasC3_Point) {
		Connector oldHasC3_Point = hasC3_Point;
		hasC3_Point = newHasC3_Point;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BjoernercompletePackage.POINT__HAS_C3_POINT, oldHasC3_Point, hasC3_Point));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Direction> getHasPointDirection() {
		if (hasPointDirection == null) {
			hasPointDirection = new EObjectResolvingEList<Direction>(Direction.class, this, BjoernercompletePackage.POINT__HAS_POINT_DIRECTION);
		}
		return hasPointDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BjoernercompletePackage.POINT__POINT_NAME:
				return getPointName();
			case BjoernercompletePackage.POINT__HAS_C3_POINT:
				if (resolve) return getHasC3_Point();
				return basicGetHasC3_Point();
			case BjoernercompletePackage.POINT__HAS_POINT_DIRECTION:
				return getHasPointDirection();
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
			case BjoernercompletePackage.POINT__POINT_NAME:
				setPointName((String)newValue);
				return;
			case BjoernercompletePackage.POINT__HAS_C3_POINT:
				setHasC3_Point((Connector)newValue);
				return;
			case BjoernercompletePackage.POINT__HAS_POINT_DIRECTION:
				getHasPointDirection().clear();
				getHasPointDirection().addAll((Collection<? extends Direction>)newValue);
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
			case BjoernercompletePackage.POINT__POINT_NAME:
				setPointName(POINT_NAME_EDEFAULT);
				return;
			case BjoernercompletePackage.POINT__HAS_C3_POINT:
				setHasC3_Point((Connector)null);
				return;
			case BjoernercompletePackage.POINT__HAS_POINT_DIRECTION:
				getHasPointDirection().clear();
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
			case BjoernercompletePackage.POINT__POINT_NAME:
				return POINT_NAME_EDEFAULT == null ? pointName != null : !POINT_NAME_EDEFAULT.equals(pointName);
			case BjoernercompletePackage.POINT__HAS_C3_POINT:
				return hasC3_Point != null;
			case BjoernercompletePackage.POINT__HAS_POINT_DIRECTION:
				return hasPointDirection != null && !hasPointDirection.isEmpty();
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
