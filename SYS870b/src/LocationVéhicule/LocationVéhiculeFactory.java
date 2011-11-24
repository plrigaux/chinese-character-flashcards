/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see LocationVéhicule.LocationVéhiculePackage
 * @generated
 */
public interface LocationVéhiculeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationVéhiculeFactory eINSTANCE = LocationVéhicule.impl.LocationVéhiculeFactoryImpl.init();

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
	 * Returns a new object of class '<em>Réservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Réservation</em>'.
	 * @generated
	 */
	Réservation createRéservation();

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
	 * Returns a new object of class '<em>Catégorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catégorie</em>'.
	 * @generated
	 */
	Catégorie createCatégorie();

	/**
	 * Returns a new object of class '<em>Dossier Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier Client</em>'.
	 * @generated
	 */
	DossierClient createDossierClient();

	/**
	 * Returns a new object of class '<em>Société UE Rent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Société UE Rent</em>'.
	 * @generated
	 */
	SociétéUERent createSociétéUERent();

	/**
	 * Returns a new object of class '<em>Mauvaise Expérience</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mauvaise Expérience</em>'.
	 * @generated
	 */
	MauvaiseExpérience createMauvaiseExpérience();

	/**
	 * Returns a new object of class '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localisation</em>'.
	 * @generated
	 */
	Localisation createLocalisation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LocationVéhiculePackage getLocationVéhiculePackage();

} //LocationVéhiculeFactory
