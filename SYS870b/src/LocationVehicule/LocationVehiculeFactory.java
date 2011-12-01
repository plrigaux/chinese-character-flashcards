/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see LocationVehicule.LocationVehiculePackage
 * @generated
 */
public interface LocationVehiculeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationVehiculeFactory eINSTANCE = LocationVehicule.impl.LocationVehiculeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation</em>'.
	 * @generated
	 */
	Reservation createReservation();

	/**
	 * Returns a new object of class '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voiture</em>'.
	 * @generated
	 */
	Voiture createVoiture();

	/**
	 * Returns a new object of class '<em>Agence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence</em>'.
	 * @generated
	 */
	Agence createAgence();

	/**
	 * Returns a new object of class '<em>Commis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commis</em>'.
	 * @generated
	 */
	Commis createCommis();

	/**
	 * Returns a new object of class '<em>Gestionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gestionnaire</em>'.
	 * @generated
	 */
	Gestionnaire createGestionnaire();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorie</em>'.
	 * @generated
	 */
	Categorie createCategorie();

	/**
	 * Returns a new object of class '<em>Mauvaise Experience</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mauvaise Experience</em>'.
	 * @generated
	 */
	MauvaiseExperience createMauvaiseExperience();

	/**
	 * Returns a new object of class '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localisation</em>'.
	 * @generated
	 */
	Localisation createLocalisation();

	/**
	 * Returns a new object of class '<em>Retour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retour</em>'.
	 * @generated
	 */
	Retour createRetour();

	/**
	 * Returns a new object of class '<em>Agence Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence Reservation</em>'.
	 * @generated
	 */
	AgenceReservation createAgenceReservation();

	/**
	 * Returns a new object of class '<em>Agence Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence Location</em>'.
	 * @generated
	 */
	AgenceLocation createAgenceLocation();

	/**
	 * Returns a new object of class '<em>Agence Retour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence Retour</em>'.
	 * @generated
	 */
	AgenceRetour createAgenceRetour();

	/**
	 * Returns a new object of class '<em>Agence Transfert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agence Transfert</em>'.
	 * @generated
	 */
	AgenceTransfert createAgenceTransfert();

	/**
	 * Returns a new object of class '<em>Transfert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfert</em>'.
	 * @generated
	 */
	Transfert createTransfert();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LocationVehiculePackage getLocationVehiculePackage();

} //LocationVehiculeFactory
