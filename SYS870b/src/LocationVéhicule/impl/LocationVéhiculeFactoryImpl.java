/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.impl;

import LocationVéhicule.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationVéhiculeFactoryImpl extends EFactoryImpl implements LocationVéhiculeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationVéhiculeFactory init() {
		try {
			LocationVéhiculeFactory theLocationVéhiculeFactory = (LocationVéhiculeFactory)EPackage.Registry.INSTANCE.getEFactory("http://defaultname/1.0"); 
			if (theLocationVéhiculeFactory != null) {
				return theLocationVéhiculeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LocationVéhiculeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVéhiculeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LocationVéhiculePackage.PERSONNE: return createPersonne();
			case LocationVéhiculePackage.CLIENT: return createClient();
			case LocationVéhiculePackage.RÉSERVATION: return createRéservation();
			case LocationVéhiculePackage.VOITURE: return createVoiture();
			case LocationVéhiculePackage.AGENCE: return createAgence();
			case LocationVéhiculePackage.COMMIS: return createCommis();
			case LocationVéhiculePackage.GESTIONNAIRE: return createGestionnaire();
			case LocationVéhiculePackage.LOCATION: return createLocation();
			case LocationVéhiculePackage.CATÉGORIE: return createCatégorie();
			case LocationVéhiculePackage.DOSSIER_CLIENT: return createDossierClient();
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT: return createSociétéUERent();
			case LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE: return createMauvaiseExpérience();
			case LocationVéhiculePackage.LOCALISATION: return createLocalisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne createPersonne() {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Réservation createRéservation() {
		RéservationImpl réservation = new RéservationImpl();
		return réservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture createVoiture() {
		VoitureImpl voiture = new VoitureImpl();
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence createAgence() {
		AgenceImpl agence = new AgenceImpl();
		return agence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commis createCommis() {
		CommisImpl commis = new CommisImpl();
		return commis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gestionnaire createGestionnaire() {
		GestionnaireImpl gestionnaire = new GestionnaireImpl();
		return gestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catégorie createCatégorie() {
		CatégorieImpl catégorie = new CatégorieImpl();
		return catégorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DossierClient createDossierClient() {
		DossierClientImpl dossierClient = new DossierClientImpl();
		return dossierClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SociétéUERent createSociétéUERent() {
		SociétéUERentImpl sociétéUERent = new SociétéUERentImpl();
		return sociétéUERent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MauvaiseExpérience createMauvaiseExpérience() {
		MauvaiseExpérienceImpl mauvaiseExpérience = new MauvaiseExpérienceImpl();
		return mauvaiseExpérience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation createLocalisation() {
		LocalisationImpl localisation = new LocalisationImpl();
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVéhiculePackage getLocationVéhiculePackage() {
		return (LocationVéhiculePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LocationVéhiculePackage getPackage() {
		return LocationVéhiculePackage.eINSTANCE;
	}

} //LocationVéhiculeFactoryImpl
