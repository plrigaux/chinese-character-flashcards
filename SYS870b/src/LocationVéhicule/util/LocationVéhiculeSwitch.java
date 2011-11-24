/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.util;

import LocationVéhicule.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see LocationVéhicule.LocationVéhiculePackage
 * @generated
 */
public class LocationVéhiculeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LocationVéhiculePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVéhiculeSwitch() {
		if (modelPackage == null) {
			modelPackage = LocationVéhiculePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LocationVéhiculePackage.PERSONNE: {
				Personne personne = (Personne)theEObject;
				T result = casePersonne(personne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.RÉSERVATION: {
				Réservation réservation = (Réservation)theEObject;
				T result = caseRéservation(réservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.VOITURE: {
				Voiture voiture = (Voiture)theEObject;
				T result = caseVoiture(voiture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.AGENCE: {
				Agence agence = (Agence)theEObject;
				T result = caseAgence(agence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.COMMIS: {
				Commis commis = (Commis)theEObject;
				T result = caseCommis(commis);
				if (result == null) result = caseEmployéAgence(commis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.GESTIONNAIRE: {
				Gestionnaire gestionnaire = (Gestionnaire)theEObject;
				T result = caseGestionnaire(gestionnaire);
				if (result == null) result = caseEmployéAgence(gestionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.CATÉGORIE: {
				Catégorie catégorie = (Catégorie)theEObject;
				T result = caseCatégorie(catégorie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.DOSSIER_CLIENT: {
				DossierClient dossierClient = (DossierClient)theEObject;
				T result = caseDossierClient(dossierClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.SOCIÉTÉ_UE_RENT: {
				SociétéUERent sociétéUERent = (SociétéUERent)theEObject;
				T result = caseSociétéUERent(sociétéUERent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.MAUVAISE_EXPÉRIENCE: {
				MauvaiseExpérience mauvaiseExpérience = (MauvaiseExpérience)theEObject;
				T result = caseMauvaiseExpérience(mauvaiseExpérience);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.LOCALISATION: {
				Localisation localisation = (Localisation)theEObject;
				T result = caseLocalisation(localisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVéhiculePackage.EMPLOYÉ_AGENCE: {
				EmployéAgence employéAgence = (EmployéAgence)theEObject;
				T result = caseEmployéAgence(employéAgence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonne(Personne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Réservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Réservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRéservation(Réservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voiture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoiture(Voiture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgence(Agence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommis(Commis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestionnaire(Gestionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catégorie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catégorie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatégorie(Catégorie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossierClient(DossierClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Société UE Rent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Société UE Rent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSociétéUERent(SociétéUERent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mauvaise Expérience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mauvaise Expérience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMauvaiseExpérience(MauvaiseExpérience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalisation(Localisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employé Agence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employé Agence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployéAgence(EmployéAgence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LocationVéhiculeSwitch
