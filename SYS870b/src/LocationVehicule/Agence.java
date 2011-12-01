/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Agence#getAEnInventaire <em>AEn Inventaire</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getEstDirigeePar <em>Est Dirigee Par</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getNom <em>Nom</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getSeSitue <em>Se Situe</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getARoleFournisseur <em>ARole Fournisseur</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getARoleLocateur <em>ARole Locateur</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getARoleRecepteur <em>ARole Recepteur</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getEffectue <em>Effectue</em>}</li>
 *   <li>{@link LocationVehicule.Agence#getEstSupporteePar <em>Est Supportee Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getAgence()
 * @model
 * @generated
 */
public interface Agence extends EObject {
	/**
	 * Returns the value of the '<em><b>AEn Inventaire</b></em>' reference list.
	 * The list contents are of type {@link LocationVehicule.Voiture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEn Inventaire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEn Inventaire</em>' reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_AEnInventaire()
	 * @model type="LocationVehicule.Voiture"
	 * @generated
	 */
	EList getAEnInventaire();

	/**
	 * Returns the value of the '<em><b>Est Dirigee Par</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Gestionnaire#getDirige <em>Dirige</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Dirigee Par</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dirigee Par</em>' containment reference.
	 * @see #setEstDirigeePar(Gestionnaire)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_EstDirigeePar()
	 * @see LocationVehicule.Gestionnaire#getDirige
	 * @model opposite="dirige" containment="true" required="true"
	 * @generated
	 */
	Gestionnaire getEstDirigeePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getEstDirigeePar <em>Est Dirigee Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Dirigee Par</em>' containment reference.
	 * @see #getEstDirigeePar()
	 * @generated
	 */
	void setEstDirigeePar(Gestionnaire value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Se Situe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Situe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Situe</em>' containment reference.
	 * @see #setSeSitue(Localisation)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_SeSitue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Localisation getSeSitue();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getSeSitue <em>Se Situe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se Situe</em>' containment reference.
	 * @see #getSeSitue()
	 * @generated
	 */
	void setSeSitue(Localisation value);

	/**
	 * Returns the value of the '<em><b>ARole Fournisseur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceReservation#getFournisseurEstJouePar <em>Fournisseur Est Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARole Fournisseur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARole Fournisseur</em>' reference.
	 * @see #setARoleFournisseur(AgenceReservation)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_ARoleFournisseur()
	 * @see LocationVehicule.AgenceReservation#getFournisseurEstJouePar
	 * @model opposite="fournisseurEstJouePar"
	 * @generated
	 */
	AgenceReservation getARoleFournisseur();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getARoleFournisseur <em>ARole Fournisseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ARole Fournisseur</em>' reference.
	 * @see #getARoleFournisseur()
	 * @generated
	 */
	void setARoleFournisseur(AgenceReservation value);

	/**
	 * Returns the value of the '<em><b>ARole Locateur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceLocation#getLocateurEstJouePar <em>Locateur Est Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARole Locateur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARole Locateur</em>' reference.
	 * @see #setARoleLocateur(AgenceLocation)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_ARoleLocateur()
	 * @see LocationVehicule.AgenceLocation#getLocateurEstJouePar
	 * @model opposite="locateurEstJouePar"
	 * @generated
	 */
	AgenceLocation getARoleLocateur();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getARoleLocateur <em>ARole Locateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ARole Locateur</em>' reference.
	 * @see #getARoleLocateur()
	 * @generated
	 */
	void setARoleLocateur(AgenceLocation value);

	/**
	 * Returns the value of the '<em><b>ARole Recepteur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceRetour#getRecepteurEstJouePar <em>Recepteur Est Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARole Recepteur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARole Recepteur</em>' reference.
	 * @see #setARoleRecepteur(AgenceRetour)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_ARoleRecepteur()
	 * @see LocationVehicule.AgenceRetour#getRecepteurEstJouePar
	 * @model opposite="recepteurEstJouePar"
	 * @generated
	 */
	AgenceRetour getARoleRecepteur();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getARoleRecepteur <em>ARole Recepteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ARole Recepteur</em>' reference.
	 * @see #getARoleRecepteur()
	 * @generated
	 */
	void setARoleRecepteur(AgenceRetour value);

	/**
	 * Returns the value of the '<em><b>Effectue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceTransfert#getTransfertJouePar <em>Transfert Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectue</em>' reference.
	 * @see #setEffectue(AgenceTransfert)
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_Effectue()
	 * @see LocationVehicule.AgenceTransfert#getTransfertJouePar
	 * @model opposite="transfertJouePar"
	 * @generated
	 */
	AgenceTransfert getEffectue();

	/**
	 * Sets the value of the '{@link LocationVehicule.Agence#getEffectue <em>Effectue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectue</em>' reference.
	 * @see #getEffectue()
	 * @generated
	 */
	void setEffectue(AgenceTransfert value);

	/**
	 * Returns the value of the '<em><b>Est Supportee Par</b></em>' containment reference list.
	 * The list contents are of type {@link LocationVehicule.Commis}.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Commis#getTravailPour <em>Travail Pour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Supportee Par</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Supportee Par</em>' containment reference list.
	 * @see LocationVehicule.LocationVehiculePackage#getAgence_EstSupporteePar()
	 * @see LocationVehicule.Commis#getTravailPour
	 * @model type="LocationVehicule.Commis" opposite="travailPour" containment="true"
	 * @generated
	 */
	EList getEstSupporteePar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void identifieBesoinsSupplementaires(Date dateDuJour);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.aRoleFournisseur.fournit->select(reservation : Reservation | reservation.statut = 0)->size()'"
	 * @generated
	 */
	BigInteger nbVoituresReservees();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.aRoleFournisseur.fournit->select(reservation : Reservation | reservation.statut = 0 and reservation.categorie = categorie)->size()'"
	 * @generated
	 */
	BigInteger nbVoituresReservees(Categorie categorie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.aEnInventaire->select(voiture : Voiture | voiture.estDeCategorie = categorie)->size()'"
	 * @generated
	 */
	BigInteger nombreDeVoitures(Categorie categorie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nbVoituresReservees(categorie) > nombreDeVoitures(categorie)'"
	 * @generated
	 */
	boolean demanderTransfert(Categorie categorie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" todayRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.aRoleLocateur.loue->select(location : Location | location.datePrevueDuRetour._\'<\'(today) and location.statut = 0)'"
	 * @generated
	 */
	Location locationsNonRetournees(Date today);

} // Agence
