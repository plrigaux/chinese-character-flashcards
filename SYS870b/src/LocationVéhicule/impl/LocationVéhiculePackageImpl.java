/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.Agence;
import LocationVéhicule.Catégorie;
import LocationVéhicule.Client;
import LocationVéhicule.Commis;
import LocationVéhicule.DossierClient;
import LocationVéhicule.EmployéAgence;
import LocationVéhicule.Gestionnaire;
import LocationVéhicule.Localisation;
import LocationVéhicule.Location;
import LocationVéhicule.LocationVéhiculeFactory;
import LocationVéhicule.LocationVéhiculePackage;
import LocationVéhicule.MauvaiseExpérience;
import LocationVéhicule.Personne;
import LocationVéhicule.Réservation;
import LocationVéhicule.SociétéUERent;
import LocationVéhicule.Voiture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationVéhiculePackageImpl extends EPackageImpl implements LocationVéhiculePackage {
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
	private EClass réservationEClass = null;

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
	private EClass catégorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sociétéUERentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mauvaiseExpérienceEClass = null;

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
	private EClass employéAgenceEClass = null;

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
	 * @see LocationVéhicule.LocationVéhiculePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LocationVéhiculePackageImpl() {
		super(eNS_URI, LocationVéhiculeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LocationVéhiculePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LocationVéhiculePackage init() {
		if (isInited) return (LocationVéhiculePackage)EPackage.Registry.INSTANCE.getEPackage(LocationVéhiculePackage.eNS_URI);

		// Obtain or create and register package
		LocationVéhiculePackageImpl theLocationVéhiculePackage = (LocationVéhiculePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LocationVéhiculePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LocationVéhiculePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLocationVéhiculePackage.createPackageContents();

		// Initialize created meta-data
		theLocationVéhiculePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLocationVéhiculePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LocationVéhiculePackage.eNS_URI, theLocationVéhiculePackage);
		return theLocationVéhiculePackage;
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
	public EReference getPersonne_Client() {
		return (EReference)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_EReference0() {
		return (EReference)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Gestionnaire() {
		return (EReference)personneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Prénom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Domicile() {
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
	public EReference getClient_Possède() {
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
	public EClass getRéservation() {
		return réservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRéservation_Réfère() {
		return (EReference)réservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRéservation_DateDébut() {
		return (EAttribute)réservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRéservation_Catégorie() {
		return (EReference)réservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRéservation_DateFin() {
		return (EAttribute)réservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRéservation_Préalable() {
		return (EAttribute)réservationEClass.getEStructuralFeatures().get(4);
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
	public EReference getVoiture_EstClassé() {
		return (EReference)voitureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoiture_EstAssigné() {
		return (EReference)voitureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoiture_Id() {
		return (EAttribute)voitureEClass.getEStructuralFeatures().get(2);
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
	public EReference getAgence_Possède() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_A() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_EstDirigéPar() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgence_NombreVéhicule() {
		return (EAttribute)agenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgence_Nom() {
		return (EAttribute)agenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgence_SeSitue() {
		return (EReference)agenceEClass.getEStructuralFeatures().get(5);
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
	public EClass getGestionnaire() {
		return gestionnaireEClass;
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
	public EReference getLocation_A() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_DateDébut() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_DateFin() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatégorie() {
		return catégorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatégorie_Nom() {
		return (EAttribute)catégorieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossierClient() {
		return dossierClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossierClient_Refère() {
		return (EReference)dossierClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossierClient_Contient() {
		return (EReference)dossierClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossierClient_RelateHistorique() {
		return (EReference)dossierClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSociétéUERent() {
		return sociétéUERentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociétéUERent_Possède() {
		return (EReference)sociétéUERentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSociétéUERent_EReference1() {
		return (EReference)sociétéUERentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMauvaiseExpérience() {
		return mauvaiseExpérienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMauvaiseExpérience_Relate() {
		return (EReference)mauvaiseExpérienceEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getLocalisation_Ville() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_Pays() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployéAgence() {
		return employéAgenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVéhiculeFactory getLocationVéhiculeFactory() {
		return (LocationVéhiculeFactory)getEFactoryInstance();
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
		createEReference(personneEClass, PERSONNE__CLIENT);
		createEReference(personneEClass, PERSONNE__EREFERENCE0);
		createEReference(personneEClass, PERSONNE__GESTIONNAIRE);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__PRÉNOM);
		createEReference(personneEClass, PERSONNE__DOMICILE);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__POSSÈDE);
		createEReference(clientEClass, CLIENT__LOUE);

		réservationEClass = createEClass(RÉSERVATION);
		createEReference(réservationEClass, RÉSERVATION__RÉFÈRE);
		createEAttribute(réservationEClass, RÉSERVATION__DATE_DÉBUT);
		createEReference(réservationEClass, RÉSERVATION__CATÉGORIE);
		createEAttribute(réservationEClass, RÉSERVATION__DATE_FIN);
		createEAttribute(réservationEClass, RÉSERVATION__PRÉALABLE);

		voitureEClass = createEClass(VOITURE);
		createEReference(voitureEClass, VOITURE__EST_CLASSÉ);
		createEReference(voitureEClass, VOITURE__EST_ASSIGNÉ);
		createEAttribute(voitureEClass, VOITURE__ID);

		agenceEClass = createEClass(AGENCE);
		createEReference(agenceEClass, AGENCE__POSSÈDE);
		createEReference(agenceEClass, AGENCE__A);
		createEReference(agenceEClass, AGENCE__EST_DIRIGÉ_PAR);
		createEAttribute(agenceEClass, AGENCE__NOMBRE_VÉHICULE);
		createEAttribute(agenceEClass, AGENCE__NOM);
		createEReference(agenceEClass, AGENCE__SE_SITUE);

		commisEClass = createEClass(COMMIS);

		gestionnaireEClass = createEClass(GESTIONNAIRE);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__A);
		createEAttribute(locationEClass, LOCATION__DATE_DÉBUT);
		createEAttribute(locationEClass, LOCATION__DATE_FIN);

		catégorieEClass = createEClass(CATÉGORIE);
		createEAttribute(catégorieEClass, CATÉGORIE__NOM);

		dossierClientEClass = createEClass(DOSSIER_CLIENT);
		createEReference(dossierClientEClass, DOSSIER_CLIENT__REFÈRE);
		createEReference(dossierClientEClass, DOSSIER_CLIENT__CONTIENT);
		createEReference(dossierClientEClass, DOSSIER_CLIENT__RELATE_HISTORIQUE);

		sociétéUERentEClass = createEClass(SOCIÉTÉ_UE_RENT);
		createEReference(sociétéUERentEClass, SOCIÉTÉ_UE_RENT__POSSÈDE);
		createEReference(sociétéUERentEClass, SOCIÉTÉ_UE_RENT__EREFERENCE1);

		mauvaiseExpérienceEClass = createEClass(MAUVAISE_EXPÉRIENCE);
		createEReference(mauvaiseExpérienceEClass, MAUVAISE_EXPÉRIENCE__RELATE);

		localisationEClass = createEClass(LOCALISATION);
		createEAttribute(localisationEClass, LOCALISATION__VILLE);
		createEAttribute(localisationEClass, LOCALISATION__PAYS);

		employéAgenceEClass = createEClass(EMPLOYÉ_AGENCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commisEClass.getESuperTypes().add(this.getEmployéAgence());
		gestionnaireEClass.getESuperTypes().add(this.getEmployéAgence());

		// Initialize classes and features; add operations and parameters
		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonne_Client(), this.getClient(), null, "client", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_EReference0(), this.getCommis(), null, "EReference0", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Gestionnaire(), this.getGestionnaire(), null, "gestionnaire", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Prénom(), ecorePackage.getEString(), "prénom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Domicile(), this.getLocalisation(), null, "domicile", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Possède(), this.getRéservation(), null, "possède", null, 0, -1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Loue(), this.getLocation(), null, "loue", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(clientEClass, null, "réserveVéhicule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(réservationEClass, Réservation.class, "Réservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRéservation_Réfère(), this.getVoiture(), null, "Réfère", null, 1, 1, Réservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRéservation_DateDébut(), ecorePackage.getEDate(), "dateDébut", null, 0, 1, Réservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRéservation_Catégorie(), this.getCatégorie(), null, "catégorie", null, 0, 1, Réservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRéservation_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Réservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRéservation_Préalable(), ecorePackage.getEBoolean(), "préalable", null, 0, 1, Réservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(réservationEClass, null, "getPériodeLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(voitureEClass, Voiture.class, "Voiture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoiture_EstClassé(), this.getCatégorie(), null, "estClassé", null, 1, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoiture_EstAssigné(), this.getRéservation(), null, "estAssigné", null, 0, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoiture_Id(), ecorePackage.getEString(), "id", null, 0, 1, Voiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agenceEClass, Agence.class, "Agence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgence_Possède(), this.getVoiture(), null, "possède", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_A(), this.getCommis(), null, "a", null, 1, -1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_EstDirigéPar(), this.getGestionnaire(), null, "estDirigéPar", null, 1, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgence_NombreVéhicule(), ecorePackage.getEInt(), "nombreVéhicule", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgence_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgence_SeSitue(), this.getLocalisation(), null, "seSitue", null, 1, 1, Agence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(agenceEClass, ecorePackage.getEBoolean(), "aVoitureDisponible", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(agenceEClass, null, "demandeVéhiculeÀAutreAgence", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(agenceEClass, ecorePackage.getEInt(), "nbVoituresDemandés", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCatégorie(), "catégorie", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(agenceEClass, ecorePackage.getEInt(), "nbVoituresDisponible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCatégorie(), "catégorie", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(agenceEClass, null, "transfèreVoiture", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commisEClass, Commis.class, "Commis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(commisEClass, null, "traiteLocation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gestionnaireEClass, Gestionnaire.class, "Gestionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(gestionnaireEClass, null, "assigneVéhicule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_A(), this.getVoiture(), null, "a", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_DateDébut(), ecorePackage.getEDate(), "dateDébut", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(locationEClass, null, "getPériode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(catégorieEClass, Catégorie.class, "Catégorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatégorie_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Catégorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dossierClientEClass, DossierClient.class, "DossierClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDossierClient_Refère(), this.getClient(), null, "refère", null, 1, 1, DossierClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDossierClient_Contient(), this.getMauvaiseExpérience(), null, "contient", null, 0, -1, DossierClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDossierClient_RelateHistorique(), this.getLocation(), null, "relateHistorique", null, 0, -1, DossierClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sociétéUERentEClass, SociétéUERent.class, "SociétéUERent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSociétéUERent_Possède(), this.getAgence(), null, "possède", null, 1000, 1000, SociétéUERent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSociétéUERent_EReference1(), this.getDossierClient(), null, "EReference1", null, 0, 1, SociétéUERent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mauvaiseExpérienceEClass, MauvaiseExpérience.class, "MauvaiseExpérience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMauvaiseExpérience_Relate(), this.getLocation(), null, "relate", null, 1, 1, MauvaiseExpérience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localisationEClass, Localisation.class, "Localisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalisation_Ville(), ecorePackage.getEString(), "ville", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalisation_Pays(), ecorePackage.getEString(), "pays", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employéAgenceEClass, EmployéAgence.class, "EmployéAgence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(employéAgenceEClass, null, "assigneVoitureARéservation", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LocationVéhiculePackageImpl
