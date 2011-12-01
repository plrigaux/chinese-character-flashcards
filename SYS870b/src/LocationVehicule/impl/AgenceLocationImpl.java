/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.AgenceLocation;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agence Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.AgenceLocationImpl#getLoue <em>Loue</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceLocationImpl#getLocateurEstJouePar <em>Locateur Est Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgenceLocationImpl extends EObjectImpl implements AgenceLocation {
	/**
	 * The cached value of the '{@link #getLoue() <em>Loue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoue()
	 * @generated
	 * @ordered
	 */
	protected EList loue;

	/**
	 * The cached value of the '{@link #getLocateurEstJouePar() <em>Locateur Est Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocateurEstJouePar()
	 * @generated
	 * @ordered
	 */
	protected Agence locateurEstJouePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.AGENCE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLoue() {
		if (loue == null) {
			loue = new EObjectWithInverseResolvingEList(Location.class, this, LocationVehiculePackage.AGENCE_LOCATION__LOUE, LocationVehiculePackage.LOCATION__EST_LOUEE_PAR);
		}
		return loue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getLocateurEstJouePar() {
		if (locateurEstJouePar != null && locateurEstJouePar.eIsProxy()) {
			InternalEObject oldLocateurEstJouePar = (InternalEObject)locateurEstJouePar;
			locateurEstJouePar = (Agence)eResolveProxy(oldLocateurEstJouePar);
			if (locateurEstJouePar != oldLocateurEstJouePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR, oldLocateurEstJouePar, locateurEstJouePar));
			}
		}
		return locateurEstJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetLocateurEstJouePar() {
		return locateurEstJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocateurEstJouePar(Agence newLocateurEstJouePar, NotificationChain msgs) {
		Agence oldLocateurEstJouePar = locateurEstJouePar;
		locateurEstJouePar = newLocateurEstJouePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR, oldLocateurEstJouePar, newLocateurEstJouePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocateurEstJouePar(Agence newLocateurEstJouePar) {
		if (newLocateurEstJouePar != locateurEstJouePar) {
			NotificationChain msgs = null;
			if (locateurEstJouePar != null)
				msgs = ((InternalEObject)locateurEstJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__AROLE_LOCATEUR, Agence.class, msgs);
			if (newLocateurEstJouePar != null)
				msgs = ((InternalEObject)newLocateurEstJouePar).eInverseAdd(this, LocationVehiculePackage.AGENCE__AROLE_LOCATEUR, Agence.class, msgs);
			msgs = basicSetLocateurEstJouePar(newLocateurEstJouePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR, newLocateurEstJouePar, newLocateurEstJouePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loueVoiture() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.AGENCE_LOCATION__LOUE:
				return ((InternalEList)getLoue()).basicAdd(otherEnd, msgs);
			case LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR:
				if (locateurEstJouePar != null)
					msgs = ((InternalEObject)locateurEstJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__AROLE_LOCATEUR, Agence.class, msgs);
				return basicSetLocateurEstJouePar((Agence)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationVehiculePackage.AGENCE_LOCATION__LOUE:
				return ((InternalEList)getLoue()).basicRemove(otherEnd, msgs);
			case LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR:
				return basicSetLocateurEstJouePar(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationVehiculePackage.AGENCE_LOCATION__LOUE:
				return getLoue();
			case LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR:
				if (resolve) return getLocateurEstJouePar();
				return basicGetLocateurEstJouePar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationVehiculePackage.AGENCE_LOCATION__LOUE:
				getLoue().clear();
				getLoue().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR:
				setLocateurEstJouePar((Agence)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LocationVehiculePackage.AGENCE_LOCATION__LOUE:
				getLoue().clear();
				return;
			case LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR:
				setLocateurEstJouePar((Agence)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LocationVehiculePackage.AGENCE_LOCATION__LOUE:
				return loue != null && !loue.isEmpty();
			case LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR:
				return locateurEstJouePar != null;
		}
		return super.eIsSet(featureID);
	}

} //AgenceLocationImpl
