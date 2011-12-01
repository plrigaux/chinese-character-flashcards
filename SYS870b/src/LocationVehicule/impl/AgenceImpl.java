/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.Agence;
import LocationVehicule.AgenceLocation;
import LocationVehicule.AgenceReservation;
import LocationVehicule.AgenceRetour;
import LocationVehicule.AgenceTransfert;
import LocationVehicule.Categorie;
import LocationVehicule.Commis;
import LocationVehicule.Gestionnaire;
import LocationVehicule.Localisation;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.Voiture;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getAEnInventaire <em>AEn Inventaire</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getEstDirigeePar <em>Est Dirigee Par</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getSeSitue <em>Se Situe</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getARoleFournisseur <em>ARole Fournisseur</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getARoleLocateur <em>ARole Locateur</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getARoleRecepteur <em>ARole Recepteur</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getEffectue <em>Effectue</em>}</li>
 *   <li>{@link LocationVehicule.impl.AgenceImpl#getEstSupporteePar <em>Est Supportee Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgenceImpl extends EObjectImpl implements Agence {
	/**
	 * The cached value of the '{@link #getAEnInventaire() <em>AEn Inventaire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEnInventaire()
	 * @generated
	 * @ordered
	 */
	protected EList aEnInventaire;

	/**
	 * The cached value of the '{@link #getEstDirigeePar() <em>Est Dirigee Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDirigeePar()
	 * @generated
	 * @ordered
	 */
	protected Gestionnaire estDirigeePar;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeSitue() <em>Se Situe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeSitue()
	 * @generated
	 * @ordered
	 */
	protected Localisation seSitue;

	/**
	 * The cached value of the '{@link #getARoleFournisseur() <em>ARole Fournisseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARoleFournisseur()
	 * @generated
	 * @ordered
	 */
	protected AgenceReservation aRoleFournisseur;

	/**
	 * The cached value of the '{@link #getARoleLocateur() <em>ARole Locateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARoleLocateur()
	 * @generated
	 * @ordered
	 */
	protected AgenceLocation aRoleLocateur;

	/**
	 * The cached value of the '{@link #getARoleRecepteur() <em>ARole Recepteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARoleRecepteur()
	 * @generated
	 * @ordered
	 */
	protected AgenceRetour aRoleRecepteur;

	/**
	 * The cached value of the '{@link #getEffectue() <em>Effectue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectue()
	 * @generated
	 * @ordered
	 */
	protected AgenceTransfert effectue;

	/**
	 * The cached value of the '{@link #getEstSupporteePar() <em>Est Supportee Par</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSupporteePar()
	 * @generated
	 * @ordered
	 */
	protected EList estSupporteePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LocationVehiculePackage.Literals.AGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAEnInventaire() {
		if (aEnInventaire == null) {
			aEnInventaire = new EObjectResolvingEList(Voiture.class, this, LocationVehiculePackage.AGENCE__AEN_INVENTAIRE);
		}
		return aEnInventaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire getEstDirigeePar() {
		return estDirigeePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDirigeePar(Gestionnaire newEstDirigeePar, NotificationChain msgs) {
		Gestionnaire oldEstDirigeePar = estDirigeePar;
		estDirigeePar = newEstDirigeePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR, oldEstDirigeePar, newEstDirigeePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDirigeePar(Gestionnaire newEstDirigeePar) {
		if (newEstDirigeePar != estDirigeePar) {
			NotificationChain msgs = null;
			if (estDirigeePar != null)
				msgs = ((InternalEObject)estDirigeePar).eInverseRemove(this, LocationVehiculePackage.GESTIONNAIRE__DIRIGE, Gestionnaire.class, msgs);
			if (newEstDirigeePar != null)
				msgs = ((InternalEObject)newEstDirigeePar).eInverseAdd(this, LocationVehiculePackage.GESTIONNAIRE__DIRIGE, Gestionnaire.class, msgs);
			msgs = basicSetEstDirigeePar(newEstDirigeePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR, newEstDirigeePar, newEstDirigeePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getSeSitue() {
		return seSitue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeSitue(Localisation newSeSitue, NotificationChain msgs) {
		Localisation oldSeSitue = seSitue;
		seSitue = newSeSitue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__SE_SITUE, oldSeSitue, newSeSitue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeSitue(Localisation newSeSitue) {
		if (newSeSitue != seSitue) {
			NotificationChain msgs = null;
			if (seSitue != null)
				msgs = ((InternalEObject)seSitue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationVehiculePackage.AGENCE__SE_SITUE, null, msgs);
			if (newSeSitue != null)
				msgs = ((InternalEObject)newSeSitue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocationVehiculePackage.AGENCE__SE_SITUE, null, msgs);
			msgs = basicSetSeSitue(newSeSitue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__SE_SITUE, newSeSitue, newSeSitue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceReservation getARoleFournisseur() {
		if (aRoleFournisseur != null && aRoleFournisseur.eIsProxy()) {
			InternalEObject oldARoleFournisseur = (InternalEObject)aRoleFournisseur;
			aRoleFournisseur = (AgenceReservation)eResolveProxy(oldARoleFournisseur);
			if (aRoleFournisseur != oldARoleFournisseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR, oldARoleFournisseur, aRoleFournisseur));
			}
		}
		return aRoleFournisseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceReservation basicGetARoleFournisseur() {
		return aRoleFournisseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARoleFournisseur(AgenceReservation newARoleFournisseur, NotificationChain msgs) {
		AgenceReservation oldARoleFournisseur = aRoleFournisseur;
		aRoleFournisseur = newARoleFournisseur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR, oldARoleFournisseur, newARoleFournisseur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARoleFournisseur(AgenceReservation newARoleFournisseur) {
		if (newARoleFournisseur != aRoleFournisseur) {
			NotificationChain msgs = null;
			if (aRoleFournisseur != null)
				msgs = ((InternalEObject)aRoleFournisseur).eInverseRemove(this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR, AgenceReservation.class, msgs);
			if (newARoleFournisseur != null)
				msgs = ((InternalEObject)newARoleFournisseur).eInverseAdd(this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR, AgenceReservation.class, msgs);
			msgs = basicSetARoleFournisseur(newARoleFournisseur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR, newARoleFournisseur, newARoleFournisseur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceLocation getARoleLocateur() {
		if (aRoleLocateur != null && aRoleLocateur.eIsProxy()) {
			InternalEObject oldARoleLocateur = (InternalEObject)aRoleLocateur;
			aRoleLocateur = (AgenceLocation)eResolveProxy(oldARoleLocateur);
			if (aRoleLocateur != oldARoleLocateur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE__AROLE_LOCATEUR, oldARoleLocateur, aRoleLocateur));
			}
		}
		return aRoleLocateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceLocation basicGetARoleLocateur() {
		return aRoleLocateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARoleLocateur(AgenceLocation newARoleLocateur, NotificationChain msgs) {
		AgenceLocation oldARoleLocateur = aRoleLocateur;
		aRoleLocateur = newARoleLocateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__AROLE_LOCATEUR, oldARoleLocateur, newARoleLocateur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARoleLocateur(AgenceLocation newARoleLocateur) {
		if (newARoleLocateur != aRoleLocateur) {
			NotificationChain msgs = null;
			if (aRoleLocateur != null)
				msgs = ((InternalEObject)aRoleLocateur).eInverseRemove(this, LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR, AgenceLocation.class, msgs);
			if (newARoleLocateur != null)
				msgs = ((InternalEObject)newARoleLocateur).eInverseAdd(this, LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR, AgenceLocation.class, msgs);
			msgs = basicSetARoleLocateur(newARoleLocateur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__AROLE_LOCATEUR, newARoleLocateur, newARoleLocateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceRetour getARoleRecepteur() {
		if (aRoleRecepteur != null && aRoleRecepteur.eIsProxy()) {
			InternalEObject oldARoleRecepteur = (InternalEObject)aRoleRecepteur;
			aRoleRecepteur = (AgenceRetour)eResolveProxy(oldARoleRecepteur);
			if (aRoleRecepteur != oldARoleRecepteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR, oldARoleRecepteur, aRoleRecepteur));
			}
		}
		return aRoleRecepteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceRetour basicGetARoleRecepteur() {
		return aRoleRecepteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARoleRecepteur(AgenceRetour newARoleRecepteur, NotificationChain msgs) {
		AgenceRetour oldARoleRecepteur = aRoleRecepteur;
		aRoleRecepteur = newARoleRecepteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR, oldARoleRecepteur, newARoleRecepteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARoleRecepteur(AgenceRetour newARoleRecepteur) {
		if (newARoleRecepteur != aRoleRecepteur) {
			NotificationChain msgs = null;
			if (aRoleRecepteur != null)
				msgs = ((InternalEObject)aRoleRecepteur).eInverseRemove(this, LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR, AgenceRetour.class, msgs);
			if (newARoleRecepteur != null)
				msgs = ((InternalEObject)newARoleRecepteur).eInverseAdd(this, LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR, AgenceRetour.class, msgs);
			msgs = basicSetARoleRecepteur(newARoleRecepteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR, newARoleRecepteur, newARoleRecepteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceTransfert getEffectue() {
		if (effectue != null && effectue.eIsProxy()) {
			InternalEObject oldEffectue = (InternalEObject)effectue;
			effectue = (AgenceTransfert)eResolveProxy(oldEffectue);
			if (effectue != oldEffectue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationVehiculePackage.AGENCE__EFFECTUE, oldEffectue, effectue));
			}
		}
		return effectue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceTransfert basicGetEffectue() {
		return effectue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectue(AgenceTransfert newEffectue, NotificationChain msgs) {
		AgenceTransfert oldEffectue = effectue;
		effectue = newEffectue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__EFFECTUE, oldEffectue, newEffectue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectue(AgenceTransfert newEffectue) {
		if (newEffectue != effectue) {
			NotificationChain msgs = null;
			if (effectue != null)
				msgs = ((InternalEObject)effectue).eInverseRemove(this, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR, AgenceTransfert.class, msgs);
			if (newEffectue != null)
				msgs = ((InternalEObject)newEffectue).eInverseAdd(this, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR, AgenceTransfert.class, msgs);
			msgs = basicSetEffectue(newEffectue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationVehiculePackage.AGENCE__EFFECTUE, newEffectue, newEffectue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEstSupporteePar() {
		if (estSupporteePar == null) {
			estSupporteePar = new EObjectContainmentWithInverseEList(Commis.class, this, LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR, LocationVehiculePackage.COMMIS__TRAVAIL_POUR);
		}
		return estSupporteePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void identifieBesoinsSupplementaires(Date dateDuJour) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger nbVoituresReservees() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger nbVoituresReservees(Categorie categorie) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger nombreDeVoitures(Categorie categorie) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean demanderTransfert(Categorie categorie) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location locationsNonRetournees(Date today) {
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
			case LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR:
				if (estDirigeePar != null)
					msgs = ((InternalEObject)estDirigeePar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR, null, msgs);
				return basicSetEstDirigeePar((Gestionnaire)otherEnd, msgs);
			case LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR:
				if (aRoleFournisseur != null)
					msgs = ((InternalEObject)aRoleFournisseur).eInverseRemove(this, LocationVehiculePackage.AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR, AgenceReservation.class, msgs);
				return basicSetARoleFournisseur((AgenceReservation)otherEnd, msgs);
			case LocationVehiculePackage.AGENCE__AROLE_LOCATEUR:
				if (aRoleLocateur != null)
					msgs = ((InternalEObject)aRoleLocateur).eInverseRemove(this, LocationVehiculePackage.AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR, AgenceLocation.class, msgs);
				return basicSetARoleLocateur((AgenceLocation)otherEnd, msgs);
			case LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR:
				if (aRoleRecepteur != null)
					msgs = ((InternalEObject)aRoleRecepteur).eInverseRemove(this, LocationVehiculePackage.AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR, AgenceRetour.class, msgs);
				return basicSetARoleRecepteur((AgenceRetour)otherEnd, msgs);
			case LocationVehiculePackage.AGENCE__EFFECTUE:
				if (effectue != null)
					msgs = ((InternalEObject)effectue).eInverseRemove(this, LocationVehiculePackage.AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR, AgenceTransfert.class, msgs);
				return basicSetEffectue((AgenceTransfert)otherEnd, msgs);
			case LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR:
				return ((InternalEList)getEstSupporteePar()).basicAdd(otherEnd, msgs);
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
			case LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR:
				return basicSetEstDirigeePar(null, msgs);
			case LocationVehiculePackage.AGENCE__SE_SITUE:
				return basicSetSeSitue(null, msgs);
			case LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR:
				return basicSetARoleFournisseur(null, msgs);
			case LocationVehiculePackage.AGENCE__AROLE_LOCATEUR:
				return basicSetARoleLocateur(null, msgs);
			case LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR:
				return basicSetARoleRecepteur(null, msgs);
			case LocationVehiculePackage.AGENCE__EFFECTUE:
				return basicSetEffectue(null, msgs);
			case LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR:
				return ((InternalEList)getEstSupporteePar()).basicRemove(otherEnd, msgs);
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
			case LocationVehiculePackage.AGENCE__AEN_INVENTAIRE:
				return getAEnInventaire();
			case LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR:
				return getEstDirigeePar();
			case LocationVehiculePackage.AGENCE__NOM:
				return getNom();
			case LocationVehiculePackage.AGENCE__SE_SITUE:
				return getSeSitue();
			case LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR:
				if (resolve) return getARoleFournisseur();
				return basicGetARoleFournisseur();
			case LocationVehiculePackage.AGENCE__AROLE_LOCATEUR:
				if (resolve) return getARoleLocateur();
				return basicGetARoleLocateur();
			case LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR:
				if (resolve) return getARoleRecepteur();
				return basicGetARoleRecepteur();
			case LocationVehiculePackage.AGENCE__EFFECTUE:
				if (resolve) return getEffectue();
				return basicGetEffectue();
			case LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR:
				return getEstSupporteePar();
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
			case LocationVehiculePackage.AGENCE__AEN_INVENTAIRE:
				getAEnInventaire().clear();
				getAEnInventaire().addAll((Collection)newValue);
				return;
			case LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR:
				setEstDirigeePar((Gestionnaire)newValue);
				return;
			case LocationVehiculePackage.AGENCE__NOM:
				setNom((String)newValue);
				return;
			case LocationVehiculePackage.AGENCE__SE_SITUE:
				setSeSitue((Localisation)newValue);
				return;
			case LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR:
				setARoleFournisseur((AgenceReservation)newValue);
				return;
			case LocationVehiculePackage.AGENCE__AROLE_LOCATEUR:
				setARoleLocateur((AgenceLocation)newValue);
				return;
			case LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR:
				setARoleRecepteur((AgenceRetour)newValue);
				return;
			case LocationVehiculePackage.AGENCE__EFFECTUE:
				setEffectue((AgenceTransfert)newValue);
				return;
			case LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR:
				getEstSupporteePar().clear();
				getEstSupporteePar().addAll((Collection)newValue);
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
			case LocationVehiculePackage.AGENCE__AEN_INVENTAIRE:
				getAEnInventaire().clear();
				return;
			case LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR:
				setEstDirigeePar((Gestionnaire)null);
				return;
			case LocationVehiculePackage.AGENCE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LocationVehiculePackage.AGENCE__SE_SITUE:
				setSeSitue((Localisation)null);
				return;
			case LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR:
				setARoleFournisseur((AgenceReservation)null);
				return;
			case LocationVehiculePackage.AGENCE__AROLE_LOCATEUR:
				setARoleLocateur((AgenceLocation)null);
				return;
			case LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR:
				setARoleRecepteur((AgenceRetour)null);
				return;
			case LocationVehiculePackage.AGENCE__EFFECTUE:
				setEffectue((AgenceTransfert)null);
				return;
			case LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR:
				getEstSupporteePar().clear();
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
			case LocationVehiculePackage.AGENCE__AEN_INVENTAIRE:
				return aEnInventaire != null && !aEnInventaire.isEmpty();
			case LocationVehiculePackage.AGENCE__EST_DIRIGEE_PAR:
				return estDirigeePar != null;
			case LocationVehiculePackage.AGENCE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LocationVehiculePackage.AGENCE__SE_SITUE:
				return seSitue != null;
			case LocationVehiculePackage.AGENCE__AROLE_FOURNISSEUR:
				return aRoleFournisseur != null;
			case LocationVehiculePackage.AGENCE__AROLE_LOCATEUR:
				return aRoleLocateur != null;
			case LocationVehiculePackage.AGENCE__AROLE_RECEPTEUR:
				return aRoleRecepteur != null;
			case LocationVehiculePackage.AGENCE__EFFECTUE:
				return effectue != null;
			case LocationVehiculePackage.AGENCE__EST_SUPPORTEE_PAR:
				return estSupporteePar != null && !estSupporteePar.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //AgenceImpl
