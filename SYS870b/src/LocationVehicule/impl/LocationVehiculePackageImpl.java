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
import LocationVehicule.Client;
import LocationVehicule.Commis;
import LocationVehicule.EmployeAgence;
import LocationVehicule.Gestionnaire;
import LocationVehicule.Localisation;
import LocationVehicule.Location;
import LocationVehicule.LocationVehiculeFactory;
import LocationVehicule.LocationVehiculePackage;
import LocationVehicule.MauvaiseExperience;
import LocationVehicule.Personne;
import LocationVehicule.Reservation;
import LocationVehicule.Retour;
import LocationVehicule.Statut;
import LocationVehicule.Transaction;
import LocationVehicule.Transfert;
import LocationVehicule.Voiture;

import LocationVehicule.util.LocationVehiculeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationVehiculePackageImpl extends EPackageImpl implements LocationVehiculePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voitureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mauvaiseExperienceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeAgenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenceReservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenceRetourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenceTransfertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statutEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see LocationVehicule.LocationVehiculePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LocationVehiculePackageImpl() {
		super(eNS_URI, LocationVehiculeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LocationVehiculePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LocationVehiculePackage init() {
		if (isInited) return (LocationVehiculePackage)EPackage.Registry.INSTANCE.getEPackage(LocationVehiculePackage.eNS_URI);

		// Obtain or create and register package
		LocationVehiculePackageImpl theLocationVehiculePackage = (LocationVehiculePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LocationVehiculePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LocationVehiculePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLocationVehiculePackage.createPackageContents();

		// Initialize created meta-data
		theLocationVehiculePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLocationVehiculePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LocationVehiculeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLocationVehiculePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LocationVehiculePackage.eNS_URI, theLocationVehiculePackage);
		return theLocationVehiculePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_AgitCommeClient() {
		return (EReference)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Identifiant() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Prenom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Domicile() {
		return (EReference)personneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_EstEmploye() {
		return (EReference)personneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Possede() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Loue() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Execute() {
		return (EReference)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Est() {
		return (EReference)clientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Refere() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_DateDebut() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Categorie() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_DateFin() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_FaiteEnVueDe() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_EstFourniePar() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_DemandeePour() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_AVoitureAssignee() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_RefuseePourMauvaisesExperiences() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoiture() {
		return voitureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoiture_EstDeCategorie() {
		return (EReference)voitureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoiture_EstAssigne() {
		return (EReference)voitureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoiture_Identifiant() {
		return (EAttribute)voitureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoiture_EstAssigneeA() {
		return (EReference)voitureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoiture_EnReparation() {
		return (EAttribute)voitureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgence() {
		return agenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_AEnInventaire() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_EstDirigeePar() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgence_Nom() {
		return (EAttribute)agenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_SeSitue() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_ARoleFournisseur() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_ARoleLocateur() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_ARoleRecepteur() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_Effectue() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_EstSupporteePar() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommis() {
		return commisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommis_TravailPour() {
		return (EReference)commisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGestionnaire() {
		return gestionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGestionnaire_Dirige() {
		return (EReference)gestionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_DatePrevueDuRetour() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Produit() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_FaiteApartirDe() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Immediate() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_EstLoueePar() {
		return (EReference)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorie() {
		return categorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorie_Demande() {
		return (EReference)categorieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategorie_Nom() {
		return (EAttribute)categorieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorie_CategoriseVoiture() {
		return (EReference)categorieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMauvaiseExperience() {
		return mauvaiseExperienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMauvaiseExperience_Relate() {
		return (EReference)mauvaiseExperienceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMauvaiseExperience_Detail() {
		return (EAttribute)mauvaiseExperienceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMauvaiseExperience_SeRapporteA() {
		return (EReference)mauvaiseExperienceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalisation() {
		return localisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_AdresseCivique() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_Ville() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_Pays() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_Telephone() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeAgence() {
		return employeAgenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployeAgence_Traite() {
		return (EReference)employeAgenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployeAgence_Est() {
		return (EReference)employeAgenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetour() {
		return retourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetour_EstLeProduitDe() {
		return (EReference)retourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetour_EstRecuePar() {
		return (EReference)retourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetour_VoitureEnBonneCondition() {
		return (EAttribute)retourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetour_MontantPaye() {
		return (EAttribute)retourEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgenceReservation() {
		return agenceReservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceReservation_Fournit() {
		return (EReference)agenceReservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceReservation_FournisseurEstJouePar() {
		return (EReference)agenceReservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgenceLocation() {
		return agenceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceLocation_Loue() {
		return (EReference)agenceLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceLocation_LocateurEstJouePar() {
		return (EReference)agenceLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgenceRetour() {
		return agenceRetourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceRetour_Recoit() {
		return (EReference)agenceRetourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceRetour_RecepteurEstJouePar() {
		return (EReference)agenceRetourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgenceTransfert() {
		return agenceTransfertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceTransfert_TransfereDe() {
		return (EReference)agenceTransfertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenceTransfert_TransfertJouePar() {
		return (EReference)agenceTransfertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_EstTraiteePar() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Id() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_DateTransaction() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Assigne() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Statut() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfert() {
		return transfertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfert_ObjetDuTransfert() {
		return (EReference)transfertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfert_De() {
		return (EReference)transfertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfert_TransfereVers() {
		return (EReference)transfertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfert_Date() {
		return (EAttribute)transfertEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatut() {
		return statutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVehiculeFactory getLocationVehiculeFactory() {
		return (LocationVehiculeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personneEClass = createEClass(PERSONNE);
		createEReference(personneEClass, PERSONNE__AGIT_COMME_CLIENT);
		createEAttribute(personneEClass, PERSONNE__IDENTIFIANT);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__PRENOM);
		createEReference(personneEClass, PERSONNE__DOMICILE);
		createEReference(personneEClass, PERSONNE__EST_EMPLOYE);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__POSSEDE);
		createEReference(clientEClass, CLIENT__LOUE);
		createEReference(clientEClass, CLIENT__EXECUTE);
		createEReference(clientEClass, CLIENT__EST);

		reservationEClass = createEClass(RESERVATION);
		createEReference(reservationEClass, RESERVATION__REFERE);
		createEAttribute(reservationEClass, RESERVATION__DATE_DEBUT);
		createEReference(reservationEClass, RESERVATION__CATEGORIE);
		createEAttribute(reservationEClass, RESERVATION__DATE_FIN);
		createEReference(reservationEClass, RESERVATION__FAITE_EN_VUE_DE);
		createEReference(reservationEClass, RESERVATION__EST_FOURNIE_PAR);
		createEReference(reservationEClass, RESERVATION__DEMANDEE_POUR);
		createEAttribute(reservationEClass, RESERVATION__AVOITURE_ASSIGNEE);
		createEAttribute(reservationEClass, RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES);

		voitureEClass = createEClass(VOITURE);
		createEReference(voitureEClass, VOITURE__EST_DE_CATEGORIE);
		createEReference(voitureEClass, VOITURE__EST_ASSIGNE);
		createEAttribute(voitureEClass, VOITURE__IDENTIFIANT);
		createEReference(voitureEClass, VOITURE__EST_ASSIGNEE_A);
		createEAttribute(voitureEClass, VOITURE__EN_REPARATION);

		agenceEClass = createEClass(AGENCE);
		createEReference(agenceEClass, AGENCE__AEN_INVENTAIRE);
		createEReference(agenceEClass, AGENCE__EST_DIRIGEE_PAR);
		createEAttribute(agenceEClass, AGENCE__NOM);
		createEReference(agenceEClass, AGENCE__SE_SITUE);
		createEReference(agenceEClass, AGENCE__AROLE_FOURNISSEUR);
		createEReference(agenceEClass, AGENCE__AROLE_LOCATEUR);
		createEReference(agenceEClass, AGENCE__AROLE_RECEPTEUR);
		createEReference(agenceEClass, AGENCE__EFFECTUE);
		createEReference(agenceEClass, AGENCE__EST_SUPPORTEE_PAR);

		commisEClass = createEClass(COMMIS);
		createEReference(commisEClass, COMMIS__TRAVAIL_POUR);

		gestionnaireEClass = createEClass(GESTIONNAIRE);
		createEReference(gestionnaireEClass, GESTIONNAIRE__DIRIGE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__DATE_PREVUE_DU_RETOUR);
		createEReference(locationEClass, LOCATION__PRODUIT);
		createEReference(locationEClass, LOCATION__FAITE_APARTIR_DE);
		createEAttribute(locationEClass, LOCATION__IMMEDIATE);
		createEReference(locationEClass, LOCATION__EST_LOUEE_PAR);

		categorieEClass = createEClass(CATEGORIE);
		createEReference(categorieEClass, CATEGORIE__DEMANDE);
		createEAttribute(categorieEClass, CATEGORIE__NOM);
		createEReference(categorieEClass, CATEGORIE__CATEGORISE_VOITURE);

		mauvaiseExperienceEClass = createEClass(MAUVAISE_EXPERIENCE);
		createEReference(mauvaiseExperienceEClass, MAUVAISE_EXPERIENCE__RELATE);
		createEAttribute(mauvaiseExperienceEClass, MAUVAISE_EXPERIENCE__DETAIL);
		createEReference(mauvaiseExperienceEClass, MAUVAISE_EXPERIENCE__SE_RAPPORTE_A);

		localisationEClass = createEClass(LOCALISATION);
		createEAttribute(localisationEClass, LOCALISATION__ADRESSE_CIVIQUE);
		createEAttribute(localisationEClass, LOCALISATION__VILLE);
		createEAttribute(localisationEClass, LOCALISATION__PAYS);
		createEAttribute(localisationEClass, LOCALISATION__TELEPHONE);

		employeAgenceEClass = createEClass(EMPLOYE_AGENCE);
		createEReference(employeAgenceEClass, EMPLOYE_AGENCE__TRAITE);
		createEReference(employeAgenceEClass, EMPLOYE_AGENCE__EST);

		retourEClass = createEClass(RETOUR);
		createEReference(retourEClass, RETOUR__EST_LE_PRODUIT_DE);
		createEReference(retourEClass, RETOUR__EST_RECUE_PAR);
		createEAttribute(retourEClass, RETOUR__VOITURE_EN_BONNE_CONDITION);
		createEAttribute(retourEClass, RETOUR__MONTANT_PAYE);

		agenceReservationEClass = createEClass(AGENCE_RESERVATION);
		createEReference(agenceReservationEClass, AGENCE_RESERVATION__FOURNIT);
		createEReference(agenceReservationEClass, AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR);

		agenceLocationEClass = createEClass(AGENCE_LOCATION);
		createEReference(agenceLocationEClass, AGENCE_LOCATION__LOUE);
		createEReference(agenceLocationEClass, AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR);

		agenceRetourEClass = createEClass(AGENCE_RETOUR);
		createEReference(agenceRetourEClass, AGENCE_RETOUR__RECOIT);
		createEReference(agenceRetourEClass, AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR);

		agenceTransfertEClass = createEClass(AGENCE_TRANSFERT);
		createEReference(agenceTransfertEClass, AGENCE_TRANSFERT__TRANSFERE_DE);
		createEReference(agenceTransfertEClass, AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__EST_TRAITEE_PAR);
		createEAttribute(transactionEClass, TRANSACTION__ID);
		createEAttribute(transactionEClass, TRANSACTION__DATE_TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__ASSIGNE);
		createEAttribute(transactionEClass, TRANSACTION__STATUT);

		transfertEClass = createEClass(TRANSFERT);
		createEReference(transfertEClass, TRANSFERT__OBJET_DU_TRANSFERT);
		createEReference(transfertEClass, TRANSFERT__DE);
		createEReference(transfertEClass, TRANSFERT__TRANSFERE_VERS);
		createEAttribute(transfertEClass, TRANSFERT__DATE);

		// Create enums
		statutEEnum = createEEnum(STATUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		reservationEClass.getESuperTypes().add(this.getTransaction());
		commisEClass.getESuperTypes().add(this.getEmployeAgence());
		gestionnaireEClass.getESuperTypes().add(this.getEmployeAgence());
		locationEClass.getESuperTypes().add(this.getTransaction());
		retourEClass.getESuperTypes().add(this.getTransaction());

		// Initialize classes and features; add operations and parameters
		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonne_AgitCommeClient(), this.getClient(), this.getClient_Est(), "agitCommeClient", null, 0, 1, Personne.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonne_Identifiant(), ecorePackage.getEString(), "identifiant", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Domicile(), this.getLocalisation(), null, "domicile", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPersonne_EstEmploye(), this.getEmployeAgence(), this.getEmployeAgence_Est(), "estEmploye", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Possede(), this.getReservation(), null, "possede", null, 0, -1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Loue(), this.getLocation(), null, "loue", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Execute(), this.getTransaction(), null, "execute", null, 0, -1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Est(), this.getPersonne(), this.getPersonne_AgitCommeClient(), "est", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(clientEClass, this.getMauvaiseExperience(), "listeMauvaisesExperiences", 0, 1);

		addEOperation(clientEClass, this.getTransaction(), "listeTransactions", 0, 1);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservation_Refere(), this.getVoiture(), null, "Refere", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_Categorie(), this.getCategorie(), null, "categorie", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_FaiteEnVueDe(), this.getLocation(), this.getLocation_FaiteApartirDe(), "faiteEnVueDe", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_EstFourniePar(), this.getAgenceReservation(), this.getAgenceReservation_Fournit(), "estFourniePar", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_DemandeePour(), this.getCategorie(), this.getCategorie_Demande(), "demandeePour", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_AVoitureAssignee(), ecorePackage.getEBoolean(), "aVoitureAssignee", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_RefuseePourMauvaisesExperiences(), ecorePackage.getEBoolean(), "refuseePourMauvaisesExperiences", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(reservationEClass, ecorePackage.getEDate(), "getDuree", 0, 1);

		EOperation op = addEOperation(reservationEClass, null, "assigneVoitureJourneeSuivante");
		addEParameter(op, this.getVoiture(), "voiture", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(voitureEClass, Voiture.class, "Voiture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoiture_EstDeCategorie(), this.getCategorie(), this.getCategorie_CategoriseVoiture(), "estDeCategorie", null, 1, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoiture_EstAssigne(), this.getReservation(), null, "estAssigne", null, 0, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoiture_Identifiant(), ecorePackage.getEString(), "identifiant", null, 0, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoiture_EstAssigneeA(), this.getTransaction(), this.getTransaction_Assigne(), "estAssigneeA", null, 0, -1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoiture_EnReparation(), ecorePackage.getEBoolean(), "enReparation", null, 0, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agenceEClass, Agence.class, "Agence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgence_AEnInventaire(), this.getVoiture(), null, "aEnInventaire", null, 0, -1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_EstDirigeePar(), this.getGestionnaire(), this.getGestionnaire_Dirige(), "estDirigeePar", null, 1, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgence_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_SeSitue(), this.getLocalisation(), null, "seSitue", null, 1, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAgence_ARoleFournisseur(), this.getAgenceReservation(), this.getAgenceReservation_FournisseurEstJouePar(), "aRoleFournisseur", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_ARoleLocateur(), this.getAgenceLocation(), this.getAgenceLocation_LocateurEstJouePar(), "aRoleLocateur", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_ARoleRecepteur(), this.getAgenceRetour(), this.getAgenceRetour_RecepteurEstJouePar(), "aRoleRecepteur", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_Effectue(), this.getAgenceTransfert(), this.getAgenceTransfert_TransfertJouePar(), "effectue", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_EstSupporteePar(), this.getCommis(), this.getCommis_TravailPour(), "estSupporteePar", null, 0, -1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(agenceEClass, null, "identifieBesoinsSupplementaires");
		addEParameter(op, ecorePackage.getEDate(), "dateDuJour", 0, 1);

		addEOperation(agenceEClass, ecorePackage.getEBigInteger(), "nbVoituresReservees", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(agenceEClass, ecorePackage.getEBigInteger(), "nbVoituresReservees", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCategorie(), "categorie", 0, 1);

		op = addEOperation(agenceEClass, ecorePackage.getEBigInteger(), "nombreDeVoitures", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCategorie(), "categorie", 0, 1);

		op = addEOperation(agenceEClass, ecorePackage.getEBoolean(), "demanderTransfert", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCategorie(), "categorie", 0, 1);

		op = addEOperation(agenceEClass, this.getLocation(), "locationsNonRetournees", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "today", 1, 1);

		initEClass(commisEClass, Commis.class, "Commis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommis_TravailPour(), this.getAgence(), this.getAgence_EstSupporteePar(), "travailPour", null, 1, 1, Commis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gestionnaireEClass, Gestionnaire.class, "Gestionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGestionnaire_Dirige(), this.getAgence(), this.getAgence_EstDirigeePar(), "dirige", null, 1, 1, Gestionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_DatePrevueDuRetour(), ecorePackage.getEDate(), "datePrevueDuRetour", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Produit(), this.getRetour(), this.getRetour_EstLeProduitDe(), "produit", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_FaiteApartirDe(), this.getReservation(), this.getReservation_FaiteEnVueDe(), "faiteApartirDe", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Immediate(), ecorePackage.getEBoolean(), "immediate", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_EstLoueePar(), this.getAgenceLocation(), this.getAgenceLocation_Loue(), "estLoueePar", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(locationEClass, ecorePackage.getEDate(), "getDuree", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(categorieEClass, Categorie.class, "Categorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorie_Demande(), this.getReservation(), this.getReservation_DemandeePour(), "demande", null, 0, -1, Categorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategorie_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Categorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategorie_CategoriseVoiture(), this.getVoiture(), this.getVoiture_EstDeCategorie(), "categoriseVoiture", null, 0, -1, Categorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mauvaiseExperienceEClass, MauvaiseExperience.class, "MauvaiseExperience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMauvaiseExperience_Relate(), this.getLocation(), null, "relate", null, 1, 1, MauvaiseExperience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMauvaiseExperience_Detail(), ecorePackage.getEString(), "Detail", null, 0, 1, MauvaiseExperience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMauvaiseExperience_SeRapporteA(), this.getTransaction(), null, "seRapporteA", null, 1, 1, MauvaiseExperience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localisationEClass, Localisation.class, "Localisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalisation_AdresseCivique(), ecorePackage.getEString(), "adresseCivique", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalisation_Ville(), ecorePackage.getEString(), "ville", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalisation_Pays(), ecorePackage.getEString(), "pays", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalisation_Telephone(), ecorePackage.getEString(), "telephone", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeAgenceEClass, EmployeAgence.class, "EmployeAgence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployeAgence_Traite(), this.getTransaction(), this.getTransaction_EstTraiteePar(), "traite", null, 0, -1, EmployeAgence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmployeAgence_Est(), this.getPersonne(), this.getPersonne_EstEmploye(), "est", null, 0, 1, EmployeAgence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(employeAgenceEClass, null, "assigneVoitureAReservation");

		initEClass(retourEClass, Retour.class, "Retour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetour_EstLeProduitDe(), this.getLocation(), this.getLocation_Produit(), "estLeProduitDe", null, 0, 1, Retour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetour_EstRecuePar(), this.getAgenceRetour(), this.getAgenceRetour_Recoit(), "estRecuePar", null, 1, 1, Retour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetour_VoitureEnBonneCondition(), ecorePackage.getEBoolean(), "voitureEnBonneCondition", null, 0, 1, Retour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetour_MontantPaye(), ecorePackage.getEDouble(), "montantPaye", null, 0, 1, Retour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agenceReservationEClass, AgenceReservation.class, "AgenceReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenceReservation_Fournit(), this.getReservation(), this.getReservation_EstFourniePar(), "fournit", null, 0, -1, AgenceReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenceReservation_FournisseurEstJouePar(), this.getAgence(), this.getAgence_ARoleFournisseur(), "fournisseurEstJouePar", null, 1, 1, AgenceReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(agenceReservationEClass, null, "enregistre");

		initEClass(agenceLocationEClass, AgenceLocation.class, "AgenceLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenceLocation_Loue(), this.getLocation(), this.getLocation_EstLoueePar(), "loue", null, 0, -1, AgenceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenceLocation_LocateurEstJouePar(), this.getAgence(), this.getAgence_ARoleLocateur(), "locateurEstJouePar", null, 1, 1, AgenceLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(agenceLocationEClass, null, "loueVoiture");

		initEClass(agenceRetourEClass, AgenceRetour.class, "AgenceRetour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenceRetour_Recoit(), this.getRetour(), this.getRetour_EstRecuePar(), "recoit", null, 0, -1, AgenceRetour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenceRetour_RecepteurEstJouePar(), this.getAgence(), this.getAgence_ARoleRecepteur(), "recepteurEstJouePar", null, 1, 1, AgenceRetour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(agenceRetourEClass, null, "recoitVoiture");

		initEClass(agenceTransfertEClass, AgenceTransfert.class, "AgenceTransfert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenceTransfert_TransfereDe(), this.getTransfert(), null, "transfereDe", null, 0, -1, AgenceTransfert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenceTransfert_TransfertJouePar(), this.getAgence(), this.getAgence_Effectue(), "transfertJouePar", null, 1, 1, AgenceTransfert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(agenceTransfertEClass, null, "transfereVoiture");
		addEParameter(op, this.getVoiture(), "voiture", 0, 1);
		addEParameter(op, this.getAgence(), "agence", 0, 1);

		initEClass(transactionEClass, Transaction.class, "Transaction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_EstTraiteePar(), this.getEmployeAgence(), this.getEmployeAgence_Traite(), "estTraiteePar", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Id(), ecorePackage.getEBigInteger(), "id", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_DateTransaction(), ecorePackage.getEDate(), "dateTransaction", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Assigne(), this.getVoiture(), this.getVoiture_EstAssigneeA(), "assigne", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Statut(), this.getStatut(), "statut", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transfertEClass, Transfert.class, "Transfert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransfert_ObjetDuTransfert(), this.getVoiture(), null, "objetDuTransfert", null, 1, 1, Transfert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransfert_De(), this.getAgence(), null, "de", null, 0, 1, Transfert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransfert_TransfereVers(), this.getAgence(), null, "transfereVers", null, 1, 1, Transfert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransfert_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Transfert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statutEEnum, Statut.class, "Statut");
		addEEnumLiteral(statutEEnum, Statut.EN_COURS_LITERAL);
		addEEnumLiteral(statutEEnum, Statut.TERMINEE_LITERAL);
		addEEnumLiteral(statutEEnum, Statut.ANNULEE_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (personneEClass, 
		   source, 
		   new String[] {
			 "constraints", "nomPasVide identifiantUnique prenomPasVide"
		   });			
		addAnnotation
		  (clientEClass, 
		   source, 
		   new String[] {
			 "constraints", "uneSeuleVoitureLouee"
		   });			
		addAnnotation
		  (reservationEClass, 
		   source, 
		   new String[] {
			 "constraints", "statutTermine periodeLocation dateTransaction"
		   });				
		addAnnotation
		  (voitureEClass, 
		   source, 
		   new String[] {
			 "constraints", "identifiantUnique"
		   });								
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "constraints", "periodeLocation locationImmediate statutTermine"
		   });			
		addAnnotation
		  (categorieEClass, 
		   source, 
		   new String[] {
			 "constraints", "identifiantUnique"
		   });			
		addAnnotation
		  (retourEClass, 
		   source, 
		   new String[] {
			 "constraints", "statutTermine"
		   });				
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";				
		addAnnotation
		  (personneEClass, 
		   source, 
		   new String[] {
			 "nomPasVide", "nom.size() > 0",
			 "identifiantUnique", "Personne.allInstances()->isUnique(personne : Personne | personne.identifiant)",
			 "prenomPasVide", "prenom.size() > 0"
		   });			
		addAnnotation
		  (clientEClass, 
		   source, 
		   new String[] {
			 "uneSeuleVoitureLouee", "let loc : Bag(Location) = execute->select(t : Transaction | t.oclIsTypeOf(Location)) in loc->iterate(locElem : Location ; locationUnique : Bag(Location) = Bag{} | locationUnique->includesAll(loc->select(l : Location | l.datePrevueDuRetour._\'>=\'(locElem.datePrevueDuRetour) and l.datePrevueDuRetour._\'<=\'(locElem.dateTransaction))))->size() <= 1"
		   });			
		addAnnotation
		  (reservationEClass, 
		   source, 
		   new String[] {
			 "statutTermine", "if self.faiteEnVueDe <> null then statut = 1 else statut <> 1 endif",
			 "periodeLocation", "dateFin._\'>\'(self.dateDebut)",
			 "dateTransaction", "self.dateTransaction._\'<\'(self.dateDebut)"
		   });		
		addAnnotation
		  ((EOperation)reservationEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.assigne = Bag{voiture}",
			 "pre_estBonneCategorie", "voiture.estDeCategorie = categorie",
			 "post_estAssigee", "self.assigne <> null",
			 "pre_estPasAssigee", "self.assigne = null"
		   });			
		addAnnotation
		  (voitureEClass, 
		   source, 
		   new String[] {
			 "identifiantUnique", "Voiture.allInstances()->isUnique(voiture : Voiture | voiture.identifiant)"
		   });		
		addAnnotation
		  ((EOperation)agenceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.aRoleFournisseur.fournit->select(reservation : Reservation | reservation.statut = 0)->size()"
		   });		
		addAnnotation
		  ((EOperation)agenceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.aRoleFournisseur.fournit->select(reservation : Reservation | reservation.statut = 0 and reservation.categorie = categorie)->size()"
		   });		
		addAnnotation
		  ((EOperation)agenceEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.aEnInventaire->select(voiture : Voiture | voiture.estDeCategorie = categorie)->size()"
		   });		
		addAnnotation
		  ((EOperation)agenceEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.nbVoituresReservees(categorie) > nombreDeVoitures(categorie)"
		   });		
		addAnnotation
		  ((EOperation)agenceEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.aRoleLocateur.loue->select(location : Location | location.datePrevueDuRetour._\'<\'(today) and location.statut = 0)"
		   });			
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "periodeLocation", "datePrevueDuRetour._\'>\'(self.dateTransaction)",
			 "locationImmediate", "immediate = self.faiteApartirDe = null",
			 "statutTermine", "if self.produit <> null then statut = 1 else statut <> 1 endif"
		   });			
		addAnnotation
		  (categorieEClass, 
		   source, 
		   new String[] {
			 "identifiantUnique", "Categorie.allInstances()->isUnique(categorie : Categorie | categorie.nom)"
		   });			
		addAnnotation
		  (retourEClass, 
		   source, 
		   new String[] {
			 "statutTermine", "statut = 1"
		   });		
		addAnnotation
		  ((EOperation)agenceLocationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "pre_aVoiture", "self.locateurEstJouePar.aEnInventaire->size() > 0",
			 "post_uneVoituredeMoins", "self.locateurEstJouePar.aEnInventaire->size() = self.locateurEstJouePar.aEnInventaire->size() - 1"
		   });		
		addAnnotation
		  ((EOperation)agenceRetourEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "post_uneVoituredePlus", "self.recepteurEstJouePar.aEnInventaire->size() = self.recepteurEstJouePar.aEnInventaire->size() + 1"
		   });		
		addAnnotation
		  ((EOperation)agenceTransfertEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "post_transfertUneVoituredeMoins", "self.transfertJouePar.aEnInventaire->size() = self.transfertJouePar.aEnInventaire->size() - 1",
			 "post_transfertUneVoituredePlus", "agence.aEnInventaire->size() = agence.aEnInventaire->size() + 1",
			 "pre_transfertAVoiture", "self.transfertJouePar.aEnInventaire->size() > 0"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //LocationVehiculePackageImpl
