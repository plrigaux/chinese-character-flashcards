/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.impl;

import LocationVehicule.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class LocationVehiculeFactoryImpl extends EFactoryImpl implements LocationVehiculeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationVehiculeFactory init() {
		try {
			LocationVehiculeFactory theLocationVehiculeFactory = (LocationVehiculeFactory)EPackage.Registry.INSTANCE.getEFactory("http://locationVehicule/1.0"); 
			if (theLocationVehiculeFactory != null) {
				return theLocationVehiculeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LocationVehiculeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVehiculeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LocationVehiculePackage.PERSONNE: return createPersonne();
			case LocationVehiculePackage.CLIENT: return createClient();
			case LocationVehiculePackage.RESERVATION: return createReservation();
			case LocationVehiculePackage.VOITURE: return createVoiture();
			case LocationVehiculePackage.AGENCE: return createAgence();
			case LocationVehiculePackage.COMMIS: return createCommis();
			case LocationVehiculePackage.GESTIONNAIRE: return createGestionnaire();
			case LocationVehiculePackage.LOCATION: return createLocation();
			case LocationVehiculePackage.CATEGORIE: return createCategorie();
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE: return createMauvaiseExperience();
			case LocationVehiculePackage.LOCALISATION: return createLocalisation();
			case LocationVehiculePackage.RETOUR: return createRetour();
			case LocationVehiculePackage.AGENCE_RESERVATION: return createAgenceReservation();
			case LocationVehiculePackage.AGENCE_LOCATION: return createAgenceLocation();
			case LocationVehiculePackage.AGENCE_RETOUR: return createAgenceRetour();
			case LocationVehiculePackage.AGENCE_TRANSFERT: return createAgenceTransfert();
			case LocationVehiculePackage.TRANSFERT: return createTransfert();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LocationVehiculePackage.STATUT:
				return createStatutFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LocationVehiculePackage.STATUT:
				return convertStatutToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
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
	public Categorie createCategorie() {
		CategorieImpl categorie = new CategorieImpl();
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MauvaiseExperience createMauvaiseExperience() {
		MauvaiseExperienceImpl mauvaiseExperience = new MauvaiseExperienceImpl();
		return mauvaiseExperience;
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
	public Retour createRetour() {
		RetourImpl retour = new RetourImpl();
		return retour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceReservation createAgenceReservation() {
		AgenceReservationImpl agenceReservation = new AgenceReservationImpl();
		return agenceReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceLocation createAgenceLocation() {
		AgenceLocationImpl agenceLocation = new AgenceLocationImpl();
		return agenceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceRetour createAgenceRetour() {
		AgenceRetourImpl agenceRetour = new AgenceRetourImpl();
		return agenceRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceTransfert createAgenceTransfert() {
		AgenceTransfertImpl agenceTransfert = new AgenceTransfertImpl();
		return agenceTransfert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transfert createTransfert() {
		TransfertImpl transfert = new TransfertImpl();
		return transfert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statut createStatutFromString(EDataType eDataType, String initialValue) {
		Statut result = Statut.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVehiculePackage getLocationVehiculePackage() {
		return (LocationVehiculePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LocationVehiculePackage getPackage() {
		return LocationVehiculePackage.eINSTANCE;
	}

} //LocationVehiculeFactoryImpl
