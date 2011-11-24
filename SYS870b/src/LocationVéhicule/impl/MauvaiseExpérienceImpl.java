/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Location;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.MauvaiseExpérience;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mauvaise Expérience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.MauvaiseExpérienceImpl#getRelate <em>Relate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MauvaiseExpérienceImpl extends EObjectImpl implements MauvaiseExpérience {
	/**
	 * The cached value of the '{@link #getRelate() <em>Relate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelate()
	 * @generated
	 * @ordered
	 */
	protected Location relate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MauvaiseExpérienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.MAUVAISE_EXPÉRIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getRelate() {
		if (relate != null && relate.eIsProxy()) {
			InternalEObject oldRelate = (InternalEObject)relate;
			relate = (Location)eResolveProxy(oldRelate);
			if (relate != oldRelate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE__RELATE, oldRelate, relate));
			}
		}
		return relate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetRelate() {
		return relate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelate(Location newRelate) {
		Location oldRelate = relate;
		relate = newRelate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE__RELATE, oldRelate, relate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE__RELATE:
				if (resolve) return getRelate();
				return basicGetRelate();
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
			case LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE__RELATE:
				setRelate((Location)newValue);
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
			case LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE__RELATE:
				setRelate((Location)null);
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
			case LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE__RELATE:
				return relate != null;
		}
		return super.eIsSet(featureID);
	}

} //MauvaiseExpérienceImpl
