/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.AgenceReservation;
import LocationVehicule.Categorie;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Reservation;
import LocationVehicule.Voiture;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getRefere <em>Refere</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getFaiteEnVueDe <em>Faite En Vue De</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getEstFourniePar <em>Est Fournie Par</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#getDemandeePour <em>Demandee Pour</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#isAVoitureAssignee <em>AVoiture Assignee</em>}</li>
 *   <li>{@link LocationVehicule.impl.ReservationImpl#isRefuseePourMauvaisesExperiences <em>Refusee Pour Mauvaises Experiences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservationImpl extends TransactionImpl implements Reservation {
	/**
	 * The cached value of the '{@link #getRefere() <em>Refere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefere()
	 * @generated
	 * @ordered
	 */
	protected Voiture refere;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected Date dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie categorie;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected Date dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFaiteEnVueDe() <em>Faite En Vue De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaiteEnVueDe()
	 * @generated
	 * @ordered
	 */
	protected Location faiteEnVueDe;

	/**
	 * The cached value of the '{@link #getEstFourniePar() <em>Est Fournie Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstFourniePar()
	 * @generated
	 * @ordered
	 */
	protected AgenceReservation estFourniePar;

	/**
	 * The cached value of the '{@link #getDemandeePour() <em>Demandee Pour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeePour()
	 * @generated
	 * @ordered
	 */
	protected Categorie demandeePour;

	/**
	 * The default value of the '{@link #isAVoitureAssignee() <em>AVoiture Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAVoitureAssignee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVOITURE_ASSIGNEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAVoitureAssignee() <em>AVoiture Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAVoitureAssignee()
	 * @generated
	 * @ordered
	 */
	protected boolean aVoitureAssignee = AVOITURE_ASSIGNEE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRefuseePourMauvaisesExperiences() <em>Refusee Pour Mauvaises Experiences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefuseePourMauvaisesExperiences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFUSEE_POUR_MAUVAISES_EXPERIENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefuseePourMauvaisesExperiences() <em>Refusee Pour Mauvaises Experiences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefuseePourMauvaisesExperiences()
	 * @generated
	 * @ordered
	 */
	protected boolean refuseePourMauvaisesExperiences = REFUSEE_POUR_MAUVAISES_EXPERIENCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getRefere() {
		if (refere != null && refere.eIsProxy()) {
			InternalEObject oldRefere = (InternalEObject)refere;
			refere = (Voiture)eResolveProxy(oldRefere);
			if (refere != oldRefere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RESERVATION__REFERE, oldRefere, refere));
			}
		}
		return refere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetRefere() {
		return refere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefere(Voiture newRefere) {
		Voiture oldRefere = refere;
		refere = newRefere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__REFERE, oldRefere, refere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(Date newDateDebut) {
		Date oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategorie() {
		if (categorie != null && categorie.eIsProxy()) {
			InternalEObject oldCategorie = (InternalEObject)categorie;
			categorie = (Categorie)eResolveProxy(oldCategorie);
			if (categorie != oldCategorie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RESERVATION__CATEGORIE, oldCategorie, categorie));
			}
		}
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie basicGetCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(Categorie newCategorie) {
		Categorie oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__CATEGORIE, oldCategorie, categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(Date newDateFin) {
		Date oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getFaiteEnVueDe() {
		if (faiteEnVueDe != null && faiteEnVueDe.eIsProxy()) {
			InternalEObject oldFaiteEnVueDe = (InternalEObject)faiteEnVueDe;
			faiteEnVueDe = (Location)eResolveProxy(oldFaiteEnVueDe);
			if (faiteEnVueDe != oldFaiteEnVueDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE, oldFaiteEnVueDe, faiteEnVueDe));
			}
		}
		return faiteEnVueDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetFaiteEnVueDe() {
		return faiteEnVueDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaiteEnVueDe(Location newFaiteEnVueDe, NotificationChain msgs) {
		Location oldFaiteEnVueDe = faiteEnVueDe;
		faiteEnVueDe = newFaiteEnVueDe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE, oldFaiteEnVueDe, newFaiteEnVueDe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaiteEnVueDe(Location newFaiteEnVueDe) {
		if (newFaiteEnVueDe != faiteEnVueDe) {
			NotificationChain msgs = null;
			if (faiteEnVueDe != null)
				msgs = ((InternalEObject)faiteEnVueDe).eInverseRemove(this, LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE, Location.class, msgs);
			if (newFaiteEnVueDe != null)
				msgs = ((InternalEObject)newFaiteEnVueDe).eInverseAdd(this, LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE, Location.class, msgs);
			msgs = basicSetFaiteEnVueDe(newFaiteEnVueDe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE, newFaiteEnVueDe, newFaiteEnVueDe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceReservation getEstFourniePar() {
		if (estFourniePar != null && estFourniePar.eIsProxy()) {
			InternalEObject oldEstFourniePar = (InternalEObject)estFourniePar;
			estFourniePar = (AgenceReservation)eResolveProxy(oldEstFourniePar);
			if (estFourniePar != oldEstFourniePar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR, oldEstFourniePar, estFourniePar));
			}
		}
		return estFourniePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceReservation basicGetEstFourniePar() {
		return estFourniePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstFourniePar(AgenceReservation newEstFourniePar, NotificationChain msgs) {
		AgenceReservation oldEstFourniePar = estFourniePar;
		estFourniePar = newEstFourniePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR, oldEstFourniePar, newEstFourniePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstFourniePar(AgenceReservation newEstFourniePar) {
		if (newEstFourniePar != estFourniePar) {
			NotificationChain msgs = null;
			if (estFourniePar != null)
				msgs = ((InternalEObject)estFourniePar).eInverseRemove(this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT, AgenceReservation.class, msgs);
			if (newEstFourniePar != null)
				msgs = ((InternalEObject)newEstFourniePar).eInverseAdd(this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT, AgenceReservation.class, msgs);
			msgs = basicSetEstFourniePar(newEstFourniePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR, newEstFourniePar, newEstFourniePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getDemandeePour() {
		if (demandeePour != null && demandeePour.eIsProxy()) {
			InternalEObject oldDemandeePour = (InternalEObject)demandeePour;
			demandeePour = (Categorie)eResolveProxy(oldDemandeePour);
			if (demandeePour != oldDemandeePour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.RESERVATION__DEMANDEE_POUR, oldDemandeePour, demandeePour));
			}
		}
		return demandeePour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie basicGetDemandeePour() {
		return demandeePour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandeePour(Categorie newDemandeePour, NotificationChain msgs) {
		Categorie oldDemandeePour = demandeePour;
		demandeePour = newDemandeePour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__DEMANDEE_POUR, oldDemandeePour, newDemandeePour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandeePour(Categorie newDemandeePour) {
		if (newDemandeePour != demandeePour) {
			NotificationChain msgs = null;
			if (demandeePour != null)
				msgs = ((InternalEObject)demandeePour).eInverseRemove(this, LocationVehiculePackage.CATEGORIE__DEMANDE, Categorie.class, msgs);
			if (newDemandeePour != null)
				msgs = ((InternalEObject)newDemandeePour).eInverseAdd(this, LocationVehiculePackage.CATEGORIE__DEMANDE, Categorie.class, msgs);
			msgs = basicSetDemandeePour(newDemandeePour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__DEMANDEE_POUR, newDemandeePour, newDemandeePour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAVoitureAssignee() {
		return aVoitureAssignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAVoitureAssignee(boolean newAVoitureAssignee) {
		boolean oldAVoitureAssignee = aVoitureAssignee;
		aVoitureAssignee = newAVoitureAssignee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__AVOITURE_ASSIGNEE, oldAVoitureAssignee, aVoitureAssignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefuseePourMauvaisesExperiences() {
		return refuseePourMauvaisesExperiences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefuseePourMauvaisesExperiences(boolean newRefuseePourMauvaisesExperiences) {
		boolean oldRefuseePourMauvaisesExperiences = refuseePourMauvaisesExperiences;
		refuseePourMauvaisesExperiences = newRefuseePourMauvaisesExperiences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES, oldRefuseePourMauvaisesExperiences, refuseePourMauvaisesExperiences));
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
	public void assigneVoitureJourneeSuivante(Voiture voiture) {
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
			case LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE:
				if (faiteEnVueDe != null)
					msgs = ((InternalEObject)faiteEnVueDe).eInverseRemove(this, LocationVehiculePackage.LOCATION__FAITE_APARTIR_DE, Location.class, msgs);
				return basicSetFaiteEnVueDe((Location)otherEnd, msgs);
			case LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR:
				if (estFourniePar != null)
					msgs = ((InternalEObject)estFourniePar).eInverseRemove(this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNIT, AgenceReservation.class, msgs);
				return basicSetEstFourniePar((AgenceReservation)otherEnd, msgs);
			case LocationVehiculePackage.RESERVATION__DEMANDEE_POUR:
				if (demandeePour != null)
					msgs = ((InternalEObject)demandeePour).eInverseRemove(this, LocationVehiculePackage.CATEGORIE__DEMANDE, Categorie.class, msgs);
				return basicSetDemandeePour((Categorie)otherEnd, msgs);
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
			case LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE:
				return basicSetFaiteEnVueDe(null, msgs);
			case LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR:
				return basicSetEstFourniePar(null, msgs);
			case LocationVehiculePackage.RESERVATION__DEMANDEE_POUR:
				return basicSetDemandeePour(null, msgs);
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
			case LocationVehiculePackage.RESERVATION__REFERE:
				if (resolve) return getRefere();
				return basicGetRefere();
			case LocationVehiculePackage.RESERVATION__DATE_DEBUT:
				return getDateDebut();
			case LocationVehiculePackage.RESERVATION__CATEGORIE:
				if (resolve) return getCategorie();
				return basicGetCategorie();
			case LocationVehiculePackage.RESERVATION__DATE_FIN:
				return getDateFin();
			case LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE:
				if (resolve) return getFaiteEnVueDe();
				return basicGetFaiteEnVueDe();
			case LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR:
				if (resolve) return getEstFourniePar();
				return basicGetEstFourniePar();
			case LocationVehiculePackage.RESERVATION__DEMANDEE_POUR:
				if (resolve) return getDemandeePour();
				return basicGetDemandeePour();
			case LocationVehiculePackage.RESERVATION__AVOITURE_ASSIGNEE:
				return isAVoitureAssignee() ? Boolean.TRUE : Boolean.FALSE;
			case LocationVehiculePackage.RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES:
				return isRefuseePourMauvaisesExperiences() ? Boolean.TRUE : Boolean.FALSE;
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
			case LocationVehiculePackage.RESERVATION__REFERE:
				setRefere((Voiture)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__DATE_DEBUT:
				setDateDebut((Date)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__CATEGORIE:
				setCategorie((Categorie)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__DATE_FIN:
				setDateFin((Date)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE:
				setFaiteEnVueDe((Location)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR:
				setEstFourniePar((AgenceReservation)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__DEMANDEE_POUR:
				setDemandeePour((Categorie)newValue);
				return;
			case LocationVehiculePackage.RESERVATION__AVOITURE_ASSIGNEE:
				setAVoitureAssignee(((Boolean)newValue).booleanValue());
				return;
			case LocationVehiculePackage.RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES:
				setRefuseePourMauvaisesExperiences(((Boolean)newValue).booleanValue());
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
			case LocationVehiculePackage.RESERVATION__REFERE:
				setRefere((Voiture)null);
				return;
			case LocationVehiculePackage.RESERVATION__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case LocationVehiculePackage.RESERVATION__CATEGORIE:
				setCategorie((Categorie)null);
				return;
			case LocationVehiculePackage.RESERVATION__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE:
				setFaiteEnVueDe((Location)null);
				return;
			case LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR:
				setEstFourniePar((AgenceReservation)null);
				return;
			case LocationVehiculePackage.RESERVATION__DEMANDEE_POUR:
				setDemandeePour((Categorie)null);
				return;
			case LocationVehiculePackage.RESERVATION__AVOITURE_ASSIGNEE:
				setAVoitureAssignee(AVOITURE_ASSIGNEE_EDEFAULT);
				return;
			case LocationVehiculePackage.RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES:
				setRefuseePourMauvaisesExperiences(REFUSEE_POUR_MAUVAISES_EXPERIENCES_EDEFAULT);
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
			case LocationVehiculePackage.RESERVATION__REFERE:
				return refere != null;
			case LocationVehiculePackage.RESERVATION__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case LocationVehiculePackage.RESERVATION__CATEGORIE:
				return categorie != null;
			case LocationVehiculePackage.RESERVATION__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case LocationVehiculePackage.RESERVATION__FAITE_EN_VUE_DE:
				return faiteEnVueDe != null;
			case LocationVehiculePackage.RESERVATION__EST_FOURNIE_PAR:
				return estFourniePar != null;
			case LocationVehiculePackage.RESERVATION__DEMANDEE_POUR:
				return demandeePour != null;
			case LocationVehiculePackage.RESERVATION__AVOITURE_ASSIGNEE:
				return aVoitureAssignee != AVOITURE_ASSIGNEE_EDEFAULT;
			case LocationVehiculePackage.RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES:
				return refuseePourMauvaisesExperiences != REFUSEE_POUR_MAUVAISES_EXPERIENCES_EDEFAULT;
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
		result.append(" (dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", aVoitureAssignee: ");
		result.append(aVoitureAssignee);
		result.append(", refuseePourMauvaisesExperiences: ");
		result.append(refuseePourMauvaisesExperiences);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
