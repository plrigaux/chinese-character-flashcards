/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.AgenceReservation;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Reservation;

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
 * An implementation of the model object '<em><b>Agence Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.AgenceReservationImpl#getFournit <em>Fournit</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceReservationImpl#getFournisseurEstJouePar <em>Fournisseur Est Joue Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgenceReservationImpl extends EObjectImpl implements AgenceReservation {
	/**
	 * The cached value of the '{@link #getFournit() <em>Fournit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFournit()
	 * @generated
	 * @ordered
	 */
	protected EList fournit;

	/**
	 * The cached value of the '{@link #getFournisseurEstJouePar() <em>Fournisseur Est Joue Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFournisseurEstJouePar()
	 * @generated
	 * @ordered
	 */
	protected Agence fournisseurEstJouePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.AGENCE_RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFournit() {
		if (fournit == null) {
			fournit = new EObjectWithInverseResolvingEList(Reservation.class, this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT, LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR);
		}
		return fournit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getFournisseurEstJouePar() {
		if (fournisseurEstJouePar != null && fournisseurEstJouePar.eIsProxy()) {
			InternalEObject oldFournisseurEstJouePar = (InternalEObject)fournisseurEstJouePar;
			fournisseurEstJouePar = (Agence)eResolveProxy(oldFournisseurEstJouePar);
			if (fournisseurEstJouePar != oldFournisseurEstJouePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR, oldFournisseurEstJouePar, fournisseurEstJouePar));
			}
		}
		return fournisseurEstJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetFournisseurEstJouePar() {
		return fournisseurEstJouePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFournisseurEstJouePar(Agence newFournisseurEstJouePar, NotificationChain msgs) {
		Agence oldFournisseurEstJouePar = fournisseurEstJouePar;
		fournisseurEstJouePar = newFournisseurEstJouePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR, oldFournisseurEstJouePar, newFournisseurEstJouePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFournisseurEstJouePar(Agence newFournisseurEstJouePar) {
		if (newFournisseurEstJouePar != fournisseurEstJouePar) {
			NotificationChain msgs = null;
			if (fournisseurEstJouePar != null)
				msgs = ((InternalEObject)fournisseurEstJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR, Agence.class, msgs);
			if (newFournisseurEstJouePar != null)
				msgs = ((InternalEObject)newFournisseurEstJouePar).eInverseAdd(this, LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR, Agence.class, msgs);
			msgs = basicSetFournisseurEstJouePar(newFournisseurEstJouePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR, newFournisseurEstJouePar, newFournisseurEstJouePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enregistre() {
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
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT:
				return ((InternalEList)getFournit()).basicAdd(otherEnd, msgs);
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR:
				if (fournisseurEstJouePar != null)
					msgs = ((InternalEObject)fournisseurEstJouePar).eInverseRemove(this, LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR, Agence.class, msgs);
				return basicSetFournisseurEstJouePar((Agence)otherEnd, msgs);
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
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT:
				return ((InternalEList)getFournit()).basicRemove(otherEnd, msgs);
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR:
				return basicSetFournisseurEstJouePar(null, msgs);
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
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT:
				return getFournit();
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR:
				if (resolve) return getFournisseurEstJouePar();
				return basicGetFournisseurEstJouePar();
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
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT:
				getFournit().clear();
				getFournit().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR:
				setFournisseurEstJouePar((Agence)newValue);
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
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT:
				getFournit().clear();
				return;
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR:
				setFournisseurEstJouePar((Agence)null);
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
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT:
				return fournit != null && !fournit.isEmpty();
			case LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR:
				return fournisseurEstJouePar != null;
		}
		return super.eIsSet(featureID);
	}

} //AgenceReservationImpl
