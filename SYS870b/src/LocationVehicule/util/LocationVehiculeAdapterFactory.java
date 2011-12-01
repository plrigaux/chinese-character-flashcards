/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVehicule.util;

import LocationVehicule.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LocationVehicule.LocationVehiculePackage
 * @generated
 */
public class LocationVehiculeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LocationVehiculePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVehiculeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LocationVehiculePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationVehiculeSwitch modelSwitch =
		new LocationVehiculeSwitch() {
			public Object casePersonne(Personne object) {
				return createPersonneAdapter();
			}
			public Object caseClient(Client object) {
				return createClientAdapter();
			}
			public Object caseReservation(Reservation object) {
				return createReservationAdapter();
			}
			public Object caseVoiture(Voiture object) {
				return createVoitureAdapter();
			}
			public Object caseAgence(Agence object) {
				return createAgenceAdapter();
			}
			public Object caseCommis(Commis object) {
				return createCommisAdapter();
			}
			public Object caseGestionnaire(Gestionnaire object) {
				return createGestionnaireAdapter();
			}
			public Object caseLocation(Location object) {
				return createLocationAdapter();
			}
			public Object caseCategorie(Categorie object) {
				return createCategorieAdapter();
			}
			public Object caseMauvaiseExperience(MauvaiseExperience object) {
				return createMauvaiseExperienceAdapter();
			}
			public Object caseLocalisation(Localisation object) {
				return createLocalisationAdapter();
			}
			public Object caseEmployeAgence(EmployeAgence object) {
				return createEmployeAgenceAdapter();
			}
			public Object caseRetour(Retour object) {
				return createRetourAdapter();
			}
			public Object caseAgenceReservation(AgenceReservation object) {
				return createAgenceReservationAdapter();
			}
			public Object caseAgenceLocation(AgenceLocation object) {
				return createAgenceLocationAdapter();
			}
			public Object caseAgenceRetour(AgenceRetour object) {
				return createAgenceRetourAdapter();
			}
			public Object caseAgenceTransfert(AgenceTransfert object) {
				return createAgenceTransfertAdapter();
			}
			public Object caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			public Object caseTransfert(Transfert object) {
				return createTransfertAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Reservation
	 * @generated
	 */
	public Adapter createReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Voiture
	 * @generated
	 */
	public Adapter createVoitureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Agence
	 * @generated
	 */
	public Adapter createAgenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Commis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Commis
	 * @generated
	 */
	public Adapter createCommisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Gestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Gestionnaire
	 * @generated
	 */
	public Adapter createGestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Categorie
	 * @generated
	 */
	public Adapter createCategorieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.MauvaiseExperience <em>Mauvaise Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.MauvaiseExperience
	 * @generated
	 */
	public Adapter createMauvaiseExperienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Localisation
	 * @generated
	 */
	public Adapter createLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.EmployeAgence <em>Employe Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.EmployeAgence
	 * @generated
	 */
	public Adapter createEmployeAgenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Retour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Retour
	 * @generated
	 */
	public Adapter createRetourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.AgenceReservation <em>Agence Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.AgenceReservation
	 * @generated
	 */
	public Adapter createAgenceReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.AgenceLocation <em>Agence Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.AgenceLocation
	 * @generated
	 */
	public Adapter createAgenceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.AgenceRetour <em>Agence Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.AgenceRetour
	 * @generated
	 */
	public Adapter createAgenceRetourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.AgenceTransfert <em>Agence Transfert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.AgenceTransfert
	 * @generated
	 */
	public Adapter createAgenceTransfertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVehicule.Transfert <em>Transfert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVehicule.Transfert
	 * @generated
	 */
	public Adapter createTransfertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LocationVehiculeAdapterFactory
