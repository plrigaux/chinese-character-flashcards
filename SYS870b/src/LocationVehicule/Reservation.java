/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LocationVehicule.Reservation#getRefere <em>Refere</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#getFaiteEnVueDe <em>Faite En Vue De</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#getEstFourniePar <em>Est Fournie Par</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#getDemandeePour <em>Demandee Pour</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#isAVoitureAssignee <em>AVoiture Assignee</em>}</li>
 *   <li>{@link LocationVehicule.Reservation#isRefuseePourMauvaisesExperiences <em>Refusee Pour Mauvaises Experiences</em>}</li>
 * </ul>
 * </p>
 *
 * @see LocationVehicule.LocationVehiculePackage#getReservation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='statutTermine periodeLocation dateTransaction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot statutTermine='if self.faiteEnVueDe <> null then statut = 1 else statut <> 1 endif' periodeLocation='dateFin._\'>\'(self.dateDebut)' dateTransaction='self.dateTransaction._\'<\'(self.dateDebut)'"
 * @generated
 */
public interface Reservation extends Transaction {
	/**
	 * Returns the value of the '<em><b>Refere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refere</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refere</em>' reference.
	 * @see #setRefere(Voiture)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_Refere()
	 * @model required="true"
	 * @generated
	 */
	Voiture getRefere();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getRefere <em>Refere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refere</em>' reference.
	 * @see #getRefere()
	 * @generated
	 */
	void setRefere(Voiture value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_DateDebut()
	 * @model
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' reference.
	 * @see #setCategorie(Categorie)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_Categorie()
	 * @model
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getCategorie <em>Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' reference.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Faite En Vue De</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Location#getFaiteApartirDe <em>Faite Apartir De</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faite En Vue De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faite En Vue De</em>' reference.
	 * @see #setFaiteEnVueDe(Location)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_FaiteEnVueDe()
	 * @see LocationVehicule.Location#getFaiteApartirDe
	 * @model opposite="faiteApartirDe"
	 * @generated
	 */
	Location getFaiteEnVueDe();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getFaiteEnVueDe <em>Faite En Vue De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faite En Vue De</em>' reference.
	 * @see #getFaiteEnVueDe()
	 * @generated
	 */
	void setFaiteEnVueDe(Location value);

	/**
	 * Returns the value of the '<em><b>Est Fournie Par</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.AgenceReservation#getFournit <em>Fournit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Fournie Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Fournie Par</em>' reference.
	 * @see #setEstFourniePar(AgenceReservation)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_EstFourniePar()
	 * @see LocationVehicule.AgenceReservation#getFournit
	 * @model opposite="fournit" required="true"
	 * @generated
	 */
	AgenceReservation getEstFourniePar();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getEstFourniePar <em>Est Fournie Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Fournie Par</em>' reference.
	 * @see #getEstFourniePar()
	 * @generated
	 */
	void setEstFourniePar(AgenceReservation value);

	/**
	 * Returns the value of the '<em><b>Demandee Pour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LocationVehicule.Categorie#getDemande <em>Demande</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demandee Pour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demandee Pour</em>' reference.
	 * @see #setDemandeePour(Categorie)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_DemandeePour()
	 * @see LocationVehicule.Categorie#getDemande
	 * @model opposite="demande" required="true"
	 * @generated
	 */
	Categorie getDemandeePour();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#getDemandeePour <em>Demandee Pour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demandee Pour</em>' reference.
	 * @see #getDemandeePour()
	 * @generated
	 */
	void setDemandeePour(Categorie value);

	/**
	 * Returns the value of the '<em><b>AVoiture Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVoiture Assignee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVoiture Assignee</em>' attribute.
	 * @see #setAVoitureAssignee(boolean)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_AVoitureAssignee()
	 * @model
	 * @generated
	 */
	boolean isAVoitureAssignee();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#isAVoitureAssignee <em>AVoiture Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVoiture Assignee</em>' attribute.
	 * @see #isAVoitureAssignee()
	 * @generated
	 */
	void setAVoitureAssignee(boolean value);

	/**
	 * Returns the value of the '<em><b>Refusee Pour Mauvaises Experiences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refusee Pour Mauvaises Experiences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refusee Pour Mauvaises Experiences</em>' attribute.
	 * @see #setRefuseePourMauvaisesExperiences(boolean)
	 * @see LocationVehicule.LocationVehiculePackage#getReservation_RefuseePourMauvaisesExperiences()
	 * @model
	 * @generated
	 */
	boolean isRefuseePourMauvaisesExperiences();

	/**
	 * Sets the value of the '{@link LocationVehicule.Reservation#isRefuseePourMauvaisesExperiences <em>Refusee Pour Mauvaises Experiences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refusee Pour Mauvaises Experiences</em>' attribute.
	 * @see #isRefuseePourMauvaisesExperiences()
	 * @generated
	 */
	void setRefuseePourMauvaisesExperiences(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Date getDuree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model voitureOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.assigne = Bag{voiture}' pre_estBonneCategorie='voiture.estDeCategorie = categorie' post_estAssigee='self.assigne <> null' pre_estPasAssigee='self.assigne = null'"
	 * @generated
	 */
	void assigneVoitureJourneeSuivante(Voiture voiture);

} // Reservation
