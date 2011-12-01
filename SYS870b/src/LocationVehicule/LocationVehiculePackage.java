/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see LocationVehicule.LocationVehiculeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface LocationVehiculePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LocationVehicule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://locationVehicule/1.0";

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
	LocationVehiculePackage eINSTANCE = LocationVehicule.impl.LocationVehiculePackageImpl.init();

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.PersonneImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 0;

	/**
	 * The feature id for the '<em><b>Agit Comme Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__AGIT_COMME_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__IDENTIFIANT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 3;

	/**
	 * The feature id for the '<em><b>Domicile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__DOMICILE = 4;

	/**
	 * The feature id for the '<em><b>Est Employe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__EST_EMPLOYE = 5;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.ClientImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Possede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__POSSEDE = 0;

	/**
	 * The feature id for the '<em><b>Loue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__LOUE = 1;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__EXECUTE = 2;

	/**
	 * The feature id for the '<em><b>Est</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__EST = 3;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.TransactionImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 17;

	/**
	 * The feature id for the '<em><b>Est Traitee Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__EST_TRAITEE_PAR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ID = 1;

	/**
	 * The feature id for the '<em><b>Date Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATE_TRANSACTION = 2;

	/**
	 * The feature id for the '<em><b>Assigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ASSIGNE = 3;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__STATUT = 4;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.ReservationImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Est Traitee Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__EST_TRAITEE_PAR = TRANSACTION__EST_TRAITEE_PAR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ID = TRANSACTION__ID;

	/**
	 * The feature id for the '<em><b>Date Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DATE_TRANSACTION = TRANSACTION__DATE_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Assigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ASSIGNE = TRANSACTION__ASSIGNE;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__STATUT = TRANSACTION__STATUT;

	/**
	 * The feature id for the '<em><b>Refere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__REFERE = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DATE_DEBUT = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CATEGORIE = TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DATE_FIN = TRANSACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Faite En Vue De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__FAITE_EN_VUE_DE = TRANSACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Est Fournie Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__EST_FOURNIE_PAR = TRANSACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Demandee Pour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DEMANDEE_POUR = TRANSACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>AVoiture Assignee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__AVOITURE_ASSIGNEE = TRANSACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refusee Pour Mauvaises Experiences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES = TRANSACTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.VoitureImpl <em>Voiture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.VoitureImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getVoiture()
	 * @generated
	 */
	int VOITURE = 3;

	/**
	 * The feature id for the '<em><b>Est De Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EST_DE_CATEGORIE = 0;

	/**
	 * The feature id for the '<em><b>Est Assigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EST_ASSIGNE = 1;

	/**
	 * The feature id for the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__IDENTIFIANT = 2;

	/**
	 * The feature id for the '<em><b>Est Assignee A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EST_ASSIGNEE_A = 3;

	/**
	 * The feature id for the '<em><b>En Reparation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__EN_REPARATION = 4;

	/**
	 * The number of structural features of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.AgenceImpl <em>Agence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.AgenceImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgence()
	 * @generated
	 */
	int AGENCE = 4;

	/**
	 * The feature id for the '<em><b>AEn Inventaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__AEN_INVENTAIRE = 0;

	/**
	 * The feature id for the '<em><b>Est Dirigee Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__EST_DIRIGEE_PAR = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Se Situe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__SE_SITUE = 3;

	/**
	 * The feature id for the '<em><b>ARole Fournisseur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__AROLE_FOURNISSEUR = 4;

	/**
	 * The feature id for the '<em><b>ARole Locateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__AROLE_LOCATEUR = 5;

	/**
	 * The feature id for the '<em><b>ARole Recepteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__AROLE_RECEPTEUR = 6;

	/**
	 * The feature id for the '<em><b>Effectue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__EFFECTUE = 7;

	/**
	 * The feature id for the '<em><b>Est Supportee Par</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__EST_SUPPORTEE_PAR = 8;

	/**
	 * The number of structural features of the '<em>Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.EmployeAgenceImpl <em>Employe Agence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.EmployeAgenceImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getEmployeAgence()
	 * @generated
	 */
	int EMPLOYE_AGENCE = 11;

	/**
	 * The feature id for the '<em><b>Traite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_AGENCE__TRAITE = 0;

	/**
	 * The feature id for the '<em><b>Est</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_AGENCE__EST = 1;

	/**
	 * The number of structural features of the '<em>Employe Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_AGENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.CommisImpl <em>Commis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.CommisImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getCommis()
	 * @generated
	 */
	int COMMIS = 5;

	/**
	 * The feature id for the '<em><b>Traite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__TRAITE = EMPLOYE_AGENCE__TRAITE;

	/**
	 * The feature id for the '<em><b>Est</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__EST = EMPLOYE_AGENCE__EST;

	/**
	 * The feature id for the '<em><b>Travail Pour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS__TRAVAIL_POUR = EMPLOYE_AGENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Commis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIS_FEATURE_COUNT = EMPLOYE_AGENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.GestionnaireImpl <em>Gestionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.GestionnaireImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getGestionnaire()
	 * @generated
	 */
	int GESTIONNAIRE = 6;

	/**
	 * The feature id for the '<em><b>Traite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__TRAITE = EMPLOYE_AGENCE__TRAITE;

	/**
	 * The feature id for the '<em><b>Est</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__EST = EMPLOYE_AGENCE__EST;

	/**
	 * The feature id for the '<em><b>Dirige</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE__DIRIGE = EMPLOYE_AGENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gestionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_FEATURE_COUNT = EMPLOYE_AGENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.LocationImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Est Traitee Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EST_TRAITEE_PAR = TRANSACTION__EST_TRAITEE_PAR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = TRANSACTION__ID;

	/**
	 * The feature id for the '<em><b>Date Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DATE_TRANSACTION = TRANSACTION__DATE_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Assigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ASSIGNE = TRANSACTION__ASSIGNE;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STATUT = TRANSACTION__STATUT;

	/**
	 * The feature id for the '<em><b>Date Prevue Du Retour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DATE_PREVUE_DU_RETOUR = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PRODUIT = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Faite Apartir De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FAITE_APARTIR_DE = TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IMMEDIATE = TRANSACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Est Louee Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EST_LOUEE_PAR = TRANSACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.CategorieImpl <em>Categorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.CategorieImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 8;

	/**
	 * The feature id for the '<em><b>Demande</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__DEMANDE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Categorise Voiture</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE__CATEGORISE_VOITURE = 2;

	/**
	 * The number of structural features of the '<em>Categorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.MauvaiseExperienceImpl <em>Mauvaise Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.MauvaiseExperienceImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getMauvaiseExperience()
	 * @generated
	 */
	int MAUVAISE_EXPERIENCE = 9;

	/**
	 * The feature id for the '<em><b>Relate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAUVAISE_EXPERIENCE__RELATE = 0;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAUVAISE_EXPERIENCE__DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Se Rapporte A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAUVAISE_EXPERIENCE__SE_RAPPORTE_A = 2;

	/**
	 * The number of structural features of the '<em>Mauvaise Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAUVAISE_EXPERIENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.LocalisationImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 10;

	/**
	 * The feature id for the '<em><b>Adresse Civique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__ADRESSE_CIVIQUE = 0;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__VILLE = 1;

	/**
	 * The feature id for the '<em><b>Pays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__PAYS = 2;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__TELEPHONE = 3;

	/**
	 * The number of structural features of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.RetourImpl <em>Retour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.RetourImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getRetour()
	 * @generated
	 */
	int RETOUR = 12;

	/**
	 * The feature id for the '<em><b>Est Traitee Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__EST_TRAITEE_PAR = TRANSACTION__EST_TRAITEE_PAR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__ID = TRANSACTION__ID;

	/**
	 * The feature id for the '<em><b>Date Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__DATE_TRANSACTION = TRANSACTION__DATE_TRANSACTION;

	/**
	 * The feature id for the '<em><b>Assigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__ASSIGNE = TRANSACTION__ASSIGNE;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__STATUT = TRANSACTION__STATUT;

	/**
	 * The feature id for the '<em><b>Est Le Produit De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__EST_LE_PRODUIT_DE = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Est Recue Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__EST_RECUE_PAR = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voiture En Bonne Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__VOITURE_EN_BONNE_CONDITION = TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Montant Paye</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR__MONTANT_PAYE = TRANSACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Retour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETOUR_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.AgenceReservationImpl <em>Agence Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.AgenceReservationImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceReservation()
	 * @generated
	 */
	int AGENCE_RESERVATION = 13;

	/**
	 * The feature id for the '<em><b>Fournit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_RESERVATION__FOURNIT = 0;

	/**
	 * The feature id for the '<em><b>Fournisseur Est Joue Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR = 1;

	/**
	 * The number of structural features of the '<em>Agence Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_RESERVATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.AgenceLocationImpl <em>Agence Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.AgenceLocationImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceLocation()
	 * @generated
	 */
	int AGENCE_LOCATION = 14;

	/**
	 * The feature id for the '<em><b>Loue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_LOCATION__LOUE = 0;

	/**
	 * The feature id for the '<em><b>Locateur Est Joue Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR = 1;

	/**
	 * The number of structural features of the '<em>Agence Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.AgenceRetourImpl <em>Agence Retour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.AgenceRetourImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceRetour()
	 * @generated
	 */
	int AGENCE_RETOUR = 15;

	/**
	 * The feature id for the '<em><b>Recoit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_RETOUR__RECOIT = 0;

	/**
	 * The feature id for the '<em><b>Recepteur Est Joue Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR = 1;

	/**
	 * The number of structural features of the '<em>Agence Retour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_RETOUR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.AgenceTransfertImpl <em>Agence Transfert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.AgenceTransfertImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceTransfert()
	 * @generated
	 */
	int AGENCE_TRANSFERT = 16;

	/**
	 * The feature id for the '<em><b>Transfere De</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_TRANSFERT__TRANSFERE_DE = 0;

	/**
	 * The feature id for the '<em><b>Transfert Joue Par</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR = 1;

	/**
	 * The number of structural features of the '<em>Agence Transfert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_TRANSFERT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LocationVehicule.impl.TransfertImpl <em>Transfert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.impl.TransfertImpl
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getTransfert()
	 * @generated
	 */
	int TRANSFERT = 18;

	/**
	 * The feature id for the '<em><b>Objet Du Transfert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERT__OBJET_DU_TRANSFERT = 0;

	/**
	 * The feature id for the '<em><b>De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERT__DE = 1;

	/**
	 * The feature id for the '<em><b>Transfere Vers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERT__TRANSFERE_VERS = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERT__DATE = 3;

	/**
	 * The number of structural features of the '<em>Transfert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link LocationVehicule.Statut <em>Statut</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LocationVehicule.Statut
	 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getStatut()
	 * @generated
	 */
	int STATUT = 19;


	/**
	 * Returns the meta object for class '{@link LocationVehicule.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see LocationVehicule.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the containment reference '{@link LocationVehicule.Personne#getAgitCommeClient <em>Agit Comme Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agit Comme Client</em>'.
	 * @see LocationVehicule.Personne#getAgitCommeClient()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_AgitCommeClient();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Personne#getIdentifiant <em>Identifiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifiant</em>'.
	 * @see LocationVehicule.Personne#getIdentifiant()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Identifiant();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LocationVehicule.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see LocationVehicule.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for the containment reference '{@link LocationVehicule.Personne#getDomicile <em>Domicile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domicile</em>'.
	 * @see LocationVehicule.Personne#getDomicile()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Domicile();

	/**
	 * Returns the meta object for the container reference '{@link LocationVehicule.Personne#getEstEmploye <em>Est Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Est Employe</em>'.
	 * @see LocationVehicule.Personne#getEstEmploye()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_EstEmploye();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see LocationVehicule.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.Client#getPossede <em>Possede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possede</em>'.
	 * @see LocationVehicule.Client#getPossede()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Possede();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Client#getLoue <em>Loue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loue</em>'.
	 * @see LocationVehicule.Client#getLoue()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Loue();

	/**
	 * Returns the meta object for the containment reference list '{@link LocationVehicule.Client#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execute</em>'.
	 * @see LocationVehicule.Client#getExecute()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Execute();

	/**
	 * Returns the meta object for the container reference '{@link LocationVehicule.Client#getEst <em>Est</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Est</em>'.
	 * @see LocationVehicule.Client#getEst()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Est();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see LocationVehicule.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Reservation#getRefere <em>Refere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refere</em>'.
	 * @see LocationVehicule.Reservation#getRefere()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Refere();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Reservation#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see LocationVehicule.Reservation#getDateDebut()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_DateDebut();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Reservation#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorie</em>'.
	 * @see LocationVehicule.Reservation#getCategorie()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Categorie();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Reservation#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see LocationVehicule.Reservation#getDateFin()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_DateFin();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Reservation#getFaiteEnVueDe <em>Faite En Vue De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Faite En Vue De</em>'.
	 * @see LocationVehicule.Reservation#getFaiteEnVueDe()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_FaiteEnVueDe();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Reservation#getEstFourniePar <em>Est Fournie Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Fournie Par</em>'.
	 * @see LocationVehicule.Reservation#getEstFourniePar()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_EstFourniePar();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Reservation#getDemandeePour <em>Demandee Pour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demandee Pour</em>'.
	 * @see LocationVehicule.Reservation#getDemandeePour()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_DemandeePour();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Reservation#isAVoitureAssignee <em>AVoiture Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVoiture Assignee</em>'.
	 * @see LocationVehicule.Reservation#isAVoitureAssignee()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_AVoitureAssignee();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Reservation#isRefuseePourMauvaisesExperiences <em>Refusee Pour Mauvaises Experiences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refusee Pour Mauvaises Experiences</em>'.
	 * @see LocationVehicule.Reservation#isRefuseePourMauvaisesExperiences()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_RefuseePourMauvaisesExperiences();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voiture</em>'.
	 * @see LocationVehicule.Voiture
	 * @generated
	 */
	EClass getVoiture();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Voiture#getEstDeCategorie <em>Est De Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est De Categorie</em>'.
	 * @see LocationVehicule.Voiture#getEstDeCategorie()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_EstDeCategorie();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Voiture#getEstAssigne <em>Est Assigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Assigne</em>'.
	 * @see LocationVehicule.Voiture#getEstAssigne()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_EstAssigne();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Voiture#getIdentifiant <em>Identifiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifiant</em>'.
	 * @see LocationVehicule.Voiture#getIdentifiant()
	 * @see #getVoiture()
	 * @generated
	 */
	EAttribute getVoiture_Identifiant();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.Voiture#getEstAssigneeA <em>Est Assignee A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Est Assignee A</em>'.
	 * @see LocationVehicule.Voiture#getEstAssigneeA()
	 * @see #getVoiture()
	 * @generated
	 */
	EReference getVoiture_EstAssigneeA();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Voiture#isEnReparation <em>En Reparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>En Reparation</em>'.
	 * @see LocationVehicule.Voiture#isEnReparation()
	 * @see #getVoiture()
	 * @generated
	 */
	EAttribute getVoiture_EnReparation();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence</em>'.
	 * @see LocationVehicule.Agence
	 * @generated
	 */
	EClass getAgence();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.Agence#getAEnInventaire <em>AEn Inventaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>AEn Inventaire</em>'.
	 * @see LocationVehicule.Agence#getAEnInventaire()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_AEnInventaire();

	/**
	 * Returns the meta object for the containment reference '{@link LocationVehicule.Agence#getEstDirigeePar <em>Est Dirigee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Est Dirigee Par</em>'.
	 * @see LocationVehicule.Agence#getEstDirigeePar()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_EstDirigeePar();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Agence#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LocationVehicule.Agence#getNom()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_Nom();

	/**
	 * Returns the meta object for the containment reference '{@link LocationVehicule.Agence#getSeSitue <em>Se Situe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Se Situe</em>'.
	 * @see LocationVehicule.Agence#getSeSitue()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_SeSitue();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Agence#getARoleFournisseur <em>ARole Fournisseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ARole Fournisseur</em>'.
	 * @see LocationVehicule.Agence#getARoleFournisseur()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_ARoleFournisseur();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Agence#getARoleLocateur <em>ARole Locateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ARole Locateur</em>'.
	 * @see LocationVehicule.Agence#getARoleLocateur()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_ARoleLocateur();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Agence#getARoleRecepteur <em>ARole Recepteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ARole Recepteur</em>'.
	 * @see LocationVehicule.Agence#getARoleRecepteur()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_ARoleRecepteur();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Agence#getEffectue <em>Effectue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effectue</em>'.
	 * @see LocationVehicule.Agence#getEffectue()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_Effectue();

	/**
	 * Returns the meta object for the containment reference list '{@link LocationVehicule.Agence#getEstSupporteePar <em>Est Supportee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Est Supportee Par</em>'.
	 * @see LocationVehicule.Agence#getEstSupporteePar()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_EstSupporteePar();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Commis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commis</em>'.
	 * @see LocationVehicule.Commis
	 * @generated
	 */
	EClass getCommis();

	/**
	 * Returns the meta object for the container reference '{@link LocationVehicule.Commis#getTravailPour <em>Travail Pour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Travail Pour</em>'.
	 * @see LocationVehicule.Commis#getTravailPour()
	 * @see #getCommis()
	 * @generated
	 */
	EReference getCommis_TravailPour();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Gestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestionnaire</em>'.
	 * @see LocationVehicule.Gestionnaire
	 * @generated
	 */
	EClass getGestionnaire();

	/**
	 * Returns the meta object for the container reference '{@link LocationVehicule.Gestionnaire#getDirige <em>Dirige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dirige</em>'.
	 * @see LocationVehicule.Gestionnaire#getDirige()
	 * @see #getGestionnaire()
	 * @generated
	 */
	EReference getGestionnaire_Dirige();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see LocationVehicule.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Location#getDatePrevueDuRetour <em>Date Prevue Du Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Prevue Du Retour</em>'.
	 * @see LocationVehicule.Location#getDatePrevueDuRetour()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_DatePrevueDuRetour();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Location#getProduit <em>Produit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produit</em>'.
	 * @see LocationVehicule.Location#getProduit()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Produit();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Location#getFaiteApartirDe <em>Faite Apartir De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Faite Apartir De</em>'.
	 * @see LocationVehicule.Location#getFaiteApartirDe()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_FaiteApartirDe();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Location#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see LocationVehicule.Location#isImmediate()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Immediate();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Location#getEstLoueePar <em>Est Louee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Louee Par</em>'.
	 * @see LocationVehicule.Location#getEstLoueePar()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_EstLoueePar();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorie</em>'.
	 * @see LocationVehicule.Categorie
	 * @generated
	 */
	EClass getCategorie();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.Categorie#getDemande <em>Demande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Demande</em>'.
	 * @see LocationVehicule.Categorie#getDemande()
	 * @see #getCategorie()
	 * @generated
	 */
	EReference getCategorie_Demande();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Categorie#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LocationVehicule.Categorie#getNom()
	 * @see #getCategorie()
	 * @generated
	 */
	EAttribute getCategorie_Nom();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.Categorie#getCategoriseVoiture <em>Categorise Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categorise Voiture</em>'.
	 * @see LocationVehicule.Categorie#getCategoriseVoiture()
	 * @see #getCategorie()
	 * @generated
	 */
	EReference getCategorie_CategoriseVoiture();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.MauvaiseExperience <em>Mauvaise Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mauvaise Experience</em>'.
	 * @see LocationVehicule.MauvaiseExperience
	 * @generated
	 */
	EClass getMauvaiseExperience();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.MauvaiseExperience#getRelate <em>Relate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relate</em>'.
	 * @see LocationVehicule.MauvaiseExperience#getRelate()
	 * @see #getMauvaiseExperience()
	 * @generated
	 */
	EReference getMauvaiseExperience_Relate();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.MauvaiseExperience#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see LocationVehicule.MauvaiseExperience#getDetail()
	 * @see #getMauvaiseExperience()
	 * @generated
	 */
	EAttribute getMauvaiseExperience_Detail();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.MauvaiseExperience#getSeRapporteA <em>Se Rapporte A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Se Rapporte A</em>'.
	 * @see LocationVehicule.MauvaiseExperience#getSeRapporteA()
	 * @see #getMauvaiseExperience()
	 * @generated
	 */
	EReference getMauvaiseExperience_SeRapporteA();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see LocationVehicule.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Localisation#getAdresseCivique <em>Adresse Civique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse Civique</em>'.
	 * @see LocationVehicule.Localisation#getAdresseCivique()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_AdresseCivique();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Localisation#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville</em>'.
	 * @see LocationVehicule.Localisation#getVille()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Ville();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Localisation#getPays <em>Pays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pays</em>'.
	 * @see LocationVehicule.Localisation#getPays()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Pays();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Localisation#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see LocationVehicule.Localisation#getTelephone()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Telephone();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.EmployeAgence <em>Employe Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe Agence</em>'.
	 * @see LocationVehicule.EmployeAgence
	 * @generated
	 */
	EClass getEmployeAgence();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.EmployeAgence#getTraite <em>Traite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traite</em>'.
	 * @see LocationVehicule.EmployeAgence#getTraite()
	 * @see #getEmployeAgence()
	 * @generated
	 */
	EReference getEmployeAgence_Traite();

	/**
	 * Returns the meta object for the containment reference '{@link LocationVehicule.EmployeAgence#getEst <em>Est</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Est</em>'.
	 * @see LocationVehicule.EmployeAgence#getEst()
	 * @see #getEmployeAgence()
	 * @generated
	 */
	EReference getEmployeAgence_Est();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Retour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retour</em>'.
	 * @see LocationVehicule.Retour
	 * @generated
	 */
	EClass getRetour();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Retour#getEstLeProduitDe <em>Est Le Produit De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Le Produit De</em>'.
	 * @see LocationVehicule.Retour#getEstLeProduitDe()
	 * @see #getRetour()
	 * @generated
	 */
	EReference getRetour_EstLeProduitDe();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Retour#getEstRecuePar <em>Est Recue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Recue Par</em>'.
	 * @see LocationVehicule.Retour#getEstRecuePar()
	 * @see #getRetour()
	 * @generated
	 */
	EReference getRetour_EstRecuePar();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Retour#isVoitureEnBonneCondition <em>Voiture En Bonne Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voiture En Bonne Condition</em>'.
	 * @see LocationVehicule.Retour#isVoitureEnBonneCondition()
	 * @see #getRetour()
	 * @generated
	 */
	EAttribute getRetour_VoitureEnBonneCondition();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Retour#getMontantPaye <em>Montant Paye</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Montant Paye</em>'.
	 * @see LocationVehicule.Retour#getMontantPaye()
	 * @see #getRetour()
	 * @generated
	 */
	EAttribute getRetour_MontantPaye();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.AgenceReservation <em>Agence Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence Reservation</em>'.
	 * @see LocationVehicule.AgenceReservation
	 * @generated
	 */
	EClass getAgenceReservation();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.AgenceReservation#getFournit <em>Fournit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fournit</em>'.
	 * @see LocationVehicule.AgenceReservation#getFournit()
	 * @see #getAgenceReservation()
	 * @generated
	 */
	EReference getAgenceReservation_Fournit();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.AgenceReservation#getFournisseurEstJouePar <em>Fournisseur Est Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fournisseur Est Joue Par</em>'.
	 * @see LocationVehicule.AgenceReservation#getFournisseurEstJouePar()
	 * @see #getAgenceReservation()
	 * @generated
	 */
	EReference getAgenceReservation_FournisseurEstJouePar();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.AgenceLocation <em>Agence Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence Location</em>'.
	 * @see LocationVehicule.AgenceLocation
	 * @generated
	 */
	EClass getAgenceLocation();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.AgenceLocation#getLoue <em>Loue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loue</em>'.
	 * @see LocationVehicule.AgenceLocation#getLoue()
	 * @see #getAgenceLocation()
	 * @generated
	 */
	EReference getAgenceLocation_Loue();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.AgenceLocation#getLocateurEstJouePar <em>Locateur Est Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locateur Est Joue Par</em>'.
	 * @see LocationVehicule.AgenceLocation#getLocateurEstJouePar()
	 * @see #getAgenceLocation()
	 * @generated
	 */
	EReference getAgenceLocation_LocateurEstJouePar();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.AgenceRetour <em>Agence Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence Retour</em>'.
	 * @see LocationVehicule.AgenceRetour
	 * @generated
	 */
	EClass getAgenceRetour();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.AgenceRetour#getRecoit <em>Recoit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recoit</em>'.
	 * @see LocationVehicule.AgenceRetour#getRecoit()
	 * @see #getAgenceRetour()
	 * @generated
	 */
	EReference getAgenceRetour_Recoit();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.AgenceRetour#getRecepteurEstJouePar <em>Recepteur Est Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recepteur Est Joue Par</em>'.
	 * @see LocationVehicule.AgenceRetour#getRecepteurEstJouePar()
	 * @see #getAgenceRetour()
	 * @generated
	 */
	EReference getAgenceRetour_RecepteurEstJouePar();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.AgenceTransfert <em>Agence Transfert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence Transfert</em>'.
	 * @see LocationVehicule.AgenceTransfert
	 * @generated
	 */
	EClass getAgenceTransfert();

	/**
	 * Returns the meta object for the reference list '{@link LocationVehicule.AgenceTransfert#getTransfereDe <em>Transfere De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transfere De</em>'.
	 * @see LocationVehicule.AgenceTransfert#getTransfereDe()
	 * @see #getAgenceTransfert()
	 * @generated
	 */
	EReference getAgenceTransfert_TransfereDe();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.AgenceTransfert#getTransfertJouePar <em>Transfert Joue Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfert Joue Par</em>'.
	 * @see LocationVehicule.AgenceTransfert#getTransfertJouePar()
	 * @see #getAgenceTransfert()
	 * @generated
	 */
	EReference getAgenceTransfert_TransfertJouePar();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see LocationVehicule.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Transaction#getEstTraiteePar <em>Est Traitee Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Traitee Par</em>'.
	 * @see LocationVehicule.Transaction#getEstTraiteePar()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_EstTraiteePar();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Transaction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see LocationVehicule.Transaction#getId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Id();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Transaction#getDateTransaction <em>Date Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Transaction</em>'.
	 * @see LocationVehicule.Transaction#getDateTransaction()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_DateTransaction();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Transaction#getAssigne <em>Assigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigne</em>'.
	 * @see LocationVehicule.Transaction#getAssigne()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Assigne();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Transaction#getStatut <em>Statut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statut</em>'.
	 * @see LocationVehicule.Transaction#getStatut()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Statut();

	/**
	 * Returns the meta object for class '{@link LocationVehicule.Transfert <em>Transfert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfert</em>'.
	 * @see LocationVehicule.Transfert
	 * @generated
	 */
	EClass getTransfert();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Transfert#getObjetDuTransfert <em>Objet Du Transfert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objet Du Transfert</em>'.
	 * @see LocationVehicule.Transfert#getObjetDuTransfert()
	 * @see #getTransfert()
	 * @generated
	 */
	EReference getTransfert_ObjetDuTransfert();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Transfert#getDe <em>De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>De</em>'.
	 * @see LocationVehicule.Transfert#getDe()
	 * @see #getTransfert()
	 * @generated
	 */
	EReference getTransfert_De();

	/**
	 * Returns the meta object for the reference '{@link LocationVehicule.Transfert#getTransfereVers <em>Transfere Vers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfere Vers</em>'.
	 * @see LocationVehicule.Transfert#getTransfereVers()
	 * @see #getTransfert()
	 * @generated
	 */
	EReference getTransfert_TransfereVers();

	/**
	 * Returns the meta object for the attribute '{@link LocationVehicule.Transfert#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see LocationVehicule.Transfert#getDate()
	 * @see #getTransfert()
	 * @generated
	 */
	EAttribute getTransfert_Date();

	/**
	 * Returns the meta object for enum '{@link LocationVehicule.Statut <em>Statut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statut</em>'.
	 * @see LocationVehicule.Statut
	 * @generated
	 */
	EEnum getStatut();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocationVehiculeFactory getLocationVehiculeFactory();

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
		 * The meta object literal for the '{@link LocationVehicule.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.PersonneImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Agit Comme Client</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__AGIT_COMME_CLIENT = eINSTANCE.getPersonne_AgitCommeClient();

		/**
		 * The meta object literal for the '<em><b>Identifiant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__IDENTIFIANT = eINSTANCE.getPersonne_Identifiant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '<em><b>Domicile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__DOMICILE = eINSTANCE.getPersonne_Domicile();

		/**
		 * The meta object literal for the '<em><b>Est Employe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__EST_EMPLOYE = eINSTANCE.getPersonne_EstEmploye();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.ClientImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Possede</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__POSSEDE = eINSTANCE.getClient_Possede();

		/**
		 * The meta object literal for the '<em><b>Loue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__LOUE = eINSTANCE.getClient_Loue();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__EXECUTE = eINSTANCE.getClient_Execute();

		/**
		 * The meta object literal for the '<em><b>Est</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__EST = eINSTANCE.getClient_Est();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.ReservationImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Refere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__REFERE = eINSTANCE.getReservation_Refere();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__DATE_DEBUT = eINSTANCE.getReservation_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__CATEGORIE = eINSTANCE.getReservation_Categorie();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__DATE_FIN = eINSTANCE.getReservation_DateFin();

		/**
		 * The meta object literal for the '<em><b>Faite En Vue De</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__FAITE_EN_VUE_DE = eINSTANCE.getReservation_FaiteEnVueDe();

		/**
		 * The meta object literal for the '<em><b>Est Fournie Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__EST_FOURNIE_PAR = eINSTANCE.getReservation_EstFourniePar();

		/**
		 * The meta object literal for the '<em><b>Demandee Pour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__DEMANDEE_POUR = eINSTANCE.getReservation_DemandeePour();

		/**
		 * The meta object literal for the '<em><b>AVoiture Assignee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__AVOITURE_ASSIGNEE = eINSTANCE.getReservation_AVoitureAssignee();

		/**
		 * The meta object literal for the '<em><b>Refusee Pour Mauvaises Experiences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__REFUSEE_POUR_MAUVAISES_EXPERIENCES = eINSTANCE.getReservation_RefuseePourMauvaisesExperiences();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.VoitureImpl <em>Voiture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.VoitureImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getVoiture()
		 * @generated
		 */
		EClass VOITURE = eINSTANCE.getVoiture();

		/**
		 * The meta object literal for the '<em><b>Est De Categorie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__EST_DE_CATEGORIE = eINSTANCE.getVoiture_EstDeCategorie();

		/**
		 * The meta object literal for the '<em><b>Est Assigne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__EST_ASSIGNE = eINSTANCE.getVoiture_EstAssigne();

		/**
		 * The meta object literal for the '<em><b>Identifiant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOITURE__IDENTIFIANT = eINSTANCE.getVoiture_Identifiant();

		/**
		 * The meta object literal for the '<em><b>Est Assignee A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOITURE__EST_ASSIGNEE_A = eINSTANCE.getVoiture_EstAssigneeA();

		/**
		 * The meta object literal for the '<em><b>En Reparation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOITURE__EN_REPARATION = eINSTANCE.getVoiture_EnReparation();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.AgenceImpl <em>Agence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.AgenceImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgence()
		 * @generated
		 */
		EClass AGENCE = eINSTANCE.getAgence();

		/**
		 * The meta object literal for the '<em><b>AEn Inventaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__AEN_INVENTAIRE = eINSTANCE.getAgence_AEnInventaire();

		/**
		 * The meta object literal for the '<em><b>Est Dirigee Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__EST_DIRIGEE_PAR = eINSTANCE.getAgence_EstDirigeePar();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__NOM = eINSTANCE.getAgence_Nom();

		/**
		 * The meta object literal for the '<em><b>Se Situe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__SE_SITUE = eINSTANCE.getAgence_SeSitue();

		/**
		 * The meta object literal for the '<em><b>ARole Fournisseur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__AROLE_FOURNISSEUR = eINSTANCE.getAgence_ARoleFournisseur();

		/**
		 * The meta object literal for the '<em><b>ARole Locateur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__AROLE_LOCATEUR = eINSTANCE.getAgence_ARoleLocateur();

		/**
		 * The meta object literal for the '<em><b>ARole Recepteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__AROLE_RECEPTEUR = eINSTANCE.getAgence_ARoleRecepteur();

		/**
		 * The meta object literal for the '<em><b>Effectue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__EFFECTUE = eINSTANCE.getAgence_Effectue();

		/**
		 * The meta object literal for the '<em><b>Est Supportee Par</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__EST_SUPPORTEE_PAR = eINSTANCE.getAgence_EstSupporteePar();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.CommisImpl <em>Commis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.CommisImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getCommis()
		 * @generated
		 */
		EClass COMMIS = eINSTANCE.getCommis();

		/**
		 * The meta object literal for the '<em><b>Travail Pour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIS__TRAVAIL_POUR = eINSTANCE.getCommis_TravailPour();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.GestionnaireImpl <em>Gestionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.GestionnaireImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getGestionnaire()
		 * @generated
		 */
		EClass GESTIONNAIRE = eINSTANCE.getGestionnaire();

		/**
		 * The meta object literal for the '<em><b>Dirige</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESTIONNAIRE__DIRIGE = eINSTANCE.getGestionnaire_Dirige();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.LocationImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Date Prevue Du Retour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DATE_PREVUE_DU_RETOUR = eINSTANCE.getLocation_DatePrevueDuRetour();

		/**
		 * The meta object literal for the '<em><b>Produit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PRODUIT = eINSTANCE.getLocation_Produit();

		/**
		 * The meta object literal for the '<em><b>Faite Apartir De</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__FAITE_APARTIR_DE = eINSTANCE.getLocation_FaiteApartirDe();

		/**
		 * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__IMMEDIATE = eINSTANCE.getLocation_Immediate();

		/**
		 * The meta object literal for the '<em><b>Est Louee Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__EST_LOUEE_PAR = eINSTANCE.getLocation_EstLoueePar();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.CategorieImpl <em>Categorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.CategorieImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getCategorie()
		 * @generated
		 */
		EClass CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '<em><b>Demande</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIE__DEMANDE = eINSTANCE.getCategorie_Demande();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIE__NOM = eINSTANCE.getCategorie_Nom();

		/**
		 * The meta object literal for the '<em><b>Categorise Voiture</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIE__CATEGORISE_VOITURE = eINSTANCE.getCategorie_CategoriseVoiture();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.MauvaiseExperienceImpl <em>Mauvaise Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.MauvaiseExperienceImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getMauvaiseExperience()
		 * @generated
		 */
		EClass MAUVAISE_EXPERIENCE = eINSTANCE.getMauvaiseExperience();

		/**
		 * The meta object literal for the '<em><b>Relate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAUVAISE_EXPERIENCE__RELATE = eINSTANCE.getMauvaiseExperience_Relate();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAUVAISE_EXPERIENCE__DETAIL = eINSTANCE.getMauvaiseExperience_Detail();

		/**
		 * The meta object literal for the '<em><b>Se Rapporte A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAUVAISE_EXPERIENCE__SE_RAPPORTE_A = eINSTANCE.getMauvaiseExperience_SeRapporteA();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.LocalisationImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '<em><b>Adresse Civique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__ADRESSE_CIVIQUE = eINSTANCE.getLocalisation_AdresseCivique();

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
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__TELEPHONE = eINSTANCE.getLocalisation_Telephone();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.EmployeAgenceImpl <em>Employe Agence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.EmployeAgenceImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getEmployeAgence()
		 * @generated
		 */
		EClass EMPLOYE_AGENCE = eINSTANCE.getEmployeAgence();

		/**
		 * The meta object literal for the '<em><b>Traite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE_AGENCE__TRAITE = eINSTANCE.getEmployeAgence_Traite();

		/**
		 * The meta object literal for the '<em><b>Est</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE_AGENCE__EST = eINSTANCE.getEmployeAgence_Est();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.RetourImpl <em>Retour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.RetourImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getRetour()
		 * @generated
		 */
		EClass RETOUR = eINSTANCE.getRetour();

		/**
		 * The meta object literal for the '<em><b>Est Le Produit De</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETOUR__EST_LE_PRODUIT_DE = eINSTANCE.getRetour_EstLeProduitDe();

		/**
		 * The meta object literal for the '<em><b>Est Recue Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETOUR__EST_RECUE_PAR = eINSTANCE.getRetour_EstRecuePar();

		/**
		 * The meta object literal for the '<em><b>Voiture En Bonne Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETOUR__VOITURE_EN_BONNE_CONDITION = eINSTANCE.getRetour_VoitureEnBonneCondition();

		/**
		 * The meta object literal for the '<em><b>Montant Paye</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETOUR__MONTANT_PAYE = eINSTANCE.getRetour_MontantPaye();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.AgenceReservationImpl <em>Agence Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.AgenceReservationImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceReservation()
		 * @generated
		 */
		EClass AGENCE_RESERVATION = eINSTANCE.getAgenceReservation();

		/**
		 * The meta object literal for the '<em><b>Fournit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_RESERVATION__FOURNIT = eINSTANCE.getAgenceReservation_Fournit();

		/**
		 * The meta object literal for the '<em><b>Fournisseur Est Joue Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_RESERVATION__FOURNISSEUR_EST_JOUE_PAR = eINSTANCE.getAgenceReservation_FournisseurEstJouePar();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.AgenceLocationImpl <em>Agence Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.AgenceLocationImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceLocation()
		 * @generated
		 */
		EClass AGENCE_LOCATION = eINSTANCE.getAgenceLocation();

		/**
		 * The meta object literal for the '<em><b>Loue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_LOCATION__LOUE = eINSTANCE.getAgenceLocation_Loue();

		/**
		 * The meta object literal for the '<em><b>Locateur Est Joue Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_LOCATION__LOCATEUR_EST_JOUE_PAR = eINSTANCE.getAgenceLocation_LocateurEstJouePar();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.AgenceRetourImpl <em>Agence Retour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.AgenceRetourImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceRetour()
		 * @generated
		 */
		EClass AGENCE_RETOUR = eINSTANCE.getAgenceRetour();

		/**
		 * The meta object literal for the '<em><b>Recoit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_RETOUR__RECOIT = eINSTANCE.getAgenceRetour_Recoit();

		/**
		 * The meta object literal for the '<em><b>Recepteur Est Joue Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_RETOUR__RECEPTEUR_EST_JOUE_PAR = eINSTANCE.getAgenceRetour_RecepteurEstJouePar();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.AgenceTransfertImpl <em>Agence Transfert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.AgenceTransfertImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getAgenceTransfert()
		 * @generated
		 */
		EClass AGENCE_TRANSFERT = eINSTANCE.getAgenceTransfert();

		/**
		 * The meta object literal for the '<em><b>Transfere De</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_TRANSFERT__TRANSFERE_DE = eINSTANCE.getAgenceTransfert_TransfereDe();

		/**
		 * The meta object literal for the '<em><b>Transfert Joue Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE_TRANSFERT__TRANSFERT_JOUE_PAR = eINSTANCE.getAgenceTransfert_TransfertJouePar();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.TransactionImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Est Traitee Par</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__EST_TRAITEE_PAR = eINSTANCE.getTransaction_EstTraiteePar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__ID = eINSTANCE.getTransaction_Id();

		/**
		 * The meta object literal for the '<em><b>Date Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DATE_TRANSACTION = eINSTANCE.getTransaction_DateTransaction();

		/**
		 * The meta object literal for the '<em><b>Assigne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__ASSIGNE = eINSTANCE.getTransaction_Assigne();

		/**
		 * The meta object literal for the '<em><b>Statut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__STATUT = eINSTANCE.getTransaction_Statut();

		/**
		 * The meta object literal for the '{@link LocationVehicule.impl.TransfertImpl <em>Transfert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.impl.TransfertImpl
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getTransfert()
		 * @generated
		 */
		EClass TRANSFERT = eINSTANCE.getTransfert();

		/**
		 * The meta object literal for the '<em><b>Objet Du Transfert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFERT__OBJET_DU_TRANSFERT = eINSTANCE.getTransfert_ObjetDuTransfert();

		/**
		 * The meta object literal for the '<em><b>De</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFERT__DE = eINSTANCE.getTransfert_De();

		/**
		 * The meta object literal for the '<em><b>Transfere Vers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFERT__TRANSFERE_VERS = eINSTANCE.getTransfert_TransfereVers();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFERT__DATE = eINSTANCE.getTransfert_Date();

		/**
		 * The meta object literal for the '{@link LocationVehicule.Statut <em>Statut</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LocationVehicule.Statut
		 * @see LocationVehicule.impl.LocationVehiculePackageImpl#getStatut()
		 * @generated
		 */
		EEnum STATUT = eINSTANCE.getStatut();

	}

} //LocationVehiculePackage
