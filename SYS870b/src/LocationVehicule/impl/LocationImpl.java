/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.AgenceLocation;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Reservation;
import LocationVehicule.Retour;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.LocationImpl#getDatePrevueDuRetour <em>Date Prevue Du Retour</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocationImpl#getProduit <em>Produit</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocationImpl#getFaiteApartirDe <em>Faite Apartir De</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocationImpl#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link LocationVehicule.impl.LocationImpl#getEstLoueePar <em>Est Louee Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends TransactionImpl implements Location {
	/**
	 * The default value of the '{@link #getDatePrevueDuRetour() <em>Date Prevue Du Retour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevueDuRetour()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PREVUE_DU_RETOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePrevueDuRetour() <em>Date Prevue Du Retour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrevueDuRetour()
	 * @generated
	 * @ordered
	 */
	protected Date datePrevueDuRetour = DATE_PREVUE_DU_RETOUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduit() <em>Produit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduit()
	 * @generated
	 * @ordered
	 */
	protected Retour produit;

	/**
	 * The cached value of the '{@link #getFaiteApartirDe() <em>Faite Apartir De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaiteApartirDe()
	 * @generated
	 * @ordered
	 */
	protected Reservation faiteApartirDe;

	/**
	 * The default value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMEDIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate()
	 * @generated
	 * @ordered
	 */
	protected boolean immediate = IMMEDIATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstLoueePar() <em>Est Louee Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLoueePar()
	 * @generated
	 * @ordered
	 */
	protected AgenceLocation estLoueePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePrevueDuRetour() {
		return datePrevueDuRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrevueDuRetour(Date newDatePrevueDuRetour) {
		Date oldDatePrevueDuRetour = datePrevueDuRetour;
		datePrevueDuRetour = newDatePrevueDuRetour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__DATE_PREVUE_DU_RETOUR, oldDatePrevueDuRetour, datePrevueDuRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retour getProduit() {
		if (produit != null && produit.eIsProxy()) {
			InternalEObject oldProduit = (InternalEObject)produit;
			produit = (Retour)eResolveProxy(oldProduit);
			if (produit != oldProduit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.LOCATION__PRODUIT, oldProduit, produit));
			}
		}
		return produit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retour basicGetProduit() {
		return produit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduit(Retour newProduit, NotificationChain msgs) {
		Retour oldProduit = produit;
		produit = newProduit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__PRODUIT, oldProduit, newProduit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduit(Retour newProduit) {
		if (newProduit != produit) {
			NotificationChain msgs = null;
			if (produit != null)
				msgs = ((InternalEObject)produit).eInverseRemove(this, LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE, Retour.class, msgs);
			if (newProduit != null)
				msgs = ((InternalEObject)newProduit).eInverseAdd(this, LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE, Retour.class, msgs);
			msgs = basicSetProduit(newProduit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__PRODUIT, newProduit, newProduit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getFaiteApartirDe() {
		if (faiteApartirDe != null && faiteApartirDe.eIsProxy()) {
			InternalEObject oldFaiteApartirDe = (InternalEObject)faiteApartirDe;
			faiteApartirDe = (Reservation)eResolveProxy(oldFaiteApartirDe);
			if (faiteApartirDe != oldFaiteApartirDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE, oldFaiteApartirDe, faiteApartirDe));
			}
		}
		return faiteApartirDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetFaiteApartirDe() {
		return faiteApartirDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaiteApartirDe(Reservation newFaiteApartirDe, NotificationChain msgs) {
		Reservation oldFaiteApartirDe = faiteApartirDe;
		faiteApartirDe = newFaiteApartirDe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE, oldFaiteApartirDe, newFaiteApartirDe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaiteApartirDe(Reservation newFaiteApartirDe) {
		if (newFaiteApartirDe != faiteApartirDe) {
			NotificationChain msgs = null;
			if (faiteApartirDe != null)
				msgs = ((InternalEObject)faiteApartirDe).eInverseRemove(this, LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE, Reservation.class, msgs);
			if (newFaiteApartirDe != null)
				msgs = ((InternalEObject)newFaiteApartirDe).eInverseAdd(this, LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE, Reservation.class, msgs);
			msgs = basicSetFaiteApartirDe(newFaiteApartirDe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE, newFaiteApartirDe, newFaiteApartirDe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImmediate() {
		return immediate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmediate(boolean newImmediate) {
		boolean oldImmediate = immediate;
		immediate = newImmediate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__IMMEDIATE, oldImmediate, immediate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceLocation getEstLoueePar() {
		if (estLoueePar != null && estLoueePar.eIsProxy()) {
			InternalEObject oldEstLoueePar = (InternalEObject)estLoueePar;
			estLoueePar = (AgenceLocation)eResolveProxy(oldEstLoueePar);
			if (estLoueePar != oldEstLoueePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.LOCATION__EST_LOUEE_PAR, oldEstLoueePar, estLoueePar));
			}
		}
		return estLoueePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceLocation basicGetEstLoueePar() {
		return estLoueePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLoueePar(AgenceLocation newEstLoueePar, NotificationChain msgs) {
		AgenceLocation oldEstLoueePar = estLoueePar;
		estLoueePar = newEstLoueePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__EST_LOUEE_PAR, oldEstLoueePar, newEstLoueePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLoueePar(AgenceLocation newEstLoueePar) {
		if (newEstLoueePar != estLoueePar) {
			NotificationChain msgs = null;
			if (estLoueePar != null)
				msgs = ((InternalEObject)estLoueePar).eInverseRemove(this, LocationVehiculePackage.AGENCE_LOCATION__LOUE, AgenceLocation.class, msgs);
			if (newEstLoueePar != null)
				msgs = ((InternalEObject)newEstLoueePar).eInverseAdd(this, LocationVehiculePackage.AGENCE_LOCATION__LOUE, AgenceLocation.class, msgs);
			msgs = basicSetEstLoueePar(newEstLoueePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.LOCATION__EST_LOUEE_PAR, newEstLoueePar, newEstLoueePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDuree() {
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
			case LocationVehiculePackage.LOCATION__PRODUIT:
				if (produit != null)
					msgs = ((InternalEObject)produit).eInverseRemove(this, LocationVehiculePackage.RETOUR__EST_LE_PRODUIT_DE, Retour.class, msgs);
				return basicSetProduit((Retour)otherEnd, msgs);
			case LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE:
				if (faiteApartirDe != null)
					msgs = ((InternalEObject)faiteApartirDe).eInverseRemove(this, LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE, Reservation.class, msgs);
				return basicSetFaiteApartirDe((Reservation)otherEnd, msgs);
			case LocationVehiculePackage.LOCATION__EST_LOUEE_PAR:
				if (estLoueePar != null)
					msgs = ((InternalEObject)estLoueePar).eInverseRemove(this, LocationVehiculePackage.AGENCE_LOCATION__LOUE, AgenceLocation.class, msgs);
				return basicSetEstLoueePar((AgenceLocation)otherEnd, msgs);
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
			case LocationVehiculePackage.LOCATION__PRODUIT:
				return basicSetProduit(null, msgs);
			case LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE:
				return basicSetFaiteApartirDe(null, msgs);
			case LocationVehiculePackage.LOCATION__EST_LOUEE_PAR:
				return basicSetEstLoueePar(null, msgs);
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
			case LocationVehiculePackage.LOCATION__DATE_PREVUE_DU_RETOUR:
				return getDatePrevueDuRetour();
			case LocationVehiculePackage.LOCATION__PRODUIT:
				if (resolve) return getProduit();
				return basicGetProduit();
			case LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE:
				if (resolve) return getFaiteApartirDe();
				return basicGetFaiteApartirDe();
			case LocationVehiculePackage.LOCATION__IMMEDIATE:
				return isImmediate() ? Boolean.TRUE : Boolean.FALSE;
			case LocationVehiculePackage.LOCATION__EST_LOUEE_PAR:
				if (resolve) return getEstLoueePar();
				return basicGetEstLoueePar();
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
			case LocationVehiculePackage.LOCATION__DATE_PREVUE_DU_RETOUR:
				setDatePrevueDuRetour((Date)newValue);
				return;
			case LocationVehiculePackage.LOCATION__PRODUIT:
				setProduit((Retour)newValue);
				return;
			case LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE:
				setFaiteApartirDe((Reservation)newValue);
				return;
			case LocationVehiculePackage.LOCATION__IMMEDIATE:
				setImmediate(((Boolean)newValue).booleanValue());
				return;
			case LocationVehiculePackage.LOCATION__EST_LOUEE_PAR:
				setEstLoueePar((AgenceLocation)newValue);
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
			case LocationVehiculePackage.LOCATION__DATE_PREVUE_DU_RETOUR:
				setDatePrevueDuRetour(DATE_PREVUE_DU_RETOUR_EDEFAULT);
				return;
			case LocationVehiculePackage.LOCATION__PRODUIT:
				setProduit((Retour)null);
				return;
			case LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE:
				setFaiteApartirDe((Reservation)null);
				return;
			case LocationVehiculePackage.LOCATION__IMMEDIATE:
				setImmediate(IMMEDIATE_EDEFAULT);
				return;
			case LocationVehiculePackage.LOCATION__EST_LOUEE_PAR:
				setEstLoueePar((AgenceLocation)null);
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
			case LocationVehiculePackage.LOCATION__DATE_PREVUE_DU_RETOUR:
				return DATE_PREVUE_DU_RETOUR_EDEFAULT == null ? datePrevueDuRetour != null : !DATE_PREVUE_DU_RETOUR_EDEFAULT.equals(datePrevueDuRetour);
			case LocationVehiculePackage.LOCATION__PRODUIT:
				return produit != null;
			case LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE:
				return faiteApartirDe != null;
			case LocationVehiculePackage.LOCATION__IMMEDIATE:
				return immediate != IMMEDIATE_EDEFAULT;
			case LocationVehiculePackage.LOCATION__EST_LOUEE_PAR:
				return estLoueePar != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (datePrevueDuRetour: ");
		result.append(datePrevueDuRetour);
		result.append(", immediate: ");
		result.append(immediate);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
