/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LocationVéhicule.util;

import LocationVéhicule.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LocationVéhicule.LocationVéhiculePackage
 * @generated
 */
public class LocationVéhiculeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LocationVéhiculePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationVéhiculeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LocationVéhiculePackage.eINSTANCE;
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
	@Override
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
	protected LocationVéhiculeSwitch<Adapter> modelSwitch =
		new LocationVéhiculeSwitch<Adapter>() {
			@Override
			public Adapter casePersonne(Personne object) {
				return createPersonneAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseRéservation(Réservation object) {
				return createRéservationAdapter();
			}
			@Override
			public Adapter caseVoiture(Voiture object) {
				return createVoitureAdapter();
			}
			@Override
			public Adapter caseAgence(Agence object) {
				return createAgenceAdapter();
			}
			@Override
			public Adapter caseCommis(Commis object) {
				return createCommisAdapter();
			}
			@Override
			public Adapter caseGestionnaire(Gestionnaire object) {
				return createGestionnaireAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseCatégorie(Catégorie object) {
				return createCatégorieAdapter();
			}
			@Override
			public Adapter caseDossierClient(DossierClient object) {
				return createDossierClientAdapter();
			}
			@Override
			public Adapter caseSociétéUERent(SociétéUERent object) {
				return createSociétéUERentAdapter();
			}
			@Override
			public Adapter caseMauvaiseExpérience(MauvaiseExpérience object) {
				return createMauvaiseExpérienceAdapter();
			}
			@Override
			public Adapter caseLocalisation(Localisation object) {
				return createLocalisationAdapter();
			}
			@Override
			public Adapter caseEmployéAgence(EmployéAgence object) {
				return createEmployéAgenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Réservation <em>Réservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Réservation
	 * @generated
	 */
	public Adapter createRéservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Voiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Voiture
	 * @generated
	 */
	public Adapter createVoitureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Agence
	 * @generated
	 */
	public Adapter createAgenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Commis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Commis
	 * @generated
	 */
	public Adapter createCommisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Gestionnaire <em>Gestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Gestionnaire
	 * @generated
	 */
	public Adapter createGestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Catégorie <em>Catégorie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Catégorie
	 * @generated
	 */
	public Adapter createCatégorieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.DossierClient <em>Dossier Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.DossierClient
	 * @generated
	 */
	public Adapter createDossierClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.SociétéUERent <em>Société UE Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.SociétéUERent
	 * @generated
	 */
	public Adapter createSociétéUERentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.MauvaiseExpérience <em>Mauvaise Expérience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.MauvaiseExpérience
	 * @generated
	 */
	public Adapter createMauvaiseExpérienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.Localisation
	 * @generated
	 */
	public Adapter createLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LocationVéhicule.EmployéAgence <em>Employé Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LocationVéhicule.EmployéAgence
	 * @generated
	 */
	public Adapter createEmployéAgenceAdapter() {
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

} //LocationVéhiculeAdapterFactory
