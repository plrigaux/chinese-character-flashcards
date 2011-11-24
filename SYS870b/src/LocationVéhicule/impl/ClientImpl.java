/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Client;
import LocationVéhicule.Location;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.Réservation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVéhicule.impl.ClientImpl#getPossède <em>Possède</em>}</li>
 *   <li>{@link LocationVéhicule.impl.ClientImpl#getLoue <em>Loue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientImpl extends EObjectImpl implements Client {
	/**
	 * The cached value of the '{@link #getPossède() <em>Possède</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossède()
	 * @generated
	 * @ordered
	 */
	protected EList<Réservation> possède;

	/**
	 * The cached value of the '{@link #getLoue() <em>Loue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoue()
	 * @generated
	 * @ordered
	 */
	protected Location loue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationVéhiculePackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Réservation> getPossède() {
		if (possède == null) {
			possède = new EObjectResolvingEList<Réservation>(Réservation.class, this, LocationVéhiculePackage.CLIENT__POSSÈDE);
		}
		return possède;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLoue() {
		if (loue != null && loue.eIsProxy()) {
			InternalEObject oldLoue = (InternalEObject)loue;
			loue = (Location)eResolveProxy(oldLoue);
			if (loue != oldLoue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVéhiculePackage.CLIENT__LOUE, oldLoue, loue));
			}
		}
		return loue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLoue() {
		return loue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoue(Location newLoue) {
		Location oldLoue = loue;
		loue = newLoue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVéhiculePackage.CLIENT__LOUE, oldLoue, loue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void réserveVéhicule() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVéhiculePackage.CLIENT__POSSÈDE:
				return getPossède();
			case LocationVéhiculePackage.CLIENT__LOUE:
				if (resolve) return getLoue();
				return basicGetLoue();
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
			case LocationVéhiculePackage.CLIENT__POSSÈDE:
				getPossède().clear();
				getPossède().addAll((Collection<? extends Réservation>)newValue);
				return;
			case LocationVéhiculePackage.CLIENT__LOUE:
				setLoue((Location)newValue);
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
			case LocationVéhiculePackage.CLIENT__POSSÈDE:
				getPossède().clear();
				return;
			case LocationVéhiculePackage.CLIENT__LOUE:
				setLoue((Location)null);
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
			case LocationVéhiculePackage.CLIENT__POSSÈDE:
				return possède != null && !possède.isEmpty();
			case LocationVéhiculePackage.CLIENT__LOUE:
				return loue != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
