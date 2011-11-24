/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LocationVéhicule.LocationVéhiculeFactory
 * @model kind="package"
 * @generated
 */
public interface LocationVéhiculePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LocationVéhicule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://defaultname/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "locationVehicule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationVéhiculePackage eINSTANCE = LocationVéhicule.impl.LocationVéhiculePackageImpl.init();

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.PersonneImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__CLIENT = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__EREFERENCE0 = 1;

	/**
	 * The feature id for the '<em><b>Gestionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__GESTIONNAIRE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 3;

	/**
	 * The feature id for the '<em><b>Prénom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRÉNOM = 4;

	/**
	 * The feature id for the '<em><b>Domicile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__DOMICILE = 5;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.ClientImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Possède</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__POSSÈDE = 0;

	/**
	 * The feature id for the '<em><b>Loue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__LOUE = 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.RéservationImpl <em>Réservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.RéservationImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getRéservation()
	 * @generated
	 */
	int RÉSERVATION = 2;

	/**
	 * The feature id for the '<em><b>Réfère</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RÉSERVATION__RÉFÈRE = 0;

	/**
	 * The feature id for the '<em><b>Date Début</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RÉSERVATION__DATE_DÉBUT = 1;

	/**
	 * The feature id for the '<em><b>Catégorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RÉSERVATION__CATÉGORIE = 2;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RÉSERVATION__DATE_FIN = 3;

	/**
	 * The feature id for the '<em><b>Préalable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RÉSERVATION__PRÉALABLE = 4;

	/**
	 * The number of structural features of the '<em>Réservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RÉSERVATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.VoitureImpl <em>Voiture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.VoitureImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getVoiture()
	 * @generated
	 */
	int VOITURE = 3;

	/**
	 * The feature id for the '<em><b>Est Classé</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EST_CLASSÉ = 0;

	/**
	 * The feature id for the '<em><b>Est Assigné</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EST_ASSIGNÉ = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__ID = 2;

	/**
	 * The number of structural features of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.AgenceImpl <em>Agence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.AgenceImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getAgence()
	 * @generated
	 */
	int AGENCE = 4;

	/**
	 * The feature id for the '<em><b>Possède</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__POSSÈDE = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__A = 1;

	/**
	 * The feature id for the '<em><b>Est Dirigé Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__EST_DIRIGÉ_PAR = 2;

	/**
	 * The feature id for the '<em><b>Nombre Véhicule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__NOMBRE_VÉHICULE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__NOM = 4;

	/**
	 * The feature id for the '<em><b>Se Situe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__SE_SITUE = 5;

	/**
	 * The number of structural features of the '<em>Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.EmployéAgenceImpl <em>Employé Agence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.EmployéAgenceImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getEmployéAgence()
	 * @generated
	 */
	int EMPLOYÉ_AGENCE = 13;

	/**
	 * The number of structural features of the '<em>Employé Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYÉ_AGENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.CommisImpl <em>Commis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.CommisImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getCommis()
	 * @generated
	 */
	int COMMIS = 5;

	/**
	 * The number of structural features of the '<em>Commis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS_FEATURE_COUNT = EMPLOYÉ_AGENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.GestionnaireImpl <em>Gestionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.GestionnaireImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getGestionnaire()
	 * @generated
	 */
	int GESTIONNAIRE = 6;

	/**
	 * The number of structural features of the '<em>Gestionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_FEATURE_COUNT = EMPLOYÉ_AGENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.LocationImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__A = 0;

	/**
	 * The feature id for the '<em><b>Date Début</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DATE_DÉBUT = 1;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DATE_FIN = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.CatégorieImpl <em>Catégorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.CatégorieImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getCatégorie()
	 * @generated
	 */
	int CATÉGORIE = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATÉGORIE__NOM = 0;

	/**
	 * The number of structural features of the '<em>Catégorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATÉGORIE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.DossierClientImpl <em>Dossier Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.DossierClientImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getDossierClient()
	 * @generated
	 */
	int DOSSIER_CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Refère</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT__REFÈRE = 0;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT__CONTIENT = 1;

	/**
	 * The feature id for the '<em><b>Relate Historique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT__RELATE_HISTORIQUE = 2;

	/**
	 * The number of structural features of the '<em>Dossier Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.SociétéUERentImpl <em>Société UE Rent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.SociétéUERentImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getSociétéUERent()
	 * @generated
	 */
	int SOCIÉTÉ_UE_RENT = 10;

	/**
	 * The feature id for the '<em><b>Possède</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIÉTÉ_UE_RENT__POSSÈDE = 0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIÉTÉ_UE_RENT__EREFERENCE1 = 1;

	/**
	 * The number of structural features of the '<em>Société UE Rent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIÉTÉ_UE_RENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.MauvaiseExpérienceImpl <em>Mauvaise Expérience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.MauvaiseExpérienceImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getMauvaiseExpérience()
	 * @generated
	 */
	int MAUVAISE_EXPÉRIENCE = 11;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAUVAISE_EXPÉRIENCE__RELATE = 0;

	/**
	 * The number of structural features of the '<em>Mauvaise Expérience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAUVAISE_EXPÉRIENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link LocationVéhicule.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVéhicule.impl.LocalisationImpl
	 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 12;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__VILLE = 0;

	/**
	 * The feature id for the '<em><b>Pays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__PAYS = 1;

	/**
	 * The number of structural features of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see LocationVéhicule.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Personne#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see LocationVéhicule.Personne#getClient()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Client();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Personne#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see LocationVéhicule.Personne#getEReference0()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_EReference0();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Personne#getGestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gestionnaire</em>'.
	 * @see LocationVéhicule.Personne#getGestionnaire()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Gestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LocationVéhicule.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Personne#getPrénom <em>Prénom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prénom</em>'.
	 * @see LocationVéhicule.Personne#getPrénom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prénom();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Personne#getDomicile <em>Domicile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domicile</em>'.
	 * @see LocationVéhicule.Personne#getDomicile()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Domicile();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see LocationVéhicule.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link LocationVéhicule.Client#getPossède <em>Possède</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possède</em>'.
	 * @see LocationVéhicule.Client#getPossède()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Possède();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Client#getLoue <em>Loue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loue</em>'.
	 * @see LocationVéhicule.Client#getLoue()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Loue();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Réservation <em>Réservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Réservation</em>'.
	 * @see LocationVéhicule.Réservation
	 * @generated
	 */
	EClass getRéservation();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Réservation#getRéfère <em>Réfère</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Réfère</em>'.
	 * @see LocationVéhicule.Réservation#getRéfère()
	 * @see #getRéservation()
	 * @generated
	 */
	EReference getRéservation_Réfère();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Réservation#getDateDébut <em>Date Début</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Début</em>'.
	 * @see LocationVéhicule.Réservation#getDateDébut()
	 * @see #getRéservation()
	 * @generated
	 */
	EAttribute getRéservation_DateDébut();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Réservation#getCatégorie <em>Catégorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catégorie</em>'.
	 * @see LocationVéhicule.Réservation#getCatégorie()
	 * @see #getRéservation()
	 * @generated
	 */
	EReference getRéservation_Catégorie();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Réservation#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see LocationVéhicule.Réservation#getDateFin()
	 * @see #getRéservation()
	 * @generated
	 */
	EAttribute getRéservation_DateFin();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Réservation#isPréalable <em>Préalable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Préalable</em>'.
	 * @see LocationVéhicule.Réservation#isPréalable()
	 * @see #getRéservation()
	 * @generated
	 */
	EAttribute getRéservation_Préalable();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voiture</em>'.
	 * @see LocationVéhicule.Voiture
	 * @generated
	 */
	EClass getVoiture();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Voiture#getEstClassé <em>Est Classé</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Classé</em>'.
	 * @see LocationVéhicule.Voiture#getEstClassé()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_EstClassé();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Voiture#getEstAssigné <em>Est Assigné</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Assigné</em>'.
	 * @see LocationVéhicule.Voiture#getEstAssigné()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_EstAssigné();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Voiture#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see LocationVéhicule.Voiture#getId()
	 * @see #getVoiture()
	 * @generated
	 */
	EAttribute getVoiture_Id();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence</em>'.
	 * @see LocationVéhicule.Agence
	 * @generated
	 */
	EClass getAgence();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Agence#getPossède <em>Possède</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Possède</em>'.
	 * @see LocationVéhicule.Agence#getPossède()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_Possède();

	/**
	 * Returns the meta object for the reference list '{@link LocationVéhicule.Agence#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see LocationVéhicule.Agence#getA()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_A();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Agence#getEstDirigéPar <em>Est Dirigé Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Dirigé Par</em>'.
	 * @see LocationVéhicule.Agence#getEstDirigéPar()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_EstDirigéPar();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Agence#getNombreVéhicule <em>Nombre Véhicule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Véhicule</em>'.
	 * @see LocationVéhicule.Agence#getNombreVéhicule()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_NombreVéhicule();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Agence#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LocationVéhicule.Agence#getNom()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_Nom();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Agence#getSeSitue <em>Se Situe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Se Situe</em>'.
	 * @see LocationVéhicule.Agence#getSeSitue()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_SeSitue();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Commis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commis</em>'.
	 * @see LocationVéhicule.Commis
	 * @generated
	 */
	EClass getCommis();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Gestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestionnaire</em>'.
	 * @see LocationVéhicule.Gestionnaire
	 * @generated
	 */
	EClass getGestionnaire();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see LocationVéhicule.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.Location#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A</em>'.
	 * @see LocationVéhicule.Location#getA()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_A();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Location#getDateDébut <em>Date Début</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Début</em>'.
	 * @see LocationVéhicule.Location#getDateDébut()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_DateDébut();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Location#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see LocationVéhicule.Location#getDateFin()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_DateFin();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Catégorie <em>Catégorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catégorie</em>'.
	 * @see LocationVéhicule.Catégorie
	 * @generated
	 */
	EClass getCatégorie();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Catégorie#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LocationVéhicule.Catégorie#getNom()
	 * @see #getCatégorie()
	 * @generated
	 */
	EAttribute getCatégorie_Nom();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.DossierClient <em>Dossier Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier Client</em>'.
	 * @see LocationVéhicule.DossierClient
	 * @generated
	 */
	EClass getDossierClient();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.DossierClient#getRefère <em>Refère</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refère</em>'.
	 * @see LocationVéhicule.DossierClient#getRefère()
	 * @see #getDossierClient()
	 * @generated
	 */
	EReference getDossierClient_Refère();

	/**
	 * Returns the meta object for the reference list '{@link LocationVéhicule.DossierClient#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contient</em>'.
	 * @see LocationVéhicule.DossierClient#getContient()
	 * @see #getDossierClient()
	 * @generated
	 */
	EReference getDossierClient_Contient();

	/**
	 * Returns the meta object for the reference list '{@link LocationVéhicule.DossierClient#getRelateHistorique <em>Relate Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relate Historique</em>'.
	 * @see LocationVéhicule.DossierClient#getRelateHistorique()
	 * @see #getDossierClient()
	 * @generated
	 */
	EReference getDossierClient_RelateHistorique();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.SociétéUERent <em>Société UE Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Société UE Rent</em>'.
	 * @see LocationVéhicule.SociétéUERent
	 * @generated
	 */
	EClass getSociétéUERent();

	/**
	 * Returns the meta object for the reference list '{@link LocationVéhicule.SociétéUERent#getPossède <em>Possède</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possède</em>'.
	 * @see LocationVéhicule.SociétéUERent#getPossède()
	 * @see #getSociétéUERent()
	 * @generated
	 */
	EReference getSociétéUERent_Possède();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.SociétéUERent#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see LocationVéhicule.SociétéUERent#getEReference1()
	 * @see #getSociétéUERent()
	 * @generated
	 */
	EReference getSociétéUERent_EReference1();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.MauvaiseExpérience <em>Mauvaise Expérience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mauvaise Expérience</em>'.
	 * @see LocationVéhicule.MauvaiseExpérience
	 * @generated
	 */
	EClass getMauvaiseExpérience();

	/**
	 * Returns the meta object for the reference '{@link LocationVéhicule.MauvaiseExpérience#getRelate <em>Relate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relate</em>'.
	 * @see LocationVéhicule.MauvaiseExpérience#getRelate()
	 * @see #getMauvaiseExpérience()
	 * @generated
	 */
	EReference getMauvaiseExpérience_Relate();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see LocationVéhicule.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Localisation#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville</em>'.
	 * @see LocationVéhicule.Localisation#getVille()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Ville();

	/**
	 * Returns the meta object for the attribute '{@link LocationVéhicule.Localisation#getPays <em>Pays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pays</em>'.
	 * @see LocationVéhicule.Localisation#getPays()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Pays();

	/**
	 * Returns the meta object for class '{@link LocationVéhicule.EmployéAgence <em>Employé Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employé Agence</em>'.
	 * @see LocationVéhicule.EmployéAgence
	 * @generated
	 */
	EClass getEmployéAgence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocationVéhiculeFactory getLocationVéhiculeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.PersonneImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__CLIENT = eINSTANCE.getPersonne_Client();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__EREFERENCE0 = eINSTANCE.getPersonne_EReference0();

		/**
		 * The meta object literal for the '<em><b>Gestionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__GESTIONNAIRE = eINSTANCE.getPersonne_Gestionnaire();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prénom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRÉNOM = eINSTANCE.getPersonne_Prénom();

		/**
		 * The meta object literal for the '<em><b>Domicile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__DOMICILE = eINSTANCE.getPersonne_Domicile();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.ClientImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Possède</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__POSSÈDE = eINSTANCE.getClient_Possède();

		/**
		 * The meta object literal for the '<em><b>Loue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__LOUE = eINSTANCE.getClient_Loue();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.RéservationImpl <em>Réservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.RéservationImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getRéservation()
		 * @generated
		 */
		EClass RÉSERVATION = eINSTANCE.getRéservation();

		/**
		 * The meta object literal for the '<em><b>Réfère</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RÉSERVATION__RÉFÈRE = eINSTANCE.getRéservation_Réfère();

		/**
		 * The meta object literal for the '<em><b>Date Début</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RÉSERVATION__DATE_DÉBUT = eINSTANCE.getRéservation_DateDébut();

		/**
		 * The meta object literal for the '<em><b>Catégorie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RÉSERVATION__CATÉGORIE = eINSTANCE.getRéservation_Catégorie();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RÉSERVATION__DATE_FIN = eINSTANCE.getRéservation_DateFin();

		/**
		 * The meta object literal for the '<em><b>Préalable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RÉSERVATION__PRÉALABLE = eINSTANCE.getRéservation_Préalable();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.VoitureImpl <em>Voiture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.VoitureImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getVoiture()
		 * @generated
		 */
		EClass VOITURE = eINSTANCE.getVoiture();

		/**
		 * The meta object literal for the '<em><b>Est Classé</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__EST_CLASSÉ = eINSTANCE.getVoiture_EstClassé();

		/**
		 * The meta object literal for the '<em><b>Est Assigné</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__EST_ASSIGNÉ = eINSTANCE.getVoiture_EstAssigné();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOITURE__ID = eINSTANCE.getVoiture_Id();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.AgenceImpl <em>Agence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.AgenceImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getAgence()
		 * @generated
		 */
		EClass AGENCE = eINSTANCE.getAgence();

		/**
		 * The meta object literal for the '<em><b>Possède</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__POSSÈDE = eINSTANCE.getAgence_Possède();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__A = eINSTANCE.getAgence_A();

		/**
		 * The meta object literal for the '<em><b>Est Dirigé Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__EST_DIRIGÉ_PAR = eINSTANCE.getAgence_EstDirigéPar();

		/**
		 * The meta object literal for the '<em><b>Nombre Véhicule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__NOMBRE_VÉHICULE = eINSTANCE.getAgence_NombreVéhicule();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__NOM = eINSTANCE.getAgence_Nom();

		/**
		 * The meta object literal for the '<em><b>Se Situe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__SE_SITUE = eINSTANCE.getAgence_SeSitue();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.CommisImpl <em>Commis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.CommisImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getCommis()
		 * @generated
		 */
		EClass COMMIS = eINSTANCE.getCommis();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.GestionnaireImpl <em>Gestionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.GestionnaireImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getGestionnaire()
		 * @generated
		 */
		EClass GESTIONNAIRE = eINSTANCE.getGestionnaire();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.LocationImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__A = eINSTANCE.getLocation_A();

		/**
		 * The meta object literal for the '<em><b>Date Début</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DATE_DÉBUT = eINSTANCE.getLocation_DateDébut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DATE_FIN = eINSTANCE.getLocation_DateFin();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.CatégorieImpl <em>Catégorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.CatégorieImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getCatégorie()
		 * @generated
		 */
		EClass CATÉGORIE = eINSTANCE.getCatégorie();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATÉGORIE__NOM = eINSTANCE.getCatégorie_Nom();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.DossierClientImpl <em>Dossier Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.DossierClientImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getDossierClient()
		 * @generated
		 */
		EClass DOSSIER_CLIENT = eINSTANCE.getDossierClient();

		/**
		 * The meta object literal for the '<em><b>Refère</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER_CLIENT__REFÈRE = eINSTANCE.getDossierClient_Refère();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER_CLIENT__CONTIENT = eINSTANCE.getDossierClient_Contient();

		/**
		 * The meta object literal for the '<em><b>Relate Historique</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER_CLIENT__RELATE_HISTORIQUE = eINSTANCE.getDossierClient_RelateHistorique();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.SociétéUERentImpl <em>Société UE Rent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.SociétéUERentImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getSociétéUERent()
		 * @generated
		 */
		EClass SOCIÉTÉ_UE_RENT = eINSTANCE.getSociétéUERent();

		/**
		 * The meta object literal for the '<em><b>Possède</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIÉTÉ_UE_RENT__POSSÈDE = eINSTANCE.getSociétéUERent_Possède();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIÉTÉ_UE_RENT__EREFERENCE1 = eINSTANCE.getSociétéUERent_EReference1();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.MauvaiseExpérienceImpl <em>Mauvaise Expérience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.MauvaiseExpérienceImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getMauvaiseExpérience()
		 * @generated
		 */
		EClass MAUVAISE_EXPÉRIENCE = eINSTANCE.getMauvaiseExpérience();

		/**
		 * The meta object literal for the '<em><b>Relate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAUVAISE_EXPÉRIENCE__RELATE = eINSTANCE.getMauvaiseExpérience_Relate();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.LocalisationImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '<em><b>Ville</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__VILLE = eINSTANCE.getLocalisation_Ville();

		/**
		 * The meta object literal for the '<em><b>Pays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__PAYS = eINSTANCE.getLocalisation_Pays();

		/**
		 * The meta object literal for the '{@link LocationVéhicule.impl.EmployéAgenceImpl <em>Employé Agence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVéhicule.impl.EmployéAgenceImpl
		 * @see LocationVéhicule.impl.LocationVéhiculePackageImpl#getEmployéAgence()
		 * @generated
		 */
		EClass EMPLOYÉ_AGENCE = eINSTANCE.getEmployéAgence();

	}

} //LocationVéhiculePackage
