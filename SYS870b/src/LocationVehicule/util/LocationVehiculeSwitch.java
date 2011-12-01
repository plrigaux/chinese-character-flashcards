/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.util;

import LocationVehicule.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see LocationVehicule.LocationVehiculePackage
 * @generated
 */
public class LocationVehiculeSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LocationVehiculePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVehiculeSwitch() {
		if (modelPackage == null) {
			modelPackage = LocationVehiculePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LocationVehiculePackage.PERSONNE: {
				Personne personne = (Personne)theEObject;
				Object result = casePersonne(personne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.CLIENT: {
				Client client = (Client)theEObject;
				Object result = caseClient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.RESERVATION: {
				Reservation reservation = (Reservation)theEObject;
				Object result = caseReservation(reservation);
				if (result == null) result = caseTransaction(reservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.VOITURE: {
				Voiture voiture = (Voiture)theEObject;
				Object result = caseVoiture(voiture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.AGENCE: {
				Agence agence = (Agence)theEObject;
				Object result = caseAgence(agence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.COMMIS: {
				Commis commis = (Commis)theEObject;
				Object result = caseCommis(commis);
				if (result == null) result = caseEmployeAgence(commis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.GESTIONNAIRE: {
				Gestionnaire gestionnaire = (Gestionnaire)theEObject;
				Object result = caseGestionnaire(gestionnaire);
				if (result == null) result = caseEmployeAgence(gestionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.LOCATION: {
				Location location = (Location)theEObject;
				Object result = caseLocation(location);
				if (result == null) result = caseTransaction(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.CATEGORIE: {
				Categorie categorie = (Categorie)theEObject;
				Object result = caseCategorie(categorie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.MAUVAISE_EXPERIENCE: {
				MauvaiseExperience mauvaiseExperience = (MauvaiseExperience)theEObject;
				Object result = caseMauvaiseExperience(mauvaiseExperience);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.LOCALISATION: {
				Localisation localisation = (Localisation)theEObject;
				Object result = caseLocalisation(localisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.EMPLOYE_AGENCE: {
				EmployeAgence employeAgence = (EmployeAgence)theEObject;
				Object result = caseEmployeAgence(employeAgence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.RETOUR: {
				Retour retour = (Retour)theEObject;
				Object result = caseRetour(retour);
				if (result == null) result = caseTransaction(retour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.AGENCE_RESERVATION: {
				AgenceReservation agenceReservation = (AgenceReservation)theEObject;
				Object result = caseAgenceReservation(agenceReservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.AGENCE_LOCATION: {
				AgenceLocation agenceLocation = (AgenceLocation)theEObject;
				Object result = caseAgenceLocation(agenceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.AGENCE_RETOUR: {
				AgenceRetour agenceRetour = (AgenceRetour)theEObject;
				Object result = caseAgenceRetour(agenceRetour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.AGENCE_TRANSFERT: {
				AgenceTransfert agenceTransfert = (AgenceTransfert)theEObject;
				Object result = caseAgenceTransfert(agenceTransfert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.TRANSACTION: {
				Transaction transaction = (Transaction)theEObject;
				Object result = caseTransaction(transaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationVehiculePackage.TRANSFERT: {
				Transfert transfert = (Transfert)theEObject;
				Object result = caseTransfert(transfert);
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
	public Object casePersonne(Personne object) {
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
	public Object caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReservation(Reservation object) {
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
	public Object caseVoiture(Voiture object) {
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
	public Object caseAgence(Agence object) {
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
	public Object caseCommis(Commis object) {
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
	public Object caseGestionnaire(Gestionnaire object) {
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
	public Object caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCategorie(Categorie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mauvaise Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mauvaise Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMauvaiseExperience(MauvaiseExperience object) {
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
	public Object caseLocalisation(Localisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employe Agence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employe Agence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmployeAgence(EmployeAgence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRetour(Retour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence Reservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAgenceReservation(AgenceReservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAgenceLocation(AgenceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence Retour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence Retour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAgenceRetour(AgenceRetour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agence Transfert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agence Transfert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAgenceTransfert(AgenceTransfert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransfert(Transfert object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //LocationVehiculeSwitch
